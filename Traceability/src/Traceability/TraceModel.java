/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Traceability;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Traceability.TraceModel#getTraceLinks <em>Trace Links</em>}</li>
 *   <li>{@link Traceability.TraceModel#getSourceModels <em>Source Models</em>}</li>
 *   <li>{@link Traceability.TraceModel#getTargetModels <em>Target Models</em>}</li>
 * </ul>
 * </p>
 *
 * @see Traceability.TraceabilityPackage#getTraceModel()
 * @model
 * @generated
 */
public interface TraceModel extends Element {
	/**
	 * Returns the value of the '<em><b>Trace Links</b></em>' containment reference list.
	 * The list contents are of type {@link Traceability.TraceLink}.
	 * It is bidirectional and its opposite is '{@link Traceability.TraceLink#getTraceModel <em>Trace Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trace Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace Links</em>' containment reference list.
	 * @see Traceability.TraceabilityPackage#getTraceModel_TraceLinks()
	 * @see Traceability.TraceLink#getTraceModel
	 * @model opposite="traceModel" containment="true" required="true"
	 * @generated
	 */
	EList<TraceLink> getTraceLinks();

	/**
	 * Returns the value of the '<em><b>Source Models</b></em>' containment reference list.
	 * The list contents are of type {@link Traceability.SourceModel}.
	 * It is bidirectional and its opposite is '{@link Traceability.SourceModel#getTraceModel <em>Trace Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Models</em>' containment reference list.
	 * @see Traceability.TraceabilityPackage#getTraceModel_SourceModels()
	 * @see Traceability.SourceModel#getTraceModel
	 * @model opposite="traceModel" containment="true" required="true"
	 * @generated
	 */
	EList<SourceModel> getSourceModels();

	/**
	 * Returns the value of the '<em><b>Target Models</b></em>' containment reference list.
	 * The list contents are of type {@link Traceability.TargetModel}.
	 * It is bidirectional and its opposite is '{@link Traceability.TargetModel#getTraceModel <em>Trace Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Models</em>' containment reference list.
	 * @see Traceability.TraceabilityPackage#getTraceModel_TargetModels()
	 * @see Traceability.TargetModel#getTraceModel
	 * @model opposite="traceModel" containment="true" required="true"
	 * @generated
	 */
	EList<TargetModel> getTargetModels();

} // TraceModel
