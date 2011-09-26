/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hybrid.impl;

import hybrid.HybridPackage;
import hybrid.ModelComponent;

import hybrid.RuleElement;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hybrid.impl.ModelComponentImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link hybrid.impl.ModelComponentImpl#getRuleElement <em>Rule Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ModelComponentImpl extends HybridElementImpl implements ModelComponent {
	/**
	 * The default value of the '{@link #getRef() <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected static final String REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRef() <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected String ref = REF_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRuleElement() <em>Rule Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleElement()
	 * @generated
	 * @ordered
	 */
	protected RuleElement ruleElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HybridPackage.Literals.MODEL_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRef() {
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRef(String newRef) {
		String oldRef = ref;
		ref = newRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HybridPackage.MODEL_COMPONENT__REF, oldRef, ref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleElement getRuleElement() {
		if (ruleElement != null && ruleElement.eIsProxy()) {
			InternalEObject oldRuleElement = (InternalEObject)ruleElement;
			ruleElement = (RuleElement)eResolveProxy(oldRuleElement);
			if (ruleElement != oldRuleElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HybridPackage.MODEL_COMPONENT__RULE_ELEMENT, oldRuleElement, ruleElement));
			}
		}
		return ruleElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleElement basicGetRuleElement() {
		return ruleElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRuleElement(RuleElement newRuleElement, NotificationChain msgs) {
		RuleElement oldRuleElement = ruleElement;
		ruleElement = newRuleElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HybridPackage.MODEL_COMPONENT__RULE_ELEMENT, oldRuleElement, newRuleElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuleElement(RuleElement newRuleElement) {
		if (newRuleElement != ruleElement) {
			NotificationChain msgs = null;
			if (ruleElement != null)
				msgs = ((InternalEObject)ruleElement).eInverseRemove(this, HybridPackage.RULE_ELEMENT__COMPONENT, RuleElement.class, msgs);
			if (newRuleElement != null)
				msgs = ((InternalEObject)newRuleElement).eInverseAdd(this, HybridPackage.RULE_ELEMENT__COMPONENT, RuleElement.class, msgs);
			msgs = basicSetRuleElement(newRuleElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HybridPackage.MODEL_COMPONENT__RULE_ELEMENT, newRuleElement, newRuleElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HybridPackage.MODEL_COMPONENT__RULE_ELEMENT:
				if (ruleElement != null)
					msgs = ((InternalEObject)ruleElement).eInverseRemove(this, HybridPackage.RULE_ELEMENT__COMPONENT, RuleElement.class, msgs);
				return basicSetRuleElement((RuleElement)otherEnd, msgs);
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
			case HybridPackage.MODEL_COMPONENT__RULE_ELEMENT:
				return basicSetRuleElement(null, msgs);
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
			case HybridPackage.MODEL_COMPONENT__REF:
				return getRef();
			case HybridPackage.MODEL_COMPONENT__RULE_ELEMENT:
				if (resolve) return getRuleElement();
				return basicGetRuleElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HybridPackage.MODEL_COMPONENT__REF:
				setRef((String)newValue);
				return;
			case HybridPackage.MODEL_COMPONENT__RULE_ELEMENT:
				setRuleElement((RuleElement)newValue);
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
			case HybridPackage.MODEL_COMPONENT__REF:
				setRef(REF_EDEFAULT);
				return;
			case HybridPackage.MODEL_COMPONENT__RULE_ELEMENT:
				setRuleElement((RuleElement)null);
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
			case HybridPackage.MODEL_COMPONENT__REF:
				return REF_EDEFAULT == null ? ref != null : !REF_EDEFAULT.equals(ref);
			case HybridPackage.MODEL_COMPONENT__RULE_ELEMENT:
				return ruleElement != null;
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
		result.append(" (ref: ");
		result.append(ref);
		result.append(')');
		return result.toString();
	}

} //ModelComponentImpl
