/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.pest.gatherer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.pest.gatherer.TimeConstants;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TimeConstantsEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      TimeConstants timeConstants0 = new TimeConstants();
      assertNotNull(timeConstants0);
  }

  @Test
  public void test1()  throws Throwable  {
      Long long0 = TimeConstants.toDurationValue("2 hours");
      String string0 = TimeConstants.toDurationString((long) long0);
      assertNotNull(string0);
      assertEquals("2 hours", string0);
  }

  @Test
  public void test2()  throws Throwable  {
      TimeConstants.toDurationValue((String) null);
  }

  @Test
  public void test3()  throws Throwable  {
      TimeConstants.toDurationValue("1 day");
  }

  @Test
  public void test4()  throws Throwable  {
      String string0 = TimeConstants.toDurationString((-40L));
      assertEquals("-40 msec", string0);
  }

  @Test
  public void test5()  throws Throwable  {
      String string0 = TimeConstants.toDurationString(1149L);
      assertEquals("1 sec", string0);
      assertNotNull(string0);
  }

  @Test
  public void test6()  throws Throwable  {
      String string0 = TimeConstants.toDurationString(60053L);
      assertEquals("1 min", string0);
      assertNotNull(string0);
  }

  @Test
  public void test7()  throws Throwable  {
      String string0 = TimeConstants.toDurationString(31535999992L);
      assertEquals("364 days", string0);
  }

  @Test
  public void test8()  throws Throwable  {
      String string0 = TimeConstants.toDurationString(3600013L);
      assertEquals("1 hour", string0);
  }

  @Test
  public void test9()  throws Throwable  {
      String string0 = TimeConstants.toDurationString(31536000006L);
      assertEquals("31536000006msec", string0);
  }

  @Test
  public void test10()  throws Throwable  {
      String string0 = TimeConstants.toDurationString(86400000L);
      assertEquals("1 day", string0);
  }
}
