package kybele.metagem.ui.actions;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import kybele.metagem.ui.Activator;
import kybele.metagem.ui.api.Transformations;
import kybele.metagem.ui.api.Utils;
import kybele.metagem.ui.utils.Constants;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.m2m.atl.core.IExtractor;
import org.eclipse.m2m.atl.core.IInjector;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFExtractor;
import org.eclipse.m2m.atl.core.emf.EMFInjector;
import org.eclipse.m2m.atl.core.emf.EMFModelFactory;
import org.eclipse.m2m.atl.engine.parser.AtlParser;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.osgi.framework.Bundle;

public class ATLInject implements IObjectActionDelegate {

	private ISelection currSelection;
	IFile currentFile; 
	
	public ATLInject() {
		super();
	}

	@Override
	public void run(IAction action) {
		IStructuredSelection iss = (IStructuredSelection) currSelection;
		currentFile = (IFile) iss.getFirstElement();
		InjectATL();
		
	}

	private void InjectATL() {
		try{
			AtlParser parser=new AtlParser();
			ModelFactory factory = new EMFModelFactory();
			IInjector injector = new EMFInjector();
			
			IReferenceModel ATLMetamodel = factory.newReferenceModel();
			injector.inject(ATLMetamodel, Utils.getFileURL("resources/ATL.ecore").toString());
			
			// Register ATL metamodel
			Bundle b = Activator.getDefault().getBundle();
			InputStream input = FileLocator.openStream(b, new Path("/src/kybele/metagem/ui/api/resources/ATL.ecore"), false);
			Utils.registerMetamodel(Constants.ATLURI, input);
			input.close();	
			
		 	IModel model = factory.newModel(ATLMetamodel);
		 	String name = currentFile.getFullPath().toString();
			//This converts XXX-atl.ecore to XXX-atl.atl 
			name = name.substring(0, name.length()
					- currentFile.getFileExtension().length())
					+ "ecore";
			Map<String, Object> tempParam = new HashMap<String, Object>();
			final Map<String, Object> parameters=tempParam;
			parser.inject(model, currentFile.getContents(), parameters);
			
			IExtractor extractor = new EMFExtractor();
			extractor.extract(model, name);
		}catch(Exception e){
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
