/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ETL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ETL.OperationStatement#getOperator <em>Operator</em>}</li>
 *   <li>{@link ETL.OperationStatement#getParameter1 <em>Parameter1</em>}</li>
 *   <li>{@link ETL.OperationStatement#getParameter2 <em>Parameter2</em>}</li>
 * </ul>
 * </p>
 *
 * @see ETL.ETLPackage#getOperationStatement()
 * @model
 * @generated
 */
public interface OperationStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see #setOperator(String)
	 * @see ETL.ETLPackage#getOperationStatement_Operator()
	 * @model required="true"
	 * @generated
	 */
	String getOperator();

	/**
	 * Sets the value of the '{@link ETL.OperationStatement#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(String value);

	/**
	 * Returns the value of the '<em><b>Parameter1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter1</em>' containment reference.
	 * @see #setParameter1(Statement)
	 * @see ETL.ETLPackage#getOperationStatement_Parameter1()
	 * @model containment="true"
	 * @generated
	 */
	Statement getParameter1();

	/**
	 * Sets the value of the '{@link ETL.OperationStatement#getParameter1 <em>Parameter1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter1</em>' containment reference.
	 * @see #getParameter1()
	 * @generated
	 */
	void setParameter1(Statement value);

	/**
	 * Returns the value of the '<em><b>Parameter2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter2</em>' containment reference.
	 * @see #setParameter2(Statement)
	 * @see ETL.ETLPackage#getOperationStatement_Parameter2()
	 * @model containment="true"
	 * @generated
	 */
	Statement getParameter2();

	/**
	 * Sets the value of the '{@link ETL.OperationStatement#getParameter2 <em>Parameter2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter2</em>' containment reference.
	 * @see #getParameter2()
	 * @generated
	 */
	void setParameter2(Statement value);

} // OperationStatement
