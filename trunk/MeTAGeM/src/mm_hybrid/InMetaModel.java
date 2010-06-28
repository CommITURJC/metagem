/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm_hybrid;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>In Meta Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mm_hybrid.InMetaModel#getName_mm <em>Name mm</em>}</li>
 * </ul>
 * </p>
 *
 * @see mm_hybrid.MM_HybridPackage#getInMetaModel()
 * @model
 * @generated
 */
public interface InMetaModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Name mm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name mm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name mm</em>' attribute.
	 * @see #setName_mm(String)
	 * @see mm_hybrid.MM_HybridPackage#getInMetaModel_Name_mm()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getName_mm();

	/**
	 * Sets the value of the '{@link mm_hybrid.InMetaModel#getName_mm <em>Name mm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name mm</em>' attribute.
	 * @see #getName_mm()
	 * @generated
	 */
	void setName_mm(String value);

} // InMetaModel
