/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metagem.impl;

import java.util.Collection;

import metagem.MetagemPackage;
import metagem.ModelElement;
import metagem.ModelFeature;
import metagem.ModelTransf;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link metagem.impl.ModelElementImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link metagem.impl.ModelElementImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link metagem.impl.ModelElementImpl#getSuperElement <em>Super Element</em>}</li>
 *   <li>{@link metagem.impl.ModelElementImpl#getOwnedElement <em>Owned Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelElementImpl extends ModelComponentImpl implements ModelElement {
	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelFeature> features;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelElement> elements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetagemPackage.Literals.MODEL_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelFeature> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentWithInverseEList<ModelFeature>(ModelFeature.class, this, MetagemPackage.MODEL_ELEMENT__FEATURES, MetagemPackage.MODEL_FEATURE__PARENT);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentWithInverseEList<ModelElement>(ModelElement.class, this, MetagemPackage.MODEL_ELEMENT__ELEMENTS, MetagemPackage.MODEL_ELEMENT__SUPER_ELEMENT);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelElement getSuperElement() {
		if (eContainerFeatureID() != MetagemPackage.MODEL_ELEMENT__SUPER_ELEMENT) return null;
		return (ModelElement)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuperElement(ModelElement newSuperElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSuperElement, MetagemPackage.MODEL_ELEMENT__SUPER_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperElement(ModelElement newSuperElement) {
		if (newSuperElement != eInternalContainer() || (eContainerFeatureID() != MetagemPackage.MODEL_ELEMENT__SUPER_ELEMENT && newSuperElement != null)) {
			if (EcoreUtil.isAncestor(this, newSuperElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSuperElement != null)
				msgs = ((InternalEObject)newSuperElement).eInverseAdd(this, MetagemPackage.MODEL_ELEMENT__ELEMENTS, ModelElement.class, msgs);
			msgs = basicSetSuperElement(newSuperElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetagemPackage.MODEL_ELEMENT__SUPER_ELEMENT, newSuperElement, newSuperElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelTransf getOwnedElement() {
		if (eContainerFeatureID() != MetagemPackage.MODEL_ELEMENT__OWNED_ELEMENT) return null;
		return (ModelTransf)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedElement(ModelTransf newOwnedElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnedElement, MetagemPackage.MODEL_ELEMENT__OWNED_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedElement(ModelTransf newOwnedElement) {
		if (newOwnedElement != eInternalContainer() || (eContainerFeatureID() != MetagemPackage.MODEL_ELEMENT__OWNED_ELEMENT && newOwnedElement != null)) {
			if (EcoreUtil.isAncestor(this, newOwnedElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedElement != null)
				msgs = ((InternalEObject)newOwnedElement).eInverseAdd(this, MetagemPackage.MODEL_TRANSF__ELEMENTS, ModelTransf.class, msgs);
			msgs = basicSetOwnedElement(newOwnedElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetagemPackage.MODEL_ELEMENT__OWNED_ELEMENT, newOwnedElement, newOwnedElement));
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
			case MetagemPackage.MODEL_ELEMENT__FEATURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFeatures()).basicAdd(otherEnd, msgs);
			case MetagemPackage.MODEL_ELEMENT__ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getElements()).basicAdd(otherEnd, msgs);
			case MetagemPackage.MODEL_ELEMENT__SUPER_ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSuperElement((ModelElement)otherEnd, msgs);
			case MetagemPackage.MODEL_ELEMENT__OWNED_ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedElement((ModelTransf)otherEnd, msgs);
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
			case MetagemPackage.MODEL_ELEMENT__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
			case MetagemPackage.MODEL_ELEMENT__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case MetagemPackage.MODEL_ELEMENT__SUPER_ELEMENT:
				return basicSetSuperElement(null, msgs);
			case MetagemPackage.MODEL_ELEMENT__OWNED_ELEMENT:
				return basicSetOwnedElement(null, msgs);
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
			case MetagemPackage.MODEL_ELEMENT__SUPER_ELEMENT:
				return eInternalContainer().eInverseRemove(this, MetagemPackage.MODEL_ELEMENT__ELEMENTS, ModelElement.class, msgs);
			case MetagemPackage.MODEL_ELEMENT__OWNED_ELEMENT:
				return eInternalContainer().eInverseRemove(this, MetagemPackage.MODEL_TRANSF__ELEMENTS, ModelTransf.class, msgs);
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
			case MetagemPackage.MODEL_ELEMENT__FEATURES:
				return getFeatures();
			case MetagemPackage.MODEL_ELEMENT__ELEMENTS:
				return getElements();
			case MetagemPackage.MODEL_ELEMENT__SUPER_ELEMENT:
				return getSuperElement();
			case MetagemPackage.MODEL_ELEMENT__OWNED_ELEMENT:
				return getOwnedElement();
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
			case MetagemPackage.MODEL_ELEMENT__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends ModelFeature>)newValue);
				return;
			case MetagemPackage.MODEL_ELEMENT__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends ModelElement>)newValue);
				return;
			case MetagemPackage.MODEL_ELEMENT__SUPER_ELEMENT:
				setSuperElement((ModelElement)newValue);
				return;
			case MetagemPackage.MODEL_ELEMENT__OWNED_ELEMENT:
				setOwnedElement((ModelTransf)newValue);
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
			case MetagemPackage.MODEL_ELEMENT__FEATURES:
				getFeatures().clear();
				return;
			case MetagemPackage.MODEL_ELEMENT__ELEMENTS:
				getElements().clear();
				return;
			case MetagemPackage.MODEL_ELEMENT__SUPER_ELEMENT:
				setSuperElement((ModelElement)null);
				return;
			case MetagemPackage.MODEL_ELEMENT__OWNED_ELEMENT:
				setOwnedElement((ModelTransf)null);
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
			case MetagemPackage.MODEL_ELEMENT__FEATURES:
				return features != null && !features.isEmpty();
			case MetagemPackage.MODEL_ELEMENT__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case MetagemPackage.MODEL_ELEMENT__SUPER_ELEMENT:
				return getSuperElement() != null;
			case MetagemPackage.MODEL_ELEMENT__OWNED_ELEMENT:
				return getOwnedElement() != null;
		}
		return super.eIsSet(featureID);
	}

} //ModelElementImpl
