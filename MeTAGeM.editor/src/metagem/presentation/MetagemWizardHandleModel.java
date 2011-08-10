package metagem.presentation;

import java.util.ArrayList;

import metagem.presentation.MetagemModelWizard.MetagemModelWizardModelsCreationPage;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ResourceSelectionDialog;


public class MetagemWizardHandleModel extends Dialog {
	
	
	private Text modelNameText;
	private Text pathText;
	private Button firstBrowseButton; 
	private Label firstFileLabel;
	private ArrayList<ModelData> models;
	private MetagemModelWizardModelsCreationPage page;
	private int index_selected=-1;
	private String project;
	
	final int CREATING = 0;
	final int EDITING = 1;
	private int action;

	protected MetagemWizardHandleModel(Shell parentShell, ArrayList<ModelData> models, MetagemModelWizardModelsCreationPage page, String project) {
		super(parentShell);
		this.models = models;
		this.page = page;
		this.project = project;
	}
	
	protected MetagemWizardHandleModel(Shell parentShell,
			ArrayList<ModelData> models,
			MetagemModelWizardModelsCreationPage page, int index_modelData, String project) {
		super(parentShell);
		this.models = models;
		this.page = page;
		this.index_selected=index_modelData;
		this.project = project;
	}

	public Control createDialogArea(Composite parent){
		Composite container = new Composite(parent, SWT.NULL);
		{
			GridLayout layout = new GridLayout();
			layout.numColumns = 3;
			container.setLayout(layout);
		}	
		createDialogComponents(container);
		initControls();
		return parent;
	}
	
	private void initControls() {
		firstFileLabel.setText(MeTAGeMEditorPlugin.INSTANCE.getString("_UI_WizardHandleModelDialog_pathMetamodel"));
		if(index_selected<0){
			action = CREATING;
			modelNameText.setText("");
			pathText.setText("");
		}else{
			action = EDITING;
			ModelData elementSelected = models.get(index_selected);
			modelNameText.setText(elementSelected.getName());
			pathText.setText(elementSelected.getPath());
			
		}
		
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.window.Window#configureShell(org.eclipse.swt.widgets.Shell)
	 */
	public void configureShell(Shell shell){
		super.configureShell(shell);
		shell.setText(MeTAGeMEditorPlugin.INSTANCE.getString("_UI_WizardHandleModelDialog_Title"));
	}

	private void createDialogComponents(Composite parent) {
		Composite composite = new Composite(parent,SWT.BEGINNING);
		{
			GridData gdata = new GridData(GridData.FILL_HORIZONTAL);
			gdata.horizontalSpan=3;
			composite.setLayoutData(gdata);
		}
		{
			GridLayout layout = new GridLayout();
			composite.setLayout(layout);
			layout.numColumns = 4;
			layout.marginWidth = 4;
		}
		
		Label label = new Label(composite, SWT.BEGINNING);
		label.setText(MeTAGeMEditorPlugin.INSTANCE.getString("_UI_WizardHandleModelDialog_labelName"));
		modelNameText = new Text(composite, SWT.BORDER | SWT.SINGLE);
		{
			GridData gd = new GridData(GridData.GRAB_HORIZONTAL);
			gd.widthHint = 200;
			modelNameText.setLayoutData(gd);
		}
		
		modelNameText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				//dialogChanged();
			}
		});
		
		//label = new Label(composite, SWT.BEGINNING);		
		
		// Second Line : metamodel
		firstFileLabel = new Label(parent, SWT.BEGINNING);
		firstFileLabel.setText(MeTAGeMEditorPlugin.INSTANCE.getString("_UI_WizardHandleModelDialog_pathMetamodel"));
		
		pathText = new Text(parent, SWT.BORDER | SWT.SINGLE);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.widthHint = 300;
		pathText.setLayoutData(gd);
		
		pathText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
			}
		});

		firstBrowseButton = new Button(parent, SWT.PUSH);
		firstBrowseButton.setText(MeTAGeMEditorPlugin.INSTANCE.getString("_UI_WizardHandleModelDialog_BrowseMetamodelLabel"));
		firstBrowseButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleWorkspaceFileBrowse(pathText, project);
			}
		});	
		
		
	}
	
	public void okPressed(){
		// Verify they are all not null		
		if (this.verifyData() == false){
			MessageDialog.openWarning(getShell(), 
					"Warning","Some informations are empty");
			return;
		}
		if (action==CREATING){
			ModelData model = new ModelData();
			model.setName(modelNameText.getText());
			model.setPath(pathText.getText());
			models.add(model);
		}else{
			ModelData elementSelected = models.get(index_selected);
			elementSelected.setName(modelNameText.getText());
			elementSelected.setPath(pathText.getText());
		}
		page.rewriteTable();		
		
		// Close dialog
		this.close();
	}
	
	/**
	 * Tests the controls
	 * @return
	 */
	private boolean verifyData() {
		boolean result = true;
		result = result && (pathText.getText() != "");
		result = result && (modelNameText.getText() != "");
		return result;
	}
	
	/*
	 * Shows a dialog to select a file. File path is set on the fileText
	 */
	protected void handleWorkspaceFileBrowse(Text text, String project) {
		ResourceSelectionDialog resourceSelectionDialog;
		resourceSelectionDialog = new ResourceSelectionDialog(
					getShell(),
					ResourcesPlugin.getWorkspace().getRoot()
							.getProject(project),
					MeTAGeMEditorPlugin.INSTANCE
							.getString("_UI_WizardHandleModelDialog_SelectMetaModel"));
		

		String path = text.getText();
		
		if (path != "") {
			ArrayList<IResource> selectedElements = new ArrayList<IResource>();
			selectedElements.add(ResourcesPlugin.getWorkspace().getRoot()
					.findMember(path));
			resourceSelectionDialog
					.setInitialElementSelections(selectedElements);
		}
		resourceSelectionDialog.open();

		if (resourceSelectionDialog.getReturnCode() == ResourceSelectionDialog.OK) {
			Object[] result = resourceSelectionDialog.getResult();
			if (result != null) {
				text.setText(((IFile) result[0]).getFullPath().toString());
			}
		}
	}
	

}
