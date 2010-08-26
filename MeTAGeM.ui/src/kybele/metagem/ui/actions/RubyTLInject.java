package kybele.metagem.ui.actions;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.eclipse.am3.core.AM3CorePlugin;
import org.eclipse.am3.core.AM3CoreTools;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.tcs.injector.TCSInjector;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
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
	}
	
	private void injectRubyTL() {
		AtlModelHandler amh = AtlModelHandler.getDefault(AtlModelHandler.AMH_EMF);
		ASMModel pbmm = amh.getBuiltInMetaModel("Problem");
		ASMModel pbs = amh.newModel("pbs", "pbs", pbmm);
		try {
			InputStream in = currentFile.getContents();
			
			ASMModel mm = amh.loadModel("RubyTL", amh.getMof(), this.getClass().getResourceAsStream("../api/resources/RubyTL.ecore"));
			ASMModel model = amh.newModel(currentFile.getName(), currentFile.getLocationURI().toString(), mm);
			
			Set injectors = AM3CorePlugin.getDefault().getHandler().getElementsBySupertype("Injector");
			EObject injectorObject=null;
			for (Iterator it = injectors.iterator(); it.hasNext();) {
				EObject currentInjector = (EObject) it.next();
				 if	(currentInjector.eClass().getName().equals("EBNFInjector") ){
					 injectorObject=currentInjector;
					 break;
				 }
			}
			int antlrVersion = 2;
			Integer antlrVersion_ = (Integer)AM3CorePlugin.getDefault().getHandler().get(injectorObject, "antlrVersion");
			if(antlrVersion_ != null)
				antlrVersion = antlrVersion_.intValue();
			
			String packageName = "org.eclipse.gmt.tcs.injector.";
			String classNamePrefix = (String)AM3CorePlugin.getDefault().getHandler().get(injectorObject, "classNamePrefix");
			if(antlrVersion == 3)
				classNamePrefix += "_ANTLR3"; 
			String lexerClassName = packageName + classNamePrefix + "Lexer";
			String parserClassName = packageName + classNamePrefix + "Parser";
			Class lexer = null;
			try {
				lexer = Class.forName(lexerClassName);
			} catch(ClassNotFoundException cnfe) {}
			if(lexer == null)
				lexer = AM3CorePlugin.getDefault().getLoader().loadClass2(lexerClassName, true);
			Class parser = null;
			try {
				parser = Class.forName(parserClassName);
			} catch(ClassNotFoundException cnfe) {}
			if(parser == null)
				parser = AM3CorePlugin.getDefault().getLoader().loadClass2(parserClassName, true);
			
			TCSInjector injector = new TCSInjector();
			Map params = new HashMap();
			params.put("name", (String) AM3CorePlugin.getDefault().getHandler()
					.get(injectorObject, "classNamePrefix"));
			params.put("lexerClass", lexer);
			params.put("parserClass", parser);
			params.put("problems", pbs);
			params.put("parserGenerator", "antlr" + antlrVersion);
			injector.inject(model, in, params);
			if (model != null) {
				String name = currentFile.getFullPath().removeFirstSegments(1)
						.toString();
				name = name.substring(0, name.length() - 3) +".rubytl"; // 3= ".rb"
				amh.saveModel(model, name, currentFile.getProject());
			}
		} catch (CoreException e1) {
			System.err.println(e1);
		} catch (IOException e1) {
			System.err.println(e1);
		} catch (ClassNotFoundException e) {
			System.err.println(e);
		}
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		currSelection = selection;
	}

}
