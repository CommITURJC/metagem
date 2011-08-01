/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Traceability.impl;

import Traceability.SourceModel;
import Traceability.TraceModel;
import Traceability.TraceabilityPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Traceability.impl.SourceModelImpl#getTraceModel <em>Trace Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SourceModelImpl extends ModelImpl implements SourceModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TraceabilityPackage.Literals.SOURCE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceModel getTraceModel() {
		if (eContainerFeatureID() != TraceabilityPackage.SOURCE_MODEL__TRACE_MODEL) return null;
		return (TraceModel)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTraceModel(TraceModel newTraceModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTraceModel, TraceabilityPackage.SOURCE_MODEL__TRACE_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTraceModel(TraceModel newTraceModel) {
		if (newTraceModel != eInternalContainer() || (eContainerFeatureID() != TraceabilityPackage.SOURCE_MODEL__TRACE_MODEL && newTraceModel != null)) {
			if (EcoreUtil.isAncestor(this, newTraceModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTraceModel != null)
				msgs = ((InternalEObject)newTraceModel).eInverseAdd(this, TraceabilityPackage.TRACE_MODEL__SOURCE_MODELS, TraceModel.class, msgs);
			msgs = basicSetTraceModel(newTraceModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraceabilityPackage.SOURCE_MODEL__TRACE_MODEL, newTraceModel, newTraceModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TraceabilityPackage.SOURCE_MODEL__TRACE_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTraceModel((TraceModel)otherEnd, msgs);
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
			case TraceabilityPackage.SOURCE_MODEL__TRACE_MODEL:
				return basicSetTraceModel(null, msgs);
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
			case TraceabilityPackage.SOURCE_MODEL__TRACE_MODEL:
				return eInternalContainer().eInverseRemove(this, TraceabilityPackage.TRACE_MODEL__SOURCE_MODELS, TraceModel.class, msgs);
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
			case TraceabilityPackage.SOURCE_MODEL__TRACE_MODEL:
				return getTraceModel();
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
			case TraceabilityPackage.SOURCE_MODEL__TRACE_MODEL:
				setTraceModel((TraceModel)newValue);
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
			case TraceabilityPackage.SOURCE_MODEL__TRACE_MODEL:
				setTraceModel((TraceModel)null);
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
			case TraceabilityPackage.SOURCE_MODEL__TRACE_MODEL:
				return getTraceModel() != null;
		}
		return super.eIsSet(featureID);
	}

} //SourceModelImpl
