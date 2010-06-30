/*
 * 
 */
package mm_hybrid.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class MM_HybridVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "mm_Hybrid.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (mm_hybrid.diagram.edit.parts.ModuleEditPart.MODEL_ID
					.equals(view.getType())) {
				return mm_hybrid.diagram.edit.parts.ModuleEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return mm_hybrid.diagram.part.MM_HybridVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				mm_hybrid.diagram.part.MM_HybridDiagramEditorPlugin
						.getInstance().logError(
								"Unable to parse view type as a visualID number: "
										+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return String.valueOf(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (mm_hybrid.MM_HybridPackage.eINSTANCE.getModule().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((mm_hybrid.Module) domainElement)) {
			return mm_hybrid.diagram.edit.parts.ModuleEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = mm_hybrid.diagram.part.MM_HybridVisualIDRegistry
				.getModelID(containerView);
		if (!mm_hybrid.diagram.edit.parts.ModuleEditPart.MODEL_ID
				.equals(containerModelID)
				&& !"mm_hybrid".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (mm_hybrid.diagram.edit.parts.ModuleEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = mm_hybrid.diagram.part.MM_HybridVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = mm_hybrid.diagram.edit.parts.ModuleEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case mm_hybrid.diagram.edit.parts.RuleSourceEditPart.VISUAL_ID:
			if (mm_hybrid.MM_HybridPackage.eINSTANCE.getSourceElementRule()
					.isSuperTypeOf(domainElement.eClass())) {
				return mm_hybrid.diagram.edit.parts.SourceElementRuleEditPart.VISUAL_ID;
			}
			break;
		case mm_hybrid.diagram.edit.parts.RuleTargetEditPart.VISUAL_ID:
			if (mm_hybrid.MM_HybridPackage.eINSTANCE.getTargetElementRule()
					.isSuperTypeOf(domainElement.eClass())) {
				return mm_hybrid.diagram.edit.parts.TargetElementRuleEditPart.VISUAL_ID;
			}
			break;
		case mm_hybrid.diagram.edit.parts.SourceElementRuleConditionEditPart.VISUAL_ID:
			if (mm_hybrid.MM_HybridPackage.eINSTANCE.getCondition()
					.isSuperTypeOf(domainElement.eClass())) {
				return mm_hybrid.diagram.edit.parts.ConditionEditPart.VISUAL_ID;
			}
			break;
		case mm_hybrid.diagram.edit.parts.ModuleEditPart.VISUAL_ID:
			if (mm_hybrid.MM_HybridPackage.eINSTANCE.getRule().isSuperTypeOf(
					domainElement.eClass())) {
				return mm_hybrid.diagram.edit.parts.RuleEditPart.VISUAL_ID;
			}
			if (mm_hybrid.MM_HybridPackage.eINSTANCE.getInMetaModel()
					.isSuperTypeOf(domainElement.eClass())) {
				return mm_hybrid.diagram.edit.parts.InMetaModelEditPart.VISUAL_ID;
			}
			if (mm_hybrid.MM_HybridPackage.eINSTANCE.getOutMetaModel()
					.isSuperTypeOf(domainElement.eClass())) {
				return mm_hybrid.diagram.edit.parts.OutMetaModelEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = mm_hybrid.diagram.part.MM_HybridVisualIDRegistry
				.getModelID(containerView);
		if (!mm_hybrid.diagram.edit.parts.ModuleEditPart.MODEL_ID
				.equals(containerModelID)
				&& !"mm_hybrid".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (mm_hybrid.diagram.edit.parts.ModuleEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = mm_hybrid.diagram.part.MM_HybridVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = mm_hybrid.diagram.edit.parts.ModuleEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case mm_hybrid.diagram.edit.parts.RuleEditPart.VISUAL_ID:
			if (mm_hybrid.diagram.edit.parts.RuleName_ruleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (mm_hybrid.diagram.edit.parts.RuleIsAbstractIsMainEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (mm_hybrid.diagram.edit.parts.RuleSourceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (mm_hybrid.diagram.edit.parts.RuleTargetEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case mm_hybrid.diagram.edit.parts.InMetaModelEditPart.VISUAL_ID:
			if (mm_hybrid.diagram.edit.parts.InMetaModelName_mmEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case mm_hybrid.diagram.edit.parts.OutMetaModelEditPart.VISUAL_ID:
			if (mm_hybrid.diagram.edit.parts.OutMetaModelName_mmEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case mm_hybrid.diagram.edit.parts.SourceElementRuleEditPart.VISUAL_ID:
			if (mm_hybrid.diagram.edit.parts.SourceElementRuleName_elementEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (mm_hybrid.diagram.edit.parts.SourceElementRuleConditionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case mm_hybrid.diagram.edit.parts.TargetElementRuleEditPart.VISUAL_ID:
			if (mm_hybrid.diagram.edit.parts.TargetElementRuleName_elementEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case mm_hybrid.diagram.edit.parts.RuleSourceEditPart.VISUAL_ID:
			if (mm_hybrid.diagram.edit.parts.SourceElementRuleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case mm_hybrid.diagram.edit.parts.RuleTargetEditPart.VISUAL_ID:
			if (mm_hybrid.diagram.edit.parts.TargetElementRuleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case mm_hybrid.diagram.edit.parts.SourceElementRuleConditionEditPart.VISUAL_ID:
			if (mm_hybrid.diagram.edit.parts.ConditionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case mm_hybrid.diagram.edit.parts.ModuleEditPart.VISUAL_ID:
			if (mm_hybrid.diagram.edit.parts.RuleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (mm_hybrid.diagram.edit.parts.InMetaModelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (mm_hybrid.diagram.edit.parts.OutMetaModelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(mm_hybrid.Module element) {
		return true;
	}

}
