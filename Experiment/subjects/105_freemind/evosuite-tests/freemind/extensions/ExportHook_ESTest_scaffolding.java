/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Mar 17 21:17:11 GMT 2024
 */

package freemind.extensions;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ExportHook_ESTest_scaffolding {

  @org.junit.jupiter.api.extension.RegisterExtension
  public org.evosuite.runtime.vnet.NonFunctionalRequirementExtension nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementExtension();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeAll
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "freemind.extensions.ExportHook"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ExportHook_ESTest_scaffolding.class.getClassLoader() ,
      "freemind.main.FreeMindMain$VersionInformation",
      "freemind.controller.MapModuleManager$MapModuleChangeObserver",
      "freemind.controller.Controller",
      "freemind.view.MapModule",
      "freemind.extensions.ModeControllerHookAdapter",
      "freemind.modes.MapAdapter",
      "freemind.main.Tools$NameMnemonicHolder",
      "freemind.modes.NodeAdapter",
      "freemind.modes.MindMapNode",
      "freemind.modes.Mode",
      "freemind.main.Tools",
      "freemind.view.mindmapview.MapView",
      "freemind.modes.ModeController$NodeLifetimeListener",
      "freemind.extensions.MindMapHook",
      "freemind.extensions.HookAdapter",
      "freemind.extensions.ExportHook",
      "freemind.view.mindmapview.MainView",
      "freemind.modes.ModeController$NodeSelectionListener",
      "freemind.main.XMLParseException",
      "freemind.view.mindmapview.NodeView",
      "freemind.extensions.MindMapHook$PluginBaseClassSearcher",
      "freemind.main.FreeMindMain",
      "freemind.modes.MindMap",
      "freemind.controller.MapModuleManager",
      "freemind.main.FreeMindStarter$ProxyAuthenticator",
      "freemind.controller.StructuredMenuHolder",
      "freemind.extensions.HookFactory",
      "freemind.extensions.ModeControllerHook",
      "freemind.modes.FreeMindFileDialog",
      "freemind.main.Resources",
      "freemind.extensions.ExportHook$ImageFilter",
      "freemind.common.TextTranslator",
      "freemind.modes.attributes.AttributeController",
      "tests.freemind.FreeMindMainMock",
      "freemind.common.NamedObject",
      "freemind.main.FreeMindStarter",
      "org.apache.commons.logging.impl.Jdk14Logger",
      "freemind.modes.ModeController"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ExportHook_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "freemind.extensions.HookAdapter",
      "freemind.extensions.ModeControllerHookAdapter",
      "freemind.extensions.ExportHook",
      "freemind.extensions.ExportHook$ImageFilter",
      "freemind.main.Resources",
      "tests.freemind.FreeMindMainMock",
      "freemind.main.FreeMindStarter",
      "freemind.extensions.NodeHookAdapter",
      "freemind.modes.mindmapmode.hooks.MindMapNodeHookAdapter",
      "plugins.collaboration.socket.SocketBasics",
      "plugins.collaboration.socket.SocketConnectionHook",
      "freemind.main.Tools",
      "freemind.extensions.PermanentNodeHookAdapter",
      "freemind.modes.mindmapmode.hooks.PermanentMindMapNodeHookAdapter",
      "accessories.plugins.ClonePlugin",
      "org.hsqldb.lib.FileUtil",
      "freemind.modes.ControllerAdapter",
      "freemind.modes.viewmodes.ViewControllerAdapter",
      "freemind.modes.browsemode.BrowseController",
      "freemind.modes.ControllerAdapter$ControllerPopupMenuListener",
      "freemind.modes.mindmapmode.hooks.MindMapHookAdapter",
      "plugins.map.MapDialog",
      "org.apache.batik.gvt.AbstractGraphicsNode",
      "org.apache.batik.gvt.CompositeGraphicsNode",
      "org.apache.batik.gvt.CanvasGraphicsNode",
      "org.apache.commons.logging.impl.Jdk14Logger",
      "freemind.modes.Mode",
      "freemind.modes.schememode.SchemeMode",
      "freemind.main.FreeMindMain$VersionInformation",
      "freemind.main.FreeMind",
      "freemind.main.FreeMindApplet",
      "freemind.modes.browsemode.BrowseMode",
      "freemind.modes.filemode.FileController",
      "freemind.modes.mindmapmode.MindMapMode",
      "freemind.modes.mindmapmode.actions.ToggleFoldedAction",
      "freemind.modes.schememode.SchemeController",
      "freemind.modes.filemode.FileMode",
      "org.openstreetmap.gui.jmapviewer.OsmTileLoader",
      "org.openstreetmap.gui.jmapviewer.OsmFileCacheTileLoader",
      "org.apache.xml.dtm.ref.IncrementalSAXSource_Filter",
      "org.apache.xml.dtm.ref.CoroutineManager",
      "org.apache.xml.serializer.SerializerBase",
      "org.apache.xml.serializer.ToSAXHandler",
      "org.apache.xml.serializer.ToHTMLSAXHandler",
      "org.apache.xml.serializer.AttributesImplSerializer",
      "org.apache.xml.serializer.ElemContext",
      "org.apache.xalan.processor.TransformerFactoryImpl",
      "org.apache.xml.utils.DefaultErrorHandler",
      "org.apache.xml.utils.UnImplNode",
      "org.apache.xalan.templates.ElemTemplateElement",
      "org.apache.xalan.processor.XSLTElementProcessor",
      "org.apache.xalan.processor.ProcessorTemplateElem",
      "org.apache.xalan.processor.ProcessorLRE",
      "org.apache.xml.utils.StylesheetPIHandler",
      "org.apache.xml.utils.TreeWalker",
      "org.apache.xml.utils.NSInfo",
      "org.apache.xml.utils.DOMHelper",
      "org.apache.xml.utils.DOM2Helper",
      "org.apache.xml.res.XMLMessages",
      "org.apache.xpath.res.XPATHMessages",
      "org.apache.xalan.res.XSLMessages",
      "org.apache.xalan.res.XSLTErrorResources",
      "org.apache.xalan.res.XSLTErrorResources_en",
      "org.openstreetmap.gui.jmapviewer.Tile",
      "org.apache.xml.serializer.ToUnknownStream",
      "org.apache.xml.serializer.SecuritySupport12",
      "org.apache.xml.serializer.SecuritySupport",
      "org.apache.xml.serializer.SecuritySupport12$4",
      "org.apache.xml.serializer.ToStream",
      "org.apache.xml.serializer.ToXMLStream",
      "org.apache.xml.serializer.ToStream$BoolStack",
      "org.apache.xml.serializer.EncodingInfo",
      "org.apache.xml.serializer.CharInfo",
      "org.apache.xml.serializer.CharInfo$1",
      "org.apache.xml.serializer.CharInfo$CharKey",
      "org.apache.xml.serializer.NamespaceMappings",
      "org.apache.xml.serializer.NamespaceMappings$Stack",
      "org.apache.xml.serializer.NamespaceMappings$MappingRecord",
      "org.apache.xalan.transformer.TransformerIdentityImpl",
      "org.apache.xalan.templates.OutputProperties",
      "org.apache.xml.serializer.OutputPropertiesFactory",
      "org.apache.xml.serializer.OutputPropertiesFactory$1",
      "org.apache.xml.serializer.EmptySerializer",
      "org.apache.xalan.templates.ElemUse",
      "org.apache.xalan.templates.ElemAttributeSet",
      "freemind.modes.mindmapmode.MindMapController",
      "org.apache.xml.serializer.ToXMLSAXHandler",
      "org.apache.xml.serializer.ToHTMLStream$Trie",
      "org.apache.xml.serializer.ToHTMLStream$Trie$Node",
      "org.apache.xml.serializer.ElemDesc",
      "org.apache.xml.serializer.utils.StringToIntTable",
      "org.apache.xml.serializer.ToHTMLStream",
      "org.apache.xalan.transformer.TransformerImpl",
      "org.apache.xml.utils.ObjectPool",
      "org.apache.xml.serializer.ToTextStream",
      "org.apache.xml.utils.ObjectVector",
      "org.apache.xml.utils.ObjectStack",
      "org.apache.xml.utils.NodeVector",
      "org.apache.xalan.transformer.KeyManager",
      "org.apache.xml.utils.BoolStack",
      "org.apache.xalan.trace.TraceManager",
      "org.apache.batik.dom.AbstractNode$1",
      "org.apache.batik.dom.AbstractNode",
      "org.apache.batik.dom.AbstractChildNode",
      "org.apache.batik.dom.GenericDocumentType",
      "org.apache.xerces.dom.CoreDOMImplementationImpl",
      "org.apache.xerces.dom.DOMImplementationImpl",
      "org.apache.xerces.dom.ASDOMImplementationImpl",
      "org.apache.batik.dom.AbstractParentNode",
      "org.apache.batik.dom.AbstractDocument",
      "org.apache.batik.dom.AbstractStylableDocument",
      "org.apache.batik.dom.svg.SVGOMDocument",
      "org.apache.batik.i18n.LocalizableSupport",
      "org.apache.batik.i18n.LocaleGroup",
      "org.apache.batik.dom.AbstractParentNode$ChildNodes",
      "org.apache.batik.dom.AbstractParentChildNode",
      "org.apache.batik.dom.AbstractElement",
      "org.apache.batik.dom.svg.AbstractElement",
      "org.apache.batik.dom.svg.SVGOMElement",
      "org.apache.batik.dom.svg.SVGStylableElement",
      "org.apache.batik.dom.svg.AttributeInitializer",
      "org.apache.batik.dom.util.DoublyIndexedTable",
      "org.apache.batik.dom.util.DoublyIndexedTable$Entry",
      "org.apache.batik.dom.svg.SVGOMSVGElement",
      "org.apache.batik.dom.AbstractElement$NamedNodeHashMap",
      "org.apache.batik.dom.svg.AbstractElement$ExtendedNamedNodeHashMap",
      "org.apache.batik.dom.AbstractAttr",
      "org.apache.batik.dom.GenericAttr",
      "org.apache.batik.xml.XMLCharacters",
      "org.apache.batik.xml.XMLUtilities",
      "org.apache.batik.dom.util.DOMUtilities",
      "org.apache.batik.dom.AbstractCharacterData",
      "org.apache.batik.dom.AbstractText",
      "org.apache.batik.dom.GenericText",
      "org.apache.batik.dom.AbstractElement$Entry",
      "org.apache.batik.dom.AbstractAttrNS",
      "org.apache.batik.dom.GenericAttrNS",
      "org.apache.batik.dom.svg.XMLBaseSupport",
      "freemind.controller.Controller",
      "freemind.modes.ModesCreator",
      "freemind.controller.ColorSwatch",
      "freemind.controller.Controller$BackgroundSwatch",
      "freemind.controller.Controller$ShowAllAttributesAction",
      "freemind.controller.Controller$ShowSelectedAttributesAction",
      "freemind.controller.Controller$HideAllAttributesAction",
      "org.hsqldb.lib.HsqlByteArrayInputStream",
      "org.hsqldb.rowio.RowInputBase",
      "org.hsqldb.rowio.RowInputBinary",
      "org.apache.xml.serializer.ToTextSAXHandler",
      "org.apache.xml.res.XMLErrorResources",
      "org.apache.xml.res.XMLErrorResources_en",
      "org.apache.batik.svggen.DefaultImageHandler",
      "org.apache.batik.svggen.AbstractImageHandlerEncoder",
      "org.apache.batik.svggen.ImageHandlerJPEGEncoder",
      "org.apache.batik.svggen.SVGGraphics2DRuntimeException",
      "org.apache.xalan.templates.Stylesheet",
      "org.apache.xalan.templates.StylesheetComposed",
      "org.apache.xalan.templates.StylesheetRoot",
      "org.apache.xpath.XPath",
      "org.apache.xpath.Expression",
      "org.apache.xpath.functions.Function",
      "org.apache.xpath.functions.FuncCurrent",
      "org.apache.xpath.functions.FuncLast",
      "org.apache.xpath.functions.FuncPosition",
      "org.apache.xpath.functions.FunctionOneArg",
      "org.apache.xpath.functions.FuncCount",
      "org.apache.xpath.functions.FuncId",
      "org.apache.xpath.functions.Function2Args",
      "org.apache.xalan.templates.FuncKey",
      "org.apache.xpath.functions.FunctionDef1Arg",
      "org.apache.xpath.functions.FuncLocalPart",
      "org.apache.xpath.functions.FuncNamespace",
      "org.apache.xpath.functions.FuncQname",
      "org.apache.xpath.functions.FuncGenerateId",
      "org.apache.xpath.functions.FuncNot",
      "org.apache.xpath.functions.FuncTrue",
      "org.apache.xpath.functions.FuncFalse",
      "org.apache.xpath.functions.FuncBoolean",
      "org.apache.xpath.functions.FuncLang",
      "org.apache.xpath.functions.FuncNumber",
      "org.apache.xpath.functions.FuncFloor",
      "org.apache.xpath.functions.FuncCeiling",
      "org.apache.xpath.functions.FuncRound",
      "org.apache.xpath.functions.FuncSum",
      "org.apache.xpath.functions.FuncString",
      "org.apache.xpath.functions.FuncStartsWith",
      "org.apache.xpath.functions.FuncContains",
      "org.apache.xpath.functions.FuncSubstringBefore",
      "org.apache.xpath.functions.FuncSubstringAfter",
      "org.apache.xpath.functions.FuncNormalizeSpace",
      "org.apache.xpath.functions.Function3Args",
      "org.apache.xpath.functions.FuncTranslate",
      "org.apache.xpath.functions.FunctionMultiArgs",
      "org.apache.xpath.functions.FuncConcat",
      "org.apache.xpath.functions.FuncSystemProperty",
      "org.apache.xpath.functions.FuncExtFunctionAvailable",
      "org.apache.xpath.functions.FuncExtElementAvailable",
      "org.apache.xpath.functions.FuncSubstring",
      "org.apache.xpath.functions.FuncStringLength",
      "org.apache.xpath.functions.FuncDoclocation",
      "org.apache.xpath.functions.FuncUnparsedEntityURI",
      "org.apache.xpath.compiler.FunctionTable",
      "org.apache.xpath.compiler.XPathParser",
      "org.apache.xpath.compiler.OpMap",
      "org.apache.xpath.compiler.Compiler",
      "org.apache.xpath.compiler.Lexer",
      "org.apache.xpath.compiler.OpMapVector",
      "org.apache.xpath.compiler.Keywords",
      "org.apache.xpath.axes.WalkerFactory",
      "org.apache.xpath.objects.XObject",
      "org.apache.xpath.objects.XNumber",
      "org.apache.xpath.patterns.NodeTest",
      "org.apache.xpath.axes.PredicatedNodeTest",
      "org.apache.xpath.axes.LocPathIterator",
      "org.apache.xpath.axes.ChildIterator",
      "org.apache.xpath.axes.IteratorPool",
      "org.apache.xalan.templates.ElemTemplate",
      "org.apache.xpath.patterns.StepPattern",
      "org.apache.xalan.templates.ElemForEach",
      "org.apache.xalan.templates.ElemCallTemplate",
      "org.apache.xalan.templates.ElemApplyTemplates",
      "org.apache.xpath.patterns.UnionPattern",
      "org.apache.xalan.templates.ElemValueOf",
      "org.apache.xpath.axes.SelfIteratorNoPredicate",
      "org.apache.xml.dtm.DTMManager",
      "org.apache.xpath.XPathContext",
      "org.apache.xml.utils.IntVector",
      "org.apache.xml.utils.IntStack",
      "org.apache.xml.utils.XMLStringFactory",
      "org.apache.xpath.objects.XMLStringFactoryImpl",
      "org.apache.xml.dtm.ObjectFactory",
      "org.apache.xml.dtm.SecuritySupport12",
      "org.apache.xml.dtm.SecuritySupport",
      "org.apache.xml.dtm.SecuritySupport12$4",
      "org.apache.xml.dtm.SecuritySupport12$7",
      "org.apache.xml.dtm.SecuritySupport12$1",
      "org.apache.xml.dtm.SecuritySupport12$2",
      "org.apache.xml.dtm.SecuritySupport12$3",
      "org.apache.xml.dtm.SecuritySupport12$6",
      "org.apache.xml.dtm.ref.DTMManagerDefault",
      "org.apache.xml.dtm.ref.ExtendedType",
      "org.apache.xml.dtm.ref.ExpandedNameTable",
      "org.apache.xml.dtm.ref.ExpandedNameTable$HashEntry",
      "org.apache.xpath.SourceTreeManager",
      "org.apache.xpath.XPathContext$XPathExpressionContext",
      "org.apache.xpath.VariableStack",
      "org.apache.xalan.transformer.StackGuard",
      "org.hsqldb.persist.HsqlProperties",
      "org.hsqldb.jdbc.jdbcConnection",
      "org.hsqldb.DatabaseURL",
      "org.hsqldb.jdbc.Util",
      "org.hsqldb.store.BaseHashMap",
      "org.hsqldb.lib.HashMap",
      "org.hsqldb.store.HashIndex",
      "org.hsqldb.lib.BaseList",
      "org.hsqldb.lib.HsqlArrayList",
      "org.hsqldb.resources.BundleHandler",
      "org.hsqldb.Trace",
      "org.hsqldb.HsqlException",
      "org.apache.xalan.processor.StylesheetHandler",
      "org.apache.xalan.processor.XSLTElementDef",
      "org.apache.xalan.processor.XSLTSchema",
      "org.apache.xalan.processor.XSLTAttributeDef",
      "org.apache.xml.utils.StringToIntTable",
      "org.apache.xalan.processor.ProcessorCharacters",
      "org.apache.xalan.templates.ElemTextLiteral",
      "org.apache.xalan.templates.ElemLiteralResult",
      "org.apache.xalan.processor.ProcessorUnknown",
      "org.apache.xalan.templates.ElemUnknown",
      "org.apache.xml.utils.QName",
      "org.apache.xalan.templates.ElemCopyOf",
      "org.apache.xalan.transformer.DecimalToRoman",
      "org.apache.xalan.templates.ElemNumber",
      "org.apache.xalan.templates.ElemSort",
      "org.apache.xalan.templates.ElemWithParam",
      "org.apache.xalan.templates.ElemApplyImport",
      "org.apache.xalan.templates.ElemIf",
      "org.apache.xalan.templates.ElemWhen",
      "org.apache.xalan.templates.ElemOtherwise",
      "org.apache.xalan.templates.ElemChoose",
      "org.apache.xalan.templates.ElemElement",
      "org.apache.xalan.templates.ElemAttribute",
      "org.apache.xalan.templates.ElemVariable",
      "org.apache.xalan.templates.ElemParam",
      "org.apache.xalan.processor.ProcessorText",
      "org.apache.xalan.templates.ElemText",
      "org.apache.xalan.templates.ElemPI",
      "org.apache.xalan.templates.ElemComment",
      "org.apache.xalan.templates.ElemCopy",
      "org.apache.xalan.templates.ElemMessage",
      "org.apache.xalan.templates.ElemFallback",
      "org.apache.xalan.processor.ProcessorExsltFunction",
      "org.apache.xalan.templates.ElemExsltFunction",
      "org.apache.xalan.processor.ProcessorExsltFuncResult",
      "org.apache.xalan.templates.ElemExsltFuncResult",
      "org.apache.xalan.processor.ProcessorInclude",
      "org.apache.xalan.processor.ProcessorImport",
      "org.apache.xalan.processor.ProcessorPreserveSpace",
      "org.apache.xalan.processor.ProcessorStripSpace",
      "org.apache.xalan.processor.ProcessorOutputElem",
      "org.apache.xalan.processor.ProcessorKey",
      "org.apache.xalan.processor.ProcessorDecimalFormat",
      "org.apache.xalan.processor.ProcessorAttributeSet",
      "org.apache.xalan.processor.ProcessorGlobalVariableDecl",
      "org.apache.xalan.processor.ProcessorGlobalParamDecl",
      "org.apache.xalan.processor.ProcessorTemplate",
      "org.apache.xalan.processor.ProcessorNamespaceAlias",
      "org.apache.xalan.templates.ElemExtensionScript",
      "org.apache.xalan.templates.ElemExtensionDecl",
      "org.apache.xalan.processor.ProcessorStylesheetElement",
      "org.apache.xalan.processor.ProcessorStylesheetDoc",
      "org.apache.xalan.templates.FuncDocument",
      "org.apache.xalan.templates.FuncFormatNumb",
      "org.apache.xml.utils.NamespaceSupport2",
      "org.apache.xml.utils.Context2",
      "org.apache.xml.utils.ListingErrorHandler",
      "org.hsqldb.Result",
      "org.hsqldb.Session",
      "org.apache.batik.extension.ExtensionElement",
      "org.apache.batik.extension.StylableExtensionElement",
      "org.apache.batik.extension.PrefixableStylableExtensionElement",
      "org.apache.batik.extension.svg.BatikStarElement",
      "freemind.modes.common.plugins.MapNodePositionHolderBase",
      "plugins.map.MapNodePositionHolder",
      "org.openstreetmap.gui.jmapviewer.Coordinate"
    );
  }
}
