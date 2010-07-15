/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm_hybrid;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target Element Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mm_hybrid.TargetElementRule#getIncluded <em>Included</em>}</li>
 *   <li>{@link mm_hybrid.TargetElementRule#getMetamodel <em>Metamodel</em>}</li>
 *   <li>{@link mm_hybrid.TargetElementRule#getLeftPattern <em>Left Pattern</em>}</li>
 *   <li>{@link mm_hybrid.TargetElementRule#getRule <em>Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @see mm_hybrid.MM_HybridPackage#getTargetElementRule()
 * @model annotation="gmf.node label='name_element' label.icon='false' border.color='51,153,102' color='204,255,204'"
 * @generated
 */
public interface TargetElementRule extends Element {

	/**
	 * Returns the value of the '<em><b>Included</b></em>' containment reference list.
	 * The list contents are of type {@link mm_hybrid.ElementIncluded}.
	 * It is bidirectional and its opposite is '{@link mm_hybrid.ElementIncluded#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Included</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Included</em>' containment reference list.
	 * @see mm_hybrid.MM_HybridPackage#getTargetElementRule_Included()
	 * @see mm_hybrid.ElementIncluded#getTarget
	 * @model opposite="target" containment="true"
	 * @generated
	 */
	EList<ElementIncluded> getIncluded();

	/**
	 * Returns the value of the '<em><b>Metamodel</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link mm_hybrid.OutMetaModel#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metamodel</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metamodel</em>' reference.
	 * @see #setMetamodel(OutMetaModel)
	 * @see mm_hybrid.MM_HybridPackage#getTargetElementRule_Metamodel()
	 * @see mm_hybrid.OutMetaModel#getElements
	 * @model opposite="elements" required="true"
	 * @generated
	 */
	OutMetaModel getMetamodel();

	/**
	 * Sets the value of the '{@link mm_hybrid.TargetElementRule#getMetamodel <em>Metamodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metamodel</em>' reference.
	 * @see #getMetamodel()
	 * @generated
	 */
	void setMetamodel(OutMetaModel value);

	/**
	 * Returns the value of the '<em><b>Left Pattern</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mm_hybrid.LeftPattern#getTargetElement <em>Target Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Pattern</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Pattern</em>' container reference.
	 * @see #setLeftPattern(LeftPattern)
	 * @see mm_hybrid.MM_HybridPackage#getTargetElementRule_LeftPattern()
	 * @see mm_hybrid.LeftPattern#getTargetElement
	 * @model opposite="targetElement" transient="false"
	 * @generated
	 */
	LeftPattern getLeftPattern();

	/**
	 * Sets the value of the '{@link mm_hybrid.TargetElementRule#getLeftPattern <em>Left Pattern</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Pattern</em>' container reference.
	 * @see #getLeftPattern()
	 * @generated
	 */
	void setLeftPattern(LeftPattern value);

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mm_hybrid.Rule#getOut <em>Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' container reference.
	 * @see #setRule(Rule)
	 * @see mm_hybrid.MM_HybridPackage#getTargetElementRule_Rule()
	 * @see mm_hybrid.Rule#getOut
	 * @model opposite="out" required="true" transient="false"
	 * @generated
	 */
	Rule getRule();

	/**
	 * Sets the value of the '{@link mm_hybrid.TargetElementRule#getRule <em>Rule</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' container reference.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(Rule value);
} // TargetElementRule
