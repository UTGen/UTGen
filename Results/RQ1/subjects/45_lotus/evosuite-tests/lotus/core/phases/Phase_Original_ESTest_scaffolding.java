/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Mar 21 01:51:16 GMT 2024
 */

package lotus.core.phases;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Phase_Original_ESTest_scaffolding {

  @org.junit.jupiter.api.extension.RegisterExtension
  public org.evosuite.runtime.vnet.NonFunctionalRequirementExtension nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementExtension();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeAll
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "lotus.core.phases.Phase"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Phase_Original_ESTest_scaffolding.class.getClassLoader() ,
      "lotus.core.CardCollection",
      "lotus.core.phases.DrawPhase",
      "lotus.core.effect.ChangeProperty",
      "lotus.core.phases.UntapPhase",
      "lotus.core.card.Card",
      "lotus.core.effect.ChangePhase",
      "lotus.core.phases.DeclareBlockersPhase",
      "lotus.core.phases.EndOfTurnPhase",
      "lotus.core.phases.PlayerChangePhase",
      "lotus.core.effect.Effect",
      "lotus.core.phases.Phase",
      "lotus.core.phases.CombatBeginningPhase",
      "lotus.core.phases.Main2Phase",
      "lotus.core.phases.CleanupPhase",
      "lotus.core.card.Creature",
      "lotus.core.Game",
      "lotus.core.stack.Stack",
      "lotus.core.Player",
      "lotus.core.phases.UpkeepPhase",
      "lotus.core.phases.DeclareAttackersPhase",
      "lotus.core.card.Permanent",
      "lotus.core.phases.CombatDamagePhase",
      "lotus.core.phases.Main1Phase",
      "lotus.core.phases.CombatEndPhase",
      "lotus.core.interfaces.UserInterface"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Phase_Original_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "lotus.core.phases.Phase",
      "lotus.core.stack.Stack",
      "lotus.core.Game",
      "lotus.core.phases.PlayerChangePhase",
      "lotus.core.phases.CombatEndPhase",
      "lotus.core.phases.CleanupPhase",
      "lotus.core.phases.UpkeepPhase",
      "lotus.core.phases.CombatBeginningPhase",
      "lotus.core.Combat",
      "lotus.core.phases.DeclareAttackersPhase",
      "lotus.core.phases.DeclareBlockersPhase",
      "lotus.core.phases.Main1Phase",
      "lotus.core.phases.Main2Phase",
      "lotus.core.phases.EndOfTurnPhase",
      "lotus.core.phases.UntapPhase",
      "lotus.core.phases.CombatDamagePhase",
      "lotus.core.phases.DrawPhase",
      "lotus.core.effect.Effect",
      "lotus.core.effect.DrawCard",
      "lotus.core.effect.ChangePhase"
    );
  }
}