/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Traceability.impl;

import Traceability.Model;
import Traceability.TraceElement;
import Traceability.TraceabilityPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trace Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Traceability.impl.TraceElementImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link Traceability.impl.TraceElementImpl#getModel <em>Model</em>}</li>
 *   <li>{@link Traceability.impl.TraceElementImpl#getBelongsTo <em>Belongs To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TraceElementImpl extends ElementImpl implements TraceElement {
	/**
	 * The default value of the '{@link #getRef() <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected static final String REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRef() <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected String ref = REF_EDEFAULT;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected Model model;

	/**
	 * The cached value of the '{@link #getBelongsTo() <em>Belongs To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBelongsTo()
	 * @generated
	 * @ordered
	 */
	protected TraceElement belongsTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraceElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TraceabilityPackage.Literals.TRACE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRef() {
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRef(String newRef) {
		String oldRef = ref;
		ref = newRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraceabilityPackage.TRACE_ELEMENT__REF, oldRef, ref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model getModel() {
		if (model != null && model.eIsProxy()) {
			InternalEObject oldModel = (InternalEObject)model;
			model = (Model)eResolveProxy(oldModel);
			if (model != oldModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TraceabilityPackage.TRACE_ELEMENT__MODEL, oldModel, model));
			}
		}
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model basicGetModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(Model newModel) {
		Model oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraceabilityPackage.TRACE_ELEMENT__MODEL, oldModel, model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceElement getBelongsTo() {
		if (belongsTo != null && belongsTo.eIsProxy()) {
			InternalEObject oldBelongsTo = (InternalEObject)belongsTo;
			belongsTo = (TraceElement)eResolveProxy(oldBelongsTo);
			if (belongsTo != oldBelongsTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TraceabilityPackage.TRACE_ELEMENT__BELONGS_TO, oldBelongsTo, belongsTo));
			}
		}
		return belongsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceElement basicGetBelongsTo() {
		return belongsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBelongsTo(TraceElement newBelongsTo) {
		TraceElement oldBelongsTo = belongsTo;
		belongsTo = newBelongsTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraceabilityPackage.TRACE_ELEMENT__BELONGS_TO, oldBelongsTo, belongsTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TraceabilityPackage.TRACE_ELEMENT__REF:
				return getRef();
			case TraceabilityPackage.TRACE_ELEMENT__MODEL:
				if (resolve) return getModel();
				return basicGetModel();
			case TraceabilityPackage.TRACE_ELEMENT__BELONGS_TO:
				if (resolve) return getBelongsTo();
				return basicGetBelongsTo();
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
			case TraceabilityPackage.TRACE_ELEMENT__REF:
				setRef((String)newValue);
				return;
			case TraceabilityPackage.TRACE_ELEMENT__MODEL:
				setModel((Model)newValue);
				return;
			case TraceabilityPackage.TRACE_ELEMENT__BELONGS_TO:
				setBelongsTo((TraceElement)newValue);
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
			case TraceabilityPackage.TRACE_ELEMENT__REF:
				setRef(REF_EDEFAULT);
				return;
			case TraceabilityPackage.TRACE_ELEMENT__MODEL:
				setModel((Model)null);
				return;
			case TraceabilityPackage.TRACE_ELEMENT__BELONGS_TO:
				setBelongsTo((TraceElement)null);
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
			case TraceabilityPackage.TRACE_ELEMENT__REF:
				return REF_EDEFAULT == null ? ref != null : !REF_EDEFAULT.equals(ref);
			case TraceabilityPackage.TRACE_ELEMENT__MODEL:
				return model != null;
			case TraceabilityPackage.TRACE_ELEMENT__BELONGS_TO:
				return belongsTo != null;
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
		result.append(" (ref: ");
		result.append(ref);
		result.append(')');
		return result.toString();
	}

} //TraceElementImpl
