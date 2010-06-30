/*
 * 
 */
package mm_hybrid.diagram.part;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class MM_HybridLinkDescriptor extends
		mm_hybrid.diagram.part.MM_HybridNodeDescriptor {

	/**
	 * @generated
	 */
	private EObject mySource;

	/**
	 * @generated
	 */
	private EObject myDestination;

	/**
	 * @generated
	 */
	private IAdaptable mySemanticAdapter;

	/**
	 * @generated
	 */
	private MM_HybridLinkDescriptor(EObject source, EObject destination,
			EObject linkElement, int linkVID) {
		super(linkElement, linkVID);
		mySource = source;
		myDestination = destination;
	}

	/**
	 * @generated
	 */
	public MM_HybridLinkDescriptor(EObject source, EObject destination,
			IElementType elementType, int linkVID) {
		this(source, destination, (EObject) null, linkVID);
		final IElementType elementTypeCopy = elementType;
		mySemanticAdapter = new IAdaptable() {
			public Object getAdapter(Class adapter) {
				if (IElementType.class.equals(adapter)) {
					return elementTypeCopy;
				}
				return null;
			}
		};
	}

	/**
	 * @generated
	 */
	public MM_HybridLinkDescriptor(EObject source, EObject destination,
			EObject linkElement, IElementType elementType, int linkVID) {
		this(source, destination, linkElement, linkVID);
		final IElementType elementTypeCopy = elementType;
		mySemanticAdapter = new EObjectAdapter(linkElement) {
			public Object getAdapter(Class adapter) {
				if (IElementType.class.equals(adapter)) {
					return elementTypeCopy;
				}
				return super.getAdapter(adapter);
			}
		};
	}

	/**
	 * @generated
	 */
	public EObject getSource() {
		return mySource;
	}

	/**
	 * @generated
	 */
	public EObject getDestination() {
		return myDestination;
	}

	/**
	 * @generated
	 */
	public IAdaptable getSemanticAdapter() {
		return mySemanticAdapter;
	}

}
