/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.swing.table;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.caloriecount.ui.frequent.FrequentControlPanel;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ControlPanelEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      FrequentControlPanel frequentControlPanel0 = null;
      try {
        frequentControlPanel0 = new FrequentControlPanel();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}