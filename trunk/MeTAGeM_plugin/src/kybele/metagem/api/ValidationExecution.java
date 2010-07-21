package kybele.metagem.api;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.am3.ui.action.ActionRegisterMetamodel;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.epsilon.commons.parse.problem.ParseProblem;
import org.eclipse.epsilon.commons.util.StringProperties;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.evl.EvlModule;
import org.eclipse.epsilon.evl.EvlUnsatisfiedConstraint;
import org.osgi.framework.Bundle;



import kybele.metagem.utils.Constants;
import kybele.metagem_plugin.Activator;

public abstract class ValidationExecution {
	
	private static IEolExecutableModule module;
	
	private static IEolExecutableModule createModule() {
		return (IEolExecutableModule) new EvlModule();
	}
	
	private static String getSource(String metamodelName) throws Exception {
		
		if(metamodelName.equals(Constants.METAGEMURI))
			return "MeTAGeM.evl";
		return "";
	}

	private static boolean postProcess() {
		
		EvlModule module = (EvlModule) ValidationExecution.module;
		
		Collection<EvlUnsatisfiedConstraint> unsatisfied = module.getContext().getUnsatisfiedConstraints();
	
		if (unsatisfied.size() > 0) {
			System.err.println(unsatisfied.size() + " constraint(s) have not been satisfied");
			for (EvlUnsatisfiedConstraint uc : unsatisfied) {
				System.err.println(uc.getMessage());
			}
			return false;
		}
		else {
			System.out.println("All constraints have been satisfied");
			return true;
		}
	}
	
	
	public static boolean isValid(String name, String modelName, String metamodelName) throws Exception {
		if(metamodelName.equals(Constants.METAGEMURI)){
			//ActionRegisterMetamodel AR_MM=new ActionRegisterMetamodel();
			//AR_MM.run(new IAction());
			Bundle b=Activator.getDefault().getBundle();
			InputStream input= FileLocator.openStream(b,new Path("metamodels/mw_metagem.ecore"),false);
			registerMetamodel(Constants.METAGEMURI,input);
		}
		
		List<IModel> models = new ArrayList<IModel>();
		models.add(createEmfModelByURI(name, modelName, metamodelName, true, true));
		
		module = createModule();
		module.parse(getFile(getSource(metamodelName)));
		
		if (module.getParseProblems().size() > 0) {
			System.err.println("Parse errors occured...");
			for (ParseProblem problem : module.getParseProblems()) {
				System.err.println(problem.toString());
			}
			System.exit(-1);
		}
		
		for (IModel model : models) {
			module.getContext().getModelRepository().addModel(model);
		}
		
		module.execute();
		boolean result = postProcess();
		module.getContext().getModelRepository().dispose();
		
		return result;
	}
	
	protected static EmfModel createEmfModel(String name, String model, String metamodel, boolean readOnLoad, boolean storeOnDisposal) throws EolModelLoadingException, URISyntaxException {
		EmfModel emfModel = new EmfModel();
		StringProperties properties = new StringProperties();
		properties.put(EmfModel.PROPERTY_NAME, name);
		properties.put(EmfModel.PROPERTY_METAMODEL_FILE, metamodel);
		properties.put(EmfModel.PROPERTY_MODEL_FILE,   model);
		properties.put(EmfModel.PROPERTY_IS_METAMODEL_FILE_BASED, "true");
		properties.put(EmfModel.PROPERTY_READONLOAD, readOnLoad + "");
		properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, storeOnDisposal + "");
		emfModel.load(properties, null);
		return emfModel;
	}

	protected static EmfModel createEmfModelByURI(String name, String model, String metamodel, boolean readOnLoad, boolean storeOnDisposal) throws EolModelLoadingException, URISyntaxException {
		EmfModel emfModel = new EmfModel();
		StringProperties properties = new StringProperties();
		properties.put(EmfModel.PROPERTY_NAME, name);
		properties.put(EmfModel.PROPERTY_METAMODEL_URI, metamodel);
		properties.put(EmfModel.PROPERTY_MODEL_FILE,  model);
		properties.put(EmfModel.PROPERTY_IS_METAMODEL_FILE_BASED, "false");
		properties.put(EmfModel.PROPERTY_READONLOAD, readOnLoad + "");
		properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, storeOnDisposal + "");
		emfModel.load(properties, null);
		return emfModel;
	}
	
	private static File getFile(String fileName) throws URISyntaxException {
		
		InputStream is = ValidationExecution.class.getResourceAsStream(fileName);
		return Utils.writeToFile(is, new File(Utils.getTempDirectory()+ new Path(fileName).lastSegment()));
	}
	
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
		
		for(Iterator it = getElementsByType(mmExtent,"EPackage").iterator() ; it.hasNext() ; ) {
			EPackage p = (EPackage)it.next();
			String nsURI = p.getNsURI();
			if(nsURI == null) {
				nsURI = p.getName();
				p.setNsURI(nsURI);
			}
			EPackage.Registry.INSTANCE.put(nsURI, p);
		}
		
		for(Iterator it = getElementsByType(mmExtent,"EDataType").iterator(); it.hasNext(); ) {
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
	private static Set getElementsByType(Resource extent,String type) {
		Set ret = new HashSet();
		for(Iterator i = extent.getAllContents(); i.hasNext(); ) {
			EObject eo = (EObject)i.next();
			if (eo.eClass().getName().equals(type))
				ret.add(eo);
		}
		return ret;
	}
	
}
