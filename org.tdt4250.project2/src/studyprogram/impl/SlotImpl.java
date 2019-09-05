/**
 */
package studyprogram.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import studyprogram.Course;
import studyprogram.Slot;
import studyprogram.StudyprogramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link studyprogram.impl.SlotImpl#getAvailableCourses <em>Available Courses</em>}</li>
 *   <li>{@link studyprogram.impl.SlotImpl#getSelectedCourse <em>Selected Course</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SlotImpl extends MinimalEObjectImpl.Container implements Slot {
	/**
	 * The cached value of the '{@link #getAvailableCourses() <em>Available Courses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> availableCourses;

	/**
	 * The cached value of the '{@link #getSelectedCourse() <em>Selected Course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedCourse()
	 * @generated
	 * @ordered
	 */
	protected Course selectedCourse;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SlotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyprogramPackage.Literals.SLOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Course> getAvailableCourses() {
		if (availableCourses == null) {
			availableCourses = new EObjectResolvingEList<Course>(Course.class, this, StudyprogramPackage.SLOT__AVAILABLE_COURSES);
		}
		return availableCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Course getSelectedCourse() {
		if (selectedCourse != null && selectedCourse.eIsProxy()) {
			InternalEObject oldSelectedCourse = (InternalEObject)selectedCourse;
			selectedCourse = (Course)eResolveProxy(oldSelectedCourse);
			if (selectedCourse != oldSelectedCourse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StudyprogramPackage.SLOT__SELECTED_COURSE, oldSelectedCourse, selectedCourse));
			}
		}
		return selectedCourse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course basicGetSelectedCourse() {
		return selectedCourse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSelectedCourse(Course newSelectedCourse) {
		Course oldSelectedCourse = selectedCourse;
		selectedCourse = newSelectedCourse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogramPackage.SLOT__SELECTED_COURSE, oldSelectedCourse, selectedCourse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StudyprogramPackage.SLOT__AVAILABLE_COURSES:
				return getAvailableCourses();
			case StudyprogramPackage.SLOT__SELECTED_COURSE:
				if (resolve) return getSelectedCourse();
				return basicGetSelectedCourse();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StudyprogramPackage.SLOT__AVAILABLE_COURSES:
				getAvailableCourses().clear();
				getAvailableCourses().addAll((Collection<? extends Course>)newValue);
				return;
			case StudyprogramPackage.SLOT__SELECTED_COURSE:
				setSelectedCourse((Course)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StudyprogramPackage.SLOT__AVAILABLE_COURSES:
				getAvailableCourses().clear();
				return;
			case StudyprogramPackage.SLOT__SELECTED_COURSE:
				setSelectedCourse((Course)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StudyprogramPackage.SLOT__AVAILABLE_COURSES:
				return availableCourses != null && !availableCourses.isEmpty();
			case StudyprogramPackage.SLOT__SELECTED_COURSE:
				return selectedCourse != null;
		}
		return super.eIsSet(featureID);
	}

} //SlotImpl
