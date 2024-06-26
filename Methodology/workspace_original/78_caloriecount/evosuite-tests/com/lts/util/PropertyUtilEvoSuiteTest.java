/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.util.PropertyUtil;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class PropertyUtilEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      PropertyUtil propertyUtil0 = new PropertyUtil();
      assertNotNull(propertyUtil0);
  }

  @Test
  public void test1()  throws Throwable  {
      Properties properties0 = new Properties();
      PropertyUtil.dump((Map) properties0);
      assertEquals(0, properties0.size());
  }

  @Test
  public void test2()  throws Throwable  {
      PropertyUtil.dump();
  }

  @Test
  public void test3()  throws Throwable  {
      Properties properties0 = new Properties();
      properties0.put((Object) "", (Object) "");
      Properties properties1 = PropertyUtil.combine(properties0, properties0);
      assertNotNull(properties1);
      assertNotSame(properties0, properties1);
  }

  @Test
  public void test4()  throws Throwable  {
      Properties properties0 = new Properties();
      properties0.put((Object) "", (Object) "");
      String[][] stringArray0 = PropertyUtil.toSortedList(properties0);
      assertNotNull(stringArray0);
  }

  @Test
  public void test5()  throws Throwable  {
      Properties properties0 = new Properties();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      properties0.put((Object) "", (Object) properties0);
      Properties properties1 = PropertyUtil.filter(properties0, (Set) linkedHashSet0);
      assertNotNull(properties1);
      assertEquals("{}", properties1.toString());
  }

  @Test
  public void test6()  throws Throwable  {
      Properties properties0 = new Properties();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      properties0.put((Object) "", (Object) properties0);
      linkedHashSet0.add("");
      // Undeclared exception!
      try {
        PropertyUtil.filter(properties0, (Set) linkedHashSet0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test7()  throws Throwable  {
      Properties properties0 = new Properties();
      properties0.put((Object) "", (Object) "");
      Boolean boolean0 = PropertyUtil.getBoolean("", properties0);
      assertEquals(false, (boolean)boolean0);
  }

  @Test
  public void test8()  throws Throwable  {
      Properties properties0 = new Properties();
      PropertyUtil.getBoolean("public, no-arg constructor is not available for class ", properties0);
  }
}
