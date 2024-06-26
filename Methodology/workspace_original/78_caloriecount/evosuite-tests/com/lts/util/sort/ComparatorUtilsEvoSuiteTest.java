/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.util.sort;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.util.sort.ComparatorUtils;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ComparatorUtilsEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      int int0 = ComparatorUtils.inverse((-1), 1096);
      assertEquals(1, int0);
  }

  @Test
  public void test1()  throws Throwable  {
      int int0 = ComparatorUtils.inverse((-1406L), (-1406L));
      assertEquals(0, int0);
  }

  @Test
  public void test2()  throws Throwable  {
      ComparatorUtils comparatorUtils0 = new ComparatorUtils();
      assertNotNull(comparatorUtils0);
  }

  @Test
  public void test3()  throws Throwable  {
      int int0 = ComparatorUtils.compare((long) (-51), (-2008L));
      assertEquals(1, int0);
  }

  @Test
  public void test4()  throws Throwable  {
      int int0 = ComparatorUtils.compare((long) (-1457), 0L);
      assertEquals((-1), int0);
  }

  @Test
  public void test5()  throws Throwable  {
      int int0 = ComparatorUtils.compare(1, (-1769));
      assertEquals(1, int0);
  }

  @Test
  public void test6()  throws Throwable  {
      int int0 = ComparatorUtils.compare(1096, 1096);
      assertEquals(0, int0);
  }
}
