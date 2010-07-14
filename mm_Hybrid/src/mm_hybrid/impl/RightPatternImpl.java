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
	 * The cached value of the '{@link #getRule() <em>Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRule()
	 * @generated
	 * @ordered
	 */
	protected Rule rule;

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
	public Rule getRule() {
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRule(Rule newRule, NotificationChain msgs) {
		Rule oldRule = rule;
		rule = newRule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, MM_HybridPackage.RIGHT_PATTERN__RULE,
					oldRule, newRule);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRule(Rule newRule) {
		if (newRule != rule) {
			NotificationChain msgs = null;
			if (rule != null)
				msgs = ((InternalEObject) rule).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- MM_HybridPackage.RIGHT_PATTERN__RULE, null,
						msgs);
			if (newRule != null)
				msgs = ((InternalEObject) newRule).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- MM_HybridPackage.RIGHT_PATTERN__RULE, null,
						msgs);
			msgs = basicSetRule(newRule, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MM_HybridPackage.RIGHT_PATTERN__RULE, newRule, newRule));
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
		case MM_HybridPackage.RIGHT_PATTERN__RULE:
			return basicSetRule(null, msgs);
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
			setRule((Rule) newValue);
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
			setRule((Rule) null);
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
			return rule != null;
		}
		return super.eIsSet(featureID);
	}

} //RightPatternImpl
