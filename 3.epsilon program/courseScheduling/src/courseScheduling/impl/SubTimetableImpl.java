/**
 */
package courseScheduling.impl;

import courseScheduling.CourseSchedulingPackage;
import courseScheduling.Day_column;
import courseScheduling.SubTimetable;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Timetable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link courseScheduling.impl.SubTimetableImpl#getClassNumber <em>Class Number</em>}</li>
 *   <li>{@link courseScheduling.impl.SubTimetableImpl#getWeekday <em>Weekday</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubTimetableImpl extends EObjectImpl implements SubTimetable {
	/**
	 * The default value of the '{@link #getClassNumber() <em>Class Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int CLASS_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getClassNumber() <em>Class Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassNumber()
	 * @generated
	 * @ordered
	 */
	protected int classNumber = CLASS_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWeekday() <em>Weekday</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeekday()
	 * @generated
	 * @ordered
	 */
	protected EList<Day_column> weekday;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubTimetableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CourseSchedulingPackage.Literals.SUB_TIMETABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getClassNumber() {
		return classNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClassNumber(int newClassNumber) {
		int oldClassNumber = classNumber;
		classNumber = newClassNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CourseSchedulingPackage.SUB_TIMETABLE__CLASS_NUMBER, oldClassNumber, classNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Day_column> getWeekday() {
		if (weekday == null) {
			weekday = new EObjectContainmentEList<Day_column>(Day_column.class, this, CourseSchedulingPackage.SUB_TIMETABLE__WEEKDAY);
		}
		return weekday;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CourseSchedulingPackage.SUB_TIMETABLE__WEEKDAY:
				return ((InternalEList<?>)getWeekday()).basicRemove(otherEnd, msgs);
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
			case CourseSchedulingPackage.SUB_TIMETABLE__CLASS_NUMBER:
				return getClassNumber();
			case CourseSchedulingPackage.SUB_TIMETABLE__WEEKDAY:
				return getWeekday();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CourseSchedulingPackage.SUB_TIMETABLE__CLASS_NUMBER:
				setClassNumber((Integer)newValue);
				return;
			case CourseSchedulingPackage.SUB_TIMETABLE__WEEKDAY:
				getWeekday().clear();
				getWeekday().addAll((Collection<? extends Day_column>)newValue);
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
			case CourseSchedulingPackage.SUB_TIMETABLE__CLASS_NUMBER:
				setClassNumber(CLASS_NUMBER_EDEFAULT);
				return;
			case CourseSchedulingPackage.SUB_TIMETABLE__WEEKDAY:
				getWeekday().clear();
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
			case CourseSchedulingPackage.SUB_TIMETABLE__CLASS_NUMBER:
				return classNumber != CLASS_NUMBER_EDEFAULT;
			case CourseSchedulingPackage.SUB_TIMETABLE__WEEKDAY:
				return weekday != null && !weekday.isEmpty();
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
		result.append(" (classNumber: ");
		result.append(classNumber);
		result.append(')');
		return result.toString();
	}

} //SubTimetableImpl
