/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.util.notifyinglist.sorted;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.util.notifyinglist.sorted.IndirectComparator;
import java.util.Comparator;
import java.util.List;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class IndirectComparatorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      IndirectComparator indirectComparator0 = new IndirectComparator();
      // Undeclared exception!
      try {
        indirectComparator0.getValue(0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      IndirectComparator indirectComparator0 = new IndirectComparator((Comparator) null, (List) null);
      assertNotNull(indirectComparator0);
  }

  @Test
  public void test2()  throws Throwable  {
      IndirectComparator indirectComparator0 = new IndirectComparator();
      Integer integer0 = new Integer(1);
      // Undeclared exception!
      try {
        indirectComparator0.compare((Object) "1", (Object) integer0);
        fail("Expecting exception: ClassCastException");
      } catch(ClassCastException e) {
        /*
         * java.lang.String cannot be cast to java.lang.Integer
         */
      }
  }
}