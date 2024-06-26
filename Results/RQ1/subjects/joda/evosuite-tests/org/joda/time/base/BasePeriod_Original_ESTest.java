/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Wed Mar 20 09:37:38 GMT 2024
 */

package org.joda.time.base;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import org.joda.time.MonthDay;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class BasePeriod_Original_ESTest extends BasePeriod_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testToDurationFromReturningDurationWhereGetStandardSecondsIsZero() throws Throwable  {
      DateTime arg0 = new DateTime();
      MutablePeriod mutablePeriod = new MutablePeriod();
      Duration durationFrom = mutablePeriod.toDurationFrom(arg0);
      assertEquals(0L, durationFrom.getStandardMinutes());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetValueReturningZero() throws Throwable  {
      Period seconds = Period.seconds(4);
      int value = seconds.getValue(4);
      assertEquals(0, value);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test0() throws Throwable  {
      Period arg0 = Period.years(12);
      DateTime arg1 = new DateTime();
      PeriodType arg2 = PeriodType.seconds();
      MutablePeriod mutablePeriod = new MutablePeriod(arg1, arg1, arg2);
      // Undeclared exception!
      try { 
        mutablePeriod.add((ReadablePeriod) arg0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'years'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test1() throws Throwable  {
      MutablePeriod mutablePeriod = new MutablePeriod();
      mutablePeriod.add((ReadablePeriod) null);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test2() throws Throwable  {
      MutablePeriod mutablePeriod = new MutablePeriod();
      mutablePeriod.mergePeriod((ReadablePeriod) null);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test3() throws Throwable  {
      Hours hours = Hours.THREE;
      PeriodType arg0 = hours.getPeriodType();
      MutablePeriod mutablePeriod = new MutablePeriod(arg0);
      mutablePeriod.addYears(0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test4() throws Throwable  {
      Hours hours = Hours.THREE;
      PeriodType arg0 = hours.getPeriodType();
      MutablePeriod mutablePeriod = new MutablePeriod(arg0);
      // Undeclared exception!
      try { 
        mutablePeriod.add((DurationFieldType) null, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'null'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test5() throws Throwable  {
      Hours hours = Hours.THREE;
      PeriodType arg0 = hours.getPeriodType();
      MutablePeriod mutablePeriod = new MutablePeriod(arg0);
      mutablePeriod.setWeeks(0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test6() throws Throwable  {
      Period seconds = Period.seconds((-2863));
      DurationFieldType arg0 = DurationFieldType.centuries();
      // Undeclared exception!
      try { 
        seconds.withField(arg0, (-2863));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'centuries'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test7() throws Throwable  {
      PeriodType arg1 = PeriodType.yearWeekDayTime();
      BuddhistChronology arg2 = BuddhistChronology.getInstanceUTC();
      MutablePeriod mutablePeriod = new MutablePeriod((Object) null, arg1, arg2);
      mutablePeriod.setWeeks(682);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test8() throws Throwable  {
      Period years = Period.years(12);
      PeriodType arg0 = PeriodType.dayTime();
      // Undeclared exception!
      try { 
        years.withPeriodType(arg0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'years'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test9() throws Throwable  {
      MutablePeriod mutablePeriod = new MutablePeriod();
      Period period = mutablePeriod.toPeriod();
      assertNotNull(period);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test10() throws Throwable  {
      DateTime dateTime = new DateTime();
      LocalDateTime arg0 = dateTime.toLocalDateTime();
      LocalTime arg1 = LocalTime.now();
      PeriodType arg2 = PeriodType.yearDayTime();
      Period period = null;
      try {
        period = new Period(arg0, arg1, arg2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test11() throws Throwable  {
      MonthDay arg1 = new MonthDay();
      LocalTime arg0 = new LocalTime();
      Period period = null;
      try {
        period = new Period(arg0, arg1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must have the same set of fields
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test12() throws Throwable  {
      LocalDateTime arg1 = new LocalDateTime();
      Period period = new Period(arg1, arg1);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test13() throws Throwable  {
      MonthDay arg0 = MonthDay.now();
      Period period = null;
      try {
        period = new Period(arg0, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test14() throws Throwable  {
      Period period = null;
      try {
        period = new Period((ReadablePartial) null, (ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // ReadablePartial objects must not be null
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test15() throws Throwable  {
      PeriodType arg2 = PeriodType.seconds();
      MutablePeriod mutablePeriod = new MutablePeriod((ReadableInstant) null, (ReadableInstant) null, arg2);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetValueReturningPositive() throws Throwable  {
      Period millis = Period.millis(4);
      int value = millis.getValue(7);
      assertEquals(4, value);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test16() throws Throwable  {
      MutablePeriod mutablePeriod = new MutablePeriod();
      mutablePeriod.setPeriod(270, 270, 270, 270, 270, 270, 270, 270);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test17() throws Throwable  {
      PeriodType arg0 = PeriodType.years();
      MutablePeriod mutablePeriod = new MutablePeriod(arg0);
      // Undeclared exception!
      try { 
        mutablePeriod.addHours((-23));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'hours'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testToDurationTo() throws Throwable  {
      EthiopicChronology arg0 = EthiopicChronology.getInstance();
      MonthDay arg1 = MonthDay.now((Chronology) arg0);
      PeriodType arg2 = PeriodType.minutes();
      Period period = new Period(arg1, arg1, arg2);
      Duration durationTo = period.toDurationTo((ReadableInstant) null);
      durationTo.toPeriod();
      assertEquals(0L, durationTo.getStandardDays());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test18() throws Throwable  {
      MutablePeriod mutablePeriod = new MutablePeriod(2731L, 2731L, (Chronology) null);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test19() throws Throwable  {
      Minutes minutes = Minutes.MIN_VALUE;
      MutablePeriod mutablePeriod = minutes.toMutablePeriod();
      // Undeclared exception!
      try { 
        mutablePeriod.set((DurationFieldType) null, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Period does not support field 'null'
         //
         verifyException("org.joda.time.base.BasePeriod", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test20() throws Throwable  {
      Period period = new Period((ReadableDuration) null, (ReadableInstant) null);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test21() throws Throwable  {
      PeriodType arg1 = PeriodType.yearWeekDayTime();
      BuddhistChronology arg2 = BuddhistChronology.getInstanceUTC();
      MutablePeriod mutablePeriod = new MutablePeriod((Object) null, arg1, arg2);
      mutablePeriod.setValue(1, 7);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetPeriodType() throws Throwable  {
      MutablePeriod mutablePeriod = new MutablePeriod((-1), (-1), 4, 23);
      DateTime arg0 = DateTime.now();
      Duration durationFrom = mutablePeriod.toDurationFrom(arg0);
      Period periodFrom = durationFrom.toPeriodFrom((ReadableInstant) arg0, (PeriodType) null);
      periodFrom.getPeriodType();
      assertEquals((-3655977L), durationFrom.getMillis());
      assertEquals(0L, durationFrom.getStandardDays());
  }
}
