/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metagem.provider;


import java.util.Collection;
import java.util.List;

import metagem.MetagemFactory;
import metagem.MetagemPackage;
import metagem.ModelRoot;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link metagem.ModelRoot} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelRootItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelRootItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ModelRoot_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ModelRoot_name_feature", "_UI_ModelRoot_type"),
				 MetagemPackage.Literals.MODEL_ROOT__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(MetagemPackage.Literals.MODEL_ROOT__SOURCE_MODELS);
			childrenFeatures.add(MetagemPackage.Literals.MODEL_ROOT__TARGET_MODELS);
			childrenFeatures.add(MetagemPackage.Literals.MODEL_ROOT__RELATIONS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ModelRoot.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ModelRoot"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ModelRoot)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ModelRoot_type") :
			getString("_UI_ModelRoot_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ModelRoot.class)) {
			case MetagemPackage.MODEL_ROOT__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case MetagemPackage.MODEL_ROOT__SOURCE_MODELS:
			case MetagemPackage.MODEL_ROOT__TARGET_MODELS:
			case MetagemPackage.MODEL_ROOT__RELATIONS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(MetagemPackage.Literals.MODEL_ROOT__SOURCE_MODELS,
				 MetagemFactory.eINSTANCE.createSourceModelTransf()));

		newChildDescriptors.add
			(createChildParameter
				(MetagemPackage.Literals.MODEL_ROOT__TARGET_MODELS,
				 MetagemFactory.eINSTANCE.createTargetModelTransf()));

		newChildDescriptors.add
			(createChildParameter
				(MetagemPackage.Literals.MODEL_ROOT__RELATIONS,
				 MetagemFactory.eINSTANCE.createOneToOne()));

		newChildDescriptors.add
			(createChildParameter
				(MetagemPackage.Literals.MODEL_ROOT__RELATIONS,
				 MetagemFactory.eINSTANCE.createOneToZero()));

		newChildDescriptors.add
			(createChildParameter
				(MetagemPackage.Literals.MODEL_ROOT__RELATIONS,
				 MetagemFactory.eINSTANCE.createZeroToOne()));

		newChildDescriptors.add
			(createChildParameter
				(MetagemPackage.Literals.MODEL_ROOT__RELATIONS,
				 MetagemFactory.eINSTANCE.createOneToMany()));

		newChildDescriptors.add
			(createChildParameter
				(MetagemPackage.Literals.MODEL_ROOT__RELATIONS,
				 MetagemFactory.eINSTANCE.createManyToOne()));

		newChildDescriptors.add
			(createChildParameter
				(MetagemPackage.Literals.MODEL_ROOT__RELATIONS,
				 MetagemFactory.eINSTANCE.createManyToMany()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return MeTAGeMEditPlugin.INSTANCE;
	}

}
