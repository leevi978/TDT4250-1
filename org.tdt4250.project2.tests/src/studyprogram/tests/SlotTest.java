/**
 */
package studyprogram.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import studyprogram.Slot;
import studyprogram.StudyprogramFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Slot</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SlotTest extends TestCase {

	/**
	 * The fixture for this Slot test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Slot fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SlotTest.class);
	}

	/**
	 * Constructs a new Slot test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlotTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Slot test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Slot fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Slot test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Slot getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StudyprogramFactory.eINSTANCE.createSlot());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //SlotTest
