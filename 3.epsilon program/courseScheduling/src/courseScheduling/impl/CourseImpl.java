/**
 */
package courseScheduling.impl;

import courseScheduling.Course;
import courseScheduling.CourseSchedulingPackage;
import courseScheduling.Instructor;
import courseScheduling.Room;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link courseScheduling.impl.CourseImpl#getName <em>Name</em>}</li>
 *   <li>{@link courseScheduling.impl.CourseImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link courseScheduling.impl.CourseImpl#getClassLimit <em>Class Limit</em>}</li>
 *   <li>{@link courseScheduling.impl.CourseImpl#getInstructors <em>Instructors</em>}</li>
 *   <li>{@link courseScheduling.impl.CourseImpl#getRoom <em>Room</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseImpl extends TimedElementImpl implements Course {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected int duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getClassLimit() <em>Class Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassLimit()
	 * @generated
	 * @ordered
	 */
	protected static final int CLASS_LIMIT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getClassLimit() <em>Class Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassLimit()
	 * @generated
	 * @ordered
	 */
	protected int classLimit = CLASS_LIMIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInstructors() <em>Instructors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructors()
	 * @generated
	 * @ordered
	 */
	protected EList<Instructor> instructors;

	/**
	 * The cached value of the '{@link #getRoom() <em>Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoom()
	 * @generated
	 * @ordered
	 */
	protected Room room;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CourseSchedulingPackage.Literals.COURSE;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public int getEndTime() {
		endTime=startTime+(duration / 60)*100+duration%60;
		int remainder;
		remainder=endTime%100;
		if(remainder >= 60)
			endTime=endTime+40;
		return endTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CourseSchedulingPackage.COURSE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDuration(int newDuration) {
		int oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CourseSchedulingPackage.COURSE__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getClassLimit() {
		return classLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClassLimit(int newClassLimit) {
		int oldClassLimit = classLimit;
		classLimit = newClassLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CourseSchedulingPackage.COURSE__CLASS_LIMIT, oldClassLimit, classLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Instructor> getInstructors() {
		if (instructors == null) {
			instructors = new EObjectWithInverseResolvingEList.ManyInverse<Instructor>(Instructor.class, this, CourseSchedulingPackage.COURSE__INSTRUCTORS, CourseSchedulingPackage.INSTRUCTOR__COURSES);
		}
		return instructors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Room getRoom() {
		if (room != null && room.eIsProxy()) {
			InternalEObject oldRoom = (InternalEObject)room;
			room = (Room)eResolveProxy(oldRoom);
			if (room != oldRoom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CourseSchedulingPackage.COURSE__ROOM, oldRoom, room));
			}
		}
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room basicGetRoom() {
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoom(Room newRoom) {
		Room oldRoom = room;
		room = newRoom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CourseSchedulingPackage.COURSE__ROOM, oldRoom, room));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CourseSchedulingPackage.COURSE__INSTRUCTORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInstructors()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CourseSchedulingPackage.COURSE__INSTRUCTORS:
				return ((InternalEList<?>)getInstructors()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CourseSchedulingPackage.COURSE__NAME:
				return getName();
			case CourseSchedulingPackage.COURSE__DURATION:
				return getDuration();
			case CourseSchedulingPackage.COURSE__CLASS_LIMIT:
				return getClassLimit();
			case CourseSchedulingPackage.COURSE__INSTRUCTORS:
				return getInstructors();
			case CourseSchedulingPackage.COURSE__ROOM:
				if (resolve) return getRoom();
				return basicGetRoom();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CourseSchedulingPackage.COURSE__NAME:
				setName((String)newValue);
				return;
			case CourseSchedulingPackage.COURSE__DURATION:
				setDuration((Integer)newValue);
				return;
			case CourseSchedulingPackage.COURSE__CLASS_LIMIT:
				setClassLimit((Integer)newValue);
				return;
			case CourseSchedulingPackage.COURSE__INSTRUCTORS:
				getInstructors().clear();
				getInstructors().addAll((Collection<? extends Instructor>)newValue);
				return;
			case CourseSchedulingPackage.COURSE__ROOM:
				setRoom((Room)newValue);
				return;
				
				//mod
			case CourseSchedulingPackage.TIMED_ELEMENT__END_TIME:
				getEndTime();
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CourseSchedulingPackage.COURSE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CourseSchedulingPackage.COURSE__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case CourseSchedulingPackage.COURSE__CLASS_LIMIT:
				setClassLimit(CLASS_LIMIT_EDEFAULT);
				return;
			case CourseSchedulingPackage.COURSE__INSTRUCTORS:
				getInstructors().clear();
				return;
			case CourseSchedulingPackage.COURSE__ROOM:
				setRoom((Room)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CourseSchedulingPackage.COURSE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CourseSchedulingPackage.COURSE__DURATION:
				return duration != DURATION_EDEFAULT;
			case CourseSchedulingPackage.COURSE__CLASS_LIMIT:
				return classLimit != CLASS_LIMIT_EDEFAULT;
			case CourseSchedulingPackage.COURSE__INSTRUCTORS:
				return instructors != null && !instructors.isEmpty();
			case CourseSchedulingPackage.COURSE__ROOM:
				return room != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", duration: ");
		result.append(duration);
		result.append(", classLimit: ");
		result.append(classLimit);
		result.append(')');
		return result.toString();
	}

} //CourseImpl
