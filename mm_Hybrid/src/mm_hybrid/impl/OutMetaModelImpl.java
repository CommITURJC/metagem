/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm_hybrid.impl;

import mm_hybrid.MM_HybridPackage;
import mm_hybrid.OutMetaModel;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Out Meta Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mm_hybrid.impl.OutMetaModelImpl#getName_mm <em>Name mm</em>}</li>
 *   <li>{@link mm_hybrid.impl.OutMetaModelImpl#getType_mm <em>Type mm</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutMetaModelImpl extends EObjectImpl implements OutMetaModel {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutMetaModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MM_HybridPackage.Literals.OUT_META_MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					MM_HybridPackage.OUT_META_MODEL__NAME_MM, oldName_mm,
					name_mm));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					MM_HybridPackage.OUT_META_MODEL__TYPE_MM, oldType_mm,
					type_mm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MM_HybridPackage.OUT_META_MODEL__NAME_MM:
			return getName_mm();
		case MM_HybridPackage.OUT_META_MODEL__TYPE_MM:
			return getType_mm();
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
		case MM_HybridPackage.OUT_META_MODEL__NAME_MM:
			setName_mm((String) newValue);
			return;
		case MM_HybridPackage.OUT_META_MODEL__TYPE_MM:
			setType_mm((String) newValue);
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
		case MM_HybridPackage.OUT_META_MODEL__NAME_MM:
			setName_mm(NAME_MM_EDEFAULT);
			return;
		case MM_HybridPackage.OUT_META_MODEL__TYPE_MM:
			setType_mm(TYPE_MM_EDEFAULT);
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
		case MM_HybridPackage.OUT_META_MODEL__NAME_MM:
			return NAME_MM_EDEFAULT == null ? name_mm != null
					: !NAME_MM_EDEFAULT.equals(name_mm);
		case MM_HybridPackage.OUT_META_MODEL__TYPE_MM:
			return TYPE_MM_EDEFAULT == null ? type_mm != null
					: !TYPE_MM_EDEFAULT.equals(type_mm);
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
		result.append(" (name_mm: "); //$NON-NLS-1$
		result.append(name_mm);
		result.append(", type_mm: "); //$NON-NLS-1$
		result.append(type_mm);
		result.append(')');
		return result.toString();
	}

} //OutMetaModelImpl
