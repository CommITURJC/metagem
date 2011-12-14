/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metagem;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see metagem.MetagemPackage
 * @generated
 */
public interface MetagemFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetagemFactory eINSTANCE = metagem.impl.MetagemFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Root</em>'.
	 * @generated
	 */
	ModelRoot createModelRoot();

	/**
	 * Returns a new object of class '<em>Source Model Transf</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Model Transf</em>'.
	 * @generated
	 */
	SourceModelTransf createSourceModelTransf();

	/**
	 * Returns a new object of class '<em>Target Model Transf</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Target Model Transf</em>'.
	 * @generated
	 */
	TargetModelTransf createTargetModelTransf();

	/**
	 * Returns a new object of class '<em>One To One</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>One To One</em>'.
	 * @generated
	 */
	OneToOne createOneToOne();

	/**
	 * Returns a new object of class '<em>One To Zero</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>One To Zero</em>'.
	 * @generated
	 */
	OneToZero createOneToZero();

	/**
	 * Returns a new object of class '<em>Zero To One</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Zero To One</em>'.
	 * @generated
	 */
	ZeroToOne createZeroToOne();

	/**
	 * Returns a new object of class '<em>One To Many</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>One To Many</em>'.
	 * @generated
	 */
	OneToMany createOneToMany();

	/**
	 * Returns a new object of class '<em>Many To One</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Many To One</em>'.
	 * @generated
	 */
	ManyToOne createManyToOne();

	/**
	 * Returns a new object of class '<em>Many To Many</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Many To Many</em>'.
	 * @generated
	 */
	ManyToMany createManyToMany();

	/**
	 * Returns a new object of class '<em>Source Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Element</em>'.
	 * @generated
	 */
	SourceElement createSourceElement();

	/**
	 * Returns a new object of class '<em>Target Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Target Element</em>'.
	 * @generated
	 */
	TargetElement createTargetElement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MetagemPackage getMetagemPackage();

} //MetagemFactory
