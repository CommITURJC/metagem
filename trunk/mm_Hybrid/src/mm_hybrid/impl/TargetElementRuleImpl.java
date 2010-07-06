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
import mm_hybrid.TargetElementRule;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Target Element Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mm_hybrid.impl.TargetElementRuleImpl#getIncluded <em>Included</em>}</li>
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MM_HybridPackage.TARGET_ELEMENT_RULE__INCLUDED:
			return ((InternalEList<?>) getIncluded()).basicRemove(otherEnd,
					msgs);
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
		case MM_HybridPackage.TARGET_ELEMENT_RULE__INCLUDED:
			return getIncluded();
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
		}
		return super.eIsSet(featureID);
	}

} //TargetElementRuleImpl
