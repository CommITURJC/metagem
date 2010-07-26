/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm_hybrid;

import org.eclipse.emf.common.util.EList;
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
 *   <li>{@link mm_hybrid.Element#getOperation <em>Operation</em>}</li>
 *   <li>{@link mm_hybrid.Element#getIsRefered <em>Is Refered</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' reference list.
	 * The list contents are of type {@link mm_hybrid.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' reference list.
	 * @see mm_hybrid.MM_HybridPackage#getElement_Operation()
	 * @model
	 * @generated
	 */
	EList<Operation> getOperation();

	/**
	 * Returns the value of the '<em><b>Is Refered</b></em>' reference list.
	 * The list contents are of type {@link mm_hybrid.RightPattern}.
	 * It is bidirectional and its opposite is '{@link mm_hybrid.RightPattern#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Refered</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Refered</em>' reference list.
	 * @see mm_hybrid.MM_HybridPackage#getElement_IsRefered()
	 * @see mm_hybrid.RightPattern#getReference
	 * @model opposite="reference"
	 * @generated
	 */
	EList<RightPattern> getIsRefered();

} // Element
