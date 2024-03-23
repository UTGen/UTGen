/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.logging;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.logging.NullLogger;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class NullLoggerEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      NullLogger nullLogger0 = new NullLogger();
      int int0 = nullLogger0.getLoggingSeverity();
      assertEquals((-1), int0);
  }

  @Test
  public void test1()  throws Throwable  {
      NullLogger nullLogger0 = new NullLogger();
      nullLogger0.basicLog("error", 0, (Throwable) null);
      assertEquals(-1, nullLogger0.getLoggingSeverity());
  }

  @Test
  public void test2()  throws Throwable  {
      NullLogger nullLogger0 = new NullLogger();
      nullLogger0.info("");
      assertEquals(-1, nullLogger0.getLoggingSeverity());
  }
}