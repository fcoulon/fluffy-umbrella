/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslFactory
 * @model kind="package"
 * @generated
 */
public interface MyDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "myDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/mydsl/MyDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "myDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslPackage eINSTANCE = org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.rRootImpl <em>rRoot</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.rRootImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getrRoot()
   * @generated
   */
  int RROOT = 0;

  /**
   * The feature id for the '<em><b>Behaviour</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RROOT__BEHAVIOUR = 0;

  /**
   * The feature id for the '<em><b>Syntaxes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RROOT__SYNTAXES = 1;

  /**
   * The feature id for the '<em><b>Semantics</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RROOT__SEMANTICS = 2;

  /**
   * The feature id for the '<em><b>Services</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RROOT__SERVICES = 3;

  /**
   * The feature id for the '<em><b>Xtended Classes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RROOT__XTENDED_CLASSES = 4;

  /**
   * The number of structural features of the '<em>rRoot</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RROOT_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ImportSyntaxImpl <em>Import Syntax</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ImportSyntaxImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getImportSyntax()
   * @generated
   */
  int IMPORT_SYNTAX = 1;

  /**
   * The feature id for the '<em><b>Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_SYNTAX__URI = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_SYNTAX__NAME = 1;

  /**
   * The number of structural features of the '<em>Import Syntax</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_SYNTAX_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.rClassImpl <em>rClass</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.rClassImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getrClass()
   * @generated
   */
  int RCLASS = 2;

  /**
   * The feature id for the '<em><b>Syntax</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RCLASS__SYNTAX = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RCLASS__NAME = 1;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RCLASS__ATTRIBUTES = 2;

  /**
   * The feature id for the '<em><b>Operations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RCLASS__OPERATIONS = 3;

  /**
   * The number of structural features of the '<em>rClass</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RCLASS_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.rOperationImpl <em>rOperation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.rOperationImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getrOperation()
   * @generated
   */
  int ROPERATION = 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROPERATION__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROPERATION__NAME = 1;

  /**
   * The feature id for the '<em><b>Param List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROPERATION__PARAM_LIST = 2;

  /**
   * The feature id for the '<em><b>Body</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROPERATION__BODY = 3;

  /**
   * The number of structural features of the '<em>rOperation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROPERATION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.rParametersImpl <em>rParameters</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.rParametersImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getrParameters()
   * @generated
   */
  int RPARAMETERS = 4;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RPARAMETERS__PARAMS = 0;

  /**
   * The number of structural features of the '<em>rParameters</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RPARAMETERS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.rVariableImpl <em>rVariable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.rVariableImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getrVariable()
   * @generated
   */
  int RVARIABLE = 5;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RVARIABLE__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RVARIABLE__NAME = 1;

  /**
   * The number of structural features of the '<em>rVariable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RVARIABLE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.rAttributeImpl <em>rAttribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.rAttributeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getrAttribute()
   * @generated
   */
  int RATTRIBUTE = 6;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RATTRIBUTE__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RATTRIBUTE__NAME = 1;

  /**
   * The number of structural features of the '<em>rAttribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RATTRIBUTE_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.rRoot <em>rRoot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>rRoot</em>'.
   * @see org.xtext.example.mydsl.myDsl.rRoot
   * @generated
   */
  EClass getrRoot();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.rRoot#getBehaviour <em>Behaviour</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Behaviour</em>'.
   * @see org.xtext.example.mydsl.myDsl.rRoot#getBehaviour()
   * @see #getrRoot()
   * @generated
   */
  EAttribute getrRoot_Behaviour();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.rRoot#getSyntaxes <em>Syntaxes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Syntaxes</em>'.
   * @see org.xtext.example.mydsl.myDsl.rRoot#getSyntaxes()
   * @see #getrRoot()
   * @generated
   */
  EReference getrRoot_Syntaxes();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.mydsl.myDsl.rRoot#getSemantics <em>Semantics</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Semantics</em>'.
   * @see org.xtext.example.mydsl.myDsl.rRoot#getSemantics()
   * @see #getrRoot()
   * @generated
   */
  EAttribute getrRoot_Semantics();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.mydsl.myDsl.rRoot#getServices <em>Services</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Services</em>'.
   * @see org.xtext.example.mydsl.myDsl.rRoot#getServices()
   * @see #getrRoot()
   * @generated
   */
  EAttribute getrRoot_Services();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.rRoot#getXtendedClasses <em>Xtended Classes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Xtended Classes</em>'.
   * @see org.xtext.example.mydsl.myDsl.rRoot#getXtendedClasses()
   * @see #getrRoot()
   * @generated
   */
  EReference getrRoot_XtendedClasses();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.ImportSyntax <em>Import Syntax</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import Syntax</em>'.
   * @see org.xtext.example.mydsl.myDsl.ImportSyntax
   * @generated
   */
  EClass getImportSyntax();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.ImportSyntax#getUri <em>Uri</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uri</em>'.
   * @see org.xtext.example.mydsl.myDsl.ImportSyntax#getUri()
   * @see #getImportSyntax()
   * @generated
   */
  EAttribute getImportSyntax_Uri();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.ImportSyntax#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.ImportSyntax#getName()
   * @see #getImportSyntax()
   * @generated
   */
  EAttribute getImportSyntax_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.rClass <em>rClass</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>rClass</em>'.
   * @see org.xtext.example.mydsl.myDsl.rClass
   * @generated
   */
  EClass getrClass();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl.myDsl.rClass#getSyntax <em>Syntax</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Syntax</em>'.
   * @see org.xtext.example.mydsl.myDsl.rClass#getSyntax()
   * @see #getrClass()
   * @generated
   */
  EReference getrClass_Syntax();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.rClass#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.rClass#getName()
   * @see #getrClass()
   * @generated
   */
  EAttribute getrClass_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.rClass#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see org.xtext.example.mydsl.myDsl.rClass#getAttributes()
   * @see #getrClass()
   * @generated
   */
  EReference getrClass_Attributes();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.rClass#getOperations <em>Operations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operations</em>'.
   * @see org.xtext.example.mydsl.myDsl.rClass#getOperations()
   * @see #getrClass()
   * @generated
   */
  EReference getrClass_Operations();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.rOperation <em>rOperation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>rOperation</em>'.
   * @see org.xtext.example.mydsl.myDsl.rOperation
   * @generated
   */
  EClass getrOperation();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.rOperation#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.rOperation#getType()
   * @see #getrOperation()
   * @generated
   */
  EAttribute getrOperation_Type();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.rOperation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.rOperation#getName()
   * @see #getrOperation()
   * @generated
   */
  EAttribute getrOperation_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.rOperation#getParamList <em>Param List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Param List</em>'.
   * @see org.xtext.example.mydsl.myDsl.rOperation#getParamList()
   * @see #getrOperation()
   * @generated
   */
  EReference getrOperation_ParamList();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.rOperation#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Body</em>'.
   * @see org.xtext.example.mydsl.myDsl.rOperation#getBody()
   * @see #getrOperation()
   * @generated
   */
  EAttribute getrOperation_Body();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.rParameters <em>rParameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>rParameters</em>'.
   * @see org.xtext.example.mydsl.myDsl.rParameters
   * @generated
   */
  EClass getrParameters();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.rParameters#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see org.xtext.example.mydsl.myDsl.rParameters#getParams()
   * @see #getrParameters()
   * @generated
   */
  EReference getrParameters_Params();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.rVariable <em>rVariable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>rVariable</em>'.
   * @see org.xtext.example.mydsl.myDsl.rVariable
   * @generated
   */
  EClass getrVariable();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.rVariable#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.rVariable#getType()
   * @see #getrVariable()
   * @generated
   */
  EAttribute getrVariable_Type();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.rVariable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.rVariable#getName()
   * @see #getrVariable()
   * @generated
   */
  EAttribute getrVariable_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.rAttribute <em>rAttribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>rAttribute</em>'.
   * @see org.xtext.example.mydsl.myDsl.rAttribute
   * @generated
   */
  EClass getrAttribute();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.rAttribute#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.rAttribute#getType()
   * @see #getrAttribute()
   * @generated
   */
  EAttribute getrAttribute_Type();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.rAttribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.rAttribute#getName()
   * @see #getrAttribute()
   * @generated
   */
  EAttribute getrAttribute_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MyDslFactory getMyDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.rRootImpl <em>rRoot</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.rRootImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getrRoot()
     * @generated
     */
    EClass RROOT = eINSTANCE.getrRoot();

    /**
     * The meta object literal for the '<em><b>Behaviour</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RROOT__BEHAVIOUR = eINSTANCE.getrRoot_Behaviour();

    /**
     * The meta object literal for the '<em><b>Syntaxes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RROOT__SYNTAXES = eINSTANCE.getrRoot_Syntaxes();

    /**
     * The meta object literal for the '<em><b>Semantics</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RROOT__SEMANTICS = eINSTANCE.getrRoot_Semantics();

    /**
     * The meta object literal for the '<em><b>Services</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RROOT__SERVICES = eINSTANCE.getrRoot_Services();

    /**
     * The meta object literal for the '<em><b>Xtended Classes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RROOT__XTENDED_CLASSES = eINSTANCE.getrRoot_XtendedClasses();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ImportSyntaxImpl <em>Import Syntax</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ImportSyntaxImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getImportSyntax()
     * @generated
     */
    EClass IMPORT_SYNTAX = eINSTANCE.getImportSyntax();

    /**
     * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT_SYNTAX__URI = eINSTANCE.getImportSyntax_Uri();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT_SYNTAX__NAME = eINSTANCE.getImportSyntax_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.rClassImpl <em>rClass</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.rClassImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getrClass()
     * @generated
     */
    EClass RCLASS = eINSTANCE.getrClass();

    /**
     * The meta object literal for the '<em><b>Syntax</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RCLASS__SYNTAX = eINSTANCE.getrClass_Syntax();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RCLASS__NAME = eINSTANCE.getrClass_Name();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RCLASS__ATTRIBUTES = eINSTANCE.getrClass_Attributes();

    /**
     * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RCLASS__OPERATIONS = eINSTANCE.getrClass_Operations();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.rOperationImpl <em>rOperation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.rOperationImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getrOperation()
     * @generated
     */
    EClass ROPERATION = eINSTANCE.getrOperation();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROPERATION__TYPE = eINSTANCE.getrOperation_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROPERATION__NAME = eINSTANCE.getrOperation_Name();

    /**
     * The meta object literal for the '<em><b>Param List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROPERATION__PARAM_LIST = eINSTANCE.getrOperation_ParamList();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROPERATION__BODY = eINSTANCE.getrOperation_Body();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.rParametersImpl <em>rParameters</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.rParametersImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getrParameters()
     * @generated
     */
    EClass RPARAMETERS = eINSTANCE.getrParameters();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RPARAMETERS__PARAMS = eINSTANCE.getrParameters_Params();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.rVariableImpl <em>rVariable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.rVariableImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getrVariable()
     * @generated
     */
    EClass RVARIABLE = eINSTANCE.getrVariable();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RVARIABLE__TYPE = eINSTANCE.getrVariable_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RVARIABLE__NAME = eINSTANCE.getrVariable_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.rAttributeImpl <em>rAttribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.rAttributeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getrAttribute()
     * @generated
     */
    EClass RATTRIBUTE = eINSTANCE.getrAttribute();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RATTRIBUTE__TYPE = eINSTANCE.getrAttribute_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RATTRIBUTE__NAME = eINSTANCE.getrAttribute_Name();

  }

} //MyDslPackage
