/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Mar 18 09:58:26 GMT 2024
 */

package com.puppycrawl.tools.checkstyle.api;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class AutomaticBean_ESTest_scaffolding {

  @org.junit.jupiter.api.extension.RegisterExtension
  public org.evosuite.runtime.vnet.NonFunctionalRequirementExtension nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementExtension();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeAll
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.puppycrawl.tools.checkstyle.api.AutomaticBean"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(AutomaticBean_ESTest_scaffolding.class.getClassLoader() ,
      "com.puppycrawl.tools.checkstyle.api.Context",
      "org.apache.commons.beanutils.converters.SqlTimestampConverter",
      "org.apache.commons.beanutils.PropertyUtils",
      "com.google.common.collect.ImmutableList$SubList",
      "com.google.common.collect.Lists$RandomAccessPartition",
      "com.google.common.collect.Collections2",
      "org.apache.commons.beanutils.converters.ArrayConverter",
      "org.apache.commons.beanutils.ConvertUtilsBean",
      "com.google.common.collect.PeekingIterator",
      "org.apache.commons.beanutils.IntrospectionContext",
      "org.apache.commons.beanutils.converters.DateTimeConverter",
      "com.google.common.collect.RegularImmutableList",
      "com.google.common.collect.Lists$TransformingRandomAccessList",
      "org.apache.commons.beanutils.expression.Resolver",
      "org.apache.commons.beanutils.converters.NumberConverter",
      "org.apache.commons.beanutils.converters.LongConverter",
      "org.apache.commons.beanutils.converters.BigIntegerConverter",
      "com.google.common.collect.SortedMapDifference",
      "org.apache.commons.beanutils.WeakFastHashMap",
      "org.apache.commons.beanutils.converters.CharacterConverter",
      "org.apache.commons.beanutils.MappedPropertyDescriptor",
      "org.apache.commons.beanutils.Converter",
      "com.google.common.collect.ImmutableMap$IteratorBasedImmutableMap",
      "com.google.common.collect.Iterators$12",
      "com.puppycrawl.tools.checkstyle.api.AutomaticBean",
      "com.google.common.collect.Iterators$11",
      "org.apache.commons.beanutils.BeanIntrospector",
      "org.apache.commons.beanutils.MethodUtils",
      "com.google.common.base.Joiner",
      "org.apache.commons.beanutils.BeanUtils",
      "com.google.common.collect.ImmutableAsList",
      "com.google.common.collect.RegularImmutableAsList",
      "com.puppycrawl.tools.checkstyle.api.AutomaticBean$RelaxedStringArrayConverter",
      "org.apache.commons.beanutils.ContextClassLoaderLocal",
      "com.google.common.collect.Iterators$13",
      "com.google.common.collect.Lists$Partition",
      "com.google.common.collect.Lists",
      "org.apache.commons.beanutils.converters.DateConverter",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.common.collect.Lists$TransformingSequentialList",
      "org.apache.commons.beanutils.converters.SqlTimeConverter",
      "com.google.common.collect.ObjectArrays",
      "com.puppycrawl.tools.checkstyle.api.Contextualizable",
      "com.google.common.collect.Maps$BiMapConverter",
      "org.apache.commons.beanutils.BeanIntrospectionData",
      "com.google.common.collect.AbstractIterator",
      "com.puppycrawl.tools.checkstyle.api.Configurable",
      "com.google.common.base.Joiner$MapJoiner",
      "org.apache.commons.beanutils.DefaultBeanIntrospector",
      "org.apache.commons.beanutils.BeanUtilsBean",
      "com.google.common.collect.ImmutableList$1",
      "com.google.common.collect.MapDifference",
      "org.apache.commons.beanutils.ConvertUtils",
      "com.puppycrawl.tools.checkstyle.DefaultConfiguration",
      "com.google.common.base.Preconditions",
      "com.google.common.collect.UnmodifiableIterator",
      "org.apache.commons.beanutils.converters.DoubleConverter",
      "org.apache.commons.beanutils.converters.BigDecimalConverter",
      "com.google.common.base.Joiner$1",
      "com.google.common.base.Joiner$2",
      "org.apache.commons.beanutils.BeanUtilsBean$1",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableEnumMap",
      "org.apache.commons.beanutils.MethodUtils$MethodDescriptor",
      "org.apache.commons.collections.FastHashMap",
      "org.apache.commons.beanutils.converters.BooleanConverter",
      "com.google.common.collect.Lists$RandomAccessListWrapper",
      "org.apache.commons.beanutils.converters.ClassConverter",
      "org.apache.commons.beanutils.converters.AbstractConverter",
      "org.apache.commons.beanutils.converters.ByteConverter",
      "com.google.common.collect.ImmutableList$ReverseImmutableList",
      "com.google.common.collect.SingletonImmutableList",
      "com.google.common.base.Converter",
      "org.apache.commons.beanutils.converters.ConverterFacade",
      "com.google.common.collect.Iterators$6",
      "com.google.common.collect.BiMap",
      "com.google.common.collect.Iterators$7",
      "com.google.common.collect.Maps$6",
      "com.google.common.base.Function",
      "com.google.common.collect.Lists$AbstractListWrapper",
      "com.google.common.collect.ImmutableMap",
      "org.apache.commons.beanutils.converters.FloatConverter",
      "com.google.common.collect.AbstractIndexedListIterator",
      "org.apache.commons.beanutils.DynaBean",
      "org.apache.commons.beanutils.DynaProperty",
      "com.google.common.collect.Iterators$1",
      "com.google.common.collect.Iterators$2",
      "com.google.common.collect.Iterators$3",
      "org.apache.commons.beanutils.converters.SqlDateConverter",
      "org.apache.commons.beanutils.BeanAccessLanguageException",
      "org.apache.commons.beanutils.converters.FileConverter",
      "com.google.common.collect.Lists$StringAsImmutableList",
      "org.apache.commons.beanutils.PropertyUtilsBean",
      "com.google.common.collect.Lists$2",
      "org.apache.commons.beanutils.DynaClass",
      "org.apache.commons.logging.impl.Jdk14Logger",
      "com.puppycrawl.tools.checkstyle.api.CheckstyleException",
      "com.google.common.collect.Lists$1",
      "org.apache.commons.beanutils.ConversionException",
      "com.google.common.collect.Multiset",
      "com.puppycrawl.tools.checkstyle.api.AutomaticBean$1",
      "org.apache.commons.logging.impl.Log4JLogger",
      "com.google.common.collect.Iterators",
      "com.google.common.collect.ImmutableList",
      "org.apache.commons.beanutils.converters.ShortConverter",
      "org.apache.commons.beanutils.converters.StringConverter",
      "org.apache.commons.beanutils.DefaultIntrospectionContext",
      "org.apache.commons.beanutils.NestedNullException",
      "com.google.common.collect.Maps",
      "org.apache.commons.beanutils.converters.IntegerConverter",
      "org.apache.commons.beanutils.expression.DefaultResolver",
      "com.puppycrawl.tools.checkstyle.api.Configuration",
      "com.google.common.collect.Maps$EntryTransformer",
      "com.puppycrawl.tools.checkstyle.DefaultContext",
      "org.apache.commons.beanutils.converters.URLConverter",
      "com.google.common.collect.Iterators$MergingIterator",
      "org.apache.commons.beanutils.converters.CalendarConverter"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(AutomaticBean_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.puppycrawl.tools.checkstyle.api.AutomaticBean",
      "com.puppycrawl.tools.checkstyle.api.AutomaticBean$RelaxedStringArrayConverter",
      "org.apache.commons.beanutils.ContextClassLoaderLocal",
      "org.apache.commons.beanutils.BeanUtilsBean$1",
      "org.apache.commons.beanutils.BeanUtilsBean",
      "com.puppycrawl.tools.checkstyle.DefaultContext",
      "com.google.common.base.Joiner",
      "com.google.common.base.Preconditions",
      "com.google.common.base.Joiner$1",
      "com.google.common.collect.Collections2",
      "com.google.common.base.Joiner$MapJoiner",
      "com.google.common.collect.Maps",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.ObjectArrays",
      "com.google.common.collect.SingletonImmutableList",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.common.collect.Iterators$1",
      "com.google.common.collect.Iterators$2",
      "com.google.common.collect.Iterators",
      "com.google.common.collect.Iterators$12",
      "org.apache.commons.beanutils.ConvertUtilsBean",
      "org.apache.commons.beanutils.WeakFastHashMap",
      "org.apache.commons.logging.impl.Jdk14Logger",
      "org.apache.commons.beanutils.converters.AbstractConverter",
      "org.apache.commons.beanutils.converters.BooleanConverter",
      "org.apache.commons.beanutils.ConvertUtils",
      "org.apache.commons.beanutils.converters.ConverterFacade",
      "org.apache.commons.beanutils.converters.NumberConverter",
      "org.apache.commons.beanutils.converters.ByteConverter",
      "org.apache.commons.beanutils.converters.CharacterConverter",
      "org.apache.commons.beanutils.converters.DoubleConverter",
      "org.apache.commons.beanutils.converters.FloatConverter",
      "org.apache.commons.beanutils.converters.IntegerConverter",
      "org.apache.commons.beanutils.converters.LongConverter",
      "org.apache.commons.beanutils.converters.ShortConverter",
      "org.apache.commons.beanutils.converters.BigDecimalConverter",
      "org.apache.commons.beanutils.converters.BigIntegerConverter",
      "org.apache.commons.beanutils.converters.StringConverter",
      "org.apache.commons.beanutils.converters.ClassConverter",
      "org.apache.commons.beanutils.converters.DateTimeConverter",
      "org.apache.commons.beanutils.converters.DateConverter",
      "org.apache.commons.beanutils.converters.CalendarConverter",
      "org.apache.commons.beanutils.converters.FileConverter",
      "org.apache.commons.beanutils.converters.SqlDateConverter",
      "org.apache.commons.beanutils.converters.SqlTimeConverter",
      "org.apache.commons.beanutils.converters.SqlTimestampConverter",
      "org.apache.commons.beanutils.converters.URLConverter",
      "org.apache.commons.beanutils.converters.ArrayConverter",
      "org.apache.commons.beanutils.PropertyUtilsBean",
      "org.apache.commons.beanutils.expression.DefaultResolver",
      "org.apache.commons.beanutils.DefaultBeanIntrospector",
      "org.apache.commons.beanutils.DefaultIntrospectionContext",
      "org.apache.commons.beanutils.BeanIntrospectionData",
      "org.apache.commons.collections.FastHashMap",
      "org.apache.commons.beanutils.MappedPropertyDescriptor",
      "org.apache.commons.beanutils.MethodUtils",
      "org.apache.commons.beanutils.MethodUtils$MethodDescriptor",
      "com.puppycrawl.tools.checkstyle.DefaultConfiguration",
      "com.google.common.collect.Lists",
      "com.google.common.collect.ImmutableMap",
      "com.google.common.collect.Iterables",
      "com.google.common.collect.ImmutableBiMap",
      "com.google.common.collect.RegularImmutableBiMap",
      "com.puppycrawl.tools.checkstyle.api.CheckstyleException",
      "com.google.common.collect.RegularImmutableList",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.common.collect.Iterators$11",
      "org.apache.commons.beanutils.PropertyUtils",
      "com.google.common.collect.RegularImmutableMap",
      "com.google.common.collect.Hashing",
      "com.google.common.collect.AbstractMapEntry",
      "com.google.common.collect.ImmutableEntry",
      "com.google.common.collect.ImmutableMapEntry",
      "com.google.common.collect.CollectPreconditions",
      "com.google.common.collect.SingletonImmutableBiMap",
      "org.apache.commons.beanutils.ConversionException",
      "org.apache.commons.beanutils.BeanUtils"
    );
  }
}
