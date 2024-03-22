/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Mar 18 01:52:51 GMT 2024
 */

package com.yahoo.platform.yui.compressor;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class YUICompressor_ESTest_scaffolding {

  @org.junit.jupiter.api.extension.RegisterExtension
  public org.evosuite.runtime.vnet.NonFunctionalRequirementExtension nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementExtension();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeAll
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.yahoo.platform.yui.compressor.YUICompressor"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(YUICompressor_ESTest_scaffolding.class.getClassLoader() ,
      "jargs.gnu.CmdLineParser$UnknownOptionException",
      "jargs.gnu.CmdLineParser$Option$IntegerOption",
      "jargs.gnu.CmdLineParser$Option$DoubleOption",
      "org.mozilla.javascript.EvaluatorException",
      "jargs.gnu.CmdLineParser$UnknownSuboptionException",
      "jargs.gnu.CmdLineParser",
      "jargs.gnu.CmdLineParser$IllegalOptionValueException",
      "org.mozilla.javascript.RhinoException",
      "jargs.gnu.CmdLineParser$Option$BooleanOption",
      "org.mozilla.javascript.ErrorReporter",
      "jargs.gnu.CmdLineParser$OptionException",
      "jargs.gnu.CmdLineParser$Option$StringOption",
      "com.yahoo.platform.yui.compressor.YUICompressor",
      "jargs.gnu.CmdLineParser$Option",
      "jargs.gnu.CmdLineParser$NotFlagException",
      "jargs.gnu.CmdLineParser$Option$LongOption"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(YUICompressor_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.yahoo.platform.yui.compressor.YUICompressor",
      "com.yahoo.platform.yui.compressor.YUICompressor$1",
      "jargs.gnu.CmdLineParser",
      "jargs.gnu.CmdLineParser$Option",
      "jargs.gnu.CmdLineParser$Option$StringOption",
      "jargs.gnu.CmdLineParser$Option$BooleanOption",
      "jargs.gnu.CmdLineParser$OptionException",
      "jargs.gnu.CmdLineParser$UnknownOptionException",
      "jargs.gnu.CmdLineParser$UnknownSuboptionException",
      "jargs.gnu.CmdLineParser$NotFlagException"
    );
  }
}
