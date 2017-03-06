/**
 */
package implementation.impl;

import implementation.ExtendedClass;
import implementation.ImplementationPackage;
import implementation.ImportSyntax;
import implementation.ModelBehavior;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link implementation.impl.ModelBehaviorImpl#getClassExtensions <em>Class Extensions</em>}</li>
 *   <li>{@link implementation.impl.ModelBehaviorImpl#getServices <em>Services</em>}</li>
 *   <li>{@link implementation.impl.ModelBehaviorImpl#getImportSyntaxes <em>Import Syntaxes</em>}</li>
 *   <li>{@link implementation.impl.ModelBehaviorImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelBehaviorImpl extends MinimalEObjectImpl.Container implements ModelBehavior {
	/**
	 * The cached value of the '{@link #getClassExtensions() <em>Class Extensions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassExtensions()
	 * @generated
	 * @ordered
	 */
	protected EList<ExtendedClass> classExtensions;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<String> services;

	/**
	 * The cached value of the '{@link #getImportSyntaxes() <em>Import Syntaxes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportSyntaxes()
	 * @generated
	 * @ordered
	 */
	protected EList<ImportSyntax> importSyntaxes;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelBehaviorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImplementationPackage.Literals.MODEL_BEHAVIOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExtendedClass> getClassExtensions() {
		if (classExtensions == null) {
			classExtensions = new EObjectContainmentEList<ExtendedClass>(ExtendedClass.class, this, ImplementationPackage.MODEL_BEHAVIOR__CLASS_EXTENSIONS);
		}
		return classExtensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getServices() {
		if (services == null) {
			services = new EDataTypeUniqueEList<String>(String.class, this, ImplementationPackage.MODEL_BEHAVIOR__SERVICES);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImportSyntax> getImportSyntaxes() {
		if (importSyntaxes == null) {
			importSyntaxes = new EObjectContainmentEList<ImportSyntax>(ImportSyntax.class, this, ImplementationPackage.MODEL_BEHAVIOR__IMPORT_SYNTAXES);
		}
		return importSyntaxes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.MODEL_BEHAVIOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ImplementationPackage.MODEL_BEHAVIOR__CLASS_EXTENSIONS:
				return ((InternalEList<?>)getClassExtensions()).basicRemove(otherEnd, msgs);
			case ImplementationPackage.MODEL_BEHAVIOR__IMPORT_SYNTAXES:
				return ((InternalEList<?>)getImportSyntaxes()).basicRemove(otherEnd, msgs);
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
			case ImplementationPackage.MODEL_BEHAVIOR__CLASS_EXTENSIONS:
				return getClassExtensions();
			case ImplementationPackage.MODEL_BEHAVIOR__SERVICES:
				return getServices();
			case ImplementationPackage.MODEL_BEHAVIOR__IMPORT_SYNTAXES:
				return getImportSyntaxes();
			case ImplementationPackage.MODEL_BEHAVIOR__NAME:
				return getName();
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
			case ImplementationPackage.MODEL_BEHAVIOR__CLASS_EXTENSIONS:
				getClassExtensions().clear();
				getClassExtensions().addAll((Collection<? extends ExtendedClass>)newValue);
				return;
			case ImplementationPackage.MODEL_BEHAVIOR__SERVICES:
				getServices().clear();
				getServices().addAll((Collection<? extends String>)newValue);
				return;
			case ImplementationPackage.MODEL_BEHAVIOR__IMPORT_SYNTAXES:
				getImportSyntaxes().clear();
				getImportSyntaxes().addAll((Collection<? extends ImportSyntax>)newValue);
				return;
			case ImplementationPackage.MODEL_BEHAVIOR__NAME:
				setName((String)newValue);
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
			case ImplementationPackage.MODEL_BEHAVIOR__CLASS_EXTENSIONS:
				getClassExtensions().clear();
				return;
			case ImplementationPackage.MODEL_BEHAVIOR__SERVICES:
				getServices().clear();
				return;
			case ImplementationPackage.MODEL_BEHAVIOR__IMPORT_SYNTAXES:
				getImportSyntaxes().clear();
				return;
			case ImplementationPackage.MODEL_BEHAVIOR__NAME:
				setName(NAME_EDEFAULT);
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
			case ImplementationPackage.MODEL_BEHAVIOR__CLASS_EXTENSIONS:
				return classExtensions != null && !classExtensions.isEmpty();
			case ImplementationPackage.MODEL_BEHAVIOR__SERVICES:
				return services != null && !services.isEmpty();
			case ImplementationPackage.MODEL_BEHAVIOR__IMPORT_SYNTAXES:
				return importSyntaxes != null && !importSyntaxes.isEmpty();
			case ImplementationPackage.MODEL_BEHAVIOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (services: ");
		result.append(services);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ModelBehaviorImpl
