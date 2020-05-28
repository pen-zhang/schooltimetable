/**
 */
package courseScheduling.tests;

import courseScheduling.CourseSchedulingFactory;
import courseScheduling.SubTimetable;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sub Timetable</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubTimetableTest extends TestCase {

	/**
	 * The fixture for this Sub Timetable test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubTimetable fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SubTimetableTest.class);
	}

	/**
	 * Constructs a new Sub Timetable test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubTimetableTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Sub Timetable test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SubTimetable fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Sub Timetable test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubTimetable getFixture() {
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
		setFixture(CourseSchedulingFactory.eINSTANCE.createSubTimetable());
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

} //SubTimetableTest
