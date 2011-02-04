package kybele.metagem.ui.actions;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.HashMap;
import java.util.Map;

import kybele.metagem.ui.api.Transformations;
import kybele.metagem.ui.api.Utils;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.m2m.atl.core.IInjector;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFInjector;
import org.eclipse.m2m.atl.core.emf.EMFModelFactory;
import org.eclipse.m2m.atl.engine.parser.AtlParser;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class ATLExtract implements IObjectActionDelegate {
	
	private ISelection currSelection;
	IFile currentFile; 

	public ATLExtract() {
		super();
	}

	@Override
	public void run(IAction action) {
		IStructuredSelection iss = (IStructuredSelection) currSelection;
		currentFile = (IFile) iss.getFirstElement();
		extractATL();
		
	}

	private void extractATL() {
		try{
			final AtlParser parser=new AtlParser();
			
			ModelFactory factory = new EMFModelFactory();
			IInjector injector = new EMFInjector();
			
			IReferenceModel ATLMetamodel = factory.newReferenceModel();
			injector.inject(ATLMetamodel, Utils.getFileURL("resources/ATL.ecore").toString());
		 	IModel modelTemp = factory.newModel(ATLMetamodel);
			injector.inject(modelTemp, currentFile.getFullPath().toString());
			final IModel model=modelTemp;
			
			
			PipedInputStream in = new PipedInputStream();
			final OutputStream out = new PipedOutputStream(in);
			
			Map<String, Object> tempParam = new HashMap<String, Object>();
			final Map<String, Object> parameters=tempParam;
			
			String name = currentFile.getName();
			//This converts XXX-atl.ecore to XXX-atl.atl 
			name = name.substring(0, name.length()
					- currentFile.getFileExtension().length())
					+ "atl"; 
	
			IWorkspace wks = ResourcesPlugin.getWorkspace();
			IWorkspaceRoot wksroot = wks.getRoot();
			IFile file = wksroot.getFile(currentFile.getFullPath().removeLastSegments(1).append(name));
			
			new Thread() {
				public void run() {
					try {
						parser.extract(model, out, parameters);
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
		}catch (Exception e){
			e.printStackTrace();
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
