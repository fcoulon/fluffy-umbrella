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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDsl.ImportSyntax;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.rAttribute;
import org.xtext.example.mydsl.myDsl.rClass;
import org.xtext.example.mydsl.myDsl.rOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>rClass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.rClassImpl#getSyntax <em>Syntax</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.rClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.rClassImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.rClassImpl#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class rClassImpl extends MinimalEObjectImpl.Container implements rClass
{
  /**
   * The cached value of the '{@link #getSyntax() <em>Syntax</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSyntax()
   * @generated
   * @ordered
   */
  protected ImportSyntax syntax;

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
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected EList<rAttribute> attributes;

  /**
   * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperations()
   * @generated
   * @ordered
   */
  protected EList<rOperation> operations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected rClassImpl()
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
    return MyDslPackage.Literals.RCLASS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImportSyntax getSyntax()
  {
    if (syntax != null && syntax.eIsProxy())
    {
      InternalEObject oldSyntax = (InternalEObject)syntax;
      syntax = (ImportSyntax)eResolveProxy(oldSyntax);
      if (syntax != oldSyntax)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.RCLASS__SYNTAX, oldSyntax, syntax));
      }
    }
    return syntax;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImportSyntax basicGetSyntax()
  {
    return syntax;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSyntax(ImportSyntax newSyntax)
  {
    ImportSyntax oldSyntax = syntax;
    syntax = newSyntax;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.RCLASS__SYNTAX, oldSyntax, syntax));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.RCLASS__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<rAttribute> getAttributes()
  {
    if (attributes == null)
    {
      attributes = new EObjectContainmentEList<rAttribute>(rAttribute.class, this, MyDslPackage.RCLASS__ATTRIBUTES);
    }
    return attributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<rOperation> getOperations()
  {
    if (operations == null)
    {
      operations = new EObjectContainmentEList<rOperation>(rOperation.class, this, MyDslPackage.RCLASS__OPERATIONS);
    }
    return operations;
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
      case MyDslPackage.RCLASS__ATTRIBUTES:
        return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
      case MyDslPackage.RCLASS__OPERATIONS:
        return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.RCLASS__SYNTAX:
        if (resolve) return getSyntax();
        return basicGetSyntax();
      case MyDslPackage.RCLASS__NAME:
        return getName();
      case MyDslPackage.RCLASS__ATTRIBUTES:
        return getAttributes();
      case MyDslPackage.RCLASS__OPERATIONS:
        return getOperations();
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
      case MyDslPackage.RCLASS__SYNTAX:
        setSyntax((ImportSyntax)newValue);
        return;
      case MyDslPackage.RCLASS__NAME:
        setName((String)newValue);
        return;
      case MyDslPackage.RCLASS__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends rAttribute>)newValue);
        return;
      case MyDslPackage.RCLASS__OPERATIONS:
        getOperations().clear();
        getOperations().addAll((Collection<? extends rOperation>)newValue);
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
      case MyDslPackage.RCLASS__SYNTAX:
        setSyntax((ImportSyntax)null);
        return;
      case MyDslPackage.RCLASS__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MyDslPackage.RCLASS__ATTRIBUTES:
        getAttributes().clear();
        return;
      case MyDslPackage.RCLASS__OPERATIONS:
        getOperations().clear();
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
      case MyDslPackage.RCLASS__SYNTAX:
        return syntax != null;
      case MyDslPackage.RCLASS__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MyDslPackage.RCLASS__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
      case MyDslPackage.RCLASS__OPERATIONS:
        return operations != null && !operations.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //rClassImpl
