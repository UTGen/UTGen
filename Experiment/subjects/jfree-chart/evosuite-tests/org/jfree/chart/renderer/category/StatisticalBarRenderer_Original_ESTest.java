/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Wed Mar 20 04:18:27 GMT 2024
 */

package org.jfree.chart.renderer.category;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import javax.swing.JTable;
import javax.swing.text.DefaultCaret;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryAxis3D;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.PeriodAxis;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.renderer.AbstractRenderer;
import org.jfree.chart.renderer.category.CategoryItemRendererState;
import org.jfree.chart.renderer.category.StatisticalBarRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.statistics.DefaultStatisticalCategoryDataset;
import org.jfree.data.statistics.StatisticalCategoryDataset;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class StatisticalBarRenderer_Original_ESTest extends StatisticalBarRenderer_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDrawVerticalItemThrowsNullPointerException() throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer = new StatisticalBarRenderer();
      CategoryItemRendererState arg1 = new CategoryItemRendererState((PlotRenderingInfo) null);
      Polygon polygon = new Polygon();
      Rectangle2D arg2 = polygon.getBounds2D();
      PeriodAxis arg5 = new PeriodAxis("ql!k0;Vw7d9$");
      CombinedDomainCategoryPlot arg3 = new CombinedDomainCategoryPlot();
      CategoryAxis arg4 = new CategoryAxis("ql!k0;Vw7d9$");
      // Undeclared exception!
      try { 
        statisticalBarRenderer.drawVerticalItem((Graphics2D) null, arg1, arg2, arg3, arg4, arg5, (StatisticalCategoryDataset) null, (-873), (-873));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.StatisticalBarRenderer", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetErrorIndicatorPaintWithPaintWhereGetTransparencyIsPositive() throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer = new StatisticalBarRenderer();
      Object arg0 = statisticalBarRenderer.clone();
      assertTrue(arg0.equals((Object)statisticalBarRenderer));
      
      statisticalBarRenderer.setErrorIndicatorPaint(((AbstractRenderer) arg0).DEFAULT_PAINT);
      boolean equals = statisticalBarRenderer.equals(arg0);
      assertFalse(arg0.equals((Object)statisticalBarRenderer));
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsReturningFalse() throws Throwable  {
      StatisticalBarRenderer arg0 = new StatisticalBarRenderer();
      StatisticalBarRenderer statisticalBarRenderer = new StatisticalBarRenderer();
      assertTrue(statisticalBarRenderer.equals((Object)arg0));
      
      statisticalBarRenderer.setFillPaint(arg0.DEFAULT_OUTLINE_PAINT);
      boolean equals = statisticalBarRenderer.equals(arg0);
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsReturningTrue() throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer = new StatisticalBarRenderer();
      Object arg0 = statisticalBarRenderer.clone();
      boolean equals = statisticalBarRenderer.equals(arg0);
      assertTrue(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesStatisticalBarRenderer() throws Throwable  {
      StatisticalBarRenderer arg0 = new StatisticalBarRenderer();
      boolean equals = arg0.equals(arg0);
      assertTrue(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsWithNonNull() throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer = new StatisticalBarRenderer();
      Object arg0 = new Object();
      boolean equals = statisticalBarRenderer.equals(arg0);
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDrawItemThrowsIllegalArgumentException() throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer = new StatisticalBarRenderer();
      JTable jTable = new JTable(1291, 37);
      Rectangle arg2 = jTable.getBounds();
      CombinedRangeCategoryPlot arg3 = new CombinedRangeCategoryPlot();
      CategoryAxis arg4 = new CategoryAxis("");
      PeriodAxis arg5 = new PeriodAxis("");
      // Undeclared exception!
      try { 
        statisticalBarRenderer.drawItem((Graphics2D) null, (CategoryItemRendererState) null, arg2, arg3, arg4, arg5, (CategoryDataset) null, 1, 0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires StatisticalCategoryDataset.
         //
         verifyException("org.jfree.chart.renderer.category.StatisticalBarRenderer", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDrawItemThrowsNullPointerException() throws Throwable  {
      DefaultCaret arg2 = new DefaultCaret();
      CombinedRangeCategoryPlot arg3 = new CombinedRangeCategoryPlot();
      StatisticalBarRenderer statisticalBarRenderer = new StatisticalBarRenderer();
      DateAxis arg5 = new DateAxis();
      CategoryAxis3D arg4 = new CategoryAxis3D();
      DefaultStatisticalCategoryDataset arg6 = new DefaultStatisticalCategoryDataset();
      // Undeclared exception!
      try { 
        statisticalBarRenderer.drawItem((Graphics2D) null, (CategoryItemRendererState) null, arg2, arg3, arg4, arg5, arg6, 0, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jfree.chart.renderer.category.StatisticalBarRenderer", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetErrorIndicatorPaintReturningNull() throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer = new StatisticalBarRenderer();
      statisticalBarRenderer.setErrorIndicatorPaint((Paint) null);
      Paint errorIndicatorPaint = statisticalBarRenderer.getErrorIndicatorPaint();
      assertNull(errorIndicatorPaint);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetErrorIndicatorPaintReturningPaintWhereGetTransparencyIsPositive() throws Throwable  {
      StatisticalBarRenderer statisticalBarRenderer = new StatisticalBarRenderer();
      Color errorIndicatorPaint = (Color)statisticalBarRenderer.getErrorIndicatorPaint();
      assertEquals((-8355712), errorIndicatorPaint.getRGB());
  }
}
