/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hybrid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hybrid.TraceBinding#getParent <em>Parent</em>}</li>
 *   <li>{@link hybrid.TraceBinding#getBinding <em>Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @see hybrid.HybridPackage#getTraceBinding()
 * @model
 * @generated
 */
public interface TraceBinding extends TraceLink {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hybrid.TraceRule#getTraceBindings <em>Trace Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TraceRule)
	 * @see hybrid.HybridPackage#getTraceBinding_Parent()
	 * @see hybrid.TraceRule#getTraceBindings
	 * @model opposite="traceBindings" transient="false"
	 * @generated
	 */
	TraceRule getParent();

	/**
	 * Sets the value of the '{@link hybrid.TraceBinding#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TraceRule value);

	/**
	 * Returns the value of the '<em><b>Binding</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link hybrid.Binding#getTrace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding</em>' reference.
	 * @see #setBinding(Binding)
	 * @see hybrid.HybridPackage#getTraceBinding_Binding()
	 * @see hybrid.Binding#getTrace
	 * @model opposite="trace"
	 * @generated
	 */
	Binding getBinding();

	/**
	 * Sets the value of the '{@link hybrid.TraceBinding#getBinding <em>Binding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding</em>' reference.
	 * @see #getBinding()
	 * @generated
	 */
	void setBinding(Binding value);

} // TraceBinding
