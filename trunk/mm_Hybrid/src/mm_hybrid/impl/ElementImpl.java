/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm_hybrid.impl;

import java.util.Collection;
import mm_hybrid.Element;
import mm_hybrid.MM_HybridPackage;

import mm_hybrid.Operation;
import mm_hybrid.RightPattern;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mm_hybrid.impl.ElementImpl#getName_element <em>Name element</em>}</li>
 *   <li>{@link mm_hybrid.impl.ElementImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link mm_hybrid.impl.ElementImpl#getIsRefered <em>Is Refered</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ElementImpl extends EObjectImpl implements Element {
	/**
	 * The default value of the '{@link #getName_element() <em>Name element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName_element()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_ELEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName_element() <em>Name element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName_element()
	 * @generated
	 * @ordered
	 */
	protected String name_element = NAME_ELEMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> operation;

	/**
	 * The cached value of the '{@link #getIsRefered() <em>Is Refered</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsRefered()
	 * @generated
	 * @ordered
	 */
	protected EList<RightPattern> isRefered;

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
		return MM_HybridPackage.Literals.ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName_element() {
		return name_element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName_element(String newName_element) {
		String oldName_element = name_element;
		name_element = newName_element;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MM_HybridPackage.ELEMENT__NAME_ELEMENT, oldName_element,
					name_element));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOperation() {
		if (operation == null) {
			operation = new EObjectResolvingEList<Operation>(Operation.class,
					this, MM_HybridPackage.ELEMENT__OPERATION);
		}
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RightPattern> getIsRefered() {
		if (isRefered == null) {
			isRefered = new EObjectWithInverseResolvingEList<RightPattern>(
					RightPattern.class, this,
					MM_HybridPackage.ELEMENT__IS_REFERED,
					MM_HybridPackage.RIGHT_PATTERN__REFERENCE);
		}
		return isRefered;
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
		case MM_HybridPackage.ELEMENT__IS_REFERED:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getIsRefered())
					.basicAdd(otherEnd, msgs);
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
		case MM_HybridPackage.ELEMENT__IS_REFERED:
			return ((InternalEList<?>) getIsRefered()).basicRemove(otherEnd,
					msgs);
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
		case MM_HybridPackage.ELEMENT__NAME_ELEMENT:
			return getName_element();
		case MM_HybridPackage.ELEMENT__OPERATION:
			return getOperation();
		case MM_HybridPackage.ELEMENT__IS_REFERED:
			return getIsRefered();
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
		case MM_HybridPackage.ELEMENT__NAME_ELEMENT:
			setName_element((String) newValue);
			return;
		case MM_HybridPackage.ELEMENT__OPERATION:
			getOperation().clear();
			getOperation().addAll((Collection<? extends Operation>) newValue);
			return;
		case MM_HybridPackage.ELEMENT__IS_REFERED:
			getIsRefered().clear();
			getIsRefered()
					.addAll((Collection<? extends RightPattern>) newValue);
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
		case MM_HybridPackage.ELEMENT__NAME_ELEMENT:
			setName_element(NAME_ELEMENT_EDEFAULT);
			return;
		case MM_HybridPackage.ELEMENT__OPERATION:
			getOperation().clear();
			return;
		case MM_HybridPackage.ELEMENT__IS_REFERED:
			getIsRefered().clear();
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
		case MM_HybridPackage.ELEMENT__NAME_ELEMENT:
			return NAME_ELEMENT_EDEFAULT == null ? name_element != null
					: !NAME_ELEMENT_EDEFAULT.equals(name_element);
		case MM_HybridPackage.ELEMENT__OPERATION:
			return operation != null && !operation.isEmpty();
		case MM_HybridPackage.ELEMENT__IS_REFERED:
			return isRefered != null && !isRefered.isEmpty();
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name_element: "); //$NON-NLS-1$
		result.append(name_element);
		result.append(')');
		return result.toString();
	}

} //ElementImpl
