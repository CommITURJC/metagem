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
 * A representation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link RubyTL.Transformation#getName <em>Name</em>}</li>
 *   <li>{@link RubyTL.Transformation#getSourceMetamodels <em>Source Metamodels</em>}</li>
 *   <li>{@link RubyTL.Transformation#getTargetMetamodels <em>Target Metamodels</em>}</li>
 *   <li>{@link RubyTL.Transformation#getRules <em>Rules</em>}</li>
 *   <li>{@link RubyTL.Transformation#getDecorators <em>Decorators</em>}</li>
 * </ul>
 * </p>
 *
 * @see RubyTL.RubyTLPackage#getTransformation()
 * @model
 * @generated
 */
public interface Transformation extends EObject {
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
	 * @see RubyTL.RubyTLPackage#getTransformation_Name()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link RubyTL.Transformation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Source Metamodels</b></em>' containment reference list.
	 * The list contents are of type {@link RubyTL.Metamodel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Metamodels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Metamodels</em>' containment reference list.
	 * @see RubyTL.RubyTLPackage#getTransformation_SourceMetamodels()
	 * @model containment="true"
	 * @generated
	 */
	EList<Metamodel> getSourceMetamodels();

	/**
	 * Returns the value of the '<em><b>Target Metamodels</b></em>' containment reference list.
	 * The list contents are of type {@link RubyTL.Metamodel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Metamodels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Metamodels</em>' containment reference list.
	 * @see RubyTL.RubyTLPackage#getTransformation_TargetMetamodels()
	 * @model containment="true"
	 * @generated
	 */
	EList<Metamodel> getTargetMetamodels();

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link RubyTL.Rule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see RubyTL.RubyTLPackage#getTransformation_Rules()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rule> getRules();

	/**
	 * Returns the value of the '<em><b>Decorators</b></em>' containment reference list.
	 * The list contents are of type {@link RubyTL.Decorator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decorators</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decorators</em>' containment reference list.
	 * @see RubyTL.RubyTLPackage#getTransformation_Decorators()
	 * @model containment="true"
	 * @generated
	 */
	EList<Decorator> getDecorators();

} // Transformation
