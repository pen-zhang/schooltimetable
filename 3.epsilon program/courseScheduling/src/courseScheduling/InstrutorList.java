/**
 */
package courseScheduling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instrutor List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link courseScheduling.InstrutorList#getInstructors <em>Instructors</em>}</li>
 * </ul>
 *
 * @see courseScheduling.CourseSchedulingPackage#getInstrutorList()
 * @model
 * @generated
 */
public interface InstrutorList extends EObject {
	/**
	 * Returns the value of the '<em><b>Instructors</b></em>' containment reference list.
	 * The list contents are of type {@link courseScheduling.Instructor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instructors</em>' containment reference list.
	 * @see courseScheduling.CourseSchedulingPackage#getInstrutorList_Instructors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Instructor> getInstructors();

} // InstrutorList
