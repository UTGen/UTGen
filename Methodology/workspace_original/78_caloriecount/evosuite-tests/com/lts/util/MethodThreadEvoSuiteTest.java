/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.util.MethodThread;
import java.lang.reflect.Method;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class MethodThreadEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Object[] objectArray0 = new Object[12];
      MethodThread methodThread0 = new MethodThread((Object) null, (Method) null, objectArray0);
      methodThread0.run();
  }

  @Test
  public void test1()  throws Throwable  {
      Object[] objectArray0 = new Object[12];
      MethodThread methodThread0 = new MethodThread((Object) null, (Method) null, objectArray0);
      String string0 = methodThread0.toString();
      assertNotNull(string0);
  }
}