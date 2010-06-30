/*
 * 
 */
package mm_hybrid.diagram.navigator;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class MM_HybridNavigatorItem extends
		mm_hybrid.diagram.navigator.MM_HybridAbstractNavigatorItem {

	/**
	 * @generated
	 */
	static {
		final Class[] supportedTypes = new Class[] { View.class, EObject.class };
		Platform.getAdapterManager().registerAdapters(new IAdapterFactory() {

			public Object getAdapter(Object adaptableObject, Class adapterType) {
				if (adaptableObject instanceof mm_hybrid.diagram.navigator.MM_HybridNavigatorItem
						&& (adapterType == View.class || adapterType == EObject.class)) {
					return ((mm_hybrid.diagram.navigator.MM_HybridNavigatorItem) adaptableObject)
							.getView();
				}
				return null;
			}

			public Class[] getAdapterList() {
				return supportedTypes;
			}
		}, mm_hybrid.diagram.navigator.MM_HybridNavigatorItem.class);
	}

	/**
	 * @generated
	 */
	private View myView;

	/**
	 * @generated
	 */
	private boolean myLeaf = false;

	/**
	 * @generated
	 */
	public MM_HybridNavigatorItem(View view, Object parent, boolean isLeaf) {
		super(parent);
		myView = view;
		myLeaf = isLeaf;
	}

	/**
	 * @generated
	 */
	public View getView() {
		return myView;
	}

	/**
	 * @generated
	 */
	public boolean isLeaf() {
		return myLeaf;
	}

	/**
	 * @generated
	 */
	public boolean equals(Object obj) {
		if (obj instanceof mm_hybrid.diagram.navigator.MM_HybridNavigatorItem) {
			return EcoreUtil
					.getURI(getView())
					.equals(
							EcoreUtil
									.getURI(((mm_hybrid.diagram.navigator.MM_HybridNavigatorItem) obj)
											.getView()));
		}
		return super.equals(obj);
	}

	/**
	 * @generated
	 */
	public int hashCode() {
		return EcoreUtil.getURI(getView()).hashCode();
	}

}
