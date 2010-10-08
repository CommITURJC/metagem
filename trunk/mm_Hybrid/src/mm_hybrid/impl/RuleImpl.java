/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mm_hybrid.impl;

import java.util.Collection;

import mm_hybrid.MM_HybridPackage;
import mm_hybrid.Module;
import mm_hybrid.RightPattern;
import mm_hybrid.Rule;
import mm_hybrid.SourceElementRule;
import mm_hybrid.TargetElementRule;

import mm_hybrid.TypeAtribute;
import mm_hybrid.TypeElem;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mm_hybrid.impl.RuleImpl#getName_rule <em>Name rule</em>}</li>
 *   <li>{@link mm_hybrid.impl.RuleImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link mm_hybrid.impl.RuleImpl#isIsMain <em>Is Main</em>}</li>
 *   <li>{@link mm_hybrid.impl.RuleImpl#getIn <em>In</em>}</li>
 *   <li>{@link mm_hybrid.impl.RuleImpl#getOut <em>Out</em>}</li>
 *   <li>{@link mm_hybrid.impl.RuleImpl#getTypeAttribute <em>Type Attribute</em>}</li>
 *   <li>{@link mm_hybrid.impl.RuleImpl#getTypeElement <em>Type Element</em>}</li>
 *   <li>{@link mm_hybrid.impl.RuleImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link mm_hybrid.impl.RuleImpl#getIsExtended <em>Is Extended</em>}</li>
 *   <li>{@link mm_hybrid.impl.RuleImpl#getRightPattern <em>Right Pattern</em>}</li>
 *   <li>{@link mm_hybrid.impl.RuleImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link mm_hybrid.impl.RuleImpl#getModule <em>Module</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleImpl extends EObjectImpl implements Rule {
	/**
	 * The default value of the '{@link #getName_rule() <em>Name rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName_rule()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_RULE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName_rule() <em>Name rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName_rule()
	 * @generated
	 * @ordered
	 */
	protected String name_rule = NAME_RULE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsMain() <em>Is Main</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMain()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MAIN_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsMain() <em>Is Main</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMain()
	 * @generated
	 * @ordered
	 */
	protected boolean isMain = IS_MAIN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIn() <em>In</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected EList<SourceElementRule> in;

	/**
	 * The cached value of the '{@link #getOut() <em>Out</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOut()
	 * @generated
	 * @ordered
	 */
	protected EList<TargetElementRule> out;

	/**
	 * The default value of the '{@link #getTypeAttribute() <em>Type Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final TypeAtribute TYPE_ATTRIBUTE_EDEFAULT = TypeAtribute.COPY;

	/**
	 * The cached value of the '{@link #getTypeAttribute() <em>Type Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAttribute()
	 * @generated
	 * @ordered
	 */
	protected TypeAtribute typeAttribute = TYPE_ATTRIBUTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeElement() <em>Type Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeElement()
	 * @generated
	 * @ordered
	 */
	protected static final TypeElem TYPE_ELEMENT_EDEFAULT = TypeElem.MY_ECLASSIFIER;

	/**
	 * The cached value of the '{@link #getTypeElement() <em>Type Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeElement()
	 * @generated
	 * @ordered
	 */
	protected TypeElem typeElement = TYPE_ELEMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExtends() <em>Extends</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected Rule extends_;

	/**
	 * The cached value of the '{@link #getIsExtended() <em>Is Extended</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsExtended()
	 * @generated
	 * @ordered
	 */
	protected EList<Rule> isExtended;

	/**
	 * The cached value of the '{@link #getRightPattern() <em>Right Pattern</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightPattern()
	 * @generated
	 * @ordered
	 */
	protected EList<RightPattern> rightPattern;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MM_HybridPackage.Literals.RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName_rule() {
		return name_rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName_rule(String newName_rule) {
		String oldName_rule = name_rule;
		name_rule = newName_rule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MM_HybridPackage.RULE__NAME_RULE, oldName_rule, name_rule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(boolean newIsAbstract) {
		boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MM_HybridPackage.RULE__IS_ABSTRACT, oldIsAbstract,
					isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsMain() {
		return isMain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMain(boolean newIsMain) {
		boolean oldIsMain = isMain;
		isMain = newIsMain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MM_HybridPackage.RULE__IS_MAIN, oldIsMain, isMain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SourceElementRule> getIn() {
		if (in == null) {
			in = new EObjectContainmentWithInverseEList<SourceElementRule>(
					SourceElementRule.class, this, MM_HybridPackage.RULE__IN,
					MM_HybridPackage.SOURCE_ELEMENT_RULE__RULE);
		}
		return in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TargetElementRule> getOut() {
		if (out == null) {
			out = new EObjectContainmentWithInverseEList<TargetElementRule>(
					TargetElementRule.class, this, MM_HybridPackage.RULE__OUT,
					MM_HybridPackage.TARGET_ELEMENT_RULE__RULE);
		}
		return out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAtribute getTypeAttribute() {
		return typeAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeAttribute(TypeAtribute newTypeAttribute) {
		TypeAtribute oldTypeAttribute = typeAttribute;
		typeAttribute = newTypeAttribute == null ? TYPE_ATTRIBUTE_EDEFAULT
				: newTypeAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MM_HybridPackage.RULE__TYPE_ATTRIBUTE, oldTypeAttribute,
					typeAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeElem getTypeElement() {
		return typeElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeElement(TypeElem newTypeElement) {
		TypeElem oldTypeElement = typeElement;
		typeElement = newTypeElement == null ? TYPE_ELEMENT_EDEFAULT
				: newTypeElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MM_HybridPackage.RULE__TYPE_ELEMENT, oldTypeElement,
					typeElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule getExtends() {
		if (extends_ != null && extends_.eIsProxy()) {
			InternalEObject oldExtends = (InternalEObject) extends_;
			extends_ = (Rule) eResolveProxy(oldExtends);
			if (extends_ != oldExtends) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MM_HybridPackage.RULE__EXTENDS, oldExtends,
							extends_));
			}
		}
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule basicGetExtends() {
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtends(Rule newExtends,
			NotificationChain msgs) {
		Rule oldExtends = extends_;
		extends_ = newExtends;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, MM_HybridPackage.RULE__EXTENDS,
					oldExtends, newExtends);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtends(Rule newExtends) {
		if (newExtends != extends_) {
			NotificationChain msgs = null;
			if (extends_ != null)
				msgs = ((InternalEObject) extends_).eInverseRemove(this,
						MM_HybridPackage.RULE__IS_EXTENDED, Rule.class, msgs);
			if (newExtends != null)
				msgs = ((InternalEObject) newExtends).eInverseAdd(this,
						MM_HybridPackage.RULE__IS_EXTENDED, Rule.class, msgs);
			msgs = basicSetExtends(newExtends, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MM_HybridPackage.RULE__EXTENDS, newExtends, newExtends));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rule> getIsExtended() {
		if (isExtended == null) {
			isExtended = new EObjectWithInverseResolvingEList<Rule>(Rule.class,
					this, MM_HybridPackage.RULE__IS_EXTENDED,
					MM_HybridPackage.RULE__EXTENDS);
		}
		return isExtended;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RightPattern> getRightPattern() {
		if (rightPattern == null) {
			rightPattern = new EObjectWithInverseResolvingEList.ManyInverse<RightPattern>(
					RightPattern.class, this,
					MM_HybridPackage.RULE__RIGHT_PATTERN,
					MM_HybridPackage.RIGHT_PATTERN__RULE);
		}
		return rightPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MM_HybridPackage.RULE__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module getModule() {
		if (eContainerFeatureID != MM_HybridPackage.RULE__MODULE)
			return null;
		return (Module) eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModule(Module newModule,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newModule,
				MM_HybridPackage.RULE__MODULE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModule(Module newModule) {
		if (newModule != eInternalContainer()
				|| (eContainerFeatureID != MM_HybridPackage.RULE__MODULE && newModule != null)) {
			if (EcoreUtil.isAncestor(this, newModule))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModule != null)
				msgs = ((InternalEObject) newModule).eInverseAdd(this,
						MM_HybridPackage.MODULE__RULE, Module.class, msgs);
			msgs = basicSetModule(newModule, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MM_HybridPackage.RULE__MODULE, newModule, newModule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MM_HybridPackage.RULE__IN:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getIn())
					.basicAdd(otherEnd, msgs);
		case MM_HybridPackage.RULE__OUT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOut())
					.basicAdd(otherEnd, msgs);
		case MM_HybridPackage.RULE__EXTENDS:
			if (extends_ != null)
				msgs = ((InternalEObject) extends_).eInverseRemove(this,
						MM_HybridPackage.RULE__IS_EXTENDED, Rule.class, msgs);
			return basicSetExtends((Rule) otherEnd, msgs);
		case MM_HybridPackage.RULE__IS_EXTENDED:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getIsExtended())
					.basicAdd(otherEnd, msgs);
		case MM_HybridPackage.RULE__RIGHT_PATTERN:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRightPattern())
					.basicAdd(otherEnd, msgs);
		case MM_HybridPackage.RULE__MODULE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetModule((Module) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MM_HybridPackage.RULE__IN:
			return ((InternalEList<?>) getIn()).basicRemove(otherEnd, msgs);
		case MM_HybridPackage.RULE__OUT:
			return ((InternalEList<?>) getOut()).basicRemove(otherEnd, msgs);
		case MM_HybridPackage.RULE__EXTENDS:
			return basicSetExtends(null, msgs);
		case MM_HybridPackage.RULE__IS_EXTENDED:
			return ((InternalEList<?>) getIsExtended()).basicRemove(otherEnd,
					msgs);
		case MM_HybridPackage.RULE__RIGHT_PATTERN:
			return ((InternalEList<?>) getRightPattern()).basicRemove(otherEnd,
					msgs);
		case MM_HybridPackage.RULE__MODULE:
			return basicSetModule(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID) {
		case MM_HybridPackage.RULE__MODULE:
			return eInternalContainer().eInverseRemove(this,
					MM_HybridPackage.MODULE__RULE, Module.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MM_HybridPackage.RULE__NAME_RULE:
			return getName_rule();
		case MM_HybridPackage.RULE__IS_ABSTRACT:
			return isIsAbstract() ? Boolean.TRUE : Boolean.FALSE;
		case MM_HybridPackage.RULE__IS_MAIN:
			return isIsMain() ? Boolean.TRUE : Boolean.FALSE;
		case MM_HybridPackage.RULE__IN:
			return getIn();
		case MM_HybridPackage.RULE__OUT:
			return getOut();
		case MM_HybridPackage.RULE__TYPE_ATTRIBUTE:
			return getTypeAttribute();
		case MM_HybridPackage.RULE__TYPE_ELEMENT:
			return getTypeElement();
		case MM_HybridPackage.RULE__EXTENDS:
			if (resolve)
				return getExtends();
			return basicGetExtends();
		case MM_HybridPackage.RULE__IS_EXTENDED:
			return getIsExtended();
		case MM_HybridPackage.RULE__RIGHT_PATTERN:
			return getRightPattern();
		case MM_HybridPackage.RULE__COMMENT:
			return getComment();
		case MM_HybridPackage.RULE__MODULE:
			return getModule();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MM_HybridPackage.RULE__NAME_RULE:
			setName_rule((String) newValue);
			return;
		case MM_HybridPackage.RULE__IS_ABSTRACT:
			setIsAbstract(((Boolean) newValue).booleanValue());
			return;
		case MM_HybridPackage.RULE__IS_MAIN:
			setIsMain(((Boolean) newValue).booleanValue());
			return;
		case MM_HybridPackage.RULE__IN:
			getIn().clear();
			getIn().addAll((Collection<? extends SourceElementRule>) newValue);
			return;
		case MM_HybridPackage.RULE__OUT:
			getOut().clear();
			getOut().addAll((Collection<? extends TargetElementRule>) newValue);
			return;
		case MM_HybridPackage.RULE__TYPE_ATTRIBUTE:
			setTypeAttribute((TypeAtribute) newValue);
			return;
		case MM_HybridPackage.RULE__TYPE_ELEMENT:
			setTypeElement((TypeElem) newValue);
			return;
		case MM_HybridPackage.RULE__EXTENDS:
			setExtends((Rule) newValue);
			return;
		case MM_HybridPackage.RULE__IS_EXTENDED:
			getIsExtended().clear();
			getIsExtended().addAll((Collection<? extends Rule>) newValue);
			return;
		case MM_HybridPackage.RULE__RIGHT_PATTERN:
			getRightPattern().clear();
			getRightPattern().addAll(
					(Collection<? extends RightPattern>) newValue);
			return;
		case MM_HybridPackage.RULE__COMMENT:
			setComment((String) newValue);
			return;
		case MM_HybridPackage.RULE__MODULE:
			setModule((Module) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case MM_HybridPackage.RULE__NAME_RULE:
			setName_rule(NAME_RULE_EDEFAULT);
			return;
		case MM_HybridPackage.RULE__IS_ABSTRACT:
			setIsAbstract(IS_ABSTRACT_EDEFAULT);
			return;
		case MM_HybridPackage.RULE__IS_MAIN:
			setIsMain(IS_MAIN_EDEFAULT);
			return;
		case MM_HybridPackage.RULE__IN:
			getIn().clear();
			return;
		case MM_HybridPackage.RULE__OUT:
			getOut().clear();
			return;
		case MM_HybridPackage.RULE__TYPE_ATTRIBUTE:
			setTypeAttribute(TYPE_ATTRIBUTE_EDEFAULT);
			return;
		case MM_HybridPackage.RULE__TYPE_ELEMENT:
			setTypeElement(TYPE_ELEMENT_EDEFAULT);
			return;
		case MM_HybridPackage.RULE__EXTENDS:
			setExtends((Rule) null);
			return;
		case MM_HybridPackage.RULE__IS_EXTENDED:
			getIsExtended().clear();
			return;
		case MM_HybridPackage.RULE__RIGHT_PATTERN:
			getRightPattern().clear();
			return;
		case MM_HybridPackage.RULE__COMMENT:
			setComment(COMMENT_EDEFAULT);
			return;
		case MM_HybridPackage.RULE__MODULE:
			setModule((Module) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MM_HybridPackage.RULE__NAME_RULE:
			return NAME_RULE_EDEFAULT == null ? name_rule != null
					: !NAME_RULE_EDEFAULT.equals(name_rule);
		case MM_HybridPackage.RULE__IS_ABSTRACT:
			return isAbstract != IS_ABSTRACT_EDEFAULT;
		case MM_HybridPackage.RULE__IS_MAIN:
			return isMain != IS_MAIN_EDEFAULT;
		case MM_HybridPackage.RULE__IN:
			return in != null && !in.isEmpty();
		case MM_HybridPackage.RULE__OUT:
			return out != null && !out.isEmpty();
		case MM_HybridPackage.RULE__TYPE_ATTRIBUTE:
			return typeAttribute != TYPE_ATTRIBUTE_EDEFAULT;
		case MM_HybridPackage.RULE__TYPE_ELEMENT:
			return typeElement != TYPE_ELEMENT_EDEFAULT;
		case MM_HybridPackage.RULE__EXTENDS:
			return extends_ != null;
		case MM_HybridPackage.RULE__IS_EXTENDED:
			return isExtended != null && !isExtended.isEmpty();
		case MM_HybridPackage.RULE__RIGHT_PATTERN:
			return rightPattern != null && !rightPattern.isEmpty();
		case MM_HybridPackage.RULE__COMMENT:
			return COMMENT_EDEFAULT == null ? comment != null
					: !COMMENT_EDEFAULT.equals(comment);
		case MM_HybridPackage.RULE__MODULE:
			return getModule() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name_rule: "); //$NON-NLS-1$
		result.append(name_rule);
		result.append(", isAbstract: "); //$NON-NLS-1$
		result.append(isAbstract);
		result.append(", isMain: "); //$NON-NLS-1$
		result.append(isMain);
		result.append(", typeAttribute: "); //$NON-NLS-1$
		result.append(typeAttribute);
		result.append(", typeElement: "); //$NON-NLS-1$
		result.append(typeElement);
		result.append(", comment: "); //$NON-NLS-1$
		result.append(comment);
		result.append(')');
		return result.toString();
	}

} //RuleImpl
