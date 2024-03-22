/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Mar 18 03:48:34 GMT 2024
 */

package org.apache.lucene.search.exposed.compare;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class NamedCollatorComparator_Original_ESTest_scaffolding {

  @org.junit.jupiter.api.extension.RegisterExtension
  public org.evosuite.runtime.vnet.NonFunctionalRequirementExtension nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementExtension();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeAll
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.lucene.search.exposed.compare.NamedCollatorComparator"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(NamedCollatorComparator_Original_ESTest_scaffolding.class.getClassLoader() ,
      "com.ibm.icu.impl.UCharacterProperty$4",
      "com.ibm.icu.impl.ICUResourceBundleReader$Array",
      "com.ibm.icu.impl.UCharacterProperty$3",
      "com.ibm.icu.impl.UCharacterProperty$6",
      "com.ibm.icu.impl.UCharacterProperty$5",
      "com.ibm.icu.impl.Trie2_32",
      "com.ibm.icu.impl.UCharacterProperty$2",
      "com.ibm.icu.util.RangeValueIterator",
      "com.ibm.icu.impl.UCharacterProperty$1",
      "com.ibm.icu.text.UnicodeSet",
      "com.ibm.icu.text.RuleBasedCollator$UCAConstants",
      "org.apache.lucene.util.ArrayUtil$1",
      "org.apache.lucene.util.ArrayUtil$2",
      "com.ibm.icu.util.ByteArrayWrapper",
      "com.ibm.icu.util.ULocale",
      "com.ibm.icu.impl.Utility",
      "com.ibm.icu.impl.UCharacterProperty$8",
      "com.ibm.icu.impl.UCharacterProperty$7",
      "com.ibm.icu.impl.UCharacterProperty$9",
      "com.ibm.icu.impl.Trie",
      "org.apache.lucene.search.exposed.compare.NamedComparator",
      "com.ibm.icu.impl.SoftCache",
      "com.ibm.icu.util.UResourceTypeMismatchException",
      "com.ibm.icu.util.Freezable",
      "com.ibm.icu.impl.ICURWLock$Stats",
      "com.ibm.icu.impl.ICUData",
      "org.apache.lucene.util.SorterTemplate",
      "com.ibm.icu.text.RuleBasedCollator$shiftValues",
      "org.apache.lucene.util.BytesRef$UTF8SortedAsUnicodeComparator",
      "com.ibm.icu.impl.ICUService$CacheEntry",
      "com.ibm.icu.impl.UCharacterProperty$BiDiIntProperty",
      "com.ibm.icu.impl.ICUResourceBundle$1$1",
      "com.ibm.icu.util.ValueIterator",
      "com.ibm.icu.impl.UCharacterProperty$IsAcceptable",
      "com.ibm.icu.impl.ICUService$Factory",
      "com.ibm.icu.text.RuleBasedCollator$1",
      "com.ibm.icu.impl.Norm2AllModes$FCDNormalizer2",
      "com.ibm.icu.impl.ICUService",
      "com.ibm.icu.impl.ICUBinary$Authenticate",
      "com.ibm.icu.text.RuleBasedCollator$DataManipulate",
      "com.ibm.icu.text.UTF16",
      "com.ibm.icu.impl.CharacterIteratorWrapper",
      "com.ibm.icu.impl.UCharacterProperty$NormInertBinaryProperty",
      "com.ibm.icu.impl.ICUResourceBundleImpl",
      "com.ibm.icu.impl.IntTrie",
      "com.ibm.icu.impl.Norm2AllModes$ComposeNormalizer2",
      "com.ibm.icu.impl.UCharacterProperty$10",
      "com.ibm.icu.impl.Trie2$ValueWidth",
      "com.ibm.icu.impl.UCharacterProperty$11",
      "com.ibm.icu.impl.UCharacterProperty$12",
      "com.ibm.icu.impl.ICUBinary",
      "com.ibm.icu.impl.UCharacterProperty$13",
      "com.ibm.icu.impl.UCharacterProperty$14",
      "com.ibm.icu.impl.UCharacterProperty$15",
      "com.ibm.icu.impl.UCharacterProperty$16",
      "com.ibm.icu.impl.UCharacterProperty$17",
      "com.ibm.icu.impl.UCharacterProperty$18",
      "com.ibm.icu.impl.Norm2AllModes$DecomposeNormalizer2",
      "com.ibm.icu.impl.UCharacterProperty$19",
      "com.ibm.icu.impl.ReplaceableUCharacterIterator",
      "com.ibm.icu.impl.Norm2AllModes$Norm2AllModesSingleton",
      "com.ibm.icu.impl.locale.LocaleSyntaxException",
      "com.ibm.icu.impl.ICUService$Key",
      "com.ibm.icu.impl.ICUResourceBundleReader$Array16",
      "com.ibm.icu.impl.RuleCharacterIterator",
      "com.ibm.icu.impl.ICUCache",
      "com.ibm.icu.impl.ICULocaleService$LocaleKeyFactory",
      "com.ibm.icu.impl.Normalizer2Impl",
      "com.ibm.icu.impl.UCharacterProperty$20",
      "com.ibm.icu.impl.UCharacterProperty$21",
      "com.ibm.icu.impl.UCharacterProperty$22",
      "com.ibm.icu.impl.LocaleIDParser",
      "com.ibm.icu.impl.ICULocaleService$ICUResourceBundleFactory",
      "com.ibm.icu.impl.ICUResourceBundle",
      "com.ibm.icu.impl.Trie$DataManipulate",
      "com.ibm.icu.impl.URLHandler$FileURLHandler",
      "com.ibm.icu.impl.Norm2AllModes$NFCSingleton",
      "com.ibm.icu.text.UForwardCharacterIterator",
      "com.ibm.icu.impl.Trie2$UTrie2Header",
      "com.ibm.icu.text.Normalizer2",
      "com.ibm.icu.impl.ICUResourceBundleImpl$ResourceTable",
      "com.ibm.icu.impl.URLHandler$JarURLHandler",
      "com.ibm.icu.text.UnicodeSet$Filter",
      "com.ibm.icu.lang.UCharacterEnums$ECharacterDirection",
      "com.ibm.icu.impl.ICURWLock",
      "org.apache.lucene.util.CharsRef",
      "com.ibm.icu.text.UnicodeFilter",
      "com.ibm.icu.util.UResourceBundle",
      "com.ibm.icu.impl.UCharacterProperty$CombiningClassIntProperty",
      "com.ibm.icu.impl.Norm2AllModes$1",
      "org.apache.lucene.util.BytesRef$UTF8SortedAsUTF16Comparator",
      "com.ibm.icu.impl.UCharArrayIterator",
      "com.ibm.icu.impl.Trie2",
      "com.ibm.icu.impl.UCharacterProperty$CaseBinaryProperty",
      "com.ibm.icu.impl.ICUData$2",
      "com.ibm.icu.text.CollatorServiceShim",
      "com.ibm.icu.impl.ICUResourceBundleImpl$ResourceIntVector",
      "com.ibm.icu.util.ULocale$Type",
      "com.ibm.icu.text.CollationKey",
      "com.ibm.icu.impl.SimpleCache",
      "org.apache.lucene.search.exposed.compare.NamedComparator$ORDER",
      "com.ibm.icu.impl.URLHandler",
      "com.ibm.icu.impl.ICUResourceBundleReader$ByteSequence",
      "com.ibm.icu.impl.Norm2AllModes",
      "com.ibm.icu.impl.ICUResourceBundleReader$Container",
      "com.ibm.icu.text.UCharacterIterator",
      "com.ibm.icu.impl.ICUResourceBundleReader$Table",
      "com.ibm.icu.text.CollationElementIterator",
      "com.ibm.icu.text.Collator$ServiceShim",
      "com.ibm.icu.text.CollatorServiceShim$CService",
      "com.ibm.icu.lang.UCharacterEnums$ECharacterCategory",
      "com.ibm.icu.text.RuleBasedCollator$ContractionInfo",
      "org.apache.lucene.util.BytesRef",
      "com.ibm.icu.util.StringTokenizer",
      "com.ibm.icu.text.CollationElementIterator$Backup",
      "com.ibm.icu.impl.UCharacterProperty$IntProperty",
      "com.ibm.icu.impl.StringUCharacterIterator",
      "com.ibm.icu.text.RawCollationKey",
      "com.ibm.icu.impl.IllegalIcuArgumentException",
      "com.ibm.icu.impl.ImplicitCEGenerator",
      "com.ibm.icu.impl.ICUResourceBundleImpl$ResourceInt",
      "com.ibm.icu.impl.ICUResourceBundleReader$Table16",
      "com.ibm.icu.impl.UCharacterProperty$BinaryProperty",
      "com.ibm.icu.impl.Norm2AllModes$NoopNormalizer2",
      "com.ibm.icu.impl.ICUResourceBundleImpl$ResourceString",
      "com.ibm.icu.impl.UCharacterProperty",
      "com.ibm.icu.util.UResourceBundleIterator",
      "com.ibm.icu.impl.ICUDebug",
      "com.ibm.icu.impl.ICUResourceBundleImpl$ResourceArray",
      "com.ibm.icu.lang.UCharacter",
      "com.ibm.icu.impl.UCharacterProperty$NormQuickCheckIntProperty",
      "com.ibm.icu.impl.ICUResourceBundleReader$Table1632",
      "com.ibm.icu.impl.ICULocaleService$LocaleKey",
      "com.ibm.icu.impl.Trie2$ValueMapper",
      "com.ibm.icu.text.CollatorReader$2",
      "com.ibm.icu.text.CollatorReader$3",
      "com.ibm.icu.text.CollatorReader",
      "com.ibm.icu.text.CollatorReader$1",
      "org.apache.lucene.util.CharsRef$UTF16SortedAsUTF8Comparator",
      "com.ibm.icu.impl.CacheBase",
      "com.ibm.icu.text.Collator$CollatorFactory",
      "com.ibm.icu.impl.ICUResourceBundle$AvailEntry",
      "com.ibm.icu.impl.ICULocaleService",
      "com.ibm.icu.text.Collator",
      "com.ibm.icu.impl.Norm2AllModes$Normalizer2WithImpl",
      "com.ibm.icu.impl.ICUNotifier",
      "org.apache.lucene.util.ArrayUtil",
      "com.ibm.icu.text.RuleBasedCollator",
      "org.apache.lucene.util.UnicodeUtil",
      "com.ibm.icu.util.UResourceBundle$ResourceCacheKey",
      "com.ibm.icu.text.RuleBasedCollator$LeadByteConstants",
      "com.ibm.icu.impl.ICUResourceBundleImpl$ResourceBinary",
      "com.ibm.icu.impl.Trie2$1",
      "com.ibm.icu.text.UnicodeMatcher",
      "com.ibm.icu.impl.Trie2$2",
      "com.ibm.icu.text.CollatorServiceShim$CService$1CollatorFactory",
      "com.ibm.icu.impl.UCaseProps$ContextIterator",
      "com.ibm.icu.impl.Normalizer2Impl$1",
      "com.ibm.icu.impl.ICUResourceBundleReader",
      "org.apache.lucene.search.exposed.compare.NamedCollatorComparator",
      "com.ibm.icu.impl.ICUResourceBundleImpl$ResourceContainer",
      "com.ibm.icu.util.VersionInfo",
      "com.ibm.icu.impl.ICUResourceBundleReader$Table32",
      "com.ibm.icu.impl.URLHandler$URLVisitor",
      "com.ibm.icu.impl.ICUResourceBundle$2",
      "com.ibm.icu.impl.Normalizer2Impl$IsAcceptable",
      "com.ibm.icu.impl.ICUResourceBundle$1",
      "com.ibm.icu.impl.ICUData$3",
      "com.ibm.icu.impl.Trie2_16"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(NamedCollatorComparator_Original_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.lucene.search.exposed.compare.NamedCollatorComparator",
      "com.ibm.icu.util.VersionInfo",
      "com.ibm.icu.impl.ICUDebug",
      "com.ibm.icu.impl.SimpleCache",
      "com.ibm.icu.impl.LocaleIDParser",
      "com.ibm.icu.util.ULocale$Type",
      "com.ibm.icu.util.ULocale",
      "com.ibm.icu.text.Collator",
      "org.apache.lucene.search.exposed.compare.NamedComparator$ORDER",
      "com.ibm.icu.text.UnicodeFilter",
      "com.ibm.icu.text.UnicodeSet",
      "com.ibm.icu.impl.RuleCharacterIterator",
      "com.ibm.icu.text.UTF16",
      "com.ibm.icu.impl.UCharacterProperty$BinaryProperty",
      "com.ibm.icu.impl.UCharacterProperty$1",
      "com.ibm.icu.impl.UCharacterProperty$2",
      "com.ibm.icu.impl.UCharacterProperty$3",
      "com.ibm.icu.impl.UCharacterProperty$4",
      "com.ibm.icu.impl.UCharacterProperty$CaseBinaryProperty",
      "com.ibm.icu.impl.UCharacterProperty$NormInertBinaryProperty",
      "com.ibm.icu.impl.UCharacterProperty$5",
      "com.ibm.icu.impl.UCharacterProperty$6",
      "com.ibm.icu.impl.UCharacterProperty$7",
      "com.ibm.icu.impl.UCharacterProperty$8",
      "com.ibm.icu.impl.UCharacterProperty$9",
      "com.ibm.icu.impl.UCharacterProperty$10",
      "com.ibm.icu.impl.UCharacterProperty$11",
      "com.ibm.icu.impl.UCharacterProperty$12",
      "com.ibm.icu.impl.UCharacterProperty$IntProperty",
      "com.ibm.icu.impl.UCharacterProperty$BiDiIntProperty",
      "com.ibm.icu.impl.UCharacterProperty$13",
      "com.ibm.icu.impl.UCharacterProperty$CombiningClassIntProperty",
      "com.ibm.icu.impl.UCharacterProperty$14",
      "com.ibm.icu.impl.UCharacterProperty$15",
      "com.ibm.icu.impl.UCharacterProperty$16",
      "com.ibm.icu.impl.UCharacterProperty$17",
      "com.ibm.icu.impl.UCharacterProperty$18",
      "com.ibm.icu.impl.UCharacterProperty$19",
      "com.ibm.icu.impl.UCharacterProperty$20",
      "com.ibm.icu.impl.UCharacterProperty$NormQuickCheckIntProperty",
      "com.ibm.icu.impl.UCharacterProperty$21",
      "com.ibm.icu.impl.UCharacterProperty$22",
      "com.ibm.icu.impl.ICUData",
      "com.ibm.icu.impl.ICUData$2",
      "com.ibm.icu.impl.UCharacterProperty$IsAcceptable",
      "com.ibm.icu.impl.ICUBinary",
      "com.ibm.icu.impl.Trie2$1",
      "com.ibm.icu.impl.Trie2",
      "com.ibm.icu.impl.Trie2_16",
      "com.ibm.icu.impl.Trie2$UTrie2Header",
      "com.ibm.icu.impl.Trie2$ValueWidth",
      "com.ibm.icu.impl.Trie2$2",
      "com.ibm.icu.impl.UCharacterProperty",
      "com.ibm.icu.impl.Utility",
      "com.ibm.icu.text.RuleBasedCollator$UCAConstants",
      "com.ibm.icu.text.RuleBasedCollator$LeadByteConstants",
      "com.ibm.icu.text.CollatorReader$2",
      "com.ibm.icu.text.CollatorReader$3",
      "com.ibm.icu.text.CollatorReader",
      "com.ibm.icu.lang.UCharacter",
      "com.ibm.icu.impl.Trie",
      "com.ibm.icu.impl.IntTrie",
      "com.ibm.icu.text.RuleBasedCollator$DataManipulate",
      "com.ibm.icu.impl.ImplicitCEGenerator",
      "com.ibm.icu.text.RuleBasedCollator$ContractionInfo",
      "com.ibm.icu.impl.CacheBase",
      "com.ibm.icu.impl.SoftCache",
      "com.ibm.icu.impl.Norm2AllModes$1",
      "com.ibm.icu.text.Normalizer2",
      "com.ibm.icu.impl.Norm2AllModes$NoopNormalizer2",
      "com.ibm.icu.impl.Norm2AllModes",
      "com.ibm.icu.impl.Norm2AllModes$Norm2AllModesSingleton",
      "com.ibm.icu.impl.Normalizer2Impl$IsAcceptable",
      "com.ibm.icu.impl.Normalizer2Impl$1",
      "com.ibm.icu.impl.Normalizer2Impl",
      "com.ibm.icu.impl.Norm2AllModes$Normalizer2WithImpl",
      "com.ibm.icu.impl.Norm2AllModes$ComposeNormalizer2",
      "com.ibm.icu.impl.Norm2AllModes$DecomposeNormalizer2",
      "com.ibm.icu.impl.Norm2AllModes$FCDNormalizer2",
      "com.ibm.icu.impl.Norm2AllModes$NFCSingleton",
      "com.ibm.icu.text.CollationElementIterator",
      "com.ibm.icu.text.CollationElementIterator$Backup",
      "com.ibm.icu.text.UCharacterIterator",
      "com.ibm.icu.impl.StringUCharacterIterator",
      "com.ibm.icu.text.RuleBasedCollator$shiftValues",
      "com.ibm.icu.util.UResourceBundle$ResourceCacheKey",
      "com.ibm.icu.util.UResourceBundle",
      "com.ibm.icu.impl.ICUResourceBundle$2",
      "com.ibm.icu.impl.ICUResourceBundle",
      "com.ibm.icu.impl.ICUResourceBundleReader",
      "com.ibm.icu.impl.ICUData$3",
      "com.ibm.icu.impl.ICUResourceBundleImpl",
      "com.ibm.icu.impl.ICUResourceBundleImpl$ResourceContainer",
      "com.ibm.icu.impl.ICUResourceBundleImpl$ResourceTable",
      "com.ibm.icu.impl.ICUResourceBundleReader$Container",
      "com.ibm.icu.impl.ICUResourceBundleReader$Table",
      "com.ibm.icu.impl.ICUResourceBundleReader$Table1632",
      "com.ibm.icu.impl.ICUResourceBundleReader$ByteSequence",
      "com.ibm.icu.impl.ICUResourceBundleReader$Table16",
      "com.ibm.icu.impl.ICUResourceBundleImpl$ResourceString",
      "com.ibm.icu.text.RuleBasedCollator",
      "com.ibm.icu.text.Collator$ServiceShim",
      "com.ibm.icu.impl.ICUNotifier",
      "com.ibm.icu.impl.ICUService",
      "com.ibm.icu.impl.ICULocaleService",
      "com.ibm.icu.text.CollatorServiceShim$CService",
      "com.ibm.icu.impl.ICURWLock",
      "com.ibm.icu.impl.ICURWLock$Stats",
      "com.ibm.icu.impl.ICULocaleService$LocaleKeyFactory",
      "com.ibm.icu.impl.ICULocaleService$ICUResourceBundleFactory",
      "com.ibm.icu.text.CollatorServiceShim$CService$1CollatorFactory",
      "com.ibm.icu.text.CollatorServiceShim",
      "com.ibm.icu.impl.ICUService$Key",
      "com.ibm.icu.impl.ICULocaleService$LocaleKey",
      "com.ibm.icu.impl.ICUResourceBundle$AvailEntry",
      "com.ibm.icu.impl.ICUResourceBundle$1",
      "com.ibm.icu.impl.URLHandler",
      "com.ibm.icu.impl.URLHandler$JarURLHandler",
      "com.ibm.icu.impl.ICUResourceBundle$1$1",
      "com.ibm.icu.text.CollationParsedRuleBuilder$InverseUCA",
      "com.ibm.icu.text.CollationParsedRuleBuilder",
      "com.ibm.icu.text.CollationParsedRuleBuilder$CEGenerator",
      "com.ibm.icu.text.CollationParsedRuleBuilder$WeightRange",
      "com.ibm.icu.text.CollationParsedRuleBuilder$Elements",
      "com.ibm.icu.text.CollationRuleParser$Token",
      "com.ibm.icu.text.CanonicalIterator",
      "com.ibm.icu.impl.Trie2Writable",
      "com.ibm.icu.impl.Trie2$Trie2Iterator",
      "com.ibm.icu.impl.Trie2$Range",
      "org.apache.lucene.util.BytesRef$UTF8SortedAsUnicodeComparator",
      "org.apache.lucene.util.BytesRef$UTF8SortedAsUTF16Comparator",
      "org.apache.lucene.util.BytesRef",
      "org.apache.lucene.util.CharsRef$UTF16SortedAsUTF8Comparator",
      "org.apache.lucene.util.CharsRef",
      "org.apache.lucene.util.UnicodeUtil",
      "org.apache.lucene.util.ArrayUtil",
      "com.ibm.icu.impl.locale.AsciiUtil$CaseInsensitiveKey",
      "com.ibm.icu.impl.locale.AsciiUtil",
      "com.ibm.icu.impl.locale.LanguageTag",
      "com.ibm.icu.impl.locale.ParseStatus",
      "com.ibm.icu.impl.locale.StringTokenIterator",
      "com.ibm.icu.impl.locale.InternalLocaleBuilder$CaseInsensitiveChar",
      "com.ibm.icu.impl.locale.InternalLocaleBuilder",
      "com.ibm.icu.impl.locale.LocaleObjectCache",
      "com.ibm.icu.impl.locale.BaseLocale$Cache",
      "com.ibm.icu.impl.locale.BaseLocale$Key",
      "com.ibm.icu.impl.locale.LocaleObjectCache$CacheEntry",
      "com.ibm.icu.impl.locale.BaseLocale",
      "com.ibm.icu.impl.locale.Extension",
      "com.ibm.icu.impl.locale.UnicodeLocaleExtension",
      "com.ibm.icu.impl.locale.LocaleExtensions",
      "com.ibm.icu.impl.LocaleIDParser$1",
      "org.apache.lucene.LucenePackage",
      "org.apache.lucene.util.Constants",
      "com.ibm.icu.impl.LocaleIDs",
      "com.ibm.icu.util.UResourceBundleIterator",
      "com.ibm.icu.text.LocaleDisplayNames",
      "com.ibm.icu.text.LocaleDisplayNames$DialectHandling",
      "com.ibm.icu.impl.LocaleDisplayNamesImpl$Cache",
      "com.ibm.icu.impl.LocaleDisplayNamesImpl",
      "com.ibm.icu.impl.LocaleDisplayNamesImpl$DataTables",
      "com.ibm.icu.impl.LocaleDisplayNamesImpl$ICUDataTables",
      "com.ibm.icu.impl.ICULangDataTables",
      "com.ibm.icu.impl.LocaleDisplayNamesImpl$LangDataTables",
      "com.ibm.icu.impl.LocaleDisplayNamesImpl$DataTable",
      "com.ibm.icu.impl.LocaleDisplayNamesImpl$ICUDataTable",
      "com.ibm.icu.impl.ICURegionDataTables",
      "com.ibm.icu.impl.LocaleDisplayNamesImpl$RegionDataTables",
      "com.ibm.icu.impl.ICUResourceTableAccess",
      "com.ibm.icu.impl.LocaleDisplayNamesImpl$Appender",
      "com.ibm.icu.text.UFormat",
      "com.ibm.icu.text.MessageFormat",
      "com.ibm.icu.util.StringTokenizer",
      "com.ibm.icu.util.ULocale$1ULocaleAcceptLanguageQ",
      "com.ibm.icu.text.UnicodeSet$UnicodeSetIterator2",
      "com.ibm.icu.impl.LocaleUtility",
      "com.ibm.icu.util.ByteArrayWrapper",
      "com.ibm.icu.text.RawCollationKey",
      "com.ibm.icu.text.UnicodeSet$SpanCondition",
      "com.ibm.icu.text.MessageFormat$Field",
      "com.ibm.icu.text.Collator$CollatorFactory",
      "com.ibm.icu.text.CollatorServiceShim$1CFactory",
      "com.ibm.icu.impl.ICULocaleService$SimpleLocaleKeyFactory",
      "com.ibm.icu.impl.ICUResourceBundleImpl$ResourceBinary",
      "com.ibm.icu.text.CollatorReader$1",
      "com.ibm.icu.impl.ICUService$CacheEntry"
    );
  }
}