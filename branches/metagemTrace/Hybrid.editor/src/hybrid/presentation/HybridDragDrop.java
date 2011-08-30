package hybrid.presentation;

import hybrid.HybridPackage;
import hybrid.LeftPattern;
import hybrid.Model;
import hybrid.ModelComponent;
import hybrid.ModelElement;
import hybrid.ModelFeature;
import hybrid.Module;
import hybrid.RightPattern;
import hybrid.Source;
import hybrid.SourceModel;
import hybrid.Target;
import hybrid.TargetModel;
import hybrid.impl.BindingImpl;
import hybrid.impl.HybridFactoryImpl;
import hybrid.impl.RuleImpl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.edit.command.CreateChildCommand;
import org.eclipse.emf.edit.command.DragAndDropCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.dnd.EditingDomainViewerDropAdapter;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DropTargetEvent;


public class HybridDragDrop extends EditingDomainViewerDropAdapter {
	
	final static int NULL_SELECTION = -1;
	final static int DEFAULT_SELECTION = 0;
	final static int SOURCE_ELEMENT = 1;
	final static int TARGET_ELEMENT = 2;
	
	private ResourceSet sourceRs;
	private ResourceSet targetRs;
	private EObject aTargetObj = null;
	private EObject aSource = null;
	private String elementModel;
	private int selectionType;
	private HybridFactoryImpl hybridFactory;
	
	public HybridDragDrop(EditingDomain domain, Viewer viewer, ResourceSet sourceRs, ResourceSet targetRs) {
		super(domain, viewer);
		this.sourceRs = sourceRs;
		this.targetRs = targetRs;
		hybridFactory = new HybridFactoryImpl();
	}
	
	/**
	   * This method is called the same way for each of the
	   * {@link org.eclipse.swt.dnd.DropTargetListener} methods, except for leave
	   * and drop.  If the source is available early, it creates or revalidates
	   * the {@link DragAndDropCommand}, and updates the event's detail (operation)
	   * and feedback (drag under effect), appropriately.
	   */
	protected void helper(DropTargetEvent event) {
		event.detail = DND.DROP_NONE;
		selectionType = DEFAULT_SELECTION;
		// If we can't do anything else, we'll provide the default select
		// feedback and enable auto-scroll and auto-expand effects.
		event.feedback = DND.FEEDBACK_SELECT | getAutoFeedback();
		// gets the source
		source = getDragSource(event);
		aSource = (EObject) source.iterator().next();
		// gets the target
		Object aObj = extractDropTarget(event.item);
		if (aObj instanceof EObject){        	
			aTargetObj = (EObject)aObj;
			//Different elements:
			if (!aSource.eResource().getURI().equals(aTargetObj.eResource().getURI())){	
				if((aTargetObj instanceof RuleImpl)||(aTargetObj instanceof BindingImpl)){
					boolean input = false;
					for (int i=0;i<sourceRs.getResources().size();i++){
						if (aSource.eResource().equals(sourceRs.getResources().get(i))){
							input = true;
							elementModel = sourceRs.getResources().get(i).getURI().toString();
						}
					}
					if(input){
						selectionType = SOURCE_ELEMENT;
					}else{
						for (int i=0;i<targetRs.getResources().size();i++){
							if (aSource.eResource().equals(targetRs.getResources().get(i))){
								elementModel = targetRs.getResources().get(i).getURI().toString();
							}
						}
						selectionType = TARGET_ELEMENT;
					}
					event.detail=DND.DROP_LINK;
				}
			}
		}
	}
	
	 /**
	 * the drop action
	 *  @param event
	 */
	public void drop(DropTargetEvent event){
		if (selectionType == DEFAULT_SELECTION )//just enter into the selection code if an object is selected
			super.drop(event);
		else if((selectionType == SOURCE_ELEMENT)||(selectionType == TARGET_ELEMENT)){
			if (viewer !=null){
				viewer.setSelection(new StructuredSelection(aTargetObj), true);
				createHybridElement(aSource,aTargetObj,selectionType); 
			}
		}else{
			command = null;
		    commandTarget = null;
		    source = null;
		    dragAndDropCommandInformation = null;
		}
	}
	
