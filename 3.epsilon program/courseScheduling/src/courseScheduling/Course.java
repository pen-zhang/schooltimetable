/**
 */
package courseScheduling;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link courseScheduling.Course#getName <em>Name</em>}</li>
 *   <li>{@link courseScheduling.Course#getDuration <em>Duration</em>}</li>
 *   <li>{@link courseScheduling.Course#getClassLimit <em>Class Limit</em>}</li>
 *   <li>{@link courseScheduling.Course#getInstructors <em>Instructors</em>}</li>
 *   <li>{@link courseScheduling.Course#getRoom <em>Room</em>}</li>
 * </ul>
 *
 * @see courseScheduling.CourseSchedulingPackage#getCourse()
 * @model
 * @generated
 */
public interface Course extends TimedElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see courseScheduling.CourseSchedulingPackage#getCourse_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link courseScheduling.Course#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(int)
	 * @see courseScheduling.CourseSchedulingPackage#getCourse_Duration()
	 * @model
	 * @generated
	 */
	int getDuration();

	/**
	 * Sets the value of the '{@link courseScheduling.Course#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(int value);

	/**
	 * Returns the value of the '<em><b>Class Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Limit</em>' attribute.
	 * @see #setClassLimit(int)
	 * @see courseScheduling.CourseSchedulingPackage#getCourse_ClassLimit()
	 * @model
	 * @generated
	 */
	int getClassLimit();

	/**
	 * Sets the value of the '{@link courseScheduling.Course#getClassLimit <em>Class Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Limit</em>' attribute.
	 * @see #getClassLimit()
	 * @generated
	 */
	void setClassLimit(int value);

	/**
	 * Returns the value of the '<em><b>Instructors</b></em>' reference list.
	 * The list contents are of type {@link courseScheduling.Instructor}.
	 * It is bidirectional and its opposite is '{@link courseScheduling.Instructor#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instructors</em>' reference list.
	 * @see courseScheduling.CourseSchedulingPackage#getCourse_Instructors()
	 * @see courseScheduling.Instructor#getCourses
	 * @model opposite="courses" required="true"
	 * @generated
	 */
	EList<Instructor> getInstructors();

	/**
	 * Returns the value of the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' reference.
	 * @see #setRoom(Room)
	 * @see courseScheduling.CourseSchedulingPackage#getCourse_Room()
	 * @model required="true"
	 * @generated
	 */
	Room getRoom();

	/**
	 * Sets the value of the '{@link courseScheduling.Course#getRoom <em>Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room</em>' reference.
	 * @see #getRoom()
	 * @generated
	 */
	void setRoom(Room value);
	
	/**
	 * Returns the value of the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Time</em>' attribute.
	 * @see #setEndTime()
	 * @see courseScheduling.CourseSchedulingPackage#getCourse_EndTime()
	 * @model required="true"
	 * @generated NOT
	 */
	@Override
	int getEndTime();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Time</em>' attribute.
	 * @see #getEndTime()
	 * @generated NOT
	 */
	//void setEndTime();
	
	
} // Course
