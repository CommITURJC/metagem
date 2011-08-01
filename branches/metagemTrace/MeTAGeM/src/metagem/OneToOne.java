/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metagem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>One To One</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link metagem.OneToOne#getSource <em>Source</em>}</li>
 *   <li>{@link metagem.OneToOne#getTarget <em>Target</em>}</li>
 *   <li>{@link metagem.OneToOne#getOwnedElement <em>Owned Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see metagem.MetagemPackage#getOneToOne()
 * @model
 * @generated
 */
public interface OneToOne extends Relations {
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
	 * @see metagem.MetagemPackage#getOneToOne_Source()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SourceElement getSource();

	/**
	 * Sets the value of the '{@link metagem.OneToOne#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(SourceElement value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(TargetElement)
	 * @see metagem.MetagemPackage#getOneToOne_Target()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TargetElement getTarget();

	/**
	 * Sets the value of the '{@link metagem.OneToOne#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TargetElement value);

	/**
	 * Returns the value of the '<em><b>Owned Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link metagem.TargetElement#getOneToOne <em>One To One</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Element</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Element</em>' container reference.
	 * @see #setOwnedElement(TargetElement)
	 * @see metagem.MetagemPackage#getOneToOne_OwnedElement()
	 * @see metagem.TargetElement#getOneToOne
	 * @model opposite="oneToOne" transient="false"
	 * @generated
	 */
	TargetElement getOwnedElement();

	/**
	 * Sets the value of the '{@link metagem.OneToOne#getOwnedElement <em>Owned Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Element</em>' container reference.
	 * @see #getOwnedElement()
	 * @generated
	 */
	void setOwnedElement(TargetElement value);

} // OneToOne
