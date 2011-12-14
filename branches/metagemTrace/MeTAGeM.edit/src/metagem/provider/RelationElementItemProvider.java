/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metagem.provider;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import metagem.ManyToMany;
import metagem.ManyToOne;
import metagem.MetagemPackage;
import metagem.ModelRoot;
import metagem.OneToMany;
import metagem.OneToOne;
import metagem.OneToZero;
import metagem.RelationElement;
import metagem.SourceElement;
import metagem.SourceModelTransf;
import metagem.TargetElement;
import metagem.TargetModelTransf;
import metagem.ZeroToOne;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link metagem.RelationElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RelationElementItemProvider
	extends TransformationElementItemProvider
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
	public RelationElementItemProvider(AdapterFactory adapterFactory) {
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
			addBelongsToPropertyDescriptor(object);
			addOwnsPropertyDescriptor(object);
			addModelPropertyDescriptor(object);
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
				 getString("_UI_RelationElement_ref_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RelationElement_ref_feature", "_UI_RelationElement_type"),
				 MetagemPackage.Literals.RELATION_ELEMENT__REF,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_RelationElement_belongsTo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RelationElement_belongsTo_feature", "_UI_RelationElement_type"),
				 MetagemPackage.Literals.RELATION_ELEMENT__BELONGS_TO,
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
        		  EObject mainRuleObj = element.eContainer().eContainer().eContainer();
        		  if (mainRuleObj instanceof OneToOne){
        			  OneToOne mainRule = (OneToOne) mainRuleObj;
        			  result.add(mainRule.getSource());
        		  }else if (mainRuleObj instanceof OneToZero){
        			  OneToZero mainRule = (OneToZero) mainRuleObj;
        			  result.add(mainRule.getSource());
        		  }else if (mainRuleObj instanceof OneToMany){
        			  OneToMany mainRule = (OneToMany) mainRuleObj;
        			  result.add(mainRule.getSource());
        		  }else if (mainRuleObj instanceof ManyToOne){
        			  ManyToOne mainRule = (ManyToOne) mainRuleObj;
        			  result.addAll(mainRule.getSource());
        		  }else if (mainRuleObj instanceof ManyToMany){
        			  ManyToMany mainRule = (ManyToMany) mainRuleObj;
        			  result.addAll(mainRule.getSource());
        		  }        		   
        	  }else{
        		  TargetElement element = (TargetElement) object;
        		  EObject mainRuleObj = element.eContainer().eContainer().eContainer();
        		  if (mainRuleObj instanceof OneToOne){
        			  OneToOne mainRule = (OneToOne) mainRuleObj;
        			  result.add(mainRule.getTarget());
        		  }else if (mainRuleObj instanceof ZeroToOne){
        			  ZeroToOne mainRule = (ZeroToOne) mainRuleObj;
        			  result.add(mainRule.getTarget());
        		  }else if (mainRuleObj instanceof OneToMany){
        			  OneToMany mainRule = (OneToMany) mainRuleObj;
        			  result.addAll(mainRule.getTarget());
        		  }else if (mainRuleObj instanceof ManyToOne){
        			  ManyToOne mainRule = (ManyToOne) mainRuleObj;
        			  result.add(mainRule.getTarget());
        		  }else if (mainRuleObj instanceof ManyToMany){
        			  ManyToMany mainRule = (ManyToMany) mainRuleObj;
        			  result.addAll(mainRule.getTarget());
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
	
//	protected void addBelongsToPropertyDescriptor(Object object) {
//		itemPropertyDescriptors.add
//			(createItemPropertyDescriptor
//				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
//				 getResourceLocator(),
//				 getString("_UI_RelationElement_belongsTo_feature"),
//				 getString("_UI_PropertyDescriptor_description", "_UI_RelationElement_belongsTo_feature", "_UI_RelationElement_type"),
//				 MetagemPackage.Literals.RELATION_ELEMENT__BELONGS_TO,
//				 true,
//				 false,
//				 true,
//				 null,
//				 null,
//				 null));
//	}
	


	/**
	 * This adds a property descriptor for the Owns feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RelationElement_owns_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RelationElement_owns_feature", "_UI_RelationElement_type"),
				 MetagemPackage.Literals.RELATION_ELEMENT__OWNS,
				 true,
				 false,
				 true,
				 null,
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
				 getString("_UI_RelationElement_model_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RelationElement_model_feature", "_UI_RelationElement_type"),
				 MetagemPackage.Literals.RELATION_ELEMENT__MODEL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((RelationElement)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_RelationElement_type") :
			getString("_UI_RelationElement_type") + " " + label;
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

		switch (notification.getFeatureID(RelationElement.class)) {
			case MetagemPackage.RELATION_ELEMENT__REF:
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
