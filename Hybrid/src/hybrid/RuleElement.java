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
 * A representation of the model object '<em><b>Rule Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hybrid.RuleElement#getIsRefered <em>Is Refered</em>}</li>
 *   <li>{@link hybrid.RuleElement#getComponent <em>Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see hybrid.HybridPackage#getRuleElement()
 * @model abstract="true"
 * @generated
 */
public interface RuleElement extends HybridElement {
	/**
	 * Returns the value of the '<em><b>Is Refered</b></em>' reference list.
	 * The list contents are of type {@link hybrid.RightPattern}.
	 * It is bidirectional and its opposite is '{@link hybrid.RightPattern#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Refered</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Refered</em>' reference list.
	 * @see hybrid.HybridPackage#getRuleElement_IsRefered()
	 * @see hybrid.RightPattern#getReference
	 * @model opposite="reference"
	 * @generated
	 */
	EList<RightPattern> getIsRefered();

	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference.
	 * @see #setComponent(ModelComponent)
	 * @see hybrid.HybridPackage#getRuleElement_Component()
	 * @model required="true"
	 * @generated
	 */
	ModelComponent getComponent();

	/**
	 * Sets the value of the '{@link hybrid.RuleElement#getComponent <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(ModelComponent value);

} // RuleElement
