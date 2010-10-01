package kybele.metagem.ui.launchs.metagem2hybrid;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

import kybele.metagem.ui.api.Transformations;
import kybele.metagem.ui.api.ValidationExecution;
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

public class METAGEM2HYBRIDLaunchConfigurationDelegate implements
		ILaunchConfigurationDelegate {

	@Override
	public void launch(ILaunchConfiguration configuration, String mode,
			ILaunch launch, IProgressMonitor monitor) throws CoreException {
		
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e1) {
			;
		}
		
		if (monitor == null)
			monitor = new NullProgressMonitor();		
		
		monitor.beginTask("Launching transformation", 100);
		monitor.subTask("Getting configuration info");
		String uriIN = getINAtt(configuration);
		String uriLEFT=getLEFTAtt(configuration);
		String uriRIGHT=getRIGHTAtt(configuration);
		String uriOUT = getOUTAtt(configuration);
		monitor.worked(10);
		if (monitor.isCanceled()) 
			return;
				
		boolean isValid = false;
		try {
			isValid = ValidationExecution.isValid(new Path(uriIN).lastSegment(), uriIN, Constants.METAGEMURI,null,Constants.SHOW_DIALOG);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "One or more models cannot be found.\nPlease, check your Launch Configuration", "Problems Launching...", JOptionPane.ERROR_MESSAGE);
			isValid=false;
		}
		if(isValid)
		{
			monitor.subTask("Executing transformation");
			try{
				Transformations transf = Transformations.getInstance();
				transf.metagem2hybrid(uriIN, uriLEFT, uriRIGHT, uriOUT);
				monitor.worked(85);		
				if(monitor.isCanceled())
					return;
			}catch (Exception e){
				JOptionPane.showMessageDialog(null, "One or more models cannot be found.\nPlease, check your Launch Configuration", "Problems Launching...", JOptionPane.ERROR_MESSAGE);
			}
			monitor.subTask("Transformation finished");
			ResourcesPlugin.getWorkspace().getRoot().refreshLocal(IFolder.DEPTH_INFINITE, null);
			monitor.done();
		}
	}
	
	private String getINAtt(ILaunchConfiguration configuration) throws CoreException
	{
		return getTransformationAtt(configuration, METAGEM2HYBRIDConstants.ATTR_TRANSFORMATION_IN);
	}
	
	private String getLEFTAtt(ILaunchConfiguration configuration) throws CoreException
	{
		return getTransformationAtt(configuration, METAGEM2HYBRIDConstants.ATTR_TRANSFORMATION_LEFT);
	}
	
	private String getRIGHTAtt(ILaunchConfiguration configuration) throws CoreException
	{
		return getTransformationAtt(configuration, METAGEM2HYBRIDConstants.ATTR_TRANSFORMATION_RIGHT);
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
