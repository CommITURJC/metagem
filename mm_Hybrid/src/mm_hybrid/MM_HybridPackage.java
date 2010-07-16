/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm_hybrid;

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
 * @see mm_hybrid.MM_HybridFactory
 * @model kind="package"
 *        annotation="gmf foo='bar'"
 * @generated
 */
public interface MM_HybridPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mm_hybrid"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///MM_Hybrid.ecore"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mm_hybrid"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MM_HybridPackage eINSTANCE = mm_hybrid.impl.MM_HybridPackageImpl.init();

	/**
	 * The meta object id for the '{@link mm_hybrid.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm_hybrid.impl.ModuleImpl
	 * @see mm_hybrid.impl.MM_HybridPackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 0;

	/**
	 * The feature id for the '<em><b>Name module</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NAME_MODULE = 0;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__RULE = 1;

	/**
	 * The feature id for the '<em><b>In MM</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__IN_MM = 2;

	/**
	 * The feature id for the '<em><b>Out MM</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__OUT_MM = 3;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__OPERATIONS = 4;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link mm_hybrid.impl.InMetaModelImpl <em>In Meta Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm_hybrid.impl.InMetaModelImpl
	 * @see mm_hybrid.impl.MM_HybridPackageImpl#getInMetaModel()
	 * @generated
	 */
	int IN_META_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Name mm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_META_MODEL__NAME_MM = 0;

	/**
	 * The feature id for the '<em><b>Type mm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_META_MODEL__TYPE_MM = 1;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_META_MODEL__ELEMENTS = 2;

	/**
	 * The number of structural features of the '<em>In Meta Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_META_MODEL_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link mm_hybrid.impl.OutMetaModelImpl <em>Out Meta Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm_hybrid.impl.OutMetaModelImpl
	 * @see mm_hybrid.impl.MM_HybridPackageImpl#getOutMetaModel()
	 * @generated
	 */
	int OUT_META_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Name mm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_META_MODEL__NAME_MM = 0;

	/**
	 * The feature id for the '<em><b>Type mm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_META_MODEL__TYPE_MM = 1;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_META_MODEL__ELEMENTS = 2;

	/**
	 * The number of structural features of the '<em>Out Meta Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_META_MODEL_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link mm_hybrid.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm_hybrid.impl.RuleImpl
	 * @see mm_hybrid.impl.MM_HybridPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 3;

	/**
	 * The feature id for the '<em><b>Name rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__NAME_RULE = 0;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__IS_ABSTRACT = 1;

	/**
	 * The feature id for the '<em><b>Is Main</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__IS_MAIN = 2;

	/**
	 * The feature id for the '<em><b>In</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__IN = 3;

	/**
	 * The feature id for the '<em><b>Out</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__OUT = 4;

	/**
	 * The feature id for the '<em><b>Type Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__TYPE_ATTRIBUTE = 5;

	/**
	 * The feature id for the '<em><b>Type Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__TYPE_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__EXTENDS = 7;

	/**
	 * The feature id for the '<em><b>Is Extended</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__IS_EXTENDED = 8;

	/**
	 * The feature id for the '<em><b>Right Pattern</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RIGHT_PATTERN = 9;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link mm_hybrid.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm_hybrid.impl.ElementImpl
	 * @see mm_hybrid.impl.MM_HybridPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Name element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME_ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link mm_hybrid.impl.SourceElementRuleImpl <em>Source Element Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm_hybrid.impl.SourceElementRuleImpl
	 * @see mm_hybrid.impl.MM_HybridPackageImpl#getSourceElementRule()
	 * @generated
	 */
	int SOURCE_ELEMENT_RULE = 5;

	/**
	 * The feature id for the '<em><b>Name element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ELEMENT_RULE__NAME_ELEMENT = ELEMENT__NAME_ELEMENT;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ELEMENT_RULE__GUARD = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Metamodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ELEMENT_RULE__METAMODEL = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ELEMENT_RULE__RIGHT_PATTERN = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Source Element Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ELEMENT_RULE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link mm_hybrid.impl.TargetElementRuleImpl <em>Target Element Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm_hybrid.impl.TargetElementRuleImpl
	 * @see mm_hybrid.impl.MM_HybridPackageImpl#getTargetElementRule()
	 * @generated
	 */
	int TARGET_ELEMENT_RULE = 6;

	/**
	 * The feature id for the '<em><b>Name element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_ELEMENT_RULE__NAME_ELEMENT = ELEMENT__NAME_ELEMENT;

	/**
	 * The feature id for the '<em><b>Included</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_ELEMENT_RULE__INCLUDED = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Metamodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_ELEMENT_RULE__METAMODEL = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Left Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_ELEMENT_RULE__LEFT_PATTERN = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Target Element Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_ELEMENT_RULE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link mm_hybrid.impl.ElementIncludedImpl <em>Element Included</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm_hybrid.impl.ElementIncludedImpl
	 * @see mm_hybrid.impl.MM_HybridPackageImpl#getElementIncluded()
	 * @generated
	 */
	int ELEMENT_INCLUDED = 7;

	/**
	 * The feature id for the '<em><b>Type Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_INCLUDED__TYPE_ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Type Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_INCLUDED__TYPE_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_INCLUDED__RIGHT = 2;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_INCLUDED__LEFT = 3;

	/**
	 * The number of structural features of the '<em>Element Included</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_INCLUDED_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link mm_hybrid.impl.GuardImpl <em>Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm_hybrid.impl.GuardImpl
	 * @see mm_hybrid.impl.MM_HybridPackageImpl#getGuard()
	 * @generated
	 */
	int GUARD = 8;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link mm_hybrid.impl.RightPatternImpl <em>Right Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm_hybrid.impl.RightPatternImpl
	 * @see mm_hybrid.impl.MM_HybridPackageImpl#getRightPattern()
	 * @generated
	 */
	int RIGHT_PATTERN = 9;

	/**
	 * The feature id for the '<em><b>Source Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_PATTERN__SOURCE_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_PATTERN__RULE = 1;

	/**
	 * The number of structural features of the '<em>Right Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_PATTERN_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link mm_hybrid.impl.LeftPatternImpl <em>Left Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm_hybrid.impl.LeftPatternImpl
	 * @see mm_hybrid.impl.MM_HybridPackageImpl#getLeftPattern()
	 * @generated
	 */
	int LEFT_PATTERN = 10;

	/**
	 * The feature id for the '<em><b>Target Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_PATTERN__TARGET_ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Left Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_PATTERN_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link mm_hybrid.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm_hybrid.impl.OperationImpl
	 * @see mm_hybrid.impl.MM_HybridPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 11;

	/**
	 * The feature id for the '<em><b>Name operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME_OPERATION = 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__BODY = 1;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__CONTEXT = 2;

	/**
	 * The feature id for the '<em><b>Return Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__RETURN_VALUE = 3;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link mm_hybrid.impl.ReturnImpl <em>Return</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm_hybrid.impl.ReturnImpl
	 * @see mm_hybrid.impl.MM_HybridPackageImpl#getReturn()
	 * @generated
	 */
	int RETURN = 12;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN__ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN__DATATYPE = 1;

	/**
	 * The number of structural features of the '<em>Return</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link mm_hybrid.TypeAtribute <em>Type Atribute</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm_hybrid.TypeAtribute
	 * @see mm_hybrid.impl.MM_HybridPackageImpl#getTypeAtribute()
	 * @generated
	 */
	int TYPE_ATRIBUTE = 13;

	/**
	 * The meta object id for the '{@link mm_hybrid.TypeElem <em>Type Elem</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm_hybrid.TypeElem
	 * @see mm_hybrid.impl.MM_HybridPackageImpl#getTypeElem()
	 * @generated
	 */
	int TYPE_ELEM = 14;

	/**
	 * The meta object id for the '{@link mm_hybrid.Datatype <em>Datatype</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm_hybrid.Datatype
	 * @see mm_hybrid.impl.MM_HybridPackageImpl#getDatatype()
	 * @generated
	 */
	int DATATYPE = 15;

	/**
	 * Returns the meta object for class '{@link mm_hybrid.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see mm_hybrid.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the attribute '{@link mm_hybrid.Module#getName_module <em>Name module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name module</em>'.
	 * @see mm_hybrid.Module#getName_module()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_Name_module();

	/**
	 * Returns the meta object for the containment reference list '{@link mm_hybrid.Module#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule</em>'.
	 * @see mm_hybrid.Module#getRule()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Rule();

	/**
	 * Returns the meta object for the containment reference list '{@link mm_hybrid.Module#getInMM <em>In MM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>In MM</em>'.
	 * @see mm_hybrid.Module#getInMM()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_InMM();

	/**
	 * Returns the meta object for the containment reference list '{@link mm_hybrid.Module#getOutMM <em>Out MM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Out MM</em>'.
	 * @see mm_hybrid.Module#getOutMM()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_OutMM();

	/**
	 * Returns the meta object for the containment reference list '{@link mm_hybrid.Module#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see mm_hybrid.Module#getOperations()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Operations();

	/**
	 * Returns the meta object for class '{@link mm_hybrid.InMetaModel <em>In Meta Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Meta Model</em>'.
	 * @see mm_hybrid.InMetaModel
	 * @generated
	 */
	EClass getInMetaModel();

	/**
	 * Returns the meta object for the attribute '{@link mm_hybrid.InMetaModel#getName_mm <em>Name mm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name mm</em>'.
	 * @see mm_hybrid.InMetaModel#getName_mm()
	 * @see #getInMetaModel()
	 * @generated
	 */
	EAttribute getInMetaModel_Name_mm();

	/**
	 * Returns the meta object for the attribute '{@link mm_hybrid.InMetaModel#getType_mm <em>Type mm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type mm</em>'.
	 * @see mm_hybrid.InMetaModel#getType_mm()
	 * @see #getInMetaModel()
	 * @generated
	 */
	EAttribute getInMetaModel_Type_mm();

	/**
	 * Returns the meta object for the reference list '{@link mm_hybrid.InMetaModel#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elements</em>'.
	 * @see mm_hybrid.InMetaModel#getElements()
	 * @see #getInMetaModel()
	 * @generated
	 */
	EReference getInMetaModel_Elements();

	/**
	 * Returns the meta object for class '{@link mm_hybrid.OutMetaModel <em>Out Meta Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Out Meta Model</em>'.
	 * @see mm_hybrid.OutMetaModel
	 * @generated
	 */
	EClass getOutMetaModel();

	/**
	 * Returns the meta object for the attribute '{@link mm_hybrid.OutMetaModel#getName_mm <em>Name mm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name mm</em>'.
	 * @see mm_hybrid.OutMetaModel#getName_mm()
	 * @see #getOutMetaModel()
	 * @generated
	 */
	EAttribute getOutMetaModel_Name_mm();

	/**
	 * Returns the meta object for the attribute '{@link mm_hybrid.OutMetaModel#getType_mm <em>Type mm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type mm</em>'.
	 * @see mm_hybrid.OutMetaModel#getType_mm()
	 * @see #getOutMetaModel()
	 * @generated
	 */
	EAttribute getOutMetaModel_Type_mm();

	/**
	 * Returns the meta object for the reference list '{@link mm_hybrid.OutMetaModel#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elements</em>'.
	 * @see mm_hybrid.OutMetaModel#getElements()
	 * @see #getOutMetaModel()
	 * @generated
	 */
	EReference getOutMetaModel_Elements();

	/**
	 * Returns the meta object for class '{@link mm_hybrid.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see mm_hybrid.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the attribute '{@link mm_hybrid.Rule#getName_rule <em>Name rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name rule</em>'.
	 * @see mm_hybrid.Rule#getName_rule()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Name_rule();

	/**
	 * Returns the meta object for the attribute '{@link mm_hybrid.Rule#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see mm_hybrid.Rule#isIsAbstract()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_IsAbstract();

	/**
	 * Returns the meta object for the attribute '{@link mm_hybrid.Rule#isIsMain <em>Is Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Main</em>'.
	 * @see mm_hybrid.Rule#isIsMain()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_IsMain();

	/**
	 * Returns the meta object for the containment reference list '{@link mm_hybrid.Rule#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>In</em>'.
	 * @see mm_hybrid.Rule#getIn()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_In();

	/**
	 * Returns the meta object for the containment reference list '{@link mm_hybrid.Rule#getOut <em>Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Out</em>'.
	 * @see mm_hybrid.Rule#getOut()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Out();

	/**
	 * Returns the meta object for the attribute '{@link mm_hybrid.Rule#getTypeAttribute <em>Type Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Attribute</em>'.
	 * @see mm_hybrid.Rule#getTypeAttribute()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_TypeAttribute();

	/**
	 * Returns the meta object for the attribute '{@link mm_hybrid.Rule#getTypeElement <em>Type Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Element</em>'.
	 * @see mm_hybrid.Rule#getTypeElement()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_TypeElement();

	/**
	 * Returns the meta object for the reference '{@link mm_hybrid.Rule#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extends</em>'.
	 * @see mm_hybrid.Rule#getExtends()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Extends();

	/**
	 * Returns the meta object for the reference list '{@link mm_hybrid.Rule#getIsExtended <em>Is Extended</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Extended</em>'.
	 * @see mm_hybrid.Rule#getIsExtended()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_IsExtended();

	/**
	 * Returns the meta object for the reference list '{@link mm_hybrid.Rule#getRightPattern <em>Right Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Right Pattern</em>'.
	 * @see mm_hybrid.Rule#getRightPattern()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_RightPattern();

	/**
	 * Returns the meta object for class '{@link mm_hybrid.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see mm_hybrid.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link mm_hybrid.Element#getName_element <em>Name element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name element</em>'.
	 * @see mm_hybrid.Element#getName_element()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name_element();

	/**
	 * Returns the meta object for class '{@link mm_hybrid.SourceElementRule <em>Source Element Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Element Rule</em>'.
	 * @see mm_hybrid.SourceElementRule
	 * @generated
	 */
	EClass getSourceElementRule();

	/**
	 * Returns the meta object for the containment reference list '{@link mm_hybrid.SourceElementRule#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Guard</em>'.
	 * @see mm_hybrid.SourceElementRule#getGuard()
	 * @see #getSourceElementRule()
	 * @generated
	 */
	EReference getSourceElementRule_Guard();

	/**
	 * Returns the meta object for the reference '{@link mm_hybrid.SourceElementRule#getMetamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Metamodel</em>'.
	 * @see mm_hybrid.SourceElementRule#getMetamodel()
	 * @see #getSourceElementRule()
	 * @generated
	 */
	EReference getSourceElementRule_Metamodel();

	/**
	 * Returns the meta object for the container reference '{@link mm_hybrid.SourceElementRule#getRightPattern <em>Right Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Right Pattern</em>'.
	 * @see mm_hybrid.SourceElementRule#getRightPattern()
	 * @see #getSourceElementRule()
	 * @generated
	 */
	EReference getSourceElementRule_RightPattern();

	/**
	 * Returns the meta object for class '{@link mm_hybrid.TargetElementRule <em>Target Element Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Element Rule</em>'.
	 * @see mm_hybrid.TargetElementRule
	 * @generated
	 */
	EClass getTargetElementRule();

	/**
	 * Returns the meta object for the containment reference list '{@link mm_hybrid.TargetElementRule#getIncluded <em>Included</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Included</em>'.
	 * @see mm_hybrid.TargetElementRule#getIncluded()
	 * @see #getTargetElementRule()
	 * @generated
	 */
	EReference getTargetElementRule_Included();

	/**
	 * Returns the meta object for the reference '{@link mm_hybrid.TargetElementRule#getMetamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Metamodel</em>'.
	 * @see mm_hybrid.TargetElementRule#getMetamodel()
	 * @see #getTargetElementRule()
	 * @generated
	 */
	EReference getTargetElementRule_Metamodel();

	/**
	 * Returns the meta object for the container reference '{@link mm_hybrid.TargetElementRule#getLeftPattern <em>Left Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Left Pattern</em>'.
	 * @see mm_hybrid.TargetElementRule#getLeftPattern()
	 * @see #getTargetElementRule()
	 * @generated
	 */
	EReference getTargetElementRule_LeftPattern();

	/**
	 * Returns the meta object for class '{@link mm_hybrid.ElementIncluded <em>Element Included</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Included</em>'.
	 * @see mm_hybrid.ElementIncluded
	 * @generated
	 */
	EClass getElementIncluded();

	/**
	 * Returns the meta object for the attribute '{@link mm_hybrid.ElementIncluded#getTypeAttribute <em>Type Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Attribute</em>'.
	 * @see mm_hybrid.ElementIncluded#getTypeAttribute()
	 * @see #getElementIncluded()
	 * @generated
	 */
	EAttribute getElementIncluded_TypeAttribute();

	/**
	 * Returns the meta object for the attribute '{@link mm_hybrid.ElementIncluded#getTypeElement <em>Type Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Element</em>'.
	 * @see mm_hybrid.ElementIncluded#getTypeElement()
	 * @see #getElementIncluded()
	 * @generated
	 */
	EAttribute getElementIncluded_TypeElement();

	/**
	 * Returns the meta object for the containment reference '{@link mm_hybrid.ElementIncluded#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see mm_hybrid.ElementIncluded#getRight()
	 * @see #getElementIncluded()
	 * @generated
	 */
	EReference getElementIncluded_Right();

	/**
	 * Returns the meta object for the containment reference '{@link mm_hybrid.ElementIncluded#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see mm_hybrid.ElementIncluded#getLeft()
	 * @see #getElementIncluded()
	 * @generated
	 */
	EReference getElementIncluded_Left();

	/**
	 * Returns the meta object for class '{@link mm_hybrid.Guard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guard</em>'.
	 * @see mm_hybrid.Guard
	 * @generated
	 */
	EClass getGuard();

	/**
	 * Returns the meta object for the attribute '{@link mm_hybrid.Guard#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mm_hybrid.Guard#getValue()
	 * @see #getGuard()
	 * @generated
	 */
	EAttribute getGuard_Value();

	/**
	 * Returns the meta object for class '{@link mm_hybrid.RightPattern <em>Right Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Right Pattern</em>'.
	 * @see mm_hybrid.RightPattern
	 * @generated
	 */
	EClass getRightPattern();

	/**
	 * Returns the meta object for the containment reference list '{@link mm_hybrid.RightPattern#getSourceElement <em>Source Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source Element</em>'.
	 * @see mm_hybrid.RightPattern#getSourceElement()
	 * @see #getRightPattern()
	 * @generated
	 */
	EReference getRightPattern_SourceElement();

	/**
	 * Returns the meta object for the reference list '{@link mm_hybrid.RightPattern#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rule</em>'.
	 * @see mm_hybrid.RightPattern#getRule()
	 * @see #getRightPattern()
	 * @generated
	 */
	EReference getRightPattern_Rule();

	/**
	 * Returns the meta object for class '{@link mm_hybrid.LeftPattern <em>Left Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Left Pattern</em>'.
	 * @see mm_hybrid.LeftPattern
	 * @generated
	 */
	EClass getLeftPattern();

	/**
	 * Returns the meta object for the containment reference '{@link mm_hybrid.LeftPattern#getTargetElement <em>Target Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Element</em>'.
	 * @see mm_hybrid.LeftPattern#getTargetElement()
	 * @see #getLeftPattern()
	 * @generated
	 */
	EReference getLeftPattern_TargetElement();

	/**
	 * Returns the meta object for class '{@link mm_hybrid.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see mm_hybrid.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link mm_hybrid.Operation#getName_operation <em>Name operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name operation</em>'.
	 * @see mm_hybrid.Operation#getName_operation()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Name_operation();

	/**
	 * Returns the meta object for the attribute '{@link mm_hybrid.Operation#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see mm_hybrid.Operation#getBody()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Body();

	/**
	 * Returns the meta object for the reference '{@link mm_hybrid.Operation#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see mm_hybrid.Operation#getContext()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Context();

	/**
	 * Returns the meta object for the reference '{@link mm_hybrid.Operation#getReturnValue <em>Return Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Value</em>'.
	 * @see mm_hybrid.Operation#getReturnValue()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_ReturnValue();

	/**
	 * Returns the meta object for class '{@link mm_hybrid.Return <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return</em>'.
	 * @see mm_hybrid.Return
	 * @generated
	 */
	EClass getReturn();

	/**
	 * Returns the meta object for the reference '{@link mm_hybrid.Return#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see mm_hybrid.Return#getElement()
	 * @see #getReturn()
	 * @generated
	 */
	EReference getReturn_Element();

	/**
	 * Returns the meta object for the attribute '{@link mm_hybrid.Return#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datatype</em>'.
	 * @see mm_hybrid.Return#getDatatype()
	 * @see #getReturn()
	 * @generated
	 */
	EAttribute getReturn_Datatype();

	/**
	 * Returns the meta object for enum '{@link mm_hybrid.TypeAtribute <em>Type Atribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Atribute</em>'.
	 * @see mm_hybrid.TypeAtribute
	 * @generated
	 */
	EEnum getTypeAtribute();

	/**
	 * Returns the meta object for enum '{@link mm_hybrid.TypeElem <em>Type Elem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Elem</em>'.
	 * @see mm_hybrid.TypeElem
	 * @generated
	 */
	EEnum getTypeElem();

	/**
	 * Returns the meta object for enum '{@link mm_hybrid.Datatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Datatype</em>'.
	 * @see mm_hybrid.Datatype
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
	MM_HybridFactory getMM_HybridFactory();

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
		 * The meta object literal for the '{@link mm_hybrid.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm_hybrid.impl.ModuleImpl
		 * @see mm_hybrid.impl.MM_HybridPackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '<em><b>Name module</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__NAME_MODULE = eINSTANCE.getModule_Name_module();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__RULE = eINSTANCE.getModule_Rule();

		/**
		 * The meta object literal for the '<em><b>In MM</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__IN_MM = eINSTANCE.getModule_InMM();

		/**
		 * The meta object literal for the '<em><b>Out MM</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__OUT_MM = eINSTANCE.getModule_OutMM();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__OPERATIONS = eINSTANCE.getModule_Operations();

		/**
		 * The meta object literal for the '{@link mm_hybrid.impl.InMetaModelImpl <em>In Meta Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm_hybrid.impl.InMetaModelImpl
		 * @see mm_hybrid.impl.MM_HybridPackageImpl#getInMetaModel()
		 * @generated
		 */
		EClass IN_META_MODEL = eINSTANCE.getInMetaModel();

		/**
		 * The meta object literal for the '<em><b>Name mm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IN_META_MODEL__NAME_MM = eINSTANCE.getInMetaModel_Name_mm();

		/**
		 * The meta object literal for the '<em><b>Type mm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IN_META_MODEL__TYPE_MM = eINSTANCE.getInMetaModel_Type_mm();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IN_META_MODEL__ELEMENTS = eINSTANCE
				.getInMetaModel_Elements();

		/**
		 * The meta object literal for the '{@link mm_hybrid.impl.OutMetaModelImpl <em>Out Meta Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm_hybrid.impl.OutMetaModelImpl
		 * @see mm_hybrid.impl.MM_HybridPackageImpl#getOutMetaModel()
		 * @generated
		 */
		EClass OUT_META_MODEL = eINSTANCE.getOutMetaModel();

		/**
		 * The meta object literal for the '<em><b>Name mm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUT_META_MODEL__NAME_MM = eINSTANCE
				.getOutMetaModel_Name_mm();

		/**
		 * The meta object literal for the '<em><b>Type mm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUT_META_MODEL__TYPE_MM = eINSTANCE
				.getOutMetaModel_Type_mm();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUT_META_MODEL__ELEMENTS = eINSTANCE
				.getOutMetaModel_Elements();

		/**
		 * The meta object literal for the '{@link mm_hybrid.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm_hybrid.impl.RuleImpl
		 * @see mm_hybrid.impl.MM_HybridPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Name rule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__NAME_RULE = eINSTANCE.getRule_Name_rule();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__IS_ABSTRACT = eINSTANCE.getRule_IsAbstract();

		/**
		 * The meta object literal for the '<em><b>Is Main</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__IS_MAIN = eINSTANCE.getRule_IsMain();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__IN = eINSTANCE.getRule_In();

		/**
		 * The meta object literal for the '<em><b>Out</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__OUT = eINSTANCE.getRule_Out();

		/**
		 * The meta object literal for the '<em><b>Type Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__TYPE_ATTRIBUTE = eINSTANCE.getRule_TypeAttribute();

		/**
		 * The meta object literal for the '<em><b>Type Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__TYPE_ELEMENT = eINSTANCE.getRule_TypeElement();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__EXTENDS = eINSTANCE.getRule_Extends();

		/**
		 * The meta object literal for the '<em><b>Is Extended</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__IS_EXTENDED = eINSTANCE.getRule_IsExtended();

		/**
		 * The meta object literal for the '<em><b>Right Pattern</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RIGHT_PATTERN = eINSTANCE.getRule_RightPattern();

		/**
		 * The meta object literal for the '{@link mm_hybrid.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm_hybrid.impl.ElementImpl
		 * @see mm_hybrid.impl.MM_HybridPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Name element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NAME_ELEMENT = eINSTANCE.getElement_Name_element();

		/**
		 * The meta object literal for the '{@link mm_hybrid.impl.SourceElementRuleImpl <em>Source Element Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm_hybrid.impl.SourceElementRuleImpl
		 * @see mm_hybrid.impl.MM_HybridPackageImpl#getSourceElementRule()
		 * @generated
		 */
		EClass SOURCE_ELEMENT_RULE = eINSTANCE.getSourceElementRule();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_ELEMENT_RULE__GUARD = eINSTANCE
				.getSourceElementRule_Guard();

		/**
		 * The meta object literal for the '<em><b>Metamodel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_ELEMENT_RULE__METAMODEL = eINSTANCE
				.getSourceElementRule_Metamodel();

		/**
		 * The meta object literal for the '<em><b>Right Pattern</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_ELEMENT_RULE__RIGHT_PATTERN = eINSTANCE
				.getSourceElementRule_RightPattern();

		/**
		 * The meta object literal for the '{@link mm_hybrid.impl.TargetElementRuleImpl <em>Target Element Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm_hybrid.impl.TargetElementRuleImpl
		 * @see mm_hybrid.impl.MM_HybridPackageImpl#getTargetElementRule()
		 * @generated
		 */
		EClass TARGET_ELEMENT_RULE = eINSTANCE.getTargetElementRule();

		/**
		 * The meta object literal for the '<em><b>Included</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_ELEMENT_RULE__INCLUDED = eINSTANCE
				.getTargetElementRule_Included();

		/**
		 * The meta object literal for the '<em><b>Metamodel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_ELEMENT_RULE__METAMODEL = eINSTANCE
				.getTargetElementRule_Metamodel();

		/**
		 * The meta object literal for the '<em><b>Left Pattern</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_ELEMENT_RULE__LEFT_PATTERN = eINSTANCE
				.getTargetElementRule_LeftPattern();

		/**
		 * The meta object literal for the '{@link mm_hybrid.impl.ElementIncludedImpl <em>Element Included</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm_hybrid.impl.ElementIncludedImpl
		 * @see mm_hybrid.impl.MM_HybridPackageImpl#getElementIncluded()
		 * @generated
		 */
		EClass ELEMENT_INCLUDED = eINSTANCE.getElementIncluded();

		/**
		 * The meta object literal for the '<em><b>Type Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_INCLUDED__TYPE_ATTRIBUTE = eINSTANCE
				.getElementIncluded_TypeAttribute();

		/**
		 * The meta object literal for the '<em><b>Type Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_INCLUDED__TYPE_ELEMENT = eINSTANCE
				.getElementIncluded_TypeElement();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_INCLUDED__RIGHT = eINSTANCE
				.getElementIncluded_Right();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_INCLUDED__LEFT = eINSTANCE.getElementIncluded_Left();

		/**
		 * The meta object literal for the '{@link mm_hybrid.impl.GuardImpl <em>Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm_hybrid.impl.GuardImpl
		 * @see mm_hybrid.impl.MM_HybridPackageImpl#getGuard()
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
		 * The meta object literal for the '{@link mm_hybrid.impl.RightPatternImpl <em>Right Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm_hybrid.impl.RightPatternImpl
		 * @see mm_hybrid.impl.MM_HybridPackageImpl#getRightPattern()
		 * @generated
		 */
		EClass RIGHT_PATTERN = eINSTANCE.getRightPattern();

		/**
		 * The meta object literal for the '<em><b>Source Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIGHT_PATTERN__SOURCE_ELEMENT = eINSTANCE
				.getRightPattern_SourceElement();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIGHT_PATTERN__RULE = eINSTANCE.getRightPattern_Rule();

		/**
		 * The meta object literal for the '{@link mm_hybrid.impl.LeftPatternImpl <em>Left Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm_hybrid.impl.LeftPatternImpl
		 * @see mm_hybrid.impl.MM_HybridPackageImpl#getLeftPattern()
		 * @generated
		 */
		EClass LEFT_PATTERN = eINSTANCE.getLeftPattern();

		/**
		 * The meta object literal for the '<em><b>Target Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEFT_PATTERN__TARGET_ELEMENT = eINSTANCE
				.getLeftPattern_TargetElement();

		/**
		 * The meta object literal for the '{@link mm_hybrid.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm_hybrid.impl.OperationImpl
		 * @see mm_hybrid.impl.MM_HybridPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Name operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__NAME_OPERATION = eINSTANCE
				.getOperation_Name_operation();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__BODY = eINSTANCE.getOperation_Body();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__CONTEXT = eINSTANCE.getOperation_Context();

		/**
		 * The meta object literal for the '<em><b>Return Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__RETURN_VALUE = eINSTANCE
				.getOperation_ReturnValue();

		/**
		 * The meta object literal for the '{@link mm_hybrid.impl.ReturnImpl <em>Return</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm_hybrid.impl.ReturnImpl
		 * @see mm_hybrid.impl.MM_HybridPackageImpl#getReturn()
		 * @generated
		 */
		EClass RETURN = eINSTANCE.getReturn();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN__ELEMENT = eINSTANCE.getReturn_Element();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN__DATATYPE = eINSTANCE.getReturn_Datatype();

		/**
		 * The meta object literal for the '{@link mm_hybrid.TypeAtribute <em>Type Atribute</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm_hybrid.TypeAtribute
		 * @see mm_hybrid.impl.MM_HybridPackageImpl#getTypeAtribute()
		 * @generated
		 */
		EEnum TYPE_ATRIBUTE = eINSTANCE.getTypeAtribute();

		/**
		 * The meta object literal for the '{@link mm_hybrid.TypeElem <em>Type Elem</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm_hybrid.TypeElem
		 * @see mm_hybrid.impl.MM_HybridPackageImpl#getTypeElem()
		 * @generated
		 */
		EEnum TYPE_ELEM = eINSTANCE.getTypeElem();

		/**
		 * The meta object literal for the '{@link mm_hybrid.Datatype <em>Datatype</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm_hybrid.Datatype
		 * @see mm_hybrid.impl.MM_HybridPackageImpl#getDatatype()
		 * @generated
		 */
		EEnum DATATYPE = eINSTANCE.getDatatype();

	}

} //MM_HybridPackage
