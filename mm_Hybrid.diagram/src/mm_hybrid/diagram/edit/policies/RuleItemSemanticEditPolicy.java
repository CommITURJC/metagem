/*
 * 
 */
package mm_hybrid.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class RuleItemSemanticEditPolicy extends
		mm_hybrid.diagram.edit.policies.MM_HybridBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		CompoundCommand cc = getDestroyEdgesCommand();
		addDestroyChildNodesCommand(cc);
		addDestroyShortcutsCommand(cc);
		View view = (View) getHost().getModel();
		if (view.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
			req.setElementToDestroy(view);
		}
		cc.add(getGEFWrapper(new DestroyElementCommand(req)));
		return cc.unwrap();
	}

	/**
	 * @generated
	 */
	protected void addDestroyChildNodesCommand(CompoundCommand cmd) {
		View view = (View) getHost().getModel();
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation != null) {
			return;
		}
		for (Iterator it = view.getChildren().iterator(); it.hasNext();) {
			Node node = (Node) it.next();
			switch (mm_hybrid.diagram.part.MM_HybridVisualIDRegistry
					.getVisualID(node)) {
			case mm_hybrid.diagram.edit.parts.RuleSourceEditPart.VISUAL_ID:
				for (Iterator cit = node.getChildren().iterator(); cit
						.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (mm_hybrid.diagram.part.MM_HybridVisualIDRegistry
							.getVisualID(cnode)) {
					case mm_hybrid.diagram.edit.parts.SourceElementRuleEditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					}
				}
				break;
			case mm_hybrid.diagram.edit.parts.RuleTargetEditPart.VISUAL_ID:
				for (Iterator cit = node.getChildren().iterator(); cit
						.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (mm_hybrid.diagram.part.MM_HybridVisualIDRegistry
							.getVisualID(cnode)) {
					case mm_hybrid.diagram.edit.parts.TargetElementRuleEditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					}
				}
				break;
			}
		}
	}

}
