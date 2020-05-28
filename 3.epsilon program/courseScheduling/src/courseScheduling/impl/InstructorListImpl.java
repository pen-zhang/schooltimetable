/**
 */
package courseScheduling.impl;

import courseScheduling.CourseSchedulingPackage;
import courseScheduling.Instructor;
import courseScheduling.InstructorList;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instructor List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link courseScheduling.impl.InstructorListImpl#getInstructors <em>Instructors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstructorListImpl extends EObjectImpl implements InstructorList {
	/**
	 * The cached value of the '{@link #getInstructors() <em>Instructors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructors()
	 * @generated
	 * @ordered
	 */
	protected EList<Instructor> instructors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstructorListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CourseSchedulingPackage.Literals.INSTRUCTOR_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Instructor> getInstructors() {
		if (instructors == null) {
			instructors = new EObjectContainmentEList<Instructor>(Instructor.class, this, CourseSchedulingPackage.INSTRUCTOR_LIST__INSTRUCTORS);
		}
		return instructors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CourseSchedulingPackage.INSTRUCTOR_LIST__INSTRUCTORS:
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
			case CourseSchedulingPackage.INSTRUCTOR_LIST__INSTRUCTORS:
				return getInstructors();
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
			case CourseSchedulingPackage.INSTRUCTOR_LIST__INSTRUCTORS:
				getInstructors().clear();
				getInstructors().addAll((Collection<? extends Instructor>)newValue);
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
			case CourseSchedulingPackage.INSTRUCTOR_LIST__INSTRUCTORS:
				getInstructors().clear();
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
			case CourseSchedulingPackage.INSTRUCTOR_LIST__INSTRUCTORS:
				return instructors != null && !instructors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InstructorListImpl
