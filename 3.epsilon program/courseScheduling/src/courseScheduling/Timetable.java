/**
 */
package courseScheduling;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timetable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link courseScheduling.Timetable#getTimetables <em>Timetables</em>}</li>
 * </ul>
 *
 * @see courseScheduling.CourseSchedulingPackage#getTimetable()
 * @model
 * @generated
 */
public interface Timetable extends TimedElement {
	/**
	 * Returns the value of the '<em><b>Timetables</b></em>' containment reference list.
	 * The list contents are of type {@link courseScheduling.SubTimetable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timetables</em>' containment reference list.
	 * @see courseScheduling.CourseSchedulingPackage#getTimetable_Timetables()
	 * @model containment="true"
	 * @generated
	 */
	EList<SubTimetable> getTimetables();

} // Timetable
