/**
 *
 * $Id$
 */
package studyprogram.validation;

import org.eclipse.emf.common.util.EList;

import studyprogram.Course;

/**
 * A sample validator interface for {@link studyprogram.Slot}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SlotValidator {
	boolean validate();

	boolean validateAvailableCourses(EList<Course> value);
	boolean validateSelectedCourse(Course value);

	boolean validateMandatory(boolean value);
}
