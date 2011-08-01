package Traceability.presentation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
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

import Traceability.Element;
import Traceability.Feature;
import Traceability.Model;
import Traceability.ModelElement;
import Traceability.SourceElement;
import Traceability.SourceModel;
import Traceability.TargetElement;
import Traceability.TargetModel;
import Traceability.TraceModel;
import Traceability.TraceabilityPackage;
import Traceability.impl.TraceLinkImpl;
import Traceability.impl.TraceabilityFactoryImpl;

public class TraceabilityDragDrop extends EditingDomainViewerDropAdapter {
	
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
	private TraceabilityFactoryImpl traceabilityFactory;

	public TraceabilityDragDrop(EditingDomain domain, Viewer viewer, ResourceSet sourceRs, ResourceSet targetRs) {
		super(domain, viewer);
		this.sourceRs = sourceRs;
		this.targetRs = targetRs;
		this.traceabilityFactory = new TraceabilityFactoryImpl();
	}
	
	/**
	   * This method is called the same way for each of the
	   * {@link org.eclipse.swt.dnd.DropTargetListener} methods, except for leave
	   * and drop.  If the source is available early, it creates or revalidates
	   * the {@link DragAndDropCommand}, and updates the event's detail (operation)
	   * and feedback (drag under effect), appropriately.
	   */
	  protected void helper(DropTargetEvent event)
	  {
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
				if(aTargetObj instanceof TraceLinkImpl){
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
					createTraceElement(aSource,aTargetObj,selectionType); 
				}
			}else{
				command = null;
			    commandTarget = null;
			    source = null;
			    dragAndDropCommandInformation = null;
			}
		}
		

		/**
		 * This method creates a new object (oElement) in a TraceLink.
		 * @param oElement
		 * @param oTraceLink
		 * @param type: Indicates whether oElement will be a source or a target element in
		 * the trace link.
		 */
		private void createTraceElement(EObject oElement, EObject oTraceLink, int type){
			if(oTraceLink instanceof TraceLinkImpl){
				TraceLinkImpl traceLink = (TraceLinkImpl) oTraceLink;
				
				//Get the ID of the element
				XMIResource resource = (XMIResource) oElement.eResource();
				String id = resource.getID(oElement); // Get element id
				if(id==null)
					id=resource.getURIFragment(oElement);
				
				if(type==SOURCE_ELEMENT){
					handleSetSourceElement(traceLink,oElement,id);
				}else{ //TARGET_ELEMENT
					handleSetTargetElement(traceLink,oElement,id);
				}
			}
		}	
		
		/**
		 * Creates a Source element (oElement) in a Trace Link (traceLink)
		 * @param traceLink
		 * @param oElement
		 * @param id
		 */
		private void handleSetSourceElement(TraceLinkImpl traceLink, EObject oElement, String id) {
			ModelElement element=null;	
			TraceModel traceModel = traceLink.getTraceModel();
			EList<SourceModel> source_models = traceModel.getSourceModels();
			
			SourceModel sourceModel = null;
			for(int c1=0; c1<source_models.size();c1++){
				TreeIterator<EObject> elements = source_models.get(c1).eAllContents();
				while(elements.hasNext()){
					EObject next = elements.next();
					if(next instanceof Element){
						Element sourceElement = (Element) next;
						if(id!=null&&
								sourceElement.getRef()!=null&&
								sourceElement.getRef().equals(id)){
								element = sourceElement;
							}
					}
				}
				
				String uriModel = new String ("platform:/resource"+source_models.get(c1).getPath());
				if(uriModel.equals(elementModel)){
					sourceModel = source_models.get(c1);
				}
			}						
		if (element == null) { // element hasn't been created before
			element=createComponent(sourceModel,id,oElement);
		}
		SourceElement traceLinkElement = traceabilityFactory.createSourceElement();
		traceLinkElement.setElementModel(element);
		traceLinkElement.setName(element.getName());
		traceLinkElement.setRef(element.getRef());
		
		CreateChildCommand cmdSet_element = new CreateChildCommand(domain, (EObject)traceLink, TraceabilityPackage.eINSTANCE.getTraceLink_Source(), traceLinkElement, null);
		domain.getCommandStack().execute(cmdSet_element);		
			
		}
		
		/**
		 * Creates a Target element (oElement) in a Trace Link (traceLink)
		 * @param traceLink
		 * @param oElement
		 * @param id
		 */
		private void handleSetTargetElement(TraceLinkImpl traceLink, EObject oElement, String id){
			ModelElement element=null;	
			TraceModel traceModel = traceLink.getTraceModel();
			EList<TargetModel> target_models = traceModel.getTargetModels();
			
			 //target element
			
			TargetModel targetModel = null;
			for(int c1=0; c1<target_models.size();c1++){
				TreeIterator<EObject> elements = target_models.get(c1).eAllContents();
				while(elements.hasNext()){
					EObject next = elements.next();
					if(next instanceof Element){
						Element targetElement = (Element) next;
						if(id!=null&&
								targetElement.getRef()!=null&&
								targetElement.getRef().equals(id)){
								element = targetElement;
							}
					}
				}
				String uriModel = new String ("platform:/resource"+target_models.get(c1).getPath());
				if(uriModel.equals(elementModel)){
					targetModel = target_models.get(c1);
				}
			}
			
			if (element == null) { // element hasn't been created before in the input model
				element=createComponent(targetModel,id,oElement);
			}
			
			TargetElement traceLinkElement = traceabilityFactory.createTargetElement();
			traceLinkElement.setElementModel(element);
			traceLinkElement.setName(element.getName());
			traceLinkElement.setRef(element.getRef());
			
			CreateChildCommand cmdSet_element = new CreateChildCommand(domain, (EObject)traceLink, TraceabilityPackage.eINSTANCE.getTraceLink_Target(), traceLinkElement, null);
			domain.getCommandStack().execute(cmdSet_element);
		}
		
		/**
		 * Creates a ModelComponent (from a ecore model component) in a model or metamodel
		 * 
		 * @param model: Model or Metamodel which will contain the new component
		 * @param id: Id of the new element (it is gotten from its source ecore model)
		 * @param eModelElement element in the source ecore model
		 * @return the ModelElement which has been created
		 */
		private ModelElement createComponent(Model model, String id, EObject eModelElement) {
			
			if(model.getMetamodel()==null){
				//is a metamodel
				return createComponentInMetamodel(model, id, eModelElement);
			}else{
				//is a model --> all new components are elements
				return createElement(model, id, eModelElement);
			}
		}
		
		/**
		 * Creates a ModelComponent (from a ecore model component) in a model
		 * @param model
		 * @param id
		 * @param eModelElement
		 * @return
		 */
		private ModelElement createComponentInMetamodel(Model model, String id,	EObject eModelElement) {
			if (eModelElement instanceof EClassifier){
				return createElement(model, id, eModelElement);
			}else{
				return createFeature(model, id, eModelElement);
			}
			
		}
		
		/**
		 * Creates a Element in a model or metamodel
		 * @param model
		 * @param id
		 * @param eModelElement
		 * @return
		 */
		private Element createElement(Model model, String id,	EObject eModelElement){
			Element ownedElement=null;
			Element element=traceabilityFactory.createElement();
			//Looking for ownedElement of the feature
			EObject ownedEObject = eModelElement.eContainer();
			if ((ownedEObject!=null)&&(!(ownedEObject instanceof EPackage))){
				//Get the ID of the ownedElement
				XMIResource resource = (XMIResource) ownedEObject.eResource();
				String id_ownedElement = resource.getID(ownedEObject); // Get element id
				if(id_ownedElement==null)
					id_ownedElement=resource.getURIFragment(ownedEObject);
				
				TreeIterator<EObject> elements_model = model.eAllContents();
				while (elements_model.hasNext()){
					EObject next = elements_model.next();
					if(next instanceof Element){
						Element element_model = (Element) next;
						if(id_ownedElement!=null&&
								element_model.getRef()!=null&&
								element_model.getRef().equals(id_ownedElement)){
								ownedElement = element_model;
							}
					}
					
				}
				//if ownedElement doesn't exist in the trace model, we creates it.
				if (ownedElement==null){
					 ModelElement ownedCreated = createComponent(model,id_ownedElement,ownedEObject);
					 if(ownedCreated instanceof Element){
						 ownedElement = (Element)ownedCreated;
					 }
				}
				element.setSuper_element(ownedElement);
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
				CreateChildCommand cmdCreate = new CreateChildCommand(domain, ownedElement, TraceabilityPackage.eINSTANCE.getModel_Elements(), element, null);
				domain.getCommandStack().execute(cmdCreate);
				
			}else{
				element.setModel(model);
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
				CreateChildCommand cmdCreate = new CreateChildCommand(domain, model, TraceabilityPackage.eINSTANCE.getModel_Elements(), element, null);
				domain.getCommandStack().execute(cmdCreate);
			}
			
			return element;	
		}
		
		/**
		 * Creates a feature in a metamodel.
		 * @param model
		 * @param id
		 * @param eModelElement
		 * @return
		 */
		private Feature createFeature(Model model, String id,	EObject eModelElement){
			Element ownedElement=null;
			Feature feature = traceabilityFactory.createFeature();
			
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
				if(next instanceof Element){
					Element element_model = (Element) next;
					if(id_ownedElement!=null&&
						element_model.getRef()!=null&&
						element_model.getRef().equals(id_ownedElement)){
						ownedElement = element_model;
					}
				}
			}
			//if ownedElement doesn't exist in the trace model, we creates it.
			if (ownedElement==null){
				 ModelElement ownedCreated= createComponent(model,id_ownedElement,ownedEObject);
				 if(ownedCreated instanceof Element){
					 ownedElement = (Element)ownedCreated;
				 }
			}
			feature.setParent(ownedElement);
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
			CreateChildCommand cmdCreate = new CreateChildCommand(domain, ownedElement, TraceabilityPackage.eINSTANCE.getModel_Elements(), feature, null);
			domain.getCommandStack().execute(cmdCreate);
			return feature;
		}
			
			
			
}