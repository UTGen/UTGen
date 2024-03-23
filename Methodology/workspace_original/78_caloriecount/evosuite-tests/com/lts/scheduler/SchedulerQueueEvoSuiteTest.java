/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.scheduler;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.scheduler.SchedulerEvent;
import com.lts.scheduler.SchedulerQueue;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class SchedulerQueueEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      SchedulerQueue schedulerQueue0 = new SchedulerQueue();
      SchedulerEvent schedulerEvent0 = schedulerQueue0.takeIfAvailable();
      assertNull(schedulerEvent0);
  }
}
