/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Mar 18 08:35:17 GMT 2024
 */

package jigl.image.ops;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ConnectedComponents_ESTest_scaffolding {

  @org.junit.jupiter.api.extension.RegisterExtension
  public org.evosuite.runtime.vnet.NonFunctionalRequirementExtension nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementExtension();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeAll
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "jigl.image.ops.ConnectedComponents"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ConnectedComponents_ESTest_scaffolding.class.getClassLoader() ,
      "jigl.image.types.BinaryImage",
      "jigl.image.types.ComplexImage",
      "jigl.image.exceptions.ImageNotSupportedException",
      "jigl.image.ops.ConnectedComponents",
      "jigl.image.Image",
      "jigl.image.ArrayImage",
      "jigl.image.types.RealGrayImage",
      "jigl.image.types.RealColorImage",
      "jigl.image.ops.Operator",
      "jigl.image.types.ColorImage",
      "jigl.image.AbstractArrayImage",
      "jigl.image.types.GrayImage",
      "jigl.image.NumericImage",
      "jigl.image.exceptions.InvalidArgumentException",
      "jigl.image.ops.SimpleOperator",
      "jigl.image.AbstractImage",
      "jigl.image.ROI"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ConnectedComponents_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "jigl.image.ops.SimpleOperator",
      "jigl.image.ops.ConnectedComponents",
      "jigl.image.exceptions.InvalidArgumentException",
      "jigl.image.types.BinaryImage",
      "jigl.image.ROI",
      "jigl.image.AbstractImage",
      "jigl.image.AbstractArrayImage",
      "jigl.image.types.GrayImage",
      "jigl.image.exceptions.ImageNotSupportedException",
      "jigl.image.types.InterpolatedGrayImage",
      "jigl.image.types.RealGrayImage",
      "jigl.image.types.PhaseImage",
      "jigl.image.types.ImageKernel",
      "jigl.util.ArrayUtil",
      "jigl.image.types.ColorImage",
      "jigl.image.types.InterpolatedColorImage",
      "jigl.image.ColorModel",
      "jigl.image.types.ComplexImage",
      "jigl.image.types.MagnitudeImage",
      "jigl.image.types.InterpolatedRealGrayImage",
      "jigl.image.types.PowerImage",
      "jigl.internal.DummyObserver",
      "jigl.image.types.RealColorImage"
    );
  }
}
