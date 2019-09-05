/**
 */
package studyprogram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyprogram.Program#getName <em>Name</em>}</li>
 *   <li>{@link studyprogram.Program#getProgramBase <em>Program Base</em>}</li>
 *   <li>{@link studyprogram.Program#getTotalBaseCredits <em>Total Base Credits</em>}</li>
 * </ul>
 *
 * @see studyprogram.StudyprogramPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see studyprogram.StudyprogramPackage#getProgram_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link studyprogram.Program#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Program Base</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program Base</em>' containment reference.
	 * @see #setProgramBase(Base)
	 * @see studyprogram.StudyprogramPackage#getProgram_ProgramBase()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Base getProgramBase();

	/**
	 * Sets the value of the '{@link studyprogram.Program#getProgramBase <em>Program Base</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program Base</em>' containment reference.
	 * @see #getProgramBase()
	 * @generated
	 */
	void setProgramBase(Base value);

	/**
	 * Returns the value of the '<em><b>Total Base Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Base Credits</em>' attribute.
	 * @see #isSetTotalBaseCredits()
	 * @see #unsetTotalBaseCredits()
	 * @see #setTotalBaseCredits(double)
	 * @see studyprogram.StudyprogramPackage#getProgram_TotalBaseCredits()
	 * @model unique="false" unsettable="true" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	double getTotalBaseCredits();

	/**
	 * Sets the value of the '{@link studyprogram.Program#getTotalBaseCredits <em>Total Base Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Base Credits</em>' attribute.
	 * @see #isSetTotalBaseCredits()
	 * @see #unsetTotalBaseCredits()
	 * @see #getTotalBaseCredits()
	 * @generated
	 */
	void setTotalBaseCredits(double value);

	/**
	 * Unsets the value of the '{@link studyprogram.Program#getTotalBaseCredits <em>Total Base Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTotalBaseCredits()
	 * @see #getTotalBaseCredits()
	 * @see #setTotalBaseCredits(double)
	 * @generated
	 */
	void unsetTotalBaseCredits();

	/**
	 * Returns whether the value of the '{@link studyprogram.Program#getTotalBaseCredits <em>Total Base Credits</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Total Base Credits</em>' attribute is set.
	 * @see #unsetTotalBaseCredits()
	 * @see #getTotalBaseCredits()
	 * @see #setTotalBaseCredits(double)
	 * @generated
	 */
	boolean isSetTotalBaseCredits();

} // Program
