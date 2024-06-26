/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.logging;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.logging.InMemoryLogger;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class InMemoryLoggerEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      InMemoryLogger inMemoryLogger0 = new InMemoryLogger();
      assertNotNull(inMemoryLogger0);
      
      inMemoryLogger0.forceLog("g", (Throwable) null);
      assertEquals("|2013-07-03 00:14:36.954|forced|g|\n", inMemoryLogger0.acknowledgeBuffer());
      
      String string0 = inMemoryLogger0.acknowledgeBuffer();
      assertNotNull(string0);
      assertEquals("", string0);
  }

  @Test
  public void test1()  throws Throwable  {
      InMemoryLogger inMemoryLogger0 = new InMemoryLogger();
      assertNotNull(inMemoryLogger0);
      
      inMemoryLogger0.processOverflow("g");
      assertEquals("", inMemoryLogger0.acknowledgeBuffer());
      
      inMemoryLogger0.processOverflow("g");
      assertEquals("g", inMemoryLogger0.acknowledgeBuffer());
  }

  @Test
  public void test2()  throws Throwable  {
      InMemoryLogger inMemoryLogger0 = new InMemoryLogger();
      inMemoryLogger0.initialize(1, 1);
      // Undeclared exception!
      try {
        inMemoryLogger0.processOverflow((String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      InMemoryLogger inMemoryLogger0 = new InMemoryLogger();
      assertNotNull(inMemoryLogger0);
      
      inMemoryLogger0.processOverflow("g");
      String string0 = inMemoryLogger0.acknowledgeBuffer();
      assertEquals("g", string0);
      assertNotNull(string0);
  }

  @Test
  public void test4()  throws Throwable  {
      InMemoryLogger inMemoryLogger0 = new InMemoryLogger();
      String string0 = inMemoryLogger0.acknowledgeBuffer();
      assertNull(string0);
  }
}
