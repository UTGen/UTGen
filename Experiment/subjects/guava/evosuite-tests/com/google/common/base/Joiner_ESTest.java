/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Tue Mar 19 15:20:23 GMT 2024
 */

package com.google.common.base;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.base.Joiner;
import java.io.PipedWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Stack;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Joiner_ESTest extends Joiner_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAppendToTaking1And1AndAppendToTaking1And1AndOnTakingCharWithOtherChar() throws Throwable  {
      // No Comments were added
      Joiner on = Joiner.on('^');
      Joiner.MapJoiner withKeyValueSeparator = on.withKeyValueSeparator("com.google.common.io.PatternFilenameFilter");
      StringBuilder arg0 = new StringBuilder("com.google.common.io.PatternFilenameFilter");
      Iterator<Map.Entry<PipedWriter, Locale.FilteringMode>> arg1 = (Iterator<Map.Entry<PipedWriter, Locale.FilteringMode>>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(arg1).hasNext();
      StringBuilder appendTo = withKeyValueSeparator.appendTo(arg0, arg1);
      assertSame(arg0, appendTo);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAppendToTaking1And1AndAppendToTaking1And10() throws Throwable  {
      // No Comments were added
      Joiner on = Joiner.on("cxSAkMH-1@F");
      Joiner.MapJoiner withKeyValueSeparator = on.withKeyValueSeparator("cxSAkMH-1@F");
      PipedWriter arg0 = new PipedWriter();
      ArrayList<Map.Entry<PipedWriter, Locale.FilteringMode>> arg1 = new ArrayList<Map.Entry<PipedWriter, Locale.FilteringMode>>();
      PipedWriter appendTo = withKeyValueSeparator.appendTo(arg0, (Iterable<? extends Map.Entry<?, ?>>) arg1);
      assertSame(arg0, appendTo);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testToStringReturningCharSequenceWhereLengthIsZero() throws Throwable  {
      // Given
      Joiner on = Joiner.on('1');
      
      // When
      CharSequence string = on.toString((Object) "");
      
      // Then
      assertEquals("", string);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testJoinTakingIterableReturningNonEmptyString() throws Throwable  {
      // No Comments were added
      Joiner on = Joiner.on("");
      Locale.FilteringMode arg1 = Locale.FilteringMode.EXTENDED_FILTERING;
      EnumSet<Locale.FilteringMode> arg0 = EnumSet.of(arg1, arg1);
      String join = on.join((Iterable<?>) arg0);
      assertNotNull(join);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAppendToTaking1And1AndAppendToTaking1And1AndAppendToTaking1And1ReturningNonNull0() throws Throwable  {
      // No Comments were added
      Joiner on = Joiner.on('^');
      StringBuilder arg0 = new StringBuilder("com.google.common.io.PatternFilenameFilter");
      Iterator<Map.Entry<PipedWriter, Locale.FilteringMode>> iterator = (Iterator<Map.Entry<PipedWriter, Locale.FilteringMode>>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      Object[] arg1 = new Object[5];
      Object object = new Object();
      arg1[0] = object;
      arg1[1] = (Object) arg0;
      arg1[2] = (Object) iterator;
      arg1[3] = (Object) iterator;
      arg1[4] = (Object) iterator;
      StringBuilder appendTo = on.appendTo(arg0, arg1);
      assertSame(appendTo, arg0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAppendToTaking12ObjectsAnd1AndAppendToTaking12ObjectsAnd1AndAppendToTaking12ObjectsAnd1ReturningNonNull0() throws Throwable  {
      // Arrange
      Joiner on = Joiner.on('1');
      Joiner skipNulls = on.skipNulls();
      PipedWriter arg1 = new PipedWriter();
      Locale.FilteringMode arg2 = Locale.FilteringMode.EXTENDED_FILTERING;
      Object[] arg3 = new Object[4];
      StringBuilder arg0 = new StringBuilder("java.io.PipedWriter@00000000101java.util.Locale$FilteringMode@000000001111com.google.common.base.Joiner@00000000011com.google.common.base.Joiner@00000000071java.io.PipedWriter@0000000010");
      
      // Act
      StringBuilder appendTo = skipNulls.appendTo(arg0, (Object) arg1, (Object) arg2, arg3);
      
      // Assert
      assertSame(arg0, appendTo);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAppendToTaking12ObjectsAnd1AndAppendToTaking12ObjectsAnd1AndAppendToTaking12ObjectsAnd1ReturningNonNull1() throws Throwable  {
      // No Comments were added
      Joiner on = Joiner.on(';');
      Joiner skipNulls = on.skipNulls();
      PipedWriter arg0 = new PipedWriter();
      Object[] arg3 = new Object[0];
      PipedWriter appendTo = skipNulls.appendTo(arg0, (Object) null, (Object) null, arg3);
      assertSame(appendTo, arg0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAppendToTaking1And1AndAppendToTaking1And1AndAppendToTaking1And1ReturningNonNull1() throws Throwable  {
      // No Comments were added
      Joiner on = Joiner.on("#>?);o,`T&)@o=oLm");
      LinkedList<PipedWriter> linkedList = new LinkedList<PipedWriter>();
      Iterator<PipedWriter> arg1 = linkedList.iterator();
      PipedWriter arg0 = new PipedWriter();
      PipedWriter appendTo = on.appendTo(arg0, (Iterator<?>) arg1);
      assertSame(arg0, appendTo);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAppendToTaking1And1AndAppendToTaking1And1AndAppendToTaking1And1ReturningNonNull2() throws Throwable  {
      // Setup
      Joiner on = Joiner.on('^');
      StringBuilder arg0 = new StringBuilder("com.google.common.io.PatternFilenameFilter");
      ArrayDeque<PipedWriter> arrayDeque = new ArrayDeque<PipedWriter>();
      Iterator<PipedWriter> arg1 = arrayDeque.descendingIterator();
      
      // When
      StringBuilder appendTo = on.appendTo(arg0, arg1);
      
      // Then
      assertSame(arg0, appendTo);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testJoinTakingIterator() throws Throwable  {
      // Create a LinkedList of PipedWriter objects
      LinkedList<PipedWriter> linkedList = new LinkedList<>();
      
      // Add some elements to the list
      linkedList.add(new PipedWriter());
      linkedList.add(new PipedWriter());
      
      // Create a Joiner on "#>?);o,`T&)@o=oLm" delimiter
      Joiner on = Joiner.on("#>?);o,`T&)@o=oLm");
      
      // Iterate over the list and join the elements using the Joiner
      Iterator<PipedWriter> arg0 = linkedList.iterator();
      String join = on.join(arg0);
      
      // Assert that the joined string is empty
      assertEquals("", join);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testWithKeyValueSeparatorAndJoinTakingIterator() throws Throwable  {
      // No Comments were added
      Joiner on = Joiner.on(">s8,r");
      Joiner.MapJoiner withKeyValueSeparator = on.withKeyValueSeparator(">s8,r");
      Map.Entry<PipedWriter, PipedWriter> map_Entry = (Map.Entry<PipedWriter, PipedWriter>) mock(Map.Entry.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(map_Entry).getKey();
      Iterator<Map.Entry<PipedWriter, PipedWriter>> arg0 = (Iterator<Map.Entry<PipedWriter, PipedWriter>>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(arg0).hasNext();
      doReturn(map_Entry).when(arg0).next();
      // Undeclared exception!
      try { 
        withKeyValueSeparator.join(arg0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testJoinTakingObjectArrayReturningNonEmptyString() throws Throwable  {
      // Given: A Joiner object named "on" is created with a delimiter of "_E/aMs9(PMWM_" and an array of objects containing three elements.
      Joiner on = Joiner.on("_E/aMs9(PMWM_");
      Object[] arg0 = new Object[3];
      arg0[0] = (Object) on;
      arg0[1] = (Object) "_E/aMs9(PMWM_";
      
      // When: A Joiner object is created with the skipNulls method applied to the "on" object, and a join method is called with the array of objects as an argument.
      Joiner skipNulls = on.skipNulls();
      String join = skipNulls.join(arg0);
      
      // Then: The joined string should not be null.
      assertNotNull(join);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testJoinTakingObjectArrayReturningEmptyString() throws Throwable  {
      // Given
      Joiner on = Joiner.on("_E/aMs9(PMWM_");
      Object[] arg0 = new Object[3];
      
      // When
      Joiner skipNulls = on.skipNulls();
      String join = skipNulls.join(arg0);
      
      // Then
      assertEquals("", join);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testJoinTakingIterableReturningEmptyString() throws Throwable  {
      // Set up the test data
      Stack<Locale.FilteringMode> arg0 = new Stack<>();
      
      // Create a Joiner instance with the desired configuration
      Joiner on = Joiner.on("");
      Joiner skipNulls = on.skipNulls();
      
      // Call the join method with the test data
      String join = skipNulls.join((Iterable<?>) arg0);
      
      // Verify the results
      assertEquals("", join);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testToStringWithNull() throws Throwable  {
      // rollbacked to evosuite
      Joiner on = Joiner.on('E');
      Joiner useForNull = on.useForNull("com.google.common.io.PatternFilenameFilter");
      CharSequence string = useForNull.toString((Object) null);
      assertEquals("com.google.common.io.PatternFilenameFilter", string);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testToStringWithNonNullAndUseForNullTakingStringWithEmptyString() throws Throwable  {
      // Test that the Joiner.on("") method with filtering mode IGNORE_EXTENDED_RANGES returns a non-null string
      Joiner on = Joiner.on("");
      Joiner useForNull = on.useForNull("");
      Locale.FilteringMode arg0 = Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
      CharSequence string = useForNull.toString((Object) arg0);
      assertNotNull(string);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAppendToTaking1And1AndAppendToTaking1And1AndAppendToTaking1And1ReturningNonNull3() throws Throwable  {
      // rollbacked to evosuite
      Joiner on = Joiner.on("J");
      StringBuilder arg0 = new StringBuilder();
      LinkedHashSet<PipedWriter> arg1 = new LinkedHashSet<PipedWriter>();
      StringBuilder appendTo = on.appendTo(arg0, (Iterable<?>) arg1);
      assertSame(appendTo, arg0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testJoinTaking3Arguments() throws Throwable  {
      // No Comments were added
      Joiner on = Joiner.on("\"#!@h-gWD?1C1l[w)5");
      Locale.FilteringMode arg1 = Locale.FilteringMode.REJECT_EXTENDED_RANGES;
      Object[] arg2 = new Object[0];
      String join = on.join((Object) arg1, (Object) arg1, arg2);
      assertNotNull(join);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAppendToTaking1And1AndAppendToTaking1And1AndOnTakingChar() throws Throwable  {
      // rollbacked to evosuite
      Joiner on = Joiner.on('n');
      Joiner.MapJoiner withKeyValueSeparator = on.withKeyValueSeparator("_<pgV$y'IjD*a?:Je");
      StringBuilder arg0 = new StringBuilder();
      HashMap<Locale.FilteringMode, Locale.FilteringMode> arg1 = new HashMap<Locale.FilteringMode, Locale.FilteringMode>();
      StringBuilder appendTo = withKeyValueSeparator.appendTo(arg0, (Map<?, ?>) arg1);
      assertSame(appendTo, arg0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testUseForNullTakingStringAndWithKeyValueSeparatorAndJoinTakingIterator() throws Throwable  {
      // No Comments were added
      Joiner on = Joiner.on(">s8,r");
      Joiner.MapJoiner withKeyValueSeparator = on.withKeyValueSeparator(">s8,r");
      Joiner.MapJoiner useForNull = withKeyValueSeparator.useForNull("");
      Map.Entry<PipedWriter, PipedWriter> map_Entry = (Map.Entry<PipedWriter, PipedWriter>) mock(Map.Entry.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(map_Entry).getKey();
      doReturn((Object) null).when(map_Entry).getValue();
      Iterator<Map.Entry<PipedWriter, PipedWriter>> arg0 = (Iterator<Map.Entry<PipedWriter, PipedWriter>>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      doReturn(true, false).when(arg0).hasNext();
      doReturn(map_Entry).when(arg0).next();
      useForNull.join(arg0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testJoinTakingMap() throws Throwable  {
      // Set up the input map with an empty hash map
      HashMap<Locale.FilteringMode, Locale.FilteringMode> arg0 = new HashMap<>();
      
      // Set up the joiner with a custom key-value separator
      Joiner on = Joiner.on('1');
      Joiner.MapJoiner withKeyValueSeparator = on.withKeyValueSeparator("");
      
      // Use the MapJoiner to join the map using the custom separator
      String join = withKeyValueSeparator.join((Map<?, ?>) arg0);
      
      // Assert that the joined string is empty
      assertEquals("", join);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAppendToTaking1And1AndAppendToTaking1And11() throws Throwable  {
      // Create a Joiner instance with the default key-value separator
      Joiner on = Joiner.on("com.google.common.base.Joiner$1");
      
      // Create a MapJoiner instance with the same Joiner and a custom key-value separator
      Joiner.MapJoiner withKeyValueSeparator = on.withKeyValueSeparator("com.google.common.base.Joiner$1");
      
      // Create a PipedWriter instance
      PipedWriter arg0 = new PipedWriter();
      
      // Create a HashMap instance to pass as the first argument to appendTo() method
      HashMap<PipedWriter, Locale.FilteringMode> arg1 = new HashMap<PipedWriter, Locale.FilteringMode>();
      
      // Call the appendTo() method with the PipedWriter instance and the HashMap instance
      PipedWriter appendTo = withKeyValueSeparator.appendTo(arg0, (Map<?, ?>) arg1);
      
      // Assert that the returned value is the same as the first argument passed in
      assertSame(arg0, appendTo);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAppendToTaking1And1AndAppendToTaking1And12() throws Throwable  {
      // No Comments were added
      Joiner on = Joiner.on("com.google.common.base.Joiner$2");
      Joiner.MapJoiner withKeyValueSeparator = on.withKeyValueSeparator("com.google.common.io.PatternFilenameFilter");
      StringBuilder arg0 = new StringBuilder(695);
      ArrayList<Map.Entry<PipedWriter, PipedWriter>> arg1 = new ArrayList<Map.Entry<PipedWriter, PipedWriter>>(695);
      StringBuilder appendTo = withKeyValueSeparator.appendTo(arg0, (Iterable<? extends Map.Entry<?, ?>>) arg1);
      assertEquals("", appendTo.toString());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSkipNulls() throws Throwable  {
      // rollbacked to evosuite
      Joiner on = Joiner.on("MSD@-'1SM^^6}#F");
      Joiner skipNulls = on.skipNulls();
      // Undeclared exception!
      try { 
        skipNulls.useForNull("MSD@-'1SM^^6}#F");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // already specified skipNulls
         //
         verifyException("com.google.common.base.Joiner$2", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testWithKeyValueSeparatorThrowsUnsupportedOperationException() throws Throwable  {
      // rollbacked to evosuite
      Joiner on = Joiner.on("%s");
      Joiner skipNulls = on.skipNulls();
      // Undeclared exception!
      try { 
        skipNulls.withKeyValueSeparator("%s");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // can't use .skipNulls() with maps
         //
         verifyException("com.google.common.base.Joiner$2", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testUseForNullTakingStringAndUseForNullTakingStringThrowsUnsupportedOperationException() throws Throwable  {
      // No Comments were added
      Joiner on = Joiner.on("B:|YTy3h");
      Joiner useForNull = on.useForNull("B:|YTy3h");
      // Undeclared exception!
      try { 
        useForNull.useForNull("B:|YTy3h");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // already specified useForNull
         //
         verifyException("com.google.common.base.Joiner$1", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSkipNullsThrowsUnsupportedOperationException() throws Throwable  {
      // Create a Joiner object that uses the "g" delimiter and replace nulls with empty strings
      Joiner on = Joiner.on('g');
      Joiner useForNull = on.useForNull("com.google.common.base.Joiner");
      
      // Attempt to skip nulls in the Joiner, which is not supported
      try {
      useForNull.skipNulls();
      fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
      // Verify that an UnsupportedOperationException was thrown as expected
      verifyException("com.google.common.base.Joiner$1", e);}
  }
}
