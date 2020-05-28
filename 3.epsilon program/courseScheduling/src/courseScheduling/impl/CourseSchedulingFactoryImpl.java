/**
 */
package courseScheduling.impl;

import courseScheduling.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CourseSchedulingFactoryImpl extends EFactoryImpl implements CourseSchedulingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CourseSchedulingFactory init() {
		try {
			CourseSchedulingFactory theCourseSchedulingFactory = (CourseSchedulingFactory)EPackage.Registry.INSTANCE.getEFactory(CourseSchedulingPackage.eNS_URI);
			if (theCourseSchedulingFactory != null) {
				return theCourseSchedulingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CourseSchedulingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseSchedulingFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CourseSchedulingPackage.TIMETABLE: return createTimetable();
			case CourseSchedulingPackage.SUB_TIMETABLE: return createSubTimetable();
			case CourseSchedulingPackage.TIMED_ELEMENT: return createTimedElement();
			case CourseSchedulingPackage.DAY_COLUMN: return createDay_column();
			case CourseSchedulingPackage.COURSE: return createCourse();
			case CourseSchedulingPackage.INSTRUCTOR_LIST: return createInstructorList();
			case CourseSchedulingPackage.INSTRUCTOR: return createInstructor();
			case CourseSchedulingPackage.ROOM_LIST: return createRoomList();
			case CourseSchedulingPackage.ROOM: return createRoom();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CourseSchedulingPackage.DAY:
				return createdayFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CourseSchedulingPackage.DAY:
				return convertdayToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Timetable createTimetable() {
		TimetableImpl timetable = new TimetableImpl();
		return timetable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubTimetable createSubTimetable() {
		SubTimetableImpl subTimetable = new SubTimetableImpl();
		return subTimetable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimedElement createTimedElement() {
		TimedElementImpl timedElement = new TimedElementImpl();
		return timedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Day_column createDay_column() {
		Day_columnImpl day_column = new Day_columnImpl();
		return day_column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Course createCourse() {
		CourseImpl course = new CourseImpl();
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InstructorList createInstructorList() {
		InstructorListImpl instructorList = new InstructorListImpl();
		return instructorList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Instructor createInstructor() {
		InstructorImpl instructor = new InstructorImpl();
		return instructor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoomList createRoomList() {
		RoomListImpl roomList = new RoomListImpl();
		return roomList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Room createRoom() {
		RoomImpl room = new RoomImpl();
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public day createdayFromString(EDataType eDataType, String initialValue) {
		day result = day.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertdayToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CourseSchedulingPackage getCourseSchedulingPackage() {
		return (CourseSchedulingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CourseSchedulingPackage getPackage() {
		return CourseSchedulingPackage.eINSTANCE;
	}

} //CourseSchedulingFactoryImpl
