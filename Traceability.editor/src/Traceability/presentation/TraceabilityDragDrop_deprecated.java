package Traceability.presentation;

import java.util.ArrayList;

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

import Traceability.Element;
import Traceability.SourceElement;
import Traceability.SourceModel;
import Traceability.TargetElement;
import Traceability.TargetModel;
import Traceability.TraceModel;
import Traceability.TraceabilityPackage;
import Traceability.impl.TraceLinkImpl;
import Traceability.impl.TraceabilityFactoryImpl;

public class TraceabilityDragDrop_deprecated extends EditingDomainViewerDropAdapter {
	
	final static int NULL_SELECTION = -1;
	final static int DEFAULT_SELECTION = 0;
	final static int SOURCE_ELEMENT = 1;
	final static int TARGET_ELEMENT = 2;
	
	private ArrayList<ResourceSet> sourceRs;
	private ArrayList<ResourceSet> targetRs;
	private EObject aTargetObj = null;
	private EObject aSource = null;
	private String elementModel;
	private int selectionType;

	public TraceabilityDragDrop_deprecated(EditingDomain domain, Viewer viewer, ArrayList<ResourceSet> sourceRs, ArrayList<ResourceSet> targetRs) {
		super(domain, viewer);
		this.sourceRs = sourceRs;
		this.targetRs = targetRs;
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
					for (int i=0;i<sourceRs.size();i++){
						if (aSource.eResource().getResourceSet().equals(sourceRs.get(i))){
							input = true;
							elementModel = sourceRs.get(i).getResources().get(0).getURI().toString();
						}
					}
					if(input){
						selectionType = SOURCE_ELEMENT;
					}else{
						for (int i=0;i<targetRs.size();i++){
							if (aSource.eResource().getResourceSet().equals(targetRs.get(i))){
								elementModel = targetRs.get(i).getResources().get(0).getURI().toString();
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
		
		private void createTraceElement(EObject oElement, EObject oTraceLink, int type){
			if(oTraceLink instanceof TraceLinkImpl){
				TraceLinkImpl traceLink = (TraceLinkImpl) oTraceLink;

				XMIResource resource = (XMIResource) oElement.eResource();
				String id = resource.getID(oElement); // Get element id
				if(id==null)
					id=resource.getURIFragment(oElement);
				
				Element element=null;
				TraceModel traceModel = traceLink.getTraceModel();
				EList<SourceModel> source_models = traceModel.getSourceModels();
				EList<TargetModel> target_models = traceModel.getTargetModels();
				TraceabilityFactoryImpl traceabilityFactory = new TraceabilityFactoryImpl();
				
				if(type==SOURCE_ELEMENT){
					SourceModel sourceModel = null;
					for(int c1=0; c1<source_models.size();c1++){
						EList<Element> elements = source_models.get(c1).getElements();
						for(int c2=0; c2<elements.size();c2++){
							Element sourceElement = elements.get(c2);
							if(id!=null&&
									sourceElement.getRef()!=null&&
									sourceElement.getRef().equals(id)){
									element = sourceElement;
								}
						}
						String uriModel = new String ("platform:/resource"+source_models.get(c1).getPath());
						if(uriModel.equals(elementModel)){
							sourceModel = source_models.get(c1);
						}
					}						
				if (element == null) { // element hasn't been created before 
					
					element=traceabilityFactory.createElement();
					element.setModel(sourceModel);
					element.setRef(id);
					String name = null;
					EList<EStructuralFeature> allESF = oElement.eClass().getEAllStructuralFeatures();
					for(int c1=0;c1<allESF.size();c1++){
						EStructuralFeature feature = allESF.get(c1);
						if(oElement.eGet(feature) instanceof String){
							if((c1==0)|| (feature.getName().toUpperCase().contains("NAME"))){
								name = oElement.eGet(feature).toString();
							}
						}
					}
					element.setName(name);
					//Creates the element in the model
					CreateChildCommand cmdCreate = new CreateChildCommand(domain, sourceModel, TraceabilityPackage.eINSTANCE.getModel_Elements(), element, null);
					domain.getCommandStack().execute(cmdCreate);
				}
				SourceElement traceLinkElement = traceabilityFactory.createSourceElement();
				traceLinkElement.setElementModel(element);
				traceLinkElement.setName(traceLink.getName()+"_source:"+element.getName());
				traceLinkElement.setRef(element.getRef());
				
				CreateChildCommand cmdSet_element = new CreateChildCommand(domain, oTraceLink, TraceabilityPackage.eINSTANCE.getTraceLink_Source(), traceLinkElement, null);
				domain.getCommandStack().execute(cmdSet_element);
					
				}else{ //target element
					
					TargetModel targetModel = null;
					for(int c1=0; c1<target_models.size();c1++){
						EList<Element> elements = target_models.get(c1).getElements();
						for(int c2=0; c2<elements.size();c2++){
							Element targetElement = elements.get(c2);
							if(id!=null&&
									targetElement.getRef()!=null&&
									targetElement.getRef().equals(id)){
									element = targetElement;
								}
						}
						String uriModel = new String ("platform:/resource"+target_models.get(c1).getPath());
						if(uriModel.equals(elementModel)){
							targetModel = target_models.get(c1);
						}
					}
					
					if (element == null) { // element hasn't been created before in the input model
						element=traceabilityFactory.createElement();
						element.setModel(targetModel);
						element.setRef(id);
						String name = null;
						EList<EStructuralFeature> allESF = oElement.eClass().getEAllStructuralFeatures();
						for(int c1=0;c1<allESF.size();c1++){
							EStructuralFeature feature = allESF.get(c1);
							if(oElement.eGet(feature) instanceof String){
								if((c1==0)|| (feature.getName().toUpperCase().contains("NAME"))){
									name = oElement.eGet(feature).toString();
								}
							}
						}
						element.setName(name);
						//Creates the element in the model
						CreateChildCommand cmdCreate = new CreateChildCommand(domain, targetModel, TraceabilityPackage.eINSTANCE.getModel_Elements(), element, null);
						domain.getCommandStack().execute(cmdCreate);
					}
					
					TargetElement traceLinkElement = traceabilityFactory.createTargetElement();
					traceLinkElement.setElementModel(element);
					traceLinkElement.setName(traceLink.getName()+"_target:"+element.getName());
					traceLinkElement.setRef(element.getRef());
					
					CreateChildCommand cmdSet_element = new CreateChildCommand(domain, oTraceLink, TraceabilityPackage.eINSTANCE.getTraceLink_Target(), traceLinkElement, null);
					domain.getCommandStack().execute(cmdSet_element);
				}				
				
			}
		}
}