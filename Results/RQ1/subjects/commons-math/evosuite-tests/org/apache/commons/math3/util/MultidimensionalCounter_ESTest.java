/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Tue Mar 19 15:48:21 GMT 2024
 */

package org.apache.commons.math3.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.util.MultidimensionalCounter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MultidimensionalCounter_ESTest extends MultidimensionalCounter_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetCountTakingIntArray0() throws Throwable  {
      // Given: A MultidimensionalCounter object with a single dimension and a value of 2,441
      int[] arg0 = new int[1];
      arg0[0] = 2441;
      MultidimensionalCounter multidimensionalCounter = new MultidimensionalCounter(arg0);
      
      // When: We attempt to retrieve the count for a value outside of the allowed range [0, 2,440]
      try {
      multidimensionalCounter.getCount(arg0);
      fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
      // Then: An IllegalArgumentException is thrown with a message indicating the value is out of range
      verifyException("org.apache.commons.math3.util.MultidimensionalCounter", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testToString() throws Throwable  {
      // Given a multidimensional counter with an array of size 1 and value 2457
      int[] arg0 = new int[1];
      arg0[0] = 2457;
      MultidimensionalCounter multidimensionalCounter = new MultidimensionalCounter(arg0);
      
      // When the toString method is called
      String string = multidimensionalCounter.toString();
      
      // Then it should return a string representation of the counter, including its size and value
      assertEquals("[0]", string);
      assertEquals(2457, multidimensionalCounter.getSize());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetCountTakingIntArray1() throws Throwable  {
      // Test that getCount throws IllegalArgumentException when the input is out of range
      int[] arg0 = new int[2];
      arg0[0] = (-2117665762);
      arg0[1] = (-2117665762);
      MultidimensionalCounter multidimensionalCounter = new MultidimensionalCounter(arg0);
      try {
      multidimensionalCounter.getCount(arg0);
      fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      //
      // -2,117,665,762 out of [0, -2,117,665,763] range
      //
      verifyException("org.apache.commons.math3.util.MultidimensionalCounter", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetCountsWithPositive() throws Throwable  {
      // Test that an IllegalArgumentException is thrown when the input value is out of the valid range
      int[] arg0 = new int[1];
      arg0[0] = 6;
      MultidimensionalCounter multidimensionalCounter = new MultidimensionalCounter(arg0);
      try {
      multidimensionalCounter.getCounts(6);
      fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
      // 6 out of [0, 6] range
      verifyException("org.apache.commons.math3.util.MultidimensionalCounter", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetCountsWithNegative() throws Throwable  {
      // Test that the MultidimensionalCounter throws an IllegalArgumentException when the input value is out of range.
      // Given a MultidimensionalCounter with a single dimension and a range of 197
      int[] arg0 = new int[1];
      arg0[0] = 197;
      MultidimensionalCounter multidimensionalCounter = new MultidimensionalCounter(arg0);
      
      // When the input value of -1,599 is used to getCounts()
      try {
      multidimensionalCounter.getCounts(-1599);
      fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
      // Then an IllegalArgumentException is thrown with a message indicating that the input value is out of range
      verifyException("org.apache.commons.math3.util.MultidimensionalCounter", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesMultidimensionalCounter() throws Throwable  {
      int[] arg0 = new int[10];
      // Create a new instance of MultidimensionalCounter using the array argument0
      MultidimensionalCounter multidimensionalCounter = null;
      try {
      // Try to create a new instance with an invalid argument (array length is smaller than minimum)
      multidimensionalCounter = new MultidimensionalCounter(arg0);
      fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
      // Verify that the expected exception was thrown
      verifyException("org.apache.commons.math3.util.MultidimensionalCounter", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetDimension() throws Throwable  {
      // Tests the MultidimensionalCounter class by creating a new instance with an array of length 2, setting the values at indices 0 and 1 to 6 and 959 respectively, and verifying that the dimension is 2 and the size is 5754.
      int[] arg0 = new int[2];
      arg0[0] = 6;
      arg0[1] = 959;
      MultidimensionalCounter multidimensionalCounter = new MultidimensionalCounter(arg0);
      
      // Verifies that the dimension of the counter is 2.
      assertEquals(2, multidimensionalCounter.getDimension());
      
      // Verifies that the size of the counter is 5754.
      assertEquals(5754, multidimensionalCounter.getSize());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetSize() throws Throwable  {
      // Given a MultidimensionalCounter object with an array of length 1
      int[] arg0 = new int[1];
      arg0[0] = 25;
      MultidimensionalCounter multidimensionalCounter = new MultidimensionalCounter(arg0);
      
      // When the getSize method is called on the object
      int size = multidimensionalCounter.getSize();
      
      // Then the method should return the correct size of the array, which is 25 in this case
      assertEquals(25, size);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetSizes() throws Throwable  {
      // Given a MultidimensionalCounter with an array of size 1
      int[] arg0 = new int[1];
      arg0[0] = 1072;
      MultidimensionalCounter multidimensionalCounter = new MultidimensionalCounter(arg0);
      
      // When the getSizes method is called
      multidimensionalCounter.getSizes();
      
      // Then the size of the counter should be equal to the value in the array
      assertEquals(1072, multidimensionalCounter.getSize());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIteratorAndGetCountTakingInt() throws Throwable  {
      // Test the behavior of the MultidimensionalCounter class with an array argument
      int[] arg0 = new int[1];
      arg0[0] = 2457;
      MultidimensionalCounter multidimensionalCounter = new MultidimensionalCounter(arg0);
      
      // Create an iterator for the multidimensional counter
      MultidimensionalCounter.Iterator iterator = multidimensionalCounter.iterator();
      
      // Try to get the count of a value that is not present in the array
      try {
      int result = iterator.getCount(2457);
      fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch (ArrayIndexOutOfBoundsException e) {
      // Verify that the expected exception was thrown
      verifyException("org.apache.commons.math3.util.MultidimensionalCounter$Iterator", e);}
  }
}
