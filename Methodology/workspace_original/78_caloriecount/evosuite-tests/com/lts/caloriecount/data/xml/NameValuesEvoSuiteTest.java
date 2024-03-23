/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.caloriecount.data.xml;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.caloriecount.data.xml.NameValues;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class NameValuesEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      NameValues nameValues0 = new NameValues("", "");
      assertNotNull(nameValues0);
  }

  @Test
  public void test1()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      NameValues nameValues0 = new NameValues((Map<String, Object>) hashMap0);
      LinkedList<List<String>> linkedList0 = new LinkedList<List<String>>();
      hashMap0.put("", (Object) linkedList0);
      String string0 = nameValues0.getValue("");
      assertNull(string0);
  }

  @Test
  public void test2()  throws Throwable  {
      NameValues nameValues0 = new NameValues();
      Collection<String> collection0 = nameValues0.getNames();
      assertEquals(true, collection0.isEmpty());
  }

  @Test
  public void test3()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      NameValues nameValues0 = new NameValues((Map<String, Object>) hashMap0);
      String string0 = nameValues0.getValue("");
      assertNull(string0);
  }

  @Test
  public void test4()  throws Throwable  {
      NameValues nameValues0 = new NameValues();
      nameValues0.addValue("l", "l");
      String string0 = nameValues0.getValue("l");
      assertEquals("l", string0);
  }

  @Test
  public void test5()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      NameValues nameValues0 = new NameValues((Map<String, Object>) hashMap0);
      hashMap0.put("", (Object) hashMap0);
      nameValues0.addValue("", "");
      assertEquals("{=(this Map)}", hashMap0.toString());
  }

  @Test
  public void test6()  throws Throwable  {
      NameValues nameValues0 = new NameValues();
      nameValues0.addValue("l", "l");
      nameValues0.addValue("l", "l");
  }

  @Test
  public void test7()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      NameValues nameValues0 = new NameValues((Map<String, Object>) hashMap0);
      LinkedList<List<String>> linkedList0 = new LinkedList<List<String>>();
      hashMap0.put("", (Object) linkedList0);
      nameValues0.addValue("", (String) null);
      assertEquals("{=[null]}", hashMap0.toString());
  }
}
