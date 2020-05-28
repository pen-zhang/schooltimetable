/**
 */
package courseScheduling.tests;

import courseScheduling.CourseSchedulingFactory;
import courseScheduling.InstructorList;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Instructor List</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InstructorListTest extends TestCase {

	/**
	 * The fixture for this Instructor List test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstructorList fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InstructorListTest.class);
	}

	/**
	 * Constructs a new Instructor List test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstructorListTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Instructor List test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(InstructorList fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Instructor List test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstructorList getFixture() {
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
		setFixture(CourseSchedulingFactory.eINSTANCE.createInstructorList());
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

} //InstructorListTest
