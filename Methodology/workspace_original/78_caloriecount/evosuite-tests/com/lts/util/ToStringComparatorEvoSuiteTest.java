/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.util.ToStringComparator;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ToStringComparatorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ToStringComparator toStringComparator0 = new ToStringComparator(false, false);
      Object object0 = new Object();
      int int0 = toStringComparator0.compare(object0, object0);
      assertEquals(0, int0);
  }
}
