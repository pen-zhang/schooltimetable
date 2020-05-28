/**
 */
package courseScheduling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Timetable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link courseScheduling.SubTimetable#getClassNumber <em>Class Number</em>}</li>
 *   <li>{@link courseScheduling.SubTimetable#getWeekday <em>Weekday</em>}</li>
 * </ul>
 *
 * @see courseScheduling.CourseSchedulingPackage#getSubTimetable()
 * @model
 * @generated
 */
public interface SubTimetable extends EObject {
	/**
	 * Returns the value of the '<em><b>Class Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Number</em>' attribute.
	 * @see #setClassNumber(int)
	 * @see courseScheduling.CourseSchedulingPackage#getSubTimetable_ClassNumber()
	 * @model
	 * @generated
	 */
	int getClassNumber();

	/**
	 * Sets the value of the '{@link courseScheduling.SubTimetable#getClassNumber <em>Class Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Number</em>' attribute.
	 * @see #getClassNumber()
	 * @generated
	 */
	void setClassNumber(int value);

	/**
	 * Returns the value of the '<em><b>Weekday</b></em>' containment reference list.
	 * The list contents are of type {@link courseScheduling.Day_column}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weekday</em>' containment reference list.
	 * @see courseScheduling.CourseSchedulingPackage#getSubTimetable_Weekday()
	 * @model containment="true" required="true" upper="7"
	 * @generated
	 */
	EList<Day_column> getWeekday();

} // SubTimetable
