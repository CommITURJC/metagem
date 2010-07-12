/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm_hybrid.impl;

import java.util.Collection;
import mm_hybrid.ElementIncluded;
import mm_hybrid.MM_HybridPackage;
import mm_hybrid.OutMetaModel;
import mm_hybrid.TargetElementRule;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Target Element Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mm_hybrid.impl.TargetElementRuleImpl#getIncluded <em>Included</em>}</li>
 *   <li>{@link mm_hybrid.impl.TargetElementRuleImpl#getMetamodel <em>Metamodel</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TargetElementRuleImpl extends ElementImpl implements
		TargetElementRule {
	/**
	 * The cached value of the '{@link #getIncluded() <em>Included</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncluded()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementIncluded> included;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TargetElementRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MM_HybridPackage.Literals.TARGET_ELEMENT_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementIncluded> getIncluded() {
		if (included == null) {
			included = new EObjectContainmentEList<ElementIncluded>(
					ElementIncluded.class, this,
					MM_HybridPackage.TARGET_ELEMENT_RULE__INCLUDED);
		}
		return included;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutMetaModel getMetamodel() {
		if (eContainerFeatureID != MM_HybridPackage.TARGET_ELEMENT_RULE__METAMODEL)
			return null;
		return (OutMetaModel) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetamodel(OutMetaModel newMetamodel,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newMetamodel,
				MM_HybridPackage.TARGET_ELEMENT_RULE__METAMODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetamodel(OutMetaModel newMetamodel) {
		if (newMetamodel != eInternalContainer()
				|| (eContainerFeatureID != MM_HybridPackage.TARGET_ELEMENT_RULE__METAMODEL && newMetamodel != null)) {
			if (EcoreUtil.isAncestor(this, newMetamodel))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMetamodel != null)
				msgs = ((InternalEObject) newMetamodel).eInverseAdd(this,
						MM_HybridPackage.OUT_META_MODEL__ELEMENTS,
						OutMetaModel.class, msgs);
			msgs = basicSetMetamodel(newMetamodel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MM_HybridPackage.TARGET_ELEMENT_RULE__METAMODEL,
					newMetamodel, newMetamodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MM_HybridPackage.TARGET_ELEMENT_RULE__METAMODEL:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetMetamodel((OutMetaModel) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MM_HybridPackage.TARGET_ELEMENT_RULE__INCLUDED:
			return ((InternalEList<?>) getIncluded()).basicRemove(otherEnd,
					msgs);
		case MM_HybridPackage.TARGET_ELEMENT_RULE__METAMODEL:
			return basicSetMetamodel(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID) {
		case MM_HybridPackage.TARGET_ELEMENT_RULE__METAMODEL:
			return eInternalContainer().eInverseRemove(this,
					MM_HybridPackage.OUT_META_MODEL__ELEMENTS,
					OutMetaModel.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MM_HybridPackage.TARGET_ELEMENT_RULE__INCLUDED:
			return getIncluded();
		case MM_HybridPackage.TARGET_ELEMENT_RULE__METAMODEL:
			return getMetamodel();
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
		case MM_HybridPackage.TARGET_ELEMENT_RULE__INCLUDED:
			getIncluded().clear();
			getIncluded().addAll(
					(Collection<? extends ElementIncluded>) newValue);
			return;
		case MM_HybridPackage.TARGET_ELEMENT_RULE__METAMODEL:
			setMetamodel((OutMetaModel) newValue);
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
		case MM_HybridPackage.TARGET_ELEMENT_RULE__INCLUDED:
			getIncluded().clear();
			return;
		case MM_HybridPackage.TARGET_ELEMENT_RULE__METAMODEL:
			setMetamodel((OutMetaModel) null);
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
		case MM_HybridPackage.TARGET_ELEMENT_RULE__INCLUDED:
			return included != null && !included.isEmpty();
		case MM_HybridPackage.TARGET_ELEMENT_RULE__METAMODEL:
			return getMetamodel() != null;
		}
		return super.eIsSet(featureID);
	}

} //TargetElementRuleImpl
