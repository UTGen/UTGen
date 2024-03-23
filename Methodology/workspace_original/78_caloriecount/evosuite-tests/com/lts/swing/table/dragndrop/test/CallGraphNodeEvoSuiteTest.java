/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.swing.table.dragndrop.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.swing.table.dragndrop.test.CallGraphNode;
import com.lts.swing.table.dragndrop.test.StackTraceEvent;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class CallGraphNodeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      CallGraphNode callGraphNode0 = new CallGraphNode();
      StackTraceEvent stackTraceEvent0 = callGraphNode0.getEvent();
      assertNull(stackTraceEvent0);
  }

  @Test
  public void test1()  throws Throwable  {
      StackTraceEvent stackTraceEvent0 = new StackTraceEvent();
      CallGraphNode callGraphNode0 = new CallGraphNode(stackTraceEvent0);
      callGraphNode0.isAncestorOf(stackTraceEvent0);
      assertEquals(false, callGraphNode0.isRoot());
      assertEquals("StackTraceEvent{01:00:00}", callGraphNode0.toString());
  }

  @Test
  public void test2()  throws Throwable  {
      StackTraceEvent stackTraceEvent0 = new StackTraceEvent();
      CallGraphNode callGraphNode0 = new CallGraphNode(stackTraceEvent0);
      callGraphNode0.isParentOf(stackTraceEvent0);
      assertEquals(false, callGraphNode0.isRoot());
      assertEquals("StackTraceEvent{01:00:00}", callGraphNode0.toString());
  }

  @Test
  public void test3()  throws Throwable  {
      StackTraceEvent stackTraceEvent0 = new StackTraceEvent();
      CallGraphNode callGraphNode0 = new CallGraphNode(stackTraceEvent0);
      boolean boolean0 = callGraphNode0.isRoot();
      assertEquals(false, boolean0);
  }

  @Test
  public void test4()  throws Throwable  {
      CallGraphNode callGraphNode0 = new CallGraphNode();
      boolean boolean0 = callGraphNode0.isRoot();
      assertEquals(true, boolean0);
  }

  @Test
  public void test5()  throws Throwable  {
      StackTraceEvent stackTraceEvent0 = new StackTraceEvent();
      CallGraphNode callGraphNode0 = new CallGraphNode(stackTraceEvent0);
      String string0 = callGraphNode0.toString();
      assertEquals("StackTraceEvent{01:00:00}", string0);
      assertNotNull(string0);
  }

  @Test
  public void test6()  throws Throwable  {
      CallGraphNode callGraphNode0 = new CallGraphNode();
      String string0 = callGraphNode0.toString();
      assertNotNull(string0);
      assertEquals("root", string0);
  }
}
