/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hybrid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hybrid.Operation#getModule <em>Module</em>}</li>
 *   <li>{@link hybrid.Operation#getBody <em>Body</em>}</li>
 *   <li>{@link hybrid.Operation#getReturn <em>Return</em>}</li>
 *   <li>{@link hybrid.Operation#getRightPattern <em>Right Pattern</em>}</li>
 *   <li>{@link hybrid.Operation#getContext <em>Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see hybrid.HybridPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends HybridElement {
	/**
	 * Returns the value of the '<em><b>Module</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hybrid.Module#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' container reference.
	 * @see #setModule(Module)
	 * @see hybrid.HybridPackage#getOperation_Module()
	 * @see hybrid.Module#getOperations
	 * @model opposite="operations" required="true" transient="false"
	 * @generated
	 */
	Module getModule();

	/**
	 * Sets the value of the '{@link hybrid.Operation#getModule <em>Module</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' container reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(Module value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see hybrid.HybridPackage#getOperation_Body()
	 * @model required="true"
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link hybrid.Operation#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

	/**
	 * Returns the value of the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return</em>' containment reference.
	 * @see #setReturn(Return)
	 * @see hybrid.HybridPackage#getOperation_Return()
	 * @model containment="true"
	 * @generated
	 */
	Return getReturn();

	/**
	 * Sets the value of the '{@link hybrid.Operation#getReturn <em>Return</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return</em>' containment reference.
	 * @see #getReturn()
	 * @generated
	 */
	void setReturn(Return value);

	/**
	 * Returns the value of the '<em><b>Right Pattern</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link hybrid.RightPattern#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Pattern</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Pattern</em>' reference.
	 * @see #setRightPattern(RightPattern)
	 * @see hybrid.HybridPackage#getOperation_RightPattern()
	 * @see hybrid.RightPattern#getOperation
	 * @model opposite="operation"
	 * @generated
	 */
	RightPattern getRightPattern();

	/**
	 * Sets the value of the '{@link hybrid.Operation#getRightPattern <em>Right Pattern</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Pattern</em>' reference.
	 * @see #getRightPattern()
	 * @generated
	 */
	void setRightPattern(RightPattern value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(RuleElement)
	 * @see hybrid.HybridPackage#getOperation_Context()
	 * @model
	 * @generated
	 */
	RuleElement getContext();

	/**
	 * Sets the value of the '{@link hybrid.Operation#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(RuleElement value);

} // Operation
