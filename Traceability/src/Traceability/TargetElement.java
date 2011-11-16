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
 * A representation of the model object '<em><b>Target Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Traceability.TargetElement#getTarget_traceLinks <em>Target trace Links</em>}</li>
 *   <li>{@link Traceability.TargetElement#getElementModel <em>Element Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see Traceability.TraceabilityPackage#getTargetElement()
 * @model
 * @generated
 */
public interface TargetElement extends TraceElement {
	/**
	 * Returns the value of the '<em><b>Target trace Links</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Traceability.TraceLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target trace Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target trace Links</em>' container reference.
	 * @see #setTarget_traceLinks(TraceLink)
	 * @see Traceability.TraceabilityPackage#getTargetElement_Target_traceLinks()
	 * @see Traceability.TraceLink#getTarget
	 * @model opposite="target" required="true" transient="false"
	 * @generated
	 */
	TraceLink getTarget_traceLinks();

	/**
	 * Sets the value of the '{@link Traceability.TargetElement#getTarget_traceLinks <em>Target trace Links</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target trace Links</em>' container reference.
	 * @see #getTarget_traceLinks()
	 * @generated
	 */
	void setTarget_traceLinks(TraceLink value);

	/**
	 * Returns the value of the '<em><b>Element Model</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Traceability.ModelElement#getTargetElementLink <em>Target Element Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Model</em>' reference.
	 * @see #setElementModel(ModelElement)
	 * @see Traceability.TraceabilityPackage#getTargetElement_ElementModel()
	 * @see Traceability.ModelElement#getTargetElementLink
	 * @model opposite="targetElementLink"
	 * @generated
	 */
	ModelElement getElementModel();

	/**
	 * Sets the value of the '{@link Traceability.TargetElement#getElementModel <em>Element Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Model</em>' reference.
	 * @see #getElementModel()
	 * @generated
	 */
	void setElementModel(ModelElement value);

} // TargetElement
