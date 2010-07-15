/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm_hybrid.impl;

import java.util.Collection;
import mm_hybrid.Condition;
import mm_hybrid.InMetaModel;
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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source Element Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mm_hybrid.impl.SourceElementRuleImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link mm_hybrid.impl.SourceElementRuleImpl#getMetamodel <em>Metamodel</em>}</li>
 *   <li>{@link mm_hybrid.impl.SourceElementRuleImpl#getRightPattern <em>Right Pattern</em>}</li>
 *   <li>{@link mm_hybrid.impl.SourceElementRuleImpl#getRule <em>Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SourceElementRuleImpl extends ElementImpl implements
		SourceElementRule {
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected EList<Condition> condition;

	/**
	 * The cached value of the '{@link #getMetamodel() <em>Metamodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetamodel()
	 * @generated
	 * @ordered
	 */
	protected InMetaModel metamodel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceElementRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MM_HybridPackage.Literals.SOURCE_ELEMENT_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Condition> getCondition() {
		if (condition == null) {
			condition = new EObjectContainmentEList<Condition>(Condition.class,
					this, MM_HybridPackage.SOURCE_ELEMENT_RULE__CONDITION);
		}
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InMetaModel getMetamodel() {
		if (metamodel != null && metamodel.eIsProxy()) {
			InternalEObject oldMetamodel = (InternalEObject) metamodel;
			metamodel = (InMetaModel) eResolveProxy(oldMetamodel);
			if (metamodel != oldMetamodel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MM_HybridPackage.SOURCE_ELEMENT_RULE__METAMODEL,
							oldMetamodel, metamodel));
			}
		}
		return metamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InMetaModel basicGetMetamodel() {
		return metamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetamodel(InMetaModel newMetamodel,
			NotificationChain msgs) {
		InMetaModel oldMetamodel = metamodel;
		metamodel = newMetamodel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					MM_HybridPackage.SOURCE_ELEMENT_RULE__METAMODEL,
					oldMetamodel, newMetamodel);
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
	public void setMetamodel(InMetaModel newMetamodel) {
		if (newMetamodel != metamodel) {
			NotificationChain msgs = null;
			if (metamodel != null)
				msgs = ((InternalEObject) metamodel).eInverseRemove(this,
						MM_HybridPackage.IN_META_MODEL__ELEMENTS,
						InMetaModel.class, msgs);
			if (newMetamodel != null)
				msgs = ((InternalEObject) newMetamodel).eInverseAdd(this,
						MM_HybridPackage.IN_META_MODEL__ELEMENTS,
						InMetaModel.class, msgs);
			msgs = basicSetMetamodel(newMetamodel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MM_HybridPackage.SOURCE_ELEMENT_RULE__METAMODEL,
					newMetamodel, newMetamodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RightPattern getRightPattern() {
		if (eContainerFeatureID != MM_HybridPackage.SOURCE_ELEMENT_RULE__RIGHT_PATTERN)
			return null;
		return (RightPattern) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightPattern(RightPattern newRightPattern,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newRightPattern,
				MM_HybridPackage.SOURCE_ELEMENT_RULE__RIGHT_PATTERN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightPattern(RightPattern newRightPattern) {
		if (newRightPattern != eInternalContainer()
				|| (eContainerFeatureID != MM_HybridPackage.SOURCE_ELEMENT_RULE__RIGHT_PATTERN && newRightPattern != null)) {
			if (EcoreUtil.isAncestor(this, newRightPattern))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRightPattern != null)
				msgs = ((InternalEObject) newRightPattern).eInverseAdd(this,
						MM_HybridPackage.RIGHT_PATTERN__SOURCE_ELEMENT,
						RightPattern.class, msgs);
			msgs = basicSetRightPattern(newRightPattern, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MM_HybridPackage.SOURCE_ELEMENT_RULE__RIGHT_PATTERN,
					newRightPattern, newRightPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule getRule() {
		if (eContainerFeatureID != MM_HybridPackage.SOURCE_ELEMENT_RULE__RULE)
			return null;
		return (Rule) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRule(Rule newRule, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newRule,
				MM_HybridPackage.SOURCE_ELEMENT_RULE__RULE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRule(Rule newRule) {
		if (newRule != eInternalContainer()
				|| (eContainerFeatureID != MM_HybridPackage.SOURCE_ELEMENT_RULE__RULE && newRule != null)) {
			if (EcoreUtil.isAncestor(this, newRule))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRule != null)
				msgs = ((InternalEObject) newRule).eInverseAdd(this,
						MM_HybridPackage.RULE__IN, Rule.class, msgs);
			msgs = basicSetRule(newRule, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MM_HybridPackage.SOURCE_ELEMENT_RULE__RULE, newRule,
					newRule));
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
		case MM_HybridPackage.SOURCE_ELEMENT_RULE__METAMODEL:
			if (metamodel != null)
				msgs = ((InternalEObject) metamodel).eInverseRemove(this,
						MM_HybridPackage.IN_META_MODEL__ELEMENTS,
						InMetaModel.class, msgs);
			return basicSetMetamodel((InMetaModel) otherEnd, msgs);
		case MM_HybridPackage.SOURCE_ELEMENT_RULE__RIGHT_PATTERN:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetRightPattern((RightPattern) otherEnd, msgs);
		case MM_HybridPackage.SOURCE_ELEMENT_RULE__RULE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetRule((Rule) otherEnd, msgs);
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
		case MM_HybridPackage.SOURCE_ELEMENT_RULE__CONDITION:
			return ((InternalEList<?>) getCondition()).basicRemove(otherEnd,
					msgs);
		case MM_HybridPackage.SOURCE_ELEMENT_RULE__METAMODEL:
			return basicSetMetamodel(null, msgs);
		case MM_HybridPackage.SOURCE_ELEMENT_RULE__RIGHT_PATTERN:
			return basicSetRightPattern(null, msgs);
		case MM_HybridPackage.SOURCE_ELEMENT_RULE__RULE:
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
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID) {
		case MM_HybridPackage.SOURCE_ELEMENT_RULE__RIGHT_PATTERN:
			return eInternalContainer().eInverseRemove(this,
					MM_HybridPackage.RIGHT_PATTERN__SOURCE_ELEMENT,
					RightPattern.class, msgs);
		case MM_HybridPackage.SOURCE_ELEMENT_RULE__RULE:
			return eInternalContainer().eInverseRemove(this,
					MM_HybridPackage.RULE__IN, Rule.class, msgs);
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
		case MM_HybridPackage.SOURCE_ELEMENT_RULE__CONDITION:
			return getCondition();
		case MM_HybridPackage.SOURCE_ELEMENT_RULE__METAMODEL:
			if (resolve)
				return getMetamodel();
			return basicGetMetamodel();
		case MM_HybridPackage.SOURCE_ELEMENT_RULE__RIGHT_PATTERN:
			return getRightPattern();
		case MM_HybridPackage.SOURCE_ELEMENT_RULE__RULE:
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
		case MM_HybridPackage.SOURCE_ELEMENT_RULE__CONDITION:
			getCondition().clear();
			getCondition().addAll((Collection<? extends Condition>) newValue);
			return;
		case MM_HybridPackage.SOURCE_ELEMENT_RULE__METAMODEL:
			setMetamodel((InMetaModel) newValue);
			return;
		case MM_HybridPackage.SOURCE_ELEMENT_RULE__RIGHT_PATTERN:
			setRightPattern((RightPattern) newValue);
			return;
		case MM_HybridPackage.SOURCE_ELEMENT_RULE__RULE:
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
		case MM_HybridPackage.SOURCE_ELEMENT_RULE__CONDITION:
			getCondition().clear();
			return;
		case MM_HybridPackage.SOURCE_ELEMENT_RULE__METAMODEL:
			setMetamodel((InMetaModel) null);
			return;
		case MM_HybridPackage.SOURCE_ELEMENT_RULE__RIGHT_PATTERN:
			setRightPattern((RightPattern) null);
			return;
		case MM_HybridPackage.SOURCE_ELEMENT_RULE__RULE:
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
		case MM_HybridPackage.SOURCE_ELEMENT_RULE__CONDITION:
			return condition != null && !condition.isEmpty();
		case MM_HybridPackage.SOURCE_ELEMENT_RULE__METAMODEL:
			return metamodel != null;
		case MM_HybridPackage.SOURCE_ELEMENT_RULE__RIGHT_PATTERN:
			return getRightPattern() != null;
		case MM_HybridPackage.SOURCE_ELEMENT_RULE__RULE:
			return getRule() != null;
		}
		return super.eIsSet(featureID);
	}

} //SourceElementRuleImpl
