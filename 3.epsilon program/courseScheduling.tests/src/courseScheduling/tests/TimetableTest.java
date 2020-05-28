/**
 */
package courseScheduling.tests;

import courseScheduling.CourseSchedulingFactory;
import courseScheduling.Timetable;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Timetable</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimetableTest extends TimedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TimetableTest.class);
	}

	/**
	 * Constructs a new Timetable test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimetableTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Timetable test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Timetable getFixture() {
		return (Timetable)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CourseSchedulingFactory.eINSTANCE.createTimetable());
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

} //TimetableTest
