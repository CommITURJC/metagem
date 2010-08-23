/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package RubyTL.impl;

import RubyTL.Metamodel;
import RubyTL.RubyTLPackage;
import RubyTL.Rule;
import RubyTL.Transformation;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link RubyTL.impl.TransformationImpl#getName <em>Name</em>}</li>
 *   <li>{@link RubyTL.impl.TransformationImpl#getSourceMetamodels <em>Source Metamodels</em>}</li>
 *   <li>{@link RubyTL.impl.TransformationImpl#getTargetMetamodels <em>Target Metamodels</em>}</li>
 *   <li>{@link RubyTL.impl.TransformationImpl#getRules <em>Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransformationImpl extends EObjectImpl implements Transformation {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSourceMetamodels() <em>Source Metamodels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceMetamodels()
	 * @generated
	 * @ordered
	 */
	protected EList<Metamodel> sourceMetamodels;

	/**
	 * The cached value of the '{@link #getTargetMetamodels() <em>Target Metamodels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetMetamodels()
	 * @generated
	 * @ordered
	 */
	protected EList<Metamodel> targetMetamodels;

	/**
	 * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected EList<Rule> rules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RubyTLPackage.Literals.TRANSFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RubyTLPackage.TRANSFORMATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Metamodel> getSourceMetamodels() {
		if (sourceMetamodels == null) {
			sourceMetamodels = new EObjectContainmentEList<Metamodel>(Metamodel.class, this, RubyTLPackage.TRANSFORMATION__SOURCE_METAMODELS);
		}
		return sourceMetamodels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Metamodel> getTargetMetamodels() {
		if (targetMetamodels == null) {
			targetMetamodels = new EObjectContainmentEList<Metamodel>(Metamodel.class, this, RubyTLPackage.TRANSFORMATION__TARGET_METAMODELS);
		}
		return targetMetamodels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rule> getRules() {
		if (rules == null) {
			rules = new EObjectContainmentEList<Rule>(Rule.class, this, RubyTLPackage.TRANSFORMATION__RULES);
		}
		return rules;
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
			case RubyTLPackage.TRANSFORMATION__SOURCE_METAMODELS:
				return ((InternalEList<?>)getSourceMetamodels()).basicRemove(otherEnd, msgs);
			case RubyTLPackage.TRANSFORMATION__TARGET_METAMODELS:
				return ((InternalEList<?>)getTargetMetamodels()).basicRemove(otherEnd, msgs);
			case RubyTLPackage.TRANSFORMATION__RULES:
				return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
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
			case RubyTLPackage.TRANSFORMATION__NAME:
				return getName();
			case RubyTLPackage.TRANSFORMATION__SOURCE_METAMODELS:
				return getSourceMetamodels();
			case RubyTLPackage.TRANSFORMATION__TARGET_METAMODELS:
				return getTargetMetamodels();
			case RubyTLPackage.TRANSFORMATION__RULES:
				return getRules();
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
			case RubyTLPackage.TRANSFORMATION__NAME:
				setName((String)newValue);
				return;
			case RubyTLPackage.TRANSFORMATION__SOURCE_METAMODELS:
				getSourceMetamodels().clear();
				getSourceMetamodels().addAll((Collection<? extends Metamodel>)newValue);
				return;
			case RubyTLPackage.TRANSFORMATION__TARGET_METAMODELS:
				getTargetMetamodels().clear();
				getTargetMetamodels().addAll((Collection<? extends Metamodel>)newValue);
				return;
			case RubyTLPackage.TRANSFORMATION__RULES:
				getRules().clear();
				getRules().addAll((Collection<? extends Rule>)newValue);
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
			case RubyTLPackage.TRANSFORMATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RubyTLPackage.TRANSFORMATION__SOURCE_METAMODELS:
				getSourceMetamodels().clear();
				return;
			case RubyTLPackage.TRANSFORMATION__TARGET_METAMODELS:
				getTargetMetamodels().clear();
				return;
			case RubyTLPackage.TRANSFORMATION__RULES:
				getRules().clear();
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
			case RubyTLPackage.TRANSFORMATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RubyTLPackage.TRANSFORMATION__SOURCE_METAMODELS:
				return sourceMetamodels != null && !sourceMetamodels.isEmpty();
			case RubyTLPackage.TRANSFORMATION__TARGET_METAMODELS:
				return targetMetamodels != null && !targetMetamodels.isEmpty();
			case RubyTLPackage.TRANSFORMATION__RULES:
				return rules != null && !rules.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TransformationImpl
