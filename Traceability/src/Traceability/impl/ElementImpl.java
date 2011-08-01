/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Traceability.impl;

import Traceability.Element;
import Traceability.Feature;
import Traceability.Model;
import Traceability.SourceElement;
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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Traceability.impl.ElementImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link Traceability.impl.ElementImpl#getModel <em>Model</em>}</li>
 *   <li>{@link Traceability.impl.ElementImpl#getChild_element <em>Child element</em>}</li>
 *   <li>{@link Traceability.impl.ElementImpl#getSuper_element <em>Super element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementImpl extends ModelElementImpl implements Element {
	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> features;

	/**
	 * The cached value of the '{@link #getChild_element() <em>Child element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChild_element()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> child_element;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TraceabilityPackage.Literals.ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model getModel() {
		if (eContainerFeatureID() != TraceabilityPackage.ELEMENT__MODEL) return null;
		return (Model)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel(Model newModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newModel, TraceabilityPackage.ELEMENT__MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(Model newModel) {
		if (newModel != eInternalContainer() || (eContainerFeatureID() != TraceabilityPackage.ELEMENT__MODEL && newModel != null)) {
			if (EcoreUtil.isAncestor(this, newModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModel != null)
				msgs = ((InternalEObject)newModel).eInverseAdd(this, TraceabilityPackage.MODEL__ELEMENTS, Model.class, msgs);
			msgs = basicSetModel(newModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraceabilityPackage.ELEMENT__MODEL, newModel, newModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getChild_element() {
		if (child_element == null) {
			child_element = new EObjectContainmentWithInverseEList<Element>(Element.class, this, TraceabilityPackage.ELEMENT__CHILD_ELEMENT, TraceabilityPackage.ELEMENT__SUPER_ELEMENT);
		}
		return child_element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getSuper_element() {
		if (eContainerFeatureID() != TraceabilityPackage.ELEMENT__SUPER_ELEMENT) return null;
		return (Element)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuper_element(Element newSuper_element, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSuper_element, TraceabilityPackage.ELEMENT__SUPER_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuper_element(Element newSuper_element) {
		if (newSuper_element != eInternalContainer() || (eContainerFeatureID() != TraceabilityPackage.ELEMENT__SUPER_ELEMENT && newSuper_element != null)) {
			if (EcoreUtil.isAncestor(this, newSuper_element))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSuper_element != null)
				msgs = ((InternalEObject)newSuper_element).eInverseAdd(this, TraceabilityPackage.ELEMENT__CHILD_ELEMENT, Element.class, msgs);
			msgs = basicSetSuper_element(newSuper_element, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TraceabilityPackage.ELEMENT__SUPER_ELEMENT, newSuper_element, newSuper_element));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentWithInverseEList<Feature>(Feature.class, this, TraceabilityPackage.ELEMENT__FEATURES, TraceabilityPackage.FEATURE__PARENT);
		}
		return features;
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
			case TraceabilityPackage.ELEMENT__FEATURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFeatures()).basicAdd(otherEnd, msgs);
			case TraceabilityPackage.ELEMENT__MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetModel((Model)otherEnd, msgs);
			case TraceabilityPackage.ELEMENT__CHILD_ELEMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChild_element()).basicAdd(otherEnd, msgs);
			case TraceabilityPackage.ELEMENT__SUPER_ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSuper_element((Element)otherEnd, msgs);
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
			case TraceabilityPackage.ELEMENT__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
			case TraceabilityPackage.ELEMENT__MODEL:
				return basicSetModel(null, msgs);
			case TraceabilityPackage.ELEMENT__CHILD_ELEMENT:
				return ((InternalEList<?>)getChild_element()).basicRemove(otherEnd, msgs);
			case TraceabilityPackage.ELEMENT__SUPER_ELEMENT:
				return basicSetSuper_element(null, msgs);
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
			case TraceabilityPackage.ELEMENT__MODEL:
				return eInternalContainer().eInverseRemove(this, TraceabilityPackage.MODEL__ELEMENTS, Model.class, msgs);
			case TraceabilityPackage.ELEMENT__SUPER_ELEMENT:
				return eInternalContainer().eInverseRemove(this, TraceabilityPackage.ELEMENT__CHILD_ELEMENT, Element.class, msgs);
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
			case TraceabilityPackage.ELEMENT__FEATURES:
				return getFeatures();
			case TraceabilityPackage.ELEMENT__MODEL:
				return getModel();
			case TraceabilityPackage.ELEMENT__CHILD_ELEMENT:
				return getChild_element();
			case TraceabilityPackage.ELEMENT__SUPER_ELEMENT:
				return getSuper_element();
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
			case TraceabilityPackage.ELEMENT__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends Feature>)newValue);
				return;
			case TraceabilityPackage.ELEMENT__MODEL:
				setModel((Model)newValue);
				return;
			case TraceabilityPackage.ELEMENT__CHILD_ELEMENT:
				getChild_element().clear();
				getChild_element().addAll((Collection<? extends Element>)newValue);
				return;
			case TraceabilityPackage.ELEMENT__SUPER_ELEMENT:
				setSuper_element((Element)newValue);
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
			case TraceabilityPackage.ELEMENT__FEATURES:
				getFeatures().clear();
				return;
			case TraceabilityPackage.ELEMENT__MODEL:
				setModel((Model)null);
				return;
			case TraceabilityPackage.ELEMENT__CHILD_ELEMENT:
				getChild_element().clear();
				return;
			case TraceabilityPackage.ELEMENT__SUPER_ELEMENT:
				setSuper_element((Element)null);
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
			case TraceabilityPackage.ELEMENT__FEATURES:
				return features != null && !features.isEmpty();
			case TraceabilityPackage.ELEMENT__MODEL:
				return getModel() != null;
			case TraceabilityPackage.ELEMENT__CHILD_ELEMENT:
				return child_element != null && !child_element.isEmpty();
			case TraceabilityPackage.ELEMENT__SUPER_ELEMENT:
				return getSuper_element() != null;
		}
		return super.eIsSet(featureID);
	}

} //ElementImpl
