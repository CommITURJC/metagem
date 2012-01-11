/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hybrid.provider;


//import hybrid.Datatype;
import hybrid.HybridFactory;
import hybrid.HybridPackage;
import hybrid.OpDefinition;

import java.util.Collection;
import java.util.List;

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
 * This is the item provider adapter for a {@link hybrid.OpDefinition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OpDefinitionItemProvider
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
	public OpDefinitionItemProvider(AdapterFactory adapterFactory) {
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

			addDatatypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Datatype feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NOT generated
	 */
	protected void addDatatypePropertyDescriptor(Object object) {
		if (((OpDefinition)object).eContainingFeature().getName().equals("return")){
			itemPropertyDescriptors.add
				(createItemPropertyDescriptor
					(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
					 getResourceLocator(),
					 getString("_UI_OpDefinition_datatype_feature"),
					 getString("_UI_PropertyDescriptor_description", "_UI_OpDefinition_datatype_feature", "_UI_OpDefinition_type_return"),
					 HybridPackage.Literals.OP_DEFINITION__DATATYPE,
					 true,
					 false,
					 false,
					 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
					 null,
					 null));
		}else{
			itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OpDefinition_datatype_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OpDefinition_datatype_feature", "_UI_OpDefinition_type_context"),
				 HybridPackage.Literals.OP_DEFINITION__DATATYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));

		}
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
			childrenFeatures.add(HybridPackage.Literals.OP_DEFINITION__COMPONENT);
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
	 * This returns OpDefinition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NOT generated
	 */
	@Override
	public Object getImage(Object object) {
		if (((OpDefinition)object).eContainingFeature().getName().equals("return")){
			return overlayImage(object, getResourceLocator().getImage("full/obj16/Return"));
		}else{
			return overlayImage(object, getResourceLocator().getImage("full/obj16/OpDefinition"));
		}
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NOT generated
	 */
	@Override
	public String getText(Object object) {
//		Datatype labelValue = ((OpDefinition)object).getDatatype();
//		String label = labelValue == null ? null : labelValue.toString();
//		return label == null || label.length() == 0 ?
//				getLabelString((OpDefinition)object) :
//					getLabelString((OpDefinition)object) + " " + label;
		
		return getLabelString((OpDefinition)object);
	}
	
	private String getLabelString (OpDefinition object){
		if (object.eContainingFeature().getName().equals("return"))
			return getString("_UI_OpDefinition_type_return");
		else
			return getString("_UI_OpDefinition_type_context");
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

		switch (notification.getFeatureID(OpDefinition.class)) {
			case HybridPackage.OP_DEFINITION__DATATYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case HybridPackage.OP_DEFINITION__COMPONENT:
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
				(HybridPackage.Literals.OP_DEFINITION__COMPONENT,
				 HybridFactory.eINSTANCE.createSource()));

		newChildDescriptors.add
			(createChildParameter
				(HybridPackage.Literals.OP_DEFINITION__COMPONENT,
				 HybridFactory.eINSTANCE.createTarget()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return HybridEditPlugin.INSTANCE;
	}

}
