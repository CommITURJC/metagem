package kybele.metagem.ui.actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.eclipse.am3.core.AM3CorePlugin;
import org.eclipse.am3.core.AM3CoreTools;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.tcs.extractor.TCSExtractor;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.m2m.atl.drivers.emf4atl.ASMEMFModel;
import org.eclipse.m2m.atl.engine.AtlEMFModelHandler;
import org.eclipse.m2m.atl.engine.AtlModelHandler;
import org.eclipse.m2m.atl.engine.vm.nativelib.ASMModel;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class RubyTLExtract implements IObjectActionDelegate {
	
	
	private ISelection currSelection;
	IFile currentFile; 

	public RubyTLExtract() {
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
		extractRubyTL();
	}
	
	private void extractRubyTL() {
		AtlModelHandler emfMof = AtlModelHandler
				.getDefault(AtlModelHandler.AMH_EMF);
		AtlModelHandler amh = emfMof;
		try {
			ASMModel mm = amh.loadModel("RubyTL", amh.getMof(), this.getClass()
					.getResourceAsStream("../api/resources/RubyTL.ecore"));

			final ASMModel model = amh.loadModel(currentFile.getName(), mm,
					currentFile.getContents());
			PipedInputStream in = new PipedInputStream();
			final OutputStream out = new PipedOutputStream(in);
			
			Map tempParam = new HashMap();
			ASMModel mmTCS=amh.loadModel("TCS", amh.getMof(), this.getClass().getResourceAsStream("../api/resources/TCS.ecore"));
			ASMModel modelTCS = emfMof.loadModel("TCS_RubyTL", mmTCS, this.getClass().getResourceAsStream("../api/resources/RubyTL.tcs.ecore"));
			tempParam.put("format", modelTCS);
			final Map parameters = tempParam;

			final TCSExtractor extractor = new TCSExtractor();
			
			String name = currentFile.getName();
			name = name.substring(0, name.length()
					- currentFile.getFileExtension().length())
					+ "rb";

			IWorkspace wks = ResourcesPlugin.getWorkspace();
			IWorkspaceRoot wksroot = wks.getRoot();
			IFile file = wksroot.getFile(currentFile.getFullPath().removeLastSegments(1).append(name));
			
			new Thread() {
				public void run() {
					try {
						extractor.extract(model, out, parameters);
					} catch (Exception e) {
						e.printStackTrace();
					} finally {
						try {
							out.close();
						} catch (IOException ioe) {

						}
					}
				}
			}.start();
			if (file.exists())
				file.setContents(in, IFile.FORCE, null);
			else
				file.create(in, IFile.FORCE, null);

		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}
	

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		currSelection = selection;
	}
	
}
