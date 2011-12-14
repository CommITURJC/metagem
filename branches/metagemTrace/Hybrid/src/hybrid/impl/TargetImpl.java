/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hybrid.impl;

import hybrid.Binding;
import hybrid.HybridPackage;
import hybrid.LeftPattern;
import hybrid.RightPattern;
import hybrid.Rule;
import hybrid.Target;

import hybrid.TraceLink;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hybrid.impl.TargetImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link hybrid.impl.TargetImpl#getBindings <em>Bindings</em>}</li>
 *   <li>{@link hybrid.impl.TargetImpl#getLeftPatternOwned <em>Left Pattern Owned</em>}</li>
 *   <li>{@link hybrid.impl.TargetImpl#getTraceLink <em>Trace Link</em>}</li>
 *   <li>{@link hybrid.impl.TargetImpl#getIsRefered <em>Is Refered</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TargetImpl extends RuleElementImpl implements Target {
	/**
	 * The cached value of the '{@link #getBindings() <em>Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<Binding> bindings;

	/**
	 * The cached value of the '{@link #getTraceLink() <em>Trace Link</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceLink()
	 * @generated
	 * @ordered
	 */
	protected EList<TraceLink> traceLink;

	/**
	 * The cached value of the '{@link #getIsRefered() <em>Is Refered</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsRefered()
	 * @generated
	 * @ordered
	 */
	protected EList<RightPattern> isRefered;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TargetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HybridPackage.Literals.TARGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule getRule() {
		if (eContainerFeatureID() != HybridPackage.TARGET__RULE) return null;
		return (Rule)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRule(Rule newRule, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRule, HybridPackage.TARGET__RULE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRule(Rule newRule) {
		if (newRule != eInternalContainer() || (eContainerFeatureID() != HybridPackage.TARGET__RULE && newRule != null)) {
			if (EcoreUtil.isAncestor(this, newRule))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRule != null)
				msgs = ((InternalEObject)newRule).eInverseAdd(this, HybridPackage.RULE__TARGETS, Rule.class, msgs);
			msgs = basicSetRule(newRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HybridPackage.TARGET__RULE, newRule, newRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Binding> getBindings() {
		if (bindings == null) {
			bindings = new EObjectContainmentWithInverseEList<Binding>(Binding.class, this, HybridPackage.TARGET__BINDINGS, HybridPackage.BINDING__OWNED);
		}
		return bindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeftPattern getLeftPatternOwned() {
		if (eContainerFeatureID() != HybridPackage.TARGET__LEFT_PATTERN_OWNED) return null;
		return (LeftPattern)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftPatternOwned(LeftPattern newLeftPatternOwned, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLeftPatternOwned, HybridPackage.TARGET__LEFT_PATTERN_OWNED, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftPatternOwned(LeftPattern newLeftPatternOwned) {
		if (newLeftPatternOwned != eInternalContainer() || (eContainerFeatureID() != HybridPackage.TARGET__LEFT_PATTERN_OWNED && newLeftPatternOwned != null)) {
			if (EcoreUtil.isAncestor(this, newLeftPatternOwned))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLeftPatternOwned != null)
				msgs = ((InternalEObject)newLeftPatternOwned).eInverseAdd(this, HybridPackage.LEFT_PATTERN__TARGET, LeftPattern.class, msgs);
			msgs = basicSetLeftPatternOwned(newLeftPatternOwned, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HybridPackage.TARGET__LEFT_PATTERN_OWNED, newLeftPatternOwned, newLeftPatternOwned));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TraceLink> getTraceLink() {
		if (traceLink == null) {
			traceLink = new EObjectWithInverseResolvingEList.ManyInverse<TraceLink>(TraceLink.class, this, HybridPackage.TARGET__TRACE_LINK, HybridPackage.TRACE_LINK__TARGET);
		}
		return traceLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RightPattern> getIsRefered() {
		if (isRefered == null) {
			isRefered = new EObjectWithInverseResolvingEList<RightPattern>(RightPattern.class, this, HybridPackage.TARGET__IS_REFERED, HybridPackage.RIGHT_PATTERN__REFERENCE);
		}
		return isRefered;
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
			case HybridPackage.TARGET__RULE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRule((Rule)otherEnd, msgs);
			case HybridPackage.TARGET__BINDINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBindings()).basicAdd(otherEnd, msgs);
			case HybridPackage.TARGET__LEFT_PATTERN_OWNED:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLeftPatternOwned((LeftPattern)otherEnd, msgs);
			case HybridPackage.TARGET__TRACE_LINK:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTraceLink()).basicAdd(otherEnd, msgs);
			case HybridPackage.TARGET__IS_REFERED:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsRefered()).basicAdd(otherEnd, msgs);
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
			case HybridPackage.TARGET__RULE:
				return basicSetRule(null, msgs);
			case HybridPackage.TARGET__BINDINGS:
				return ((InternalEList<?>)getBindings()).basicRemove(otherEnd, msgs);
			case HybridPackage.TARGET__LEFT_PATTERN_OWNED:
				return basicSetLeftPatternOwned(null, msgs);
			case HybridPackage.TARGET__TRACE_LINK:
				return ((InternalEList<?>)getTraceLink()).basicRemove(otherEnd, msgs);
			case HybridPackage.TARGET__IS_REFERED:
				return ((InternalEList<?>)getIsRefered()).basicRemove(otherEnd, msgs);
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
			case HybridPackage.TARGET__RULE:
				return eInternalContainer().eInverseRemove(this, HybridPackage.RULE__TARGETS, Rule.class, msgs);
			case HybridPackage.TARGET__LEFT_PATTERN_OWNED:
				return eInternalContainer().eInverseRemove(this, HybridPackage.LEFT_PATTERN__TARGET, LeftPattern.class, msgs);
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
			case HybridPackage.TARGET__RULE:
				return getRule();
			case HybridPackage.TARGET__BINDINGS:
				return getBindings();
			case HybridPackage.TARGET__LEFT_PATTERN_OWNED:
				return getLeftPatternOwned();
			case HybridPackage.TARGET__TRACE_LINK:
				return getTraceLink();
			case HybridPackage.TARGET__IS_REFERED:
				return getIsRefered();
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
			case HybridPackage.TARGET__RULE:
				setRule((Rule)newValue);
				return;
			case HybridPackage.TARGET__BINDINGS:
				getBindings().clear();
				getBindings().addAll((Collection<? extends Binding>)newValue);
				return;
			case HybridPackage.TARGET__LEFT_PATTERN_OWNED:
				setLeftPatternOwned((LeftPattern)newValue);
				return;
			case HybridPackage.TARGET__TRACE_LINK:
				getTraceLink().clear();
				getTraceLink().addAll((Collection<? extends TraceLink>)newValue);
				return;
			case HybridPackage.TARGET__IS_REFERED:
				getIsRefered().clear();
				getIsRefered().addAll((Collection<? extends RightPattern>)newValue);
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
			case HybridPackage.TARGET__RULE:
				setRule((Rule)null);
				return;
			case HybridPackage.TARGET__BINDINGS:
				getBindings().clear();
				return;
			case HybridPackage.TARGET__LEFT_PATTERN_OWNED:
				setLeftPatternOwned((LeftPattern)null);
				return;
			case HybridPackage.TARGET__TRACE_LINK:
				getTraceLink().clear();
				return;
			case HybridPackage.TARGET__IS_REFERED:
				getIsRefered().clear();
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
			case HybridPackage.TARGET__RULE:
				return getRule() != null;
			case HybridPackage.TARGET__BINDINGS:
				return bindings != null && !bindings.isEmpty();
			case HybridPackage.TARGET__LEFT_PATTERN_OWNED:
				return getLeftPatternOwned() != null;
			case HybridPackage.TARGET__TRACE_LINK:
				return traceLink != null && !traceLink.isEmpty();
			case HybridPackage.TARGET__IS_REFERED:
				return isRefered != null && !isRefered.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TargetImpl
