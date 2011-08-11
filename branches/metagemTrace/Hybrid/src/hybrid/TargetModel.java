/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hybrid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hybrid.TargetModel#getModule <em>Module</em>}</li>
 * </ul>
 * </p>
 *
 * @see hybrid.HybridPackage#getTargetModel()
 * @model
 * @generated
 */
public interface TargetModel extends Model {
	/**
	 * Returns the value of the '<em><b>Module</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hybrid.Module#getTargetModels <em>Target Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' container reference.
	 * @see #setModule(Module)
	 * @see hybrid.HybridPackage#getTargetModel_Module()
	 * @see hybrid.Module#getTargetModels
	 * @model opposite="targetModels" required="true" transient="false"
	 * @generated
	 */
	Module getModule();

	/**
	 * Sets the value of the '{@link hybrid.TargetModel#getModule <em>Module</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' container reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(Module value);

} // TargetModel
