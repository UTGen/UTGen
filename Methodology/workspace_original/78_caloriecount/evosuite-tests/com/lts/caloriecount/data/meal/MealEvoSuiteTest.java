/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.caloriecount.data.meal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.caloriecount.data.food.Food;
import com.lts.caloriecount.data.meal.Meal;
import com.lts.caloriecount.data.meal.MealList;
import com.lts.util.deepcopy.DeepCopyException;
import com.lts.xml.simple.SimpleElement;
import java.util.List;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class MealEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Meal meal0 = new Meal();
      SimpleElement simpleElement0 = meal0.createSerializationElement();
      assertNotNull(simpleElement0);
      
      meal0.deserializeFrom(simpleElement0);
      assertEquals(0, meal0.getFoodId());
      assertEquals("meal", simpleElement0.getName());
      assertEquals("meal", meal0.getSerializationName());
  }

  @Test
  public void test1()  throws Throwable  {
      Meal meal0 = new Meal();
      String string0 = meal0.getEntryName();
      assertEquals("Meal", string0);
  }

  @Test
  public void test2()  throws Throwable  {
      Food food0 = new Food(0, "#AY", 0, "#AY");
      MealList mealList0 = new MealList();
      Meal meal0 = mealList0.createMeal(food0);
      Meal meal1 = (Meal)meal0.deepCopy();
      assertEquals(0, meal1.getFoodId());
  }

  @Test
  public void test3()  throws Throwable  {
      Meal meal0 = new Meal();
      meal0.updateFrom(meal0);
      assertEquals(0, meal0.getFoodId());
  }

  @Test
  public void test4()  throws Throwable  {
      MealList mealList0 = new MealList();
      Food food0 = new Food(35, "u", 35, "u");
      mealList0.createMeal(food0);
      try {
        mealList0.deepCopy();
        fail("Expecting exception: DeepCopyException");
      } catch(DeepCopyException e) {
        /*
         * The object, [u,35,1970-01-01@01:00:00], of class class java.util.ArrayList, does not implement com.lts.util.deepcopy.DeepCopier
         */
      }
  }

  @Test
  public void test5()  throws Throwable  {
      Meal meal0 = new Meal();
      // Undeclared exception!
      try {
        meal0.getCalories();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test6()  throws Throwable  {
      Meal meal0 = new Meal();
      Food food0 = new Food((-12), "meal", (-12), "meal");
      meal0.setFood(food0);
      String string0 = meal0.getDescription();
      assertEquals(-12, meal0.getFoodId());
      assertEquals("meal", string0);
  }

  @Test
  public void test7()  throws Throwable  {
      Food food0 = new Food(0, "#AY", 0, "#AY");
      MealList mealList0 = new MealList();
      mealList0.createMeal(food0);
      int int0 = mealList0.total((long) 0, 3607L);
      assertEquals(0, int0);
  }

  @Test
  public void test8()  throws Throwable  {
      Meal meal0 = new Meal();
      Meal.MealComparator meal_MealComparator0 = new Meal.MealComparator();
      int int0 = meal_MealComparator0.compare((Object) null, (Object) meal0);
      assertEquals((-1), int0);
  }

  @Test
  public void test9()  throws Throwable  {
      Meal.MealComparator meal_MealComparator0 = new Meal.MealComparator();
      int int0 = meal_MealComparator0.compare((Object) null, (Object) null);
      assertEquals(0, int0);
  }

  @Test
  public void test10()  throws Throwable  {
      Meal meal0 = new Meal();
      Meal.MealComparator meal_MealComparator0 = new Meal.MealComparator();
      int int0 = meal_MealComparator0.compare((Object) meal0, (Object) null);
      assertEquals(1, int0);
  }

  @Test
  public void test11()  throws Throwable  {
      Food food0 = new Food(0, "#AY", 0, "#AY");
      MealList mealList0 = new MealList();
      mealList0.createMeal(food0);
      int int0 = mealList0.total(3607L, (long) 0);
      assertEquals(0, int0);
  }

  @Test
  public void test12()  throws Throwable  {
      Food food0 = new Food(0, "#AY", 0, "#AY");
      MealList mealList0 = new MealList();
      mealList0.createMeal(food0);
      List<Meal> list0 = mealList0.getEntriesFor((long) 0);
      assertEquals(0, list0.size());
  }

  @Test
  public void test13()  throws Throwable  {
      MealList mealList0 = new MealList();
      Food food0 = new Food(35, "u", 35, "u");
      Meal meal0 = mealList0.createMeal(food0);
      SimpleElement simpleElement0 = meal0.createSerializationElement();
      assertEquals(35, meal0.getFoodId());
      assertEquals("meal", simpleElement0.getName());
  }

  @Test
  public void test14()  throws Throwable  {
      Meal meal0 = new Meal();
      String string0 = meal0.getDescription();
      assertNull(string0);
  }
}
