/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Feb 13 11:55:23 GMT 2024
 */

package com.lts.caloriecount.data.budget;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Budget_ESTest_scaffolding {

  @org.junit.jupiter.api.extension.RegisterExtension
  public org.evosuite.runtime.vnet.NonFunctionalRequirementExtension nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementExtension();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeAll
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.lts.caloriecount.data.budget.Budget"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterAll
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @BeforeEach
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
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
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.country", "NL"); 
    java.lang.System.setProperty("user.dir", "/Users/amirdeljouyi/Software Development/PhD Project/Bug-Fixing-2/dataset/78_caloriecount"); 
    java.lang.System.setProperty("java.io.tmpdir", "/var/folders/yc/kykqf2wd0tgdw_85fbvlyj680000gn/T/"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Budget_ESTest_scaffolding.class.getClassLoader() ,
      "com.lts.caloriecount.data.entry.Entry",
      "com.lts.util.DateUtil",
      "com.lts.caloriecount.data.meal.Meal",
      "com.lts.util.deepcopy.DeepCopier",
      "com.lts.caloriecount.data.food.FoodList",
      "com.lts.util.ReallyCaselessMap",
      "com.lts.util.deepcopy.DeepCopyException",
      "com.lts.caloriecount.data.meal.MealList",
      "com.lts.util.notifyinglist.NotifyingList",
      "com.lts.application.data.ApplicationDataElementAdaptor",
      "com.lts.bean.xml.annotations.IgnoreProperty",
      "com.lts.caloriecount.data.SimpleSerialization",
      "com.lts.application.ApplicationException",
      "com.lts.event.ListenerHelper",
      "com.lts.application.data.IdApplicationDataElement",
      "com.lts.util.StringUtils$1",
      "com.lts.LTSException",
      "com.lts.datalist.DataList",
      "com.lts.application.data.ApplicationDataElement",
      "com.lts.caloriecount.data.budget.TimeOfDay",
      "com.lts.xml.simple.SimpleElement",
      "com.lts.util.StringUtils",
      "com.lts.util.notifyinglist.NotifyingListListener",
      "com.lts.util.notifyinglist.NotifyingListHelper",
      "com.lts.util.notifyinglist.NotifyingListAdaptor",
      "com.lts.caloriecount.data.meal.Meal$MealComparator",
      "com.lts.bean.xml.annotations.IgnoreProperties",
      "com.lts.application.data.IdApplicationDataList",
      "com.lts.caloriecount.data.food.Food",
      "com.lts.caloriecount.data.budget.Budget"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Budget_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.lts.application.data.ApplicationDataElementAdaptor",
      "com.lts.caloriecount.data.budget.Budget",
      "com.lts.util.DateUtil",
      "com.lts.application.data.MultiElementAppData",
      "com.lts.caloriecount.data.CalorieCountData",
      "com.lts.EnumWrapper",
      "com.lts.caloriecount.data.CalorieCountData$CalorieCountDataElementsWrapper",
      "com.lts.util.ReallyCaselessMap",
      "com.lts.caloriecount.data.CalorieCountData$1",
      "com.lts.util.notifyinglist.NotifyingListAdaptor",
      "com.lts.datalist.DataList",
      "com.lts.application.data.IdApplicationDataList",
      "com.lts.caloriecount.data.food.FoodList",
      "com.lts.caloriecount.data.food.Food$1",
      "com.lts.caloriecount.data.food.Food",
      "com.lts.event.ListenerHelper",
      "com.lts.util.notifyinglist.NotifyingListHelper",
      "com.lts.caloriecount.data.meal.MealList",
      "com.lts.caloriecount.data.meal.Meal$MealComparator",
      "com.lts.caloriecount.data.budget.TimeOfDay",
      "com.lts.caloriecount.data.frequent.FrequentFoodList",
      "com.lts.caloriecount.data.entry.EntryList",
      "com.lts.util.deepcopy.DeepCopyUtil",
      "com.lts.xml.simple.SimpleElement",
      "com.lts.util.notifyinglist.NotifyingListListenerAdaptor",
      "com.lts.caloriecount.data.meal.MealListFoodListListener",
      "com.lts.caloriecount.data.meal.MealList$TimeComparator",
      "com.lts.caloriecount.data.entry.Entry$1",
      "com.lts.caloriecount.data.entry.Entry",
      "com.lts.caloriecount.data.meal.Meal",
      "com.lts.util.notifyinglist.ListEvent",
      "com.lts.util.notifyinglist.ListEvent$EventType",
      "com.lts.util.ListUtils",
      "com.lts.caloriecount.data.Adjustment",
      "com.lts.util.StringUtils$1",
      "com.lts.util.StringUtils",
      "com.lts.util.notifyinglist.SimplifiedList",
      "com.lts.util.notifyinglist.OtherNotifyingListAdaptor",
      "com.lts.util.notifyinglist.NotifyingListListenerAdaptor$1",
      "com.lts.util.deepcopy.DeepCopyException",
      "com.lts.caloriecount.data.frequent.FrequentFood$1",
      "com.lts.caloriecount.data.frequent.FrequentFood$2",
      "com.lts.caloriecount.data.frequent.FrequentFood",
      "com.lts.util.notifyinglist.ListProxy",
      "com.lts.util.notifyinglist.ListProxy$1",
      "com.lts.caloriecount.data.meal.MealList$FinderComparator",
      "com.lts.caloriecount.data.entry.EntryList$EntryTypes",
      "com.lts.swing.table.rowmodel.RowModelAdaptor",
      "com.lts.caloriecount.ui.frequent.FrequentRowModel",
      "com.lts.swing.table.rowmodel.RowModelTableAdaptor",
      "com.lts.util.notifyinglist.TableBridge",
      "com.lts.swing.table.TableModelHelper",
      "com.lts.caloriecount.ui.dayview.MealRowModel",
      "com.lts.caloriecount.ui.entry.EntryRowModel"
    );
  }
}
