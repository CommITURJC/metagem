/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Traceability.provider;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import Traceability.SourceElement;
import Traceability.TargetElement;
import Traceability.TraceElement;
import Traceability.TraceLink;
import Traceability.TraceabilityPackage;

/**
 * This is the item provider adapter for a {@link Traceability.TraceElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TraceElementItemProvider
	extends ElementItemProvider
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
	public TraceElementItemProvider(AdapterFactory adapterFactory) {
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

			addRefPropertyDescriptor(object);
			addModelPropertyDescriptor(object);
			addBelongsToPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Ref feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TraceElement_ref_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TraceElement_ref_feature", "_UI_TraceElement_type"),
				 TraceabilityPackage.Literals.TRACE_ELEMENT__REF,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TraceElement_model_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TraceElement_model_feature", "_UI_TraceElement_type"),
				 TraceabilityPackage.Literals.TRACE_ELEMENT__MODEL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Belongs To feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NOT generated
	 */
	protected void addBelongsToPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TraceElement_belongsTo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TraceElement_belongsTo_feature", "_UI_TraceElement_type"),
				 TraceabilityPackage.Literals.TRACE_ELEMENT__BELONGS_TO,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null)
			{
				 @Override
		          public Collection<?> getChoiceOfValues(Object object)
		          {
					Collection<Object> result = new ArrayList<Object>();
		        	result.add(null);
		        	if(object instanceof SourceElement){
		        		SourceElement element = (SourceElement) object;
		        		TraceLink trace_owned = element.getSource_traceLinks();
		        		while(trace_owned.getParentLink()!=null){
		        			trace_owned = trace_owned.getParentLink();
		        			result.addAll(trace_owned.getSource());
		        		}
		        	  }else if(object instanceof TargetElement){
		        		TargetElement element = (TargetElement) object;
		        		TraceLink trace_owned = element.getTarget_traceLinks();
		        		while(trace_owned.getParentLink()!=null){
		        			trace_owned = trace_owned.getParentLink();
		        			result.addAll(trace_owned.getTarget());
		        		}      		   
		        	  }
					return result;
		          }
		          
		          @Override
		          public void resetPropertyValue(Object object)
		          {
		            setPropertyValue(object, null);
		          }
				});
			}

	/**
	 * This returns TraceElement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TraceElement"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TraceElement)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_TraceElement_type") :
			getString("_UI_TraceElement_type") + " " + label;
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

		switch (notification.getFeatureID(TraceElement.class)) {
			case TraceabilityPackage.TRACE_ELEMENT__REF:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

}
