/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ETL.impl;

import ETL.ETLPackage;
import ETL.Element;
import ETL.TransformationRule;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ETL.impl.ElementImpl#getClassName <em>Class Name</em>}</li>
 *   <li>{@link ETL.impl.ElementImpl#getMetamodel <em>Metamodel</em>}</li>
 *   <li>{@link ETL.impl.ElementImpl#getSource_rule <em>Source rule</em>}</li>
 *   <li>{@link ETL.impl.ElementImpl#getTargets_rule <em>Targets rule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementImpl extends EtlElementImpl implements Element {
	/**
	 * The default value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected String className = CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMetamodel() <em>Metamodel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetamodel()
	 * @generated
	 * @ordered
	 */
	protected static final String METAMODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetamodel() <em>Metamodel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetamodel()
	 * @generated
	 * @ordered
	 */
	protected String metamodel = METAMODEL_EDEFAULT;

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
		return ETLPackage.Literals.ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassName(String newClassName) {
		String oldClassName = className;
		className = newClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ETLPackage.ELEMENT__CLASS_NAME, oldClassName, className));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMetamodel() {
		return metamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetamodel(String newMetamodel) {
		String oldMetamodel = metamodel;
		metamodel = newMetamodel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ETLPackage.ELEMENT__METAMODEL, oldMetamodel, metamodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationRule getSource_rule() {
		if (eContainerFeatureID() != ETLPackage.ELEMENT__SOURCE_RULE) return null;
		return (TransformationRule)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource_rule(TransformationRule newSource_rule, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSource_rule, ETLPackage.ELEMENT__SOURCE_RULE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource_rule(TransformationRule newSource_rule) {
		if (newSource_rule != eInternalContainer() || (eContainerFeatureID() != ETLPackage.ELEMENT__SOURCE_RULE && newSource_rule != null)) {
			if (EcoreUtil.isAncestor(this, newSource_rule))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSource_rule != null)
				msgs = ((InternalEObject)newSource_rule).eInverseAdd(this, ETLPackage.TRANSFORMATION_RULE__SOURCE, TransformationRule.class, msgs);
			msgs = basicSetSource_rule(newSource_rule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ETLPackage.ELEMENT__SOURCE_RULE, newSource_rule, newSource_rule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationRule getTargets_rule() {
		if (eContainerFeatureID() != ETLPackage.ELEMENT__TARGETS_RULE) return null;
		return (TransformationRule)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargets_rule(TransformationRule newTargets_rule, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTargets_rule, ETLPackage.ELEMENT__TARGETS_RULE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargets_rule(TransformationRule newTargets_rule) {
		if (newTargets_rule != eInternalContainer() || (eContainerFeatureID() != ETLPackage.ELEMENT__TARGETS_RULE && newTargets_rule != null)) {
			if (EcoreUtil.isAncestor(this, newTargets_rule))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTargets_rule != null)
				msgs = ((InternalEObject)newTargets_rule).eInverseAdd(this, ETLPackage.TRANSFORMATION_RULE__TARGETS, TransformationRule.class, msgs);
			msgs = basicSetTargets_rule(newTargets_rule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ETLPackage.ELEMENT__TARGETS_RULE, newTargets_rule, newTargets_rule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ETLPackage.ELEMENT__SOURCE_RULE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSource_rule((TransformationRule)otherEnd, msgs);
			case ETLPackage.ELEMENT__TARGETS_RULE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTargets_rule((TransformationRule)otherEnd, msgs);
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
			case ETLPackage.ELEMENT__SOURCE_RULE:
				return basicSetSource_rule(null, msgs);
			case ETLPackage.ELEMENT__TARGETS_RULE:
				return basicSetTargets_rule(null, msgs);
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
			case ETLPackage.ELEMENT__SOURCE_RULE:
				return eInternalContainer().eInverseRemove(this, ETLPackage.TRANSFORMATION_RULE__SOURCE, TransformationRule.class, msgs);
			case ETLPackage.ELEMENT__TARGETS_RULE:
				return eInternalContainer().eInverseRemove(this, ETLPackage.TRANSFORMATION_RULE__TARGETS, TransformationRule.class, msgs);
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
			case ETLPackage.ELEMENT__CLASS_NAME:
				return getClassName();
			case ETLPackage.ELEMENT__METAMODEL:
				return getMetamodel();
			case ETLPackage.ELEMENT__SOURCE_RULE:
				return getSource_rule();
			case ETLPackage.ELEMENT__TARGETS_RULE:
				return getTargets_rule();
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
			case ETLPackage.ELEMENT__CLASS_NAME:
				setClassName((String)newValue);
				return;
			case ETLPackage.ELEMENT__METAMODEL:
				setMetamodel((String)newValue);
				return;
			case ETLPackage.ELEMENT__SOURCE_RULE:
				setSource_rule((TransformationRule)newValue);
				return;
			case ETLPackage.ELEMENT__TARGETS_RULE:
				setTargets_rule((TransformationRule)newValue);
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
			case ETLPackage.ELEMENT__CLASS_NAME:
				setClassName(CLASS_NAME_EDEFAULT);
				return;
			case ETLPackage.ELEMENT__METAMODEL:
				setMetamodel(METAMODEL_EDEFAULT);
				return;
			case ETLPackage.ELEMENT__SOURCE_RULE:
				setSource_rule((TransformationRule)null);
				return;
			case ETLPackage.ELEMENT__TARGETS_RULE:
				setTargets_rule((TransformationRule)null);
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
			case ETLPackage.ELEMENT__CLASS_NAME:
				return CLASS_NAME_EDEFAULT == null ? className != null : !CLASS_NAME_EDEFAULT.equals(className);
			case ETLPackage.ELEMENT__METAMODEL:
				return METAMODEL_EDEFAULT == null ? metamodel != null : !METAMODEL_EDEFAULT.equals(metamodel);
			case ETLPackage.ELEMENT__SOURCE_RULE:
				return getSource_rule() != null;
			case ETLPackage.ELEMENT__TARGETS_RULE:
				return getTargets_rule() != null;
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
		result.append(" (className: ");
		result.append(className);
		result.append(", metamodel: ");
		result.append(metamodel);
		result.append(')');
		return result.toString();
	}

} //ElementImpl
