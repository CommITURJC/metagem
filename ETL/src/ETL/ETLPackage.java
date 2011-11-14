/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ETL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ETL.ETLFactory
 * @model kind="package"
 * @generated
 */
public interface ETLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ETL";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.eclipse.kybele.metagem.ETL";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "etl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ETLPackage eINSTANCE = ETL.impl.ETLPackageImpl.init();

	/**
	 * The meta object id for the '{@link ETL.impl.EtlElementImpl <em>Etl Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ETL.impl.EtlElementImpl
	 * @see ETL.impl.ETLPackageImpl#getEtlElement()
	 * @generated
	 */
	int ETL_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETL_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Etl Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETL_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ETL.impl.EtlModuleImpl <em>Etl Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ETL.impl.EtlModuleImpl
	 * @see ETL.impl.ETLPackageImpl#getEtlModule()
	 * @generated
	 */
	int ETL_MODULE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETL_MODULE__NAME = ETL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETL_MODULE__PRE = ETL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETL_MODULE__POST = ETL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETL_MODULE__RULES = ETL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETL_MODULE__OPERATIONS = ETL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Etl Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ETL_MODULE_FEATURE_COUNT = ETL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link ETL.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ETL.impl.BlockImpl
	 * @see ETL.impl.ETLPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__NAME = ETL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__BODY = ETL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = ETL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ETL.impl.EolBlockImpl <em>Eol Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ETL.impl.EolBlockImpl
	 * @see ETL.impl.ETLPackageImpl#getEolBlock()
	 * @generated
	 */
	int EOL_BLOCK = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_BLOCK__NAME = BLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_BLOCK__BODY = BLOCK__BODY;

	/**
	 * The feature id for the '<em><b>Post Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_BLOCK__POST_MODULE = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pre Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_BLOCK__PRE_MODULE = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Eol Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOL_BLOCK_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ETL.impl.TransformationRuleImpl <em>Transformation Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ETL.impl.TransformationRuleImpl
	 * @see ETL.impl.ETLPackageImpl#getTransformationRule()
	 * @generated
	 */
	int TRANSFORMATION_RULE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_RULE__NAME = ETL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_RULE__IS_ABSTRACT = ETL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_RULE__MODULE = ETL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lazy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_RULE__LAZY = ETL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Primary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_RULE__PRIMARY = ETL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Greedy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_RULE__GREEDY = ETL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_RULE__GUARD = ETL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_RULE__SOURCE = ETL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_RULE__TARGETS = ETL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_RULE__EXTENDS = ETL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Is Extended</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_RULE__IS_EXTENDED = ETL_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_RULE__BINDINGS = ETL_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Transformation Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_RULE_FEATURE_COUNT = ETL_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link ETL.impl.GuardImpl <em>Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ETL.impl.GuardImpl
	 * @see ETL.impl.ETLPackageImpl#getGuard()
	 * @generated
	 */
	int GUARD = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD__NAME = BLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD__BODY = BLOCK__BODY;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD__RULE = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ETL.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ETL.impl.ElementImpl
	 * @see ETL.impl.ETLPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = ETL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__CLASS_NAME = ETL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Metamodel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__METAMODEL = ETL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__SOURCE_RULE = ETL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Targets rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__TARGETS_RULE = ETL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = ETL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link ETL.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ETL.impl.OperationImpl
	 * @see ETL.impl.ETLPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = BLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__BODY = BLOCK__BODY;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__CONTEXT = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__RETURN = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__ANNOTATION = BLOCK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__MODULE = BLOCK_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link ETL.impl.BindingImpl <em>Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ETL.impl.BindingImpl
	 * @see ETL.impl.ETLPackageImpl#getBinding()
	 * @generated
	 */
	int BINDING = 7;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__RULE = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__TARGET = 2;

	/**
	 * The number of structural features of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link ETL.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ETL.impl.StatementImpl
	 * @see ETL.impl.ETLPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 11;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link ETL.impl.SimpleStatementImpl <em>Simple Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ETL.impl.SimpleStatementImpl
	 * @see ETL.impl.ETLPackageImpl#getSimpleStatement()
	 * @generated
	 */
	int SIMPLE_STATEMENT = 8;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_STATEMENT__ELEMENT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_STATEMENT__PROPERTY = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Simple Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ETL.impl.OperationStatementImpl <em>Operation Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ETL.impl.OperationStatementImpl
	 * @see ETL.impl.ETLPackageImpl#getOperationStatement()
	 * @generated
	 */
	int OPERATION_STATEMENT = 9;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_STATEMENT__OPERATOR = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_STATEMENT__PARAMETER1 = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameter2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_STATEMENT__PARAMETER2 = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Operation Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link ETL.EtlModule <em>Etl Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Etl Module</em>'.
	 * @see ETL.EtlModule
	 * @generated
	 */
	EClass getEtlModule();

	/**
	 * Returns the meta object for the containment reference '{@link ETL.EtlModule#getPre <em>Pre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pre</em>'.
	 * @see ETL.EtlModule#getPre()
	 * @see #getEtlModule()
	 * @generated
	 */
	EReference getEtlModule_Pre();

	/**
	 * Returns the meta object for the containment reference '{@link ETL.EtlModule#getPost <em>Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post</em>'.
	 * @see ETL.EtlModule#getPost()
	 * @see #getEtlModule()
	 * @generated
	 */
	EReference getEtlModule_Post();

	/**
	 * Returns the meta object for the containment reference list '{@link ETL.EtlModule#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see ETL.EtlModule#getRules()
	 * @see #getEtlModule()
	 * @generated
	 */
	EReference getEtlModule_Rules();

	/**
	 * Returns the meta object for the containment reference list '{@link ETL.EtlModule#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see ETL.EtlModule#getOperations()
	 * @see #getEtlModule()
	 * @generated
	 */
	EReference getEtlModule_Operations();

	/**
	 * Returns the meta object for class '{@link ETL.EolBlock <em>Eol Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eol Block</em>'.
	 * @see ETL.EolBlock
	 * @generated
	 */
	EClass getEolBlock();

	/**
	 * Returns the meta object for the container reference '{@link ETL.EolBlock#getPostModule <em>Post Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Post Module</em>'.
	 * @see ETL.EolBlock#getPostModule()
	 * @see #getEolBlock()
	 * @generated
	 */
	EReference getEolBlock_PostModule();

	/**
	 * Returns the meta object for the container reference '{@link ETL.EolBlock#getPreModule <em>Pre Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Pre Module</em>'.
	 * @see ETL.EolBlock#getPreModule()
	 * @see #getEolBlock()
	 * @generated
	 */
	EReference getEolBlock_PreModule();

	/**
	 * Returns the meta object for class '{@link ETL.TransformationRule <em>Transformation Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation Rule</em>'.
	 * @see ETL.TransformationRule
	 * @generated
	 */
	EClass getTransformationRule();

	/**
	 * Returns the meta object for the attribute '{@link ETL.TransformationRule#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see ETL.TransformationRule#isIsAbstract()
	 * @see #getTransformationRule()
	 * @generated
	 */
	EAttribute getTransformationRule_IsAbstract();

	/**
	 * Returns the meta object for the container reference '{@link ETL.TransformationRule#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Module</em>'.
	 * @see ETL.TransformationRule#getModule()
	 * @see #getTransformationRule()
	 * @generated
	 */
	EReference getTransformationRule_Module();

	/**
	 * Returns the meta object for the attribute '{@link ETL.TransformationRule#isLazy <em>Lazy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lazy</em>'.
	 * @see ETL.TransformationRule#isLazy()
	 * @see #getTransformationRule()
	 * @generated
	 */
	EAttribute getTransformationRule_Lazy();

	/**
	 * Returns the meta object for the attribute '{@link ETL.TransformationRule#isPrimary <em>Primary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primary</em>'.
	 * @see ETL.TransformationRule#isPrimary()
	 * @see #getTransformationRule()
	 * @generated
	 */
	EAttribute getTransformationRule_Primary();

	/**
	 * Returns the meta object for the attribute '{@link ETL.TransformationRule#isGreedy <em>Greedy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Greedy</em>'.
	 * @see ETL.TransformationRule#isGreedy()
	 * @see #getTransformationRule()
	 * @generated
	 */
	EAttribute getTransformationRule_Greedy();

	/**
	 * Returns the meta object for the containment reference '{@link ETL.TransformationRule#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Guard</em>'.
	 * @see ETL.TransformationRule#getGuard()
	 * @see #getTransformationRule()
	 * @generated
	 */
	EReference getTransformationRule_Guard();

	/**
	 * Returns the meta object for the containment reference '{@link ETL.TransformationRule#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see ETL.TransformationRule#getSource()
	 * @see #getTransformationRule()
	 * @generated
	 */
	EReference getTransformationRule_Source();

	/**
	 * Returns the meta object for the containment reference list '{@link ETL.TransformationRule#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Targets</em>'.
	 * @see ETL.TransformationRule#getTargets()
	 * @see #getTransformationRule()
	 * @generated
	 */
	EReference getTransformationRule_Targets();

	/**
	 * Returns the meta object for the reference list '{@link ETL.TransformationRule#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Extends</em>'.
	 * @see ETL.TransformationRule#getExtends()
	 * @see #getTransformationRule()
	 * @generated
	 */
	EReference getTransformationRule_Extends();

	/**
	 * Returns the meta object for the reference list '{@link ETL.TransformationRule#getIsExtended <em>Is Extended</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Extended</em>'.
	 * @see ETL.TransformationRule#getIsExtended()
	 * @see #getTransformationRule()
	 * @generated
	 */
	EReference getTransformationRule_IsExtended();

	/**
	 * Returns the meta object for the containment reference list '{@link ETL.TransformationRule#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
	 * @see ETL.TransformationRule#getBindings()
	 * @see #getTransformationRule()
	 * @generated
	 */
	EReference getTransformationRule_Bindings();

	/**
	 * Returns the meta object for class '{@link ETL.EtlElement <em>Etl Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Etl Element</em>'.
	 * @see ETL.EtlElement
	 * @generated
	 */
	EClass getEtlElement();

	/**
	 * Returns the meta object for the attribute '{@link ETL.EtlElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ETL.EtlElement#getName()
	 * @see #getEtlElement()
	 * @generated
	 */
	EAttribute getEtlElement_Name();

	/**
	 * Returns the meta object for class '{@link ETL.Guard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guard</em>'.
	 * @see ETL.Guard
	 * @generated
	 */
	EClass getGuard();

	/**
	 * Returns the meta object for the container reference '{@link ETL.Guard#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Rule</em>'.
	 * @see ETL.Guard#getRule()
	 * @see #getGuard()
	 * @generated
	 */
	EReference getGuard_Rule();

	/**
	 * Returns the meta object for class '{@link ETL.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see ETL.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link ETL.Element#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see ETL.Element#getClassName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_ClassName();

	/**
	 * Returns the meta object for the attribute '{@link ETL.Element#getMetamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metamodel</em>'.
	 * @see ETL.Element#getMetamodel()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Metamodel();

	/**
	 * Returns the meta object for the container reference '{@link ETL.Element#getSource_rule <em>Source rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Source rule</em>'.
	 * @see ETL.Element#getSource_rule()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Source_rule();

	/**
	 * Returns the meta object for the container reference '{@link ETL.Element#getTargets_rule <em>Targets rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Targets rule</em>'.
	 * @see ETL.Element#getTargets_rule()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Targets_rule();

	/**
	 * Returns the meta object for class '{@link ETL.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see ETL.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the containment reference '{@link ETL.Operation#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context</em>'.
	 * @see ETL.Operation#getContext()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Context();

	/**
	 * Returns the meta object for the containment reference '{@link ETL.Operation#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return</em>'.
	 * @see ETL.Operation#getReturn()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Return();

	/**
	 * Returns the meta object for the attribute '{@link ETL.Operation#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Annotation</em>'.
	 * @see ETL.Operation#getAnnotation()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Annotation();

	/**
	 * Returns the meta object for the container reference '{@link ETL.Operation#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Module</em>'.
	 * @see ETL.Operation#getModule()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Module();

	/**
	 * Returns the meta object for class '{@link ETL.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding</em>'.
	 * @see ETL.Binding
	 * @generated
	 */
	EClass getBinding();

	/**
	 * Returns the meta object for the container reference '{@link ETL.Binding#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Rule</em>'.
	 * @see ETL.Binding#getRule()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_Rule();

	/**
	 * Returns the meta object for the containment reference '{@link ETL.Binding#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see ETL.Binding#getSource()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_Source();

	/**
	 * Returns the meta object for the containment reference '{@link ETL.Binding#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see ETL.Binding#getTarget()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_Target();

	/**
	 * Returns the meta object for class '{@link ETL.SimpleStatement <em>Simple Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Statement</em>'.
	 * @see ETL.SimpleStatement
	 * @generated
	 */
	EClass getSimpleStatement();

	/**
	 * Returns the meta object for the reference '{@link ETL.SimpleStatement#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see ETL.SimpleStatement#getElement()
	 * @see #getSimpleStatement()
	 * @generated
	 */
	EReference getSimpleStatement_Element();

	/**
	 * Returns the meta object for the attribute '{@link ETL.SimpleStatement#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property</em>'.
	 * @see ETL.SimpleStatement#getProperty()
	 * @see #getSimpleStatement()
	 * @generated
	 */
	EAttribute getSimpleStatement_Property();

	/**
	 * Returns the meta object for class '{@link ETL.OperationStatement <em>Operation Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Statement</em>'.
	 * @see ETL.OperationStatement
	 * @generated
	 */
	EClass getOperationStatement();

	/**
	 * Returns the meta object for the attribute '{@link ETL.OperationStatement#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see ETL.OperationStatement#getOperator()
	 * @see #getOperationStatement()
	 * @generated
	 */
	EAttribute getOperationStatement_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link ETL.OperationStatement#getParameter1 <em>Parameter1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter1</em>'.
	 * @see ETL.OperationStatement#getParameter1()
	 * @see #getOperationStatement()
	 * @generated
	 */
	EReference getOperationStatement_Parameter1();

	/**
	 * Returns the meta object for the containment reference '{@link ETL.OperationStatement#getParameter2 <em>Parameter2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter2</em>'.
	 * @see ETL.OperationStatement#getParameter2()
	 * @see #getOperationStatement()
	 * @generated
	 */
	EReference getOperationStatement_Parameter2();

	/**
	 * Returns the meta object for class '{@link ETL.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see ETL.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the attribute '{@link ETL.Block#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see ETL.Block#getBody()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_Body();

	/**
	 * Returns the meta object for class '{@link ETL.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see ETL.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ETLFactory getETLFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ETL.impl.EtlModuleImpl <em>Etl Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ETL.impl.EtlModuleImpl
		 * @see ETL.impl.ETLPackageImpl#getEtlModule()
		 * @generated
		 */
		EClass ETL_MODULE = eINSTANCE.getEtlModule();

		/**
		 * The meta object literal for the '<em><b>Pre</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETL_MODULE__PRE = eINSTANCE.getEtlModule_Pre();

		/**
		 * The meta object literal for the '<em><b>Post</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETL_MODULE__POST = eINSTANCE.getEtlModule_Post();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETL_MODULE__RULES = eINSTANCE.getEtlModule_Rules();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ETL_MODULE__OPERATIONS = eINSTANCE.getEtlModule_Operations();

		/**
		 * The meta object literal for the '{@link ETL.impl.EolBlockImpl <em>Eol Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ETL.impl.EolBlockImpl
		 * @see ETL.impl.ETLPackageImpl#getEolBlock()
		 * @generated
		 */
		EClass EOL_BLOCK = eINSTANCE.getEolBlock();

		/**
		 * The meta object literal for the '<em><b>Post Module</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOL_BLOCK__POST_MODULE = eINSTANCE.getEolBlock_PostModule();

		/**
		 * The meta object literal for the '<em><b>Pre Module</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOL_BLOCK__PRE_MODULE = eINSTANCE.getEolBlock_PreModule();

		/**
		 * The meta object literal for the '{@link ETL.impl.TransformationRuleImpl <em>Transformation Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ETL.impl.TransformationRuleImpl
		 * @see ETL.impl.ETLPackageImpl#getTransformationRule()
		 * @generated
		 */
		EClass TRANSFORMATION_RULE = eINSTANCE.getTransformationRule();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION_RULE__IS_ABSTRACT = eINSTANCE.getTransformationRule_IsAbstract();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_RULE__MODULE = eINSTANCE.getTransformationRule_Module();

		/**
		 * The meta object literal for the '<em><b>Lazy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION_RULE__LAZY = eINSTANCE.getTransformationRule_Lazy();

		/**
		 * The meta object literal for the '<em><b>Primary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION_RULE__PRIMARY = eINSTANCE.getTransformationRule_Primary();

		/**
		 * The meta object literal for the '<em><b>Greedy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION_RULE__GREEDY = eINSTANCE.getTransformationRule_Greedy();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_RULE__GUARD = eINSTANCE.getTransformationRule_Guard();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_RULE__SOURCE = eINSTANCE.getTransformationRule_Source();

		/**
		 * The meta object literal for the '<em><b>Targets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_RULE__TARGETS = eINSTANCE.getTransformationRule_Targets();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_RULE__EXTENDS = eINSTANCE.getTransformationRule_Extends();

		/**
		 * The meta object literal for the '<em><b>Is Extended</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_RULE__IS_EXTENDED = eINSTANCE.getTransformationRule_IsExtended();

		/**
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_RULE__BINDINGS = eINSTANCE.getTransformationRule_Bindings();

		/**
		 * The meta object literal for the '{@link ETL.impl.EtlElementImpl <em>Etl Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ETL.impl.EtlElementImpl
		 * @see ETL.impl.ETLPackageImpl#getEtlElement()
		 * @generated
		 */
		EClass ETL_ELEMENT = eINSTANCE.getEtlElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ETL_ELEMENT__NAME = eINSTANCE.getEtlElement_Name();

		/**
		 * The meta object literal for the '{@link ETL.impl.GuardImpl <em>Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ETL.impl.GuardImpl
		 * @see ETL.impl.ETLPackageImpl#getGuard()
		 * @generated
		 */
		EClass GUARD = eINSTANCE.getGuard();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUARD__RULE = eINSTANCE.getGuard_Rule();

		/**
		 * The meta object literal for the '{@link ETL.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ETL.impl.ElementImpl
		 * @see ETL.impl.ETLPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__CLASS_NAME = eINSTANCE.getElement_ClassName();

		/**
		 * The meta object literal for the '<em><b>Metamodel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__METAMODEL = eINSTANCE.getElement_Metamodel();

		/**
		 * The meta object literal for the '<em><b>Source rule</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__SOURCE_RULE = eINSTANCE.getElement_Source_rule();

		/**
		 * The meta object literal for the '<em><b>Targets rule</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__TARGETS_RULE = eINSTANCE.getElement_Targets_rule();

		/**
		 * The meta object literal for the '{@link ETL.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ETL.impl.OperationImpl
		 * @see ETL.impl.ETLPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__CONTEXT = eINSTANCE.getOperation_Context();

		/**
		 * The meta object literal for the '<em><b>Return</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__RETURN = eINSTANCE.getOperation_Return();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__ANNOTATION = eINSTANCE.getOperation_Annotation();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__MODULE = eINSTANCE.getOperation_Module();

		/**
		 * The meta object literal for the '{@link ETL.impl.BindingImpl <em>Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ETL.impl.BindingImpl
		 * @see ETL.impl.ETLPackageImpl#getBinding()
		 * @generated
		 */
		EClass BINDING = eINSTANCE.getBinding();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING__RULE = eINSTANCE.getBinding_Rule();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING__SOURCE = eINSTANCE.getBinding_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING__TARGET = eINSTANCE.getBinding_Target();

		/**
		 * The meta object literal for the '{@link ETL.impl.SimpleStatementImpl <em>Simple Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ETL.impl.SimpleStatementImpl
		 * @see ETL.impl.ETLPackageImpl#getSimpleStatement()
		 * @generated
		 */
		EClass SIMPLE_STATEMENT = eINSTANCE.getSimpleStatement();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_STATEMENT__ELEMENT = eINSTANCE.getSimpleStatement_Element();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_STATEMENT__PROPERTY = eINSTANCE.getSimpleStatement_Property();

		/**
		 * The meta object literal for the '{@link ETL.impl.OperationStatementImpl <em>Operation Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ETL.impl.OperationStatementImpl
		 * @see ETL.impl.ETLPackageImpl#getOperationStatement()
		 * @generated
		 */
		EClass OPERATION_STATEMENT = eINSTANCE.getOperationStatement();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_STATEMENT__OPERATOR = eINSTANCE.getOperationStatement_Operator();

		/**
		 * The meta object literal for the '<em><b>Parameter1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_STATEMENT__PARAMETER1 = eINSTANCE.getOperationStatement_Parameter1();

		/**
		 * The meta object literal for the '<em><b>Parameter2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_STATEMENT__PARAMETER2 = eINSTANCE.getOperationStatement_Parameter2();

		/**
		 * The meta object literal for the '{@link ETL.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ETL.impl.BlockImpl
		 * @see ETL.impl.ETLPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__BODY = eINSTANCE.getBlock_Body();

		/**
		 * The meta object literal for the '{@link ETL.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ETL.impl.StatementImpl
		 * @see ETL.impl.ETLPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

	}

} //ETLPackage
