/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metagem.impl;

import metagem.*;

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
public class MetagemFactoryImpl extends EFactoryImpl implements MetagemFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MetagemFactory init() {
		try {
			MetagemFactory theMetagemFactory = (MetagemFactory)EPackage.Registry.INSTANCE.getEFactory("org.eclipse.kybele.metagem"); 
			if (theMetagemFactory != null) {
				return theMetagemFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MetagemFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetagemFactoryImpl() {
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
			case MetagemPackage.MODEL_ROOT: return createModelRoot();
			case MetagemPackage.SOURCE_MODEL_TRANSF: return createSourceModelTransf();
			case MetagemPackage.TARGET_MODEL_TRANSF: return createTargetModelTransf();
			case MetagemPackage.ONE_TO_ONE: return createOneToOne();
			case MetagemPackage.ONE_TO_ZERO: return createOneToZero();
			case MetagemPackage.ZERO_TO_ONE: return createZeroToOne();
			case MetagemPackage.ONE_TO_MANY: return createOneToMany();
			case MetagemPackage.MANY_TO_ONE: return createManyToOne();
			case MetagemPackage.MANY_TO_MANY: return createManyToMany();
			case MetagemPackage.SOURCE_ELEMENT: return createSourceElement();
			case MetagemPackage.TARGET_ELEMENT: return createTargetElement();
			case MetagemPackage.MODEL_ELEMENT: return createModelElement();
			case MetagemPackage.MODEL_FEATURE: return createModelFeature();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
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
			case MetagemPackage.TRELATION:
				return createTRelationFromString(eDataType, initialValue);
			case MetagemPackage.TELEMENT:
				return createTElementFromString(eDataType, initialValue);
			case MetagemPackage.TROLE:
				return createTRoleFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
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
			case MetagemPackage.TRELATION:
				return convertTRelationToString(eDataType, instanceValue);
			case MetagemPackage.TELEMENT:
				return convertTElementToString(eDataType, instanceValue);
			case MetagemPackage.TROLE:
				return convertTRoleToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelRoot createModelRoot() {
		ModelRootImpl modelRoot = new ModelRootImpl();
		return modelRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceModelTransf createSourceModelTransf() {
		SourceModelTransfImpl sourceModelTransf = new SourceModelTransfImpl();
		return sourceModelTransf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetModelTransf createTargetModelTransf() {
		TargetModelTransfImpl targetModelTransf = new TargetModelTransfImpl();
		return targetModelTransf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OneToOne createOneToOne() {
		OneToOneImpl oneToOne = new OneToOneImpl();
		return oneToOne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OneToZero createOneToZero() {
		OneToZeroImpl oneToZero = new OneToZeroImpl();
		return oneToZero;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZeroToOne createZeroToOne() {
		ZeroToOneImpl zeroToOne = new ZeroToOneImpl();
		return zeroToOne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OneToMany createOneToMany() {
		OneToManyImpl oneToMany = new OneToManyImpl();
		return oneToMany;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManyToOne createManyToOne() {
		ManyToOneImpl manyToOne = new ManyToOneImpl();
		return manyToOne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManyToMany createManyToMany() {
		ManyToManyImpl manyToMany = new ManyToManyImpl();
		return manyToMany;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceElement createSourceElement() {
		SourceElementImpl sourceElement = new SourceElementImpl();
		return sourceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetElement createTargetElement() {
		TargetElementImpl targetElement = new TargetElementImpl();
		return targetElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelElement createModelElement() {
		ModelElementImpl modelElement = new ModelElementImpl();
		return modelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFeature createModelFeature() {
		ModelFeatureImpl modelFeature = new ModelFeatureImpl();
		return modelFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRelation createTRelationFromString(EDataType eDataType, String initialValue) {
		TRelation result = TRelation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTRelationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TElement createTElementFromString(EDataType eDataType, String initialValue) {
		TElement result = TElement.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTElementToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRole createTRoleFromString(EDataType eDataType, String initialValue) {
		TRole result = TRole.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTRoleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetagemPackage getMetagemPackage() {
		return (MetagemPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MetagemPackage getPackage() {
		return MetagemPackage.eINSTANCE;
	}

} //MetagemFactoryImpl
