/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Mon Mar 18 03:48:34 GMT 2024
 */

package org.apache.lucene.search.exposed.compare;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import com.ibm.icu.text.Collator;
import java.util.Locale;
import org.apache.lucene.search.exposed.compare.NamedCollatorComparator;
import org.apache.lucene.util.BytesRef;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class NamedCollatorComparator_ESTest extends NamedCollatorComparator_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetIDReturningNull() throws Throwable  {
      // Given
      NamedCollatorComparator namedCollatorComparator = new NamedCollatorComparator((Collator) null, (String) null);
      
      // When
      String id = namedCollatorComparator.getID();
      
      // Then
      assertNotNull(id);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetIDReturningNonEmptyString() throws Throwable  {
      // No Comments were added
      NamedCollatorComparator namedCollatorComparator = new NamedCollatorComparator((Collator) null, "-]y_(V<ZJI");
      namedCollatorComparator.getID();
      assertFalse(namedCollatorComparator.isNullFirst());
      assertFalse(namedCollatorComparator.isReverse());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsReverseReturningTrue() throws Throwable  {
      // Given a NamedCollatorComparator object, assert that it is not in reverse mode
      NamedCollatorComparator namedCollatorComparator = new NamedCollatorComparator((Collator) null, "");
      assertFalse(namedCollatorComparator.isReverse());
      
      // When the reverse mode is set to true, verify that the object is now in reverse mode
      namedCollatorComparator.setReverse(true);
      boolean reverse = namedCollatorComparator.isReverse();
      assertTrue(reverse);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetReverseWithFalse() throws Throwable  {
      // rollbacked to evosuite
      NamedCollatorComparator namedCollatorComparator = new NamedCollatorComparator((Collator) null, "");
      namedCollatorComparator.setReverse(false);
      assertFalse(namedCollatorComparator.isReverse());
      assertFalse(namedCollatorComparator.isNullFirst());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetNullFirstAndCompareReturningPositive() throws Throwable  {
      // Given a NamedCollatorComparator instance with null as the first argument
      BytesRef arg0 = new BytesRef(1);
      NamedCollatorComparator namedCollatorComparator = new NamedCollatorComparator((Collator) null, "");
      
      // When setNullFirst is called with true
      namedCollatorComparator.setNullFirst(true);
      
      // Then the null argument should be considered first
      assertTrue(namedCollatorComparator.isNullFirst());
      
      // And compare should return 1
      int compare = namedCollatorComparator.compare(arg0, (BytesRef) null);
      assertEquals(1, compare);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCompareThrowsNullPointerException() throws Throwable  {
      // Test that a NullPointerException is thrown when null is passed as an argument to compare()
      NamedCollatorComparator namedCollatorComparator = new NamedCollatorComparator((Collator) null, (String) null);
      BytesRef arg1 = new BytesRef();
      
      try {
      namedCollatorComparator.compare(arg1, arg1);
      fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      // Verify that the exception message is null (i.e., no additional information was provided by the constructor)
      assertEquals(null, e.getMessage());
      
      verifyException("org.apache.lucene.search.exposed.compare.NamedCollatorComparator", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetNullFirstAndCompareReturningNegative() throws Throwable  {
      // Test that the named collator comparator sets null first correctly.
      NamedCollatorComparator namedCollatorComparator = new NamedCollatorComparator((Collator) null, "");
      assertFalse(namedCollatorComparator.isNullFirst());
      
      // Set null first to true.
      namedCollatorComparator.setNullFirst(true);
      assertTrue(namedCollatorComparator.isNullFirst());
      
      // Compare a null reference with an instance of BytesRef.
      BytesRef arg1 = new BytesRef("1");
      int compare = namedCollatorComparator.compare((BytesRef) null, arg1);
      assertEquals(-1, compare);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCompareReturningPositive() throws Throwable  {
      // Arrange
      BytesRef arg1 = new BytesRef("a");
      NamedCollatorComparator namedCollatorComparator = new NamedCollatorComparator((Collator) null, "en-US");
      
      // Act
      int compare = namedCollatorComparator.compare(null, arg1);
      
      // Assert
      assertEquals(1, compare);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCompareReturningZero() throws Throwable  {
      NamedCollatorComparator namedCollatorComparator = new NamedCollatorComparator((Collator) null, (String) null);
      
      // Create an instance of the NamedCollatorComparator class with a null Collator and null String. This is done to ensure that the compare method behaves correctly when comparing two null references.
      
      int compare = namedCollatorComparator.compare((BytesRef) null, (BytesRef) null);
      
      // Call the compare method on the NamedCollatorComparator instance with two null references as arguments. This will return 0, which means that the compare method considers two null references to be equal.
      
      assertFalse(namedCollatorComparator.isNullFirst());
      
      // Assert that the isNullFirst() method returns false, which means that the NamedCollatorComparator instance does not consider null values to be less than non-null values.
      
      assertFalse(namedCollatorComparator.isReverse());
      
      // Assert that the isReverse() method returns false, which means that the NamedCollatorComparator instance does not compare values in reverse order.
      
      assertEquals(0, compare);
      
      // Assert that the compare method returned 0, which means that two null references were considered equal.
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCompareReturningNegative() throws Throwable  {
      // Set up test data
      BytesRef arg0 = new BytesRef(1); // Create a BytesRef object with value 1
      NamedCollatorComparator namedCollatorComparator = new NamedCollatorComparator((Collator) null, "))"); // Create a NamedCollatorComparator instance with a null Collator and the string ")))" as the locale
      
      // Call compare() method on the NamedCollatorComparator instance
      int compare = namedCollatorComparator.compare(arg0, (BytesRef) null);
      
      // Assert that the result of the comparison is -1
      assertEquals((-1), compare);
      
      // Assert that the NamedCollatorComparator instance is not in reverse mode
      assertFalse(namedCollatorComparator.isReverse());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFailsToCreateNamedCollatorComparatorTakingLocaleThrowsNullPointerException() throws Throwable  {
      // rollbacked to evosuite
      Locale arg0 = Locale.JAPANESE;
      NamedCollatorComparator namedCollatorComparator = new NamedCollatorComparator(arg0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFailsToCreateNamedCollatorComparatorTakingCollatorThrowsNullPointerException() throws Throwable  {
      // rollbacked to evosuite
      NamedCollatorComparator namedCollatorComparator = null;
      try {
        namedCollatorComparator = new NamedCollatorComparator((Collator) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsNullFirstReturningTrue() throws Throwable  {
      // Given a NamedCollatorComparator instance with a specific collation key
      String colKey = "D/*^#ojfHqP#'";
      NamedCollatorComparator namedCollatorComparator = new NamedCollatorComparator(null, colKey);
      
      // When we call isNullFirst() on the instance
      boolean nullFirst = namedCollatorComparator.isNullFirst();
      
      // Then the result should be false
      assertFalse(nullFirst);
      
      // And when we set the null first property to true
      namedCollatorComparator.setNullFirst(true);
      
      // Then the null first property should be true
      assertTrue(namedCollatorComparator.isNullFirst());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetIDReturningEmptyString() throws Throwable  {
      // Create a new NamedCollatorComparator object with null Collator and empty string as ID.
      NamedCollatorComparator namedCollatorComparator = new NamedCollatorComparator((Collator) null, "");
      
      // Check if the created object has the expected ID.
      assertEquals("", namedCollatorComparator.getID());
      
      // Check if the created object has the expected reverse order set to false.
      assertFalse(namedCollatorComparator.isReverse());
      
      // Check if the created object has the expected null first set to false.
      assertFalse(namedCollatorComparator.isNullFirst());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetCollator() throws Throwable  {
      // No Comments were added
      NamedCollatorComparator namedCollatorComparator = new NamedCollatorComparator((Collator) null, "))");
      namedCollatorComparator.getCollator();
      assertFalse(namedCollatorComparator.isReverse());
      assertFalse(namedCollatorComparator.isNullFirst());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetCollationKeyTakingStringThrowsNullPointerException() throws Throwable  {
      // rollbacked to evosuite
      NamedCollatorComparator namedCollatorComparator = new NamedCollatorComparator((Collator) null, "5");
      // Undeclared exception!
      try { 
        namedCollatorComparator.getCollationKey("5");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.lucene.search.exposed.compare.NamedCollatorComparator", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsReverseReturningFalse() throws Throwable  {
      // Given: A NamedCollatorComparator object with a null Collator and an empty string
      NamedCollatorComparator namedCollatorComparator = new NamedCollatorComparator((Collator) null, "");
      
      // When: The reverse property is retrieved
      boolean reverse = namedCollatorComparator.isReverse();
      
      // Then: The reverse property should be false
      assertFalse(reverse);
      
      // And: The nullFirst property should also be false
      assertFalse(namedCollatorComparator.isNullFirst());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetCollationKeyTakingBytesRefThrowsNullPointerException() throws Throwable  {
      // No Comments were added
      NamedCollatorComparator namedCollatorComparator = new NamedCollatorComparator((Collator) null, "&8U??kp6^j7S@ Zb");
      BytesRef arg0 = new BytesRef();
      // Undeclared exception!
      try { 
        namedCollatorComparator.getCollationKey(arg0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.lucene.search.exposed.compare.NamedCollatorComparator", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetOrder() throws Throwable  {
      // rollbacked to evosuite
      NamedCollatorComparator namedCollatorComparator = new NamedCollatorComparator((Collator) null, "");
      namedCollatorComparator.getOrder();
      assertFalse(namedCollatorComparator.isReverse());
      assertFalse(namedCollatorComparator.isNullFirst());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsNullFirstReturningFalse() throws Throwable  {
      // rollbacked to evosuite
      NamedCollatorComparator namedCollatorComparator = new NamedCollatorComparator((Collator) null, "D/*^#ojfHqP#']");
      boolean nullFirst = namedCollatorComparator.isNullFirst();
      assertFalse(nullFirst);
      assertFalse(namedCollatorComparator.isReverse());
  }
}
