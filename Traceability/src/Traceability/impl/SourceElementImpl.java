/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Traceability.impl;

import Traceability.ModelElement;
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
 *   <li>{@link Traceability.impl.SourceElementImpl#getElementModel <em>Element Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SourceElementImpl extends TraceElementImpl implements SourceElement {
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
	public ModelElement getElementModel() {
		if (elementModel != null && elementModel.eIsProxy()) {
			InternalEObject oldElementModel = (InternalEObject)elementModel;
			elementModel = (ModelElement)eResolveProxy(oldElementModel);
			if (elementModel != oldElementModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TraceabilityPackage.SOURCE_ELEMENT__ELEMENT_MODEL, oldElementModel, elementModel));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TraceabilityPackage.SOURCE_ELEMENT__ELEMENT_MODEL, oldElementModel, newElementModel);
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
				msgs = ((InternalEObject)elementModel).eInverseRemove(this, TraceabilityPackage.MODEL_ELEMENT__SOURCE_ELEMENT_LINK, ModelElement.class, msgs);
			if (newElementModel != null)
				msgs = ((InternalEObject)newElementModel).eInverseAdd(this, TraceabilityPackage.MODEL_ELEMENT__SOURCE_ELEMENT_LINK, ModelElement.class, msgs);
			msgs = basicSetElementModel(newElementModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraceabilityPackage.SOURCE_ELEMENT__ELEMENT_MODEL, newElementModel, newElementModel));
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
			case TraceabilityPackage.SOURCE_ELEMENT__ELEMENT_MODEL:
				if (elementModel != null)
					msgs = ((InternalEObject)elementModel).eInverseRemove(this, TraceabilityPackage.MODEL_ELEMENT__SOURCE_ELEMENT_LINK, ModelElement.class, msgs);
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
			case TraceabilityPackage.SOURCE_ELEMENT__SOURCE_TRACE_LINKS:
				return basicSetSource_traceLinks(null, msgs);
			case TraceabilityPackage.SOURCE_ELEMENT__ELEMENT_MODEL:
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
			case TraceabilityPackage.SOURCE_ELEMENT__ELEMENT_MODEL:
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
			case TraceabilityPackage.SOURCE_ELEMENT__SOURCE_TRACE_LINKS:
				setSource_traceLinks((TraceLink)newValue);
				return;
			case TraceabilityPackage.SOURCE_ELEMENT__ELEMENT_MODEL:
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
			case TraceabilityPackage.SOURCE_ELEMENT__SOURCE_TRACE_LINKS:
				setSource_traceLinks((TraceLink)null);
				return;
			case TraceabilityPackage.SOURCE_ELEMENT__ELEMENT_MODEL:
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
			case TraceabilityPackage.SOURCE_ELEMENT__SOURCE_TRACE_LINKS:
				return getSource_traceLinks() != null;
			case TraceabilityPackage.SOURCE_ELEMENT__ELEMENT_MODEL:
				return elementModel != null;
		}
		return super.eIsSet(featureID);
	}

} //SourceElementImpl
