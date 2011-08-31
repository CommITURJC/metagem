/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metagem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link metagem.SourceElement#getInvokes <em>Invokes</em>}</li>
 * </ul>
 * </p>
 *
 * @see metagem.MetagemPackage#getSourceElement()
 * @model
 * @generated
 */
public interface SourceElement extends RelationElement {

	/**
	 * Returns the value of the '<em><b>Invokes</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link metagem.Relations#getIsInvoked <em>Is Invoked</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invokes</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invokes</em>' reference.
	 * @see #setInvokes(Relations)
	 * @see metagem.MetagemPackage#getSourceElement_Invokes()
	 * @see metagem.Relations#getIsInvoked
	 * @model opposite="isInvoked"
	 * @generated
	 */
	Relations getInvokes();

	/**
	 * Sets the value of the '{@link metagem.SourceElement#getInvokes <em>Invokes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invokes</em>' reference.
	 * @see #getInvokes()
	 * @generated
	 */
	void setInvokes(Relations value);
} // SourceElement
