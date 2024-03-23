/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.caloriecount.data.frequent;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.caloriecount.data.food.Food;
import com.lts.caloriecount.data.frequent.FrequentFood;
import com.lts.xml.simple.SimpleElement;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class FrequentFoodEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      FrequentFood frequentFood0 = new FrequentFood();
      SimpleElement simpleElement0 = frequentFood0.createSerializationElement();
      assertNotNull(simpleElement0);
      assertEquals(0, frequentFood0.getCount());
      assertEquals(0, frequentFood0.getFoodId());
      assertEquals("frequent", simpleElement0.getName());
  }

  @Test
  public void test1()  throws Throwable  {
      Food food0 = new Food((-38), "=X", (-38), "=X");
      FrequentFood frequentFood0 = new FrequentFood((-38), food0);
      String string0 = frequentFood0.toString();
      assertEquals(-38, frequentFood0.getId());
      assertEquals(-38, frequentFood0.getFoodId());
      assertNotNull(string0);
  }

  @Test
  public void test2()  throws Throwable  {
      FrequentFood frequentFood0 = new FrequentFood();
      boolean boolean0 = frequentFood0.isLocked();
      assertEquals(false, boolean0);
  }

  @Test
  public void test3()  throws Throwable  {
      FrequentFood frequentFood0 = new FrequentFood();
      String string0 = frequentFood0.getSerializationName();
      assertEquals("frequent", string0);
  }

  @Test
  public void test4()  throws Throwable  {
      FrequentFood frequentFood0 = new FrequentFood();
      frequentFood0.setLocked(true);
      frequentFood0.toString();
      assertEquals(true, frequentFood0.locked());
      assertEquals(true, frequentFood0.isLocked());
  }

  @Test
  public void test5()  throws Throwable  {
      FrequentFood frequentFood0 = new FrequentFood();
      String string0 = frequentFood0.toString();
      assertNotNull(string0);
  }
}
