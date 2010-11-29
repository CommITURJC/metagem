/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm_hybrid;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mm_hybrid.Guard#getValue <em>Value</em>}</li>
 *   <li>{@link mm_hybrid.Guard#getSourceElement <em>Source Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see mm_hybrid.MM_HybridPackage#getGuard()
 * @model
 * @generated
 */
public interface Guard extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see mm_hybrid.MM_HybridPackage#getGuard_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link mm_hybrid.Guard#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Source Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mm_hybrid.SourceElementRule#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Element</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Element</em>' container reference.
	 * @see #setSourceElement(SourceElementRule)
	 * @see mm_hybrid.MM_HybridPackage#getGuard_SourceElement()
	 * @see mm_hybrid.SourceElementRule#getGuard
	 * @model opposite="guard" required="true" transient="false"
	 * @generated
	 */
	SourceElementRule getSourceElement();

	/**
	 * Sets the value of the '{@link mm_hybrid.Guard#getSourceElement <em>Source Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Element</em>' container reference.
	 * @see #getSourceElement()
	 * @generated
	 */
	void setSourceElement(SourceElementRule value);

} // Guard
