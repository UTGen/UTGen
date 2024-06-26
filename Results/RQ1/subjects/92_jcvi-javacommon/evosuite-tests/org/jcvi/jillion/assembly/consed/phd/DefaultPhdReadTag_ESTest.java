/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Thu Mar 21 10:39:48 GMT 2024
 */

package org.jcvi.jillion.assembly.consed.phd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.jcvi.jillion.assembly.consed.phd.DefaultPhdReadTag;
import org.jcvi.jillion.core.Range;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DefaultPhdReadTag_ESTest extends DefaultPhdReadTag_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetTypeReturningNull() throws Throwable  {
      // Arrange
      Range arg2 = Range.of((-1L), (-1L));
      MockDate arg3 = new MockDate(2436, 31, 727, (-1409), (-1409));
      DefaultPhdReadTag defaultPhdReadTag = new DefaultPhdReadTag((String) null, (String) null, arg2, arg3, "ZI^=sQC9\"-", "");
      
      // Act
      String type = defaultPhdReadTag.getType();
      String comment = defaultPhdReadTag.getComment();
      String freeFormData = defaultPhdReadTag.getFreeFormData();
      
      // Assert
      assertEquals("ZI^=sQC9\"-", comment);
      assertEquals("", freeFormData);
      assertNull(type);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetTypeReturningEmptyString() throws Throwable  {
      // Given
      Range arg2 = Range.of(0L, 0L);
      MockDate arg3 = new MockDate(0, (-534), (-534), (-1244), (-534));
      DefaultPhdReadTag defaultPhdReadTag = new DefaultPhdReadTag("", "", arg2, arg3, "SPACE_BASED", "");
      
      // When
      String type = defaultPhdReadTag.getType();
      
      // Then
      assertEquals("", defaultPhdReadTag.getFreeFormData());
      assertEquals("", defaultPhdReadTag.getSource());
      assertEquals("SPACE_BASED", defaultPhdReadTag.getComment());
      assertEquals("", type);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetSourceReturningNull() throws Throwable  {
      // Set up the test data
      Range arg2 = Range.of((-1L), (-1L));
      MockDate arg3 = new MockDate(2436, 31, 727, (-1409), (-1409));
      DefaultPhdReadTag defaultPhdReadTag = new DefaultPhdReadTag((String) null, (String) null, arg2, arg3, "ZI^MbsQC{9-", "");
      
      // Test the getSource() method
      String source = defaultPhdReadTag.getSource();
      assertNull(source); // The source should be null since it is not set in the DefaultPhdReadTag constructor
      
      // Test the getComment() and getFreeFormData() methods
      assertEquals("ZI^MbsQC{9-", defaultPhdReadTag.getComment()); // The comment should be "ZI^MbsQC{9-" since it was set in the DefaultPhdReadTag constructor
      assertEquals("", defaultPhdReadTag.getFreeFormData()); // The free form data should be "" since it was not set in the DefaultPhdReadTag constructor
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetSourceReturningNonEmptyString() throws Throwable  {
      // Given a DefaultPhdReadTag object with non-empty type and source
      MockDate arg3 = new MockDate(21L);
      DefaultPhdReadTag defaultPhdReadTag = new DefaultPhdReadTag("", ":Y9k_:WXKk}Ljm,", (Range) null, arg3, (String) null, "@'BQZ?!eM~{{y\"");
      
      // When the getSource method is called
      String source = defaultPhdReadTag.getSource();
      
      // Then the source should be returned);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetFreeFormDataReturningNull() throws Throwable  {
      // Given
      Range arg2 = Range.of(0L);
      MockDate arg3 = new MockDate(0L);
      DefaultPhdReadTag defaultPhdReadTag = new DefaultPhdReadTag("BJ", "", arg2, arg3, (String) null, (String) null);
      
      // When
      String freeFormData = defaultPhdReadTag.getFreeFormData();
      
      // Then
      assertEquals("BJ", defaultPhdReadTag.getType());
      assertNull(freeFormData);
      assertEquals("", defaultPhdReadTag.getSource());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetFreeFormDataReturningNonEmptyString() throws Throwable  {
      // Given
      Range arg2 = Range.of((-1L), (-1L));
      MockDate arg3 = new MockDate(2436, 31, 727, (-1409), (-1409));
      DefaultPhdReadTag defaultPhdReadTag = new DefaultPhdReadTag("", "", arg2, arg3, "", "Range coordinates %d, %d are not valid %s coordinates");
      
      // When
      String freeFormData = defaultPhdReadTag.getFreeFormData();
      
      // Then
      assertEquals("Range coordinates %d, %d are not valid %s coordinates", freeFormData);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetDateReturningNull() throws Throwable  {
      // Given a DefaultPhdReadTag object with some initial values
      Range arg2 = Range.of(884L);
      DefaultPhdReadTag defaultPhdReadTag = new DefaultPhdReadTag("org.jcvi.jillion.assembly.consed.phd.DefaultPhdReadTag", "org.jcvi.jillion.assembly.consed.phd.DefaultPhdReadTag", arg2, (Date) null, "U", "ZI^MbsQC{9-");
      
      // When we call the getters for each property
      String type = defaultPhdReadTag.getType();
      String source = defaultPhdReadTag.getSource();
      Date date = defaultPhdReadTag.getDate();
      String comment = defaultPhdReadTag.getComment();
      String freeFormData = defaultPhdReadTag.getFreeFormData();
      
      // Then we expect the values returned by the getters to match the initial values set in the constructor
      assertEquals("org.jcvi.jillion.assembly.consed.phd.DefaultPhdReadTag", type);
      assertEquals("org.jcvi.jillion.assembly.consed.phd.DefaultPhdReadTag", source);
      assertNull(date);
      assertEquals("U", comment);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetCommentReturningNonEmptyString() throws Throwable  {
      // rollbacked to evosuite
      Range.CoordinateSystem arg0 = Range.CoordinateSystem.ZERO_BASED;
      Range arg2 = Range.of(arg0, 3391L, 3391L);
      MockDate arg3 = new MockDate((-5270), (-1752992913), (-534), (-1752992913), 31);
      DefaultPhdReadTag defaultPhdReadTag = new DefaultPhdReadTag("?", "", arg2, arg3, "j6_<", "ZI^MbsQC{9-");
      String comment = defaultPhdReadTag.getComment();
      assertEquals("ZI^MbsQC{9-", defaultPhdReadTag.getFreeFormData());
      assertEquals("j6_<", comment);
      assertEquals("?", defaultPhdReadTag.getType());
      assertEquals("", defaultPhdReadTag.getSource());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetCommentReturningEmptyString() throws Throwable  {
      // Given a DefaultPhdReadTag with a null comment
      Range arg2 = Range.of((-1L), (-1L));
      MockDate arg3 = new MockDate(2436, 31, 727, (-1409), (-1409));
      DefaultPhdReadTag defaultPhdReadTag = new DefaultPhdReadTag("", (String) null, arg2, arg3, "", "");
      
      // When the getComment method is called
      String comment = defaultPhdReadTag.getComment();
      
      // Then the returned value should be an empty string
      assertEquals("", comment);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsAndEqualsReturningFalse0() throws Throwable  {
      // rollbacked to evosuite
      MockDate arg3 = new MockDate();
      DefaultPhdReadTag defaultPhdReadTag = new DefaultPhdReadTag("Gu9j/#z3", "Gu9j/#z3", (Range) null, arg3, "Gu9j/#z3", "Gu9j/#z3");
      Range arg2 = Range.of(0L);
      DefaultPhdReadTag arg0 = new DefaultPhdReadTag("Gu9j/#z3", "Gu9j/#z3", arg2, arg3, "Gu9j/#z3", "Gu9j/#z3");
      boolean equals = defaultPhdReadTag.equals(arg0);
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsAndEqualsReturningTrue0() throws Throwable  {
      // Arrange
      Range arg2 = Range.of((-8L), (-8L));
      MockDate arg3 = new MockDate();
      DefaultPhdReadTag defaultPhdReadTag = new DefaultPhdReadTag("6@i", "6@i", arg2, arg3, "6@i", "u<1)N$=`B_QPk;");
      
      // Act
      DefaultPhdReadTag arg0 = new DefaultPhdReadTag("6@i", "6@i", arg2, arg3, "6@i", "u<1)N$=`B_QPk;");
      boolean equals = defaultPhdReadTag.equals(arg0);
      
      // Assert
      assertEquals("6@i", arg0.getSource());
      assertTrue(equals);
      assertEquals("6@i", arg0.getType());
      assertEquals("6@i", arg0.getComment());
      assertEquals("u<1)N$=`B_QPk;", arg0.getFreeFormData());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsAndEqualsReturningFalse1() throws Throwable  {
      // Given
      Range range = Range.of((-1L), (-1L));
      MockDate mockDate = new MockDate((-1409), (-680), (-680));
      DefaultPhdReadTag defaultPhdReadTag = new DefaultPhdReadTag("J6@i(", "", range, mockDate, (String) null, " z:*9");
      DefaultPhdReadTag otherDefaultPhdReadTag = new DefaultPhdReadTag("z:N%k}T", "", range, mockDate, (String) null, " z:*9");
      
      // When
      boolean actualEquals = defaultPhdReadTag.equals(otherDefaultPhdReadTag);
      
      // Then
      assertFalse(actualEquals);
      assertEquals("z:N%k}T", otherDefaultPhdReadTag.getSource());
      assertEquals(" z:*9", otherDefaultPhdReadTag.getFreeFormData());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsAndEqualsReturningFalse2() throws Throwable  {
      // Given: We have two DefaultPhdReadTag objects, defaultPhdReadTag and arg0, with different values for the name field.
      // When: We call the equals method on both objects with arg0 as an argument.
      // Then: The result of the equals method should be false, since the name fields are not equal.
      
      Range arg2 = Range.ofLength(65595L);
      MockDate arg3 = new MockDate();
      DefaultPhdReadTag defaultPhdReadTag = new DefaultPhdReadTag((String) null, "Tq+YT0L`]#h+HVi'|x", arg2, arg3, "Tq+YT0L`]#h+HVi'|x", "Tq+YT0L`]#h+HVi'|x");
      DefaultPhdReadTag arg0 = new DefaultPhdReadTag("Tq+YT0L`]#h+HVi'|x", "Tq+YT0L`]#h+HVi'|x", arg2, arg3, "Tq+YT0L`]#h+HVi'|x", "Tq+YT0L`]#h+HVi'|x");
      boolean equals = defaultPhdReadTag.equals(arg0);
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsAndEqualsReturningFalse3() throws Throwable  {
      // Given
      Range range1 = Range.of((-8L));
      MockDate date1 = new MockDate();
      DefaultPhdReadTag defaultPhdReadTag1 = new DefaultPhdReadTag("J6@i(", (String) null, range1, date1, (String) null, (String) null);
      
      Range range2 = Range.of((-8L));
      MockDate date2 = new MockDate();
      DefaultPhdReadTag defaultPhdReadTag2 = new DefaultPhdReadTag((String) null, "TaZCO[tz8qkN", range2, date2, (String) null, (String) null);
      
      // When
      boolean equals = defaultPhdReadTag1.equals(defaultPhdReadTag2);
      
      // Then
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsAndEqualsReturningFalse4() throws Throwable  {
      // Given
      Range range = Range.of(-1L, -1L);
      MockDate mockDate = new MockDate(-1409, -680, -680);
      DefaultPhdReadTag defaultPhdReadTag = new DefaultPhdReadTag("", "J6@i(", range, mockDate, (String) null, "J6@i(");
      
      // When
      DefaultPhdReadTag arg0 = new DefaultPhdReadTag("J6@i(", "", range, mockDate, (String) null, " z:*9");
      boolean equals = defaultPhdReadTag.equals(arg0);
      
      // Then
      assertEquals("", arg0.getSource());
      assertFalse(equals);
      assertEquals("J6@i(", arg0.getType());
      assertEquals(" z:*9", arg0.getFreeFormData());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsAndEqualsReturningTrue1() throws Throwable  {
      // Given
      MockDate arg3 = new MockDate();
      DefaultPhdReadTag defaultPhdReadTag = new DefaultPhdReadTag((String) null, (String) null, (Range) null, arg3, (String) null, (String) null);
      
      // When
      boolean equals = defaultPhdReadTag.equals(defaultPhdReadTag);
      
      // Then
      assertTrue(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsAndEqualsReturningFalse5() throws Throwable  {
      // Set up mock objects for Date and Range
      MockDate arg3 = new MockDate();
      DefaultPhdReadTag defaultPhdReadTag = new DefaultPhdReadTag((String) null, (String) null, (Range) null, arg3, (String) null, (String) null);
      
      // Create a new object with different values
      DefaultPhdReadTag arg0 = new DefaultPhdReadTag((String) null, (String) null, (Range) null, arg3, (String) null, "C");
      
      // Call the equals method and assert that it returns false
      boolean equals = defaultPhdReadTag.equals(arg0);
      assertFalse(equals);
      
      // Assert that the other object does not equal the DefaultPhdReadTag
      assertFalse(arg0.equals((Object)defaultPhdReadTag));
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsAndEqualsReturningFalse6() throws Throwable  {
      // rollbacked to evosuite
      MockDate arg3 = new MockDate();
      DefaultPhdReadTag arg0 = new DefaultPhdReadTag("org.jcvi.jillion.assembly.consed.phd.DefaultPhdReadTag", "org.jcvi.jillion.assembly.consed.phd.DefaultPhdReadTag", (Range) null, arg3, "org.jcvi.jillion.assembly.consed.phd.DefaultPhdReadTag", "org.jcvi.jillion.assembly.consed.phd.DefaultPhdReadTag");
      DefaultPhdReadTag defaultPhdReadTag = new DefaultPhdReadTag("org.jcvi.jillion.assembly.consed.phd.DefaultPhdReadTag", "number of entries must be >=0", (Range) null, arg3, "org.jcvi.jillion.assembly.consed.phd.DefaultPhdReadTag", "org.jcvi.jillion.assembly.consed.phd.DefaultPhdReadTag");
      boolean equals = defaultPhdReadTag.equals(arg0);
      assertEquals("org.jcvi.jillion.assembly.consed.phd.DefaultPhdReadTag", defaultPhdReadTag.getType());
      assertEquals("org.jcvi.jillion.assembly.consed.phd.DefaultPhdReadTag", defaultPhdReadTag.getComment());
      assertEquals("org.jcvi.jillion.assembly.consed.phd.DefaultPhdReadTag", defaultPhdReadTag.getFreeFormData());
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsAndEqualsReturningFalse7() throws Throwable  {
      // No Comments were added
      MockDate arg3 = new MockDate();
      DefaultPhdReadTag defaultPhdReadTag = new DefaultPhdReadTag("-X\"I)d|48u(", "THw*", (Range) null, arg3, "THw*", "-X\"I)d|48u(");
      DefaultPhdReadTag arg0 = new DefaultPhdReadTag("JQ)", "JQ)", (Range) null, arg3, "BVk!l`Rx'#=-3[+Y?", "BVk!l`Rx'#=-3[+Y?");
      boolean equals = defaultPhdReadTag.equals(arg0);
      assertEquals("-X\"I)d|48u(", defaultPhdReadTag.getType());
      assertFalse(equals);
      assertEquals("JQ)", arg0.getType());
      assertEquals("-X\"I)d|48u(", defaultPhdReadTag.getFreeFormData());
      assertEquals("JQ)", arg0.getSource());
      assertEquals("THw*", defaultPhdReadTag.getSource());
      assertEquals("BVk!l`Rx'#=-3[+Y?", arg0.getComment());
      assertEquals("BVk!l`Rx'#=-3[+Y?", arg0.getFreeFormData());
      assertEquals("THw*", defaultPhdReadTag.getComment());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsAndEqualsReturningFalse8() throws Throwable  {
      // Set up some sample data for the test
      Range range = Range.of((-1L), (-1L));
      MockDate mockDate = new MockDate(2436, 31, 727, (-1409), (-1409));
      DefaultPhdReadTag defaultPhdReadTag = new DefaultPhdReadTag("", "", range, mockDate, (String) null, "");
      
      // Test the equals method with a different object
      DefaultPhdReadTag otherDefaultPhdReadTag = new DefaultPhdReadTag("ZI^=sQC9\"-", "N4h*s", range, mockDate, (String) null, "ZI^=sQC9\"-");
      boolean equals = defaultPhdReadTag.equals(otherDefaultPhdReadTag);
      assertFalse(equals); // The objects are not equal since the type and source fields have different values
      
      // Test the getType() method
      String expectedType = "ZI^=sQC9\"-";
      String actualType = defaultPhdReadTag.getType();
      assertEquals(expectedType, actualType); // The type field should be equal to "ZI^=sQC9\"-"
      
      // Test the getSource() method
      String expectedSource = "N4h*s";
      String actualSource = defaultPhdReadTag.getSource();
      assertEquals(expectedSource, actualSource); // The source field should be equal to "N4h*s"
      
      // Test the getFreeFormData() method
      String expectedFreeFormData = "ZI^=sQC9\"-";
      String actualFreeFormData = defaultPhdReadTag.getFreeFormData();
      assertEquals(expectedFreeFormData, actualFreeFormData); // The freeFormData field should be equal to "ZI^=sQC9\"-"
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsAndEqualsReturningFalse9() throws Throwable  {
      // No Comments were added
      MockDate arg3 = new MockDate();
      DefaultPhdReadTag defaultPhdReadTag = new DefaultPhdReadTag((String) null, (String) null, (Range) null, (Date) null, (String) null, (String) null);
      DefaultPhdReadTag arg0 = new DefaultPhdReadTag((String) null, (String) null, (Range) null, arg3, (String) null, (String) null);
      boolean equals = defaultPhdReadTag.equals(arg0);
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsAndEqualsReturningFalse10() throws Throwable  {
      // Set up mock objects for the Date and PhdReadTag classes
      MockDate arg0 = new MockDate();
      DefaultPhdReadTag defaultPhdReadTag = new DefaultPhdReadTag("-X\"I)d|48u(", "THw*", (Range) null, arg0, "THw*", "-X\"I)d|48u(");
      
      // Test that the equals() method returns false when comparing a DefaultPhdReadTag object with itself
      boolean equals = defaultPhdReadTag.equals(arg0);
      assertFalse(equals);
      
      // Test that the getFreeFormData(), getType(), getComment(), and getSource() methods return the expected values for the DefaultPhdReadTag object
      assertEquals("-X\"I)d|48u(", defaultPhdReadTag.getFreeFormData());
      assertEquals("-X\"I)d|48u(", defaultPhdReadTag.getType());
      assertEquals("THw*", defaultPhdReadTag.getComment());
      assertEquals("THw*", defaultPhdReadTag.getSource());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsWithNull() throws Throwable  {
      // Given a DefaultPhdReadTag object with specific data
      MockDate arg3 = new MockDate();
      DefaultPhdReadTag defaultPhdReadTag = new DefaultPhdReadTag("-X\"I)d|48u(", "THw*", (Range) null, arg3, "THw*", "-X\"I)d|48u(");
      
      // When the equals method is called with a null object
      boolean equals = defaultPhdReadTag.equals((Object) null);
      
      // Then it should return false
      assertFalse(equals);
      
      // And the getType and getFreeFormData methods should return the expected values
      assertEquals("-X\"I)d|48u(", defaultPhdReadTag.getType());
      assertEquals("-X\"I)d|48u(", defaultPhdReadTag.getFreeFormData());
      
      // And the getSource and getComment methods should return the expected values
      assertEquals("THw*", defaultPhdReadTag.getSource());
      assertEquals("THw*", defaultPhdReadTag.getComment());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsAndEqualsReturningTrue2() throws Throwable  {
      // Given a DefaultPhdReadTag instance and a MockDate instance
      MockDate mockDate = new MockDate();
      DefaultPhdReadTag defaultPhdReadTag = new DefaultPhdReadTag("Jv", "Jv", (Range) null, mockDate, "Jv", "Jv");
      
      // When the equals method is called on the instance with itself as an argument
      boolean result = defaultPhdReadTag.equals(defaultPhdReadTag);
      
      // Then the result should be true, indicating that the instance is equal to itself
      assertTrue(result);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsAndEqualsReturningTrue3() throws Throwable  {
      // Given
      DefaultPhdReadTag defaultPhdReadTag = new DefaultPhdReadTag("org.jcvi.jillion.assembly.consed.phd.DefaultPhdReadTag", "org.jcvi.jillion.assembly.consed.phd.DefaultPhdReadTag", (Range) null, (Date) null, "org.jcvi.jillion.assembly.consed.phd.DefaultPhdReadTag", "org.jcvi.jillion.assembly.consed.phd.DefaultPhdReadTag");
      
      // When
      boolean equals = defaultPhdReadTag.equals(defaultPhdReadTag);
      
      // Then
      assertTrue(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHashCode0() throws Throwable  {
      // Set up mock objects
      Range arg2 = Range.of((-8L));
      MockDate arg3 = new MockDate();
      
      // Create a new DefaultPhdReadTag object with the given parameters
      DefaultPhdReadTag defaultPhdReadTag = new DefaultPhdReadTag("J6@i(", (String) null, arg2, arg3, (String) null, (String) null);
      
      // Invoke the hashCode() method on the object
      int result = defaultPhdReadTag.hashCode();
      
      // Verify the results
      assertEquals(result, 1605869274);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHashCode1() throws Throwable  {
      // Set up the test fixture
      MockDate arg3 = new MockDate();
      DefaultPhdReadTag defaultPhdReadTag = new DefaultPhdReadTag((String) null, (String) null, (Range) null, arg3, (String) null, (String) null);
      
      // Execute the code under test
      int hashCode = defaultPhdReadTag.hashCode();
      
      // Verify the results
      assertEquals(1096428, hashCode); // This is a random value generated from the MockDate object
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHashCode2() throws Throwable  {
      // Given a DefaultPhdReadTag object with certain properties
      DefaultPhdReadTag defaultPhdReadTag = new DefaultPhdReadTag("Jv", "Jv", (Range) null, (Date) null, "Jv", "Jv");
      
      // When the hashCode method is called on the object
      int hashCode = defaultPhdReadTag.hashCode();
      
      // Then the hash code value should be based on the properties of the object
      assertEquals(31 * 29 + 47, hashCode);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetCommentReturningNull() throws Throwable  {
      // Given a DefaultPhdReadTag object with a null comment
      Range arg2 = Range.of(270L);
      MockDate arg3 = new MockDate((-2009L));
      DefaultPhdReadTag defaultPhdReadTag = new DefaultPhdReadTag("wqg.>j", "wqg.>j", arg2, arg3, (String) null, "wqg.>j");
      
      // When the getComment method is called
      String comment = defaultPhdReadTag.getComment();
      
      // Then the comment should be null
      assertNull(comment);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetUngappedRange() throws Throwable  {
      // rollbacked to evosuite
      MockDate arg3 = new MockDate();
      DefaultPhdReadTag defaultPhdReadTag = new DefaultPhdReadTag("Gu9j/#z3", "Gu9j/#z3", (Range) null, arg3, "Gu9j/#z3", "Gu9j/#z3");
      Range ungappedRange = defaultPhdReadTag.getUngappedRange();
      assertNull(ungappedRange);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetDateReturningNonNull() throws Throwable  {
      // Given a DefaultPhdReadTag object with a valid date range
      Range arg2 = Range.of(270L);
      MockDate arg3 = new MockDate((-2009L));
      DefaultPhdReadTag defaultPhdReadTag = new DefaultPhdReadTag("wqg.>j", "wqg.>j", arg2, arg3, (String) null, "wqg.>j");
      
      // When the getDate() method is called on the DefaultPhdReadTag object
      Date date = defaultPhdReadTag.getDate();
      
      // Then the resulting Date object should be equal to the original MockDate object
      assertSame(arg3, date);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetSourceReturningEmptyString() throws Throwable  {
      // No Comments were added
      MockDate arg3 = new MockDate(21L);
      DefaultPhdReadTag defaultPhdReadTag = new DefaultPhdReadTag("", "", (Range) null, arg3, "@'BQZ?!eM~{{y\"", "");
      String source = defaultPhdReadTag.getSource();
      assertEquals("@'BQZ?!eM~{{y\"", defaultPhdReadTag.getComment());
      assertEquals("", defaultPhdReadTag.getType());
      assertEquals("", source);
      assertEquals("", defaultPhdReadTag.getFreeFormData());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetTypeReturningNonEmptyString() throws Throwable  {
      // Given
      Range arg2 = Range.of(270L);
      MockDate arg3 = new MockDate((-2009L));
      DefaultPhdReadTag defaultPhdReadTag = new DefaultPhdReadTag("wqg.>j", "wqg.>j", arg2, arg3, (String) null, "wqg.>j");
      
      // When
      String type = defaultPhdReadTag.getType();
      
      // Then
      assertEquals("wqg.>j", type);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetFreeFormDataReturningEmptyString() throws Throwable  {
      // No Comments were added
      MockDate arg3 = new MockDate(21L);
      DefaultPhdReadTag defaultPhdReadTag = new DefaultPhdReadTag("", "", (Range) null, arg3, "@'BQZ?!eM~{{y\"", "");
      String freeFormData = defaultPhdReadTag.getFreeFormData();
      assertEquals("@'BQZ?!eM~{{y\"", defaultPhdReadTag.getComment());
      assertEquals("", defaultPhdReadTag.getSource());
      assertEquals("", defaultPhdReadTag.getType());
      assertEquals("", freeFormData);
  }
}
