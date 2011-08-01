/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metagem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link metagem.ModelFeature#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see metagem.MetagemPackage#getModelFeature()
 * @model
 * @generated
 */
public interface ModelFeature extends ModelComponent {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link metagem.ModelElement#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(ModelElement)
	 * @see metagem.MetagemPackage#getModelFeature_Parent()
	 * @see metagem.ModelElement#getFeatures
	 * @model opposite="features" required="true" transient="false"
	 * @generated
	 */
	ModelElement getParent();

	/**
	 * Sets the value of the '{@link metagem.ModelFeature#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(ModelElement value);

} // ModelFeature
