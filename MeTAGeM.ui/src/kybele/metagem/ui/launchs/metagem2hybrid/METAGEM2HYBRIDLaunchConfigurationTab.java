package kybele.metagem.ui.launchs.metagem2hybrid;

import kybele.metagem.ui.api.ValidationExecution;
import kybele.metagem.ui.launchs.core.AbstractExtendedLaunchConfigurationTab;
import kybele.metagem.ui.utils.Constants;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;

public class METAGEM2HYBRIDLaunchConfigurationTab extends AbstractExtendedLaunchConfigurationTab {

		private ScrolledComposite sc = null;
		private Composite modelExtentComp = null;	
		private Text tProviderTextIN;
		private Text tProviderTextLEFT;
		private Text tProviderTextRIGHT;
		private Text tProviderTextOUT;
			
		
		// clase privada, para manejar los eventos de la selección del modelo de entrada
		
		private class TProviderGroupListener extends SelectionAdapter implements ModifyListener {
			
			int type;
			public void widgetSelected (SelectionEvent e) {
					
				ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(getShell()
												, getLabelProvider()
												, getTreeContentProvider());
				dialog.setTitle("Select a valid model");
				dialog.setAllowMultiple(false);	// Solo podemos elegir un fichero
				dialog.setInput(ResourcesPlugin.getWorkspace().getRoot());				
				
				if (dialog.open() == Window.OK) {
					Object o = dialog.getFirstResult();
					String path = "";
					if(o instanceof IFile)
						path = ((IFile)dialog.getFirstResult()).getLocation().toOSString();
					if(o instanceof IFolder)	
						path = ((IFolder)dialog.getFirstResult()).getLocation().toOSString();
					
					switch(type)
					{
					case(0):if (!tProviderTextIN.getText().equals(path))tProviderTextIN.setText(path);break;
					case(1):if (!tProviderTextLEFT.getText().equals(path))tProviderTextLEFT.setText(path);break;
					case(2):if (!tProviderTextRIGHT.getText().equals(path))tProviderTextRIGHT.setText(path);break;
					case(3):if (!tProviderTextOUT.getText().equals(path))tProviderTextOUT.setText(path);break;
					}
					
				}
			}
			
			public TProviderGroupListener(int type) {
				this.type = type;
			}

			public void modifyText(ModifyEvent e) {
	 
				updateLaunchConfigurationDialog();
				
			}

		}
		
		@Override
		protected void updateLaunchConfigurationDialog() {

			 IPath orLoc = getMetagemLocation();
			   if (orLoc == null || !orLoc.toFile().exists() || !orLoc.getFileExtension().equals("metagem")) {
			      setMessage(null);
			      setErrorMessage("Select a valid MeTAGeM file");
			      super.updateLaunchConfigurationDialog();
			      return;
			   }
			   else
			   {
				   boolean isValid = false;
					try {
						isValid = ValidationExecution.isValid(orLoc.lastSegment(), orLoc.toOSString(), Constants.METAGEMURI,null,Constants.NOT_SHOW_DIALOG);
					} catch (Exception e) {
						e.printStackTrace();
					}
					if(isValid)
					{
					      setMessage("Valid METAGEM file");
					      setErrorMessage(null);
					}
					else
					{
						  setMessage(null);
					      setErrorMessage("Select a valid MeTAGeM file. Validation failed");
					      super.updateLaunchConfigurationDialog();
					      return;
					}

			   }
			   
			   IPath leftLoc = getLeftLocation();
			   if (leftLoc == null) {
			      setMessage(null);
			      setErrorMessage(
			         "Select a valid left (MOF) model");
			      super.updateLaunchConfigurationDialog();
			      return;
			   }
			   
			   IPath rightLoc = getRightLocation();
			   if (rightLoc == null) {
			      setMessage(null);
			      setErrorMessage(
			         "Select a valid right (MOF) model");
			      super.updateLaunchConfigurationDialog();
			      return;
			   }
			   
			   IPath destinationLoc = getDestinationLocation();
			   if (destinationLoc == null) {
			      setMessage(null);
			      setErrorMessage(
			         "Select a valid output model");
			      super.updateLaunchConfigurationDialog();
			      return;
			   }
			   	  setMessage(null);
			      setErrorMessage(null);
			      super.updateLaunchConfigurationDialog();
		}
					
