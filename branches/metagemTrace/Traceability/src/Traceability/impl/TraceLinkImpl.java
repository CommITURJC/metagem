/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Traceability.impl;

import Traceability.Element;
import Traceability.Operations;
import Traceability.SourceElement;
import Traceability.TargetElement;
import Traceability.TraceLink;
import Traceability.TraceModel;
import Traceability.TraceabilityPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trace Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Traceability.impl.TraceLinkImpl#getTraceModel <em>Trace Model</em>}</li>
 *   <li>{@link Traceability.impl.TraceLinkImpl#getSource <em>Source</em>}</li>
 *   <li>{@link Traceability.impl.TraceLinkImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link Traceability.impl.TraceLinkImpl#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TraceLinkImpl extends TraceElementImpl implements TraceLink {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceElement> source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<TargetElement> target;

	/**
	 * The default value of the '{@link #getOperation() <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected static final Operations OPERATION_EDEFAULT = Operations.TRANSFORM;

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected Operations operation = OPERATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraceLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TraceabilityPackage.Literals.TRACE_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceModel getTraceModel() {
		if (eContainerFeatureID() != TraceabilityPackage.TRACE_LINK__TRACE_MODEL) return null;
		return (TraceModel)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTraceModel(TraceModel newTraceModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTraceModel, TraceabilityPackage.TRACE_LINK__TRACE_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTraceModel(TraceModel newTraceModel) {
		if (newTraceModel != eInternalContainer() || (eContainerFeatureID() != TraceabilityPackage.TRACE_LINK__TRACE_MODEL && newTraceModel != null)) {
			if (EcoreUtil.isAncestor(this, newTraceModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTraceModel != null)
				msgs = ((InternalEObject)newTraceModel).eInverseAdd(this, TraceabilityPackage.TRACE_MODEL__TRACE_LINKS, TraceModel.class, msgs);
			msgs = basicSetTraceModel(newTraceModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraceabilityPackage.TRACE_LINK__TRACE_MODEL, newTraceModel, newTraceModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceElement> getSource() {
		if (source == null) {
			source = new EObjectContainmentWithInverseEList<SourceElement>(SourceElement.class, this, TraceabilityPackage.TRACE_LINK__SOURCE, TraceabilityPackage.SOURCE_ELEMENT__SOURCE_TRACE_LINKS);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TargetElement> getTarget() {
		if (target == null) {
			target = new EObjectContainmentWithInverseEList<TargetElement>(TargetElement.class, this, TraceabilityPackage.TRACE_LINK__TARGET, TraceabilityPackage.TARGET_ELEMENT__TARGET_TRACE_LINKS);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operations getOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation(Operations newOperation) {
		Operations oldOperation = operation;
		operation = newOperation == null ? OPERATION_EDEFAULT : newOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraceabilityPackage.TRACE_LINK__OPERATION, oldOperation, operation));
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
			case TraceabilityPackage.TRACE_LINK__TRACE_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTraceModel((TraceModel)otherEnd, msgs);
			case TraceabilityPackage.TRACE_LINK__SOURCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSource()).basicAdd(otherEnd, msgs);
			case TraceabilityPackage.TRACE_LINK__TARGET:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTarget()).basicAdd(otherEnd, msgs);
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
			case TraceabilityPackage.TRACE_LINK__TRACE_MODEL:
				return basicSetTraceModel(null, msgs);
			case TraceabilityPackage.TRACE_LINK__SOURCE:
				return ((InternalEList<?>)getSource()).basicRemove(otherEnd, msgs);
			case TraceabilityPackage.TRACE_LINK__TARGET:
				return ((InternalEList<?>)getTarget()).basicRemove(otherEnd, msgs);
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
			case TraceabilityPackage.TRACE_LINK__TRACE_MODEL:
				return eInternalContainer().eInverseRemove(this, TraceabilityPackage.TRACE_MODEL__TRACE_LINKS, TraceModel.class, msgs);
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
			case TraceabilityPackage.TRACE_LINK__TRACE_MODEL:
				return getTraceModel();
			case TraceabilityPackage.TRACE_LINK__SOURCE:
				return getSource();
			case TraceabilityPackage.TRACE_LINK__TARGET:
				return getTarget();
			case TraceabilityPackage.TRACE_LINK__OPERATION:
				return getOperation();
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
			case TraceabilityPackage.TRACE_LINK__TRACE_MODEL:
				setTraceModel((TraceModel)newValue);
				return;
			case TraceabilityPackage.TRACE_LINK__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends SourceElement>)newValue);
				return;
			case TraceabilityPackage.TRACE_LINK__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends TargetElement>)newValue);
				return;
			case TraceabilityPackage.TRACE_LINK__OPERATION:
				setOperation((Operations)newValue);
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
			case TraceabilityPackage.TRACE_LINK__TRACE_MODEL:
				setTraceModel((TraceModel)null);
				return;
			case TraceabilityPackage.TRACE_LINK__SOURCE:
				getSource().clear();
				return;
			case TraceabilityPackage.TRACE_LINK__TARGET:
				getTarget().clear();
				return;
			case TraceabilityPackage.TRACE_LINK__OPERATION:
				setOperation(OPERATION_EDEFAULT);
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
			case TraceabilityPackage.TRACE_LINK__TRACE_MODEL:
				return getTraceModel() != null;
			case TraceabilityPackage.TRACE_LINK__SOURCE:
				return source != null && !source.isEmpty();
			case TraceabilityPackage.TRACE_LINK__TARGET:
				return target != null && !target.isEmpty();
			case TraceabilityPackage.TRACE_LINK__OPERATION:
				return operation != OPERATION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (operation: ");
		result.append(operation);
		result.append(')');
		return result.toString();
	}

} //TraceLinkImpl
