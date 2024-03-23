/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.event;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.event.ActionListenerHelper;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ActionListenerHelperEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ActionListenerHelper actionListenerHelper0 = new ActionListenerHelper();
      actionListenerHelper0.fireAction((Object) actionListenerHelper0);
  }

  @Test
  public void test1()  throws Throwable  {
      ActionListenerHelper actionListenerHelper0 = new ActionListenerHelper();
      actionListenerHelper0.addListener((Object) actionListenerHelper0);
      // Undeclared exception!
      try {
        actionListenerHelper0.fire((Object) "job-name");
        fail("Expecting exception: ClassCastException");
      } catch(ClassCastException e) {
        /*
         * java.lang.String cannot be cast to java.awt.event.ActionEvent
         */
      }
  }
}