/**
 */
package courseScheduling;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timed Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link courseScheduling.TimedElement#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link courseScheduling.TimedElement#getEndTime <em>End Time</em>}</li>
 * </ul>
 *
 * @see courseScheduling.CourseSchedulingPackage#getTimedElement()
 * @model
 * @generated
 */
public interface TimedElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(int)
	 * @see courseScheduling.CourseSchedulingPackage#getTimedElement_StartTime()
	 * @model
	 * @generated
	 */
	int getStartTime();

	/**
	 * Sets the value of the '{@link courseScheduling.TimedElement#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(int value);

	/**
	 * Returns the value of the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Time</em>' attribute.
	 * @see #setEndTime(int)
	 * @see courseScheduling.CourseSchedulingPackage#getTimedElement_EndTime()
	 * @model
	 * @generated
	 */
	int getEndTime();

	/**
	 * Sets the value of the '{@link courseScheduling.TimedElement#getEndTime <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Time</em>' attribute.
	 * @see #getEndTime()
	 * @generated
	 */
	void setEndTime(int value);

} // TimedElement
