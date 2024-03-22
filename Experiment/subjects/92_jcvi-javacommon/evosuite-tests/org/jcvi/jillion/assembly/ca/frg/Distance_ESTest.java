/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Thu Mar 21 10:50:08 GMT 2024
 */

package org.jcvi.jillion.assembly.ca.frg;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jcvi.jillion.assembly.ca.frg.Distance;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Distance_ESTest extends Distance_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testTransformIntoCeleraAssemblerDistanceReturningDistanceWhereGetMinIsPositive() throws Throwable  {
      // Given a distance object with min and max values set to 1, and mean and standard deviation values set to 1 and -0.004999995F respectively
      Distance originalDistance = Distance.buildDistance(1, 1, (float) 1, (float) 1);
      
      // When the distance object is transformed into a Celera Assembler distance using the transformIntoCeleraAssemblerDistance method
      Distance transformedDistance = Distance.transformIntoCeleraAssemblerDistance(originalDistance);
      
      // Then the resulting distance object should have the expected standard deviation and mean values
      assertEquals((-0.004999995F), transformedDistance.getStdDev(), 0.01F);
      assertEquals(1.0F, transformedDistance.getMean(), 0.01F);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testBuildDistanceTaking2IntsAndTransformIntoCeleraAssemblerDistance() throws Throwable  {
      // rollbacked to evosuite
      Distance arg0 = Distance.buildDistance((-146), (-146));
      Distance transformIntoCeleraAssemblerDistance = Distance.transformIntoCeleraAssemblerDistance(arg0);
      assertEquals(0.0F, arg0.getStdDev(), 0.01F);
      assertEquals((-49.005F), transformIntoCeleraAssemblerDistance.getStdDev(), 0.01F);
      assertEquals((-146), arg0.getMax());
      assertEquals((-146.0F), transformIntoCeleraAssemblerDistance.getMean(), 0.01F);
      assertEquals((-146), arg0.getMin());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetStdDevReturningPositive() throws Throwable  {
      // Given a distance of 1741 meters and no variance
      Distance buildDistance = Distance.buildDistance(1741, 0, (float) 0, (float) 1741);
      
      // When we calculate the standard deviation
      float stdDev = buildDistance.getStdDev();
      
      // Then the mean should be equal to the distance
      assertEquals(1741.0F, buildDistance.getMean(), 0.01F);
      
      // And the minimum and maximum values should match the input values
      assertEquals(1741, buildDistance.getMin());
      assertEquals(0, buildDistance.getMax());
      
      // And the standard deviation should be equal to the distance
      assertEquals(1741.0F, stdDev, 0.01F);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetMinReturningZero() throws Throwable  {
      // Given a distance with zero values
      Distance buildDistance = Distance.buildDistance(0, 0);
      
      // When the minimum value is retrieved
      int min = buildDistance.getMin();
      
      // Then the minimum value should be equal to 0
      assertEquals(0, min);
      
      // And the mean should be equal to 0.0F with a tolerance of 0.01F
      assertEquals(0.0F, buildDistance.getMean(), 0.01F);
      
      // And the maximum value should be equal to 0
      assertEquals(0, buildDistance.getMax());
      
      // And the standard deviation should be equal to 0.0F with a tolerance of 0.01F
      assertEquals(0.0F, buildDistance.getStdDev(), 0.01F);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetMinReturningPositive() throws Throwable  {
      // Given a set of distance measurements with a minimum value of 1741 and a maximum value of 1741
      Distance buildDistance = Distance.buildDistance(1741, 0, (float) 0, (float) 1741);
      
      // When the getMin() method is called on the distance object
      int min = buildDistance.getMin();
      
      // Then the minimum value of the distance measurements should be returned
      assertEquals(1741, min);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetMeanReturningZero() throws Throwable  {
      // Test case for the Distance class with values (1741, 0, 1741)
      Distance buildDistance = Distance.buildDistance(1741, 0, (float) 0, (float) 1741);
      
      // Calculate and assert the mean value of the distance
      float mean = buildDistance.getMean();
      assertEquals(1741, buildDistance.getMin());
      
      // Calculate and assert the standard deviation of the distance
      float stdDev = buildDistance.getStdDev();
      assertEquals(0, buildDistance.getMax());
      
      // Check that the mean and standard deviation are equal to the expected values
      assertEquals(1741, mean, 0.01F);
      assertEquals(0.0F, stdDev, 0.01F);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetMeanReturningPositive() throws Throwable  {
      // Given a distance with values (1, 1, 1, 1)
      Distance buildDistance = Distance.buildDistance(1, 1, (float) 1, (float) 1);
      
      // When we get the mean of the distance
      float mean = buildDistance.getMean();
      
      // Then the mean should be equal to 1.0F
      assertEquals(1.0F, mean, 0.01F);
      
      // And the standard deviation should be equal to 1.0F
      assertEquals(1.0F, buildDistance.getStdDev(), 0.01F);
      
      // And the maximum value should be equal to 1
      assertEquals(1, buildDistance.getMax());
      
      // And the minimum value should be equal to 1
      assertEquals(1, buildDistance.getMin());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetMaxReturningZero() throws Throwable  {
      // Create a new Distance object with the given values
      Distance buildDistance = Distance.buildDistance(0, 0);
      
      // Check the maximum value of the Distance object
      int max = buildDistance.getMax();
      assertEquals(0, max);
      
      // Check the standard deviation of the Distance object
      float stdDev = buildDistance.getStdDev();
      assertEquals(0.0F, stdDev, 0.01F);
      
      // Check the mean value of the Distance object
      float mean = buildDistance.getMean();
      assertEquals(0.0F, mean, 0.01F);
      
      // Check the minimum value of the Distance object
      int min = buildDistance.getMin();
      assertEquals(0, min);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetMaxReturningPositive() throws Throwable  {
      // Arrange
      Distance buildDistance = Distance.buildDistance(1, 1, (float) 1, (float) 1);
      
      // Act
      int max = buildDistance.getMax();
      assertEquals(1, max);
      
      float mean = buildDistance.getMean();
      assertEquals(1.0F, mean, 0.01F);
      
      float stdDev = buildDistance.getStdDev();
      assertEquals(1.0F, stdDev, 0.01F);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetStdDev() throws Throwable  {
      // Given a Distance object with values for max, min, mean and standard deviation
      Distance buildDistance = Distance.buildDistance(1462, 1462, (float) 1462, (-1928.3813F));
      
      // When the standard deviation is requested
      float stdDev = buildDistance.getStdDev();
      
      // Then the returned value should match the expected value with a tolerance of 0.01
      assertEquals(stdDev, (-1928.3813F), 0.01F);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testBuildDistanceTaking4ArgumentsReturningDistanceWhereGetMinIsNegative() throws Throwable  {
      // Testing the buildDistance method with a negative mean value
      Distance buildDistance = Distance.buildDistance((-146), 0, (-920.46F), (float) 0);
      
      // Checking that the mean value is equal to the expected value of -920.46F
      assertEquals((-920.46F), buildDistance.getMean(), 0.01F);
      
      // Checking that the standard deviation is equal to the expected value of 0.0F
      assertEquals(0.0F, buildDistance.getStdDev(), 0.01F);
      
      // Checking that the minimum value is equal to the expected value of -146
      assertEquals((-146), buildDistance.getMin());
      
      // Checking that the maximum value is equal to the expected value of 0
      assertEquals(0, buildDistance.getMax());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testBuildDistanceTaking4ArgumentsReturningDistanceWhereGetMaxIsNegative() throws Throwable  {
      // Create a new Distance object with a minimum value of 0, a maximum value of -146, and a mean of -146.0F
      Distance buildDistance = Distance.buildDistance(0, (-146), (-146.0F), 0.0F);
      
      // Assert that the standard deviation is 0.0F with a tolerance of 0.01F
      assertEquals(0.0F, buildDistance.getStdDev(), 0.01F);
      
      // Assert that the minimum value is 0
      assertEquals(0, buildDistance.getMin());
      
      // Assert that the maximum value is -146
      assertEquals((-146), buildDistance.getMax());
      
      // Assert that the mean is -146.0F with a tolerance of 0.01F
      assertEquals((-146.0F), buildDistance.getMean(), 0.01F);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testBuildDistanceTaking2IntsReturningDistanceWhereGetStdDevIsPositive() throws Throwable  {
      // Test that a valid input of (-380, 0) results in the expected output
      Distance buildDistance = Distance.buildDistance((-380), 0);
      assertEquals(0, buildDistance.getMax());
      assertEquals((-380), buildDistance.getMin());
      assertEquals(63.333332F, buildDistance.getStdDev(), 0.01F);
      assertEquals((-190.0F), buildDistance.getMean(), 0.01F);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testBuildDistanceTaking2FloatsReturningDistanceWhereGetMinIsPositive() throws Throwable  {
      // Create a new Distance object with the given values
      Distance buildDistance = Distance.buildDistance(1102.52F, (float) (-1));
      
      // Assert that the minimum distance is equal to 1099
      assertEquals(1099, buildDistance.getMin());
      
      // Assert that the standard deviation of the distance is close to (-1.0) within a tolerance of 0.01
      assertEquals((-1.0F), buildDistance.getStdDev(), 0.01F);
      
      // Assert that the maximum distance is equal to 1105
      assertEquals(1105, buildDistance.getMax());
      
      // Assert that the mean of the distance is equal to 1102.52 within a tolerance of 0.01
      assertEquals(1102.52F, buildDistance.getMean(), 0.01F);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testBuildDistanceTaking2FloatsReturningDistanceWhereGetMaxIsNegative() throws Throwable  {
      // Test that the buildDistance method returns a valid distance object
      Distance buildDistance = Distance.buildDistance((-1700.4532F), 0.0F);
      assertNotNull(buildDistance);
      
      // Test that the min and max values are correct
      assertEquals((-1700), buildDistance.getMin());
      assertEquals((-1700), buildDistance.getMax());
      
      // Test that the mean and standard deviation values are correct
      assertEquals((-1700.4532F), buildDistance.getMean(), 0.01F);
      assertEquals(0.0F, buildDistance.getStdDev(), 0.01F);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetMaxReturningNegative() throws Throwable  {
      // Given a Distance object with values (-146, -146)
      Distance buildDistance = Distance.buildDistance((-146), (-146));
      
      // When the getMax method is called on the Distance object
      int max = buildDistance.getMax();
      
      // Then the value returned should be equal to the maximum value in the data set
      assertEquals((-146), max);
      
      // When the getMean method is called on the Distance object
      double mean = buildDistance.getMean();
      
      // Then the value returned should be close to the expected value (-146) with a tolerance of 0.01F
      assertEquals((-146.0F), mean, 0.01F);
      
      // When the getMin method is called on the Distance object
      int min = buildDistance.getMin();
      
      // Then the value returned should be equal to the minimum value in the data set
      assertEquals((-146), min);
      
      // When the getStdDev method is called on the Distance object
      double stdDev = buildDistance.getStdDev();
      
      // Then the value returned should be close to 0 with a tolerance of 0.01F
      assertEquals(0.0F, stdDev, 0.01F);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetMinReturningNegative() throws Throwable  {
      // Create a new Distance object with values of 1 and 1
      Distance buildDistance = Distance.buildDistance((float) 1, (float) 1);
      
      // Get the minimum value from the Distance object
      int min = buildDistance.getMin();
      
      // Assert that the minimum value is equal to -2
      assertEquals(-2, min);
      
      // Get the maximum value from the Distance object
      int max = buildDistance.getMax();
      
      // Assert that the maximum value is equal to 4
      assertEquals(4, max);
      
      // Get the standard deviation of the Distance object
      float stdDev = buildDistance.getStdDev();
      
      // Assert that the standard deviation is equal to 1.0F with a tolerance of 0.01F
      assertEquals(1.0F, stdDev, 0.01F);
      
      // Get the mean of the Distance object
      float mean = buildDistance.getMean();
      
      // Assert that the mean is equal to 1.0F with a tolerance of 0.01F
      assertEquals(1.0F, mean, 0.01F);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetStdDevReturningZero() throws Throwable  {
      // Given a Distance object with value 1
      Distance buildDistance = Distance.buildDistance(1, 1);
      
      // When the standard deviation is calculated
      float stdDev = buildDistance.getStdDev();
      
      // Then the standard deviation should be zero
      assertEquals(0.0F, stdDev, 0.01F);
      
      // And the mean should be equal to the value of the Distance object
      assertEquals(1.0F, buildDistance.getMean(), 0.01F);
      
      // And the minimum and maximum values should be equal to the value of the Distance object
      assertEquals(1, buildDistance.getMin());
      assertEquals(1, buildDistance.getMax());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetMeanReturningNegative() throws Throwable  {
      // Given a Distance object with -146 as both min and max values
      Distance buildDistance = Distance.buildDistance(-146, -146);
      
      // When the getMean method is called on the Distance object
      float mean = buildDistance.getMean();
      
      // Then the mean should be equal to 0.0F
      assertEquals(0.0F, buildDistance.getStdDev(), 0.01F);
      
      // And the min and max values should still be -146
      assertEquals(-146.0F, mean, 0.01F);
      assertEquals(-146, buildDistance.getMin());
      assertEquals(-146, buildDistance.getMax());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testTransformIntoCeleraAssemblerDistanceReturningDistanceWhereGetStdDevIsPositive() throws Throwable  {
      // Given a Distance object with values for min, max, and standard deviation
      Distance arg0 = Distance.buildDistance(1619.4149F, 1619.4149F);
      
      // When the Distance is transformed into Celera Assembler distance
      Distance transformIntoCeleraAssemblerDistance = Distance.transformIntoCeleraAssemblerDistance(arg0);
      
      // Then the transformed distance should have a different standard deviation value
      assertEquals(539.4666F, transformIntoCeleraAssemblerDistance.getStdDev(), 0.01F);
      
      // And the transformed distance should have the same min and max values as the original distance
      assertEquals((-3238), arg0.getMin());
      assertEquals(6477, arg0.getMax());
      
      // And the transformed distance should not be equal to the original distance (as it has different standard deviation value)
      assertFalse(arg0.equals((Object)transformIntoCeleraAssemblerDistance));
      
      // And the transformed distance should have the same mean as the original distance
      assertEquals(1619.4149F, transformIntoCeleraAssemblerDistance.getMean(), 0.01F);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testBuildDistanceTaking2IntsReturningDistanceWhereGetMinIsZero() throws Throwable  {
      // Create two Distance objects with the same values
      Distance arg0 = Distance.buildDistance(1741, 0, (float) 0, (float) 1741);
      Distance buildDistance = Distance.buildDistance(0, 0);
      
      // Assert that the objects are equal
      assertEquals(0.0F, buildDistance.getStdDev(), 0.01F);
      assertEquals(0, arg0.getMax());
      assertFalse(buildDistance.equals(arg0));
      assertEquals(0, buildDistance.getMin());
      assertEquals(0, arg0.getMin());
      assertEquals(1741, arg0.getStdDev(), 0.01F);
      assertEquals(0.0F, arg0.getMean(), 0.01F);
      assertEquals(0.0F, buildDistance.getMean(), 0.01F);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsReturningTrue() throws Throwable  {
      // Given a distance with min and max values
      Distance arg0 = Distance.buildDistance(1619.4149F, 1619.4149F);
      
      // When the equals method is called on two distances with the same min and max values
      Distance buildDistance = Distance.buildDistance(1619.4149F, 1619.4149F);
      boolean equals = buildDistance.equals(arg0);
      
      // Then the distance objects should be equal
      assertTrue(equals);
      
      // And the min and max values of the two distances should match
      assertEquals(-3238, buildDistance.getMin());
      assertEquals(6477, buildDistance.getMax());
      
      // And the mean value of the distance should be equal to the input value
      assertEquals(1619.4149F, buildDistance.getMean(), 0.01F);
      
      // And the standard deviation of the distance should be equal to the input value
      assertEquals(1619.4149F, buildDistance.getStdDev(), 0.01F);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testBuildDistanceTaking4ArgumentsReturningDistanceWhereGetMaxIsPositive() throws Throwable  {
      // Given two distances with different values
      Distance buildDistance = Distance.buildDistance(1489, 1489, (float) 1489, (float) 1489);
      Distance arg0 = Distance.buildDistance(1489, 1489, 1376.4374F, (float) 1489);
      
      // When we compare the two distances using equals() method
      boolean equals = buildDistance.equals(arg0);
      
      // Then the comparison returns false
      assertFalse(arg0.equals((Object)buildDistance));
      
      // And the getMin(), getStdDev(), and getMean() methods return the correct values for both distances
      assertEquals(1489, arg0.getMin());
      assertEquals(1376.4374F, arg0.getStdDev(), 0.01F);
      assertEquals(1489.0F, buildDistance.getMean(), 0.01F);
      assertEquals(1489, arg0.getMax());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testBuildDistanceTaking2Floats() throws Throwable  {
      // rollbacked to evosuite
      Distance buildDistance = Distance.buildDistance(1489, 1489, (float) 1489, (float) 1489);
      Distance arg0 = Distance.buildDistance((float) 1489, (float) 1489);
      boolean equals = buildDistance.equals(arg0);
      assertEquals(1489.0F, arg0.getStdDev(), 0.01F);
      assertEquals(1489, buildDistance.getMin());
      assertEquals((-2978), arg0.getMin());
      assertEquals(1489.0F, buildDistance.getMean(), 0.01F);
      assertEquals(1489.0F, arg0.getMean(), 0.01F);
      assertEquals(1489.0F, buildDistance.getStdDev(), 0.01F);
      assertEquals(5956, arg0.getMax());
      assertEquals(1489, buildDistance.getMax());
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsWithNonNull() throws Throwable  {
      // Create a new distance object with zero values
      Distance buildDistance = Distance.buildDistance(0, 0);
      
      // Check if the object equals null
      Object arg0 = new Object();
      boolean equals = buildDistance.equals(arg0);
      assertFalse(equals);
      
      // Check the values of the distance object
      assertEquals(0, buildDistance.getMax());
      assertEquals(0, buildDistance.getMin());
      assertEquals(0.0F, buildDistance.getMean(), 0.01F);
      assertEquals(0.0F, buildDistance.getStdDev(), 0.01F);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testBuildDistanceTaking2FloatsReturningDistanceWhereGetMeanIsNegativeAndDistanceWhereGetStdDevIsNegative() throws Throwable  {
      // No Comments were added
      Distance arg0 = Distance.buildDistance((-15.987906F), (-15.987906F));
      boolean equals = arg0.equals(arg0);
      assertEquals((-15.987906F), arg0.getMean(), 0.01F);
      assertTrue(equals);
      assertEquals(31, arg0.getMax());
      assertEquals((-15.987906F), arg0.getStdDev(), 0.01F);
      assertEquals((-63), arg0.getMin());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsWithNull() throws Throwable  {
      // Create an instance of the Distance class with the given values
      Distance buildDistance = Distance.buildDistance(3, 3, (float) 3, (float) 3);
      
      // Test that the equals method returns false when comparing a Distance object to null
      boolean equals = buildDistance.equals((Object) null);
      assertFalse(equals);
      
      // Test that the getMax method returns the correct value
      assertEquals(3, buildDistance.getMax());
      
      // Test that the getStdDev method returns the correct value with a delta of 0.01F
      assertEquals(3.0F, buildDistance.getStdDev(), 0.01F);
      
      // Test that the getMin method returns the correct value
      assertEquals(3, buildDistance.getMin());
      
      // Test that the getMean method returns the correct value with a delta of 0.01F
      assertEquals(3.0F, buildDistance.getMean(), 0.01F);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testTransformIntoCeleraAssemblerDistanceReturningDistanceWhereGetStdDevIsZero() throws Throwable  {
      // Given: A Distance object with a value of 0.0F and a standard deviation of 0.01F
      Distance arg0 = Distance.buildDistance(0.0F, 0.0F);
      
      // When: We transform the distance into Celera Assembler format using the transformIntoCeleraAssemblerDistance method
      Distance transformIntoCeleraAssemblerDistance = Distance.transformIntoCeleraAssemblerDistance(arg0);
      
      // Then: The transformed distance should have a standard deviation of 0.0F, a minimum value of 0, a maximum value of 0, and a mean value of 0.0F
      assertEquals(0.0F, transformIntoCeleraAssemblerDistance.getStdDev(), 0.01F);
      assertEquals(0, transformIntoCeleraAssemblerDistance.getMin());
      assertEquals(0, transformIntoCeleraAssemblerDistance.getMax());
      assertEquals(0.0F, transformIntoCeleraAssemblerDistance.getMean(), 0.01F);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHashCode() throws Throwable  {
      // Given a Distance object with min=0, max=0, mean=0.0F, and stdDev=0.0F
      Distance buildDistance = Distance.buildDistance(0, 0, 0.0F, (float) 0);
      
      // When the hashCode() method is called on the object
      int hashCode = buildDistance.hashCode();
      
      // Then the hashCode should be equal to 0
      assertEquals(0, hashCode);
      
      // And the getMin(), getMax(), getMean(), and getStdDev() methods should all return 0
      assertEquals(0, buildDistance.getMin());
      assertEquals(0.0F, buildDistance.getStdDev(), 0.01F);
      assertEquals(0, buildDistance.getMax());
      assertEquals(0.0F, buildDistance.getMean(), 0.01F);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testBuildDistanceTaking2IntsReturningDistanceWhereGetStdDevIsNegative() throws Throwable  {
      // Test that the Distance class is able to create a valid distance object
      Distance buildDistance = Distance.buildDistance(100, 2);
      assertEquals(100, buildDistance.getMin());
      assertEquals(51.0F, buildDistance.getMean(), 0.01F);
      assertEquals((-16.333334F), buildDistance.getStdDev(), 0.01F);
      assertEquals(2, buildDistance.getMax());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testToString() throws Throwable  {
      // Given a distance with zero values
      Distance buildDistance = Distance.buildDistance(0.0F, 0.0F);
      
      // When the distance is converted to a string
      String string = buildDistance.toString();
      
      // Then the resulting string should be "0.000, std: 0.000"
      assertEquals("0.000, std: 0.000", string);
      
      // And the minimum and maximum values of the distance should both be zero
      assertEquals(0, buildDistance.getMax());
      assertEquals(0, buildDistance.getMin());
  }
}
