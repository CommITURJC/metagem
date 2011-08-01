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
 * A representation of the model object '<em><b>Source Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Traceability.SourceElement#getSource_traceLinks <em>Source trace Links</em>}</li>
 *   <li>{@link Traceability.SourceElement#getElementModel <em>Element Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see Traceability.TraceabilityPackage#getSourceElement()
 * @model
 * @generated
 */
public interface SourceElement extends TraceElement {
	/**
	 * Returns the value of the '<em><b>Source trace Links</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Traceability.TraceLink#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source trace Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source trace Links</em>' container reference.
	 * @see #setSource_traceLinks(TraceLink)
	 * @see Traceability.TraceabilityPackage#getSourceElement_Source_traceLinks()
	 * @see Traceability.TraceLink#getSource
	 * @model opposite="source" required="true" transient="false"
	 * @generated
	 */
	TraceLink getSource_traceLinks();

	/**
	 * Sets the value of the '{@link Traceability.SourceElement#getSource_traceLinks <em>Source trace Links</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source trace Links</em>' container reference.
	 * @see #getSource_traceLinks()
	 * @generated
	 */
	void setSource_traceLinks(TraceLink value);

	/**
	 * Returns the value of the '<em><b>Element Model</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link Traceability.ModelElement#getSourceElementLink <em>Source Element Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Model</em>' reference.
	 * @see #setElementModel(ModelElement)
	 * @see Traceability.TraceabilityPackage#getSourceElement_ElementModel()
	 * @see Traceability.ModelElement#getSourceElementLink
	 * @model opposite="sourceElementLink" required="true"
	 * @generated
	 */
	ModelElement getElementModel();

	/**
	 * Sets the value of the '{@link Traceability.SourceElement#getElementModel <em>Element Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Model</em>' reference.
	 * @see #getElementModel()
	 * @generated
	 */
	void setElementModel(ModelElement value);

} // SourceElement
