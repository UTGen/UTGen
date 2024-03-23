/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.util.notifyinglist;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.util.notifyinglist.NotifyingListHelper;
import java.awt.AWTKeyStroke;
import java.util.Set;
import javax.swing.JProgressBar;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class NotifyingListHelperEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      NotifyingListHelper notifyingListHelper0 = new NotifyingListHelper();
      notifyingListHelper0.fireAllChanged();
  }

  @Test
  public void test1()  throws Throwable  {
      NotifyingListHelper notifyingListHelper0 = new NotifyingListHelper();
      notifyingListHelper0.fireInsert(0, (Object) ".label.");
  }

  @Test
  public void test2()  throws Throwable  {
      NotifyingListHelper notifyingListHelper0 = new NotifyingListHelper();
      JProgressBar jProgressBar0 = new JProgressBar();
      Set<AWTKeyStroke> set0 = jProgressBar0.getFocusTraversalKeys(0);
      notifyingListHelper0.setListeners(set0);
      // Undeclared exception!
      try {
        notifyingListHelper0.fireUpdate(0, (Object) null);
        fail("Expecting exception: ClassCastException");
      } catch(ClassCastException e) {
        /*
         * java.awt.AWTKeyStroke cannot be cast to com.lts.util.notifyinglist.NotifyingListListener
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      NotifyingListHelper notifyingListHelper0 = new NotifyingListHelper();
      notifyingListHelper0.fireDelete(0, (Object) "0-1150");
  }
}
