/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package RubyTL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exp Get</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link RubyTL.ExpGet#getSource <em>Source</em>}</li>
 *   <li>{@link RubyTL.ExpGet#getProperty <em>Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see RubyTL.RubyTLPackage#getExpGet()
 * @model
 * @generated
 */
public interface ExpGet extends Expression {
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
	 * @see RubyTL.RubyTLPackage#getExpGet_Source()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Expression getSource();

	/**
	 * Sets the value of the '{@link RubyTL.ExpGet#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Expression value);

	/**
	 * Returns the value of the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' attribute.
	 * @see #setProperty(Object)
	 * @see RubyTL.RubyTLPackage#getExpGet_Property()
	 * @model unique="false" dataType="PrimitiveTypes.String" ordered="false"
	 * @generated
	 */
	Object getProperty();

	/**
	 * Sets the value of the '{@link RubyTL.ExpGet#getProperty <em>Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' attribute.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(Object value);

} // ExpGet
