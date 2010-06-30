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
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mm_hybrid.Element#getName_element <em>Name element</em>}</li>
 * </ul>
 * </p>
 *
 * @see mm_hybrid.MM_HybridPackage#getElement()
 * @model abstract="true"
 * @generated
 */
public interface Element extends EObject {
	/**
	 * Returns the value of the '<em><b>Name element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name element</em>' attribute.
	 * @see #setName_element(String)
	 * @see mm_hybrid.MM_HybridPackage#getElement_Name_element()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getName_element();

	/**
	 * Sets the value of the '{@link mm_hybrid.Element#getName_element <em>Name element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name element</em>' attribute.
	 * @see #getName_element()
	 * @generated
	 */
	void setName_element(String value);

} // Element
