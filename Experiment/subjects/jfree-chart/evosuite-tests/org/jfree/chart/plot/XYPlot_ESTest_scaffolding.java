/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Mar 20 05:49:16 GMT 2024
 */

package org.jfree.chart.plot;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class XYPlot_ESTest_scaffolding {

  @org.junit.jupiter.api.extension.RegisterExtension
  public org.evosuite.runtime.vnet.NonFunctionalRequirementExtension nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementExtension();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeAll
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.jfree.chart.plot.XYPlot"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(XYPlot_ESTest_scaffolding.class.getClassLoader() ,
      "org.jfree.chart.event.ChartProgressListener",
      "org.jfree.data.time.TimeTableXYDataset",
      "org.jfree.chart.renderer.xy.XYDotRenderer",
      "org.jfree.chart.labels.StandardPieSectionLabelGenerator",
      "org.jfree.chart.labels.AbstractPieItemLabelGenerator",
      "org.jfree.chart.plot.ValueMarker",
      "org.jfree.data.resources.DataPackageResources",
      "org.jfree.chart.plot.ContourValuePlot",
      "org.jfree.data.time.Minute",
      "org.jfree.chart.plot.ContourPlot",
      "org.jfree.ui.about.Licences",
      "org.jfree.data.general.ValueDataset",
      "org.jfree.chart.axis.MarkerAxisBand",
      "org.jfree.data.general.AbstractSeriesDataset",
      "org.jfree.chart.LegendItemCollection",
      "org.jfree.chart.annotations.XYShapeAnnotation",
      "org.jfree.chart.renderer.xy.XYItemRenderer",
      "org.jfree.chart.axis.CategoryAxis",
      "org.jfree.data.xy.DefaultTableXYDataset",
      "org.jfree.data.RangeInfo",
      "org.jfree.ui.GradientPaintTransformType",
      "org.jfree.chart.renderer.RendererState",
      "org.jfree.data.xy.AbstractIntervalXYDataset",
      "org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer",
      "org.jfree.data.general.CombinedDataset",
      "org.jfree.base.modules.PackageManager",
      "org.jfree.ui.RectangleInsets",
      "org.jfree.chart.entity.StandardEntityCollection",
      "org.jfree.chart.axis.LogarithmicAxis",
      "org.jfree.text.G2TextMeasurer",
      "org.jfree.chart.axis.DateAxis$DefaultTimeline",
      "org.jfree.data.xy.YIntervalSeriesCollection",
      "org.jfree.data.xy.AbstractXYDataset",
      "org.jfree.chart.axis.AxisCollection",
      "org.jfree.data.jdbc.JDBCXYDataset",
      "org.jfree.chart.labels.StandardXYSeriesLabelGenerator",
      "org.jfree.chart.labels.ItemLabelPosition",
      "org.jfree.chart.axis.DateAxis",
      "org.jfree.chart.plot.CategoryPlot",
      "org.jfree.chart.event.MarkerChangeListener",
      "org.jfree.chart.event.PlotChangeEvent",
      "org.jfree.ui.about.Contributor",
      "org.jfree.chart.plot.PiePlot",
      "org.jfree.util.StrokeList",
      "org.jfree.base.config.SystemPropertyConfiguration",
      "org.jfree.chart.labels.ItemLabelAnchor",
      "org.jfree.chart.labels.StandardXYToolTipGenerator",
      "org.jfree.util.ObjectUtilities",
      "org.jfree.chart.axis.Timeline",
      "org.jfree.data.xy.DefaultIntervalXYDataset",
      "org.jfree.chart.event.RendererChangeEvent",
      "org.jfree.data.time.TimeSeriesCollection",
      "org.jfree.chart.block.CenterArrangement",
      "org.jfree.chart.entity.XYAnnotationEntity",
      "org.jfree.chart.labels.PieSectionLabelGenerator",
      "org.jfree.data.time.TimePeriodFormatException",
      "org.jfree.chart.axis.Tick",
      "org.jfree.base.AbstractBoot",
      "org.jfree.data.statistics.BoxAndWhiskerItem",
      "org.jfree.chart.axis.Axis",
      "org.jfree.base.config.HierarchicalConfiguration",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset",
      "org.jfree.chart.axis.NumberAxis3D",
      "org.jfree.data.statistics.BoxAndWhiskerCategoryDataset",
      "org.jfree.chart.block.BlockBorder",
      "org.jfree.base.BootableProjectInfo",
      "org.jfree.util.ExtendedConfiguration",
      "org.jfree.chart.urls.XYURLGenerator",
      "org.jfree.util.AbstractObjectList",
      "org.jfree.chart.annotations.XYAnnotation",
      "org.jfree.chart.renderer.xy.XYBarRenderer$XYBarRendererState",
      "org.jfree.util.ObjectList",
      "org.jfree.util.LogTarget",
      "org.jfree.data.time.Second",
      "org.jfree.text.TextUtilities",
      "org.jfree.chart.axis.CategoryAnchor",
      "org.jfree.chart.plot.DatasetRenderingOrder",
      "org.jfree.chart.event.RendererChangeListener",
      "org.jfree.chart.axis.SegmentedTimeline$BaseTimelineSegmentRange",
      "org.jfree.data.KeyedValues",
      "org.jfree.chart.plot.CombinedRangeCategoryPlot",
      "org.jfree.base.BaseBoot",
      "org.jfree.chart.block.FlowArrangement",
      "org.jfree.chart.entity.XYItemEntity",
      "org.jfree.util.PaintList",
      "org.jfree.util.Log",
      "org.jfree.chart.event.TitleChangeListener",
      "org.jfree.base.modules.Module",
      "org.jfree.data.time.Quarter",
      "org.jfree.chart.renderer.xy.XYAreaRenderer2",
      "org.jfree.base.config.PropertyFileConfiguration",
      "org.jfree.chart.LegendItemSource",
      "org.jfree.chart.plot.RainbowPalette",
      "org.jfree.util.PaintUtilities",
      "org.jfree.text.TextBlock",
      "org.jfree.chart.renderer.PolarItemRenderer",
      "org.jfree.data.xy.XYZDataset",
      "org.jfree.data.DomainInfo",
      "org.jfree.data.general.DatasetChangeListener",
      "org.jfree.chart.title.LegendGraphic",
      "org.jfree.chart.block.BlockParams",
      "org.jfree.data.xy.YIntervalSeries",
      "org.jfree.text.TextMeasurer",
      "org.jfree.chart.event.TitleChangeEvent",
      "org.jfree.chart.annotations.CategoryAnnotation",
      "org.jfree.util.UnitType",
      "org.jfree.chart.axis.AxisSpace",
      "org.jfree.chart.axis.SegmentedTimeline$SegmentRange",
      "org.jfree.chart.plot.PolarPlot",
      "org.jfree.chart.plot.ColorPalette",
      "org.jfree.data.ComparableObjectSeries",
      "org.jfree.data.time.DateRange",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.chart.axis.CyclicNumberAxis$CycleBoundTick",
      "org.jfree.chart.event.ChartChangeEventType",
      "org.jfree.chart.block.BlockResult",
      "org.jfree.data.xy.OHLCDataset",
      "org.jfree.data.time.Millisecond",
      "org.jfree.chart.renderer.category.CategoryItemRenderer",
      "org.jfree.resources.JCommonResources",
      "org.jfree.ui.RectangleAnchor",
      "org.jfree.data.general.SeriesChangeEvent",
      "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer$State",
      "org.jfree.ui.RectangleEdge",
      "org.jfree.chart.resources.JFreeChartResources",
      "org.jfree.chart.renderer.xy.XYBlockRenderer",
      "org.jfree.data.RangeType",
      "org.jfree.data.time.Month",
      "org.jfree.chart.axis.TickUnits",
      "org.jfree.text.TextBlockAnchor",
      "org.jfree.chart.renderer.LookupPaintScale",
      "org.jfree.chart.block.EntityBlockParams",
      "org.jfree.data.general.Dataset",
      "org.jfree.chart.plot.SeriesRenderingOrder",
      "org.jfree.chart.block.EntityBlockResult",
      "org.jfree.chart.block.LabelBlock",
      "org.jfree.chart.plot.PlotOrientation",
      "org.jfree.chart.axis.NumberAxis",
      "org.jfree.chart.annotations.XYTextAnnotation",
      "org.jfree.chart.axis.NumberTick",
      "org.jfree.chart.axis.SymbolAxis",
      "org.jfree.chart.axis.ValueTick",
      "org.jfree.ui.VerticalAlignment",
      "org.jfree.chart.block.BlockContainer",
      "org.jfree.chart.JFreeChart",
      "org.jfree.chart.renderer.xy.StandardXYItemRenderer",
      "org.jfree.chart.plot.Marker",
      "org.jfree.chart.renderer.xy.XYBarRenderer",
      "org.jfree.chart.title.LegendTitle",
      "org.jfree.chart.axis.SegmentedTimeline",
      "org.jfree.data.DataUtilities",
      "org.jfree.chart.axis.ValueAxis",
      "org.jfree.chart.ChartRenderingInfo",
      "org.jfree.data.Value",
      "org.jfree.data.time.TimePeriodAnchor",
      "org.jfree.chart.JFreeChartInfo",
      "org.jfree.chart.event.MarkerChangeEvent",
      "org.jfree.chart.plot.MultiplePiePlot",
      "org.jfree.chart.event.AxisChangeListener",
      "org.jfree.data.general.DefaultValueDataset",
      "org.jfree.chart.renderer.xy.ClusteredXYBarRenderer",
      "org.jfree.chart.axis.SegmentedTimeline$Segment",
      "org.jfree.util.PublicCloneable",
      "org.jfree.data.xy.DefaultXYZDataset",
      "org.jfree.date.SerialDate",
      "org.jfree.chart.renderer.xy.AbstractXYItemRenderer",
      "org.jfree.util.BooleanList",
      "org.jfree.chart.plot.CrosshairState",
      "org.jfree.chart.labels.XYSeriesLabelGenerator",
      "org.jfree.util.Rotation",
      "org.jfree.text.TextFragment",
      "org.jfree.data.DomainOrder",
      "org.jfree.chart.axis.AxisState",
      "org.jfree.chart.renderer.AbstractRenderer",
      "org.jfree.JCommon",
      "org.jfree.chart.block.ColumnArrangement",
      "org.jfree.base.modules.PackageManager$PackageConfiguration",
      "org.jfree.chart.renderer.xy.StackedXYBarRenderer",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.chart.block.RectangleConstraint",
      "org.jfree.util.Log$SimpleMessage",
      "org.jfree.chart.plot.Zoomable",
      "org.jfree.chart.title.Title",
      "org.jfree.chart.axis.DateTickMarkPosition",
      "org.jfree.util.LogContext",
      "org.jfree.data.DefaultKeyedValues2D",
      "org.jfree.chart.renderer.xy.StandardXYItemRenderer$State",
      "org.jfree.chart.block.BorderArrangement",
      "org.jfree.chart.plot.CombinedDomainXYPlot",
      "org.jfree.chart.axis.PeriodAxis",
      "org.jfree.util.SortOrder",
      "org.jfree.data.time.Day",
      "org.jfree.data.general.SeriesDataset",
      "org.jfree.ui.LengthAdjustmentType",
      "org.jfree.ui.TextAnchor",
      "org.jfree.data.xy.XYDataset",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset",
      "org.jfree.chart.block.Arrangement",
      "org.jfree.chart.plot.Plot",
      "org.jfree.chart.title.LegendItemBlockContainer",
      "org.jfree.chart.plot.ValueAxisPlot",
      "org.jfree.data.UnknownKeyException",
      "org.jfree.chart.labels.XYToolTipGenerator",
      "org.jfree.data.time.TimePeriod",
      "org.jfree.chart.event.AxisChangeEvent",
      "org.jfree.chart.LegendItem",
      "org.jfree.chart.renderer.xy.XYErrorRenderer",
      "org.jfree.chart.plot.PlotRenderingInfo",
      "org.jfree.chart.block.Block",
      "org.jfree.data.time.RegularTimePeriod",
      "org.jfree.data.xy.AbstractXYZDataset",
      "org.jfree.date.SpreadsheetDate",
      "org.jfree.util.ShapeList",
      "org.jfree.data.time.TimeSeries",
      "org.jfree.chart.plot.CombinedRangeXYPlot",
      "org.jfree.text.TextLine",
      "org.jfree.data.general.PieDataset",
      "org.jfree.base.Library",
      "org.jfree.chart.labels.XYItemLabelGenerator",
      "org.jfree.base.modules.SubSystem",
      "org.jfree.data.general.CombinationDataset",
      "org.jfree.data.general.DatasetUtilities",
      "org.jfree.ui.StandardGradientPaintTransformer",
      "org.jfree.base.BasicProjectInfo$OptionalLibraryHolder",
      "org.jfree.chart.axis.AxisLocation",
      "org.jfree.data.xy.IntervalXYDataset",
      "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer",
      "org.jfree.ui.Layer",
      "org.jfree.chart.event.ChartProgressEvent",
      "org.jfree.chart.plot.DefaultDrawingSupplier",
      "org.jfree.chart.block.LengthConstraintType",
      "org.jfree.data.category.DefaultIntervalCategoryDataset",
      "org.jfree.JCommonInfo",
      "org.jfree.data.category.CategoryDataset",
      "org.jfree.data.Range",
      "org.jfree.data.xy.XYSeries",
      "org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator",
      "org.jfree.data.category.IntervalCategoryDataset",
      "org.jfree.chart.plot.PlotState",
      "org.jfree.chart.axis.TickUnit",
      "org.jfree.data.time.Year",
      "org.jfree.chart.ChartColor",
      "org.jfree.base.modules.ModuleInfo",
      "org.jfree.base.modules.PackageState",
      "org.jfree.util.ShapeUtilities",
      "org.jfree.util.Configuration",
      "org.jfree.chart.PaintMap",
      "org.jfree.chart.axis.DateTickUnit",
      "org.jfree.chart.axis.ColorBar",
      "org.jfree.chart.axis.TickUnitSource",
      "org.jfree.chart.plot.CategoryMarker",
      "org.jfree.chart.axis.ModuloAxis",
      "org.jfree.ui.about.ProjectInfo",
      "org.jfree.data.xy.MatrixSeriesCollection",
      "org.jfree.ui.HorizontalAlignment",
      "org.jfree.chart.plot.XYPlot",
      "org.jfree.chart.block.AbstractBlock",
      "org.jfree.data.xy.TableXYDataset",
      "org.jfree.chart.annotations.AbstractXYAnnotation",
      "org.jfree.data.xy.MatrixSeries",
      "org.jfree.chart.entity.ChartEntity",
      "org.jfree.chart.entity.EntityCollection",
      "org.jfree.data.Values2D",
      "org.jfree.ui.Size2D",
      "org.jfree.data.time.TimeSeriesDataItem",
      "org.jfree.data.general.DatasetChangeEvent",
      "org.jfree.data.statistics.BoxAndWhiskerXYDataset",
      "org.jfree.data.general.SeriesChangeListener",
      "org.jfree.ui.Drawable",
      "org.jfree.base.BasicProjectInfo",
      "org.jfree.ui.GradientPaintTransformer",
      "org.jfree.date.MonthConstants",
      "org.jfree.chart.renderer.xy.DefaultXYItemRenderer",
      "org.jfree.chart.renderer.xy.XYItemRendererState",
      "org.jfree.chart.entity.PieSectionEntity",
      "org.jfree.chart.plot.ThermometerPlot",
      "org.jfree.chart.event.PlotChangeListener",
      "org.jfree.data.time.Hour",
      "org.jfree.chart.axis.PeriodAxisLabelInfo",
      "org.jfree.data.general.Series",
      "org.jfree.chart.labels.AbstractXYItemLabelGenerator",
      "org.jfree.chart.axis.NumberTickUnit",
      "org.jfree.data.xy.XYSeriesCollection",
      "org.jfree.chart.plot.DrawingSupplier",
      "org.jfree.chart.title.TextTitle",
      "org.jfree.util.TableOrder",
      "org.jfree.chart.renderer.PaintScale",
      "org.jfree.chart.plot.IntervalMarker",
      "org.jfree.data.xy.IntervalXYDelegate",
      "org.jfree.chart.event.ChartChangeEvent",
      "org.jfree.chart.StrokeMap",
      "org.jfree.data.Values",
      "org.jfree.data.KeyedValues2D",
      "org.jfree.chart.axis.CyclicNumberAxis",
      "org.jfree.data.KeyedObjects2D",
      "org.jfree.data.general.SeriesException",
      "org.jfree.base.config.ModifiableConfiguration",
      "org.jfree.chart.event.ChartChangeListener",
      "org.jfree.chart.entity.LegendItemEntity"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.sql.Connection", false, XYPlot_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(XYPlot_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jfree.util.UnitType",
      "org.jfree.ui.RectangleInsets",
      "org.jfree.chart.plot.Plot",
      "org.jfree.chart.plot.XYPlot",
      "org.jfree.chart.plot.DatasetRenderingOrder",
      "org.jfree.chart.plot.SeriesRenderingOrder",
      "org.jfree.chart.plot.PlotOrientation",
      "org.jfree.chart.axis.AxisLocation",
      "org.jfree.ui.RectangleEdge",
      "org.jfree.ui.Layer",
      "org.jfree.chart.event.ChartChangeEventType",
      "org.jfree.util.Log",
      "org.jfree.io.SerialUtilities",
      "org.jfree.chart.axis.Axis",
      "org.jfree.data.Range",
      "org.jfree.chart.axis.ValueAxis",
      "org.jfree.chart.axis.TickUnit",
      "org.jfree.chart.axis.NumberTickUnit",
      "org.jfree.chart.axis.NumberAxis",
      "org.jfree.chart.axis.CyclicNumberAxis",
      "org.jfree.chart.axis.TickUnits",
      "org.jfree.data.RangeType",
      "org.jfree.chart.event.ChartChangeEvent",
      "org.jfree.chart.event.AxisChangeEvent",
      "org.jfree.chart.plot.CombinedDomainXYPlot",
      "org.jfree.chart.ChartColor",
      "org.jfree.chart.plot.DefaultDrawingSupplier",
      "org.jfree.util.AbstractObjectList",
      "org.jfree.util.ObjectList",
      "org.jfree.data.general.DatasetChangeEvent",
      "org.jfree.chart.event.PlotChangeEvent",
      "org.jfree.chart.labels.AbstractXYItemLabelGenerator",
      "org.jfree.chart.labels.StandardXYToolTipGenerator",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.data.general.AbstractSeriesDataset",
      "org.jfree.data.xy.AbstractXYDataset",
      "org.jfree.data.xy.AbstractXYZDataset",
      "org.jfree.data.contour.DefaultContourDataset",
      "org.jfree.data.contour.NonGridContourDataset",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.chart.axis.NumberAxis3D",
      "org.jfree.base.Library",
      "org.jfree.base.BasicProjectInfo",
      "org.jfree.base.BootableProjectInfo",
      "org.jfree.ui.about.ProjectInfo",
      "org.jfree.chart.JFreeChartInfo",
      "org.jfree.chart.resources.JFreeChartResources",
      "org.jfree.ui.about.Licences",
      "org.jfree.ui.about.Contributor",
      "org.jfree.JCommonInfo",
      "org.jfree.resources.JCommonResources",
      "org.jfree.base.BasicProjectInfo$OptionalLibraryHolder",
      "org.jfree.base.AbstractBoot",
      "org.jfree.base.BaseBoot",
      "org.jfree.JCommon",
      "org.jfree.chart.JFreeChart",
      "org.jfree.chart.block.AbstractBlock",
      "org.jfree.ui.HorizontalAlignment",
      "org.jfree.ui.VerticalAlignment",
      "org.jfree.chart.title.Title",
      "org.jfree.chart.title.LegendTitle",
      "org.jfree.chart.block.FlowArrangement",
      "org.jfree.chart.block.ColumnArrangement",
      "org.jfree.chart.block.BlockBorder",
      "org.jfree.chart.block.BlockContainer",
      "org.jfree.ui.RectangleAnchor",
      "org.jfree.chart.event.TitleChangeEvent",
      "org.jfree.chart.title.TextTitle",
      "org.jfree.chart.ChartRenderingInfo",
      "org.jfree.chart.entity.StandardEntityCollection",
      "org.jfree.chart.plot.PlotRenderingInfo",
      "org.jfree.chart.event.ChartProgressEvent",
      "org.jfree.chart.axis.AxisSpace",
      "org.jfree.chart.axis.AxisState",
      "org.jfree.ui.TextAnchor",
      "org.jfree.chart.axis.Tick",
      "org.jfree.chart.axis.ValueTick",
      "org.jfree.chart.axis.NumberTick",
      "org.jfree.util.LogContext",
      "org.jfree.util.ObjectUtilities",
      "org.jfree.base.config.HierarchicalConfiguration",
      "org.jfree.base.config.PropertyFileConfiguration",
      "org.jfree.base.modules.PackageManager",
      "org.jfree.base.modules.PackageManager$PackageConfiguration",
      "org.jfree.base.config.SystemPropertyConfiguration",
      "org.jfree.text.TextUtilities",
      "org.jfree.chart.plot.PlotState",
      "org.jfree.chart.plot.CombinedRangeXYPlot",
      "org.jfree.data.xy.AbstractIntervalXYDataset",
      "org.jfree.data.xy.DefaultIntervalXYDataset",
      "org.jfree.data.time.RegularTimePeriod",
      "org.jfree.data.time.DateRange",
      "org.jfree.chart.axis.DateTickUnit",
      "org.jfree.chart.axis.DateAxis$DefaultTimeline",
      "org.jfree.chart.axis.DateAxis",
      "org.jfree.chart.axis.DateTickMarkPosition",
      "org.jfree.data.xy.XYSeriesCollection",
      "org.jfree.data.xy.IntervalXYDelegate",
      "org.jfree.chart.axis.SegmentedTimeline",
      "org.jfree.chart.renderer.AbstractRenderer",
      "org.jfree.chart.renderer.xy.AbstractXYItemRenderer",
      "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer",
      "org.jfree.chart.renderer.xy.XYErrorRenderer",
      "org.jfree.util.BooleanList",
      "org.jfree.util.PaintList",
      "org.jfree.util.StrokeList",
      "org.jfree.util.ShapeList",
      "org.jfree.chart.labels.ItemLabelPosition",
      "org.jfree.chart.labels.ItemLabelAnchor",
      "org.jfree.chart.labels.StandardXYSeriesLabelGenerator",
      "org.jfree.data.general.DatasetUtilities",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset",
      "org.jfree.data.time.Hour",
      "org.jfree.data.time.Day",
      "org.jfree.date.SerialDate",
      "org.jfree.date.SpreadsheetDate",
      "org.jfree.chart.axis.PeriodAxis",
      "org.jfree.data.time.Year",
      "org.jfree.data.time.Quarter",
      "org.jfree.data.time.Month",
      "org.jfree.data.time.Minute",
      "org.jfree.chart.axis.PeriodAxisLabelInfo",
      "org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer",
      "org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator",
      "org.jfree.chart.event.RendererChangeEvent",
      "org.jfree.chart.annotations.AbstractXYAnnotation",
      "org.jfree.chart.annotations.XYBoxAnnotation",
      "org.jfree.data.xy.DefaultWindDataset",
      "org.jfree.data.general.Series",
      "org.jfree.data.time.TimePeriodValues",
      "org.jfree.data.time.TimePeriodValuesCollection",
      "org.jfree.data.time.TimePeriodAnchor",
      "org.jfree.chart.axis.ModuloAxis",
      "org.jfree.chart.ChartPanel",
      "org.jfree.chart.PolarChartPanel",
      "org.jfree.data.general.DefaultValueDataset",
      "org.jfree.chart.plot.ThermometerPlot",
      "org.jfree.chart.plot.Marker",
      "org.jfree.chart.plot.ValueMarker",
      "org.jfree.ui.LengthAdjustmentType",
      "org.jfree.chart.annotations.XYPolygonAnnotation",
      "org.jfree.chart.axis.SymbolAxis",
      "org.jfree.chart.renderer.xy.XYBarRenderer",
      "org.jfree.chart.renderer.xy.ClusteredXYBarRenderer",
      "org.jfree.ui.StandardGradientPaintTransformer",
      "org.jfree.ui.GradientPaintTransformType",
      "org.jfree.chart.plot.IntervalMarker",
      "org.jfree.chart.event.MarkerChangeEvent",
      "org.jfree.chart.LegendItemCollection",
      "org.jfree.data.general.CombinedDataset",
      "org.jfree.chart.renderer.xy.DefaultXYItemRenderer",
      "org.jfree.data.category.DefaultCategoryDataset",
      "org.jfree.data.jdbc.JDBCCategoryDataset",
      "org.jfree.data.DefaultKeyedValues2D",
      "org.jfree.chart.plot.MultiplePiePlot",
      "org.jfree.chart.plot.PiePlot",
      "org.jfree.util.Rotation",
      "org.jfree.chart.PaintMap",
      "org.jfree.chart.StrokeMap",
      "org.jfree.chart.labels.AbstractPieItemLabelGenerator",
      "org.jfree.chart.labels.StandardPieSectionLabelGenerator",
      "org.jfree.util.TableOrder",
      "org.jfree.data.statistics.HistogramDataset",
      "org.jfree.data.statistics.HistogramType",
      "org.jfree.data.general.SubSeriesDataset",
      "org.jfree.chart.axis.ColorBar",
      "org.jfree.chart.plot.ColorPalette",
      "org.jfree.chart.plot.RainbowPalette",
      "org.jfree.chart.labels.CustomXYToolTipGenerator",
      "org.jfree.chart.urls.CustomXYURLGenerator",
      "org.jfree.chart.renderer.xy.StandardXYItemRenderer",
      "org.jfree.chart.renderer.xy.CyclicXYItemRenderer",
      "org.jfree.chart.plot.FastScatterPlot",
      "org.jfree.data.general.DefaultPieDataset",
      "org.jfree.data.jdbc.JDBCPieDataset",
      "org.jfree.data.DefaultKeyedValues",
      "org.jfree.data.time.TimeSeries",
      "org.jfree.data.time.TimeSeriesCollection",
      "org.jfree.chart.renderer.xy.XYDotRenderer",
      "org.jfree.data.statistics.DefaultStatisticalCategoryDataset",
      "org.jfree.data.KeyedObjects2D",
      "org.jfree.chart.annotations.XYImageAnnotation",
      "org.jfree.chart.annotations.XYTextAnnotation",
      "org.jfree.chart.annotations.XYPointerAnnotation",
      "org.jfree.data.time.TimeTableXYDataset",
      "org.jfree.chart.plot.SpiderWebPlot",
      "org.jfree.chart.labels.AbstractCategoryItemLabelGenerator",
      "org.jfree.chart.labels.StandardCategoryItemLabelGenerator",
      "org.jfree.chart.axis.CategoryAxis",
      "org.jfree.chart.axis.CategoryAxis3D",
      "org.jfree.chart.axis.CategoryLabelPosition",
      "org.jfree.text.TextBlockAnchor",
      "org.jfree.chart.axis.CategoryLabelWidthType",
      "org.jfree.chart.axis.CategoryLabelPositions",
      "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer",
      "org.jfree.chart.renderer.category.BarRenderer",
      "org.jfree.chart.renderer.category.WaterfallBarRenderer",
      "org.jfree.chart.labels.StandardCategorySeriesLabelGenerator",
      "org.jfree.chart.plot.MeterPlot",
      "org.jfree.data.xy.DefaultTableXYDataset",
      "org.jfree.chart.renderer.xy.XYAreaRenderer2",
      "org.jfree.data.time.FixedMillisecond",
      "org.jfree.data.time.Second",
      "org.jfree.data.time.Millisecond",
      "org.jfree.chart.plot.CategoryMarker",
      "org.jfree.chart.renderer.RendererState",
      "org.jfree.chart.renderer.xy.XYItemRendererState",
      "org.jfree.chart.block.LengthConstraintType",
      "org.jfree.chart.block.RectangleConstraint",
      "org.jfree.chart.block.BlockParams",
      "org.jfree.text.G2TextMeasurer",
      "org.jfree.text.TextBlock",
      "org.jfree.text.TextLine",
      "org.jfree.text.TextFragment",
      "org.jfree.ui.Size2D",
      "org.jfree.util.Log$SimpleMessage",
      "org.jfree.chart.block.BlockResult",
      "org.jfree.data.time.TimePeriodFormatException",
      "org.jfree.chart.needle.MeterNeedle",
      "org.jfree.chart.needle.PlumNeedle",
      "org.jfree.chart.renderer.xy.XYAreaRenderer",
      "org.jfree.chart.renderer.WaferMapRenderer",
      "org.jfree.chart.plot.ContourPlot",
      "org.jfree.chart.labels.StandardContourToolTipGenerator",
      "org.jfree.chart.renderer.xy.StackedXYBarRenderer",
      "org.jfree.util.ShapeUtilities",
      "org.jfree.chart.plot.CategoryPlot",
      "org.jfree.chart.plot.CombinedDomainCategoryPlot",
      "org.jfree.util.SortOrder",
      "org.jfree.chart.axis.CategoryAnchor",
      "org.jfree.chart.plot.RingPlot",
      "org.jfree.data.general.DefaultKeyedValues2DDataset",
      "org.jfree.chart.renderer.category.LineAndShapeRenderer",
      "org.jfree.chart.LegendItem",
      "org.jfree.util.BooleanUtilities",
      "org.jfree.chart.plot.DialShape",
      "org.jfree.chart.plot.CombinedRangeCategoryPlot",
      "org.jfree.chart.axis.LogarithmicAxis",
      "org.jfree.chart.renderer.xy.XYBlockRenderer",
      "org.jfree.chart.renderer.LookupPaintScale",
      "org.jfree.chart.axis.AxisCollection",
      "org.jfree.chart.renderer.DefaultPolarItemRenderer",
      "org.jfree.chart.renderer.xy.StackedXYAreaRenderer2",
      "org.jfree.chart.renderer.xy.XYDifferenceRenderer",
      "org.jfree.chart.axis.SubCategoryAxis",
      "org.jfree.text.TextBox",
      "org.jfree.data.time.DynamicTimeSeriesCollection",
      "org.jfree.chart.urls.StandardXYURLGenerator",
      "org.jfree.chart.plot.PolarPlot",
      "org.jfree.chart.renderer.xy.XYStepAreaRenderer",
      "org.jfree.chart.renderer.category.IntervalBarRenderer",
      "org.jfree.chart.renderer.category.GanttRenderer",
      "org.jfree.chart.renderer.xy.CandlestickRenderer",
      "org.jfree.chart.labels.HighLowItemLabelGenerator",
      "org.jfree.chart.renderer.xy.YIntervalRenderer",
      "org.jfree.chart.plot.CompassPlot",
      "org.jfree.chart.needle.ArrowNeedle",
      "org.jfree.chart.entity.ChartEntity",
      "org.jfree.data.xy.XIntervalSeriesCollection",
      "org.jfree.chart.axis.DateTick",
      "org.jfree.chart.renderer.xy.XYBubbleRenderer",
      "org.jfree.data.xy.MatrixSeries",
      "org.jfree.util.PaintUtilities",
      "org.jfree.data.general.WaferMapDataset",
      "org.jfree.chart.plot.WaferMapPlot",
      "org.jfree.chart.plot.CrosshairState",
      "org.jfree.chart.renderer.xy.StackedXYAreaRenderer",
      "org.jfree.data.xy.DefaultXYZDataset",
      "org.jfree.data.category.DefaultIntervalCategoryDataset",
      "org.jfree.chart.annotations.XYLineAnnotation",
      "org.jfree.data.xy.XYSeries",
      "org.jfree.chart.renderer.category.MinMaxCategoryRenderer",
      "org.jfree.chart.renderer.category.MinMaxCategoryRenderer$1",
      "org.jfree.chart.renderer.category.MinMaxCategoryRenderer$2",
      "org.jfree.data.xy.DefaultOHLCDataset",
      "org.jfree.chart.annotations.TextAnnotation",
      "org.jfree.chart.annotations.CategoryTextAnnotation",
      "org.jfree.chart.annotations.CategoryPointerAnnotation",
      "org.jfree.chart.renderer.xy.HighLowRenderer",
      "org.jfree.chart.renderer.category.LineRenderer3D",
      "org.jfree.data.time.Week",
      "org.jfree.chart.title.ImageTitle",
      "org.jfree.chart.title.PaintScaleLegend",
      "org.jfree.data.DataUtilities",
      "org.jfree.data.resources.DataPackageResources",
      "org.jfree.data.jdbc.JDBCXYDataset",
      "org.jfree.data.xy.XYDatasetTableModel",
      "org.jfree.data.xy.XYIntervalSeriesCollection",
      "org.jfree.data.statistics.SimpleHistogramDataset",
      "org.jfree.chart.labels.MultipleXYSeriesLabelGenerator",
      "org.jfree.chart.axis.ExtendedCategoryAxis",
      "org.jfree.data.xy.DefaultXYDataset",
      "org.jfree.chart.renderer.xy.WindItemRenderer",
      "org.jfree.data.xy.DefaultHighLowDataset",
      "org.jfree.chart.plot.GreyPalette",
      "org.jfree.data.general.SeriesChangeEvent",
      "org.jfree.data.xy.YIntervalSeriesCollection",
      "org.jfree.data.xy.MatrixSeriesCollection",
      "org.jfree.chart.renderer.GrayPaintScale",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset",
      "org.jfree.chart.labels.SymbolicXYItemLabelGenerator",
      "org.jfree.chart.block.CenterArrangement",
      "org.jfree.data.xy.CategoryTableXYDataset",
      "org.jfree.chart.labels.StandardXYZToolTipGenerator",
      "org.jfree.data.gantt.TaskSeriesCollection",
      "org.jfree.chart.renderer.category.BarRenderer3D",
      "org.jfree.chart.renderer.category.StackedBarRenderer3D",
      "org.jfree.chart.annotations.XYShapeAnnotation",
      "org.jfree.chart.block.LabelBlock",
      "org.jfree.chart.annotations.XYDrawableAnnotation",
      "org.jfree.chart.renderer.category.StackedBarRenderer",
      "org.jfree.chart.title.LegendGraphic",
      "org.jfree.chart.title.LegendItemBlockContainer",
      "org.jfree.chart.block.BorderArrangement",
      "org.jfree.chart.renderer.xy.XYStepRenderer",
      "org.jfree.data.UnknownKeyException",
      "org.jfree.chart.axis.StandardTickUnitSource",
      "org.jfree.chart.urls.StandardXYZURLGenerator",
      "org.jfree.chart.renderer.xy.XYLine3DRenderer",
      "org.jfree.data.xy.XYBarDataset",
      "org.jfree.chart.plot.PiePlot3D",
      "org.jfree.data.xy.OHLCDataItem",
      "org.jfree.data.statistics.SimpleHistogramBin",
      "org.jfree.data.general.CombinedDataset$DatasetInfo",
      "org.jfree.chart.block.EmptyBlock",
      "org.jfree.chart.renderer.category.LayeredBarRenderer",
      "org.jfree.chart.urls.TimeSeriesURLGenerator",
      "org.jfree.chart.entity.LegendItemEntity",
      "org.jfree.chart.labels.BubbleXYItemLabelGenerator",
      "org.jfree.chart.renderer.xy.StackedXYAreaRenderer$StackedXYAreaRendererState",
      "org.jfree.chart.axis.SegmentedTimeline$Segment",
      "org.jfree.chart.renderer.category.GroupedStackedBarRenderer",
      "org.jfree.data.KeyToGroupMap",
      "org.jfree.chart.block.GridArrangement",
      "org.jfree.data.time.TimeSeriesDataItem",
      "org.jfree.chart.renderer.xy.XYBarRenderer$XYBarRendererState",
      "org.jfree.data.category.CategoryToPieDataset",
      "org.jfree.data.general.DefaultKeyedValuesDataset",
      "org.jfree.data.DefaultKeyedValue",
      "org.jfree.chart.renderer.category.AreaRenderer",
      "org.jfree.chart.renderer.category.StackedAreaRenderer",
      "org.jfree.chart.renderer.AreaRendererEndType",
      "org.jfree.chart.plot.MeterInterval",
      "org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer",
      "org.jfree.chart.ChartMouseEvent",
      "org.jfree.data.ComparableObjectSeries",
      "org.jfree.data.xy.XIntervalSeries",
      "org.jfree.data.general.DefaultKeyedValueDataset",
      "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer",
      "org.jfree.chart.renderer.xy.StandardXYItemRenderer$State",
      "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer$State",
      "org.jfree.chart.labels.StandardCategoryToolTipGenerator",
      "org.jfree.chart.labels.IntervalCategoryToolTipGenerator"
    );
  }
}
