/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.util.ListUtils;
import java.util.LinkedList;
import java.util.List;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ListUtilsEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ListUtils listUtils0 = new ListUtils();
      assertNotNull(listUtils0);
  }

  @Test
  public void test1()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ListUtils.addAll((List) linkedList0, (Object[]) null);
      assertEquals(true, linkedList0.isEmpty());
  }

  @Test
  public void test2()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Object[] objectArray0 = new Object[3];
      ListUtils.addAll((List) linkedList0, objectArray0);
      assertEquals(3, linkedList0.size());
      assertEquals("[null, null, null]", linkedList0.toString());
  }

  @Test
  public void test3()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Object[] objectArray0 = linkedList0.toArray();
      ListUtils.addAll((List) linkedList0, objectArray0);
      assertEquals(true, linkedList0.isEmpty());
  }

  @Test
  public void test4()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ListUtils.addAllStrings((List) linkedList0, (Object[]) null);
      assertEquals(true, linkedList0.isEmpty());
  }

  @Test
  public void test5()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Object[] objectArray0 = linkedList0.toArray();
      ListUtils.addAllStrings((List) linkedList0, objectArray0);
      assertEquals(true, linkedList0.isEmpty());
  }

  @Test
  public void test6()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Object[] objectArray0 = new Object[3];
      Object object0 = new Object();
      objectArray0[0] = object0;
      objectArray0[1] = object0;
      objectArray0[2] = object0;
      ListUtils.addAllStrings((List) linkedList0, objectArray0);
      assertEquals(false, linkedList0.isEmpty());
      assertEquals(3, linkedList0.size());
  }
}