		public void createControl(Composite parent) {

			setMessage("Launching configuration for a model to model transformation");
			// Creamos el composite del tab en el que iremos mostrando los widgets verticalmente
			//modelExtentShell = getShell();
			
			sc = new ScrolledComposite(parent, SWT.V_SCROLL | SWT.H_SCROLL | SWT.BORDER);
			//modelExtentComp = new ScrolledComposite(parent, SWT.V_SCROLL | SWT.BORDER);
			sc.setExpandHorizontal(true);
			sc.setExpandVertical(true);
			
					
			modelExtentComp = new Composite(sc, SWT.NONE);
			sc.setContent(modelExtentComp);		

			GridLayout topLayOut = new GridLayout(1, true);
			topLayOut.verticalSpacing = 10;
			modelExtentComp.setLayout(topLayOut);
			modelExtentComp.setFont(parent.getFont());
			
			setControl(sc);
			
			// Primer grupo de controles, para seleccionar el fichero MeTAGeM	
			Group tProviderGroup = createGroup(modelExtentComp, "MeTAGeM model to transform", 3);
			TProviderGroupListener tProviderListener = new TProviderGroupListener(0);

			createLabel(tProviderGroup, "MeTAGeM model URI: ");		
			tProviderTextIN = createText(tProviderGroup);		
			tProviderTextIN.addModifyListener(tProviderListener);
			
			Button tProviderBrowse = createPushButton(tProviderGroup, "Browse...", null);		
			tProviderBrowse.addSelectionListener(tProviderListener);
			
			// Segundo grupo de controles, para seleccionar el fichero left	
			Group tProviderGroup2 = createGroup(modelExtentComp, "Left(MOF) model to transform", 3);
			TProviderGroupListener tProviderListener2 = new TProviderGroupListener(1);

			createLabel(tProviderGroup2, "LEFT model URI: ");		
			tProviderTextLEFT = createText(tProviderGroup2);		
			tProviderTextLEFT.addModifyListener(tProviderListener2);
			
			Button tProviderBrowse2 = createPushButton(tProviderGroup2, "Browse...", null);		
			tProviderBrowse2.addSelectionListener(tProviderListener2);
			
			// Tercer grupo de controles, para seleccionar el fichero right
			Group tProviderGroup3 = createGroup(modelExtentComp, "Right(MOF) model to transform", 3);
			TProviderGroupListener tProviderListener3 = new TProviderGroupListener(2);

			createLabel(tProviderGroup3, "RIGHT model URI: ");		
			tProviderTextRIGHT = createText(tProviderGroup3);		
			tProviderTextRIGHT.addModifyListener(tProviderListener3);
			
			Button tProviderBrowse3 = createPushButton(tProviderGroup3, "Browse...", null);		
			tProviderBrowse3.addSelectionListener(tProviderListener3);
			
			
			// Cuarto grupo de controles, para seleccionar el fichero de salida
			Group tProviderGroup4 = createGroup(modelExtentComp, "Hybrid Model, transformation result", 3);
			TProviderGroupListener tProviderListener4 = new TProviderGroupListener(3);

			createLabel(tProviderGroup4, "Hybrid model URI: ");		
			tProviderTextOUT = createText(tProviderGroup4);		
			tProviderTextOUT.addModifyListener(tProviderListener4);
			
			Button tProviderBrowse4 = createPushButton(tProviderGroup4, "Browse...", null);		
			tProviderBrowse4.addSelectionListener(tProviderListener4);

			sc.setMinSize(modelExtentComp.computeSize(SWT.DEFAULT, SWT.DEFAULT));
		}	

		protected String getAttributeValueFrom (Text text) {
			
			String content = text.getText().trim();
			if (content.length() > 0) {
				return content;
			}
			return null;
		}

		public String getName() {

			return "&Model Extents";
		}
			
		public void initializeFrom(ILaunchConfiguration configuration) {
			try {
				tProviderTextIN.setText(configuration.getAttribute(
						METAGEM2HYBRIDConstants.ATTR_TRANSFORMATION_IN, ""));
			} catch (CoreException ce) {
				tProviderTextIN.setText("");
			}
			try {
				tProviderTextLEFT.setText(configuration.getAttribute(
						METAGEM2HYBRIDConstants.ATTR_TRANSFORMATION_LEFT, ""));
			} catch (CoreException ce) {
				tProviderTextLEFT.setText("");
			}
			try {
				tProviderTextRIGHT.setText(configuration.getAttribute(
						METAGEM2HYBRIDConstants.ATTR_TRANSFORMATION_RIGHT, ""));
			} catch (CoreException ce) {
				tProviderTextIN.setText("");
			}
	
			try {
				tProviderTextOUT.setText(configuration.getAttribute(
						METAGEM2HYBRIDConstants.ATTR_TRANSFORMATION_OUT, ""));
			} catch (CoreException ce) {
				tProviderTextOUT.setText("");
			}
	
		}

