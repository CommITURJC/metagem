/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metagem.impl;

import metagem.ManyToMany;
import metagem.ManyToOne;
import metagem.MetagemFactory;
import metagem.MetagemPackage;
import metagem.ModelComponent;
import metagem.ModelElement;
import metagem.ModelFeature;
import metagem.ModelRoot;
import metagem.ModelTransf;
import metagem.OneToMany;
import metagem.OneToOne;
import metagem.OneToZero;
import metagem.RelationElement;
import metagem.Relations;
import metagem.SourceElement;
import metagem.SourceModelTransf;
import metagem.TElement;
import metagem.TRelation;
import metagem.TRole;
import metagem.TargetElement;
import metagem.TargetModelTransf;
import metagem.TransformationElement;
import metagem.ZeroToOne;

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
public class MetagemPackageImpl extends EPackageImpl implements MetagemPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformationElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelTransfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceModelTransfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetModelTransfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oneToOneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oneToZeroEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zeroToOneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oneToManyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manyToOneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manyToManyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tRelationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tElementEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tRoleEEnum = null;

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
	 * @see metagem.MetagemPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MetagemPackageImpl() {
		super(eNS_URI, MetagemFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link MetagemPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MetagemPackage init() {
		if (isInited) return (MetagemPackage)EPackage.Registry.INSTANCE.getEPackage(MetagemPackage.eNS_URI);

		// Obtain or create and register package
		MetagemPackageImpl theMetagemPackage = (MetagemPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MetagemPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MetagemPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theMetagemPackage.createPackageContents();

		// Initialize created meta-data
		theMetagemPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMetagemPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MetagemPackage.eNS_URI, theMetagemPackage);
		return theMetagemPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelRoot() {
		return modelRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelRoot_Name() {
		return (EAttribute)modelRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelRoot_SourceModels() {
		return (EReference)modelRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelRoot_TargetModels() {
		return (EReference)modelRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelRoot_Relations() {
		return (EReference)modelRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformationElement() {
		return transformationElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformationElement_Name() {
		return (EAttribute)transformationElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelTransf() {
		return modelTransfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelTransf_Path() {
		return (EAttribute)modelTransfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelTransf_Elements() {
		return (EReference)modelTransfEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceModelTransf() {
		return sourceModelTransfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceModelTransf_OwnedElement() {
		return (EReference)sourceModelTransfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetModelTransf() {
		return targetModelTransfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetModelTransf_OwnedElement() {
		return (EReference)targetModelTransfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelComponent() {
		return modelComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelComponent_RelationElement() {
		return (EReference)modelComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelComponent_Ref() {
		return (EAttribute)modelComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelations() {
		return relationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelations_OwnedModel() {
		return (EReference)relationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelations_TypeRelation() {
		return (EAttribute)relationsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelations_TypeElement() {
		return (EAttribute)relationsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelations_Role() {
		return (EAttribute)relationsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelations_Extends() {
		return (EReference)relationsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelations_IsExtended() {
		return (EReference)relationsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOneToOne() {
		return oneToOneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneToOne_Source() {
		return (EReference)oneToOneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneToOne_Target() {
		return (EReference)oneToOneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneToOne_OwnedElement() {
		return (EReference)oneToOneEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOneToZero() {
		return oneToZeroEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneToZero_Source() {
		return (EReference)oneToZeroEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZeroToOne() {
		return zeroToOneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZeroToOne_Target() {
		return (EReference)zeroToOneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZeroToOne_OwnedElement() {
		return (EReference)zeroToOneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOneToMany() {
		return oneToManyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneToMany_Source() {
		return (EReference)oneToManyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneToMany_Target() {
		return (EReference)oneToManyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManyToOne() {
		return manyToOneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManyToOne_Target() {
		return (EReference)manyToOneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManyToOne_Source() {
		return (EReference)manyToOneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManyToOne_OwnedElement() {
		return (EReference)manyToOneEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManyToMany() {
		return manyToManyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManyToMany_Target() {
		return (EReference)manyToManyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManyToMany_Source() {
		return (EReference)manyToManyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationElement() {
		return relationElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationElement_ModelComponent() {
		return (EReference)relationElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceElement() {
		return sourceElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetElement() {
		return targetElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetElement_ZeroToOne() {
		return (EReference)targetElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetElement_OneToOne() {
		return (EReference)targetElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetElement_ManyToOne() {
		return (EReference)targetElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelElement() {
		return modelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelElement_Features() {
		return (EReference)modelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelElement_Elements() {
		return (EReference)modelElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelElement_SuperElement() {
		return (EReference)modelElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelElement_OwnedElement() {
		return (EReference)modelElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelFeature() {
		return modelFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelFeature_Parent() {
		return (EReference)modelFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTRelation() {
		return tRelationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTElement() {
		return tElementEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTRole() {
		return tRoleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetagemFactory getMetagemFactory() {
		return (MetagemFactory)getEFactoryInstance();
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
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		modelRootEClass = createEClass(MODEL_ROOT);
		createEAttribute(modelRootEClass, MODEL_ROOT__NAME);
		createEReference(modelRootEClass, MODEL_ROOT__SOURCE_MODELS);
		createEReference(modelRootEClass, MODEL_ROOT__TARGET_MODELS);
		createEReference(modelRootEClass, MODEL_ROOT__RELATIONS);

		transformationElementEClass = createEClass(TRANSFORMATION_ELEMENT);
		createEAttribute(transformationElementEClass, TRANSFORMATION_ELEMENT__NAME);

		modelTransfEClass = createEClass(MODEL_TRANSF);
		createEAttribute(modelTransfEClass, MODEL_TRANSF__PATH);
		createEReference(modelTransfEClass, MODEL_TRANSF__ELEMENTS);

		sourceModelTransfEClass = createEClass(SOURCE_MODEL_TRANSF);
		createEReference(sourceModelTransfEClass, SOURCE_MODEL_TRANSF__OWNED_ELEMENT);

		targetModelTransfEClass = createEClass(TARGET_MODEL_TRANSF);
		createEReference(targetModelTransfEClass, TARGET_MODEL_TRANSF__OWNED_ELEMENT);

		modelComponentEClass = createEClass(MODEL_COMPONENT);
		createEReference(modelComponentEClass, MODEL_COMPONENT__RELATION_ELEMENT);
		createEAttribute(modelComponentEClass, MODEL_COMPONENT__REF);

		relationsEClass = createEClass(RELATIONS);
		createEReference(relationsEClass, RELATIONS__OWNED_MODEL);
		createEAttribute(relationsEClass, RELATIONS__TYPE_RELATION);
		createEAttribute(relationsEClass, RELATIONS__TYPE_ELEMENT);
		createEAttribute(relationsEClass, RELATIONS__ROLE);
		createEReference(relationsEClass, RELATIONS__EXTENDS);
		createEReference(relationsEClass, RELATIONS__IS_EXTENDED);

		oneToOneEClass = createEClass(ONE_TO_ONE);
		createEReference(oneToOneEClass, ONE_TO_ONE__SOURCE);
		createEReference(oneToOneEClass, ONE_TO_ONE__TARGET);
		createEReference(oneToOneEClass, ONE_TO_ONE__OWNED_ELEMENT);

		oneToZeroEClass = createEClass(ONE_TO_ZERO);
		createEReference(oneToZeroEClass, ONE_TO_ZERO__SOURCE);

		zeroToOneEClass = createEClass(ZERO_TO_ONE);
		createEReference(zeroToOneEClass, ZERO_TO_ONE__TARGET);
		createEReference(zeroToOneEClass, ZERO_TO_ONE__OWNED_ELEMENT);

		oneToManyEClass = createEClass(ONE_TO_MANY);
		createEReference(oneToManyEClass, ONE_TO_MANY__SOURCE);
		createEReference(oneToManyEClass, ONE_TO_MANY__TARGET);

		manyToOneEClass = createEClass(MANY_TO_ONE);
		createEReference(manyToOneEClass, MANY_TO_ONE__TARGET);
		createEReference(manyToOneEClass, MANY_TO_ONE__SOURCE);
		createEReference(manyToOneEClass, MANY_TO_ONE__OWNED_ELEMENT);

		manyToManyEClass = createEClass(MANY_TO_MANY);
		createEReference(manyToManyEClass, MANY_TO_MANY__TARGET);
		createEReference(manyToManyEClass, MANY_TO_MANY__SOURCE);

		relationElementEClass = createEClass(RELATION_ELEMENT);
		createEReference(relationElementEClass, RELATION_ELEMENT__MODEL_COMPONENT);

		sourceElementEClass = createEClass(SOURCE_ELEMENT);

		targetElementEClass = createEClass(TARGET_ELEMENT);
		createEReference(targetElementEClass, TARGET_ELEMENT__ZERO_TO_ONE);
		createEReference(targetElementEClass, TARGET_ELEMENT__ONE_TO_ONE);
		createEReference(targetElementEClass, TARGET_ELEMENT__MANY_TO_ONE);

		modelElementEClass = createEClass(MODEL_ELEMENT);
		createEReference(modelElementEClass, MODEL_ELEMENT__FEATURES);
		createEReference(modelElementEClass, MODEL_ELEMENT__ELEMENTS);
		createEReference(modelElementEClass, MODEL_ELEMENT__SUPER_ELEMENT);
		createEReference(modelElementEClass, MODEL_ELEMENT__OWNED_ELEMENT);

		modelFeatureEClass = createEClass(MODEL_FEATURE);
		createEReference(modelFeatureEClass, MODEL_FEATURE__PARENT);

		// Create enums
		tRelationEEnum = createEEnum(TRELATION);
		tElementEEnum = createEEnum(TELEMENT);
		tRoleEEnum = createEEnum(TROLE);
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
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		modelTransfEClass.getESuperTypes().add(this.getTransformationElement());
		sourceModelTransfEClass.getESuperTypes().add(this.getModelTransf());
		targetModelTransfEClass.getESuperTypes().add(this.getModelTransf());
		modelComponentEClass.getESuperTypes().add(this.getTransformationElement());
		relationsEClass.getESuperTypes().add(this.getTransformationElement());
		oneToOneEClass.getESuperTypes().add(this.getRelations());
		oneToZeroEClass.getESuperTypes().add(this.getRelations());
		zeroToOneEClass.getESuperTypes().add(this.getRelations());
		oneToManyEClass.getESuperTypes().add(this.getRelations());
		manyToOneEClass.getESuperTypes().add(this.getRelations());
		manyToManyEClass.getESuperTypes().add(this.getRelations());
		relationElementEClass.getESuperTypes().add(this.getTransformationElement());
		sourceElementEClass.getESuperTypes().add(this.getRelationElement());
		targetElementEClass.getESuperTypes().add(this.getRelationElement());
		modelElementEClass.getESuperTypes().add(this.getModelComponent());
		modelFeatureEClass.getESuperTypes().add(this.getModelComponent());

		// Initialize classes and features; add operations and parameters
		initEClass(modelRootEClass, ModelRoot.class, "ModelRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelRoot_Name(), ecorePackage.getEString(), "name", null, 1, 1, ModelRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelRoot_SourceModels(), this.getSourceModelTransf(), this.getSourceModelTransf_OwnedElement(), "sourceModels", null, 1, -1, ModelRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelRoot_TargetModels(), this.getTargetModelTransf(), this.getTargetModelTransf_OwnedElement(), "targetModels", null, 1, -1, ModelRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelRoot_Relations(), this.getRelations(), this.getRelations_OwnedModel(), "relations", null, 1, -1, ModelRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transformationElementEClass, TransformationElement.class, "TransformationElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransformationElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, TransformationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelTransfEClass, ModelTransf.class, "ModelTransf", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelTransf_Path(), ecorePackage.getEString(), "path", null, 1, 1, ModelTransf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelTransf_Elements(), this.getModelElement(), this.getModelElement_OwnedElement(), "elements", null, 0, -1, ModelTransf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourceModelTransfEClass, SourceModelTransf.class, "SourceModelTransf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSourceModelTransf_OwnedElement(), this.getModelRoot(), this.getModelRoot_SourceModels(), "ownedElement", null, 1, 1, SourceModelTransf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(targetModelTransfEClass, TargetModelTransf.class, "TargetModelTransf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTargetModelTransf_OwnedElement(), this.getModelRoot(), this.getModelRoot_TargetModels(), "ownedElement", null, 1, 1, TargetModelTransf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelComponentEClass, ModelComponent.class, "ModelComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelComponent_RelationElement(), this.getRelationElement(), this.getRelationElement_ModelComponent(), "relationElement", null, 0, -1, ModelComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelComponent_Ref(), ecorePackage.getEString(), "ref", null, 0, 1, ModelComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationsEClass, Relations.class, "Relations", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelations_OwnedModel(), this.getModelRoot(), this.getModelRoot_Relations(), "ownedModel", null, 0, 1, Relations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelations_TypeRelation(), this.getTRelation(), "typeRelation", null, 0, 1, Relations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelations_TypeElement(), this.getTElement(), "typeElement", null, 0, 1, Relations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelations_Role(), this.getTRole(), "role", null, 0, 1, Relations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelations_Extends(), this.getRelations(), this.getRelations_IsExtended(), "extends", null, 0, 1, Relations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelations_IsExtended(), this.getRelations(), this.getRelations_Extends(), "isExtended", null, 0, -1, Relations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oneToOneEClass, OneToOne.class, "OneToOne", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOneToOne_Source(), this.getSourceElement(), null, "source", null, 1, 1, OneToOne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOneToOne_Target(), this.getTargetElement(), null, "target", null, 1, 1, OneToOne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOneToOne_OwnedElement(), this.getTargetElement(), this.getTargetElement_OneToOne(), "ownedElement", null, 0, 1, OneToOne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oneToZeroEClass, OneToZero.class, "OneToZero", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOneToZero_Source(), this.getSourceElement(), null, "source", null, 1, 1, OneToZero.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zeroToOneEClass, ZeroToOne.class, "ZeroToOne", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZeroToOne_Target(), this.getTargetElement(), null, "target", null, 1, 1, ZeroToOne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZeroToOne_OwnedElement(), this.getTargetElement(), this.getTargetElement_ZeroToOne(), "ownedElement", null, 0, 1, ZeroToOne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oneToManyEClass, OneToMany.class, "OneToMany", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOneToMany_Source(), this.getSourceElement(), null, "source", null, 1, 1, OneToMany.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOneToMany_Target(), this.getTargetElement(), null, "target", null, 1, -1, OneToMany.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(manyToOneEClass, ManyToOne.class, "ManyToOne", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getManyToOne_Target(), this.getTargetElement(), null, "target", null, 1, 1, ManyToOne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManyToOne_Source(), this.getSourceElement(), null, "source", null, 1, -1, ManyToOne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManyToOne_OwnedElement(), this.getTargetElement(), this.getTargetElement_ManyToOne(), "ownedElement", null, 0, 1, ManyToOne.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(manyToManyEClass, ManyToMany.class, "ManyToMany", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getManyToMany_Target(), this.getTargetElement(), null, "target", null, 1, -1, ManyToMany.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getManyToMany_Source(), this.getSourceElement(), null, "source", null, 1, -1, ManyToMany.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationElementEClass, RelationElement.class, "RelationElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationElement_ModelComponent(), this.getModelComponent(), this.getModelComponent_RelationElement(), "modelComponent", null, 1, 1, RelationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourceElementEClass, SourceElement.class, "SourceElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(targetElementEClass, TargetElement.class, "TargetElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTargetElement_ZeroToOne(), this.getZeroToOne(), this.getZeroToOne_OwnedElement(), "zeroToOne", null, 0, -1, TargetElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTargetElement_OneToOne(), this.getOneToOne(), this.getOneToOne_OwnedElement(), "oneToOne", null, 0, -1, TargetElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTargetElement_ManyToOne(), this.getManyToOne(), this.getManyToOne_OwnedElement(), "ManyToOne", null, 0, -1, TargetElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelElementEClass, ModelElement.class, "ModelElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelElement_Features(), this.getModelFeature(), this.getModelFeature_Parent(), "features", null, 0, -1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelElement_Elements(), this.getModelElement(), this.getModelElement_SuperElement(), "elements", null, 0, -1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelElement_SuperElement(), this.getModelElement(), this.getModelElement_Elements(), "superElement", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelElement_OwnedElement(), this.getModelTransf(), this.getModelTransf_Elements(), "ownedElement", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelFeatureEClass, ModelFeature.class, "ModelFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelFeature_Parent(), this.getModelElement(), this.getModelElement_Features(), "parent", null, 1, 1, ModelFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(tRelationEEnum, TRelation.class, "TRelation");
		addEEnumLiteral(tRelationEEnum, TRelation.COPY);
		addEEnumLiteral(tRelationEEnum, TRelation.CONCATENATION);
		addEEnumLiteral(tRelationEEnum, TRelation.OTHER);

		initEEnum(tElementEEnum, TElement.class, "TElement");
		addEEnumLiteral(tElementEEnum, TElement.ECLASSIFIER);
		addEEnumLiteral(tElementEEnum, TElement.EATTRIBUTE);
		addEEnumLiteral(tElementEEnum, TElement.EREFERENCE);

		initEEnum(tRoleEEnum, TRole.class, "TRole");
		addEEnumLiteral(tRoleEEnum, TRole.IS_MAIN);
		addEEnumLiteral(tRoleEEnum, TRole.IS_SECONDARY);
		addEEnumLiteral(tRoleEEnum, TRole.IS_ABSTRACT);

		// Create resource
		createResource(eNS_URI);
	}

} //MetagemPackageImpl
