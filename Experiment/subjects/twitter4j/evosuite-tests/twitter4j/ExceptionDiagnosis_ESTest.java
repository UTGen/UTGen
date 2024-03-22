/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Wed Mar 20 14:59:20 GMT 2024
 */

package twitter4j;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;
import twitter4j.ExceptionDiagnosis;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ExceptionDiagnosis_ESTest extends ExceptionDiagnosis_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetStackLineHashReturningPositive() throws Throwable  {
      // Test that the stack line hash is calculated correctly for a given exception and stack trace
      MockThrowable arg0 = new MockThrowable();
      String[] arg1 = new String[6];
      arg1[0] = "9hWN$";
      arg1[1] = "00000000-00000000sun.reflect.GeneratedConstructorAccessor38";
      arg1[2] = "sun.reflect.";
      arg1[3] = "s";
      arg1[4] = "nk1xA4T;w(p12Id!#o";
      arg1[5] = "";
      ExceptionDiagnosis exceptionDiagnosis = new ExceptionDiagnosis(arg0, arg1);
      int stackLineHash = exceptionDiagnosis.getStackLineHash();
      assertEquals(1281931231, stackLineHash);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetStackLineHashReturningNegative() throws Throwable  {
      // Given: The ExceptionDiagnosis class has been instantiated with a MockThrowable and an array of strings
      // When: The getStackLineHash() method is called on the exceptionDiagnosis object
      // Then: The stackLineHash variable should be set to a value that represents the hash code for the provided stack trace
      MockThrowable arg0 = new MockThrowable();
      String[] arg1 = new String[4];
      arg1[0] = "EW.l.2Jn";
      arg1[1] = ", lineNumberHash=";
      arg1[2] = "56MMf";
      arg1[3] = "sun.reflect.Gen";
      ExceptionDiagnosis exceptionDiagnosis = new ExceptionDiagnosis(arg0, arg1);
      int stackLineHash = exceptionDiagnosis.getStackLineHash();
      assertEquals((-675335713), stackLineHash);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetLineNumberHashReturningNegative() throws Throwable  {
      // Given a MockThrowable and an array of strings
      MockThrowable mockThrowable = new MockThrowable();
      String[] strings = new String[2];
      strings[0] = "";
      
      // When we create an ExceptionDiagnosis with the MockThrowable and the array of strings
      ExceptionDiagnosis exceptionDiagnosis = new ExceptionDiagnosis(mockThrowable, strings);
      
      // Then the lineNumberHash should be -993
      int expectedLineNumberHash = -993;
      int actualLineNumberHash = exceptionDiagnosis.getLineNumberHash();
      assertEquals(expectedLineNumberHash, actualLineNumberHash);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAsHexString() throws Throwable  {
      // Given: An instance of MockThrowable with a null message
      MockThrowable arg0 = new MockThrowable((String) null);
      
      // When: A new ExceptionDiagnosis is created with the MockThrowable
      ExceptionDiagnosis exceptionDiagnosis = new ExceptionDiagnosis(arg0);
      
      // Then: The asHexString method should return a hexadecimal string representing the error code
      String asHexString = exceptionDiagnosis.asHexString();
      assertEquals("00000000-00000000", asHexString);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEquals() throws Throwable  {
      // Given: An instance of a MockThrowable class with a null string as its parameter
      MockThrowable arg0 = new MockThrowable((String) null);
      ExceptionDiagnosis exceptionDiagnosis = new ExceptionDiagnosis(arg0);
      
      // When: The equals method is called on the ExceptionDiagnosis object with a null object as its argument
      boolean equals = exceptionDiagnosis.equals((Object) null);
      
      // Then: The result of the equals method should be false, since a null object cannot equal an instance of an ExceptionDiagnosis class
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesExceptionDiagnosisTakingThrowable() throws Throwable  {
      // rollbacked to evosuite
      MockThrowable arg1 = new MockThrowable();
      MockThrowable arg0 = new MockThrowable("A more descriptive and representative error message", arg1);
      ExceptionDiagnosis exceptionDiagnosis = new ExceptionDiagnosis(arg0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetStackLineHashReturningZero() throws Throwable  {
      // rollbacked to evosuite
      MockThrowable arg0 = new MockThrowable();
      ExceptionDiagnosis exceptionDiagnosis = new ExceptionDiagnosis(arg0);
      int stackLineHash = exceptionDiagnosis.getStackLineHash();
      assertEquals(0, stackLineHash);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetLineNumberHashReturningZero() throws Throwable  {
      // Given an exception with a non-zero line number hash
      MockThrowable arg0 = new MockThrowable();
      ExceptionDiagnosis exceptionDiagnosis = new ExceptionDiagnosis(arg0);
      int lineNumberHash = exceptionDiagnosis.getLineNumberHash();
      
      // When the line number hash is converted to a string
      String lineNumberHashString = Integer.toString(lineNumberHash);
      
      // Then the resulting string should be an empty string
      assertEquals("", lineNumberHashString);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testToString() throws Throwable  {
      // Given: An ExceptionDiagnosis object with a MockThrowable argument
      MockThrowable mockThrowable = new MockThrowable();
      ExceptionDiagnosis exceptionDiagnosis = new ExceptionDiagnosis(mockThrowable);
      
      // When: Calling the toString() method on the ExceptionDiagnosis object
      String string = exceptionDiagnosis.toString();
      
      // Then: The resulting string should be a summary of the ExceptionDiagnosis object's properties
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHashCode() throws Throwable  {
      // Given: A Throwable object arg0
      Throwable arg0 = new MockThrowable();
      
      // When: Creating an ExceptionDiagnosis object with the Throwable object as argument
      ExceptionDiagnosis exceptionDiagnosis = new ExceptionDiagnosis(arg0);
      
      // Then: The hashCode method is called on the ExceptionDiagnosis object
      int result = exceptionDiagnosis.hashCode();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetLineNumberHashAsHex() throws Throwable  {
      // rollbacked to evosuite
      MockThrowable arg0 = new MockThrowable();
      ExceptionDiagnosis exceptionDiagnosis = new ExceptionDiagnosis(arg0);
      String lineNumberHashAsHex = exceptionDiagnosis.getLineNumberHashAsHex();
      assertEquals("00000000", lineNumberHashAsHex);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetStackLineHashAsHex() throws Throwable  {
      // No Comments were added
      MockThrowable arg0 = new MockThrowable();
      String[] arg1 = new String[5];
      arg1[0] = "j7u\"IWR)<h";
      arg1[1] = "/E}QJ# 6=`TJ6'f--oM";
      arg1[2] = "5q(l7<32}X/:[p5Q";
      arg1[3] = "";
      ExceptionDiagnosis exceptionDiagnosis = new ExceptionDiagnosis(arg0, arg1);
      String stackLineHashAsHex = exceptionDiagnosis.getStackLineHashAsHex();
      assertEquals("4c68b7df", stackLineHashAsHex);
  }
}