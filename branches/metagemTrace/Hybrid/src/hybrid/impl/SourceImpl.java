/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hybrid.impl;

import hybrid.HybridPackage;
import hybrid.RightPattern;
import hybrid.Rule;
import hybrid.Source;

import hybrid.TraceLink;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hybrid.impl.SourceImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link hybrid.impl.SourceImpl#getRightPatternOwned <em>Right Pattern Owned</em>}</li>
 *   <li>{@link hybrid.impl.SourceImpl#getTraceLink <em>Trace Link</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SourceImpl extends RuleElementImpl implements Source {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HybridPackage.Literals.SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule getRule() {
		if (eContainerFeatureID() != HybridPackage.SOURCE__RULE) return null;
		return (Rule)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRule(Rule newRule, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRule, HybridPackage.SOURCE__RULE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRule(Rule newRule) {
		if (newRule != eInternalContainer() || (eContainerFeatureID() != HybridPackage.SOURCE__RULE && newRule != null)) {
			if (EcoreUtil.isAncestor(this, newRule))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRule != null)
				msgs = ((InternalEObject)newRule).eInverseAdd(this, HybridPackage.RULE__SOURCES, Rule.class, msgs);
			msgs = basicSetRule(newRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HybridPackage.SOURCE__RULE, newRule, newRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RightPattern getRightPatternOwned() {
		if (eContainerFeatureID() != HybridPackage.SOURCE__RIGHT_PATTERN_OWNED) return null;
		return (RightPattern)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightPatternOwned(RightPattern newRightPatternOwned, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRightPatternOwned, HybridPackage.SOURCE__RIGHT_PATTERN_OWNED, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightPatternOwned(RightPattern newRightPatternOwned) {
		if (newRightPatternOwned != eInternalContainer() || (eContainerFeatureID() != HybridPackage.SOURCE__RIGHT_PATTERN_OWNED && newRightPatternOwned != null)) {
			if (EcoreUtil.isAncestor(this, newRightPatternOwned))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRightPatternOwned != null)
				msgs = ((InternalEObject)newRightPatternOwned).eInverseAdd(this, HybridPackage.RIGHT_PATTERN__SOURCE, RightPattern.class, msgs);
			msgs = basicSetRightPatternOwned(newRightPatternOwned, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HybridPackage.SOURCE__RIGHT_PATTERN_OWNED, newRightPatternOwned, newRightPatternOwned));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TraceLink> getTraceLink() {
		if (traceLink == null) {
			traceLink = new EObjectWithInverseResolvingEList.ManyInverse<TraceLink>(TraceLink.class, this, HybridPackage.SOURCE__TRACE_LINK, HybridPackage.TRACE_LINK__SOURCE);
		}
		return traceLink;
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
			case HybridPackage.SOURCE__RULE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRule((Rule)otherEnd, msgs);
			case HybridPackage.SOURCE__RIGHT_PATTERN_OWNED:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRightPatternOwned((RightPattern)otherEnd, msgs);
			case HybridPackage.SOURCE__TRACE_LINK:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTraceLink()).basicAdd(otherEnd, msgs);
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
			case HybridPackage.SOURCE__RULE:
				return basicSetRule(null, msgs);
			case HybridPackage.SOURCE__RIGHT_PATTERN_OWNED:
				return basicSetRightPatternOwned(null, msgs);
			case HybridPackage.SOURCE__TRACE_LINK:
				return ((InternalEList<?>)getTraceLink()).basicRemove(otherEnd, msgs);
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
			case HybridPackage.SOURCE__RULE:
				return eInternalContainer().eInverseRemove(this, HybridPackage.RULE__SOURCES, Rule.class, msgs);
			case HybridPackage.SOURCE__RIGHT_PATTERN_OWNED:
				return eInternalContainer().eInverseRemove(this, HybridPackage.RIGHT_PATTERN__SOURCE, RightPattern.class, msgs);
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
			case HybridPackage.SOURCE__RULE:
				return getRule();
			case HybridPackage.SOURCE__RIGHT_PATTERN_OWNED:
				return getRightPatternOwned();
			case HybridPackage.SOURCE__TRACE_LINK:
				return getTraceLink();
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
			case HybridPackage.SOURCE__RULE:
				setRule((Rule)newValue);
				return;
			case HybridPackage.SOURCE__RIGHT_PATTERN_OWNED:
				setRightPatternOwned((RightPattern)newValue);
				return;
			case HybridPackage.SOURCE__TRACE_LINK:
				getTraceLink().clear();
				getTraceLink().addAll((Collection<? extends TraceLink>)newValue);
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
			case HybridPackage.SOURCE__RULE:
				setRule((Rule)null);
				return;
			case HybridPackage.SOURCE__RIGHT_PATTERN_OWNED:
				setRightPatternOwned((RightPattern)null);
				return;
			case HybridPackage.SOURCE__TRACE_LINK:
				getTraceLink().clear();
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
			case HybridPackage.SOURCE__RULE:
				return getRule() != null;
			case HybridPackage.SOURCE__RIGHT_PATTERN_OWNED:
				return getRightPatternOwned() != null;
			case HybridPackage.SOURCE__TRACE_LINK:
				return traceLink != null && !traceLink.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SourceImpl
