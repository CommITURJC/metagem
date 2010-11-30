/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package RubyTL.impl;

import RubyTL.*;

import org.eclipse.emf.ecore.EClass;
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
public class RubyTLFactoryImpl extends EFactoryImpl implements RubyTLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RubyTLFactory init() {
		try {
			RubyTLFactory theRubyTLFactory = (RubyTLFactory)EPackage.Registry.INSTANCE.getEFactory("http://org.eclipse.kybele.metagem.rubytl"); 
			if (theRubyTLFactory != null) {
				return theRubyTLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RubyTLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RubyTLFactoryImpl() {
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
			case RubyTLPackage.TRANSFORMATION: return createTransformation();
			case RubyTLPackage.METAMODEL: return createMetamodel();
			case RubyTLPackage.FROM_ELEMENT: return createFromElement();
			case RubyTLPackage.TO_ELEMENT: return createToElement();
			case RubyTLPackage.NAMED_ELEMENT: return createNamedElement();
			case RubyTLPackage.TOP_RULE: return createTopRule();
			case RubyTLPackage.NORMAL_RULE: return createNormalRule();
			case RubyTLPackage.COPY_RULE: return createCopyRule();
			case RubyTLPackage.MAPPING: return createMapping();
			case RubyTLPackage.BINDING: return createBinding();
			case RubyTLPackage.EXP_VARIABLE: return createExpVariable();
			case RubyTLPackage.EXP_GET: return createExpGet();
			case RubyTLPackage.FILTER: return createFilter();
			case RubyTLPackage.DECORATOR: return createDecorator();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transformation createTransformation() {
		TransformationImpl transformation = new TransformationImpl();
		return transformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metamodel createMetamodel() {
		MetamodelImpl metamodel = new MetamodelImpl();
		return metamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FromElement createFromElement() {
		FromElementImpl fromElement = new FromElementImpl();
		return fromElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToElement createToElement() {
		ToElementImpl toElement = new ToElementImpl();
		return toElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement createNamedElement() {
		NamedElementImpl namedElement = new NamedElementImpl();
		return namedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopRule createTopRule() {
		TopRuleImpl topRule = new TopRuleImpl();
		return topRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CopyRule createCopyRule() {
		CopyRuleImpl copyRule = new CopyRuleImpl();
		return copyRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mapping createMapping() {
		MappingImpl mapping = new MappingImpl();
		return mapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binding createBinding() {
		BindingImpl binding = new BindingImpl();
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpVariable createExpVariable() {
		ExpVariableImpl expVariable = new ExpVariableImpl();
		return expVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpGet createExpGet() {
		ExpGetImpl expGet = new ExpGetImpl();
		return expGet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Filter createFilter() {
		FilterImpl filter = new FilterImpl();
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decorator createDecorator() {
		DecoratorImpl decorator = new DecoratorImpl();
		return decorator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalRule createNormalRule() {
		NormalRuleImpl normalRule = new NormalRuleImpl();
		return normalRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RubyTLPackage getRubyTLPackage() {
		return (RubyTLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RubyTLPackage getPackage() {
		return RubyTLPackage.eINSTANCE;
	}

} //RubyTLFactoryImpl
