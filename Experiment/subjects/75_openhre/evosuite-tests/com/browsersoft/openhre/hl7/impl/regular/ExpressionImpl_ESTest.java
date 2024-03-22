/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Thu Mar 21 06:56:34 GMT 2024
 */

package com.browsersoft.openhre.hl7.impl.regular;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import com.browsersoft.openhre.hl7.api.regular.ExpressionElementMapper;
import com.browsersoft.openhre.hl7.api.regular.ExpressionPart;
import com.browsersoft.openhre.hl7.impl.regular.ExpressionElementMapperImpl;
import com.browsersoft.openhre.hl7.impl.regular.ExpressionImpl;
import com.browsersoft.openhre.hl7.impl.regular.ExpressionPartImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ExpressionImpl_ESTest extends ExpressionImpl_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSizeReturningPositive() throws Throwable  {
      // This test case checks the size of the "ExpressionImpl" object after it is created using the "readFromStringForDebug" method with a string argument of "Y1iH6]@4".
      ExpressionImpl expressionImpl = new ExpressionImpl();
      expressionImpl.readFromStringForDebug("Y1iH6]@4");
      int expectedSize = 3;
      assertEquals(expectedSize, expressionImpl.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetNumberOfElementTypesReturningPositive() throws Throwable  {
      // No Comments were added
      ExpressionImpl expressionImpl = new ExpressionImpl();
      expressionImpl.readFromStringForDebug("}.T@{ t");
      int numberOfElementTypes = expressionImpl.getNumberOfElementTypes();
      assertEquals(3, expressionImpl.size());
      assertEquals(1, numberOfElementTypes);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetNumberOfElementTypes() throws Throwable  {
      // Create an instance of ExpressionImpl and set the number of element types to -1128
      ExpressionImpl expressionImpl = new ExpressionImpl();
      expressionImpl.setNumberOfElementTypes(-1128);
      
      // Verify that the number of element types has been set correctly
      int numberOfElementTypes = expressionImpl.getNumberOfElementTypes();
      assertEquals(-1128, numberOfElementTypes);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetItemReturningExpressionPartWhereGetTypeIsPositive() throws Throwable  {
      // Given a new ExpressionImpl object
      ExpressionImpl expression = new ExpressionImpl();
      
      // When we add an item to it
      ExpressionPartImpl argument = new ExpressionPartImpl();
      argument.setType(1234567890);
      expression.addItem(argument);
      
      // Then the added item should be the same as the argument
      ExpressionPart item = expression.getItem(0);
      assertSame(item, argument);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetItemReturningExpressionPartWhereGetTypeIsNegative() throws Throwable  {
      // No Comments were added
      ExpressionImpl expressionImpl = new ExpressionImpl();
      ExpressionPartImpl arg0 = new ExpressionPartImpl();
      arg0.setType((-1128));
      expressionImpl.addItem(arg0);
      ExpressionPart item = expressionImpl.getItem(0);
      assertEquals(0, item.getElementID());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAddItem() throws Throwable  {
      // Create a new instance of the ExpressionImpl class
      ExpressionImpl expressionImpl = new ExpressionImpl();
      
      // Add an item to the expression
      ExpressionPartImpl arg0 = new ExpressionPartImpl();
      expressionImpl.addItem(arg0);
      
      // Retrieve the item from the expression using its index
      ExpressionPart item = expressionImpl.getItem(0);
      
      // Assert that the type of the retrieved item is equal to 0
      assertEquals(0, item.getType());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetItemReturningExpressionPartWhereGetElementIDIsNegative() throws Throwable  {
      // Given an instance of ExpressionImpl containing a single item
      ExpressionImpl expression = new ExpressionImpl();
      ExpressionPartImpl arg0 = new ExpressionPartImpl();
      arg0.setElementID(-3248);
      expression.addItem(arg0);
      
      // When we call getItem with an index of 0
      ExpressionPart item = expression.getItem(0);
      
      // Then the returned item has the same element ID as the one added to the expression
      assertEquals(-3248, item.getElementID());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetItemReturningExpressionPartWhereGetElementIDIsPositive() throws Throwable  {
      // rollbacked to evosuite
      ExpressionImpl expressionImpl = new ExpressionImpl();
      expressionImpl.readFromStringForDebug("Nn?V`e8(\":@kW^gEDUH");
      expressionImpl.getItem(3);
      assertEquals(7, expressionImpl.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSizeReturningZero() throws Throwable  {
      // Given an empty ExpressionImpl object
      ExpressionImpl expressionImpl = new ExpressionImpl();
      
      // When we call the size() method on it
      int size = expressionImpl.size();
      
      // Then the result is 0, as expected
      assertEquals(0, size);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testToStringTakingNoArgumentsReturningNonEmptyString() throws Throwable  {
      // Test that the readFromStringForDebug method is able to correctly read and parse an input string
      ExpressionImpl expressionImpl = new ExpressionImpl();
      String inputString = "ELEMENT 20";
      expressionImpl.readFromStringForDebug(inputString);
      assertEquals(7, expressionImpl.size()); // Assert that the size of the parsed input is correct
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testToStringTakingNoArgumentsReturningEmptyString() throws Throwable  {
      // Create a new instance of ExpressionImpl
      ExpressionImpl expressionImpl = new ExpressionImpl();
      
      // Call the toString method on the expressionImpl object and store the result in a string variable
      String string = expressionImpl.toString();
      
      // Assert that the resulting string is empty
      assertEquals("", string);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadFromStringForDebugAndToStringTakingExpressionElementMapper0() throws Throwable  {
      // Given an ExpressionImpl object and an ExpressionElementMapperImpl object
      ExpressionImpl expressionImpl = new ExpressionImpl();
      ExpressionElementMapperImpl arg0 = new ExpressionElementMapperImpl();
      
      // When we read a string into the ExpressionImpl object for debugging purposes
      expressionImpl.readFromStringForDebug("Y1iH6]@4");
      
      // Then we expect the ExpressionImpl object to have 2 element types after reading from the string
      assertEquals(2, expressionImpl.getNumberOfElementTypes());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testToStringTakingExpressionElementMapperWithNull() throws Throwable  {
      // Arrange
      ExpressionImpl expressionImpl = new ExpressionImpl();
      
      // Act
      expressionImpl.readFromStringForDebug("}");
      String output = expressionImpl.toString((ExpressionElementMapper) null);
      int size = expressionImpl.size();
      
      // Assert
      assertEquals(1, size);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadFromStringForDebugAndToStringTakingExpressionElementMapper1() throws Throwable  {
      // Create a new instance of the ExpressionImpl class
      ExpressionImpl expressionImpl = new ExpressionImpl();
      
      // Read the string "A{lLY" into the expressionImpl using the readFromStringForDebug method
      expressionImpl.readFromStringForDebug("A{lLY");
      
      // Create a new instance of the ExpressionElementMapperImpl class and pass it as an argument to the toString method
      ExpressionElementMapperImpl arg0 = new ExpressionElementMapperImpl();
      String result = expressionImpl.toString((ExpressionElementMapper) arg0);
      
      // Assert that the size of the expression is 4
      assertEquals(4, expressionImpl.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadFromStringForDebugAndToStringTakingExpressionElementMapper2() throws Throwable  {
      // Given: we have an instance of ExpressionImpl and a string representing the expression to be read from
      ExpressionImpl expressionImpl = new ExpressionImpl();
      String expressionString = "[";
      
      // When: we call the readFromStringForDebug method with the string argument
      expressionImpl.readFromStringForDebug(expressionString);
      
      // Then: the instance of ExpressionImpl is updated with the parsed expression
      assertEquals(1, expressionImpl.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadFromStringForDebugAndRemoveItem() throws Throwable  {
      // Given an instance of the ExpressionImpl class with a string value "MAX_VALUE"
      ExpressionImpl expression = new ExpressionImpl();
      expression.readFromStringForDebug("MAX_VALUE");
      
      // When we call the removeItem method with argument 0
      expression.removeItem(0);
      
      // Then the number of element types in the expression should be 8
      assertEquals(8, expression.getNumberOfElementTypes());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRemoveItem() throws Throwable  {
      // rollbacked to evosuite
      ExpressionImpl expressionImpl = new ExpressionImpl();
      expressionImpl.removeItem(0);
      assertEquals(0, expressionImpl.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRemoveItemWithNegative() throws Throwable  {
      // No Comments were added
      ExpressionImpl expressionImpl = new ExpressionImpl();
      expressionImpl.removeItem((-601));
      assertEquals(0, expressionImpl.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAddItemWithNull() throws Throwable  {
      // Create a new ExpressionImpl object
      ExpressionImpl expression = new ExpressionImpl();
      
      // Create two new ExpressionPartImpl objects
      ExpressionPartImpl arg0 = new ExpressionPartImpl();
      ExpressionPartImpl arg1 = new ExpressionPartImpl();
      
      // Read a string into the ExpressionImpl object for debugging purposes
      expression.readFromStringForDebug("Y1iH6]@4");
      
      // Add the first ExpressionPartImpl object to the ExpressionImpl object
      expression.addItem(arg0);
      
      // Add the second ExpressionPartImpl object to the ExpressionImpl object
      expression.addItem(arg1);
      
      // Add a null value as the sixth item in the ExpressionImpl object
      expression.addItem((ExpressionPart) null);
      
      // Set the sixth item of the ExpressionImpl object to null
      expression.setItem(5, (ExpressionPart) null);
      
      // Assert that the number of element types in the ExpressionImpl object is 2
      assertEquals(2, expression.getNumberOfElementTypes());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetItem() throws Throwable  {
      // Given: an empty ExpressionImpl object and a value of 5 for the item index
      ExpressionImpl expressionImpl = new ExpressionImpl();
      int itemIndex = 5;
      
      // When: the setItem method is called with null as the value for the element at the specified index
      expressionImpl.setItem(itemIndex, (ExpressionPart) null);
      
      // Then: the number of element types should be 0
      assertEquals(0, expressionImpl.getNumberOfElementTypes());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetItemWithNegative() throws Throwable  {
      // Given a new ExpressionImpl object is created and its item is set to -908 with a null ExpressionPart
      ExpressionImpl expressionImpl = new ExpressionImpl();
      expressionImpl.setItem(-908, (ExpressionPart)null);
      
      // When the number of element types is retrieved using getNumberOfElementTypes()
      int numberOfElementTypes = expressionImpl.getNumberOfElementTypes();
      
      // Then the result should be 0 as there are no element types in the ExpressionImpl object
      assertEquals(0, numberOfElementTypes);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetItemReturningNull() throws Throwable  {
      // Given: We have an instance of the ExpressionImpl class
      ExpressionImpl expression = new ExpressionImpl();
      
      // When: We call the getItem() method with the parameter 5
      ExpressionPart item = expression.getItem(5);
      
      // Then: The returned value should be null
      assertNull(item);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetItemWithNegative() throws Throwable  {
      // Given
      ExpressionImpl expressionImpl = new ExpressionImpl();
      int nonExistentItemId = -908;
      
      // When
      ExpressionPart item = expressionImpl.getItem(nonExistentItemId);
      
      // Then
      assertNull(item);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testClearAll() throws Throwable  {
      // Given an empty ExpressionImpl instance
      ExpressionImpl expression = new ExpressionImpl();
      
      // When we call clearAll() on the instance
      expression.clearAll();
      
      // Then the size of the instance should be 0
      assertEquals(0, expression.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetNumberOfElementTypesReturningZero() throws Throwable  {
      // Given a new ExpressionImpl instance
      ExpressionImpl expression = new ExpressionImpl();
      
      // When we call the getNumberOfElementTypes method on the expression
      int numberOfElementTypes = expression.getNumberOfElementTypes();
      
      // Then we expect the result to be 0, as there are no element types in the expression yet
      assertEquals(0, numberOfElementTypes);
  }
}