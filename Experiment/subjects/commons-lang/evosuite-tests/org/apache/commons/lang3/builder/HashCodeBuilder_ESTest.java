/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Tue Mar 19 11:06:41 GMT 2024
 */

package org.apache.commons.lang3.builder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedList;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.IDKey;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class HashCodeBuilder_ESTest extends HashCodeBuilder_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testUnregister() throws Throwable  {
      // Test that the HashCodeBuilder can be used to compute a hash code for an object
      // Create a new HashCodeBuilder
      HashCodeBuilder arg0 = new HashCodeBuilder();
      
      // Register the HashCodeBuilder with the unregister method
      HashCodeBuilder.unregister(arg0);
      
      // Assert that the hash code for an object is equal to 17
      assertEquals(17, arg0.toHashCode());
      
      // Assert that the hash code for an object is equal to 17 when built
      assertEquals(17, (int)arg0.build());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReflectionHashCodeTaking1And1ReturningNegativeAndReflectionHashCodeTaking1And10() throws Throwable  {
      // No Comments were added
      int reflectionHashCode = HashCodeBuilder.reflectionHashCode((Object) "tb_4y!.JC4", (String[]) null);
      assertEquals((-1220132505), reflectionHashCode);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReflectionHashCodeTaking1And1ReturningNegativeAndReflectionHashCodeTaking1And11() throws Throwable  {
      // No Comments were added
      int reflectionHashCode = HashCodeBuilder.reflectionHashCode((Object) "Qn=VMg|aoUSk<[(O", true);
      assertEquals((-39354868), reflectionHashCode);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReflectionHashCodeTaking6ArgumentsReturningZero() throws Throwable  {
      // No Comments were added
      HashCodeBuilder arg2 = new HashCodeBuilder();
      Class<Object> arg4 = Object.class;
      String[] arg5 = new String[5];
      int reflectionHashCode = HashCodeBuilder.reflectionHashCode((-1), (-1), (Object) arg2, false, (Class<? super Object>) arg4, arg5);
      assertEquals(0, reflectionHashCode);
      assertEquals(17, arg2.toHashCode());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReflectionHashCodeTaking4ArgumentsReturningNegative() throws Throwable  {
      // Given a negative integer, -1947
      int number = -1947;
      
      // When we use the HashCodeBuilder to calculate the hash code of this number using reflection
      HashCodeBuilder arg2 = new HashCodeBuilder();
      int reflectionHashCode = HashCodeBuilder.reflectionHashCode(number, 7, (Object) arg2, false);
      
      // Then we expect the calculated hash code to be -95370
      assertEquals(-95370, reflectionHashCode);
      
      // And also the build() method of the HashCodeBuilder should return 17
      assertEquals(17, arg2.build());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReflectionHashCodeTaking3ArgumentsReturningZero() throws Throwable  {
      // Given
      HashCodeBuilder arg2 = new HashCodeBuilder();
      
      // When
      int reflectionHashCode = HashCodeBuilder.reflectionHashCode(-1, -1, (Object) arg2);
      
      // Then
      assertEquals(17, (int) arg2.build());
      assertEquals(0, reflectionHashCode);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReflectionHashCodeTaking3ArgumentsReturningPositive() throws Throwable  {
      // Given: a HashCodeBuilder object and an integer value
      HashCodeBuilder arg2 = new HashCodeBuilder();
      int reflectionHashCode = HashCodeBuilder.reflectionHashCode(1, 1, (Object) arg2);
      
      // When: the reflectionHashCode method is called with the object and integer values as arguments
      
      // Then: the returned hash code should be equal to 12
      assertEquals(12, reflectionHashCode);
      
      // And: the toHashCode method of the HashCodeBuilder object should return a different hash code than the one returned by the reflectionHashCode method
      assertNotEquals(reflectionHashCode, arg2.toHashCode());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReflectionHashCodeTaking3ArgumentsReturningNegative() throws Throwable  {
      // No Comments were added
      int reflectionHashCode = HashCodeBuilder.reflectionHashCode((-1081229337), (int) (byte)75, (Object) "n?a#jfs}");
      assertEquals((-882623859), reflectionHashCode);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsRegisteredReturningFalse() throws Throwable  {
      // Arrange
      Integer arg0 = new Integer(0);
      
      // Act
      boolean registered = HashCodeBuilder.isRegistered(arg0);
      
      // Assert
      assertFalse(registered);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testBuildReturningPositive() throws Throwable  {
      // Given
      HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();
      
      // When
      Integer build = hashCodeBuilder.build();
      
      // Then
      assertEquals(17, (int)build);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAppendSuperReturningHashCodeBuilderWhereToHashCodeIsNegative() throws Throwable  {
      // Test that the hash code is calculated correctly for a byte array of length 7.
      byte[] arg0 = new byte[7];
      HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();
      // Append the byte array to the hash code builder.
      hashCodeBuilder.append(arg0);
      // Append the super class's hash code to the builder.
      hashCodeBuilder.appendSuper((-1));
      // Calculate the final hash code from the builder.
      int expectedHashCode = (-779599632);
      // Assert that the calculated hash code is equal to the expected value.
      assertEquals(expectedHashCode, hashCodeBuilder.toHashCode());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAppendTakingBooleanArrayReturningHashCodeBuilderWhereToHashCodeIsZero() throws Throwable  {
      // Initialize a new instance of the HashCodeBuilder class with default values for the hash code and the multiplier.
      HashCodeBuilder hashCodeBuilder = new HashCodeBuilder((-1), (-1));
      
      // Append the superclass's hash code to the current hash code using the appendSuper() method.
      // The value of the "super" parameter is not important for this test, so we pass in a constant value of "-1".
      hashCodeBuilder.appendSuper((-1));
      
      // Append an array of boolean values to the current hash code using the append() method.
      // In this case, we pass in null as the array of boolean values to demonstrate how the method handles null values.
      hashCodeBuilder.append((boolean[]) null);
      
      // Assert that the resulting hash code is 0, which is the expected result for a null array of boolean values.
      assertEquals(0, hashCodeBuilder.toHashCode());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAppendTakingBooleanReturningHashCodeBuilderWhereToHashCodeIsNegative() throws Throwable  {
      // Given: The HashCodeBuilder class is used to generate a unique hash code for an object
      HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();
      
      // When: We append an array of floats and a boolean value to the builder
      float[] arg0 = new float[3];
      arg0[0] = (float) 17;
      arg0[1] = (float) 17;
      HashCodeBuilder append = hashCodeBuilder.append(arg0);
      append.append(true);
      
      // Then: The built hash code should be equal to the expected value
      assertEquals((-1399445503), (int)hashCodeBuilder.build());
      assertEquals((-1399445503), hashCodeBuilder.toHashCode());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAppendTakingLongReturningHashCodeBuilderWhereToHashCodeIsNegative() throws Throwable  {
      // Given: We have a HashCodeBuilder instance named "hashCodeBuilder" and an array of bytes named "arg0".
      HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();
      byte[] arg0 = new byte[7];
      
      // When: We append the array of bytes to the HashCodeBuilder instance.
      HashCodeBuilder append = hashCodeBuilder.append(arg0);
      
      // Then: The resulting HashCodeBuilder instance should contain the concatenation of the hash codes of all elements in the array.
      assertEquals((-779599441), (int)append.build());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAppendTakingIntReturningHashCodeBuilderWhereToHashCodeIsNegative() throws Throwable  {
      // Given a HashCodeBuilder instance with some data
      HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();
      hashCodeBuilder.append((-3082));
      
      // When computing the hash code for the builder
      int hashCode = hashCodeBuilder.toHashCode();
      
      // Then assert that the computed hash code matches the expected value
      assertEquals(2453, hashCode);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAppendTakingFloat() throws Throwable  {
      // Given a HashCodeBuilder object with a float value appended to it
      HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();
      hashCodeBuilder.append((-464.5708F));
      
      // When the toHashCode method is called on the builder
      int result = hashCodeBuilder.toHashCode();
      
      // Then the returned value should be a unique hash code for the float value
      assertEquals((-1008186491), result);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAppendTakingByteReturningHashCodeBuilderWhereToHashCodeIsNegative() throws Throwable  {
      // Given a HashCodeBuilder object with the initial state of 9 and -2443 as the seed value
      HashCodeBuilder hashCodeBuilder = new HashCodeBuilder(9, (-2443));
      
      // When appending a byte value of 8 to the builder
      HashCodeBuilder append = hashCodeBuilder.append((byte)8);
      
      // Then the resulting hash code should be -21979
      int hashCode = append.toHashCode();
      assertEquals((-21979), hashCode);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAppendTakingCharArrayReturningHashCodeBuilderWhereToHashCodeIsNegative() throws Throwable  {
      // Given: A HashCodeBuilder instance is created with a char array of length 8.
      HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();
      char[] arg0 = new char[8];
      
      // When: The HashCodeBuilder appends the char array to it.
      hashCodeBuilder.append(arg0);
      
      // Then: The resulting hash code is -779599631.
      assertEquals((-779599631), (int)hashCodeBuilder.build());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFailsToCreateHashCodeBuilderTaking2ArgumentsThrowsIllegalArgumentException0() throws Throwable  {
      HashCodeBuilder hashCodeBuilder = null;
      try {
      hashCodeBuilder = new HashCodeBuilder(1234, 0);
      fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      //
      // HashCodeBuilder requires an odd initial value
      //
      verifyException("org.apache.commons.lang3.builder.HashCodeBuilder", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReflectionHashCodeTaking6ArgumentsReturningNegative() throws Throwable  {
      // No Comments were added
      Class<Object> arg4 = Object.class;
      String[] arg5 = new String[9];
      int reflectionHashCode = HashCodeBuilder.reflectionHashCode(3, 3, (Object) "4}E+|if<`eB,+,@?WS=", true, (Class<? super Object>) arg4, arg5);
      assertEquals((-556103817), reflectionHashCode);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testToHashCodeReturningPositive() throws Throwable  {
      // Given a HashCodeBuilder with a seed value of 9 and a multiplier of -2443
      HashCodeBuilder hashCodeBuilder = new HashCodeBuilder(9, (-2443));
      
      // When the toHashCode method is called on the builder
      int hashCode = hashCodeBuilder.toHashCode();
      
      // Then the hash code should be 9
      assertEquals(9, hashCode);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAppendTakingLongReturningHashCodeBuilderWhereToHashCodeIsZero() throws Throwable  {
      // Given: A HashCodeBuilder with a seed value of 29 and a multiplier of -1
      HashCodeBuilder hashCodeBuilder = new HashCodeBuilder(29, (-1));
      
      // When: Appending the long value 29 to the builder
      hashCodeBuilder.append((long) 29);
      
      // Then: The resulting hash code should be 0
      assertEquals(0, hashCodeBuilder.toHashCode());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAppendTakingShortArrayReturningHashCodeBuilderWhereToHashCodeIsPositive() throws Throwable  {
      // Given a HashCodeBuilder instance and some input data
      HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();
      short[] inputData = null;
      
      // When the append method is called with the input data
      hashCodeBuilder.append(inputData);
      
      // Then the resulting hash code should be 629
      assertEquals(629, (int)hashCodeBuilder.build());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAppendTakingShortArrayReturningHashCodeBuilderWhereToHashCodeIsNegative() throws Throwable  {
      // Given
      HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();
      short[] inputArray = new short[7];
      
      // When
      hashCodeBuilder.append(inputArray);
      
      // Then
      assertEquals((-1065792035), hashCodeBuilder.toHashCode());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAppendTakingObjectArray() throws Throwable  {
      // Setup
      HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();
      
      // Action
      hashCodeBuilder.append((Object[]) null);
      
      // Assertion
      assertEquals(629, (int)hashCodeBuilder.build());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAppendTakingObject() throws Throwable  {
      // Arrange
      HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();
      
      // Act
      hashCodeBuilder.append((Object) null);
      
      // Assert
      assertEquals(629, hashCodeBuilder.toHashCode());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAppendTakingLongArrayWithNull() throws Throwable  {
      // Create a new HashCodeBuilder instance with the specified seed values
      HashCodeBuilder hashCodeBuilder = new HashCodeBuilder((-1), (-1));
      
      // Append a null long array to the builder
      hashCodeBuilder.append((long[]) null);
      
      // Calculate the resulting hash code from the builder
      int expectedHashCode = 1;
      assertEquals(expectedHashCode, hashCodeBuilder.toHashCode());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAppendTakingShortReturningHashCodeBuilderWhereToHashCodeIsZero() throws Throwable  {
      // Given: A new instance of HashCodeBuilder with a seed of (-1) and a multiplier of (-1)
      HashCodeBuilder hashCodeBuilder = new HashCodeBuilder((-1), (-1));
      
      // When: Append an array of longs to the builder
      long[] arg0 = new long[3];
      HashCodeBuilder append = hashCodeBuilder.append(arg0);
      
      // Then: The resulting hash code is 0
      assertEquals(0, hashCodeBuilder.toHashCode());
      
      // And: The built hash code is also 0
      assertEquals(0, (int)hashCodeBuilder.build());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAppendTakingIntArray() throws Throwable  {
      // Given a HashCodeBuilder instance with a null array to append
      HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();
      
      // When the array is appended to the builder
      hashCodeBuilder.append((int[]) null);
      
      // Then the resulting hash code should be 629
      assertEquals(629, hashCodeBuilder.toHashCode());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAppendTakingFloatArrayReturningHashCodeBuilderWhereToHashCodeIsPositive() throws Throwable  {
      // Given a HashCodeBuilder instance
      HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();
      
      // When appending a non-null array of floats
      float[] nullArray = (float[]) null;
      hashCodeBuilder.append(nullArray);
      
      // Then the hash code is calculated correctly
      assertEquals(629, (int)hashCodeBuilder.build());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAppendTakingDoubleArrayReturningHashCodeBuilderWhereToHashCodeIsPositive() throws Throwable  {
      // Given: A HashCodeBuilder object is created with the default seed value of -1 and -1
      HashCodeBuilder hashCodeBuilder = new HashCodeBuilder((-1), (-1));
      
      // When: The append method is called with a null double array as input
      hashCodeBuilder.append((double[]) null);
      
      // Then: The build method should return 1, indicating that the hash code was successfully calculated for the null double array
      assertEquals(1, (int)hashCodeBuilder.build());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAppendTakingCharArrayReturningHashCodeBuilderWhereToHashCodeIsPositive() throws Throwable  {
      // Create a new HashCodeBuilder instance
      HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();
      
      // Append a null char array to the HashCodeBuilder
      hashCodeBuilder.append((char[]) null);
      
      // Calculate the hash code of the appended object using toHashCode() method
      int calculatedHashCode = hashCodeBuilder.toHashCode();
      
      // Expect the calculated hash code to be equal to 629
      assertEquals(calculatedHashCode, 629);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAppendTakingChar() throws Throwable  {
      //Given: A HashCodeBuilder object and some byte data
      HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();
      byte[] arg0 = new byte[7];
      
      //When: The byte data is appended to the HashCodeBuilder
      hashCodeBuilder.append(arg0);
      hashCodeBuilder.append('V');
      
      //Then: A hash code is built and compared against an expected value
      assertEquals((-779599545), (int)hashCodeBuilder.build());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAppendTakingByteArray() throws Throwable  {
      // Given: A HashCodeBuilder with the seed values of -1 and -1
      HashCodeBuilder hashCodeBuilder = new HashCodeBuilder((-1), (-1));
      
      // When: The method append(byte[]) is called with a null byte array
      hashCodeBuilder.append((byte[]) null);
      
      // Then: The return value should be 1, which represents the seed values of -1 and -1
      assertEquals(1, (int) hashCodeBuilder.build());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAppendTakingBooleanArrayReturningHashCodeBuilderWhereToHashCodeIsPositive() throws Throwable  {
      // Given a boolean array with 8 elements
      boolean[] arr = new boolean[8];
      
      // When the HashCodeBuilder is initialized with a seed value and a multiplier
      HashCodeBuilder hashCodeBuilder = new HashCodeBuilder(3517, 1255);
      
      // And the array is appended to the HashCodeBuilder
      hashCodeBuilder.append(arr);
      
      // Then the resulting hash code should be equal to the expected value
      assertEquals(1359747869, hashCodeBuilder.toHashCode());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAppendTakingBooleanReturningHashCodeBuilderWhereToHashCodeIsPositive() throws Throwable  {
      // Given: a HashCodeBuilder instance is created with the default seed value of 17
      HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();
      
      // When: the append method is called with the boolean value "false"
      hashCodeBuilder.append(false);
      
      // Then: the resulting hash code should be equal to 630
      assertEquals(630, (int)hashCodeBuilder.build());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFailsToCreateHashCodeBuilderTaking2ArgumentsThrowsIllegalArgumentException1() throws Throwable  {
      // No Comments were added
      HashCodeBuilder hashCodeBuilder = null;
      try {
        hashCodeBuilder = new HashCodeBuilder((-473), 2930);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // HashCodeBuilder requires an odd multiplier
         //
         verifyException("org.apache.commons.lang3.builder.HashCodeBuilder", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReflectionHashCodeTaking6ArgumentsReturningPositive() throws Throwable  {
      LinkedList<String> myList = new LinkedList<>();
      IDKey myIDKey = new IDKey(myList);
      Class<IDKey> idKeyClass = IDKey.class;
      int reflectionHashCode = HashCodeBuilder.reflectionHashCode(23533, 23533, myIDKey, true, (Class<? super IDKey>) idKeyClass, (String[]) null);
      assertEquals(1693925572, reflectionHashCode);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReflectionHashCodeTaking6ArgumentsThrowsIllegalArgumentException() throws Throwable  {
      // Test that a NullPointerException is thrown when passing null as the object to build a hash code for
      Class<Object> arg4 = Object.class;
      String[] arg5 = new String[14];
      try {
      HashCodeBuilder.reflectionHashCode(2156, 2156, (Object) null, false, (Class<? super Object>) arg4, arg5);
      fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
      // This exception is thrown because the object to build a hash code for must not be null
      verifyException("org.apache.commons.lang3.builder.HashCodeBuilder", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReflectionHashCodeTaking1And1ReturningPositiveAndReflectionHashCodeTaking1And10() throws Throwable  {
      // No Comments were added
      LinkedList<String> arg1 = new LinkedList<String>();
      int reflectionHashCode = HashCodeBuilder.reflectionHashCode((Object) arg1, (Collection<String>) arg1);
      assertEquals(17, reflectionHashCode);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReflectionHashCodeTaking1And1WithNonEmptyArray() throws Throwable  {
      // Given an object array with one element
      Object[] objectArray = new Object[5];
      objectArray[1] = (Object) 'v';
      
      // When the reflectionHashCode method is called with the object and a string argument
      String[] arg1 = new String[4];
      int reflectionHashCode = HashCodeBuilder.reflectionHashCode(objectArray[1], arg1);
      
      // Then the returned hash code should be equal to 634
      assertEquals(634, reflectionHashCode);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRegister() throws Throwable  {
      // Given: An object that has been registered with the HashCodeBuilder
      Object arg0 = new Object();
      HashCodeBuilder.register(arg0);
      
      // When: The reflectionHashCode method is called on the registered object
      int reflectionHashCode = HashCodeBuilder.reflectionHashCode(arg0, (String[]) null);
      
      // Then: The result should be 17, as specified in the test
      assertEquals(17, reflectionHashCode);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsRegisteredReturningTrue() throws Throwable  {
      // No Comments were added
      boolean registered = HashCodeBuilder.isRegistered((Object) null);
      assertFalse(registered);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReflectionHashCodeTaking4ArgumentsReturningPositive() throws Throwable  {
      // No Comments were added
      int reflectionHashCode = HashCodeBuilder.reflectionHashCode(123456789, 7, (Object) "This is a string", false);
      assertEquals(1478541955, reflectionHashCode);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAppendTakingIntReturningHashCodeBuilderWhereToHashCodeIsPositive() throws Throwable  {
      // Given: a HashCodeBuilder object with some appended values
      HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();
      hashCodeBuilder.append(1234);
      
      // When: the toHashCode method is called on the builder
      int result = hashCodeBuilder.toHashCode();
      
      // Then: the result should be a valid hash code value
      assertEquals(1863, result);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReflectionHashCodeTaking1And1ReturningPositiveAndReflectionHashCodeTaking1And11() throws Throwable  {
      // Create a string that is unique and descriptive for testing purposes
      String testString = "A unique and descriptive test string";
      int reflectionHashCode = HashCodeBuilder.reflectionHashCode((Object) testString, true);
      assertEquals(1517641945, reflectionHashCode);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAppendTakingByteReturningHashCodeBuilderWhereToHashCodeIsZero() throws Throwable  {
      // Given: A HashCodeBuilder instance with a seed value of -1 and a multiplier value of -1
      HashCodeBuilder hashCodeBuilder = new HashCodeBuilder((-1), (-1));
      
      // When: Appending a short value of 1 to the builder
      HashCodeBuilder append = hashCodeBuilder.append((short) 1);
      
      // Then: The resulting HashCodeBuilder instance has a hash code of 0
      assertEquals(0, (int) append.build());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAppendTakingDouble() throws Throwable  {
      // No Comments were added
      HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();
      hashCodeBuilder.append((double) (short) (-35));
      assertEquals((-1069448587), (int)hashCodeBuilder.build());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHashCode() throws Throwable  {
      // Given a HashCodeBuilder object
      HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();
      
      // When the hashCode method is called on the builder
      int hashCode = hashCodeBuilder.hashCode();
      
      // Then the returned hash code should be 17
      assertEquals(17, hashCode);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReflectionHashCodeTaking1And1ReturningNegativeAndReflectionHashCodeTaking1And12() throws Throwable  {
      // Test to verify the correctness of the hash code calculation for a LinkedList of Strings
      LinkedList<String> arg1 = new LinkedList<>();
      int reflectionHashCode = HashCodeBuilder.reflectionHashCode((Object) "6h#M+ft7/LeV", (Collection<String>) arg1);
      // Asserting that the calculated hash code is equal to the expected value
      assertEquals(-714307977, reflectionHashCode);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAppendTakingDoubleArrayReturningHashCodeBuilderWhereToHashCodeIsZero() throws Throwable  {
      // This test ensures that the hash code of a specific object is computed correctly.
      // The object under test has 4 fields, each with a value of -1.
      HashCodeBuilder hashCodeBuilder = new HashCodeBuilder((-1), (-1));
      double[] arg0 = new double[4];
      arg0[0] = (double) (-1);
      arg0[1] = (double) (-1);
      arg0[2] = (double) (-1);
      arg0[3] = (double) (-1);
      hashCodeBuilder.append(arg0);
      assertEquals(0, (int) hashCodeBuilder.build());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testBuildReturningNegative() throws Throwable  {
      // Creating a new HashCodeBuilder instance with a seed value of -1 and a multiplier value of -1
      HashCodeBuilder hashCodeBuilder = new HashCodeBuilder((-1), (-1));
      
      // Calling the build method to generate the hash code
      Integer build = hashCodeBuilder.build();
      
      // Asserting that the generated hash code is equal to -1
      assertEquals(-1, (int)build);
  }
}
