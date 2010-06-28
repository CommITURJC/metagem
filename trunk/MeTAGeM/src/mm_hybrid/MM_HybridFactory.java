/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm_hybrid;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see mm_hybrid.MM_HybridPackage
 * @generated
 */
public interface MM_HybridFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MM_HybridFactory eINSTANCE = mm_hybrid.impl.MM_HybridFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module</em>'.
	 * @generated
	 */
	Module createModule();

	/**
	 * Returns a new object of class '<em>In Meta Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>In Meta Model</em>'.
	 * @generated
	 */
	InMetaModel createInMetaModel();

	/**
	 * Returns a new object of class '<em>Out Meta Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Out Meta Model</em>'.
	 * @generated
	 */
	OutMetaModel createOutMetaModel();

	/**
	 * Returns a new object of class '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule</em>'.
	 * @generated
	 */
	Rule createRule();

	/**
	 * Returns a new object of class '<em>Source Element Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Element Rule</em>'.
	 * @generated
	 */
	SourceElementRule createSourceElementRule();

	/**
	 * Returns a new object of class '<em>Target Element Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Target Element Rule</em>'.
	 * @generated
	 */
	TargetElementRule createTargetElementRule();

	/**
	 * Returns a new object of class '<em>Element Included</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Included</em>'.
	 * @generated
	 */
	ElementIncluded createElementIncluded();

	/**
	 * Returns a new object of class '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition</em>'.
	 * @generated
	 */
	Condition createCondition();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MM_HybridPackage getMM_HybridPackage();

} //MM_HybridFactory
