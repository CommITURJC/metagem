/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hybrid;

import org.eclipse.emf.common.util.EList;


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
 *   <li>{@link hybrid.Operation#getArguments <em>Arguments</em>}</li>
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
	 * It is bidirectional and its opposite is '{@link hybrid.OpDefinition#getReturn_op <em>Return op</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return</em>' containment reference.
	 * @see #setReturn(OpDefinition)
	 * @see hybrid.HybridPackage#getOperation_Return()
	 * @see hybrid.OpDefinition#getReturn_op
	 * @model opposite="return_op" containment="true"
	 * @generated
	 */
	OpDefinition getReturn();

	/**
	 * Sets the value of the '{@link hybrid.Operation#getReturn <em>Return</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return</em>' containment reference.
	 * @see #getReturn()
	 * @generated
	 */
	void setReturn(OpDefinition value);

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
	 * Returns the value of the '<em><b>Context</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link hybrid.OpDefinition#getContext_op <em>Context op</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' containment reference.
	 * @see #setContext(OpDefinition)
	 * @see hybrid.HybridPackage#getOperation_Context()
	 * @see hybrid.OpDefinition#getContext_op
	 * @model opposite="context_op" containment="true"
	 * @generated
	 */
	OpDefinition getContext();

	/**
	 * Sets the value of the '{@link hybrid.Operation#getContext <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' containment reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(OpDefinition value);

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link hybrid.OpArgument}.
	 * It is bidirectional and its opposite is '{@link hybrid.OpArgument#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see hybrid.HybridPackage#getOperation_Arguments()
	 * @see hybrid.OpArgument#getOperation
	 * @model opposite="operation" containment="true"
	 * @generated
	 */
	EList<OpArgument> getArguments();

} // Operation
