/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hybrid;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see hybrid.HybridFactory
 * @model kind="package"
 * @generated
 */
public interface HybridPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hybrid";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.eclipse.kybele.hybrid";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hybrid";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HybridPackage eINSTANCE = hybrid.impl.HybridPackageImpl.init();

	/**
	 * The meta object id for the '{@link hybrid.impl.HybridElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hybrid.impl.HybridElementImpl
	 * @see hybrid.impl.HybridPackageImpl#getHybridElement()
	 * @generated
	 */
	int HYBRID_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link hybrid.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hybrid.impl.ModuleImpl
	 * @see hybrid.impl.HybridPackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NAME = HYBRID_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__OPERATIONS = HYBRID_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__SOURCE_MODELS = HYBRID_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__TARGET_MODELS = HYBRID_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__RULES = HYBRID_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = HYBRID_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link hybrid.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hybrid.impl.OperationImpl
	 * @see hybrid.impl.HybridPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = HYBRID_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__MODULE = HYBRID_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__BODY = HYBRID_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__RETURN = HYBRID_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Right Pattern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__RIGHT_PATTERN = HYBRID_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = HYBRID_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link hybrid.impl.ReturnImpl <em>Return</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hybrid.impl.ReturnImpl
	 * @see hybrid.impl.HybridPackageImpl#getReturn()
	 * @generated
	 */
	int RETURN = 3;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN__DATATYPE = 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN__COMPONENT = 1;

	/**
	 * The number of structural features of the '<em>Return</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link hybrid.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hybrid.impl.ModelImpl
	 * @see hybrid.impl.HybridPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = HYBRID_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PATH = HYBRID_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type mm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__TYPE_MM = HYBRID_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ELEMENTS = HYBRID_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = HYBRID_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link hybrid.impl.SourceModelImpl <em>Source Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hybrid.impl.SourceModelImpl
	 * @see hybrid.impl.HybridPackageImpl#getSourceModel()
	 * @generated
	 */
	int SOURCE_MODEL = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_MODEL__NAME = MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_MODEL__PATH = MODEL__PATH;

	/**
	 * The feature id for the '<em><b>Type mm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_MODEL__TYPE_MM = MODEL__TYPE_MM;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_MODEL__ELEMENTS = MODEL__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_MODEL__MODULE = MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Source Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_MODEL_FEATURE_COUNT = MODEL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hybrid.impl.TargetModelImpl <em>Target Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hybrid.impl.TargetModelImpl
	 * @see hybrid.impl.HybridPackageImpl#getTargetModel()
	 * @generated
	 */
	int TARGET_MODEL = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_MODEL__NAME = MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_MODEL__PATH = MODEL__PATH;

	/**
	 * The feature id for the '<em><b>Type mm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_MODEL__TYPE_MM = MODEL__TYPE_MM;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_MODEL__ELEMENTS = MODEL__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_MODEL__MODULE = MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Target Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_MODEL_FEATURE_COUNT = MODEL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hybrid.impl.ModelElementImpl <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hybrid.impl.ModelElementImpl
	 * @see hybrid.impl.HybridPackageImpl#getModelElement()
	 * @generated
	 */
	int MODEL_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__NAME = HYBRID_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__REF = HYBRID_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__OWNED_MODEL = HYBRID_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Child Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__CHILD_ELEMENTS = HYBRID_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__PARENT_ELEMENT = HYBRID_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__FEATURES = HYBRID_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_FEATURE_COUNT = HYBRID_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link hybrid.impl.ModelComponentImpl <em>Model Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hybrid.impl.ModelComponentImpl
	 * @see hybrid.impl.HybridPackageImpl#getModelComponent()
	 * @generated
	 */
	int MODEL_COMPONENT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_COMPONENT__NAME = HYBRID_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_COMPONENT__REF = HYBRID_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_COMPONENT_FEATURE_COUNT = HYBRID_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hybrid.impl.ModelFeatureImpl <em>Model Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hybrid.impl.ModelFeatureImpl
	 * @see hybrid.impl.HybridPackageImpl#getModelFeature()
	 * @generated
	 */
	int MODEL_FEATURE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE__NAME = MODEL_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE__REF = MODEL_COMPONENT__REF;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE__OWNED_ELEMENT = MODEL_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_FEATURE_COUNT = MODEL_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hybrid.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hybrid.impl.RuleImpl
	 * @see hybrid.impl.HybridPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__NAME = HYBRID_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__IS_ABSTRACT = HYBRID_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Module</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__MODULE = HYBRID_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Main</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__IS_MAIN = HYBRID_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type Relation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__TYPE_RELATION = HYBRID_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__TYPE_ELEMENT = HYBRID_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__COMMENT = HYBRID_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__SOURCES = HYBRID_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__TARGETS = HYBRID_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__GUARD = HYBRID_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Trace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__TRACE = HYBRID_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = HYBRID_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link hybrid.impl.RuleElementImpl <em>Rule Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hybrid.impl.RuleElementImpl
	 * @see hybrid.impl.HybridPackageImpl#getRuleElement()
	 * @generated
	 */
	int RULE_ELEMENT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_ELEMENT__NAME = HYBRID_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Is Refered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_ELEMENT__IS_REFERED = HYBRID_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_ELEMENT__COMPONENT = HYBRID_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rule Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_ELEMENT_FEATURE_COUNT = HYBRID_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hybrid.impl.SourceImpl <em>Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hybrid.impl.SourceImpl
	 * @see hybrid.impl.HybridPackageImpl#getSource()
	 * @generated
	 */
	int SOURCE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__NAME = RULE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Is Refered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__IS_REFERED = RULE_ELEMENT__IS_REFERED;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__COMPONENT = RULE_ELEMENT__COMPONENT;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__RULE = RULE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Pattern Owned</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__RIGHT_PATTERN_OWNED = RULE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__TRACE_LINK = RULE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FEATURE_COUNT = RULE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link hybrid.impl.TargetImpl <em>Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hybrid.impl.TargetImpl
	 * @see hybrid.impl.HybridPackageImpl#getTarget()
	 * @generated
	 */
	int TARGET = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__NAME = RULE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Is Refered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__IS_REFERED = RULE_ELEMENT__IS_REFERED;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__COMPONENT = RULE_ELEMENT__COMPONENT;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__RULE = RULE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__BINDINGS = RULE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Left Pattern Owned</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__LEFT_PATTERN_OWNED = RULE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trace Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__TRACE_LINK = RULE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_FEATURE_COUNT = RULE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link hybrid.impl.GuardImpl <em>Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hybrid.impl.GuardImpl
	 * @see hybrid.impl.HybridPackageImpl#getGuard()
	 * @generated
	 */
	int GUARD = 14;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD__RULE = 1;

	/**
	 * The number of structural features of the '<em>Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link hybrid.impl.BindingImpl <em>Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hybrid.impl.BindingImpl
	 * @see hybrid.impl.HybridPackageImpl#getBinding()
	 * @generated
	 */
	int BINDING = 15;

	/**
	 * The feature id for the '<em><b>Owned</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__OWNED = 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__RIGHT = 1;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__LEFT = 2;

	/**
	 * The feature id for the '<em><b>Type Relation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__TYPE_RELATION = 3;

	/**
	 * The feature id for the '<em><b>Type Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__TYPE_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Trace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__TRACE = 5;

	/**
	 * The number of structural features of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link hybrid.impl.RightPatternImpl <em>Right Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hybrid.impl.RightPatternImpl
	 * @see hybrid.impl.HybridPackageImpl#getRightPattern()
	 * @generated
	 */
	int RIGHT_PATTERN = 16;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_PATTERN__BINDING = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_PATTERN__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_PATTERN__OPERATION = 2;

	/**
	 * The feature id for the '<em><b>Concrete Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_PATTERN__CONCRETE_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_PATTERN__REFERENCE = 4;

	/**
	 * The number of structural features of the '<em>Right Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_PATTERN_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link hybrid.impl.LeftPatternImpl <em>Left Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hybrid.impl.LeftPatternImpl
	 * @see hybrid.impl.HybridPackageImpl#getLeftPattern()
	 * @generated
	 */
	int LEFT_PATTERN = 17;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_PATTERN__BINDING = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_PATTERN__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Left Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_PATTERN_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link hybrid.impl.TraceLinkImpl <em>Trace Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hybrid.impl.TraceLinkImpl
	 * @see hybrid.impl.HybridPackageImpl#getTraceLink()
	 * @generated
	 */
	int TRACE_LINK = 19;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Trace Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link hybrid.impl.TraceRuleImpl <em>Trace Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hybrid.impl.TraceRuleImpl
	 * @see hybrid.impl.HybridPackageImpl#getTraceRule()
	 * @generated
	 */
	int TRACE_RULE = 18;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_RULE__SOURCE = TRACE_LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_RULE__TARGET = TRACE_LINK__TARGET;

	/**
	 * The feature id for the '<em><b>Trace Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_RULE__TRACE_BINDINGS = TRACE_LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trace Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_RULE_FEATURE_COUNT = TRACE_LINK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hybrid.impl.TraceBindingImpl <em>Trace Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hybrid.impl.TraceBindingImpl
	 * @see hybrid.impl.HybridPackageImpl#getTraceBinding()
	 * @generated
	 */
	int TRACE_BINDING = 20;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_BINDING__SOURCE = TRACE_LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_BINDING__TARGET = TRACE_LINK__TARGET;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_BINDING__PARENT = TRACE_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_BINDING__BINDING = TRACE_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Trace Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_BINDING_FEATURE_COUNT = TRACE_LINK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hybrid.TypeRelation <em>Type Relation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hybrid.TypeRelation
	 * @see hybrid.impl.HybridPackageImpl#getTypeRelation()
	 * @generated
	 */
	int TYPE_RELATION = 21;

	/**
	 * The meta object id for the '{@link hybrid.TypeElement <em>Type Element</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hybrid.TypeElement
	 * @see hybrid.impl.HybridPackageImpl#getTypeElement()
	 * @generated
	 */
	int TYPE_ELEMENT = 22;

	/**
	 * The meta object id for the '{@link hybrid.Datatype <em>Datatype</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hybrid.Datatype
	 * @see hybrid.impl.HybridPackageImpl#getDatatype()
	 * @generated
	 */
	int DATATYPE = 23;


	/**
	 * Returns the meta object for class '{@link hybrid.HybridElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see hybrid.HybridElement
	 * @generated
	 */
	EClass getHybridElement();

	/**
	 * Returns the meta object for the attribute '{@link hybrid.HybridElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hybrid.HybridElement#getName()
	 * @see #getHybridElement()
	 * @generated
	 */
	EAttribute getHybridElement_Name();

	/**
	 * Returns the meta object for class '{@link hybrid.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see hybrid.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the containment reference list '{@link hybrid.Module#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see hybrid.Module#getOperations()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Operations();

	/**
	 * Returns the meta object for the containment reference list '{@link hybrid.Module#getSourceModels <em>Source Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source Models</em>'.
	 * @see hybrid.Module#getSourceModels()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_SourceModels();

	/**
	 * Returns the meta object for the containment reference list '{@link hybrid.Module#getTargetModels <em>Target Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target Models</em>'.
	 * @see hybrid.Module#getTargetModels()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_TargetModels();

	/**
	 * Returns the meta object for the containment reference list '{@link hybrid.Module#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see hybrid.Module#getRules()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Rules();

	/**
	 * Returns the meta object for class '{@link hybrid.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see hybrid.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the container reference '{@link hybrid.Operation#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Module</em>'.
	 * @see hybrid.Operation#getModule()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Module();

	/**
	 * Returns the meta object for the attribute '{@link hybrid.Operation#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see hybrid.Operation#getBody()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Body();

	/**
	 * Returns the meta object for the containment reference '{@link hybrid.Operation#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return</em>'.
	 * @see hybrid.Operation#getReturn()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Return();

	/**
	 * Returns the meta object for the reference '{@link hybrid.Operation#getRightPattern <em>Right Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right Pattern</em>'.
	 * @see hybrid.Operation#getRightPattern()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_RightPattern();

	/**
	 * Returns the meta object for class '{@link hybrid.Return <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return</em>'.
	 * @see hybrid.Return
	 * @generated
	 */
	EClass getReturn();

	/**
	 * Returns the meta object for the attribute '{@link hybrid.Return#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datatype</em>'.
	 * @see hybrid.Return#getDatatype()
	 * @see #getReturn()
	 * @generated
	 */
	EAttribute getReturn_Datatype();

	/**
	 * Returns the meta object for the reference '{@link hybrid.Return#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see hybrid.Return#getComponent()
	 * @see #getReturn()
	 * @generated
	 */
	EReference getReturn_Component();

	/**
	 * Returns the meta object for class '{@link hybrid.SourceModel <em>Source Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Model</em>'.
	 * @see hybrid.SourceModel
	 * @generated
	 */
	EClass getSourceModel();

	/**
	 * Returns the meta object for the container reference '{@link hybrid.SourceModel#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Module</em>'.
	 * @see hybrid.SourceModel#getModule()
	 * @see #getSourceModel()
	 * @generated
	 */
	EReference getSourceModel_Module();

	/**
	 * Returns the meta object for class '{@link hybrid.TargetModel <em>Target Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Model</em>'.
	 * @see hybrid.TargetModel
	 * @generated
	 */
	EClass getTargetModel();

	/**
	 * Returns the meta object for the container reference '{@link hybrid.TargetModel#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Module</em>'.
	 * @see hybrid.TargetModel#getModule()
	 * @see #getTargetModel()
	 * @generated
	 */
	EReference getTargetModel_Module();

	/**
	 * Returns the meta object for class '{@link hybrid.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see hybrid.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the attribute '{@link hybrid.Model#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see hybrid.Model#getPath()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Path();

	/**
	 * Returns the meta object for the attribute '{@link hybrid.Model#getType_mm <em>Type mm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type mm</em>'.
	 * @see hybrid.Model#getType_mm()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Type_mm();

	/**
	 * Returns the meta object for the containment reference list '{@link hybrid.Model#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see hybrid.Model#getElements()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Elements();

	/**
	 * Returns the meta object for class '{@link hybrid.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element</em>'.
	 * @see hybrid.ModelElement
	 * @generated
	 */
	EClass getModelElement();

	/**
	 * Returns the meta object for the container reference '{@link hybrid.ModelElement#getOwnedModel <em>Owned Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned Model</em>'.
	 * @see hybrid.ModelElement#getOwnedModel()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_OwnedModel();

	/**
	 * Returns the meta object for the containment reference list '{@link hybrid.ModelElement#getChildElements <em>Child Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child Elements</em>'.
	 * @see hybrid.ModelElement#getChildElements()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_ChildElements();

	/**
	 * Returns the meta object for the container reference '{@link hybrid.ModelElement#getParentElement <em>Parent Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Element</em>'.
	 * @see hybrid.ModelElement#getParentElement()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_ParentElement();

	/**
	 * Returns the meta object for the containment reference list '{@link hybrid.ModelElement#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see hybrid.ModelElement#getFeatures()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_Features();

	/**
	 * Returns the meta object for class '{@link hybrid.ModelFeature <em>Model Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Feature</em>'.
	 * @see hybrid.ModelFeature
	 * @generated
	 */
	EClass getModelFeature();

	/**
	 * Returns the meta object for the container reference '{@link hybrid.ModelFeature#getOwnedElement <em>Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned Element</em>'.
	 * @see hybrid.ModelFeature#getOwnedElement()
	 * @see #getModelFeature()
	 * @generated
	 */
	EReference getModelFeature_OwnedElement();

	/**
	 * Returns the meta object for class '{@link hybrid.ModelComponent <em>Model Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Component</em>'.
	 * @see hybrid.ModelComponent
	 * @generated
	 */
	EClass getModelComponent();

	/**
	 * Returns the meta object for the attribute '{@link hybrid.ModelComponent#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see hybrid.ModelComponent#getRef()
	 * @see #getModelComponent()
	 * @generated
	 */
	EAttribute getModelComponent_Ref();

	/**
	 * Returns the meta object for class '{@link hybrid.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see hybrid.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the attribute '{@link hybrid.Rule#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see hybrid.Rule#isIsAbstract()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_IsAbstract();

	/**
	 * Returns the meta object for the container reference '{@link hybrid.Rule#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Module</em>'.
	 * @see hybrid.Rule#getModule()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Module();

	/**
	 * Returns the meta object for the attribute '{@link hybrid.Rule#isIsMain <em>Is Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Main</em>'.
	 * @see hybrid.Rule#isIsMain()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_IsMain();

	/**
	 * Returns the meta object for the attribute '{@link hybrid.Rule#getTypeRelation <em>Type Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Relation</em>'.
	 * @see hybrid.Rule#getTypeRelation()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_TypeRelation();

	/**
	 * Returns the meta object for the attribute '{@link hybrid.Rule#getTypeElement <em>Type Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Element</em>'.
	 * @see hybrid.Rule#getTypeElement()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_TypeElement();

	/**
	 * Returns the meta object for the attribute '{@link hybrid.Rule#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see hybrid.Rule#getComment()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Comment();

	/**
	 * Returns the meta object for the containment reference list '{@link hybrid.Rule#getSources <em>Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sources</em>'.
	 * @see hybrid.Rule#getSources()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Sources();

	/**
	 * Returns the meta object for the containment reference list '{@link hybrid.Rule#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Targets</em>'.
	 * @see hybrid.Rule#getTargets()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Targets();

	/**
	 * Returns the meta object for the containment reference '{@link hybrid.Rule#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Guard</em>'.
	 * @see hybrid.Rule#getGuard()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Guard();

	/**
	 * Returns the meta object for the containment reference '{@link hybrid.Rule#getTrace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trace</em>'.
	 * @see hybrid.Rule#getTrace()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Trace();

	/**
	 * Returns the meta object for class '{@link hybrid.RuleElement <em>Rule Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Element</em>'.
	 * @see hybrid.RuleElement
	 * @generated
	 */
	EClass getRuleElement();

	/**
	 * Returns the meta object for the reference list '{@link hybrid.RuleElement#getIsRefered <em>Is Refered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Refered</em>'.
	 * @see hybrid.RuleElement#getIsRefered()
	 * @see #getRuleElement()
	 * @generated
	 */
	EReference getRuleElement_IsRefered();

	/**
	 * Returns the meta object for the reference '{@link hybrid.RuleElement#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see hybrid.RuleElement#getComponent()
	 * @see #getRuleElement()
	 * @generated
	 */
	EReference getRuleElement_Component();

	/**
	 * Returns the meta object for class '{@link hybrid.Source <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source</em>'.
	 * @see hybrid.Source
	 * @generated
	 */
	EClass getSource();

	/**
	 * Returns the meta object for the container reference '{@link hybrid.Source#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Rule</em>'.
	 * @see hybrid.Source#getRule()
	 * @see #getSource()
	 * @generated
	 */
	EReference getSource_Rule();

	/**
	 * Returns the meta object for the container reference '{@link hybrid.Source#getRightPatternOwned <em>Right Pattern Owned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Right Pattern Owned</em>'.
	 * @see hybrid.Source#getRightPatternOwned()
	 * @see #getSource()
	 * @generated
	 */
	EReference getSource_RightPatternOwned();

	/**
	 * Returns the meta object for the reference list '{@link hybrid.Source#getTraceLink <em>Trace Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Trace Link</em>'.
	 * @see hybrid.Source#getTraceLink()
	 * @see #getSource()
	 * @generated
	 */
	EReference getSource_TraceLink();

	/**
	 * Returns the meta object for class '{@link hybrid.Target <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target</em>'.
	 * @see hybrid.Target
	 * @generated
	 */
	EClass getTarget();

	/**
	 * Returns the meta object for the container reference '{@link hybrid.Target#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Rule</em>'.
	 * @see hybrid.Target#getRule()
	 * @see #getTarget()
	 * @generated
	 */
	EReference getTarget_Rule();

	/**
	 * Returns the meta object for the containment reference list '{@link hybrid.Target#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
	 * @see hybrid.Target#getBindings()
	 * @see #getTarget()
	 * @generated
	 */
	EReference getTarget_Bindings();

	/**
	 * Returns the meta object for the container reference '{@link hybrid.Target#getLeftPatternOwned <em>Left Pattern Owned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Left Pattern Owned</em>'.
	 * @see hybrid.Target#getLeftPatternOwned()
	 * @see #getTarget()
	 * @generated
	 */
	EReference getTarget_LeftPatternOwned();

	/**
	 * Returns the meta object for the reference list '{@link hybrid.Target#getTraceLink <em>Trace Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Trace Link</em>'.
	 * @see hybrid.Target#getTraceLink()
	 * @see #getTarget()
	 * @generated
	 */
	EReference getTarget_TraceLink();

	/**
	 * Returns the meta object for class '{@link hybrid.Guard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guard</em>'.
	 * @see hybrid.Guard
	 * @generated
	 */
	EClass getGuard();

	/**
	 * Returns the meta object for the attribute '{@link hybrid.Guard#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see hybrid.Guard#getValue()
	 * @see #getGuard()
	 * @generated
	 */
	EAttribute getGuard_Value();

	/**
	 * Returns the meta object for the container reference '{@link hybrid.Guard#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Rule</em>'.
	 * @see hybrid.Guard#getRule()
	 * @see #getGuard()
	 * @generated
	 */
	EReference getGuard_Rule();

	/**
	 * Returns the meta object for class '{@link hybrid.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding</em>'.
	 * @see hybrid.Binding
	 * @generated
	 */
	EClass getBinding();

	/**
	 * Returns the meta object for the container reference '{@link hybrid.Binding#getOwned <em>Owned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned</em>'.
	 * @see hybrid.Binding#getOwned()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_Owned();

	/**
	 * Returns the meta object for the containment reference '{@link hybrid.Binding#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see hybrid.Binding#getRight()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_Right();

	/**
	 * Returns the meta object for the containment reference '{@link hybrid.Binding#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see hybrid.Binding#getLeft()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_Left();

	/**
	 * Returns the meta object for the attribute '{@link hybrid.Binding#getTypeRelation <em>Type Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Relation</em>'.
	 * @see hybrid.Binding#getTypeRelation()
	 * @see #getBinding()
	 * @generated
	 */
	EAttribute getBinding_TypeRelation();

	/**
	 * Returns the meta object for the attribute '{@link hybrid.Binding#getTypeElement <em>Type Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Element</em>'.
	 * @see hybrid.Binding#getTypeElement()
	 * @see #getBinding()
	 * @generated
	 */
	EAttribute getBinding_TypeElement();

	/**
	 * Returns the meta object for the reference '{@link hybrid.Binding#getTrace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trace</em>'.
	 * @see hybrid.Binding#getTrace()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_Trace();

	/**
	 * Returns the meta object for class '{@link hybrid.RightPattern <em>Right Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Right Pattern</em>'.
	 * @see hybrid.RightPattern
	 * @generated
	 */
	EClass getRightPattern();

	/**
	 * Returns the meta object for the container reference '{@link hybrid.RightPattern#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Binding</em>'.
	 * @see hybrid.RightPattern#getBinding()
	 * @see #getRightPattern()
	 * @generated
	 */
	EReference getRightPattern_Binding();

	/**
	 * Returns the meta object for the containment reference '{@link hybrid.RightPattern#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see hybrid.RightPattern#getSource()
	 * @see #getRightPattern()
	 * @generated
	 */
	EReference getRightPattern_Source();

	/**
	 * Returns the meta object for the reference '{@link hybrid.RightPattern#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation</em>'.
	 * @see hybrid.RightPattern#getOperation()
	 * @see #getRightPattern()
	 * @generated
	 */
	EReference getRightPattern_Operation();

	/**
	 * Returns the meta object for the attribute '{@link hybrid.RightPattern#getConcreteValue <em>Concrete Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Concrete Value</em>'.
	 * @see hybrid.RightPattern#getConcreteValue()
	 * @see #getRightPattern()
	 * @generated
	 */
	EAttribute getRightPattern_ConcreteValue();

	/**
	 * Returns the meta object for the reference '{@link hybrid.RightPattern#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see hybrid.RightPattern#getReference()
	 * @see #getRightPattern()
	 * @generated
	 */
	EReference getRightPattern_Reference();

	/**
	 * Returns the meta object for class '{@link hybrid.LeftPattern <em>Left Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Left Pattern</em>'.
	 * @see hybrid.LeftPattern
	 * @generated
	 */
	EClass getLeftPattern();

	/**
	 * Returns the meta object for the container reference '{@link hybrid.LeftPattern#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Binding</em>'.
	 * @see hybrid.LeftPattern#getBinding()
	 * @see #getLeftPattern()
	 * @generated
	 */
	EReference getLeftPattern_Binding();

	/**
	 * Returns the meta object for the containment reference '{@link hybrid.LeftPattern#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see hybrid.LeftPattern#getTarget()
	 * @see #getLeftPattern()
	 * @generated
	 */
	EReference getLeftPattern_Target();

	/**
	 * Returns the meta object for class '{@link hybrid.TraceRule <em>Trace Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace Rule</em>'.
	 * @see hybrid.TraceRule
	 * @generated
	 */
	EClass getTraceRule();

	/**
	 * Returns the meta object for the containment reference list '{@link hybrid.TraceRule#getTraceBindings <em>Trace Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trace Bindings</em>'.
	 * @see hybrid.TraceRule#getTraceBindings()
	 * @see #getTraceRule()
	 * @generated
	 */
	EReference getTraceRule_TraceBindings();

	/**
	 * Returns the meta object for class '{@link hybrid.TraceLink <em>Trace Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace Link</em>'.
	 * @see hybrid.TraceLink
	 * @generated
	 */
	EClass getTraceLink();

	/**
	 * Returns the meta object for the reference list '{@link hybrid.TraceLink#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source</em>'.
	 * @see hybrid.TraceLink#getSource()
	 * @see #getTraceLink()
	 * @generated
	 */
	EReference getTraceLink_Source();

	/**
	 * Returns the meta object for the reference list '{@link hybrid.TraceLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see hybrid.TraceLink#getTarget()
	 * @see #getTraceLink()
	 * @generated
	 */
	EReference getTraceLink_Target();

	/**
	 * Returns the meta object for class '{@link hybrid.TraceBinding <em>Trace Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace Binding</em>'.
	 * @see hybrid.TraceBinding
	 * @generated
	 */
	EClass getTraceBinding();

	/**
	 * Returns the meta object for the container reference '{@link hybrid.TraceBinding#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see hybrid.TraceBinding#getParent()
	 * @see #getTraceBinding()
	 * @generated
	 */
	EReference getTraceBinding_Parent();

	/**
	 * Returns the meta object for the reference '{@link hybrid.TraceBinding#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Binding</em>'.
	 * @see hybrid.TraceBinding#getBinding()
	 * @see #getTraceBinding()
	 * @generated
	 */
	EReference getTraceBinding_Binding();

	/**
	 * Returns the meta object for enum '{@link hybrid.TypeRelation <em>Type Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Relation</em>'.
	 * @see hybrid.TypeRelation
	 * @generated
	 */
	EEnum getTypeRelation();

	/**
	 * Returns the meta object for enum '{@link hybrid.TypeElement <em>Type Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Element</em>'.
	 * @see hybrid.TypeElement
	 * @generated
	 */
	EEnum getTypeElement();

	/**
	 * Returns the meta object for enum '{@link hybrid.Datatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Datatype</em>'.
	 * @see hybrid.Datatype
	 * @generated
	 */
	EEnum getDatatype();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HybridFactory getHybridFactory();

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
		 * The meta object literal for the '{@link hybrid.impl.HybridElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hybrid.impl.HybridElementImpl
		 * @see hybrid.impl.HybridPackageImpl#getHybridElement()
		 * @generated
		 */
		EClass HYBRID_ELEMENT = eINSTANCE.getHybridElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HYBRID_ELEMENT__NAME = eINSTANCE.getHybridElement_Name();

		/**
		 * The meta object literal for the '{@link hybrid.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hybrid.impl.ModuleImpl
		 * @see hybrid.impl.HybridPackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__OPERATIONS = eINSTANCE.getModule_Operations();

		/**
		 * The meta object literal for the '<em><b>Source Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__SOURCE_MODELS = eINSTANCE.getModule_SourceModels();

		/**
		 * The meta object literal for the '<em><b>Target Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__TARGET_MODELS = eINSTANCE.getModule_TargetModels();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__RULES = eINSTANCE.getModule_Rules();

		/**
		 * The meta object literal for the '{@link hybrid.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hybrid.impl.OperationImpl
		 * @see hybrid.impl.HybridPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__MODULE = eINSTANCE.getOperation_Module();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__BODY = eINSTANCE.getOperation_Body();

		/**
		 * The meta object literal for the '<em><b>Return</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__RETURN = eINSTANCE.getOperation_Return();

		/**
		 * The meta object literal for the '<em><b>Right Pattern</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__RIGHT_PATTERN = eINSTANCE.getOperation_RightPattern();

		/**
		 * The meta object literal for the '{@link hybrid.impl.ReturnImpl <em>Return</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hybrid.impl.ReturnImpl
		 * @see hybrid.impl.HybridPackageImpl#getReturn()
		 * @generated
		 */
		EClass RETURN = eINSTANCE.getReturn();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN__DATATYPE = eINSTANCE.getReturn_Datatype();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN__COMPONENT = eINSTANCE.getReturn_Component();

		/**
		 * The meta object literal for the '{@link hybrid.impl.SourceModelImpl <em>Source Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hybrid.impl.SourceModelImpl
		 * @see hybrid.impl.HybridPackageImpl#getSourceModel()
		 * @generated
		 */
		EClass SOURCE_MODEL = eINSTANCE.getSourceModel();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_MODEL__MODULE = eINSTANCE.getSourceModel_Module();

		/**
		 * The meta object literal for the '{@link hybrid.impl.TargetModelImpl <em>Target Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hybrid.impl.TargetModelImpl
		 * @see hybrid.impl.HybridPackageImpl#getTargetModel()
		 * @generated
		 */
		EClass TARGET_MODEL = eINSTANCE.getTargetModel();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_MODEL__MODULE = eINSTANCE.getTargetModel_Module();

		/**
		 * The meta object literal for the '{@link hybrid.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hybrid.impl.ModelImpl
		 * @see hybrid.impl.HybridPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__PATH = eINSTANCE.getModel_Path();

		/**
		 * The meta object literal for the '<em><b>Type mm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__TYPE_MM = eINSTANCE.getModel_Type_mm();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__ELEMENTS = eINSTANCE.getModel_Elements();

		/**
		 * The meta object literal for the '{@link hybrid.impl.ModelElementImpl <em>Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hybrid.impl.ModelElementImpl
		 * @see hybrid.impl.HybridPackageImpl#getModelElement()
		 * @generated
		 */
		EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

		/**
		 * The meta object literal for the '<em><b>Owned Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT__OWNED_MODEL = eINSTANCE.getModelElement_OwnedModel();

		/**
		 * The meta object literal for the '<em><b>Child Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT__CHILD_ELEMENTS = eINSTANCE.getModelElement_ChildElements();

		/**
		 * The meta object literal for the '<em><b>Parent Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT__PARENT_ELEMENT = eINSTANCE.getModelElement_ParentElement();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT__FEATURES = eINSTANCE.getModelElement_Features();

		/**
		 * The meta object literal for the '{@link hybrid.impl.ModelFeatureImpl <em>Model Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hybrid.impl.ModelFeatureImpl
		 * @see hybrid.impl.HybridPackageImpl#getModelFeature()
		 * @generated
		 */
		EClass MODEL_FEATURE = eINSTANCE.getModelFeature();

		/**
		 * The meta object literal for the '<em><b>Owned Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FEATURE__OWNED_ELEMENT = eINSTANCE.getModelFeature_OwnedElement();

		/**
		 * The meta object literal for the '{@link hybrid.impl.ModelComponentImpl <em>Model Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hybrid.impl.ModelComponentImpl
		 * @see hybrid.impl.HybridPackageImpl#getModelComponent()
		 * @generated
		 */
		EClass MODEL_COMPONENT = eINSTANCE.getModelComponent();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_COMPONENT__REF = eINSTANCE.getModelComponent_Ref();

		/**
		 * The meta object literal for the '{@link hybrid.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hybrid.impl.RuleImpl
		 * @see hybrid.impl.HybridPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__IS_ABSTRACT = eINSTANCE.getRule_IsAbstract();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__MODULE = eINSTANCE.getRule_Module();

		/**
		 * The meta object literal for the '<em><b>Is Main</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__IS_MAIN = eINSTANCE.getRule_IsMain();

		/**
		 * The meta object literal for the '<em><b>Type Relation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__TYPE_RELATION = eINSTANCE.getRule_TypeRelation();

		/**
		 * The meta object literal for the '<em><b>Type Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__TYPE_ELEMENT = eINSTANCE.getRule_TypeElement();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__COMMENT = eINSTANCE.getRule_Comment();

		/**
		 * The meta object literal for the '<em><b>Sources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__SOURCES = eINSTANCE.getRule_Sources();

		/**
		 * The meta object literal for the '<em><b>Targets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__TARGETS = eINSTANCE.getRule_Targets();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__GUARD = eINSTANCE.getRule_Guard();

		/**
		 * The meta object literal for the '<em><b>Trace</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__TRACE = eINSTANCE.getRule_Trace();

		/**
		 * The meta object literal for the '{@link hybrid.impl.RuleElementImpl <em>Rule Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hybrid.impl.RuleElementImpl
		 * @see hybrid.impl.HybridPackageImpl#getRuleElement()
		 * @generated
		 */
		EClass RULE_ELEMENT = eINSTANCE.getRuleElement();

		/**
		 * The meta object literal for the '<em><b>Is Refered</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_ELEMENT__IS_REFERED = eINSTANCE.getRuleElement_IsRefered();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_ELEMENT__COMPONENT = eINSTANCE.getRuleElement_Component();

		/**
		 * The meta object literal for the '{@link hybrid.impl.SourceImpl <em>Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hybrid.impl.SourceImpl
		 * @see hybrid.impl.HybridPackageImpl#getSource()
		 * @generated
		 */
		EClass SOURCE = eINSTANCE.getSource();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE__RULE = eINSTANCE.getSource_Rule();

		/**
		 * The meta object literal for the '<em><b>Right Pattern Owned</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE__RIGHT_PATTERN_OWNED = eINSTANCE.getSource_RightPatternOwned();

		/**
		 * The meta object literal for the '<em><b>Trace Link</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE__TRACE_LINK = eINSTANCE.getSource_TraceLink();

		/**
		 * The meta object literal for the '{@link hybrid.impl.TargetImpl <em>Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hybrid.impl.TargetImpl
		 * @see hybrid.impl.HybridPackageImpl#getTarget()
		 * @generated
		 */
		EClass TARGET = eINSTANCE.getTarget();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET__RULE = eINSTANCE.getTarget_Rule();

		/**
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET__BINDINGS = eINSTANCE.getTarget_Bindings();

		/**
		 * The meta object literal for the '<em><b>Left Pattern Owned</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET__LEFT_PATTERN_OWNED = eINSTANCE.getTarget_LeftPatternOwned();

		/**
		 * The meta object literal for the '<em><b>Trace Link</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET__TRACE_LINK = eINSTANCE.getTarget_TraceLink();

		/**
		 * The meta object literal for the '{@link hybrid.impl.GuardImpl <em>Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hybrid.impl.GuardImpl
		 * @see hybrid.impl.HybridPackageImpl#getGuard()
		 * @generated
		 */
		EClass GUARD = eINSTANCE.getGuard();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUARD__VALUE = eINSTANCE.getGuard_Value();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUARD__RULE = eINSTANCE.getGuard_Rule();

		/**
		 * The meta object literal for the '{@link hybrid.impl.BindingImpl <em>Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hybrid.impl.BindingImpl
		 * @see hybrid.impl.HybridPackageImpl#getBinding()
		 * @generated
		 */
		EClass BINDING = eINSTANCE.getBinding();

		/**
		 * The meta object literal for the '<em><b>Owned</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING__OWNED = eINSTANCE.getBinding_Owned();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING__RIGHT = eINSTANCE.getBinding_Right();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING__LEFT = eINSTANCE.getBinding_Left();

		/**
		 * The meta object literal for the '<em><b>Type Relation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING__TYPE_RELATION = eINSTANCE.getBinding_TypeRelation();

		/**
		 * The meta object literal for the '<em><b>Type Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING__TYPE_ELEMENT = eINSTANCE.getBinding_TypeElement();

		/**
		 * The meta object literal for the '<em><b>Trace</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING__TRACE = eINSTANCE.getBinding_Trace();

		/**
		 * The meta object literal for the '{@link hybrid.impl.RightPatternImpl <em>Right Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hybrid.impl.RightPatternImpl
		 * @see hybrid.impl.HybridPackageImpl#getRightPattern()
		 * @generated
		 */
		EClass RIGHT_PATTERN = eINSTANCE.getRightPattern();

		/**
		 * The meta object literal for the '<em><b>Binding</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIGHT_PATTERN__BINDING = eINSTANCE.getRightPattern_Binding();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIGHT_PATTERN__SOURCE = eINSTANCE.getRightPattern_Source();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIGHT_PATTERN__OPERATION = eINSTANCE.getRightPattern_Operation();

		/**
		 * The meta object literal for the '<em><b>Concrete Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RIGHT_PATTERN__CONCRETE_VALUE = eINSTANCE.getRightPattern_ConcreteValue();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIGHT_PATTERN__REFERENCE = eINSTANCE.getRightPattern_Reference();

		/**
		 * The meta object literal for the '{@link hybrid.impl.LeftPatternImpl <em>Left Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hybrid.impl.LeftPatternImpl
		 * @see hybrid.impl.HybridPackageImpl#getLeftPattern()
		 * @generated
		 */
		EClass LEFT_PATTERN = eINSTANCE.getLeftPattern();

		/**
		 * The meta object literal for the '<em><b>Binding</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEFT_PATTERN__BINDING = eINSTANCE.getLeftPattern_Binding();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEFT_PATTERN__TARGET = eINSTANCE.getLeftPattern_Target();

		/**
		 * The meta object literal for the '{@link hybrid.impl.TraceRuleImpl <em>Trace Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hybrid.impl.TraceRuleImpl
		 * @see hybrid.impl.HybridPackageImpl#getTraceRule()
		 * @generated
		 */
		EClass TRACE_RULE = eINSTANCE.getTraceRule();

		/**
		 * The meta object literal for the '<em><b>Trace Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_RULE__TRACE_BINDINGS = eINSTANCE.getTraceRule_TraceBindings();

		/**
		 * The meta object literal for the '{@link hybrid.impl.TraceLinkImpl <em>Trace Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hybrid.impl.TraceLinkImpl
		 * @see hybrid.impl.HybridPackageImpl#getTraceLink()
		 * @generated
		 */
		EClass TRACE_LINK = eINSTANCE.getTraceLink();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_LINK__SOURCE = eINSTANCE.getTraceLink_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_LINK__TARGET = eINSTANCE.getTraceLink_Target();

		/**
		 * The meta object literal for the '{@link hybrid.impl.TraceBindingImpl <em>Trace Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hybrid.impl.TraceBindingImpl
		 * @see hybrid.impl.HybridPackageImpl#getTraceBinding()
		 * @generated
		 */
		EClass TRACE_BINDING = eINSTANCE.getTraceBinding();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_BINDING__PARENT = eINSTANCE.getTraceBinding_Parent();

		/**
		 * The meta object literal for the '<em><b>Binding</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_BINDING__BINDING = eINSTANCE.getTraceBinding_Binding();

		/**
		 * The meta object literal for the '{@link hybrid.TypeRelation <em>Type Relation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hybrid.TypeRelation
		 * @see hybrid.impl.HybridPackageImpl#getTypeRelation()
		 * @generated
		 */
		EEnum TYPE_RELATION = eINSTANCE.getTypeRelation();

		/**
		 * The meta object literal for the '{@link hybrid.TypeElement <em>Type Element</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hybrid.TypeElement
		 * @see hybrid.impl.HybridPackageImpl#getTypeElement()
		 * @generated
		 */
		EEnum TYPE_ELEMENT = eINSTANCE.getTypeElement();

		/**
		 * The meta object literal for the '{@link hybrid.Datatype <em>Datatype</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hybrid.Datatype
		 * @see hybrid.impl.HybridPackageImpl#getDatatype()
		 * @generated
		 */
		EEnum DATATYPE = eINSTANCE.getDatatype();

	}

} //HybridPackage
