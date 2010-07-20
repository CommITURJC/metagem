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
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mm_hybrid.Operation#getName_operation <em>Name operation</em>}</li>
 *   <li>{@link mm_hybrid.Operation#getBody <em>Body</em>}</li>
 *   <li>{@link mm_hybrid.Operation#getContext <em>Context</em>}</li>
 *   <li>{@link mm_hybrid.Operation#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link mm_hybrid.Operation#getRightPattern <em>Right Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see mm_hybrid.MM_HybridPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends EObject {
	/**
	 * Returns the value of the '<em><b>Name operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name operation</em>' attribute.
	 * @see #setName_operation(String)
	 * @see mm_hybrid.MM_HybridPackage#getOperation_Name_operation()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getName_operation();

	/**
	 * Sets the value of the '{@link mm_hybrid.Operation#getName_operation <em>Name operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name operation</em>' attribute.
	 * @see #getName_operation()
	 * @generated
	 */
	void setName_operation(String value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see mm_hybrid.MM_HybridPackage#getOperation_Body()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link mm_hybrid.Operation#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(Element)
	 * @see mm_hybrid.MM_HybridPackage#getOperation_Context()
	 * @model
	 * @generated
	 */
	Element getContext();

	/**
	 * Sets the value of the '{@link mm_hybrid.Operation#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Element value);

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' containment reference.
	 * @see #setReturnType(Return)
	 * @see mm_hybrid.MM_HybridPackage#getOperation_ReturnType()
	 * @model containment="true"
	 * @generated
	 */
	Return getReturnType();

	/**
	 * Sets the value of the '{@link mm_hybrid.Operation#getReturnType <em>Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' containment reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(Return value);

	/**
	 * Returns the value of the '<em><b>Right Pattern</b></em>' reference list.
	 * The list contents are of type {@link mm_hybrid.RightPattern}.
	 * It is bidirectional and its opposite is '{@link mm_hybrid.RightPattern#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Pattern</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Pattern</em>' reference list.
	 * @see mm_hybrid.MM_HybridPackage#getOperation_RightPattern()
	 * @see mm_hybrid.RightPattern#getOperation
	 * @model opposite="operation"
	 * @generated
	 */
	EList<RightPattern> getRightPattern();

} // Operation
