package Traceability.presentation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.EStructuralFeatureImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import Traceability.Model;
import Traceability.SourceModel;
import Traceability.TargetModel;
import Traceability.impl.ModelImpl;
import Traceability.impl.SourceModelImpl;
import Traceability.impl.TargetModelImpl;
import Traceability.impl.TraceModelImpl;
import Traceability.impl.TraceabilityFactoryImpl;

public class Actions {

	/**
	 * This method returns the name of the TraceModel (resource)
	 */
	protected static String getTraceModelName(Resource resource) {
		String name = "";
		for (Iterator<?> contents = resource.getAllContents(); contents
				.hasNext();) {
			Object content = contents.next();
			if (content instanceof TraceModelImpl) {
				EObject eoContent = (EObject) content;
				TraceModelImpl traceModel = (TraceModelImpl) eoContent;
				name = traceModel.getName();
			}
		}
		return name;
	}

	/**
	 * This method creates a ResourceSet and adds a model in that ResourceSet.
	 * @param path: the model path 
	 */
	protected static ResourceSet createResourceSet(String path) {
		ResourceSet rs = new ResourceSetImpl();
		rs.setPackageRegistry(EPackage.Registry.INSTANCE);
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("xmi", new XMIResourceFactoryImpl(){
					protected boolean useIDs() {
						return true;
					}
				});
		Resource res = rs.createResource(URI.createURI("platform:/resource"
				+ path));

		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		File f = new File(workspace.getRoot().getLocation().toString() + path);

		FileInputStream is = null;
		try {
			is = new FileInputStream(f);
			HashMap<String, Boolean> options = new HashMap<String, Boolean>();
			options.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
			res.load(is, options);
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return rs;
	}
	
	public static ResourceSet createResourceSet(ArrayList<String> paths) {
		ResourceSet rs = new ResourceSetImpl();
		rs.setPackageRegistry(EPackage.Registry.INSTANCE);
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("xmi", new XMIResourceFactoryImpl(){
					protected boolean useIDs() {
						return true;
					}
				});
		for(int cont=0;cont<paths.size();cont++){
			Resource res = rs.createResource(URI.createURI("platform:/resource"
					+ paths.get(cont)));
			IWorkspace workspace = ResourcesPlugin.getWorkspace();
			File f = new File(workspace.getRoot().getLocation().toString() + paths.get(cont));

			FileInputStream is = null;
			try {
				is = new FileInputStream(f);
				HashMap<String, Boolean> options = new HashMap<String, Boolean>();
				options.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
				res.load(is, options);
				is.close();
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}	
		}
		return rs;
	}
	
	

	/**
	 * Return the InputModels paths
	 */
	protected static ArrayList<SourceModelImpl> getSourceModels(EditingDomain editingDomain2) {
		ArrayList<SourceModelImpl> smodels = new ArrayList<SourceModelImpl>();
		for (Iterator<?> selectedElements = editingDomain2.getResourceSet()
				.getResources().iterator(); selectedElements.hasNext();) {
			Object selectedElement = selectedElements.next();
			Resource selectedElementR = (Resource) selectedElement;
			for (Iterator<?> contents = selectedElementR.getAllContents(); contents
					.hasNext();) {
				Object content = contents.next();
				if (content instanceof TraceModelImpl) {
					EObject eoContent = (EObject) content;
					TraceModelImpl traceModel = (TraceModelImpl) eoContent;
					EList<SourceModel> sourceModels = traceModel.getSourceModels();
					if (!sourceModels.isEmpty()) {
						for (int i = 0; i < sourceModels.size(); i++) {
							SourceModelImpl inModel = (SourceModelImpl) sourceModels.get(i);
							smodels.add(inModel);
						}
					}
				}
			}
		}
		return smodels;
	}

	/**
	 * Return the OutputModels paths
	 */
	protected static ArrayList<TargetModelImpl> getTargetModels(EditingDomain editingDomain2) {
		ArrayList<TargetModelImpl> tmodels = new ArrayList<TargetModelImpl>();
		for (Iterator<?> selectedElements = editingDomain2.getResourceSet()
				.getResources().iterator(); selectedElements.hasNext();) {
			Object selectedElement = selectedElements.next();
			Resource selectedElementR = (Resource) selectedElement;
			for (Iterator<?> contents = selectedElementR.getAllContents(); contents
					.hasNext();) {
				Object content = contents.next();
				if (content instanceof TraceModelImpl) {
					EObject eoContent = (EObject) content;
					TraceModelImpl traceModel = (TraceModelImpl) eoContent;
					EList<TargetModel> targetModels = traceModel.getTargetModels();
					if (!targetModels.isEmpty()) {
						for (int i = 0; i < targetModels.size(); i++) {
							TargetModelImpl outModel = (TargetModelImpl) targetModels
									.get(i);
							tmodels.add(outModel);
						}
					}
				}
			}
		}
		return tmodels;
	}
	
	/**
	 * Register a metamodel whose path is 'path'
	 * @param path: Metamodel path ("/" is the execution workspace)
	 */
	protected static void registerMetamodel(String path) {
		String uri="";
		FileInputStream is = null;
		
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		File file_ = new File(workspace.getRoot().getLocation().toString() + path);
		
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		try{
			DocumentBuilder db = dbf.newDocumentBuilder();
			if (file_.exists()) {
				Document doc = db.parse(file_);
				Element rootEle = doc.getDocumentElement();
				uri = rootEle.getAttribute("nsURI");
			}
		}catch (Exception e){
			e.printStackTrace();
			return;
		}
		
		try {
			is = new FileInputStream(file_);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		registerMetamodel(uri,is);
		try {
			is.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//This method allows register a Metamodel
	private static void registerMetamodel(String URImetaModel, InputStream input) {
		if(!isRegistered(URImetaModel)){
		
			Resource.Factory myEcoreFactory = new EcoreResourceFactoryImpl();
			Resource mmExtent = myEcoreFactory.createResource(URI.createURI(URImetaModel));
			try {
				mmExtent.load(input,Collections.EMPTY_MAP);
			} catch (IOException e) {
				e.printStackTrace();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			
			for(Iterator<EObject> it = getElementsByType(mmExtent,"EPackage").iterator() ; it.hasNext() ; ) {
				EPackage p = (EPackage)it.next();
				String nsURI = p.getNsURI();
				if(nsURI == null) {
					nsURI = p.getName();
					p.setNsURI(nsURI);
				}
				EPackage.Registry.INSTANCE.put(nsURI, p);
			}
			
			for(Iterator<?> it = getElementsByType(mmExtent,"EDataType").iterator(); it.hasNext(); ) {
				EObject eo = (EObject)it.next();
				EStructuralFeature sf;
				sf = eo.eClass().getEStructuralFeature("name");	 
				String tname = (String)eo.eGet(sf);			 
				String icn = null;
				if(tname.equals("Boolean"))
					icn = "java.lang.Boolean";
				else if(tname.equals("Double"))
					icn = "java.lang.Double";
				else if(tname.equals("Float"))
					icn = "java.lang.Float";
				else if(tname.equals("Integer"))
					icn = "java.lang.Integer";
				else if(tname.equals("String"))
					icn = "java.lang.String";
				
				if(icn != null) {
					sf = eo.eClass().getEStructuralFeature("instanceClassName");
					eo.eSet(sf, icn);                
				}
			}
	 }
		
	}
	private static boolean isRegistered(String uri) {
		Object[] result = EPackage.Registry.INSTANCE.keySet().toArray(
				new Object[EPackage.Registry.INSTANCE.size()]);
		Arrays.sort(result);
		
	  for(int i=0;i<result.length;i++){
		  if(uri.equals(result[i].toString()))
			  return true;
	  }
	  return false;
	}

	private static Set<EObject> getElementsByType(Resource extent,String type) {
		Set<EObject> ret = new HashSet<EObject>();
		for(Iterator<?> i = extent.getAllContents(); i.hasNext(); ) {
			EObject eo = (EObject)i.next();
			if (eo.eClass().getName().equals(type))
				ret.add(eo);
		}
		return ret;
	}
	
	
	
	public static Image getImage(String key){
		ImageDescriptor imageDescriptor;
		URL imageURL = TraceabilityEditorTrace.class.getResource("icons/" + key + ".gif");
		imageDescriptor = ImageDescriptor.createFromURL(imageURL);
		return imageDescriptor.createImage();
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
	
	

	
		
}
