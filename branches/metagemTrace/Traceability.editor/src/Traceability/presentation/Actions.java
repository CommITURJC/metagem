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

import javax.swing.JOptionPane;
import javax.swing.UIManager;
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
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import Traceability.SourceModel;
import Traceability.TargetModel;
import Traceability.impl.ModelImpl;
import Traceability.impl.SourceModelImpl;
import Traceability.impl.TargetModelImpl;
import Traceability.impl.TraceModelImpl;


public class Actions {
	public static final int T_METAMODEL = 0;
	public static final int T_MODEL = 1;
	
	
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
	public static ResourceSet createResourceSet(String path) {
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
	
//	public static ResourceSet createResourceSet(ArrayList<String> paths) {
//		ResourceSet rs = new ResourceSetImpl();
//		rs.setPackageRegistry(EPackage.Registry.INSTANCE);
//		rs.getResourceFactoryRegistry().getExtensionToFactoryMap()
//				.put("xmi", new XMIResourceFactoryImpl(){
//					protected boolean useIDs() {
//						return true;
//					}
//				});
//		for(int cont=0;cont<paths.size();cont++){
//			Resource res = rs.createResource(URI.createURI("platform:/resource"
//					+ paths.get(cont)));
//			IWorkspace workspace = ResourcesPlugin.getWorkspace();
//			File f = new File(workspace.getRoot().getLocation().toString() + paths.get(cont));
//
//			FileInputStream is = null;
//			try {
//				is = new FileInputStream(f);
//				
//				HashMap<String, Boolean> options = new HashMap<String, Boolean>();
//				options.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
//				res.load(is, options);
//				is.close();
//			} catch (Exception e) {
//				e.printStackTrace();
//				return null;
//			}	
//		}
//		return rs;
//	}
	
	

	/**
	 * Return the InputModels paths
	 */
	public static ArrayList<SourceModelImpl> getSourceModels(ResourceSet rs) {
		ArrayList<SourceModelImpl> smodels = new ArrayList<SourceModelImpl>();
		for (Iterator<?> selectedElements = rs.getResources().iterator(); selectedElements.hasNext();) {
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
	
	public static void setSourceModels(ResourceSet rs, ArrayList<SourceModelImpl> models){
		for (Iterator<?> selectedElements = rs.getResources().iterator(); selectedElements.hasNext();) {
			Object selectedElement = selectedElements.next();
			Resource selectedElementR = (Resource) selectedElement;
			for (Iterator<?> contents = selectedElementR.getAllContents(); contents
					.hasNext();) {
				Object content = contents.next();
				if (content instanceof TraceModelImpl) {
					EObject eoContent = (EObject) content;
					TraceModelImpl traceModel = (TraceModelImpl) eoContent;
					traceModel.getSourceModels().clear();
					for (int i=0;i<models.size();i++){
						traceModel.getSourceModels().add(models.get(i));
					}
					try {
						traceModel.eResource().save(new HashMap<Object, Object>());
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
	
	public static void setTargetModels(ResourceSet rs, ArrayList<TargetModelImpl> models){
		for (Iterator<?> selectedElements = rs.getResources().iterator(); selectedElements.hasNext();) {
			Object selectedElement = selectedElements.next();
			Resource selectedElementR = (Resource) selectedElement;
			for (Iterator<?> contents = selectedElementR.getAllContents(); contents
					.hasNext();) {
				Object content = contents.next();
				if (content instanceof TraceModelImpl) {
					EObject eoContent = (EObject) content;
					TraceModelImpl traceModel = (TraceModelImpl) eoContent;
					traceModel.getTargetModels().clear();
					for (int i=0;i<models.size();i++){
						traceModel.getTargetModels().add(models.get(i));
					}
					try {
						traceModel.eResource().save(new HashMap<Object, Object>());
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

	/**
	 * Return the OutputModels paths
	 */
	public static ArrayList<TargetModelImpl> getTargetModels(ResourceSet rs) {
		ArrayList<TargetModelImpl> tmodels = new ArrayList<TargetModelImpl>();
		for (Iterator<?> selectedElements = rs.getResources().iterator(); selectedElements.hasNext();) {
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
	public static String registerMetamodel(String path, String name) {
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
			return path;
		}
		Object[] result = getFileInputStream(file_,workspace,path,name,T_METAMODEL);
		is = (FileInputStream) result[0];
		path = (String) result[1];
		registerMetamodel(uri,is);
		try {
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return path;
	}

	private static Object[] getFileInputStream(File file_, IWorkspace workspace, String path, String name, int type){
		Object[] returnData = new Object[2];
		FileInputStream is = null;
		String newpath = path;
		try {
			is = new FileInputStream(file_);
		} catch (FileNotFoundException e) {
			try {
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			
			String message ="Please enter the correct path of ";
			if (type==0){
				message = "Please enter a correct metamodel for ";
			}
			Object response =  JOptionPane.showInputDialog(
			        null,
			        message+name,
			        "MeTAGeM-Trace: Set correct path", JOptionPane.INFORMATION_MESSAGE,
			        null, null, path);
			if (response != null){
				newpath = (String)response;
			}else
				return null;
			
			file_ = new File(workspace.getRoot().getLocation().toString() + newpath);
			//recursive
			Object[] result  = getFileInputStream(file_,workspace,newpath,name, type);
			is = (FileInputStream) result[0];
			newpath = (String) result[1];
		}
		path=newpath;
		returnData[0]=is;
		returnData[1]=path;
		return returnData;
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

	
	public static ResourceSet createResourceSet_Sources(ArrayList<SourceModelImpl> sources) {
		final ArrayList<ModelImpl> sources_= new ArrayList<ModelImpl>();
		for(int c1=0;c1<sources.size();c1++){
			ModelImpl model = (ModelImpl) sources.get(c1);
			sources_.add(model);
		}
		
		return createResourceSet(sources_);
	}
	
	public static ResourceSet createResourceSet_Targets(ArrayList<TargetModelImpl> targets) {
		final ArrayList<ModelImpl> targets_= new ArrayList<ModelImpl>();
		for(int c1=0;c1<targets.size();c1++){
			ModelImpl model = (ModelImpl) targets.get(c1);
			targets_.add(model);
		}
		
		return createResourceSet(targets_);
	}
	
	private static ResourceSet createResourceSet(ArrayList<ModelImpl> models) {
		ResourceSet rs = new ResourceSetImpl();
		rs.setPackageRegistry(EPackage.Registry.INSTANCE);
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("xmi", new XMIResourceFactoryImpl(){
					protected boolean useIDs() {
						return true;
					}
				});
		for(int cont=0;cont<models.size();cont++){
			String path = models.get(cont).getPath();
			String name = models.get(cont).getName();
			
			IWorkspace workspace = ResourcesPlugin.getWorkspace();
			File f = new File(workspace.getRoot().getLocation().toString() + path);

			FileInputStream is = null;
			try {
				Object[] result = getFileInputStream(f,workspace,path,name,T_MODEL);
				is = (FileInputStream) result[0];
				path = (String) result[1];
				models.get(cont).setPath(path);
				Resource res = rs.createResource(URI.createURI("platform:/resource"
						+ path));
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

	
		
}
