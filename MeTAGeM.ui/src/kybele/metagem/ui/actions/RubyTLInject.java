package kybele.metagem.ui.actions;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.m2m.atl.drivers.emf4atl.tcs.injector.TCSInjector;
import org.eclipse.m2m.atl.dsls.textsource.IFileTextSource;
import org.eclipse.m2m.atl.engine.vm.AtlModelHandler;
import org.eclipse.m2m.atl.engine.vm.ModelLoader;
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
		try{
			IStructuredSelection iss = (IStructuredSelection) currSelection;
			currentFile = (IFile) iss.getFirstElement();
			injectRubyTL();
			//injectRubyTL2();
		}catch (Exception e){
			JOptionPane.showMessageDialog(null, "RubyTL Inject: Unexpected Error", "Problems Injecting...",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	/*
	 * Based on InjectAction from org.eclipse.gmt.tcs.actions
	 * Works!!!
	 * */
	public void injectRubyTL() throws IOException{
		IFile file = currentFile;
		Language language = LanguageRegistry.getDefault().getLanguage(file.getFileExtension());
		AtlModelHandler amh = AtlModelHandler.getDefault(AtlModelHandler.AMH_EMF);
		Map params = new HashMap();
		String name = file.getFullPath().toString();
		name=name.substring(0, name.length() - 3) +".rubytl"; // 3= ".rb"
		ASMModel model = (ASMModel)language.inject(ASMModelFactory.getDefault(), null, new IFileTextSource(file), params);
		amh.createModelLoader().save(model,name);
	}
	
//	private void injectRubyTL2() {
//		AtlModelHandler amh = AtlModelHandler
//				.getDefault(AtlModelHandler.AMH_EMF);
//		try {
//			ModelLoader ml = amh.createModelLoader();
//			ASMModel mm = ml.loadModel("RubyTL", ml.getMOF(), this.getClass()
//				.getResourceAsStream("/src/kybele/metagem/ui/api/resources/RubyTL/Metamodel/RubyTL.ecore"));
//
//			final ASMModel model = ml.newModel("RubyTL_model", currentFile.getLocationURI().toString(), mm);
//			
//			Map<String, Object> tempParam = new HashMap<String, Object>();
//			tempParam.put("name", "RubyTL");
//			tempParam.put("lexerClass",);
//			tempParam.put("parserClass",);
//			final Map<String, Object> parameters = tempParam;
//
//			final TCSInjector injector = new TCSInjector();
//			
//			String name = currentFile.getFullPath().toString();
//			name = name.substring(0, name.length()
//					- currentFile.getFileExtension().length())
//					+ "rubytl";
//			
//			new Thread() {
//				public void run() {
//					try {
//						injector.inject(model, currentFile.getContents(), parameters);
//					} catch (Exception e) {
//						e.printStackTrace();
//					}
//				}
//			}.start();
//			ml.save(model, name);
//
//		} catch (IOException ioe) {
//			ioe.printStackTrace();
//		}
//	}
	

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		currSelection = selection;
	}

}
