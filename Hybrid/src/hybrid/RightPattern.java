/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hybrid;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Right Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hybrid.RightPattern#getBinding <em>Binding</em>}</li>
 *   <li>{@link hybrid.RightPattern#getSource <em>Source</em>}</li>
 *   <li>{@link hybrid.RightPattern#getOperation <em>Operation</em>}</li>
 *   <li>{@link hybrid.RightPattern#getConcreteValue <em>Concrete Value</em>}</li>
 *   <li>{@link hybrid.RightPattern#getReference <em>Reference</em>}</li>
 *   <li>{@link hybrid.RightPattern#getRule <em>Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @see hybrid.HybridPackage#getRightPattern()
 * @model
 * @generated
 */
public interface RightPattern extends EObject {
	/**
	 * Returns the value of the '<em><b>Binding</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hybrid.Binding#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding</em>' container reference.
	 * @see #setBinding(Binding)
	 * @see hybrid.HybridPackage#getRightPattern_Binding()
	 * @see hybrid.Binding#getRight
	 * @model opposite="right" required="true" transient="false"
	 * @generated
	 */
	Binding getBinding();

	/**
	 * Sets the value of the '{@link hybrid.RightPattern#getBinding <em>Binding</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding</em>' container reference.
	 * @see #getBinding()
	 * @generated
	 */
	void setBinding(Binding value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference list.
	 * The list contents are of type {@link hybrid.Source}.
	 * It is bidirectional and its opposite is '{@link hybrid.Source#getRightPatternOwned <em>Right Pattern Owned</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference list.
	 * @see hybrid.HybridPackage#getRightPattern_Source()
	 * @see hybrid.Source#getRightPatternOwned
	 * @model opposite="rightPatternOwned" containment="true"
	 * @generated
	 */
	EList<Source> getSource();

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' reference list.
	 * The list contents are of type {@link hybrid.Operation}.
	 * It is bidirectional and its opposite is '{@link hybrid.Operation#getRightPattern <em>Right Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' reference list.
	 * @see hybrid.HybridPackage#getRightPattern_Operation()
	 * @see hybrid.Operation#getRightPattern
	 * @model opposite="rightPattern"
	 * @generated
	 */
	EList<Operation> getOperation();

	/**
	 * Returns the value of the '<em><b>Concrete Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concrete Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concrete Value</em>' attribute.
	 * @see #setConcreteValue(String)
	 * @see hybrid.HybridPackage#getRightPattern_ConcreteValue()
	 * @model
	 * @generated
	 */
	String getConcreteValue();

	/**
	 * Sets the value of the '{@link hybrid.RightPattern#getConcreteValue <em>Concrete Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concrete Value</em>' attribute.
	 * @see #getConcreteValue()
	 * @generated
	 */
	void setConcreteValue(String value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link hybrid.RuleElement#getIsRefered <em>Is Refered</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference.
	 * @see #setReference(RuleElement)
	 * @see hybrid.HybridPackage#getRightPattern_Reference()
	 * @see hybrid.RuleElement#getIsRefered
	 * @model opposite="isRefered"
	 * @generated
	 */
	RuleElement getReference();

	/**
	 * Sets the value of the '{@link hybrid.RightPattern#getReference <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(RuleElement value);

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' reference list.
	 * The list contents are of type {@link hybrid.Rule}.
	 * It is bidirectional and its opposite is '{@link hybrid.Rule#getRightPattern <em>Right Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' reference list.
	 * @see hybrid.HybridPackage#getRightPattern_Rule()
	 * @see hybrid.Rule#getRightPattern
	 * @model opposite="rightPattern"
	 * @generated
	 */
	EList<Rule> getRule();

} // RightPattern
