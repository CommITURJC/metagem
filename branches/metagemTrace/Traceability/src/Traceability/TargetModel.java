/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Traceability;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Traceability.TargetModel#getTraceModel <em>Trace Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see Traceability.TraceabilityPackage#getTargetModel()
 * @model
 * @generated
 */
public interface TargetModel extends Model {
	/**
	 * Returns the value of the '<em><b>Trace Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Traceability.TraceModel#getTargetModels <em>Target Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trace Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace Model</em>' container reference.
	 * @see #setTraceModel(TraceModel)
	 * @see Traceability.TraceabilityPackage#getTargetModel_TraceModel()
	 * @see Traceability.TraceModel#getTargetModels
	 * @model opposite="targetModels" required="true" transient="false"
	 * @generated
	 */
	TraceModel getTraceModel();

	/**
	 * Sets the value of the '{@link Traceability.TargetModel#getTraceModel <em>Trace Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace Model</em>' container reference.
	 * @see #getTraceModel()
	 * @generated
	 */
	void setTraceModel(TraceModel value);

} // TargetModel
