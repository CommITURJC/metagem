/*
 * 
 */
package mm_hybrid.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class MM_HybridNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7005;

	/**
	 * @generated
	 */
	private static final int SHORTCUTS_CATEGORY = 7004;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof mm_hybrid.diagram.navigator.MM_HybridNavigatorItem) {
			mm_hybrid.diagram.navigator.MM_HybridNavigatorItem item = (mm_hybrid.diagram.navigator.MM_HybridNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return mm_hybrid.diagram.part.MM_HybridVisualIDRegistry
					.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
