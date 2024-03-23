/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.util.FairWaiter;
import java.util.List;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class FairWaiterEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      FairWaiter fairWaiter0 = new FairWaiter();
      List<Object> list0 = fairWaiter0.copyWaiters();
      assertNotNull(list0);
      
      boolean boolean0 = fairWaiter0.noWaiters();
      assertEquals(true, boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      FairWaiter fairWaiter0 = new FairWaiter();
      fairWaiter0.setNextInLine((Thread) null);
      assertEquals(true, fairWaiter0.noWaiters());
  }

  @Test
  public void test2()  throws Throwable  {
      FairWaiter fairWaiter0 = new FairWaiter();
      fairWaiter0.fairNotify();
      assertEquals(true, fairWaiter0.noWaiters());
  }
}
