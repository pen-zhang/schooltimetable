/**
 */
package courseScheduling;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instructor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link courseScheduling.Instructor#getName <em>Name</em>}</li>
 *   <li>{@link courseScheduling.Instructor#getCourses <em>Courses</em>}</li>
 * </ul>
 *
 * @see courseScheduling.CourseSchedulingPackage#getInstructor()
 * @model
 * @generated
 */
public interface Instructor extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see courseScheduling.CourseSchedulingPackage#getInstructor_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link courseScheduling.Instructor#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' reference list.
	 * The list contents are of type {@link courseScheduling.Course}.
	 * It is bidirectional and its opposite is '{@link courseScheduling.Course#getInstructors <em>Instructors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' reference list.
	 * @see courseScheduling.CourseSchedulingPackage#getInstructor_Courses()
	 * @see courseScheduling.Course#getInstructors
	 * @model opposite="instructors" required="true"
	 * @generated
	 */
	EList<Course> getCourses();

} // Instructor
