/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Mar 21 10:39:48 GMT 2024
 */

package org.jcvi.jillion.assembly.consed.phd;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class DefaultPhdReadTag_ESTest_scaffolding {

  @org.junit.jupiter.api.extension.RegisterExtension
  public org.evosuite.runtime.vnet.NonFunctionalRequirementExtension nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementExtension();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeAll
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.jcvi.jillion.assembly.consed.phd.DefaultPhdReadTag"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(DefaultPhdReadTag_ESTest_scaffolding.class.getClassLoader() ,
      "org.jcvi.jillion.core.Range$EmptyIntRange",
      "org.jcvi.jillion.core.Range$ByteRange",
      "org.jcvi.jillion.core.Range$ShortRange",
      "org.jcvi.jillion.core.Range$Builder",
      "org.jcvi.jillion.core.io.IOUtil",
      "org.jcvi.jillion.internal.core.util.Caches$AbstractReferencedCache",
      "org.jcvi.jillion.internal.core.util.Caches$SoftReferenceCache",
      "org.jcvi.jillion.core.Range",
      "org.jcvi.jillion.core.Rangeable",
      "org.jcvi.jillion.core.Range$EmptyByteRange",
      "org.jcvi.jillion.core.Range$UnsignedByteStartShortLengthRange",
      "org.jcvi.jillion.core.Range$1",
      "org.jcvi.jillion.core.Range$RangeIterator",
      "org.jcvi.jillion.core.util.MapUtil",
      "org.jcvi.jillion.core.Range$UnsignedByteStartIntLengthRange",
      "org.jcvi.jillion.internal.core.io.RandomAccessFileInputStream",
      "org.jcvi.jillion.core.Range$UnsignedShortStartIntLengthRange",
      "org.jcvi.jillion.core.Range$EmptyShortRange",
      "org.jcvi.jillion.core.Range$CoordinateSystem",
      "org.jcvi.jillion.core.Range$UnsignedIntStartLongLengthRange",
      "org.jcvi.jillion.core.Range$LongRange",
      "org.jcvi.jillion.core.Range$LongStartIntLengthRange",
      "org.jcvi.jillion.core.Range$UnsignedIntStartIntLengthRange",
      "org.jcvi.jillion.core.Range$IntRange",
      "org.jcvi.jillion.assembly.consed.phd.DefaultPhdReadTag",
      "org.jcvi.jillion.core.Range$UnsignedByteStartLongLengthRange",
      "org.jcvi.jillion.core.Range$UnsignedShortStartShortLengthRange",
      "org.jcvi.jillion.assembly.consed.phd.PhdReadTag",
      "org.jcvi.jillion.core.Range$EmptyLongRange",
      "org.jcvi.jillion.internal.core.util.Caches",
      "org.jcvi.jillion.core.Range$UnsignedShortStartLongLengthRange"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(DefaultPhdReadTag_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jcvi.jillion.assembly.consed.phd.DefaultPhdReadTag",
      "org.jcvi.jillion.internal.core.util.Caches",
      "org.jcvi.jillion.internal.core.util.Caches$AbstractReferencedCache",
      "org.jcvi.jillion.internal.core.util.Caches$SoftReferenceCache",
      "org.jcvi.jillion.core.util.MapUtil",
      "org.jcvi.jillion.core.Range",
      "org.jcvi.jillion.core.Range$Builder",
      "org.jcvi.jillion.core.Range$UnsignedByteStartShortLengthRange",
      "org.jcvi.jillion.core.io.IOUtil",
      "org.jcvi.jillion.core.Range$UnsignedShortStartShortLengthRange",
      "org.jcvi.jillion.core.Range$ByteRange",
      "org.jcvi.jillion.core.Range$UnsignedIntStartIntLengthRange",
      "org.jcvi.jillion.core.Range$ShortRange",
      "org.jcvi.jillion.core.Range$RangeIterator",
      "org.jcvi.jillion.core.Range$IntRange",
      "org.jcvi.jillion.core.Ranges",
      "org.jcvi.jillion.core.Range$Comparators",
      "org.jcvi.jillion.internal.core.util.JillionUtil",
      "org.jcvi.jillion.core.Range$EmptyIntRange",
      "org.jcvi.jillion.core.Range$EmptyByteRange",
      "org.jcvi.jillion.core.Range$UnsignedByteStartLongLengthRange",
      "org.jcvi.jillion.core.Range$UnsignedByteStartIntLengthRange",
      "org.jcvi.jillion.core.Range$LongRange",
      "org.jcvi.jillion.core.Range$EmptyLongRange",
      "org.jcvi.jillion.core.Range$EmptyShortRange",
      "org.jcvi.jillion.core.Range$LongStartIntLengthRange",
      "org.jcvi.jillion.core.Range$UnsignedShortStartLongLengthRange",
      "org.jcvi.jillion.core.Range$UnsignedShortStartIntLengthRange",
      "org.jcvi.jillion.core.Range$UnsignedIntStartLongLengthRange"
    );
  }
}
