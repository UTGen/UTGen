/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.util.StringIntMap;
import java.util.Map;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class StringIntMapEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      StringIntMap stringIntMap0 = new StringIntMap();
      Map<Object, Object> map0 = stringIntMap0.getStringToIntMap();
      assertNull(map0);
  }

  @Test
  public void test1()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      StringIntMap stringIntMap0 = new StringIntMap(objectArray0);
      String string0 = stringIntMap0.intToString((-1));
      assertNull(string0);
  }

  @Test
  public void test2()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      StringIntMap stringIntMap0 = new StringIntMap(objectArray0);
      assertNotNull(stringIntMap0);
      
      Map<Object, Object> map0 = stringIntMap0.getIntToStringMap();
      assertNotNull(map0);
      assertEquals(1, map0.size());
  }

  @Test
  public void test3()  throws Throwable  {
      Object[] objectArray0 = new Object[10];
      objectArray0[8] = (Object) "";
      StringIntMap stringIntMap0 = new StringIntMap(objectArray0);
      assertNotNull(stringIntMap0);
  }

  @Test
  public void test4()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      StringIntMap stringIntMap0 = new StringIntMap(objectArray0);
      assertNotNull(stringIntMap0);
      
      Object[] objectArray1 = new Object[2];
      objectArray1[0] = (Object) (-1);
      objectArray1[1] = (Object) "^~asrRYuk]qt:j@Hsm";
      stringIntMap0.initialize(objectArray1);
      int int0 = stringIntMap0.stringToInt("^~asrRYuk]qt:j@Hsm");
      assertEquals((-1), int0);
  }

  @Test
  public void test5()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      StringIntMap stringIntMap0 = new StringIntMap(objectArray0);
      assertNotNull(stringIntMap0);
      
      int int0 = stringIntMap0.stringToInt("^~asrRYuk]qt:j@Hsm");
      assertEquals((-1), int0);
  }
}