/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.swing.contentpanel;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.swing.contentpanel.OutcomeListenerHelper;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class OutcomeListenerHelperEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      OutcomeListenerHelper outcomeListenerHelper0 = new OutcomeListenerHelper();
      // Undeclared exception!
      try {
        outcomeListenerHelper0.notifyListener((Object) "ToolTipText", 0, (Object) "continuousLayout");
        fail("Expecting exception: ClassCastException");
      } catch(ClassCastException e) {
        /*
         * java.lang.String cannot be cast to com.lts.swing.contentpanel.OutcomeListener
         */
      }
  }
}
