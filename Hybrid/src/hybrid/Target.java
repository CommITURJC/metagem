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
 * A representation of the model object '<em><b>Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hybrid.Target#getRule <em>Rule</em>}</li>
 *   <li>{@link hybrid.Target#getBindings <em>Bindings</em>}</li>
 *   <li>{@link hybrid.Target#getLeftPatternOwned <em>Left Pattern Owned</em>}</li>
 *   <li>{@link hybrid.Target#getTraceLink <em>Trace Link</em>}</li>
 *   <li>{@link hybrid.Target#getIsRefered <em>Is Refered</em>}</li>
 * </ul>
 * </p>
 *
 * @see hybrid.HybridPackage#getTarget()
 * @model
 * @generated
 */
public interface Target extends TransformationElement {
	/**
	 * Returns the value of the '<em><b>Rule</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hybrid.Rule#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' container reference.
	 * @see #setRule(Rule)
	 * @see hybrid.HybridPackage#getTarget_Rule()
	 * @see hybrid.Rule#getTargets
	 * @model opposite="targets" transient="false"
	 * @generated
	 */
	Rule getRule();

	/**
	 * Sets the value of the '{@link hybrid.Target#getRule <em>Rule</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' container reference.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(Rule value);

	/**
	 * Returns the value of the '<em><b>Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link hybrid.Binding}.
	 * It is bidirectional and its opposite is '{@link hybrid.Binding#getOwned <em>Owned</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bindings</em>' containment reference list.
	 * @see hybrid.HybridPackage#getTarget_Bindings()
	 * @see hybrid.Binding#getOwned
	 * @model opposite="owned" containment="true"
	 * @generated
	 */
	EList<Binding> getBindings();

	/**
	 * Returns the value of the '<em><b>Left Pattern Owned</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hybrid.LeftPattern#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Pattern Owned</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Pattern Owned</em>' container reference.
	 * @see #setLeftPatternOwned(LeftPattern)
	 * @see hybrid.HybridPackage#getTarget_LeftPatternOwned()
	 * @see hybrid.LeftPattern#getTarget
	 * @model opposite="target" transient="false"
	 * @generated
	 */
	LeftPattern getLeftPatternOwned();

	/**
	 * Sets the value of the '{@link hybrid.Target#getLeftPatternOwned <em>Left Pattern Owned</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Pattern Owned</em>' container reference.
	 * @see #getLeftPatternOwned()
	 * @generated
	 */
	void setLeftPatternOwned(LeftPattern value);

	/**
	 * Returns the value of the '<em><b>Trace Link</b></em>' reference list.
	 * The list contents are of type {@link hybrid.TraceLink}.
	 * It is bidirectional and its opposite is '{@link hybrid.TraceLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trace Link</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace Link</em>' reference list.
	 * @see hybrid.HybridPackage#getTarget_TraceLink()
	 * @see hybrid.TraceLink#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<TraceLink> getTraceLink();

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
	 * @see hybrid.HybridPackage#getTarget_IsRefered()
	 * @see hybrid.RightPattern#getReference
	 * @model opposite="reference"
	 * @generated
	 */
	EList<RightPattern> getIsRefered();

} // Target
