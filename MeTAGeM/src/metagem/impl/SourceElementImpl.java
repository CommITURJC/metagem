/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metagem.impl;

import metagem.MetagemPackage;
import metagem.Relations;
import metagem.SourceElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link metagem.impl.SourceElementImpl#getInvokes <em>Invokes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SourceElementImpl extends RelationElementImpl implements SourceElement {
	/**
	 * The cached value of the '{@link #getInvokes() <em>Invokes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvokes()
	 * @generated
	 * @ordered
	 */
	protected Relations invokes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetagemPackage.Literals.SOURCE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relations getInvokes() {
		if (invokes != null && invokes.eIsProxy()) {
			InternalEObject oldInvokes = (InternalEObject)invokes;
			invokes = (Relations)eResolveProxy(oldInvokes);
			if (invokes != oldInvokes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetagemPackage.SOURCE_ELEMENT__INVOKES, oldInvokes, invokes));
			}
		}
		return invokes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relations basicGetInvokes() {
		return invokes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInvokes(Relations newInvokes, NotificationChain msgs) {
		Relations oldInvokes = invokes;
		invokes = newInvokes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetagemPackage.SOURCE_ELEMENT__INVOKES, oldInvokes, newInvokes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvokes(Relations newInvokes) {
		if (newInvokes != invokes) {
			NotificationChain msgs = null;
			if (invokes != null)
				msgs = ((InternalEObject)invokes).eInverseRemove(this, MetagemPackage.RELATIONS__IS_INVOKED, Relations.class, msgs);
			if (newInvokes != null)
				msgs = ((InternalEObject)newInvokes).eInverseAdd(this, MetagemPackage.RELATIONS__IS_INVOKED, Relations.class, msgs);
			msgs = basicSetInvokes(newInvokes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetagemPackage.SOURCE_ELEMENT__INVOKES, newInvokes, newInvokes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetagemPackage.SOURCE_ELEMENT__INVOKES:
				if (invokes != null)
					msgs = ((InternalEObject)invokes).eInverseRemove(this, MetagemPackage.RELATIONS__IS_INVOKED, Relations.class, msgs);
				return basicSetInvokes((Relations)otherEnd, msgs);
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
			case MetagemPackage.SOURCE_ELEMENT__INVOKES:
				return basicSetInvokes(null, msgs);
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
			case MetagemPackage.SOURCE_ELEMENT__INVOKES:
				if (resolve) return getInvokes();
				return basicGetInvokes();
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
			case MetagemPackage.SOURCE_ELEMENT__INVOKES:
				setInvokes((Relations)newValue);
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
			case MetagemPackage.SOURCE_ELEMENT__INVOKES:
				setInvokes((Relations)null);
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
			case MetagemPackage.SOURCE_ELEMENT__INVOKES:
				return invokes != null;
		}
		return super.eIsSet(featureID);
	}

} //SourceElementImpl
