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
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hybrid.Rule#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link hybrid.Rule#getModule <em>Module</em>}</li>
 *   <li>{@link hybrid.Rule#isIsMain <em>Is Main</em>}</li>
 *   <li>{@link hybrid.Rule#getTypeRelation <em>Type Relation</em>}</li>
 *   <li>{@link hybrid.Rule#getTypeElement <em>Type Element</em>}</li>
 *   <li>{@link hybrid.Rule#getComment <em>Comment</em>}</li>
 *   <li>{@link hybrid.Rule#getSources <em>Sources</em>}</li>
 *   <li>{@link hybrid.Rule#getTargets <em>Targets</em>}</li>
 *   <li>{@link hybrid.Rule#getGuard <em>Guard</em>}</li>
 *   <li>{@link hybrid.Rule#getTrace <em>Trace</em>}</li>
 *   <li>{@link hybrid.Rule#getExtends <em>Extends</em>}</li>
 *   <li>{@link hybrid.Rule#getIsExtended <em>Is Extended</em>}</li>
 * </ul>
 * </p>
 *
 * @see hybrid.HybridPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends HybridElement {
	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(boolean)
	 * @see hybrid.HybridPackage#getRule_IsAbstract()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link hybrid.Rule#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isIsAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Module</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hybrid.Module#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' container reference.
	 * @see #setModule(Module)
	 * @see hybrid.HybridPackage#getRule_Module()
	 * @see hybrid.Module#getRules
	 * @model opposite="rules" required="true" transient="false"
	 * @generated
	 */
	Module getModule();

	/**
	 * Sets the value of the '{@link hybrid.Rule#getModule <em>Module</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' container reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(Module value);

	/**
	 * Returns the value of the '<em><b>Is Main</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Main</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Main</em>' attribute.
	 * @see #setIsMain(boolean)
	 * @see hybrid.HybridPackage#getRule_IsMain()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isIsMain();

	/**
	 * Sets the value of the '{@link hybrid.Rule#isIsMain <em>Is Main</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Main</em>' attribute.
	 * @see #isIsMain()
	 * @generated
	 */
	void setIsMain(boolean value);

	/**
	 * Returns the value of the '<em><b>Type Relation</b></em>' attribute.
	 * The literals are from the enumeration {@link hybrid.TypeRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Relation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Relation</em>' attribute.
	 * @see hybrid.TypeRelation
	 * @see #setTypeRelation(TypeRelation)
	 * @see hybrid.HybridPackage#getRule_TypeRelation()
	 * @model required="true"
	 * @generated
	 */
	TypeRelation getTypeRelation();

	/**
	 * Sets the value of the '{@link hybrid.Rule#getTypeRelation <em>Type Relation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Relation</em>' attribute.
	 * @see hybrid.TypeRelation
	 * @see #getTypeRelation()
	 * @generated
	 */
	void setTypeRelation(TypeRelation value);

	/**
	 * Returns the value of the '<em><b>Type Element</b></em>' attribute.
	 * The literals are from the enumeration {@link hybrid.TypeElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Element</em>' attribute.
	 * @see hybrid.TypeElement
	 * @see #setTypeElement(TypeElement)
	 * @see hybrid.HybridPackage#getRule_TypeElement()
	 * @model required="true"
	 * @generated
	 */
	TypeElement getTypeElement();

	/**
	 * Sets the value of the '{@link hybrid.Rule#getTypeElement <em>Type Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Element</em>' attribute.
	 * @see hybrid.TypeElement
	 * @see #getTypeElement()
	 * @generated
	 */
	void setTypeElement(TypeElement value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see hybrid.HybridPackage#getRule_Comment()
	 * @model
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link hybrid.Rule#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Sources</b></em>' containment reference list.
	 * The list contents are of type {@link hybrid.Source}.
	 * It is bidirectional and its opposite is '{@link hybrid.Source#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sources</em>' containment reference list.
	 * @see hybrid.HybridPackage#getRule_Sources()
	 * @see hybrid.Source#getRule
	 * @model opposite="rule" containment="true"
	 * @generated
	 */
	EList<Source> getSources();

	/**
	 * Returns the value of the '<em><b>Targets</b></em>' containment reference list.
	 * The list contents are of type {@link hybrid.Target}.
	 * It is bidirectional and its opposite is '{@link hybrid.Target#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targets</em>' containment reference list.
	 * @see hybrid.HybridPackage#getRule_Targets()
	 * @see hybrid.Target#getRule
	 * @model opposite="rule" containment="true"
	 * @generated
	 */
	EList<Target> getTargets();

	/**
	 * Returns the value of the '<em><b>Guard</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link hybrid.Guard#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard</em>' containment reference.
	 * @see #setGuard(Guard)
	 * @see hybrid.HybridPackage#getRule_Guard()
	 * @see hybrid.Guard#getRule
	 * @model opposite="rule" containment="true"
	 * @generated
	 */
	Guard getGuard();

	/**
	 * Sets the value of the '{@link hybrid.Rule#getGuard <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' containment reference.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(Guard value);

	/**
	 * Returns the value of the '<em><b>Trace</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trace</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace</em>' containment reference.
	 * @see #setTrace(TraceRule)
	 * @see hybrid.HybridPackage#getRule_Trace()
	 * @model containment="true"
	 * @generated
	 */
	TraceRule getTrace();

	/**
	 * Sets the value of the '{@link hybrid.Rule#getTrace <em>Trace</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace</em>' containment reference.
	 * @see #getTrace()
	 * @generated
	 */
	void setTrace(TraceRule value);

	/**
	 * Returns the value of the '<em><b>Extends</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link hybrid.Rule#getIsExtended <em>Is Extended</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extends</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' reference.
	 * @see #setExtends(Rule)
	 * @see hybrid.HybridPackage#getRule_Extends()
	 * @see hybrid.Rule#getIsExtended
	 * @model opposite="isExtended"
	 * @generated
	 */
	Rule getExtends();

	/**
	 * Sets the value of the '{@link hybrid.Rule#getExtends <em>Extends</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extends</em>' reference.
	 * @see #getExtends()
	 * @generated
	 */
	void setExtends(Rule value);

	/**
	 * Returns the value of the '<em><b>Is Extended</b></em>' reference list.
	 * The list contents are of type {@link hybrid.Rule}.
	 * It is bidirectional and its opposite is '{@link hybrid.Rule#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Extended</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Extended</em>' reference list.
	 * @see hybrid.HybridPackage#getRule_IsExtended()
	 * @see hybrid.Rule#getExtends
	 * @model opposite="extends"
	 * @generated
	 */
	EList<Rule> getIsExtended();

} // Rule
