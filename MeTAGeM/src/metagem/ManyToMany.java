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
 * A representation of the model object '<em><b>Many To Many</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link metagem.ManyToMany#getTarget <em>Target</em>}</li>
 *   <li>{@link metagem.ManyToMany#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see metagem.MetagemPackage#getManyToMany()
 * @model
 * @generated
 */
public interface ManyToMany extends Relations {
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
	 * @see metagem.MetagemPackage#getManyToMany_Target()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TargetElement> getTarget();

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
	 * @see metagem.MetagemPackage#getManyToMany_Source()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SourceElement> getSource();

} // ManyToMany
