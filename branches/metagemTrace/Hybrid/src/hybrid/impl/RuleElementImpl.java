/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hybrid.impl;

import hybrid.HybridPackage;
import hybrid.Model;
import hybrid.RightPattern;
import hybrid.RuleElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hybrid.impl.RuleElementImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link hybrid.impl.RuleElementImpl#getBelongsTo <em>Belongs To</em>}</li>
 *   <li>{@link hybrid.impl.RuleElementImpl#getOwns <em>Owns</em>}</li>
 *   <li>{@link hybrid.impl.RuleElementImpl#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RuleElementImpl extends HybridElementImpl implements RuleElement {
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
	 * The cached value of the '{@link #getBelongsTo() <em>Belongs To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBelongsTo()
	 * @generated
	 * @ordered
	 */
	protected RuleElement belongsTo;

	/**
	 * The cached value of the '{@link #getOwns() <em>Owns</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwns()
	 * @generated
	 * @ordered
	 */
	protected EList<RuleElement> owns;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HybridPackage.Literals.RULE_ELEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, HybridPackage.RULE_ELEMENT__REF, oldRef, ref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleElement getBelongsTo() {
		if (belongsTo != null && belongsTo.eIsProxy()) {
			InternalEObject oldBelongsTo = (InternalEObject)belongsTo;
			belongsTo = (RuleElement)eResolveProxy(oldBelongsTo);
			if (belongsTo != oldBelongsTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HybridPackage.RULE_ELEMENT__BELONGS_TO, oldBelongsTo, belongsTo));
			}
		}
		return belongsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleElement basicGetBelongsTo() {
		return belongsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBelongsTo(RuleElement newBelongsTo, NotificationChain msgs) {
		RuleElement oldBelongsTo = belongsTo;
		belongsTo = newBelongsTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HybridPackage.RULE_ELEMENT__BELONGS_TO, oldBelongsTo, newBelongsTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBelongsTo(RuleElement newBelongsTo) {
		if (newBelongsTo != belongsTo) {
			NotificationChain msgs = null;
			if (belongsTo != null)
				msgs = ((InternalEObject)belongsTo).eInverseRemove(this, HybridPackage.RULE_ELEMENT__OWNS, RuleElement.class, msgs);
			if (newBelongsTo != null)
				msgs = ((InternalEObject)newBelongsTo).eInverseAdd(this, HybridPackage.RULE_ELEMENT__OWNS, RuleElement.class, msgs);
			msgs = basicSetBelongsTo(newBelongsTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HybridPackage.RULE_ELEMENT__BELONGS_TO, newBelongsTo, newBelongsTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RuleElement> getOwns() {
		if (owns == null) {
			owns = new EObjectWithInverseResolvingEList<RuleElement>(RuleElement.class, this, HybridPackage.RULE_ELEMENT__OWNS, HybridPackage.RULE_ELEMENT__BELONGS_TO);
		}
		return owns;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HybridPackage.RULE_ELEMENT__MODEL, oldModel, model));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HybridPackage.RULE_ELEMENT__MODEL, oldModel, model));
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
			case HybridPackage.RULE_ELEMENT__BELONGS_TO:
				if (belongsTo != null)
					msgs = ((InternalEObject)belongsTo).eInverseRemove(this, HybridPackage.RULE_ELEMENT__OWNS, RuleElement.class, msgs);
				return basicSetBelongsTo((RuleElement)otherEnd, msgs);
			case HybridPackage.RULE_ELEMENT__OWNS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwns()).basicAdd(otherEnd, msgs);
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
			case HybridPackage.RULE_ELEMENT__BELONGS_TO:
				return basicSetBelongsTo(null, msgs);
			case HybridPackage.RULE_ELEMENT__OWNS:
				return ((InternalEList<?>)getOwns()).basicRemove(otherEnd, msgs);
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
			case HybridPackage.RULE_ELEMENT__REF:
				return getRef();
			case HybridPackage.RULE_ELEMENT__BELONGS_TO:
				if (resolve) return getBelongsTo();
				return basicGetBelongsTo();
			case HybridPackage.RULE_ELEMENT__OWNS:
				return getOwns();
			case HybridPackage.RULE_ELEMENT__MODEL:
				if (resolve) return getModel();
				return basicGetModel();
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
			case HybridPackage.RULE_ELEMENT__REF:
				setRef((String)newValue);
				return;
			case HybridPackage.RULE_ELEMENT__BELONGS_TO:
				setBelongsTo((RuleElement)newValue);
				return;
			case HybridPackage.RULE_ELEMENT__OWNS:
				getOwns().clear();
				getOwns().addAll((Collection<? extends RuleElement>)newValue);
				return;
			case HybridPackage.RULE_ELEMENT__MODEL:
				setModel((Model)newValue);
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
			case HybridPackage.RULE_ELEMENT__REF:
				setRef(REF_EDEFAULT);
				return;
			case HybridPackage.RULE_ELEMENT__BELONGS_TO:
				setBelongsTo((RuleElement)null);
				return;
			case HybridPackage.RULE_ELEMENT__OWNS:
				getOwns().clear();
				return;
			case HybridPackage.RULE_ELEMENT__MODEL:
				setModel((Model)null);
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
			case HybridPackage.RULE_ELEMENT__REF:
				return REF_EDEFAULT == null ? ref != null : !REF_EDEFAULT.equals(ref);
			case HybridPackage.RULE_ELEMENT__BELONGS_TO:
				return belongsTo != null;
			case HybridPackage.RULE_ELEMENT__OWNS:
				return owns != null && !owns.isEmpty();
			case HybridPackage.RULE_ELEMENT__MODEL:
				return model != null;
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

} //RuleElementImpl
