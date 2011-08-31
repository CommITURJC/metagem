/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hybrid.impl;

import hybrid.HybridPackage;
import hybrid.ModelComponent;
import hybrid.Module;
import hybrid.Operation;
import hybrid.Return;
import hybrid.RightPattern;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hybrid.impl.OperationImpl#getModule <em>Module</em>}</li>
 *   <li>{@link hybrid.impl.OperationImpl#getBody <em>Body</em>}</li>
 *   <li>{@link hybrid.impl.OperationImpl#getReturn <em>Return</em>}</li>
 *   <li>{@link hybrid.impl.OperationImpl#getRightPattern <em>Right Pattern</em>}</li>
 *   <li>{@link hybrid.impl.OperationImpl#getContext <em>Context</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationImpl extends HybridElementImpl implements Operation {
	/**
	 * The default value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected String body = BODY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReturn() <em>Return</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturn()
	 * @generated
	 * @ordered
	 */
	protected Return return_;

	/**
	 * The cached value of the '{@link #getRightPattern() <em>Right Pattern</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightPattern()
	 * @generated
	 * @ordered
	 */
	protected RightPattern rightPattern;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected ModelComponent context;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HybridPackage.Literals.OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module getModule() {
		if (eContainerFeatureID() != HybridPackage.OPERATION__MODULE) return null;
		return (Module)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModule(Module newModule, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newModule, HybridPackage.OPERATION__MODULE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModule(Module newModule) {
		if (newModule != eInternalContainer() || (eContainerFeatureID() != HybridPackage.OPERATION__MODULE && newModule != null)) {
			if (EcoreUtil.isAncestor(this, newModule))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModule != null)
				msgs = ((InternalEObject)newModule).eInverseAdd(this, HybridPackage.MODULE__OPERATIONS, Module.class, msgs);
			msgs = basicSetModule(newModule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HybridPackage.OPERATION__MODULE, newModule, newModule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(String newBody) {
		String oldBody = body;
		body = newBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HybridPackage.OPERATION__BODY, oldBody, body));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Return getReturn() {
		return return_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturn(Return newReturn, NotificationChain msgs) {
		Return oldReturn = return_;
		return_ = newReturn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HybridPackage.OPERATION__RETURN, oldReturn, newReturn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturn(Return newReturn) {
		if (newReturn != return_) {
			NotificationChain msgs = null;
			if (return_ != null)
				msgs = ((InternalEObject)return_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HybridPackage.OPERATION__RETURN, null, msgs);
			if (newReturn != null)
				msgs = ((InternalEObject)newReturn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HybridPackage.OPERATION__RETURN, null, msgs);
			msgs = basicSetReturn(newReturn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HybridPackage.OPERATION__RETURN, newReturn, newReturn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RightPattern getRightPattern() {
		if (rightPattern != null && rightPattern.eIsProxy()) {
			InternalEObject oldRightPattern = (InternalEObject)rightPattern;
			rightPattern = (RightPattern)eResolveProxy(oldRightPattern);
			if (rightPattern != oldRightPattern) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HybridPackage.OPERATION__RIGHT_PATTERN, oldRightPattern, rightPattern));
			}
		}
		return rightPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RightPattern basicGetRightPattern() {
		return rightPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightPattern(RightPattern newRightPattern, NotificationChain msgs) {
		RightPattern oldRightPattern = rightPattern;
		rightPattern = newRightPattern;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HybridPackage.OPERATION__RIGHT_PATTERN, oldRightPattern, newRightPattern);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightPattern(RightPattern newRightPattern) {
		if (newRightPattern != rightPattern) {
			NotificationChain msgs = null;
			if (rightPattern != null)
				msgs = ((InternalEObject)rightPattern).eInverseRemove(this, HybridPackage.RIGHT_PATTERN__OPERATION, RightPattern.class, msgs);
			if (newRightPattern != null)
				msgs = ((InternalEObject)newRightPattern).eInverseAdd(this, HybridPackage.RIGHT_PATTERN__OPERATION, RightPattern.class, msgs);
			msgs = basicSetRightPattern(newRightPattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HybridPackage.OPERATION__RIGHT_PATTERN, newRightPattern, newRightPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelComponent getContext() {
		if (context != null && context.eIsProxy()) {
			InternalEObject oldContext = (InternalEObject)context;
			context = (ModelComponent)eResolveProxy(oldContext);
			if (context != oldContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HybridPackage.OPERATION__CONTEXT, oldContext, context));
			}
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelComponent basicGetContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(ModelComponent newContext) {
		ModelComponent oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HybridPackage.OPERATION__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HybridPackage.OPERATION__MODULE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetModule((Module)otherEnd, msgs);
			case HybridPackage.OPERATION__RIGHT_PATTERN:
				if (rightPattern != null)
					msgs = ((InternalEObject)rightPattern).eInverseRemove(this, HybridPackage.RIGHT_PATTERN__OPERATION, RightPattern.class, msgs);
				return basicSetRightPattern((RightPattern)otherEnd, msgs);
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
			case HybridPackage.OPERATION__MODULE:
				return basicSetModule(null, msgs);
			case HybridPackage.OPERATION__RETURN:
				return basicSetReturn(null, msgs);
			case HybridPackage.OPERATION__RIGHT_PATTERN:
				return basicSetRightPattern(null, msgs);
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
			case HybridPackage.OPERATION__MODULE:
				return eInternalContainer().eInverseRemove(this, HybridPackage.MODULE__OPERATIONS, Module.class, msgs);
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
			case HybridPackage.OPERATION__MODULE:
				return getModule();
			case HybridPackage.OPERATION__BODY:
				return getBody();
			case HybridPackage.OPERATION__RETURN:
				return getReturn();
			case HybridPackage.OPERATION__RIGHT_PATTERN:
				if (resolve) return getRightPattern();
				return basicGetRightPattern();
			case HybridPackage.OPERATION__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
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
			case HybridPackage.OPERATION__MODULE:
				setModule((Module)newValue);
				return;
			case HybridPackage.OPERATION__BODY:
				setBody((String)newValue);
				return;
			case HybridPackage.OPERATION__RETURN:
				setReturn((Return)newValue);
				return;
			case HybridPackage.OPERATION__RIGHT_PATTERN:
				setRightPattern((RightPattern)newValue);
				return;
			case HybridPackage.OPERATION__CONTEXT:
				setContext((ModelComponent)newValue);
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
			case HybridPackage.OPERATION__MODULE:
				setModule((Module)null);
				return;
			case HybridPackage.OPERATION__BODY:
				setBody(BODY_EDEFAULT);
				return;
			case HybridPackage.OPERATION__RETURN:
				setReturn((Return)null);
				return;
			case HybridPackage.OPERATION__RIGHT_PATTERN:
				setRightPattern((RightPattern)null);
				return;
			case HybridPackage.OPERATION__CONTEXT:
				setContext((ModelComponent)null);
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
			case HybridPackage.OPERATION__MODULE:
				return getModule() != null;
			case HybridPackage.OPERATION__BODY:
				return BODY_EDEFAULT == null ? body != null : !BODY_EDEFAULT.equals(body);
			case HybridPackage.OPERATION__RETURN:
				return return_ != null;
			case HybridPackage.OPERATION__RIGHT_PATTERN:
				return rightPattern != null;
			case HybridPackage.OPERATION__CONTEXT:
				return context != null;
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
		result.append(" (body: ");
		result.append(body);
		result.append(')');
		return result.toString();
	}

} //OperationImpl
