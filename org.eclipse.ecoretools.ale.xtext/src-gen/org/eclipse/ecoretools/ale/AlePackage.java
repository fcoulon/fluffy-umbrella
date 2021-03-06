/**
 * generated by Xtext 2.10.0
 */
package org.eclipse.ecoretools.ale;

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
 * @see org.eclipse.ecoretools.ale.AleFactory
 * @model kind="package"
 * @generated
 */
public interface AlePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "ale";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipse.org/ecoretools/Ale";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "ale";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AlePackage eINSTANCE = org.eclipse.ecoretools.ale.impl.AlePackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.ecoretools.ale.impl.rRootImpl <em>rRoot</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.ecoretools.ale.impl.rRootImpl
   * @see org.eclipse.ecoretools.ale.impl.AlePackageImpl#getrRoot()
   * @generated
   */
  int RROOT = 0;

  /**
   * The feature id for the '<em><b>Xtended Classes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RROOT__XTENDED_CLASSES = 0;

  /**
   * The number of structural features of the '<em>rRoot</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RROOT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.ecoretools.ale.impl.rClassImpl <em>rClass</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.ecoretools.ale.impl.rClassImpl
   * @see org.eclipse.ecoretools.ale.impl.AlePackageImpl#getrClass()
   * @generated
   */
  int RCLASS = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RCLASS__NAME = 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RCLASS__ATTRIBUTES = 1;

  /**
   * The feature id for the '<em><b>Operations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RCLASS__OPERATIONS = 2;

  /**
   * The number of structural features of the '<em>rClass</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RCLASS_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.ecoretools.ale.impl.rOpenClassImpl <em>rOpen Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.ecoretools.ale.impl.rOpenClassImpl
   * @see org.eclipse.ecoretools.ale.impl.AlePackageImpl#getrOpenClass()
   * @generated
   */
  int ROPEN_CLASS = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROPEN_CLASS__NAME = RCLASS__NAME;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROPEN_CLASS__ATTRIBUTES = RCLASS__ATTRIBUTES;

  /**
   * The feature id for the '<em><b>Operations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROPEN_CLASS__OPERATIONS = RCLASS__OPERATIONS;

  /**
   * The number of structural features of the '<em>rOpen Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROPEN_CLASS_FEATURE_COUNT = RCLASS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.ecoretools.ale.impl.rNewClassImpl <em>rNew Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.ecoretools.ale.impl.rNewClassImpl
   * @see org.eclipse.ecoretools.ale.impl.AlePackageImpl#getrNewClass()
   * @generated
   */
  int RNEW_CLASS = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RNEW_CLASS__NAME = RCLASS__NAME;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RNEW_CLASS__ATTRIBUTES = RCLASS__ATTRIBUTES;

  /**
   * The feature id for the '<em><b>Operations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RNEW_CLASS__OPERATIONS = RCLASS__OPERATIONS;

  /**
   * The number of structural features of the '<em>rNew Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RNEW_CLASS_FEATURE_COUNT = RCLASS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.ecoretools.ale.impl.rOperationImpl <em>rOperation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.ecoretools.ale.impl.rOperationImpl
   * @see org.eclipse.ecoretools.ale.impl.AlePackageImpl#getrOperation()
   * @generated
   */
  int ROPERATION = 4;

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
   * The meta object id for the '{@link org.eclipse.ecoretools.ale.impl.rParametersImpl <em>rParameters</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.ecoretools.ale.impl.rParametersImpl
   * @see org.eclipse.ecoretools.ale.impl.AlePackageImpl#getrParameters()
   * @generated
   */
  int RPARAMETERS = 5;

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
   * The meta object id for the '{@link org.eclipse.ecoretools.ale.impl.rVariableImpl <em>rVariable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.ecoretools.ale.impl.rVariableImpl
   * @see org.eclipse.ecoretools.ale.impl.AlePackageImpl#getrVariable()
   * @generated
   */
  int RVARIABLE = 6;

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
   * The meta object id for the '{@link org.eclipse.ecoretools.ale.impl.rAttributeImpl <em>rAttribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.ecoretools.ale.impl.rAttributeImpl
   * @see org.eclipse.ecoretools.ale.impl.AlePackageImpl#getrAttribute()
   * @generated
   */
  int RATTRIBUTE = 7;

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
   * Returns the meta object for class '{@link org.eclipse.ecoretools.ale.rRoot <em>rRoot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>rRoot</em>'.
   * @see org.eclipse.ecoretools.ale.rRoot
   * @generated
   */
  EClass getrRoot();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.ecoretools.ale.rRoot#getXtendedClasses <em>Xtended Classes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Xtended Classes</em>'.
   * @see org.eclipse.ecoretools.ale.rRoot#getXtendedClasses()
   * @see #getrRoot()
   * @generated
   */
  EReference getrRoot_XtendedClasses();

  /**
   * Returns the meta object for class '{@link org.eclipse.ecoretools.ale.rClass <em>rClass</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>rClass</em>'.
   * @see org.eclipse.ecoretools.ale.rClass
   * @generated
   */
  EClass getrClass();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.ecoretools.ale.rClass#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.ecoretools.ale.rClass#getName()
   * @see #getrClass()
   * @generated
   */
  EAttribute getrClass_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.ecoretools.ale.rClass#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see org.eclipse.ecoretools.ale.rClass#getAttributes()
   * @see #getrClass()
   * @generated
   */
  EReference getrClass_Attributes();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.ecoretools.ale.rClass#getOperations <em>Operations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operations</em>'.
   * @see org.eclipse.ecoretools.ale.rClass#getOperations()
   * @see #getrClass()
   * @generated
   */
  EReference getrClass_Operations();

  /**
   * Returns the meta object for class '{@link org.eclipse.ecoretools.ale.rOpenClass <em>rOpen Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>rOpen Class</em>'.
   * @see org.eclipse.ecoretools.ale.rOpenClass
   * @generated
   */
  EClass getrOpenClass();

  /**
   * Returns the meta object for class '{@link org.eclipse.ecoretools.ale.rNewClass <em>rNew Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>rNew Class</em>'.
   * @see org.eclipse.ecoretools.ale.rNewClass
   * @generated
   */
  EClass getrNewClass();

  /**
   * Returns the meta object for class '{@link org.eclipse.ecoretools.ale.rOperation <em>rOperation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>rOperation</em>'.
   * @see org.eclipse.ecoretools.ale.rOperation
   * @generated
   */
  EClass getrOperation();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.ecoretools.ale.rOperation#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.eclipse.ecoretools.ale.rOperation#getType()
   * @see #getrOperation()
   * @generated
   */
  EAttribute getrOperation_Type();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.ecoretools.ale.rOperation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.ecoretools.ale.rOperation#getName()
   * @see #getrOperation()
   * @generated
   */
  EAttribute getrOperation_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.ecoretools.ale.rOperation#getParamList <em>Param List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Param List</em>'.
   * @see org.eclipse.ecoretools.ale.rOperation#getParamList()
   * @see #getrOperation()
   * @generated
   */
  EReference getrOperation_ParamList();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.ecoretools.ale.rOperation#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Body</em>'.
   * @see org.eclipse.ecoretools.ale.rOperation#getBody()
   * @see #getrOperation()
   * @generated
   */
  EAttribute getrOperation_Body();

  /**
   * Returns the meta object for class '{@link org.eclipse.ecoretools.ale.rParameters <em>rParameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>rParameters</em>'.
   * @see org.eclipse.ecoretools.ale.rParameters
   * @generated
   */
  EClass getrParameters();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.ecoretools.ale.rParameters#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see org.eclipse.ecoretools.ale.rParameters#getParams()
   * @see #getrParameters()
   * @generated
   */
  EReference getrParameters_Params();

  /**
   * Returns the meta object for class '{@link org.eclipse.ecoretools.ale.rVariable <em>rVariable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>rVariable</em>'.
   * @see org.eclipse.ecoretools.ale.rVariable
   * @generated
   */
  EClass getrVariable();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.ecoretools.ale.rVariable#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.eclipse.ecoretools.ale.rVariable#getType()
   * @see #getrVariable()
   * @generated
   */
  EAttribute getrVariable_Type();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.ecoretools.ale.rVariable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.ecoretools.ale.rVariable#getName()
   * @see #getrVariable()
   * @generated
   */
  EAttribute getrVariable_Name();

  /**
   * Returns the meta object for class '{@link org.eclipse.ecoretools.ale.rAttribute <em>rAttribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>rAttribute</em>'.
   * @see org.eclipse.ecoretools.ale.rAttribute
   * @generated
   */
  EClass getrAttribute();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.ecoretools.ale.rAttribute#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.eclipse.ecoretools.ale.rAttribute#getType()
   * @see #getrAttribute()
   * @generated
   */
  EAttribute getrAttribute_Type();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.ecoretools.ale.rAttribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.ecoretools.ale.rAttribute#getName()
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
  AleFactory getAleFactory();

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
     * The meta object literal for the '{@link org.eclipse.ecoretools.ale.impl.rRootImpl <em>rRoot</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.ecoretools.ale.impl.rRootImpl
     * @see org.eclipse.ecoretools.ale.impl.AlePackageImpl#getrRoot()
     * @generated
     */
    EClass RROOT = eINSTANCE.getrRoot();

    /**
     * The meta object literal for the '<em><b>Xtended Classes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RROOT__XTENDED_CLASSES = eINSTANCE.getrRoot_XtendedClasses();

    /**
     * The meta object literal for the '{@link org.eclipse.ecoretools.ale.impl.rClassImpl <em>rClass</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.ecoretools.ale.impl.rClassImpl
     * @see org.eclipse.ecoretools.ale.impl.AlePackageImpl#getrClass()
     * @generated
     */
    EClass RCLASS = eINSTANCE.getrClass();

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
     * The meta object literal for the '{@link org.eclipse.ecoretools.ale.impl.rOpenClassImpl <em>rOpen Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.ecoretools.ale.impl.rOpenClassImpl
     * @see org.eclipse.ecoretools.ale.impl.AlePackageImpl#getrOpenClass()
     * @generated
     */
    EClass ROPEN_CLASS = eINSTANCE.getrOpenClass();

    /**
     * The meta object literal for the '{@link org.eclipse.ecoretools.ale.impl.rNewClassImpl <em>rNew Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.ecoretools.ale.impl.rNewClassImpl
     * @see org.eclipse.ecoretools.ale.impl.AlePackageImpl#getrNewClass()
     * @generated
     */
    EClass RNEW_CLASS = eINSTANCE.getrNewClass();

    /**
     * The meta object literal for the '{@link org.eclipse.ecoretools.ale.impl.rOperationImpl <em>rOperation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.ecoretools.ale.impl.rOperationImpl
     * @see org.eclipse.ecoretools.ale.impl.AlePackageImpl#getrOperation()
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
     * The meta object literal for the '{@link org.eclipse.ecoretools.ale.impl.rParametersImpl <em>rParameters</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.ecoretools.ale.impl.rParametersImpl
     * @see org.eclipse.ecoretools.ale.impl.AlePackageImpl#getrParameters()
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
     * The meta object literal for the '{@link org.eclipse.ecoretools.ale.impl.rVariableImpl <em>rVariable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.ecoretools.ale.impl.rVariableImpl
     * @see org.eclipse.ecoretools.ale.impl.AlePackageImpl#getrVariable()
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
     * The meta object literal for the '{@link org.eclipse.ecoretools.ale.impl.rAttributeImpl <em>rAttribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.ecoretools.ale.impl.rAttributeImpl
     * @see org.eclipse.ecoretools.ale.impl.AlePackageImpl#getrAttribute()
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

} //AlePackage
