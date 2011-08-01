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
 * A representation of the model object '<em><b>Target Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link metagem.TargetElement#getZeroToOne <em>Zero To One</em>}</li>
 *   <li>{@link metagem.TargetElement#getOneToOne <em>One To One</em>}</li>
 *   <li>{@link metagem.TargetElement#getManyToOne <em>Many To One</em>}</li>
 * </ul>
 * </p>
 *
 * @see metagem.MetagemPackage#getTargetElement()
 * @model
 * @generated
 */
public interface TargetElement extends RelationElement {
	/**
	 * Returns the value of the '<em><b>Zero To One</b></em>' containment reference list.
	 * The list contents are of type {@link metagem.ZeroToOne}.
	 * It is bidirectional and its opposite is '{@link metagem.ZeroToOne#getOwnedElement <em>Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zero To One</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zero To One</em>' containment reference list.
	 * @see metagem.MetagemPackage#getTargetElement_ZeroToOne()
	 * @see metagem.ZeroToOne#getOwnedElement
	 * @model opposite="ownedElement" containment="true"
	 * @generated
	 */
	EList<ZeroToOne> getZeroToOne();

	/**
	 * Returns the value of the '<em><b>One To One</b></em>' containment reference list.
	 * The list contents are of type {@link metagem.OneToOne}.
	 * It is bidirectional and its opposite is '{@link metagem.OneToOne#getOwnedElement <em>Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>One To One</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>One To One</em>' containment reference list.
	 * @see metagem.MetagemPackage#getTargetElement_OneToOne()
	 * @see metagem.OneToOne#getOwnedElement
	 * @model opposite="ownedElement" containment="true"
	 * @generated
	 */
	EList<OneToOne> getOneToOne();

	/**
	 * Returns the value of the '<em><b>Many To One</b></em>' containment reference list.
	 * The list contents are of type {@link metagem.ManyToOne}.
	 * It is bidirectional and its opposite is '{@link metagem.ManyToOne#getOwnedElement <em>Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Many To One</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Many To One</em>' containment reference list.
	 * @see metagem.MetagemPackage#getTargetElement_ManyToOne()
	 * @see metagem.ManyToOne#getOwnedElement
	 * @model opposite="ownedElement" containment="true"
	 * @generated
	 */
	EList<ManyToOne> getManyToOne();

} // TargetElement
