/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ETL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ETL.Binding#getRule <em>Rule</em>}</li>
 *   <li>{@link ETL.Binding#getSource <em>Source</em>}</li>
 *   <li>{@link ETL.Binding#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see ETL.ETLPackage#getBinding()
 * @model
 * @generated
 */
public interface Binding extends EObject {
	/**
	 * Returns the value of the '<em><b>Rule</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ETL.TransformationRule#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' container reference.
	 * @see #setRule(TransformationRule)
	 * @see ETL.ETLPackage#getBinding_Rule()
	 * @see ETL.TransformationRule#getBindings
	 * @model opposite="bindings" required="true" transient="false"
	 * @generated
	 */
	TransformationRule getRule();

	/**
	 * Sets the value of the '{@link ETL.Binding#getRule <em>Rule</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' container reference.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(TransformationRule value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(Statement)
	 * @see ETL.ETLPackage#getBinding_Source()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Statement getSource();

	/**
	 * Sets the value of the '{@link ETL.Binding#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Statement value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(Statement)
	 * @see ETL.ETLPackage#getBinding_Target()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Statement getTarget();

	/**
	 * Sets the value of the '{@link ETL.Binding#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Statement value);

} // Binding
