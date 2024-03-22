/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Mar 20 12:22:26 GMT 2024
 */

package gnu.trove.decorator;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class TDoubleShortMapDecorator_ESTest_scaffolding {

  @org.junit.jupiter.api.extension.RegisterExtension
  public org.evosuite.runtime.vnet.NonFunctionalRequirementExtension nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementExtension();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeAll
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "gnu.trove.decorator.TDoubleShortMapDecorator"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(TDoubleShortMapDecorator_ESTest_scaffolding.class.getClassLoader() ,
      "gnu.trove.iterator.TAdvancingIterator",
      "gnu.trove.procedure.TDoubleShortProcedure",
      "gnu.trove.iterator.TPrimitiveIterator",
      "gnu.trove.impl.PrimeFinder",
      "gnu.trove.impl.hash.THashPrimitiveIterator",
      "gnu.trove.decorator.TDoubleShortMapDecorator",
      "gnu.trove.map.hash.TDoubleShortHashMap",
      "gnu.trove.set.TDoubleSet",
      "gnu.trove.decorator.TDoubleShortMapDecorator$1$1",
      "gnu.trove.procedure.TDoubleProcedure",
      "gnu.trove.function.TShortFunction",
      "gnu.trove.map.hash.TDoubleShortHashMap$TDoubleShortHashIterator",
      "gnu.trove.procedure.TShortProcedure",
      "gnu.trove.impl.hash.THash",
      "gnu.trove.TDoubleCollection",
      "gnu.trove.decorator.TDoubleShortMapDecorator$1$1$1",
      "gnu.trove.TShortCollection",
      "gnu.trove.impl.hash.TDoubleShortHash",
      "gnu.trove.impl.HashFunctions",
      "gnu.trove.map.hash.TDoubleShortHashMap$1",
      "gnu.trove.impl.hash.TPrimitiveHash",
      "gnu.trove.iterator.TIterator",
      "gnu.trove.iterator.TDoubleShortIterator",
      "gnu.trove.map.TDoubleShortMap",
      "gnu.trove.decorator.TDoubleShortMapDecorator$1"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(TDoubleShortMapDecorator_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "gnu.trove.decorator.TDoubleShortMapDecorator",
      "gnu.trove.decorator.TDoubleShortMapDecorator$1",
      "gnu.trove.impl.hash.THash",
      "gnu.trove.impl.hash.TPrimitiveHash",
      "gnu.trove.impl.hash.TDoubleShortHash",
      "gnu.trove.map.hash.TDoubleShortHashMap",
      "gnu.trove.impl.HashFunctions",
      "gnu.trove.impl.PrimeFinder",
      "gnu.trove.map.hash.TDoubleShortHashMap$TKeyView",
      "gnu.trove.impl.hash.THashPrimitiveIterator",
      "gnu.trove.map.hash.TDoubleShortHashMap$TDoubleShortHashIterator",
      "gnu.trove.decorator.TDoubleShortMapDecorator$1$1",
      "gnu.trove.decorator.TDoubleShortMapDecorator$1$1$1",
      "gnu.trove.map.hash.TDoubleShortHashMap$1",
      "gnu.trove.map.hash.TDoubleShortHashMap$TValueView"
    );
  }
}