	/**
	 * This method creates a new object (oElement) in a Rule or a Binding (target_drop).
	 * @param oElement
	 * @param target_drop
	 * @param type: Indicates whether oElement will be a source or a target element in
	 * the trace link.
	 */
	private void createHybridElement(EObject oElement, EObject target_drop, int type){
		// Get the ID of the element
		XMIResource resource = (XMIResource) oElement.eResource();
		String id = resource.getID(oElement); // Get element id
		if (id == null)
			id = resource.getURIFragment(oElement);
		
		if (target_drop instanceof RuleImpl) {
			RuleImpl rule = (RuleImpl) target_drop;
			if (type == SOURCE_ELEMENT) {
				handleSetSourceElement(rule, oElement, id);
			} else { // TARGET_ELEMENT
				handleSetTargetElement(rule, oElement, id);
			}
		}else if (target_drop instanceof BindingImpl) {
			BindingImpl binding = (BindingImpl) target_drop;
			if (type == SOURCE_ELEMENT) {
				handleSetSourceElement(binding, oElement, id);
			} else { // TARGET_ELEMENT
				handleSetTargetElement(binding, oElement, id);
			}
		}
	}	
	
	
	/**
	 * Creates a Source element (oElement) in a Binding (binding)
	 * @param binding
	 * @param oElement
	 * @param id
	 */
	private void handleSetSourceElement(BindingImpl binding, EObject oElement, String id) {
		ModelComponent component = null;
		Module module = binding.getOwned().getRule().getModule();
		EList<SourceModel> source_models = module.getSourceModels();
		
		SourceModel sourceModel = null;
		for(int c1=0; c1<source_models.size();c1++){
			TreeIterator<EObject> elements = source_models.get(c1).eAllContents();
			while(elements.hasNext()){
				EObject next = elements.next();
				if(next instanceof ModelComponent){
					ModelComponent sourceElement = (ModelComponent) next;
					if(id!=null&&
							sourceElement.getRef()!=null&&
							sourceElement.getRef().equals(id)){
							component = sourceElement;
						}
				}
			}
			String uriModel = new String ("platform:/resource"+source_models.get(c1).getPath());
			if(uriModel.equals(elementModel)){
				sourceModel = source_models.get(c1);
			}
		}
		if (component == null) { // element hasn't been created before
			component=createComponent(sourceModel,id,oElement);
		}
		Source bindingElement = hybridFactory.createSource();
		bindingElement.setComponent(component);
		bindingElement.setName(component.getName());
		
		RightPattern rightPattern = binding.getRight();
		if(rightPattern==null){
			rightPattern = hybridFactory.createRightPattern();
			CreateChildCommand cmdSet_element_right = new CreateChildCommand(domain, (EObject)binding, HybridPackage.eINSTANCE.getBinding_Right(), rightPattern, null);
			domain.getCommandStack().execute(cmdSet_element_right);
		}
		
		CreateChildCommand cmdSet_element = new CreateChildCommand(domain, (EObject)rightPattern, HybridPackage.eINSTANCE.getRightPattern_Source(), bindingElement, null);
		domain.getCommandStack().execute(cmdSet_element);
	}
	
	/**
	 * Creates a Target element (oElement) in a Binding (binding)
	 * @param rule
	 * @param oElement
	 * @param id
	 */
	private void handleSetTargetElement(BindingImpl binding, EObject oElement, String id){
		ModelComponent component = null;
		Module module = binding.getOwned().getRule().getModule();
		EList<TargetModel> target_models = module.getTargetModels();
		
		TargetModel targetModel = null;
		for(int c1=0; c1<target_models.size();c1++){
			TreeIterator<EObject> elements = target_models.get(c1).eAllContents();
			while(elements.hasNext()){
				EObject next = elements.next();
				if(next instanceof ModelComponent){
					ModelComponent targetElement = (ModelComponent) next;
					if(id!=null&&
							targetElement.getRef()!=null&&
							targetElement.getRef().equals(id)){
							component = targetElement;
						}
				}
			}
			String uriModel = new String ("platform:/resource"+target_models.get(c1).getPath());
			if(uriModel.equals(elementModel)){
				targetModel = target_models.get(c1);
			}
		}
		if (component == null) { // element hasn't been created before
			component=createComponent(targetModel,id,oElement);
		}
		Target bindingElement = hybridFactory.createTarget();
		bindingElement.setComponent(component);
		bindingElement.setName(component.getName());
		
		LeftPattern leftPattern = binding.getLeft();
		if(leftPattern==null){
			leftPattern = hybridFactory.createLeftPattern();
			CreateChildCommand cmdSet_element_left = new CreateChildCommand(domain, (EObject)binding, HybridPackage.eINSTANCE.getBinding_Left(), leftPattern, null);
			domain.getCommandStack().execute(cmdSet_element_left);
		}
		
		CreateChildCommand cmdSet_element = new CreateChildCommand(domain, (EObject)leftPattern, HybridPackage.eINSTANCE.getLeftPattern_Target(), bindingElement, null);
		domain.getCommandStack().execute(cmdSet_element);
	}
	
