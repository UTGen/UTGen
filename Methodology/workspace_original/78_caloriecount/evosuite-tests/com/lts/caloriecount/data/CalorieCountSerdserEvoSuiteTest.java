/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.caloriecount.data;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.application.ApplicationException;
import com.lts.caloriecount.data.CalorieCountData;
import com.lts.caloriecount.data.CalorieCountSerdser;
import java.io.File;
import java.lang.reflect.Method;
import javax.swing.event.ListSelectionListener;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class CalorieCountSerdserEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      CalorieCountSerdser calorieCountSerdser0 = CalorieCountSerdser.getInstance();
      calorieCountSerdser0.logWarning(" ");
  }

  @Test
  public void test1()  throws Throwable  {
      CalorieCountSerdser calorieCountSerdser0 = new CalorieCountSerdser();
      File file0 = new File("");
      try {
        calorieCountSerdser0.deserializeFoods(file0);
        fail("Expecting exception: ApplicationException");
      } catch(ApplicationException e) {
        /*
         * Error trying to load food list from file , [0] com.lts.LTSException: Error parsing 
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      CalorieCountSerdser calorieCountSerdser0 = CalorieCountSerdser.getInstance();
      // Undeclared exception!
      try {
        calorieCountSerdser0.deserializeCalorieCount((File) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * File cannot be null
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      CalorieCountSerdser calorieCountSerdser0 = CalorieCountSerdser.getInstance();
      CalorieCountData calorieCountData0 = new CalorieCountData();
      // Undeclared exception!
      try {
        calorieCountSerdser0.serializeCalorieCount((File) null, calorieCountData0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
        /*
         * name can't be null
         */
      }
  }

  @Test
  public void test4()  throws Throwable  {
      Class<?> class0 = ListSelectionListener.class;
      Method method0 = CalorieCountSerdser.getPopulateMethod(class0);
      assertNull(method0);
  }
}