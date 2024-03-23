/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.swing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.swing.TextWindow;
import java.awt.HeadlessException;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TextWindowEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try {
        TextWindow.showText("");
        fail("Expecting exception: HeadlessException");
      } catch(HeadlessException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      TextWindow.showException("Z", (Throwable) null);
  }

  @Test
  public void test2()  throws Throwable  {
      TextWindow.showException((Throwable) null);
  }
}
