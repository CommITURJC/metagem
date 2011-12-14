package metagem.presentation;

import metagem.MetagemPackage;
import metagem.ModelRoot;
import metagem.SourceElement;
import metagem.SourceModelTransf;
import metagem.TargetElement;
import metagem.TargetModelTransf;
import metagem.impl.ManyToManyImpl;
import metagem.impl.ManyToOneImpl;
import metagem.impl.MetagemFactoryImpl;
import metagem.impl.OneToManyImpl;
import metagem.impl.OneToOneImpl;
import metagem.impl.OneToZeroImpl;
import metagem.impl.RelationsImpl;
import metagem.impl.ZeroToOneImpl;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
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

public class MetagemDragDrop extends EditingDomainViewerDropAdapter {
	
	final static int NULL_SELECTION = -1;
	final static int DEFAULT_SELECTION = 0;
	final static int SOURCE_ELEMENT = 1;
	final static int TARGET_ELEMENT = 2;
	
	private String targetType;
	
	private ResourceSet sourceRs;
	private ResourceSet targetRs;
	private EObject aTargetObj = null;
	private EObject aSource = null;
	private int selectionType;
	private String elementModel;
	private MetagemFactoryImpl metagemFactory;

	public MetagemDragDrop(EditingDomain domain, Viewer viewer, ResourceSet sourceRs, ResourceSet targetRs) {
		super(domain, viewer);
		this.sourceRs = sourceRs;
		this.targetRs = targetRs;
		this.metagemFactory = new MetagemFactoryImpl();
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
				if(aTargetObj instanceof RelationsImpl){
					
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
					
					
//					selectionType = TARGET_ELEMENT;
//					for (int i=0;i<sourceRs.getResources().size();i++){
//						if (aSource.eResource().equals(sourceRs.getResources().get(i))){
//							selectionType = SOURCE_ELEMENT;
//						}
//					}
					if (aTargetObj instanceof OneToOneImpl){
						targetType="OneToOne";
					}
					if (aTargetObj instanceof OneToZeroImpl){
						targetType="OneToZero";
					}
					if (aTargetObj instanceof ZeroToOneImpl){
						targetType="ZeroToOne";
					}
					if (aTargetObj instanceof OneToManyImpl){
						targetType="OneToMany";
					}
					if (aTargetObj instanceof ManyToManyImpl){
						targetType="ManyToMany";
					}
					if (aTargetObj instanceof ManyToOneImpl){
						targetType="ManyToOne";
					}
					
					checkDrop(event,aTargetObj);
					
					
				}
			}
		}   
	  }
	  
	  /**
	   * This method checks whether the targetObject (of the drag&drop process) can be
	   * receive a new selectionType element
	   * 
	   * event.detail = DND.DROP_LINK means it's OK
	   * event.detail = DND.DROP_NONE means it's forbidden
	   * 
	   * @param event
	   * @param aTargetObj
	   */
	  private void checkDrop(DropTargetEvent event, EObject aTargetObj) {
		  event.detail=DND.DROP_LINK;
		  if ((targetType.equals("OneToZero")&&(selectionType == TARGET_ELEMENT))||
				  (targetType.equals("ZeroToOne")&&(selectionType == SOURCE_ELEMENT))){
			event.detail=DND.DROP_NONE;
		  }else{
			if (aTargetObj instanceof OneToZeroImpl) {
				OneToZeroImpl relation = (OneToZeroImpl) aTargetObj;
				if ((relation.getSource() != null)
						&& (selectionType == SOURCE_ELEMENT)) {
					event.detail = DND.DROP_NONE;
				}

			}else if (aTargetObj instanceof ZeroToOneImpl) {
				ZeroToOneImpl relation = (ZeroToOneImpl) aTargetObj;
				if ((relation.getTarget() != null)
						&& (selectionType == TARGET_ELEMENT)) {
					event.detail = DND.DROP_NONE;
				}
			} else if (aTargetObj instanceof OneToOneImpl) {
				OneToOneImpl relation = (OneToOneImpl) aTargetObj;
				if (((relation.getSource() != null) && (selectionType == SOURCE_ELEMENT))
						|| ((relation.getTarget() != null) && (selectionType == TARGET_ELEMENT))) {
					event.detail = DND.DROP_NONE;
				}
			} else if (aTargetObj instanceof OneToManyImpl) {
				OneToManyImpl relation = (OneToManyImpl) aTargetObj;
				if ((relation.getSource() != null)
						&& (selectionType == SOURCE_ELEMENT)) {
					event.detail = DND.DROP_NONE;
				}
			} else if (aTargetObj instanceof ManyToOneImpl) {
				ManyToOneImpl relation = (ManyToOneImpl) aTargetObj;
				if ((relation.getTarget() != null)
						&& (selectionType == TARGET_ELEMENT)) {
					event.detail = DND.DROP_NONE;
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
					createTransformationElement(aSource,aTargetObj,selectionType); 
				}
			}else{
				command = null;
			    commandTarget = null;
			    source = null;
			    dragAndDropCommandInformation = null;
			}
		}
		

		/**
		 * This method creates a new object (oElement) in a Relation.
		 * @param oElement
		 * @param oRelation
		 * @param type: Indicates whether oElement will be a source or a target element in
		 * the relation.
		 */
		private void createTransformationElement(EObject oElement, EObject oRelation, int type){
			if(oRelation instanceof RelationsImpl){
				RelationsImpl relation = (RelationsImpl) oRelation;
				
				//Get the ID of the element
				XMIResource resource = (XMIResource) oElement.eResource();
				String id = resource.getID(oElement); // Get element id
				if(id==null)
					id=resource.getURIFragment(oElement);
				
				if(type==SOURCE_ELEMENT){
					handleSetSourceElement(relation,oElement,id);
				}else{ //TARGET_ELEMENT
					handleSetTargetElement(relation,oElement,id);
				}
			}
		}	
		
		/**
		 * Creates a Source element (oElement) in a Relation (relation)
		 * @param  relation
		 * @param oElement
		 * @param id
		 */
	private void handleSetSourceElement(RelationsImpl relation,
			EObject oElement, String id) {
		Command cmdSet_element = null;

		SourceElement relationElement = metagemFactory.createSourceElement();
		relationElement.setName(getName(oElement));
		relationElement.setRef(id);
		
		ModelRoot model_root = this.getModelRoot(relation);
		EList<SourceModelTransf> sourceModels = model_root.getSourceModels();
		for(int c1=0; c1<sourceModels.size();c1++){
			if(("platform:/resource"+sourceModels.get(c1).getPath()).equals(elementModel)){
				relationElement.setModel(sourceModels.get(c1));
			}
		}
		
		if (targetType.equals("OneToOne")) {
			cmdSet_element = new CreateChildCommand(domain, (EObject) relation,
					MetagemPackage.eINSTANCE.getOneToOne_Source(),
					relationElement, null);
		}
		if (targetType.equals("OneToZero")) {
			cmdSet_element = new CreateChildCommand(domain, (EObject) relation,
					MetagemPackage.eINSTANCE.getOneToZero_Source(),
					relationElement, null);
		}
		if (targetType.equals("OneToMany")) {
			cmdSet_element = new CreateChildCommand(domain, (EObject) relation,
					MetagemPackage.eINSTANCE.getOneToMany_Source(),
					relationElement, null);
		}
		if (targetType.equals("ManyToOne")) {
			cmdSet_element = new CreateChildCommand(domain, (EObject) relation,
					MetagemPackage.eINSTANCE.getManyToOne_Source(),
					relationElement, null);
		}
		if (targetType.equals("ManyToMany")) {
			cmdSet_element = new CreateChildCommand(domain, (EObject) relation,
					MetagemPackage.eINSTANCE.getManyToMany_Source(),
					relationElement, null);
		}
		domain.getCommandStack().execute(cmdSet_element);
	}
		
		/**
		 * Creates a Target element (oElement) in a Relation (relation)
		 * @param relation
		 * @param oElement
		 * @param id
		 */
		private void handleSetTargetElement(RelationsImpl relation, EObject oElement, String id){
			CreateChildCommand cmdSet_element = null;
			
			
			TargetElement relationElement = metagemFactory.createTargetElement();
			relationElement.setName(getName(oElement));
			relationElement.setRef(id);
			
			ModelRoot model_root = this.getModelRoot(relation);
			EList<TargetModelTransf> targetModels = model_root.getTargetModels();
			for(int c1=0; c1<targetModels.size();c1++){
				if(("platform:/resource"+targetModels.get(c1).getPath()).equals(elementModel)){
					relationElement.setModel(targetModels.get(c1));
				}
			}
			
			if(targetType.equals("OneToOne")){
				cmdSet_element = new CreateChildCommand(domain, (EObject)relation, MetagemPackage.eINSTANCE.getOneToOne_Target(), relationElement, null);		
			}
			if(targetType.equals("ZeroToOne")){
				cmdSet_element = new CreateChildCommand(domain, (EObject)relation, MetagemPackage.eINSTANCE.getZeroToOne_Target(), relationElement, null);		
			}
			if(targetType.equals("OneToMany")){
				cmdSet_element = new CreateChildCommand(domain, (EObject)relation, MetagemPackage.eINSTANCE.getOneToMany_Target(), relationElement, null);
			}
			if(targetType.equals("ManyToOne")){
				cmdSet_element = new CreateChildCommand(domain, (EObject)relation, MetagemPackage.eINSTANCE.getManyToOne_Target(), relationElement, null);
			}
			if(targetType.equals("ManyToMany")){
				cmdSet_element = new CreateChildCommand(domain, (EObject)relation, MetagemPackage.eINSTANCE.getManyToMany_Target(), relationElement, null);
			}
			domain.getCommandStack().execute(cmdSet_element);
		}
		
	private String getName(EObject eModelElement) {
		String name = null;
		EList<EStructuralFeature> allESF = eModelElement.eClass()
				.getEAllStructuralFeatures();
		for (int c1 = 0; c1 < allESF.size(); c1++) {
			EStructuralFeature feature = allESF.get(c1);
			if (eModelElement.eGet(feature) instanceof String) {
				if ((c1 == 0)
						|| (feature.getName().toUpperCase().contains("NAME"))) {
					name = eModelElement.eGet(feature).toString();
				}
			}
		}
		if (name == null)
			name = eModelElement.eClass().getName();
		return name;
	}
	
	/**
	 * This method returns the root of the model transformation
	 * from a relation
	 * @param relation
	 * @return modelRoot element
	 */
	private ModelRoot getModelRoot (RelationsImpl relation){
		ModelRoot modelRoot = relation.getOwnedModel();
		if(modelRoot ==null){			
			RelationsImpl rl=relation;
			while(modelRoot==null){
				TargetElement ownedElement = null;
				if(rl instanceof OneToOneImpl){
					OneToOneImpl rel_o2o = (OneToOneImpl) rl;
					ownedElement = rel_o2o.getOwnedElement();	
				}else if(rl instanceof ZeroToOneImpl){
					ZeroToOneImpl rel_z2o = (ZeroToOneImpl) rl;
					ownedElement = rel_z2o.getOwnedElement();	
				}else if(rl instanceof ManyToOneImpl){
					ManyToOneImpl rel_m2o = (ManyToOneImpl) rl;
					ownedElement = rel_m2o.getOwnedElement();	
				}
				if(ownedElement.eContainer() instanceof RelationsImpl){
					rl = (RelationsImpl) ownedElement.eContainer();
				}else{
					return null;
				}
				modelRoot = rl.getOwnedModel();
			}
		}
		return modelRoot;
	}
			
			
}