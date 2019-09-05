/**
 */
package studyprogram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyprogram.Semester#getSeason <em>Season</em>}</li>
 *   <li>{@link studyprogram.Semester#getYear <em>Year</em>}</li>
 *   <li>{@link studyprogram.Semester#getSlots <em>Slots</em>}</li>
 * </ul>
 *
 * @see studyprogram.StudyprogramPackage#getSemester()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='noDuplicateCourses'"
 * @generated
 */
public interface Semester extends EObject {
	/**
	 * Returns the value of the '<em><b>Season</b></em>' attribute.
	 * The literals are from the enumeration {@link studyprogram.Season}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Season</em>' attribute.
	 * @see studyprogram.Season
	 * @see #setSeason(Season)
	 * @see studyprogram.StudyprogramPackage#getSemester_Season()
	 * @model
	 * @generated
	 */
	Season getSeason();

	/**
	 * Sets the value of the '{@link studyprogram.Semester#getSeason <em>Season</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Season</em>' attribute.
	 * @see studyprogram.Season
	 * @see #getSeason()
	 * @generated
	 */
	void setSeason(Season value);

	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(int)
	 * @see studyprogram.StudyprogramPackage#getSemester_Year()
	 * @model required="true"
	 * @generated
	 */
	int getYear();

	/**
	 * Sets the value of the '{@link studyprogram.Semester#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(int value);

	/**
	 * Returns the value of the '<em><b>Slots</b></em>' containment reference list.
	 * The list contents are of type {@link studyprogram.Slot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slots</em>' containment reference list.
	 * @see studyprogram.StudyprogramPackage#getSemester_Slots()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Slot> getSlots();

} // Semester
