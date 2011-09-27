/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hybrid.impl;

import hybrid.HybridPackage;
import hybrid.Model;
import hybrid.ModelComponent;
import hybrid.ModelElement;
import hybrid.ModelFeature;

import hybrid.RuleElement;
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
 * An implementation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hybrid.impl.ModelElementImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link hybrid.impl.ModelElementImpl#getRuleElement <em>Rule Element</em>}</li>
 *   <li>{@link hybrid.impl.ModelElementImpl#getOwnedModel <em>Owned Model</em>}</li>
 *   <li>{@link hybrid.impl.ModelElementImpl#getChildElements <em>Child Elements</em>}</li>
 *   <li>{@link hybrid.impl.ModelElementImpl#getParentElement <em>Parent Element</em>}</li>
 *   <li>{@link hybrid.impl.ModelElementImpl#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelElementImpl extends HybridElementImpl implements ModelElement {
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
	 * The cached value of the '{@link #getRuleElement() <em>Rule Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleElement()
	 * @generated
	 * @ordered
	 */
	protected EList<RuleElement> ruleElement;

	/**
	 * The cached value of the '{@link #getChildElements() <em>Child Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelElement> childElements;

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
		return HybridPackage.Literals.MODEL_ELEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, HybridPackage.MODEL_ELEMENT__REF, oldRef, ref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RuleElement> getRuleElement() {
		if (ruleElement == null) {
			ruleElement = new EObjectWithInverseResolvingEList<RuleElement>(RuleElement.class, this, HybridPackage.MODEL_ELEMENT__RULE_ELEMENT, HybridPackage.RULE_ELEMENT__COMPONENT);
		}
		return ruleElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model getOwnedModel() {
		if (eContainerFeatureID() != HybridPackage.MODEL_ELEMENT__OWNED_MODEL) return null;
		return (Model)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedModel(Model newOwnedModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnedModel, HybridPackage.MODEL_ELEMENT__OWNED_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedModel(Model newOwnedModel) {
		if (newOwnedModel != eInternalContainer() || (eContainerFeatureID() != HybridPackage.MODEL_ELEMENT__OWNED_MODEL && newOwnedModel != null)) {
			if (EcoreUtil.isAncestor(this, newOwnedModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedModel != null)
				msgs = ((InternalEObject)newOwnedModel).eInverseAdd(this, HybridPackage.MODEL__ELEMENTS, Model.class, msgs);
			msgs = basicSetOwnedModel(newOwnedModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HybridPackage.MODEL_ELEMENT__OWNED_MODEL, newOwnedModel, newOwnedModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelElement> getChildElements() {
		if (childElements == null) {
			childElements = new EObjectContainmentWithInverseEList<ModelElement>(ModelElement.class, this, HybridPackage.MODEL_ELEMENT__CHILD_ELEMENTS, HybridPackage.MODEL_ELEMENT__PARENT_ELEMENT);
		}
		return childElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelElement getParentElement() {
		if (eContainerFeatureID() != HybridPackage.MODEL_ELEMENT__PARENT_ELEMENT) return null;
		return (ModelElement)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentElement(ModelElement newParentElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentElement, HybridPackage.MODEL_ELEMENT__PARENT_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentElement(ModelElement newParentElement) {
		if (newParentElement != eInternalContainer() || (eContainerFeatureID() != HybridPackage.MODEL_ELEMENT__PARENT_ELEMENT && newParentElement != null)) {
			if (EcoreUtil.isAncestor(this, newParentElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentElement != null)
				msgs = ((InternalEObject)newParentElement).eInverseAdd(this, HybridPackage.MODEL_ELEMENT__CHILD_ELEMENTS, ModelElement.class, msgs);
			msgs = basicSetParentElement(newParentElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HybridPackage.MODEL_ELEMENT__PARENT_ELEMENT, newParentElement, newParentElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelFeature> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentWithInverseEList<ModelFeature>(ModelFeature.class, this, HybridPackage.MODEL_ELEMENT__FEATURES, HybridPackage.MODEL_FEATURE__OWNED_ELEMENT);
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
			case HybridPackage.MODEL_ELEMENT__RULE_ELEMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRuleElement()).basicAdd(otherEnd, msgs);
			case HybridPackage.MODEL_ELEMENT__OWNED_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedModel((Model)otherEnd, msgs);
			case HybridPackage.MODEL_ELEMENT__CHILD_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildElements()).basicAdd(otherEnd, msgs);
			case HybridPackage.MODEL_ELEMENT__PARENT_ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentElement((ModelElement)otherEnd, msgs);
			case HybridPackage.MODEL_ELEMENT__FEATURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFeatures()).basicAdd(otherEnd, msgs);
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
			case HybridPackage.MODEL_ELEMENT__RULE_ELEMENT:
				return ((InternalEList<?>)getRuleElement()).basicRemove(otherEnd, msgs);
			case HybridPackage.MODEL_ELEMENT__OWNED_MODEL:
				return basicSetOwnedModel(null, msgs);
			case HybridPackage.MODEL_ELEMENT__CHILD_ELEMENTS:
				return ((InternalEList<?>)getChildElements()).basicRemove(otherEnd, msgs);
			case HybridPackage.MODEL_ELEMENT__PARENT_ELEMENT:
				return basicSetParentElement(null, msgs);
			case HybridPackage.MODEL_ELEMENT__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
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
			case HybridPackage.MODEL_ELEMENT__OWNED_MODEL:
				return eInternalContainer().eInverseRemove(this, HybridPackage.MODEL__ELEMENTS, Model.class, msgs);
			case HybridPackage.MODEL_ELEMENT__PARENT_ELEMENT:
				return eInternalContainer().eInverseRemove(this, HybridPackage.MODEL_ELEMENT__CHILD_ELEMENTS, ModelElement.class, msgs);
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
			case HybridPackage.MODEL_ELEMENT__REF:
				return getRef();
			case HybridPackage.MODEL_ELEMENT__RULE_ELEMENT:
				return getRuleElement();
			case HybridPackage.MODEL_ELEMENT__OWNED_MODEL:
				return getOwnedModel();
			case HybridPackage.MODEL_ELEMENT__CHILD_ELEMENTS:
				return getChildElements();
			case HybridPackage.MODEL_ELEMENT__PARENT_ELEMENT:
				return getParentElement();
			case HybridPackage.MODEL_ELEMENT__FEATURES:
				return getFeatures();
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
			case HybridPackage.MODEL_ELEMENT__REF:
				setRef((String)newValue);
				return;
			case HybridPackage.MODEL_ELEMENT__RULE_ELEMENT:
				getRuleElement().clear();
				getRuleElement().addAll((Collection<? extends RuleElement>)newValue);
				return;
			case HybridPackage.MODEL_ELEMENT__OWNED_MODEL:
				setOwnedModel((Model)newValue);
				return;
			case HybridPackage.MODEL_ELEMENT__CHILD_ELEMENTS:
				getChildElements().clear();
				getChildElements().addAll((Collection<? extends ModelElement>)newValue);
				return;
			case HybridPackage.MODEL_ELEMENT__PARENT_ELEMENT:
				setParentElement((ModelElement)newValue);
				return;
			case HybridPackage.MODEL_ELEMENT__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends ModelFeature>)newValue);
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
			case HybridPackage.MODEL_ELEMENT__REF:
				setRef(REF_EDEFAULT);
				return;
			case HybridPackage.MODEL_ELEMENT__RULE_ELEMENT:
				getRuleElement().clear();
				return;
			case HybridPackage.MODEL_ELEMENT__OWNED_MODEL:
				setOwnedModel((Model)null);
				return;
			case HybridPackage.MODEL_ELEMENT__CHILD_ELEMENTS:
				getChildElements().clear();
				return;
			case HybridPackage.MODEL_ELEMENT__PARENT_ELEMENT:
				setParentElement((ModelElement)null);
				return;
			case HybridPackage.MODEL_ELEMENT__FEATURES:
				getFeatures().clear();
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
			case HybridPackage.MODEL_ELEMENT__REF:
				return REF_EDEFAULT == null ? ref != null : !REF_EDEFAULT.equals(ref);
			case HybridPackage.MODEL_ELEMENT__RULE_ELEMENT:
				return ruleElement != null && !ruleElement.isEmpty();
			case HybridPackage.MODEL_ELEMENT__OWNED_MODEL:
				return getOwnedModel() != null;
			case HybridPackage.MODEL_ELEMENT__CHILD_ELEMENTS:
				return childElements != null && !childElements.isEmpty();
			case HybridPackage.MODEL_ELEMENT__PARENT_ELEMENT:
				return getParentElement() != null;
			case HybridPackage.MODEL_ELEMENT__FEATURES:
				return features != null && !features.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ModelComponent.class) {
			switch (derivedFeatureID) {
				case HybridPackage.MODEL_ELEMENT__REF: return HybridPackage.MODEL_COMPONENT__REF;
				case HybridPackage.MODEL_ELEMENT__RULE_ELEMENT: return HybridPackage.MODEL_COMPONENT__RULE_ELEMENT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ModelComponent.class) {
			switch (baseFeatureID) {
				case HybridPackage.MODEL_COMPONENT__REF: return HybridPackage.MODEL_ELEMENT__REF;
				case HybridPackage.MODEL_COMPONENT__RULE_ELEMENT: return HybridPackage.MODEL_ELEMENT__RULE_ELEMENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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

} //ModelElementImpl
