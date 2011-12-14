/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Traceability.impl;

import Traceability.Element;
import Traceability.SourceElement;
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
 * An implementation of the model object '<em><b>Source Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Traceability.impl.SourceElementImpl#getSource_traceLinks <em>Source trace Links</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SourceElementImpl extends TraceElementImpl implements SourceElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TraceabilityPackage.Literals.SOURCE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceLink getSource_traceLinks() {
		if (eContainerFeatureID() != TraceabilityPackage.SOURCE_ELEMENT__SOURCE_TRACE_LINKS) return null;
		return (TraceLink)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource_traceLinks(TraceLink newSource_traceLinks, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSource_traceLinks, TraceabilityPackage.SOURCE_ELEMENT__SOURCE_TRACE_LINKS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource_traceLinks(TraceLink newSource_traceLinks) {
		if (newSource_traceLinks != eInternalContainer() || (eContainerFeatureID() != TraceabilityPackage.SOURCE_ELEMENT__SOURCE_TRACE_LINKS && newSource_traceLinks != null)) {
			if (EcoreUtil.isAncestor(this, newSource_traceLinks))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSource_traceLinks != null)
				msgs = ((InternalEObject)newSource_traceLinks).eInverseAdd(this, TraceabilityPackage.TRACE_LINK__SOURCE, TraceLink.class, msgs);
			msgs = basicSetSource_traceLinks(newSource_traceLinks, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraceabilityPackage.SOURCE_ELEMENT__SOURCE_TRACE_LINKS, newSource_traceLinks, newSource_traceLinks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TraceabilityPackage.SOURCE_ELEMENT__SOURCE_TRACE_LINKS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSource_traceLinks((TraceLink)otherEnd, msgs);
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
			case TraceabilityPackage.SOURCE_ELEMENT__SOURCE_TRACE_LINKS:
				return basicSetSource_traceLinks(null, msgs);
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
			case TraceabilityPackage.SOURCE_ELEMENT__SOURCE_TRACE_LINKS:
				return eInternalContainer().eInverseRemove(this, TraceabilityPackage.TRACE_LINK__SOURCE, TraceLink.class, msgs);
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
			case TraceabilityPackage.SOURCE_ELEMENT__SOURCE_TRACE_LINKS:
				return getSource_traceLinks();
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
			case TraceabilityPackage.SOURCE_ELEMENT__SOURCE_TRACE_LINKS:
				setSource_traceLinks((TraceLink)newValue);
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
			case TraceabilityPackage.SOURCE_ELEMENT__SOURCE_TRACE_LINKS:
				setSource_traceLinks((TraceLink)null);
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
			case TraceabilityPackage.SOURCE_ELEMENT__SOURCE_TRACE_LINKS:
				return getSource_traceLinks() != null;
		}
		return super.eIsSet(featureID);
	}

} //SourceElementImpl
