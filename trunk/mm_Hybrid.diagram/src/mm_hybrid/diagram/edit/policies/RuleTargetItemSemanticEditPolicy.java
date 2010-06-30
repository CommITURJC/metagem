/*
 * 
 */
package mm_hybrid.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class RuleTargetItemSemanticEditPolicy extends
		mm_hybrid.diagram.edit.policies.MM_HybridBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (mm_hybrid.diagram.providers.MM_HybridElementTypes.TargetElementRule_3003 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(mm_hybrid.MM_HybridPackage.eINSTANCE
						.getRule_Out());
			}
			return getGEFWrapper(new mm_hybrid.diagram.edit.commands.TargetElementRuleCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
