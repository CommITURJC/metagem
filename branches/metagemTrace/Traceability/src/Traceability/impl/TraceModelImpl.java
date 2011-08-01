/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Traceability.impl;

import Traceability.SourceModel;
import Traceability.TargetModel;
import Traceability.TraceLink;
import Traceability.TraceModel;
import Traceability.TraceabilityPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trace Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Traceability.impl.TraceModelImpl#getTraceLinks <em>Trace Links</em>}</li>
 *   <li>{@link Traceability.impl.TraceModelImpl#getSourceModels <em>Source Models</em>}</li>
 *   <li>{@link Traceability.impl.TraceModelImpl#getTargetModels <em>Target Models</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TraceModelImpl extends TraceElementImpl implements TraceModel {
	/**
	 * The cached value of the '{@link #getTraceLinks() <em>Trace Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<TraceLink> traceLinks;

	/**
	 * The cached value of the '{@link #getSourceModels() <em>Source Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceModels()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceModel> sourceModels;

	/**
	 * The cached value of the '{@link #getTargetModels() <em>Target Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetModels()
	 * @generated
	 * @ordered
	 */
	protected EList<TargetModel> targetModels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraceModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TraceabilityPackage.Literals.TRACE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TraceLink> getTraceLinks() {
		if (traceLinks == null) {
			traceLinks = new EObjectContainmentWithInverseEList<TraceLink>(TraceLink.class, this, TraceabilityPackage.TRACE_MODEL__TRACE_LINKS, TraceabilityPackage.TRACE_LINK__TRACE_MODEL);
		}
		return traceLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceModel> getSourceModels() {
		if (sourceModels == null) {
			sourceModels = new EObjectContainmentWithInverseEList<SourceModel>(SourceModel.class, this, TraceabilityPackage.TRACE_MODEL__SOURCE_MODELS, TraceabilityPackage.SOURCE_MODEL__TRACE_MODEL);
		}
		return sourceModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TargetModel> getTargetModels() {
		if (targetModels == null) {
			targetModels = new EObjectContainmentWithInverseEList<TargetModel>(TargetModel.class, this, TraceabilityPackage.TRACE_MODEL__TARGET_MODELS, TraceabilityPackage.TARGET_MODEL__TRACE_MODEL);
		}
		return targetModels;
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
			case TraceabilityPackage.TRACE_MODEL__TRACE_LINKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTraceLinks()).basicAdd(otherEnd, msgs);
			case TraceabilityPackage.TRACE_MODEL__SOURCE_MODELS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSourceModels()).basicAdd(otherEnd, msgs);
			case TraceabilityPackage.TRACE_MODEL__TARGET_MODELS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTargetModels()).basicAdd(otherEnd, msgs);
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
			case TraceabilityPackage.TRACE_MODEL__TRACE_LINKS:
				return ((InternalEList<?>)getTraceLinks()).basicRemove(otherEnd, msgs);
			case TraceabilityPackage.TRACE_MODEL__SOURCE_MODELS:
				return ((InternalEList<?>)getSourceModels()).basicRemove(otherEnd, msgs);
			case TraceabilityPackage.TRACE_MODEL__TARGET_MODELS:
				return ((InternalEList<?>)getTargetModels()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TraceabilityPackage.TRACE_MODEL__TRACE_LINKS:
				return getTraceLinks();
			case TraceabilityPackage.TRACE_MODEL__SOURCE_MODELS:
				return getSourceModels();
			case TraceabilityPackage.TRACE_MODEL__TARGET_MODELS:
				return getTargetModels();
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
			case TraceabilityPackage.TRACE_MODEL__TRACE_LINKS:
				getTraceLinks().clear();
				getTraceLinks().addAll((Collection<? extends TraceLink>)newValue);
				return;
			case TraceabilityPackage.TRACE_MODEL__SOURCE_MODELS:
				getSourceModels().clear();
				getSourceModels().addAll((Collection<? extends SourceModel>)newValue);
				return;
			case TraceabilityPackage.TRACE_MODEL__TARGET_MODELS:
				getTargetModels().clear();
				getTargetModels().addAll((Collection<? extends TargetModel>)newValue);
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
			case TraceabilityPackage.TRACE_MODEL__TRACE_LINKS:
				getTraceLinks().clear();
				return;
			case TraceabilityPackage.TRACE_MODEL__SOURCE_MODELS:
				getSourceModels().clear();
				return;
			case TraceabilityPackage.TRACE_MODEL__TARGET_MODELS:
				getTargetModels().clear();
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
			case TraceabilityPackage.TRACE_MODEL__TRACE_LINKS:
				return traceLinks != null && !traceLinks.isEmpty();
			case TraceabilityPackage.TRACE_MODEL__SOURCE_MODELS:
				return sourceModels != null && !sourceModels.isEmpty();
			case TraceabilityPackage.TRACE_MODEL__TARGET_MODELS:
				return targetModels != null && !targetModels.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TraceModelImpl
