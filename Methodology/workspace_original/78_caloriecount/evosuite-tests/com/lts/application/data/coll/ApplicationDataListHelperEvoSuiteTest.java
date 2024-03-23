/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.application.data.coll;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.application.data.ApplicationData;
import com.lts.application.data.coll.ADCAdaptor;
import com.lts.application.data.coll.ApplicationDataListHelper;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ApplicationDataListHelperEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ApplicationDataListHelper applicationDataListHelper0 = new ApplicationDataListHelper();
      applicationDataListHelper0.fireAllChanged();
  }

  @Test
  public void test1()  throws Throwable  {
      ApplicationDataListHelper applicationDataListHelper0 = new ApplicationDataListHelper();
      applicationDataListHelper0.fireUpdate((ApplicationData) null);
  }

  @Test
  public void test2()  throws Throwable  {
      ApplicationDataListHelper applicationDataListHelper0 = new ApplicationDataListHelper();
      ADCAdaptor aDCAdaptor0 = new ADCAdaptor();
      applicationDataListHelper0.addListener((Object) "[]");
      // Undeclared exception!
      try {
        applicationDataListHelper0.fireElementAdded((ApplicationData) aDCAdaptor0);
        fail("Expecting exception: ClassCastException");
      } catch(ClassCastException e) {
        /*
         * java.lang.String cannot be cast to com.lts.application.data.coll.ADCListener
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      ApplicationDataListHelper applicationDataListHelper0 = new ApplicationDataListHelper();
      ADCAdaptor aDCAdaptor0 = new ADCAdaptor();
      applicationDataListHelper0.fireDelete((ApplicationData) aDCAdaptor0);
      assertEquals(false, aDCAdaptor0.isDirty());
  }
}