	/**
	 * Creates a Source element (oElement) in a Rule (rule)
	 * @param rule
	 * @param oElement
	 * @param id
	 */
	private void handleSetSourceElement(RuleImpl rule, EObject oElement, String id) {
		ModelComponent component = null;
		Module module = rule.getModule();
		EList<SourceModel> source_models = module.getSourceModels();
		
		SourceModel sourceModel = null;
		for(int c1=0; c1<source_models.size();c1++){
			TreeIterator<EObject> elements = source_models.get(c1).eAllContents();
			while(elements.hasNext()){
				EObject next = elements.next();
				if(next instanceof ModelComponent){
					ModelComponent sourceElement = (ModelComponent) next;
					if(id!=null&&
							sourceElement.getRef()!=null&&
							sourceElement.getRef().equals(id)){
							component = sourceElement;
						}
				}
			}
			String uriModel = new String ("platform:/resource"+source_models.get(c1).getPath());
			if(uriModel.equals(elementModel)){
				sourceModel = source_models.get(c1);
			}
		}
		if (component == null) { // element hasn't been created before
			component=createComponent(sourceModel,id,oElement);
		}
		Source ruleElement = hybridFactory.createSource();
		ruleElement.setComponent(component);
		ruleElement.setName(component.getName());
		
		CreateChildCommand cmdSet_element = new CreateChildCommand(domain, (EObject)rule, HybridPackage.eINSTANCE.getRule_Sources(), ruleElement, null);
		domain.getCommandStack().execute(cmdSet_element);
	}
	
	/**
	 * Creates a Target element (oElement) in a a Rule (rule)
	 * @param rule
	 * @param oElement
	 * @param id
	 */
	private void handleSetTargetElement(RuleImpl rule, EObject oElement, String id){
		ModelComponent component = null;
		Module module = rule.getModule();
		EList<TargetModel> target_models = module.getTargetModels();
		
		TargetModel targetModel = null;
		for(int c1=0; c1<target_models.size();c1++){
			TreeIterator<EObject> elements = target_models.get(c1).eAllContents();
			while(elements.hasNext()){
				EObject next = elements.next();
				if(next instanceof ModelComponent){
					ModelComponent targetElement = (ModelComponent) next;
					if(id!=null&&
							targetElement.getRef()!=null&&
							targetElement.getRef().equals(id)){
							component = targetElement;
						}
				}
			}
			String uriModel = new String ("platform:/resource"+target_models.get(c1).getPath());
			if(uriModel.equals(elementModel)){
				targetModel = target_models.get(c1);
			}
		}
		if (component == null) { // element hasn't been created before
			component=createComponent(targetModel,id,oElement);
		}
		Target ruleElement = hybridFactory.createTarget();
		ruleElement.setComponent(component);
		ruleElement.setName(component.getName());
		
		CreateChildCommand cmdSet_element = new CreateChildCommand(domain, (EObject)rule, HybridPackage.eINSTANCE.getRule_Targets(), ruleElement, null);
		domain.getCommandStack().execute(cmdSet_element);	
	}
	
	private ModelComponent createComponent(Model model, String id,
			EObject oElement) {
		if (oElement instanceof EStructuralFeature){
			return createFeature(model, id, oElement);
		}else{
			return createElement(model, id, oElement);
		}
	}
	
