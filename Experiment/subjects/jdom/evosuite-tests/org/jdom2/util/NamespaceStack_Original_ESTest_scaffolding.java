/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Mar 19 18:22:13 GMT 2024
 */

package org.jdom2.util;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class NamespaceStack_Original_ESTest_scaffolding {

  @org.junit.jupiter.api.extension.RegisterExtension
  public org.evosuite.runtime.vnet.NonFunctionalRequirementExtension nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementExtension();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeAll
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.jdom2.util.NamespaceStack"; 
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
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(NamespaceStack_Original_ESTest_scaffolding.class.getClassLoader() ,
      "org.jdom2.IllegalDataException",
      "org.jdom2.internal.ArrayCopy",
      "org.jdom2.CloneBase",
      "org.jdom2.Text",
      "org.jdom2.Document",
      "org.jdom2.Content$CType",
      "org.jdom2.JDOMException",
      "org.jdom2.AttributeType",
      "org.jdom2.util.NamespaceStack",
      "org.jdom2.util.IteratorIterable",
      "org.jdom2.Verifier",
      "org.jdom2.Namespace",
      "org.jdom2.IllegalNameException",
      "org.jdom2.AttributeList$ALIterator",
      "org.jdom2.NamespaceAware",
      "org.jdom2.filter.Filter",
      "org.jdom2.util.NamespaceStack$1",
      "org.jdom2.util.NamespaceStack$ForwardWalker",
      "org.jdom2.Parent",
      "org.jdom2.Content",
      "org.jdom2.util.NamespaceStack$BackwardWalker",
      "org.jdom2.util.NamespaceStack$EmptyIterable",
      "org.jdom2.util.NamespaceStack$NamespaceIterable",
      "org.jdom2.Attribute",
      "org.jdom2.AttributeList",
      "org.jdom2.ContentList",
      "org.jdom2.DataConversionException",
      "org.jdom2.IllegalAddException",
      "org.jdom2.Element"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.util.function.Consumer", false, NamespaceStack_Original_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(NamespaceStack_Original_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jdom2.util.NamespaceStack$EmptyIterable",
      "org.jdom2.util.NamespaceStack$1",
      "org.jdom2.Namespace",
      "org.jdom2.util.NamespaceStack",
      "org.jdom2.util.NamespaceStack$NamespaceIterable",
      "org.jdom2.util.NamespaceStack$ForwardWalker",
      "org.jdom2.CloneBase",
      "org.jdom2.Attribute",
      "org.jdom2.Verifier",
      "org.jdom2.internal.ArrayCopy",
      "org.jdom2.Content",
      "org.jdom2.Element",
      "org.jdom2.Content$CType",
      "org.jdom2.ContentList",
      "org.jdom2.IllegalNameException",
      "org.jdom2.filter.AbstractFilter",
      "org.jdom2.filter.AttributeFilter",
      "org.jdom2.filter.ElementFilter",
      "org.jdom2.filter.AndFilter",
      "org.jdom2.EntityRef",
      "org.jdom2.Text",
      "org.jdom2.CDATA",
      "org.jdom2.output.Format$EscapeStrategyUTF",
      "org.jdom2.output.Format$EscapeStrategy8Bits",
      "org.jdom2.output.Format$EscapeStrategy7Bits",
      "org.jdom2.output.Format$1",
      "org.jdom2.internal.SystemProperty",
      "org.jdom2.output.LineSeparator",
      "org.jdom2.output.Format",
      "org.jdom2.JDOMException",
      "org.jdom2.DataConversionException",
      "org.jdom2.ContentList$FilterList",
      "org.jdom2.ContentList$FilterListIterator",
      "org.jdom2.AttributeList",
      "org.jdom2.Comment",
      "org.jdom2.filter.NegateFilter",
      "org.jdom2.DescendantIterator",
      "org.jdom2.ContentList$CLIterator",
      "org.jdom2.DocType",
      "org.jdom2.AttributeList$ALIterator",
      "org.jdom2.IllegalAddException",
      "org.jdom2.filter.OrFilter",
      "org.jdom2.ProcessingInstruction",
      "org.jdom2.IllegalTargetException",
      "org.jdom2.IllegalDataException",
      "org.jdom2.FilterIterator",
      "org.jdom2.ContentList$CLListIterator",
      "org.jdom2.filter.ContentFilter",
      "org.jdom2.output.support.AbstractOutputProcessor",
      "org.jdom2.output.support.AbstractXMLOutputProcessor",
      "org.jdom2.output.XMLOutputter$DefaultXMLProcessor",
      "org.jdom2.output.XMLOutputter",
      "org.jdom2.output.Format$TextMode",
      "org.jdom2.output.support.FormatStack",
      "org.jdom2.AttributeType"
    );
  }
}