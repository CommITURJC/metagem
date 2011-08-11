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
 * A representation of the model object '<em><b>Left Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hybrid.LeftPattern#getBinding <em>Binding</em>}</li>
 *   <li>{@link hybrid.LeftPattern#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see hybrid.HybridPackage#getLeftPattern()
 * @model
 * @generated
 */
public interface LeftPattern extends EObject {
	/**
	 * Returns the value of the '<em><b>Binding</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hybrid.Binding#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding</em>' container reference.
	 * @see #setBinding(Binding)
	 * @see hybrid.HybridPackage#getLeftPattern_Binding()
	 * @see hybrid.Binding#getLeft
	 * @model opposite="left" required="true" transient="false"
	 * @generated
	 */
	Binding getBinding();

	/**
	 * Sets the value of the '{@link hybrid.LeftPattern#getBinding <em>Binding</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding</em>' container reference.
	 * @see #getBinding()
	 * @generated
	 */
	void setBinding(Binding value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link hybrid.Target#getLeftPatternOwned <em>Left Pattern Owned</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(Target)
	 * @see hybrid.HybridPackage#getLeftPattern_Target()
	 * @see hybrid.Target#getLeftPatternOwned
	 * @model opposite="leftPatternOwned" containment="true"
	 * @generated
	 */
	Target getTarget();

	/**
	 * Sets the value of the '{@link hybrid.LeftPattern#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Target value);

} // LeftPattern
