/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.util.MapUtil;
import java.util.Map;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class MapUtilEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      MapUtil mapUtil0 = new MapUtil();
      assertNotNull(mapUtil0);
  }

  @Test
  public void test1()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      // Undeclared exception!
      try {
        MapUtil.buildStringToIntMap(objectArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      Map<Object, Object> map0 = MapUtil.buildMap(objectArray0);
      assertEquals(false, map0.isEmpty());
      assertNotNull(map0);
  }

  @Test
  public void test3()  throws Throwable  {
      Object[][] objectArray0 = new Object[47][5];
      Map<Object, Object> map0 = MapUtil.buildMap(objectArray0);
      assertNotNull(map0);
      assertEquals(1, map0.size());
  }

  @Test
  public void test4()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      Map<Object, Object> map0 = MapUtil.buildReversedMap(objectArray0);
      assertNotNull(map0);
      assertEquals(1, map0.size());
  }
}
