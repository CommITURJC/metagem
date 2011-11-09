/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ETL.impl;

import ETL.Binding;
import ETL.ETLPackage;
import ETL.Element;
import ETL.EtlModule;
import ETL.Guard;
import ETL.TransformationRule;

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
 * An implementation of the model object '<em><b>Transformation Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ETL.impl.TransformationRuleImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link ETL.impl.TransformationRuleImpl#getModule <em>Module</em>}</li>
 *   <li>{@link ETL.impl.TransformationRuleImpl#isLazy <em>Lazy</em>}</li>
 *   <li>{@link ETL.impl.TransformationRuleImpl#isPrimary <em>Primary</em>}</li>
 *   <li>{@link ETL.impl.TransformationRuleImpl#isGreedy <em>Greedy</em>}</li>
 *   <li>{@link ETL.impl.TransformationRuleImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link ETL.impl.TransformationRuleImpl#getSource <em>Source</em>}</li>
 *   <li>{@link ETL.impl.TransformationRuleImpl#getTargets <em>Targets</em>}</li>
 *   <li>{@link ETL.impl.TransformationRuleImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link ETL.impl.TransformationRuleImpl#getIsExtended <em>Is Extended</em>}</li>
 *   <li>{@link ETL.impl.TransformationRuleImpl#getBindings <em>Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransformationRuleImpl extends EtlElementImpl implements TransformationRule {
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
	 * The default value of the '{@link #isLazy() <em>Lazy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLazy()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LAZY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLazy() <em>Lazy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLazy()
	 * @generated
	 * @ordered
	 */
	protected boolean lazy = LAZY_EDEFAULT;

	/**
	 * The default value of the '{@link #isPrimary() <em>Primary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrimary()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRIMARY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPrimary() <em>Primary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrimary()
	 * @generated
	 * @ordered
	 */
	protected boolean primary = PRIMARY_EDEFAULT;

	/**
	 * The default value of the '{@link #isGreedy() <em>Greedy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGreedy()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GREEDY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGreedy() <em>Greedy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGreedy()
	 * @generated
	 * @ordered
	 */
	protected boolean greedy = GREEDY_EDEFAULT;

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
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Element source;

	/**
	 * The cached value of the '{@link #getTargets() <em>Targets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> targets;

	/**
	 * The cached value of the '{@link #getExtends() <em>Extends</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected EList<TransformationRule> extends_;

	/**
	 * The cached value of the '{@link #getIsExtended() <em>Is Extended</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsExtended()
	 * @generated
	 * @ordered
	 */
	protected EList<TransformationRule> isExtended;

	/**
	 * The cached value of the '{@link #getBindings() <em>Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<Binding> bindings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformationRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ETLPackage.Literals.TRANSFORMATION_RULE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ETLPackage.TRANSFORMATION_RULE__IS_ABSTRACT, oldIsAbstract, isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EtlModule getModule() {
		if (eContainerFeatureID() != ETLPackage.TRANSFORMATION_RULE__MODULE) return null;
		return (EtlModule)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModule(EtlModule newModule, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newModule, ETLPackage.TRANSFORMATION_RULE__MODULE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModule(EtlModule newModule) {
		if (newModule != eInternalContainer() || (eContainerFeatureID() != ETLPackage.TRANSFORMATION_RULE__MODULE && newModule != null)) {
			if (EcoreUtil.isAncestor(this, newModule))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModule != null)
				msgs = ((InternalEObject)newModule).eInverseAdd(this, ETLPackage.ETL_MODULE__RULES, EtlModule.class, msgs);
			msgs = basicSetModule(newModule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ETLPackage.TRANSFORMATION_RULE__MODULE, newModule, newModule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLazy() {
		return lazy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLazy(boolean newLazy) {
		boolean oldLazy = lazy;
		lazy = newLazy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ETLPackage.TRANSFORMATION_RULE__LAZY, oldLazy, lazy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPrimary() {
		return primary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimary(boolean newPrimary) {
		boolean oldPrimary = primary;
		primary = newPrimary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ETLPackage.TRANSFORMATION_RULE__PRIMARY, oldPrimary, primary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGreedy() {
		return greedy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGreedy(boolean newGreedy) {
		boolean oldGreedy = greedy;
		greedy = newGreedy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ETLPackage.TRANSFORMATION_RULE__GREEDY, oldGreedy, greedy));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ETLPackage.TRANSFORMATION_RULE__GUARD, oldGuard, newGuard);
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
				msgs = ((InternalEObject)guard).eInverseRemove(this, ETLPackage.GUARD__RULE, Guard.class, msgs);
			if (newGuard != null)
				msgs = ((InternalEObject)newGuard).eInverseAdd(this, ETLPackage.GUARD__RULE, Guard.class, msgs);
			msgs = basicSetGuard(newGuard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ETLPackage.TRANSFORMATION_RULE__GUARD, newGuard, newGuard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Element newSource, NotificationChain msgs) {
		Element oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ETLPackage.TRANSFORMATION_RULE__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Element newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, ETLPackage.ELEMENT__SOURCE_RULE, Element.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, ETLPackage.ELEMENT__SOURCE_RULE, Element.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ETLPackage.TRANSFORMATION_RULE__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getTargets() {
		if (targets == null) {
			targets = new EObjectContainmentWithInverseEList<Element>(Element.class, this, ETLPackage.TRANSFORMATION_RULE__TARGETS, ETLPackage.ELEMENT__TARGETS_RULE);
		}
		return targets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransformationRule> getExtends() {
		if (extends_ == null) {
			extends_ = new EObjectWithInverseResolvingEList.ManyInverse<TransformationRule>(TransformationRule.class, this, ETLPackage.TRANSFORMATION_RULE__EXTENDS, ETLPackage.TRANSFORMATION_RULE__IS_EXTENDED);
		}
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransformationRule> getIsExtended() {
		if (isExtended == null) {
			isExtended = new EObjectWithInverseResolvingEList.ManyInverse<TransformationRule>(TransformationRule.class, this, ETLPackage.TRANSFORMATION_RULE__IS_EXTENDED, ETLPackage.TRANSFORMATION_RULE__EXTENDS);
		}
		return isExtended;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Binding> getBindings() {
		if (bindings == null) {
			bindings = new EObjectContainmentWithInverseEList<Binding>(Binding.class, this, ETLPackage.TRANSFORMATION_RULE__BINDINGS, ETLPackage.BINDING__RULE);
		}
		return bindings;
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
			case ETLPackage.TRANSFORMATION_RULE__MODULE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetModule((EtlModule)otherEnd, msgs);
			case ETLPackage.TRANSFORMATION_RULE__GUARD:
				if (guard != null)
					msgs = ((InternalEObject)guard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ETLPackage.TRANSFORMATION_RULE__GUARD, null, msgs);
				return basicSetGuard((Guard)otherEnd, msgs);
			case ETLPackage.TRANSFORMATION_RULE__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ETLPackage.TRANSFORMATION_RULE__SOURCE, null, msgs);
				return basicSetSource((Element)otherEnd, msgs);
			case ETLPackage.TRANSFORMATION_RULE__TARGETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTargets()).basicAdd(otherEnd, msgs);
			case ETLPackage.TRANSFORMATION_RULE__EXTENDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExtends()).basicAdd(otherEnd, msgs);
			case ETLPackage.TRANSFORMATION_RULE__IS_EXTENDED:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsExtended()).basicAdd(otherEnd, msgs);
			case ETLPackage.TRANSFORMATION_RULE__BINDINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBindings()).basicAdd(otherEnd, msgs);
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
			case ETLPackage.TRANSFORMATION_RULE__MODULE:
				return basicSetModule(null, msgs);
			case ETLPackage.TRANSFORMATION_RULE__GUARD:
				return basicSetGuard(null, msgs);
			case ETLPackage.TRANSFORMATION_RULE__SOURCE:
				return basicSetSource(null, msgs);
			case ETLPackage.TRANSFORMATION_RULE__TARGETS:
				return ((InternalEList<?>)getTargets()).basicRemove(otherEnd, msgs);
			case ETLPackage.TRANSFORMATION_RULE__EXTENDS:
				return ((InternalEList<?>)getExtends()).basicRemove(otherEnd, msgs);
			case ETLPackage.TRANSFORMATION_RULE__IS_EXTENDED:
				return ((InternalEList<?>)getIsExtended()).basicRemove(otherEnd, msgs);
			case ETLPackage.TRANSFORMATION_RULE__BINDINGS:
				return ((InternalEList<?>)getBindings()).basicRemove(otherEnd, msgs);
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
			case ETLPackage.TRANSFORMATION_RULE__MODULE:
				return eInternalContainer().eInverseRemove(this, ETLPackage.ETL_MODULE__RULES, EtlModule.class, msgs);
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
			case ETLPackage.TRANSFORMATION_RULE__IS_ABSTRACT:
				return isIsAbstract();
			case ETLPackage.TRANSFORMATION_RULE__MODULE:
				return getModule();
			case ETLPackage.TRANSFORMATION_RULE__LAZY:
				return isLazy();
			case ETLPackage.TRANSFORMATION_RULE__PRIMARY:
				return isPrimary();
			case ETLPackage.TRANSFORMATION_RULE__GREEDY:
				return isGreedy();
			case ETLPackage.TRANSFORMATION_RULE__GUARD:
				return getGuard();
			case ETLPackage.TRANSFORMATION_RULE__SOURCE:
				return getSource();
			case ETLPackage.TRANSFORMATION_RULE__TARGETS:
				return getTargets();
			case ETLPackage.TRANSFORMATION_RULE__EXTENDS:
				return getExtends();
			case ETLPackage.TRANSFORMATION_RULE__IS_EXTENDED:
				return getIsExtended();
			case ETLPackage.TRANSFORMATION_RULE__BINDINGS:
				return getBindings();
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
			case ETLPackage.TRANSFORMATION_RULE__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
			case ETLPackage.TRANSFORMATION_RULE__MODULE:
				setModule((EtlModule)newValue);
				return;
			case ETLPackage.TRANSFORMATION_RULE__LAZY:
				setLazy((Boolean)newValue);
				return;
			case ETLPackage.TRANSFORMATION_RULE__PRIMARY:
				setPrimary((Boolean)newValue);
				return;
			case ETLPackage.TRANSFORMATION_RULE__GREEDY:
				setGreedy((Boolean)newValue);
				return;
			case ETLPackage.TRANSFORMATION_RULE__GUARD:
				setGuard((Guard)newValue);
				return;
			case ETLPackage.TRANSFORMATION_RULE__SOURCE:
				setSource((Element)newValue);
				return;
			case ETLPackage.TRANSFORMATION_RULE__TARGETS:
				getTargets().clear();
				getTargets().addAll((Collection<? extends Element>)newValue);
				return;
			case ETLPackage.TRANSFORMATION_RULE__EXTENDS:
				getExtends().clear();
				getExtends().addAll((Collection<? extends TransformationRule>)newValue);
				return;
			case ETLPackage.TRANSFORMATION_RULE__IS_EXTENDED:
				getIsExtended().clear();
				getIsExtended().addAll((Collection<? extends TransformationRule>)newValue);
				return;
			case ETLPackage.TRANSFORMATION_RULE__BINDINGS:
				getBindings().clear();
				getBindings().addAll((Collection<? extends Binding>)newValue);
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
			case ETLPackage.TRANSFORMATION_RULE__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case ETLPackage.TRANSFORMATION_RULE__MODULE:
				setModule((EtlModule)null);
				return;
			case ETLPackage.TRANSFORMATION_RULE__LAZY:
				setLazy(LAZY_EDEFAULT);
				return;
			case ETLPackage.TRANSFORMATION_RULE__PRIMARY:
				setPrimary(PRIMARY_EDEFAULT);
				return;
			case ETLPackage.TRANSFORMATION_RULE__GREEDY:
				setGreedy(GREEDY_EDEFAULT);
				return;
			case ETLPackage.TRANSFORMATION_RULE__GUARD:
				setGuard((Guard)null);
				return;
			case ETLPackage.TRANSFORMATION_RULE__SOURCE:
				setSource((Element)null);
				return;
			case ETLPackage.TRANSFORMATION_RULE__TARGETS:
				getTargets().clear();
				return;
			case ETLPackage.TRANSFORMATION_RULE__EXTENDS:
				getExtends().clear();
				return;
			case ETLPackage.TRANSFORMATION_RULE__IS_EXTENDED:
				getIsExtended().clear();
				return;
			case ETLPackage.TRANSFORMATION_RULE__BINDINGS:
				getBindings().clear();
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
			case ETLPackage.TRANSFORMATION_RULE__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
			case ETLPackage.TRANSFORMATION_RULE__MODULE:
				return getModule() != null;
			case ETLPackage.TRANSFORMATION_RULE__LAZY:
				return lazy != LAZY_EDEFAULT;
			case ETLPackage.TRANSFORMATION_RULE__PRIMARY:
				return primary != PRIMARY_EDEFAULT;
			case ETLPackage.TRANSFORMATION_RULE__GREEDY:
				return greedy != GREEDY_EDEFAULT;
			case ETLPackage.TRANSFORMATION_RULE__GUARD:
				return guard != null;
			case ETLPackage.TRANSFORMATION_RULE__SOURCE:
				return source != null;
			case ETLPackage.TRANSFORMATION_RULE__TARGETS:
				return targets != null && !targets.isEmpty();
			case ETLPackage.TRANSFORMATION_RULE__EXTENDS:
				return extends_ != null && !extends_.isEmpty();
			case ETLPackage.TRANSFORMATION_RULE__IS_EXTENDED:
				return isExtended != null && !isExtended.isEmpty();
			case ETLPackage.TRANSFORMATION_RULE__BINDINGS:
				return bindings != null && !bindings.isEmpty();
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
		result.append(", lazy: ");
		result.append(lazy);
		result.append(", primary: ");
		result.append(primary);
		result.append(", greedy: ");
		result.append(greedy);
		result.append(')');
		return result.toString();
	}

} //TransformationRuleImpl
