/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.event;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.Suspender;
import com.lts.event.CallbackListenerHelper;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class CallbackListenerHelperEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      CallbackListenerHelper callbackListenerHelper0 = new CallbackListenerHelper();
      Suspender suspender0 = new Suspender();
      callbackListenerHelper0.notifyListener((Object) suspender0, 0, (Object) "[]");
  }
}
