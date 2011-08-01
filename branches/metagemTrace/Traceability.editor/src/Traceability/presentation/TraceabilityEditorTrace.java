/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Traceability.presentation;


import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EventObject;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.ui.MarkerHelper;
import org.eclipse.emf.common.ui.ViewerPane;
import org.eclipse.emf.common.ui.editor.ProblemEditorPart;
import org.eclipse.emf.common.ui.viewer.IViewerProvider;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.provider.AdapterFactoryItemDelegator;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.action.EditingDomainActionBarContributor;
import org.eclipse.emf.edit.ui.celleditor.AdapterFactoryTreeEditor;
import org.eclipse.emf.edit.ui.dnd.LocalTransfer;
import org.eclipse.emf.edit.ui.dnd.ViewerDragAdapter;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.edit.ui.provider.UnwrappingSelectionProvider;
import org.eclipse.emf.edit.ui.util.EditUIMarkerHelper;
import org.eclipse.emf.edit.ui.util.EditUIUtil;
import org.eclipse.emf.edit.ui.view.ExtendedPropertySheetPage;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.dialogs.SaveAsDialog;
import org.eclipse.ui.ide.IGotoMarker;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.MultiPageEditorPart;
import org.eclipse.ui.views.contentoutline.ContentOutline;
import org.eclipse.ui.views.contentoutline.ContentOutlinePage;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.PropertySheet;
import org.eclipse.ui.views.properties.PropertySheetPage;

import Traceability.TraceElement;
import Traceability.TraceLink;
import Traceability.impl.SourceElementImpl;
import Traceability.impl.SourceModelImpl;
import Traceability.impl.TargetElementImpl;
import Traceability.impl.TargetModelImpl;
import Traceability.impl.TraceLinkImpl;
import Traceability.provider.TraceabilityItemProviderAdapterFactoryTrace;


