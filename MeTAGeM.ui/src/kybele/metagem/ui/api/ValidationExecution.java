package kybele.metagem.ui.api;

import java.io.File;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import kybele.metagem.ui.Activator;
import kybele.metagem.ui.dialogs.ErrorValidationDialog;
import kybele.metagem.ui.utils.Constants;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.epsilon.commons.parse.problem.ParseProblem;
import org.eclipse.epsilon.commons.util.StringProperties;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.evl.EvlModule;
import org.eclipse.epsilon.evl.EvlUnsatisfiedConstraint;
import org.eclipse.swt.widgets.Display;
import org.osgi.framework.Bundle;

public abstract class ValidationExecution {
	
	private static IEolExecutableModule module;
	
	private static IEolExecutableModule createModule() {
		return (IEolExecutableModule) new EvlModule();
	}
	
	private static String getSource(String metamodelName) throws Exception {
		
		if(metamodelName.equals(Constants.METAGEMURI))
			return "resources/MeTAGeM.evl";
		if(metamodelName.equals(Constants.HYBRIDURI))
			return "resources/mm_Hybrid.evl";
		return "";
	}

	private static boolean postProcess(int type) {
		
		EvlModule module = (EvlModule) ValidationExecution.module;
		
		Collection<EvlUnsatisfiedConstraint> unsatisfied = module.getContext().getUnsatisfiedConstraints();
	
		if (unsatisfied.size() > 0) {
			if (type == Constants.SHOW_DIALOG) {
							
				 new Thread(new Runnable() {
				      public void run() {
				            Display.getDefault().asyncExec(new Runnable() {
				               public void run() {
				            	   EvlModule module = (EvlModule) ValidationExecution.module;
				           		   Collection<EvlUnsatisfiedConstraint> unsatisfied = module.getContext().getUnsatisfiedConstraints();
				            	  
				           		   String message  = new String("");

									for (EvlUnsatisfiedConstraint uc : unsatisfied) {
										message+="- "+uc.getConstraint().getConstraintContext().getName()+": " 
												+uc.getMessage()+"\n";
									}
				           		   
				           		   ErrorValidationDialog dialog = new ErrorValidationDialog(Display.getDefault().getActiveShell(), "Validation problems",
				  				         null, "Problems encountered during validation \n\n"
				  							+ "Reason:\n" + "Diagnosis of "
				  							+ module.getContext().getModelRepository().getModels().get(0).getName(), 
				  							message);
				            	   dialog.open();
				               }
				            });
				      }
				   }).start();     
			}
			return false;
		}
		else {
			//System.out.println("All constraints have been satisfied");
			return true;
		}
	}
	
	public static EvlModule postProcessModule() {
		EvlModule module = (EvlModule) ValidationExecution.module;
		return module;
	}
	
	
	public static boolean isValid(String name, String modelName, String metamodelName, int type) throws Exception {
		
		//Registra el metamodelo de MeTAGeM
		if(metamodelName.equals(Constants.METAGEMURI)){
			Bundle b=Activator.getDefault().getBundle();
			InputStream input= FileLocator.openStream(b,new Path("/src/kybele/metagem/ui/api/resources/mw_metagem.ecore"),false);
			Utils.registerMetamodel(Constants.METAGEMURI,input);
			input.close();
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
		boolean result = postProcess(type);
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
	
	
	
}
