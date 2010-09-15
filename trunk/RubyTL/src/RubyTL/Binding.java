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
 * A representation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link RubyTL.Binding#getTarget <em>Target</em>}</li>
 *   <li>{@link RubyTL.Binding#getProperty <em>Property</em>}</li>
 *   <li>{@link RubyTL.Binding#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see RubyTL.RubyTLPackage#getBinding()
 * @model
 * @generated
 */
public interface Binding extends EObject {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(Expression)
	 * @see RubyTL.RubyTLPackage#getBinding_Target()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Expression getTarget();

	/**
	 * Sets the value of the '{@link RubyTL.Binding#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Expression value);

	/**
	 * Returns the value of the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' attribute.
	 * @see #setProperty(String)
	 * @see RubyTL.RubyTLPackage#getBinding_Property()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getProperty();

	/**
	 * Sets the value of the '{@link RubyTL.Binding#getProperty <em>Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' attribute.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(Expression)
	 * @see RubyTL.RubyTLPackage#getBinding_Source()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Expression getSource();

	/**
	 * Sets the value of the '{@link RubyTL.Binding#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Expression value);

} // Binding
