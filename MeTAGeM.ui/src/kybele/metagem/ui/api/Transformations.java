package kybele.metagem.ui.api;


import java.io.InputStream;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import kybele.metagem.ui.Activator;
import kybele.metagem.ui.utils.Constants;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.m2m.atl.drivers.emf4atl.ASMEMFModel;
import org.eclipse.m2m.atl.engine.AtlEMFModelHandler;
import org.eclipse.m2m.atl.engine.AtlLauncher;
import org.eclipse.m2m.atl.engine.AtlModelHandler;
import org.eclipse.m2m.atl.engine.vm.ATLVMPlugin;
import org.eclipse.mofscript.runtime.ExecutionMessageListener;
import org.osgi.framework.Bundle;

public class Transformations implements ExecutionMessageListener {

	static private Transformations transformations = null;
	protected static Logger logger = Logger.getLogger(ATLVMPlugin.LOGGER);
	
	private AtlEMFModelHandler modelHandler;
	
	private URL METAGEM2HYBRID_TransfoResource;
	private URL HYBRID2ATL_TransfoResource;
	private URL HYBRID2RubyTL_TransfoResource;
	
	private ASMEMFModel metagemMetamodel;
	private ASMEMFModel hybridMetamodel;
	private ASMEMFModel MOFMetamodel;
	private ASMEMFModel atlMetamodel;
	private ASMEMFModel rubyTLMetamodel;
	
	
 
	private Transformations() {

		modelHandler = (AtlEMFModelHandler) AtlModelHandler.getDefault(AtlModelHandler.AMH_EMF);
		
		//logger.setUseParentHandlers(false);
		//logger.setLevel(Level.OFF);
		
		METAGEM2HYBRID_TransfoResource = Transformations.class.getResource("resources/MeTAGeM2Hybrid.asm");
		HYBRID2ATL_TransfoResource = Transformations.class.getResource("resources/Hybrid2ATL.asm");
		HYBRID2RubyTL_TransfoResource = Transformations.class.getResource("resources/Hybrid2RubyTL.asm");
		
	}
	private void initMetagem2HybridMetamodels(Map<String, Object> models) {
	
		metagemMetamodel = (ASMEMFModel) modelHandler.loadModel(
				"METAGEM", modelHandler.getMof(), this.getClass().getResourceAsStream("resources/mw_metagem.ecore"));
		hybridMetamodel = (ASMEMFModel) modelHandler.loadModel(
				"MM_Hybrid", modelHandler.getMof(), this.getClass().getResourceAsStream("resources/MM_Hybrid.ecore"));
		MOFMetamodel = (ASMEMFModel) modelHandler.loadModel(
				"MOF", modelHandler.getMof(), this.getClass().getResourceAsStream("resources/CMOF.ecore"));
		//MOFMetamodel= (ASMEMFModel) modelHandler.getMof();
 		models.put("AMW", metagemMetamodel);
		models.put("MM_Hybrid", hybridMetamodel);
		models.put("MOF", MOFMetamodel);
		
	}
	
	private void initHybrid2ATLMetamodels(Map<String, Object> models) {
		
		hybridMetamodel = (ASMEMFModel) modelHandler.loadModel(
				"MM_Hybrid", modelHandler.getMof(), this.getClass().getResourceAsStream("resources/MM_Hybrid.ecore"));
		atlMetamodel = (ASMEMFModel) modelHandler.loadModel(
				"METAGEM", modelHandler.getMof(), this.getClass().getResourceAsStream("resources/ATL.ecore"));
		models.put("MM_Hybrid", hybridMetamodel);
		models.put("ATL", atlMetamodel);	
	}
	
	private void initHybrid2RubyTLMetamodels(Map<String, Object> models) {
		
		hybridMetamodel = (ASMEMFModel) modelHandler.loadModel(
				"MM_Hybrid", modelHandler.getMof(), this.getClass().getResourceAsStream("resources/MM_Hybrid.ecore"));
		rubyTLMetamodel = (ASMEMFModel) modelHandler.loadModel(
				"RubyTL", modelHandler.getMof(), this.getClass().getResourceAsStream("resources/RubyTL/Metamodel/RubyTL.ecore"));
		models.put("MM_Hybrid", hybridMetamodel);
		models.put("RubyTL", rubyTLMetamodel);
		
	}
	
