/**
 */
package studyprogram.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import studyprogram.Semester;
import studyprogram.Specialization;
import studyprogram.StudyprogramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specialization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link studyprogram.impl.SpecializationImpl#getName <em>Name</em>}</li>
 *   <li>{@link studyprogram.impl.SpecializationImpl#getSpecializationSemesters <em>Specialization Semesters</em>}</li>
 *   <li>{@link studyprogram.impl.SpecializationImpl#getAdditionalSpecializations <em>Additional Specializations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecializationImpl extends MinimalEObjectImpl.Container implements Specialization {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSpecializationSemesters() <em>Specialization Semesters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecializationSemesters()
	 * @generated
	 * @ordered
	 */
	protected EList<Semester> specializationSemesters;

	/**
	 * The cached value of the '{@link #getAdditionalSpecializations() <em>Additional Specializations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalSpecializations()
	 * @generated
	 * @ordered
	 */
	protected EList<Specialization> additionalSpecializations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecializationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyprogramPackage.Literals.SPECIALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogramPackage.SPECIALIZATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Semester> getSpecializationSemesters() {
		if (specializationSemesters == null) {
			specializationSemesters = new EObjectContainmentEList<Semester>(Semester.class, this, StudyprogramPackage.SPECIALIZATION__SPECIALIZATION_SEMESTERS);
		}
		return specializationSemesters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Specialization> getAdditionalSpecializations() {
		if (additionalSpecializations == null) {
			additionalSpecializations = new EObjectContainmentEList<Specialization>(Specialization.class, this, StudyprogramPackage.SPECIALIZATION__ADDITIONAL_SPECIALIZATIONS);
		}
		return additionalSpecializations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyprogramPackage.SPECIALIZATION__SPECIALIZATION_SEMESTERS:
				return ((InternalEList<?>)getSpecializationSemesters()).basicRemove(otherEnd, msgs);
			case StudyprogramPackage.SPECIALIZATION__ADDITIONAL_SPECIALIZATIONS:
				return ((InternalEList<?>)getAdditionalSpecializations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StudyprogramPackage.SPECIALIZATION__NAME:
				return getName();
			case StudyprogramPackage.SPECIALIZATION__SPECIALIZATION_SEMESTERS:
				return getSpecializationSemesters();
			case StudyprogramPackage.SPECIALIZATION__ADDITIONAL_SPECIALIZATIONS:
				return getAdditionalSpecializations();
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
			case StudyprogramPackage.SPECIALIZATION__NAME:
				setName((String)newValue);
				return;
			case StudyprogramPackage.SPECIALIZATION__SPECIALIZATION_SEMESTERS:
				getSpecializationSemesters().clear();
				getSpecializationSemesters().addAll((Collection<? extends Semester>)newValue);
				return;
			case StudyprogramPackage.SPECIALIZATION__ADDITIONAL_SPECIALIZATIONS:
				getAdditionalSpecializations().clear();
				getAdditionalSpecializations().addAll((Collection<? extends Specialization>)newValue);
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
			case StudyprogramPackage.SPECIALIZATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StudyprogramPackage.SPECIALIZATION__SPECIALIZATION_SEMESTERS:
				getSpecializationSemesters().clear();
				return;
			case StudyprogramPackage.SPECIALIZATION__ADDITIONAL_SPECIALIZATIONS:
				getAdditionalSpecializations().clear();
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
			case StudyprogramPackage.SPECIALIZATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StudyprogramPackage.SPECIALIZATION__SPECIALIZATION_SEMESTERS:
				return specializationSemesters != null && !specializationSemesters.isEmpty();
			case StudyprogramPackage.SPECIALIZATION__ADDITIONAL_SPECIALIZATIONS:
				return additionalSpecializations != null && !additionalSpecializations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SpecializationImpl
