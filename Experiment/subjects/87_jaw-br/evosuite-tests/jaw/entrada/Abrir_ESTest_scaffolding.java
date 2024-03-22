/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Mar 21 09:40:25 GMT 2024
 */

package jaw.entrada;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Abrir_ESTest_scaffolding {

  @org.junit.jupiter.api.extension.RegisterExtension
  public org.evosuite.runtime.vnet.NonFunctionalRequirementExtension nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementExtension();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeAll
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "jaw.entrada.Abrir"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Abrir_ESTest_scaffolding.class.getClassLoader() ,
      "jaw.gui.ProcessarEntidadesTabela$2",
      "jaw.gui.ProcessarEntidadesTabela$1",
      "com.thoughtworks.xstream.XStream",
      "net.sf.cglib.core.Transformer",
      "net.sf.cglib.core.EmitUtils$ArrayDelimiters",
      "jaw.gui.ProcessarEntidadesTabela$4",
      "com.thoughtworks.xstream.converters.extended.StackTraceElementFactory",
      "jaw.gui.ProcessarEntidadesTabela$3",
      "net.sf.cglib.core.RemappingCodeVisitor$State",
      "com.thoughtworks.xstream.XStream$InitializationException",
      "com.thoughtworks.xstream.converters.extended.EncodedByteArrayConverter",
      "net.sf.cglib.asm.Constants",
      "com.thoughtworks.xstream.io.xml.XppReader",
      "jaw.entrada.SerializacaoXML",
      "com.thoughtworks.xstream.converters.extended.CurrencyConverter",
      "org.xmlpull.v1.XmlPullParser",
      "net.sf.cglib.core.KeyFactory$Generator",
      "com.thoughtworks.xstream.converters.reflection.SelfStreamingInstanceChecker",
      "com.thoughtworks.xstream.converters.Converter",
      "com.thoughtworks.xstream.core.util.Base64Encoder",
      "net.sf.cglib.proxy.CallbackFilter",
      "com.thoughtworks.xstream.converters.basic.BigDecimalConverter",
      "com.thoughtworks.xstream.alias.ClassMapper",
      "com.thoughtworks.xstream.converters.SingleValueConverter",
      "com.thoughtworks.xstream.converters.reflection.ReflectionProvider$Visitor",
      "com.thoughtworks.xstream.converters.MarshallingContext",
      "net.sf.cglib.core.CodeEmitter$State",
      "com.thoughtworks.xstream.mapper.OuterClassMapper",
      "com.thoughtworks.xstream.converters.reflection.SerializableConverter$UnserializableParentsReflectionProvider",
      "com.thoughtworks.xstream.io.HierarchicalStreamReader",
      "com.thoughtworks.xstream.core.util.CompositeClassLoader",
      "com.thoughtworks.xstream.converters.ConverterLookup",
      "com.thoughtworks.xstream.mapper.ClassAliasingMapper",
      "net.sf.cglib.core.Constants",
      "com.thoughtworks.xstream.mapper.CannotResolveClassException",
      "net.sf.cglib.core.AbstractClassGenerator",
      "com.thoughtworks.xstream.converters.reflection.FieldDictionary",
      "com.thoughtworks.xstream.mapper.EnumMapper",
      "net.sf.cglib.asm.CodeVisitor",
      "jaw.gui.ProcessarEntidades",
      "com.thoughtworks.xstream.core.util.FastStack",
      "jaw.entrada.Serializacao",
      "net.sf.cglib.proxy.Enhancer$1",
      "com.thoughtworks.xstream.converters.ConversionException",
      "com.thoughtworks.xstream.mapper.MapperWrapper",
      "com.thoughtworks.xstream.mapper.Mapper",
      "com.thoughtworks.xstream.converters.extended.FileConverter",
      "com.thoughtworks.xstream.core.util.PrioritizedList$PrioritizedItem",
      "net.sf.cglib.core.ClassGenerator",
      "com.thoughtworks.xstream.mapper.CGLIBMapper",
      "net.sf.cglib.core.ReflectUtils$4",
      "com.thoughtworks.xstream.converters.extended.SqlTimestampConverter",
      "net.sf.cglib.core.ClassNameReader$EarlyExitException",
      "com.thoughtworks.xstream.converters.UnmarshallingContext",
      "net.sf.cglib.core.ReflectUtils$1",
      "com.thoughtworks.xstream.converters.extended.ColorConverter",
      "net.sf.cglib.core.ReflectUtils$2",
      "net.sf.cglib.core.ReflectUtils$3",
      "net.sf.cglib.core.ReflectUtils",
      "com.thoughtworks.xstream.converters.basic.DoubleConverter",
      "jaw.metamodelo.Entidade",
      "com.thoughtworks.xstream.converters.collections.CharArrayConverter",
      "com.thoughtworks.xstream.converters.collections.ArrayConverter",
      "com.thoughtworks.xstream.converters.extended.JavaMethodConverter",
      "com.thoughtworks.xstream.converters.enums.EnumConverter",
      "com.thoughtworks.xstream.converters.collections.MapConverter",
      "com.thoughtworks.xstream.io.xml.AbstractPullReader$Event",
      "net.sf.cglib.core.AbstractClassGenerator$1",
      "net.sf.cglib.core.ObjectSwitchCallback",
      "org.xmlpull.mxp1.MXParser",
      "com.thoughtworks.xstream.io.HierarchicalStreamWriter",
      "com.thoughtworks.xstream.io.xml.XppDriver",
      "net.sf.cglib.core.DefaultGeneratorStrategy",
      "com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter",
      "com.thoughtworks.xstream.converters.reflection.CGLIBEnhancedConverter$CGLIBFilteringReflectionProvider",
      "com.thoughtworks.xstream.core.util.CustomObjectOutputStream",
      "net.sf.cglib.core.DebuggingClassWriter$1",
      "com.thoughtworks.xstream.annotations.AnnotationProvider",
      "com.thoughtworks.xstream.core.util.OrderRetainingMap",
      "com.thoughtworks.xstream.mapper.DynamicProxyMapper",
      "com.thoughtworks.xstream.converters.enums.EnumMapConverter",
      "com.thoughtworks.xstream.converters.basic.ByteConverter",
      "com.thoughtworks.xstream.converters.collections.TreeSetConverter",
      "com.thoughtworks.xstream.converters.extended.LocaleConverter",
      "com.thoughtworks.xstream.core.BaseException",
      "net.sf.cglib.core.RemappingCodeVisitor$IntRef",
      "net.sf.cglib.proxy.Callback",
      "com.thoughtworks.xstream.converters.collections.PropertiesConverter",
      "jaw.entrada.Abrir",
      "net.sf.cglib.core.KeyFactory$2",
      "net.sf.cglib.core.KeyFactory$1",
      "org.xmlpull.v1.XmlPullParserException",
      "net.sf.cglib.core.ClassInfo",
      "net.sf.cglib.core.ClassEmitter$3",
      "net.sf.cglib.core.EmitUtils$9",
      "net.sf.cglib.core.ClassEmitter$1",
      "net.sf.cglib.core.EmitUtils$8",
      "net.sf.cglib.core.EmitUtils$7",
      "net.sf.cglib.core.CodeEmitter",
      "com.thoughtworks.xstream.converters.extended.SubjectConverter",
      "net.sf.cglib.proxy.Enhancer$EnhancerKey",
      "net.sf.cglib.core.Predicate",
      "com.thoughtworks.xstream.mapper.DefaultMapper",
      "com.thoughtworks.xstream.converters.basic.StringConverter",
      "net.sf.cglib.core.ClassEmitter",
      "com.thoughtworks.xstream.mapper.ImmutableTypesMapper",
      "com.thoughtworks.xstream.converters.collections.BitSetConverter",
      "com.thoughtworks.xstream.converters.extended.ThrowableConverter",
      "net.sf.cglib.core.ClassNameReader",
      "net.sf.cglib.core.ProcessSwitchCallback",
      "com.thoughtworks.xstream.converters.reflection.ObjectAccessException",
      "com.thoughtworks.xstream.converters.extended.SqlTimeConverter",
      "jaw.Main",
      "com.thoughtworks.xstream.mapper.AttributeMapper",
      "com.thoughtworks.xstream.mapper.DynamicProxyMapper$DynamicProxy",
      "net.sf.cglib.core.ClassNameReader$1",
      "com.thoughtworks.xstream.mapper.AttributeAliasingMapper",
      "com.thoughtworks.xstream.annotations.AnnotationReflectionConverter",
      "com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider",
      "jaw.entrada.Abrir$1",
      "net.sf.cglib.core.Local",
      "jaw.metamodelo.Atributo",
      "jaw.entrada.Abrir$Filtro",
      "net.sf.cglib.asm.Edge",
      "com.thoughtworks.xstream.mapper.CachingMapper",
      "com.thoughtworks.xstream.converters.extended.RegexPatternConverter",
      "com.thoughtworks.xstream.MarshallingStrategy",
      "com.thoughtworks.xstream.core.util.OrderRetainingMap$ArraySet",
      "net.sf.cglib.asm.ClassWriter",
      "com.thoughtworks.xstream.converters.reflection.SerializableConverter",
      "net.sf.cglib.core.DefaultNamingPolicy",
      "jaw.gui.ProcessarEntidadesTabela",
      "com.thoughtworks.xstream.converters.basic.CharConverter",
      "net.sf.cglib.core.AbstractClassGenerator$Source",
      "com.thoughtworks.xstream.core.util.PrioritizedList$PrioritizedItemIterator",
      "com.thoughtworks.xstream.converters.reflection.FieldKey",
      "com.thoughtworks.xstream.core.DefaultConverterLookup",
      "net.sf.cglib.asm.ClassVisitor",
      "net.sf.cglib.core.DebuggingClassWriter",
      "net.sf.cglib.core.ClassEmitter$FieldInfo",
      "com.thoughtworks.xstream.converters.reflection.SerializationMethodInvoker",
      "com.thoughtworks.xstream.converters.basic.ShortConverter",
      "net.sf.cglib.asm.CodeAdapter",
      "com.thoughtworks.xstream.converters.reflection.CGLIBEnhancedConverter",
      "com.thoughtworks.xstream.core.JVM",
      "com.thoughtworks.xstream.io.xml.AbstractXmlDriver",
      "com.thoughtworks.xstream.mapper.CGLIBMapper$Marker",
      "net.sf.cglib.asm.CodeWriter",
      "net.sf.cglib.core.Customizer",
      "com.thoughtworks.xstream.converters.basic.BigIntegerConverter",
      "com.thoughtworks.xstream.converters.ConverterMatcher",
      "com.thoughtworks.xstream.converters.basic.StringBufferConverter",
      "com.thoughtworks.xstream.core.util.CustomObjectOutputStream$StreamCallback",
      "com.thoughtworks.xstream.core.util.ThreadSafeSimpleDateFormat$1",
      "jaw.entrada.Abrir$Filtro2",
      "com.thoughtworks.xstream.converters.reflection.AbstractAttributedCharacterIteratorAttributeConverter",
      "com.thoughtworks.xstream.mapper.FieldAliasingMapper",
      "com.thoughtworks.xstream.converters.basic.IntConverter",
      "com.thoughtworks.xstream.converters.extended.StackTraceElementConverter",
      "com.thoughtworks.xstream.core.util.Pool$Factory",
      "net.sf.cglib.core.KeyFactory",
      "com.thoughtworks.xstream.converters.extended.JavaClassConverter",
      "net.sf.cglib.core.GeneratorStrategy",
      "com.thoughtworks.xstream.converters.basic.DateConverter",
      "com.thoughtworks.xstream.core.util.CustomObjectInputStream$StreamCallback",
      "com.thoughtworks.xstream.converters.SingleValueConverterWrapper",
      "net.sf.cglib.core.EmitUtils",
      "net.sf.cglib.core.CollectionUtils",
      "com.thoughtworks.xstream.converters.reflection.ReflectionConverter",
      "net.sf.cglib.core.TypeUtils",
      "com.thoughtworks.xstream.converters.basic.LongConverter",
      "com.thoughtworks.xstream.io.StreamException",
      "com.thoughtworks.xstream.converters.extended.GregorianCalendarConverter",
      "com.thoughtworks.xstream.converters.extended.TextAttributeConverter",
      "com.thoughtworks.xstream.converters.extended.CharsetConverter",
      "net.sf.cglib.asm.Type",
      "net.sf.cglib.core.MethodInfo",
      "com.thoughtworks.xstream.io.xml.AbstractXmlReader",
      "com.thoughtworks.xstream.converters.reflection.ImmutableFieldKeySorter",
      "com.thoughtworks.xstream.converters.enums.EnumSetConverter",
      "com.thoughtworks.xstream.mapper.AbstractXmlFriendlyMapper",
      "com.thoughtworks.xstream.alias.CannotResolveClassException",
      "com.thoughtworks.xstream.core.util.Fields",
      "com.thoughtworks.xstream.mapper.Mapper$Null",
      "com.thoughtworks.xstream.core.util.ThreadSafeSimpleDateFormat",
      "com.thoughtworks.xstream.converters.reflection.ExternalizableConverter",
      "com.thoughtworks.xstream.converters.collections.AbstractCollectionConverter",
      "net.sf.cglib.core.RemappingCodeVisitor",
      "com.thoughtworks.xstream.mapper.ImplicitCollectionMapper",
      "net.sf.cglib.core.EmitUtils$ParameterTyper",
      "net.sf.cglib.proxy.CallbackGenerator$Context",
      "net.sf.cglib.core.Signature",
      "com.thoughtworks.xstream.converters.DataHolder",
      "net.sf.cglib.asm.ByteVector",
      "com.thoughtworks.xstream.core.util.CustomObjectInputStream",
      "com.thoughtworks.xstream.converters.extended.DynamicProxyConverter",
      "com.thoughtworks.xstream.mapper.ArrayMapper",
      "com.thoughtworks.xstream.converters.basic.NullConverter",
      "jaw.configuracoes.Configuracao",
      "com.thoughtworks.xstream.core.util.ClassLoaderReference",
      "com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer",
      "com.thoughtworks.xstream.converters.basic.FloatConverter",
      "com.thoughtworks.xstream.converters.extended.SqlDateConverter",
      "com.thoughtworks.xstream.io.xml.AbstractPullReader",
      "com.thoughtworks.xstream.converters.extended.FontConverter",
      "net.sf.cglib.core.NamingPolicy",
      "com.thoughtworks.xstream.converters.collections.TreeMapConverter",
      "net.sf.cglib.asm.Item",
      "net.sf.cglib.asm.Attribute",
      "net.sf.cglib.asm.ClassAdapter",
      "com.thoughtworks.xstream.core.ReferenceByXPathMarshallingStrategy",
      "com.thoughtworks.xstream.mapper.DefaultImplementationsMapper",
      "com.thoughtworks.xstream.converters.reflection.ReflectionProvider",
      "net.sf.cglib.core.CodeGenerationException",
      "com.thoughtworks.xstream.converters.reflection.FieldKeySorter",
      "net.sf.cglib.proxy.Enhancer",
      "com.thoughtworks.xstream.io.HierarchicalStreamDriver",
      "net.sf.cglib.core.ProcessArrayCallback",
      "com.thoughtworks.xstream.converters.reflection.ReflectionProviderWrapper",
      "com.thoughtworks.xstream.core.util.Pool",
      "com.thoughtworks.xstream.converters.ErrorWriter",
      "com.thoughtworks.xstream.mapper.XStream11XmlFriendlyMapper",
      "com.thoughtworks.xstream.converters.basic.URLConverter",
      "com.thoughtworks.xstream.core.util.PrioritizedList",
      "net.sf.cglib.asm.Label",
      "net.sf.cglib.asm.ClassReader",
      "com.thoughtworks.xstream.converters.collections.CollectionConverter",
      "com.thoughtworks.xstream.converters.reflection.AbstractReflectionConverter",
      "com.thoughtworks.xstream.converters.basic.BooleanConverter"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Abrir_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "jaw.entrada.Abrir",
      "jaw.entrada.Abrir$Filtro2",
      "jaw.entrada.Abrir$Filtro",
      "jaw.Main",
      "jaw.gui.ProcessarEntidades",
      "jaw.gui.ProcessarEntidadesTabela",
      "jaw.metamodelo.Atributo",
      "jaw.metamodelo.Entidade",
      "jaw.gui.ProcessarEntidadesTabela$1",
      "jaw.gui.ProcessarEntidadesTabela$2",
      "jaw.gui.ProcessarEntidadesTabela$3",
      "jaw.gui.ProcessarEntidadesTabela$4",
      "jaw.gui.ProcessarEntidadesTree",
      "jaw.gui.JanelaPrincipal",
      "jaw.gui.ProcessarEntidadesTree$1",
      "jaw.entrada.Serializacao",
      "jaw.util.Conversor",
      "jaw.entrada.SerializacaoXML",
      "com.thoughtworks.xstream.XStream",
      "com.thoughtworks.xstream.io.xml.AbstractXmlDriver",
      "com.thoughtworks.xstream.io.xml.XppDriver",
      "com.thoughtworks.xstream.io.xml.XmlFriendlyReplacer",
      "com.thoughtworks.xstream.core.JVM",
      "com.thoughtworks.xstream.converters.reflection.PureJavaReflectionProvider",
      "com.thoughtworks.xstream.converters.reflection.FieldDictionary",
      "com.thoughtworks.xstream.converters.reflection.ImmutableFieldKeySorter",
      "com.thoughtworks.xstream.core.util.ClassLoaderReference",
      "com.thoughtworks.xstream.core.util.CompositeClassLoader",
      "com.thoughtworks.xstream.mapper.DefaultMapper",
      "com.thoughtworks.xstream.mapper.MapperWrapper",
      "com.thoughtworks.xstream.mapper.ClassAliasingMapper",
      "com.thoughtworks.xstream.mapper.FieldAliasingMapper",
      "com.thoughtworks.xstream.mapper.AttributeAliasingMapper",
      "com.thoughtworks.xstream.mapper.AttributeMapper",
      "com.thoughtworks.xstream.mapper.ImplicitCollectionMapper",
      "com.thoughtworks.xstream.mapper.CGLIBMapper",
      "com.thoughtworks.xstream.mapper.DynamicProxyMapper",
      "com.thoughtworks.xstream.mapper.EnumMapper",
      "com.thoughtworks.xstream.mapper.OuterClassMapper",
      "com.thoughtworks.xstream.mapper.ArrayMapper",
      "com.thoughtworks.xstream.mapper.DefaultImplementationsMapper",
      "com.thoughtworks.xstream.mapper.Mapper$Null",
      "com.thoughtworks.xstream.mapper.ImmutableTypesMapper",
      "com.thoughtworks.xstream.mapper.CachingMapper",
      "com.thoughtworks.xstream.core.DefaultConverterLookup",
      "com.thoughtworks.xstream.core.util.PrioritizedList",
      "com.thoughtworks.xstream.annotations.AnnotationProvider",
      "com.thoughtworks.xstream.converters.reflection.AbstractReflectionConverter",
      "com.thoughtworks.xstream.converters.reflection.ReflectionConverter",
      "com.thoughtworks.xstream.annotations.AnnotationReflectionConverter",
      "com.thoughtworks.xstream.converters.reflection.SerializationMethodInvoker",
      "com.thoughtworks.xstream.core.util.PrioritizedList$PrioritizedItem",
      "com.thoughtworks.xstream.core.util.PrioritizedList$PrioritizedItemIterator",
      "com.thoughtworks.xstream.converters.reflection.SerializableConverter",
      "com.thoughtworks.xstream.converters.reflection.ReflectionProviderWrapper",
      "com.thoughtworks.xstream.converters.reflection.SerializableConverter$UnserializableParentsReflectionProvider",
      "com.thoughtworks.xstream.converters.reflection.ExternalizableConverter",
      "com.thoughtworks.xstream.converters.basic.NullConverter",
      "com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter",
      "com.thoughtworks.xstream.converters.basic.IntConverter",
      "com.thoughtworks.xstream.converters.SingleValueConverterWrapper",
      "com.thoughtworks.xstream.converters.basic.FloatConverter",
      "com.thoughtworks.xstream.converters.basic.DoubleConverter",
      "com.thoughtworks.xstream.converters.basic.LongConverter",
      "com.thoughtworks.xstream.converters.basic.ShortConverter",
      "com.thoughtworks.xstream.converters.basic.CharConverter",
      "com.thoughtworks.xstream.converters.basic.BooleanConverter",
      "com.thoughtworks.xstream.converters.basic.ByteConverter",
      "com.thoughtworks.xstream.converters.basic.StringConverter",
      "com.thoughtworks.xstream.converters.basic.StringBufferConverter",
      "com.thoughtworks.xstream.converters.basic.DateConverter",
      "com.thoughtworks.xstream.core.util.ThreadSafeSimpleDateFormat",
      "com.thoughtworks.xstream.core.util.Pool",
      "com.thoughtworks.xstream.core.util.ThreadSafeSimpleDateFormat$1",
      "com.thoughtworks.xstream.converters.collections.BitSetConverter",
      "com.thoughtworks.xstream.converters.basic.URLConverter",
      "com.thoughtworks.xstream.converters.basic.BigIntegerConverter",
      "com.thoughtworks.xstream.converters.basic.BigDecimalConverter",
      "com.thoughtworks.xstream.converters.collections.AbstractCollectionConverter",
      "com.thoughtworks.xstream.converters.collections.ArrayConverter",
      "com.thoughtworks.xstream.converters.collections.CharArrayConverter",
      "com.thoughtworks.xstream.converters.collections.CollectionConverter",
      "com.thoughtworks.xstream.converters.collections.MapConverter",
      "com.thoughtworks.xstream.converters.collections.TreeMapConverter",
      "com.thoughtworks.xstream.converters.collections.TreeSetConverter",
      "com.thoughtworks.xstream.core.util.Fields",
      "com.thoughtworks.xstream.converters.collections.PropertiesConverter",
      "com.thoughtworks.xstream.core.util.Base64Encoder",
      "com.thoughtworks.xstream.converters.extended.EncodedByteArrayConverter",
      "com.thoughtworks.xstream.converters.extended.FileConverter",
      "com.thoughtworks.xstream.converters.extended.SqlTimestampConverter",
      "com.thoughtworks.xstream.converters.extended.SqlTimeConverter",
      "com.thoughtworks.xstream.converters.extended.SqlDateConverter",
      "com.thoughtworks.xstream.converters.extended.DynamicProxyConverter",
      "com.thoughtworks.xstream.mapper.DynamicProxyMapper$DynamicProxy",
      "com.thoughtworks.xstream.converters.extended.JavaClassConverter",
      "com.thoughtworks.xstream.converters.extended.JavaMethodConverter",
      "com.thoughtworks.xstream.converters.extended.FontConverter",
      "com.thoughtworks.xstream.converters.extended.ColorConverter",
      "com.thoughtworks.xstream.converters.reflection.AbstractAttributedCharacterIteratorAttributeConverter",
      "com.thoughtworks.xstream.converters.extended.TextAttributeConverter",
      "com.thoughtworks.xstream.core.util.OrderRetainingMap",
      "com.thoughtworks.xstream.core.util.OrderRetainingMap$ArraySet",
      "com.thoughtworks.xstream.converters.reflection.FieldKey",
      "com.thoughtworks.xstream.converters.extended.LocaleConverter",
      "com.thoughtworks.xstream.converters.extended.GregorianCalendarConverter",
      "com.thoughtworks.xstream.converters.extended.SubjectConverter",
      "com.thoughtworks.xstream.converters.extended.ThrowableConverter",
      "com.thoughtworks.xstream.converters.extended.StackTraceElementFactory",
      "com.thoughtworks.xstream.converters.extended.StackTraceElementConverter",
      "com.thoughtworks.xstream.converters.extended.CurrencyConverter",
      "com.thoughtworks.xstream.converters.extended.RegexPatternConverter",
      "com.thoughtworks.xstream.converters.extended.CharsetConverter",
      "com.thoughtworks.xstream.converters.enums.EnumConverter",
      "com.thoughtworks.xstream.converters.enums.EnumSetConverter",
      "com.thoughtworks.xstream.converters.enums.EnumMapConverter",
      "com.thoughtworks.xstream.converters.reflection.CGLIBEnhancedConverter",
      "com.thoughtworks.xstream.converters.reflection.CGLIBEnhancedConverter$CGLIBFilteringReflectionProvider",
      "net.sf.cglib.core.AbstractClassGenerator",
      "net.sf.cglib.proxy.Enhancer$1",
      "net.sf.cglib.core.AbstractClassGenerator$Source",
      "net.sf.cglib.core.CollectionUtils",
      "net.sf.cglib.core.TypeUtils",
      "net.sf.cglib.core.Signature",
      "net.sf.cglib.asm.Type",
      "net.sf.cglib.core.KeyFactory$1",
      "net.sf.cglib.core.KeyFactory$2",
      "net.sf.cglib.core.KeyFactory",
      "net.sf.cglib.core.KeyFactory$Generator",
      "net.sf.cglib.core.DefaultGeneratorStrategy",
      "net.sf.cglib.core.DefaultNamingPolicy",
      "net.sf.cglib.core.AbstractClassGenerator$1",
      "net.sf.cglib.asm.ClassWriter",
      "net.sf.cglib.core.DebuggingClassWriter",
      "net.sf.cglib.asm.ByteVector",
      "net.sf.cglib.asm.Item",
      "net.sf.cglib.asm.ClassAdapter",
      "net.sf.cglib.core.ClassEmitter",
      "net.sf.cglib.core.ReflectUtils$1",
      "net.sf.cglib.core.ReflectUtils$2",
      "net.sf.cglib.core.ReflectUtils",
      "net.sf.cglib.core.ClassInfo",
      "net.sf.cglib.core.ClassEmitter$1",
      "net.sf.cglib.core.EmitUtils$ArrayDelimiters",
      "net.sf.cglib.core.EmitUtils",
      "net.sf.cglib.asm.CodeWriter",
      "net.sf.cglib.asm.Label",
      "net.sf.cglib.core.Constants",
      "net.sf.cglib.asm.CodeAdapter",
      "net.sf.cglib.core.RemappingCodeVisitor",
      "net.sf.cglib.core.CodeEmitter",
      "net.sf.cglib.core.RemappingCodeVisitor$IntRef",
      "net.sf.cglib.core.RemappingCodeVisitor$State",
      "net.sf.cglib.core.MethodInfo",
      "net.sf.cglib.core.CodeEmitter$State",
      "net.sf.cglib.core.ClassEmitter$FieldInfo",
      "net.sf.cglib.asm.Edge",
      "net.sf.cglib.core.EmitUtils$7",
      "net.sf.cglib.core.Local",
      "net.sf.cglib.core.EmitUtils$8",
      "net.sf.cglib.core.EmitUtils$9",
      "net.sf.cglib.core.DebuggingClassWriter$1",
      "net.sf.cglib.asm.ClassReader",
      "net.sf.cglib.core.ClassNameReader$EarlyExitException",
      "net.sf.cglib.core.ClassNameReader",
      "net.sf.cglib.core.ClassNameReader$1",
      "net.sf.cglib.proxy.Enhancer",
      "com.thoughtworks.xstream.converters.reflection.SelfStreamingInstanceChecker",
      "com.thoughtworks.xstream.core.ReferenceByXPathMarshallingStrategy",
      "org.xmlpull.mxp1.MXParser",
      "com.thoughtworks.xstream.io.xml.AbstractXmlReader",
      "com.thoughtworks.xstream.io.xml.AbstractPullReader",
      "com.thoughtworks.xstream.io.xml.XppReader",
      "com.thoughtworks.xstream.core.util.FastStack",
      "com.thoughtworks.xstream.io.xml.AbstractPullReader$Event",
      "org.xmlpull.v1.XmlPullParserException",
      "org.xmlpull.v1.XmlPullParser",
      "com.thoughtworks.xstream.core.BaseException",
      "com.thoughtworks.xstream.io.StreamException"
    );
  }
}
