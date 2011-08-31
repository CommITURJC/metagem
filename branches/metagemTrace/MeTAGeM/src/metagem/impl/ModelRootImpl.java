/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metagem.impl;

import java.util.Collection;

import metagem.MetagemPackage;
import metagem.ModelRoot;
import metagem.Relations;
import metagem.SourceModelTransf;
import metagem.TargetModelTransf;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link metagem.impl.ModelRootImpl#getSourceModels <em>Source Models</em>}</li>
 *   <li>{@link metagem.impl.ModelRootImpl#getTargetModels <em>Target Models</em>}</li>
 *   <li>{@link metagem.impl.ModelRootImpl#getRelations <em>Relations</em>}</li>
 *   <li>{@link metagem.impl.ModelRootImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelRootImpl extends EObjectImpl implements ModelRoot {
	/**
	 * The cached value of the '{@link #getSourceModels() <em>Source Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceModels()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceModelTransf> sourceModels;

	/**
	 * The cached value of the '{@link #getTargetModels() <em>Target Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetModels()
	 * @generated
	 * @ordered
	 */
	protected EList<TargetModelTransf> targetModels;

	/**
	 * The cached value of the '{@link #getRelations() <em>Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<Relations> relations;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetagemPackage.Literals.MODEL_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetagemPackage.MODEL_ROOT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceModelTransf> getSourceModels() {
		if (sourceModels == null) {
			sourceModels = new EObjectContainmentWithInverseEList<SourceModelTransf>(SourceModelTransf.class, this, MetagemPackage.MODEL_ROOT__SOURCE_MODELS, MetagemPackage.SOURCE_MODEL_TRANSF__OWNED_ELEMENT);
		}
		return sourceModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TargetModelTransf> getTargetModels() {
		if (targetModels == null) {
			targetModels = new EObjectContainmentWithInverseEList<TargetModelTransf>(TargetModelTransf.class, this, MetagemPackage.MODEL_ROOT__TARGET_MODELS, MetagemPackage.TARGET_MODEL_TRANSF__OWNED_ELEMENT);
		}
		return targetModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relations> getRelations() {
		if (relations == null) {
			relations = new EObjectContainmentWithInverseEList<Relations>(Relations.class, this, MetagemPackage.MODEL_ROOT__RELATIONS, MetagemPackage.RELATIONS__OWNED_MODEL);
		}
		return relations;
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
			case MetagemPackage.MODEL_ROOT__SOURCE_MODELS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSourceModels()).basicAdd(otherEnd, msgs);
			case MetagemPackage.MODEL_ROOT__TARGET_MODELS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTargetModels()).basicAdd(otherEnd, msgs);
			case MetagemPackage.MODEL_ROOT__RELATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRelations()).basicAdd(otherEnd, msgs);
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
			case MetagemPackage.MODEL_ROOT__SOURCE_MODELS:
				return ((InternalEList<?>)getSourceModels()).basicRemove(otherEnd, msgs);
			case MetagemPackage.MODEL_ROOT__TARGET_MODELS:
				return ((InternalEList<?>)getTargetModels()).basicRemove(otherEnd, msgs);
			case MetagemPackage.MODEL_ROOT__RELATIONS:
				return ((InternalEList<?>)getRelations()).basicRemove(otherEnd, msgs);
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
			case MetagemPackage.MODEL_ROOT__SOURCE_MODELS:
				return getSourceModels();
			case MetagemPackage.MODEL_ROOT__TARGET_MODELS:
				return getTargetModels();
			case MetagemPackage.MODEL_ROOT__RELATIONS:
				return getRelations();
			case MetagemPackage.MODEL_ROOT__NAME:
				return getName();
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
			case MetagemPackage.MODEL_ROOT__SOURCE_MODELS:
				getSourceModels().clear();
				getSourceModels().addAll((Collection<? extends SourceModelTransf>)newValue);
				return;
			case MetagemPackage.MODEL_ROOT__TARGET_MODELS:
				getTargetModels().clear();
				getTargetModels().addAll((Collection<? extends TargetModelTransf>)newValue);
				return;
			case MetagemPackage.MODEL_ROOT__RELATIONS:
				getRelations().clear();
				getRelations().addAll((Collection<? extends Relations>)newValue);
				return;
			case MetagemPackage.MODEL_ROOT__NAME:
				setName((String)newValue);
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
			case MetagemPackage.MODEL_ROOT__SOURCE_MODELS:
				getSourceModels().clear();
				return;
			case MetagemPackage.MODEL_ROOT__TARGET_MODELS:
				getTargetModels().clear();
				return;
			case MetagemPackage.MODEL_ROOT__RELATIONS:
				getRelations().clear();
				return;
			case MetagemPackage.MODEL_ROOT__NAME:
				setName(NAME_EDEFAULT);
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
			case MetagemPackage.MODEL_ROOT__SOURCE_MODELS:
				return sourceModels != null && !sourceModels.isEmpty();
			case MetagemPackage.MODEL_ROOT__TARGET_MODELS:
				return targetModels != null && !targetModels.isEmpty();
			case MetagemPackage.MODEL_ROOT__RELATIONS:
				return relations != null && !relations.isEmpty();
			case MetagemPackage.MODEL_ROOT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ModelRootImpl
