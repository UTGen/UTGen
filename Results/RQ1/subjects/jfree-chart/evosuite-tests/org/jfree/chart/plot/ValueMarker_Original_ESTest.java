/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Wed Mar 20 04:00:14 GMT 2024
 */

package org.jfree.chart.plot;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Paint;
import java.awt.Stroke;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import org.jfree.chart.plot.ValueMarker;
import org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ValueMarker_Original_ESTest extends ValueMarker_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFailsToCreateValueMarkerTaking6ArgumentsThrowsIllegalArgumentException() throws Throwable  {
      DateAxis arg0 = new DateAxis();
      CombinedRangeCategoryPlot combinedRangeCategoryPlot = new CombinedRangeCategoryPlot(arg0);
      Stroke arg4 = combinedRangeCategoryPlot.getRangeGridlineStroke();
      ValueMarker valueMarker = null;
      try {
        valueMarker = new ValueMarker(0.0, (Paint) null, arg4, arg0.DEFAULT_TICK_LABEL_PAINT, arg4, 1800.7413F);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'paint' argument.
         //
         verifyException("org.jfree.chart.plot.Marker", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetValueReturningNegative() throws Throwable  {
      ValueMarker valueMarker = new ValueMarker(1.0);
      assertEquals(1.0, valueMarker.getValue(), 0.01);
      
      valueMarker.setValue((-1.0));
      double value = valueMarker.getValue();
      assertEquals((-1.0), value, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetValue() throws Throwable  {
      ValueMarker valueMarker = new ValueMarker(1.0);
      Object arg0 = valueMarker.clone();
      valueMarker.setValue(0.0);
      boolean equals = valueMarker.equals(arg0);
      assertEquals(0.0, valueMarker.getValue(), 0.01);
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsReturningFalse() throws Throwable  {
      ValueMarker valueMarker = new ValueMarker(1.0);
      Object arg0 = valueMarker.clone();
      valueMarker.setLabel("org.jfree.chart.plot.ValueMarker");
      boolean equals = valueMarker.equals(arg0);
      assertFalse(arg0.equals((Object)valueMarker));
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsReturningTrue() throws Throwable  {
      ValueMarker valueMarker = new ValueMarker(1.0);
      ValueMarker arg0 = (ValueMarker)valueMarker.clone();
      boolean equals = valueMarker.equals(arg0);
      assertEquals(1.0, arg0.getValue(), 0.01);
      assertTrue(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesValueMarkerTaking3Arguments() throws Throwable  {
      XYBoxAndWhiskerRenderer xYBoxAndWhiskerRenderer = new XYBoxAndWhiskerRenderer();
      Paint arg1 = xYBoxAndWhiskerRenderer.getArtifactPaint();
      ValueMarker valueMarker = new ValueMarker(204.96589675571, arg1, xYBoxAndWhiskerRenderer.DEFAULT_OUTLINE_STROKE);
      assertEquals(204.96589675571, valueMarker.getValue(), 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetValueReturningZero() throws Throwable  {
      ValueMarker valueMarker = new ValueMarker(1.0);
      valueMarker.setValue(0.0);
      double value = valueMarker.getValue();
      assertEquals(0.0, value, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetValueReturningPositive() throws Throwable  {
      ValueMarker valueMarker = new ValueMarker(1.0);
      double value = valueMarker.getValue();
      assertEquals(1.0, value, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesValueMarkerTakingDouble() throws Throwable  {
      ValueMarker arg0 = new ValueMarker(104);
      boolean equals = arg0.equals(arg0);
      assertEquals(104.0, arg0.getValue(), 0.01);
      assertTrue(equals);
  }
}