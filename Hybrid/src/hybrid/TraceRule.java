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
 * A representation of the model object '<em><b>Trace Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hybrid.TraceRule#getTraceBindings <em>Trace Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @see hybrid.HybridPackage#getTraceRule()
 * @model
 * @generated
 */
public interface TraceRule extends TraceLink {
	/**
	 * Returns the value of the '<em><b>Trace Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link hybrid.TraceBinding}.
	 * It is bidirectional and its opposite is '{@link hybrid.TraceBinding#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trace Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace Bindings</em>' containment reference list.
	 * @see hybrid.HybridPackage#getTraceRule_TraceBindings()
	 * @see hybrid.TraceBinding#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<TraceBinding> getTraceBindings();

} // TraceRule
