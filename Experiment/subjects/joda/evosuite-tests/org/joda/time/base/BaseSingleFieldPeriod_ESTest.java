/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Wed Mar 20 06:13:06 GMT 2024
 */

package org.joda.time.base;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.Minutes;
import org.joda.time.MonthDay;
import org.joda.time.Months;
import org.joda.time.MutableDateTime;
import org.joda.time.Partial;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Weeks;
import org.joda.time.YearMonth;
import org.joda.time.Years;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class BaseSingleFieldPeriod_ESTest extends BaseSingleFieldPeriod_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testStandardPeriodInReturningPositive() throws Throwable  {
      // rollbacked to evosuite
      Minutes arg0 = Minutes.THREE;
      int standardPeriodIn = BaseSingleFieldPeriod.standardPeriodIn(arg0, 3537L);
      assertEquals(50, standardPeriodIn);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetValueReturningPositive() throws Throwable  {
      // Given a Minutes object with the maximum possible value
      Minutes minutes = Minutes.MAX_VALUE;
      
      // When we get the value for 0 seconds
      int value = minutes.getValue(0);
      
      // Then the result should be the maximum integer value
      assertEquals(Integer.MAX_VALUE, value);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetValueReturningNegative() throws Throwable  {
      // Given a Minutes object with MIN_VALUE
      Minutes minutes = Minutes.MIN_VALUE;
      
      // When getting the value at index 0
      int value = minutes.getValue(0);
      
      // Then the value should be Integer.MIN_VALUE
      assertEquals(Integer.MIN_VALUE, value);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetPeriodType() throws Throwable  {
      // Given: A variable "months" of type Months, initialized with the value 10.
      Months months = Months.TEN;
      
      // When: The PeriodType of "months" is retrieved using the getPeriodType() method.
      PeriodType periodType = months.getPeriodType();
      
      // Then: The name of the PeriodType should be "Months".
      assertEquals("Months", periodType.getName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetReturningNegative() throws Throwable  {
      // Test that the minimum value for a Weeks object can be obtained correctly
      Weeks weeks = Weeks.MIN_VALUE;
      DurationFieldType arg0 = DurationFieldType.weeks();
      int get = weeks.get(arg0); // Get the value of the weeks field using the DurationFieldType.weeks() method
      assertEquals(Integer.MIN_VALUE, get); // Assert that the returned value is equal to Integer.MIN_VALUE
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testBetweenTaking2ReadablePartialsAnd1ReturningZero() throws Throwable  {
      // Test that the "between" method returns 0 for two years that are equal
      Years arg2 = Years.TWO;
      DateTimeFieldType arg0 = DateTimeFieldType.era();
      Partial arg1 = new Partial(arg0, 1);
      int between = BaseSingleFieldPeriod.between(arg1, arg1, arg2);
      assertEquals(0, between);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testBetweenTaking2ReadablePartialsAnd1ReturningPositive() throws Throwable  {
      // Test that the correct number of hours are calculated for a LocalDate range with negative years
      Hours arg2 = Hours.TWO;
      LocalDate arg1 = new LocalDate((-1000L));
      LocalDate arg0 = arg1.plusYears((-3011));
      int between = BaseSingleFieldPeriod.between(arg0, arg1, arg2);
      assertEquals(26393880, between);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testBetweenTaking2ReadableInstantsAnd1() throws Throwable  {
      // Given
      Minutes minutes = Minutes.ZERO;
      DateTime arg0 = new DateTime();
      DateTime arg1 = arg0.minusDays(742);
      DurationFieldType arg2 = minutes.getFieldType();
      
      // When
      int between = BaseSingleFieldPeriod.between(arg0, arg1, arg2);
      
      // Then
      assertEquals((-1068480), between);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetValueReturningZero() throws Throwable  {
      // Given: A Hours object with a value of 0
      Hours hours = Hours.hours(0);
      
      // When: We call the getValue method on the Hours object with an argument of 0
      int value = hours.getValue(0);
      
      // Then: The method returns 0 as expected
      assertEquals(0, value);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetFieldTypeTakingInt() throws Throwable  {
      // Given the fact that we are dealing with a Months object, which represents a period of time in months
      Months months = Months.TWO;
      
      // When we retrieve the field type at index 0 (which corresponds to the "months" field)
      DurationFieldType fieldType = months.getFieldType(0);
      
      // Then we expect the field type to be named "months"
      assertEquals("months", fieldType.getName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSize() throws Throwable  {
      // Given a YearMonth object with null DateTimeZone
      YearMonth yearMonth = new YearMonth((DateTimeZone) null);
      
      // When Years.yearsBetween is called with the same YearMonth object as arguments
      Years yearsBetween = Years.yearsBetween((ReadablePartial) yearMonth, (ReadablePartial) yearMonth);
      
      // Then the result should be 1, since we are comparing the same object to itself.
      int size = yearsBetween.size();
      assertEquals(1, size);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCompareToReturningNegative() throws Throwable  {
      // Setup
      Minutes minutes = Minutes.MIN_VALUE;
      Minutes arg0 = Minutes.ONE;
      
      // Action
      int compareTo = minutes.compareTo((BaseSingleFieldPeriod) arg0);
      
      // Assertion
      assertEquals(-1, compareTo);
      assertEquals(1, arg0.getMinutes());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCompareToReturningPositive() throws Throwable  {
      // Given
      Minutes minutes = Minutes.TWO;
      Minutes arg0 = Minutes.MIN_VALUE;
      
      // When
      int compareTo = minutes.compareTo((BaseSingleFieldPeriod) arg0);
      
      // Then
      assertEquals(1, compareTo);
      assertEquals(2, minutes.getMinutes());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCompareToThrowsClassCastException() throws Throwable  {
      // Given a Hours object representing 3 hours
      Hours hours = Hours.THREE;
      
      // When converted to a Days object
      Days days = hours.toStandardDays();
      
      // Then an exception is thrown because Hours and Days are incompatible
      try {
      hours.compareTo((BaseSingleFieldPeriod) days);
      fail("Expecting exception: ClassCastException");
      } catch(ClassCastException e) {
      // Verify that the expected exception was thrown
      verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCompareToReturningZero() throws Throwable  {
      // Given
      Minutes minutes = Minutes.TWO;
      
      // When
      int compareTo = minutes.compareTo((BaseSingleFieldPeriod) minutes);
      
      // Then
      assertEquals(2, minutes.getMinutes());
      assertEquals(0, compareTo);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsReturningTrue() throws Throwable  {
      // Given a negative value for the number of years
      Years arg0 = Years.years((-3157));
      
      // When we create a Years object with that negative value
      Years years = Years.years((-3157));
      
      // Then the equals method should return true for the same negative value
      assertTrue(years.equals(arg0));
      
      // And the getYears method should return the same negative value
      assertEquals((-3157), years.getYears());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEquals0() throws Throwable  {
      // Test that the YearsBetween object is not equal to a Months object with value of ELEVEN
      YearMonth arg1 = new YearMonth((DateTimeZone) null);
      Years yearsBetween = Years.yearsBetween((ReadablePartial) arg1, (ReadablePartial) arg1);
      Months arg0 = Months.ELEVEN;
      boolean equals = yearsBetween.equals(arg0);
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsWithNonNull() throws Throwable  {
      // rollbacked to evosuite
      YearMonth arg1 = new YearMonth((DateTimeZone) null);
      Years yearsBetween = Years.yearsBetween((ReadablePartial) arg1, (ReadablePartial) arg1);
      Object arg0 = new Object();
      boolean equals = yearsBetween.equals(arg0);
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEquals1() throws Throwable  {
      // Arrange
      Years arg0 = Years.THREE;
      Years years = Years.ZERO;
      
      // Act
      boolean equals = years.equals(arg0);
      
      // Assert
      assertEquals(3, arg0.getYears());
      assertFalse(equals);
      assertFalse(arg0.equals((Object)years));
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsSupportedReturningTrue() throws Throwable  {
      // Given
      Minutes minutes = Minutes.MIN_VALUE;
      DurationFieldType arg0 = minutes.getFieldType();
      
      // When
      boolean supported = minutes.isSupported(arg0);
      
      // Then
      assertTrue(supported);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsSupportedReturningFalse() throws Throwable  {
      // Given
      Minutes minutes = Minutes.MIN_VALUE;
      DurationFieldType arg0 = DurationFieldType.millis();
      
      // When
      boolean supported = minutes.isSupported(arg0);
      
      // Then
      assertFalse(supported);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetReturningPositive() throws Throwable  {
      // Given: A Hours object representing 1 hour
      Hours hours = Hours.ONE;
      
      // When: The get method is called with a DurationFieldType argument
      DurationFieldType arg0 = hours.getFieldType();
      
      // Then: The correct number of hours should be returned
      int expected = 1;
      int actual = hours.get(arg0);
      assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetReturningZero() throws Throwable  {
      // Given the hours object with a value of 1
      Hours hours = Hours.ONE;
      
      // When the method get is called on the hours object with no duration field type parameter
      int get = hours.get((DurationFieldType) null);
      
      // Then the method should return 0
      assertEquals(0, get);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetValueThrowsIndexOutOfBoundsException() throws Throwable  {
      // Given: A Minutes object with the value of MAX_VALUE
      Minutes minutes = Minutes.MAX_VALUE;
      
      // When: Calling the getValue method with an argument of 59
      try {
      minutes.getValue(59);
      
      // Then: An IndexOutOfBoundsException should be thrown
      fail("Expecting exception: IndexOutOfBoundsException");
      } catch (IndexOutOfBoundsException e) {
      // Verify that the correct exception is thrown
      verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetFieldTypeTakingIntThrowsIndexOutOfBoundsException() throws Throwable  {
      // Test that a negative index throws an IndexOutOfBoundsException
      Months months = Months.SEVEN;
      try {
      // Try to access the field type at a negative index
      months.getFieldType((-1));
      // Fail if no exception was thrown
      fail("Expecting exception: IndexOutOfBoundsException");
      } catch(IndexOutOfBoundsException e) {
      // Verify that the correct exception was thrown and that it is an IndexOutOfBoundsException
      verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testStandardPeriodInReturningNegative() throws Throwable  {
      // Given: A Days enum with FOUR as the value
      Days arg0 = Days.FOUR;
      
      // When: Calling the standardPeriodIn method with a negative number as an argument
      int standardPeriodIn = BaseSingleFieldPeriod.standardPeriodIn(arg0, (-1989L));
      
      // Then: The method should return a negative value that is equivalent to the difference between the start and end dates
      assertEquals((-173755), standardPeriodIn);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test0() throws Throwable  {
      // Arrange
      Minutes standardMinutesIn = Minutes.standardMinutesIn((ReadablePeriod) null);
      
      // Act
      int actualMinutes = standardMinutesIn.getMinutes();
      
      // Assert
      assertEquals(0, actualMinutes);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test1() throws Throwable  {
      // Given: Two objects that have different fields
      YearMonth yearMonth = new YearMonth();
      MonthDay monthDay = new MonthDay(0L);
      
      // When: The method is called with the invalid arguments
      try {
      Minutes.minutesBetween((ReadablePartial) yearMonth, (ReadablePartial) monthDay);
      
      // Then: An IllegalArgumentException should be thrown
      fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      // Verify that the exception is what we expected
      verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test2() throws Throwable  {
      // Given
      YearMonth yearMonth = new YearMonth();
      LocalDateTime localDateTime = new LocalDateTime(375L);
      
      // When
      try {
      Minutes.minutesBetween((ReadablePartial) yearMonth, (ReadablePartial) localDateTime);
      
      // Then
      fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
      // ReadablePartial objects must have the same set of fields
      verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test3() throws Throwable  {
      YearMonth arg0 = new YearMonth();
      
      // Given a null ReadablePartial object as an argument
      try {
      Minutes.minutesBetween((ReadablePartial) arg0, (ReadablePartial) null);
      
      // When the method is called with a null argument
      fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      
      // Then an IllegalArgumentException is thrown
      verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testStandardPeriodInReturningZero() throws Throwable  {
      // Create two YearMonth objects representing the same date (null time zone)
      YearMonth arg1 = new YearMonth((DateTimeZone) null);
      
      // Calculate the number of years between the two YearMonth objects
      Years arg0 = Years.yearsBetween((ReadablePartial) arg1, (ReadablePartial) arg1);
      
      // Assert that there are no years between the two dates
      assertEquals(0, arg0.getYears());
      
      // Calculate the number of milliseconds in a standard period of 2 years
      int standardPeriodIn = BaseSingleFieldPeriod.standardPeriodIn(arg0, 2);
      
      // Assert that there are no milliseconds in a standard period of 2 years
      assertEquals(0, standardPeriodIn);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test4() throws Throwable  {
      // No Comments were added
      // Undeclared exception!
      try { 
        Minutes.minutesBetween((ReadablePartial) null, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test5() throws Throwable  {
      // Given a date and a null ReadableInstant object
      MutableDateTime startDate = new MutableDateTime();
      
      // When we try to calculate the weeks between the two dates
      try {
      Weeks.weeksBetween(startDate, (ReadableInstant) null);
      fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
      // Then an IllegalArgumentException is thrown
      verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testBetweenTaking2ReadableInstantsAnd1ThrowsIllegalArgumentException() throws Throwable  {
      // Test that an exception is thrown when creating a BaseSingleFieldPeriod with null ReadableInstant objects
      try {
      // Try to create a new BaseSingleFieldPeriod with null ReadableInstant objects
      BaseSingleFieldPeriod.between((ReadableInstant) null, (ReadableInstant) null, (DurationFieldType) null);
      
      // Fail the test if no exception is thrown
      fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
      // Verify that the expected exception was thrown
      verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      
      // Assert that the ReadableInstant objects cannot be null
      assertTrue(e.getMessage().contains("ReadableInstant objects must not be null"));}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testToMutablePeriod() throws Throwable  {
      // rollbacked to evosuite
      Minutes minutes = Minutes.ZERO;
      minutes.toMutablePeriod();
      assertEquals(0, minutes.getMinutes());
      assertEquals(1, minutes.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testToPeriod() throws Throwable  {
      // rollbacked to evosuite
      Minutes minutes = Minutes.MIN_VALUE;
      minutes.toPeriod();
      assertEquals(Integer.MIN_VALUE, minutes.getMinutes());
      assertEquals(1, minutes.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test6() throws Throwable  {
      // No Comments were added
      Months arg0 = Months.ONE;
      // Undeclared exception!
      try { 
        Minutes.standardMinutesIn(arg0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Cannot convert period to duration as months is not precise in the period P1M
         //
         verifyException("org.joda.time.base.BaseSingleFieldPeriod", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHashCode() throws Throwable  {
      // This test is verifying that the hashCode() method returns the correct value for the THREE instance of the Minutes class.
      // It is using assertEquals to check that the returned value is equal to 3.
      Minutes minutes = Minutes.THREE;
      assertEquals(3, minutes.hashCode());
  }
}
