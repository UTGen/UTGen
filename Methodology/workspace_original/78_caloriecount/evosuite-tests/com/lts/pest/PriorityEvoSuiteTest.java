/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.pest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.pest.Priority;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class PriorityEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Priority priority0 = new Priority();
      assertNotNull(priority0);
  }

  @Test
  public void test1()  throws Throwable  {
      int int0 = Priority.stringToPriority("Lowest");
      assertEquals(1, int0);
  }

  @Test
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try {
        Priority.stringToPriority("");
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Unrecognized priority string: 
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      String string0 = Priority.priorityToString(39);
      assertNotNull(string0);
      assertEquals("Normal", string0);
  }

  @Test
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try {
        Priority.priorityToString(802);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Priority code is greater than highest value.  Max value: 100, supplied value: 802
         */
      }
  }

  @Test
  public void test5()  throws Throwable  {
      String string0 = Priority.priorityToString(100);
      assertEquals("Highest", string0);
      assertNotNull(string0);
  }

  @Test
  public void test6()  throws Throwable  {
      String string0 = Priority.priorityToString(52);
      assertNotNull(string0);
      assertEquals("High", string0);
  }

  @Test
  public void test7()  throws Throwable  {
      String string0 = Priority.priorityToString(1);
      assertNotNull(string0);
      assertEquals("Lowest", string0);
  }

  @Test
  public void test8()  throws Throwable  {
      String string0 = Priority.priorityToString(15);
      assertNotNull(string0);
      assertEquals("Low", string0);
  }

  @Test
  public void test9()  throws Throwable  {
      // Undeclared exception!
      try {
        Priority.priorityToString((-814));
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Priority code is less than minimum value.  Min value: 1, supplied vlaue: -814
         */
      }
  }

  @Test
  public void test10()  throws Throwable  {
      int int0 = Priority.sortComparePriorities(52, 1419);
      assertEquals(1, int0);
  }

  @Test
  public void test11()  throws Throwable  {
      int int0 = Priority.sortComparePriorities(39, 11);
      assertEquals((-1), int0);
  }

  @Test
  public void test12()  throws Throwable  {
      int int0 = Priority.sortComparePriorities(100, 100);
      assertEquals(0, int0);
  }
}