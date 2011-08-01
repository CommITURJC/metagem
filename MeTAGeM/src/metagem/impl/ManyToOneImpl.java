/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metagem.impl;

import java.util.Collection;

import metagem.ManyToOne;
import metagem.MetagemPackage;
import metagem.SourceElement;
import metagem.TargetElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Many To One</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link metagem.impl.ManyToOneImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link metagem.impl.ManyToOneImpl#getSource <em>Source</em>}</li>
 *   <li>{@link metagem.impl.ManyToOneImpl#getOwnedElement <em>Owned Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ManyToOneImpl extends RelationsImpl implements ManyToOne {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected TargetElement target;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceElement> source;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManyToOneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetagemPackage.Literals.MANY_TO_ONE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetElement getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(TargetElement newTarget, NotificationChain msgs) {
		TargetElement oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetagemPackage.MANY_TO_ONE__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(TargetElement newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetagemPackage.MANY_TO_ONE__TARGET, null, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetagemPackage.MANY_TO_ONE__TARGET, null, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetagemPackage.MANY_TO_ONE__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceElement> getSource() {
		if (source == null) {
			source = new EObjectContainmentEList<SourceElement>(SourceElement.class, this, MetagemPackage.MANY_TO_ONE__SOURCE);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetElement getOwnedElement() {
		if (eContainerFeatureID() != MetagemPackage.MANY_TO_ONE__OWNED_ELEMENT) return null;
		return (TargetElement)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedElement(TargetElement newOwnedElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnedElement, MetagemPackage.MANY_TO_ONE__OWNED_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedElement(TargetElement newOwnedElement) {
		if (newOwnedElement != eInternalContainer() || (eContainerFeatureID() != MetagemPackage.MANY_TO_ONE__OWNED_ELEMENT && newOwnedElement != null)) {
			if (EcoreUtil.isAncestor(this, newOwnedElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedElement != null)
				msgs = ((InternalEObject)newOwnedElement).eInverseAdd(this, MetagemPackage.TARGET_ELEMENT__MANY_TO_ONE, TargetElement.class, msgs);
			msgs = basicSetOwnedElement(newOwnedElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetagemPackage.MANY_TO_ONE__OWNED_ELEMENT, newOwnedElement, newOwnedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetagemPackage.MANY_TO_ONE__OWNED_ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedElement((TargetElement)otherEnd, msgs);
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
			case MetagemPackage.MANY_TO_ONE__TARGET:
				return basicSetTarget(null, msgs);
			case MetagemPackage.MANY_TO_ONE__SOURCE:
				return ((InternalEList<?>)getSource()).basicRemove(otherEnd, msgs);
			case MetagemPackage.MANY_TO_ONE__OWNED_ELEMENT:
				return basicSetOwnedElement(null, msgs);
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
			case MetagemPackage.MANY_TO_ONE__OWNED_ELEMENT:
				return eInternalContainer().eInverseRemove(this, MetagemPackage.TARGET_ELEMENT__MANY_TO_ONE, TargetElement.class, msgs);
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
			case MetagemPackage.MANY_TO_ONE__TARGET:
				return getTarget();
			case MetagemPackage.MANY_TO_ONE__SOURCE:
				return getSource();
			case MetagemPackage.MANY_TO_ONE__OWNED_ELEMENT:
				return getOwnedElement();
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
			case MetagemPackage.MANY_TO_ONE__TARGET:
				setTarget((TargetElement)newValue);
				return;
			case MetagemPackage.MANY_TO_ONE__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends SourceElement>)newValue);
				return;
			case MetagemPackage.MANY_TO_ONE__OWNED_ELEMENT:
				setOwnedElement((TargetElement)newValue);
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
			case MetagemPackage.MANY_TO_ONE__TARGET:
				setTarget((TargetElement)null);
				return;
			case MetagemPackage.MANY_TO_ONE__SOURCE:
				getSource().clear();
				return;
			case MetagemPackage.MANY_TO_ONE__OWNED_ELEMENT:
				setOwnedElement((TargetElement)null);
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
			case MetagemPackage.MANY_TO_ONE__TARGET:
				return target != null;
			case MetagemPackage.MANY_TO_ONE__SOURCE:
				return source != null && !source.isEmpty();
			case MetagemPackage.MANY_TO_ONE__OWNED_ELEMENT:
				return getOwnedElement() != null;
		}
		return super.eIsSet(featureID);
	}

} //ManyToOneImpl
