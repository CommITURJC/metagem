/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ETL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ETL.ETLPackage
 * @generated
 */
public interface ETLFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ETLFactory eINSTANCE = ETL.impl.ETLFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Etl Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Etl Module</em>'.
	 * @generated
	 */
	EtlModule createEtlModule();

	/**
	 * Returns a new object of class '<em>Eol Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eol Block</em>'.
	 * @generated
	 */
	EolBlock createEolBlock();

	/**
	 * Returns a new object of class '<em>Transformation Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transformation Rule</em>'.
	 * @generated
	 */
	TransformationRule createTransformationRule();

	/**
	 * Returns a new object of class '<em>Guard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Guard</em>'.
	 * @generated
	 */
	Guard createGuard();

	/**
	 * Returns a new object of class '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element</em>'.
	 * @generated
	 */
	Element createElement();

	/**
	 * Returns a new object of class '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation</em>'.
	 * @generated
	 */
	Operation createOperation();

	/**
	 * Returns a new object of class '<em>Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binding</em>'.
	 * @generated
	 */
	Binding createBinding();

	/**
	 * Returns a new object of class '<em>Simple Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Statement</em>'.
	 * @generated
	 */
	SimpleStatement createSimpleStatement();

	/**
	 * Returns a new object of class '<em>Operation Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Statement</em>'.
	 * @generated
	 */
	OperationStatement createOperationStatement();

	/**
	 * Returns a new object of class '<em>Operation Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Parameter</em>'.
	 * @generated
	 */
	OperationParameter createOperationParameter();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ETLPackage getETLPackage();

} //ETLFactory
