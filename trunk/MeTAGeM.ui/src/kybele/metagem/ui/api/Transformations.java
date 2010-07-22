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
import urjc.m2dat.utils.Constants;
import ORDB4ORA.Model;
import SQL2003.Schema;
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
	
	private URL UML2ORDB4ORA_TransfoResource;
	private URL UML2SQL2003_TransfoResource;
	private URL ORDB4ORA2SQL2003_TransfoResource;
	private URL SQL20032ORDB4ORA_TransfoResource;
	private URL UML2XMLSCHEMA_TransfoResource;
	private ASMEMFModel umlMetamodel;
	private ASMEMFModel schemaMetamodel;
	private ASMEMFModel amwMetamodel;
	private ASMEMFModel ordb4oraMetamodel;
	private ASMEMFModel sql2003Metamodel;
	
 
	private Transformations() {

		modelHandler = (AtlEMFModelHandler) AtlModelHandler.getDefault(AtlModelHandler.AMH_EMF);
		
		//logger.setUseParentHandlers(false);
		//logger.setLevel(Level.OFF);
		
		UML2ORDB4ORA_TransfoResource = Transformations.class.getResource("resources/UML2ORDB4ORA/UML2ORDB4ORA.asm");
		UML2SQL2003_TransfoResource = Transformations.class.getResource("resources/UML2SQL2003/UML2SQL2003.asm");
		UML2XMLSCHEMA_TransfoResource = Transformations.class.getResource("resources/UML2XMLSCHEMA/UML2XMLW.asm");
		SQL20032ORDB4ORA_TransfoResource = Transformations.class.getResource("resources/SQL20032ORDB4ORA/SQL20032ORDB4ORA.asm");
		ORDB4ORA2SQL2003_TransfoResource = Transformations.class.getResource("resources/ORDB4ORA2SQL2003/ORDB4ORA2SQL2003.asm");
		
	}
	private void initORMetamodels(Map<String, Object> models) {
	
		umlMetamodel = (ASMEMFModel) modelHandler.loadModel(
				"UML", modelHandler.getMof(), this.getClass().getResourceAsStream("resources/UML.ecore"));
		amwMetamodel = (ASMEMFModel) modelHandler.loadModel(
				"AMW", modelHandler.getMof(), this.getClass().getResourceAsStream("resources/ORAnnotationMeta.ecore"));
		ordb4oraMetamodel = (ASMEMFModel) modelHandler.loadModel(
				"ORDB4ORA", modelHandler.getMof(), this.getClass().getResourceAsStream("resources/ORDB4ORA.ecore"));
		
 		models.put("UML", umlMetamodel);
		models.put("AMW", amwMetamodel);
		models.put("ORDB4ORA", ordb4oraMetamodel);
		
	}
	
	private void initSQLMetamodels(Map<String, Object> models) {

		umlMetamodel = (ASMEMFModel) modelHandler.loadModel(
				"UML", modelHandler.getMof(), this.getClass().getResourceAsStream("resources/UML.ecore"));
		amwMetamodel = (ASMEMFModel) modelHandler.loadModel(
				"AMW", modelHandler.getMof(), this.getClass().getResourceAsStream("resources/ORAnnotationMeta.ecore"));
		sql2003Metamodel = (ASMEMFModel) modelHandler.loadModel(
				"SQL2003", modelHandler.getMof(), this.getClass().getResourceAsStream("resources/SQL2003.ecore"));
		
 		models.put("UML", umlMetamodel);
		models.put("AMW", amwMetamodel);
		models.put("SQL2003", sql2003Metamodel);
		
	}
	
	private void initXMLMetamodels(Map<String, Object> models) {
		umlMetamodel = (ASMEMFModel) modelHandler.loadModel(
				"UML", modelHandler.getMof(), this.getClass().getResourceAsStream("resources/UML.ecore"));
		amwMetamodel = (ASMEMFModel) modelHandler.loadModel(
				"AnnotationMetamodel", modelHandler.getMof(), this.getClass().getResourceAsStream("resources/AnnotationMetamodel.ecore"));
																												
		schemaMetamodel = (ASMEMFModel) modelHandler.loadModel(
				"schemaXML", modelHandler.getMof(), this.getClass().getResourceAsStream("resources/schemaXML.ecore"));
 		models.put("UML", umlMetamodel);
		models.put("AnnotationMetamodel", amwMetamodel);
		models.put("schemaXML", schemaMetamodel);
		
	}	
	
	private void initORDB2SQLMetamodels(Map<String, Object> models) {

		ordb4oraMetamodel = (ASMEMFModel) modelHandler.loadModel(
				"ORDB4ORA", modelHandler.getMof(), this.getClass().getResourceAsStream("resources/ORDB4ORA.ecore"));
		sql2003Metamodel = (ASMEMFModel) modelHandler.loadModel(
				"SQL2003", modelHandler.getMof(), this.getClass().getResourceAsStream("resources/SQL2003.ecore"));
		
		models.put("ORDB4ORA", ordb4oraMetamodel);
		models.put("SQL2003", sql2003Metamodel);
	}
	
	private void initSQL2ORDBMetamodels(Map<String, Object> models) {

		ordb4oraMetamodel = (ASMEMFModel) modelHandler.loadModel(
				"ORDB4ORA", modelHandler.getMof(), this.getClass().getResourceAsStream("resources/ORDB4ORA.ecore"));
		sql2003Metamodel = (ASMEMFModel) modelHandler.loadModel(
				"SQL2003", modelHandler.getMof(), this.getClass().getResourceAsStream("resources/SQL2003.ecore"));
		
		models.put("SQL2003", sql2003Metamodel);
		models.put("ORDB4ORA", ordb4oraMetamodel);
		
	}
	
	private void initORLibraries(Map<String, Object> libraries) {
		String[]libsRelativePath = {"resources/UML2ORDB4ORA/AMW/UML2ORDB4ORA_AMW_constants.asm",
									"resources/UML2ORDB4ORA/AMW/UML2ORDB4ORA_AMW_private.asm",
									"resources/UML2ORDB4ORA/AMW/UML2ORDB4ORA_AMW.asm",
									"resources/UML2ORDB4ORA/UML/UML_constants.asm",
									"resources/UML2ORDB4ORA/UML/UML_private.asm",
									"resources/UML2ORDB4ORA/UML/UML.asm",
									"resources/UML2ORDB4ORA/UML2ORDB4ORA_constants.asm",
									"resources/UML2ORDB4ORA/UML2ORDB4ORA_helpers.asm"
									};
		for(int i=0;i<libsRelativePath.length;i++)
		{libraries.put("LIB"+i, Transformations.class.getResource(libsRelativePath[i]));}
		
	}
	
	private void initSQLLibraries(Map<String, Object> libraries) {
		String[]libsRelativePath = {"resources/UML2SQL2003/AMW/UML2SQL2003_AMW_constants.asm",
									"resources/UML2SQL2003/AMW/UML2SQL2003_AMW_private.asm",
									"resources/UML2SQL2003/AMW/UML2SQL2003_AMW.asm",
									"resources/UML2SQL2003/UML/UML_constants.asm",
									"resources/UML2SQL2003/UML/UML_private.asm",
									"resources/UML2SQL2003/UML/UML.asm",
									"resources/UML2SQL2003/UML2SQL2003_constants.asm",
									"resources/UML2SQL2003/UML2SQL2003_helpers.asm"
									};
		for(int i=0;i<libsRelativePath.length;i++)
		{libraries.put("LIB"+i, Transformations.class.getResource(libsRelativePath[i]));}
		
	}
	
	private void initXMLLibraries(Map<String, Object> libraries) {
		String[]libsRelativePath = {"resources/UML2XMLSCHEMA/UML2Helpers.asm"
									};
		for(int i=0;i<libsRelativePath.length;i++)
		{libraries.put("LIB"+i, Transformations.class.getResource(libsRelativePath[i]));}
		
	}
	
	
	public void uml2or(String inUMLFilePath,String inAMWFilePath, String outFilePath) {
		try {
			Map<String, Object> models = new HashMap<String, Object>();
			Map<String, Object> libraries = new HashMap<String, Object>();	
			initORMetamodels(models);
			initORLibraries(libraries);
			
			ChangeValues change = ChangeValues.getInstance();
			change.changeAttValue(new Path(inUMLFilePath), "upperValue", "value", "*","-1");
			
			// get/create models
			ASMEMFModel umlInputModel = (ASMEMFModel) modelHandler.loadModel("IN", umlMetamodel, URI.createFileURI(inUMLFilePath));
			models.put("IN", umlInputModel);
			
			
			if(inAMWFilePath != null)
			{
			ASMEMFModel amwInputModel = (ASMEMFModel) modelHandler.loadModel("amw", amwMetamodel, URI.createFileURI(inAMWFilePath));
			models.put("amw", amwInputModel);
			}
			
			ASMEMFModel orOutputModel = (ASMEMFModel) modelHandler.newModel("OUT", URI.createFileURI(outFilePath).toFileString(), ordb4oraMetamodel);
			models.put("OUT", orOutputModel);

			
			// launch
			AtlLauncher.getDefault().launch(this.UML2ORDB4ORA_TransfoResource,
					libraries, models, Collections.EMPTY_MAP,
					Collections.EMPTY_LIST, Collections.EMPTY_MAP);
 
			modelHandler.saveModel(orOutputModel, outFilePath, false);
			dispose(models);
		} catch (Exception e) {
			logger.log(Level.SEVERE, e.getLocalizedMessage(), e);
		}
	}
	
	public void uml2sql2003(String inUMLFilePath,String inAMWFilePath, String outFilePath) {
		try {
			Map<String, Object> models = new HashMap<String, Object>();
			Map<String, Object> libraries = new HashMap<String, Object>();	
			initSQLMetamodels(models);
			initSQLLibraries(libraries);
			
			ChangeValues change = ChangeValues.getInstance();
			change.changeAttValue(new Path(inUMLFilePath), "upperValue", "value", "*","-1");
			
			// get/create models
			ASMEMFModel umlInputModel = (ASMEMFModel) modelHandler.loadModel("IN", umlMetamodel, URI.createFileURI(inUMLFilePath));
			models.put("IN", umlInputModel);
			
			
			if(inAMWFilePath != null)
			{
			ASMEMFModel amwInputModel = (ASMEMFModel) modelHandler.loadModel("amw", amwMetamodel, URI.createFileURI(inAMWFilePath));
			models.put("amw", amwInputModel);
			}
			
			ASMEMFModel orOutputModel = (ASMEMFModel) modelHandler.newModel("OUT", URI.createFileURI(outFilePath).toFileString(), sql2003Metamodel);
			models.put("OUT", orOutputModel);
			
			// launch
			AtlLauncher.getDefault().launch(this.UML2SQL2003_TransfoResource,
					libraries, models, Collections.EMPTY_MAP,
					Collections.EMPTY_LIST, Collections.EMPTY_MAP);
 
			modelHandler.saveModel(orOutputModel, outFilePath, false);
			dispose(models);
		} catch (Exception e) {
			logger.log(Level.SEVERE, e.getLocalizedMessage(), e);
		}
	}
	
	public void uml2schema(String inUMLFilePath,String inAMWFilePath, String outFilePath) {
		try {
			Map<String, Object> models = new HashMap<String, Object>();
			Map<String, Object> libraries = new HashMap<String, Object>();	
			initXMLMetamodels(models);
			initXMLLibraries(libraries);
			
			ChangeValues change = ChangeValues.getInstance();
			change.changeAttValue(new Path(inUMLFilePath), "upperValue", "value", "*","-1");
 
			ASMEMFModel umlInputModel = (ASMEMFModel) modelHandler.loadModel("IN", umlMetamodel, URI.createFileURI(inUMLFilePath));
			models.put("IN", umlInputModel);
			
			if(inAMWFilePath != null)
			{
			ASMEMFModel amwInputModel = (ASMEMFModel) modelHandler.loadModel("AMW", amwMetamodel, URI.createFileURI(inAMWFilePath));
			models.put("AMW", amwInputModel);
			}
			
			ASMEMFModel xchemaOutputModel = (ASMEMFModel) modelHandler.newModel("OUT", URI.createFileURI(outFilePath).toFileString(), schemaMetamodel);
			models.put("OUT", xchemaOutputModel);
		
			// launch
			AtlLauncher.getDefault().launch(this.UML2XMLSCHEMA_TransfoResource ,
					Collections.EMPTY_MAP, models, Collections.EMPTY_MAP,
					Collections.EMPTY_LIST, Collections.EMPTY_MAP);
 
			modelHandler.saveModel(xchemaOutputModel, outFilePath, false);
			dispose(models);
		} catch (Exception e) {
			logger.log(Level.SEVERE, e.getLocalizedMessage(), e);
		}
	}
	
	public void ordb4ora2sql2003(String inORDBFilePath, String outFilePath) {
		try {
			Map<String, Object> models = new HashMap<String, Object>();
			
			initORDB2SQLMetamodels(models);
						
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
	
	public void sql20032ordb4ora(String inSQL2003FilePath, String outFilePath) {
		try {
			Map<String, Object> models = new HashMap<String, Object>();

			initSQL2ORDBMetamodels(models);
						
			// get/create models
			ASMEMFModel sqlInputModel = (ASMEMFModel) modelHandler.loadModel("IN", sql2003Metamodel, URI.createFileURI(inSQL2003FilePath));
			models.put("IN", sqlInputModel);
			
			ASMEMFModel orOutputModel = (ASMEMFModel) modelHandler.newModel("OUT", URI.createFileURI(outFilePath).toFileString(), ordb4oraMetamodel);
			models.put("OUT", orOutputModel);
			
			// launch
			AtlLauncher.getDefault().launch(this.SQL20032ORDB4ORA_TransfoResource,
					Collections.EMPTY_MAP, models,
					Collections.EMPTY_MAP, Collections.EMPTY_LIST,Collections.EMPTY_MAP);
 
			modelHandler.saveModel(orOutputModel, outFilePath, false);
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

	
	@SuppressWarnings("unchecked")
	public String mofscriptTransformation(IPath modelo,String uriEcore,String destinationFolder)
	{
		String name = "codigo";
		String m2tName ="";
		String ecoreName = "";
		if(uriEcore.equals(Constants.SQL2003URI))
		{
			ecoreName = Constants.sql2003Ecore;
			m2tName = "sql2003.m2t";
		}
		else
		if(uriEcore.equals(Constants.ORDB4ORAURI))
		{
			ecoreName = Constants.ORDB4ORAEcore;
			m2tName = "ordb4ora.m2t";
		}
		else
			if(uriEcore.equals(Constants.XMLSCHEMAURI))
			{
				ecoreName = Constants.XMLSCHEMAEcore;
				m2tName = "ecoreSchema2Schema.m2t";
			}
		
		try

		{
			ParserUtil parserUtil = new ParserUtil();

			ExecutionManager execMgr = ExecutionManager.getExecutionManager();
						
			String tempDirectory = Utils.getTempDirectory();

			InputStream ecorePath = Transformations.class.getResourceAsStream("resources/" + ecoreName);
			File ecore = Utils.writeToFile(ecorePath, new File( tempDirectory + ecoreName));
			
			InputStream m2tPath = null;
			
			m2tPath =  Transformations.class.getResourceAsStream(resourceDirectory + m2tName);
			
			parserUtil.readModelDecls(ecore.getAbsolutePath());
			
			File m2t = Utils.writeToFile(m2tPath, new File(tempDirectory+ m2tName));
			
			parserUtil.parse(m2t, true);

			// check for errors: Parsing the m2t file

			int errorCount = ParserUtil.getModelChecker().getErrorCount();

			Iterator errorIt = ParserUtil.getModelChecker().getErrors();
			// Iterator of MofScriptParseError objects

			logger.log(Level.INFO, "Parsing result: " + errorCount + " errors");
			
			if (errorCount > 0) {

				for (;errorIt.hasNext();) {

					MofScriptParseError parseError = (MofScriptParseError) errorIt.next();
					logger.log(Level.SEVERE,"\t \t: Error: " + parseError.toString());
					
				}

				return null; 

			}

			// load source model

			XMIResourceFactoryImpl _xmiFac =
				new XMIResourceFactoryImpl();

			EObject sourceModel =
				null;

			//File sourceModelFile = new File ("SM.ecore");

			File sourceModelFile = modelo.toFile();

			ResourceSet rSet =
				new ResourceSetImpl ();

			rSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
					"*", _xmiFac);

			URI uri = URI.createFileURI(sourceModelFile.getAbsolutePath());

			Resource resource = rSet.getResource(uri,
					true);

			if (resource != null) {

				if (resource.getContents().size() > 0) {

					sourceModel = resource.getContents().get(0);

				}

			}
			
			if (sourceModel instanceof Model)
			{
				Model a = (Model) sourceModel;
				if (a.getName()!= null)
					name = a.getName();
			}
			else if (sourceModel instanceof Schema)
			{
				Schema a = (Schema) sourceModel;
				if (a.getName()!= null)
					name = a.getName();
			}
			else if (sourceModel instanceof schemaXML.Schema)
			{
				schemaXML.Schema a = (schemaXML.Schema) sourceModel;
				if (a.getId()!= null)
					name = a.getId();
			}
			
			// set the source model for the execution manager
			execMgr.addSourceModel(sourceModel);
			
			execMgr.setRootDirectory(destinationFolder);
			// if true, files are not generated to the file system, but populated into a filemodel

			// which can be fetched afterwards. Value false will result in standard file generation

			execMgr.setUseFileModel(
					false);

			// Turns on/off system logging

			execMgr.setUseLog(
					false);

			// Adds an output listener for the transformation execution.

			execMgr.getExecutionStack().addOutputMessageListener(
					this);

			execMgr.executeTransformation();

			

		}
		catch (Throwable e) {

			logger.log(Level.SEVERE, e.getLocalizedMessage(), e);

		}
		return name;
		
	}



	/**

	 * ExecutionMessageListener interface operations

	 */

	public void executionMessage (String type, String description) {
		logger.log(Level.INFO, type + " - " + description);
		//System.out.println ();

	}
	


}