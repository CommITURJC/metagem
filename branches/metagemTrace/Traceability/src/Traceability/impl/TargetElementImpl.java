/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Traceability.impl;

import Traceability.Element;
import Traceability.TargetElement;
import Traceability.TraceLink;
import Traceability.TraceabilityPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Target Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Traceability.impl.TargetElementImpl#getTarget_traceLinks <em>Target trace Links</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TargetElementImpl extends TraceElementImpl implements TargetElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TargetElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TraceabilityPackage.Literals.TARGET_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceLink getTarget_traceLinks() {
		if (eContainerFeatureID() != TraceabilityPackage.TARGET_ELEMENT__TARGET_TRACE_LINKS) return null;
		return (TraceLink)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget_traceLinks(TraceLink newTarget_traceLinks, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTarget_traceLinks, TraceabilityPackage.TARGET_ELEMENT__TARGET_TRACE_LINKS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget_traceLinks(TraceLink newTarget_traceLinks) {
		if (newTarget_traceLinks != eInternalContainer() || (eContainerFeatureID() != TraceabilityPackage.TARGET_ELEMENT__TARGET_TRACE_LINKS && newTarget_traceLinks != null)) {
			if (EcoreUtil.isAncestor(this, newTarget_traceLinks))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTarget_traceLinks != null)
				msgs = ((InternalEObject)newTarget_traceLinks).eInverseAdd(this, TraceabilityPackage.TRACE_LINK__TARGET, TraceLink.class, msgs);
			msgs = basicSetTarget_traceLinks(newTarget_traceLinks, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraceabilityPackage.TARGET_ELEMENT__TARGET_TRACE_LINKS, newTarget_traceLinks, newTarget_traceLinks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TraceabilityPackage.TARGET_ELEMENT__TARGET_TRACE_LINKS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTarget_traceLinks((TraceLink)otherEnd, msgs);
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
			case TraceabilityPackage.TARGET_ELEMENT__TARGET_TRACE_LINKS:
				return basicSetTarget_traceLinks(null, msgs);
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
			case TraceabilityPackage.TARGET_ELEMENT__TARGET_TRACE_LINKS:
				return eInternalContainer().eInverseRemove(this, TraceabilityPackage.TRACE_LINK__TARGET, TraceLink.class, msgs);
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
			case TraceabilityPackage.TARGET_ELEMENT__TARGET_TRACE_LINKS:
				return getTarget_traceLinks();
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
			case TraceabilityPackage.TARGET_ELEMENT__TARGET_TRACE_LINKS:
				setTarget_traceLinks((TraceLink)newValue);
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
			case TraceabilityPackage.TARGET_ELEMENT__TARGET_TRACE_LINKS:
				setTarget_traceLinks((TraceLink)null);
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
			case TraceabilityPackage.TARGET_ELEMENT__TARGET_TRACE_LINKS:
				return getTarget_traceLinks() != null;
		}
		return super.eIsSet(featureID);
	}

} //TargetElementImpl
