/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Mar 21 03:28:28 GMT 2024
 */

package org.objectweb.asm.jip;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class MethodWriter_Original_ESTest_scaffolding {

  @org.junit.jupiter.api.extension.RegisterExtension
  public org.evosuite.runtime.vnet.NonFunctionalRequirementExtension nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementExtension();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeAll
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.objectweb.asm.jip.MethodWriter"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(MethodWriter_Original_ESTest_scaffolding.class.getClassLoader() ,
      "org.objectweb.asm.jip.Attribute",
      "org.objectweb.asm.jip.Edge",
      "org.objectweb.asm.jip.FieldWriter",
      "org.objectweb.asm.jip.ClassWriter",
      "org.objectweb.asm.jip.ClassVisitor",
      "org.objectweb.asm.jip.Frame",
      "org.objectweb.asm.jip.AnnotationWriter",
      "org.objectweb.asm.jip.Label",
      "org.objectweb.asm.jip.MethodWriter",
      "org.objectweb.asm.jip.FieldVisitor",
      "org.objectweb.asm.jip.ByteVector",
      "org.objectweb.asm.jip.Item",
      "org.objectweb.asm.jip.Type",
      "org.objectweb.asm.jip.Handler",
      "org.objectweb.asm.jip.AnnotationVisitor",
      "org.objectweb.asm.jip.MethodVisitor",
      "org.objectweb.asm.jip.ClassReader"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(MethodWriter_Original_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.objectweb.asm.jip.MethodWriter",
      "org.objectweb.asm.jip.Type",
      "org.objectweb.asm.jip.Frame",
      "org.objectweb.asm.jip.ClassWriter",
      "org.objectweb.asm.jip.ByteVector",
      "org.objectweb.asm.jip.Item",
      "org.objectweb.asm.jip.Edge",
      "org.objectweb.asm.jip.ClassReader",
      "org.objectweb.asm.jip.FieldWriter",
      "org.objectweb.asm.jip.Attribute",
      "org.objectweb.asm.jip.AnnotationWriter",
      "org.objectweb.asm.jip.Label",
      "org.objectweb.asm.jip.Handler"
    );
  }
}
