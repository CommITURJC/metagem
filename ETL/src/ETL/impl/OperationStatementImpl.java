/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ETL.impl;

import ETL.ETLPackage;
import ETL.OperationStatement;
import ETL.Statement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ETL.impl.OperationStatementImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link ETL.impl.OperationStatementImpl#getParameter1 <em>Parameter1</em>}</li>
 *   <li>{@link ETL.impl.OperationStatementImpl#getParameter2 <em>Parameter2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationStatementImpl extends StatementImpl implements OperationStatement {
	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected String operator = OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameter1() <em>Parameter1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter1()
	 * @generated
	 * @ordered
	 */
	protected Statement parameter1;

	/**
	 * The cached value of the '{@link #getParameter2() <em>Parameter2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter2()
	 * @generated
	 * @ordered
	 */
	protected Statement parameter2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ETLPackage.Literals.OPERATION_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(String newOperator) {
		String oldOperator = operator;
		operator = newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ETLPackage.OPERATION_STATEMENT__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement getParameter1() {
		return parameter1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameter1(Statement newParameter1, NotificationChain msgs) {
		Statement oldParameter1 = parameter1;
		parameter1 = newParameter1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ETLPackage.OPERATION_STATEMENT__PARAMETER1, oldParameter1, newParameter1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter1(Statement newParameter1) {
		if (newParameter1 != parameter1) {
			NotificationChain msgs = null;
			if (parameter1 != null)
				msgs = ((InternalEObject)parameter1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ETLPackage.OPERATION_STATEMENT__PARAMETER1, null, msgs);
			if (newParameter1 != null)
				msgs = ((InternalEObject)newParameter1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ETLPackage.OPERATION_STATEMENT__PARAMETER1, null, msgs);
			msgs = basicSetParameter1(newParameter1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ETLPackage.OPERATION_STATEMENT__PARAMETER1, newParameter1, newParameter1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement getParameter2() {
		return parameter2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameter2(Statement newParameter2, NotificationChain msgs) {
		Statement oldParameter2 = parameter2;
		parameter2 = newParameter2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ETLPackage.OPERATION_STATEMENT__PARAMETER2, oldParameter2, newParameter2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter2(Statement newParameter2) {
		if (newParameter2 != parameter2) {
			NotificationChain msgs = null;
			if (parameter2 != null)
				msgs = ((InternalEObject)parameter2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ETLPackage.OPERATION_STATEMENT__PARAMETER2, null, msgs);
			if (newParameter2 != null)
				msgs = ((InternalEObject)newParameter2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ETLPackage.OPERATION_STATEMENT__PARAMETER2, null, msgs);
			msgs = basicSetParameter2(newParameter2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ETLPackage.OPERATION_STATEMENT__PARAMETER2, newParameter2, newParameter2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ETLPackage.OPERATION_STATEMENT__PARAMETER1:
				return basicSetParameter1(null, msgs);
			case ETLPackage.OPERATION_STATEMENT__PARAMETER2:
				return basicSetParameter2(null, msgs);
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
			case ETLPackage.OPERATION_STATEMENT__OPERATOR:
				return getOperator();
			case ETLPackage.OPERATION_STATEMENT__PARAMETER1:
				return getParameter1();
			case ETLPackage.OPERATION_STATEMENT__PARAMETER2:
				return getParameter2();
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
			case ETLPackage.OPERATION_STATEMENT__OPERATOR:
				setOperator((String)newValue);
				return;
			case ETLPackage.OPERATION_STATEMENT__PARAMETER1:
				setParameter1((Statement)newValue);
				return;
			case ETLPackage.OPERATION_STATEMENT__PARAMETER2:
				setParameter2((Statement)newValue);
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
			case ETLPackage.OPERATION_STATEMENT__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case ETLPackage.OPERATION_STATEMENT__PARAMETER1:
				setParameter1((Statement)null);
				return;
			case ETLPackage.OPERATION_STATEMENT__PARAMETER2:
				setParameter2((Statement)null);
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
			case ETLPackage.OPERATION_STATEMENT__OPERATOR:
				return OPERATOR_EDEFAULT == null ? operator != null : !OPERATOR_EDEFAULT.equals(operator);
			case ETLPackage.OPERATION_STATEMENT__PARAMETER1:
				return parameter1 != null;
			case ETLPackage.OPERATION_STATEMENT__PARAMETER2:
				return parameter2 != null;
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
		result.append(" (operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //OperationStatementImpl
