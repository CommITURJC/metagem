/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ETL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ETL.TransformationRule#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link ETL.TransformationRule#getModule <em>Module</em>}</li>
 *   <li>{@link ETL.TransformationRule#isLazy <em>Lazy</em>}</li>
 *   <li>{@link ETL.TransformationRule#isPrimary <em>Primary</em>}</li>
 *   <li>{@link ETL.TransformationRule#isGreedy <em>Greedy</em>}</li>
 *   <li>{@link ETL.TransformationRule#getGuard <em>Guard</em>}</li>
 *   <li>{@link ETL.TransformationRule#getSource <em>Source</em>}</li>
 *   <li>{@link ETL.TransformationRule#getTargets <em>Targets</em>}</li>
 *   <li>{@link ETL.TransformationRule#getExtends <em>Extends</em>}</li>
 *   <li>{@link ETL.TransformationRule#getIsExtended <em>Is Extended</em>}</li>
 *   <li>{@link ETL.TransformationRule#getBindings <em>Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @see ETL.ETLPackage#getTransformationRule()
 * @model
 * @generated
 */
public interface TransformationRule extends EtlElement {
	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(boolean)
	 * @see ETL.ETLPackage#getTransformationRule_IsAbstract()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link ETL.TransformationRule#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isIsAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Module</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ETL.EtlModule#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' container reference.
	 * @see #setModule(EtlModule)
	 * @see ETL.ETLPackage#getTransformationRule_Module()
	 * @see ETL.EtlModule#getRules
	 * @model opposite="rules" required="true" transient="false"
	 * @generated
	 */
	EtlModule getModule();

	/**
	 * Sets the value of the '{@link ETL.TransformationRule#getModule <em>Module</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' container reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(EtlModule value);

	/**
	 * Returns the value of the '<em><b>Lazy</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lazy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lazy</em>' attribute.
	 * @see #setLazy(boolean)
	 * @see ETL.ETLPackage#getTransformationRule_Lazy()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isLazy();

	/**
	 * Sets the value of the '{@link ETL.TransformationRule#isLazy <em>Lazy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lazy</em>' attribute.
	 * @see #isLazy()
	 * @generated
	 */
	void setLazy(boolean value);

	/**
	 * Returns the value of the '<em><b>Primary</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary</em>' attribute.
	 * @see #setPrimary(boolean)
	 * @see ETL.ETLPackage#getTransformationRule_Primary()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isPrimary();

	/**
	 * Sets the value of the '{@link ETL.TransformationRule#isPrimary <em>Primary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary</em>' attribute.
	 * @see #isPrimary()
	 * @generated
	 */
	void setPrimary(boolean value);

	/**
	 * Returns the value of the '<em><b>Greedy</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Greedy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Greedy</em>' attribute.
	 * @see #setGreedy(boolean)
	 * @see ETL.ETLPackage#getTransformationRule_Greedy()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isGreedy();

	/**
	 * Sets the value of the '{@link ETL.TransformationRule#isGreedy <em>Greedy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Greedy</em>' attribute.
	 * @see #isGreedy()
	 * @generated
	 */
	void setGreedy(boolean value);

	/**
	 * Returns the value of the '<em><b>Guard</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link ETL.Guard#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard</em>' containment reference.
	 * @see #setGuard(Guard)
	 * @see ETL.ETLPackage#getTransformationRule_Guard()
	 * @see ETL.Guard#getRule
	 * @model opposite="rule" containment="true"
	 * @generated
	 */
	Guard getGuard();

	/**
	 * Sets the value of the '{@link ETL.TransformationRule#getGuard <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' containment reference.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(Guard value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link ETL.Element#getSource_rule <em>Source rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(Element)
	 * @see ETL.ETLPackage#getTransformationRule_Source()
	 * @see ETL.Element#getSource_rule
	 * @model opposite="source_rule" containment="true" required="true"
	 * @generated
	 */
	Element getSource();

	/**
	 * Sets the value of the '{@link ETL.TransformationRule#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Element value);

	/**
	 * Returns the value of the '<em><b>Targets</b></em>' containment reference list.
	 * The list contents are of type {@link ETL.Element}.
	 * It is bidirectional and its opposite is '{@link ETL.Element#getTargets_rule <em>Targets rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targets</em>' containment reference list.
	 * @see ETL.ETLPackage#getTransformationRule_Targets()
	 * @see ETL.Element#getTargets_rule
	 * @model opposite="targets_rule" containment="true" required="true"
	 * @generated
	 */
	EList<Element> getTargets();

	/**
	 * Returns the value of the '<em><b>Extends</b></em>' reference list.
	 * The list contents are of type {@link ETL.TransformationRule}.
	 * It is bidirectional and its opposite is '{@link ETL.TransformationRule#getIsExtended <em>Is Extended</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extends</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' reference list.
	 * @see ETL.ETLPackage#getTransformationRule_Extends()
	 * @see ETL.TransformationRule#getIsExtended
	 * @model opposite="isExtended"
	 * @generated
	 */
	EList<TransformationRule> getExtends();

	/**
	 * Returns the value of the '<em><b>Is Extended</b></em>' reference list.
	 * The list contents are of type {@link ETL.TransformationRule}.
	 * It is bidirectional and its opposite is '{@link ETL.TransformationRule#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Extended</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Extended</em>' reference list.
	 * @see ETL.ETLPackage#getTransformationRule_IsExtended()
	 * @see ETL.TransformationRule#getExtends
	 * @model opposite="extends"
	 * @generated
	 */
	EList<TransformationRule> getIsExtended();

	/**
	 * Returns the value of the '<em><b>Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link ETL.Binding}.
	 * It is bidirectional and its opposite is '{@link ETL.Binding#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bindings</em>' containment reference list.
	 * @see ETL.ETLPackage#getTransformationRule_Bindings()
	 * @see ETL.Binding#getRule
	 * @model opposite="rule" containment="true"
	 * @generated
	 */
	EList<Binding> getBindings();

} // TransformationRule
