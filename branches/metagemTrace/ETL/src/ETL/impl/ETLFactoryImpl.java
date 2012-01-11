/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ETL.impl;

import ETL.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ETLFactoryImpl extends EFactoryImpl implements ETLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ETLFactory init() {
		try {
			ETLFactory theETLFactory = (ETLFactory)EPackage.Registry.INSTANCE.getEFactory("http://org.eclipse.kybele.metagem.ETL"); 
			if (theETLFactory != null) {
				return theETLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ETLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETLFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ETLPackage.ETL_MODULE: return createEtlModule();
			case ETLPackage.EOL_BLOCK: return createEolBlock();
			case ETLPackage.TRANSFORMATION_RULE: return createTransformationRule();
			case ETLPackage.GUARD: return createGuard();
			case ETLPackage.ELEMENT: return createElement();
			case ETLPackage.OPERATION: return createOperation();
			case ETLPackage.BINDING: return createBinding();
			case ETLPackage.SIMPLE_STATEMENT: return createSimpleStatement();
			case ETLPackage.OPERATION_STATEMENT: return createOperationStatement();
			case ETLPackage.OPERATION_PARAMETER: return createOperationParameter();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EtlModule createEtlModule() {
		EtlModuleImpl etlModule = new EtlModuleImpl();
		return etlModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EolBlock createEolBlock() {
		EolBlockImpl eolBlock = new EolBlockImpl();
		return eolBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationRule createTransformationRule() {
		TransformationRuleImpl transformationRule = new TransformationRuleImpl();
		return transformationRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Guard createGuard() {
		GuardImpl guard = new GuardImpl();
		return guard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element createElement() {
		ElementImpl element = new ElementImpl();
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binding createBinding() {
		BindingImpl binding = new BindingImpl();
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleStatement createSimpleStatement() {
		SimpleStatementImpl simpleStatement = new SimpleStatementImpl();
		return simpleStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationStatement createOperationStatement() {
		OperationStatementImpl operationStatement = new OperationStatementImpl();
		return operationStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationParameter createOperationParameter() {
		OperationParameterImpl operationParameter = new OperationParameterImpl();
		return operationParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETLPackage getETLPackage() {
		return (ETLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ETLPackage getPackage() {
		return ETLPackage.eINSTANCE;
	}

} //ETLFactoryImpl
