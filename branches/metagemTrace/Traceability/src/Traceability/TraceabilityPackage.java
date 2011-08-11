/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Traceability;

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
 * @see Traceability.TraceabilityFactory
 * @model kind="package"
 * @generated
 */
public interface TraceabilityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Traceability";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.eclipse.kybele.Traceability";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Traceability";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TraceabilityPackage eINSTANCE = Traceability.impl.TraceabilityPackageImpl.init();

	/**
	 * The meta object id for the '{@link Traceability.impl.TraceElementImpl <em>Trace Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Traceability.impl.TraceElementImpl
	 * @see Traceability.impl.TraceabilityPackageImpl#getTraceElement()
	 * @generated
	 */
	int TRACE_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_ELEMENT__REF = 1;

	/**
	 * The number of structural features of the '<em>Trace Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link Traceability.impl.TraceModelImpl <em>Trace Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Traceability.impl.TraceModelImpl
	 * @see Traceability.impl.TraceabilityPackageImpl#getTraceModel()
	 * @generated
	 */
	int TRACE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_MODEL__NAME = TRACE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_MODEL__REF = TRACE_ELEMENT__REF;

	/**
	 * The feature id for the '<em><b>Trace Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_MODEL__TRACE_LINKS = TRACE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_MODEL__SOURCE_MODELS = TRACE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_MODEL__TARGET_MODELS = TRACE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Trace Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_MODEL_FEATURE_COUNT = TRACE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link Traceability.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Traceability.impl.ModelImpl
	 * @see Traceability.impl.TraceabilityPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = TRACE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__REF = TRACE_ELEMENT__REF;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ELEMENTS = TRACE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PATH = TRACE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Metamodel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__METAMODEL = TRACE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = TRACE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link Traceability.impl.TraceLinkImpl <em>Trace Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Traceability.impl.TraceLinkImpl
	 * @see Traceability.impl.TraceabilityPackageImpl#getTraceLink()
	 * @generated
	 */
	int TRACE_LINK = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK__NAME = TRACE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK__REF = TRACE_ELEMENT__REF;

	/**
	 * The feature id for the '<em><b>Trace Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK__TRACE_MODEL = TRACE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK__SOURCE = TRACE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK__TARGET = TRACE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK__OPERATION = TRACE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Child Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK__CHILD_LINKS = TRACE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Parent Link</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK__PARENT_LINK = TRACE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Trace Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_LINK_FEATURE_COUNT = TRACE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link Traceability.impl.SourceModelImpl <em>Source Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Traceability.impl.SourceModelImpl
	 * @see Traceability.impl.TraceabilityPackageImpl#getSourceModel()
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
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_MODEL__REF = MODEL__REF;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_MODEL__ELEMENTS = MODEL__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_MODEL__PATH = MODEL__PATH;

	/**
	 * The feature id for the '<em><b>Metamodel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_MODEL__METAMODEL = MODEL__METAMODEL;

	/**
	 * The feature id for the '<em><b>Trace Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_MODEL__TRACE_MODEL = MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Source Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_MODEL_FEATURE_COUNT = MODEL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link Traceability.impl.TargetModelImpl <em>Target Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Traceability.impl.TargetModelImpl
	 * @see Traceability.impl.TraceabilityPackageImpl#getTargetModel()
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
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_MODEL__REF = MODEL__REF;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_MODEL__ELEMENTS = MODEL__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_MODEL__PATH = MODEL__PATH;

	/**
	 * The feature id for the '<em><b>Metamodel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_MODEL__METAMODEL = MODEL__METAMODEL;

	/**
	 * The feature id for the '<em><b>Trace Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_MODEL__TRACE_MODEL = MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Target Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_MODEL_FEATURE_COUNT = MODEL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link Traceability.impl.ModelElementImpl <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Traceability.impl.ModelElementImpl
	 * @see Traceability.impl.TraceabilityPackageImpl#getModelElement()
	 * @generated
	 */
	int MODEL_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__NAME = TRACE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__REF = TRACE_ELEMENT__REF;

	/**
	 * The feature id for the '<em><b>Source Element Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__SOURCE_ELEMENT_LINK = TRACE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Element Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__TARGET_ELEMENT_LINK = TRACE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_FEATURE_COUNT = TRACE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link Traceability.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Traceability.impl.ElementImpl
	 * @see Traceability.impl.TraceabilityPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__REF = MODEL_ELEMENT__REF;

	/**
	 * The feature id for the '<em><b>Source Element Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__SOURCE_ELEMENT_LINK = MODEL_ELEMENT__SOURCE_ELEMENT_LINK;

	/**
	 * The feature id for the '<em><b>Target Element Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__TARGET_ELEMENT_LINK = MODEL_ELEMENT__TARGET_ELEMENT_LINK;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__FEATURES = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__MODEL = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Child element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__CHILD_ELEMENT = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Super element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__SUPER_ELEMENT = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link Traceability.impl.SourceElementImpl <em>Source Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Traceability.impl.SourceElementImpl
	 * @see Traceability.impl.TraceabilityPackageImpl#getSourceElement()
	 * @generated
	 */
	int SOURCE_ELEMENT = 9;

	/**
	 * The meta object id for the '{@link Traceability.impl.TargetElementImpl <em>Target Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Traceability.impl.TargetElementImpl
	 * @see Traceability.impl.TraceabilityPackageImpl#getTargetElement()
	 * @generated
	 */
	int TARGET_ELEMENT = 10;

	/**
	 * The meta object id for the '{@link Traceability.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Traceability.impl.FeatureImpl
	 * @see Traceability.impl.TraceabilityPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__REF = MODEL_ELEMENT__REF;

	/**
	 * The feature id for the '<em><b>Source Element Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__SOURCE_ELEMENT_LINK = MODEL_ELEMENT__SOURCE_ELEMENT_LINK;

	/**
	 * The feature id for the '<em><b>Target Element Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__TARGET_ELEMENT_LINK = MODEL_ELEMENT__TARGET_ELEMENT_LINK;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__PARENT = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ELEMENT__NAME = TRACE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ELEMENT__REF = TRACE_ELEMENT__REF;

	/**
	 * The feature id for the '<em><b>Source trace Links</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ELEMENT__SOURCE_TRACE_LINKS = TRACE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Element Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ELEMENT__ELEMENT_MODEL = TRACE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Source Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ELEMENT_FEATURE_COUNT = TRACE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_ELEMENT__NAME = TRACE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_ELEMENT__REF = TRACE_ELEMENT__REF;

	/**
	 * The feature id for the '<em><b>Target trace Links</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_ELEMENT__TARGET_TRACE_LINKS = TRACE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Element Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_ELEMENT__ELEMENT_MODEL = TRACE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Target Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_ELEMENT_FEATURE_COUNT = TRACE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link Traceability.Operations <em>Operations</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Traceability.Operations
	 * @see Traceability.impl.TraceabilityPackageImpl#getOperations()
	 * @generated
	 */
	int OPERATIONS = 11;


	/**
	 * Returns the meta object for class '{@link Traceability.TraceModel <em>Trace Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace Model</em>'.
	 * @see Traceability.TraceModel
	 * @generated
	 */
	EClass getTraceModel();

	/**
	 * Returns the meta object for the containment reference list '{@link Traceability.TraceModel#getTraceLinks <em>Trace Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trace Links</em>'.
	 * @see Traceability.TraceModel#getTraceLinks()
	 * @see #getTraceModel()
	 * @generated
	 */
	EReference getTraceModel_TraceLinks();

	/**
	 * Returns the meta object for the containment reference list '{@link Traceability.TraceModel#getSourceModels <em>Source Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source Models</em>'.
	 * @see Traceability.TraceModel#getSourceModels()
	 * @see #getTraceModel()
	 * @generated
	 */
	EReference getTraceModel_SourceModels();

	/**
	 * Returns the meta object for the containment reference list '{@link Traceability.TraceModel#getTargetModels <em>Target Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target Models</em>'.
	 * @see Traceability.TraceModel#getTargetModels()
	 * @see #getTraceModel()
	 * @generated
	 */
	EReference getTraceModel_TargetModels();

	/**
	 * Returns the meta object for class '{@link Traceability.TraceElement <em>Trace Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace Element</em>'.
	 * @see Traceability.TraceElement
	 * @generated
	 */
	EClass getTraceElement();

	/**
	 * Returns the meta object for the attribute '{@link Traceability.TraceElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Traceability.TraceElement#getName()
	 * @see #getTraceElement()
	 * @generated
	 */
	EAttribute getTraceElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link Traceability.TraceElement#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see Traceability.TraceElement#getRef()
	 * @see #getTraceElement()
	 * @generated
	 */
	EAttribute getTraceElement_Ref();

	/**
	 * Returns the meta object for class '{@link Traceability.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see Traceability.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link Traceability.Model#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see Traceability.Model#getElements()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Elements();

	/**
	 * Returns the meta object for the attribute '{@link Traceability.Model#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see Traceability.Model#getPath()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Path();

	/**
	 * Returns the meta object for the attribute '{@link Traceability.Model#getMetamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metamodel</em>'.
	 * @see Traceability.Model#getMetamodel()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Metamodel();

	/**
	 * Returns the meta object for class '{@link Traceability.TraceLink <em>Trace Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace Link</em>'.
	 * @see Traceability.TraceLink
	 * @generated
	 */
	EClass getTraceLink();

	/**
	 * Returns the meta object for the container reference '{@link Traceability.TraceLink#getTraceModel <em>Trace Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Trace Model</em>'.
	 * @see Traceability.TraceLink#getTraceModel()
	 * @see #getTraceLink()
	 * @generated
	 */
	EReference getTraceLink_TraceModel();

	/**
	 * Returns the meta object for the containment reference list '{@link Traceability.TraceLink#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source</em>'.
	 * @see Traceability.TraceLink#getSource()
	 * @see #getTraceLink()
	 * @generated
	 */
	EReference getTraceLink_Source();

	/**
	 * Returns the meta object for the containment reference list '{@link Traceability.TraceLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target</em>'.
	 * @see Traceability.TraceLink#getTarget()
	 * @see #getTraceLink()
	 * @generated
	 */
	EReference getTraceLink_Target();

	/**
	 * Returns the meta object for the attribute '{@link Traceability.TraceLink#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see Traceability.TraceLink#getOperation()
	 * @see #getTraceLink()
	 * @generated
	 */
	EAttribute getTraceLink_Operation();

	/**
	 * Returns the meta object for the containment reference list '{@link Traceability.TraceLink#getChildLinks <em>Child Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child Links</em>'.
	 * @see Traceability.TraceLink#getChildLinks()
	 * @see #getTraceLink()
	 * @generated
	 */
	EReference getTraceLink_ChildLinks();

	/**
	 * Returns the meta object for the container reference '{@link Traceability.TraceLink#getParentLink <em>Parent Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Link</em>'.
	 * @see Traceability.TraceLink#getParentLink()
	 * @see #getTraceLink()
	 * @generated
	 */
	EReference getTraceLink_ParentLink();

	/**
	 * Returns the meta object for class '{@link Traceability.SourceModel <em>Source Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Model</em>'.
	 * @see Traceability.SourceModel
	 * @generated
	 */
	EClass getSourceModel();

	/**
	 * Returns the meta object for the container reference '{@link Traceability.SourceModel#getTraceModel <em>Trace Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Trace Model</em>'.
	 * @see Traceability.SourceModel#getTraceModel()
	 * @see #getSourceModel()
	 * @generated
	 */
	EReference getSourceModel_TraceModel();

	/**
	 * Returns the meta object for class '{@link Traceability.TargetModel <em>Target Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Model</em>'.
	 * @see Traceability.TargetModel
	 * @generated
	 */
	EClass getTargetModel();

	/**
	 * Returns the meta object for the container reference '{@link Traceability.TargetModel#getTraceModel <em>Trace Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Trace Model</em>'.
	 * @see Traceability.TargetModel#getTraceModel()
	 * @see #getTargetModel()
	 * @generated
	 */
	EReference getTargetModel_TraceModel();

	/**
	 * Returns the meta object for class '{@link Traceability.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element</em>'.
	 * @see Traceability.ModelElement
	 * @generated
	 */
	EClass getModelElement();

	/**
	 * Returns the meta object for the reference list '{@link Traceability.ModelElement#getSourceElementLink <em>Source Element Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source Element Link</em>'.
	 * @see Traceability.ModelElement#getSourceElementLink()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_SourceElementLink();

	/**
	 * Returns the meta object for the reference list '{@link Traceability.ModelElement#getTargetElementLink <em>Target Element Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Element Link</em>'.
	 * @see Traceability.ModelElement#getTargetElementLink()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_TargetElementLink();

	/**
	 * Returns the meta object for class '{@link Traceability.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see Traceability.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the container reference '{@link Traceability.Element#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model</em>'.
	 * @see Traceability.Element#getModel()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Model();

	/**
	 * Returns the meta object for the containment reference list '{@link Traceability.Element#getChild_element <em>Child element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child element</em>'.
	 * @see Traceability.Element#getChild_element()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Child_element();

	/**
	 * Returns the meta object for the container reference '{@link Traceability.Element#getSuper_element <em>Super element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Super element</em>'.
	 * @see Traceability.Element#getSuper_element()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Super_element();

	/**
	 * Returns the meta object for the containment reference list '{@link Traceability.Element#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see Traceability.Element#getFeatures()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Features();

	/**
	 * Returns the meta object for class '{@link Traceability.SourceElement <em>Source Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Element</em>'.
	 * @see Traceability.SourceElement
	 * @generated
	 */
	EClass getSourceElement();

	/**
	 * Returns the meta object for the container reference '{@link Traceability.SourceElement#getSource_traceLinks <em>Source trace Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Source trace Links</em>'.
	 * @see Traceability.SourceElement#getSource_traceLinks()
	 * @see #getSourceElement()
	 * @generated
	 */
	EReference getSourceElement_Source_traceLinks();

	/**
	 * Returns the meta object for the reference '{@link Traceability.SourceElement#getElementModel <em>Element Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element Model</em>'.
	 * @see Traceability.SourceElement#getElementModel()
	 * @see #getSourceElement()
	 * @generated
	 */
	EReference getSourceElement_ElementModel();

	/**
	 * Returns the meta object for class '{@link Traceability.TargetElement <em>Target Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Element</em>'.
	 * @see Traceability.TargetElement
	 * @generated
	 */
	EClass getTargetElement();

	/**
	 * Returns the meta object for the container reference '{@link Traceability.TargetElement#getTarget_traceLinks <em>Target trace Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Target trace Links</em>'.
	 * @see Traceability.TargetElement#getTarget_traceLinks()
	 * @see #getTargetElement()
	 * @generated
	 */
	EReference getTargetElement_Target_traceLinks();

	/**
	 * Returns the meta object for the reference '{@link Traceability.TargetElement#getElementModel <em>Element Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element Model</em>'.
	 * @see Traceability.TargetElement#getElementModel()
	 * @see #getTargetElement()
	 * @generated
	 */
	EReference getTargetElement_ElementModel();

	/**
	 * Returns the meta object for class '{@link Traceability.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see Traceability.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the container reference '{@link Traceability.Feature#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see Traceability.Feature#getParent()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Parent();

	/**
	 * Returns the meta object for enum '{@link Traceability.Operations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operations</em>'.
	 * @see Traceability.Operations
	 * @generated
	 */
	EEnum getOperations();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TraceabilityFactory getTraceabilityFactory();

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
		 * The meta object literal for the '{@link Traceability.impl.TraceModelImpl <em>Trace Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Traceability.impl.TraceModelImpl
		 * @see Traceability.impl.TraceabilityPackageImpl#getTraceModel()
		 * @generated
		 */
		EClass TRACE_MODEL = eINSTANCE.getTraceModel();

		/**
		 * The meta object literal for the '<em><b>Trace Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_MODEL__TRACE_LINKS = eINSTANCE.getTraceModel_TraceLinks();

		/**
		 * The meta object literal for the '<em><b>Source Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_MODEL__SOURCE_MODELS = eINSTANCE.getTraceModel_SourceModels();

		/**
		 * The meta object literal for the '<em><b>Target Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_MODEL__TARGET_MODELS = eINSTANCE.getTraceModel_TargetModels();

		/**
		 * The meta object literal for the '{@link Traceability.impl.TraceElementImpl <em>Trace Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Traceability.impl.TraceElementImpl
		 * @see Traceability.impl.TraceabilityPackageImpl#getTraceElement()
		 * @generated
		 */
		EClass TRACE_ELEMENT = eINSTANCE.getTraceElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE_ELEMENT__NAME = eINSTANCE.getTraceElement_Name();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE_ELEMENT__REF = eINSTANCE.getTraceElement_Ref();

		/**
		 * The meta object literal for the '{@link Traceability.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Traceability.impl.ModelImpl
		 * @see Traceability.impl.TraceabilityPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__ELEMENTS = eINSTANCE.getModel_Elements();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__PATH = eINSTANCE.getModel_Path();

		/**
		 * The meta object literal for the '<em><b>Metamodel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__METAMODEL = eINSTANCE.getModel_Metamodel();

		/**
		 * The meta object literal for the '{@link Traceability.impl.TraceLinkImpl <em>Trace Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Traceability.impl.TraceLinkImpl
		 * @see Traceability.impl.TraceabilityPackageImpl#getTraceLink()
		 * @generated
		 */
		EClass TRACE_LINK = eINSTANCE.getTraceLink();

		/**
		 * The meta object literal for the '<em><b>Trace Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_LINK__TRACE_MODEL = eINSTANCE.getTraceLink_TraceModel();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_LINK__SOURCE = eINSTANCE.getTraceLink_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_LINK__TARGET = eINSTANCE.getTraceLink_Target();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE_LINK__OPERATION = eINSTANCE.getTraceLink_Operation();

		/**
		 * The meta object literal for the '<em><b>Child Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_LINK__CHILD_LINKS = eINSTANCE.getTraceLink_ChildLinks();

		/**
		 * The meta object literal for the '<em><b>Parent Link</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_LINK__PARENT_LINK = eINSTANCE.getTraceLink_ParentLink();

		/**
		 * The meta object literal for the '{@link Traceability.impl.SourceModelImpl <em>Source Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Traceability.impl.SourceModelImpl
		 * @see Traceability.impl.TraceabilityPackageImpl#getSourceModel()
		 * @generated
		 */
		EClass SOURCE_MODEL = eINSTANCE.getSourceModel();

		/**
		 * The meta object literal for the '<em><b>Trace Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_MODEL__TRACE_MODEL = eINSTANCE.getSourceModel_TraceModel();

		/**
		 * The meta object literal for the '{@link Traceability.impl.TargetModelImpl <em>Target Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Traceability.impl.TargetModelImpl
		 * @see Traceability.impl.TraceabilityPackageImpl#getTargetModel()
		 * @generated
		 */
		EClass TARGET_MODEL = eINSTANCE.getTargetModel();

		/**
		 * The meta object literal for the '<em><b>Trace Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_MODEL__TRACE_MODEL = eINSTANCE.getTargetModel_TraceModel();

		/**
		 * The meta object literal for the '{@link Traceability.impl.ModelElementImpl <em>Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Traceability.impl.ModelElementImpl
		 * @see Traceability.impl.TraceabilityPackageImpl#getModelElement()
		 * @generated
		 */
		EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

		/**
		 * The meta object literal for the '<em><b>Source Element Link</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT__SOURCE_ELEMENT_LINK = eINSTANCE.getModelElement_SourceElementLink();

		/**
		 * The meta object literal for the '<em><b>Target Element Link</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT__TARGET_ELEMENT_LINK = eINSTANCE.getModelElement_TargetElementLink();

		/**
		 * The meta object literal for the '{@link Traceability.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Traceability.impl.ElementImpl
		 * @see Traceability.impl.TraceabilityPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__MODEL = eINSTANCE.getElement_Model();

		/**
		 * The meta object literal for the '<em><b>Child element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__CHILD_ELEMENT = eINSTANCE.getElement_Child_element();

		/**
		 * The meta object literal for the '<em><b>Super element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__SUPER_ELEMENT = eINSTANCE.getElement_Super_element();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__FEATURES = eINSTANCE.getElement_Features();

		/**
		 * The meta object literal for the '{@link Traceability.impl.SourceElementImpl <em>Source Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Traceability.impl.SourceElementImpl
		 * @see Traceability.impl.TraceabilityPackageImpl#getSourceElement()
		 * @generated
		 */
		EClass SOURCE_ELEMENT = eINSTANCE.getSourceElement();

		/**
		 * The meta object literal for the '<em><b>Source trace Links</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_ELEMENT__SOURCE_TRACE_LINKS = eINSTANCE.getSourceElement_Source_traceLinks();

		/**
		 * The meta object literal for the '<em><b>Element Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_ELEMENT__ELEMENT_MODEL = eINSTANCE.getSourceElement_ElementModel();

		/**
		 * The meta object literal for the '{@link Traceability.impl.TargetElementImpl <em>Target Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Traceability.impl.TargetElementImpl
		 * @see Traceability.impl.TraceabilityPackageImpl#getTargetElement()
		 * @generated
		 */
		EClass TARGET_ELEMENT = eINSTANCE.getTargetElement();

		/**
		 * The meta object literal for the '<em><b>Target trace Links</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_ELEMENT__TARGET_TRACE_LINKS = eINSTANCE.getTargetElement_Target_traceLinks();

		/**
		 * The meta object literal for the '<em><b>Element Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_ELEMENT__ELEMENT_MODEL = eINSTANCE.getTargetElement_ElementModel();

		/**
		 * The meta object literal for the '{@link Traceability.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Traceability.impl.FeatureImpl
		 * @see Traceability.impl.TraceabilityPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__PARENT = eINSTANCE.getFeature_Parent();

		/**
		 * The meta object literal for the '{@link Traceability.Operations <em>Operations</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Traceability.Operations
		 * @see Traceability.impl.TraceabilityPackageImpl#getOperations()
		 * @generated
		 */
		EEnum OPERATIONS = eINSTANCE.getOperations();

	}

} //TraceabilityPackage
