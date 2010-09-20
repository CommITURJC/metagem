/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package RubyTL.impl;

import RubyTL.ExpGet;
import RubyTL.Expression;
import RubyTL.RubyTLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link RubyTL.impl.ExpressionImpl#getExpGet <em>Exp Get</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ExpressionImpl extends EObjectImpl implements Expression {
	/**
	 * The cached value of the '{@link #getExpGet() <em>Exp Get</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpGet()
	 * @generated
	 * @ordered
	 */
	protected ExpGet expGet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RubyTLPackage.Literals.EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpGet getExpGet() {
		if (expGet != null && expGet.eIsProxy()) {
			InternalEObject oldExpGet = (InternalEObject)expGet;
			expGet = (ExpGet)eResolveProxy(oldExpGet);
			if (expGet != oldExpGet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RubyTLPackage.EXPRESSION__EXP_GET, oldExpGet, expGet));
			}
		}
		return expGet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpGet basicGetExpGet() {
		return expGet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpGet(ExpGet newExpGet) {
		ExpGet oldExpGet = expGet;
		expGet = newExpGet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RubyTLPackage.EXPRESSION__EXP_GET, oldExpGet, expGet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RubyTLPackage.EXPRESSION__EXP_GET:
				if (resolve) return getExpGet();
				return basicGetExpGet();
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
			case RubyTLPackage.EXPRESSION__EXP_GET:
				setExpGet((ExpGet)newValue);
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
			case RubyTLPackage.EXPRESSION__EXP_GET:
				setExpGet((ExpGet)null);
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
			case RubyTLPackage.EXPRESSION__EXP_GET:
				return expGet != null;
		}
		return super.eIsSet(featureID);
	}

} //ExpressionImpl