	public void metagem2hybrid(String inFilePath, String leftFilePath, String rightFilePath,String outFilePath) throws Exception{
			Map<String, Object> models = new HashMap<String, Object>();
			
			initMetagem2HybridMetamodels(models);
						
			// get/create models
			ASMEMFModel metagemInputModel = (ASMEMFModel) modelHandler.loadModel("IN", metagemMetamodel, URI.createFileURI(inFilePath));
			models.put("IN", metagemInputModel);
			
			ASMEMFModel leftInputModel = (ASMEMFModel) modelHandler.loadModel("left", MOFMetamodel, URI.createFileURI(leftFilePath));
			models.put("left", leftInputModel);
			
			ASMEMFModel rightInputModel = (ASMEMFModel) modelHandler.loadModel("right", MOFMetamodel, URI.createFileURI(rightFilePath));
			models.put("right", rightInputModel);
						
			ASMEMFModel hybridOutputModel = (ASMEMFModel) modelHandler.newModel("OUT", URI.createFileURI(outFilePath).toFileString(), hybridMetamodel);
			models.put("OUT", hybridOutputModel);
			
			// launch
			AtlLauncher.getDefault().launch(this.METAGEM2HYBRID_TransfoResource,
					Collections.EMPTY_MAP, models,
					Collections.EMPTY_MAP, Collections.EMPTY_LIST,Collections.EMPTY_MAP);
 
			modelHandler.saveModel(hybridOutputModel, outFilePath, false);
			dispose(models);
	}
	
	public void hybrid2atl(String inFilePath, String outFilePath) throws Exception{
			Map<String, Object> models = new HashMap<String, Object>();
			
			initHybrid2ATLMetamodels(models);
						
			// get/create models
			ASMEMFModel metagemInputModel = (ASMEMFModel) modelHandler.loadModel("IN", hybridMetamodel, URI.createFileURI(inFilePath));
			models.put("IN", metagemInputModel);
									
			ASMEMFModel hybridOutputModel = (ASMEMFModel) modelHandler.newModel("OUT", URI.createFileURI(outFilePath).toFileString(), atlMetamodel);
			models.put("OUT", hybridOutputModel);
			
			// launch
			AtlLauncher.getDefault().launch(this.HYBRID2ATL_TransfoResource,
					Collections.EMPTY_MAP, models,
					Collections.EMPTY_MAP, Collections.EMPTY_LIST,Collections.EMPTY_MAP);
 
			modelHandler.saveModel(hybridOutputModel, outFilePath, false);
			dispose(models);
			
			// Registra el metamodelo de ATL
			Bundle b = Activator.getDefault().getBundle();
			InputStream input = FileLocator.openStream(b, new Path("/src/kybele/metagem/ui/api/resources/ATL.ecore"), false);
			Utils.registerMetamodel(Constants.ATLURI, input);
			input.close();		
	}
	
	public void hybrid2rubytl(String inFilePath, String outFilePath) throws Exception{
		Map<String, Object> models = new HashMap<String, Object>();
		
		initHybrid2RubyTLMetamodels(models);
					
		// get/create models
		ASMEMFModel metagemInputModel = (ASMEMFModel) modelHandler.loadModel("IN", hybridMetamodel, URI.createFileURI(inFilePath));
		models.put("IN", metagemInputModel);
								
		ASMEMFModel hybridOutputModel = (ASMEMFModel) modelHandler.newModel("OUT", URI.createFileURI(outFilePath).toFileString(), rubyTLMetamodel);
		models.put("OUT", hybridOutputModel);
		
		// launch
		AtlLauncher.getDefault().launch(this.HYBRID2RubyTL_TransfoResource,
				Collections.EMPTY_MAP, models,
				Collections.EMPTY_MAP, Collections.EMPTY_LIST,Collections.EMPTY_MAP);

		modelHandler.saveModel(hybridOutputModel, outFilePath, false);
		dispose(models);
		
		// Registra el metamodelo de RubyTL
//		Bundle b = Activator.getDefault().getBundle();
//		InputStream input = FileLocator.openStream(b, new Path("/src/kybele/metagem/ui/api/resources/RubyTL/Metamodel/RubyTL.ecore"), false);
//		Utils.registerMetamodel(Constants.RubyTLURI, input);
//		input.close();		
}
	
	private void dispose(Map<String, Object> models) {
		for (Object model : models.values())
			((ASMEMFModel)model).dispose();
	}	

	static synchronized public Transformations getInstance() {

		if (transformations == null) {

			transformations = new Transformations();

		}

		return transformations;

	}



	/**

	 * ExecutionMessageListener interface operations

	 */

	public void executionMessage (String type, String description) {
		logger.log(Level.INFO, type + " - " + description);
		//System.out.println ();

	}
	


}