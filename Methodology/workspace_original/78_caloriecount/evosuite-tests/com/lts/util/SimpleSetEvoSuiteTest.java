/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.util.SimpleSet;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class SimpleSetEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      SimpleSet simpleSet0 = new SimpleSet(objectArray0);
      assertEquals(1, simpleSet0.size());
      assertNotNull(simpleSet0);
  }
}