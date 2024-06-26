/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.swing.tree.mvc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.swing.tree.mvc.ApplicationTreeListenerHelper;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ApplicationTreeListenerHelperEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ApplicationTreeListenerHelper applicationTreeListenerHelper0 = new ApplicationTreeListenerHelper();
      // Undeclared exception!
      try {
        applicationTreeListenerHelper0.notifyListener((Object) null, 0, (Object) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      ApplicationTreeListenerHelper applicationTreeListenerHelper0 = new ApplicationTreeListenerHelper();
      // Undeclared exception!
      try {
        applicationTreeListenerHelper0.notifyListener((Object) null, 87, (Object) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      ApplicationTreeListenerHelper applicationTreeListenerHelper0 = new ApplicationTreeListenerHelper();
      // Undeclared exception!
      try {
        applicationTreeListenerHelper0.notifyListener((Object) null, 1, (Object) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      ApplicationTreeListenerHelper applicationTreeListenerHelper0 = new ApplicationTreeListenerHelper();
      // Undeclared exception!
      try {
        applicationTreeListenerHelper0.notifyListener((Object) null, 2, (Object) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
