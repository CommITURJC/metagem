/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package RubyTL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link RubyTL.NamedElement#getName <em>Name</em>}</li>
 *   <li>{@link RubyTL.NamedElement#getUri <em>Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @see RubyTL.RubyTLPackage#getNamedElement()
 * @model
 * @generated
 */
public interface NamedElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(Object)
	 * @see RubyTL.RubyTLPackage#getNamedElement_Name()
	 * @model unique="false" dataType="PrimitiveTypes.String" ordered="false"
	 * @generated
	 */
	Object getName();

	/**
	 * Sets the value of the '{@link RubyTL.NamedElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(Object value);

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(Object)
	 * @see RubyTL.RubyTLPackage#getNamedElement_Uri()
	 * @model unique="false" dataType="PrimitiveTypes.String" ordered="false"
	 * @generated
	 */
	Object getUri();

	/**
	 * Sets the value of the '{@link RubyTL.NamedElement#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(Object value);

} // NamedElement
