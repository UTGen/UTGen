/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.beans;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.beans.IntrospectorUtils;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class IntrospectorUtilsEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      IntrospectorUtils introspectorUtils0 = new IntrospectorUtils();
      assertNotNull(introspectorUtils0);
  }
}
