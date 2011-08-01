package Traceability.presentation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
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
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import Traceability.SourceModel;
import Traceability.TargetModel;
import Traceability.impl.SourceModelImpl;
import Traceability.impl.TargetModelImpl;
import Traceability.impl.TraceModelImpl;

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
	}

	//This method allows register a Metamodel
	private static void registerMetamodel(String URImetaModel, InputStream input) {
		
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
		URL imageURL = TraceabilityEditorTrace_deprecated.class.getResource("icons/" + key + ".gif");
		imageDescriptor = ImageDescriptor.createFromURL(imageURL);
		return imageDescriptor.createImage();
	}

	
	

	
		
}
