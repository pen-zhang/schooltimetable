/**
 */
package courseScheduling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Day column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link courseScheduling.Day_column#getName <em>Name</em>}</li>
 *   <li>{@link courseScheduling.Day_column#getCourses <em>Courses</em>}</li>
 * </ul>
 *
 * @see courseScheduling.CourseSchedulingPackage#getDay_column()
 * @model
 * @generated
 */
public interface Day_column extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The literals are from the enumeration {@link courseScheduling.day}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see courseScheduling.day
	 * @see #setName(day)
	 * @see courseScheduling.CourseSchedulingPackage#getDay_column_Name()
	 * @model
	 * @generated
	 */
	day getName();

	/**
	 * Sets the value of the '{@link courseScheduling.Day_column#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see courseScheduling.day
	 * @see #getName()
	 * @generated
	 */
	void setName(day value);

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' containment reference list.
	 * The list contents are of type {@link courseScheduling.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' containment reference list.
	 * @see courseScheduling.CourseSchedulingPackage#getDay_column_Courses()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Course> getCourses();

} // Day_column
