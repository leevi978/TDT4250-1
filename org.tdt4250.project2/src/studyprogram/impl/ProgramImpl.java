/**
 */
package studyprogram.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import studyprogram.Base;
import studyprogram.Program;
import studyprogram.Semester;
import studyprogram.Slot;
import studyprogram.StudyprogramPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link studyprogram.impl.ProgramImpl#getName <em>Name</em>}</li>
 *   <li>{@link studyprogram.impl.ProgramImpl#getProgramBase <em>Program Base</em>}</li>
 *   <li>{@link studyprogram.impl.ProgramImpl#getTotalBaseCredits <em>Total Base Credits</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramImpl extends MinimalEObjectImpl.Container implements Program {
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
	 * The cached value of the '{@link #getProgramBase() <em>Program Base</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramBase()
	 * @generated
	 * @ordered
	 */
	protected Base programBase;

	/**
	 * The default value of the '{@link #getTotalBaseCredits() <em>Total Base Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalBaseCredits()
	 * @generated
	 * @ordered
	 */
	protected static final double TOTAL_BASE_CREDITS_EDEFAULT = 0.0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyprogramPackage.Literals.PROGRAM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogramPackage.PROGRAM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Base getProgramBase() {
		return programBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgramBase(Base newProgramBase, NotificationChain msgs) {
		Base oldProgramBase = programBase;
		programBase = newProgramBase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StudyprogramPackage.PROGRAM__PROGRAM_BASE, oldProgramBase, newProgramBase);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProgramBase(Base newProgramBase) {
		if (newProgramBase != programBase) {
			NotificationChain msgs = null;
			if (programBase != null)
				msgs = ((InternalEObject)programBase).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StudyprogramPackage.PROGRAM__PROGRAM_BASE, null, msgs);
			if (newProgramBase != null)
				msgs = ((InternalEObject)newProgramBase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StudyprogramPackage.PROGRAM__PROGRAM_BASE, null, msgs);
			msgs = basicSetProgramBase(newProgramBase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyprogramPackage.PROGRAM__PROGRAM_BASE, newProgramBase, newProgramBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public double getTotalBaseCredits() {
		// TODO: implement this method to return the 'Total Base Credits' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		double credits = 0;
		for(Semester semester: this.getProgramBase().getBaseSemesters()) {
			for(Slot slot: semester.getSlots()) {
				credits += slot.getSelectedCourse().getCredits();
			}
		}
		return credits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalBaseCredits(double newTotalBaseCredits) {
		// TODO: implement this method to set the 'Total Base Credits' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetTotalBaseCredits() {
		// TODO: implement this method to unset the 'Total Base Credits' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetTotalBaseCredits() {
		// TODO: implement this method to return whether the 'Total Base Credits' attribute is set
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyprogramPackage.PROGRAM__PROGRAM_BASE:
				return basicSetProgramBase(null, msgs);
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
			case StudyprogramPackage.PROGRAM__NAME:
				return getName();
			case StudyprogramPackage.PROGRAM__PROGRAM_BASE:
				return getProgramBase();
			case StudyprogramPackage.PROGRAM__TOTAL_BASE_CREDITS:
				return getTotalBaseCredits();
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
			case StudyprogramPackage.PROGRAM__NAME:
				setName((String)newValue);
				return;
			case StudyprogramPackage.PROGRAM__PROGRAM_BASE:
				setProgramBase((Base)newValue);
				return;
			case StudyprogramPackage.PROGRAM__TOTAL_BASE_CREDITS:
				setTotalBaseCredits((Double)newValue);
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
			case StudyprogramPackage.PROGRAM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StudyprogramPackage.PROGRAM__PROGRAM_BASE:
				setProgramBase((Base)null);
				return;
			case StudyprogramPackage.PROGRAM__TOTAL_BASE_CREDITS:
				unsetTotalBaseCredits();
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
			case StudyprogramPackage.PROGRAM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StudyprogramPackage.PROGRAM__PROGRAM_BASE:
				return programBase != null;
			case StudyprogramPackage.PROGRAM__TOTAL_BASE_CREDITS:
				return isSetTotalBaseCredits();
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

} //ProgramImpl
