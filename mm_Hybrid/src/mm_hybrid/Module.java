/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm_hybrid;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mm_hybrid.Module#getName_module <em>Name module</em>}</li>
 *   <li>{@link mm_hybrid.Module#getRule <em>Rule</em>}</li>
 *   <li>{@link mm_hybrid.Module#getInMM <em>In MM</em>}</li>
 *   <li>{@link mm_hybrid.Module#getOutMM <em>Out MM</em>}</li>
 *   <li>{@link mm_hybrid.Module#getOperations <em>Operations</em>}</li>
 * </ul>
 * </p>
 *
 * @see mm_hybrid.MM_HybridPackage#getModule()
 * @model annotation="gmf.diagram foo='bar'"
 * @generated
 */
public interface Module extends EObject {
	/**
	 * Returns the value of the '<em><b>Name module</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name module</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name module</em>' attribute.
	 * @see #setName_module(String)
	 * @see mm_hybrid.MM_HybridPackage#getModule_Name_module()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getName_module();

	/**
	 * Sets the value of the '{@link mm_hybrid.Module#getName_module <em>Name module</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name module</em>' attribute.
	 * @see #getName_module()
	 * @generated
	 */
	void setName_module(String value);

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' containment reference list.
	 * The list contents are of type {@link mm_hybrid.Rule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' containment reference list.
	 * @see mm_hybrid.MM_HybridPackage#getModule_Rule()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Rule> getRule();

	/**
	 * Returns the value of the '<em><b>In MM</b></em>' containment reference list.
	 * The list contents are of type {@link mm_hybrid.InMetaModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In MM</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In MM</em>' containment reference list.
	 * @see mm_hybrid.MM_HybridPackage#getModule_InMM()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<InMetaModel> getInMM();

	/**
	 * Returns the value of the '<em><b>Out MM</b></em>' containment reference list.
	 * The list contents are of type {@link mm_hybrid.OutMetaModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out MM</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out MM</em>' containment reference list.
	 * @see mm_hybrid.MM_HybridPackage#getModule_OutMM()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<OutMetaModel> getOutMM();

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link mm_hybrid.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see mm_hybrid.MM_HybridPackage#getModule_Operations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operation> getOperations();

} // Module
