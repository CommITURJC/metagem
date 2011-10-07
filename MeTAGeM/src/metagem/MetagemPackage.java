/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metagem;

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
 * @see metagem.MetagemFactory
 * @model kind="package"
 * @generated
 */
public interface MetagemPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "metagem";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.eclipse.kybele.metagem";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "metagem";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetagemPackage eINSTANCE = metagem.impl.MetagemPackageImpl.init();

	/**
	 * The meta object id for the '{@link metagem.impl.ModelRootImpl <em>Model Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metagem.impl.ModelRootImpl
	 * @see metagem.impl.MetagemPackageImpl#getModelRoot()
	 * @generated
	 */
	int MODEL_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Source Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT__SOURCE_MODELS = 0;

	/**
	 * The feature id for the '<em><b>Target Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT__TARGET_MODELS = 1;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT__RELATIONS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT__NAME = 3;

	/**
	 * The number of structural features of the '<em>Model Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link metagem.impl.TransformationElementImpl <em>Transformation Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metagem.impl.TransformationElementImpl
	 * @see metagem.impl.MetagemPackageImpl#getTransformationElement()
	 * @generated
	 */
	int TRANSFORMATION_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Transformation Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link metagem.impl.ModelTransfImpl <em>Model Transf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metagem.impl.ModelTransfImpl
	 * @see metagem.impl.MetagemPackageImpl#getModelTransf()
	 * @generated
	 */
	int MODEL_TRANSF = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TRANSF__NAME = TRANSFORMATION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TRANSF__PATH = TRANSFORMATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TRANSF__ELEMENTS = TRANSFORMATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Model Transf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TRANSF_FEATURE_COUNT = TRANSFORMATION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link metagem.impl.SourceModelTransfImpl <em>Source Model Transf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metagem.impl.SourceModelTransfImpl
	 * @see metagem.impl.MetagemPackageImpl#getSourceModelTransf()
	 * @generated
	 */
	int SOURCE_MODEL_TRANSF = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_MODEL_TRANSF__NAME = MODEL_TRANSF__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_MODEL_TRANSF__PATH = MODEL_TRANSF__PATH;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_MODEL_TRANSF__ELEMENTS = MODEL_TRANSF__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_MODEL_TRANSF__OWNED_ELEMENT = MODEL_TRANSF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Source Model Transf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_MODEL_TRANSF_FEATURE_COUNT = MODEL_TRANSF_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link metagem.impl.TargetModelTransfImpl <em>Target Model Transf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metagem.impl.TargetModelTransfImpl
	 * @see metagem.impl.MetagemPackageImpl#getTargetModelTransf()
	 * @generated
	 */
	int TARGET_MODEL_TRANSF = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_MODEL_TRANSF__NAME = MODEL_TRANSF__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_MODEL_TRANSF__PATH = MODEL_TRANSF__PATH;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_MODEL_TRANSF__ELEMENTS = MODEL_TRANSF__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_MODEL_TRANSF__OWNED_ELEMENT = MODEL_TRANSF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Target Model Transf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_MODEL_TRANSF_FEATURE_COUNT = MODEL_TRANSF_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link metagem.impl.ModelComponentImpl <em>Model Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metagem.impl.ModelComponentImpl
	 * @see metagem.impl.MetagemPackageImpl#getModelComponent()
	 * @generated
	 */
	int MODEL_COMPONENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_COMPONENT__NAME = TRANSFORMATION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Relation Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_COMPONENT__RELATION_ELEMENT = TRANSFORMATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_COMPONENT__REF = TRANSFORMATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Model Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_COMPONENT_FEATURE_COUNT = TRANSFORMATION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link metagem.impl.RelationsImpl <em>Relations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metagem.impl.RelationsImpl
	 * @see metagem.impl.MetagemPackageImpl#getRelations()
	 * @generated
	 */
	int RELATIONS = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONS__NAME = TRANSFORMATION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owned Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONS__OWNED_MODEL = TRANSFORMATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Relation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONS__TYPE_RELATION = TRANSFORMATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONS__TYPE_ELEMENT = TRANSFORMATION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONS__ROLE = TRANSFORMATION_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONS__EXTENDS = TRANSFORMATION_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Extended</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONS__IS_EXTENDED = TRANSFORMATION_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Guard Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONS__GUARD_CONDITION = TRANSFORMATION_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Is Invoked</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONS__IS_INVOKED = TRANSFORMATION_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Relations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONS_FEATURE_COUNT = TRANSFORMATION_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link metagem.impl.OneToOneImpl <em>One To One</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metagem.impl.OneToOneImpl
	 * @see metagem.impl.MetagemPackageImpl#getOneToOne()
	 * @generated
	 */
	int ONE_TO_ONE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__NAME = RELATIONS__NAME;

	/**
	 * The feature id for the '<em><b>Owned Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__OWNED_MODEL = RELATIONS__OWNED_MODEL;

	/**
	 * The feature id for the '<em><b>Type Relation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__TYPE_RELATION = RELATIONS__TYPE_RELATION;

	/**
	 * The feature id for the '<em><b>Type Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__TYPE_ELEMENT = RELATIONS__TYPE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__ROLE = RELATIONS__ROLE;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__EXTENDS = RELATIONS__EXTENDS;

	/**
	 * The feature id for the '<em><b>Is Extended</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__IS_EXTENDED = RELATIONS__IS_EXTENDED;

	/**
	 * The feature id for the '<em><b>Guard Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__GUARD_CONDITION = RELATIONS__GUARD_CONDITION;

	/**
	 * The feature id for the '<em><b>Is Invoked</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__IS_INVOKED = RELATIONS__IS_INVOKED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__SOURCE = RELATIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__TARGET = RELATIONS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE__OWNED_ELEMENT = RELATIONS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>One To One</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ONE_FEATURE_COUNT = RELATIONS_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link metagem.impl.OneToZeroImpl <em>One To Zero</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metagem.impl.OneToZeroImpl
	 * @see metagem.impl.MetagemPackageImpl#getOneToZero()
	 * @generated
	 */
	int ONE_TO_ZERO = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ZERO__NAME = RELATIONS__NAME;

	/**
	 * The feature id for the '<em><b>Owned Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ZERO__OWNED_MODEL = RELATIONS__OWNED_MODEL;

	/**
	 * The feature id for the '<em><b>Type Relation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ZERO__TYPE_RELATION = RELATIONS__TYPE_RELATION;

	/**
	 * The feature id for the '<em><b>Type Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ZERO__TYPE_ELEMENT = RELATIONS__TYPE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ZERO__ROLE = RELATIONS__ROLE;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ZERO__EXTENDS = RELATIONS__EXTENDS;

	/**
	 * The feature id for the '<em><b>Is Extended</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ZERO__IS_EXTENDED = RELATIONS__IS_EXTENDED;

	/**
	 * The feature id for the '<em><b>Guard Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ZERO__GUARD_CONDITION = RELATIONS__GUARD_CONDITION;

	/**
	 * The feature id for the '<em><b>Is Invoked</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ZERO__IS_INVOKED = RELATIONS__IS_INVOKED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ZERO__SOURCE = RELATIONS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>One To Zero</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_ZERO_FEATURE_COUNT = RELATIONS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link metagem.impl.ZeroToOneImpl <em>Zero To One</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metagem.impl.ZeroToOneImpl
	 * @see metagem.impl.MetagemPackageImpl#getZeroToOne()
	 * @generated
	 */
	int ZERO_TO_ONE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZERO_TO_ONE__NAME = RELATIONS__NAME;

	/**
	 * The feature id for the '<em><b>Owned Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZERO_TO_ONE__OWNED_MODEL = RELATIONS__OWNED_MODEL;

	/**
	 * The feature id for the '<em><b>Type Relation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZERO_TO_ONE__TYPE_RELATION = RELATIONS__TYPE_RELATION;

	/**
	 * The feature id for the '<em><b>Type Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZERO_TO_ONE__TYPE_ELEMENT = RELATIONS__TYPE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZERO_TO_ONE__ROLE = RELATIONS__ROLE;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZERO_TO_ONE__EXTENDS = RELATIONS__EXTENDS;

	/**
	 * The feature id for the '<em><b>Is Extended</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZERO_TO_ONE__IS_EXTENDED = RELATIONS__IS_EXTENDED;

	/**
	 * The feature id for the '<em><b>Guard Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZERO_TO_ONE__GUARD_CONDITION = RELATIONS__GUARD_CONDITION;

	/**
	 * The feature id for the '<em><b>Is Invoked</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZERO_TO_ONE__IS_INVOKED = RELATIONS__IS_INVOKED;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZERO_TO_ONE__TARGET = RELATIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZERO_TO_ONE__OWNED_ELEMENT = RELATIONS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Zero To One</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZERO_TO_ONE_FEATURE_COUNT = RELATIONS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link metagem.impl.OneToManyImpl <em>One To Many</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metagem.impl.OneToManyImpl
	 * @see metagem.impl.MetagemPackageImpl#getOneToMany()
	 * @generated
	 */
	int ONE_TO_MANY = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__NAME = RELATIONS__NAME;

	/**
	 * The feature id for the '<em><b>Owned Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__OWNED_MODEL = RELATIONS__OWNED_MODEL;

	/**
	 * The feature id for the '<em><b>Type Relation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__TYPE_RELATION = RELATIONS__TYPE_RELATION;

	/**
	 * The feature id for the '<em><b>Type Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__TYPE_ELEMENT = RELATIONS__TYPE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__ROLE = RELATIONS__ROLE;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__EXTENDS = RELATIONS__EXTENDS;

	/**
	 * The feature id for the '<em><b>Is Extended</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__IS_EXTENDED = RELATIONS__IS_EXTENDED;

	/**
	 * The feature id for the '<em><b>Guard Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__GUARD_CONDITION = RELATIONS__GUARD_CONDITION;

	/**
	 * The feature id for the '<em><b>Is Invoked</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__IS_INVOKED = RELATIONS__IS_INVOKED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__SOURCE = RELATIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY__TARGET = RELATIONS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>One To Many</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TO_MANY_FEATURE_COUNT = RELATIONS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link metagem.impl.ManyToOneImpl <em>Many To One</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metagem.impl.ManyToOneImpl
	 * @see metagem.impl.MetagemPackageImpl#getManyToOne()
	 * @generated
	 */
	int MANY_TO_ONE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__NAME = RELATIONS__NAME;

	/**
	 * The feature id for the '<em><b>Owned Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__OWNED_MODEL = RELATIONS__OWNED_MODEL;

	/**
	 * The feature id for the '<em><b>Type Relation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__TYPE_RELATION = RELATIONS__TYPE_RELATION;

	/**
	 * The feature id for the '<em><b>Type Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__TYPE_ELEMENT = RELATIONS__TYPE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__ROLE = RELATIONS__ROLE;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__EXTENDS = RELATIONS__EXTENDS;

	/**
	 * The feature id for the '<em><b>Is Extended</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__IS_EXTENDED = RELATIONS__IS_EXTENDED;

	/**
	 * The feature id for the '<em><b>Guard Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__GUARD_CONDITION = RELATIONS__GUARD_CONDITION;

	/**
	 * The feature id for the '<em><b>Is Invoked</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__IS_INVOKED = RELATIONS__IS_INVOKED;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__TARGET = RELATIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__SOURCE = RELATIONS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE__OWNED_ELEMENT = RELATIONS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Many To One</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_ONE_FEATURE_COUNT = RELATIONS_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link metagem.impl.ManyToManyImpl <em>Many To Many</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metagem.impl.ManyToManyImpl
	 * @see metagem.impl.MetagemPackageImpl#getManyToMany()
	 * @generated
	 */
	int MANY_TO_MANY = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__NAME = RELATIONS__NAME;

	/**
	 * The feature id for the '<em><b>Owned Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__OWNED_MODEL = RELATIONS__OWNED_MODEL;

	/**
	 * The feature id for the '<em><b>Type Relation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__TYPE_RELATION = RELATIONS__TYPE_RELATION;

	/**
	 * The feature id for the '<em><b>Type Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__TYPE_ELEMENT = RELATIONS__TYPE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__ROLE = RELATIONS__ROLE;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__EXTENDS = RELATIONS__EXTENDS;

	/**
	 * The feature id for the '<em><b>Is Extended</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__IS_EXTENDED = RELATIONS__IS_EXTENDED;

	/**
	 * The feature id for the '<em><b>Guard Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__GUARD_CONDITION = RELATIONS__GUARD_CONDITION;

	/**
	 * The feature id for the '<em><b>Is Invoked</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__IS_INVOKED = RELATIONS__IS_INVOKED;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__TARGET = RELATIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY__SOURCE = RELATIONS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Many To Many</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TO_MANY_FEATURE_COUNT = RELATIONS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link metagem.impl.RelationElementImpl <em>Relation Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metagem.impl.RelationElementImpl
	 * @see metagem.impl.MetagemPackageImpl#getRelationElement()
	 * @generated
	 */
	int RELATION_ELEMENT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_ELEMENT__NAME = TRANSFORMATION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Model Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_ELEMENT__MODEL_COMPONENT = TRANSFORMATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Relation Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_ELEMENT_FEATURE_COUNT = TRANSFORMATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link metagem.impl.SourceElementImpl <em>Source Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metagem.impl.SourceElementImpl
	 * @see metagem.impl.MetagemPackageImpl#getSourceElement()
	 * @generated
	 */
	int SOURCE_ELEMENT = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ELEMENT__NAME = RELATION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Model Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ELEMENT__MODEL_COMPONENT = RELATION_ELEMENT__MODEL_COMPONENT;

	/**
	 * The feature id for the '<em><b>Invokes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ELEMENT__INVOKES = RELATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Source Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ELEMENT_FEATURE_COUNT = RELATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link metagem.impl.TargetElementImpl <em>Target Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metagem.impl.TargetElementImpl
	 * @see metagem.impl.MetagemPackageImpl#getTargetElement()
	 * @generated
	 */
	int TARGET_ELEMENT = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_ELEMENT__NAME = RELATION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Model Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_ELEMENT__MODEL_COMPONENT = RELATION_ELEMENT__MODEL_COMPONENT;

	/**
	 * The feature id for the '<em><b>Zero To One</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_ELEMENT__ZERO_TO_ONE = RELATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>One To One</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_ELEMENT__ONE_TO_ONE = RELATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Many To One</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_ELEMENT__MANY_TO_ONE = RELATION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Target Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_ELEMENT_FEATURE_COUNT = RELATION_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link metagem.impl.ModelElementImpl <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metagem.impl.ModelElementImpl
	 * @see metagem.impl.MetagemPackageImpl#getModelElement()
	 * @generated
	 */
	int MODEL_ELEMENT = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__NAME = MODEL_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Relation Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__RELATION_ELEMENT = MODEL_COMPONENT__RELATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__REF = MODEL_COMPONENT__REF;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__FEATURES = MODEL_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__ELEMENTS = MODEL_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Super Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__SUPER_ELEMENT = MODEL_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__OWNED_ELEMENT = MODEL_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__CONTAINS = MODEL_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Contained</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__IS_CONTAINED = MODEL_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_FEATURE_COUNT = MODEL_COMPONENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link metagem.impl.ModelFeatureImpl <em>Model Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metagem.impl.ModelFeatureImpl
	 * @see metagem.impl.MetagemPackageImpl#getModelFeature()
	 * @generated
	 */
	int MODEL_FEATURE = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE__NAME = MODEL_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Relation Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE__RELATION_ELEMENT = MODEL_COMPONENT__RELATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE__REF = MODEL_COMPONENT__REF;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE__PARENT = MODEL_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_FEATURE_COUNT = MODEL_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link metagem.TRelation <em>TRelation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metagem.TRelation
	 * @see metagem.impl.MetagemPackageImpl#getTRelation()
	 * @generated
	 */
	int TRELATION = 18;

	/**
	 * The meta object id for the '{@link metagem.TElement <em>TElement</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metagem.TElement
	 * @see metagem.impl.MetagemPackageImpl#getTElement()
	 * @generated
	 */
	int TELEMENT = 19;

	/**
	 * The meta object id for the '{@link metagem.TRole <em>TRole</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metagem.TRole
	 * @see metagem.impl.MetagemPackageImpl#getTRole()
	 * @generated
	 */
	int TROLE = 20;


	/**
	 * Returns the meta object for class '{@link metagem.ModelRoot <em>Model Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Root</em>'.
	 * @see metagem.ModelRoot
	 * @generated
	 */
	EClass getModelRoot();

	/**
	 * Returns the meta object for the attribute '{@link metagem.ModelRoot#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metagem.ModelRoot#getName()
	 * @see #getModelRoot()
	 * @generated
	 */
	EAttribute getModelRoot_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link metagem.ModelRoot#getSourceModels <em>Source Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source Models</em>'.
	 * @see metagem.ModelRoot#getSourceModels()
	 * @see #getModelRoot()
	 * @generated
	 */
	EReference getModelRoot_SourceModels();

	/**
	 * Returns the meta object for the containment reference list '{@link metagem.ModelRoot#getTargetModels <em>Target Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target Models</em>'.
	 * @see metagem.ModelRoot#getTargetModels()
	 * @see #getModelRoot()
	 * @generated
	 */
	EReference getModelRoot_TargetModels();

	/**
	 * Returns the meta object for the containment reference list '{@link metagem.ModelRoot#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relations</em>'.
	 * @see metagem.ModelRoot#getRelations()
	 * @see #getModelRoot()
	 * @generated
	 */
	EReference getModelRoot_Relations();

	/**
	 * Returns the meta object for class '{@link metagem.TransformationElement <em>Transformation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation Element</em>'.
	 * @see metagem.TransformationElement
	 * @generated
	 */
	EClass getTransformationElement();

	/**
	 * Returns the meta object for the attribute '{@link metagem.TransformationElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see metagem.TransformationElement#getName()
	 * @see #getTransformationElement()
	 * @generated
	 */
	EAttribute getTransformationElement_Name();

	/**
	 * Returns the meta object for class '{@link metagem.ModelTransf <em>Model Transf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Transf</em>'.
	 * @see metagem.ModelTransf
	 * @generated
	 */
	EClass getModelTransf();

	/**
	 * Returns the meta object for the attribute '{@link metagem.ModelTransf#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see metagem.ModelTransf#getPath()
	 * @see #getModelTransf()
	 * @generated
	 */
	EAttribute getModelTransf_Path();

	/**
	 * Returns the meta object for the containment reference list '{@link metagem.ModelTransf#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see metagem.ModelTransf#getElements()
	 * @see #getModelTransf()
	 * @generated
	 */
	EReference getModelTransf_Elements();

	/**
	 * Returns the meta object for class '{@link metagem.SourceModelTransf <em>Source Model Transf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Model Transf</em>'.
	 * @see metagem.SourceModelTransf
	 * @generated
	 */
	EClass getSourceModelTransf();

	/**
	 * Returns the meta object for the container reference '{@link metagem.SourceModelTransf#getOwnedElement <em>Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned Element</em>'.
	 * @see metagem.SourceModelTransf#getOwnedElement()
	 * @see #getSourceModelTransf()
	 * @generated
	 */
	EReference getSourceModelTransf_OwnedElement();

	/**
	 * Returns the meta object for class '{@link metagem.TargetModelTransf <em>Target Model Transf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Model Transf</em>'.
	 * @see metagem.TargetModelTransf
	 * @generated
	 */
	EClass getTargetModelTransf();

	/**
	 * Returns the meta object for the container reference '{@link metagem.TargetModelTransf#getOwnedElement <em>Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned Element</em>'.
	 * @see metagem.TargetModelTransf#getOwnedElement()
	 * @see #getTargetModelTransf()
	 * @generated
	 */
	EReference getTargetModelTransf_OwnedElement();

	/**
	 * Returns the meta object for class '{@link metagem.ModelComponent <em>Model Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Component</em>'.
	 * @see metagem.ModelComponent
	 * @generated
	 */
	EClass getModelComponent();

	/**
	 * Returns the meta object for the reference list '{@link metagem.ModelComponent#getRelationElement <em>Relation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Relation Element</em>'.
	 * @see metagem.ModelComponent#getRelationElement()
	 * @see #getModelComponent()
	 * @generated
	 */
	EReference getModelComponent_RelationElement();

	/**
	 * Returns the meta object for the attribute '{@link metagem.ModelComponent#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see metagem.ModelComponent#getRef()
	 * @see #getModelComponent()
	 * @generated
	 */
	EAttribute getModelComponent_Ref();

	/**
	 * Returns the meta object for class '{@link metagem.Relations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relations</em>'.
	 * @see metagem.Relations
	 * @generated
	 */
	EClass getRelations();

	/**
	 * Returns the meta object for the container reference '{@link metagem.Relations#getOwnedModel <em>Owned Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned Model</em>'.
	 * @see metagem.Relations#getOwnedModel()
	 * @see #getRelations()
	 * @generated
	 */
	EReference getRelations_OwnedModel();

	/**
	 * Returns the meta object for the attribute '{@link metagem.Relations#getTypeRelation <em>Type Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Relation</em>'.
	 * @see metagem.Relations#getTypeRelation()
	 * @see #getRelations()
	 * @generated
	 */
	EAttribute getRelations_TypeRelation();

	/**
	 * Returns the meta object for the attribute '{@link metagem.Relations#getTypeElement <em>Type Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Element</em>'.
	 * @see metagem.Relations#getTypeElement()
	 * @see #getRelations()
	 * @generated
	 */
	EAttribute getRelations_TypeElement();

	/**
	 * Returns the meta object for the attribute '{@link metagem.Relations#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see metagem.Relations#getRole()
	 * @see #getRelations()
	 * @generated
	 */
	EAttribute getRelations_Role();

	/**
	 * Returns the meta object for the reference '{@link metagem.Relations#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extends</em>'.
	 * @see metagem.Relations#getExtends()
	 * @see #getRelations()
	 * @generated
	 */
	EReference getRelations_Extends();

	/**
	 * Returns the meta object for the reference list '{@link metagem.Relations#getIsExtended <em>Is Extended</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Extended</em>'.
	 * @see metagem.Relations#getIsExtended()
	 * @see #getRelations()
	 * @generated
	 */
	EReference getRelations_IsExtended();

	/**
	 * Returns the meta object for the attribute '{@link metagem.Relations#getGuardCondition <em>Guard Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard Condition</em>'.
	 * @see metagem.Relations#getGuardCondition()
	 * @see #getRelations()
	 * @generated
	 */
	EAttribute getRelations_GuardCondition();

	/**
	 * Returns the meta object for the reference list '{@link metagem.Relations#getIsInvoked <em>Is Invoked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Invoked</em>'.
	 * @see metagem.Relations#getIsInvoked()
	 * @see #getRelations()
	 * @generated
	 */
	EReference getRelations_IsInvoked();

	/**
	 * Returns the meta object for class '{@link metagem.OneToOne <em>One To One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>One To One</em>'.
	 * @see metagem.OneToOne
	 * @generated
	 */
	EClass getOneToOne();

	/**
	 * Returns the meta object for the containment reference '{@link metagem.OneToOne#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see metagem.OneToOne#getSource()
	 * @see #getOneToOne()
	 * @generated
	 */
	EReference getOneToOne_Source();

	/**
	 * Returns the meta object for the containment reference '{@link metagem.OneToOne#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see metagem.OneToOne#getTarget()
	 * @see #getOneToOne()
	 * @generated
	 */
	EReference getOneToOne_Target();

	/**
	 * Returns the meta object for the container reference '{@link metagem.OneToOne#getOwnedElement <em>Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned Element</em>'.
	 * @see metagem.OneToOne#getOwnedElement()
	 * @see #getOneToOne()
	 * @generated
	 */
	EReference getOneToOne_OwnedElement();

	/**
	 * Returns the meta object for class '{@link metagem.OneToZero <em>One To Zero</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>One To Zero</em>'.
	 * @see metagem.OneToZero
	 * @generated
	 */
	EClass getOneToZero();

	/**
	 * Returns the meta object for the containment reference '{@link metagem.OneToZero#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see metagem.OneToZero#getSource()
	 * @see #getOneToZero()
	 * @generated
	 */
	EReference getOneToZero_Source();

	/**
	 * Returns the meta object for class '{@link metagem.ZeroToOne <em>Zero To One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zero To One</em>'.
	 * @see metagem.ZeroToOne
	 * @generated
	 */
	EClass getZeroToOne();

	/**
	 * Returns the meta object for the containment reference '{@link metagem.ZeroToOne#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see metagem.ZeroToOne#getTarget()
	 * @see #getZeroToOne()
	 * @generated
	 */
	EReference getZeroToOne_Target();

	/**
	 * Returns the meta object for the container reference '{@link metagem.ZeroToOne#getOwnedElement <em>Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned Element</em>'.
	 * @see metagem.ZeroToOne#getOwnedElement()
	 * @see #getZeroToOne()
	 * @generated
	 */
	EReference getZeroToOne_OwnedElement();

	/**
	 * Returns the meta object for class '{@link metagem.OneToMany <em>One To Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>One To Many</em>'.
	 * @see metagem.OneToMany
	 * @generated
	 */
	EClass getOneToMany();

	/**
	 * Returns the meta object for the containment reference '{@link metagem.OneToMany#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see metagem.OneToMany#getSource()
	 * @see #getOneToMany()
	 * @generated
	 */
	EReference getOneToMany_Source();

	/**
	 * Returns the meta object for the containment reference list '{@link metagem.OneToMany#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target</em>'.
	 * @see metagem.OneToMany#getTarget()
	 * @see #getOneToMany()
	 * @generated
	 */
	EReference getOneToMany_Target();

	/**
	 * Returns the meta object for class '{@link metagem.ManyToOne <em>Many To One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Many To One</em>'.
	 * @see metagem.ManyToOne
	 * @generated
	 */
	EClass getManyToOne();

	/**
	 * Returns the meta object for the containment reference '{@link metagem.ManyToOne#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see metagem.ManyToOne#getTarget()
	 * @see #getManyToOne()
	 * @generated
	 */
	EReference getManyToOne_Target();

	/**
	 * Returns the meta object for the containment reference list '{@link metagem.ManyToOne#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source</em>'.
	 * @see metagem.ManyToOne#getSource()
	 * @see #getManyToOne()
	 * @generated
	 */
	EReference getManyToOne_Source();

	/**
	 * Returns the meta object for the container reference '{@link metagem.ManyToOne#getOwnedElement <em>Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned Element</em>'.
	 * @see metagem.ManyToOne#getOwnedElement()
	 * @see #getManyToOne()
	 * @generated
	 */
	EReference getManyToOne_OwnedElement();

	/**
	 * Returns the meta object for class '{@link metagem.ManyToMany <em>Many To Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Many To Many</em>'.
	 * @see metagem.ManyToMany
	 * @generated
	 */
	EClass getManyToMany();

	/**
	 * Returns the meta object for the containment reference list '{@link metagem.ManyToMany#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target</em>'.
	 * @see metagem.ManyToMany#getTarget()
	 * @see #getManyToMany()
	 * @generated
	 */
	EReference getManyToMany_Target();

	/**
	 * Returns the meta object for the containment reference list '{@link metagem.ManyToMany#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source</em>'.
	 * @see metagem.ManyToMany#getSource()
	 * @see #getManyToMany()
	 * @generated
	 */
	EReference getManyToMany_Source();

	/**
	 * Returns the meta object for class '{@link metagem.RelationElement <em>Relation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Element</em>'.
	 * @see metagem.RelationElement
	 * @generated
	 */
	EClass getRelationElement();

	/**
	 * Returns the meta object for the reference '{@link metagem.RelationElement#getModelComponent <em>Model Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model Component</em>'.
	 * @see metagem.RelationElement#getModelComponent()
	 * @see #getRelationElement()
	 * @generated
	 */
	EReference getRelationElement_ModelComponent();

	/**
	 * Returns the meta object for class '{@link metagem.SourceElement <em>Source Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Element</em>'.
	 * @see metagem.SourceElement
	 * @generated
	 */
	EClass getSourceElement();

	/**
	 * Returns the meta object for the reference '{@link metagem.SourceElement#getInvokes <em>Invokes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invokes</em>'.
	 * @see metagem.SourceElement#getInvokes()
	 * @see #getSourceElement()
	 * @generated
	 */
	EReference getSourceElement_Invokes();

	/**
	 * Returns the meta object for class '{@link metagem.TargetElement <em>Target Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Element</em>'.
	 * @see metagem.TargetElement
	 * @generated
	 */
	EClass getTargetElement();

	/**
	 * Returns the meta object for the containment reference list '{@link metagem.TargetElement#getZeroToOne <em>Zero To One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Zero To One</em>'.
	 * @see metagem.TargetElement#getZeroToOne()
	 * @see #getTargetElement()
	 * @generated
	 */
	EReference getTargetElement_ZeroToOne();

	/**
	 * Returns the meta object for the containment reference list '{@link metagem.TargetElement#getOneToOne <em>One To One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>One To One</em>'.
	 * @see metagem.TargetElement#getOneToOne()
	 * @see #getTargetElement()
	 * @generated
	 */
	EReference getTargetElement_OneToOne();

	/**
	 * Returns the meta object for the containment reference list '{@link metagem.TargetElement#getManyToOne <em>Many To One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Many To One</em>'.
	 * @see metagem.TargetElement#getManyToOne()
	 * @see #getTargetElement()
	 * @generated
	 */
	EReference getTargetElement_ManyToOne();

	/**
	 * Returns the meta object for class '{@link metagem.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element</em>'.
	 * @see metagem.ModelElement
	 * @generated
	 */
	EClass getModelElement();

	/**
	 * Returns the meta object for the containment reference list '{@link metagem.ModelElement#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see metagem.ModelElement#getFeatures()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_Features();

	/**
	 * Returns the meta object for the containment reference list '{@link metagem.ModelElement#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see metagem.ModelElement#getElements()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_Elements();

	/**
	 * Returns the meta object for the container reference '{@link metagem.ModelElement#getSuperElement <em>Super Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Super Element</em>'.
	 * @see metagem.ModelElement#getSuperElement()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_SuperElement();

	/**
	 * Returns the meta object for the container reference '{@link metagem.ModelElement#getOwnedElement <em>Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned Element</em>'.
	 * @see metagem.ModelElement#getOwnedElement()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_OwnedElement();

	/**
	 * Returns the meta object for the reference list '{@link metagem.ModelElement#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contains</em>'.
	 * @see metagem.ModelElement#getContains()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_Contains();

	/**
	 * Returns the meta object for the reference '{@link metagem.ModelElement#getIsContained <em>Is Contained</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Contained</em>'.
	 * @see metagem.ModelElement#getIsContained()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_IsContained();

	/**
	 * Returns the meta object for class '{@link metagem.ModelFeature <em>Model Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Feature</em>'.
	 * @see metagem.ModelFeature
	 * @generated
	 */
	EClass getModelFeature();

	/**
	 * Returns the meta object for the container reference '{@link metagem.ModelFeature#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see metagem.ModelFeature#getParent()
	 * @see #getModelFeature()
	 * @generated
	 */
	EReference getModelFeature_Parent();

	/**
	 * Returns the meta object for enum '{@link metagem.TRelation <em>TRelation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TRelation</em>'.
	 * @see metagem.TRelation
	 * @generated
	 */
	EEnum getTRelation();

	/**
	 * Returns the meta object for enum '{@link metagem.TElement <em>TElement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TElement</em>'.
	 * @see metagem.TElement
	 * @generated
	 */
	EEnum getTElement();

	/**
	 * Returns the meta object for enum '{@link metagem.TRole <em>TRole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TRole</em>'.
	 * @see metagem.TRole
	 * @generated
	 */
	EEnum getTRole();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MetagemFactory getMetagemFactory();

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
		 * The meta object literal for the '{@link metagem.impl.ModelRootImpl <em>Model Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metagem.impl.ModelRootImpl
		 * @see metagem.impl.MetagemPackageImpl#getModelRoot()
		 * @generated
		 */
		EClass MODEL_ROOT = eINSTANCE.getModelRoot();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ROOT__NAME = eINSTANCE.getModelRoot_Name();

		/**
		 * The meta object literal for the '<em><b>Source Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ROOT__SOURCE_MODELS = eINSTANCE.getModelRoot_SourceModels();

		/**
		 * The meta object literal for the '<em><b>Target Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ROOT__TARGET_MODELS = eINSTANCE.getModelRoot_TargetModels();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ROOT__RELATIONS = eINSTANCE.getModelRoot_Relations();

		/**
		 * The meta object literal for the '{@link metagem.impl.TransformationElementImpl <em>Transformation Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metagem.impl.TransformationElementImpl
		 * @see metagem.impl.MetagemPackageImpl#getTransformationElement()
		 * @generated
		 */
		EClass TRANSFORMATION_ELEMENT = eINSTANCE.getTransformationElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION_ELEMENT__NAME = eINSTANCE.getTransformationElement_Name();

		/**
		 * The meta object literal for the '{@link metagem.impl.ModelTransfImpl <em>Model Transf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metagem.impl.ModelTransfImpl
		 * @see metagem.impl.MetagemPackageImpl#getModelTransf()
		 * @generated
		 */
		EClass MODEL_TRANSF = eINSTANCE.getModelTransf();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_TRANSF__PATH = eINSTANCE.getModelTransf_Path();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TRANSF__ELEMENTS = eINSTANCE.getModelTransf_Elements();

		/**
		 * The meta object literal for the '{@link metagem.impl.SourceModelTransfImpl <em>Source Model Transf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metagem.impl.SourceModelTransfImpl
		 * @see metagem.impl.MetagemPackageImpl#getSourceModelTransf()
		 * @generated
		 */
		EClass SOURCE_MODEL_TRANSF = eINSTANCE.getSourceModelTransf();

		/**
		 * The meta object literal for the '<em><b>Owned Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_MODEL_TRANSF__OWNED_ELEMENT = eINSTANCE.getSourceModelTransf_OwnedElement();

		/**
		 * The meta object literal for the '{@link metagem.impl.TargetModelTransfImpl <em>Target Model Transf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metagem.impl.TargetModelTransfImpl
		 * @see metagem.impl.MetagemPackageImpl#getTargetModelTransf()
		 * @generated
		 */
		EClass TARGET_MODEL_TRANSF = eINSTANCE.getTargetModelTransf();

		/**
		 * The meta object literal for the '<em><b>Owned Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_MODEL_TRANSF__OWNED_ELEMENT = eINSTANCE.getTargetModelTransf_OwnedElement();

		/**
		 * The meta object literal for the '{@link metagem.impl.ModelComponentImpl <em>Model Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metagem.impl.ModelComponentImpl
		 * @see metagem.impl.MetagemPackageImpl#getModelComponent()
		 * @generated
		 */
		EClass MODEL_COMPONENT = eINSTANCE.getModelComponent();

		/**
		 * The meta object literal for the '<em><b>Relation Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_COMPONENT__RELATION_ELEMENT = eINSTANCE.getModelComponent_RelationElement();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_COMPONENT__REF = eINSTANCE.getModelComponent_Ref();

		/**
		 * The meta object literal for the '{@link metagem.impl.RelationsImpl <em>Relations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metagem.impl.RelationsImpl
		 * @see metagem.impl.MetagemPackageImpl#getRelations()
		 * @generated
		 */
		EClass RELATIONS = eINSTANCE.getRelations();

		/**
		 * The meta object literal for the '<em><b>Owned Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONS__OWNED_MODEL = eINSTANCE.getRelations_OwnedModel();

		/**
		 * The meta object literal for the '<em><b>Type Relation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONS__TYPE_RELATION = eINSTANCE.getRelations_TypeRelation();

		/**
		 * The meta object literal for the '<em><b>Type Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONS__TYPE_ELEMENT = eINSTANCE.getRelations_TypeElement();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONS__ROLE = eINSTANCE.getRelations_Role();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONS__EXTENDS = eINSTANCE.getRelations_Extends();

		/**
		 * The meta object literal for the '<em><b>Is Extended</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONS__IS_EXTENDED = eINSTANCE.getRelations_IsExtended();

		/**
		 * The meta object literal for the '<em><b>Guard Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONS__GUARD_CONDITION = eINSTANCE.getRelations_GuardCondition();

		/**
		 * The meta object literal for the '<em><b>Is Invoked</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONS__IS_INVOKED = eINSTANCE.getRelations_IsInvoked();

		/**
		 * The meta object literal for the '{@link metagem.impl.OneToOneImpl <em>One To One</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metagem.impl.OneToOneImpl
		 * @see metagem.impl.MetagemPackageImpl#getOneToOne()
		 * @generated
		 */
		EClass ONE_TO_ONE = eINSTANCE.getOneToOne();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_TO_ONE__SOURCE = eINSTANCE.getOneToOne_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_TO_ONE__TARGET = eINSTANCE.getOneToOne_Target();

		/**
		 * The meta object literal for the '<em><b>Owned Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_TO_ONE__OWNED_ELEMENT = eINSTANCE.getOneToOne_OwnedElement();

		/**
		 * The meta object literal for the '{@link metagem.impl.OneToZeroImpl <em>One To Zero</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metagem.impl.OneToZeroImpl
		 * @see metagem.impl.MetagemPackageImpl#getOneToZero()
		 * @generated
		 */
		EClass ONE_TO_ZERO = eINSTANCE.getOneToZero();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_TO_ZERO__SOURCE = eINSTANCE.getOneToZero_Source();

		/**
		 * The meta object literal for the '{@link metagem.impl.ZeroToOneImpl <em>Zero To One</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metagem.impl.ZeroToOneImpl
		 * @see metagem.impl.MetagemPackageImpl#getZeroToOne()
		 * @generated
		 */
		EClass ZERO_TO_ONE = eINSTANCE.getZeroToOne();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZERO_TO_ONE__TARGET = eINSTANCE.getZeroToOne_Target();

		/**
		 * The meta object literal for the '<em><b>Owned Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZERO_TO_ONE__OWNED_ELEMENT = eINSTANCE.getZeroToOne_OwnedElement();

		/**
		 * The meta object literal for the '{@link metagem.impl.OneToManyImpl <em>One To Many</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metagem.impl.OneToManyImpl
		 * @see metagem.impl.MetagemPackageImpl#getOneToMany()
		 * @generated
		 */
		EClass ONE_TO_MANY = eINSTANCE.getOneToMany();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_TO_MANY__SOURCE = eINSTANCE.getOneToMany_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_TO_MANY__TARGET = eINSTANCE.getOneToMany_Target();

		/**
		 * The meta object literal for the '{@link metagem.impl.ManyToOneImpl <em>Many To One</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metagem.impl.ManyToOneImpl
		 * @see metagem.impl.MetagemPackageImpl#getManyToOne()
		 * @generated
		 */
		EClass MANY_TO_ONE = eINSTANCE.getManyToOne();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANY_TO_ONE__TARGET = eINSTANCE.getManyToOne_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANY_TO_ONE__SOURCE = eINSTANCE.getManyToOne_Source();

		/**
		 * The meta object literal for the '<em><b>Owned Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANY_TO_ONE__OWNED_ELEMENT = eINSTANCE.getManyToOne_OwnedElement();

		/**
		 * The meta object literal for the '{@link metagem.impl.ManyToManyImpl <em>Many To Many</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metagem.impl.ManyToManyImpl
		 * @see metagem.impl.MetagemPackageImpl#getManyToMany()
		 * @generated
		 */
		EClass MANY_TO_MANY = eINSTANCE.getManyToMany();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANY_TO_MANY__TARGET = eINSTANCE.getManyToMany_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANY_TO_MANY__SOURCE = eINSTANCE.getManyToMany_Source();

		/**
		 * The meta object literal for the '{@link metagem.impl.RelationElementImpl <em>Relation Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metagem.impl.RelationElementImpl
		 * @see metagem.impl.MetagemPackageImpl#getRelationElement()
		 * @generated
		 */
		EClass RELATION_ELEMENT = eINSTANCE.getRelationElement();

		/**
		 * The meta object literal for the '<em><b>Model Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_ELEMENT__MODEL_COMPONENT = eINSTANCE.getRelationElement_ModelComponent();

		/**
		 * The meta object literal for the '{@link metagem.impl.SourceElementImpl <em>Source Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metagem.impl.SourceElementImpl
		 * @see metagem.impl.MetagemPackageImpl#getSourceElement()
		 * @generated
		 */
		EClass SOURCE_ELEMENT = eINSTANCE.getSourceElement();

		/**
		 * The meta object literal for the '<em><b>Invokes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_ELEMENT__INVOKES = eINSTANCE.getSourceElement_Invokes();

		/**
		 * The meta object literal for the '{@link metagem.impl.TargetElementImpl <em>Target Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metagem.impl.TargetElementImpl
		 * @see metagem.impl.MetagemPackageImpl#getTargetElement()
		 * @generated
		 */
		EClass TARGET_ELEMENT = eINSTANCE.getTargetElement();

		/**
		 * The meta object literal for the '<em><b>Zero To One</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_ELEMENT__ZERO_TO_ONE = eINSTANCE.getTargetElement_ZeroToOne();

		/**
		 * The meta object literal for the '<em><b>One To One</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_ELEMENT__ONE_TO_ONE = eINSTANCE.getTargetElement_OneToOne();

		/**
		 * The meta object literal for the '<em><b>Many To One</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_ELEMENT__MANY_TO_ONE = eINSTANCE.getTargetElement_ManyToOne();

		/**
		 * The meta object literal for the '{@link metagem.impl.ModelElementImpl <em>Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metagem.impl.ModelElementImpl
		 * @see metagem.impl.MetagemPackageImpl#getModelElement()
		 * @generated
		 */
		EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT__FEATURES = eINSTANCE.getModelElement_Features();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT__ELEMENTS = eINSTANCE.getModelElement_Elements();

		/**
		 * The meta object literal for the '<em><b>Super Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT__SUPER_ELEMENT = eINSTANCE.getModelElement_SuperElement();

		/**
		 * The meta object literal for the '<em><b>Owned Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT__OWNED_ELEMENT = eINSTANCE.getModelElement_OwnedElement();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT__CONTAINS = eINSTANCE.getModelElement_Contains();

		/**
		 * The meta object literal for the '<em><b>Is Contained</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT__IS_CONTAINED = eINSTANCE.getModelElement_IsContained();

		/**
		 * The meta object literal for the '{@link metagem.impl.ModelFeatureImpl <em>Model Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metagem.impl.ModelFeatureImpl
		 * @see metagem.impl.MetagemPackageImpl#getModelFeature()
		 * @generated
		 */
		EClass MODEL_FEATURE = eINSTANCE.getModelFeature();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FEATURE__PARENT = eINSTANCE.getModelFeature_Parent();

		/**
		 * The meta object literal for the '{@link metagem.TRelation <em>TRelation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metagem.TRelation
		 * @see metagem.impl.MetagemPackageImpl#getTRelation()
		 * @generated
		 */
		EEnum TRELATION = eINSTANCE.getTRelation();

		/**
		 * The meta object literal for the '{@link metagem.TElement <em>TElement</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metagem.TElement
		 * @see metagem.impl.MetagemPackageImpl#getTElement()
		 * @generated
		 */
		EEnum TELEMENT = eINSTANCE.getTElement();

		/**
		 * The meta object literal for the '{@link metagem.TRole <em>TRole</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metagem.TRole
		 * @see metagem.impl.MetagemPackageImpl#getTRole()
		 * @generated
		 */
		EEnum TROLE = eINSTANCE.getTRole();

	}

} //MetagemPackage
