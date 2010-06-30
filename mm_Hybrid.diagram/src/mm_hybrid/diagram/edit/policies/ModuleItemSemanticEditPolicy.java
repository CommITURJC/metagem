/*
 * 
 */
package mm_hybrid.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class ModuleItemSemanticEditPolicy extends
		mm_hybrid.diagram.edit.policies.MM_HybridBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (mm_hybrid.diagram.providers.MM_HybridElementTypes.Rule_2001 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(mm_hybrid.MM_HybridPackage.eINSTANCE
						.getModule_Rule());
			}
			return getGEFWrapper(new mm_hybrid.diagram.edit.commands.RuleCreateCommand(
					req));
		}
		if (mm_hybrid.diagram.providers.MM_HybridElementTypes.InMetaModel_2002 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(mm_hybrid.MM_HybridPackage.eINSTANCE
						.getModule_InMM());
			}
			return getGEFWrapper(new mm_hybrid.diagram.edit.commands.InMetaModelCreateCommand(
					req));
		}
		if (mm_hybrid.diagram.providers.MM_HybridElementTypes.OutMetaModel_2003 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(mm_hybrid.MM_HybridPackage.eINSTANCE
						.getModule_OutMM());
			}
			return getGEFWrapper(new mm_hybrid.diagram.edit.commands.OutMetaModelCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