/**
 * This is an example of a Traceability model editor.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TraceabilityEditorTrace
	extends MultiPageEditorPart
	implements IEditingDomainProvider, ISelectionProvider, IMenuListener, IViewerProvider, IGotoMarker {
	/**
	 * This keeps track of the editing domain that is used to track all changes to the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdapterFactoryEditingDomain editingDomain;
	protected ResourceSet sourceRs;
	protected ResourceSet targetRs;
	
	/**
	 * This is the viewer that shadows the selection in the content outline.
	 * The parent relation must be correctly defined for this to work.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NOT generated
	 */
	protected TreeViewer sourceViewer;
	protected TreeViewer traceabilityViewer;
	protected TreeViewer targetViewer;

	/**
	 * This is the one adapter factory used for providing views of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory adapterFactory;

	/**
	 * This is the content outline page.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IContentOutlinePage contentOutlinePage;

	/**
	 * This is a kludge...
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IStatusLineManager contentOutlineStatusLineManager;

	/**
	 * This is the content outline page's viewer.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TreeViewer contentOutlineViewer;

	/**
	 * This is the property sheet page.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertySheetPage propertySheetPage;


	/**
	 * This keeps track of the active viewer pane, in the book.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewerPane currentViewerPane;

	/**
	 * This keeps track of the active content viewer, which may be either one of the viewers in the pages or the content outline viewer.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Viewer currentViewer;

	/**
	 * This listens to which ever viewer is active.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISelectionChangedListener selectionChangedListener;

	/**
	 * This keeps track of all the {@link org.eclipse.jface.viewers.ISelectionChangedListener}s that are listening to this editor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<ISelectionChangedListener> selectionChangedListeners = new ArrayList<ISelectionChangedListener>();

	/**
	 * This keeps track of the selection of the editor as a whole.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISelection editorSelection = StructuredSelection.EMPTY;

	/**
	 * The MarkerHelper is responsible for creating workspace resource markers presented
	 * in Eclipse's Problems View.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MarkerHelper markerHelper = new EditUIMarkerHelper();

	/**
	 * This listens for when the outline becomes active
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IPartListener partListener =
		new IPartListener() {
			public void partActivated(IWorkbenchPart p) {
				if (p instanceof ContentOutline) {
					if (((ContentOutline)p).getCurrentPage() == contentOutlinePage) {
						getActionBarContributor().setActiveEditor(TraceabilityEditorTrace.this);

						setCurrentViewer(contentOutlineViewer);
					}
				}
				else if (p instanceof PropertySheet) {
					if (((PropertySheet)p).getCurrentPage() == propertySheetPage) {
						getActionBarContributor().setActiveEditor(TraceabilityEditorTrace.this);
						handleActivate();
					}
				}
				else if (p == TraceabilityEditorTrace.this) {
					handleActivate();
				}
			}
			public void partBroughtToTop(IWorkbenchPart p) {
				// Ignore.
			}
			public void partClosed(IWorkbenchPart p) {
				// Ignore.
			}
			public void partDeactivated(IWorkbenchPart p) {
				// Ignore.
			}
			public void partOpened(IWorkbenchPart p) {
				// Ignore.
			}
		};

	/**
	 * Resources that have been removed since last activation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Resource> removedResources = new ArrayList<Resource>();

	/**
	 * Resources that have been changed since last activation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Resource> changedResources = new ArrayList<Resource>();

	/**
	 * Resources that have been saved.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Resource> savedResources = new ArrayList<Resource>();

	/**
	 * Map to store the diagnostic associated with a resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map<Resource, Diagnostic> resourceToDiagnosticMap = new LinkedHashMap<Resource, Diagnostic>();

	/**
	 * Controls whether the problem indication should be updated.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected boolean updateProblemIndication = true;

	/**
	 * Adapter used to update the problem indication when resources are demanded loaded.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EContentAdapter problemIndicationAdapter = 
		new EContentAdapter() {
			@Override
			public void notifyChanged(Notification notification) {
				if (notification.getNotifier() instanceof Resource) {
					switch (notification.getFeatureID(Resource.class)) {
						case Resource.RESOURCE__IS_LOADED:
						case Resource.RESOURCE__ERRORS:
						case Resource.RESOURCE__WARNINGS: {
							Resource resource = (Resource)notification.getNotifier();
							Diagnostic diagnostic = analyzeResourceProblems(resource, null);
							if (diagnostic.getSeverity() != Diagnostic.OK) {
								resourceToDiagnosticMap.put(resource, diagnostic);
							}
							else {
								resourceToDiagnosticMap.remove(resource);
							}

							if (updateProblemIndication) {
								getSite().getShell().getDisplay().asyncExec
									(new Runnable() {
										 public void run() {
											 updateProblemIndication();
										 }
									 });
							}
							break;
						}
					}
				}
				else {
					super.notifyChanged(notification);
				}
			}

			@Override
			protected void setTarget(Resource target) {
				basicSetTarget(target);
			}

			@Override
			protected void unsetTarget(Resource target) {
				basicUnsetTarget(target);
			}
		};

	/**
	 * This listens for workspace changes.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IResourceChangeListener resourceChangeListener =
		new IResourceChangeListener() {
			public void resourceChanged(IResourceChangeEvent event) {
				IResourceDelta delta = event.getDelta();
				try {
					class ResourceDeltaVisitor implements IResourceDeltaVisitor {
						protected ResourceSet resourceSet = editingDomain.getResourceSet();
						protected Collection<Resource> changedResources = new ArrayList<Resource>();
						protected Collection<Resource> removedResources = new ArrayList<Resource>();

						public boolean visit(IResourceDelta delta) {
							if (delta.getResource().getType() == IResource.FILE) {
								if (delta.getKind() == IResourceDelta.REMOVED ||
								    delta.getKind() == IResourceDelta.CHANGED && delta.getFlags() != IResourceDelta.MARKERS) {
									Resource resource = resourceSet.getResource(URI.createPlatformResourceURI(delta.getFullPath().toString(), true), false);
									if (resource != null) {
										if (delta.getKind() == IResourceDelta.REMOVED) {
											removedResources.add(resource);
										}
										else if (!savedResources.remove(resource)) {
											changedResources.add(resource);
										}
									}
								}
							}

							return true;
						}

						public Collection<Resource> getChangedResources() {
							return changedResources;
						}

						public Collection<Resource> getRemovedResources() {
							return removedResources;
						}
					}

					final ResourceDeltaVisitor visitor = new ResourceDeltaVisitor();
					delta.accept(visitor);

					if (!visitor.getRemovedResources().isEmpty()) {
						getSite().getShell().getDisplay().asyncExec
							(new Runnable() {
								 public void run() {
									 removedResources.addAll(visitor.getRemovedResources());
									 if (!isDirty()) {
										 getSite().getPage().closeEditor(TraceabilityEditorTrace.this, false);
									 }
								 }
							 });
					}

					if (!visitor.getChangedResources().isEmpty()) {
						getSite().getShell().getDisplay().asyncExec
							(new Runnable() {
								 public void run() {
									 changedResources.addAll(visitor.getChangedResources());
									 if (getSite().getPage().getActiveEditor() == TraceabilityEditorTrace.this) {
										 handleActivate();
									 }
								 }
							 });
					}
				}
				catch (CoreException exception) {
					TraceabilityEditorPlugin.INSTANCE.log(exception);
				}
			}
		};


	/**
	 * Handles activation of the editor or it's associated views.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void handleActivate() {
		// Recompute the read only state.
		//
		if (editingDomain.getResourceToReadOnlyMap() != null) {
		  editingDomain.getResourceToReadOnlyMap().clear();

		  // Refresh any actions that may become enabled or disabled.
		  //
		  setSelection(getSelection());
		}

		if (!removedResources.isEmpty()) {
			if (handleDirtyConflict()) {
				getSite().getPage().closeEditor(TraceabilityEditorTrace.this, false);
			}
			else {
				removedResources.clear();
				changedResources.clear();
				savedResources.clear();
			}
		}
		else if (!changedResources.isEmpty()) {
			changedResources.removeAll(savedResources);
			handleChangedResources();
			changedResources.clear();
			savedResources.clear();
		}
	}

	/**
	 * Handles what to do with changed resources on activation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void handleChangedResources() {
		if (!changedResources.isEmpty() && (!isDirty() || handleDirtyConflict())) {
			if (isDirty()) {
				changedResources.addAll(editingDomain.getResourceSet().getResources());
			}
			editingDomain.getCommandStack().flush();

			updateProblemIndication = false;
			for (Resource resource : changedResources) {
				if (resource.isLoaded()) {
					resource.unload();
					try {
						resource.load(Collections.EMPTY_MAP);
					}
					catch (IOException exception) {
						if (!resourceToDiagnosticMap.containsKey(resource)) {
							resourceToDiagnosticMap.put(resource, analyzeResourceProblems(resource, exception));
						}
					}
				}
			}

			if (AdapterFactoryEditingDomain.isStale(editorSelection)) {
				setSelection(StructuredSelection.EMPTY);
			}

			updateProblemIndication = true;
			updateProblemIndication();
		}
	}
  
	/**
	 * Updates the problems indication with the information described in the specified diagnostic.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void updateProblemIndication() {
		if (updateProblemIndication) {
			BasicDiagnostic diagnostic =
				new BasicDiagnostic
					(Diagnostic.OK,
					 "Traceability.editor",
					 0,
					 null,
					 new Object [] { editingDomain.getResourceSet() });
			for (Diagnostic childDiagnostic : resourceToDiagnosticMap.values()) {
				if (childDiagnostic.getSeverity() != Diagnostic.OK) {
					diagnostic.add(childDiagnostic);
				}
			}

			int lastEditorPage = getPageCount() - 1;
			if (lastEditorPage >= 0 && getEditor(lastEditorPage) instanceof ProblemEditorPart) {
				((ProblemEditorPart)getEditor(lastEditorPage)).setDiagnostic(diagnostic);
				if (diagnostic.getSeverity() != Diagnostic.OK) {
					setActivePage(lastEditorPage);
				}
			}
			else if (diagnostic.getSeverity() != Diagnostic.OK) {
				ProblemEditorPart problemEditorPart = new ProblemEditorPart();
				problemEditorPart.setDiagnostic(diagnostic);
				problemEditorPart.setMarkerHelper(markerHelper);
				try {
					addPage(++lastEditorPage, problemEditorPart, getEditorInput());
					setPageText(lastEditorPage, problemEditorPart.getPartName());
					setActivePage(lastEditorPage);
					showTabs();
				}
				catch (PartInitException exception) {
					TraceabilityEditorPlugin.INSTANCE.log(exception);
				}
			}

			if (markerHelper.hasMarkers(editingDomain.getResourceSet())) {
				markerHelper.deleteMarkers(editingDomain.getResourceSet());
				if (diagnostic.getSeverity() != Diagnostic.OK) {
					try {
						markerHelper.createMarkers(diagnostic);
					}
					catch (CoreException exception) {
						TraceabilityEditorPlugin.INSTANCE.log(exception);
					}
				}
			}
		}
	}

	/**
	 * Shows a dialog that asks if conflicting changes should be discarded.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected boolean handleDirtyConflict() {
		return
			MessageDialog.openQuestion
				(getSite().getShell(),
				 getString("_UI_FileConflict_label"),
				 getString("_WARN_FileConflict"));
	}

	/**
	 * This creates a model editor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceabilityEditorTrace() {
		super();
		initializeEditingDomain();
	}

	/**
	 * This sets up the editing domain for the model editor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NOT generated
	 */
	protected void initializeEditingDomain() {
		// Create an adapter factory that yields item providers.
		//
		adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

		adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new TraceabilityItemProviderAdapterFactoryTrace());
		adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());

		// Create the command stack that will notify this editor as commands are executed.
		//
		BasicCommandStack commandStack = new BasicCommandStack();

		// Add a listener to set the most recent command's affected objects to be the selection of the viewer with focus.
		//
		commandStack.addCommandStackListener
			(new CommandStackListener() {
				 public void commandStackChanged(final EventObject event) {
					 getContainer().getDisplay().asyncExec
						 (new Runnable() {
							  public void run() {
								  firePropertyChange(IEditorPart.PROP_DIRTY);

								  // Try to select the affected objects.
								  //
								  Command mostRecentCommand = ((CommandStack)event.getSource()).getMostRecentCommand();
								  if (mostRecentCommand != null) {
									  setSelectionToViewer(mostRecentCommand.getAffectedObjects());
								  }
								  if (propertySheetPage != null && !propertySheetPage.getControl().isDisposed()) {
									  propertySheetPage.refresh();
								  }
							  }
						  });
				 }
			 });

		// Create the editing domain with a special command stack.
		//
		editingDomain = new AdapterFactoryEditingDomain(adapterFactory, commandStack, new HashMap<Resource, Boolean>());
	}

	/**
	 * This is here for the listener to be able to call it.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
			@Override
	protected void firePropertyChange(int action) {
		super.firePropertyChange(action);
	}

	/**
	 * This sets the selection into whichever viewer is active.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectionToViewer(Collection<?> collection) {
		final Collection<?> theSelection = collection;
		// Make sure it's okay.
		//
		if (theSelection != null && !theSelection.isEmpty()) {
			Runnable runnable =
				new Runnable() {
					public void run() {
						// Try to select the items in the current content viewer of the editor.
						//
						if (currentViewer != null) {
							currentViewer.setSelection(new StructuredSelection(theSelection.toArray()), true);
						}
					}
				};
			getSite().getShell().getDisplay().asyncExec(runnable);
		}
	}

	/**
	 * This returns the editing domain as required by the {@link IEditingDomainProvider} interface.
	 * This is important for implementing the static methods of {@link AdapterFactoryEditingDomain}
	 * and for supporting {@link org.eclipse.emf.edit.ui.action.CommandAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditingDomain getEditingDomain() {
		return editingDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public class ReverseAdapterFactoryContentProvider extends AdapterFactoryContentProvider {
		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public ReverseAdapterFactoryContentProvider(AdapterFactory adapterFactory) {
			super(adapterFactory);
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		@Override
		public Object [] getElements(Object object) {
			Object parent = super.getParent(object);
			return (parent == null ? Collections.EMPTY_SET : Collections.singleton(parent)).toArray();
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		@Override
		public Object [] getChildren(Object object) {
			Object parent = super.getParent(object);
			return (parent == null ? Collections.EMPTY_SET : Collections.singleton(parent)).toArray();
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		@Override
		public boolean hasChildren(Object object) {
			Object parent = super.getParent(object);
			return parent != null;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		@Override
		public Object getParent(Object object) {
			return null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentViewerPane(ViewerPane viewerPane) {
		if (currentViewerPane != viewerPane) {
			if (currentViewerPane != null) {
				currentViewerPane.showFocus(false);
			}
			currentViewerPane = viewerPane;
		}
		setCurrentViewer(currentViewerPane.getViewer());
	}

	/**
	 * This makes sure that one content viewer, either for the current page or the outline view, if it has focus,
	 * is the current one.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentViewer(Viewer viewer) {
		// If it is changing...
		//
		if (currentViewer != viewer) {
			if (selectionChangedListener == null) {
				// Create the listener on demand.
				//
				selectionChangedListener =
					new ISelectionChangedListener() {
						// This just notifies those things that are affected by the section.
						//
						public void selectionChanged(SelectionChangedEvent selectionChangedEvent) {
							setSelection(selectionChangedEvent.getSelection());
						}
					};
			}

			// Stop listening to the old one.
			//
			if (currentViewer != null) {
				currentViewer.removeSelectionChangedListener(selectionChangedListener);
			}

			// Start listening to the new one.
			//
			if (viewer != null) {
				viewer.addSelectionChangedListener(selectionChangedListener);
			}

			// Remember it.
			//
			currentViewer = viewer;

			// Set the editors selection based on the current viewer's selection.
			//
			setSelection(currentViewer == null ? StructuredSelection.EMPTY : currentViewer.getSelection());
		}
	}

	/**
	 * This returns the viewer as required by the {@link IViewerProvider} interface.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Viewer getViewer() {
		return currentViewer;
	}

	/**
	 * This creates a context menu for the viewer and adds a listener as well registering the menu for extension.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NOT generated
	 */
	protected void createContextMenuFor(StructuredViewer viewer) {
		MenuManager contextMenu = new MenuManager("#PopUp");
		contextMenu.add(new Separator("additions"));
		contextMenu.setRemoveAllWhenShown(true);
		contextMenu.addMenuListener(this);
		Menu menu= contextMenu.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		getSite().registerContextMenu(contextMenu, new UnwrappingSelectionProvider(viewer));
	}

	/**
	 * This is the method called to load a resource into the editing domain's resource set based on the editor's input.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createModel() {
		URI resourceURI = EditUIUtil.getURI(getEditorInput());
		Exception exception = null;
		Resource resource = null;
		try {
			// Load the resource through the editing domain.
			//
			resource = editingDomain.getResourceSet().getResource(resourceURI, true);
		}
		catch (Exception e) {
			exception = e;
			resource = editingDomain.getResourceSet().getResource(resourceURI, false);
		}

		Diagnostic diagnostic = analyzeResourceProblems(resource, exception);
		if (diagnostic.getSeverity() != Diagnostic.OK) {
			resourceToDiagnosticMap.put(resource,  analyzeResourceProblems(resource, exception));
		}
		editingDomain.getResourceSet().eAdapters().add(problemIndicationAdapter);
	}

	/**
	 * Returns a diagnostic describing the errors and warnings listed in the resource
	 * and the specified exception (if any).
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagnostic analyzeResourceProblems(Resource resource, Exception exception) {
		if (!resource.getErrors().isEmpty() || !resource.getWarnings().isEmpty()) {
			BasicDiagnostic basicDiagnostic =
				new BasicDiagnostic
					(Diagnostic.ERROR,
					 "Traceability.editor",
					 0,
					 getString("_UI_CreateModelError_message", resource.getURI()),
					 new Object [] { exception == null ? (Object)resource : exception });
			basicDiagnostic.merge(EcoreUtil.computeDiagnostic(resource, true));
			return basicDiagnostic;
		}
		else if (exception != null) {
			return
				new BasicDiagnostic
					(Diagnostic.ERROR,
					 "Traceability.editor",
					 0,
					 getString("_UI_CreateModelError_message", resource.getURI()),
					 new Object[] { exception });
		}
		else {
			return Diagnostic.OK_INSTANCE;
		}
	}

	/**
	 * This is the method used by the framework to install your own controls.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NOT generated
	 */
	@Override
	public void createPages() {
		// Creates the model from the editor input
		//
		createModel();
		
		Composite container = getContainer();
		final SashForm topSashForm = new SashForm(container,SWT.HORIZONTAL);

		// Only creates the other pages if there is something that can be edited
		//
		if (!getEditingDomain().getResourceSet().getResources().isEmpty()) {
			ArrayList<SourceModelImpl> sources = Actions.getSourceModels(getEditingDomain());
			ArrayList<TargetModelImpl> targets = Actions.getTargetModels(getEditingDomain());	
			
			// Create view for sources models.	
			ViewerPane viewerPane = new ViewerPane(getSite().getPage(),
					TraceabilityEditorTrace.this)
			{
				@Override
				public Viewer createViewer(Composite composite) {
					Tree tree = new Tree(composite, SWT.MULTI);
					TreeViewer newTreeViewer = new TreeViewer(tree);
					return newTreeViewer;
				}

				@Override
				public void requestActivation() {
					super.requestActivation();
					setCurrentViewerPane(this);
				}
			};
			viewerPane.createControl(topSashForm);			
			sourceViewer=(TreeViewer)viewerPane.getViewer();
			sourceViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
			sourceViewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
			Transfer[] transfers = new Transfer[] { LocalTransfer.getInstance() };	
			sourceViewer.addDragSupport(DND.DROP_LINK , transfers, new ViewerDragAdapter(sourceViewer));
			ArrayList<String> paths_source=new ArrayList<String>();
			for(int i=0;i<sources.size();i++){
				if (sources.get(i).getMetamodel() != null) { //If metamodel attribute is not null
					if (!sources.get(i).getMetamodel().equals("")) { //If metamodel is not empty 
						Actions.registerMetamodel(sources.get(i).getMetamodel()); 
					}
				}
				paths_source.add(sources.get(i).getPath());
			}
			sourceRs= Actions.createResourceSet(paths_source);
			sourceViewer.setInput(sourceRs);
			sourceViewer.setSelection(new StructuredSelection(sourceRs.getResources().get(0)), true);
			
			
			viewerPane.setTitle("Source Models");
			sourceViewer.addSelectionChangedListener
			(new ISelectionChangedListener() {
				 // This ensures that we handle selections correctly.
				 //
				 public void selectionChanged(SelectionChangedEvent event) {
					 handleContentSourceSelection(event.getSelection());
				 }
			 });
			
			new AdapterFactoryTreeEditor(sourceViewer.getTree(), adapterFactory);

			//To show the contextual menu (disabled for input and output models)
			//createContextMenuFor(inputViewer.get(i));
			
			//View for traceability model
			{
			ViewerPane viewerPane2 = new ViewerPane(getSite().getPage(),
					TraceabilityEditorTrace.this) {
				@Override
				public Viewer createViewer(Composite composite) {
					Tree tree = new Tree(composite, SWT.MULTI);
					TreeViewer newTreeViewer = new TreeViewer(tree);
					return newTreeViewer;
				}
				
				@Override
				public void requestActivation() {
					super.requestActivation();
					setCurrentViewerPane(this);
				}
			};
			viewerPane2.createControl(topSashForm);	
			traceabilityViewer = (TreeViewer) viewerPane2.getViewer();
			traceabilityViewer.addDragSupport(DND.DROP_COPY | DND.DROP_LINK, transfers, new ViewerDragAdapter(traceabilityViewer));
			traceabilityViewer
					.setContentProvider(new AdapterFactoryContentProvider(
							adapterFactory));

			traceabilityViewer
					.setLabelProvider(new AdapterFactoryLabelProvider(
							adapterFactory));
			traceabilityViewer.setInput(editingDomain.getResourceSet());
			traceabilityViewer
					.setSelection(new StructuredSelection(editingDomain
							.getResourceSet().getResources().get(0)), true);
			viewerPane2.setTitle("Traceability Model",Actions.getImage("TraceModel"));
			traceabilityViewer.addSelectionChangedListener
			(new ISelectionChangedListener() {
				 // This ensures that we handle selections correctly.
				 //
				 public void selectionChanged(SelectionChangedEvent event) {
					 handleContentTraceabilitySelection(event.getSelection());
				 }
			 });	

			new AdapterFactoryTreeEditor(traceabilityViewer.getTree(),adapterFactory);

			createContextMenuFor(traceabilityViewer);
			}
			
			// Create view for output models.
			ViewerPane viewerPane3 = new ViewerPane(getSite().getPage(),
					TraceabilityEditorTrace.this)
			{
				@Override
				public Viewer createViewer(Composite composite) {
					Tree tree = new Tree(composite, SWT.MULTI);
					TreeViewer newTreeViewer = new TreeViewer(tree);
					return newTreeViewer;
				}

				@Override
				public void requestActivation() {
					super.requestActivation();
					setCurrentViewerPane(this);
				}
			};
			viewerPane3.createControl(topSashForm);
			targetViewer=(TreeViewer)viewerPane3.getViewer();
			targetViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
			targetViewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
			targetViewer.addDragSupport(DND.DROP_LINK , transfers, new ViewerDragAdapter(targetViewer));
			ArrayList<String> paths_target=new ArrayList<String>();
			for(int i=0;i<targets.size();i++){
				if (targets.get(i).getMetamodel() != null) { //If metamodel attribute is not null
					if (!targets.get(i).getMetamodel().equals("")) { //If metamodel is not empty 
						Actions.registerMetamodel(targets.get(i).getMetamodel());
					}
				}
				paths_target.add(targets.get(i).getPath());
			}
				targetRs = Actions.createResourceSet(paths_target);
				targetViewer.setInput(targetRs);
				targetViewer.setSelection(new StructuredSelection(targetRs.getResources().get(0)), true);
				viewerPane3.setTitle("Target Models");
				
				targetViewer.addSelectionChangedListener
				(new ISelectionChangedListener() {
					 // This ensures that we handle selections correctly.
					 //
					 public void selectionChanged(SelectionChangedEvent event) {
						 handleContentTargetSelection(event.getSelection());
					 }
				 });
				
				new AdapterFactoryTreeEditor(targetViewer.getTree(), adapterFactory);
				
				//To show the contextual menu (disabled for input and output models)
				//createContextMenuFor(outputViewer.get(i));
				
			TraceabilityDragDrop dragdrop=new TraceabilityDragDrop(getEditingDomain(),traceabilityViewer, this.sourceRs, this.targetRs);
			traceabilityViewer.addDropSupport(DND.DROP_COPY | DND.DROP_LINK, transfers, dragdrop);
			
			int pageIndex = addPage(topSashForm);
			setPageText(pageIndex, getString("_UI_SelectionPage_label"));			
			getSite().getShell().getDisplay().asyncExec
				(new Runnable() {
					 public void run() {
						 setActivePage(0);
					 }
				 });
		}
		// Ensures that this editor will only display the page's tab
		// area if there are more than one page
		//
		getContainer().addControlListener
			(new ControlAdapter() {
				boolean guard = false;
				@Override
				public void controlResized(ControlEvent event) {
					if (!guard) {
						guard = true;
						hideTabs();
						guard = false;
					}
				}
			 });

		getSite().getShell().getDisplay().asyncExec
			(new Runnable() {
				 public void run() {
					 updateProblemIndication();
				 }
			 });
	}

	/**
	 * If there is just one page in the multi-page editor part,
	 * this hides the single tab at the bottom.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void hideTabs() {
		if (getPageCount() <= 1) {
			setPageText(0, "");
			if (getContainer() instanceof CTabFolder) {
				((CTabFolder)getContainer()).setTabHeight(1);
				Point point = getContainer().getSize();
				getContainer().setSize(point.x, point.y + 6);
			}
		}
	}

	/**
	 * If there is more than one page in the multi-page editor part,
	 * this shows the tabs at the bottom.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void showTabs() {
		if (getPageCount() > 1) {
			setPageText(0, getString("_UI_SelectionPage_label"));
			if (getContainer() instanceof CTabFolder) {
				((CTabFolder)getContainer()).setTabHeight(SWT.DEFAULT);
				Point point = getContainer().getSize();
				getContainer().setSize(point.x, point.y - 6);
			}
		}
	}

	/**
	 * This is used to track the active viewer.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void pageChange(int pageIndex) {
		super.pageChange(pageIndex);

		if (contentOutlinePage != null) {
			handleContentOutlineSelection(contentOutlinePage.getSelection());
		}
	}

	/**
	 * This is how the framework determines which interfaces we implement.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public Object getAdapter(Class key) {
		if (key.equals(IContentOutlinePage.class)) {
			return showOutlineView() ? getContentOutlinePage() : null;
		}
		else if (key.equals(IPropertySheetPage.class)) {
			return getPropertySheetPage();
		}
		else if (key.equals(IGotoMarker.class)) {
			return this;
		}
		else {
			return super.getAdapter(key);
		}
	}

	/**
	 * This accesses a cached version of the content outliner.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IContentOutlinePage getContentOutlinePage() {
		if (contentOutlinePage == null) {
			// The content outline is just a tree.
			//
			class MyContentOutlinePage extends ContentOutlinePage {
				@Override
				public void createControl(Composite parent) {
					super.createControl(parent);
					contentOutlineViewer = getTreeViewer();
					contentOutlineViewer.addSelectionChangedListener(this);

					// Set up the tree viewer.
					//
					contentOutlineViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
					contentOutlineViewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
					contentOutlineViewer.setInput(editingDomain.getResourceSet());

					// Make sure our popups work.
					//
					createContextMenuFor(contentOutlineViewer);

					if (!editingDomain.getResourceSet().getResources().isEmpty()) {
					  // Select the root object in the view.
					  //
					  contentOutlineViewer.setSelection(new StructuredSelection(editingDomain.getResourceSet().getResources().get(0)), true);
					}
				}

				@Override
				public void makeContributions(IMenuManager menuManager, IToolBarManager toolBarManager, IStatusLineManager statusLineManager) {
					super.makeContributions(menuManager, toolBarManager, statusLineManager);
					contentOutlineStatusLineManager = statusLineManager;
				}

				@Override
				public void setActionBars(IActionBars actionBars) {
					super.setActionBars(actionBars);
					getActionBarContributor().shareGlobalActions(this, actionBars);
				}
			}

			contentOutlinePage = new MyContentOutlinePage();

			// Listen to selection so that we can handle it is a special way.
			//
			contentOutlinePage.addSelectionChangedListener
				(new ISelectionChangedListener() {
					 // This ensures that we handle selections correctly.
					 //
					 public void selectionChanged(SelectionChangedEvent event) {
						 handleContentOutlineSelection(event.getSelection());
					 }
				 });
		}

		return contentOutlinePage;
	}

	/**
	 * This accesses a cached version of the property sheet.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPropertySheetPage getPropertySheetPage() {
		if (propertySheetPage == null) {
			propertySheetPage =
				new ExtendedPropertySheetPage(editingDomain) {
					@Override
					public void setSelectionToViewer(List<?> selection) {
						TraceabilityEditorTrace.this.setSelectionToViewer(selection);
						TraceabilityEditorTrace.this.setFocus();
					}

					@Override
					public void setActionBars(IActionBars actionBars) {
						super.setActionBars(actionBars);
						getActionBarContributor().shareGlobalActions(this, actionBars);
					}
				};
			propertySheetPage.setPropertySourceProvider(new AdapterFactoryContentProvider(adapterFactory));
		}

		return propertySheetPage;
	}

	/**
	 * This deals with how we want selection in the outliner to affect the other views.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NOT generated
	 */
	public void handleContentOutlineSelection(ISelection selection) {
		if (currentViewerPane != null && !selection.isEmpty() && selection instanceof IStructuredSelection) {
			Iterator<?> selectedElements = ((IStructuredSelection)selection).iterator();
			if (selectedElements.hasNext()) {
				// Get the first selected element.
				//
				Object selectedElement = selectedElements.next();

				ArrayList<Object> selectionList = new ArrayList<Object>();
				selectionList.add(selectedElement);
				while (selectedElements.hasNext()) {
					selectionList.add(selectedElements.next());
				}

				// Set the selection to the widget.
				//
				traceabilityViewer.setSelection(new StructuredSelection(selectionList));
				}
		}
	}
	
	/**
	 * This deals with how we want selection in the traceability viewer to affect the other views.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NOT generated
	 */
	public void handleContentTraceabilitySelection(ISelection selection) {
		ArrayList<Object> sourceElements = new ArrayList<Object>();
		ArrayList<Object> targetElements = new ArrayList<Object>();

		// Get source and target elements from traceability model
		if (currentViewerPane != null
				&& getViewer().equals(traceabilityViewer)
				&& !selection.isEmpty()
				&& selection instanceof IStructuredSelection) {
			Iterator<?> selectedElements = ((IStructuredSelection) selection)
					.iterator();
			while (selectedElements.hasNext()) {
				Object selectedElement = selectedElements.next();
				if (selectedElement instanceof EObject) {
					EObject eoSelectedElement = (EObject) selectedElement;
					//a TraceLink has been selected
					if (eoSelectedElement instanceof TraceLinkImpl) { 
						TraceLinkImpl traceLink = (TraceLinkImpl) eoSelectedElement;
						// Source
						for (int i = 0; i < traceLink.getSource().size(); i++) {
							// Get source elements from source models
							for (int c1 = 0; c1 < sourceRs.getResources().size(); c1++) {
								// For each ResourceSet (Input)
								TreeIterator<?> in_ti = sourceRs.getResources().get(c1)
										.getAllContents();
								while (in_ti.hasNext()) {
									// For each element from a input model
									EObject element = (EObject) in_ti.next();
									XMIResource resource = (XMIResource) element.eResource();
									String id = resource.getID(element); // Get element id
									if(id==null)
										id=resource.getURIFragment(element);
									if (traceLink.getSource().get(i).getRef()!=null && 
											id != null &&
											id.equals(traceLink.getSource().get(i).getRef())) {
										sourceElements.add(element);
									}
								}
							}
						}

						// Target
						for (int i = 0; i < traceLink.getTarget().size(); i++) {
							// Get target elements from target models
							for (int c1 = 0; c1 < targetRs.getResources().size(); c1++) {
								// For each ResourceSet (Input)
								TreeIterator<?> out_ti = targetRs.getResources().get(c1)
										.getAllContents();
								while (out_ti.hasNext()) {
									// For each element from a input model
									EObject element = (EObject) out_ti.next();
									XMIResource resource = (XMIResource) element
											.eResource();
									String id = resource.getID(element); // Get element id
									if(id==null)
										id=resource.getURIFragment(element);
									if (traceLink.getTarget().get(i).getRef()!=null && 
											id!=null && 
											id.equals(traceLink.getTarget().get(i).getRef())) {
										targetElements.add(element);
									}
								}
							}
						}
					} else // a sourceElement has been selected
					if (eoSelectedElement instanceof SourceElementImpl) {
						SourceElementImpl elementSelected = (SourceElementImpl) eoSelectedElement;
						// Get source element from input models
						for (int c1 = 0; c1 < sourceRs.getResources().size(); c1++) {
							// For each ResourceSet (Source)
							TreeIterator<?> in_ti = sourceRs.getResources().get(c1)
									.getAllContents();
							while (in_ti.hasNext()) {
								// For each element from a input model
								EObject element = (EObject) in_ti.next();
								XMIResource resource = (XMIResource) element
										.eResource();
								// Get element id
								String id = resource.getID(element); 
								if (id == null)
									id = resource.getURIFragment(element);
								if (elementSelected.getRef() != null
										&& id != null
										&& id.equals(elementSelected.getRef())) {
									sourceElements.add(element);
								}
							}
						}
						
					} else // a targetElement has been selected
					if (eoSelectedElement instanceof TargetElementImpl) {
						TargetElementImpl elementSelected = (TargetElementImpl) eoSelectedElement;
						// Get target element from output models
						for (int c1 = 0; c1 < targetRs.getResources().size(); c1++) {
							// For each ResourceSet (Target)
							TreeIterator<?> out_ti = targetRs.getResources().get(c1)
									.getAllContents();
							while (out_ti.hasNext()) {
								// For each element from a input model
								EObject element = (EObject) out_ti.next();
								XMIResource resource = (XMIResource) element
										.eResource();
								// Get element id
								String id = resource.getID(element); 
								if(id==null)
									id=resource.getURIFragment(element);
								if (elementSelected.getRef()!=null && 
										id!=null && 
										id.equals(elementSelected.getRef())) {
									targetElements.add(element);
								}
							}
						}
					}
				}
			}
			if (currentViewerPane != null){
				// Select elements in source and target models
				sourceViewer.setSelection(new StructuredSelection(sourceElements),true);
				targetViewer.setSelection(new StructuredSelection(targetElements),true);
			}
		}
	}
	
	/**
	 * This deals with how we want selection in an input viewer to affect the other views.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NOT generated
	 */
	public void handleContentSourceSelection(ISelection selection) {
		ArrayList<TraceElement> traceElements = new ArrayList<TraceElement>();
		String id = null;
		
		if(currentViewerPane != null
				&& getViewer().equals(sourceViewer)
				&&!selection.isEmpty()
				&& selection instanceof IStructuredSelection){
			Iterator<?> selectedElements = ((IStructuredSelection) selection).iterator();
			while (selectedElements.hasNext()) {
				Object selectedElement = selectedElements.next();
				if (selectedElement instanceof EObject) {
					EObject eoSelectedElement = (EObject) selectedElement;
					XMIResource resource = (XMIResource) eoSelectedElement.eResource();
					id = resource.getID(eoSelectedElement); // Get element id
					if(id==null)
						id=resource.getURIFragment(eoSelectedElement);
					TreeIterator<?> traceContents = editingDomain
					.getResourceSet().getResources().get(0)
					.getAllContents();
					while (traceContents.hasNext()) {
						// For each source element from a trace model
						EObject element = (EObject) traceContents.next();
						if (element instanceof SourceElementImpl) {
							SourceElementImpl source = (SourceElementImpl) element;
							if (source.getRef() != null && id != null
									&& source.getRef().equals(id)) {
								ArrayList<TraceLink> tracelinks = new ArrayList<TraceLink>();
								tracelinks.add(source.getSource_traceLinks());
								for (int cont2 = 0; cont2 < tracelinks.size(); cont2++) {
									TraceLinkImpl traceLink = (TraceLinkImpl) tracelinks
											.get(cont2);
									traceElements.add(traceLink);
								}
								traceElements.add(source);
							}
						}
					}
				}
			}
			traceabilityViewer.setSelection(new StructuredSelection(traceElements),true);
			targetViewer.setSelection(new StructuredSelection(new ArrayList<Object>()),true);
		}
	}
	
		
	/**
	 * This deals with how we want selection in an input viewer to affect the other views.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NOT generated
	 */
	/*public void handleContentSourceSelection2(ISelection selection) {
		ArrayList<TraceElement> traceElements = new ArrayList<TraceElement>();
		int n_model=-1;
		String id = null;
		
		// Get source elements from input model selected
		if (getViewer().equals(sourceViewer) && !selection.isEmpty()
				&& selection instanceof IStructuredSelection && getModelActualSelection()!=TRACE_MODEL_INDEX) {
			Iterator<?> selectedElements = ((IStructuredSelection) selection).iterator();
			
			while (selectedElements.hasNext()) {
				Object selectedElement = selectedElements.next();
				if (selectedElement instanceof EObject) {
					EObject eoSelectedElement = (EObject) selectedElement;
					XMIResource resource = (XMIResource) eoSelectedElement.eResource();
					
					id = resource.getID(eoSelectedElement); // Get element id
					if(id==null)
						id=resource.getURIFragment(eoSelectedElement);
					
					//We want to obtain the source model of the selected element 
					n_model=this.getNumberSourceModel(id);
					
					TreeIterator<?> traceContents = editingDomain
							.getResourceSet().getResources().get(0)
							.getAllContents();
					while (traceContents.hasNext()) {
						// For each source element from a trace model
						EObject element = (EObject) traceContents.next();
						if (element instanceof SourceElementImpl) {
							SourceElementImpl source = (SourceElementImpl) element;
							if (source.getRef() != null && id != null
									&& source.getRef().equals(id)) {
								ArrayList<TraceLink> tracelinks = new ArrayList<TraceLink>();
								tracelinks.add(source.getSource_traceLinks());
								for (int cont2 = 0; cont2 < tracelinks.size(); cont2++) {
									TraceLinkImpl traceLink = (TraceLinkImpl) tracelinks
											.get(cont2);
									traceElements.add(traceLink);
								}
								traceElements.add(source);
							}
						}
					}
				}
			}
			
			//"id != null" and "traceElements.size()==0" mean that the element 
			//is not involved in a traceLink
			//in that case, we only mark the element selected.
			if (traceElements.size()>0 || id!=null){
				setModelActualSelection(n_model);
				traceabilityViewer.setSelection(new StructuredSelection(traceElements),true);
				setModelActualSelection(-1); 
			}else{
				setModelActualSelection(-1);
			}
		} else{
			setModelActualSelection(-1);
		}
	}*/
	
	
	/**
	 * This deals with how we want selection in an input viewer to affect the other views.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NOT generated
	 */
	public void handleContentTargetSelection(ISelection selection) {
		ArrayList<TraceElement> traceElements = new ArrayList<TraceElement>();
		String id = null;
		
		if(currentViewerPane != null
				&& getViewer().equals(targetViewer)
				&&!selection.isEmpty()
				&& selection instanceof IStructuredSelection){
			Iterator<?> selectedElements = ((IStructuredSelection) selection).iterator();
			while (selectedElements.hasNext()) {
				Object selectedElement = selectedElements.next();
				if (selectedElement instanceof EObject) {
					EObject eoSelectedElement = (EObject) selectedElement;
					XMIResource resource = (XMIResource) eoSelectedElement.eResource();
					id = resource.getID(eoSelectedElement); // Get element id
					if(id==null)
						id=resource.getURIFragment(eoSelectedElement);
					TreeIterator<?> traceContents = editingDomain
					.getResourceSet().getResources().get(0)
					.getAllContents();
					while (traceContents.hasNext()) {
						// For each target element from a trace model
						EObject element = (EObject) traceContents.next();
						if (element instanceof TargetElementImpl) {
							TargetElementImpl target = (TargetElementImpl) element;
							if (target.getRef() != null && id != null
									&& target.getRef().equals(id)) {
								ArrayList<TraceLink> tracelinks = new ArrayList<TraceLink>();
								tracelinks.add(target.getTarget_traceLinks());
								for (int cont2 = 0; cont2 < tracelinks.size(); cont2++) {
									TraceLinkImpl traceLink = (TraceLinkImpl) tracelinks
											.get(cont2);
									traceElements.add(traceLink);
								}
								traceElements.add(target);
							}
						}
					}
				}
			}
			traceabilityViewer.setSelection(new StructuredSelection(traceElements),true);
			sourceViewer.setSelection(new StructuredSelection(new ArrayList<Object>()),true);
		}
	}
	
	
	/**
	 * This deals with how we want selection in an output viewer to affect the other views.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NOT generated
	 */
	/*public void handleContentTargetSelection(ISelection selection) {
		ArrayList<TraceElement> traceElements = new ArrayList<TraceElement>();
		
		boolean targetView = false; //Selection is selected in a outputviewer
		int n_model=-1;
		String id = null;
		for(int cont1=0;cont1<targetViewer.size();cont1++){
			if(currentViewerPane != null && getViewer()==targetViewer.get(cont1)){
				targetView = true;
				n_model = cont1;
			}
		}
		
		// Get source elements from target model selected
		if (targetView && !selection.isEmpty()
				&& selection instanceof IStructuredSelection) {
			Iterator<?> selectedElements = ((IStructuredSelection) selection).iterator();
			
			while (selectedElements.hasNext()) {
				Object selectedElement = selectedElements.next();
				if (selectedElement instanceof EObject) {
					EObject eoSelectedElement = (EObject) selectedElement;
					XMIResource resource = (XMIResource) eoSelectedElement.eResource();
					
					//if element belongs to model selected
					if(resource.getResourceSet().equals(this.targetRs.get(n_model))){
						id = resource.getID(eoSelectedElement); // Get element id
						if(id==null)
							id=resource.getURIFragment(eoSelectedElement);
						TreeIterator<?> traceContents = editingDomain.getResourceSet().getResources().get(0).getAllContents();
						while (traceContents.hasNext()) {
							// For each target element from a trace model
							EObject element = (EObject) traceContents.next();
							if(element instanceof TargetElementImpl){
								TargetElementImpl target = (TargetElementImpl) element;
								if(target.getRef()!=null&&
										id!=null&&
										target.getRef().equals(id)){
									ArrayList<TraceLink> tracelinks = new ArrayList<TraceLink>();
									tracelinks.add(target.getTarget_traceLinks());
									for(int cont2=0;cont2<tracelinks.size();cont2++){
										TraceLinkImpl traceLink = (TraceLinkImpl) tracelinks.get(cont2);
										traceElements.add(traceLink);
									}
									traceElements.add(target);
								}
							}
								
						}
					}
				}
			}
			//"id != null" and "traceElements.size()==0" mean that the element 
			//is not involved in a traceLink
			//in that case, we only mark the element selected.
			if (traceElements.size()>0 || id!=null){
				traceabilityViewer.setSelection(new StructuredSelection(traceElements),true);
			}
		}	
		
	}*/
	

	/**
	 * This is for implementing {@link IEditorPart} and simply tests the command stack.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDirty() {
		return ((BasicCommandStack)editingDomain.getCommandStack()).isSaveNeeded();
	}

	/**
	 * This is for implementing {@link IEditorPart} and simply saves the model file.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void doSave(IProgressMonitor progressMonitor) {
		// Save only resources that have actually changed.
		//
		final Map<Object, Object> saveOptions = new HashMap<Object, Object>();
		saveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED, Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);

		// Do the work within an operation because this is a long running activity that modifies the workbench.
		//
		WorkspaceModifyOperation operation =
			new WorkspaceModifyOperation() {
				// This is the method that gets invoked when the operation runs.
				//
				@Override
				public void execute(IProgressMonitor monitor) {
					// Save the resources to the file system.
					//
					boolean first = true;
					for (Resource resource : editingDomain.getResourceSet().getResources()) {
						if ((first || !resource.getContents().isEmpty() || isPersisted(resource)) && !editingDomain.isReadOnly(resource)) {
							try {
								long timeStamp = resource.getTimeStamp();
								resource.save(saveOptions);
								if (resource.getTimeStamp() != timeStamp) {
									savedResources.add(resource);
								}
							}
							catch (Exception exception) {
								resourceToDiagnosticMap.put(resource, analyzeResourceProblems(resource, exception));
							}
							first = false;
						}
					}
				}
			};

		updateProblemIndication = false;
		try {
			// This runs the options, and shows progress.
			//
			new ProgressMonitorDialog(getSite().getShell()).run(true, false, operation);

			// Refresh the necessary state.
			//
			((BasicCommandStack)editingDomain.getCommandStack()).saveIsDone();
			firePropertyChange(IEditorPart.PROP_DIRTY);
		}
		catch (Exception exception) {
			// Something went wrong that shouldn't.
			//
			TraceabilityEditorPlugin.INSTANCE.log(exception);
		}
		updateProblemIndication = true;
		updateProblemIndication();
	}

	/**
	 * This returns whether something has been persisted to the URI of the specified resource.
	 * The implementation uses the URI converter from the editor's resource set to try to open an input stream. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected boolean isPersisted(Resource resource) {
		boolean result = false;
		try {
			InputStream stream = editingDomain.getResourceSet().getURIConverter().createInputStream(resource.getURI());
			if (stream != null) {
				result = true;
				stream.close();
			}
		}
		catch (IOException e) {
			// Ignore
		}
		return result;
	}

	/**
	 * This always returns true because it is not currently supported.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSaveAsAllowed() {
		return true;
	}

	/**
	 * This also changes the editor's input.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void doSaveAs() {
		SaveAsDialog saveAsDialog = new SaveAsDialog(getSite().getShell());
		saveAsDialog.open();
		IPath path = saveAsDialog.getResult();
		if (path != null) {
			IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
			if (file != null) {
				doSaveAs(URI.createPlatformResourceURI(file.getFullPath().toString(), true), new FileEditorInput(file));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void doSaveAs(URI uri, IEditorInput editorInput) {
		(editingDomain.getResourceSet().getResources().get(0)).setURI(uri);
		setInputWithNotify(editorInput);
		setPartName(editorInput.getName());
		IProgressMonitor progressMonitor =
			getActionBars().getStatusLineManager() != null ?
				getActionBars().getStatusLineManager().getProgressMonitor() :
				new NullProgressMonitor();
		doSave(progressMonitor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void gotoMarker(IMarker marker) {
		try {
			if (marker.getType().equals(EValidator.MARKER)) {
				String uriAttribute = marker.getAttribute(EValidator.URI_ATTRIBUTE, null);
				if (uriAttribute != null) {
					URI uri = URI.createURI(uriAttribute);
					EObject eObject = editingDomain.getResourceSet().getEObject(uri, true);
					if (eObject != null) {
					  setSelectionToViewer(Collections.singleton(editingDomain.getWrapper(eObject)));
					}
				}
			}
		}
		catch (CoreException exception) {
			TraceabilityEditorPlugin.INSTANCE.log(exception);
		}
	}

	/**
	 * This is called during startup.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void init(IEditorSite site, IEditorInput editorInput) {
		setSite(site);
		setInputWithNotify(editorInput);
		setPartName(editorInput.getName());
		site.setSelectionProvider(this);
		site.getPage().addPartListener(partListener);
		ResourcesPlugin.getWorkspace().addResourceChangeListener(resourceChangeListener, IResourceChangeEvent.POST_CHANGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFocus() {
		if (currentViewerPane != null) {
			currentViewerPane.setFocus();
		}
		else {
			getControl(getActivePage()).setFocus();
		}
	}

	/**
	 * This implements {@link org.eclipse.jface.viewers.ISelectionProvider}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		selectionChangedListeners.add(listener);
	}

	/**
	 * This implements {@link org.eclipse.jface.viewers.ISelectionProvider}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeSelectionChangedListener(ISelectionChangedListener listener) {
		selectionChangedListeners.remove(listener);
	}

	/**
	 * This implements {@link org.eclipse.jface.viewers.ISelectionProvider} to return this editor's overall selection.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISelection getSelection() {
		return editorSelection;
	}

	/**
	 * This implements {@link org.eclipse.jface.viewers.ISelectionProvider} to set this editor's overall selection.
	 * Calling this result will notify the listeners.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelection(ISelection selection) {
		editorSelection = selection;

		for (ISelectionChangedListener listener : selectionChangedListeners) {
			listener.selectionChanged(new SelectionChangedEvent(this, selection));
		}
		setStatusLineManager(selection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatusLineManager(ISelection selection) {
		IStatusLineManager statusLineManager = currentViewer != null && currentViewer == contentOutlineViewer ?
			contentOutlineStatusLineManager : getActionBars().getStatusLineManager();

		if (statusLineManager != null) {
			if (selection instanceof IStructuredSelection) {
				Collection<?> collection = ((IStructuredSelection)selection).toList();
				switch (collection.size()) {
					case 0: {
						statusLineManager.setMessage(getString("_UI_NoObjectSelected"));
						break;
					}
					case 1: {
						String text = new AdapterFactoryItemDelegator(adapterFactory).getText(collection.iterator().next());
						statusLineManager.setMessage(getString("_UI_SingleObjectSelected", text));
						break;
					}
					default: {
						statusLineManager.setMessage(getString("_UI_MultiObjectSelected", Integer.toString(collection.size())));
						break;
					}
				}
			}
			else {
				statusLineManager.setMessage("");
			}
		}
	}

	/**
	 * This looks up a string in the plugin's plugin.properties file.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static String getString(String key) {
		return TraceabilityEditorPlugin.INSTANCE.getString(key);
	}

	/**
	 * This looks up a string in plugin.properties, making a substitution.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static String getString(String key, Object s1) {
		return TraceabilityEditorPlugin.INSTANCE.getString(key, new Object [] { s1 });
	}

	/**
	 * This implements {@link org.eclipse.jface.action.IMenuListener} to help fill the context menus with contributions from the Edit menu.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void menuAboutToShow(IMenuManager menuManager) {
		((IMenuListener)getEditorSite().getActionBarContributor()).menuAboutToShow(menuManager);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditingDomainActionBarContributor getActionBarContributor() {
		return (EditingDomainActionBarContributor)getEditorSite().getActionBarContributor();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IActionBars getActionBars() {
		return getActionBarContributor().getActionBars();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdapterFactory getAdapterFactory() {
		return adapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		updateProblemIndication = false;

		ResourcesPlugin.getWorkspace().removeResourceChangeListener(resourceChangeListener);

		getSite().getPage().removePartListener(partListener);

		adapterFactory.dispose();

		if (getActionBarContributor().getActiveEditor() == this) {
			getActionBarContributor().setActiveEditor(null);
		}

		if (propertySheetPage != null) {
			propertySheetPage.dispose();
		}

		if (contentOutlinePage != null) {
			contentOutlinePage.dispose();
		}

		super.dispose();
	}

	/**
	 * Returns whether the outline view should be presented to the user.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected boolean showOutlineView() {
		return true;
	}
	
//	protected void setModelActualSelection(int value){
//		this.modelActualSelection=value;
//	}
//	
//	protected int getModelActualSelection(){
//		return this.modelActualSelection;
//	}
	
//	protected int getNumberSourceModel(String id){
//		int n_model=-1;
//		
//		//Looking for in the source models
//		for(int cont1=0;cont1<sourceRs.getResources().size();cont1++){
//			Resource res_model=sourceRs.getResources().get(cont1);
//			TreeIterator<EObject> contents_model=res_model.getAllContents();
//			while (contents_model.hasNext()) {
//				// For each source element
//				EObject source_m_element = (EObject) contents_model.next();
//				XMIResource res_element = (XMIResource) source_m_element.eResource();
//				String id_element = res_element.getID(source_m_element); // Get element id
//				if(id_element==null)
//					id_element=res_element.getURIFragment(source_m_element);
//				if((id!=null)&&(id_element!=null)&&(id.equals(id_element))){
//					return cont1+SOURCE_MODEL_INDEX;
//				}
//			}
//		}
//		return n_model;
//	}
		
//		//In Traceability Model
//		Resource res_Tracemodel=editingDomain.getResourceSet().getResources().get(0);
//		TreeIterator<EObject> contents_Tracemodel=res_Tracemodel.getAllContents();
//		while (contents_Tracemodel.hasNext()) {
//			// For each trace element
//			EObject trace_m_element = (EObject) contents_Tracemodel.next();
//			XMIResource res_element = (XMIResource) trace_m_element.eResource();
//			String id_element = res_element.getID(trace_m_element); // Get element id
//			if(id_element==null)
//				id_element=res_element.getURIFragment(trace_m_element);
//			if((id!=null)&&(id_element!=null)&&(id.equals(id_element))){
//				return 200;
//			}
//		}
//	protected int getNumberTargetModel(String id){
//		int n_model=-1;
//		//In target models
//		for(int cont1=0;cont1<targetRs.getResources().size();cont1++){
//			Resource res_model=targetRs.getResources().get(cont1);
//			TreeIterator<EObject> contents_model=res_model.getAllContents();
//			while (contents_model.hasNext()) {
//				// For each target element
//				EObject target_m_element = (EObject) contents_model.next();
//				XMIResource res_element = (XMIResource) target_m_element.eResource();
//				String id_element = res_element.getID(target_m_element); // Get element id
//				if(id_element==null)
//					id_element=res_element.getURIFragment(target_m_element);
//				if((id!=null)&&(id_element!=null)&&(id.equals(id_element))){
//					return cont1+TARGET_MODEL_INDEX;
//				}
//			}
//		}
//		
//		return n_model;
//	}
}