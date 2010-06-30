/*
 * 
 */
package mm_hybrid.diagram.part;

import org.eclipse.emf.ecore.EObject;

/**
 * @generated
 */
public class MM_HybridNodeDescriptor {

	/**
	 * @generated
	 */
	private EObject myModelElement;

	/**
	 * @generated
	 */
	private int myVisualID;

	/**
	 * @generated
	 */
	private String myType;

	/**
	 * @generated
	 */
	public MM_HybridNodeDescriptor(EObject modelElement, int visualID) {
		myModelElement = modelElement;
		myVisualID = visualID;
	}

	/**
	 * @generated
	 */
	public EObject getModelElement() {
		return myModelElement;
	}

	/**
	 * @generated
	 */
	public int getVisualID() {
		return myVisualID;
	}

	/**
	 * @generated
	 */
	public String getType() {
		if (myType == null) {
			myType = mm_hybrid.diagram.part.MM_HybridVisualIDRegistry
					.getType(getVisualID());
		}
		return myType;
	}

}
