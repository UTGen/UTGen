/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.util.system;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.util.system.SystemUtils;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class SystemUtilsEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      SystemUtils.setNativeLibrarySearchPath(".");
      String[] stringArray0 = new String[8];
      stringArray0[0] = ".";
      SystemUtils.appendDirectoryContaining("lib", stringArray0);
  }

  @Test
  public void test1()  throws Throwable  {
      SystemUtils systemUtils0 = new SystemUtils();
      assertEquals("lib", systemUtils0.getNativeLibrarySearchPath());
  }

  @Test
  public void test2()  throws Throwable  {
      String[] stringArray0 = new String[8];
      stringArray0[0] = ".";
      SystemUtils.appendDirectoryContaining("lib", stringArray0);
  }

  @Test
  public void test3()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "gNHAN-";
      // Undeclared exception!
      try {
        SystemUtils.appendDirectoryContaining("gNHAN-", stringArray0);
        fail("Expecting exception: RuntimeException");
      } catch(RuntimeException e) {
        /*
         * Could not find gNHAN-
         */
      }
  }
}
