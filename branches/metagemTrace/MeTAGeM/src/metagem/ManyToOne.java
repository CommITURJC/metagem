/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metagem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Many To One</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link metagem.ManyToOne#getTarget <em>Target</em>}</li>
 *   <li>{@link metagem.ManyToOne#getSource <em>Source</em>}</li>
 *   <li>{@link metagem.ManyToOne#getOwnedElement <em>Owned Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see metagem.MetagemPackage#getManyToOne()
 * @model
 * @generated
 */
public interface ManyToOne extends Relations {
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
	 * @see metagem.MetagemPackage#getManyToOne_Target()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TargetElement getTarget();

	/**
	 * Sets the value of the '{@link metagem.ManyToOne#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TargetElement value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference list.
	 * The list contents are of type {@link metagem.SourceElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference list.
	 * @see metagem.MetagemPackage#getManyToOne_Source()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SourceElement> getSource();

	/**
	 * Returns the value of the '<em><b>Owned Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link metagem.TargetElement#getManyToOne <em>Many To One</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Element</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Element</em>' container reference.
	 * @see #setOwnedElement(TargetElement)
	 * @see metagem.MetagemPackage#getManyToOne_OwnedElement()
	 * @see metagem.TargetElement#getManyToOne
	 * @model opposite="ManyToOne" transient="false"
	 * @generated
	 */
	TargetElement getOwnedElement();

	/**
	 * Sets the value of the '{@link metagem.ManyToOne#getOwnedElement <em>Owned Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Element</em>' container reference.
	 * @see #getOwnedElement()
	 * @generated
	 */
	void setOwnedElement(TargetElement value);

} // ManyToOne
