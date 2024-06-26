/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.caloriecount.data.conversion;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.application.ApplicationException;
import com.lts.caloriecount.data.CalorieCountData;
import com.lts.caloriecount.data.budget.Budget;
import com.lts.caloriecount.data.budget.TimeOfDay;
import com.lts.caloriecount.data.conversion.ConvertOneDotZeroToOneDotOne;
import com.lts.xml.simple.SimpleElement;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ConvertOneDotZeroToOneDotOneEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ConvertOneDotZeroToOneDotOne convertOneDotZeroToOneDotOne0 = new ConvertOneDotZeroToOneDotOne();
      CalorieCountData calorieCountData0 = new CalorieCountData();
      Budget budget0 = calorieCountData0.getBudget();
      TimeOfDay timeOfDay0 = budget0.getEndOfDay();
      SimpleElement simpleElement0 = timeOfDay0.createSerializationElement();
      convertOneDotZeroToOneDotOne0.convert(simpleElement0);
      assertEquals(1372806023916L, timeOfDay0.toTime());
  }
}
