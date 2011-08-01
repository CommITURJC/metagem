/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metagem.impl;

import java.util.Collection;

import metagem.ManyToOne;
import metagem.MetagemPackage;
import metagem.OneToOne;
import metagem.TargetElement;
import metagem.ZeroToOne;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Target Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link metagem.impl.TargetElementImpl#getZeroToOne <em>Zero To One</em>}</li>
 *   <li>{@link metagem.impl.TargetElementImpl#getOneToOne <em>One To One</em>}</li>
 *   <li>{@link metagem.impl.TargetElementImpl#getManyToOne <em>Many To One</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TargetElementImpl extends RelationElementImpl implements TargetElement {
	/**
	 * The cached value of the '{@link #getZeroToOne() <em>Zero To One</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeroToOne()
	 * @generated
	 * @ordered
	 */
	protected EList<ZeroToOne> zeroToOne;

	/**
	 * The cached value of the '{@link #getOneToOne() <em>One To One</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOneToOne()
	 * @generated
	 * @ordered
	 */
	protected EList<OneToOne> oneToOne;

	/**
	 * The cached value of the '{@link #getManyToOne() <em>Many To One</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManyToOne()
	 * @generated
	 * @ordered
	 */
	protected EList<ManyToOne> manyToOne;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TargetElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetagemPackage.Literals.TARGET_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ZeroToOne> getZeroToOne() {
		if (zeroToOne == null) {
			zeroToOne = new EObjectContainmentWithInverseEList<ZeroToOne>(ZeroToOne.class, this, MetagemPackage.TARGET_ELEMENT__ZERO_TO_ONE, MetagemPackage.ZERO_TO_ONE__OWNED_ELEMENT);
		}
		return zeroToOne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OneToOne> getOneToOne() {
		if (oneToOne == null) {
			oneToOne = new EObjectContainmentWithInverseEList<OneToOne>(OneToOne.class, this, MetagemPackage.TARGET_ELEMENT__ONE_TO_ONE, MetagemPackage.ONE_TO_ONE__OWNED_ELEMENT);
		}
		return oneToOne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ManyToOne> getManyToOne() {
		if (manyToOne == null) {
			manyToOne = new EObjectContainmentWithInverseEList<ManyToOne>(ManyToOne.class, this, MetagemPackage.TARGET_ELEMENT__MANY_TO_ONE, MetagemPackage.MANY_TO_ONE__OWNED_ELEMENT);
		}
		return manyToOne;
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
			case MetagemPackage.TARGET_ELEMENT__ZERO_TO_ONE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getZeroToOne()).basicAdd(otherEnd, msgs);
			case MetagemPackage.TARGET_ELEMENT__ONE_TO_ONE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOneToOne()).basicAdd(otherEnd, msgs);
			case MetagemPackage.TARGET_ELEMENT__MANY_TO_ONE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getManyToOne()).basicAdd(otherEnd, msgs);
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
			case MetagemPackage.TARGET_ELEMENT__ZERO_TO_ONE:
				return ((InternalEList<?>)getZeroToOne()).basicRemove(otherEnd, msgs);
			case MetagemPackage.TARGET_ELEMENT__ONE_TO_ONE:
				return ((InternalEList<?>)getOneToOne()).basicRemove(otherEnd, msgs);
			case MetagemPackage.TARGET_ELEMENT__MANY_TO_ONE:
				return ((InternalEList<?>)getManyToOne()).basicRemove(otherEnd, msgs);
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
			case MetagemPackage.TARGET_ELEMENT__ZERO_TO_ONE:
				return getZeroToOne();
			case MetagemPackage.TARGET_ELEMENT__ONE_TO_ONE:
				return getOneToOne();
			case MetagemPackage.TARGET_ELEMENT__MANY_TO_ONE:
				return getManyToOne();
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
			case MetagemPackage.TARGET_ELEMENT__ZERO_TO_ONE:
				getZeroToOne().clear();
				getZeroToOne().addAll((Collection<? extends ZeroToOne>)newValue);
				return;
			case MetagemPackage.TARGET_ELEMENT__ONE_TO_ONE:
				getOneToOne().clear();
				getOneToOne().addAll((Collection<? extends OneToOne>)newValue);
				return;
			case MetagemPackage.TARGET_ELEMENT__MANY_TO_ONE:
				getManyToOne().clear();
				getManyToOne().addAll((Collection<? extends ManyToOne>)newValue);
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
			case MetagemPackage.TARGET_ELEMENT__ZERO_TO_ONE:
				getZeroToOne().clear();
				return;
			case MetagemPackage.TARGET_ELEMENT__ONE_TO_ONE:
				getOneToOne().clear();
				return;
			case MetagemPackage.TARGET_ELEMENT__MANY_TO_ONE:
				getManyToOne().clear();
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
			case MetagemPackage.TARGET_ELEMENT__ZERO_TO_ONE:
				return zeroToOne != null && !zeroToOne.isEmpty();
			case MetagemPackage.TARGET_ELEMENT__ONE_TO_ONE:
				return oneToOne != null && !oneToOne.isEmpty();
			case MetagemPackage.TARGET_ELEMENT__MANY_TO_ONE:
				return manyToOne != null && !manyToOne.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TargetElementImpl
