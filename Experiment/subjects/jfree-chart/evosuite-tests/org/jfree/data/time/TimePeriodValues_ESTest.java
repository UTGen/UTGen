/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Wed Mar 20 06:02:15 GMT 2024
 */

package org.jfree.data.time;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.data.time.Day;
import org.jfree.data.time.Millisecond;
import org.jfree.data.time.Minute;
import org.jfree.data.time.TimePeriod;
import org.jfree.data.time.TimePeriodValue;
import org.jfree.data.time.TimePeriodValues;
import org.jfree.data.time.Year;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TimePeriodValues_ESTest extends TimePeriodValues_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetValue() throws Throwable  {
      // Create a new instance of TimePeriodValues with the given input string
      TimePeriodValues timePeriodValues = new TimePeriodValues("}0]XI^2_+");
      
      // Add a null value for the first year in the input string
      Year arg0 = new Year();
      timePeriodValues.add((TimePeriod) arg0, (Number) null);
      
      // Verify that the minStartIndex and minMiddleIndex are both 0
      assertEquals(0, timePeriodValues.getMinStartIndex());
      assertEquals(0, timePeriodValues.getMinMiddleIndex());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetTimePeriod() throws Throwable  {
      // Given a TimePeriodValues object with some values
      TimePeriodValues timePeriodValues = new TimePeriodValues("3A*]Ny93K4}~M0Yo~");
      
      // When a new Day object is added to the TimePeriodValues
      Day arg0 = new Day();
      timePeriodValues.add((TimePeriod) arg0, 0.0);
      
      // Then the getMinEndIndex() and getMaxStartIndex() methods should return 0
      assertEquals(0, timePeriodValues.getMinEndIndex());
      assertEquals(0, timePeriodValues.getMaxStartIndex());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetRangeDescriptionReturningNull() throws Throwable  {
      // No Comments were added
      TimePeriodValues timePeriodValues = new TimePeriodValues("8\"9`[{_hk", "8\"9`[{_hk", (String) null);
      String rangeDescription = timePeriodValues.getRangeDescription();
      assertEquals((-1), timePeriodValues.getMinMiddleIndex());
      assertEquals((-1), timePeriodValues.getMaxStartIndex());
      assertEquals((-1), timePeriodValues.getMinStartIndex());
      assertEquals((-1), timePeriodValues.getMaxEndIndex());
      assertEquals((-1), timePeriodValues.getMaxMiddleIndex());
      assertEquals("8\"9`[{_hk", timePeriodValues.getDomainDescription());
      assertEquals((-1), timePeriodValues.getMinEndIndex());
      assertNull(rangeDescription);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetRangeDescriptionReturningNonEmptyString() throws Throwable  {
      // rollbacked to evosuite
      TimePeriodValues timePeriodValues = new TimePeriodValues("8\"9`[{_hk");
      String rangeDescription = timePeriodValues.getRangeDescription();
      assertEquals((-1), timePeriodValues.getMinStartIndex());
      assertEquals((-1), timePeriodValues.getMaxStartIndex());
      assertEquals((-1), timePeriodValues.getMaxEndIndex());
      assertEquals("Value", rangeDescription);
      assertEquals((-1), timePeriodValues.getMaxMiddleIndex());
      assertEquals((-1), timePeriodValues.getMinEndIndex());
      assertEquals("Time", timePeriodValues.getDomainDescription());
      assertEquals((-1), timePeriodValues.getMinMiddleIndex());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetMinMiddleIndexReturningZero() throws Throwable  {
      // Test that the minimum start and middle indices are correct for a single day
      TimePeriodValues timePeriodValues = new TimePeriodValues("`3A*]Ny93K4}~M0Yo~");
      Day arg0 = new Day();
      timePeriodValues.add((TimePeriod) arg0, 0.0);
      int minMiddleIndex = timePeriodValues.getMinMiddleIndex();
      assertEquals(0, timePeriodValues.getMaxStartIndex()); // The maximum start index is always zero for a single day
      assertEquals(0, timePeriodValues.getMinStartIndex()); // The minimum start index is always zero for a single day
      assertEquals(0, minMiddleIndex); // The minimum middle index is also always zero for a single day
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetMaxStartIndexReturningZero() throws Throwable  {
      // rollbacked to evosuite
      TimePeriodValues timePeriodValues = new TimePeriodValues("^wCI7", "^wCI7", "^wCI7");
      Millisecond arg0 = new Millisecond();
      timePeriodValues.add((TimePeriod) arg0, (double) 0);
      int maxStartIndex = timePeriodValues.getMaxStartIndex();
      assertEquals(0, timePeriodValues.getMinStartIndex());
      assertEquals(0, timePeriodValues.getMinMiddleIndex());
      assertEquals(0, maxStartIndex);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetMaxMiddleIndexReturningZero() throws Throwable  {
      // Arrange
      TimePeriodValues timePeriodValues = new TimePeriodValues("`3A*]Ny93K4}~M0Yo~");
      Day arg0 = new Day();
      
      // Act
      timePeriodValues.add(arg0, 0.0);
      
      // Assert
      int maxMiddleIndex = timePeriodValues.getMaxMiddleIndex();
      assertEquals(0, timePeriodValues.getMinMiddleIndex());
      assertEquals(0, timePeriodValues.getMinStartIndex());
      assertEquals(0, maxMiddleIndex);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetMaxEndIndexReturningZero() throws Throwable  {
      // Given a TimePeriodValues object with a single day
      TimePeriodValues timePeriodValues = new TimePeriodValues("3A*]Ny93K4}~M0Yo~");
      
      // When we add a day to the TimePeriodValues object
      Day arg0 = new Day();
      timePeriodValues.add((TimePeriod) arg0, 0.0);
      
      // Then the minStartIndex, minMiddleIndex, and maxEndIndex should be updated accordingly
      assertEquals(0, timePeriodValues.getMinStartIndex());
      assertEquals(0, timePeriodValues.getMinMiddleIndex());
      assertEquals(0, timePeriodValues.getMaxEndIndex());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetItemCountReturningPositive() throws Throwable  {
      // Given a TimePeriodValues instance with some existing items
      TimePeriodValues timePeriodValues = new TimePeriodValues("5|e'>Q0 ruW'/Nw$]h", "v_SU`2%iwKHj", "^ K ~304:&O.Oa");
      
      // When a new Minute instance is added with a valid value
      Minute arg0 = new Minute();
      timePeriodValues.add((TimePeriod) arg0, (double) 59);
      
      // Then the item count should be increased by one
      assertEquals(1, timePeriodValues.getItemCount());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetDomainDescriptionReturningNull() throws Throwable  {
      // rollbacked to evosuite
      TimePeriodValues timePeriodValues = new TimePeriodValues("'wC~W", (String) null, "?#c%A~\"{r1");
      String domainDescription = timePeriodValues.getDomainDescription();
      assertEquals((-1), timePeriodValues.getMaxEndIndex());
      assertEquals((-1), timePeriodValues.getMinEndIndex());
      assertNull(domainDescription);
      assertEquals((-1), timePeriodValues.getMaxMiddleIndex());
      assertEquals((-1), timePeriodValues.getMinStartIndex());
      assertEquals((-1), timePeriodValues.getMaxStartIndex());
      assertEquals((-1), timePeriodValues.getMinMiddleIndex());
      assertEquals("?#c%A~\"{r1", timePeriodValues.getRangeDescription());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetDomainDescriptionReturningNonEmptyString() throws Throwable  {
      // No Comments were added
      TimePeriodValues timePeriodValues = new TimePeriodValues("8\"9`[{_hk");
      String domainDescription = timePeriodValues.getDomainDescription();
      assertEquals((-1), timePeriodValues.getMaxStartIndex());
      assertEquals((-1), timePeriodValues.getMinMiddleIndex());
      assertEquals((-1), timePeriodValues.getMaxEndIndex());
      assertEquals((-1), timePeriodValues.getMinEndIndex());
      assertEquals("Value", timePeriodValues.getRangeDescription());
      assertEquals("Time", domainDescription);
      assertEquals((-1), timePeriodValues.getMinStartIndex());
      assertEquals((-1), timePeriodValues.getMaxMiddleIndex());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetDataItem() throws Throwable  {
      // Given a TimePeriodValues instance with data and an empty Day object
      TimePeriodValues timePeriodValues = new TimePeriodValues("`3A*]Ny93K4}~M0Yo~");
      Day arg0 = new Day();
      
      // When the add method is called with the TimePeriod object and 0.0 as arguments
      timePeriodValues.add((TimePeriod) arg0, 0.0);
      
      // Then the getDataItem method should return a valid value
      assertEquals(0, timePeriodValues.getMinStartIndex());
      assertEquals(0, timePeriodValues.getMaxStartIndex());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreateCopyReturningTimePeriodValuesWhereGetNotifyIsFalse() throws Throwable  {
      // Given: A TimePeriodValues object with some data
      TimePeriodValues timePeriodValues = new TimePeriodValues("`3A*]Ny93K4}~M0Yo~");
      
      // When: The createCopy method is called on the TimePeriodValues object
      TimePeriodValues createCopy = timePeriodValues.createCopy((-3066), 2427);
      
      // Then: A new TimePeriodValues object with some data is created
      assertEquals("Time", createCopy.getDomainDescription());
      assertEquals((-1), createCopy.getMaxStartIndex());
      assertNotSame(createCopy, timePeriodValues);
      assertEquals((-1), createCopy.getMinEndIndex());
      assertEquals((-1), createCopy.getMaxMiddleIndex());
      assertEquals((-1), createCopy.getMaxEndIndex());
      assertEquals((-1), createCopy.getMinStartIndex());
      assertEquals("Value", createCopy.getRangeDescription());
      assertEquals((-1), createCopy.getMinMiddleIndex());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHashCode0() throws Throwable  {
      // No Comments were added
      TimePeriodValues timePeriodValues = new TimePeriodValues("8\"9`[{_hk", "8\"9`[{_hk", (String) null);
      timePeriodValues.hashCode();
      assertEquals((-1), timePeriodValues.getMinStartIndex());
      assertEquals((-1), timePeriodValues.getMaxStartIndex());
      assertEquals("8\"9`[{_hk", timePeriodValues.getDomainDescription());
      assertEquals((-1), timePeriodValues.getMinEndIndex());
      assertEquals((-1), timePeriodValues.getMaxEndIndex());
      assertEquals((-1), timePeriodValues.getMinMiddleIndex());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHashCode1() throws Throwable  {
      // No Comments were added
      TimePeriodValues timePeriodValues = new TimePeriodValues("gb/%/<.hash9", (String) null, "1/H(>\"");
      timePeriodValues.hashCode();
      assertEquals("1/H(>\"", timePeriodValues.getRangeDescription());
      assertEquals((-1), timePeriodValues.getMaxStartIndex());
      assertEquals((-1), timePeriodValues.getMaxMiddleIndex());
      assertEquals((-1), timePeriodValues.getMinStartIndex());
      assertEquals((-1), timePeriodValues.getMinMiddleIndex());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesTimePeriodValuesTakingStringAndCallsEquals0() throws Throwable  {
      // No Comments were added
      TimePeriodValues timePeriodValues = new TimePeriodValues("e");
      TimePeriodValues arg0 = new TimePeriodValues("e", "e", "e");
      boolean equals = timePeriodValues.equals(arg0);
      assertEquals("Time", timePeriodValues.getDomainDescription());
      assertEquals("e", arg0.getRangeDescription());
      assertEquals((-1), arg0.getMinMiddleIndex());
      assertEquals("Value", timePeriodValues.getRangeDescription());
      assertFalse(equals);
      assertEquals((-1), arg0.getMaxStartIndex());
      assertEquals((-1), arg0.getMinStartIndex());
      assertEquals((-1), arg0.getMaxMiddleIndex());
      assertEquals((-1), arg0.getMaxEndIndex());
      assertEquals("e", arg0.getDomainDescription());
      assertEquals((-1), arg0.getMinEndIndex());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesTimePeriodValuesTakingStringAndCallsEquals1() throws Throwable  {
      // Given: two TimePeriodValues objects, one with a range description of "e" and the other with a range description of "~/k`hx_zbrvNmR~U"
      TimePeriodValues timePeriodValues = new TimePeriodValues("e");
      TimePeriodValues arg0 = new TimePeriodValues("~/k`hx_zbrvNmR~U", "e", "~/k`hx_zbrvNmR~U");
      // When: the equals method is called on these two objects
      boolean equals = timePeriodValues.equals(arg0);
      // Then: the equals method should return false, as the range descriptions are not equal
      assertFalse(equals);
      // And: the min end index, max end index, and max middle index for both objects should be -1
      assertEquals((-1), arg0.getMinEndIndex());
      assertEquals((-1), arg0.getMaxEndIndex());
      assertEquals((-1), arg0.getMaxMiddleIndex());
      // And: the min start index, domain description, and max start index for both objects should be -1
      assertEquals((-1), arg0.getMinStartIndex());
      assertEquals("e", arg0.getDomainDescription());
      assertEquals((-1), arg0.getMaxStartIndex());
      // And: the min middle index for the first object should be -1
      assertEquals((-1), timePeriodValues.getMinMiddleIndex());
      // And: the range description for the first object should be "Value"
      assertEquals("Value", timePeriodValues.getRangeDescription());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEquals0() throws Throwable  {
      // rollbacked to evosuite
      TimePeriodValues timePeriodValues = new TimePeriodValues("2_[DH}=Ww3ZmuUyO72", "2_[DH}=Ww3ZmuUyO72", "2_[DH}=Ww3ZmuUyO72");
      TimePeriodValues arg0 = new TimePeriodValues("2_[DH}=Ww3ZmuUyO72", "2_[DH}=Ww3ZmuUyO72", "");
      boolean equals = timePeriodValues.equals(arg0);
      assertEquals("2_[DH}=Ww3ZmuUyO72", arg0.getDomainDescription());
      assertFalse(equals);
      assertEquals((-1), arg0.getMinEndIndex());
      assertEquals((-1), arg0.getMaxStartIndex());
      assertEquals((-1), arg0.getMaxEndIndex());
      assertEquals((-1), arg0.getMinStartIndex());
      assertEquals((-1), arg0.getMaxMiddleIndex());
      assertEquals((-1), arg0.getMinMiddleIndex());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsReturningTrue() throws Throwable  {
      // Create a new TimePeriodValues object with the given values
      TimePeriodValues arg0 = new TimePeriodValues("'wC~W");
      
      // Call the equals method on the object with itself as an argument
      boolean equals = arg0.equals(arg0);
      
      // Assert that the result of the call to equals is true
      assertTrue(equals);
      
      // Assert that the getRangeDescription() method returns the expected value
      assertEquals("Value", arg0.getRangeDescription());
      
      // Assert that the getMinEndIndex() method returns the expected value
      assertEquals((-1), arg0.getMinEndIndex());
      
      // Assert that the getMinMiddleIndex() method returns the expected value
      assertEquals((-1), arg0.getMinMiddleIndex());
      
      // Assert that the getDomainDescription() method returns the expected value
      assertEquals("Time", arg0.getDomainDescription());
      
      // Assert that the getMinStartIndex() method returns the expected value
      assertEquals((-1), arg0.getMinStartIndex());
      
      // Assert that the getMaxStartIndex() method returns the expected value
      assertEquals((-1), arg0.getMaxStartIndex());
      
      // Assert that the getMaxEndIndex() method returns the expected value
      assertEquals((-1), arg0.getMaxEndIndex());
      
      // Assert that the getMaxMiddleIndex() method returns the expected value
      assertEquals((-1), arg0.getMaxMiddleIndex());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEquals1() throws Throwable  {
      // Test that the TimePeriodValues class can correctly identify the minimum and maximum indices
      // of a time period value.
      TimePeriodValues timePeriodValues = new TimePeriodValues("5|e'>Q0 ruW'/Nw$]h", "v_SU`2%iwKHj", "^ K ~304:&O.Oa");
      
      // Test that the minimum end index is correct
      assertEquals((-1), timePeriodValues.getMinEndIndex());
      
      // Test that the maximum start index is correct
      assertEquals((-1), timePeriodValues.getMaxStartIndex());
      
      // Test that the minimum middle index is correct
      assertEquals((-1), timePeriodValues.getMinMiddleIndex());
      
      // Test that the maximum end index is correct
      assertEquals((-1), timePeriodValues.getMaxEndIndex());
      
      // Test that the domain description is correct
      assertEquals("v_SU`2%iwKHj", timePeriodValues.getDomainDescription());
      
      // Test that the maximum middle index is correct
      assertEquals((-1), timePeriodValues.getMaxMiddleIndex());
      
      // Test that the minimum start index is correct
      assertEquals((-1), timePeriodValues.getMinStartIndex());
      
      // Test that the range description is correct
      assertEquals("^ K ~304:&O.Oa", timePeriodValues.getRangeDescription());
      
      // Test that the equals method returns false when comparing a TimePeriodValues object with a non-TimePeriodValues object
      boolean equals = timePeriodValues.equals("v_SU`2%iwKHj");
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDeleteThrowsIndexOutOfBoundsException() throws Throwable  {
      // No Comments were added
      TimePeriodValues timePeriodValues = new TimePeriodValues("au", "au", "au");
      // Undeclared exception!
      try { 
        timePeriodValues.delete(181, 181);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 181, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDelete() throws Throwable  {
      TimePeriodValues timePeriodValues = new TimePeriodValues("'wC~W");
      Millisecond arg0 = new Millisecond();
      timePeriodValues.add((TimePeriod) arg0, (double) 0);
      // Given a TimePeriodValues object with one element
      assertEquals(1, timePeriodValues.getItemCount());
      
      timePeriodValues.delete(0, (-523));
      // When an element is deleted from the list
      assertEquals(0, timePeriodValues.getItemCount());
      // Then the item count should be 0
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAddTakingTimePeriodValueThrowsIllegalArgumentException() throws Throwable  {
      // Given
      TimePeriodValues timePeriodValues = new TimePeriodValues("Time");
      
      // When
      try {
      timePeriodValues.add((TimePeriodValue) null);
      } catch (IllegalArgumentException e) {
      // Then
      verifyException("org.jfree.data.time.TimePeriodValues", e);
      throw e;}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetMinMiddleIndexReturningNegative() throws Throwable  {
      // Arrange
      TimePeriodValues timePeriodValues = new TimePeriodValues("`3A*]Ny93K4}~M0Yo~");
      
      // Act
      int minMiddleIndex = timePeriodValues.getMinMiddleIndex();
      
      // Assert
      assertEquals(-1, timePeriodValues.getMinStartIndex());
      assertEquals(-1, timePeriodValues.getMaxMiddleIndex());
      assertEquals(-1, timePeriodValues.getMaxStartIndex());
      assertEquals(-1, timePeriodValues.getMaxEndIndex());
      assertEquals("Value", timePeriodValues.getRangeDescription());
      assertEquals(-1, timePeriodValues.getMinEndIndex());
      assertEquals(minMiddleIndex, minMiddleIndex);
      assertEquals("Time", timePeriodValues.getDomainDescription());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetMaxEndIndexReturningNegative() throws Throwable  {
      // Create a new TimePeriodValues object with some sample data
      TimePeriodValues timePeriodValues = new TimePeriodValues("Ap@dsqe", "Ap@dsqe", "Ap@dsqe");
      
      // Get the maximum end index of the range
      int maxEndIndex = timePeriodValues.getMaxEndIndex();
      
      // Verify that the minimum start and end indices are -1, since there is no data
      assertEquals((-1), timePeriodValues.getMinStartIndex());
      assertEquals((-1), timePeriodValues.getMinEndIndex());
      
      // Verify that the maximum start and middle indices are -1, since there is no data
      assertEquals((-1), timePeriodValues.getMaxStartIndex());
      assertEquals((-1), timePeriodValues.getMaxMiddleIndex());
      
      // Verify that the range description is "Ap@dsqe"
      assertEquals("Ap@dsqe", timePeriodValues.getRangeDescription());
      
      // Verify that the maximum end index is -1, since there is no data
      assertEquals((-1), maxEndIndex);
      
      // Verify that the minimum middle index is -1, since there is no data
      assertEquals((-1), timePeriodValues.getMinMiddleIndex());
      
      // Verify that the domain description is "Ap@dsqe"
      assertEquals("Ap@dsqe", timePeriodValues.getDomainDescription());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetMinStartIndexReturningNegative() throws Throwable  {
      // Test that TimePeriodValues returns -1 for all indices when no values are present
      TimePeriodValues timePeriodValues = new TimePeriodValues("", "", "");
      int minStartIndex = timePeriodValues.getMinStartIndex(); // Get the minimum start index of the range
      assertEquals(-1, minStartIndex); // Assert that the minimum start index is -1 (no values present)
      assertEquals(-1, timePeriodValues.getMinMiddleIndex()); // Assert that the minimum middle index is -1 (no values present)
      assertEquals("", timePeriodValues.getRangeDescription()); // Assert that the range description is empty string
      assertEquals(-1, timePeriodValues.getMaxStartIndex()); // Assert that the maximum start index is -1 (no values present)
      assertEquals("", timePeriodValues.getDomainDescription()); // Assert that the domain description is empty string
      assertEquals(-1, timePeriodValues.getMaxMiddleIndex()); // Assert that the maximum middle index is -1 (no values present)
      assertEquals(-1, minStartIndex); // Re-assert that the minimum start index is -1 (no values present)
      assertEquals(-1, timePeriodValues.getMaxEndIndex()); // Assert that the maximum end index is -1 (no values present)
      assertEquals(-1, timePeriodValues.getMinEndIndex()); // Assert that the minimum end index is -1 (no values present)
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetMaxStartIndexReturningNegative() throws Throwable  {
      // Given a TimePeriodValues object with a valid input string
      TimePeriodValues timePeriodValues = new TimePeriodValues("'wC~W");
      
      // When the getMaxStartIndex method is called
      int maxStartIndex = timePeriodValues.getMaxStartIndex();
      
      // Then the value returned should be -1, indicating that there are no valid start indices
      assertEquals(-1, maxStartIndex);
      
      // And the other methods should also return -1, indicating that there are no valid values for their respective purposes
      assertEquals(-1, timePeriodValues.getDomainDescription());
      assertEquals(-1, timePeriodValues.getRangeDescription());
      assertEquals(-1, timePeriodValues.getMinMiddleIndex());
      assertEquals(-1, timePeriodValues.getMaxMiddleIndex());
      assertEquals(-1, timePeriodValues.getMinStartIndex());
      assertEquals(-1, timePeriodValues.getMaxEndIndex());
      assertEquals(-1, timePeriodValues.getMinEndIndex());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetMinEndIndex() throws Throwable  {
      // rollbacked to evosuite
      TimePeriodValues timePeriodValues = new TimePeriodValues("'wC~W", "'wC~W", "'wC~W");
      int minEndIndex = timePeriodValues.getMinEndIndex();
      assertEquals((-1), timePeriodValues.getMaxStartIndex());
      assertEquals((-1), timePeriodValues.getMinMiddleIndex());
      assertEquals((-1), timePeriodValues.getMaxEndIndex());
      assertEquals((-1), timePeriodValues.getMinStartIndex());
      assertEquals((-1), minEndIndex);
      assertEquals("'wC~W", timePeriodValues.getDomainDescription());
      assertEquals((-1), timePeriodValues.getMaxMiddleIndex());
      assertEquals("'wC~W", timePeriodValues.getRangeDescription());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetDomainDescriptionReturningEmptyString() throws Throwable  {
      // Create a new instance of TimePeriodValues with empty strings for all parameters
      TimePeriodValues timePeriodValues = new TimePeriodValues("", "", "");
      
      // Get the domain description from the TimePeriodValues object
      String domainDescription = timePeriodValues.getDomainDescription();
      
      // Assert that the min end index is -1
      assertEquals((-1), timePeriodValues.getMinEndIndex());
      
      // Assert that the min middle index is -1
      assertEquals((-1), timePeriodValues.getMinMiddleIndex());
      
      // Assert that the min start index is -1
      assertEquals((-1), timePeriodValues.getMinStartIndex());
      
      // Assert that the domain description is an empty string
      assertEquals("", domainDescription);
      
      // Assert that the max middle index is -1
      assertEquals((-1), timePeriodValues.getMaxMiddleIndex());
      
      // Assert that the range description is an empty string
      assertEquals("", timePeriodValues.getRangeDescription());
      
      // Assert that the max start index is -1
      assertEquals((-1), timePeriodValues.getMaxStartIndex());
      
      // Assert that the max end index is -1
      assertEquals((-1), timePeriodValues.getMaxEndIndex());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetMinStartIndexReturningZero() throws Throwable  {
      // rollbacked to evosuite
      TimePeriodValues timePeriodValues = new TimePeriodValues("}0]XI^2_+");
      Year arg0 = new Year();
      timePeriodValues.add((TimePeriod) arg0, (Number) null);
      int minStartIndex = timePeriodValues.getMinStartIndex();
      assertEquals(0, timePeriodValues.getMinEndIndex());
      assertEquals(0, timePeriodValues.getMaxMiddleIndex());
      assertEquals(0, minStartIndex);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetItemCountReturningZero() throws Throwable  {
      // No Comments were added
      TimePeriodValues timePeriodValues = new TimePeriodValues("5|e'>Q0 ruW'/Nw$]h", "v_SU`2%iwKHj", "^ K ~304:&O.Oa");
      timePeriodValues.getItemCount();
      assertEquals((-1), timePeriodValues.getMaxEndIndex());
      assertEquals((-1), timePeriodValues.getMaxStartIndex());
      assertEquals((-1), timePeriodValues.getMinStartIndex());
      assertEquals("^ K ~304:&O.Oa", timePeriodValues.getRangeDescription());
      assertEquals((-1), timePeriodValues.getMinMiddleIndex());
      assertEquals((-1), timePeriodValues.getMaxMiddleIndex());
      assertEquals("v_SU`2%iwKHj", timePeriodValues.getDomainDescription());
      assertEquals((-1), timePeriodValues.getMinEndIndex());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreateCopyReturningTimePeriodValuesWhereGetNotifyIsTrue() throws Throwable  {
      // rollbacked to evosuite
      TimePeriodValues timePeriodValues = new TimePeriodValues("");
      Day arg0 = new Day();
      timePeriodValues.add((TimePeriod) arg0, (double) 1392409281320L);
      timePeriodValues.createCopy(0, 0);
      assertEquals(1, timePeriodValues.getItemCount());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetRangeDescription() throws Throwable  {
      // No Comments were added
      TimePeriodValues timePeriodValues = new TimePeriodValues("@I&A\"Wuy!9iJig[");
      assertEquals("Value", timePeriodValues.getRangeDescription());
      
      timePeriodValues.setRangeDescription("@I&A\"Wuy!9iJig[");
      assertEquals("@I&A\"Wuy!9iJig[", timePeriodValues.getRangeDescription());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetDomainDescription() throws Throwable  {
      TimePeriodValues timePeriodValues = new TimePeriodValues("");
      // Given a TimePeriodValues object with an empty domain description
      assertEquals("Time", timePeriodValues.getDomainDescription());
      
      timePeriodValues.setDomainDescription("");
      // When the domain description is set to an empty string
      assertEquals("", timePeriodValues.getDomainDescription());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetMaxMiddleIndexReturningNegative() throws Throwable  {
      // rollbacked to evosuite
      TimePeriodValues timePeriodValues = new TimePeriodValues("lus.lngth", "lus.lngth", "lus.lngth");
      int maxMiddleIndex = timePeriodValues.getMaxMiddleIndex();
      assertEquals((-1), timePeriodValues.getMaxStartIndex());
      assertEquals((-1), timePeriodValues.getMinMiddleIndex());
      assertEquals((-1), timePeriodValues.getMaxEndIndex());
      assertEquals((-1), timePeriodValues.getMinStartIndex());
      assertEquals("lus.lngth", timePeriodValues.getDomainDescription());
      assertEquals((-1), maxMiddleIndex);
      assertEquals("lus.lngth", timePeriodValues.getRangeDescription());
      assertEquals((-1), timePeriodValues.getMinEndIndex());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetRangeDescriptionReturningEmptyString() throws Throwable  {
      // Given a TimePeriodValues instance with empty values
      TimePeriodValues timePeriodValues = new TimePeriodValues("", "", "");
      
      // When we call getRangeDescription on the instance
      String rangeDescription = timePeriodValues.getRangeDescription();
      
      // Then we expect an empty string to be returned
      assertEquals("", rangeDescription);
      
      // And when we call getDomainDescription on the instance
      assertEquals("", timePeriodValues.getDomainDescription());
      
      // We expect the minimum start index to be -1
      assertEquals((-1), timePeriodValues.getMinStartIndex());
      
      // The maximum start index should also be -1
      assertEquals((-1), timePeriodValues.getMaxStartIndex());
      
      // The minimum middle index should be -1
      assertEquals((-1), timePeriodValues.getMinMiddleIndex());
      
      // And the maximum middle index should also be -1
      assertEquals((-1), timePeriodValues.getMaxMiddleIndex());
      
      // We expect the minimum end index to be -1
      assertEquals((-1), timePeriodValues.getMinEndIndex());
      
      // The maximum end index should also be -1
      assertEquals((-1), timePeriodValues.getMaxEndIndex());
  }
}
