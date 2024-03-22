/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Mar 21 11:14:12 GMT 2024
 */

package org.heal.util;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class InterfaceUtilitiesBean_Original_ESTest_scaffolding {

  @org.junit.jupiter.api.extension.RegisterExtension
  public org.evosuite.runtime.vnet.NonFunctionalRequirementExtension nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementExtension();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeAll
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.heal.util.InterfaceUtilitiesBean"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.OFF; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @BeforeEach
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @AfterEach
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    /*No java.lang.System property to set*/
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(InterfaceUtilitiesBean_Original_ESTest_scaffolding.class.getClassLoader() ,
      "org.heal.util.InterfaceUtilitiesBean",
      "org.heal.module.metadata.ThumbnailBean",
      "org.heal.module.user.UserBean",
      "com.ora.jsp.sql.UnsupportedTypeException",
      "com.ora.jsp.sql.Row",
      "com.ora.jsp.sql.NoSuchColumnException",
      "org.heal.util.FileLocator",
      "com.ora.jsp.sql.SQLCommandBean",
      "com.ora.jsp.sql.UnsupportedConversionException",
      "org.heal.module.user.UserRegistryBean",
      "org.heal.module.user.UserPermissionsBean"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(InterfaceUtilitiesBean_Original_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.heal.util.InterfaceUtilitiesBean",
      "org.heal.module.user.UserRegistryBean",
      "org.heal.util.FileLocator",
      "org.heal.module.metadata.ThumbnailBean",
      "org.heal.module.user.UserPermissionsBean",
      "org.heal.module.user.UserBean",
      "com.microsoft.jdbcx.base.BaseDataSource",
      "com.microsoft.jdbcx.base.BaseXADataSource",
      "com.microsoft.jdbc.base.BaseExceptions",
      "com.microsoft.jdbc.base.BaseClassUtility",
      "com.microsoft.jdbcx.base.BaseClassUtilityX",
      "com.microsoft.util.UtilLocalMessages",
      "com.microsoft.jdbc.base.BaseLocalMessages",
      "com.microsoft.jdbc.base.BaseMessages",
      "com.ora.jsp.sql.DataSourceWrapper",
      "com.ora.jsp.sql.ConnectionPool",
      "com.microsoft.jdbcx.sqlserver.SQLServerDataSource",
      "com.microsoft.jdbc.sqlserver.SQLServerLocalMessages",
      "com.microsoft.jdbc.base.BaseConnection",
      "com.microsoft.jdbc.sqlserver.SQLServerConnection",
      "com.microsoft.jdbc.base.BaseConnectionProperties",
      "com.microsoft.jdbc.base.BaseDriverPropertyInfos",
      "com.microsoft.jdbc.base.BaseURLParser",
      "com.microsoft.jdbc.base.BaseWarnings",
      "com.microsoft.jdbc.base.BaseConnectionPool",
      "com.microsoft.jdbc.base.BaseImplConnection",
      "com.microsoft.jdbc.sqlserver.SQLServerImplConnection",
      "com.microsoft.jdbc.sqlserver.tds.TDSConnection",
      "org.hsqldb.jdbcResultSet",
      "com.microsoft.jdbc.base.BaseImplStatement",
      "com.microsoft.jdbc.sqlserver.SQLServerImplStatement"
    );
  }
}