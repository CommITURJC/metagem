/*
 * 
 */
package mm_hybrid.diagram.part;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * @generated
 */
public class MM_HybridDomainModelElementTester extends PropertyTester {

	/**
	 * @generated
	 */
	public boolean test(Object receiver, String method, Object[] args,
			Object expectedValue) {
		if (false == receiver instanceof EObject) {
			return false;
		}
		EObject eObject = (EObject) receiver;
		EClass eClass = eObject.eClass();
		if (eClass == mm_hybrid.MM_HybridPackage.eINSTANCE.getModule()) {
			return true;
		}
		if (eClass == mm_hybrid.MM_HybridPackage.eINSTANCE.getInMetaModel()) {
			return true;
		}
		if (eClass == mm_hybrid.MM_HybridPackage.eINSTANCE.getOutMetaModel()) {
			return true;
		}
		if (eClass == mm_hybrid.MM_HybridPackage.eINSTANCE.getRule()) {
			return true;
		}
		if (eClass == mm_hybrid.MM_HybridPackage.eINSTANCE.getElement()) {
			return true;
		}
		if (eClass == mm_hybrid.MM_HybridPackage.eINSTANCE
				.getSourceElementRule()) {
			return true;
		}
		if (eClass == mm_hybrid.MM_HybridPackage.eINSTANCE
				.getTargetElementRule()) {
			return true;
		}
		if (eClass == mm_hybrid.MM_HybridPackage.eINSTANCE.getElementIncluded()) {
			return true;
		}
		if (eClass == mm_hybrid.MM_HybridPackage.eINSTANCE.getCondition()) {
			return true;
		}
		return false;
	}

}
