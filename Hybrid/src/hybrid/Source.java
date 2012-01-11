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
 * A representation of the model object '<em><b>Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hybrid.Source#getRule <em>Rule</em>}</li>
 *   <li>{@link hybrid.Source#getRightPatternOwned <em>Right Pattern Owned</em>}</li>
 *   <li>{@link hybrid.Source#getTraceLink <em>Trace Link</em>}</li>
 * </ul>
 * </p>
 *
 * @see hybrid.HybridPackage#getSource()
 * @model
 * @generated
 */
public interface Source extends TransformationElement {
	/**
	 * Returns the value of the '<em><b>Rule</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hybrid.Rule#getSources <em>Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' container reference.
	 * @see #setRule(Rule)
	 * @see hybrid.HybridPackage#getSource_Rule()
	 * @see hybrid.Rule#getSources
	 * @model opposite="sources" transient="false"
	 * @generated
	 */
	Rule getRule();

	/**
	 * Sets the value of the '{@link hybrid.Source#getRule <em>Rule</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' container reference.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(Rule value);

	/**
	 * Returns the value of the '<em><b>Right Pattern Owned</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hybrid.RightPattern#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Pattern Owned</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Pattern Owned</em>' container reference.
	 * @see #setRightPatternOwned(RightPattern)
	 * @see hybrid.HybridPackage#getSource_RightPatternOwned()
	 * @see hybrid.RightPattern#getSource
	 * @model opposite="source" transient="false"
	 * @generated
	 */
	RightPattern getRightPatternOwned();

	/**
	 * Sets the value of the '{@link hybrid.Source#getRightPatternOwned <em>Right Pattern Owned</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Pattern Owned</em>' container reference.
	 * @see #getRightPatternOwned()
	 * @generated
	 */
	void setRightPatternOwned(RightPattern value);

	/**
	 * Returns the value of the '<em><b>Trace Link</b></em>' reference list.
	 * The list contents are of type {@link hybrid.TraceLink}.
	 * It is bidirectional and its opposite is '{@link hybrid.TraceLink#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trace Link</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace Link</em>' reference list.
	 * @see hybrid.HybridPackage#getSource_TraceLink()
	 * @see hybrid.TraceLink#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<TraceLink> getTraceLink();

} // Source
