/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metagem.impl;

import java.util.Collection;

import metagem.MetagemPackage;
import metagem.ModelRoot;
import metagem.Relations;
import metagem.TElement;
import metagem.TRelation;
import metagem.TRole;

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
 * An implementation of the model object '<em><b>Relations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link metagem.impl.RelationsImpl#getOwnedModel <em>Owned Model</em>}</li>
 *   <li>{@link metagem.impl.RelationsImpl#getTypeRelation <em>Type Relation</em>}</li>
 *   <li>{@link metagem.impl.RelationsImpl#getTypeElement <em>Type Element</em>}</li>
 *   <li>{@link metagem.impl.RelationsImpl#getRole <em>Role</em>}</li>
 *   <li>{@link metagem.impl.RelationsImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link metagem.impl.RelationsImpl#getIsExtended <em>Is Extended</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RelationsImpl extends TransformationElementImpl implements Relations {
	/**
	 * The default value of the '{@link #getTypeRelation() <em>Type Relation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeRelation()
	 * @generated
	 * @ordered
	 */
	protected static final TRelation TYPE_RELATION_EDEFAULT = TRelation.COPY;

	/**
	 * The cached value of the '{@link #getTypeRelation() <em>Type Relation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeRelation()
	 * @generated
	 * @ordered
	 */
	protected TRelation typeRelation = TYPE_RELATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeElement() <em>Type Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeElement()
	 * @generated
	 * @ordered
	 */
	protected static final TElement TYPE_ELEMENT_EDEFAULT = TElement.ECLASSIFIER;

	/**
	 * The cached value of the '{@link #getTypeElement() <em>Type Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeElement()
	 * @generated
	 * @ordered
	 */
	protected TElement typeElement = TYPE_ELEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final TRole ROLE_EDEFAULT = TRole.IS_MAIN;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected TRole role = ROLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExtends() <em>Extends</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected Relations extends_;

	/**
	 * The cached value of the '{@link #getIsExtended() <em>Is Extended</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsExtended()
	 * @generated
	 * @ordered
	 */
	protected EList<Relations> isExtended;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetagemPackage.Literals.RELATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelRoot getOwnedModel() {
		if (eContainerFeatureID() != MetagemPackage.RELATIONS__OWNED_MODEL) return null;
		return (ModelRoot)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedModel(ModelRoot newOwnedModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnedModel, MetagemPackage.RELATIONS__OWNED_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedModel(ModelRoot newOwnedModel) {
		if (newOwnedModel != eInternalContainer() || (eContainerFeatureID() != MetagemPackage.RELATIONS__OWNED_MODEL && newOwnedModel != null)) {
			if (EcoreUtil.isAncestor(this, newOwnedModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedModel != null)
				msgs = ((InternalEObject)newOwnedModel).eInverseAdd(this, MetagemPackage.MODEL_ROOT__RELATIONS, ModelRoot.class, msgs);
			msgs = basicSetOwnedModel(newOwnedModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetagemPackage.RELATIONS__OWNED_MODEL, newOwnedModel, newOwnedModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRelation getTypeRelation() {
		return typeRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeRelation(TRelation newTypeRelation) {
		TRelation oldTypeRelation = typeRelation;
		typeRelation = newTypeRelation == null ? TYPE_RELATION_EDEFAULT : newTypeRelation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetagemPackage.RELATIONS__TYPE_RELATION, oldTypeRelation, typeRelation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TElement getTypeElement() {
		return typeElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeElement(TElement newTypeElement) {
		TElement oldTypeElement = typeElement;
		typeElement = newTypeElement == null ? TYPE_ELEMENT_EDEFAULT : newTypeElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetagemPackage.RELATIONS__TYPE_ELEMENT, oldTypeElement, typeElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRole getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(TRole newRole) {
		TRole oldRole = role;
		role = newRole == null ? ROLE_EDEFAULT : newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetagemPackage.RELATIONS__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relations getExtends() {
		if (extends_ != null && extends_.eIsProxy()) {
			InternalEObject oldExtends = (InternalEObject)extends_;
			extends_ = (Relations)eResolveProxy(oldExtends);
			if (extends_ != oldExtends) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetagemPackage.RELATIONS__EXTENDS, oldExtends, extends_));
			}
		}
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relations basicGetExtends() {
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtends(Relations newExtends, NotificationChain msgs) {
		Relations oldExtends = extends_;
		extends_ = newExtends;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetagemPackage.RELATIONS__EXTENDS, oldExtends, newExtends);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtends(Relations newExtends) {
		if (newExtends != extends_) {
			NotificationChain msgs = null;
			if (extends_ != null)
				msgs = ((InternalEObject)extends_).eInverseRemove(this, MetagemPackage.RELATIONS__IS_EXTENDED, Relations.class, msgs);
			if (newExtends != null)
				msgs = ((InternalEObject)newExtends).eInverseAdd(this, MetagemPackage.RELATIONS__IS_EXTENDED, Relations.class, msgs);
			msgs = basicSetExtends(newExtends, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetagemPackage.RELATIONS__EXTENDS, newExtends, newExtends));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relations> getIsExtended() {
		if (isExtended == null) {
			isExtended = new EObjectWithInverseResolvingEList<Relations>(Relations.class, this, MetagemPackage.RELATIONS__IS_EXTENDED, MetagemPackage.RELATIONS__EXTENDS);
		}
		return isExtended;
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
			case MetagemPackage.RELATIONS__OWNED_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedModel((ModelRoot)otherEnd, msgs);
			case MetagemPackage.RELATIONS__EXTENDS:
				if (extends_ != null)
					msgs = ((InternalEObject)extends_).eInverseRemove(this, MetagemPackage.RELATIONS__IS_EXTENDED, Relations.class, msgs);
				return basicSetExtends((Relations)otherEnd, msgs);
			case MetagemPackage.RELATIONS__IS_EXTENDED:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsExtended()).basicAdd(otherEnd, msgs);
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
			case MetagemPackage.RELATIONS__OWNED_MODEL:
				return basicSetOwnedModel(null, msgs);
			case MetagemPackage.RELATIONS__EXTENDS:
				return basicSetExtends(null, msgs);
			case MetagemPackage.RELATIONS__IS_EXTENDED:
				return ((InternalEList<?>)getIsExtended()).basicRemove(otherEnd, msgs);
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
			case MetagemPackage.RELATIONS__OWNED_MODEL:
				return eInternalContainer().eInverseRemove(this, MetagemPackage.MODEL_ROOT__RELATIONS, ModelRoot.class, msgs);
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
			case MetagemPackage.RELATIONS__OWNED_MODEL:
				return getOwnedModel();
			case MetagemPackage.RELATIONS__TYPE_RELATION:
				return getTypeRelation();
			case MetagemPackage.RELATIONS__TYPE_ELEMENT:
				return getTypeElement();
			case MetagemPackage.RELATIONS__ROLE:
				return getRole();
			case MetagemPackage.RELATIONS__EXTENDS:
				if (resolve) return getExtends();
				return basicGetExtends();
			case MetagemPackage.RELATIONS__IS_EXTENDED:
				return getIsExtended();
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
			case MetagemPackage.RELATIONS__OWNED_MODEL:
				setOwnedModel((ModelRoot)newValue);
				return;
			case MetagemPackage.RELATIONS__TYPE_RELATION:
				setTypeRelation((TRelation)newValue);
				return;
			case MetagemPackage.RELATIONS__TYPE_ELEMENT:
				setTypeElement((TElement)newValue);
				return;
			case MetagemPackage.RELATIONS__ROLE:
				setRole((TRole)newValue);
				return;
			case MetagemPackage.RELATIONS__EXTENDS:
				setExtends((Relations)newValue);
				return;
			case MetagemPackage.RELATIONS__IS_EXTENDED:
				getIsExtended().clear();
				getIsExtended().addAll((Collection<? extends Relations>)newValue);
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
			case MetagemPackage.RELATIONS__OWNED_MODEL:
				setOwnedModel((ModelRoot)null);
				return;
			case MetagemPackage.RELATIONS__TYPE_RELATION:
				setTypeRelation(TYPE_RELATION_EDEFAULT);
				return;
			case MetagemPackage.RELATIONS__TYPE_ELEMENT:
				setTypeElement(TYPE_ELEMENT_EDEFAULT);
				return;
			case MetagemPackage.RELATIONS__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case MetagemPackage.RELATIONS__EXTENDS:
				setExtends((Relations)null);
				return;
			case MetagemPackage.RELATIONS__IS_EXTENDED:
				getIsExtended().clear();
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
			case MetagemPackage.RELATIONS__OWNED_MODEL:
				return getOwnedModel() != null;
			case MetagemPackage.RELATIONS__TYPE_RELATION:
				return typeRelation != TYPE_RELATION_EDEFAULT;
			case MetagemPackage.RELATIONS__TYPE_ELEMENT:
				return typeElement != TYPE_ELEMENT_EDEFAULT;
			case MetagemPackage.RELATIONS__ROLE:
				return role != ROLE_EDEFAULT;
			case MetagemPackage.RELATIONS__EXTENDS:
				return extends_ != null;
			case MetagemPackage.RELATIONS__IS_EXTENDED:
				return isExtended != null && !isExtended.isEmpty();
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
		result.append(" (typeRelation: ");
		result.append(typeRelation);
		result.append(", typeElement: ");
		result.append(typeElement);
		result.append(", role: ");
		result.append(role);
		result.append(')');
		return result.toString();
	}

} //RelationsImpl
