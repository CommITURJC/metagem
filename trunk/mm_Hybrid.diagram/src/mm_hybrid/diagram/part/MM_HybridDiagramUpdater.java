/*
 * 
 */
package mm_hybrid.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class MM_HybridDiagramUpdater {

	/**
	 * @generated
	 */
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null
				|| view.getElement().eIsProxy();
	}

	/**
	 * @generated
	 */
	public static List getSemanticChildren(View view) {
		switch (mm_hybrid.diagram.part.MM_HybridVisualIDRegistry
				.getVisualID(view)) {
		case mm_hybrid.diagram.edit.parts.RuleSourceEditPart.VISUAL_ID:
			return getRuleSource_5001SemanticChildren(view);
		case mm_hybrid.diagram.edit.parts.RuleTargetEditPart.VISUAL_ID:
			return getRuleTarget_5002SemanticChildren(view);
		case mm_hybrid.diagram.edit.parts.SourceElementRuleConditionEditPart.VISUAL_ID:
			return getSourceElementRuleCondition_5003SemanticChildren(view);
		case mm_hybrid.diagram.edit.parts.ModuleEditPart.VISUAL_ID:
			return getModule_79SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRuleSource_5001SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		mm_hybrid.Rule modelElement = (mm_hybrid.Rule) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getIn().iterator(); it.hasNext();) {
			mm_hybrid.SourceElementRule childElement = (mm_hybrid.SourceElementRule) it
					.next();
			int visualID = mm_hybrid.diagram.part.MM_HybridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == mm_hybrid.diagram.edit.parts.SourceElementRuleEditPart.VISUAL_ID) {
				result.add(new mm_hybrid.diagram.part.MM_HybridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRuleTarget_5002SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		mm_hybrid.Rule modelElement = (mm_hybrid.Rule) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getOut().iterator(); it.hasNext();) {
			mm_hybrid.TargetElementRule childElement = (mm_hybrid.TargetElementRule) it
					.next();
			int visualID = mm_hybrid.diagram.part.MM_HybridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == mm_hybrid.diagram.edit.parts.TargetElementRuleEditPart.VISUAL_ID) {
				result.add(new mm_hybrid.diagram.part.MM_HybridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSourceElementRuleCondition_5003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		mm_hybrid.SourceElementRule modelElement = (mm_hybrid.SourceElementRule) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getCondition().iterator(); it.hasNext();) {
			mm_hybrid.Condition childElement = (mm_hybrid.Condition) it.next();
			int visualID = mm_hybrid.diagram.part.MM_HybridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == mm_hybrid.diagram.edit.parts.ConditionEditPart.VISUAL_ID) {
				result.add(new mm_hybrid.diagram.part.MM_HybridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getModule_79SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		mm_hybrid.Module modelElement = (mm_hybrid.Module) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getRule().iterator(); it.hasNext();) {
			mm_hybrid.Rule childElement = (mm_hybrid.Rule) it.next();
			int visualID = mm_hybrid.diagram.part.MM_HybridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == mm_hybrid.diagram.edit.parts.RuleEditPart.VISUAL_ID) {
				result.add(new mm_hybrid.diagram.part.MM_HybridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getInMM().iterator(); it.hasNext();) {
			mm_hybrid.InMetaModel childElement = (mm_hybrid.InMetaModel) it
					.next();
			int visualID = mm_hybrid.diagram.part.MM_HybridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == mm_hybrid.diagram.edit.parts.InMetaModelEditPart.VISUAL_ID) {
				result.add(new mm_hybrid.diagram.part.MM_HybridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getOutMM().iterator(); it.hasNext();) {
			mm_hybrid.OutMetaModel childElement = (mm_hybrid.OutMetaModel) it
					.next();
			int visualID = mm_hybrid.diagram.part.MM_HybridVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == mm_hybrid.diagram.edit.parts.OutMetaModelEditPart.VISUAL_ID) {
				result.add(new mm_hybrid.diagram.part.MM_HybridNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getContainedLinks(View view) {
		switch (mm_hybrid.diagram.part.MM_HybridVisualIDRegistry
				.getVisualID(view)) {
		case mm_hybrid.diagram.edit.parts.ModuleEditPart.VISUAL_ID:
			return getModule_79ContainedLinks(view);
		case mm_hybrid.diagram.edit.parts.RuleEditPart.VISUAL_ID:
			return getRule_1001ContainedLinks(view);
		case mm_hybrid.diagram.edit.parts.InMetaModelEditPart.VISUAL_ID:
			return getInMetaModel_1002ContainedLinks(view);
		case mm_hybrid.diagram.edit.parts.OutMetaModelEditPart.VISUAL_ID:
			return getOutMetaModel_1003ContainedLinks(view);
		case mm_hybrid.diagram.edit.parts.SourceElementRuleEditPart.VISUAL_ID:
			return getSourceElementRule_2001ContainedLinks(view);
		case mm_hybrid.diagram.edit.parts.ConditionEditPart.VISUAL_ID:
			return getCondition_2002ContainedLinks(view);
		case mm_hybrid.diagram.edit.parts.TargetElementRuleEditPart.VISUAL_ID:
			return getTargetElementRule_2003ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIncomingLinks(View view) {
		switch (mm_hybrid.diagram.part.MM_HybridVisualIDRegistry
				.getVisualID(view)) {
		case mm_hybrid.diagram.edit.parts.RuleEditPart.VISUAL_ID:
			return getRule_1001IncomingLinks(view);
		case mm_hybrid.diagram.edit.parts.InMetaModelEditPart.VISUAL_ID:
			return getInMetaModel_1002IncomingLinks(view);
		case mm_hybrid.diagram.edit.parts.OutMetaModelEditPart.VISUAL_ID:
			return getOutMetaModel_1003IncomingLinks(view);
		case mm_hybrid.diagram.edit.parts.SourceElementRuleEditPart.VISUAL_ID:
			return getSourceElementRule_2001IncomingLinks(view);
		case mm_hybrid.diagram.edit.parts.ConditionEditPart.VISUAL_ID:
			return getCondition_2002IncomingLinks(view);
		case mm_hybrid.diagram.edit.parts.TargetElementRuleEditPart.VISUAL_ID:
			return getTargetElementRule_2003IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutgoingLinks(View view) {
		switch (mm_hybrid.diagram.part.MM_HybridVisualIDRegistry
				.getVisualID(view)) {
		case mm_hybrid.diagram.edit.parts.RuleEditPart.VISUAL_ID:
			return getRule_1001OutgoingLinks(view);
		case mm_hybrid.diagram.edit.parts.InMetaModelEditPart.VISUAL_ID:
			return getInMetaModel_1002OutgoingLinks(view);
		case mm_hybrid.diagram.edit.parts.OutMetaModelEditPart.VISUAL_ID:
			return getOutMetaModel_1003OutgoingLinks(view);
		case mm_hybrid.diagram.edit.parts.SourceElementRuleEditPart.VISUAL_ID:
			return getSourceElementRule_2001OutgoingLinks(view);
		case mm_hybrid.diagram.edit.parts.ConditionEditPart.VISUAL_ID:
			return getCondition_2002OutgoingLinks(view);
		case mm_hybrid.diagram.edit.parts.TargetElementRuleEditPart.VISUAL_ID:
			return getTargetElementRule_2003OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getModule_79ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRule_1001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInMetaModel_1002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutMetaModel_1003ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSourceElementRule_2001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCondition_2002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTargetElementRule_2003ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRule_1001IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInMetaModel_1002IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutMetaModel_1003IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSourceElementRule_2001IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCondition_2002IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTargetElementRule_2003IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRule_1001OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getInMetaModel_1002OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutMetaModel_1003OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSourceElementRule_2001OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCondition_2002OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTargetElementRule_2003OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

}