	/**
	 * Creates a ModelElement in a model 
	 * @param model
	 * @param id
	 * @param eModelElement
	 * @return
	 */
	private ModelElement createElement(Model model, String id,	EObject eModelElement){
		ModelElement ownedElement = null;
		ModelElement element = hybridFactory.createModelElement();
		//Looking for ownedElement of the element
		EObject ownedEObject = eModelElement.eContainer();
		if (ownedEObject!=null){
			//Get the ID of the ownedElement
			XMIResource resource = (XMIResource) ownedEObject.eResource();
			String id_ownedElement = resource.getID(ownedEObject); // Get element id
			if(id_ownedElement==null)
				id_ownedElement=resource.getURIFragment(ownedEObject);
			
			TreeIterator<EObject> elements_model = model.eAllContents();
			while (elements_model.hasNext()){
				EObject next = elements_model.next();
				if(next instanceof ModelElement){
					ModelElement element_model = (ModelElement) next;
					if(id_ownedElement!=null&&
							element_model.getRef()!=null&&
							element_model.getRef().equals(id_ownedElement)){
							ownedElement = element_model;
						}
				}
				
			}
			//if ownedElement doesn't exist in the model, we creates it.
			if (ownedElement==null){
				 ModelElement ownedCreated = createElement(model,id_ownedElement,ownedEObject);
				 if(ownedCreated instanceof ModelElement){
					 ownedElement = (ModelElement)ownedCreated;
				 }
			}
			element.setParentElement(ownedElement);
			element.setRef(id);
			String name = null;
			EList<EStructuralFeature> allESF = eModelElement.eClass().getEAllStructuralFeatures();
			for(int c1=0;c1<allESF.size();c1++){
				EStructuralFeature feature = allESF.get(c1);
				if(eModelElement.eGet(feature) instanceof String){
					if((c1==0)|| (feature.getName().toUpperCase().contains("NAME"))){
						name = eModelElement.eGet(feature).toString();
					}
				}
			}
			if (name==null)
				name=eModelElement.eClass().getName();
			
			element.setName(name);
			//Creates the element in the model
			CreateChildCommand cmdCreate = new CreateChildCommand(domain, ownedElement, HybridPackage.eINSTANCE.getModel_Elements(), element, null);
			domain.getCommandStack().execute(cmdCreate);
			
		}else{
			element.setOwnedModel(model);
			element.setRef(id);
			String name = null;
			EList<EStructuralFeature> allESF = eModelElement.eClass().getEAllStructuralFeatures();
			for(int c1=0;c1<allESF.size();c1++){
				EStructuralFeature feature = allESF.get(c1);
				if(eModelElement.eGet(feature) instanceof String){
					if((c1==0)|| (feature.getName().toUpperCase().contains("NAME"))){
						name = eModelElement.eGet(feature).toString();
					}
				}
			}
			if (name==null)
				name=eModelElement.eClass().getName();
			element.setName(name);
			//Creates the element in the model
			CreateChildCommand cmdCreate = new CreateChildCommand(domain, model, HybridPackage.eINSTANCE.getModel_Elements(), element, null);
			domain.getCommandStack().execute(cmdCreate);
		}
		
		
		return element;
	}

	/**
	 * Creates a feature in a model.
	 * @param model
	 * @param id
	 * @param eModelElement
	 * @return
	 */
	private ModelFeature createFeature(Model model, String id,	EObject eModelElement){
		ModelElement ownedElement=null;
		ModelFeature feature = hybridFactory.createModelFeature();
		
		//Looking for ownedElement of the feature
		EObject ownedEObject = eModelElement.eContainer();
		//Get the ID of the ownedElement
		XMIResource resource = (XMIResource) ownedEObject.eResource();
		String id_ownedElement = resource.getID(ownedEObject); // Get element id
		if(id_ownedElement==null)
			id_ownedElement=resource.getURIFragment(ownedEObject);
		
		TreeIterator<EObject> elements_model = model.eAllContents();
		while (elements_model.hasNext()){
			EObject next = elements_model.next();
			if(next instanceof ModelElement){
				ModelElement element_model = (ModelElement) next;
				if(id_ownedElement!=null&&
					element_model.getRef()!=null&&
					element_model.getRef().equals(id_ownedElement)){
					ownedElement = element_model;
				}
			}
		}
		//if ownedElement doesn't exist in the model, we creates it.
		if (ownedElement==null){
			 ModelElement ownedCreated= createElement(model,id_ownedElement,ownedEObject);
			 if(ownedCreated instanceof ModelElement){
				 ownedElement = (ModelElement)ownedCreated;
			 }
		}
		feature.setOwnedElement(ownedElement);
		feature.setRef(id);
		
		String name = null;
		EList<EStructuralFeature> allESF = eModelElement.eClass().getEAllStructuralFeatures();
		for(int c1=0;c1<allESF.size();c1++){
			EStructuralFeature feature_var = allESF.get(c1);
			if(eModelElement.eGet(feature_var) instanceof String){
				if((c1==0)|| (feature_var.getName().toUpperCase().contains("NAME"))){
					name = eModelElement.eGet(feature_var).toString();
				}
			}
		}
		if (name==null)
			name=eModelElement.eClass().getName();
		feature.setName(name);
		//Creates the feature in the model
		CreateChildCommand cmdCreate = new CreateChildCommand(domain, ownedElement, HybridPackage.eINSTANCE.getModelElement_Features(), feature, null);
		domain.getCommandStack().execute(cmdCreate);
		return feature;
		
	}
	
}
