package kybele.metagem.ui.actions;

import java.io.File;
import java.io.InputStream;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

import kybele.metagem.ui.api.Transformations;
import kybele.metagem.ui.api.Utils;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.mofscript.parser.MofScriptParseError;
import org.eclipse.mofscript.parser.ParserUtil;
import org.eclipse.mofscript.runtime.ExecutionManager;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;


public class ETLExtract implements IObjectActionDelegate{
	private ISelection currSelection;
	IFile currentFile; 
	protected static Logger logger = Logger.getLogger("ETLExtract");

	public ETLExtract() {
		super();
	}
	
	public void run(IAction action) {
		IStructuredSelection iss = (IStructuredSelection) currSelection;
		currentFile = (IFile) iss.getFirstElement();
		extractETL();
	}
	
	private void extractETL() {
		//String name = "code";
		String m2tName ="ETLGenerator.m2t";
		String ecoreName = "ETL.ecore";
		try

		{
			ParserUtil parserUtil = new ParserUtil();
			ExecutionManager execMgr = ExecutionManager.getExecutionManager();
			String tempDirectory = Utils.getTempDirectory();
			InputStream ecorePath = Transformations.class.getResourceAsStream("resources/" + ecoreName);
			File ecore = Utils.writeToFile(ecorePath, new File( tempDirectory + ecoreName));
			InputStream m2tPath = null;
			m2tPath =  Transformations.class.getResourceAsStream("resources/" + m2tName);
			parserUtil.readModelDecls(ecore.getAbsolutePath());
			File m2t = Utils.writeToFile(m2tPath, new File(tempDirectory+ m2tName));
			parserUtil.parse(m2t, true);
			
			int errorCount = ParserUtil.getModelChecker().getErrorCount();
			Iterator errorIt = ParserUtil.getModelChecker().getErrors();
			// Iterator of MofScriptParseError objects
			logger.log(Level.INFO, "Parsing result: " + errorCount + " errors");
			
			if (errorCount > 0) {
				for (;errorIt.hasNext();) {
					MofScriptParseError parseError = (MofScriptParseError) errorIt.next();
					logger.log(Level.SEVERE,"\t \t: Error: " + parseError.toString());
				}
				return; 
			}
			
			// load source model

			XMIResourceFactoryImpl _xmiFac = new XMIResourceFactoryImpl();
			EObject sourceModel = null;
			IFile sourceModelFile = currentFile;

			ResourceSet rSet =	new ResourceSetImpl ();
			rSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
					"*", _xmiFac);
			URI uri = URI.createFileURI(sourceModelFile.getFullPath().toString());
			Resource resource = rSet.getResource(uri,true);
			if (resource != null) {
				if (resource.getContents().size() > 0) {
					sourceModel = resource.getContents().get(0);
				}
			}
			// set the source model for the execution manager
			execMgr.addSourceModel(sourceModel);
			execMgr.setRootDirectory(currentFile.getLocation().removeLastSegments(1).toString());
			// if true, files are not generated to the file system, but populated into a filemodel
			// which can be fetched afterwards. Value false will result in standard file generation
			execMgr.setUseFileModel(false);
			execMgr.setCharset("UTF-8");
			// Turns on/off system logging
			execMgr.setUseLog(false);

			// Adds an output listener for the transformation execution.
			//execMgr.getExecutionStack().addOutputMessageListener(this);
			execMgr.executeTransformation();
			ResourcesPlugin.getWorkspace().getRoot().refreshLocal(IFolder.DEPTH_INFINITE, null);

		}
		catch (Throwable e) {
			logger.log(Level.SEVERE, e.getLocalizedMessage(), e);
		}
	}
	
	
	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		currSelection = selection;
		
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		// TODO Auto-generated method stub
	}
	
}
