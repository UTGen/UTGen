/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Thu Mar 21 08:59:42 GMT 2024
 */

package org.sourceforge.ifx.basetypes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.sourceforge.ifx.basetypes.IFXBase64Binary;
import org.sourceforge.ifx.basetypes.IFXObject;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class IFXObject_ESTest extends IFXObject_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesIFXObjectAndCallsEquals0() throws Throwable  {
      // Given
      IFXObject iFXObject = new IFXObject();
      IFXBase64Binary arg0 = new IFXBase64Binary();
      
      // When
      boolean equals = iFXObject.equals(arg0);
      
      // Then
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testToString0() throws Throwable  {
      // Create an instance of the IFXBase64Binary class
      IFXBase64Binary iFXBase64Binary = new IFXBase64Binary();
      
      // Set the string value to an empty string
      iFXBase64Binary.setString("");
      
      // Convert the IFXBase64Binary object to a String
      String string = iFXBase64Binary.toString();
      
      // Assert that the resulting string is as expected,
      // including the error message from the IFXObject class
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testToString1() throws Throwable  {
      IFXBase64Binary iFXBase64Binary = new IFXBase64Binary();
      iFXBase64Binary.setString("abcdefghijklmnopqrstuvwxyz");
      String string = iFXBase64Binary.toString();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesIFXObjectAndCallsToString() throws Throwable  {
      // Given an instance of the IFXObject class
      IFXObject iFXObject = new IFXObject();
      
      // When the toString method is called on the instance
      String string = iFXObject.toString();
      
      // Then the string representation of the object should be as expected
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesIFXObjectAndCallsEquals1() throws Throwable  {
      // Create a new instance of IFXObject
      IFXObject iFXObject = new IFXObject();
      
      // Create a new object to pass as an argument to the equals method
      Object arg0 = new Object();
      
      // Invoke the equals method on iFXObject with arg0 as its argument
      boolean equals = iFXObject.equals(arg0);
      
      // Assert that the result of the equals method is false
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testToString2() throws Throwable  {
      // Given: we have an instance of IFXBase64Binary class
      IFXBase64Binary iFXBase64Binary = new IFXBase64Binary();
      
      // When: we call the toString() method on the instance
      String string = iFXBase64Binary.toString();
      
      // Then: we expect a specific output
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsReturningTrue() throws Throwable  {
      // Given: A new instance of an object
      IFXObject arg0 = new IFXObject();
      
      // When: The equals method is called with the same instance
      boolean equals = arg0.equals(arg0);
      
      // Then: The result should be true, indicating that the objects are equal
      assertTrue(equals);
  }
}
