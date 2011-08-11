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
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hybrid.Module#getOperations <em>Operations</em>}</li>
 *   <li>{@link hybrid.Module#getSourceModels <em>Source Models</em>}</li>
 *   <li>{@link hybrid.Module#getTargetModels <em>Target Models</em>}</li>
 *   <li>{@link hybrid.Module#getRules <em>Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @see hybrid.HybridPackage#getModule()
 * @model
 * @generated
 */
public interface Module extends HybridElement {
	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link hybrid.Operation}.
	 * It is bidirectional and its opposite is '{@link hybrid.Operation#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see hybrid.HybridPackage#getModule_Operations()
	 * @see hybrid.Operation#getModule
	 * @model opposite="module" containment="true"
	 * @generated
	 */
	EList<Operation> getOperations();

	/**
	 * Returns the value of the '<em><b>Source Models</b></em>' containment reference list.
	 * The list contents are of type {@link hybrid.SourceModel}.
	 * It is bidirectional and its opposite is '{@link hybrid.SourceModel#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Models</em>' containment reference list.
	 * @see hybrid.HybridPackage#getModule_SourceModels()
	 * @see hybrid.SourceModel#getModule
	 * @model opposite="module" containment="true" required="true"
	 * @generated
	 */
	EList<SourceModel> getSourceModels();

	/**
	 * Returns the value of the '<em><b>Target Models</b></em>' containment reference list.
	 * The list contents are of type {@link hybrid.TargetModel}.
	 * It is bidirectional and its opposite is '{@link hybrid.TargetModel#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Models</em>' containment reference list.
	 * @see hybrid.HybridPackage#getModule_TargetModels()
	 * @see hybrid.TargetModel#getModule
	 * @model opposite="module" containment="true" required="true"
	 * @generated
	 */
	EList<TargetModel> getTargetModels();

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link hybrid.Rule}.
	 * It is bidirectional and its opposite is '{@link hybrid.Rule#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see hybrid.HybridPackage#getModule_Rules()
	 * @see hybrid.Rule#getModule
	 * @model opposite="module" containment="true" required="true"
	 * @generated
	 */
	EList<Rule> getRules();

} // Module
