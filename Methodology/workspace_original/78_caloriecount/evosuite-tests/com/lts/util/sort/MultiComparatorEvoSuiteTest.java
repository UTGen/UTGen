/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.util.sort;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.util.sort.MultiComparator;
import java.lang.reflect.Array;
import java.util.Comparator;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class MultiComparatorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      MultiComparator multiComparator0 = new MultiComparator();
      MultiComparator multiComparator1 = new MultiComparator((Comparator) multiComparator0, (Comparator) null);
      assertNotSame(multiComparator0, multiComparator1);
  }

  @Test
  public void test1()  throws Throwable  {
      MultiComparator multiComparator0 = new MultiComparator();
      MultiComparator multiComparator1 = new MultiComparator((Comparator) multiComparator0, (Comparator) multiComparator0, (Comparator) multiComparator0);
      assertNotNull(multiComparator1);
      
      int int0 = multiComparator1.compare((Object) multiComparator0, (Object) multiComparator0);
      assertEquals(0, int0);
  }

  @Test
  public void test2()  throws Throwable  {
      MultiComparator multiComparator0 = new MultiComparator();
      MultiComparator multiComparator1 = new MultiComparator((Comparator) multiComparator0);
      assertNotSame(multiComparator0, multiComparator1);
  }

  @Test
  public void test3()  throws Throwable  {
      MultiComparator multiComparator0 = new MultiComparator();
      MultiComparator multiComparator1 = new MultiComparator((Comparator) null, (Comparator) multiComparator0, (Comparator) null, (Comparator) multiComparator0);
      assertNotSame(multiComparator1, multiComparator0);
  }

  @Test
  public void test4()  throws Throwable  {
      Comparator<String>[] comparatorArray0 = (Comparator<String>[]) Array.newInstance(Comparator.class, 6);
      MultiComparator multiComparator0 = new MultiComparator(comparatorArray0);
      assertNotNull(multiComparator0);
  }

  @Test
  public void test5()  throws Throwable  {
      MultiComparator multiComparator0 = new MultiComparator();
      Comparator<String>[] comparatorArray0 = (Comparator<String>[]) Array.newInstance(Comparator.class, 6);
      comparatorArray0[5] = (Comparator<String>) multiComparator0;
      multiComparator0.initialize(comparatorArray0);
  }

  @Test
  public void test6()  throws Throwable  {
      MultiComparator multiComparator0 = new MultiComparator();
      int int0 = multiComparator0.compare((Object) multiComparator0, (Object) multiComparator0);
      assertEquals(0, int0);
  }
}