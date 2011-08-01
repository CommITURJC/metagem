/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Traceability;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Traceability.Feature#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see Traceability.TraceabilityPackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Traceability.Element#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Element)
	 * @see Traceability.TraceabilityPackage#getFeature_Parent()
	 * @see Traceability.Element#getFeatures
	 * @model opposite="features" required="true" transient="false"
	 * @generated
	 */
	Element getParent();

	/**
	 * Sets the value of the '{@link Traceability.Feature#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Element value);

} // Feature
