/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.xml.simple;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.caloriecount.data.budget.Budget;
import com.lts.caloriecount.data.budget.TimeOfDay;
import com.lts.caloriecount.data.food.FoodList;
import com.lts.util.ReallyCaselessMap;
import com.lts.xml.simple.SimpleElement;
import java.util.List;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class SimpleElementEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Budget budget0 = new Budget();
      SimpleElement simpleElement0 = budget0.createSerializationElement();
      assertNotNull(simpleElement0);
      
      long long0 = simpleElement0.getLongValueOfChild("");
      assertEquals("budget", simpleElement0.toString());
      assertEquals((-1L), long0);
  }

  @Test
  public void test1()  throws Throwable  {
      FoodList foodList0 = new FoodList();
      SimpleElement simpleElement0 = foodList0.createSerializationElement();
      SimpleElement simpleElement1 = simpleElement0.createChild("#Xr]7%FH&?D^(t d", (-965));
      assertNotNull(simpleElement1);
      assertEquals((-965.0), simpleElement1.getDoubleValue(), 0.01D);
      assertEquals("#Xr]7%FH&?D^(t d -965", simpleElement1.toString());
      
      long long0 = simpleElement0.getTimeValueOfChild("#Xr]7%FH&?D^(t d", false);
      assertEquals((-1L), long0);
      assertEquals("foods", simpleElement0.toString());
  }

  @Test
  public void test2()  throws Throwable  {
      FoodList foodList0 = new FoodList();
      SimpleElement simpleElement0 = foodList0.createSerializationElement();
      SimpleElement simpleElement1 = simpleElement0.createChild("8kGO.RiHzc<EH8GU", (-740L));
      assertNotNull(simpleElement1);
      
      SimpleElement simpleElement2 = simpleElement1.getParent();
      assertNotNull(simpleElement2);
      
      int int0 = simpleElement2.getIntValueOfChild("8kGO.RiHzc<EH8GU", true);
      assertEquals("foods", simpleElement0.toString());
      assertEquals((-740), int0);
  }

  @Test
  public void test3()  throws Throwable  {
      Budget budget0 = new Budget();
      TimeOfDay timeOfDay0 = budget0.getEndOfDay();
      SimpleElement simpleElement0 = timeOfDay0.createSerializationElement();
      SimpleElement simpleElement1 = simpleElement0.createChild((String) null, (-1L));
      // Undeclared exception!
      try {
        simpleElement1.setName("1(ub");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test4()  throws Throwable  {
      FoodList foodList0 = new FoodList();
      SimpleElement simpleElement0 = foodList0.createSerializationElement();
      simpleElement0.getParent();
      assertEquals("foods", simpleElement0.toString());
  }

  @Test
  public void test5()  throws Throwable  {
      SimpleElement simpleElement0 = new SimpleElement((String) null);
      SimpleElement simpleElement1 = simpleElement0.createChild((String) null, 21L);
      assertNotNull(simpleElement1);
      
      long long0 = simpleElement0.getLongValueOfChild((String) null);
      assertNotSame(simpleElement0, simpleElement1);
      assertEquals(21L, long0);
  }

  @Test
  public void test6()  throws Throwable  {
      String string0 = SimpleElement.toDateTimeValue(0L);
      assertNotNull(string0);
  }

  @Test
  public void test7()  throws Throwable  {
      SimpleElement simpleElement0 = new SimpleElement((String) null, (String) null);
      ReallyCaselessMap<String> reallyCaselessMap0 = simpleElement0.getAttributes();
      assertEquals("{}", reallyCaselessMap0.toString());
  }

  @Test
  public void test8()  throws Throwable  {
      SimpleElement simpleElement0 = new SimpleElement();
      int int0 = simpleElement0.getIntValueOfChild((String) null);
      assertEquals((-1), int0);
  }

  @Test
  public void test9()  throws Throwable  {
      SimpleElement simpleElement0 = new SimpleElement("description", "description");
      assertNotNull(simpleElement0);
      
      String string0 = simpleElement0.toString();
      assertEquals("description description", string0);
      assertNotNull(string0);
  }

  @Test
  public void test10()  throws Throwable  {
      String string0 = SimpleElement.stringOrNull((String) null);
      assertEquals("<null>", string0);
      assertNotNull(string0);
  }

  @Test
  public void test11()  throws Throwable  {
      SimpleElement simpleElement0 = new SimpleElement("description", "description");
      assertNotNull(simpleElement0);
      
      simpleElement0.setChildren((List<SimpleElement>) null);
      assertEquals("description description", simpleElement0.toString());
  }

  @Test
  public void test12()  throws Throwable  {
      SimpleElement simpleElement0 = new SimpleElement((String) null, (String) null);
      assertNotNull(simpleElement0);
      
      int int0 = simpleElement0.getIntValue();
      assertEquals((-1), int0);
  }

  @Test
  public void test13()  throws Throwable  {
      Budget budget0 = new Budget();
      SimpleElement simpleElement0 = budget0.createSerializationElement();
      assertNotNull(simpleElement0);
      
      long long0 = simpleElement0.getTimeValueOfChild("");
      assertEquals((-1L), long0);
      assertEquals("budget", simpleElement0.toString());
  }

  @Test
  public void test14()  throws Throwable  {
      Budget budget0 = new Budget();
      SimpleElement simpleElement0 = budget0.createSerializationElement();
      assertNotNull(simpleElement0);
      
      budget0.deserializeFrom(simpleElement0);
      assertEquals("budget", simpleElement0.toString());
      assertEquals(0.0, budget0.getCaloriesPerHour(), 0.01D);
  }

  @Test
  public void test15()  throws Throwable  {
      FoodList foodList0 = new FoodList();
      SimpleElement simpleElement0 = foodList0.createSerializationElement();
      long long0 = simpleElement0.getLongValue(false);
      assertEquals((-1L), long0);
      assertEquals("foods", simpleElement0.toString());
  }

  @Test
  public void test16()  throws Throwable  {
      Budget budget0 = new Budget();
      TimeOfDay timeOfDay0 = budget0.getEndOfDay();
      SimpleElement simpleElement0 = timeOfDay0.createSerializationElement();
      long long0 = simpleElement0.getLongValue(true);
      assertEquals(1372633200561L, timeOfDay0.toTime());
      assertEquals((-1L), long0);
  }

  @Test
  public void test17()  throws Throwable  {
      Budget budget0 = new Budget();
      TimeOfDay timeOfDay0 = budget0.getEndOfDay();
      SimpleElement simpleElement0 = timeOfDay0.createSerializationElement();
      simpleElement0.getValueOfChild("1(ub");
      assertEquals(1372633200722L, timeOfDay0.toTime());
  }

  @Test
  public void test18()  throws Throwable  {
      SimpleElement simpleElement0 = new SimpleElement((String) null, (String) null);
      assertNotNull(simpleElement0);
      
      double double0 = simpleElement0.getDoubleValue();
      assertEquals(0.0, double0, 0.01D);
  }

  @Test
  public void test19()  throws Throwable  {
      SimpleElement simpleElement0 = new SimpleElement("", (double) 0L);
      assertNotNull(simpleElement0);
      
      // Undeclared exception!
      try {
        simpleElement0.getDoubleValueOfChild("", false);
        fail("Expecting exception: RuntimeException");
      } catch(RuntimeException e) {
        /*
         * missing child 
         */
      }
  }

  @Test
  public void test20()  throws Throwable  {
      SimpleElement simpleElement0 = new SimpleElement((String) null, (String) null);
      assertNotNull(simpleElement0);
      
      double double0 = simpleElement0.getDoubleValueOfChild((String) null, true);
      assertEquals(0.0, double0, 0.01D);
  }

  @Test
  public void test21()  throws Throwable  {
      SimpleElement simpleElement0 = new SimpleElement(" %b:3vLmq", " %b:3vLmq");
      assertNotNull(simpleElement0);
      
      // Undeclared exception!
      try {
        simpleElement0.getIntValueOfChild(" %b:3vLmq", false);
        fail("Expecting exception: RuntimeException");
      } catch(RuntimeException e) {
        /*
         * missing child %b:3vLmq
         */
      }
  }

  @Test
  public void test22()  throws Throwable  {
      SimpleElement simpleElement0 = new SimpleElement("description", "description");
      assertNotNull(simpleElement0);
      
      int int0 = simpleElement0.getIntValueOfChild("description", true);
      assertEquals("description description", simpleElement0.toString());
      assertEquals(0, int0);
  }

  @Test
  public void test23()  throws Throwable  {
      SimpleElement simpleElement0 = new SimpleElement();
      String string0 = simpleElement0.getValueOfChild("", true);
      assertNull(string0);
  }

  @Test
  public void test24()  throws Throwable  {
      SimpleElement simpleElement0 = new SimpleElement();
      SimpleElement simpleElement1 = simpleElement0.createChild("", (-1520));
      assertNotNull(simpleElement1);
      assertEquals(" -1520", simpleElement1.toString());
      
      String string0 = simpleElement0.getValueOfChild("", true);
      assertNotNull(string0);
      assertEquals("-1520", string0);
  }

  @Test
  public void test25()  throws Throwable  {
      SimpleElement simpleElement0 = new SimpleElement("~]%HOr\"UGGHd/!g");
      // Undeclared exception!
      try {
        simpleElement0.getTimeValueOfChild("~]%HOr\"UGGHd/!g", false);
        fail("Expecting exception: RuntimeException");
      } catch(RuntimeException e) {
        /*
         * missing child ~]%HOr\"UGGHd/!g
         */
      }
  }

  @Test
  public void test26()  throws Throwable  {
      SimpleElement simpleElement0 = new SimpleElement();
      long long0 = simpleElement0.getTimeValueOfChild("", true);
      assertEquals(0L, long0);
  }

  @Test
  public void test27()  throws Throwable  {
      FoodList foodList0 = new FoodList();
      SimpleElement simpleElement0 = foodList0.createSerializationElement();
      SimpleElement simpleElement1 = simpleElement0.createChild("8kGO.RiHzc<EH8GU", (-740L));
      assertEquals("8kGO.RiHzc<EH8GU -740", simpleElement1.toString());
      assertNotNull(simpleElement1);
      
      Integer integer0 = simpleElement0.getObjectIntValueOfChild("8kGO.RiHzc<EH8GU");
      assertEquals((-740), (int)integer0);
      assertEquals("foods", simpleElement0.toString());
  }

  @Test
  public void test28()  throws Throwable  {
      Budget budget0 = new Budget();
      SimpleElement simpleElement0 = budget0.createSerializationElement();
      assertNotNull(simpleElement0);
      
      simpleElement0.getObjectIntValueOfChild("");
      assertEquals("budget", simpleElement0.toString());
  }

  @Test
  public void test29()  throws Throwable  {
      SimpleElement simpleElement0 = new SimpleElement("description", "description");
      assertNotNull(simpleElement0);
      
      SimpleElement simpleElement1 = simpleElement0.query("description");
      assertEquals("description description", simpleElement0.toString());
      assertNull(simpleElement1);
  }

  @Test
  public void test30()  throws Throwable  {
      SimpleElement simpleElement0 = new SimpleElement();
      SimpleElement simpleElement1 = simpleElement0.createChild("min", "Description");
      assertNotNull(simpleElement1);
      
      SimpleElement simpleElement2 = simpleElement0.query("min");
      assertNotNull(simpleElement2);
      assertNotSame(simpleElement0, simpleElement1);
      assertEquals("min Description", simpleElement2.toString());
  }

  @Test
  public void test31()  throws Throwable  {
      SimpleElement simpleElement0 = new SimpleElement((String) null, (String) null);
      simpleElement0.removeChild((SimpleElement) null);
      assertEquals(0.0, simpleElement0.getDoubleValue(), 0.01D);
  }
}
