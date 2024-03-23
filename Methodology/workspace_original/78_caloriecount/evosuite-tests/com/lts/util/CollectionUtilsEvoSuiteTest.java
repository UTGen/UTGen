/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.util.CollectionUtils;
import com.lts.util.IdentityHashSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Stack;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class CollectionUtilsEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[2];
      HashMap<Object, Object> hashMap0 = CollectionUtils.toHashMap((Object[]) stringArray0);
      assertNotNull(hashMap0);
      assertEquals(1, hashMap0.size());
  }

  @Test
  public void test1()  throws Throwable  {
      String[] stringArray0 = new String[7];
      HashSet<Object> hashSet0 = CollectionUtils.toHashSet((Object[]) stringArray0);
      assertNotNull(hashSet0);
      assertEquals(false, hashSet0.isEmpty());
  }

  @Test
  public void test2()  throws Throwable  {
      CollectionUtils collectionUtils0 = new CollectionUtils();
      assertNotNull(collectionUtils0);
  }

  @Test
  public void test3()  throws Throwable  {
      String[] stringArray0 = new String[8];
      ArrayList<Object> arrayList0 = CollectionUtils.toArrayList((Object[]) stringArray0);
      assertNotNull(arrayList0);
      assertEquals("[null, null, null, null, null, null, null, null]", arrayList0.toString());
  }

  @Test
  public void test4()  throws Throwable  {
      String[] stringArray0 = new String[4];
      IdentityHashSet identityHashSet0 = CollectionUtils.toIdentityHashSet((Object[]) stringArray0);
      assertNotNull(identityHashSet0);
      
      // Undeclared exception!
      try {
        CollectionUtils.dump((Collection) identityHashSet0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test5()  throws Throwable  {
      String[] stringArray0 = new String[8];
      Properties properties0 = CollectionUtils.buildProperties(stringArray0, (String) null);
      assertEquals(0, properties0.size());
  }

  @Test
  public void test6()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = "null rot";
      stringArray0[1] = "null rot";
      stringArray0[2] = "null rot";
      stringArray0[3] = "null rot";
      stringArray0[4] = "null rot";
      stringArray0[5] = "null rot";
      stringArray0[7] = "G9<^-/C";
      Properties properties0 = CollectionUtils.buildProperties(stringArray0, "G9<^-/C");
      assertNotNull(properties0);
      
      String[] stringArray1 = CollectionUtils.toStringArray(properties0);
      assertNotNull(stringArray1);
      assertEquals("{null rot=null rot}", properties0.toString());
      assertEquals(1, properties0.size());
  }

  @Test
  public void test7()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "'bPDk\"";
      stringArray0[1] = "'bPDk\"";
      Properties properties0 = CollectionUtils.buildProperties(stringArray0);
      assertNotNull(properties0);
      assertEquals(false, properties0.isEmpty());
  }

  @Test
  public void test8()  throws Throwable  {
      Properties properties0 = CollectionUtils.buildProperties((String[][]) null);
      assertEquals("{}", properties0.toString());
  }

  @Test
  public void test9()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "'bPDk\"";
      stringArray0[1] = "'bPDk\"";
      String[][] stringArray1 = new String[10][2];
      stringArray1[0] = stringArray0;
      stringArray1[1] = stringArray0;
      stringArray1[2] = stringArray0;
      stringArray1[3] = stringArray0;
      stringArray1[4] = stringArray0;
      stringArray1[5] = stringArray0;
      stringArray1[6] = stringArray0;
      stringArray1[7] = stringArray0;
      stringArray1[8] = stringArray0;
      stringArray1[9] = stringArray0;
      Properties properties0 = CollectionUtils.buildProperties(stringArray1);
      assertNotNull(properties0);
      
      Enumeration<Object> enumeration0 = properties0.keys();
      assertEquals(true, enumeration0.hasMoreElements());
      
      List<Object> list0 = CollectionUtils.toList(enumeration0);
      assertEquals(false, enumeration0.hasMoreElements());
      assertEquals(1, list0.size());
  }

  @Test
  public void test10()  throws Throwable  {
      String[] stringArray0 = new String[2];
      CollectionUtils.addAll((List) null, stringArray0);
  }

  @Test
  public void test11()  throws Throwable  {
      Stack<String> stack0 = new Stack<String>();
      String[] stringArray0 = new String[14];
      CollectionUtils.addAll((List) stack0, stringArray0);
      String string0 = CollectionUtils.stackToString((Stack) stack0, "! Dd^O{f!t", false);
      assertEquals(20, stack0.capacity());
      assertEquals("null! Dd^O{f!tnull! Dd^O{f!tnull! Dd^O{f!tnull! Dd^O{f!tnull! Dd^O{f!tnull! Dd^O{f!tnull! Dd^O{f!tnull! Dd^O{f!tnull! Dd^O{f!tnull! Dd^O{f!tnull! Dd^O{f!tnull! Dd^O{f!tnull! Dd^O{f!tnull", string0);
  }

  @Test
  public void test12()  throws Throwable  {
      List<Object> list0 = CollectionUtils.buildPropertyNames((String[][]) null);
      assertEquals(0, list0.size());
  }

  @Test
  public void test13()  throws Throwable  {
      Stack<Integer> stack0 = new Stack<Integer>();
      String string0 = CollectionUtils.stackToString((Stack) stack0, (String) null, false);
      assertEquals("", string0);
  }

  @Test
  public void test14()  throws Throwable  {
      Stack<String> stack0 = new Stack<String>();
      stack0.add("wE");
      String string0 = CollectionUtils.stackToString((Stack) stack0, "wE", true);
      assertNotNull(string0);
      assertEquals("wEwE", string0);
  }

  @Test
  public void test15()  throws Throwable  {
      Object[][] objectArray0 = new Object[24][4];
      Map<Object, Object> map0 = CollectionUtils.buildMap(objectArray0);
      assertNotNull(map0);
      assertEquals(1, map0.size());
  }

  @Test
  public void test16()  throws Throwable  {
      Stack<String> stack0 = new Stack<String>();
      CollectionUtils.dump((Collection) stack0);
      assertEquals("[]", stack0.toString());
  }

  @Test
  public void test17()  throws Throwable  {
      CollectionUtils.dump((Collection) null);
  }

  @Test
  public void test18()  throws Throwable  {
      int int0 = CollectionUtils.compareInts(1369, 1369);
      assertEquals(0, int0);
  }

  @Test
  public void test19()  throws Throwable  {
      int int0 = CollectionUtils.compareInts((-15), 846);
      assertEquals((-1), int0);
  }

  @Test
  public void test20()  throws Throwable  {
      int int0 = CollectionUtils.compareInts(15, (-1082));
      assertEquals(1, int0);
  }

  @Test
  public void test21()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      Object[] objectArray0 = new Object[23];
      CollectionUtils.addAll((Collection) linkedList0, objectArray0);
      // Undeclared exception!
      try {
        CollectionUtils.sortDescending((List) linkedList0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test22()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      CollectionUtils.sortDescending((List) linkedList0);
      assertEquals(0, linkedList0.size());
  }

  @Test
  public void test23()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      Object[] objectArray0 = new Object[23];
      objectArray0[0] = (Object) 0;
      CollectionUtils.addAll((Collection) linkedList0, objectArray0);
      // Undeclared exception!
      try {
        CollectionUtils.sortDescending((List) linkedList0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test24()  throws Throwable  {
      String[][] stringArray0 = new String[2][6];
      String[] stringArray1 = new String[3];
      stringArray1[0] = ", is not one of the child nodes of ";
      stringArray0[0] = stringArray1;
      List<Object> list0 = CollectionUtils.buildPropertyNames(stringArray0);
      assertNotNull(list0);
      
      // Undeclared exception!
      try {
        CollectionUtils.sortDescending(list0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
