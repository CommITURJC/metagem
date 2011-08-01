/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metagem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>One To Zero</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link metagem.OneToZero#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see metagem.MetagemPackage#getOneToZero()
 * @model
 * @generated
 */
public interface OneToZero extends Relations {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(SourceElement)
	 * @see metagem.MetagemPackage#getOneToZero_Source()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SourceElement getSource();

	/**
	 * Sets the value of the '{@link metagem.OneToZero#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(SourceElement value);

} // OneToZero
