/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ETL.impl;

import ETL.ETLPackage;
import ETL.EolBlock;
import ETL.EtlModule;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eol Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ETL.impl.EolBlockImpl#getPostModule <em>Post Module</em>}</li>
 *   <li>{@link ETL.impl.EolBlockImpl#getPreModule <em>Pre Module</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EolBlockImpl extends BlockImpl implements EolBlock {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EolBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ETLPackage.Literals.EOL_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EtlModule getPostModule() {
		if (eContainerFeatureID() != ETLPackage.EOL_BLOCK__POST_MODULE) return null;
		return (EtlModule)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostModule(EtlModule newPostModule, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPostModule, ETLPackage.EOL_BLOCK__POST_MODULE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostModule(EtlModule newPostModule) {
		if (newPostModule != eInternalContainer() || (eContainerFeatureID() != ETLPackage.EOL_BLOCK__POST_MODULE && newPostModule != null)) {
			if (EcoreUtil.isAncestor(this, newPostModule))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPostModule != null)
				msgs = ((InternalEObject)newPostModule).eInverseAdd(this, ETLPackage.ETL_MODULE__POST, EtlModule.class, msgs);
			msgs = basicSetPostModule(newPostModule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ETLPackage.EOL_BLOCK__POST_MODULE, newPostModule, newPostModule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EtlModule getPreModule() {
		if (eContainerFeatureID() != ETLPackage.EOL_BLOCK__PRE_MODULE) return null;
		return (EtlModule)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreModule(EtlModule newPreModule, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPreModule, ETLPackage.EOL_BLOCK__PRE_MODULE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreModule(EtlModule newPreModule) {
		if (newPreModule != eInternalContainer() || (eContainerFeatureID() != ETLPackage.EOL_BLOCK__PRE_MODULE && newPreModule != null)) {
			if (EcoreUtil.isAncestor(this, newPreModule))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPreModule != null)
				msgs = ((InternalEObject)newPreModule).eInverseAdd(this, ETLPackage.ETL_MODULE__PRE, EtlModule.class, msgs);
			msgs = basicSetPreModule(newPreModule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ETLPackage.EOL_BLOCK__PRE_MODULE, newPreModule, newPreModule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ETLPackage.EOL_BLOCK__POST_MODULE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPostModule((EtlModule)otherEnd, msgs);
			case ETLPackage.EOL_BLOCK__PRE_MODULE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPreModule((EtlModule)otherEnd, msgs);
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
			case ETLPackage.EOL_BLOCK__POST_MODULE:
				return basicSetPostModule(null, msgs);
			case ETLPackage.EOL_BLOCK__PRE_MODULE:
				return basicSetPreModule(null, msgs);
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
			case ETLPackage.EOL_BLOCK__POST_MODULE:
				return eInternalContainer().eInverseRemove(this, ETLPackage.ETL_MODULE__POST, EtlModule.class, msgs);
			case ETLPackage.EOL_BLOCK__PRE_MODULE:
				return eInternalContainer().eInverseRemove(this, ETLPackage.ETL_MODULE__PRE, EtlModule.class, msgs);
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
			case ETLPackage.EOL_BLOCK__POST_MODULE:
				return getPostModule();
			case ETLPackage.EOL_BLOCK__PRE_MODULE:
				return getPreModule();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ETLPackage.EOL_BLOCK__POST_MODULE:
				setPostModule((EtlModule)newValue);
				return;
			case ETLPackage.EOL_BLOCK__PRE_MODULE:
				setPreModule((EtlModule)newValue);
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
			case ETLPackage.EOL_BLOCK__POST_MODULE:
				setPostModule((EtlModule)null);
				return;
			case ETLPackage.EOL_BLOCK__PRE_MODULE:
				setPreModule((EtlModule)null);
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
			case ETLPackage.EOL_BLOCK__POST_MODULE:
				return getPostModule() != null;
			case ETLPackage.EOL_BLOCK__PRE_MODULE:
				return getPreModule() != null;
		}
		return super.eIsSet(featureID);
	}

} //EolBlockImpl
