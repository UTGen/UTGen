/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.cmdline;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.cmdline.Argspec;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ArgspecEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      Argspec argspec0 = new Argspec((String) null, (String) null, boolean0, boolean0);
      assertEquals(true, argspec0.myAcceptsArgument);
      assertEquals(true, argspec0.myRequiresArgument);
  }

  @Test
  public void test1()  throws Throwable  {
      Argspec argspec0 = new Argspec("", "", (Boolean) null, (Boolean) null);
      assertEquals(false, argspec0.myAcceptsArgument);
      assertEquals(false, argspec0.myRequiresArgument);
      assertNotNull(argspec0);
  }
}
