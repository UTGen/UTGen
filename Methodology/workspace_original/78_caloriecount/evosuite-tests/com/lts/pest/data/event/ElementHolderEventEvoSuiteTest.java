/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.pest.data.event;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.pest.data.event.ElementHolderEvent;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ElementHolderEventEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ElementHolderEvent elementHolderEvent0 = new ElementHolderEvent((-1063));
      elementHolderEvent0.setOriginalData((Object) "unknown");
      assertEquals("unknown{, unknown}", elementHolderEvent0.toString());
      assertEquals(-1063, elementHolderEvent0.getEventType());
  }

  @Test
  public void test1()  throws Throwable  {
      ElementHolderEvent elementHolderEvent0 = new ElementHolderEvent();
      String string0 = elementHolderEvent0.toString();
      assertNotNull(string0);
      assertEquals("unknown{}", string0);
      assertEquals(-1, elementHolderEvent0.getEventType());
  }

  @Test
  public void test2()  throws Throwable  {
      ElementHolderEvent elementHolderEvent0 = new ElementHolderEvent();
      elementHolderEvent0.setEventType((-68));
      assertEquals(-68, elementHolderEvent0.getEventType());
  }

  @Test
  public void test3()  throws Throwable  {
      ElementHolderEvent elementHolderEvent0 = new ElementHolderEvent();
      elementHolderEvent0.setData((Object) "unknown");
      assertEquals("unknown{unknown}", elementHolderEvent0.toString());
  }

  @Test
  public void test4()  throws Throwable  {
      ElementHolderEvent elementHolderEvent0 = new ElementHolderEvent(0, (Object) "", (Object) "");
      String string0 = elementHolderEvent0.toString();
      assertNotNull(string0);
      assertEquals("element added{, }", string0);
  }

  @Test
  public void test5()  throws Throwable  {
      String string0 = ElementHolderEvent.eventToString(0);
      assertEquals("element added", string0);
  }

  @Test
  public void test6()  throws Throwable  {
      String string0 = ElementHolderEvent.eventToString(1);
      assertEquals("element removed", string0);
  }

  @Test
  public void test7()  throws Throwable  {
      String string0 = ElementHolderEvent.eventToString(2);
      assertEquals("element changed", string0);
  }

  @Test
  public void test8()  throws Throwable  {
      String string0 = ElementHolderEvent.eventToString(3);
      assertEquals("all changed", string0);
  }

  @Test
  public void test9()  throws Throwable  {
      String string0 = ElementHolderEvent.eventToString(4);
      assertEquals("post deserialization", string0);
  }
}
