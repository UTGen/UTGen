/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.caloriecount.ui.frequent;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.application.data.IdApplicationDataList;
import com.lts.caloriecount.data.frequent.FrequentFood;
import com.lts.caloriecount.ui.frequent.FrequentTableModel;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class FrequentTableModelEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      FrequentTableModel frequentTableModel0 = null;
      try {
        frequentTableModel0 = new FrequentTableModel((IdApplicationDataList<FrequentFood>) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
