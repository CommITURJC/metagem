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
 * A representation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Traceability.ModelElement#getSourceElementLink <em>Source Element Link</em>}</li>
 *   <li>{@link Traceability.ModelElement#getTargetElementLink <em>Target Element Link</em>}</li>
 * </ul>
 * </p>
 *
 * @see Traceability.TraceabilityPackage#getModelElement()
 * @model abstract="true"
 * @generated
 */
public interface ModelElement extends TraceElement {
	/**
	 * Returns the value of the '<em><b>Source Element Link</b></em>' reference list.
	 * The list contents are of type {@link Traceability.SourceElement}.
	 * It is bidirectional and its opposite is '{@link Traceability.SourceElement#getElementModel <em>Element Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Element Link</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Element Link</em>' reference list.
	 * @see Traceability.TraceabilityPackage#getModelElement_SourceElementLink()
	 * @see Traceability.SourceElement#getElementModel
	 * @model opposite="elementModel"
	 * @generated
	 */
	EList<SourceElement> getSourceElementLink();

	/**
	 * Returns the value of the '<em><b>Target Element Link</b></em>' reference list.
	 * The list contents are of type {@link Traceability.TargetElement}.
	 * It is bidirectional and its opposite is '{@link Traceability.TargetElement#getElementModel <em>Element Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Element Link</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Element Link</em>' reference list.
	 * @see Traceability.TraceabilityPackage#getModelElement_TargetElementLink()
	 * @see Traceability.TargetElement#getElementModel
	 * @model opposite="elementModel"
	 * @generated
	 */
	EList<TargetElement> getTargetElementLink();

} // ModelElement
