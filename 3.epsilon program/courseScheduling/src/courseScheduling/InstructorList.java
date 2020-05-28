/**
 */
package courseScheduling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instructor List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link courseScheduling.InstructorList#getInstructors <em>Instructors</em>}</li>
 * </ul>
 *
 * @see courseScheduling.CourseSchedulingPackage#getInstructorList()
 * @model
 * @generated
 */
public interface InstructorList extends EObject {
	/**
	 * Returns the value of the '<em><b>Instructors</b></em>' containment reference list.
	 * The list contents are of type {@link courseScheduling.Instructor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instructors</em>' containment reference list.
	 * @see courseScheduling.CourseSchedulingPackage#getInstructorList_Instructors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Instructor> getInstructors();

} // InstructorList
