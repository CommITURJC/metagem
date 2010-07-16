/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm_hybrid.impl;

import mm_hybrid.Datatype;
import mm_hybrid.Condition;
import mm_hybrid.Element;
import mm_hybrid.ElementIncluded;
import mm_hybrid.Guard;
import mm_hybrid.InMetaModel;
import mm_hybrid.LeftPattern;
import mm_hybrid.MM_HybridFactory;
import mm_hybrid.MM_HybridPackage;
import mm_hybrid.Module;
import mm_hybrid.Operation;
import mm_hybrid.OutMetaModel;
import mm_hybrid.Return;
import mm_hybrid.RightPattern;
import mm_hybrid.Rule;
import mm_hybrid.SourceElementRule;
import mm_hybrid.TargetElementRule;
import mm_hybrid.TypeAtribute;

import mm_hybrid.TypeElem;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MM_HybridPackageImpl extends EPackageImpl implements
		MM_HybridPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inMetaModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outMetaModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceElementRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetElementRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementIncludedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rightPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leftPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeAtributeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeElemEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum datatypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see mm_hybrid.MM_HybridPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MM_HybridPackageImpl() {
		super(eNS_URI, MM_HybridFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MM_HybridPackage init() {
		if (isInited)
			return (MM_HybridPackage) EPackage.Registry.INSTANCE
					.getEPackage(MM_HybridPackage.eNS_URI);

		// Obtain or create and register package
		MM_HybridPackageImpl theMM_HybridPackage = (MM_HybridPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(eNS_URI) instanceof MM_HybridPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(eNS_URI)
				: new MM_HybridPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theMM_HybridPackage.createPackageContents();

		// Initialize created meta-data
		theMM_HybridPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMM_HybridPackage.freeze();

		return theMM_HybridPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModule() {
		return moduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_Name_module() {
		return (EAttribute) moduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_Rule() {
		return (EReference) moduleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_InMM() {
		return (EReference) moduleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_OutMM() {
		return (EReference) moduleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_Operations() {
		return (EReference) moduleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInMetaModel() {
		return inMetaModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInMetaModel_Name_mm() {
		return (EAttribute) inMetaModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInMetaModel_Type_mm() {
		return (EAttribute) inMetaModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInMetaModel_Elements() {
		return (EReference) inMetaModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutMetaModel() {
		return outMetaModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutMetaModel_Name_mm() {
		return (EAttribute) outMetaModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutMetaModel_Type_mm() {
		return (EAttribute) outMetaModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutMetaModel_Elements() {
		return (EReference) outMetaModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRule() {
		return ruleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRule_Name_rule() {
		return (EAttribute) ruleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRule_IsAbstract() {
		return (EAttribute) ruleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRule_IsMain() {
		return (EAttribute) ruleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_In() {
		return (EReference) ruleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_Out() {
		return (EReference) ruleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRule_TypeAttribute() {
		return (EAttribute) ruleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRule_TypeElement() {
		return (EAttribute) ruleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_Extends() {
		return (EReference) ruleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_IsExtended() {
		return (EReference) ruleEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_RightPattern() {
		return (EReference) ruleEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRule_Comment() {
		return (EAttribute) ruleEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Name_element() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceElementRule() {
		return sourceElementRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceElementRule_Guard() {
		return (EReference) sourceElementRuleEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceElementRule_Metamodel() {
		return (EReference) sourceElementRuleEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceElementRule_RightPattern() {
		return (EReference) sourceElementRuleEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetElementRule() {
		return targetElementRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetElementRule_Included() {
		return (EReference) targetElementRuleEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetElementRule_Metamodel() {
		return (EReference) targetElementRuleEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetElementRule_LeftPattern() {
		return (EReference) targetElementRuleEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementIncluded() {
		return elementIncludedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementIncluded_TypeAttribute() {
		return (EAttribute) elementIncludedEClass.getEStructuralFeatures().get(
				0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementIncluded_TypeElement() {
		return (EAttribute) elementIncludedEClass.getEStructuralFeatures().get(
				1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementIncluded_Right() {
		return (EReference) elementIncludedEClass.getEStructuralFeatures().get(
				2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementIncluded_Left() {
		return (EReference) elementIncludedEClass.getEStructuralFeatures().get(
				3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuard() {
		return guardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuard_Value() {
		return (EAttribute) guardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRightPattern() {
		return rightPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRightPattern_SourceElement() {
		return (EReference) rightPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRightPattern_Rule() {
		return (EReference) rightPatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLeftPattern() {
		return leftPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLeftPattern_TargetElement() {
		return (EReference) leftPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_Name_operation() {
		return (EAttribute) operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_Body() {
		return (EAttribute) operationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Context() {
		return (EReference) operationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_ReturnValue() {
		return (EReference) operationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReturn() {
		return returnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReturn_Element() {
		return (EReference) returnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReturn_Datatype() {
		return (EAttribute) returnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeAtribute() {
		return typeAtributeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeElem() {
		return typeElemEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDatatype() {
		return datatypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MM_HybridFactory getMM_HybridFactory() {
		return (MM_HybridFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		moduleEClass = createEClass(MODULE);
		createEAttribute(moduleEClass, MODULE__NAME_MODULE);
		createEReference(moduleEClass, MODULE__RULE);
		createEReference(moduleEClass, MODULE__IN_MM);
		createEReference(moduleEClass, MODULE__OUT_MM);
		createEReference(moduleEClass, MODULE__OPERATIONS);

		inMetaModelEClass = createEClass(IN_META_MODEL);
		createEAttribute(inMetaModelEClass, IN_META_MODEL__NAME_MM);
		createEAttribute(inMetaModelEClass, IN_META_MODEL__TYPE_MM);
		createEReference(inMetaModelEClass, IN_META_MODEL__ELEMENTS);

		outMetaModelEClass = createEClass(OUT_META_MODEL);
		createEAttribute(outMetaModelEClass, OUT_META_MODEL__NAME_MM);
		createEAttribute(outMetaModelEClass, OUT_META_MODEL__TYPE_MM);
		createEReference(outMetaModelEClass, OUT_META_MODEL__ELEMENTS);

		ruleEClass = createEClass(RULE);
		createEAttribute(ruleEClass, RULE__NAME_RULE);
		createEAttribute(ruleEClass, RULE__IS_ABSTRACT);
		createEAttribute(ruleEClass, RULE__IS_MAIN);
		createEReference(ruleEClass, RULE__IN);
		createEReference(ruleEClass, RULE__OUT);
		createEAttribute(ruleEClass, RULE__TYPE_ATTRIBUTE);
		createEAttribute(ruleEClass, RULE__TYPE_ELEMENT);
		createEReference(ruleEClass, RULE__EXTENDS);
		createEReference(ruleEClass, RULE__IS_EXTENDED);
		createEReference(ruleEClass, RULE__RIGHT_PATTERN);
		createEAttribute(ruleEClass, RULE__COMMENT);

		elementEClass = createEClass(ELEMENT);
		createEAttribute(elementEClass, ELEMENT__NAME_ELEMENT);

		sourceElementRuleEClass = createEClass(SOURCE_ELEMENT_RULE);
		createEReference(sourceElementRuleEClass, SOURCE_ELEMENT_RULE__GUARD);
		createEReference(sourceElementRuleEClass,
				SOURCE_ELEMENT_RULE__METAMODEL);
		createEReference(sourceElementRuleEClass,
				SOURCE_ELEMENT_RULE__RIGHT_PATTERN);

		targetElementRuleEClass = createEClass(TARGET_ELEMENT_RULE);
		createEReference(targetElementRuleEClass, TARGET_ELEMENT_RULE__INCLUDED);
		createEReference(targetElementRuleEClass,
				TARGET_ELEMENT_RULE__METAMODEL);
		createEReference(targetElementRuleEClass,
				TARGET_ELEMENT_RULE__LEFT_PATTERN);

		elementIncludedEClass = createEClass(ELEMENT_INCLUDED);
		createEAttribute(elementIncludedEClass,
				ELEMENT_INCLUDED__TYPE_ATTRIBUTE);
		createEAttribute(elementIncludedEClass, ELEMENT_INCLUDED__TYPE_ELEMENT);
		createEReference(elementIncludedEClass, ELEMENT_INCLUDED__RIGHT);
		createEReference(elementIncludedEClass, ELEMENT_INCLUDED__LEFT);

		guardEClass = createEClass(GUARD);
		createEAttribute(guardEClass, GUARD__VALUE);

		rightPatternEClass = createEClass(RIGHT_PATTERN);
		createEReference(rightPatternEClass, RIGHT_PATTERN__SOURCE_ELEMENT);
		createEReference(rightPatternEClass, RIGHT_PATTERN__RULE);

		leftPatternEClass = createEClass(LEFT_PATTERN);
		createEReference(leftPatternEClass, LEFT_PATTERN__TARGET_ELEMENT);

		operationEClass = createEClass(OPERATION);
		createEAttribute(operationEClass, OPERATION__NAME_OPERATION);
		createEAttribute(operationEClass, OPERATION__BODY);
		createEReference(operationEClass, OPERATION__CONTEXT);
		createEReference(operationEClass, OPERATION__RETURN_VALUE);

		returnEClass = createEClass(RETURN);
		createEReference(returnEClass, RETURN__ELEMENT);
		createEAttribute(returnEClass, RETURN__DATATYPE);

		// Create enums
		typeAtributeEEnum = createEEnum(TYPE_ATRIBUTE);
		typeElemEEnum = createEEnum(TYPE_ELEM);
		datatypeEEnum = createEEnum(DATATYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sourceElementRuleEClass.getESuperTypes().add(this.getElement());
		targetElementRuleEClass.getESuperTypes().add(this.getElement());

		// Initialize classes and features; add operations and parameters
		initEClass(
				moduleEClass,
				Module.class,
				"Module", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getModule_Name_module(),
				ecorePackage.getEString(),
				"name_module", null, 1, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getModule_Rule(),
				this.getRule(),
				null,
				"rule", null, 1, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getModule_InMM(),
				this.getInMetaModel(),
				null,
				"inMM", null, 1, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getModule_OutMM(),
				this.getOutMetaModel(),
				null,
				"outMM", null, 1, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getModule_Operations(),
				this.getOperation(),
				null,
				"operations", null, 0, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				inMetaModelEClass,
				InMetaModel.class,
				"InMetaModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getInMetaModel_Name_mm(),
				ecorePackage.getEString(),
				"name_mm", null, 1, 1, InMetaModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getInMetaModel_Type_mm(),
				ecorePackage.getEString(),
				"type_mm", null, 1, 1, InMetaModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getInMetaModel_Elements(),
				this.getSourceElementRule(),
				this.getSourceElementRule_Metamodel(),
				"elements", null, 0, -1, InMetaModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				outMetaModelEClass,
				OutMetaModel.class,
				"OutMetaModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getOutMetaModel_Name_mm(),
				ecorePackage.getEString(),
				"name_mm", null, 1, 1, OutMetaModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getOutMetaModel_Type_mm(),
				ecorePackage.getEString(),
				"type_mm", null, 1, 1, OutMetaModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getOutMetaModel_Elements(),
				this.getTargetElementRule(),
				this.getTargetElementRule_Metamodel(),
				"elements", null, 0, -1, OutMetaModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				ruleEClass,
				Rule.class,
				"Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getRule_Name_rule(),
				ecorePackage.getEString(),
				"name_rule", null, 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getRule_IsAbstract(),
				ecorePackage.getEBoolean(),
				"isAbstract", null, 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getRule_IsMain(),
				ecorePackage.getEBoolean(),
				"isMain", null, 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getRule_In(),
				this.getSourceElementRule(),
				null,
				"in", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getRule_Out(),
				this.getTargetElementRule(),
				null,
				"out", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getRule_TypeAttribute(),
				this.getTypeAtribute(),
				"typeAttribute", null, 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getRule_TypeElement(),
				this.getTypeElem(),
				"typeElement", null, 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getRule_Extends(),
				this.getRule(),
				this.getRule_IsExtended(),
				"extends", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getRule_IsExtended(),
				this.getRule(),
				this.getRule_Extends(),
				"isExtended", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getRule_RightPattern(),
				this.getRightPattern(),
				this.getRightPattern_Rule(),
				"rightPattern", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getRule_Comment(),
				ecorePackage.getEString(),
				"comment", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(
				elementEClass,
				Element.class,
				"Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getElement_Name_element(),
				ecorePackage.getEString(),
				"name_element", null, 1, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(
				sourceElementRuleEClass,
				SourceElementRule.class,
				"SourceElementRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getSourceElementRule_Guard(),
				this.getGuard(),
				null,
				"guard", null, 0, -1, SourceElementRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getSourceElementRule_Metamodel(),
				this.getInMetaModel(),
				this.getInMetaModel_Elements(),
				"metamodel", null, 1, 1, SourceElementRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getSourceElementRule_RightPattern(),
				this.getRightPattern(),
				this.getRightPattern_SourceElement(),
				"rightPattern", null, 0, 1, SourceElementRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				targetElementRuleEClass,
				TargetElementRule.class,
				"TargetElementRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getTargetElementRule_Included(),
				this.getElementIncluded(),
				null,
				"included", null, 0, -1, TargetElementRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getTargetElementRule_Metamodel(),
				this.getOutMetaModel(),
				this.getOutMetaModel_Elements(),
				"metamodel", null, 1, 1, TargetElementRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getTargetElementRule_LeftPattern(),
				this.getLeftPattern(),
				this.getLeftPattern_TargetElement(),
				"leftPattern", null, 0, 1, TargetElementRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				elementIncludedEClass,
				ElementIncluded.class,
				"ElementIncluded", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getElementIncluded_TypeAttribute(),
				this.getTypeAtribute(),
				"typeAttribute", null, 1, 1, ElementIncluded.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getElementIncluded_TypeElement(),
				this.getTypeElem(),
				"typeElement", null, 1, 1, ElementIncluded.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getElementIncluded_Right(),
				this.getRightPattern(),
				null,
				"right", null, 1, 1, ElementIncluded.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getElementIncluded_Left(),
				this.getLeftPattern(),
				null,
				"left", null, 1, 1, ElementIncluded.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				guardEClass,
				Guard.class,
				"Guard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getGuard_Value(),
				ecorePackage.getEString(),
				"value", null, 0, 1, Guard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				rightPatternEClass,
				RightPattern.class,
				"RightPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getRightPattern_SourceElement(),
				this.getSourceElementRule(),
				this.getSourceElementRule_RightPattern(),
				"sourceElement", null, 0, -1, RightPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getRightPattern_Rule(),
				this.getRule(),
				this.getRule_RightPattern(),
				"rule", null, 0, -1, RightPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				leftPatternEClass,
				LeftPattern.class,
				"LeftPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getLeftPattern_TargetElement(),
				this.getTargetElementRule(),
				this.getTargetElementRule_LeftPattern(),
				"targetElement", null, 1, 1, LeftPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(
				operationEClass,
				Operation.class,
				"Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getOperation_Name_operation(),
				ecorePackage.getEString(),
				"name_operation", null, 1, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getOperation_Body(),
				ecorePackage.getEString(),
				"body", null, 1, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getOperation_Context(),
				this.getElement(),
				null,
				"context", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getOperation_ReturnValue(),
				this.getReturn(),
				null,
				"returnValue", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(
				returnEClass,
				Return.class,
				"Return", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getReturn_Element(),
				this.getElement(),
				null,
				"element", null, 0, 1, Return.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getReturn_Datatype(),
				this.getDatatype(),
				"datatype", null, 0, 1, Return.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		// Initialize enums and add enum literals
		initEEnum(typeAtributeEEnum, TypeAtribute.class, "TypeAtribute"); //$NON-NLS-1$
		addEEnumLiteral(typeAtributeEEnum, TypeAtribute.COPY);
		addEEnumLiteral(typeAtributeEEnum, TypeAtribute.CONCATENATION);
		addEEnumLiteral(typeAtributeEEnum, TypeAtribute.VARIOUS);

		initEEnum(typeElemEEnum, TypeElem.class, "TypeElem"); //$NON-NLS-1$
		addEEnumLiteral(typeElemEEnum, TypeElem.MY_ECLASSIFIER);
		addEEnumLiteral(typeElemEEnum, TypeElem.MY_EATTRIBUTE);
		addEEnumLiteral(typeElemEEnum, TypeElem.MY_EREFERENCE);

		initEEnum(datatypeEEnum, Datatype.class, "Datatype"); //$NON-NLS-1$
		addEEnumLiteral(datatypeEEnum, Datatype.NULL);
		addEEnumLiteral(datatypeEEnum, Datatype.BOOLEAN);
		addEEnumLiteral(datatypeEEnum, Datatype.INTEGER);
		addEEnumLiteral(datatypeEEnum, Datatype.STRING);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf"; //$NON-NLS-1$		
		addAnnotation(this, source, new String[] { "foo", "bar" //$NON-NLS-1$ //$NON-NLS-2$
		});
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.diagram"; //$NON-NLS-1$			
		addAnnotation(moduleEClass, source, new String[] { "foo", "bar" //$NON-NLS-1$ //$NON-NLS-2$
		});
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.node"; //$NON-NLS-1$				
		addAnnotation(inMetaModelEClass, source, new String[] {
				"label", "name_mm", //$NON-NLS-1$ //$NON-NLS-2$
				"label.icon", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"border.color", "0,0,128", //$NON-NLS-1$ //$NON-NLS-2$
				"color", "198,198,236" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(outMetaModelEClass, source, new String[] {
				"label", "name_mm", //$NON-NLS-1$ //$NON-NLS-2$
				"label.icon", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"border.color", "210,0,0", //$NON-NLS-1$ //$NON-NLS-2$
				"color", "255,147,147" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(ruleEClass, source, new String[] { "label", "name_rule", //$NON-NLS-1$ //$NON-NLS-2$
				"label.icon", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"border.color", "204,153,0", //$NON-NLS-1$ //$NON-NLS-2$
				"color", "253,229,141" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(sourceElementRuleEClass, source, new String[] {
				"label", "name_element", //$NON-NLS-1$ //$NON-NLS-2$
				"label.icon", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"border.color", "31,73,125", //$NON-NLS-1$ //$NON-NLS-2$
				"color", "218,238,243" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(targetElementRuleEClass, source, new String[] {
				"label", "name_element", //$NON-NLS-1$ //$NON-NLS-2$
				"label.icon", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"border.color", "51,153,102", //$NON-NLS-1$ //$NON-NLS-2$
				"color", "204,255,204" //$NON-NLS-1$ //$NON-NLS-2$
		});
	}

} //MM_HybridPackageImpl
