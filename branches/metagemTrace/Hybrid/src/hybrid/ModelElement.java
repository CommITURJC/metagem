/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hybrid;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hybrid.ModelElement#getOwnedModel <em>Owned Model</em>}</li>
 *   <li>{@link hybrid.ModelElement#getChildElements <em>Child Elements</em>}</li>
 *   <li>{@link hybrid.ModelElement#getParentElement <em>Parent Element</em>}</li>
 *   <li>{@link hybrid.ModelElement#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see hybrid.HybridPackage#getModelElement()
 * @model
 * @generated
 */
public interface ModelElement extends HybridElement, ModelComponent {
	/**
	 * Returns the value of the '<em><b>Owned Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hybrid.Model#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Model</em>' container reference.
	 * @see #setOwnedModel(Model)
	 * @see hybrid.HybridPackage#getModelElement_OwnedModel()
	 * @see hybrid.Model#getElements
	 * @model opposite="elements" transient="false"
	 * @generated
	 */
	Model getOwnedModel();

	/**
	 * Sets the value of the '{@link hybrid.ModelElement#getOwnedModel <em>Owned Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Model</em>' container reference.
	 * @see #getOwnedModel()
	 * @generated
	 */
	void setOwnedModel(Model value);

	/**
	 * Returns the value of the '<em><b>Child Elements</b></em>' containment reference list.
	 * The list contents are of type {@link hybrid.ModelElement}.
	 * It is bidirectional and its opposite is '{@link hybrid.ModelElement#getParentElement <em>Parent Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Elements</em>' containment reference list.
	 * @see hybrid.HybridPackage#getModelElement_ChildElements()
	 * @see hybrid.ModelElement#getParentElement
	 * @model opposite="parentElement" containment="true"
	 * @generated
	 */
	EList<ModelElement> getChildElements();

	/**
	 * Returns the value of the '<em><b>Parent Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hybrid.ModelElement#getChildElements <em>Child Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Element</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Element</em>' container reference.
	 * @see #setParentElement(ModelElement)
	 * @see hybrid.HybridPackage#getModelElement_ParentElement()
	 * @see hybrid.ModelElement#getChildElements
	 * @model opposite="childElements" transient="false"
	 * @generated
	 */
	ModelElement getParentElement();

	/**
	 * Sets the value of the '{@link hybrid.ModelElement#getParentElement <em>Parent Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Element</em>' container reference.
	 * @see #getParentElement()
	 * @generated
	 */
	void setParentElement(ModelElement value);

	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link hybrid.ModelFeature}.
	 * It is bidirectional and its opposite is '{@link hybrid.ModelFeature#getOwnedElement <em>Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see hybrid.HybridPackage#getModelElement_Features()
	 * @see hybrid.ModelFeature#getOwnedElement
	 * @model opposite="ownedElement" containment="true"
	 * @generated
	 */
	EList<ModelFeature> getFeatures();

} // ModelElement
