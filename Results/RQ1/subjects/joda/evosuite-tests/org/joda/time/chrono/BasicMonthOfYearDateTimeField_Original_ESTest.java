/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Wed Mar 20 09:49:29 GMT 2024
 */

package org.joda.time.chrono;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DurationField;
import org.joda.time.MonthDay;
import org.joda.time.Months;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.BasicMonthOfYearDateTimeField;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJMonthOfYearDateTimeField;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class BasicMonthOfYearDateTimeField_Original_ESTest extends BasicMonthOfYearDateTimeField_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetReturningNegative() throws Throwable  {
      EthiopicChronology arg0 = EthiopicChronology.getInstanceUTC();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField = new GJMonthOfYearDateTimeField(arg0);
      long set = gJMonthOfYearDateTimeField.set((-2190L), 1);
      assertEquals((-7776002190L), set);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRoundFloorReturningZero() throws Throwable  {
      GregorianChronology arg0 = GregorianChronology.getInstance();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField = new GJMonthOfYearDateTimeField(arg0);
      long roundFloor = gJMonthOfYearDateTimeField.roundFloor(604800004L);
      assertEquals(0L, roundFloor);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRoundFloorReturningPositive() throws Throwable  {
      IslamicChronology arg0 = IslamicChronology.getInstanceUTC();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField = new GJMonthOfYearDateTimeField(arg0);
      long roundFloor = gJMonthOfYearDateTimeField.roundFloor(1814400010L);
      assertEquals(691200000L, roundFloor);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRemainderReturningPositive() throws Throwable  {
      EthiopicChronology arg0 = EthiopicChronology.getInstance();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = new BasicMonthOfYearDateTimeField(arg0, 1);
      long remainder = basicMonthOfYearDateTimeField.remainder(1);
      assertEquals(1900800001L, remainder);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetReturningNegative() throws Throwable  {
      IslamicChronology arg0 = IslamicChronology.getInstanceUTC();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = new BasicMonthOfYearDateTimeField(arg0, 1);
      int get = basicMonthOfYearDateTimeField.get((-166765824000000L));
      assertEquals((-94), get);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAddWrapFieldReturningZero() throws Throwable  {
      IslamicChronology arg0 = IslamicChronology.getInstanceUTC();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField = new GJMonthOfYearDateTimeField(arg0);
      long addWrapField = gJMonthOfYearDateTimeField.addWrapField(0L, 0);
      assertEquals(0L, addWrapField);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAddWrapFieldReturningPositive() throws Throwable  {
      EthiopicChronology arg0 = EthiopicChronology.getInstance();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField = new GJMonthOfYearDateTimeField(arg0);
      long addWrapField = gJMonthOfYearDateTimeField.addWrapField((long) 1, 48);
      assertEquals(21772800001L, addWrapField);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsLeap() throws Throwable  {
      IslamicChronology arg0 = IslamicChronology.getInstanceUTC();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField = new GJMonthOfYearDateTimeField(arg0);
      boolean leap = gJMonthOfYearDateTimeField.isLeap(15778476000L);
      assertFalse(leap);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsLeapReturningTrue() throws Throwable  {
      IslamicChronology arg0 = IslamicChronology.getInstanceUTC();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = new BasicMonthOfYearDateTimeField(arg0, 7);
      boolean leap = basicMonthOfYearDateTimeField.isLeap(21859200000L);
      assertTrue(leap);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetReturningZero() throws Throwable  {
      CopticChronology arg0 = CopticChronology.getInstance();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField = new GJMonthOfYearDateTimeField(arg0);
      long set = gJMonthOfYearDateTimeField.set(0L, 4);
      assertEquals(0L, set);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesBasicMonthOfYearDateTimeFieldAndCallsAddTaking1And1() throws Throwable  {
      IslamicChronology arg0 = IslamicChronology.getInstanceUTC();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = new BasicMonthOfYearDateTimeField(arg0, 7);
      long add = basicMonthOfYearDateTimeField.add((-1777L), (-2874));
      assertEquals((-7332854401777L), add);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAddTaking1And1ReturningZero() throws Throwable  {
      IslamicChronology arg0 = IslamicChronology.getInstanceUTC();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = new BasicMonthOfYearDateTimeField(arg0, 7);
      long add = basicMonthOfYearDateTimeField.add(0L, 0);
      assertEquals(0L, add);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRoundFloorReturningNegative() throws Throwable  {
      EthiopicChronology arg0 = EthiopicChronology.getInstance();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = new BasicMonthOfYearDateTimeField(arg0, 1);
      long roundFloor = basicMonthOfYearDateTimeField.roundFloor(1);
      assertEquals((-1900800000L), roundFloor);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetLeapAmountReturningPositive() throws Throwable  {
      EthiopicChronology arg0 = EthiopicChronology.getInstanceUTC();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField = new GJMonthOfYearDateTimeField(arg0);
      int leapAmount = gJMonthOfYearDateTimeField.getLeapAmount(100000000000000000L);
      assertEquals(1, leapAmount);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetLeapAmountReturningZero() throws Throwable  {
      EthiopicChronology arg0 = EthiopicChronology.getInstance();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = new BasicMonthOfYearDateTimeField(arg0, 1);
      int leapAmount = basicMonthOfYearDateTimeField.getLeapAmount(31536000000L);
      assertEquals(0, leapAmount);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesBasicMonthOfYearDateTimeFieldAndCallsIsLeap() throws Throwable  {
      IslamicChronology arg0 = IslamicChronology.getInstanceUTC();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = new BasicMonthOfYearDateTimeField(arg0, 7);
      boolean leap = basicMonthOfYearDateTimeField.isLeap(27L);
      assertFalse(leap);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetReturningPositive() throws Throwable  {
      EthiopicChronology arg0 = EthiopicChronology.getInstance();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = new BasicMonthOfYearDateTimeField(arg0, 1);
      long set = basicMonthOfYearDateTimeField.set((long) 1, 13);
      assertEquals(21772800001L, set);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetDifferenceAsLongReturningZero() throws Throwable  {
      EthiopicChronology arg0 = EthiopicChronology.getInstanceUTC();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = new BasicMonthOfYearDateTimeField(arg0, 1);
      long differenceAsLong = basicMonthOfYearDateTimeField.getDifferenceAsLong(604800149L, 604800149L);
      assertEquals(0L, differenceAsLong);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetDifferenceAsLongReturningNegative() throws Throwable  {
      EthiopicChronology arg0 = EthiopicChronology.getInstanceUTC();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = new BasicMonthOfYearDateTimeField(arg0, 1);
      long differenceAsLong = basicMonthOfYearDateTimeField.getDifferenceAsLong((-474L), 21786400000L);
      assertEquals((-8L), differenceAsLong);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetDifferenceAsLongReturningPositive() throws Throwable  {
      EthiopicChronology arg0 = EthiopicChronology.getInstance();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = new BasicMonthOfYearDateTimeField(arg0, 1);
      long differenceAsLong = basicMonthOfYearDateTimeField.getDifferenceAsLong(100000000000000000L, 1);
      assertEquals(41194514L, differenceAsLong);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAddTaking4Arguments() throws Throwable  {
      GregorianChronology arg1 = GregorianChronology.getInstance();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField = new GJMonthOfYearDateTimeField(arg1);
      MonthDay arg0 = new MonthDay((long) 6, (Chronology) arg1);
      int[] arg2 = new int[4];
      int[] add = gJMonthOfYearDateTimeField.add((ReadablePartial) arg0, 0, arg2, 717336);
      assertArrayEquals(new int[] {1, 1, 0, 0}, add);
      assertEquals(12, gJMonthOfYearDateTimeField.getMaximumValue());
      assertEquals(1, gJMonthOfYearDateTimeField.getMinimumValue());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAddTaking2Longs() throws Throwable  {
      EthiopicChronology arg0 = EthiopicChronology.getInstance();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField = new GJMonthOfYearDateTimeField(arg0);
      long add = gJMonthOfYearDateTimeField.add(1000000L, 2629800000L);
      assertEquals(6383859729178600000L, add);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesBasicMonthOfYearDateTimeFieldAndCallsAddTaking2Longs() throws Throwable  {
      EthiopicChronology arg0 = EthiopicChronology.getInstance();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = new BasicMonthOfYearDateTimeField(arg0, 1);
      long add = basicMonthOfYearDateTimeField.add(2592000001L, 2592000001L);
      assertEquals(6292099944489600001L, add);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test() throws Throwable  {
      EthiopicChronology instanceUTC = EthiopicChronology.getInstanceUTC();
      Months arg0 = Months.THREE;
      // Undeclared exception!
      try { 
        instanceUTC.add((ReadablePeriod) arg0, 1900798196L, (-2146319068));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Magnitude of add amount is too large: -6438957204
         //
         verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAddTaking2LongsThrowsIllegalArgumentException() throws Throwable  {
      EthiopicChronology arg0 = EthiopicChronology.getInstance();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = new BasicMonthOfYearDateTimeField(arg0, 1);
      // Undeclared exception!
      try { 
        basicMonthOfYearDateTimeField.add((long) 1, (-9223372036854775808L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Magnitude of add amount is too large: -9223372036854775808
         //
         verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAddTaking2LongsWithNegative() throws Throwable  {
      EthiopicChronology arg0 = EthiopicChronology.getInstance();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = new BasicMonthOfYearDateTimeField(arg0, 1);
      // Undeclared exception!
      try { 
        basicMonthOfYearDateTimeField.add((-1827L), 10367997671L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Magnitude of add amount is too large: 10367997671
         //
         verifyException("org.joda.time.chrono.BasicMonthOfYearDateTimeField", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAddTaking1And1() throws Throwable  {
      JulianChronology arg0 = JulianChronology.getInstanceUTC();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField = new GJMonthOfYearDateTimeField(arg0);
      long add = gJMonthOfYearDateTimeField.add((-1625L), (-1439));
      assertEquals((-3784233601625L), add);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAddTaking1And1ReturningPositive() throws Throwable  {
      EthiopicChronology arg0 = EthiopicChronology.getInstanceUTC();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField = new GJMonthOfYearDateTimeField(arg0);
      long add = gJMonthOfYearDateTimeField.add(498L, 2146135572);
      assertEquals(5209760609712000498L, add);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAddTaking2LongsReturningZero() throws Throwable  {
      EthiopicChronology arg0 = EthiopicChronology.getInstance();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField = new GJMonthOfYearDateTimeField(arg0);
      long add = gJMonthOfYearDateTimeField.add((long) 0, (long) 0);
      assertEquals(0L, add);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAddTaking2LongsReturningNegative() throws Throwable  {
      EthiopicChronology arg0 = EthiopicChronology.getInstance();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField = new GJMonthOfYearDateTimeField(arg0);
      long add = gJMonthOfYearDateTimeField.add((long) 1, (-2988L));
      assertEquals((-7253020799999L), add);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetRangeDurationField() throws Throwable  {
      EthiopicChronology arg0 = EthiopicChronology.getInstance();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField = new GJMonthOfYearDateTimeField(arg0);
      DurationField rangeDurationField = gJMonthOfYearDateTimeField.getRangeDurationField();
      assertEquals("years", rangeDurationField.getName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAddWrapFieldReturningNegative() throws Throwable  {
      EthiopicChronology arg0 = EthiopicChronology.getInstance();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = new BasicMonthOfYearDateTimeField(arg0, 1);
      long addWrapField = basicMonthOfYearDateTimeField.addWrapField((-9223372036854775808L), 1);
      assertEquals((-9223372034262775808L), addWrapField);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetMaximumValue() throws Throwable  {
      EthiopicChronology arg0 = EthiopicChronology.getInstanceUTC();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = new BasicMonthOfYearDateTimeField(arg0, 1);
      int maximumValue = basicMonthOfYearDateTimeField.getMaximumValue();
      assertEquals(13, maximumValue);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsLenient() throws Throwable  {
      EthiopicChronology arg0 = EthiopicChronology.getInstance();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = new BasicMonthOfYearDateTimeField(arg0, 1);
      boolean lenient = basicMonthOfYearDateTimeField.isLenient();
      assertFalse(lenient);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetMinimumValue() throws Throwable  {
      IslamicChronology arg0 = IslamicChronology.getInstance();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = new BasicMonthOfYearDateTimeField(arg0, 1);
      int minimumValue = basicMonthOfYearDateTimeField.getMinimumValue();
      assertEquals(1, minimumValue);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetReturningPositive() throws Throwable  {
      CopticChronology arg0 = CopticChronology.getInstance();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField = new GJMonthOfYearDateTimeField(arg0);
      int get = gJMonthOfYearDateTimeField.get(1);
      assertEquals(4, get);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetLeapDurationField() throws Throwable  {
      EthiopicChronology arg0 = EthiopicChronology.getInstance();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField = new GJMonthOfYearDateTimeField(arg0);
      DurationField leapDurationField = gJMonthOfYearDateTimeField.getLeapDurationField();
      assertTrue(leapDurationField.isSupported());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRemainderReturningZero() throws Throwable  {
      EthiopicChronology arg0 = EthiopicChronology.getInstance();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField = new BasicMonthOfYearDateTimeField(arg0, 1);
      long remainder = basicMonthOfYearDateTimeField.remainder((-1900800000L));
      assertEquals(0L, remainder);
  }
}
