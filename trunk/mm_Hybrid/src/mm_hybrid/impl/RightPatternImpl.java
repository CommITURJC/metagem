/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm_hybrid.impl;

import java.util.Collection;

import mm_hybrid.MM_HybridPackage;
import mm_hybrid.RightPattern;
import mm_hybrid.Rule;
import mm_hybrid.SourceElementRule;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Right Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mm_hybrid.impl.RightPatternImpl#getSourceElement <em>Source Element</em>}</li>
 *   <li>{@link mm_hybrid.impl.RightPatternImpl#getRule <em>Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RightPatternImpl extends EObjectImpl implements RightPattern {
	/**
	 * The cached value of the '{@link #getSourceElement() <em>Source Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceElement()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceElementRule> sourceElement;

	/**
	 * The cached value of the '{@link #getRule() <em>Rule</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRule()
	 * @generated
	 * @ordered
	 */
	protected EList<Rule> rule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RightPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MM_HybridPackage.Literals.RIGHT_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceElementRule> getSourceElement() {
		if (sourceElement == null) {
			sourceElement = new EObjectContainmentEList<SourceElementRule>(
					SourceElementRule.class, this,
					MM_HybridPackage.RIGHT_PATTERN__SOURCE_ELEMENT);
		}
		return sourceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rule> getRule() {
		if (rule == null) {
			rule = new EObjectResolvingEList<Rule>(Rule.class, this,
					MM_HybridPackage.RIGHT_PATTERN__RULE);
		}
		return rule;
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
		case MM_HybridPackage.RIGHT_PATTERN__SOURCE_ELEMENT:
			return ((InternalEList<?>) getSourceElement()).basicRemove(
					otherEnd, msgs);
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
		case MM_HybridPackage.RIGHT_PATTERN__SOURCE_ELEMENT:
			return getSourceElement();
		case MM_HybridPackage.RIGHT_PATTERN__RULE:
			return getRule();
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
		case MM_HybridPackage.RIGHT_PATTERN__SOURCE_ELEMENT:
			getSourceElement().clear();
			getSourceElement().addAll(
					(Collection<? extends SourceElementRule>) newValue);
			return;
		case MM_HybridPackage.RIGHT_PATTERN__RULE:
			getRule().clear();
			getRule().addAll((Collection<? extends Rule>) newValue);
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
		case MM_HybridPackage.RIGHT_PATTERN__SOURCE_ELEMENT:
			getSourceElement().clear();
			return;
		case MM_HybridPackage.RIGHT_PATTERN__RULE:
			getRule().clear();
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
		case MM_HybridPackage.RIGHT_PATTERN__SOURCE_ELEMENT:
			return sourceElement != null && !sourceElement.isEmpty();
		case MM_HybridPackage.RIGHT_PATTERN__RULE:
			return rule != null && !rule.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RightPatternImpl
