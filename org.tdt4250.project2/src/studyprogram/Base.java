/**
 */
package studyprogram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyprogram.Base#getBaseSemesters <em>Base Semesters</em>}</li>
 *   <li>{@link studyprogram.Base#getSpecializations <em>Specializations</em>}</li>
 * </ul>
 *
 * @see studyprogram.StudyprogramPackage#getBase()
 * @model
 * @generated
 */
public interface Base extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Semesters</b></em>' containment reference list.
	 * The list contents are of type {@link studyprogram.Semester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Semesters</em>' containment reference list.
	 * @see studyprogram.StudyprogramPackage#getBase_BaseSemesters()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Semester> getBaseSemesters();

	/**
	 * Returns the value of the '<em><b>Specializations</b></em>' containment reference list.
	 * The list contents are of type {@link studyprogram.Specialization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specializations</em>' containment reference list.
	 * @see studyprogram.StudyprogramPackage#getBase_Specializations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Specialization> getSpecializations();

} // Base
