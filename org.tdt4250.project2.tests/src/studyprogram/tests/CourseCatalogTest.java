/**
 */
package studyprogram.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import studyprogram.CourseCatalog;
import studyprogram.StudyprogramFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Course Catalog</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CourseCatalogTest extends TestCase {

	/**
	 * The fixture for this Course Catalog test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseCatalog fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CourseCatalogTest.class);
	}

	/**
	 * Constructs a new Course Catalog test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseCatalogTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Course Catalog test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(CourseCatalog fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Course Catalog test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseCatalog getFixture() {
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
		setFixture(StudyprogramFactory.eINSTANCE.createCourseCatalog());
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

} //CourseCatalogTest
