/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.application.international;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.application.ApplicationException;
import com.lts.application.international.DefaultMessageFormatter;
import java.util.LinkedList;
import java.util.List;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class DefaultMessageFormatterEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DefaultMessageFormatter defaultMessageFormatter0 = new DefaultMessageFormatter();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      defaultMessageFormatter0.initializeResourceBundle((List) linkedList0, (List) linkedList0);
      assertEquals("[]", linkedList0.toString());
  }
}
