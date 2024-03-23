/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.trace;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.trace.EventLog;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class EventLogEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      EventLog eventLog0 = EventLog.getInstance();
      // Undeclared exception!
      try {
        eventLog0.leaveMethod();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      EventLog eventLog0 = new EventLog();
      // Undeclared exception!
      try {
        eventLog0.add();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      EventLog.resetInstance();
  }

  @Test
  public void test3()  throws Throwable  {
      EventLog eventLog0 = EventLog.getInstance();
      // Undeclared exception!
      try {
        eventLog0.enterMethod();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test4()  throws Throwable  {
      EventLog eventLog0 = new EventLog();
      String string0 = eventLog0.getTranscript();
      assertNull(string0);
  }
}
