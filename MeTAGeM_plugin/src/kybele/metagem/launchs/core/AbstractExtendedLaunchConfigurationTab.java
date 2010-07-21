package kybele.metagem.launchs.core;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

// TODO Esta es una clase provisional intermedia, para implementar metodos adicionales de creacion de widgets 
public abstract class AbstractExtendedLaunchConfigurationTab extends AbstractLaunchConfigurationTab{
	
	protected Group createGroup(Composite parent, String name) {	
		
		return createGroup(parent, name, 1);
	}
	
	protected Group createGroup(Composite parent, String name, int columns) {	
		return createGroup(parent, name, columns, 1, GridData.FILL_HORIZONTAL);
	}
	
	protected Group createGroup(Composite parent, String text, int columns, int hspan, int fill) {
				
		Group g = new Group(parent, SWT.NONE);
    	g.setLayout(new GridLayout(columns, false));
    	g.setText(text);
    	g.setFont(parent.getFont());
    	GridData gd = new GridData(fill);
		gd.horizontalSpan = hspan;
    	g.setLayoutData(gd);    	
    	return g;
	}
	
	protected Text createText(Composite parent, int hspan) {
	
		Text t = new Text(parent, SWT.SINGLE | SWT.BORDER);
    	t.setFont(parent.getFont());
    	GridData gd = new GridData(GridData.FILL_HORIZONTAL);
    	gd.horizontalSpan = hspan;
    	t.setLayoutData(gd);
    	return t;				
	}
	
	protected Text createText(Composite parent) {
		
		return createText(parent, 1);
	}
	
	
	protected Label createLabel(Composite parent, String text) {
		return createLabel(parent, text, 1);
	}
	
	protected Label createLabel(Composite parent, String text, int hspan) {
		
		Label l = new Label(parent, SWT.NONE);
		l.setFont(parent.getFont());
		l.setText(text);
		GridData gd = new GridData();
		gd.horizontalSpan = hspan;
		l.setLayoutData(gd);
		return l;
	}
	
}
