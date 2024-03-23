/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.pest.data.event;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.pest.data.event.DataChangeEvent;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class DataChangeEventEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DataChangeEvent dataChangeEvent0 = new DataChangeEvent((Object) "S}");
      dataChangeEvent0.setSource((Object) "S}");
  }

  @Test
  public void test1()  throws Throwable  {
      DataChangeEvent dataChangeEvent0 = new DataChangeEvent((Object) "S}");
      String string0 = (String)dataChangeEvent0.getSource();
      assertEquals("S}", string0);
  }
}
