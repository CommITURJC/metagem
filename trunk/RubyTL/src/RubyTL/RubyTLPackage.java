/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package RubyTL;

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
 * @see RubyTL.RubyTLFactory
 * @model kind="package"
 * @generated
 */
public interface RubyTLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "RubyTL"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.eclipse.kybele.metagem.rubytl"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rubytl"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RubyTLPackage eINSTANCE = RubyTL.impl.RubyTLPackageImpl.init();

	/**
	 * The meta object id for the '{@link RubyTL.impl.TransformationImpl <em>Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RubyTL.impl.TransformationImpl
	 * @see RubyTL.impl.RubyTLPackageImpl#getTransformation()
	 * @generated
	 */
	int TRANSFORMATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Source Metamodels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__SOURCE_METAMODELS = 1;

	/**
	 * The feature id for the '<em><b>Target Metamodels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__TARGET_METAMODELS = 2;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__RULES = 3;

	/**
	 * The feature id for the '<em><b>Decorators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__DECORATORS = 4;

	/**
	 * The number of structural features of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link RubyTL.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RubyTL.impl.NamedElementImpl
	 * @see RubyTL.impl.RubyTLPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__URI = 1;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link RubyTL.impl.MetamodelImpl <em>Metamodel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RubyTL.impl.MetamodelImpl
	 * @see RubyTL.impl.RubyTLPackageImpl#getMetamodel()
	 * @generated
	 */
	int METAMODEL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__URI = NAMED_ELEMENT__URI;

	/**
	 * The number of structural features of the '<em>Metamodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link RubyTL.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RubyTL.impl.RuleImpl
	 * @see RubyTL.impl.RubyTLPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__NAME = 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__FROM = 1;

	/**
	 * The feature id for the '<em><b>To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__TO = 2;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__MAPPING = 3;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__FILTER = 4;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__COMMENT = 5;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link RubyTL.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RubyTL.impl.VariableImpl
	 * @see RubyTL.impl.RubyTLPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link RubyTL.impl.FromElementImpl <em>From Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RubyTL.impl.FromElementImpl
	 * @see RubyTL.impl.RubyTLPackageImpl#getFromElement()
	 * @generated
	 */
	int FROM_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_ELEMENT__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Classname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_ELEMENT__CLASSNAME = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Metamodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_ELEMENT__METAMODEL = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_ELEMENT__RULE = VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>From Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_ELEMENT_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link RubyTL.impl.ToElementImpl <em>To Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RubyTL.impl.ToElementImpl
	 * @see RubyTL.impl.RubyTLPackageImpl#getToElement()
	 * @generated
	 */
	int TO_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_ELEMENT__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Classname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_ELEMENT__CLASSNAME = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Metamodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_ELEMENT__METAMODEL = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_ELEMENT__RULE = VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>To Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_ELEMENT_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link RubyTL.impl.TopRuleImpl <em>Top Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RubyTL.impl.TopRuleImpl
	 * @see RubyTL.impl.RubyTLPackageImpl#getTopRule()
	 * @generated
	 */
	int TOP_RULE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_RULE__NAME = RULE__NAME;

	/**
	 * The feature id for the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_RULE__FROM = RULE__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_RULE__TO = RULE__TO;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_RULE__MAPPING = RULE__MAPPING;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_RULE__FILTER = RULE__FILTER;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_RULE__COMMENT = RULE__COMMENT;

	/**
	 * The number of structural features of the '<em>Top Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_RULE_FEATURE_COUNT = RULE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link RubyTL.impl.CopyRuleImpl <em>Copy Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RubyTL.impl.CopyRuleImpl
	 * @see RubyTL.impl.RubyTLPackageImpl#getCopyRule()
	 * @generated
	 */
	int COPY_RULE = 8;

	/**
	 * The meta object id for the '{@link RubyTL.impl.MappingImpl <em>Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RubyTL.impl.MappingImpl
	 * @see RubyTL.impl.RubyTLPackageImpl#getMapping()
	 * @generated
	 */
	int MAPPING = 9;

	/**
	 * The meta object id for the '{@link RubyTL.impl.BindingImpl <em>Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RubyTL.impl.BindingImpl
	 * @see RubyTL.impl.RubyTLPackageImpl#getBinding()
	 * @generated
	 */
	int BINDING = 10;

	/**
	 * The meta object id for the '{@link RubyTL.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RubyTL.impl.ExpressionImpl
	 * @see RubyTL.impl.RubyTLPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 12;

	/**
	 * The meta object id for the '{@link RubyTL.impl.ExpVariableImpl <em>Exp Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RubyTL.impl.ExpVariableImpl
	 * @see RubyTL.impl.RubyTLPackageImpl#getExpVariable()
	 * @generated
	 */
	int EXP_VARIABLE = 13;

	/**
	 * The meta object id for the '{@link RubyTL.impl.ExpGetImpl <em>Exp Get</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RubyTL.impl.ExpGetImpl
	 * @see RubyTL.impl.RubyTLPackageImpl#getExpGet()
	 * @generated
	 */
	int EXP_GET = 14;

	/**
	 * The meta object id for the '{@link RubyTL.impl.FilterImpl <em>Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RubyTL.impl.FilterImpl
	 * @see RubyTL.impl.RubyTLPackageImpl#getFilter()
	 * @generated
	 */
	int FILTER = 15;

	/**
	 * The meta object id for the '{@link RubyTL.impl.DecoratorImpl <em>Decorator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RubyTL.impl.DecoratorImpl
	 * @see RubyTL.impl.RubyTLPackageImpl#getDecorator()
	 * @generated
	 */
	int DECORATOR = 16;

	/**
	 * The meta object id for the '{@link RubyTL.impl.NormalRuleImpl <em>Normal Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RubyTL.impl.NormalRuleImpl
	 * @see RubyTL.impl.RubyTLPackageImpl#getNormalRule()
	 * @generated
	 */
	int NORMAL_RULE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_RULE__NAME = RULE__NAME;

	/**
	 * The feature id for the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_RULE__FROM = RULE__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_RULE__TO = RULE__TO;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_RULE__MAPPING = RULE__MAPPING;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_RULE__FILTER = RULE__FILTER;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_RULE__COMMENT = RULE__COMMENT;

	/**
	 * The number of structural features of the '<em>Normal Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_RULE_FEATURE_COUNT = RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_RULE__NAME = RULE__NAME;

	/**
	 * The feature id for the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_RULE__FROM = RULE__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_RULE__TO = RULE__TO;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_RULE__MAPPING = RULE__MAPPING;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_RULE__FILTER = RULE__FILTER;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_RULE__COMMENT = RULE__COMMENT;

	/**
	 * The number of structural features of the '<em>Copy Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_RULE_FEATURE_COUNT = RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__BINDINGS = 0;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__RULE = 1;

	/**
	 * The number of structural features of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__SOURCE = 2;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__MAPPING = 3;

	/**
	 * The number of structural features of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FEATURE_COUNT = 4;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXP_VARIABLE__VARIABLE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Exp Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXP_VARIABLE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXP_GET__SOURCE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXP_GET__PROPERTY = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Exp Get</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXP_GET_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__RULE = 1;

	/**
	 * The number of structural features of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR__BODY = 1;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR__CONTEXT = 2;

	/**
	 * The feature id for the '<em><b>Transformation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR__TRANSFORMATION = 3;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR__COMMENT = 4;

	/**
	 * The number of structural features of the '<em>Decorator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR_FEATURE_COUNT = 5;

	/**
	 * Returns the meta object for class '{@link RubyTL.Transformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation</em>'.
	 * @see RubyTL.Transformation
	 * @generated
	 */
	EClass getTransformation();

	/**
	 * Returns the meta object for the attribute '{@link RubyTL.Transformation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see RubyTL.Transformation#getName()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link RubyTL.Transformation#getSourceMetamodels <em>Source Metamodels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source Metamodels</em>'.
	 * @see RubyTL.Transformation#getSourceMetamodels()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_SourceMetamodels();

	/**
	 * Returns the meta object for the containment reference list '{@link RubyTL.Transformation#getTargetMetamodels <em>Target Metamodels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target Metamodels</em>'.
	 * @see RubyTL.Transformation#getTargetMetamodels()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_TargetMetamodels();

	/**
	 * Returns the meta object for the containment reference list '{@link RubyTL.Transformation#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see RubyTL.Transformation#getRules()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_Rules();

	/**
	 * Returns the meta object for the containment reference list '{@link RubyTL.Transformation#getDecorators <em>Decorators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decorators</em>'.
	 * @see RubyTL.Transformation#getDecorators()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_Decorators();

	/**
	 * Returns the meta object for class '{@link RubyTL.Metamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metamodel</em>'.
	 * @see RubyTL.Metamodel
	 * @generated
	 */
	EClass getMetamodel();

	/**
	 * Returns the meta object for class '{@link RubyTL.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see RubyTL.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the attribute '{@link RubyTL.Rule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see RubyTL.Rule#getName()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Name();

	/**
	 * Returns the meta object for the containment reference '{@link RubyTL.Rule#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From</em>'.
	 * @see RubyTL.Rule#getFrom()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_From();

	/**
	 * Returns the meta object for the containment reference list '{@link RubyTL.Rule#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>To</em>'.
	 * @see RubyTL.Rule#getTo()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_To();

	/**
	 * Returns the meta object for the containment reference '{@link RubyTL.Rule#getMapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mapping</em>'.
	 * @see RubyTL.Rule#getMapping()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Mapping();

	/**
	 * Returns the meta object for the containment reference '{@link RubyTL.Rule#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter</em>'.
	 * @see RubyTL.Rule#getFilter()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Filter();

	/**
	 * Returns the meta object for the attribute '{@link RubyTL.Rule#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see RubyTL.Rule#getComment()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Comment();

	/**
	 * Returns the meta object for class '{@link RubyTL.FromElement <em>From Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>From Element</em>'.
	 * @see RubyTL.FromElement
	 * @generated
	 */
	EClass getFromElement();

	/**
	 * Returns the meta object for the attribute '{@link RubyTL.FromElement#getClassname <em>Classname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classname</em>'.
	 * @see RubyTL.FromElement#getClassname()
	 * @see #getFromElement()
	 * @generated
	 */
	EAttribute getFromElement_Classname();

	/**
	 * Returns the meta object for the reference '{@link RubyTL.FromElement#getMetamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Metamodel</em>'.
	 * @see RubyTL.FromElement#getMetamodel()
	 * @see #getFromElement()
	 * @generated
	 */
	EReference getFromElement_Metamodel();

	/**
	 * Returns the meta object for the container reference '{@link RubyTL.FromElement#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Rule</em>'.
	 * @see RubyTL.FromElement#getRule()
	 * @see #getFromElement()
	 * @generated
	 */
	EReference getFromElement_Rule();

	/**
	 * Returns the meta object for class '{@link RubyTL.ToElement <em>To Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To Element</em>'.
	 * @see RubyTL.ToElement
	 * @generated
	 */
	EClass getToElement();

	/**
	 * Returns the meta object for the attribute '{@link RubyTL.ToElement#getClassname <em>Classname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classname</em>'.
	 * @see RubyTL.ToElement#getClassname()
	 * @see #getToElement()
	 * @generated
	 */
	EAttribute getToElement_Classname();

	/**
	 * Returns the meta object for the reference '{@link RubyTL.ToElement#getMetamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Metamodel</em>'.
	 * @see RubyTL.ToElement#getMetamodel()
	 * @see #getToElement()
	 * @generated
	 */
	EReference getToElement_Metamodel();

	/**
	 * Returns the meta object for the container reference '{@link RubyTL.ToElement#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Rule</em>'.
	 * @see RubyTL.ToElement#getRule()
	 * @see #getToElement()
	 * @generated
	 */
	EReference getToElement_Rule();

	/**
	 * Returns the meta object for class '{@link RubyTL.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see RubyTL.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link RubyTL.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see RubyTL.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link RubyTL.NamedElement#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see RubyTL.NamedElement#getUri()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Uri();

	/**
	 * Returns the meta object for class '{@link RubyTL.TopRule <em>Top Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Top Rule</em>'.
	 * @see RubyTL.TopRule
	 * @generated
	 */
	EClass getTopRule();

	/**
	 * Returns the meta object for class '{@link RubyTL.CopyRule <em>Copy Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Copy Rule</em>'.
	 * @see RubyTL.CopyRule
	 * @generated
	 */
	EClass getCopyRule();

	/**
	 * Returns the meta object for class '{@link RubyTL.Mapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping</em>'.
	 * @see RubyTL.Mapping
	 * @generated
	 */
	EClass getMapping();

	/**
	 * Returns the meta object for the containment reference list '{@link RubyTL.Mapping#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
	 * @see RubyTL.Mapping#getBindings()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_Bindings();

	/**
	 * Returns the meta object for the container reference '{@link RubyTL.Mapping#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Rule</em>'.
	 * @see RubyTL.Mapping#getRule()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_Rule();

	/**
	 * Returns the meta object for class '{@link RubyTL.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding</em>'.
	 * @see RubyTL.Binding
	 * @generated
	 */
	EClass getBinding();

	/**
	 * Returns the meta object for the containment reference '{@link RubyTL.Binding#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see RubyTL.Binding#getTarget()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_Target();

	/**
	 * Returns the meta object for the attribute '{@link RubyTL.Binding#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property</em>'.
	 * @see RubyTL.Binding#getProperty()
	 * @see #getBinding()
	 * @generated
	 */
	EAttribute getBinding_Property();

	/**
	 * Returns the meta object for the containment reference '{@link RubyTL.Binding#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see RubyTL.Binding#getSource()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_Source();

	/**
	 * Returns the meta object for the container reference '{@link RubyTL.Binding#getMapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Mapping</em>'.
	 * @see RubyTL.Binding#getMapping()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_Mapping();

	/**
	 * Returns the meta object for class '{@link RubyTL.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see RubyTL.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link RubyTL.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see RubyTL.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for class '{@link RubyTL.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see RubyTL.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link RubyTL.ExpVariable <em>Exp Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exp Variable</em>'.
	 * @see RubyTL.ExpVariable
	 * @generated
	 */
	EClass getExpVariable();

	/**
	 * Returns the meta object for the reference '{@link RubyTL.ExpVariable#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see RubyTL.ExpVariable#getVariable()
	 * @see #getExpVariable()
	 * @generated
	 */
	EReference getExpVariable_Variable();

	/**
	 * Returns the meta object for class '{@link RubyTL.ExpGet <em>Exp Get</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exp Get</em>'.
	 * @see RubyTL.ExpGet
	 * @generated
	 */
	EClass getExpGet();

	/**
	 * Returns the meta object for the containment reference '{@link RubyTL.ExpGet#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see RubyTL.ExpGet#getSource()
	 * @see #getExpGet()
	 * @generated
	 */
	EReference getExpGet_Source();

	/**
	 * Returns the meta object for the attribute '{@link RubyTL.ExpGet#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property</em>'.
	 * @see RubyTL.ExpGet#getProperty()
	 * @see #getExpGet()
	 * @generated
	 */
	EAttribute getExpGet_Property();

	/**
	 * Returns the meta object for class '{@link RubyTL.Filter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter</em>'.
	 * @see RubyTL.Filter
	 * @generated
	 */
	EClass getFilter();

	/**
	 * Returns the meta object for the attribute '{@link RubyTL.Filter#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see RubyTL.Filter#getExpression()
	 * @see #getFilter()
	 * @generated
	 */
	EAttribute getFilter_Expression();

	/**
	 * Returns the meta object for the container reference '{@link RubyTL.Filter#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Rule</em>'.
	 * @see RubyTL.Filter#getRule()
	 * @see #getFilter()
	 * @generated
	 */
	EReference getFilter_Rule();

	/**
	 * Returns the meta object for class '{@link RubyTL.Decorator <em>Decorator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decorator</em>'.
	 * @see RubyTL.Decorator
	 * @generated
	 */
	EClass getDecorator();

	/**
	 * Returns the meta object for the attribute '{@link RubyTL.Decorator#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see RubyTL.Decorator#getName()
	 * @see #getDecorator()
	 * @generated
	 */
	EAttribute getDecorator_Name();

	/**
	 * Returns the meta object for the attribute '{@link RubyTL.Decorator#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see RubyTL.Decorator#getBody()
	 * @see #getDecorator()
	 * @generated
	 */
	EAttribute getDecorator_Body();

	/**
	 * Returns the meta object for the reference '{@link RubyTL.Decorator#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see RubyTL.Decorator#getContext()
	 * @see #getDecorator()
	 * @generated
	 */
	EReference getDecorator_Context();

	/**
	 * Returns the meta object for the container reference '{@link RubyTL.Decorator#getTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Transformation</em>'.
	 * @see RubyTL.Decorator#getTransformation()
	 * @see #getDecorator()
	 * @generated
	 */
	EReference getDecorator_Transformation();

	/**
	 * Returns the meta object for the attribute '{@link RubyTL.Decorator#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see RubyTL.Decorator#getComment()
	 * @see #getDecorator()
	 * @generated
	 */
	EAttribute getDecorator_Comment();

	/**
	 * Returns the meta object for class '{@link RubyTL.NormalRule <em>Normal Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal Rule</em>'.
	 * @see RubyTL.NormalRule
	 * @generated
	 */
	EClass getNormalRule();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RubyTLFactory getRubyTLFactory();

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
		 * The meta object literal for the '{@link RubyTL.impl.TransformationImpl <em>Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RubyTL.impl.TransformationImpl
		 * @see RubyTL.impl.RubyTLPackageImpl#getTransformation()
		 * @generated
		 */
		EClass TRANSFORMATION = eINSTANCE.getTransformation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__NAME = eINSTANCE.getTransformation_Name();

		/**
		 * The meta object literal for the '<em><b>Source Metamodels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__SOURCE_METAMODELS = eINSTANCE.getTransformation_SourceMetamodels();

		/**
		 * The meta object literal for the '<em><b>Target Metamodels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__TARGET_METAMODELS = eINSTANCE.getTransformation_TargetMetamodels();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__RULES = eINSTANCE.getTransformation_Rules();

		/**
		 * The meta object literal for the '<em><b>Decorators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__DECORATORS = eINSTANCE.getTransformation_Decorators();

		/**
		 * The meta object literal for the '{@link RubyTL.impl.MetamodelImpl <em>Metamodel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RubyTL.impl.MetamodelImpl
		 * @see RubyTL.impl.RubyTLPackageImpl#getMetamodel()
		 * @generated
		 */
		EClass METAMODEL = eINSTANCE.getMetamodel();

		/**
		 * The meta object literal for the '{@link RubyTL.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RubyTL.impl.RuleImpl
		 * @see RubyTL.impl.RubyTLPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__NAME = eINSTANCE.getRule_Name();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__FROM = eINSTANCE.getRule_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__TO = eINSTANCE.getRule_To();

		/**
		 * The meta object literal for the '<em><b>Mapping</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__MAPPING = eINSTANCE.getRule_Mapping();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__FILTER = eINSTANCE.getRule_Filter();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__COMMENT = eINSTANCE.getRule_Comment();

		/**
		 * The meta object literal for the '{@link RubyTL.impl.FromElementImpl <em>From Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RubyTL.impl.FromElementImpl
		 * @see RubyTL.impl.RubyTLPackageImpl#getFromElement()
		 * @generated
		 */
		EClass FROM_ELEMENT = eINSTANCE.getFromElement();

		/**
		 * The meta object literal for the '<em><b>Classname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FROM_ELEMENT__CLASSNAME = eINSTANCE.getFromElement_Classname();

		/**
		 * The meta object literal for the '<em><b>Metamodel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FROM_ELEMENT__METAMODEL = eINSTANCE.getFromElement_Metamodel();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FROM_ELEMENT__RULE = eINSTANCE.getFromElement_Rule();

		/**
		 * The meta object literal for the '{@link RubyTL.impl.ToElementImpl <em>To Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RubyTL.impl.ToElementImpl
		 * @see RubyTL.impl.RubyTLPackageImpl#getToElement()
		 * @generated
		 */
		EClass TO_ELEMENT = eINSTANCE.getToElement();

		/**
		 * The meta object literal for the '<em><b>Classname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TO_ELEMENT__CLASSNAME = eINSTANCE.getToElement_Classname();

		/**
		 * The meta object literal for the '<em><b>Metamodel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_ELEMENT__METAMODEL = eINSTANCE.getToElement_Metamodel();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_ELEMENT__RULE = eINSTANCE.getToElement_Rule();

		/**
		 * The meta object literal for the '{@link RubyTL.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RubyTL.impl.NamedElementImpl
		 * @see RubyTL.impl.RubyTLPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__URI = eINSTANCE.getNamedElement_Uri();

		/**
		 * The meta object literal for the '{@link RubyTL.impl.TopRuleImpl <em>Top Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RubyTL.impl.TopRuleImpl
		 * @see RubyTL.impl.RubyTLPackageImpl#getTopRule()
		 * @generated
		 */
		EClass TOP_RULE = eINSTANCE.getTopRule();

		/**
		 * The meta object literal for the '{@link RubyTL.impl.CopyRuleImpl <em>Copy Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RubyTL.impl.CopyRuleImpl
		 * @see RubyTL.impl.RubyTLPackageImpl#getCopyRule()
		 * @generated
		 */
		EClass COPY_RULE = eINSTANCE.getCopyRule();

		/**
		 * The meta object literal for the '{@link RubyTL.impl.MappingImpl <em>Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RubyTL.impl.MappingImpl
		 * @see RubyTL.impl.RubyTLPackageImpl#getMapping()
		 * @generated
		 */
		EClass MAPPING = eINSTANCE.getMapping();

		/**
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__BINDINGS = eINSTANCE.getMapping_Bindings();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__RULE = eINSTANCE.getMapping_Rule();

		/**
		 * The meta object literal for the '{@link RubyTL.impl.BindingImpl <em>Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RubyTL.impl.BindingImpl
		 * @see RubyTL.impl.RubyTLPackageImpl#getBinding()
		 * @generated
		 */
		EClass BINDING = eINSTANCE.getBinding();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING__TARGET = eINSTANCE.getBinding_Target();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING__PROPERTY = eINSTANCE.getBinding_Property();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING__SOURCE = eINSTANCE.getBinding_Source();

		/**
		 * The meta object literal for the '<em><b>Mapping</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING__MAPPING = eINSTANCE.getBinding_Mapping();

		/**
		 * The meta object literal for the '{@link RubyTL.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RubyTL.impl.VariableImpl
		 * @see RubyTL.impl.RubyTLPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '{@link RubyTL.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RubyTL.impl.ExpressionImpl
		 * @see RubyTL.impl.RubyTLPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link RubyTL.impl.ExpVariableImpl <em>Exp Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RubyTL.impl.ExpVariableImpl
		 * @see RubyTL.impl.RubyTLPackageImpl#getExpVariable()
		 * @generated
		 */
		EClass EXP_VARIABLE = eINSTANCE.getExpVariable();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXP_VARIABLE__VARIABLE = eINSTANCE.getExpVariable_Variable();

		/**
		 * The meta object literal for the '{@link RubyTL.impl.ExpGetImpl <em>Exp Get</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RubyTL.impl.ExpGetImpl
		 * @see RubyTL.impl.RubyTLPackageImpl#getExpGet()
		 * @generated
		 */
		EClass EXP_GET = eINSTANCE.getExpGet();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXP_GET__SOURCE = eINSTANCE.getExpGet_Source();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXP_GET__PROPERTY = eINSTANCE.getExpGet_Property();

		/**
		 * The meta object literal for the '{@link RubyTL.impl.FilterImpl <em>Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RubyTL.impl.FilterImpl
		 * @see RubyTL.impl.RubyTLPackageImpl#getFilter()
		 * @generated
		 */
		EClass FILTER = eINSTANCE.getFilter();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER__EXPRESSION = eINSTANCE.getFilter_Expression();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER__RULE = eINSTANCE.getFilter_Rule();

		/**
		 * The meta object literal for the '{@link RubyTL.impl.DecoratorImpl <em>Decorator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RubyTL.impl.DecoratorImpl
		 * @see RubyTL.impl.RubyTLPackageImpl#getDecorator()
		 * @generated
		 */
		EClass DECORATOR = eINSTANCE.getDecorator();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECORATOR__NAME = eINSTANCE.getDecorator_Name();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECORATOR__BODY = eINSTANCE.getDecorator_Body();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECORATOR__CONTEXT = eINSTANCE.getDecorator_Context();

		/**
		 * The meta object literal for the '<em><b>Transformation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECORATOR__TRANSFORMATION = eINSTANCE.getDecorator_Transformation();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECORATOR__COMMENT = eINSTANCE.getDecorator_Comment();

		/**
		 * The meta object literal for the '{@link RubyTL.impl.NormalRuleImpl <em>Normal Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RubyTL.impl.NormalRuleImpl
		 * @see RubyTL.impl.RubyTLPackageImpl#getNormalRule()
		 * @generated
		 */
		EClass NORMAL_RULE = eINSTANCE.getNormalRule();

	}

} //RubyTLPackage
