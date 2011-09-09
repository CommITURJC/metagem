/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hybrid.impl;

import hybrid.Binding;
import hybrid.HybridPackage;
import hybrid.Operation;
import hybrid.RightPattern;
import hybrid.Rule;
import hybrid.RuleElement;
import hybrid.Source;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Right Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hybrid.impl.RightPatternImpl#getBinding <em>Binding</em>}</li>
 *   <li>{@link hybrid.impl.RightPatternImpl#getSource <em>Source</em>}</li>
 *   <li>{@link hybrid.impl.RightPatternImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link hybrid.impl.RightPatternImpl#getConcreteValue <em>Concrete Value</em>}</li>
 *   <li>{@link hybrid.impl.RightPatternImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link hybrid.impl.RightPatternImpl#getRule <em>Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RightPatternImpl extends EObjectImpl implements RightPattern {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EList<Source> source;

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected Operation operation;

	/**
	 * The default value of the '{@link #getConcreteValue() <em>Concrete Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcreteValue()
	 * @generated
	 * @ordered
	 */
	protected static final String CONCRETE_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConcreteValue() <em>Concrete Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcreteValue()
	 * @generated
	 * @ordered
	 */
	protected String concreteValue = CONCRETE_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected RuleElement reference;

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
		return HybridPackage.Literals.RIGHT_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binding getBinding() {
		if (eContainerFeatureID() != HybridPackage.RIGHT_PATTERN__BINDING) return null;
		return (Binding)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinding(Binding newBinding, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newBinding, HybridPackage.RIGHT_PATTERN__BINDING, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinding(Binding newBinding) {
		if (newBinding != eInternalContainer() || (eContainerFeatureID() != HybridPackage.RIGHT_PATTERN__BINDING && newBinding != null)) {
			if (EcoreUtil.isAncestor(this, newBinding))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBinding != null)
				msgs = ((InternalEObject)newBinding).eInverseAdd(this, HybridPackage.BINDING__RIGHT, Binding.class, msgs);
			msgs = basicSetBinding(newBinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HybridPackage.RIGHT_PATTERN__BINDING, newBinding, newBinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Source> getSource() {
		if (source == null) {
			source = new EObjectContainmentWithInverseEList<Source>(Source.class, this, HybridPackage.RIGHT_PATTERN__SOURCE, HybridPackage.SOURCE__RIGHT_PATTERN_OWNED);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getOperation() {
		if (operation != null && operation.eIsProxy()) {
			InternalEObject oldOperation = (InternalEObject)operation;
			operation = (Operation)eResolveProxy(oldOperation);
			if (operation != oldOperation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HybridPackage.RIGHT_PATTERN__OPERATION, oldOperation, operation));
			}
		}
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperation(Operation newOperation, NotificationChain msgs) {
		Operation oldOperation = operation;
		operation = newOperation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HybridPackage.RIGHT_PATTERN__OPERATION, oldOperation, newOperation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation(Operation newOperation) {
		if (newOperation != operation) {
			NotificationChain msgs = null;
			if (operation != null)
				msgs = ((InternalEObject)operation).eInverseRemove(this, HybridPackage.OPERATION__RIGHT_PATTERN, Operation.class, msgs);
			if (newOperation != null)
				msgs = ((InternalEObject)newOperation).eInverseAdd(this, HybridPackage.OPERATION__RIGHT_PATTERN, Operation.class, msgs);
			msgs = basicSetOperation(newOperation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HybridPackage.RIGHT_PATTERN__OPERATION, newOperation, newOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConcreteValue() {
		return concreteValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcreteValue(String newConcreteValue) {
		String oldConcreteValue = concreteValue;
		concreteValue = newConcreteValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HybridPackage.RIGHT_PATTERN__CONCRETE_VALUE, oldConcreteValue, concreteValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleElement getReference() {
		if (reference != null && reference.eIsProxy()) {
			InternalEObject oldReference = (InternalEObject)reference;
			reference = (RuleElement)eResolveProxy(oldReference);
			if (reference != oldReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HybridPackage.RIGHT_PATTERN__REFERENCE, oldReference, reference));
			}
		}
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleElement basicGetReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReference(RuleElement newReference, NotificationChain msgs) {
		RuleElement oldReference = reference;
		reference = newReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HybridPackage.RIGHT_PATTERN__REFERENCE, oldReference, newReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference(RuleElement newReference) {
		if (newReference != reference) {
			NotificationChain msgs = null;
			if (reference != null)
				msgs = ((InternalEObject)reference).eInverseRemove(this, HybridPackage.RULE_ELEMENT__IS_REFERED, RuleElement.class, msgs);
			if (newReference != null)
				msgs = ((InternalEObject)newReference).eInverseAdd(this, HybridPackage.RULE_ELEMENT__IS_REFERED, RuleElement.class, msgs);
			msgs = basicSetReference(newReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HybridPackage.RIGHT_PATTERN__REFERENCE, newReference, newReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rule> getRule() {
		if (rule == null) {
			rule = new EObjectWithInverseResolvingEList.ManyInverse<Rule>(Rule.class, this, HybridPackage.RIGHT_PATTERN__RULE, HybridPackage.RULE__RIGHT_PATTERN);
		}
		return rule;
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
			case HybridPackage.RIGHT_PATTERN__BINDING:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBinding((Binding)otherEnd, msgs);
			case HybridPackage.RIGHT_PATTERN__SOURCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSource()).basicAdd(otherEnd, msgs);
			case HybridPackage.RIGHT_PATTERN__OPERATION:
				if (operation != null)
					msgs = ((InternalEObject)operation).eInverseRemove(this, HybridPackage.OPERATION__RIGHT_PATTERN, Operation.class, msgs);
				return basicSetOperation((Operation)otherEnd, msgs);
			case HybridPackage.RIGHT_PATTERN__REFERENCE:
				if (reference != null)
					msgs = ((InternalEObject)reference).eInverseRemove(this, HybridPackage.RULE_ELEMENT__IS_REFERED, RuleElement.class, msgs);
				return basicSetReference((RuleElement)otherEnd, msgs);
			case HybridPackage.RIGHT_PATTERN__RULE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRule()).basicAdd(otherEnd, msgs);
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
			case HybridPackage.RIGHT_PATTERN__BINDING:
				return basicSetBinding(null, msgs);
			case HybridPackage.RIGHT_PATTERN__SOURCE:
				return ((InternalEList<?>)getSource()).basicRemove(otherEnd, msgs);
			case HybridPackage.RIGHT_PATTERN__OPERATION:
				return basicSetOperation(null, msgs);
			case HybridPackage.RIGHT_PATTERN__REFERENCE:
				return basicSetReference(null, msgs);
			case HybridPackage.RIGHT_PATTERN__RULE:
				return ((InternalEList<?>)getRule()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case HybridPackage.RIGHT_PATTERN__BINDING:
				return eInternalContainer().eInverseRemove(this, HybridPackage.BINDING__RIGHT, Binding.class, msgs);
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
			case HybridPackage.RIGHT_PATTERN__BINDING:
				return getBinding();
			case HybridPackage.RIGHT_PATTERN__SOURCE:
				return getSource();
			case HybridPackage.RIGHT_PATTERN__OPERATION:
				if (resolve) return getOperation();
				return basicGetOperation();
			case HybridPackage.RIGHT_PATTERN__CONCRETE_VALUE:
				return getConcreteValue();
			case HybridPackage.RIGHT_PATTERN__REFERENCE:
				if (resolve) return getReference();
				return basicGetReference();
			case HybridPackage.RIGHT_PATTERN__RULE:
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
			case HybridPackage.RIGHT_PATTERN__BINDING:
				setBinding((Binding)newValue);
				return;
			case HybridPackage.RIGHT_PATTERN__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends Source>)newValue);
				return;
			case HybridPackage.RIGHT_PATTERN__OPERATION:
				setOperation((Operation)newValue);
				return;
			case HybridPackage.RIGHT_PATTERN__CONCRETE_VALUE:
				setConcreteValue((String)newValue);
				return;
			case HybridPackage.RIGHT_PATTERN__REFERENCE:
				setReference((RuleElement)newValue);
				return;
			case HybridPackage.RIGHT_PATTERN__RULE:
				getRule().clear();
				getRule().addAll((Collection<? extends Rule>)newValue);
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
			case HybridPackage.RIGHT_PATTERN__BINDING:
				setBinding((Binding)null);
				return;
			case HybridPackage.RIGHT_PATTERN__SOURCE:
				getSource().clear();
				return;
			case HybridPackage.RIGHT_PATTERN__OPERATION:
				setOperation((Operation)null);
				return;
			case HybridPackage.RIGHT_PATTERN__CONCRETE_VALUE:
				setConcreteValue(CONCRETE_VALUE_EDEFAULT);
				return;
			case HybridPackage.RIGHT_PATTERN__REFERENCE:
				setReference((RuleElement)null);
				return;
			case HybridPackage.RIGHT_PATTERN__RULE:
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
			case HybridPackage.RIGHT_PATTERN__BINDING:
				return getBinding() != null;
			case HybridPackage.RIGHT_PATTERN__SOURCE:
				return source != null && !source.isEmpty();
			case HybridPackage.RIGHT_PATTERN__OPERATION:
				return operation != null;
			case HybridPackage.RIGHT_PATTERN__CONCRETE_VALUE:
				return CONCRETE_VALUE_EDEFAULT == null ? concreteValue != null : !CONCRETE_VALUE_EDEFAULT.equals(concreteValue);
			case HybridPackage.RIGHT_PATTERN__REFERENCE:
				return reference != null;
			case HybridPackage.RIGHT_PATTERN__RULE:
				return rule != null && !rule.isEmpty();
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
		result.append(" (concreteValue: ");
		result.append(concreteValue);
		result.append(')');
		return result.toString();
	}

} //RightPatternImpl
