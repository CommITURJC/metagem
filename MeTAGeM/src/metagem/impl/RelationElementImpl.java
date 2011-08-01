/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metagem.impl;

import metagem.MetagemPackage;
import metagem.ModelComponent;
import metagem.RelationElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link metagem.impl.RelationElementImpl#getModelComponent <em>Model Component</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RelationElementImpl extends TransformationElementImpl implements RelationElement {
	/**
	 * The cached value of the '{@link #getModelComponent() <em>Model Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelComponent()
	 * @generated
	 * @ordered
	 */
	protected ModelComponent modelComponent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetagemPackage.Literals.RELATION_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelComponent getModelComponent() {
		if (modelComponent != null && modelComponent.eIsProxy()) {
			InternalEObject oldModelComponent = (InternalEObject)modelComponent;
			modelComponent = (ModelComponent)eResolveProxy(oldModelComponent);
			if (modelComponent != oldModelComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetagemPackage.RELATION_ELEMENT__MODEL_COMPONENT, oldModelComponent, modelComponent));
			}
		}
		return modelComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelComponent basicGetModelComponent() {
		return modelComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModelComponent(ModelComponent newModelComponent, NotificationChain msgs) {
		ModelComponent oldModelComponent = modelComponent;
		modelComponent = newModelComponent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetagemPackage.RELATION_ELEMENT__MODEL_COMPONENT, oldModelComponent, newModelComponent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelComponent(ModelComponent newModelComponent) {
		if (newModelComponent != modelComponent) {
			NotificationChain msgs = null;
			if (modelComponent != null)
				msgs = ((InternalEObject)modelComponent).eInverseRemove(this, MetagemPackage.MODEL_COMPONENT__RELATION_ELEMENT, ModelComponent.class, msgs);
			if (newModelComponent != null)
				msgs = ((InternalEObject)newModelComponent).eInverseAdd(this, MetagemPackage.MODEL_COMPONENT__RELATION_ELEMENT, ModelComponent.class, msgs);
			msgs = basicSetModelComponent(newModelComponent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetagemPackage.RELATION_ELEMENT__MODEL_COMPONENT, newModelComponent, newModelComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetagemPackage.RELATION_ELEMENT__MODEL_COMPONENT:
				if (modelComponent != null)
					msgs = ((InternalEObject)modelComponent).eInverseRemove(this, MetagemPackage.MODEL_COMPONENT__RELATION_ELEMENT, ModelComponent.class, msgs);
				return basicSetModelComponent((ModelComponent)otherEnd, msgs);
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
			case MetagemPackage.RELATION_ELEMENT__MODEL_COMPONENT:
				return basicSetModelComponent(null, msgs);
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
			case MetagemPackage.RELATION_ELEMENT__MODEL_COMPONENT:
				if (resolve) return getModelComponent();
				return basicGetModelComponent();
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
			case MetagemPackage.RELATION_ELEMENT__MODEL_COMPONENT:
				setModelComponent((ModelComponent)newValue);
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
			case MetagemPackage.RELATION_ELEMENT__MODEL_COMPONENT:
				setModelComponent((ModelComponent)null);
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
			case MetagemPackage.RELATION_ELEMENT__MODEL_COMPONENT:
				return modelComponent != null;
		}
		return super.eIsSet(featureID);
	}

} //RelationElementImpl
