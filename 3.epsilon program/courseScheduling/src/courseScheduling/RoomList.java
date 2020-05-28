/**
 */
package courseScheduling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link courseScheduling.RoomList#getRooms <em>Rooms</em>}</li>
 * </ul>
 *
 * @see courseScheduling.CourseSchedulingPackage#getRoomList()
 * @model
 * @generated
 */
public interface RoomList extends EObject {
	/**
	 * Returns the value of the '<em><b>Rooms</b></em>' containment reference list.
	 * The list contents are of type {@link courseScheduling.Room}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rooms</em>' containment reference list.
	 * @see courseScheduling.CourseSchedulingPackage#getRoomList_Rooms()
	 * @model containment="true"
	 * @generated
	 */
	EList<Room> getRooms();

} // RoomList
