/**
 */
package courseScheduling;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see courseScheduling.CourseSchedulingPackage
 * @generated
 */
public interface CourseSchedulingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CourseSchedulingFactory eINSTANCE = courseScheduling.impl.CourseSchedulingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Timetable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timetable</em>'.
	 * @generated
	 */
	Timetable createTimetable();

	/**
	 * Returns a new object of class '<em>Sub Timetable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub Timetable</em>'.
	 * @generated
	 */
	SubTimetable createSubTimetable();

	/**
	 * Returns a new object of class '<em>Timed Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timed Element</em>'.
	 * @generated
	 */
	TimedElement createTimedElement();

	/**
	 * Returns a new object of class '<em>Day column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Day column</em>'.
	 * @generated
	 */
	Day_column createDay_column();

	/**
	 * Returns a new object of class '<em>Course</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Course</em>'.
	 * @generated
	 */
	Course createCourse();

	/**
	 * Returns a new object of class '<em>Instructor List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instructor List</em>'.
	 * @generated
	 */
	InstructorList createInstructorList();

	/**
	 * Returns a new object of class '<em>Instructor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instructor</em>'.
	 * @generated
	 */
	Instructor createInstructor();

	/**
	 * Returns a new object of class '<em>Room List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room List</em>'.
	 * @generated
	 */
	RoomList createRoomList();

	/**
	 * Returns a new object of class '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room</em>'.
	 * @generated
	 */
	Room createRoom();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CourseSchedulingPackage getCourseSchedulingPackage();

} //CourseSchedulingFactory
