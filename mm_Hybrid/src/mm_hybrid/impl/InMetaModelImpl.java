/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm_hybrid.impl;

import java.util.Collection;
import mm_hybrid.InMetaModel;
import mm_hybrid.MM_HybridPackage;

import mm_hybrid.Module;
import mm_hybrid.SourceElementRule;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>In Meta Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mm_hybrid.impl.InMetaModelImpl#getName_mm <em>Name mm</em>}</li>
 *   <li>{@link mm_hybrid.impl.InMetaModelImpl#getType_mm <em>Type mm</em>}</li>
 *   <li>{@link mm_hybrid.impl.InMetaModelImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link mm_hybrid.impl.InMetaModelImpl#getModule <em>Module</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InMetaModelImpl extends EObjectImpl implements InMetaModel {
	/**
	 * The default value of the '{@link #getName_mm() <em>Name mm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName_mm()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_MM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName_mm() <em>Name mm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName_mm()
	 * @generated
	 * @ordered
	 */
	protected String name_mm = NAME_MM_EDEFAULT;

	/**
	 * The default value of the '{@link #getType_mm() <em>Type mm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType_mm()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_MM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType_mm() <em>Type mm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType_mm()
	 * @generated
	 * @ordered
	 */
	protected String type_mm = TYPE_MM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceElementRule> elements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InMetaModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MM_HybridPackage.Literals.IN_META_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName_mm() {
		return name_mm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName_mm(String newName_mm) {
		String oldName_mm = name_mm;
		name_mm = newName_mm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MM_HybridPackage.IN_META_MODEL__NAME_MM, oldName_mm, name_mm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType_mm() {
		return type_mm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType_mm(String newType_mm) {
		String oldType_mm = type_mm;
		type_mm = newType_mm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MM_HybridPackage.IN_META_MODEL__TYPE_MM, oldType_mm, type_mm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceElementRule> getElements() {
		if (elements == null) {
			elements = new EObjectWithInverseResolvingEList<SourceElementRule>(SourceElementRule.class, this, MM_HybridPackage.IN_META_MODEL__ELEMENTS, MM_HybridPackage.SOURCE_ELEMENT_RULE__METAMODEL);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module getModule() {
		if (eContainerFeatureID() != MM_HybridPackage.IN_META_MODEL__MODULE) return null;
		return (Module)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModule(Module newModule,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newModule, MM_HybridPackage.IN_META_MODEL__MODULE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModule(Module newModule) {
		if (newModule != eInternalContainer() || (eContainerFeatureID() != MM_HybridPackage.IN_META_MODEL__MODULE && newModule != null)) {
			if (EcoreUtil.isAncestor(this, newModule))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModule != null)
				msgs = ((InternalEObject)newModule).eInverseAdd(this, MM_HybridPackage.MODULE__IN_MM, Module.class, msgs);
			msgs = basicSetModule(newModule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MM_HybridPackage.IN_META_MODEL__MODULE, newModule, newModule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MM_HybridPackage.IN_META_MODEL__ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getElements()).basicAdd(otherEnd, msgs);
			case MM_HybridPackage.IN_META_MODEL__MODULE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetModule((Module)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MM_HybridPackage.IN_META_MODEL__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case MM_HybridPackage.IN_META_MODEL__MODULE:
				return basicSetModule(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case MM_HybridPackage.IN_META_MODEL__MODULE:
				return eInternalContainer().eInverseRemove(this, MM_HybridPackage.MODULE__IN_MM, Module.class, msgs);
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
			case MM_HybridPackage.IN_META_MODEL__NAME_MM:
				return getName_mm();
			case MM_HybridPackage.IN_META_MODEL__TYPE_MM:
				return getType_mm();
			case MM_HybridPackage.IN_META_MODEL__ELEMENTS:
				return getElements();
			case MM_HybridPackage.IN_META_MODEL__MODULE:
				return getModule();
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
			case MM_HybridPackage.IN_META_MODEL__NAME_MM:
				setName_mm((String)newValue);
				return;
			case MM_HybridPackage.IN_META_MODEL__TYPE_MM:
				setType_mm((String)newValue);
				return;
			case MM_HybridPackage.IN_META_MODEL__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends SourceElementRule>)newValue);
				return;
			case MM_HybridPackage.IN_META_MODEL__MODULE:
				setModule((Module)newValue);
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
			case MM_HybridPackage.IN_META_MODEL__NAME_MM:
				setName_mm(NAME_MM_EDEFAULT);
				return;
			case MM_HybridPackage.IN_META_MODEL__TYPE_MM:
				setType_mm(TYPE_MM_EDEFAULT);
				return;
			case MM_HybridPackage.IN_META_MODEL__ELEMENTS:
				getElements().clear();
				return;
			case MM_HybridPackage.IN_META_MODEL__MODULE:
				setModule((Module)null);
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
			case MM_HybridPackage.IN_META_MODEL__NAME_MM:
				return NAME_MM_EDEFAULT == null ? name_mm != null : !NAME_MM_EDEFAULT.equals(name_mm);
			case MM_HybridPackage.IN_META_MODEL__TYPE_MM:
				return TYPE_MM_EDEFAULT == null ? type_mm != null : !TYPE_MM_EDEFAULT.equals(type_mm);
			case MM_HybridPackage.IN_META_MODEL__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case MM_HybridPackage.IN_META_MODEL__MODULE:
				return getModule() != null;
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
		result.append(" (name_mm: ");
		result.append(name_mm);
		result.append(", type_mm: ");
		result.append(type_mm);
		result.append(')');
		return result.toString();
	}

} //InMetaModelImpl
