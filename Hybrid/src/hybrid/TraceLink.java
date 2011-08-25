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
 * A representation of the model object '<em><b>Trace Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hybrid.TraceLink#getSource <em>Source</em>}</li>
 *   <li>{@link hybrid.TraceLink#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see hybrid.HybridPackage#getTraceLink()
 * @model abstract="true"
 * @generated
 */
public interface TraceLink extends HybridElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference list.
	 * The list contents are of type {@link hybrid.Source}.
	 * It is bidirectional and its opposite is '{@link hybrid.Source#getTraceLink <em>Trace Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference list.
	 * @see hybrid.HybridPackage#getTraceLink_Source()
	 * @see hybrid.Source#getTraceLink
	 * @model opposite="traceLink"
	 * @generated
	 */
	EList<Source> getSource();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference list.
	 * The list contents are of type {@link hybrid.Target}.
	 * It is bidirectional and its opposite is '{@link hybrid.Target#getTraceLink <em>Trace Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference list.
	 * @see hybrid.HybridPackage#getTraceLink_Target()
	 * @see hybrid.Target#getTraceLink
	 * @model opposite="traceLink"
	 * @generated
	 */
	EList<Target> getTarget();

} // TraceLink
