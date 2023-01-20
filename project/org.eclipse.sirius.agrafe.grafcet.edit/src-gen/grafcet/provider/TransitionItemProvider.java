/**
 */
package grafcet.provider;


import grafcet.GrafcetPackage;
import grafcet.Transition;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import terms.TermsFactory;

/**
 * This is the item provider adapter for a {@link grafcet.Transition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TransitionItemProvider extends NodeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionItemProvider(AdapterFactory adapterFactory) {
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

			addDelayTimePropertyDescriptor(object);
			addResetTimePropertyDescriptor(object);
			addUnitPropertyDescriptor(object);
			addTimeConditionTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Delay Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDelayTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TimeCondition_delayTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TimeCondition_delayTime_feature", "_UI_TimeCondition_type"),
				 GrafcetPackage.Literals.TIME_CONDITION__DELAY_TIME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reset Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResetTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TimeCondition_resetTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TimeCondition_resetTime_feature", "_UI_TimeCondition_type"),
				 GrafcetPackage.Literals.TIME_CONDITION__RESET_TIME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Unit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUnitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TimeCondition_unit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TimeCondition_unit_feature", "_UI_TimeCondition_type"),
				 GrafcetPackage.Literals.TIME_CONDITION__UNIT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Time Condition Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimeConditionTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TimeCondition_timeConditionType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TimeCondition_timeConditionType_feature", "_UI_TimeCondition_type"),
				 GrafcetPackage.Literals.TIME_CONDITION__TIME_CONDITION_TYPE,
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
			childrenFeatures.add(GrafcetPackage.Literals.CONDITION__TERM);
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
	 * This returns Transition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Transition"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Transition transition = (Transition)object;
		return getString("_UI_Transition_type") + " " + transition.getId();
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

		switch (notification.getFeatureID(Transition.class)) {
			case GrafcetPackage.TRANSITION__DELAY_TIME:
			case GrafcetPackage.TRANSITION__RESET_TIME:
			case GrafcetPackage.TRANSITION__UNIT:
			case GrafcetPackage.TRANSITION__TIME_CONDITION_TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GrafcetPackage.TRANSITION__TERM:
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
				(GrafcetPackage.Literals.CONDITION__TERM,
				 TermsFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(GrafcetPackage.Literals.CONDITION__TERM,
				 TermsFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add
			(createChildParameter
				(GrafcetPackage.Literals.CONDITION__TERM,
				 TermsFactory.eINSTANCE.createOr()));

		newChildDescriptors.add
			(createChildParameter
				(GrafcetPackage.Literals.CONDITION__TERM,
				 TermsFactory.eINSTANCE.createNot()));

		newChildDescriptors.add
			(createChildParameter
				(GrafcetPackage.Literals.CONDITION__TERM,
				 TermsFactory.eINSTANCE.createEquality()));

		newChildDescriptors.add
			(createChildParameter
				(GrafcetPackage.Literals.CONDITION__TERM,
				 TermsFactory.eINSTANCE.createBooleanConstant()));

		newChildDescriptors.add
			(createChildParameter
				(GrafcetPackage.Literals.CONDITION__TERM,
				 TermsFactory.eINSTANCE.createAddition()));

		newChildDescriptors.add
			(createChildParameter
				(GrafcetPackage.Literals.CONDITION__TERM,
				 TermsFactory.eINSTANCE.createSubstraction()));

		newChildDescriptors.add
			(createChildParameter
				(GrafcetPackage.Literals.CONDITION__TERM,
				 TermsFactory.eINSTANCE.createGreaterThan()));

		newChildDescriptors.add
			(createChildParameter
				(GrafcetPackage.Literals.CONDITION__TERM,
				 TermsFactory.eINSTANCE.createLessThan()));

		newChildDescriptors.add
			(createChildParameter
				(GrafcetPackage.Literals.CONDITION__TERM,
				 TermsFactory.eINSTANCE.createIntegerConstant()));

		newChildDescriptors.add
			(createChildParameter
				(GrafcetPackage.Literals.CONDITION__TERM,
				 TermsFactory.eINSTANCE.createRisingEdge()));

		newChildDescriptors.add
			(createChildParameter
				(GrafcetPackage.Literals.CONDITION__TERM,
				 TermsFactory.eINSTANCE.createFallingEdge()));
	}

}