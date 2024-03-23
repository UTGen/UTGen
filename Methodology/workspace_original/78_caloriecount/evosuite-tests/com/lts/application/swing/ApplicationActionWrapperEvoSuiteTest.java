/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.application.swing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.application.swing.ApplicationActionWrapper;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ApplicationActionWrapperEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ApplicationActionWrapper applicationActionWrapper0 = new ApplicationActionWrapper((ActionListener) null);
      ActionEvent actionEvent0 = new ActionEvent((Object) "ShortDescription", (-2029), "ShortDescription");
      // Undeclared exception!
      try {
        applicationActionWrapper0.actionPerformed(actionEvent0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
