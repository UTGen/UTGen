/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Wed Mar 20 04:12:30 GMT 2024
 */

package org.jfree.chart.renderer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Color;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.renderer.GrayPaintScale;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class GrayPaintScale_Original_ESTest extends GrayPaintScale_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetUpperBoundReturningPositive() throws Throwable  {
      GrayPaintScale grayPaintScale = new GrayPaintScale();
      double upperBound = grayPaintScale.getUpperBound();
      assertEquals(1.0, upperBound, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetUpperBoundReturningNegative() throws Throwable  {
      GrayPaintScale grayPaintScale = new GrayPaintScale((-3203.745350291605), (-1.0));
      double upperBound = grayPaintScale.getUpperBound();
      assertEquals((-1.0), upperBound, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetLowerBoundReturningZero() throws Throwable  {
      GrayPaintScale grayPaintScale = new GrayPaintScale();
      double lowerBound = grayPaintScale.getLowerBound();
      assertEquals(0.0, lowerBound, 0.01);
      assertEquals(1.0, grayPaintScale.getUpperBound(), 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetLowerBoundReturningPositive() throws Throwable  {
      GrayPaintScale grayPaintScale = new GrayPaintScale(1.0, 1873.44833047);
      double lowerBound = grayPaintScale.getLowerBound();
      assertEquals(1.0, lowerBound, 0.01);
      assertEquals(1873.44833047, grayPaintScale.getUpperBound(), 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsReturningFalse() throws Throwable  {
      GrayPaintScale grayPaintScale = new GrayPaintScale();
      GrayPaintScale arg0 = new GrayPaintScale(0.0, 3618.955849567);
      boolean equals = grayPaintScale.equals(arg0);
      assertEquals(3618.955849567, arg0.getUpperBound(), 0.01);
      assertFalse(equals);
      assertFalse(arg0.equals((Object)grayPaintScale));
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesGrayPaintScaleTakingNoArguments() throws Throwable  {
      GrayPaintScale grayPaintScale = new GrayPaintScale();
      GrayPaintScale arg0 = new GrayPaintScale((-1574.2658397562986), 1.0);
      boolean equals = grayPaintScale.equals(arg0);
      assertEquals(1.0, arg0.getUpperBound(), 0.01);
      assertFalse(arg0.equals((Object)grayPaintScale));
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsWithNonNull() throws Throwable  {
      GrayPaintScale grayPaintScale = new GrayPaintScale();
      Object arg0 = new Object();
      boolean equals = grayPaintScale.equals(arg0);
      assertEquals(1.0, grayPaintScale.getUpperBound(), 0.01);
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsReturningTrue() throws Throwable  {
      GrayPaintScale arg0 = new GrayPaintScale();
      boolean equals = arg0.equals(arg0);
      assertEquals(1.0, arg0.getUpperBound(), 0.01);
      assertTrue(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFailsToCreateGrayPaintScaleTaking2ArgumentsThrowsIllegalArgumentException() throws Throwable  {
      GrayPaintScale grayPaintScale = null;
      try {
        grayPaintScale = new GrayPaintScale(0.0, (-1616.464028905124));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires lowerBound < upperBound.
         //
         verifyException("org.jfree.chart.renderer.GrayPaintScale", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetUpperBoundReturningZero() throws Throwable  {
      GrayPaintScale grayPaintScale = new GrayPaintScale((-2281.74088646), 0.0);
      double upperBound = grayPaintScale.getUpperBound();
      assertEquals(0.0, upperBound, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetLowerBoundReturningNegative() throws Throwable  {
      GrayPaintScale grayPaintScale = new GrayPaintScale((-3423.820725704), 1564.3976483557835);
      double lowerBound = grayPaintScale.getLowerBound();
      assertEquals(1564.3976483557835, grayPaintScale.getUpperBound(), 0.01);
      assertEquals((-3423.820725704), lowerBound, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testClone() throws Throwable  {
      GrayPaintScale grayPaintScale = new GrayPaintScale();
      GrayPaintScale arg0 = (GrayPaintScale)grayPaintScale.clone();
      boolean equals = grayPaintScale.equals(arg0);
      assertEquals(1.0, arg0.getUpperBound(), 0.01);
      assertTrue(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetPaint() throws Throwable  {
      GrayPaintScale grayPaintScale = new GrayPaintScale((-3203.745350291605), (-1.0));
      assertEquals((-3203.745350291605), grayPaintScale.getLowerBound(), 0.01);
      
      Color paint = (Color)grayPaintScale.getPaint((-3203.745350291605));
      assertEquals((-1.0), grayPaintScale.getUpperBound(), 0.01);
      assertEquals(0, paint.getBlue());
  }
}
