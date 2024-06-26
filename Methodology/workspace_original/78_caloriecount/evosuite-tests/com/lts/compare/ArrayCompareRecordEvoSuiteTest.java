/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.compare;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.compare.ArrayCompareRecord;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ArrayCompareRecordEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Object object0 = new Object();
      ArrayCompareRecord arrayCompareRecord0 = new ArrayCompareRecord(0, object0, object0);
      String string0 = arrayCompareRecord0.toLinkString(false);
      assertEquals("[0]", string0);
      assertNotNull(string0);
  }

  @Test
  public void test1()  throws Throwable  {
      Object object0 = new Object();
      ArrayCompareRecord arrayCompareRecord0 = new ArrayCompareRecord(0, object0, object0);
      int int0 = arrayCompareRecord0.getIndex();
      assertEquals(0, int0);
  }
}
