/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.caloriecount.data.meal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.application.data.IdApplicationDataList;
import com.lts.caloriecount.data.food.Food;
import com.lts.caloriecount.data.food.FoodList;
import com.lts.caloriecount.data.meal.Meal;
import com.lts.caloriecount.data.meal.MealList;
import com.lts.xml.simple.SimpleElement;
import java.util.List;
import org.evosuite.runtime.System;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class MealListEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      MealList mealList0 = new MealList();
      List<Meal> list0 = mealList0.getMeals();
      assertEquals(true, list0.isEmpty());
  }

  @Test
  public void test1()  throws Throwable  {
      MealList mealList0 = new MealList();
      String string0 = mealList0.getSerializationElementName();
      assertEquals("mealList", string0);
  }

  @Test
  public void test2()  throws Throwable  {
      MealList mealList0 = new MealList();
      Meal meal0 = (Meal)mealList0.createListElement(">'K\"?\"#{u^q/");
      mealList0.add(0, meal0);
      int int0 = mealList0.getFirstIndexAtOrAfter((long) 0);
      assertEquals(0, int0);
  }

  @Test
  public void test3()  throws Throwable  {
      MealList mealList0 = new MealList();
      Food food0 = new Food(0, "", 0, "");
      Meal meal0 = mealList0.createMeal((long) 0, food0);
      assertEquals(true, mealList0.isDirty());
      
      mealList0.deleteMeal(meal0);
      assertEquals(0, mealList0.size());
  }

  @Test
  public void test4()  throws Throwable  {
      MealList mealList0 = new MealList();
      int int0 = mealList0.total(356L);
      assertEquals(0, int0);
  }

  @Test
  public void test5()  throws Throwable  {
      MealList mealList0 = new MealList();
      SimpleElement simpleElement0 = mealList0.createSerializationElement();
      assertEquals("mealList", simpleElement0.getName());
  }

  @Test
  public void test6()  throws Throwable  {
      MealList mealList0 = new MealList();
      MealList mealList1 = new MealList((IdApplicationDataList<Meal>) mealList0);
      assertNotSame(mealList1, mealList0);
  }

  @Test
  public void test7()  throws Throwable  {
      MealList mealList0 = new MealList();
      // Undeclared exception!
      try {
        mealList0.update(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      } catch(IndexOutOfBoundsException e) {
        /*
         * Index: 0, Size: 0
         */
      }
  }

  @Test
  public void test8()  throws Throwable  {
      MealList mealList0 = new MealList();
      Meal meal0 = (Meal)mealList0.createListElement("mealList");
      // Undeclared exception!
      try {
        mealList0.notifyOfUpdateTo(meal0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test9()  throws Throwable  {
      MealList mealList0 = new MealList();
      // Undeclared exception!
      try {
        mealList0.getMeal(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      } catch(IndexOutOfBoundsException e) {
        /*
         * Index: 0, Size: 0
         */
      }
  }

  @Test
  public void test10()  throws Throwable  {
      MealList mealList0 = new MealList();
      mealList0.setMeals((List) mealList0);
      assertEquals("mealList", mealList0.getSerializationElementName());
  }

  @Test
  public void test11()  throws Throwable  {
      MealList mealList0 = new MealList();
      String string0 = mealList0.getEntryName();
      assertNull(string0);
  }

  @Test
  public void test12()  throws Throwable  {
      MealList mealList0 = new MealList();
      List<Integer> list0 = mealList0.getIndiciesFor((-1476L), (long) 0);
      FoodList foodList0 = new FoodList(list0);
      mealList0.rebuildTransients(foodList0);
      assertEquals(0, foodList0.size());
  }

  @Test
  public void test13()  throws Throwable  {
      MealList mealList0 = new MealList();
      FoodList foodList0 = new FoodList((List) mealList0);
      Food food0 = new Food();
      mealList0.createMeal(food0);
      // Undeclared exception!
      try {
        mealList0.rebuildTransients(foodList0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test14()  throws Throwable  {
      MealList mealList0 = new MealList();
      FoodList foodList0 = new FoodList();
      Food food0 = foodList0.createFood("}", 0, "}");
      Meal meal0 = mealList0.createMeal((long) 0, food0);
      mealList0.removeMeal(meal0);
      assertEquals(true, mealList0.isDirty());
      assertEquals(true, mealList0.isEmpty());
  }

  @Test
  public void test15()  throws Throwable  {
      MealList mealList0 = new MealList();
      Food food0 = new Food(0, "", 0, "");
      mealList0.createMeal((long) 0, food0);
      int int0 = mealList0.total((long) 0, (long) 0);
      assertEquals(1, mealList0.size());
      assertEquals(0, int0);
  }

  @Test
  public void test16()  throws Throwable  {
      System.setCurrentTimeMillis((-1874L));
      MealList mealList0 = new MealList();
      Food food0 = new Food(1042);
      mealList0.createMeal(food0);
      int int0 = mealList0.total((-1476L), (-1476L));
      assertEquals(true, mealList0.isDirty());
      assertEquals(0, int0);
  }

  @Test
  public void test17()  throws Throwable  {
      MealList mealList0 = new MealList();
      Food food0 = new Food(0, "", 0, "");
      mealList0.createMeal((long) 0, food0);
      List<Meal> list0 = mealList0.getEntriesFor((long) 0);
      assertEquals(1, mealList0.size());
      assertEquals(0, list0.size());
  }

  @Test
  public void test18()  throws Throwable  {
      MealList mealList0 = new MealList();
      List<Integer> list0 = mealList0.getIndiciesFor(0L, (-806L));
      assertEquals(true, list0.isEmpty());
  }

  @Test
  public void test19()  throws Throwable  {
      MealList mealList0 = new MealList();
      Meal meal0 = mealList0.getFirstEntryAtOrAfter((long) 1042);
      assertNull(meal0);
  }

  @Test
  public void test20()  throws Throwable  {
      MealList mealList0 = new MealList();
      int int0 = mealList0.getFirstIndexAtOrAfter(808L);
      assertEquals((-1), int0);
  }

  @Test
  public void test21()  throws Throwable  {
      System.setCurrentTimeMillis((-1874L));
      MealList mealList0 = new MealList();
      Food food0 = new Food(1042);
      mealList0.createMeal(food0);
      List<Integer> list0 = mealList0.getIndiciesFor((-1476L), (long) 0);
      assertEquals(1, mealList0.size());
      assertEquals(1, list0.size());
  }

  @Test
  public void test22()  throws Throwable  {
      MealList mealList0 = new MealList();
      Food food0 = new Food(0, "", 0, "");
      mealList0.createMeal((long) 0, food0);
      int int0 = mealList0.findIndexAtOrBefore((long) 0);
      assertEquals(1, mealList0.size());
      assertEquals(0, int0);
  }

  @Test
  public void test23()  throws Throwable  {
      MealList mealList0 = new MealList();
      Food food0 = new Food(0, "", 0, "");
      mealList0.createMeal((long) 0, food0);
      int int0 = mealList0.findIndexAtOrAfter((long) 0);
      assertEquals(false, mealList0.isEmpty());
      assertEquals(0, int0);
  }

  @Test
  public void test24()  throws Throwable  {
      MealList mealList0 = new MealList();
      int int0 = mealList0.findIndexAtOrAfter((-1651L));
      assertEquals((-1), int0);
  }

  @Test
  public void test25()  throws Throwable  {
      MealList mealList0 = new MealList();
      Meal meal0 = (Meal)mealList0.createListElement("mealList");
      mealList0.add(meal0);
      mealList0.update(meal0);
      assertEquals(true, mealList0.isDirty());
  }
}
