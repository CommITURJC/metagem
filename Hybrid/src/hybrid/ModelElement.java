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
 *   <li>{@link hybrid.ModelElement#getContains <em>Contains</em>}</li>
 *   <li>{@link hybrid.ModelElement#getIsContained <em>Is Contained</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Contains</b></em>' reference list.
	 * The list contents are of type {@link hybrid.ModelElement}.
	 * It is bidirectional and its opposite is '{@link hybrid.ModelElement#getIsContained <em>Is Contained</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' reference list.
	 * @see hybrid.HybridPackage#getModelElement_Contains()
	 * @see hybrid.ModelElement#getIsContained
	 * @model opposite="isContained"
	 * @generated
	 */
	EList<ModelElement> getContains();

	/**
	 * Returns the value of the '<em><b>Is Contained</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link hybrid.ModelElement#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Contained</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Contained</em>' reference.
	 * @see #setIsContained(ModelElement)
	 * @see hybrid.HybridPackage#getModelElement_IsContained()
	 * @see hybrid.ModelElement#getContains
	 * @model opposite="contains"
	 * @generated
	 */
	ModelElement getIsContained();

	/**
	 * Sets the value of the '{@link hybrid.ModelElement#getIsContained <em>Is Contained</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Contained</em>' reference.
	 * @see #getIsContained()
	 * @generated
	 */
	void setIsContained(ModelElement value);

} // ModelElement
