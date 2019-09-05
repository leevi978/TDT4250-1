/**
 */
package studyprogram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyprogram.Slot#getAvailableCourses <em>Available Courses</em>}</li>
 *   <li>{@link studyprogram.Slot#getSelectedCourse <em>Selected Course</em>}</li>
 * </ul>
 *
 * @see studyprogram.StudyprogramPackage#getSlot()
 * @model annotation="http://www.eclipse.org/acceleo/query/1.0 selectedCourseInAvailableCourses='self.availableCourses-&gt;select(c | c = self.selectedCourse).size() &gt; 0'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='selectedCourseInAvailableCourses'"
 * @generated
 */
public interface Slot extends EObject {
	/**
	 * Returns the value of the '<em><b>Available Courses</b></em>' reference list.
	 * The list contents are of type {@link studyprogram.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available Courses</em>' reference list.
	 * @see studyprogram.StudyprogramPackage#getSlot_AvailableCourses()
	 * @model required="true"
	 * @generated
	 */
	EList<Course> getAvailableCourses();

	/**
	 * Returns the value of the '<em><b>Selected Course</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected Course</em>' reference.
	 * @see #setSelectedCourse(Course)
	 * @see studyprogram.StudyprogramPackage#getSlot_SelectedCourse()
	 * @model required="true"
	 * @generated
	 */
	Course getSelectedCourse();

	/**
	 * Sets the value of the '{@link studyprogram.Slot#getSelectedCourse <em>Selected Course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected Course</em>' reference.
	 * @see #getSelectedCourse()
	 * @generated
	 */
	void setSelectedCourse(Course value);

} // Slot
