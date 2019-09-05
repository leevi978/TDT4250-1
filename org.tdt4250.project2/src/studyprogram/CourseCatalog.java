/**
 */
package studyprogram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course Catalog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyprogram.CourseCatalog#getCourses <em>Courses</em>}</li>
 * </ul>
 *
 * @see studyprogram.StudyprogramPackage#getCourseCatalog()
 * @model
 * @generated
 */
public interface CourseCatalog extends EObject {
	/**
	 * Returns the value of the '<em><b>Courses</b></em>' containment reference list.
	 * The list contents are of type {@link studyprogram.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' containment reference list.
	 * @see studyprogram.StudyprogramPackage#getCourseCatalog_Courses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Course> getCourses();

} // CourseCatalog
