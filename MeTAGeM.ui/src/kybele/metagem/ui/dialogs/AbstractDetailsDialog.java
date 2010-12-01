package kybele.metagem.ui.dialogs;



import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.window.IShellProvider;
import org.eclipse.jface.window.SameShellProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

public abstract class AbstractDetailsDialog extends Dialog
{
   private final String title;
   private final String message;
   private final Image image;

   public AbstractDetailsDialog(Shell parentShell, String title,
          Image image, String message)
   {
      this(new SameShellProvider(parentShell),title,image,message);
   }

   public AbstractDetailsDialog(IShellProvider parentShell,
         String title, Image image, String message)
   {
      super(parentShell);

      this.title = title;
      this.image = image;
      this.message = message;

      setShellStyle(SWT.DIALOG_TRIM | SWT.RESIZE
             | SWT.APPLICATION_MODAL);
   }

   protected void configureShell(Shell shell) {
	   super.configureShell(shell);
	   if (title != null)
	      shell.setText(title);
	}

   protected Control createDialogArea(Composite parent) {
	   Composite composite = (Composite) super.createDialogArea((org.eclipse.swt.widgets.Composite) parent);
	   ((Control) composite).setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

	   if (image != null) {
	      ((GridLayout) composite.getLayout()).numColumns = 2;
	      Label label = new Label(composite, 0);
	      image.setBackground(label.getBackground());
	      label.setImage(image);
	      label.setLayoutData(new GridData(
	            GridData.HORIZONTAL_ALIGN_CENTER
	                  | GridData.VERTICAL_ALIGN_BEGINNING));
	   }

	   Label label = new Label(composite, SWT.WRAP);
	   if (message != null)
	      label.setText(message);
	   GridData data = new GridData(GridData.FILL_HORIZONTAL
	         | GridData.VERTICAL_ALIGN_CENTER);
	   data.widthHint = convertHorizontalDLUsToPixels(
	      IDialogConstants.MINIMUM_MESSAGE_AREA_WIDTH);
	   label.setLayoutData(data);
	   label.setFont(parent.getFont());

	   return composite;
	}
   
   private Button detailsButton;

   protected void createButtonsForButtonBar(Composite parent) {
      createButton(parent, IDialogConstants.OK_ID,
            IDialogConstants.OK_LABEL, false);
      detailsButton = createButton(parent, IDialogConstants.DETAILS_ID,
            IDialogConstants.SHOW_DETAILS_LABEL, false);
   }

   private Control detailsArea;
   private Point cachedWindowSize;

   protected void buttonPressed(int id) {
      if (id == IDialogConstants.DETAILS_ID)
         toggleDetailsArea();
      else
         super.buttonPressed(id);
   }

   protected void toggleDetailsArea() {
      Point oldWindowSize = getShell().getSize();
      Point newWindowSize = cachedWindowSize;
      cachedWindowSize = oldWindowSize;

      // Show the details area.
      if (detailsArea == null) {
         detailsArea = createDetailsArea((Composite) getContents());
         detailsButton.setText(IDialogConstants.HIDE_DETAILS_LABEL);
      }

      // Hide the details area.
      else {
         detailsArea.dispose();
         detailsArea = null;
         detailsButton.setText(IDialogConstants.SHOW_DETAILS_LABEL);
       }

       /*
        * Must be sure to call
        *    getContents().computeSize(SWT.DEFAULT, SWT.DEFAULT)
        * before calling
        *    getShell().setSize(newWindowSize)
        * since controls have been added or removed.
        */

       // Compute the new window size.
//       Point oldSize = getContents().getSize();
//       Point newSize = getContents().computeSize(
//          SWT.DEFAULT, SWT.DEFAULT);
       if (newWindowSize == null){
//          newWindowSize = new Point(oldWindowSize.x, oldWindowSize.y
//             + (newSize.y - oldSize.y));
    	   newWindowSize = new Point(oldWindowSize.x, oldWindowSize.y
    	             + 100);
       }
       // Crop new window size to screen.
       Point windowLoc = getShell().getLocation();
       Rectangle screenArea =
          getContents().getDisplay().getClientArea();
       if (newWindowSize.y > screenArea.height
             - (windowLoc.y - screenArea.y))
          newWindowSize.y = screenArea.height
                - (windowLoc.y - screenArea.y);

       getShell().setSize(newWindowSize);
       ((Composite) getContents()).layout();
   }

   protected abstract Control createDetailsArea(Composite parent);



}