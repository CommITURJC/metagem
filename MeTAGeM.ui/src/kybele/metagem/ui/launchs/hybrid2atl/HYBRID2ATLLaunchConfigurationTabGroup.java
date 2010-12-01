package kybele.metagem.ui.launchs.hybrid2atl;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.CommonTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;

public class HYBRID2ATLLaunchConfigurationTabGroup extends
		AbstractLaunchConfigurationTabGroup {

	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
			
			ILaunchConfigurationTab[] tabs = new ILaunchConfigurationTab[] {
					new HYBRID2ATLLaunchConfigurationTab(),
					new CommonTab()
			};
			setTabs(tabs);		
		}

}
