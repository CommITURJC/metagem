package kybele.metagem.ui.actions;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.gmt.tcs.metadata.ASMModelFactory;
import org.eclipse.gmt.tcs.metadata.Language;
import org.eclipse.gmt.tcs.metadata.LanguageRegistry;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.m2m.atl.dsls.textsource.IFileTextSource;
import org.eclipse.m2m.atl.engine.AtlModelHandler;
import org.eclipse.m2m.atl.engine.vm.nativelib.ASMModel;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class RubyTLInject  implements IObjectActionDelegate {

	private ISelection currSelection;
	IFile currentFile; 
	
	public RubyTLInject() {
		super();
	}
	
	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action){
		IStructuredSelection iss = (IStructuredSelection) currSelection;
		currentFile = (IFile) iss.getFirstElement();
		injectRubyTL();
		//injectRubyTL2();
	}
	
	/*
	 * Based on InjectAction from org.eclipse.gmt.tcs.actions
	 * Works!!!
	 * */
	public void injectRubyTL(){
		IFile file = currentFile;
		Language language = LanguageRegistry.getDefault().getLanguage(file.getFileExtension());
		AtlModelHandler amh = AtlModelHandler.getDefault(AtlModelHandler.AMH_EMF);
		Map params = new HashMap();
		String name = file.getProjectRelativePath().toString();
		name=name.substring(0, name.length() - 3) +".rubytl"; // 3= ".rb"
		ASMModel model = (ASMModel)language.inject(ASMModelFactory.getDefault(), null, new IFileTextSource(file), params);
		amh.saveModel(model, name, file.getProject());
	}
	
/*
 * Based on ActionEBNFInjector from org.eclipse.am3.ui.action
 * Doesn't work!!!
 * */
//	private void injectRubyTL2() {
//		AtlModelHandler amh = AtlModelHandler.getDefault(AtlModelHandler.AMH_EMF);
//		ASMModel pbmm = amh.getBuiltInMetaModel("Problem");
//		ASMModel pbs = amh.newModel("pbs", "pbs", pbmm);
//		try {
//			InputStream in = currentFile.getContents();
//			
//			ASMModel mm = amh.loadModel("RubyTL", amh.getMof(), this.getClass().getResourceAsStream("../api/resources/RubyTL/Metamodel/RubyTL.ecore"));
//			ASMModel model = amh.newModel(currentFile.getName(), currentFile.getLocationURI().toString(), mm);
//
//			int antlrVersion = 3;
//			String packageName = "org.eclipse.gmt.tcs.injector.";
//			String classNamePrefix = "RubyTL_ANTLR3";
//			String lexerClassName = packageName + classNamePrefix + "Lexer";
//			String parserClassName = packageName + classNamePrefix + "Parser";
//			
//			Class lexer = null;
//			try {
//				Class lexerATL= Class.forName("org.eclipse.gmt.tcs.injector.ATL_ANTLR3Lexer");
//				lexer = Class.forName(lexerClassName);
//			} catch(ClassNotFoundException cnfe) {}
//			if(lexer == null)
//				lexer = AM3CorePlugin.getDefault().getLoader().loadClass2(lexerClassName, true);
//			
//			Class parser = null;
//			try {
//				parser = Class.forName(parserClassName);
//			} catch(ClassNotFoundException cnfe) {}
//			if(parser == null)
//				parser = AM3CorePlugin.getDefault().getLoader().loadClass2(parserClassName, true);
//			
//			TCSInjector injector = new TCSInjector();
//			Map params = new HashMap();
//			params.put("name", "RubyTL");
//			params.put("lexerClass", lexer);
//			params.put("parserClass", parser);
//			params.put("problems", pbs);
//			params.put("parserGenerator", "antlr" + antlrVersion);
//			injector.inject(model, in, params);
//			if (model != null) {
//				String name = currentFile.getFullPath().removeFirstSegments(1)
//						.toString();
//				name = name.substring(0, name.length() - 3) +".rubytl"; // 3= ".rb"
//				amh.saveModel(model, name, currentFile.getProject());
//			}
//		} catch (CoreException e1) {
//			System.err.println(e1);
//		} catch (IOException e1) {
//			System.err.println(e1);
//		} catch (ClassNotFoundException e) {
//			System.err.println(e);
//		}
//	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		currSelection = selection;
	}

}
