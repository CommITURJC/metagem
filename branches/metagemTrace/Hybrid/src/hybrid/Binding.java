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
 * A representation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hybrid.Binding#getOwned <em>Owned</em>}</li>
 *   <li>{@link hybrid.Binding#getRight <em>Right</em>}</li>
 *   <li>{@link hybrid.Binding#getLeft <em>Left</em>}</li>
 *   <li>{@link hybrid.Binding#getTypeRelation <em>Type Relation</em>}</li>
 *   <li>{@link hybrid.Binding#getTypeElement <em>Type Element</em>}</li>
 *   <li>{@link hybrid.Binding#getTrace <em>Trace</em>}</li>
 * </ul>
 * </p>
 *
 * @see hybrid.HybridPackage#getBinding()
 * @model
 * @generated
 */
public interface Binding extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hybrid.Target#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned</em>' container reference.
	 * @see #setOwned(Target)
	 * @see hybrid.HybridPackage#getBinding_Owned()
	 * @see hybrid.Target#getBindings
	 * @model opposite="bindings" required="true" transient="false"
	 * @generated
	 */
	Target getOwned();

	/**
	 * Sets the value of the '{@link hybrid.Binding#getOwned <em>Owned</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned</em>' container reference.
	 * @see #getOwned()
	 * @generated
	 */
	void setOwned(Target value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link hybrid.RightPattern#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(RightPattern)
	 * @see hybrid.HybridPackage#getBinding_Right()
	 * @see hybrid.RightPattern#getBinding
	 * @model opposite="binding" containment="true" required="true"
	 * @generated
	 */
	RightPattern getRight();

	/**
	 * Sets the value of the '{@link hybrid.Binding#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(RightPattern value);

	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link hybrid.LeftPattern#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(LeftPattern)
	 * @see hybrid.HybridPackage#getBinding_Left()
	 * @see hybrid.LeftPattern#getBinding
	 * @model opposite="binding" containment="true" required="true"
	 * @generated
	 */
	LeftPattern getLeft();

	/**
	 * Sets the value of the '{@link hybrid.Binding#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(LeftPattern value);

	/**
	 * Returns the value of the '<em><b>Type Relation</b></em>' attribute.
	 * The literals are from the enumeration {@link hybrid.TypeRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Relation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Relation</em>' attribute.
	 * @see hybrid.TypeRelation
	 * @see #setTypeRelation(TypeRelation)
	 * @see hybrid.HybridPackage#getBinding_TypeRelation()
	 * @model required="true"
	 * @generated
	 */
	TypeRelation getTypeRelation();

	/**
	 * Sets the value of the '{@link hybrid.Binding#getTypeRelation <em>Type Relation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Relation</em>' attribute.
	 * @see hybrid.TypeRelation
	 * @see #getTypeRelation()
	 * @generated
	 */
	void setTypeRelation(TypeRelation value);

	/**
	 * Returns the value of the '<em><b>Type Element</b></em>' attribute.
	 * The literals are from the enumeration {@link hybrid.TypeElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Element</em>' attribute.
	 * @see hybrid.TypeElement
	 * @see #setTypeElement(TypeElement)
	 * @see hybrid.HybridPackage#getBinding_TypeElement()
	 * @model required="true"
	 * @generated
	 */
	TypeElement getTypeElement();

	/**
	 * Sets the value of the '{@link hybrid.Binding#getTypeElement <em>Type Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Element</em>' attribute.
	 * @see hybrid.TypeElement
	 * @see #getTypeElement()
	 * @generated
	 */
	void setTypeElement(TypeElement value);

	/**
	 * Returns the value of the '<em><b>Trace</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link hybrid.TraceBinding#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trace</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace</em>' reference.
	 * @see #setTrace(TraceBinding)
	 * @see hybrid.HybridPackage#getBinding_Trace()
	 * @see hybrid.TraceBinding#getBinding
	 * @model opposite="binding"
	 * @generated
	 */
	TraceBinding getTrace();

	/**
	 * Sets the value of the '{@link hybrid.Binding#getTrace <em>Trace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace</em>' reference.
	 * @see #getTrace()
	 * @generated
	 */
	void setTrace(TraceBinding value);

} // Binding
