package Traceability.actions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.EStructuralFeatureImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

import Traceability.Model;
import Traceability.impl.ModelImpl;
import Traceability.impl.SourceModelImpl;
import Traceability.impl.TargetModelImpl;
import Traceability.impl.TraceabilityFactoryImpl;
import Traceability.presentation.Actions;

public class LoadElements implements IObjectActionDelegate{
	
	private Shell shell;
	protected ISelection selection;

	public LoadElements() {
		super();
	}
	
	private String getTitle() {
		return "MeTAGeM Trace: Generating elements from models";
	}
	
	public void run(final IAction action) {
		Job job = new Job(getTitle()) {
			protected IStatus run(IProgressMonitor monitor) {
				try {
					runLoad(action,monitor);
				} catch (final Exception ex) {
					
					PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {

						public void run() {
							MessageDialog.openError(shell, "Error",
							"An error has occured: "+ ex.getMessage());
						}
						
					});
					ex.printStackTrace();
				}
				return Status.OK_STATUS;
			}
		};
		job.setPriority(Job.SHORT);
		job.schedule(); // start as soon as possible
	}
	
	private IFile getSelectedFile() {
		IStructuredSelection selection = (IStructuredSelection) this.selection;
		IFile file = (IFile) selection.iterator().next();
		return file;
	}
	
	private void runLoad(IAction action, IProgressMonitor monitor) {
		IFile fileSelected = getSelectedFile();
		//URI uriFile = URI.createPlatformResourceURI(fileSelected.getFullPath().toString(), true);
		ResourceSet rs_model = Actions.createResourceSet(fileSelected.getFullPath().toString());
		ArrayList<SourceModelImpl> sources = Actions.getSourceModels(rs_model);
		ArrayList<TargetModelImpl> targets = Actions.getTargetModels(rs_model);
		
		ArrayList<String> paths_source=new ArrayList<String>();
		for(int i=0;i<sources.size();i++){
			if (sources.get(i).getMetamodel() != null) { //If metamodel attribute is not null
				if (!sources.get(i).getMetamodel().equals("")) { //If metamodel is not empty 
					Actions.registerMetamodel(sources.get(i).getMetamodel()); 
				}
			}
			paths_source.add(sources.get(i).getPath());
		}
		ResourceSet sourceRs = Actions.createResourceSet(paths_source);
		final ArrayList<ModelImpl> sources_= new ArrayList<ModelImpl>();
		for(int c1=0;c1<sources.size();c1++){
			ModelImpl model = (ModelImpl) sources.get(c1);
			sources_.add(model);
		}
		
		ArrayList<String> paths_targets=new ArrayList<String>();
		for(int i=0;i<targets.size();i++){
			if (targets.get(i).getMetamodel() != null) { //If metamodel attribute is not null
				if (!targets.get(i).getMetamodel().equals("")) { //If metamodel is not empty 
					Actions.registerMetamodel(targets.get(i).getMetamodel()); 
				}
			}
			paths_targets.add(targets.get(i).getPath());
		}
		ResourceSet targetRs = Actions.createResourceSet(paths_targets);
		final ArrayList<ModelImpl> targets_= new ArrayList<ModelImpl>();
		for(int c1=0;c1<targets.size();c1++){
			ModelImpl model = (ModelImpl) targets.get(c1);
			targets_.add(model);
		}
		
		createsElementsModel(sourceRs, sources_);
		createsElementsModel(targetRs, targets_);
		
	}

	public static void createsElementsModel(ResourceSet resourceSet, ArrayList<ModelImpl> models) {
		
		EList<Resource> resources = resourceSet.getResources();
		//each resource must be a model
		for (int cont1 = 0; cont1 < resources.size(); cont1++) {
			EList<EObject> contents = resources.get(cont1).getContents();
			for (int cont2 = 0;cont2<contents.size();cont2++) {
				EObject eContent = contents.get(cont2);
				// Get the ID of the element
				XMIResource resourceXMI = (XMIResource) eContent
						.eResource();
				String id_element = resourceXMI.getID(eContent); 
				if (id_element == null)
					id_element = resourceXMI.getURIFragment(eContent);
				createElement(models.get(cont1), id_element, eContent,null);

			}
		}
	}
	
	/**
	 * Creates a Feature in a model or metamodel
	 * @param feature
	 * @param id
	 * @param id_element
	 * @param model
	 * @return feature created
	 */
	private static Traceability.Feature createFeature(Model model, String id, EStructuralFeature feature,
			Traceability.Element ownedElement) {
		Traceability.Feature feature_ = null;
		if (!exists(id, model)) {
			TraceabilityFactoryImpl traceabilityFactory = new TraceabilityFactoryImpl();
			feature_ = traceabilityFactory.createFeature();
			
			if (ownedElement!=null){
				feature_.setParent(ownedElement);
				feature_.setRef(id);
				String name = null;
				EList<EStructuralFeature> allESF = feature.eClass().getEAllStructuralFeatures();
				for(int c1=0;c1<allESF.size();c1++){
					EStructuralFeature feature_var = allESF.get(c1);
					if(feature.eGet(feature_var) instanceof String){
						if((c1==0)|| (feature_var.getName().toUpperCase().contains("NAME"))){
							name = feature.eGet(feature_var).toString();
						}
					}
				}
				if (name==null)
					name=feature.eClass().getName();
				feature_.setName(name);
			
				try {
					feature_.eResource().save(new HashMap<Object, Object>());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		}
		return feature_;
	}

	/**
	 * Creates a Element in a model or metamodel
	 * @param model
	 * @param id
	 * @param eModelElement
	 * @return
	 */
	private static Traceability.Element createElement(Model model, String id, EObject eModelElement,
			Traceability.Element ownedElement){
		Traceability.Element element = null;
		if (!exists(id, model)) {
			TraceabilityFactoryImpl traceabilityFactory = new TraceabilityFactoryImpl();
			element = traceabilityFactory.createElement();
			if (ownedElement == null) {
				element.setModel(model);
			} else {
				element.setSuper_element(ownedElement);
			}
			element.setRef(id);

			String name = null;
			EList<EStructuralFeature> allESF = eModelElement.eClass()
					.getEAllStructuralFeatures();
			for (int c1 = 0; c1 < allESF.size(); c1++) {
				EStructuralFeature feature = allESF.get(c1);
				if (eModelElement.eGet(feature) instanceof String) {
					if ((c1 == 0)
							|| (feature.getName().toUpperCase()
									.contains("NAME"))) {
						name = eModelElement.eGet(feature).toString();
					}
				}
			}
			if (name == null)
				name = eModelElement.eClass().getName();
			element.setName(name);

			// Creates the element in the model
			try {
				element.eResource().save(new HashMap<Object, Object>());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else{
			//element exists
			element = getElementFromModel(id,model);
		}
		
		if(model.getMetamodel()==""){ 
			//It's a metamodel
			EList<EObject> contents = eModelElement.eContents();
			for (int cont2 = 0; cont2 < contents.size(); cont2++) {
				EObject eContent = contents.get(cont2);
				// Get the ID of the element
				XMIResource resourceXMI = (XMIResource) eContent.eResource();
				String id_content = resourceXMI.getID(eContent);
				if (id_content == null)
					id_content = resourceXMI.getURIFragment(eContent);
				
				if(eContent instanceof EStructuralFeatureImpl){
					createFeature(model, id_content, (EStructuralFeature)eContent, element);
				}else{
					createElement(model, id_content, eContent, element);
				}
			}			
		} else {

			EList<EStructuralFeature> allfeatures = eModelElement.eClass()
					.getEAllStructuralFeatures();
			for (int cont1 = 0; cont1 < allfeatures.size(); cont1++) {
				EStructuralFeature feature = allfeatures.get(cont1);

				// Get the ID of the feature
				XMIResource resourceXMIfeature = (XMIResource) feature
						.eResource();
				String id_feature = resourceXMIfeature.getID(feature);
				if (id_feature == null)
					id_feature = resourceXMIfeature.getURIFragment(feature);

				createFeature(model, id_feature, feature, element);
			}
			
			EList<EObject> contents = eModelElement.eContents();
			for (int cont2 = 0; cont2 < contents.size(); cont2++) {
				EObject eContent = contents.get(cont2);
				// Get the ID of the element
				XMIResource resourceXMI = (XMIResource) eContent.eResource();
				String id_content = resourceXMI.getID(eContent);
				if (id_content == null)
					id_content = resourceXMI.getURIFragment(eContent);
				createElement(model, id_content, eContent, element);
			}

		}
		
		return element;
	
	}

	private static Traceability.Element getElementFromModel(String id, Model model) {
		TreeIterator<EObject> elements = model.eAllContents();
		while(elements.hasNext()){
			EObject next = elements.next();
			if(next instanceof Traceability.Element){
				Traceability.Element element = (Traceability.Element) next;
				if(id!=null&&
						element.getRef()!=null&&
						element.getRef().equals(id)){
							return element;
					}
			}
		}
		return null;
	}

	private static boolean exists(String id, Model model) {
		TreeIterator<EObject> elements = model.eAllContents();
		while(elements.hasNext()){
			EObject next = elements.next();
			if(next instanceof Traceability.Element){
				Traceability.Element element = (Traceability.Element) next;
				if(id!=null&&
						element.getRef()!=null&&
						element.getRef().equals(id)){
							return true;
					}
				EList<Traceability.Feature> features = element.getFeatures();
				for(int c1=0;c1<features.size();c1++){
					Traceability.Feature feature = features.get(c1);
					if(id!=null&&
							feature.getRef()!=null&&
							feature.getRef().equals(id)){
								return true;
						}
				}
			}
		}
		
		return false;
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
		
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

}
