/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm_hybrid.impl;

import java.util.Collection;

import mm_hybrid.Element;
import mm_hybrid.ElementIncluded;
import mm_hybrid.LeftPattern;
import mm_hybrid.MM_HybridPackage;

import mm_hybrid.RightPattern;
import mm_hybrid.SourceElementRule;
import mm_hybrid.TargetElementRule;
import mm_hybrid.TypeAtribute;
import mm_hybrid.TypeElem;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Included</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mm_hybrid.impl.ElementIncludedImpl#getTypeAttribute <em>Type Attribute</em>}</li>
 *   <li>{@link mm_hybrid.impl.ElementIncludedImpl#getTypeElement <em>Type Element</em>}</li>
 *   <li>{@link mm_hybrid.impl.ElementIncludedImpl#getRight <em>Right</em>}</li>
 *   <li>{@link mm_hybrid.impl.ElementIncludedImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link mm_hybrid.impl.ElementIncludedImpl#getTargetElement <em>Target Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementIncludedImpl extends EObjectImpl implements ElementIncluded {
	/**
	 * The default value of the '{@link #getTypeAttribute() <em>Type Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final TypeAtribute TYPE_ATTRIBUTE_EDEFAULT = TypeAtribute.COPY;

	/**
	 * The cached value of the '{@link #getTypeAttribute() <em>Type Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAttribute()
	 * @generated
	 * @ordered
	 */
	protected TypeAtribute typeAttribute = TYPE_ATTRIBUTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeElement() <em>Type Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeElement()
	 * @generated
	 * @ordered
	 */
	protected static final TypeElem TYPE_ELEMENT_EDEFAULT = TypeElem.MY_ECLASSIFIER;

	/**
	 * The cached value of the '{@link #getTypeElement() <em>Type Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeElement()
	 * @generated
	 * @ordered
	 */
	protected TypeElem typeElement = TYPE_ELEMENT_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementIncludedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MM_HybridPackage.Literals.ELEMENT_INCLUDED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAtribute getTypeAttribute() {
		return typeAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeAttribute(TypeAtribute newTypeAttribute) {
		TypeAtribute oldTypeAttribute = typeAttribute;
		typeAttribute = newTypeAttribute == null ? TYPE_ATTRIBUTE_EDEFAULT
				: newTypeAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MM_HybridPackage.ELEMENT_INCLUDED__TYPE_ATTRIBUTE,
					oldTypeAttribute, typeAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeElem getTypeElement() {
		return typeElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeElement(TypeElem newTypeElement) {
		TypeElem oldTypeElement = typeElement;
		typeElement = newTypeElement == null ? TYPE_ELEMENT_EDEFAULT
				: newTypeElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MM_HybridPackage.ELEMENT_INCLUDED__TYPE_ELEMENT,
					oldTypeElement, typeElement));
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
	public NotificationChain basicSetRight(RightPattern newRight,
			NotificationChain msgs) {
		RightPattern oldRight = right;
		right = newRight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, MM_HybridPackage.ELEMENT_INCLUDED__RIGHT,
					oldRight, newRight);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
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
				msgs = ((InternalEObject) right).eInverseRemove(this,
						MM_HybridPackage.RIGHT_PATTERN__ELEMENT_INCLUDED,
						RightPattern.class, msgs);
			if (newRight != null)
				msgs = ((InternalEObject) newRight).eInverseAdd(this,
						MM_HybridPackage.RIGHT_PATTERN__ELEMENT_INCLUDED,
						RightPattern.class, msgs);
			msgs = basicSetRight(newRight, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MM_HybridPackage.ELEMENT_INCLUDED__RIGHT, newRight,
					newRight));
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
	public NotificationChain basicSetLeft(LeftPattern newLeft,
			NotificationChain msgs) {
		LeftPattern oldLeft = left;
		left = newLeft;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, MM_HybridPackage.ELEMENT_INCLUDED__LEFT,
					oldLeft, newLeft);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
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
				msgs = ((InternalEObject) left).eInverseRemove(this,
						MM_HybridPackage.LEFT_PATTERN__ELEMENT_INCLUDED,
						LeftPattern.class, msgs);
			if (newLeft != null)
				msgs = ((InternalEObject) newLeft).eInverseAdd(this,
						MM_HybridPackage.LEFT_PATTERN__ELEMENT_INCLUDED,
						LeftPattern.class, msgs);
			msgs = basicSetLeft(newLeft, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MM_HybridPackage.ELEMENT_INCLUDED__LEFT, newLeft, newLeft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetElementRule getTargetElement() {
		if (eContainerFeatureID != MM_HybridPackage.ELEMENT_INCLUDED__TARGET_ELEMENT)
			return null;
		return (TargetElementRule) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetElement(
			TargetElementRule newTargetElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newTargetElement,
				MM_HybridPackage.ELEMENT_INCLUDED__TARGET_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetElement(TargetElementRule newTargetElement) {
		if (newTargetElement != eInternalContainer()
				|| (eContainerFeatureID != MM_HybridPackage.ELEMENT_INCLUDED__TARGET_ELEMENT && newTargetElement != null)) {
			if (EcoreUtil.isAncestor(this, newTargetElement))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTargetElement != null)
				msgs = ((InternalEObject) newTargetElement).eInverseAdd(this,
						MM_HybridPackage.TARGET_ELEMENT_RULE__INCLUDED,
						TargetElementRule.class, msgs);
			msgs = basicSetTargetElement(newTargetElement, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MM_HybridPackage.ELEMENT_INCLUDED__TARGET_ELEMENT,
					newTargetElement, newTargetElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MM_HybridPackage.ELEMENT_INCLUDED__RIGHT:
			if (right != null)
				msgs = ((InternalEObject) right).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- MM_HybridPackage.ELEMENT_INCLUDED__RIGHT,
						null, msgs);
			return basicSetRight((RightPattern) otherEnd, msgs);
		case MM_HybridPackage.ELEMENT_INCLUDED__LEFT:
			if (left != null)
				msgs = ((InternalEObject) left).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- MM_HybridPackage.ELEMENT_INCLUDED__LEFT,
						null, msgs);
			return basicSetLeft((LeftPattern) otherEnd, msgs);
		case MM_HybridPackage.ELEMENT_INCLUDED__TARGET_ELEMENT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetTargetElement((TargetElementRule) otherEnd, msgs);
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
		case MM_HybridPackage.ELEMENT_INCLUDED__RIGHT:
			return basicSetRight(null, msgs);
		case MM_HybridPackage.ELEMENT_INCLUDED__LEFT:
			return basicSetLeft(null, msgs);
		case MM_HybridPackage.ELEMENT_INCLUDED__TARGET_ELEMENT:
			return basicSetTargetElement(null, msgs);
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
		switch (eContainerFeatureID) {
		case MM_HybridPackage.ELEMENT_INCLUDED__TARGET_ELEMENT:
			return eInternalContainer().eInverseRemove(this,
					MM_HybridPackage.TARGET_ELEMENT_RULE__INCLUDED,
					TargetElementRule.class, msgs);
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
		case MM_HybridPackage.ELEMENT_INCLUDED__TYPE_ATTRIBUTE:
			return getTypeAttribute();
		case MM_HybridPackage.ELEMENT_INCLUDED__TYPE_ELEMENT:
			return getTypeElement();
		case MM_HybridPackage.ELEMENT_INCLUDED__RIGHT:
			return getRight();
		case MM_HybridPackage.ELEMENT_INCLUDED__LEFT:
			return getLeft();
		case MM_HybridPackage.ELEMENT_INCLUDED__TARGET_ELEMENT:
			return getTargetElement();
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
		case MM_HybridPackage.ELEMENT_INCLUDED__TYPE_ATTRIBUTE:
			setTypeAttribute((TypeAtribute) newValue);
			return;
		case MM_HybridPackage.ELEMENT_INCLUDED__TYPE_ELEMENT:
			setTypeElement((TypeElem) newValue);
			return;
		case MM_HybridPackage.ELEMENT_INCLUDED__RIGHT:
			setRight((RightPattern) newValue);
			return;
		case MM_HybridPackage.ELEMENT_INCLUDED__LEFT:
			setLeft((LeftPattern) newValue);
			return;
		case MM_HybridPackage.ELEMENT_INCLUDED__TARGET_ELEMENT:
			setTargetElement((TargetElementRule) newValue);
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
		case MM_HybridPackage.ELEMENT_INCLUDED__TYPE_ATTRIBUTE:
			setTypeAttribute(TYPE_ATTRIBUTE_EDEFAULT);
			return;
		case MM_HybridPackage.ELEMENT_INCLUDED__TYPE_ELEMENT:
			setTypeElement(TYPE_ELEMENT_EDEFAULT);
			return;
		case MM_HybridPackage.ELEMENT_INCLUDED__RIGHT:
			setRight((RightPattern) null);
			return;
		case MM_HybridPackage.ELEMENT_INCLUDED__LEFT:
			setLeft((LeftPattern) null);
			return;
		case MM_HybridPackage.ELEMENT_INCLUDED__TARGET_ELEMENT:
			setTargetElement((TargetElementRule) null);
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
		case MM_HybridPackage.ELEMENT_INCLUDED__TYPE_ATTRIBUTE:
			return typeAttribute != TYPE_ATTRIBUTE_EDEFAULT;
		case MM_HybridPackage.ELEMENT_INCLUDED__TYPE_ELEMENT:
			return typeElement != TYPE_ELEMENT_EDEFAULT;
		case MM_HybridPackage.ELEMENT_INCLUDED__RIGHT:
			return right != null;
		case MM_HybridPackage.ELEMENT_INCLUDED__LEFT:
			return left != null;
		case MM_HybridPackage.ELEMENT_INCLUDED__TARGET_ELEMENT:
			return getTargetElement() != null;
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
		result.append(" (typeAttribute: "); //$NON-NLS-1$
		result.append(typeAttribute);
		result.append(", typeElement: "); //$NON-NLS-1$
		result.append(typeElement);
		result.append(')');
		return result.toString();
	}

} //ElementIncludedImpl
