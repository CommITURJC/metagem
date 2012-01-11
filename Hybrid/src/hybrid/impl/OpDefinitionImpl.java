/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hybrid.impl;

import hybrid.Datatype;
import hybrid.HybridPackage;
import hybrid.OpDefinition;
import hybrid.Operation;
import hybrid.TransformationElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Op Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hybrid.impl.OpDefinitionImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link hybrid.impl.OpDefinitionImpl#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link hybrid.impl.OpDefinitionImpl#getContext_op <em>Context op</em>}</li>
 *   <li>{@link hybrid.impl.OpDefinitionImpl#getReturn_op <em>Return op</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OpDefinitionImpl extends EObjectImpl implements OpDefinition {
	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected TransformationElement component;

	/**
	 * The default value of the '{@link #getDatatype() <em>Datatype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatatype()
	 * @generated
	 * @ordered
	 */
	protected static final Datatype DATATYPE_EDEFAULT = Datatype.NULL;
	/**
	 * The cached value of the '{@link #getDatatype() <em>Datatype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatatype()
	 * @generated
	 * @ordered
	 */
	protected Datatype datatype = DATATYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HybridPackage.Literals.OP_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationElement getComponent() {
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponent(TransformationElement newComponent, NotificationChain msgs) {
		TransformationElement oldComponent = component;
		component = newComponent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HybridPackage.OP_DEFINITION__COMPONENT, oldComponent, newComponent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponent(TransformationElement newComponent) {
		if (newComponent != component) {
			NotificationChain msgs = null;
			if (component != null)
				msgs = ((InternalEObject)component).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HybridPackage.OP_DEFINITION__COMPONENT, null, msgs);
			if (newComponent != null)
				msgs = ((InternalEObject)newComponent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HybridPackage.OP_DEFINITION__COMPONENT, null, msgs);
			msgs = basicSetComponent(newComponent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HybridPackage.OP_DEFINITION__COMPONENT, newComponent, newComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datatype getDatatype() {
		return datatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatatype(Datatype newDatatype) {
		Datatype oldDatatype = datatype;
		datatype = newDatatype == null ? DATATYPE_EDEFAULT : newDatatype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HybridPackage.OP_DEFINITION__DATATYPE, oldDatatype, datatype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getContext_op() {
		if (eContainerFeatureID() != HybridPackage.OP_DEFINITION__CONTEXT_OP) return null;
		return (Operation)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContext_op(Operation newContext_op, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContext_op, HybridPackage.OP_DEFINITION__CONTEXT_OP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext_op(Operation newContext_op) {
		if (newContext_op != eInternalContainer() || (eContainerFeatureID() != HybridPackage.OP_DEFINITION__CONTEXT_OP && newContext_op != null)) {
			if (EcoreUtil.isAncestor(this, newContext_op))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContext_op != null)
				msgs = ((InternalEObject)newContext_op).eInverseAdd(this, HybridPackage.OPERATION__CONTEXT, Operation.class, msgs);
			msgs = basicSetContext_op(newContext_op, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HybridPackage.OP_DEFINITION__CONTEXT_OP, newContext_op, newContext_op));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getReturn_op() {
		if (eContainerFeatureID() != HybridPackage.OP_DEFINITION__RETURN_OP) return null;
		return (Operation)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturn_op(Operation newReturn_op, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newReturn_op, HybridPackage.OP_DEFINITION__RETURN_OP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturn_op(Operation newReturn_op) {
		if (newReturn_op != eInternalContainer() || (eContainerFeatureID() != HybridPackage.OP_DEFINITION__RETURN_OP && newReturn_op != null)) {
			if (EcoreUtil.isAncestor(this, newReturn_op))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newReturn_op != null)
				msgs = ((InternalEObject)newReturn_op).eInverseAdd(this, HybridPackage.OPERATION__RETURN, Operation.class, msgs);
			msgs = basicSetReturn_op(newReturn_op, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HybridPackage.OP_DEFINITION__RETURN_OP, newReturn_op, newReturn_op));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HybridPackage.OP_DEFINITION__CONTEXT_OP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContext_op((Operation)otherEnd, msgs);
			case HybridPackage.OP_DEFINITION__RETURN_OP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetReturn_op((Operation)otherEnd, msgs);
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
			case HybridPackage.OP_DEFINITION__COMPONENT:
				return basicSetComponent(null, msgs);
			case HybridPackage.OP_DEFINITION__CONTEXT_OP:
				return basicSetContext_op(null, msgs);
			case HybridPackage.OP_DEFINITION__RETURN_OP:
				return basicSetReturn_op(null, msgs);
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
			case HybridPackage.OP_DEFINITION__CONTEXT_OP:
				return eInternalContainer().eInverseRemove(this, HybridPackage.OPERATION__CONTEXT, Operation.class, msgs);
			case HybridPackage.OP_DEFINITION__RETURN_OP:
				return eInternalContainer().eInverseRemove(this, HybridPackage.OPERATION__RETURN, Operation.class, msgs);
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
			case HybridPackage.OP_DEFINITION__COMPONENT:
				return getComponent();
			case HybridPackage.OP_DEFINITION__DATATYPE:
				return getDatatype();
			case HybridPackage.OP_DEFINITION__CONTEXT_OP:
				return getContext_op();
			case HybridPackage.OP_DEFINITION__RETURN_OP:
				return getReturn_op();
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
			case HybridPackage.OP_DEFINITION__COMPONENT:
				setComponent((TransformationElement)newValue);
				return;
			case HybridPackage.OP_DEFINITION__DATATYPE:
				setDatatype((Datatype)newValue);
				return;
			case HybridPackage.OP_DEFINITION__CONTEXT_OP:
				setContext_op((Operation)newValue);
				return;
			case HybridPackage.OP_DEFINITION__RETURN_OP:
				setReturn_op((Operation)newValue);
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
			case HybridPackage.OP_DEFINITION__COMPONENT:
				setComponent((TransformationElement)null);
				return;
			case HybridPackage.OP_DEFINITION__DATATYPE:
				setDatatype(DATATYPE_EDEFAULT);
				return;
			case HybridPackage.OP_DEFINITION__CONTEXT_OP:
				setContext_op((Operation)null);
				return;
			case HybridPackage.OP_DEFINITION__RETURN_OP:
				setReturn_op((Operation)null);
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
			case HybridPackage.OP_DEFINITION__COMPONENT:
				return component != null;
			case HybridPackage.OP_DEFINITION__DATATYPE:
				return datatype != DATATYPE_EDEFAULT;
			case HybridPackage.OP_DEFINITION__CONTEXT_OP:
				return getContext_op() != null;
			case HybridPackage.OP_DEFINITION__RETURN_OP:
				return getReturn_op() != null;
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
		result.append(" (datatype: ");
		result.append(datatype);
		result.append(')');
		return result.toString();
	}

} //OpDefinitionImpl
