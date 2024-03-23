/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.util.ImprovedRandom;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ImprovedRandomEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ImprovedRandom improvedRandom0 = new ImprovedRandom();
      ImprovedRandom.getInstance();
      int int0 = improvedRandom0.nextInt(1417);
      assertEquals(648, int0);
  }

  @Test
  public void test1()  throws Throwable  {
      ImprovedRandom improvedRandom0 = new ImprovedRandom((long) 1417);
      assertEquals(0.46253756178172883, improvedRandom0.nextGaussian(), 0.01D);
  }

  @Test
  public void test2()  throws Throwable  {
      ImprovedRandom improvedRandom0 = ImprovedRandom.getInstance();
      ImprovedRandom improvedRandom1 = ImprovedRandom.getInstance((-328L));
      assertEquals(1331771670, improvedRandom1.nextInt());
      
      long long0 = improvedRandom0.nextLong((-328L));
      assertEquals(1906025941, improvedRandom0.nextInt());
      assertEquals((-328L), long0);
  }

  @Test
  public void test3()  throws Throwable  {
      ImprovedRandom improvedRandom0 = ImprovedRandom.getInstance((-328L));
      assertNotNull(improvedRandom0);
      assertEquals(true, improvedRandom0.nextBoolean());
  }
}
