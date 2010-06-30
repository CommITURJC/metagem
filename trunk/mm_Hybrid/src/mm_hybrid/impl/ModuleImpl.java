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
import mm_hybrid.OutMetaModel;
import mm_hybrid.Rule;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mm_hybrid.impl.ModuleImpl#getName_module <em>Name module</em>}</li>
 *   <li>{@link mm_hybrid.impl.ModuleImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link mm_hybrid.impl.ModuleImpl#getInMM <em>In MM</em>}</li>
 *   <li>{@link mm_hybrid.impl.ModuleImpl#getOutMM <em>Out MM</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModuleImpl extends EObjectImpl implements Module {
	/**
	 * The default value of the '{@link #getName_module() <em>Name module</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName_module()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_MODULE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName_module() <em>Name module</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName_module()
	 * @generated
	 * @ordered
	 */
	protected String name_module = NAME_MODULE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRule() <em>Rule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRule()
	 * @generated
	 * @ordered
	 */
	protected EList<Rule> rule;

	/**
	 * The cached value of the '{@link #getInMM() <em>In MM</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInMM()
	 * @generated
	 * @ordered
	 */
	protected EList<InMetaModel> inMM;

	/**
	 * The cached value of the '{@link #getOutMM() <em>Out MM</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutMM()
	 * @generated
	 * @ordered
	 */
	protected EList<OutMetaModel> outMM;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MM_HybridPackage.Literals.MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName_module() {
		return name_module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName_module(String newName_module) {
		String oldName_module = name_module;
		name_module = newName_module;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MM_HybridPackage.MODULE__NAME_MODULE, oldName_module,
					name_module));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rule> getRule() {
		if (rule == null) {
			rule = new EObjectContainmentEList<Rule>(Rule.class, this,
					MM_HybridPackage.MODULE__RULE);
		}
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InMetaModel> getInMM() {
		if (inMM == null) {
			inMM = new EObjectContainmentEList<InMetaModel>(InMetaModel.class,
					this, MM_HybridPackage.MODULE__IN_MM);
		}
		return inMM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutMetaModel> getOutMM() {
		if (outMM == null) {
			outMM = new EObjectContainmentEList<OutMetaModel>(
					OutMetaModel.class, this, MM_HybridPackage.MODULE__OUT_MM);
		}
		return outMM;
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
		case MM_HybridPackage.MODULE__RULE:
			return ((InternalEList<?>) getRule()).basicRemove(otherEnd, msgs);
		case MM_HybridPackage.MODULE__IN_MM:
			return ((InternalEList<?>) getInMM()).basicRemove(otherEnd, msgs);
		case MM_HybridPackage.MODULE__OUT_MM:
			return ((InternalEList<?>) getOutMM()).basicRemove(otherEnd, msgs);
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
		case MM_HybridPackage.MODULE__NAME_MODULE:
			return getName_module();
		case MM_HybridPackage.MODULE__RULE:
			return getRule();
		case MM_HybridPackage.MODULE__IN_MM:
			return getInMM();
		case MM_HybridPackage.MODULE__OUT_MM:
			return getOutMM();
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
		case MM_HybridPackage.MODULE__NAME_MODULE:
			setName_module((String) newValue);
			return;
		case MM_HybridPackage.MODULE__RULE:
			getRule().clear();
			getRule().addAll((Collection<? extends Rule>) newValue);
			return;
		case MM_HybridPackage.MODULE__IN_MM:
			getInMM().clear();
			getInMM().addAll((Collection<? extends InMetaModel>) newValue);
			return;
		case MM_HybridPackage.MODULE__OUT_MM:
			getOutMM().clear();
			getOutMM().addAll((Collection<? extends OutMetaModel>) newValue);
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
		case MM_HybridPackage.MODULE__NAME_MODULE:
			setName_module(NAME_MODULE_EDEFAULT);
			return;
		case MM_HybridPackage.MODULE__RULE:
			getRule().clear();
			return;
		case MM_HybridPackage.MODULE__IN_MM:
			getInMM().clear();
			return;
		case MM_HybridPackage.MODULE__OUT_MM:
			getOutMM().clear();
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
		case MM_HybridPackage.MODULE__NAME_MODULE:
			return NAME_MODULE_EDEFAULT == null ? name_module != null
					: !NAME_MODULE_EDEFAULT.equals(name_module);
		case MM_HybridPackage.MODULE__RULE:
			return rule != null && !rule.isEmpty();
		case MM_HybridPackage.MODULE__IN_MM:
			return inMM != null && !inMM.isEmpty();
		case MM_HybridPackage.MODULE__OUT_MM:
			return outMM != null && !outMM.isEmpty();
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
		result.append(" (name_module: "); //$NON-NLS-1$
		result.append(name_module);
		result.append(')');
		return result.toString();
	}

} //ModuleImpl
