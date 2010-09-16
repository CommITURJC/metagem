/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package RubyTL;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link RubyTL.Rule#getName <em>Name</em>}</li>
 *   <li>{@link RubyTL.Rule#getFrom <em>From</em>}</li>
 *   <li>{@link RubyTL.Rule#getTo <em>To</em>}</li>
 *   <li>{@link RubyTL.Rule#getMapping <em>Mapping</em>}</li>
 *   <li>{@link RubyTL.Rule#getFilter <em>Filter</em>}</li>
 * </ul>
 * </p>
 *
 * @see RubyTL.RubyTLPackage#getRule()
 * @model abstract="true"
 * @generated
 */
public interface Rule extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see RubyTL.RubyTLPackage#getRule_Name()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link RubyTL.Rule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' containment reference list.
	 * The list contents are of type {@link RubyTL.FromElement}.
	 * It is bidirectional and its opposite is '{@link RubyTL.FromElement#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' containment reference list.
	 * @see RubyTL.RubyTLPackage#getRule_From()
	 * @see RubyTL.FromElement#getRule
	 * @model opposite="rule" containment="true" ordered="false"
	 * @generated
	 */
	EList<FromElement> getFrom();

	/**
	 * Returns the value of the '<em><b>To</b></em>' containment reference list.
	 * The list contents are of type {@link RubyTL.ToElement}.
	 * It is bidirectional and its opposite is '{@link RubyTL.ToElement#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' containment reference list.
	 * @see RubyTL.RubyTLPackage#getRule_To()
	 * @see RubyTL.ToElement#getRule
	 * @model opposite="rule" containment="true" ordered="false"
	 * @generated
	 */
	EList<ToElement> getTo();

	/**
	 * Returns the value of the '<em><b>Mapping</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link RubyTL.Mapping#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping</em>' containment reference.
	 * @see #setMapping(Mapping)
	 * @see RubyTL.RubyTLPackage#getRule_Mapping()
	 * @see RubyTL.Mapping#getRule
	 * @model opposite="rule" containment="true" ordered="false"
	 * @generated
	 */
	Mapping getMapping();

	/**
	 * Sets the value of the '{@link RubyTL.Rule#getMapping <em>Mapping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping</em>' containment reference.
	 * @see #getMapping()
	 * @generated
	 */
	void setMapping(Mapping value);

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link RubyTL.Filter#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference.
	 * @see #setFilter(Filter)
	 * @see RubyTL.RubyTLPackage#getRule_Filter()
	 * @see RubyTL.Filter#getRule
	 * @model opposite="rule" containment="true" ordered="false"
	 * @generated
	 */
	Filter getFilter();

	/**
	 * Sets the value of the '{@link RubyTL.Rule#getFilter <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' containment reference.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(Filter value);

} // Rule
