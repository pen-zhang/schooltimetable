/**
 */
package courseScheduling;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see courseScheduling.CourseSchedulingFactory
 * @model kind="package"
 * @generated
 */
public interface CourseSchedulingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "courseScheduling";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "courseScheduling";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CourseSchedulingPackage eINSTANCE = courseScheduling.impl.CourseSchedulingPackageImpl.init();

	/**
	 * The meta object id for the '{@link courseScheduling.impl.TimedElementImpl <em>Timed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see courseScheduling.impl.TimedElementImpl
	 * @see courseScheduling.impl.CourseSchedulingPackageImpl#getTimedElement()
	 * @generated
	 */
	int TIMED_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_ELEMENT__START_TIME = 0;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_ELEMENT__END_TIME = 1;

	/**
	 * The number of structural features of the '<em>Timed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link courseScheduling.impl.TimetableImpl <em>Timetable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see courseScheduling.impl.TimetableImpl
	 * @see courseScheduling.impl.CourseSchedulingPackageImpl#getTimetable()
	 * @generated
	 */
	int TIMETABLE = 0;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMETABLE__START_TIME = TIMED_ELEMENT__START_TIME;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMETABLE__END_TIME = TIMED_ELEMENT__END_TIME;

	/**
	 * The feature id for the '<em><b>Timetables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMETABLE__TIMETABLES = TIMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Timetable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMETABLE_FEATURE_COUNT = TIMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link courseScheduling.impl.SubTimetableImpl <em>Sub Timetable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see courseScheduling.impl.SubTimetableImpl
	 * @see courseScheduling.impl.CourseSchedulingPackageImpl#getSubTimetable()
	 * @generated
	 */
	int SUB_TIMETABLE = 1;

	/**
	 * The feature id for the '<em><b>Class Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TIMETABLE__CLASS_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Weekday</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TIMETABLE__WEEKDAY = 1;

	/**
	 * The number of structural features of the '<em>Sub Timetable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TIMETABLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link courseScheduling.impl.Day_columnImpl <em>Day column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see courseScheduling.impl.Day_columnImpl
	 * @see courseScheduling.impl.CourseSchedulingPackageImpl#getDay_column()
	 * @generated
	 */
	int DAY_COLUMN = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_COLUMN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Courses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_COLUMN__COURSES = 1;

	/**
	 * The number of structural features of the '<em>Day column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_COLUMN_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link courseScheduling.impl.CourseImpl <em>Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see courseScheduling.impl.CourseImpl
	 * @see courseScheduling.impl.CourseSchedulingPackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 4;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__START_TIME = TIMED_ELEMENT__START_TIME;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__END_TIME = TIMED_ELEMENT__END_TIME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__NAME = TIMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__DURATION = TIMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Class Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CLASS_LIMIT = TIMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Instructors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__INSTRUCTORS = TIMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__ROOM = TIMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_FEATURE_COUNT = TIMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link courseScheduling.impl.InstructorListImpl <em>Instructor List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see courseScheduling.impl.InstructorListImpl
	 * @see courseScheduling.impl.CourseSchedulingPackageImpl#getInstructorList()
	 * @generated
	 */
	int INSTRUCTOR_LIST = 5;

	/**
	 * The feature id for the '<em><b>Instructors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTOR_LIST__INSTRUCTORS = 0;

	/**
	 * The number of structural features of the '<em>Instructor List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTOR_LIST_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link courseScheduling.impl.InstructorImpl <em>Instructor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see courseScheduling.impl.InstructorImpl
	 * @see courseScheduling.impl.CourseSchedulingPackageImpl#getInstructor()
	 * @generated
	 */
	int INSTRUCTOR = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Courses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTOR__COURSES = 1;

	/**
	 * The number of structural features of the '<em>Instructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTOR_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link courseScheduling.impl.RoomListImpl <em>Room List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see courseScheduling.impl.RoomListImpl
	 * @see courseScheduling.impl.CourseSchedulingPackageImpl#getRoomList()
	 * @generated
	 */
	int ROOM_LIST = 7;

	/**
	 * The feature id for the '<em><b>Rooms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_LIST__ROOMS = 0;

	/**
	 * The number of structural features of the '<em>Room List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_LIST_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link courseScheduling.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see courseScheduling.impl.RoomImpl
	 * @see courseScheduling.impl.CourseSchedulingPackageImpl#getRoom()
	 * @generated
	 */
	int ROOM = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__CAPACITY = 1;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = 2;


	/**
	 * The meta object id for the '{@link courseScheduling.day <em>day</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see courseScheduling.day
	 * @see courseScheduling.impl.CourseSchedulingPackageImpl#getday()
	 * @generated
	 */
	int DAY = 9;


	/**
	 * Returns the meta object for class '{@link courseScheduling.Timetable <em>Timetable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timetable</em>'.
	 * @see courseScheduling.Timetable
	 * @generated
	 */
	EClass getTimetable();

	/**
	 * Returns the meta object for the containment reference list '{@link courseScheduling.Timetable#getTimetables <em>Timetables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Timetables</em>'.
	 * @see courseScheduling.Timetable#getTimetables()
	 * @see #getTimetable()
	 * @generated
	 */
	EReference getTimetable_Timetables();

	/**
	 * Returns the meta object for class '{@link courseScheduling.SubTimetable <em>Sub Timetable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Timetable</em>'.
	 * @see courseScheduling.SubTimetable
	 * @generated
	 */
	EClass getSubTimetable();

	/**
	 * Returns the meta object for the attribute '{@link courseScheduling.SubTimetable#getClassNumber <em>Class Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Number</em>'.
	 * @see courseScheduling.SubTimetable#getClassNumber()
	 * @see #getSubTimetable()
	 * @generated
	 */
	EAttribute getSubTimetable_ClassNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link courseScheduling.SubTimetable#getWeekday <em>Weekday</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Weekday</em>'.
	 * @see courseScheduling.SubTimetable#getWeekday()
	 * @see #getSubTimetable()
	 * @generated
	 */
	EReference getSubTimetable_Weekday();

	/**
	 * Returns the meta object for class '{@link courseScheduling.TimedElement <em>Timed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timed Element</em>'.
	 * @see courseScheduling.TimedElement
	 * @generated
	 */
	EClass getTimedElement();

	/**
	 * Returns the meta object for the attribute '{@link courseScheduling.TimedElement#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see courseScheduling.TimedElement#getStartTime()
	 * @see #getTimedElement()
	 * @generated
	 */
	EAttribute getTimedElement_StartTime();

	/**
	 * Returns the meta object for the attribute '{@link courseScheduling.TimedElement#getEndTime <em>End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Time</em>'.
	 * @see courseScheduling.TimedElement#getEndTime()
	 * @see #getTimedElement()
	 * @generated
	 */
	EAttribute getTimedElement_EndTime();

	/**
	 * Returns the meta object for class '{@link courseScheduling.Day_column <em>Day column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Day column</em>'.
	 * @see courseScheduling.Day_column
	 * @generated
	 */
	EClass getDay_column();

	/**
	 * Returns the meta object for the attribute '{@link courseScheduling.Day_column#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see courseScheduling.Day_column#getName()
	 * @see #getDay_column()
	 * @generated
	 */
	EAttribute getDay_column_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link courseScheduling.Day_column#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Courses</em>'.
	 * @see courseScheduling.Day_column#getCourses()
	 * @see #getDay_column()
	 * @generated
	 */
	EReference getDay_column_Courses();

	/**
	 * Returns the meta object for class '{@link courseScheduling.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course</em>'.
	 * @see courseScheduling.Course
	 * @generated
	 */
	EClass getCourse();

	/**
	 * Returns the meta object for the attribute '{@link courseScheduling.Course#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see courseScheduling.Course#getName()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Name();

	/**
	 * Returns the meta object for the attribute '{@link courseScheduling.Course#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see courseScheduling.Course#getDuration()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Duration();

	/**
	 * Returns the meta object for the attribute '{@link courseScheduling.Course#getClassLimit <em>Class Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Limit</em>'.
	 * @see courseScheduling.Course#getClassLimit()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_ClassLimit();

	/**
	 * Returns the meta object for the reference list '{@link courseScheduling.Course#getInstructors <em>Instructors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instructors</em>'.
	 * @see courseScheduling.Course#getInstructors()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_Instructors();

	/**
	 * Returns the meta object for the reference '{@link courseScheduling.Course#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room</em>'.
	 * @see courseScheduling.Course#getRoom()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_Room();

	/**
	 * Returns the meta object for class '{@link courseScheduling.InstructorList <em>Instructor List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instructor List</em>'.
	 * @see courseScheduling.InstructorList
	 * @generated
	 */
	EClass getInstructorList();

	/**
	 * Returns the meta object for the containment reference list '{@link courseScheduling.InstructorList#getInstructors <em>Instructors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instructors</em>'.
	 * @see courseScheduling.InstructorList#getInstructors()
	 * @see #getInstructorList()
	 * @generated
	 */
	EReference getInstructorList_Instructors();

	/**
	 * Returns the meta object for class '{@link courseScheduling.Instructor <em>Instructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instructor</em>'.
	 * @see courseScheduling.Instructor
	 * @generated
	 */
	EClass getInstructor();

	/**
	 * Returns the meta object for the attribute '{@link courseScheduling.Instructor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see courseScheduling.Instructor#getName()
	 * @see #getInstructor()
	 * @generated
	 */
	EAttribute getInstructor_Name();

	/**
	 * Returns the meta object for the reference list '{@link courseScheduling.Instructor#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Courses</em>'.
	 * @see courseScheduling.Instructor#getCourses()
	 * @see #getInstructor()
	 * @generated
	 */
	EReference getInstructor_Courses();

	/**
	 * Returns the meta object for class '{@link courseScheduling.RoomList <em>Room List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room List</em>'.
	 * @see courseScheduling.RoomList
	 * @generated
	 */
	EClass getRoomList();

	/**
	 * Returns the meta object for the containment reference list '{@link courseScheduling.RoomList#getRooms <em>Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rooms</em>'.
	 * @see courseScheduling.RoomList#getRooms()
	 * @see #getRoomList()
	 * @generated
	 */
	EReference getRoomList_Rooms();

	/**
	 * Returns the meta object for class '{@link courseScheduling.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see courseScheduling.Room
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for the attribute '{@link courseScheduling.Room#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see courseScheduling.Room#getName()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Name();

	/**
	 * Returns the meta object for the attribute '{@link courseScheduling.Room#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see courseScheduling.Room#getCapacity()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Capacity();

	/**
	 * Returns the meta object for enum '{@link courseScheduling.day <em>day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>day</em>'.
	 * @see courseScheduling.day
	 * @generated
	 */
	EEnum getday();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CourseSchedulingFactory getCourseSchedulingFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link courseScheduling.impl.TimetableImpl <em>Timetable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see courseScheduling.impl.TimetableImpl
		 * @see courseScheduling.impl.CourseSchedulingPackageImpl#getTimetable()
		 * @generated
		 */
		EClass TIMETABLE = eINSTANCE.getTimetable();

		/**
		 * The meta object literal for the '<em><b>Timetables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMETABLE__TIMETABLES = eINSTANCE.getTimetable_Timetables();

		/**
		 * The meta object literal for the '{@link courseScheduling.impl.SubTimetableImpl <em>Sub Timetable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see courseScheduling.impl.SubTimetableImpl
		 * @see courseScheduling.impl.CourseSchedulingPackageImpl#getSubTimetable()
		 * @generated
		 */
		EClass SUB_TIMETABLE = eINSTANCE.getSubTimetable();

		/**
		 * The meta object literal for the '<em><b>Class Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TIMETABLE__CLASS_NUMBER = eINSTANCE.getSubTimetable_ClassNumber();

		/**
		 * The meta object literal for the '<em><b>Weekday</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_TIMETABLE__WEEKDAY = eINSTANCE.getSubTimetable_Weekday();

		/**
		 * The meta object literal for the '{@link courseScheduling.impl.TimedElementImpl <em>Timed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see courseScheduling.impl.TimedElementImpl
		 * @see courseScheduling.impl.CourseSchedulingPackageImpl#getTimedElement()
		 * @generated
		 */
		EClass TIMED_ELEMENT = eINSTANCE.getTimedElement();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMED_ELEMENT__START_TIME = eINSTANCE.getTimedElement_StartTime();

		/**
		 * The meta object literal for the '<em><b>End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMED_ELEMENT__END_TIME = eINSTANCE.getTimedElement_EndTime();

		/**
		 * The meta object literal for the '{@link courseScheduling.impl.Day_columnImpl <em>Day column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see courseScheduling.impl.Day_columnImpl
		 * @see courseScheduling.impl.CourseSchedulingPackageImpl#getDay_column()
		 * @generated
		 */
		EClass DAY_COLUMN = eINSTANCE.getDay_column();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAY_COLUMN__NAME = eINSTANCE.getDay_column_Name();

		/**
		 * The meta object literal for the '<em><b>Courses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DAY_COLUMN__COURSES = eINSTANCE.getDay_column_Courses();

		/**
		 * The meta object literal for the '{@link courseScheduling.impl.CourseImpl <em>Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see courseScheduling.impl.CourseImpl
		 * @see courseScheduling.impl.CourseSchedulingPackageImpl#getCourse()
		 * @generated
		 */
		EClass COURSE = eINSTANCE.getCourse();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__NAME = eINSTANCE.getCourse_Name();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__DURATION = eINSTANCE.getCourse_Duration();

		/**
		 * The meta object literal for the '<em><b>Class Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CLASS_LIMIT = eINSTANCE.getCourse_ClassLimit();

		/**
		 * The meta object literal for the '<em><b>Instructors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__INSTRUCTORS = eINSTANCE.getCourse_Instructors();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__ROOM = eINSTANCE.getCourse_Room();

		/**
		 * The meta object literal for the '{@link courseScheduling.impl.InstructorListImpl <em>Instructor List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see courseScheduling.impl.InstructorListImpl
		 * @see courseScheduling.impl.CourseSchedulingPackageImpl#getInstructorList()
		 * @generated
		 */
		EClass INSTRUCTOR_LIST = eINSTANCE.getInstructorList();

		/**
		 * The meta object literal for the '<em><b>Instructors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTOR_LIST__INSTRUCTORS = eINSTANCE.getInstructorList_Instructors();

		/**
		 * The meta object literal for the '{@link courseScheduling.impl.InstructorImpl <em>Instructor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see courseScheduling.impl.InstructorImpl
		 * @see courseScheduling.impl.CourseSchedulingPackageImpl#getInstructor()
		 * @generated
		 */
		EClass INSTRUCTOR = eINSTANCE.getInstructor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUCTOR__NAME = eINSTANCE.getInstructor_Name();

		/**
		 * The meta object literal for the '<em><b>Courses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTOR__COURSES = eINSTANCE.getInstructor_Courses();

		/**
		 * The meta object literal for the '{@link courseScheduling.impl.RoomListImpl <em>Room List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see courseScheduling.impl.RoomListImpl
		 * @see courseScheduling.impl.CourseSchedulingPackageImpl#getRoomList()
		 * @generated
		 */
		EClass ROOM_LIST = eINSTANCE.getRoomList();

		/**
		 * The meta object literal for the '<em><b>Rooms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_LIST__ROOMS = eINSTANCE.getRoomList_Rooms();

		/**
		 * The meta object literal for the '{@link courseScheduling.impl.RoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see courseScheduling.impl.RoomImpl
		 * @see courseScheduling.impl.CourseSchedulingPackageImpl#getRoom()
		 * @generated
		 */
		EClass ROOM = eINSTANCE.getRoom();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__NAME = eINSTANCE.getRoom_Name();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__CAPACITY = eINSTANCE.getRoom_Capacity();

		/**
		 * The meta object literal for the '{@link courseScheduling.day <em>day</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see courseScheduling.day
		 * @see courseScheduling.impl.CourseSchedulingPackageImpl#getday()
		 * @generated
		 */
		EEnum DAY = eINSTANCE.getday();

	}

} //CourseSchedulingPackage
