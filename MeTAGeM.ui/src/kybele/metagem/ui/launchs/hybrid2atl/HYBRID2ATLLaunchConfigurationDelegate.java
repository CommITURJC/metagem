package kybele.metagem.ui.launchs.hybrid2atl;

import kybele.metagem.ui.api.Transformations;
import kybele.metagem.ui.api.ValidationExecution;
import kybele.metagem.ui.launchs.metagem2hybrid.METAGEM2HYBRIDConstants;
import kybele.metagem.ui.utils.Constants;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;

public class HYBRID2ATLLaunchConfigurationDelegate implements
		ILaunchConfigurationDelegate {

	@Override
	public void launch(ILaunchConfiguration configuration, String mode,
			ILaunch launch, IProgressMonitor monitor) throws CoreException {
		// TODO Auto-generated method stub
		
		
		if (monitor == null)
			monitor = new NullProgressMonitor();		
		
		monitor.beginTask("Launching transformation", 100);
		monitor.subTask("Getting configuration info");
		String uriIN = getINAtt(configuration);
		String uriOUT = getOUTAtt(configuration);
		monitor.worked(10);
		if (monitor.isCanceled()) 
			return;
		
		boolean isValid = false;
		try {
			isValid = ValidationExecution.isValid(new Path(uriIN).lastSegment(), uriIN, Constants.HYBRIDURI,Constants.LAUNCH_FROM_WIZARD);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(isValid)
		{
			monitor.subTask("Executing transformation");
			Transformations transf = Transformations.getInstance();
			transf.hybrid2atl(uriIN, uriOUT);
			monitor.worked(85);		
			if(monitor.isCanceled())
				return;
			monitor.subTask("Transformation finished");
			ResourcesPlugin.getWorkspace().getRoot().refreshLocal(IFolder.DEPTH_INFINITE, null);
			monitor.done();
		}
		else
		{	
					//System.err.println("Fichero "+ new Path(uriIN).lastSegment() + " no tiene asociada una transformación.");
			System.err.println("Fichero "+ new Path(uriIN).lastSegment() + " no es válido");
		}
	}
	
	private String getINAtt(ILaunchConfiguration configuration) throws CoreException
	{
		return getTransformationAtt(configuration, METAGEM2HYBRIDConstants.ATTR_TRANSFORMATION_IN);
	}
	
		
	private String getOUTAtt(ILaunchConfiguration configuration) throws CoreException
	{
		return getTransformationAtt(configuration, METAGEM2HYBRIDConstants.ATTR_TRANSFORMATION_OUT);
	}
	
	private String getTransformationAtt(ILaunchConfiguration configuration,String id) throws CoreException{
		
		String returned = null;

		returned = configuration.getAttribute(id, (String)null);

		return returned;
	}
}
