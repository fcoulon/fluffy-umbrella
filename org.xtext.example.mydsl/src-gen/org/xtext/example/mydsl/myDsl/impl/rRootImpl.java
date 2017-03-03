/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.rClass;
import org.xtext.example.mydsl.myDsl.rImportSyntax;
import org.xtext.example.mydsl.myDsl.rRoot;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>rRoot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.rRootImpl#getBehaviour <em>Behaviour</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.rRootImpl#getSyntaxes <em>Syntaxes</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.rRootImpl#getSemantics <em>Semantics</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.rRootImpl#getServices <em>Services</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.rRootImpl#getXtendedClasses <em>Xtended Classes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class rRootImpl extends MinimalEObjectImpl.Container implements rRoot
{
  /**
   * The default value of the '{@link #getBehaviour() <em>Behaviour</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBehaviour()
   * @generated
   * @ordered
   */
  protected static final String BEHAVIOUR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBehaviour() <em>Behaviour</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBehaviour()
   * @generated
   * @ordered
   */
  protected String behaviour = BEHAVIOUR_EDEFAULT;

  /**
   * The cached value of the '{@link #getSyntaxes() <em>Syntaxes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSyntaxes()
   * @generated
   * @ordered
   */
  protected EList<rImportSyntax> syntaxes;

  /**
   * The cached value of the '{@link #getSemantics() <em>Semantics</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSemantics()
   * @generated
   * @ordered
   */
  protected EList<String> semantics;

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
   * The cached value of the '{@link #getXtendedClasses() <em>Xtended Classes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXtendedClasses()
   * @generated
   * @ordered
   */
  protected EList<rClass> xtendedClasses;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected rRootImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.RROOT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBehaviour()
  {
    return behaviour;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBehaviour(String newBehaviour)
  {
    String oldBehaviour = behaviour;
    behaviour = newBehaviour;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.RROOT__BEHAVIOUR, oldBehaviour, behaviour));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<rImportSyntax> getSyntaxes()
  {
    if (syntaxes == null)
    {
      syntaxes = new EObjectContainmentEList<rImportSyntax>(rImportSyntax.class, this, MyDslPackage.RROOT__SYNTAXES);
    }
    return syntaxes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getSemantics()
  {
    if (semantics == null)
    {
      semantics = new EDataTypeEList<String>(String.class, this, MyDslPackage.RROOT__SEMANTICS);
    }
    return semantics;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getServices()
  {
    if (services == null)
    {
      services = new EDataTypeEList<String>(String.class, this, MyDslPackage.RROOT__SERVICES);
    }
    return services;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<rClass> getXtendedClasses()
  {
    if (xtendedClasses == null)
    {
      xtendedClasses = new EObjectContainmentEList<rClass>(rClass.class, this, MyDslPackage.RROOT__XTENDED_CLASSES);
    }
    return xtendedClasses;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyDslPackage.RROOT__SYNTAXES:
        return ((InternalEList<?>)getSyntaxes()).basicRemove(otherEnd, msgs);
      case MyDslPackage.RROOT__XTENDED_CLASSES:
        return ((InternalEList<?>)getXtendedClasses()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.RROOT__BEHAVIOUR:
        return getBehaviour();
      case MyDslPackage.RROOT__SYNTAXES:
        return getSyntaxes();
      case MyDslPackage.RROOT__SEMANTICS:
        return getSemantics();
      case MyDslPackage.RROOT__SERVICES:
        return getServices();
      case MyDslPackage.RROOT__XTENDED_CLASSES:
        return getXtendedClasses();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.RROOT__BEHAVIOUR:
        setBehaviour((String)newValue);
        return;
      case MyDslPackage.RROOT__SYNTAXES:
        getSyntaxes().clear();
        getSyntaxes().addAll((Collection<? extends rImportSyntax>)newValue);
        return;
      case MyDslPackage.RROOT__SEMANTICS:
        getSemantics().clear();
        getSemantics().addAll((Collection<? extends String>)newValue);
        return;
      case MyDslPackage.RROOT__SERVICES:
        getServices().clear();
        getServices().addAll((Collection<? extends String>)newValue);
        return;
      case MyDslPackage.RROOT__XTENDED_CLASSES:
        getXtendedClasses().clear();
        getXtendedClasses().addAll((Collection<? extends rClass>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.RROOT__BEHAVIOUR:
        setBehaviour(BEHAVIOUR_EDEFAULT);
        return;
      case MyDslPackage.RROOT__SYNTAXES:
        getSyntaxes().clear();
        return;
      case MyDslPackage.RROOT__SEMANTICS:
        getSemantics().clear();
        return;
      case MyDslPackage.RROOT__SERVICES:
        getServices().clear();
        return;
      case MyDslPackage.RROOT__XTENDED_CLASSES:
        getXtendedClasses().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.RROOT__BEHAVIOUR:
        return BEHAVIOUR_EDEFAULT == null ? behaviour != null : !BEHAVIOUR_EDEFAULT.equals(behaviour);
      case MyDslPackage.RROOT__SYNTAXES:
        return syntaxes != null && !syntaxes.isEmpty();
      case MyDslPackage.RROOT__SEMANTICS:
        return semantics != null && !semantics.isEmpty();
      case MyDslPackage.RROOT__SERVICES:
        return services != null && !services.isEmpty();
      case MyDslPackage.RROOT__XTENDED_CLASSES:
        return xtendedClasses != null && !xtendedClasses.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (behaviour: ");
    result.append(behaviour);
    result.append(", semantics: ");
    result.append(semantics);
    result.append(", services: ");
    result.append(services);
    result.append(')');
    return result.toString();
  }

} //rRootImpl