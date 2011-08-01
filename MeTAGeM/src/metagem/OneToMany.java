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
 * A representation of the model object '<em><b>One To Many</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link metagem.OneToMany#getSource <em>Source</em>}</li>
 *   <li>{@link metagem.OneToMany#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see metagem.MetagemPackage#getOneToMany()
 * @model
 * @generated
 */
public interface OneToMany extends Relations {
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
	 * @see metagem.MetagemPackage#getOneToMany_Source()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SourceElement getSource();

	/**
	 * Sets the value of the '{@link metagem.OneToMany#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(SourceElement value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference list.
	 * The list contents are of type {@link metagem.TargetElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference list.
	 * @see metagem.MetagemPackage#getOneToMany_Target()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TargetElement> getTarget();

} // OneToMany
