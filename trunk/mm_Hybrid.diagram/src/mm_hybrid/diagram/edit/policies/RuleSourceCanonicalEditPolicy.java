/*
 * 
 */
package mm_hybrid.diagram.edit.policies;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class RuleSourceCanonicalEditPolicy extends CanonicalEditPolicy {

	/**
	 * @generated
	 */
	Set myFeaturesToSynchronize;

	/**
	 * @generated
	 */
	protected List getSemanticChildrenList() {
		View viewObject = (View) getHost().getModel();
		List result = new LinkedList();
		for (Iterator it = mm_hybrid.diagram.part.MM_HybridDiagramUpdater
				.getRuleSource_7001SemanticChildren(viewObject).iterator(); it
				.hasNext();) {
			result.add(((mm_hybrid.diagram.part.MM_HybridNodeDescriptor) it
					.next()).getModelElement());
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected boolean isOrphaned(Collection semanticChildren, final View view) {
		int visualID = mm_hybrid.diagram.part.MM_HybridVisualIDRegistry
				.getVisualID(view);
		switch (visualID) {
		case mm_hybrid.diagram.edit.parts.SourceElementRuleEditPart.VISUAL_ID:
			if (!semanticChildren.contains(view.getElement())) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected String getDefaultFactoryHint() {
		return null;
	}

	/**
	 * @generated
	 */
	protected Set getFeaturesToSynchronize() {
		if (myFeaturesToSynchronize == null) {
			myFeaturesToSynchronize = new HashSet();
			myFeaturesToSynchronize.add(mm_hybrid.MM_HybridPackage.eINSTANCE
					.getRule_In());
		}
		return myFeaturesToSynchronize;
	}

}
