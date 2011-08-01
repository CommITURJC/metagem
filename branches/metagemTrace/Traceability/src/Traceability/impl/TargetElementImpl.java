/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Traceability.impl;

import Traceability.ModelElement;
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
 *   <li>{@link Traceability.impl.TargetElementImpl#getElementModel <em>Element Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TargetElementImpl extends TraceElementImpl implements TargetElement {
	/**
	 * The cached value of the '{@link #getElementModel() <em>Element Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementModel()
	 * @generated
	 * @ordered
	 */
	protected ModelElement elementModel;

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
	public ModelElement getElementModel() {
		if (elementModel != null && elementModel.eIsProxy()) {
			InternalEObject oldElementModel = (InternalEObject)elementModel;
			elementModel = (ModelElement)eResolveProxy(oldElementModel);
			if (elementModel != oldElementModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TraceabilityPackage.TARGET_ELEMENT__ELEMENT_MODEL, oldElementModel, elementModel));
			}
		}
		return elementModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelElement basicGetElementModel() {
		return elementModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElementModel(ModelElement newElementModel, NotificationChain msgs) {
		ModelElement oldElementModel = elementModel;
		elementModel = newElementModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TraceabilityPackage.TARGET_ELEMENT__ELEMENT_MODEL, oldElementModel, newElementModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementModel(ModelElement newElementModel) {
		if (newElementModel != elementModel) {
			NotificationChain msgs = null;
			if (elementModel != null)
				msgs = ((InternalEObject)elementModel).eInverseRemove(this, TraceabilityPackage.MODEL_ELEMENT__TARGET_ELEMENT_LINK, ModelElement.class, msgs);
			if (newElementModel != null)
				msgs = ((InternalEObject)newElementModel).eInverseAdd(this, TraceabilityPackage.MODEL_ELEMENT__TARGET_ELEMENT_LINK, ModelElement.class, msgs);
			msgs = basicSetElementModel(newElementModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraceabilityPackage.TARGET_ELEMENT__ELEMENT_MODEL, newElementModel, newElementModel));
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
			case TraceabilityPackage.TARGET_ELEMENT__ELEMENT_MODEL:
				if (elementModel != null)
					msgs = ((InternalEObject)elementModel).eInverseRemove(this, TraceabilityPackage.MODEL_ELEMENT__TARGET_ELEMENT_LINK, ModelElement.class, msgs);
				return basicSetElementModel((ModelElement)otherEnd, msgs);
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
			case TraceabilityPackage.TARGET_ELEMENT__ELEMENT_MODEL:
				return basicSetElementModel(null, msgs);
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
			case TraceabilityPackage.TARGET_ELEMENT__ELEMENT_MODEL:
				if (resolve) return getElementModel();
				return basicGetElementModel();
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
			case TraceabilityPackage.TARGET_ELEMENT__ELEMENT_MODEL:
				setElementModel((ModelElement)newValue);
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
			case TraceabilityPackage.TARGET_ELEMENT__ELEMENT_MODEL:
				setElementModel((ModelElement)null);
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
			case TraceabilityPackage.TARGET_ELEMENT__ELEMENT_MODEL:
				return elementModel != null;
		}
		return super.eIsSet(featureID);
	}

} //TargetElementImpl
