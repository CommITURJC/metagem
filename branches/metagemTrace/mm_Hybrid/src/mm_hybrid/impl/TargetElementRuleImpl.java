/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm_hybrid.impl;

import java.util.Collection;
import mm_hybrid.ElementIncluded;
import mm_hybrid.LeftPattern;
import mm_hybrid.MM_HybridPackage;
import mm_hybrid.OutMetaModel;
import mm_hybrid.Rule;
import mm_hybrid.TargetElementRule;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
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
 *   <li>{@link mm_hybrid.impl.TargetElementRuleImpl#getLeftPattern <em>Left Pattern</em>}</li>
 *   <li>{@link mm_hybrid.impl.TargetElementRuleImpl#getRule <em>Rule</em>}</li>
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
	 * The cached value of the '{@link #getMetamodel() <em>Metamodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetamodel()
	 * @generated
	 * @ordered
	 */
	protected OutMetaModel metamodel;

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
			included = new EObjectContainmentWithInverseEList<ElementIncluded>(ElementIncluded.class, this, MM_HybridPackage.TARGET_ELEMENT_RULE__INCLUDED, MM_HybridPackage.ELEMENT_INCLUDED__TARGET_ELEMENT);
		}
		return included;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutMetaModel getMetamodel() {
		if (metamodel != null && metamodel.eIsProxy()) {
			InternalEObject oldMetamodel = (InternalEObject)metamodel;
			metamodel = (OutMetaModel)eResolveProxy(oldMetamodel);
			if (metamodel != oldMetamodel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MM_HybridPackage.TARGET_ELEMENT_RULE__METAMODEL, oldMetamodel, metamodel));
			}
		}
		return metamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutMetaModel basicGetMetamodel() {
		return metamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetamodel(OutMetaModel newMetamodel,
			NotificationChain msgs) {
		OutMetaModel oldMetamodel = metamodel;
		metamodel = newMetamodel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MM_HybridPackage.TARGET_ELEMENT_RULE__METAMODEL, oldMetamodel, newMetamodel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetamodel(OutMetaModel newMetamodel) {
		if (newMetamodel != metamodel) {
			NotificationChain msgs = null;
			if (metamodel != null)
				msgs = ((InternalEObject)metamodel).eInverseRemove(this, MM_HybridPackage.OUT_META_MODEL__ELEMENTS, OutMetaModel.class, msgs);
			if (newMetamodel != null)
				msgs = ((InternalEObject)newMetamodel).eInverseAdd(this, MM_HybridPackage.OUT_META_MODEL__ELEMENTS, OutMetaModel.class, msgs);
			msgs = basicSetMetamodel(newMetamodel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MM_HybridPackage.TARGET_ELEMENT_RULE__METAMODEL, newMetamodel, newMetamodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeftPattern getLeftPattern() {
		if (eContainerFeatureID() != MM_HybridPackage.TARGET_ELEMENT_RULE__LEFT_PATTERN) return null;
		return (LeftPattern)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftPattern(LeftPattern newLeftPattern,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLeftPattern, MM_HybridPackage.TARGET_ELEMENT_RULE__LEFT_PATTERN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftPattern(LeftPattern newLeftPattern) {
		if (newLeftPattern != eInternalContainer() || (eContainerFeatureID() != MM_HybridPackage.TARGET_ELEMENT_RULE__LEFT_PATTERN && newLeftPattern != null)) {
			if (EcoreUtil.isAncestor(this, newLeftPattern))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLeftPattern != null)
				msgs = ((InternalEObject)newLeftPattern).eInverseAdd(this, MM_HybridPackage.LEFT_PATTERN__TARGET_ELEMENT, LeftPattern.class, msgs);
			msgs = basicSetLeftPattern(newLeftPattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MM_HybridPackage.TARGET_ELEMENT_RULE__LEFT_PATTERN, newLeftPattern, newLeftPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule getRule() {
		if (eContainerFeatureID() != MM_HybridPackage.TARGET_ELEMENT_RULE__RULE) return null;
		return (Rule)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRule(Rule newRule, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRule, MM_HybridPackage.TARGET_ELEMENT_RULE__RULE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRule(Rule newRule) {
		if (newRule != eInternalContainer() || (eContainerFeatureID() != MM_HybridPackage.TARGET_ELEMENT_RULE__RULE && newRule != null)) {
			if (EcoreUtil.isAncestor(this, newRule))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRule != null)
				msgs = ((InternalEObject)newRule).eInverseAdd(this, MM_HybridPackage.RULE__OUT, Rule.class, msgs);
			msgs = basicSetRule(newRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MM_HybridPackage.TARGET_ELEMENT_RULE__RULE, newRule, newRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MM_HybridPackage.TARGET_ELEMENT_RULE__INCLUDED:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncluded()).basicAdd(otherEnd, msgs);
			case MM_HybridPackage.TARGET_ELEMENT_RULE__METAMODEL:
				if (metamodel != null)
					msgs = ((InternalEObject)metamodel).eInverseRemove(this, MM_HybridPackage.OUT_META_MODEL__ELEMENTS, OutMetaModel.class, msgs);
				return basicSetMetamodel((OutMetaModel)otherEnd, msgs);
			case MM_HybridPackage.TARGET_ELEMENT_RULE__LEFT_PATTERN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLeftPattern((LeftPattern)otherEnd, msgs);
			case MM_HybridPackage.TARGET_ELEMENT_RULE__RULE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRule((Rule)otherEnd, msgs);
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
				return ((InternalEList<?>)getIncluded()).basicRemove(otherEnd, msgs);
			case MM_HybridPackage.TARGET_ELEMENT_RULE__METAMODEL:
				return basicSetMetamodel(null, msgs);
			case MM_HybridPackage.TARGET_ELEMENT_RULE__LEFT_PATTERN:
				return basicSetLeftPattern(null, msgs);
			case MM_HybridPackage.TARGET_ELEMENT_RULE__RULE:
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
		switch (eContainerFeatureID()) {
			case MM_HybridPackage.TARGET_ELEMENT_RULE__LEFT_PATTERN:
				return eInternalContainer().eInverseRemove(this, MM_HybridPackage.LEFT_PATTERN__TARGET_ELEMENT, LeftPattern.class, msgs);
			case MM_HybridPackage.TARGET_ELEMENT_RULE__RULE:
				return eInternalContainer().eInverseRemove(this, MM_HybridPackage.RULE__OUT, Rule.class, msgs);
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
				if (resolve) return getMetamodel();
				return basicGetMetamodel();
			case MM_HybridPackage.TARGET_ELEMENT_RULE__LEFT_PATTERN:
				return getLeftPattern();
			case MM_HybridPackage.TARGET_ELEMENT_RULE__RULE:
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
			case MM_HybridPackage.TARGET_ELEMENT_RULE__INCLUDED:
				getIncluded().clear();
				getIncluded().addAll((Collection<? extends ElementIncluded>)newValue);
				return;
			case MM_HybridPackage.TARGET_ELEMENT_RULE__METAMODEL:
				setMetamodel((OutMetaModel)newValue);
				return;
			case MM_HybridPackage.TARGET_ELEMENT_RULE__LEFT_PATTERN:
				setLeftPattern((LeftPattern)newValue);
				return;
			case MM_HybridPackage.TARGET_ELEMENT_RULE__RULE:
				setRule((Rule)newValue);
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
				setMetamodel((OutMetaModel)null);
				return;
			case MM_HybridPackage.TARGET_ELEMENT_RULE__LEFT_PATTERN:
				setLeftPattern((LeftPattern)null);
				return;
			case MM_HybridPackage.TARGET_ELEMENT_RULE__RULE:
				setRule((Rule)null);
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
				return metamodel != null;
			case MM_HybridPackage.TARGET_ELEMENT_RULE__LEFT_PATTERN:
				return getLeftPattern() != null;
			case MM_HybridPackage.TARGET_ELEMENT_RULE__RULE:
				return getRule() != null;
		}
		return super.eIsSet(featureID);
	}

} //TargetElementRuleImpl
