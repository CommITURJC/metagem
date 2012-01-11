/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hybrid;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Op Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hybrid.OpDefinition#getComponent <em>Component</em>}</li>
 *   <li>{@link hybrid.OpDefinition#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link hybrid.OpDefinition#getContext_op <em>Context op</em>}</li>
 *   <li>{@link hybrid.OpDefinition#getReturn_op <em>Return op</em>}</li>
 * </ul>
 * </p>
 *
 * @see hybrid.HybridPackage#getOpDefinition()
 * @model
 * @generated
 */
public interface OpDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' containment reference.
	 * @see #setComponent(TransformationElement)
	 * @see hybrid.HybridPackage#getOpDefinition_Component()
	 * @model containment="true"
	 * @generated
	 */
	TransformationElement getComponent();

	/**
	 * Sets the value of the '{@link hybrid.OpDefinition#getComponent <em>Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' containment reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(TransformationElement value);

	/**
	 * Returns the value of the '<em><b>Datatype</b></em>' attribute.
	 * The literals are from the enumeration {@link hybrid.Datatype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatype</em>' attribute.
	 * @see hybrid.Datatype
	 * @see #setDatatype(Datatype)
	 * @see hybrid.HybridPackage#getOpDefinition_Datatype()
	 * @model
	 * @generated
	 */
	Datatype getDatatype();

	/**
	 * Sets the value of the '{@link hybrid.OpDefinition#getDatatype <em>Datatype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype</em>' attribute.
	 * @see hybrid.Datatype
	 * @see #getDatatype()
	 * @generated
	 */
	void setDatatype(Datatype value);

	/**
	 * Returns the value of the '<em><b>Context op</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hybrid.Operation#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context op</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context op</em>' container reference.
	 * @see #setContext_op(Operation)
	 * @see hybrid.HybridPackage#getOpDefinition_Context_op()
	 * @see hybrid.Operation#getContext
	 * @model opposite="context" transient="false"
	 * @generated
	 */
	Operation getContext_op();

	/**
	 * Sets the value of the '{@link hybrid.OpDefinition#getContext_op <em>Context op</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context op</em>' container reference.
	 * @see #getContext_op()
	 * @generated
	 */
	void setContext_op(Operation value);

	/**
	 * Returns the value of the '<em><b>Return op</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hybrid.Operation#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return op</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return op</em>' container reference.
	 * @see #setReturn_op(Operation)
	 * @see hybrid.HybridPackage#getOpDefinition_Return_op()
	 * @see hybrid.Operation#getReturn
	 * @model opposite="return" transient="false"
	 * @generated
	 */
	Operation getReturn_op();

	/**
	 * Sets the value of the '{@link hybrid.OpDefinition#getReturn_op <em>Return op</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return op</em>' container reference.
	 * @see #getReturn_op()
	 * @generated
	 */
	void setReturn_op(Operation value);

} // OpDefinition
