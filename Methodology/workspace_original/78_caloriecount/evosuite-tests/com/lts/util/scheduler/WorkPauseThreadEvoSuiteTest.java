/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.util.scheduler;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.application.checkpoint.CheckPointService;

@RunWith(EvoSuiteRunner.class)
public class WorkPauseThreadEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 com.lts.util.scheduler.WorkPauseThread.processThenPause()Z: root-Branch
   * 2 com.lts.util.scheduler.WorkPauseThread.getProcessThenPause()Z: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      CheckPointService checkPointService0 = CheckPointService.getInstance();
      boolean boolean0 = checkPointService0.processThenPause();
      assertEquals(false, boolean0);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 com.lts.util.scheduler.WorkPauseThread.getPauseTime()J: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      CheckPointService checkPointService0 = CheckPointService.getInstance();
      long long0 = checkPointService0.getPauseTime();
      assertEquals(120000L, long0);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 com.lts.util.scheduler.WorkPauseThread.getLastException()Ljava/lang/Throwable;: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      CheckPointService checkPointService0 = CheckPointService.getInstance();
      Throwable throwable0 = checkPointService0.getLastException();
      assertNull(throwable0);
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * 1 com.lts.util.scheduler.WorkPauseThread.stopThread()V: I5 Branch 7 IF_ACMPNE L217 - true
   * 2 com.lts.util.scheduler.WorkPauseThread.stopThread()V: I19 Branch 8 IF_ACMPEQ L221 - false
   */
  @Test
  public void test3()  throws Throwable  {
      CheckPointService.stopService();
  }
}
