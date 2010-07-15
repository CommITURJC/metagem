/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm_hybrid;

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
 *   <li>{@link mm_hybrid.RightPattern#getSourceElement <em>Source Element</em>}</li>
 *   <li>{@link mm_hybrid.RightPattern#getRule <em>Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @see mm_hybrid.MM_HybridPackage#getRightPattern()
 * @model
 * @generated
 */
public interface RightPattern extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Element</b></em>' containment reference list.
	 * The list contents are of type {@link mm_hybrid.SourceElementRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Element</em>' containment reference list.
	 * @see mm_hybrid.MM_HybridPackage#getRightPattern_SourceElement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<SourceElementRule> getSourceElement();

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' reference list.
	 * The list contents are of type {@link mm_hybrid.Rule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' reference list.
	 * @see mm_hybrid.MM_HybridPackage#getRightPattern_Rule()
	 * @model
	 * @generated
	 */
	EList<Rule> getRule();

} // RightPattern
