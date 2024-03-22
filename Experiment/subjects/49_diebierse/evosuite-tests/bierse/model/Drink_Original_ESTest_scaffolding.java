/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Mar 18 04:39:16 GMT 2024
 */

package bierse.model;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Drink_Original_ESTest_scaffolding {

  @org.junit.jupiter.api.extension.RegisterExtension
  public org.evosuite.runtime.vnet.NonFunctionalRequirementExtension nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementExtension();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeAll
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "bierse.model.Drink"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Drink_Original_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.log4j.helpers.PatternConverter",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.jdom.output.XMLOutputter",
      "org.apache.log4j.AppenderSkeleton",
      "org.apache.log4j.or.RendererMap",
      "org.apache.log4j.ConsoleAppender$SystemErrStream",
      "org.jdom.Document",
      "org.apache.log4j.Level",
      "org.apache.log4j.helpers.DateTimeDateFormat",
      "org.jdom.Verifier",
      "org.jdom.Namespace",
      "org.jdom.input.TextBuffer",
      "org.jdom.IllegalNameException",
      "org.apache.log4j.helpers.QuietWriter",
      "org.apache.log4j.NDC",
      "org.jdom.JDOMFactory",
      "org.apache.log4j.ConsoleAppender$SystemOutStream",
      "org.jdom.input.JAXPParserFactory",
      "org.jdom.IllegalDataException",
      "org.apache.log4j.helpers.ISO8601DateFormat",
      "org.jdom.Parent",
      "org.apache.log4j.helpers.PatternParser$LocationPatternConverter",
      "org.apache.log4j.CategoryKey",
      "org.apache.log4j.helpers.PatternParser$BasicPatternConverter",
      "bierse.model.Settings",
      "org.apache.log4j.WriterAppender",
      "org.apache.log4j.Layout",
      "org.jdom.output.Format$DefaultEscapeStrategy",
      "org.jdom.filter.Filter",
      "org.apache.log4j.helpers.OnlyOnceErrorHandler",
      "org.jdom.Comment",
      "org.jdom.output.Format$TextMode",
      "org.jdom.output.Format",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.ProvisionNode",
      "org.jdom.output.XMLOutputter$NamespaceStack",
      "org.apache.log4j.Hierarchy",
      "org.apache.log4j.helpers.FileWatchdog",
      "org.apache.log4j.helpers.PatternParser$CategoryPatternConverter",
      "bierse.view.IModelChangedListener",
      "org.apache.log4j.helpers.PatternParser$LiteralPatternConverter",
      "org.apache.log4j.spi.OptionHandler",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.jdom.input.BuilderErrorHandler",
      "org.apache.log4j.spi.RootLogger",
      "bierse.model.Drink",
      "org.apache.log4j.spi.ErrorHandler",
      "org.apache.log4j.spi.VectorWriter",
      "org.apache.log4j.spi.RendererSupport",
      "org.jdom.ContentList",
      "org.apache.log4j.helpers.AppenderAttachableImpl",
      "org.jdom.IllegalAddException",
      "bierse.controller.TriggerThread",
      "bierse.model.Model",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.log4j.helpers.FormattingInfo",
      "org.jdom.Element",
      "org.apache.log4j.BasicConfigurator",
      "org.apache.log4j.or.ObjectRenderer",
      "org.apache.log4j.helpers.AbsoluteTimeDateFormat",
      "org.apache.log4j.Logger",
      "org.apache.log4j.helpers.PatternParser$ClassNamePatternConverter",
      "org.jdom.JDOMException",
      "org.jdom.DefaultJDOMFactory",
      "org.apache.log4j.helpers.PatternParser",
      "org.jdom.NamespaceKey",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.Category",
      "org.jdom.Text",
      "org.apache.log4j.spi.RepositorySelector",
      "org.apache.log4j.spi.LoggerFactory",
      "org.apache.log4j.ConsoleAppender",
      "org.apache.log4j.spi.Configurator",
      "org.jdom.input.JDOMParseException",
      "org.jdom.input.SAXHandler",
      "org.apache.log4j.or.DefaultRenderer",
      "org.jdom.input.SAXBuilder",
      "org.apache.log4j.PropertyWatchdog",
      "org.apache.log4j.PropertyConfigurator",
      "org.jdom.output.NamespaceStack",
      "org.jdom.Content",
      "org.apache.log4j.helpers.PatternParser$NamedPatternConverter",
      "org.jdom.CDATA",
      "org.apache.log4j.Appender",
      "org.jdom.DocType",
      "org.jdom.ProcessingInstruction",
      "org.apache.log4j.spi.AppenderAttachable",
      "org.apache.log4j.spi.LoggingEvent",
      "org.jdom.EntityRef",
      "org.apache.log4j.helpers.PatternParser$DatePatternConverter",
      "org.apache.log4j.spi.NullWriter",
      "org.apache.log4j.helpers.PatternParser$MDCPatternConverter",
      "org.apache.log4j.spi.ThrowableInformation",
      "org.apache.log4j.Priority",
      "org.jdom.AttributeList",
      "org.jdom.output.EscapeStrategy",
      "org.apache.log4j.PatternLayout",
      "org.apache.log4j.spi.LoggerRepository",
      "org.apache.log4j.LogManager"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Drink_Original_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "bierse.model.Drink",
      "bierse.model.Model",
      "org.apache.log4j.BasicConfigurator",
      "org.apache.log4j.Category",
      "org.apache.log4j.Logger",
      "org.apache.log4j.Hierarchy",
      "org.apache.log4j.spi.RootLogger",
      "org.apache.log4j.Priority",
      "org.apache.log4j.Level",
      "org.apache.log4j.or.DefaultRenderer",
      "org.apache.log4j.or.RendererMap",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.PropertyConfigurator",
      "org.apache.log4j.LogManager",
      "org.apache.log4j.AppenderSkeleton",
      "org.apache.log4j.WriterAppender",
      "org.apache.log4j.ConsoleAppender",
      "org.apache.log4j.Layout",
      "org.apache.log4j.PatternLayout",
      "org.apache.log4j.helpers.PatternParser",
      "org.apache.log4j.helpers.FormattingInfo",
      "org.apache.log4j.helpers.PatternConverter",
      "org.apache.log4j.helpers.PatternParser$BasicPatternConverter",
      "org.apache.log4j.helpers.PatternParser$LiteralPatternConverter",
      "org.apache.log4j.helpers.PatternParser$NamedPatternConverter",
      "org.apache.log4j.helpers.PatternParser$CategoryPatternConverter",
      "org.apache.log4j.helpers.OnlyOnceErrorHandler",
      "org.apache.log4j.helpers.QuietWriter",
      "org.apache.log4j.helpers.AppenderAttachableImpl",
      "org.apache.log4j.CategoryKey",
      "org.apache.log4j.ProvisionNode",
      "bierse.model.Settings",
      "bierse.controller.TriggerThread",
      "org.jdom.Content",
      "org.jdom.Element",
      "org.jdom.AttributeList",
      "org.jdom.ContentList",
      "org.jdom.Verifier",
      "org.jdom.NamespaceKey",
      "org.jdom.Namespace",
      "org.jdom.Text",
      "org.jdom.Document",
      "org.jdom.output.Format",
      "org.jdom.output.Format$TextMode",
      "org.jdom.output.Format$DefaultEscapeStrategy",
      "org.jdom.output.XMLOutputter",
      "org.jdom.output.NamespaceStack",
      "org.jdom.output.XMLOutputter$NamespaceStack",
      "bierse.view.DefaultInfoView",
      "bierse.view.DefaultDrinkSellView",
      "org.jdom.input.SAXBuilder",
      "org.jdom.DefaultJDOMFactory",
      "org.jdom.input.SAXHandler",
      "org.jdom.input.TextBuffer",
      "org.jdom.input.JAXPParserFactory",
      "org.jdom.input.BuilderErrorHandler",
      "org.apache.log4j.spi.LoggingEvent",
      "org.apache.log4j.spi.ThrowableInformation",
      "org.apache.log4j.NDC",
      "org.apache.log4j.spi.VectorWriter",
      "org.apache.log4j.spi.NullWriter",
      "org.jdom.IllegalAddException",
      "org.jdom.IllegalNameException"
    );
  }
}
