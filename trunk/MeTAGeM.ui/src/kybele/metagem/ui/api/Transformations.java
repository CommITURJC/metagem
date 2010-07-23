package kybele.metagem.ui.api;


import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.emf.common.util.URI;
import org.eclipse.m2m.atl.drivers.emf4atl.ASMEMFModel;
import org.eclipse.m2m.atl.engine.AtlEMFModelHandler;
import org.eclipse.m2m.atl.engine.AtlLauncher;
import org.eclipse.m2m.atl.engine.AtlModelHandler;
import org.eclipse.m2m.atl.engine.vm.ATLVMPlugin;
import org.eclipse.mofscript.runtime.ExecutionMessageListener;

public class Transformations implements ExecutionMessageListener {

	static private Transformations transformations = null;
	protected static Logger logger = Logger.getLogger(ATLVMPlugin.LOGGER);
	
	private AtlEMFModelHandler modelHandler;
	
	private URL METAGEM2HYBRID_TransfoResource;
	private ASMEMFModel metagemMetamodel;
	private ASMEMFModel hybridMetamodel;
	private ASMEMFModel MOFMetamodel;
	
	
 
	private Transformations() {

		modelHandler = (AtlEMFModelHandler) AtlModelHandler.getDefault(AtlModelHandler.AMH_EMF);
		
		//logger.setUseParentHandlers(false);
		//logger.setLevel(Level.OFF);
		
		METAGEM2HYBRID_TransfoResource = Transformations.class.getResource("resources/MeTAGeM2Hybrid.asm");
		
		
	}
	private void initMetagem2HybridMetamodels(Map<String, Object> models) {
	
		metagemMetamodel = (ASMEMFModel) modelHandler.loadModel(
				"METAGEM", modelHandler.getMof(), this.getClass().getResourceAsStream("resources/mw_metagem.ecore"));
		hybridMetamodel = (ASMEMFModel) modelHandler.loadModel(
				"MM_Hybrid", modelHandler.getMof(), this.getClass().getResourceAsStream("resources/MM_Hybrid.ecore"));
//		MOFMetamodel = (ASMEMFModel) modelHandler.loadModel(
//				"MOF", modelHandler.getMof(), this.getClass().getResourceAsStream("resources/Ecore.ecore"));
		MOFMetamodel= (ASMEMFModel) modelHandler.getMof();
 		models.put("AMW", metagemMetamodel);
		models.put("MM_Hybrid", hybridMetamodel);
		models.put("MOF", MOFMetamodel);
		
	}
		
	
	public void metagem2hybrid(String inFilePath, String leftFilePath, String rightFilePath,String outFilePath) {
		try {
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
		} catch (Exception e) {
			logger.log(Level.SEVERE, e.getLocalizedMessage(), e);
		}
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