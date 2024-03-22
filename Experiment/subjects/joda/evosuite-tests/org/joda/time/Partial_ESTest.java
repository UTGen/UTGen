/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Wed Mar 20 08:40:46 GMT 2024
 */

package org.joda.time;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.LocalDate;
import org.joda.time.MonthDay;
import org.joda.time.Partial;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Weeks;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.format.DateTimeFormatter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Partial_ESTest extends Partial_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetCopyTaking2Arguments() throws Throwable  {
      // Test that setting a year on a Partial using the simplified Chinese locale works correctly
      DateTimeFieldType yearField = DateTimeFieldType.year();
      GJChronology chrono = GJChronology.getInstanceUTC();
      Partial partial = new Partial(yearField, 1631, chrono);
      
      // Set the year on the partial using the simplified Chinese locale
      Locale locale = Locale.SIMPLIFIED_CHINESE;
      Partial setCopy = partial.property(yearField).setCopy("1", locale);
      
      // Assert that the original and modified partials are not equal
      assertNotSame(partial, setCopy);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testToStringTaking2ArgumentsReturningEmptyString() throws Throwable  {
      // Arrange
      Partial partial = new Partial();
      Locale arg1 = Locale.ROOT;
      
      // Act
      String string = partial.toString("Z", arg1);
      
      // Assert
      assertEquals("", string);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSizeReturningPositive() throws Throwable  {
      // Set up the chronology to use for testing
      GJChronology utcChrono = GJChronology.getInstanceUTC();
      
      // Define the field type and value for the partial date
      DateTimeFieldType centuryOfEraField = DateTimeFieldType.centuryOfEra();
      int centuryValue = 50;
      
      // Create a partial date with the specified field type and value
      Partial partial = new Partial(centuryOfEraField, centuryValue, utcChrono);
      
      // Get the size of the partial date
      int size = partial.size();
      
      // Assert that the size is equal to 1
      assertEquals(1, size);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetValueReturningPositive() throws Throwable  {
      // No Comments were added
      DateTimeFieldType arg0 = DateTimeFieldType.year();
      GJChronology arg2 = GJChronology.getInstanceUTC();
      Partial partial = new Partial(arg0, 1631, arg2);
      int value = partial.getValue(0);
      assertEquals(1631, value);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetValueReturningNegative() throws Throwable  {
      // Arrange
      GregorianChronology chronology = GregorianChronology.getInstance();
      DateTimeFieldType[] fields = new DateTimeFieldType[4];
      int[] values = new int[7];
      values[1] = -595;
      Partial partial = new Partial(chronology, fields, values);
      
      // Act
      int value = partial.getValue(DateTimeFieldType.YEAR);
      
      // Assert
      assertEquals(-595, value);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetChronologyReturningNull() throws Throwable  {
      // Create a new Partial instance with null Chronology and empty DateTimeFieldType array.
      DateTimeFieldType[] fieldTypes = new DateTimeFieldType[7];
      int[] values = new int[6];
      Partial partial = new Partial((Chronology) null, fieldTypes, values);
      
      // Call the getChronology() method on the Partial instance.
      Chronology chronology = partial.getChronology();
      
      // Assert that the returned chronology is null.
      assertNull(chronology);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testToStringList() throws Throwable  {
      // Create a new LocalDate object with the current date and time
      LocalDate arg0 = new LocalDate();
      
      // Create a new Partial object from the LocalDate object
      Partial partial = new Partial(arg0);
      
      // Get the string representation of the Partial object
      String stringList = partial.toStringList();
      
      // Assert that the string representation is equal to the expected value
      assertEquals("[year=2014, monthOfYear=2, dayOfMonth=14]", stringList);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testWithPeriodAddedReturningPartialWhereSizeIsPositive() throws Throwable  {
      // rollbacked to evosuite
      DateTimeFieldType[] arg1 = new DateTimeFieldType[6];
      int[] arg2 = new int[7];
      Partial partial = new Partial((Chronology) null, arg1, arg2);
      Partial withPeriodAdded = partial.withPeriodAdded((ReadablePeriod) null, 1969);
      assertSame(withPeriodAdded, partial);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSizeReturningZero() throws Throwable  {
      // Given: The user has a Partial object
      // When: The user calls the size() method on the Partial object
      // Then: The size of the Partial object should be 0
      Partial partial = new Partial();
      int expectedSize = 0;
      assertEquals(expectedSize, partial.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetValues() throws Throwable  {
      // Given: a partially filled array with no values
      Partial partial = new Partial();
      
      // When: the getValues method is called on the partially filled array
      int[] values = partial.getValues();
      
      // Then: the resulting array should be empty
      assertEquals(0, values.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testToStringTaking2ArgumentsReturningNonEmptyString() throws Throwable  {
      // Given: a partially initialized object of type Partial
      Partial partial = new Partial();
      
      // When: calling the toString() method with the given arguments
      Locale arg1 = Locale.CANADA;
      String string = partial.toString(null, arg1);
      
      // Then: assert that the returned string is "[]"
      assertEquals("[]", string);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testToStringTakingStringReturningEmptyString() throws Throwable  {
      // Given a Partial object with a format of "Z"
      Partial partial = new Partial();
      
      // When the toString method is called with the format "Z"
      String string = partial.toString("Z");
      
      // Then the resulting string should be empty
      assertEquals("", string);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesPartialTaking3Arguments() throws Throwable  {
      // Given a Partial object with year field set to 1631
      DateTimeFieldType year = DateTimeFieldType.year();
      GJChronology chronology = GJChronology.getInstanceUTC();
      Partial partial = new Partial(year, 1631, chronology);
      
      // When the toString() method is called on the Partial object
      String string = partial.toString();
      
      // Then the resulting string should be "1631"
      assertEquals("1631", string);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testToStringTakingNoArguments() throws Throwable  {
      // Given: an empty list of items
      Partial partial = new Partial();
      
      // When: the list is converted to a string
      String string = partial.toString();
      
      // Then: the resulting string should be "[]"
      assertEquals("[]", string);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testToStringTakingStringReturningNonEmptyString() throws Throwable  {
      // rollbacked to evosuite
      DateTimeFieldType arg0 = DateTimeFieldType.yearOfCentury();
      Partial partial = new Partial(arg0, 11);
      partial.getFormatter();
      String string = partial.toString((String) null);
      assertEquals("[yearOfCentury=11]", string);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetFormatterReturningDateTimeFormatterWhereIsPrinterIsTrue() throws Throwable  {
      // Given a Partial with Ethiopic Chronology
      DateTimeFieldType year = DateTimeFieldType.year();
      EthiopicChronology chrono = EthiopicChronology.getInstanceUTC();
      DateTimeFieldType[] fields = new DateTimeFieldType[4];
      fields[0] = year;
      fields[1] = year;
      fields[2] = year;
      fields[3] = year;
      int[] values = new int[1];
      Partial partial = new Partial(chrono, fields, values);
      
      // When I get the formatter for the Partial
      DateTimeFormatter formatter = partial.getFormatter();
      
      // Then I expect the default year to be 2000
      assertEquals(2000, formatter.getDefaultYear());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesPartialTakingChronology() throws Throwable  {
      // Given a Partial object with a null Chronology
      Partial partial = new Partial((Chronology) null);
      
      // When the getFormatter method is called
      DateTimeFormatter formatter = partial.getFormatter();
      
      // Then the result should be null
      assertNull(formatter);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetFormatter() throws Throwable  {
      // rollbacked to evosuite
      DateTimeFieldType arg0 = DateTimeFieldType.yearOfEra();
      Partial partial = new Partial(arg0, 1321);
      partial.getFormatter();
      DateTimeFormatter formatter = partial.getFormatter();
      assertNull(formatter);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsMatch() throws Throwable  {
      // GIVEN a MonthDay object representing the current date
      MonthDay arg0 = MonthDay.now();
      
      // AND a Partial instance initialized with the same month and day as the current date
      Partial partial = new Partial(arg0);
      
      // WHEN isMatch() method is called with the ReadablePartial object representing the current date
      boolean match = partial.isMatch((ReadablePartial) arg0);
      
      // THEN the method should return true, as the partial instance is a match for the current date
      assertTrue(match);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testWithPeriodAddedWithZero() throws Throwable  {
      // Given a partial date with period added
      Partial partial = new Partial();
      
      // When the period is added with the same values
      Weeks arg0 = Weeks.ONE;
      Partial withPeriodAdded = partial.withPeriodAdded(arg0, 0);
      
      // Then the returned partial should be the same as the original one
      assertSame(withPeriodAdded, partial);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesPartialTaking2ArgumentsAndCallsWithField0() throws Throwable  {
      // Given
      DateTimeFieldType field = DateTimeFieldType.year();
      Partial partial = new Partial(field, 61);
      
      // When
      Partial withField = partial.withField(field, 61);
      
      // Then
      assertSame(withField, partial);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesPartialTaking2ArgumentsAndCallsWithField1() throws Throwable  {
      // Test that calling "withField" on a Partial object returns a new instance
      // of the Partial object with the specified field set to the provided value.
      DateTimeFieldType yearField = DateTimeFieldType.year();
      Partial partial = new Partial(yearField, 1724);
      Partial withYearSetTo1926 = partial.withField(yearField, 1926);
      assertNotSame(withYearSetTo1926, partial);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testWithout() throws Throwable  {
      // Given
      DateTimeFieldType millisOfDay = DateTimeFieldType.millisOfDay();
      Partial partial = new Partial(millisOfDay, 11);
      
      // When
      Partial without = partial.without(millisOfDay);
      
      // Then
      assertEquals(0, without.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesPartialTakingNoArguments() throws Throwable  {
      // Given a partially initialized Partial object and a DateTimeFieldType argument,
      // when the without() method is called on the partially initialized Partial object,
      // then the size of the resulting Partial object should be 0.
      
      Partial partial = new Partial();
      DateTimeFieldType arg0 = DateTimeFieldType.dayOfYear();
      Partial without = partial.without(arg0);
      assertEquals(0, without.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testWithThrowsIllegalArgumentExceptionAndWithWithNonNullAndWithWithNegative() throws Throwable  {
      // No Comments were added
      Partial partial = new Partial();
      DateTimeFieldType arg0 = DateTimeFieldType.era();
      // Undeclared exception!
      try { 
        partial.with(arg0, (-1139));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1139 for era must not be smaller than 0
         //
         verifyException("org.joda.time.chrono.BaseChronology", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testWithThrowsIllegalArgumentExceptionAndWithWithNullAndWithWithPositive() throws Throwable  {
      // No Comments were added
      Partial partial = new Partial();
      // Undeclared exception!
      try { 
        partial.with((DateTimeFieldType) null, 26);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field type must not be null
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testWith() throws Throwable  {
      // No Comments were added
      DateTimeFieldType arg0 = DateTimeFieldType.secondOfMinute();
      Partial partial = new Partial(arg0, 44);
      Partial with = partial.with(arg0, 44);
      assertEquals(1, with.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetChronologyReturningNonNull() throws Throwable  {
      // Given a partially initialized Partial object
      Partial partial = new Partial();
      
      // When the withChronologyRetainFields method is called with an argument of type Chronology
      Chronology arg0 = partial.getChronology();
      Partial withChronologyRetainFields = partial.withChronologyRetainFields(arg0);
      
      // Then the method should return a new instance of Partial that has the same fields as the original object, but with the chronology set to the argument value
      assertSame(withChronologyRetainFields, partial);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFailsToCreatePartialTakingReadablePartialThrowsIllegalArgumentException() throws Throwable  {
      // This test ensures that the Partial constructor throws an IllegalArgumentException when
      // a null argument is passed to it.
      Partial partial = null;
      try {
      partial = new Partial((ReadablePartial) null);
      fail("Expecting exception: IllegalArgumentException");
      } catch (IllegalArgumentException e) {
      verifyException("org.joda.time.Partial", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetField() throws Throwable  {
      // Arrange
      CopticChronology arg1 = CopticChronology.getInstanceUTC();
      LocalDate now = LocalDate.now((Chronology) arg1);
      Partial partial = new Partial(now);
      
      // Act
      DateTimeField field = partial.getField(1, (Chronology) arg1);
      
      // Assert
      assertNotNull(field);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFailsToCreatePartialTaking2ArgumentsThrowsIllegalArgumentException0() throws Throwable  {
      // Arrange
      DateTimeFieldType secondOfMinute = DateTimeFieldType.secondOfMinute();
      DateTimeFieldType secondOfDay = DateTimeFieldType.secondOfDay();
      DateTimeFieldType[] arg0 = new DateTimeFieldType[3];
      arg0[0] = secondOfDay;
      arg0[1] = secondOfMinute;
      arg0[2] = secondOfDay;
      int[] arg1 = new int[3];
      
      // Act
      Partial partial = new Partial(arg0, arg1);
      
      // Assert (should fail with IllegalArgumentException)
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFailsToCreatePartialTaking2ArgumentsThrowsIllegalArgumentException1() throws Throwable  {
      // Define the types of fields that will be used in the Partial constructor
      DateTimeFieldType weekyear = DateTimeFieldType.weekyear();
      DateTimeFieldType weekyearOfCentury = DateTimeFieldType.weekyearOfCentury();
      DateTimeFieldType year = DateTimeFieldType.year();
      
      // Define an array of field types that will be used in the Partial constructor
      DateTimeFieldType[] arg0 = new DateTimeFieldType[3];
      arg0[0] = weekyearOfCentury;
      arg0[1] = year;
      arg0[2] = weekyear;
      
      // Define an array of field values that will be used in the Partial constructor
      int[] arg1 = new int[3];
      
      // Create a new Partial object with the specified types and values, expecting an exception to be thrown
      Partial partial = null;
      try {
      partial = new Partial(arg0, arg1);
      fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      // Verify that the expected exception was thrown
      verifyException("org.joda.time.Partial", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFailsToCreatePartialTaking2ArgumentsThrowsIllegalArgumentException2() throws Throwable  {
      // Test that a Partial object cannot be created with duplicate DateTimeFieldType objects in its types array
      DateTimeFieldType secondOfMinute = DateTimeFieldType.secondOfMinute();
      DateTimeFieldType[] types = new DateTimeFieldType[3];
      types[0] = secondOfMinute;
      types[1] = secondOfMinute;
      types[2] = secondOfMinute;
      int[] values = new int[3];
      Partial partial = null;
      try {
      // Creating a Partial object with duplicate DateTimeFieldType objects in its types array should throw an IllegalArgumentException
      partial = new Partial(types, values);
      fail("Expecting exception: IllegalArgumentException");
      } catch (IllegalArgumentException e) {
      // The exception is thrown because the types array contains duplicate DateTimeFieldType objects
      verifyException("org.joda.time.Partial", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFailsToCreatePartialTaking2ArgumentsThrowsIllegalArgumentException3() throws Throwable  {
      // Arrange
      DateTimeFieldType[] arg0 = new DateTimeFieldType[3];
      DateTimeFieldType dayOfMonth = DateTimeFieldType.dayOfMonth();
      arg0[0] = dayOfMonth;
      DateTimeFieldType hourOfHalfday = DateTimeFieldType.hourOfHalfday();
      arg0[1] = hourOfHalfday;
      DateTimeFieldType era = DateTimeFieldType.era();
      arg0[2] = era;
      int[] arg1 = new int[3];
      
      // Act & Assert
      try {
      Partial partial = new Partial(arg0, arg1);
      fail("Expecting exception: IllegalArgumentException");
      } catch (IllegalArgumentException e) {
      // Types array must be in order largest-smallest: hourOfHalfday < era
      verifyException("org.joda.time.Partial", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFailsToCreatePartialTaking2ArgumentsThrowsIllegalArgumentException4() throws Throwable  {
      // Given the need to construct a Partial object with invalid arguments
      DateTimeFieldType[] arg0 = new DateTimeFieldType[3];
      DateTimeFieldType dayOfMonth = DateTimeFieldType.dayOfMonth();
      arg0[0] = dayOfMonth;
      DateTimeFieldType hourOfHalfday = DateTimeFieldType.hourOfHalfday();
      arg0[1] = hourOfHalfday;
      arg0[2] = dayOfMonth;
      int[] arg1 = new int[3];
      
      // When we try to construct the Partial object with invalid arguments
      Partial partial = null;
      try {
      partial = new Partial(arg0, arg1);
      fail("Expecting exception: IllegalArgumentException");
      } catch (IllegalArgumentException e) {
      // Then we expect an IllegalArgumentException to be thrown, because the types array must be in order largest-smallest
      verifyException("org.joda.time.Partial", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesPartialTaking2Arguments0() throws Throwable  {
      // No Comments were added
      DateTimeFieldType era = DateTimeFieldType.era();
      DateTimeFieldType[] arg0 = new DateTimeFieldType[2];
      arg0[0] = era;
      DateTimeFieldType minuteOfHour = DateTimeFieldType.minuteOfHour();
      arg0[1] = minuteOfHour;
      int[] arg1 = new int[2];
      Partial partial = new Partial(arg0, arg1);
      assertEquals(2, partial.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFailsToCreatePartialTaking2ArgumentsThrowsIllegalArgumentException5() throws Throwable  {
      // Given
      DateTimeFieldType era = DateTimeFieldType.era();
      DateTimeFieldType[] types = new DateTimeFieldType[2];
      types[0] = era;
      types[1] = era;
      int[] values = new int[2];
      
      // When
      Partial partial = null;
      try {
      partial = new Partial(types, values);
      fail("Expecting exception: IllegalArgumentException");
      } catch (IllegalArgumentException e) {
      // Then
      verifyException("org.joda.time.Partial", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesPartialTaking2Arguments1() throws Throwable  {
      // Given: A list of zero DateTimeFieldTypes and a list of zero integers
      DateTimeFieldType[] fields = new DateTimeFieldType[0];
      int[] indices = new int[0];
      
      // When: Creating a new Partial with these parameters
      Partial partial = new Partial(fields, indices);
      
      // Then: The size of the partial should be zero
      assertEquals(0, partial.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFailsToCreatePartialTaking3ArgumentsThrowsIllegalArgumentException() throws Throwable  {
      // No Comments were added
      DateTimeFieldType[] arg0 = new DateTimeFieldType[5];
      int[] arg1 = new int[3];
      Partial partial = null;
      try {
        partial = new Partial(arg0, arg1, (Chronology) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Values array must be the same length as the types array
         //
         verifyException("org.joda.time.Partial", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFailsToCreatePartialTaking2ArgumentsThrowsIllegalArgumentException6() throws Throwable  {
      // Given: the constructor is called with a null values array
      DateTimeFieldType[] fieldTypes = new DateTimeFieldType[6];
      Partial partial = null;
      
      try {
      // When: the constructor is called with the null values array
      partial = new Partial(fieldTypes, (int[]) null);
      } catch (IllegalArgumentException e) {
      // Then: an IllegalArgumentException is thrown
      throw e;}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFailsToCreatePartialTaking2ArgumentsThrowsIllegalArgumentException7() throws Throwable  {
      // Setup
      DateTimeFieldType[] fieldTypes = new DateTimeFieldType[2];
      int[] values = new int[2];
      
      // Expectation
      IllegalArgumentException exception = null;
      
      try {
      Partial partial = new Partial(fieldTypes, values);
      fail("Expecting exception: IllegalArgumentException");
      } catch (IllegalArgumentException e) {
      // Verify that the expected exception was thrown
      exception = e;
      }
      
      // Verify
      assertNotNull(exception);
      verifyException("org.joda.time.Partial", exception);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFailsToCreatePartialTaking2ArgumentsThrowsIllegalArgumentException8() throws Throwable  {
      // Given: A null field type
      DateTimeFieldType fieldType = null;
      
      // When: Creating a new partial with a null field type
      Partial partial = null;
      try {
      partial = new Partial(fieldType, 32);
      fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
      // Then: The field type must not be null
      verifyException("org.joda.time.Partial", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesPropertyTaking2ArgumentsAndCallsWithMinimumValue() throws Throwable  {
      // Given a Partial object with a negative value for a property
      Partial arg0 = new Partial();
      Partial.Property partial_Property = new Partial.Property(arg0, -106);
      
      // When the withMinimumValue method is called on the property
      try {
      partial_Property.withMinimumValue();
      
      // Then an ArrayIndexOutOfBoundsException should be thrown, since the value is negative and not valid for this property
      fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      // Verify that the correct exception was thrown
      verifyException("org.joda.time.Partial", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAddToCopy() throws Throwable  {
      // Create a new instance of Partial using the Year field type and the UTC chronology
      DateTimeFieldType arg0 = DateTimeFieldType.year();
      GJChronology arg2 = GJChronology.getInstanceUTC();
      Partial partial = new Partial(arg0, 1631, arg2);
      
      // Get the property object for the Year field on the Partial object
      Partial.Property property = partial.property(arg0);
      
      // Add 1 to the value of the Year field on the Partial object and create a new instance of Partial with the updated value
      Partial addToCopy = property.addToCopy(1631);
      
      // Verify that the size of the updated Partial object is equal to 1
      assertEquals(1, addToCopy.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAddWrapFieldToCopy() throws Throwable  {
      // Given a Partial object with a centuryOfEra field set to 50
      GJChronology chronology = GJChronology.getInstanceUTC();
      DateTimeFieldType field = DateTimeFieldType.centuryOfEra();
      Partial partial = new Partial(field, 50, chronology);
      
      // When the property of the centuryOfEra field is called and addWrapFieldToCopy is invoked with a negative value
      Partial.Property property = partial.property(field);
      Partial addedPartial = property.addWrapFieldToCopy(-822);
      
      // Then the resulting Partial object should be different from the original one, and its centuryOfEra field should be set to 49
      assertNotSame(partial, addedPartial);
      assertEquals(49, addedPartial.get(field));
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetCopyTakingString() throws Throwable  {
      DateTimeFieldType yearField = DateTimeFieldType.year();
      GJChronology utcChronology = GJChronology.getInstanceUTC();
      Partial partial = new Partial(yearField, 1631, utcChronology);
      Partial.Property property = partial.property(yearField);
      
      // Try to set a value that is not supported by the field
      try {
      property.setCopy("org.joda.time.Partial");
      fail("Expected exception: IllegalArgumentException");
      } catch (IllegalArgumentException e) {
      // Verify that the expected exception is thrown
      assertEquals("Value \"org.joda.time.Partial\" for year is not supported", e.getMessage());}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetFieldTypes() throws Throwable  {
      // Given: A new instance of the class "Partial" is created
      Partial partial = new Partial();
      
      // When: The method "getFieldTypes()" is called on the partial object
      DateTimeFieldType[] fieldTypes = partial.getFieldTypes();
      
      // Then: The length of the returned array should be 0, as there are no fields in the partial object
      assertEquals(0, fieldTypes.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testMinus() throws Throwable  {
      // Given a partial date object
      Partial partial = new Partial();
      
      // When the minus method is called with a null argument
      Partial minus = partial.minus((ReadablePeriod) null);
      
      // Then the original partial should be returned
      assertSame(partial, minus);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testPlus() throws Throwable  {
      // Given a partial date
      Partial partial = new Partial();
      
      // When the plus method is called with a null ReadablePeriod parameter
      Partial plus = partial.plus((ReadablePeriod) null);
      
      // Then the same instance should be returned
      assertSame(plus, partial);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testWithPeriodAdded() throws Throwable  {
      // Arrange
      Partial partial = new Partial();
      Weeks arg0 = Weeks.ONE;
      int additionalWeeks = 1;
      
      // Act
      Partial withPeriodAdded = partial.withPeriodAdded(arg0, additionalWeeks);
      
      // Assert
      assertNotSame(withPeriodAdded, partial);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetValueReturningZero() throws Throwable  {
      // Create a GregorianChronology instance
      GregorianChronology chronology = GregorianChronology.getInstance();
      
      // Define an array of DateTimeFieldType objects
      DateTimeFieldType[] fieldTypes = new DateTimeFieldType[4];
      
      // Define an array of integers for the partial values
      int[] values = new int[7];
      
      // Create a Partial object using the above defined arrays
      Partial partial = new Partial(chronology, fieldTypes, values);
      
      // Call the getValue method with argument 1 (month) and assert that it returns 0
      int monthValue = partial.getValue(1);
      assertEquals(0, monthValue);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testWithChronologyRetainFields() throws Throwable  {
      // Given a Partial object with an empty field list and a BuddhistChronology instance
      Partial partial = new Partial();
      BuddhistChronology arg0 = BuddhistChronology.getInstance();
      
      // When we call the method "withChronologyRetainFields" on the Partial object
      Partial withChronologyRetainFields = partial.withChronologyRetainFields(arg0);
      
      // Then the returned object should be a different instance from the original one
      assertNotSame(withChronologyRetainFields, partial);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsMatchThrowsIllegalArgumentException() throws Throwable  {
      // Given
      Partial partial = new Partial((Chronology) null);
      
      // When
      try {
      partial.isMatch((ReadablePartial) null);
      } catch(IllegalArgumentException e) {
      // Then
      verifyException("org.joda.time.Partial", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFailsToCreatePartialTaking2ArgumentsThrowsIllegalArgumentException9() throws Throwable  {
      Partial partial = null;
      try {
      partial = new Partial((DateTimeFieldType[]) null, (int[]) null);
      fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      //
      // Types array must not be null
      //
      verifyException("org.joda.time.Partial", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testPropertyReturningPartial$PropertyWhereGetIsNegative() throws Throwable  {
      // Arrange
      DateTimeFieldType yearField = DateTimeFieldType.year();
      Partial partial = new Partial(yearField, -2093);
      
      // Act
      Partial.Property property = partial.property(yearField);
      
      // Assert
      assertEquals(-2093, property.get());
  }
}
