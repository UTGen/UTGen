/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Mar 21 07:10:12 GMT 2024
 */

package de.outstare.fortbattleplayer.statistics;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class BattleStatistics_ESTest_scaffolding {

  @org.junit.jupiter.api.extension.RegisterExtension
  public org.evosuite.runtime.vnet.NonFunctionalRequirementExtension nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementExtension();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeAll
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "de.outstare.fortbattleplayer.statistics.BattleStatistics"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(BattleStatistics_ESTest_scaffolding.class.getClassLoader() ,
      "de.outstare.fortbattleplayer.model.impl.SimpleCombatant",
      "de.outstare.fortbattleplayer.statistics.DynamicStatistics",
      "de.outstare.fortbattleplayer.statistics.WeaponModCounter$GraphitLubricantCounter",
      "de.outstare.fortbattleplayer.statistics.WeaponModCounter$FettesOilCounter",
      "de.outstare.fortbattleplayer.model.SectorBonus$BonusType",
      "de.outstare.fortbattleplayer.model.WeaponModification",
      "de.outstare.fortbattleplayer.statistics.AllCombatantSidesCounter",
      "de.outstare.fortbattleplayer.statistics.WeaponModCounter$LoadingchamberOrEnhancedPatronsCounter",
      "de.outstare.fortbattleplayer.model.impl.SimpleSector",
      "de.outstare.fortbattleplayer.statistics.WeaponModCounter$HipFlaskCounter",
      "de.outstare.fortbattleplayer.statistics.WeaponModCounter$SchmierOilCounter",
      "de.outstare.fortbattleplayer.model.Area",
      "de.outstare.fortbattleplayer.statistics.BattleStatistics",
      "de.outstare.fortbattleplayer.statistics.WeaponModCounter$ShinyOilCounter",
      "de.outstare.fortbattleplayer.model.WeaponData",
      "de.outstare.fortbattleplayer.model.CharacterClass",
      "de.outstare.fortbattleplayer.statistics.LabeledData",
      "de.outstare.fortbattleplayer.model.CombatantObserver",
      "de.outstare.fortbattleplayer.statistics.WeaponModCounter",
      "de.outstare.fortbattleplayer.model.impl.JSWeaponData$WeaponGameData",
      "de.outstare.fortbattleplayer.statistics.BattleStatistics$1",
      "de.outstare.fortbattleplayer.statistics.CriticalHit",
      "de.outstare.fortbattleplayer.model.impl.SimpleWeapon$1",
      "de.outstare.fortbattleplayer.statistics.AreaStatistic",
      "de.outstare.fortbattleplayer.statistics.OnlineCounter",
      "de.outstare.fortbattleplayer.model.CombatantSide",
      "de.outstare.fortbattleplayer.model.SectorBonus",
      "de.outstare.fortbattleplayer.model.impl.SimpleWeapon",
      "de.outstare.fortbattleplayer.statistics.PositionSwitch",
      "de.outstare.fortbattleplayer.model.impl.JSWeaponData",
      "de.outstare.fortbattleplayer.statistics.WeaponModCounter$BayonetCounter",
      "de.outstare.fortbattleplayer.statistics.RoundStatistics",
      "de.outstare.fortbattleplayer.statistics.Counter",
      "de.outstare.fortbattleplayer.model.impl.SimpleArea",
      "de.outstare.fortbattleplayer.model.Weapon",
      "de.outstare.fortbattleplayer.model.SectorObserver",
      "de.outstare.fortbattleplayer.model.Combatant",
      "de.outstare.fortbattleplayer.model.Sector",
      "de.outstare.fortbattleplayer.model.CombatantState"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(BattleStatistics_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "de.outstare.fortbattleplayer.statistics.BattleStatistics",
      "de.outstare.fortbattleplayer.model.CombatantSide",
      "de.outstare.fortbattleplayer.statistics.BattleStatistics$1",
      "de.outstare.fortbattleplayer.statistics.AllCombatantSidesCounter",
      "de.outstare.fortbattleplayer.statistics.Counter",
      "de.outstare.fortbattleplayer.statistics.RoundStatistics",
      "de.outstare.fortbattleplayer.model.impl.SimpleSector",
      "de.outstare.fortbattleplayer.model.impl.SimpleArea",
      "de.outstare.fortbattleplayer.statistics.CriticalHit",
      "de.outstare.fortbattleplayer.model.impl.SimpleWeapon",
      "de.outstare.fortbattleplayer.statistics.OnlineCounter",
      "de.outstare.fortbattleplayer.model.CombatantState",
      "de.outstare.fortbattleplayer.model.impl.JSWeaponData$WeaponGameData",
      "de.outstare.fortbattleplayer.model.impl.JSWeaponData",
      "de.outstare.fortbattleplayer.statistics.WeaponModCounter",
      "de.outstare.fortbattleplayer.statistics.WeaponModCounter$ShinyOilCounter",
      "de.outstare.fortbattleplayer.model.impl.SimpleBattleField",
      "de.outstare.fortbattleplayer.statistics.WeaponModCounter$SchmierOilCounter",
      "de.outstare.fortbattleplayer.statistics.WeaponModCounter$LoadingchamberOrEnhancedPatronsCounter",
      "de.outstare.fortbattleplayer.statistics.WeaponModCounter$FettesOilCounter",
      "de.outstare.fortbattleplayer.statistics.WeaponModCounter$BayonetCounter",
      "de.outstare.fortbattleplayer.statistics.WeaponModCounter$HipFlaskCounter",
      "de.outstare.fortbattleplayer.statistics.WeaponModCounter$GraphitLubricantCounter",
      "de.outstare.fortbattleplayer.model.impl.SimpleCombatant",
      "de.outstare.fortbattleplayer.statistics.PositionSwitch",
      "de.outstare.fortbattleplayer.model.SectorBonus",
      "de.outstare.fortbattleplayer.model.impl.SimpleWeapon$1",
      "de.outstare.fortbattleplayer.player.PlayerState",
      "de.outstare.fortbattleplayer.player.PlayerConfiguration",
      "de.outstare.fortbattleplayer.gui.battlefield.BattlefieldDrawing",
      "de.outstare.fortbattleplayer.gui.battlefield.BattleFieldLayoutManager",
      "de.outstare.fortbattleplayer.statistics.AreaStatistic",
      "de.outstare.fortbattleplayer.player.CombatantEventDispatcher",
      "de.outstare.fortbattleplayer.gui.battlefield.BattlefieldDrawing$1",
      "de.outstare.fortbattleplayer.gui.battlefield.BattlefieldCell",
      "de.outstare.fortbattleplayer.gui.battlefield.BattlefieldCell$SectorBorders",
      "de.outstare.fortbattleplayer.gui.battlefield.BattlefieldCell$BattlefieldCellLayoutManager",
      "de.outstare.fortbattleplayer.player.Battleplan",
      "de.outstare.fortbattleplayer.player.Battleplayer",
      "de.outstare.fortbattleplayer.model.SectorBonus$BonusType"
    );
  }
}
