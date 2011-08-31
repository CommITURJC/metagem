/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hybrid.impl;

import hybrid.Guard;
import hybrid.HybridPackage;
import hybrid.Module;
import hybrid.Rule;
import hybrid.Source;
import hybrid.Target;
import hybrid.TraceRule;
import hybrid.TypeElement;
import hybrid.TypeRelation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hybrid.impl.RuleImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link hybrid.impl.RuleImpl#getModule <em>Module</em>}</li>
 *   <li>{@link hybrid.impl.RuleImpl#isIsMain <em>Is Main</em>}</li>
 *   <li>{@link hybrid.impl.RuleImpl#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link hybrid.impl.RuleImpl#getTypeRelation <em>Type Relation</em>}</li>
 *   <li>{@link hybrid.impl.RuleImpl#getTypeElement <em>Type Element</em>}</li>
 *   <li>{@link hybrid.impl.RuleImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link hybrid.impl.RuleImpl#getSources <em>Sources</em>}</li>
 *   <li>{@link hybrid.impl.RuleImpl#getTargets <em>Targets</em>}</li>
 *   <li>{@link hybrid.impl.RuleImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link hybrid.impl.RuleImpl#getTrace <em>Trace</em>}</li>
 *   <li>{@link hybrid.impl.RuleImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link hybrid.impl.RuleImpl#getIsExtended <em>Is Extended</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleImpl extends HybridElementImpl implements Rule {
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
	 * The default value of the '{@link #isIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_UNIQUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnique()
	 * @generated
	 * @ordered
	 */
	protected boolean isUnique = IS_UNIQUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeRelation() <em>Type Relation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeRelation()
	 * @generated
	 * @ordered
	 */
	protected static final TypeRelation TYPE_RELATION_EDEFAULT = TypeRelation.COPY;

	/**
	 * The cached value of the '{@link #getTypeRelation() <em>Type Relation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeRelation()
	 * @generated
	 * @ordered
	 */
	protected TypeRelation typeRelation = TYPE_RELATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeElement() <em>Type Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeElement()
	 * @generated
	 * @ordered
	 */
	protected static final TypeElement TYPE_ELEMENT_EDEFAULT = TypeElement.ECLASSIFIER;

	/**
	 * The cached value of the '{@link #getTypeElement() <em>Type Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeElement()
	 * @generated
	 * @ordered
	 */
	protected TypeElement typeElement = TYPE_ELEMENT_EDEFAULT;

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
	 * The cached value of the '{@link #getSources() <em>Sources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSources()
	 * @generated
	 * @ordered
	 */
	protected EList<Source> sources;

	/**
	 * The cached value of the '{@link #getTargets() <em>Targets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	protected EList<Target> targets;

	/**
	 * The cached value of the '{@link #getGuard() <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard()
	 * @generated
	 * @ordered
	 */
	protected Guard guard;

	/**
	 * The cached value of the '{@link #getTrace() <em>Trace</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrace()
	 * @generated
	 * @ordered
	 */
	protected TraceRule trace;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NOT generated
	 */
	protected RuleImpl() {
		super();
		
//		if(this.getTrace()==null){
//		//To create a TraceRule programmatically
//			HybridFactoryImpl factory = new HybridFactoryImpl();
//			TraceRule tracerule = factory.createTraceRule();
//			this.setTrace(tracerule);
//		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HybridPackage.Literals.RULE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, HybridPackage.RULE__IS_ABSTRACT, oldIsAbstract, isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module getModule() {
		if (eContainerFeatureID() != HybridPackage.RULE__MODULE) return null;
		return (Module)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModule(Module newModule, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newModule, HybridPackage.RULE__MODULE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModule(Module newModule) {
		if (newModule != eInternalContainer() || (eContainerFeatureID() != HybridPackage.RULE__MODULE && newModule != null)) {
			if (EcoreUtil.isAncestor(this, newModule))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModule != null)
				msgs = ((InternalEObject)newModule).eInverseAdd(this, HybridPackage.MODULE__RULES, Module.class, msgs);
			msgs = basicSetModule(newModule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HybridPackage.RULE__MODULE, newModule, newModule));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HybridPackage.RULE__IS_MAIN, oldIsMain, isMain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsUnique() {
		return isUnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsUnique(boolean newIsUnique) {
		boolean oldIsUnique = isUnique;
		isUnique = newIsUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HybridPackage.RULE__IS_UNIQUE, oldIsUnique, isUnique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeRelation getTypeRelation() {
		return typeRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeRelation(TypeRelation newTypeRelation) {
		TypeRelation oldTypeRelation = typeRelation;
		typeRelation = newTypeRelation == null ? TYPE_RELATION_EDEFAULT : newTypeRelation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HybridPackage.RULE__TYPE_RELATION, oldTypeRelation, typeRelation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeElement getTypeElement() {
		return typeElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeElement(TypeElement newTypeElement) {
		TypeElement oldTypeElement = typeElement;
		typeElement = newTypeElement == null ? TYPE_ELEMENT_EDEFAULT : newTypeElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HybridPackage.RULE__TYPE_ELEMENT, oldTypeElement, typeElement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HybridPackage.RULE__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NOT generated
	 */
	public EList<Source> getSources() {
		if (sources == null) {
			sources = new EObjectContainmentWithInverseEList<Source>(Source.class, this, HybridPackage.RULE__SOURCES, HybridPackage.SOURCE__RULE);
		}
		//Update TraceRule Sources
		TraceRule traceRule = this.getTrace();
		if(traceRule!=null){
			for(int i=0;i<sources.size();i++){
				if(!traceRule.getSource().contains(sources.get(i))){
					traceRule.getSource().add(sources.get(i));
				}
			}
					
		}			
		return sources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NOT generated
	 */
	public EList<Target> getTargets() {
		if (targets == null) {
			targets = new EObjectContainmentWithInverseEList<Target>(Target.class, this, HybridPackage.RULE__TARGETS, HybridPackage.TARGET__RULE);
		}
		//Update TraceRule Targets
		TraceRule traceRule = this.getTrace();
		if(traceRule!=null){
			for(int i=0;i<targets.size();i++){
				if(!traceRule.getTarget().contains(targets.get(i))){
					traceRule.getTarget().add(targets.get(i));
				}
			}
			
		}	
		return targets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Guard getGuard() {
		return guard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuard(Guard newGuard, NotificationChain msgs) {
		Guard oldGuard = guard;
		guard = newGuard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HybridPackage.RULE__GUARD, oldGuard, newGuard);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuard(Guard newGuard) {
		if (newGuard != guard) {
			NotificationChain msgs = null;
			if (guard != null)
				msgs = ((InternalEObject)guard).eInverseRemove(this, HybridPackage.GUARD__RULE, Guard.class, msgs);
			if (newGuard != null)
				msgs = ((InternalEObject)newGuard).eInverseAdd(this, HybridPackage.GUARD__RULE, Guard.class, msgs);
			msgs = basicSetGuard(newGuard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HybridPackage.RULE__GUARD, newGuard, newGuard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceRule getTrace() {
		return trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrace(TraceRule newTrace, NotificationChain msgs) {
		TraceRule oldTrace = trace;
		trace = newTrace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HybridPackage.RULE__TRACE, oldTrace, newTrace);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrace(TraceRule newTrace) {
		if (newTrace != trace) {
			NotificationChain msgs = null;
			if (trace != null)
				msgs = ((InternalEObject)trace).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HybridPackage.RULE__TRACE, null, msgs);
			if (newTrace != null)
				msgs = ((InternalEObject)newTrace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HybridPackage.RULE__TRACE, null, msgs);
			msgs = basicSetTrace(newTrace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HybridPackage.RULE__TRACE, newTrace, newTrace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule getExtends() {
		if (extends_ != null && extends_.eIsProxy()) {
			InternalEObject oldExtends = (InternalEObject)extends_;
			extends_ = (Rule)eResolveProxy(oldExtends);
			if (extends_ != oldExtends) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HybridPackage.RULE__EXTENDS, oldExtends, extends_));
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
	public NotificationChain basicSetExtends(Rule newExtends, NotificationChain msgs) {
		Rule oldExtends = extends_;
		extends_ = newExtends;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HybridPackage.RULE__EXTENDS, oldExtends, newExtends);
			if (msgs == null) msgs = notification; else msgs.add(notification);
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
				msgs = ((InternalEObject)extends_).eInverseRemove(this, HybridPackage.RULE__IS_EXTENDED, Rule.class, msgs);
			if (newExtends != null)
				msgs = ((InternalEObject)newExtends).eInverseAdd(this, HybridPackage.RULE__IS_EXTENDED, Rule.class, msgs);
			msgs = basicSetExtends(newExtends, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HybridPackage.RULE__EXTENDS, newExtends, newExtends));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rule> getIsExtended() {
		if (isExtended == null) {
			isExtended = new EObjectWithInverseResolvingEList<Rule>(Rule.class, this, HybridPackage.RULE__IS_EXTENDED, HybridPackage.RULE__EXTENDS);
		}
		return isExtended;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HybridPackage.RULE__MODULE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetModule((Module)otherEnd, msgs);
			case HybridPackage.RULE__SOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSources()).basicAdd(otherEnd, msgs);
			case HybridPackage.RULE__TARGETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTargets()).basicAdd(otherEnd, msgs);
			case HybridPackage.RULE__GUARD:
				if (guard != null)
					msgs = ((InternalEObject)guard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HybridPackage.RULE__GUARD, null, msgs);
				return basicSetGuard((Guard)otherEnd, msgs);
			case HybridPackage.RULE__EXTENDS:
				if (extends_ != null)
					msgs = ((InternalEObject)extends_).eInverseRemove(this, HybridPackage.RULE__IS_EXTENDED, Rule.class, msgs);
				return basicSetExtends((Rule)otherEnd, msgs);
			case HybridPackage.RULE__IS_EXTENDED:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsExtended()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HybridPackage.RULE__MODULE:
				return basicSetModule(null, msgs);
			case HybridPackage.RULE__SOURCES:
				return ((InternalEList<?>)getSources()).basicRemove(otherEnd, msgs);
			case HybridPackage.RULE__TARGETS:
				return ((InternalEList<?>)getTargets()).basicRemove(otherEnd, msgs);
			case HybridPackage.RULE__GUARD:
				return basicSetGuard(null, msgs);
			case HybridPackage.RULE__TRACE:
				return basicSetTrace(null, msgs);
			case HybridPackage.RULE__EXTENDS:
				return basicSetExtends(null, msgs);
			case HybridPackage.RULE__IS_EXTENDED:
				return ((InternalEList<?>)getIsExtended()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case HybridPackage.RULE__MODULE:
				return eInternalContainer().eInverseRemove(this, HybridPackage.MODULE__RULES, Module.class, msgs);
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
			case HybridPackage.RULE__IS_ABSTRACT:
				return isIsAbstract();
			case HybridPackage.RULE__MODULE:
				return getModule();
			case HybridPackage.RULE__IS_MAIN:
				return isIsMain();
			case HybridPackage.RULE__IS_UNIQUE:
				return isIsUnique();
			case HybridPackage.RULE__TYPE_RELATION:
				return getTypeRelation();
			case HybridPackage.RULE__TYPE_ELEMENT:
				return getTypeElement();
			case HybridPackage.RULE__COMMENT:
				return getComment();
			case HybridPackage.RULE__SOURCES:
				return getSources();
			case HybridPackage.RULE__TARGETS:
				return getTargets();
			case HybridPackage.RULE__GUARD:
				return getGuard();
			case HybridPackage.RULE__TRACE:
				return getTrace();
			case HybridPackage.RULE__EXTENDS:
				if (resolve) return getExtends();
				return basicGetExtends();
			case HybridPackage.RULE__IS_EXTENDED:
				return getIsExtended();
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
			case HybridPackage.RULE__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
			case HybridPackage.RULE__MODULE:
				setModule((Module)newValue);
				return;
			case HybridPackage.RULE__IS_MAIN:
				setIsMain((Boolean)newValue);
				return;
			case HybridPackage.RULE__IS_UNIQUE:
				setIsUnique((Boolean)newValue);
				return;
			case HybridPackage.RULE__TYPE_RELATION:
				setTypeRelation((TypeRelation)newValue);
				return;
			case HybridPackage.RULE__TYPE_ELEMENT:
				setTypeElement((TypeElement)newValue);
				return;
			case HybridPackage.RULE__COMMENT:
				setComment((String)newValue);
				return;
			case HybridPackage.RULE__SOURCES:
				getSources().clear();
				getSources().addAll((Collection<? extends Source>)newValue);
				return;
			case HybridPackage.RULE__TARGETS:
				getTargets().clear();
				getTargets().addAll((Collection<? extends Target>)newValue);
				return;
			case HybridPackage.RULE__GUARD:
				setGuard((Guard)newValue);
				return;
			case HybridPackage.RULE__TRACE:
				setTrace((TraceRule)newValue);
				return;
			case HybridPackage.RULE__EXTENDS:
				setExtends((Rule)newValue);
				return;
			case HybridPackage.RULE__IS_EXTENDED:
				getIsExtended().clear();
				getIsExtended().addAll((Collection<? extends Rule>)newValue);
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
			case HybridPackage.RULE__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case HybridPackage.RULE__MODULE:
				setModule((Module)null);
				return;
			case HybridPackage.RULE__IS_MAIN:
				setIsMain(IS_MAIN_EDEFAULT);
				return;
			case HybridPackage.RULE__IS_UNIQUE:
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case HybridPackage.RULE__TYPE_RELATION:
				setTypeRelation(TYPE_RELATION_EDEFAULT);
				return;
			case HybridPackage.RULE__TYPE_ELEMENT:
				setTypeElement(TYPE_ELEMENT_EDEFAULT);
				return;
			case HybridPackage.RULE__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case HybridPackage.RULE__SOURCES:
				getSources().clear();
				return;
			case HybridPackage.RULE__TARGETS:
				getTargets().clear();
				return;
			case HybridPackage.RULE__GUARD:
				setGuard((Guard)null);
				return;
			case HybridPackage.RULE__TRACE:
				setTrace((TraceRule)null);
				return;
			case HybridPackage.RULE__EXTENDS:
				setExtends((Rule)null);
				return;
			case HybridPackage.RULE__IS_EXTENDED:
				getIsExtended().clear();
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
			case HybridPackage.RULE__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
			case HybridPackage.RULE__MODULE:
				return getModule() != null;
			case HybridPackage.RULE__IS_MAIN:
				return isMain != IS_MAIN_EDEFAULT;
			case HybridPackage.RULE__IS_UNIQUE:
				return isUnique != IS_UNIQUE_EDEFAULT;
			case HybridPackage.RULE__TYPE_RELATION:
				return typeRelation != TYPE_RELATION_EDEFAULT;
			case HybridPackage.RULE__TYPE_ELEMENT:
				return typeElement != TYPE_ELEMENT_EDEFAULT;
			case HybridPackage.RULE__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case HybridPackage.RULE__SOURCES:
				return sources != null && !sources.isEmpty();
			case HybridPackage.RULE__TARGETS:
				return targets != null && !targets.isEmpty();
			case HybridPackage.RULE__GUARD:
				return guard != null;
			case HybridPackage.RULE__TRACE:
				return trace != null;
			case HybridPackage.RULE__EXTENDS:
				return extends_ != null;
			case HybridPackage.RULE__IS_EXTENDED:
				return isExtended != null && !isExtended.isEmpty();
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isAbstract: ");
		result.append(isAbstract);
		result.append(", isMain: ");
		result.append(isMain);
		result.append(", isUnique: ");
		result.append(isUnique);
		result.append(", typeRelation: ");
		result.append(typeRelation);
		result.append(", typeElement: ");
		result.append(typeElement);
		result.append(", comment: ");
		result.append(comment);
		result.append(')');
		return result.toString();
	}

} //RuleImpl
