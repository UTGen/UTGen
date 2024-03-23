/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.caloriecount.ui.gatherwin;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.caloriecount.data.frequent.FrequentFood;
import com.lts.caloriecount.ui.gatherwin.FrequentFoodListAdaptor;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class FrequentFoodListAdaptorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      FrequentFoodListAdaptor frequentFoodListAdaptor0 = new FrequentFoodListAdaptor();
      FrequentFood frequentFood0 = frequentFoodListAdaptor0.remove(1);
      assertNull(frequentFood0);
  }

  @Test
  public void test1()  throws Throwable  {
      FrequentFoodListAdaptor frequentFoodListAdaptor0 = new FrequentFoodListAdaptor();
      int int0 = frequentFoodListAdaptor0.indexOf((Object) "compression");
      assertEquals(0, int0);
  }

  @Test
  public void test2()  throws Throwable  {
      FrequentFoodListAdaptor frequentFoodListAdaptor0 = new FrequentFoodListAdaptor();
      boolean boolean0 = frequentFoodListAdaptor0.add((FrequentFood) null);
      assertEquals(true, boolean0);
  }

  @Test
  public void test3()  throws Throwable  {
      FrequentFoodListAdaptor frequentFoodListAdaptor0 = new FrequentFoodListAdaptor();
      FrequentFood frequentFood0 = frequentFoodListAdaptor0.set((-1975), (FrequentFood) null);
      assertNull(frequentFood0);
  }

  @Test
  public void test4()  throws Throwable  {
      FrequentFoodListAdaptor frequentFoodListAdaptor0 = new FrequentFoodListAdaptor();
      frequentFoodListAdaptor0.clear();
      assertEquals("{}", frequentFoodListAdaptor0.toString());
  }

  @Test
  public void test5()  throws Throwable  {
      FrequentFoodListAdaptor frequentFoodListAdaptor0 = new FrequentFoodListAdaptor();
      FrequentFood frequentFood0 = frequentFoodListAdaptor0.get(11);
      assertNull(frequentFood0);
  }

  @Test
  public void test6()  throws Throwable  {
      FrequentFoodListAdaptor frequentFoodListAdaptor0 = new FrequentFoodListAdaptor();
      boolean boolean0 = frequentFoodListAdaptor0.contains((Object) null);
      assertEquals(false, boolean0);
  }
}