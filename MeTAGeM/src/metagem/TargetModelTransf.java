/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metagem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target Model Transf</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link metagem.TargetModelTransf#getOwnedElement <em>Owned Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see metagem.MetagemPackage#getTargetModelTransf()
 * @model
 * @generated
 */
public interface TargetModelTransf extends ModelTransf {
	/**
	 * Returns the value of the '<em><b>Owned Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link metagem.ModelRoot#getTargetModels <em>Target Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Element</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Element</em>' container reference.
	 * @see #setOwnedElement(ModelRoot)
	 * @see metagem.MetagemPackage#getTargetModelTransf_OwnedElement()
	 * @see metagem.ModelRoot#getTargetModels
	 * @model opposite="targetModels" required="true" transient="false"
	 * @generated
	 */
	ModelRoot getOwnedElement();

	/**
	 * Sets the value of the '{@link metagem.TargetModelTransf#getOwnedElement <em>Owned Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Element</em>' container reference.
	 * @see #getOwnedElement()
	 * @generated
	 */
	void setOwnedElement(ModelRoot value);

} // TargetModelTransf
