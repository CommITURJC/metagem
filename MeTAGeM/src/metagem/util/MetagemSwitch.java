/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metagem.util;

import java.util.List;

import metagem.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see metagem.MetagemPackage
 * @generated
 */
public class MetagemSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MetagemPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetagemSwitch() {
		if (modelPackage == null) {
			modelPackage = MetagemPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MetagemPackage.MODEL_ROOT: {
				ModelRoot modelRoot = (ModelRoot)theEObject;
				T result = caseModelRoot(modelRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetagemPackage.TRANSFORMATION_ELEMENT: {
				TransformationElement transformationElement = (TransformationElement)theEObject;
				T result = caseTransformationElement(transformationElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetagemPackage.MODEL_TRANSF: {
				ModelTransf modelTransf = (ModelTransf)theEObject;
				T result = caseModelTransf(modelTransf);
				if (result == null) result = caseTransformationElement(modelTransf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetagemPackage.SOURCE_MODEL_TRANSF: {
				SourceModelTransf sourceModelTransf = (SourceModelTransf)theEObject;
				T result = caseSourceModelTransf(sourceModelTransf);
				if (result == null) result = caseModelTransf(sourceModelTransf);
				if (result == null) result = caseTransformationElement(sourceModelTransf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetagemPackage.TARGET_MODEL_TRANSF: {
				TargetModelTransf targetModelTransf = (TargetModelTransf)theEObject;
				T result = caseTargetModelTransf(targetModelTransf);
				if (result == null) result = caseModelTransf(targetModelTransf);
				if (result == null) result = caseTransformationElement(targetModelTransf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetagemPackage.RELATIONS: {
				Relations relations = (Relations)theEObject;
				T result = caseRelations(relations);
				if (result == null) result = caseTransformationElement(relations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetagemPackage.ONE_TO_ONE: {
				OneToOne oneToOne = (OneToOne)theEObject;
				T result = caseOneToOne(oneToOne);
				if (result == null) result = caseRelations(oneToOne);
				if (result == null) result = caseTransformationElement(oneToOne);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetagemPackage.ONE_TO_ZERO: {
				OneToZero oneToZero = (OneToZero)theEObject;
				T result = caseOneToZero(oneToZero);
				if (result == null) result = caseRelations(oneToZero);
				if (result == null) result = caseTransformationElement(oneToZero);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetagemPackage.ZERO_TO_ONE: {
				ZeroToOne zeroToOne = (ZeroToOne)theEObject;
				T result = caseZeroToOne(zeroToOne);
				if (result == null) result = caseRelations(zeroToOne);
				if (result == null) result = caseTransformationElement(zeroToOne);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetagemPackage.ONE_TO_MANY: {
				OneToMany oneToMany = (OneToMany)theEObject;
				T result = caseOneToMany(oneToMany);
				if (result == null) result = caseRelations(oneToMany);
				if (result == null) result = caseTransformationElement(oneToMany);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetagemPackage.MANY_TO_ONE: {
				ManyToOne manyToOne = (ManyToOne)theEObject;
				T result = caseManyToOne(manyToOne);
				if (result == null) result = caseRelations(manyToOne);
				if (result == null) result = caseTransformationElement(manyToOne);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetagemPackage.MANY_TO_MANY: {
				ManyToMany manyToMany = (ManyToMany)theEObject;
				T result = caseManyToMany(manyToMany);
				if (result == null) result = caseRelations(manyToMany);
				if (result == null) result = caseTransformationElement(manyToMany);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetagemPackage.RELATION_ELEMENT: {
				RelationElement relationElement = (RelationElement)theEObject;
				T result = caseRelationElement(relationElement);
				if (result == null) result = caseTransformationElement(relationElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetagemPackage.SOURCE_ELEMENT: {
				SourceElement sourceElement = (SourceElement)theEObject;
				T result = caseSourceElement(sourceElement);
				if (result == null) result = caseRelationElement(sourceElement);
				if (result == null) result = caseTransformationElement(sourceElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetagemPackage.TARGET_ELEMENT: {
				TargetElement targetElement = (TargetElement)theEObject;
				T result = caseTargetElement(targetElement);
				if (result == null) result = caseRelationElement(targetElement);
				if (result == null) result = caseTransformationElement(targetElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelRoot(ModelRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformation Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformation Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformationElement(TransformationElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Transf</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Transf</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelTransf(ModelTransf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Model Transf</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Model Transf</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceModelTransf(SourceModelTransf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target Model Transf</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target Model Transf</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetModelTransf(TargetModelTransf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelations(Relations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>One To One</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>One To One</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOneToOne(OneToOne object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>One To Zero</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>One To Zero</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOneToZero(OneToZero object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zero To One</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zero To One</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZeroToOne(ZeroToOne object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>One To Many</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>One To Many</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOneToMany(OneToMany object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Many To One</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Many To One</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManyToOne(ManyToOne object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Many To Many</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Many To Many</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManyToMany(ManyToMany object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationElement(RelationElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceElement(SourceElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetElement(TargetElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //MetagemSwitch
