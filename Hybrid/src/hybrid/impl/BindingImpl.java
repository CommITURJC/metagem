/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hybrid.impl;

import hybrid.Binding;
import hybrid.HybridPackage;
import hybrid.LeftPattern;
import hybrid.RightPattern;
import hybrid.Target;
import hybrid.TraceBinding;
import hybrid.TypeElement;
import hybrid.TypeRelation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hybrid.impl.BindingImpl#getOwned <em>Owned</em>}</li>
 *   <li>{@link hybrid.impl.BindingImpl#getRight <em>Right</em>}</li>
 *   <li>{@link hybrid.impl.BindingImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link hybrid.impl.BindingImpl#getTypeRelation <em>Type Relation</em>}</li>
 *   <li>{@link hybrid.impl.BindingImpl#getTypeElement <em>Type Element</em>}</li>
 *   <li>{@link hybrid.impl.BindingImpl#getTrace <em>Trace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BindingImpl extends EObjectImpl implements Binding {
	/**
	 * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected RightPattern right;

	/**
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected LeftPattern left;

	/**
	 * The default value of the '{@link #getTypeRelation() <em>Type Relation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeRelation()
	 * @generated
	 * @ordered
	 */
	protected static final TypeRelation TYPE_RELATION_EDEFAULT = TypeRelation.COPY;

	/**
	 * The cached value of the '{@link #getTypeRelation() <em>Type Relation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeRelation()
	 * @generated
	 * @ordered
	 */
	protected TypeRelation typeRelation = TYPE_RELATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeElement() <em>Type Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeElement()
	 * @generated
	 * @ordered
	 */
	protected static final TypeElement TYPE_ELEMENT_EDEFAULT = TypeElement.ECLASSIFIER;

	/**
	 * The cached value of the '{@link #getTypeElement() <em>Type Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeElement()
	 * @generated
	 * @ordered
	 */
	protected TypeElement typeElement = TYPE_ELEMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTrace() <em>Trace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrace()
	 * @generated
	 * @ordered
	 */
	protected TraceBinding trace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HybridPackage.Literals.BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Target getOwned() {
		if (eContainerFeatureID() != HybridPackage.BINDING__OWNED) return null;
		return (Target)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwned(Target newOwned, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwned, HybridPackage.BINDING__OWNED, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwned(Target newOwned) {
		if (newOwned != eInternalContainer() || (eContainerFeatureID() != HybridPackage.BINDING__OWNED && newOwned != null)) {
			if (EcoreUtil.isAncestor(this, newOwned))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwned != null)
				msgs = ((InternalEObject)newOwned).eInverseAdd(this, HybridPackage.TARGET__BINDINGS, Target.class, msgs);
			msgs = basicSetOwned(newOwned, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HybridPackage.BINDING__OWNED, newOwned, newOwned));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RightPattern getRight() {
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRight(RightPattern newRight, NotificationChain msgs) {
		RightPattern oldRight = right;
		right = newRight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HybridPackage.BINDING__RIGHT, oldRight, newRight);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRight(RightPattern newRight) {
		if (newRight != right) {
			NotificationChain msgs = null;
			if (right != null)
				msgs = ((InternalEObject)right).eInverseRemove(this, HybridPackage.RIGHT_PATTERN__BINDING, RightPattern.class, msgs);
			if (newRight != null)
				msgs = ((InternalEObject)newRight).eInverseAdd(this, HybridPackage.RIGHT_PATTERN__BINDING, RightPattern.class, msgs);
			msgs = basicSetRight(newRight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HybridPackage.BINDING__RIGHT, newRight, newRight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeftPattern getLeft() {
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeft(LeftPattern newLeft, NotificationChain msgs) {
		LeftPattern oldLeft = left;
		left = newLeft;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HybridPackage.BINDING__LEFT, oldLeft, newLeft);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeft(LeftPattern newLeft) {
		if (newLeft != left) {
			NotificationChain msgs = null;
			if (left != null)
				msgs = ((InternalEObject)left).eInverseRemove(this, HybridPackage.LEFT_PATTERN__BINDING, LeftPattern.class, msgs);
			if (newLeft != null)
				msgs = ((InternalEObject)newLeft).eInverseAdd(this, HybridPackage.LEFT_PATTERN__BINDING, LeftPattern.class, msgs);
			msgs = basicSetLeft(newLeft, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HybridPackage.BINDING__LEFT, newLeft, newLeft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeRelation getTypeRelation() {
		return typeRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeRelation(TypeRelation newTypeRelation) {
		TypeRelation oldTypeRelation = typeRelation;
		typeRelation = newTypeRelation == null ? TYPE_RELATION_EDEFAULT : newTypeRelation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HybridPackage.BINDING__TYPE_RELATION, oldTypeRelation, typeRelation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeElement getTypeElement() {
		return typeElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeElement(TypeElement newTypeElement) {
		TypeElement oldTypeElement = typeElement;
		typeElement = newTypeElement == null ? TYPE_ELEMENT_EDEFAULT : newTypeElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HybridPackage.BINDING__TYPE_ELEMENT, oldTypeElement, typeElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceBinding getTrace() {
		if (trace != null && trace.eIsProxy()) {
			InternalEObject oldTrace = (InternalEObject)trace;
			trace = (TraceBinding)eResolveProxy(oldTrace);
			if (trace != oldTrace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HybridPackage.BINDING__TRACE, oldTrace, trace));
			}
		}
		return trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceBinding basicGetTrace() {
		return trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrace(TraceBinding newTrace, NotificationChain msgs) {
		TraceBinding oldTrace = trace;
		trace = newTrace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HybridPackage.BINDING__TRACE, oldTrace, newTrace);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrace(TraceBinding newTrace) {
		if (newTrace != trace) {
			NotificationChain msgs = null;
			if (trace != null)
				msgs = ((InternalEObject)trace).eInverseRemove(this, HybridPackage.TRACE_BINDING__BINDING, TraceBinding.class, msgs);
			if (newTrace != null)
				msgs = ((InternalEObject)newTrace).eInverseAdd(this, HybridPackage.TRACE_BINDING__BINDING, TraceBinding.class, msgs);
			msgs = basicSetTrace(newTrace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HybridPackage.BINDING__TRACE, newTrace, newTrace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HybridPackage.BINDING__OWNED:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwned((Target)otherEnd, msgs);
			case HybridPackage.BINDING__RIGHT:
				if (right != null)
					msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HybridPackage.BINDING__RIGHT, null, msgs);
				return basicSetRight((RightPattern)otherEnd, msgs);
			case HybridPackage.BINDING__LEFT:
				if (left != null)
					msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HybridPackage.BINDING__LEFT, null, msgs);
				return basicSetLeft((LeftPattern)otherEnd, msgs);
			case HybridPackage.BINDING__TRACE:
				if (trace != null)
					msgs = ((InternalEObject)trace).eInverseRemove(this, HybridPackage.TRACE_BINDING__BINDING, TraceBinding.class, msgs);
				return basicSetTrace((TraceBinding)otherEnd, msgs);
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
			case HybridPackage.BINDING__OWNED:
				return basicSetOwned(null, msgs);
			case HybridPackage.BINDING__RIGHT:
				return basicSetRight(null, msgs);
			case HybridPackage.BINDING__LEFT:
				return basicSetLeft(null, msgs);
			case HybridPackage.BINDING__TRACE:
				return basicSetTrace(null, msgs);
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
			case HybridPackage.BINDING__OWNED:
				return eInternalContainer().eInverseRemove(this, HybridPackage.TARGET__BINDINGS, Target.class, msgs);
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
			case HybridPackage.BINDING__OWNED:
				return getOwned();
			case HybridPackage.BINDING__RIGHT:
				return getRight();
			case HybridPackage.BINDING__LEFT:
				return getLeft();
			case HybridPackage.BINDING__TYPE_RELATION:
				return getTypeRelation();
			case HybridPackage.BINDING__TYPE_ELEMENT:
				return getTypeElement();
			case HybridPackage.BINDING__TRACE:
				if (resolve) return getTrace();
				return basicGetTrace();
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
			case HybridPackage.BINDING__OWNED:
				setOwned((Target)newValue);
				return;
			case HybridPackage.BINDING__RIGHT:
				setRight((RightPattern)newValue);
				return;
			case HybridPackage.BINDING__LEFT:
				setLeft((LeftPattern)newValue);
				return;
			case HybridPackage.BINDING__TYPE_RELATION:
				setTypeRelation((TypeRelation)newValue);
				return;
			case HybridPackage.BINDING__TYPE_ELEMENT:
				setTypeElement((TypeElement)newValue);
				return;
			case HybridPackage.BINDING__TRACE:
				setTrace((TraceBinding)newValue);
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
			case HybridPackage.BINDING__OWNED:
				setOwned((Target)null);
				return;
			case HybridPackage.BINDING__RIGHT:
				setRight((RightPattern)null);
				return;
			case HybridPackage.BINDING__LEFT:
				setLeft((LeftPattern)null);
				return;
			case HybridPackage.BINDING__TYPE_RELATION:
				setTypeRelation(TYPE_RELATION_EDEFAULT);
				return;
			case HybridPackage.BINDING__TYPE_ELEMENT:
				setTypeElement(TYPE_ELEMENT_EDEFAULT);
				return;
			case HybridPackage.BINDING__TRACE:
				setTrace((TraceBinding)null);
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
			case HybridPackage.BINDING__OWNED:
				return getOwned() != null;
			case HybridPackage.BINDING__RIGHT:
				return right != null;
			case HybridPackage.BINDING__LEFT:
				return left != null;
			case HybridPackage.BINDING__TYPE_RELATION:
				return typeRelation != TYPE_RELATION_EDEFAULT;
			case HybridPackage.BINDING__TYPE_ELEMENT:
				return typeElement != TYPE_ELEMENT_EDEFAULT;
			case HybridPackage.BINDING__TRACE:
				return trace != null;
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
		result.append(" (typeRelation: ");
		result.append(typeRelation);
		result.append(", typeElement: ");
		result.append(typeElement);
		result.append(')');
		return result.toString();
	}

} //BindingImpl
