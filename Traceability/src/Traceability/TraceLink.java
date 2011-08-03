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
 * A representation of the model object '<em><b>Trace Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Traceability.TraceLink#getTraceModel <em>Trace Model</em>}</li>
 *   <li>{@link Traceability.TraceLink#getSource <em>Source</em>}</li>
 *   <li>{@link Traceability.TraceLink#getTarget <em>Target</em>}</li>
 *   <li>{@link Traceability.TraceLink#getOperation <em>Operation</em>}</li>
 *   <li>{@link Traceability.TraceLink#getChildLinks <em>Child Links</em>}</li>
 *   <li>{@link Traceability.TraceLink#getParentLink <em>Parent Link</em>}</li>
 * </ul>
 * </p>
 *
 * @see Traceability.TraceabilityPackage#getTraceLink()
 * @model
 * @generated
 */
public interface TraceLink extends TraceElement {
	/**
	 * Returns the value of the '<em><b>Trace Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Traceability.TraceModel#getTraceLinks <em>Trace Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trace Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace Model</em>' container reference.
	 * @see #setTraceModel(TraceModel)
	 * @see Traceability.TraceabilityPackage#getTraceLink_TraceModel()
	 * @see Traceability.TraceModel#getTraceLinks
	 * @model opposite="traceLinks" transient="false"
	 * @generated
	 */
	TraceModel getTraceModel();

	/**
	 * Sets the value of the '{@link Traceability.TraceLink#getTraceModel <em>Trace Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace Model</em>' container reference.
	 * @see #getTraceModel()
	 * @generated
	 */
	void setTraceModel(TraceModel value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference list.
	 * The list contents are of type {@link Traceability.SourceElement}.
	 * It is bidirectional and its opposite is '{@link Traceability.SourceElement#getSource_traceLinks <em>Source trace Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference list.
	 * @see Traceability.TraceabilityPackage#getTraceLink_Source()
	 * @see Traceability.SourceElement#getSource_traceLinks
	 * @model opposite="source_traceLinks" containment="true" required="true"
	 * @generated
	 */
	EList<SourceElement> getSource();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference list.
	 * The list contents are of type {@link Traceability.TargetElement}.
	 * It is bidirectional and its opposite is '{@link Traceability.TargetElement#getTarget_traceLinks <em>Target trace Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference list.
	 * @see Traceability.TraceabilityPackage#getTraceLink_Target()
	 * @see Traceability.TargetElement#getTarget_traceLinks
	 * @model opposite="target_traceLinks" containment="true" required="true"
	 * @generated
	 */
	EList<TargetElement> getTarget();

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link Traceability.Operations}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see Traceability.Operations
	 * @see #setOperation(Operations)
	 * @see Traceability.TraceabilityPackage#getTraceLink_Operation()
	 * @model default="" required="true"
	 * @generated
	 */
	Operations getOperation();

	/**
	 * Sets the value of the '{@link Traceability.TraceLink#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see Traceability.Operations
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(Operations value);

	/**
	 * Returns the value of the '<em><b>Child Links</b></em>' containment reference list.
	 * The list contents are of type {@link Traceability.TraceLink}.
	 * It is bidirectional and its opposite is '{@link Traceability.TraceLink#getParentLink <em>Parent Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Links</em>' containment reference list.
	 * @see Traceability.TraceabilityPackage#getTraceLink_ChildLinks()
	 * @see Traceability.TraceLink#getParentLink
	 * @model opposite="parentLink" containment="true"
	 * @generated
	 */
	EList<TraceLink> getChildLinks();

	/**
	 * Returns the value of the '<em><b>Parent Link</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Traceability.TraceLink#getChildLinks <em>Child Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Link</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Link</em>' container reference.
	 * @see #setParentLink(TraceLink)
	 * @see Traceability.TraceabilityPackage#getTraceLink_ParentLink()
	 * @see Traceability.TraceLink#getChildLinks
	 * @model opposite="childLinks" transient="false"
	 * @generated
	 */
	TraceLink getParentLink();

	/**
	 * Sets the value of the '{@link Traceability.TraceLink#getParentLink <em>Parent Link</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Link</em>' container reference.
	 * @see #getParentLink()
	 * @generated
	 */
	void setParentLink(TraceLink value);

} // TraceLink
