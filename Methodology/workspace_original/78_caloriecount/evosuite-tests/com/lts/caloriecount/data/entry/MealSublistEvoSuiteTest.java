/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.caloriecount.data.entry;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.caloriecount.data.Adjustment;
import com.lts.caloriecount.data.entry.Entry;
import com.lts.caloriecount.data.entry.EntryList;
import com.lts.caloriecount.data.entry.MealSublist;
import com.lts.caloriecount.data.food.Food;
import com.lts.caloriecount.data.meal.Meal;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class MealSublistEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      EntryList entryList0 = new EntryList();
      MealSublist mealSublist0 = new MealSublist(entryList0);
      EntryList entryList1 = mealSublist0.getEntryList();
      assertEquals(true, entryList1.isEmpty());
  }

  @Test
  public void test1()  throws Throwable  {
      EntryList entryList0 = new EntryList();
      Food food0 = new Food((-1102), "", 875, "");
      Meal meal0 = new Meal((-1102), food0, 1513L);
      entryList0.add((Entry) meal0);
      MealSublist mealSublist0 = new MealSublist(entryList0);
      assertNotNull(mealSublist0);
      assertEquals(1, mealSublist0.size());
  }

  @Test
  public void test2()  throws Throwable  {
      EntryList entryList0 = new EntryList();
      Adjustment adjustment0 = new Adjustment();
      entryList0.add((Entry) adjustment0);
      MealSublist mealSublist0 = new MealSublist(entryList0);
      assertEquals(0, mealSublist0.size());
  }
}
