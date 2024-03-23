/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.exception;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.exception.DefaultExceptionHandler;
import com.lts.exception.DefaultExceptionHandlerFactory;
import com.lts.exception.ExceptionHandler;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class DefaultExceptionHandlerFactoryEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DefaultExceptionHandlerFactory defaultExceptionHandlerFactory0 = new DefaultExceptionHandlerFactory();
      DefaultExceptionHandler defaultExceptionHandler0 = (DefaultExceptionHandler)defaultExceptionHandlerFactory0.getExceptionHandler();
      defaultExceptionHandlerFactory0.setExceptionHandler((ExceptionHandler) defaultExceptionHandler0);
  }

  @Test
  public void test1()  throws Throwable  {
      DefaultExceptionHandler defaultExceptionHandler0 = (DefaultExceptionHandler)ExceptionHandler.getHandler();
      assertNotNull(defaultExceptionHandler0);
  }

  @Test
  public void test2()  throws Throwable  {
      DefaultExceptionHandlerFactory defaultExceptionHandlerFactory0 = new DefaultExceptionHandlerFactory();
      defaultExceptionHandlerFactory0.getExceptionHandler();
      defaultExceptionHandlerFactory0.initializeExceptionHandler();
  }
}
