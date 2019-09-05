/**
 */
package studyprogram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specialization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyprogram.Specialization#getName <em>Name</em>}</li>
 *   <li>{@link studyprogram.Specialization#getSpecializationSemesters <em>Specialization Semesters</em>}</li>
 *   <li>{@link studyprogram.Specialization#getAdditionalSpecializations <em>Additional Specializations</em>}</li>
 * </ul>
 *
 * @see studyprogram.StudyprogramPackage#getSpecialization()
 * @model
 * @generated
 */
public interface Specialization extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see studyprogram.StudyprogramPackage#getSpecialization_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link studyprogram.Specialization#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Specialization Semesters</b></em>' containment reference list.
	 * The list contents are of type {@link studyprogram.Semester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialization Semesters</em>' containment reference list.
	 * @see studyprogram.StudyprogramPackage#getSpecialization_SpecializationSemesters()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Semester> getSpecializationSemesters();

	/**
	 * Returns the value of the '<em><b>Additional Specializations</b></em>' containment reference list.
	 * The list contents are of type {@link studyprogram.Specialization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Specializations</em>' containment reference list.
	 * @see studyprogram.StudyprogramPackage#getSpecialization_AdditionalSpecializations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Specialization> getAdditionalSpecializations();

} // Specialization
