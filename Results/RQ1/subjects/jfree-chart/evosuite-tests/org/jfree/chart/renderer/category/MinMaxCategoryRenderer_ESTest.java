/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Wed Mar 20 04:06:38 GMT 2024
 */

package org.jfree.chart.renderer.category;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Paint;
import java.awt.Stroke;
import javax.swing.Icon;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.renderer.category.MinMaxCategoryRenderer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MinMaxCategoryRenderer_ESTest extends MinMaxCategoryRenderer_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetMinIconThrowsIllegalArgumentException() throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer = new MinMaxCategoryRenderer();
      // Test that a null 'icon' argument throws an IllegalArgumentException.
      try {
      // Attempt to set the minimum icon to null.
      minMaxCategoryRenderer.setMinIcon(null);
      fail("Expected exception: IllegalArgumentException");
      } catch (IllegalArgumentException e) {
      // Verify that the expected exception was thrown.
      verifyException("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetMinIcon() throws Throwable  {
      // Test that the MinMaxCategoryRenderer correctly sets the minimum icon for a category
      MinMaxCategoryRenderer minMaxCategoryRenderer = new MinMaxCategoryRenderer();
      Icon objectIcon = minMaxCategoryRenderer.getObjectIcon();
      minMaxCategoryRenderer.setMinIcon(objectIcon);
      assertEquals(0, minMaxCategoryRenderer.getRowCount());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetMaxIconThrowsIllegalArgumentException() throws Throwable  {
      // rollbacked to evosuite
      MinMaxCategoryRenderer minMaxCategoryRenderer = new MinMaxCategoryRenderer();
      // Undeclared exception!
      try { 
        minMaxCategoryRenderer.setMaxIcon((Icon) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'icon' argument.
         //
         verifyException("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetObjectIconThrowsIllegalArgumentException() throws Throwable  {
      // No Comments were added
      MinMaxCategoryRenderer minMaxCategoryRenderer = new MinMaxCategoryRenderer();
      // Undeclared exception!
      try { 
        minMaxCategoryRenderer.setObjectIcon((Icon) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'icon' argument.
         //
         verifyException("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetMinIcon() throws Throwable  {
      // Given
      MinMaxCategoryRenderer minMaxCategoryRenderer = new MinMaxCategoryRenderer();
      Icon expectedIcon = minMaxCategoryRenderer.getMinIcon();
      
      // When
      minMaxCategoryRenderer.setObjectIcon(expectedIcon);
      
      // Then
      assertFalse(minMaxCategoryRenderer.isDrawLines());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetGroupPaintThrowsIllegalArgumentException() throws Throwable  {
      MinMaxCategoryRenderer minMaxCategoryRenderer = new MinMaxCategoryRenderer();
      // Undeclared exception!
      try {
      // Try to set a null paint argument.
      minMaxCategoryRenderer.setGroupPaint(null);
      fail("Expecting exception: IllegalArgumentException");
      } catch (IllegalArgumentException e) {
      // Verify that the expected exception is thrown.
      verifyException("org.jfree.chart.renderer.category.MinMaxCategoryRenderer", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsDrawLinesReturningTrue() throws Throwable  {
      // Test that the drawLines property is initially false
      MinMaxCategoryRenderer minMaxCategoryRenderer = new MinMaxCategoryRenderer();
      assertFalse(minMaxCategoryRenderer.isDrawLines());
      
      // Test that setting the drawLines property to true sets it to true
      minMaxCategoryRenderer.setDrawLines(true);
      boolean drawLines = minMaxCategoryRenderer.isDrawLines();
      assertTrue(drawLines);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetDrawLinesWithFalse() throws Throwable  {
      // Given the MinMaxCategoryRenderer class and its setter method for drawLines,
      // we want to test that setting drawLines to false sets the series visible in legend to null.
      MinMaxCategoryRenderer minMaxCategoryRenderer = new MinMaxCategoryRenderer();
      minMaxCategoryRenderer.setDrawLines(false);
      assertNull(minMaxCategoryRenderer.getSeriesVisibleInLegend());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetGroupStrokeReturningNonNull() throws Throwable  {
      // Given a MinMaxCategoryRenderer instance with default values
      MinMaxCategoryRenderer minMaxCategoryRenderer = new MinMaxCategoryRenderer();
      
      // When the group stroke is retrieved
      BasicStroke groupStroke = (BasicStroke)minMaxCategoryRenderer.getGroupStroke();
      
      // Then the draw lines flag should be false
      assertFalse(minMaxCategoryRenderer.isDrawLines());
      
      // And the group stroke width should be equal to 1.0F with a tolerance of 0.01F
      assertEquals(1.0F, groupStroke.getLineWidth(), 0.01F);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetGroupStroke() throws Throwable  {
      // Given a MinMaxCategoryRenderer instance with a null group stroke
      MinMaxCategoryRenderer minMaxCategoryRenderer = new MinMaxCategoryRenderer();
      minMaxCategoryRenderer.setGroupStroke(null);
      
      // When the getGroupStroke method is called
      Stroke groupStroke = minMaxCategoryRenderer.getGroupStroke();
      
      // Then the method should return null
      assertNull(groupStroke);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetMaxIcon() throws Throwable  {
      // Given a MinMaxCategoryRenderer instance with some data
      MinMaxCategoryRenderer minMaxCategoryRenderer = new MinMaxCategoryRenderer();
      // When the getMaxIcon method is called
      Icon maxIcon = minMaxCategoryRenderer.getMaxIcon();
      // Then the result should not be null
      assertNotNull(maxIcon);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsDrawLinesReturningFalse() throws Throwable  {
      // Given a MinMaxCategoryRenderer instance with the default settings
      MinMaxCategoryRenderer renderer = new MinMaxCategoryRenderer();
      
      // When we call the isDrawLines method
      boolean drawLines = renderer.isDrawLines();
      
      // Then the returned value should be false, indicating that lines are not drawn by default
      assertFalse(drawLines);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetGroupPaint() throws Throwable  {
      // Test that the MinMaxCategoryRenderer does not draw lines by default
      MinMaxCategoryRenderer minMaxRenderer = new MinMaxCategoryRenderer();
      Color groupPaint = (Color)minMaxRenderer.getGroupPaint();
      assertFalse(minMaxRenderer.isDrawLines());
      assertEquals(0, groupPaint.getBlue());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetMaxIcon() throws Throwable  {
      // rollbacked to evosuite
      MinMaxCategoryRenderer minMaxCategoryRenderer = new MinMaxCategoryRenderer();
      Icon arg0 = minMaxCategoryRenderer.getObjectIcon();
      minMaxCategoryRenderer.setMaxIcon(arg0);
      assertFalse(minMaxCategoryRenderer.isDrawLines());
  }
}
