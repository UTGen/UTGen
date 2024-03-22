/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Mar 19 15:51:18 GMT 2024
 */

package com.google.common.base;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Suppliers_ESTest_scaffolding {

  @org.junit.jupiter.api.extension.RegisterExtension
  public org.evosuite.runtime.vnet.NonFunctionalRequirementExtension nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementExtension();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeAll
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.google.common.base.Suppliers"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Suppliers_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.common.base.Function",
      "com.google.common.base.Converter$ConverterComposition",
      "com.google.common.base.Suppliers$SupplierOfInstance",
      "com.google.common.base.Converter$IdentityConverter",
      "com.google.common.base.Supplier",
      "com.google.common.base.Suppliers$SupplierFunctionImpl",
      "com.google.common.base.Converter$FunctionBasedConverter",
      "com.google.common.base.Suppliers$SupplierFunction",
      "com.google.common.base.Suppliers$MemoizingSupplier",
      "com.google.common.base.Suppliers$ThreadSafeSupplier",
      "com.google.common.base.Platform",
      "com.google.common.base.Converter$ReverseConverter",
      "com.google.common.base.Suppliers$ExpiringMemoizingSupplier",
      "com.google.common.base.Suppliers",
      "com.google.common.base.Preconditions",
      "com.google.common.base.Converter",
      "com.google.common.base.Suppliers$SupplierComposition"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Suppliers_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.google.common.base.Suppliers",
      "com.google.common.base.Suppliers$SupplierComposition",
      "com.google.common.base.Suppliers$MemoizingSupplier",
      "com.google.common.base.Suppliers$ExpiringMemoizingSupplier",
      "com.google.common.base.Suppliers$SupplierOfInstance",
      "com.google.common.base.Suppliers$ThreadSafeSupplier",
      "com.google.common.base.Suppliers$SupplierFunctionImpl",
      "com.google.common.base.Converter",
      "com.google.common.base.Converter$IdentityConverter",
      "com.google.common.base.Converter$FunctionBasedConverter",
      "com.google.common.base.Preconditions",
      "com.google.common.base.Converter$ReverseConverter",
      "com.google.common.base.Converter$ConverterComposition",
      "com.google.common.base.Converter$1",
      "com.google.common.base.Platform"
    );
  }
}