		public void performApply(ILaunchConfigurationWorkingCopy configuration) {

			// FIXME Analizar con cuidado si debemos hacer o no los sets de Attributes
			//		Ojo con getAttributeValueFrom 
			String in = getAttributeValueFrom(tProviderTextIN);
			String left = getAttributeValueFrom(tProviderTextLEFT);
			String right = getAttributeValueFrom(tProviderTextRIGHT);
			String out = getAttributeValueFrom(tProviderTextOUT);
			configuration.setAttribute(METAGEM2HYBRIDConstants.ATTR_TRANSFORMATION_IN, in);
			configuration.setAttribute(METAGEM2HYBRIDConstants.ATTR_TRANSFORMATION_LEFT, left);
			configuration.setAttribute(METAGEM2HYBRIDConstants.ATTR_TRANSFORMATION_RIGHT, right);
			configuration.setAttribute(METAGEM2HYBRIDConstants.ATTR_TRANSFORMATION_OUT, out);
		}

		public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		
			configuration.setAttribute(METAGEM2HYBRIDConstants.ATTR_TRANSFORMATION_IN, "");
			configuration.setAttribute(METAGEM2HYBRIDConstants.ATTR_TRANSFORMATION_LEFT, "");
			configuration.setAttribute(METAGEM2HYBRIDConstants.ATTR_TRANSFORMATION_RIGHT, "");
			configuration.setAttribute(METAGEM2HYBRIDConstants.ATTR_TRANSFORMATION_OUT, "");
		}	
		
		
		protected ITreeContentProvider getTreeContentProvider() {
			
			return  new BaseWorkbenchContentProvider();	
		}
		
		protected ILabelProvider getLabelProvider() {
			return new WorkbenchLabelProvider();
		}
		
		
		
		protected void browseForMETAGEMFile(boolean workspace) {
			IPath path = null;
			if (workspace)
				path = browseWorkspace(getMetagemLocation(), true);
			else
				path = browse(getMetagemLocation(), true);
			   if (path == null)
			      return;
			   IPath rootLoc = ResourcesPlugin.getWorkspace()
			       .getRoot().getLocation();
			   if (workspace)
				  path = rootLoc.append(path);
			      
			   tProviderTextIN.setText(path.toString());
			}
	
		protected void browseForDestinationFile(boolean workspace) {
			IPath path = null;
			if (workspace)   
				path = browseWorkspace(getDestinationLocation(), false);
			else
				path = browse(getDestinationLocation(), false);
			if (path == null)
			      return;
			IPath rootLoc = ResourcesPlugin.getWorkspace()
		       .getRoot().getLocation();
		   if (workspace)
			  path = rootLoc.append(path);
		   tProviderTextOUT.setText(path.toString());
			}		

			private IPath browse(IPath path, boolean mustExist) {
			   FileDialog dialog = new FileDialog(getShell(),
			         mustExist ? SWT.OPEN : SWT.SAVE);
			    if (path != null) {
			      if (path.segmentCount() > 1)
			         dialog.setFilterPath(path.removeLastSegments(1)
			               .toOSString());
			      if (path.segmentCount() > 0)
			         dialog.setFileName(path.lastSegment());
			   }
			   String result = dialog.open();
			    if (result == null)
			       return null;
			   return new Path(result);
			}
			private IPath browseWorkspace(IPath path, boolean mustExist) {
				IFile file = null;

				if (mustExist)
				{
					IFile[] files = WorkspaceResourceDialog.openFileSelection(getShell(), null, null, true, null,null);
					
		               if (files.length != 0)
		               {
		                 file = files[0];
		               }
				}
				else
				{
					file = WorkspaceResourceDialog.openNewFile(getShell(), null, null, null, null);
				}

				
				   return file.getFullPath();
				}
			
			public IPath getMetagemLocation() {
			   String text = tProviderTextIN.getText().trim();
			   if (text.length() == 0)
			       return null;
			   IPath path = new Path(text);
			   if (!path.isAbsolute())
			      path = ResourcesPlugin.getWorkspace().getRoot().getLocation()
			             .append(path);
			   return path;
			}
			
			public IPath getLeftLocation() {
				   String text = tProviderTextLEFT.getText().trim();
				   if (text.length() == 0)
				       return null;
				   IPath path = new Path(text);
				   if (!path.isAbsolute())
				      path = ResourcesPlugin.getWorkspace().getRoot().getLocation()
				             .append(path);
				   return path;
				}
			
			public IPath getRightLocation() {
				   String text = tProviderTextRIGHT.getText().trim();
				   if (text.length() == 0)
				       return null;
				   IPath path = new Path(text);
				   if (!path.isAbsolute())
				      path = ResourcesPlugin.getWorkspace().getRoot().getLocation()
				             .append(path);
				   return path;
				}
				
			public IPath getDestinationLocation() {
			   String text = tProviderTextOUT.getText().trim();
			   if (text.length() == 0)
			       return null;
			   IPath path = new Path(text);
			   if (!path.isAbsolute())
			      path = ResourcesPlugin.getWorkspace().getRoot().getLocation()
			             .append(path);
			   return path;
			}			
	}

