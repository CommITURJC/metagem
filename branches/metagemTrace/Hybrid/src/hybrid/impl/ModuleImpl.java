/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hybrid.impl;

import hybrid.HybridPackage;
import hybrid.Module;
import hybrid.Operation;
import hybrid.Rule;
import hybrid.SourceModel;
import hybrid.TargetModel;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hybrid.impl.ModuleImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link hybrid.impl.ModuleImpl#getSourceModels <em>Source Models</em>}</li>
 *   <li>{@link hybrid.impl.ModuleImpl#getTargetModels <em>Target Models</em>}</li>
 *   <li>{@link hybrid.impl.ModuleImpl#getRules <em>Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModuleImpl extends HybridElementImpl implements Module {
	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> operations;

	/**
	 * The cached value of the '{@link #getSourceModels() <em>Source Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceModels()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceModel> sourceModels;

	/**
	 * The cached value of the '{@link #getTargetModels() <em>Target Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetModels()
	 * @generated
	 * @ordered
	 */
	protected EList<TargetModel> targetModels;

	/**
	 * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected EList<Rule> rules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HybridPackage.Literals.MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentWithInverseEList<Operation>(Operation.class, this, HybridPackage.MODULE__OPERATIONS, HybridPackage.OPERATION__MODULE);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceModel> getSourceModels() {
		if (sourceModels == null) {
			sourceModels = new EObjectContainmentWithInverseEList<SourceModel>(SourceModel.class, this, HybridPackage.MODULE__SOURCE_MODELS, HybridPackage.SOURCE_MODEL__MODULE);
		}
		return sourceModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TargetModel> getTargetModels() {
		if (targetModels == null) {
			targetModels = new EObjectContainmentWithInverseEList<TargetModel>(TargetModel.class, this, HybridPackage.MODULE__TARGET_MODELS, HybridPackage.TARGET_MODEL__MODULE);
		}
		return targetModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rule> getRules() {
		if (rules == null) {
			rules = new EObjectContainmentWithInverseEList<Rule>(Rule.class, this, HybridPackage.MODULE__RULES, HybridPackage.RULE__MODULE);
		}
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HybridPackage.MODULE__OPERATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOperations()).basicAdd(otherEnd, msgs);
			case HybridPackage.MODULE__SOURCE_MODELS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSourceModels()).basicAdd(otherEnd, msgs);
			case HybridPackage.MODULE__TARGET_MODELS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTargetModels()).basicAdd(otherEnd, msgs);
			case HybridPackage.MODULE__RULES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRules()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HybridPackage.MODULE__OPERATIONS:
				return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
			case HybridPackage.MODULE__SOURCE_MODELS:
				return ((InternalEList<?>)getSourceModels()).basicRemove(otherEnd, msgs);
			case HybridPackage.MODULE__TARGET_MODELS:
				return ((InternalEList<?>)getTargetModels()).basicRemove(otherEnd, msgs);
			case HybridPackage.MODULE__RULES:
				return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HybridPackage.MODULE__OPERATIONS:
				return getOperations();
			case HybridPackage.MODULE__SOURCE_MODELS:
				return getSourceModels();
			case HybridPackage.MODULE__TARGET_MODELS:
				return getTargetModels();
			case HybridPackage.MODULE__RULES:
				return getRules();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HybridPackage.MODULE__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends Operation>)newValue);
				return;
			case HybridPackage.MODULE__SOURCE_MODELS:
				getSourceModels().clear();
				getSourceModels().addAll((Collection<? extends SourceModel>)newValue);
				return;
			case HybridPackage.MODULE__TARGET_MODELS:
				getTargetModels().clear();
				getTargetModels().addAll((Collection<? extends TargetModel>)newValue);
				return;
			case HybridPackage.MODULE__RULES:
				getRules().clear();
				getRules().addAll((Collection<? extends Rule>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case HybridPackage.MODULE__OPERATIONS:
				getOperations().clear();
				return;
			case HybridPackage.MODULE__SOURCE_MODELS:
				getSourceModels().clear();
				return;
			case HybridPackage.MODULE__TARGET_MODELS:
				getTargetModels().clear();
				return;
			case HybridPackage.MODULE__RULES:
				getRules().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case HybridPackage.MODULE__OPERATIONS:
				return operations != null && !operations.isEmpty();
			case HybridPackage.MODULE__SOURCE_MODELS:
				return sourceModels != null && !sourceModels.isEmpty();
			case HybridPackage.MODULE__TARGET_MODELS:
				return targetModels != null && !targetModels.isEmpty();
			case HybridPackage.MODULE__RULES:
				return rules != null && !rules.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModuleImpl
