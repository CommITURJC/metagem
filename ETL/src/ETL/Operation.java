/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ETL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ETL.Operation#getContext <em>Context</em>}</li>
 *   <li>{@link ETL.Operation#getReturn <em>Return</em>}</li>
 * </ul>
 * </p>
 *
 * @see ETL.ETLPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends Block {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' containment reference.
	 * @see #setContext(SimpleStatement)
	 * @see ETL.ETLPackage#getOperation_Context()
	 * @model containment="true"
	 * @generated
	 */
	SimpleStatement getContext();

	/**
	 * Sets the value of the '{@link ETL.Operation#getContext <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' containment reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(SimpleStatement value);

	/**
	 * Returns the value of the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return</em>' containment reference.
	 * @see #setReturn(SimpleStatement)
	 * @see ETL.ETLPackage#getOperation_Return()
	 * @model containment="true"
	 * @generated
	 */
	SimpleStatement getReturn();

	/**
	 * Sets the value of the '{@link ETL.Operation#getReturn <em>Return</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return</em>' containment reference.
	 * @see #getReturn()
	 * @generated
	 */
	void setReturn(SimpleStatement value);

} // Operation
