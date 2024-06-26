/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.util.DefaultSharedQueue;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class DefaultSharedQueueEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DefaultSharedQueue defaultSharedQueue0 = new DefaultSharedQueue();
      defaultSharedQueue0.put((Object) "===] Shared Queue Report [===\n\nQueue contents:\n");
      assertEquals("===] Shared Queue Report [===\n\nQueue contents:\n===] Shared Queue Report [===\n\nQueue contents:\n\n", defaultSharedQueue0.getReport());
  }

  @Test
  public void test1()  throws Throwable  {
      DefaultSharedQueue defaultSharedQueue0 = new DefaultSharedQueue();
      // Undeclared exception!
      try {
        defaultSharedQueue0.performWait();
        fail("Expecting exception: IllegalMonitorStateException");
      } catch(IllegalMonitorStateException e) {
      }
  }
}
