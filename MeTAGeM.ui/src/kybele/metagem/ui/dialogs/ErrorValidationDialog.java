package kybele.metagem.ui.dialogs;

import org.eclipse.jface.window.IShellProvider;
import org.eclipse.jface.window.SameShellProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class ErrorValidationDialog extends AbstractDetailsDialog {

	private final String details;

	public ErrorValidationDialog(Shell parentShell, String title,
	         Image image, String message, String details)
	   {
	      this(new SameShellProvider(parentShell), title, image, message,
	            details);
	   }
	   public ErrorValidationDialog(IShellProvider parentShell,
	         String title, Image image, String message, String details)
	    {
	      super(parentShell, getTitle(title), getImage(image), getMessage(message));
	      this.details = details;
	    }

	   public static String getTitle(String title) {
		   if (title != null)
		      return title;
		   return "Exception";
		}
	   
	   public static Image getImage(Image image) {
		   if (image != null)
		      return image;
		   Display display = Display.getCurrent();
		   return display.getSystemImage(SWT.ICON_ERROR);
		}

	   public static String getMessage(String message) {
		    if (message != null)
		       return message;
		    return "A Validation Error occurred";
		}
	   protected Control createDetailsArea(Composite parent) {

		   // Create the details area.
		   Composite panel = new Composite(parent, SWT.NONE);
		   panel.setLayoutData(new GridData(GridData.FILL_BOTH));
		   GridLayout layout = new GridLayout();
		   layout.marginHeight = 0;
		   layout.marginWidth = 0;
		   panel.setLayout(layout);

		   // Create the details content.
		   createDetailsViewer(panel);

		   return panel;
		}

		
		protected Control createDetailsViewer(Composite parent) {
		   if (details == null)
		      return null;

		   Text text = new Text(parent, SWT.MULTI | SWT.READ_ONLY
		         | SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		   text.setLayoutData(new GridData(GridData.FILL_BOTH));

		   // Create the content.
		   text.setText(details);

		   return text;
		}



}
