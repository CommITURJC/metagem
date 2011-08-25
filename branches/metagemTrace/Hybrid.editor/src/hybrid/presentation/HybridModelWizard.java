/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hybrid.presentation;


import hybrid.HybridFactory;
import hybrid.HybridPackage;
import hybrid.SourceModel;
import hybrid.TargetModel;
import hybrid.impl.HybridFactoryImpl;
import hybrid.impl.ModuleImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.ISetSelectionTarget;


/**
 * This is a simple wizard for creating a new model file.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HybridModelWizard extends Wizard implements INewWizard {
	/**
	 * The supported extensions for created files.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<String> FILE_EXTENSIONS =
		Collections.unmodifiableList(Arrays.asList(HybridEditorPlugin.INSTANCE.getString("_UI_HybridEditorFilenameExtensions").split("\\s*,\\s*")));

	/**
	 * A formatted list of supported file extensions, suitable for display.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String FORMATTED_FILE_EXTENSIONS =
		HybridEditorPlugin.INSTANCE.getString("_UI_HybridEditorFilenameExtensions").replaceAll("\\s*,\\s*", ", ");

	/**
	 * This caches an instance of the model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HybridPackage hybridPackage = HybridPackage.eINSTANCE;

	/**
	 * This caches an instance of the model factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HybridFactory hybridFactory = hybridPackage.getHybridFactory();

	/**
	 * This is the file creation page.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HybridModelWizardNewFileCreationPage newFileCreationPage;


	/**
	 * This is the initial object creation page.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NOT generated
	 */
	protected HybridModelWizardModelsCreationPage modelsCreationPage;
	//protected HybridModelWizardInitialObjectCreationPage initialObjectCreationPage;

	/**
	 * Remember the selection during initialization for populating the default container.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IStructuredSelection selection;

	/**
	 * Remember the workbench during initialization.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IWorkbench workbench;

	/**
	 * Caches the names of the types that can be created as the root object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected List<String> initialObjectNames;
	
	protected ArrayList<ModelData> sourceModels;
	protected ArrayList<ModelData> targetModels;

	/**
	 * This just records the information.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NOT generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(HybridEditorPlugin.INSTANCE.getString("_UI_Wizard_label"));
		setDefaultPageImageDescriptor(ExtendedImageRegistry.INSTANCE.getImageDescriptor(HybridEditorPlugin.INSTANCE.getImage("full/wizban/NewHybrid")));
		sourceModels = new ArrayList<ModelData>();
		targetModels = new ArrayList<ModelData>();
	}

	/**
	 * Returns the names of the types that can be created as the root object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<String> getInitialObjectNames() {
		if (initialObjectNames == null) {
			initialObjectNames = new ArrayList<String>();
			for (EClassifier eClassifier : hybridPackage.getEClassifiers()) {
				if (eClassifier instanceof EClass) {
					EClass eClass = (EClass)eClassifier;
					if (!eClass.isAbstract()) {
						initialObjectNames.add(eClass.getName());
					}
				}
			}
			Collections.sort(initialObjectNames, CommonPlugin.INSTANCE.getComparator());
		}
		return initialObjectNames;
	}

	/**
	 * Create a new model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NOT generated
	 */
	protected EObject createInitialModel() {
		EClass eClass = (EClass)hybridPackage.getEClassifier("Module");
		EObject rootObject = hybridFactory.create(eClass);
		return rootObject;
	}

	/**
	 * Do the work after everything is specified.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NOT generated
	 */
	@Override
	public boolean performFinish() {
		try {
			// Remember the file.
			//
			final IFile modelFile = getModelFile();

			// Do the work within an operation.
			//
			WorkspaceModifyOperation operation =
				new WorkspaceModifyOperation() {
					@Override
					protected void execute(IProgressMonitor progressMonitor) {
						try {
							// Create a resource set
							//
							ResourceSet resourceSet = new ResourceSetImpl();

							// Get the URI of the model file.
							//
							URI fileURI = URI.createPlatformResourceURI(modelFile.getFullPath().toString(), true);

							// Create a resource for this file.
							//
							Resource resource = resourceSet.createResource(fileURI);

							// Add the initial model object to the contents.
							//
							EObject rootObject = createInitialModel();
							if (rootObject != null) {
								resource.getContents().add(rootObject);
							}
							
							if(rootObject instanceof ModuleImpl){
								ModuleImpl hybridModel = (ModuleImpl) rootObject;
								HybridFactoryImpl hybridFactory = new HybridFactoryImpl();
								
								//creates source models in the new hybrid model
								for(int c1=0;c1<sourceModels.size();c1++){
									ModelData model = sourceModels.get(c1);
									SourceModel sourceModel = hybridFactory.createSourceModel();
									sourceModel.setName(model.getName());
									sourceModel.setPath(model.getPath());
									sourceModel.setType_mm(model.getType());
									sourceModel.setModule(hybridModel);
									sourceModel.eResource().save(new HashMap<Object, Object>());
								}
								//creates target models in the new hybrid model
								for(int c2=0;c2<targetModels.size();c2++){
									ModelData model = targetModels.get(c2);
									TargetModel targetModel = hybridFactory.createTargetModel();
									targetModel.setName(model.getName());
									targetModel.setPath(model.getPath());
									targetModel.setType_mm(model.getType());
									targetModel.setModule(hybridModel);
									targetModel.eResource().save(new HashMap<Object, Object>());
								}
								
							}
							
							
							// Save the contents of the resource to the file system.
							//
							Map<Object, Object> options = new HashMap<Object, Object>();
							//options.put(XMLResource.OPTION_ENCODING, initialObjectCreationPage.getEncoding());
							resource.save(options);
						}
						catch (Exception exception) {
							HybridEditorPlugin.INSTANCE.log(exception);
						}
						finally {
							progressMonitor.done();
						}
					}
				};

			getContainer().run(false, false, operation);

			// Select the new file resource in the current view.
			//
			IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
			IWorkbenchPage page = workbenchWindow.getActivePage();
			final IWorkbenchPart activePart = page.getActivePart();
			if (activePart instanceof ISetSelectionTarget) {
				final ISelection targetSelection = new StructuredSelection(modelFile);
				getShell().getDisplay().asyncExec
					(new Runnable() {
						 public void run() {
							 ((ISetSelectionTarget)activePart).selectReveal(targetSelection);
						 }
					 });
			}

			// Open an editor on the new file.
			//
			try {
				page.openEditor
					(new FileEditorInput(modelFile),
					 workbench.getEditorRegistry().getDefaultEditor(modelFile.getFullPath().toString()).getId());					 	 
			}
			catch (PartInitException exception) {
				MessageDialog.openError(workbenchWindow.getShell(), HybridEditorPlugin.INSTANCE.getString("_UI_OpenEditorError_label"), exception.getMessage());
				return false;
			}

			return true;
		}
		catch (Exception exception) {
			HybridEditorPlugin.INSTANCE.log(exception);
			return false;
		}
	}

	/**
	 * This is the one page of the wizard.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public class HybridModelWizardNewFileCreationPage extends WizardNewFileCreationPage {
		/**
		 * Pass in the selection.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public HybridModelWizardNewFileCreationPage(String pageId, IStructuredSelection selection) {
			super(pageId, selection);
		}

		/**
		 * The framework calls this to see if the file is correct.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		@Override
		protected boolean validatePage() {
			if (super.validatePage()) {
				String extension = new Path(getFileName()).getFileExtension();
				if (extension == null || !FILE_EXTENSIONS.contains(extension)) {
					String key = FILE_EXTENSIONS.size() > 1 ? "_WARN_FilenameExtensions" : "_WARN_FilenameExtension";
					setErrorMessage(HybridEditorPlugin.INSTANCE.getString(key, new Object [] { FORMATTED_FILE_EXTENSIONS }));
					return false;
				}
				return true;
			}
			return false;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public IFile getModelFile() {
			return ResourcesPlugin.getWorkspace().getRoot().getFile(getContainerFullPath().append(getFileName()));
		}
	}
	
	/**
	 * This is the page where the models are selected.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NOT generated
	 */
	public  class HybridModelWizardModelsCreationPage extends WizardPage {

		private Button addSourceModel;
		private Button editSourceModel;
		private Button removeSourceModel;
		private Button addTargetModel;
		private Button editTargetModel;
		private Button removeTargetModel;
		private Table modelSourceTable;
		private Table modelTargetTable;
		private ArrayList<ModelData> sourceModels;
		private ArrayList<ModelData> targetModels;
		
		protected HybridModelWizardModelsCreationPage(
				String pageName, ArrayList<ModelData> sourceModels, ArrayList<ModelData> targetModels) {
			super(pageName);
			this.sourceModels=sourceModels;
			this.targetModels=targetModels;
		}
		
		@Override
		public void createControl(Composite parent) {
			Composite composite = new Composite(parent, SWT.NULL); {
				GridLayout layout = new GridLayout();
				layout.numColumns = 3;
				composite.setLayout(layout);

				GridData data = new GridData();
				data.verticalAlignment = GridData.FILL;
				data.grabExcessVerticalSpace = true;
				data.horizontalAlignment = GridData.FILL;
				composite.setLayoutData(data);
			}
			
			Label containerLabel = new Label(composite, SWT.LEFT);
			{
				containerLabel.setText(HybridEditorPlugin.INSTANCE.getString("_UI_SourceModels"));
				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				data.horizontalSpan = 3;
				containerLabel.setLayoutData(data);
			}
			modelSourceTable = new Table(composite, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL |SWT.FULL_SELECTION );
			{
				GridData data = new GridData();
				data.verticalAlignment = GridData.FILL;
				data.grabExcessHorizontalSpace = true;
				data.grabExcessVerticalSpace = true;
				data.horizontalAlignment = GridData.FILL;
				data.horizontalSpan = 3;
				data.heightHint = 100;
				data.widthHint = 250;
				modelSourceTable.setLayoutData(data);
			}
			modelSourceTable.setHeaderVisible(true);
			modelSourceTable.setLinesVisible(true);
			{

				TableColumn modelColumn = new TableColumn(modelSourceTable,
						SWT.NONE);
				modelColumn.setWidth(100);
				modelColumn.setText("Model");
				modelColumn.setResizable(true);
				
				TableColumn typeColumn = new TableColumn(modelSourceTable,
						SWT.NONE);
				typeColumn.setWidth(100);
				typeColumn.setText("Type");
				typeColumn.setResizable(true);

				TableColumn pathColumn = new TableColumn(modelSourceTable, SWT.NONE);
				pathColumn.setText("Path");
				pathColumn.setWidth(268);
				pathColumn.setResizable(true);
			}
			modelSourceTable.addSelectionListener(new SelectionAdapter() {
				public void widgetSelected(SelectionEvent e) {
					editSourceModel.setEnabled(true);
					removeSourceModel.setEnabled(true);
				}
			});
			addSourceModel = new Button(composite,SWT.PUSH);
			addSourceModel.setText(HybridEditorPlugin.INSTANCE.getString("_UI_AddModel"));
			addSourceModel.addSelectionListener(new SelectionAdapter() {
				public void widgetSelected(SelectionEvent e) {
					HybridWizardHandleModel dialogModel=new HybridWizardHandleModel(getShell(),sourceModels,getCreationPage(),getModelFile().getParent().getName());
					dialogModel.open();
					setPageComplete(validatePage());
				}
			});
			
			editSourceModel = new Button(composite,SWT.PUSH);
			editSourceModel.setText(HybridEditorPlugin.INSTANCE.getString("_UI_EditModel"));
			editSourceModel.addSelectionListener(new SelectionAdapter() {
				public void widgetSelected(SelectionEvent e) {
					int index = modelSourceTable.getSelectionIndex();
					if(index>-1){
						HybridWizardHandleModel dialogModel=new HybridWizardHandleModel(getShell(),sourceModels,getCreationPage(),index, getModelFile().getParent().getName());
						dialogModel.open();
					}
					setPageComplete(validatePage());
				}
			});
			editSourceModel.setEnabled(false);
			
			removeSourceModel = new Button(composite,SWT.PUSH);
			removeSourceModel.setText(HybridEditorPlugin.INSTANCE.getString("_UI_RemoveModel"));
			removeSourceModel.addSelectionListener(new SelectionAdapter() {
				public void widgetSelected(SelectionEvent e) {
					int index = modelSourceTable.getSelectionIndex();
					if(index>-1){
						sourceModels.remove(index);
					}
					if(sourceModels.size()==0){
						editSourceModel.setEnabled(false);
						removeSourceModel.setEnabled(false);
					}
					rewriteTable();
					setPageComplete(validatePage());
				}
			});
			removeSourceModel.setEnabled(false);
			
			
			Label separator = new Label (composite, SWT.SEPARATOR | SWT.HORIZONTAL);
			{	GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				data.horizontalSpan = 3;
				data.verticalSpan = 5;
				separator.setLayoutData(data);
			}
			
			
			Label containerLabel2 = new Label(composite, SWT.LEFT);
			{
				containerLabel2.setText(HybridEditorPlugin.INSTANCE.getString("_UI_TargetModels"));
				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				data.horizontalSpan = 3;
				containerLabel.setLayoutData(data);
			}

			modelTargetTable = new Table(composite, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL |SWT.FULL_SELECTION );
			{
				GridData data = new GridData();
				data.verticalAlignment = GridData.FILL;
				data.grabExcessHorizontalSpace = true;
				data.grabExcessVerticalSpace = true;
				data.horizontalAlignment = GridData.FILL;
				data.horizontalSpan = 3;
				data.heightHint = 100;
				data.widthHint = 250;
				modelTargetTable.setLayoutData(data);
			}
			modelTargetTable.setHeaderVisible(true);
			modelTargetTable.setLinesVisible(true);
			{

				TableColumn modelColumn = new TableColumn(modelTargetTable,
						SWT.NONE);
				modelColumn.setWidth(100);
				modelColumn.setText("Model");
				modelColumn.setResizable(true);
				
				TableColumn typeColumn = new TableColumn(modelTargetTable,
						SWT.NONE);
				typeColumn.setWidth(100);
				typeColumn.setText("Type");
				typeColumn.setResizable(true);

				TableColumn pathColumn = new TableColumn(modelTargetTable, SWT.NONE);
				pathColumn.setText("Path");
				pathColumn.setWidth(268);
				pathColumn.setResizable(true);
				
			}
			modelTargetTable.addSelectionListener(new SelectionAdapter() {
				public void widgetSelected(SelectionEvent e) {
					editTargetModel.setEnabled(true);
					removeTargetModel.setEnabled(true);
				}
			});
			
			
			
			addTargetModel = new Button(composite,SWT.PUSH);
			addTargetModel.setText(HybridEditorPlugin.INSTANCE.getString("_UI_AddModel"));
			addTargetModel.addSelectionListener(new SelectionAdapter() {
				public void widgetSelected(SelectionEvent e) {
					HybridWizardHandleModel dialogModel=new HybridWizardHandleModel(getShell(),targetModels,getCreationPage(),getModelFile().getParent().getName());
					dialogModel.open();
					setPageComplete(validatePage());
				}
			});
			
			editTargetModel = new Button(composite,SWT.PUSH);
			editTargetModel.setText(HybridEditorPlugin.INSTANCE.getString("_UI_EditModel"));
			editTargetModel.addSelectionListener(new SelectionAdapter() {
				public void widgetSelected(SelectionEvent e) {
					int index = modelTargetTable.getSelectionIndex();
					if(index>-1){
						HybridWizardHandleModel dialogModel=new HybridWizardHandleModel(getShell(),targetModels,getCreationPage(),index, getModelFile().getParent().getName());
						dialogModel.open();
					}
					setPageComplete(validatePage());
				}
			});
			editTargetModel.setEnabled(false);
			
			removeTargetModel = new Button(composite,SWT.PUSH);
			removeTargetModel.setText(HybridEditorPlugin.INSTANCE.getString("_UI_RemoveModel"));
			removeTargetModel.addSelectionListener(new SelectionAdapter() {
				public void widgetSelected(SelectionEvent e) {
					int index = modelTargetTable.getSelectionIndex();
					if(index>-1){
						targetModels.remove(index);
					}
					if(targetModels.size()==0){
						editTargetModel.setEnabled(false);
						removeTargetModel.setEnabled(false);
					}
					rewriteTable();
					setPageComplete(validatePage());
				}
			});
			removeTargetModel.setEnabled(false);
			
			rewriteTable();
			setPageComplete(validatePage());
			setControl(composite);
		}
		
		private HybridModelWizardModelsCreationPage getCreationPage(){
			return this;
		}
		
		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @NOT generated
		 */
		protected boolean validatePage() {
			if((sourceModels.size()>0)&&(targetModels.size()>0)){
				return true;
			}else{
				return false;
			}
		}
		
		protected void rewriteTable(){
			modelSourceTable.removeAll();
			for(int cont1=0;cont1<sourceModels.size();cont1++){
				TableItem item = new TableItem(modelSourceTable,SWT.NONE);
				item.setText(0,sourceModels.get(cont1).getName());
				item.setText(1,sourceModels.get(cont1).getType());
				item.setText(2,sourceModels.get(cont1).getPath());
			}
			
			modelTargetTable.removeAll();
			for(int cont1=0;cont1<targetModels.size();cont1++){
				TableItem item = new TableItem(modelTargetTable,SWT.NONE);
				item.setText(0,targetModels.get(cont1).getName());
				item.setText(1,targetModels.get(cont1).getType());
				item.setText(2,targetModels.get(cont1).getPath());
			}
		}
		
		
	}

	/**
	 * The framework calls this to create the contents of the wizard.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
		@Override
	public void addPages() {
		// Create a page, set the title, and the initial model file name.
		//
		newFileCreationPage = new HybridModelWizardNewFileCreationPage("Whatever", selection);
		newFileCreationPage.setTitle(HybridEditorPlugin.INSTANCE.getString("_UI_HybridModelWizard_label"));
		newFileCreationPage.setDescription(HybridEditorPlugin.INSTANCE.getString("_UI_HybridModelWizard_description"));
		newFileCreationPage.setFileName(HybridEditorPlugin.INSTANCE.getString("_UI_HybridEditorFilenameDefaultBase") + "." + FILE_EXTENSIONS.get(0));
		addPage(newFileCreationPage);

		// Try and get the resource selection to determine a current directory for the file dialog.
		//
		if (selection != null && !selection.isEmpty()) {
			// Get the resource...
			//
			Object selectedElement = selection.iterator().next();
			if (selectedElement instanceof IResource) {
				// Get the resource parent, if its a file.
				//
				IResource selectedResource = (IResource)selectedElement;
				if (selectedResource.getType() == IResource.FILE) {
					selectedResource = selectedResource.getParent();
				}

				// This gives us a directory...
				//
				if (selectedResource instanceof IFolder || selectedResource instanceof IProject) {
					// Set this for the container.
					//
					newFileCreationPage.setContainerFullPath(selectedResource.getFullPath());

					// Make up a unique new name here.
					//
					String defaultModelBaseFilename = HybridEditorPlugin.INSTANCE.getString("_UI_HybridEditorFilenameDefaultBase");
					String defaultModelFilenameExtension = FILE_EXTENSIONS.get(0);
					String modelFilename = defaultModelBaseFilename + "." + defaultModelFilenameExtension;
					for (int i = 1; ((IContainer)selectedResource).findMember(modelFilename) != null; ++i) {
						modelFilename = defaultModelBaseFilename + i + "." + defaultModelFilenameExtension;
					}
					newFileCreationPage.setFileName(modelFilename);
				}
			}
		}
		
		modelsCreationPage = new HybridModelWizardModelsCreationPage("Models",sourceModels,targetModels);
		modelsCreationPage.setTitle(HybridEditorPlugin.INSTANCE.getString("_UI_HybridModelWizard_label"));
		modelsCreationPage.setDescription(HybridEditorPlugin.INSTANCE.getString("_UI_HybridModelWizard_description"));
		addPage(modelsCreationPage);
		
	}

	/**
	 * Get the file from the page.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFile getModelFile() {
		return newFileCreationPage.getModelFile();
	}

}
