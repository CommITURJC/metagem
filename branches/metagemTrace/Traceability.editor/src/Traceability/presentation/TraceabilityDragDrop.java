package Traceability.presentation;

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

import Traceability.SourceElement;
import Traceability.SourceModel;
import Traceability.TargetElement;
import Traceability.TargetModel;
import Traceability.TraceLink;
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
	 * 
	 * @param traceLink
	 * @param oElement
	 * @param id
	 */
	private void handleSetSourceElement(TraceLinkImpl traceLink,
			EObject oElement, String id) {

		TraceModel traceModel = traceLink.getTraceModel();
		TraceLink tl = traceLink;
		while (traceModel == null) {
			tl = tl.getParentLink();
			traceModel = tl.getTraceModel();
		}
		SourceElement traceLinkElement = traceabilityFactory
				.createSourceElement();
		EList<SourceModel> source_models = traceModel.getSourceModels();
		for (int c1 = 0; c1 < source_models.size(); c1++) {
			if (("platform:/resource" + source_models.get(c1).getPath())
					.equals(elementModel)) {
				traceLinkElement.setModel(source_models.get(c1));
			}
		}
		traceLinkElement.setName(this.getName(oElement));
		traceLinkElement.setRef(id);

		CreateChildCommand cmdSet_element = new CreateChildCommand(domain,
				(EObject) traceLink,
				TraceabilityPackage.eINSTANCE.getTraceLink_Source(),
				traceLinkElement, null);
		domain.getCommandStack().execute(cmdSet_element);

		}
		
	/**
	 * Creates a Target element (oElement) in a Trace Link (traceLink)
	 * 
	 * @param traceLink
	 * @param oElement
	 * @param id
	 */
	private void handleSetTargetElement(TraceLinkImpl traceLink,
			EObject oElement, String id) {
		TraceModel traceModel = traceLink.getTraceModel();
		TraceLink tl = traceLink;
		while (traceModel == null) {
			tl = tl.getParentLink();
			traceModel = tl.getTraceModel();
		}

		TargetElement traceLinkElement = traceabilityFactory
				.createTargetElement();

		EList<TargetModel> target_models = traceModel.getTargetModels();
		for (int c1 = 0; c1 < target_models.size(); c1++) {
			if (("platform:/resource" + target_models.get(c1).getPath())
					.equals(elementModel)) {
				traceLinkElement.setModel(target_models.get(c1));
			}
		}
		traceLinkElement.setName(this.getName(oElement));
		traceLinkElement.setRef(id);

		CreateChildCommand cmdSet_element = new CreateChildCommand(domain,
				(EObject) traceLink,
				TraceabilityPackage.eINSTANCE.getTraceLink_Target(),
				traceLinkElement, null);
		domain.getCommandStack().execute(cmdSet_element);
	}

	private String getName(EObject eModelElement){
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
		
		return name;
	}		
			
}