package kybele.metagem.ui.api;


import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import kybele.metagem.ui.utils.Constants;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.mofscript.parser.MofScriptParseError;
import org.eclipse.mofscript.parser.ParserUtil;
import org.eclipse.mofscript.runtime.ExecutionManager;
import org.eclipse.mofscript.runtime.ExecutionMessageListener;
import org.eclipse.m2m.atl.drivers.emf4atl.ASMEMFModel;
import org.eclipse.m2m.atl.engine.AtlEMFModelHandler;
import org.eclipse.m2m.atl.engine.AtlLauncher;
import org.eclipse.m2m.atl.engine.AtlModelHandler;
import org.eclipse.m2m.atl.engine.vm.ATLVMPlugin;

public class Transformations implements ExecutionMessageListener {

	static private Transformations transformations = null;
	static private String resourceDirectory = "resources/";
	protected static Logger logger = Logger.getLogger(ATLVMPlugin.LOGGER);
	
	private AtlEMFModelHandler modelHandler;
	
	private URL METAGEM2HYBRID_TransfoResource;
	private ASMEMFModel metagemMetamodel;
	private ASMEMFModel hybridMetamodel;
	
	
 
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
				"HYBRID", modelHandler.getMof(), this.getClass().getResourceAsStream("resources/MM_Hybrid.ecore"));
		
 		models.put("METAGEM", metagemMetamodel);
		models.put("HYBRID", hybridMetamodel);
		
	}
		
	
	public void metagem2hybrid(String inORDBFilePath, String outFilePath) {
		try {
			Map<String, Object> models = new HashMap<String, Object>();
			
			initMetagem2HybridMetamodels(models);
						
			// get/create models
			ASMEMFModel ordbInputModel = (ASMEMFModel) modelHandler.loadModel("IN", ordb4oraMetamodel, URI.createFileURI(inORDBFilePath));
			models.put("IN", ordbInputModel);
			
			ASMEMFModel sqlOutputModel = (ASMEMFModel) modelHandler.newModel("OUT", URI.createFileURI(outFilePath).toFileString(), sql2003Metamodel);
			models.put("OUT", sqlOutputModel);
			
			// launch
			AtlLauncher.getDefault().launch(this.ORDB4ORA2SQL2003_TransfoResource,
					Collections.EMPTY_MAP, models,
					Collections.EMPTY_MAP, Collections.EMPTY_LIST,Collections.EMPTY_MAP);
 
			modelHandler.saveModel(sqlOutputModel, outFilePath, false);
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