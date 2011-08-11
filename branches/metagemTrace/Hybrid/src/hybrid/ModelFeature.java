/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hybrid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hybrid.ModelFeature#getOwnedElement <em>Owned Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see hybrid.HybridPackage#getModelFeature()
 * @model
 * @generated
 */
public interface ModelFeature extends ModelComponent {
	/**
	 * Returns the value of the '<em><b>Owned Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hybrid.ModelElement#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Element</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Element</em>' container reference.
	 * @see #setOwnedElement(ModelElement)
	 * @see hybrid.HybridPackage#getModelFeature_OwnedElement()
	 * @see hybrid.ModelElement#getFeatures
	 * @model opposite="features" required="true" transient="false"
	 * @generated
	 */
	ModelElement getOwnedElement();

	/**
	 * Sets the value of the '{@link hybrid.ModelFeature#getOwnedElement <em>Owned Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Element</em>' container reference.
	 * @see #getOwnedElement()
	 * @generated
	 */
	void setOwnedElement(ModelElement value);

} // ModelFeature
