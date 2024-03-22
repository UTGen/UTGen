/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Mon Mar 18 01:09:02 GMT 2024
 */

package net.sourceforge.beanbin.reflect;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import java.lang.reflect.Method;
import java.util.List;
import net.sourceforge.beanbin.query.SearchType;
import net.sourceforge.beanbin.reflect.MethodReflectionCriteria;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MethodReflectionCriteria_Original_ESTest extends MethodReflectionCriteria_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetResultsReturningListWhereIsEmptyIsFalseAndListWhereSizeIsPositive0() throws Throwable  {
      Class<Object> arg0 = Object.class;
      SearchType arg2 = SearchType.DOESNOTEQUAL;
      MethodReflectionCriteria methodReflectionCriteria = new MethodReflectionCriteria(arg0, "8EY#=;eJPd", arg2);
      List<Method> results = methodReflectionCriteria.getResults();
      assertEquals(9, results.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetResultsReturningListWhereIsEmptyIsTrueAndListWhereSizeIsZero0() throws Throwable  {
      SearchType arg2 = SearchType.CONTAINS;
      Class<Method> arg0 = Method.class;
      MethodReflectionCriteria methodReflectionCriteria = new MethodReflectionCriteria(arg0, "*", arg2);
      List<Method> results = methodReflectionCriteria.getResults();
      assertEquals(0, results.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetResultsReturningListWhereIsEmptyIsFalseAndListWhereSizeIsPositive1() throws Throwable  {
      Class<Object> arg0 = Object.class;
      SearchType arg2 = SearchType.CONTAINS;
      MethodReflectionCriteria methodReflectionCriteria = new MethodReflectionCriteria(arg0, "notify", arg2);
      List<Method> results = methodReflectionCriteria.getResults();
      assertEquals(2, results.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetResultsReturningListWhereIsEmptyIsTrueAndListWhereSizeIsZero1() throws Throwable  {
      Class<Object> arg0 = Object.class;
      SearchType arg2 = SearchType.EQUALS;
      MethodReflectionCriteria methodReflectionCriteria = new MethodReflectionCriteria(arg0, "HuqO}sml53kieTy$Jip", arg2);
      List<Method> results = methodReflectionCriteria.getResults();
      assertEquals(0, results.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetResultsReturningListWhereIsEmptyIsFalseAndListWhereSizeIsPositive2() throws Throwable  {
      Class<Method> arg0 = Method.class;
      SearchType arg2 = SearchType.DOESNOTEQUAL;
      MethodReflectionCriteria methodReflectionCriteria = new MethodReflectionCriteria(arg0, "@*", arg2);
      List<Method> results = methodReflectionCriteria.getResults();
      assertEquals(43, results.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetResultsReturningListWhereIsEmptyIsFalseAndListWhereSizeIsPositive3() throws Throwable  {
      Class<Method> arg0 = Method.class;
      SearchType arg2 = SearchType.EQUALS;
      MethodReflectionCriteria methodReflectionCriteria = new MethodReflectionCriteria(arg0, "@*", arg2);
      List<Method> results = methodReflectionCriteria.getResults();
      assertFalse(results.isEmpty());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetResultsReturningListWhereIsEmptyIsTrueAndListWhereSizeIsZero2() throws Throwable  {
      Class<Method> arg0 = Method.class;
      SearchType arg2 = SearchType.CONTAINS;
      MethodReflectionCriteria methodReflectionCriteria = new MethodReflectionCriteria(arg0, "@*", arg2);
      List<Method> results = methodReflectionCriteria.getResults();
      assertTrue(results.isEmpty());
  }
}
