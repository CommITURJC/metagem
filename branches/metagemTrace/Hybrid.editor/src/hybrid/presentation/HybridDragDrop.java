package hybrid.presentation;

import hybrid.impl.HybridFactoryImpl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.command.DragAndDropCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.dnd.EditingDomainViewerDropAdapter;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DropTargetEvent;

public class HybridDragDrop extends EditingDomainViewerDropAdapter {
	
	final static int NULL_SELECTION = -1;
	final static int DEFAULT_SELECTION = 0;
	final static int SOURCE_ELEMENT = 1;
	final static int TARGET_ELEMENT = 2;
	
	private ResourceSet sourceRs;
	private ResourceSet targetRs;
	private EObject aTargetObj = null;
	private EObject aSource = null;
	private String elementModel;
	private int selectionType;
	private HybridFactoryImpl hybridFactory;
	
	public HybridDragDrop(EditingDomain domain, Viewer viewer, ResourceSet sourceRs, ResourceSet targetRs) {
		super(domain, viewer);
		this.sourceRs = sourceRs;
		this.targetRs = targetRs;
		hybridFactory = new HybridFactoryImpl();
	}
	
	/**
	   * This method is called the same way for each of the
	   * {@link org.eclipse.swt.dnd.DropTargetListener} methods, except for leave
	   * and drop.  If the source is available early, it creates or revalidates
	   * the {@link DragAndDropCommand}, and updates the event's detail (operation)
	   * and feedback (drag under effect), appropriately.
	   */
	protected void helper(DropTargetEvent event) {
		event.detail = DND.DROP_NONE;
		selectionType = DEFAULT_SELECTION;
		// If we can't do anything else, we'll provide the default select
		// feedback and enable auto-scroll and auto-expand effects.
		event.feedback = DND.FEEDBACK_SELECT | getAutoFeedback();
		// gets the source
		source = getDragSource(event);
		aSource = (EObject) source.iterator().next();
		// gets the target
		Object aObj = extractDropTarget(event.item);
		if (aObj instanceof EObject){        	
			aTargetObj = (EObject)aObj;
			//Different elements:
			if (!aSource.eResource().getURI().equals(aTargetObj.eResource().getURI())){	
				
			}
		}
	}
	
	

}
