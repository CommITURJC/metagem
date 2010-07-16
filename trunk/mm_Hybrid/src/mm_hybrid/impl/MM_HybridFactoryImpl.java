/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm_hybrid.impl;

import mm_hybrid.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class MM_HybridFactoryImpl extends EFactoryImpl implements
		MM_HybridFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MM_HybridFactory init() {
		try {
			MM_HybridFactory theMM_HybridFactory = (MM_HybridFactory) EPackage.Registry.INSTANCE
					.getEFactory("http:///MM_Hybrid.ecore"); //$NON-NLS-1$ 
			if (theMM_HybridFactory != null) {
				return theMM_HybridFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MM_HybridFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MM_HybridFactoryImpl() {
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
		case MM_HybridPackage.MODULE:
			return createModule();
		case MM_HybridPackage.IN_META_MODEL:
			return createInMetaModel();
		case MM_HybridPackage.OUT_META_MODEL:
			return createOutMetaModel();
		case MM_HybridPackage.RULE:
			return createRule();
		case MM_HybridPackage.SOURCE_ELEMENT_RULE:
			return createSourceElementRule();
		case MM_HybridPackage.TARGET_ELEMENT_RULE:
			return createTargetElementRule();
		case MM_HybridPackage.ELEMENT_INCLUDED:
			return createElementIncluded();
		case MM_HybridPackage.GUARD:
			return createGuard();
		case MM_HybridPackage.RIGHT_PATTERN:
			return createRightPattern();
		case MM_HybridPackage.LEFT_PATTERN:
			return createLeftPattern();
		case MM_HybridPackage.OPERATION:
			return createOperation();
		case MM_HybridPackage.RETURN:
			return createReturn();
		default:
			throw new IllegalArgumentException(
					"The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case MM_HybridPackage.TYPE_ATRIBUTE:
			return createTypeAtributeFromString(eDataType, initialValue);
		case MM_HybridPackage.TYPE_ELEM:
			return createTypeElemFromString(eDataType, initialValue);
		case MM_HybridPackage.DATATYPE:
			return createDatatypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException(
					"The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case MM_HybridPackage.TYPE_ATRIBUTE:
			return convertTypeAtributeToString(eDataType, instanceValue);
		case MM_HybridPackage.TYPE_ELEM:
			return convertTypeElemToString(eDataType, instanceValue);
		case MM_HybridPackage.DATATYPE:
			return convertDatatypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException(
					"The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module createModule() {
		ModuleImpl module = new ModuleImpl();
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InMetaModel createInMetaModel() {
		InMetaModelImpl inMetaModel = new InMetaModelImpl();
		return inMetaModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutMetaModel createOutMetaModel() {
		OutMetaModelImpl outMetaModel = new OutMetaModelImpl();
		return outMetaModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule createRule() {
		RuleImpl rule = new RuleImpl();
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceElementRule createSourceElementRule() {
		SourceElementRuleImpl sourceElementRule = new SourceElementRuleImpl();
		return sourceElementRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetElementRule createTargetElementRule() {
		TargetElementRuleImpl targetElementRule = new TargetElementRuleImpl();
		return targetElementRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementIncluded createElementIncluded() {
		ElementIncludedImpl elementIncluded = new ElementIncludedImpl();
		return elementIncluded;
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
	public RightPattern createRightPattern() {
		RightPatternImpl rightPattern = new RightPatternImpl();
		return rightPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeftPattern createLeftPattern() {
		LeftPatternImpl leftPattern = new LeftPatternImpl();
		return leftPattern;
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
	public Return createReturn() {
		ReturnImpl return_ = new ReturnImpl();
		return return_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAtribute createTypeAtributeFromString(EDataType eDataType,
			String initialValue) {
		TypeAtribute result = TypeAtribute.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeAtributeToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeElem createTypeElemFromString(EDataType eDataType,
			String initialValue) {
		TypeElem result = TypeElem.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeElemToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datatype createDatatypeFromString(EDataType eDataType,
			String initialValue) {
		Datatype result = Datatype.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatatypeToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MM_HybridPackage getMM_HybridPackage() {
		return (MM_HybridPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MM_HybridPackage getPackage() {
		return MM_HybridPackage.eINSTANCE;
	}

} //MM_HybridFactoryImpl
