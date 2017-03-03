/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>rRoot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.rRoot#getBehaviour <em>Behaviour</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.rRoot#getSyntaxes <em>Syntaxes</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.rRoot#getSemantics <em>Semantics</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.rRoot#getServices <em>Services</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.rRoot#getXtendedClasses <em>Xtended Classes</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getrRoot()
 * @model
 * @generated
 */
public interface rRoot extends EObject
{
  /**
   * Returns the value of the '<em><b>Behaviour</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Behaviour</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Behaviour</em>' attribute.
   * @see #setBehaviour(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getrRoot_Behaviour()
   * @model
   * @generated
   */
  String getBehaviour();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.rRoot#getBehaviour <em>Behaviour</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Behaviour</em>' attribute.
   * @see #getBehaviour()
   * @generated
   */
  void setBehaviour(String value);

  /**
   * Returns the value of the '<em><b>Syntaxes</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.rImportSyntax}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Syntaxes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Syntaxes</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getrRoot_Syntaxes()
   * @model containment="true"
   * @generated
   */
  EList<rImportSyntax> getSyntaxes();

  /**
   * Returns the value of the '<em><b>Semantics</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Semantics</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Semantics</em>' attribute list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getrRoot_Semantics()
   * @model unique="false"
   * @generated
   */
  EList<String> getSemantics();

  /**
   * Returns the value of the '<em><b>Services</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Services</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Services</em>' attribute list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getrRoot_Services()
   * @model unique="false"
   * @generated
   */
  EList<String> getServices();

  /**
   * Returns the value of the '<em><b>Xtended Classes</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.rClass}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Xtended Classes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Xtended Classes</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getrRoot_XtendedClasses()
   * @model containment="true"
   * @generated
   */
  EList<rClass> getXtendedClasses();

} // rRoot