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
public class MethodReflectionCriteria_ESTest extends MethodReflectionCriteria_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetResultsReturningListWhereIsEmptyIsFalseAndListWhereSizeIsPositive0() throws Throwable  {
      // Given
      Class<Object> classUnderTest = Object.class;
      SearchType searchType = SearchType.DOESNOTEQUAL;
      MethodReflectionCriteria methodReflectionCriteria = new MethodReflectionCriteria(classUnderTest, "8EY#=;eJPd", searchType);
      
      // When
      List<Method> results = methodReflectionCriteria.getResults();
      
      // Then
      assertEquals(9, results.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetResultsReturningListWhereIsEmptyIsTrueAndListWhereSizeIsZero0() throws Throwable  {
      // Given: A Method class and a search type argument (CONTAINS)
      Class<Method> arg0 = Method.class;
      SearchType arg2 = SearchType.CONTAINS;
      
      // When: Creating a MethodReflectionCriteria object with the given arguments
      MethodReflectionCriteria methodReflectionCriteria = new MethodReflectionCriteria(arg0, "*", arg2);
      
      // Then: The results list should be empty
      List<Method> results = methodReflectionCriteria.getResults();
      assertTrue(results.isEmpty());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetResultsReturningListWhereIsEmptyIsFalseAndListWhereSizeIsPositive1() throws Throwable  {
      // Given: a MethodReflectionCriteria object with a search type of CONTAINS
      Class<Object> arg0 = Object.class;
      SearchType arg2 = SearchType.CONTAINS;
      MethodReflectionCriteria methodReflectionCriteria = new MethodReflectionCriteria(arg0, "notify", arg2);
      
      // When: the getResults() method is called on the MethodReflectionCriteria object
      List<Method> results = methodReflectionCriteria.getResults();
      
      // Then: the size of the result list should be 2
      assertEquals(2, results.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetResultsReturningListWhereIsEmptyIsTrueAndListWhereSizeIsZero1() throws Throwable  {
      // Given
      Class<Object> type = Object.class;
      SearchType searchType = SearchType.EQUALS;
      MethodReflectionCriteria methodReflectionCriteria = new MethodReflectionCriteria(type, "HuqO}sml53kieTy$Jip", searchType);
      
      // When
      List<Method> results = methodReflectionCriteria.getResults();
      
      // Then
      assertEquals(0, results.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetResultsReturningListWhereIsEmptyIsFalseAndListWhereSizeIsPositive2() throws Throwable  {
      // Given
      Class<Method> arg0 = Method.class;
      SearchType arg2 = SearchType.DOESNOTEQUAL;
      MethodReflectionCriteria methodReflectionCriteria = new MethodReflectionCriteria(arg0, "@*", arg2);
      
      // When
      List<Method> results = methodReflectionCriteria.getResults();
      
      // Then
      assertEquals(43, results.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetResultsReturningListWhereIsEmptyIsFalseAndListWhereSizeIsPositive3() throws Throwable  {
      // Given a Method object and a SearchType of EQUALS
      Class<Method> method = Method.class;
      SearchType searchType = SearchType.EQUALS;
      
      // When the MethodReflectionCriteria is created with the given parameters
      MethodReflectionCriteria methodReflectionCriteria = new MethodReflectionCriteria(method, "@*", searchType);
      
      // Then the getResults() method should return a non-empty list of methods
      List<Method> results = methodReflectionCriteria.getResults();
      assertFalse(results.isEmpty());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetResultsReturningListWhereIsEmptyIsTrueAndListWhereSizeIsZero2() throws Throwable  {
      // Given a method class and a search string "@*"
      Class<Method> methodClass = Method.class;
      String searchString = "@*";
      
      // When the search type is set to CONTAINS
      SearchType searchType = SearchType.CONTAINS;
      
      // And we create a new MethodReflectionCriteria with these parameters
      MethodReflectionCriteria methodReflectionCriteria = new MethodReflectionCriteria(methodClass, searchString, searchType);
      
      // Then the getResults() method should return an empty list
      List<Method> results = methodReflectionCriteria.getResults();
      assertEquals(0, results.size());
  }
}
