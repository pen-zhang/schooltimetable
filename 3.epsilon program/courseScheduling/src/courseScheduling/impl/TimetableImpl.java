/**
 */
package courseScheduling.impl;

import courseScheduling.CourseSchedulingPackage;
import courseScheduling.Day_column;
import courseScheduling.SubTimetable;
import courseScheduling.Timetable;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timetable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link courseScheduling.impl.TimetableImpl#getTimetables <em>Timetables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimetableImpl extends TimedElementImpl implements Timetable {
	/**
	 * The cached value of the '{@link #getTimetables() <em>Timetables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimetables()
	 * @generated
	 * @ordered
	 */
	protected EList<SubTimetable> timetables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimetableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CourseSchedulingPackage.Literals.TIMETABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubTimetable> getTimetables() {
		if (timetables == null) {
			timetables = new EObjectContainmentEList<SubTimetable>(SubTimetable.class, this, CourseSchedulingPackage.TIMETABLE__TIMETABLES);
		}
		return timetables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CourseSchedulingPackage.TIMETABLE__TIMETABLES:
				return ((InternalEList<?>)getTimetables()).basicRemove(otherEnd, msgs);
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
			case CourseSchedulingPackage.TIMETABLE__TIMETABLES:
				return getTimetables();
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
			case CourseSchedulingPackage.TIMETABLE__TIMETABLES:
				getTimetables().clear();
				getTimetables().addAll((Collection<? extends SubTimetable>)newValue);
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
			case CourseSchedulingPackage.TIMETABLE__TIMETABLES:
				getTimetables().clear();
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
			case CourseSchedulingPackage.TIMETABLE__TIMETABLES:
				return timetables != null && !timetables.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TimetableImpl
