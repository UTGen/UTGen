/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Mon Mar 18 05:06:02 GMT 2024
 */

package net.sf.lavalamp.device;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import net.sf.lavalamp.device.TimeOfDay;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TimeOfDay_Original_ESTest extends TimeOfDay_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetMinutesReturningZero() throws Throwable  {
      TimeOfDay timeOfDay = new TimeOfDay((-1844), 0);
      Integer minutes = timeOfDay.getMinutes();
      assertEquals(0, (int)minutes);
      assertEquals((-1844), (int)timeOfDay.getHours());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetMinutesReturningNegative() throws Throwable  {
      TimeOfDay timeOfDay = new TimeOfDay(0, (-1023));
      Integer minutes = timeOfDay.getMinutes();
      assertEquals(0, (int)timeOfDay.getHours());
      assertEquals((-1023), (int)minutes);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetHoursReturningPositive() throws Throwable  {
      TimeOfDay timeOfDay = new TimeOfDay(400, 400);
      Integer hours = timeOfDay.getHours();
      assertEquals(400, (int)timeOfDay.getMinutes());
      assertEquals(400, (int)hours);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetHoursReturningNegative() throws Throwable  {
      TimeOfDay timeOfDay = new TimeOfDay((-2770), (-2770));
      Integer hours = timeOfDay.getHours();
      assertEquals((-2770), (int)timeOfDay.getMinutes());
      assertEquals((-2770), (int)hours);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCompareToReturningPositive() throws Throwable  {
      TimeOfDay timeOfDay = new TimeOfDay(0, (-1023));
      TimeOfDay arg0 = new TimeOfDay(0, (-1073));
      int compareTo = timeOfDay.compareTo(arg0);
      assertEquals((-1073), (int)arg0.getMinutes());
      assertEquals(0, (int)arg0.getHours());
      assertEquals(1, compareTo);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsReturningTrue() throws Throwable  {
      TimeOfDay arg0 = new TimeOfDay(0, (-1023));
      TimeOfDay timeOfDay = new TimeOfDay(0, (-1023));
      boolean equals = timeOfDay.equals(arg0);
      assertEquals(0, (int)timeOfDay.getHours());
      assertTrue(equals);
      assertEquals((-1023), (int)timeOfDay.getMinutes());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsReturningFalse() throws Throwable  {
      TimeOfDay timeOfDay = new TimeOfDay(0, (-1023));
      TimeOfDay arg0 = new TimeOfDay((-1023), (-3837));
      boolean equals = timeOfDay.equals(arg0);
      assertEquals((-1023), (int)arg0.getHours());
      assertEquals((-3837), (int)arg0.getMinutes());
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesTimeOfDayTakingString() throws Throwable  {
      TimeOfDay timeOfDay = new TimeOfDay((-1), 100);
      TimeOfDay arg0 = new TimeOfDay("-1:100");
      boolean equals = timeOfDay.equals(arg0);
      assertFalse(equals);
      assertEquals(10, (int)arg0.getMinutes());
      assertEquals((-1), (int)arg0.getHours());
      assertEquals((-1), (int)timeOfDay.getHours());
      assertEquals(100, (int)timeOfDay.getMinutes());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsWithNonNull() throws Throwable  {
      TimeOfDay timeOfDay = new TimeOfDay((-1), 100);
      Object arg0 = new Object();
      boolean equals = timeOfDay.equals(arg0);
      assertFalse(equals);
      assertEquals((-1), (int)timeOfDay.getHours());
      assertEquals(100, (int)timeOfDay.getMinutes());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesTimeOfDayTaking2Arguments() throws Throwable  {
      TimeOfDay arg0 = new TimeOfDay(0, (-1023));
      boolean equals = arg0.equals(arg0);
      assertTrue(equals);
      assertEquals((-1023), (int)arg0.getMinutes());
      assertEquals(0, (int)arg0.getHours());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsWithNull() throws Throwable  {
      TimeOfDay timeOfDay = new TimeOfDay((-2770), (-2770));
      boolean equals = timeOfDay.equals((Object) null);
      assertFalse(equals);
      assertEquals((-2770), (int)timeOfDay.getMinutes());
      assertEquals((-2770), (int)timeOfDay.getHours());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCompareToReturningNegative() throws Throwable  {
      TimeOfDay timeOfDay = new TimeOfDay((-1023), (-1023));
      TimeOfDay arg0 = new TimeOfDay((-579), (-1023));
      int compareTo = timeOfDay.compareTo(arg0);
      assertEquals((-1), compareTo);
      assertEquals((-1023), (int)timeOfDay.getHours());
      assertEquals((-1023), (int)arg0.getMinutes());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCompareToReturningZero() throws Throwable  {
      TimeOfDay arg0 = new TimeOfDay((-1), 100);
      int compareTo = arg0.compareTo(arg0);
      assertEquals((-1), (int)arg0.getHours());
      assertEquals(100, (int)arg0.getMinutes());
      assertEquals(0, compareTo);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testToString() throws Throwable  {
      TimeOfDay timeOfDay = new TimeOfDay((-1), 100);
      String string = timeOfDay.toString();
      assertEquals("-1:100", string);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetHoursReturningZero() throws Throwable  {
      TimeOfDay timeOfDay = new TimeOfDay(0, (-1023));
      Integer hours = timeOfDay.getHours();
      assertEquals((-1023), (int)timeOfDay.getMinutes());
      assertEquals(0, (int)hours);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetMinutesReturningPositive() throws Throwable  {
      TimeOfDay timeOfDay = new TimeOfDay((-1), 100);
      Integer minutes = timeOfDay.getMinutes();
      assertEquals(100, (int)minutes);
      assertEquals((-1), (int)timeOfDay.getHours());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHashCode() throws Throwable  {
      TimeOfDay timeOfDay = new TimeOfDay((-1), 100);
      timeOfDay.hashCode();
      assertEquals((-1), (int)timeOfDay.getHours());
      assertEquals(100, (int)timeOfDay.getMinutes());
  }
}