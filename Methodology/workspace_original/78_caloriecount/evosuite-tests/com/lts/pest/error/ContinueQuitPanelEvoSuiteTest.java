/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.pest.error;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.LTSException;
import com.lts.pest.error.ContinueQuitPanel;
import java.awt.Window;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ContinueQuitPanelEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ContinueQuitPanel continueQuitPanel0 = null;
      try {
        continueQuitPanel0 = new ContinueQuitPanel("23z>t8CifnW3N[5^qI", (Throwable) null, (Window) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try {
        ContinueQuitPanel.loadMessages();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
