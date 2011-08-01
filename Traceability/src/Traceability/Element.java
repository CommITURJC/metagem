/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Traceability;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Traceability.Element#getFeatures <em>Features</em>}</li>
 *   <li>{@link Traceability.Element#getModel <em>Model</em>}</li>
 *   <li>{@link Traceability.Element#getChild_element <em>Child element</em>}</li>
 *   <li>{@link Traceability.Element#getSuper_element <em>Super element</em>}</li>
 * </ul>
 * </p>
 *
 * @see Traceability.TraceabilityPackage#getElement()
 * @model
 * @generated
 */
public interface Element extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Traceability.Model#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' container reference.
	 * @see #setModel(Model)
	 * @see Traceability.TraceabilityPackage#getElement_Model()
	 * @see Traceability.Model#getElements
	 * @model opposite="elements" transient="false"
	 * @generated
	 */
	Model getModel();

	/**
	 * Sets the value of the '{@link Traceability.Element#getModel <em>Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' container reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(Model value);

	/**
	 * Returns the value of the '<em><b>Child element</b></em>' containment reference list.
	 * The list contents are of type {@link Traceability.Element}.
	 * It is bidirectional and its opposite is '{@link Traceability.Element#getSuper_element <em>Super element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child element</em>' containment reference list.
	 * @see Traceability.TraceabilityPackage#getElement_Child_element()
	 * @see Traceability.Element#getSuper_element
	 * @model opposite="super_element" containment="true"
	 * @generated
	 */
	EList<Element> getChild_element();

	/**
	 * Returns the value of the '<em><b>Super element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Traceability.Element#getChild_element <em>Child element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super element</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super element</em>' container reference.
	 * @see #setSuper_element(Element)
	 * @see Traceability.TraceabilityPackage#getElement_Super_element()
	 * @see Traceability.Element#getChild_element
	 * @model opposite="child_element" transient="false"
	 * @generated
	 */
	Element getSuper_element();

	/**
	 * Sets the value of the '{@link Traceability.Element#getSuper_element <em>Super element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super element</em>' container reference.
	 * @see #getSuper_element()
	 * @generated
	 */
	void setSuper_element(Element value);

	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link Traceability.Feature}.
	 * It is bidirectional and its opposite is '{@link Traceability.Feature#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see Traceability.TraceabilityPackage#getElement_Features()
	 * @see Traceability.Feature#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Feature> getFeatures();

} // Element
