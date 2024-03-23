/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Mon Mar 18 11:13:02 GMT 2024
 */

package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.cli.Option;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Option_Original_ESTest extends Option_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetValueSeparatorReturningDigit() throws Throwable  {
      Option option = new Option("", "", false, "");
      option.setValueSeparator('0');
      char valueSeparator = option.getValueSeparator();
      assertEquals('0', valueSeparator);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetValueSeparatorReturningAlphabeticChar() throws Throwable  {
      Option option = new Option("", "", true, "");
      option.setValueSeparator('J');
      char valueSeparator = option.getValueSeparator();
      assertEquals('J', valueSeparator);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetValueTakingStringReturningNull() throws Throwable  {
      Option option = new Option((String) null, true, "");
      option.getValue((String) null);
      assertEquals(1, option.getArgs());
      assertFalse(option.hasLongOpt());
      assertEquals("arg", option.getArgName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetValueTakingIntReturningNonEmptyString() throws Throwable  {
      Option option = new Option("D", "D", true, "D");
      option.addValueForProcessing("D");
      String value = option.getValue(0);
      assertNotNull(value);
      assertTrue(option.hasArgName());
      assertFalse(option.hasValueSeparator());
      assertEquals(1, option.getArgs());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetValueTakingNoArgumentsReturningNonEmptyString() throws Throwable  {
      Option option = new Option("D", "D", true, "D");
      option.addValueForProcessing("D");
      String value = option.getValue();
      assertNotNull(value);
      assertFalse(option.hasValueSeparator());
      assertEquals("arg", option.getArgName());
      assertEquals(1, option.getArgs());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetTypeReturningNonNull() throws Throwable  {
      Option option = new Option("", true, "");
      option.setType("");
      option.getType();
      assertFalse(option.hasLongOpt());
      assertTrue(option.hasArgName());
      assertTrue(option.hasArg());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetOptReturningNull() throws Throwable  {
      Option option = new Option((String) null, (String) null);
      option.getOpt();
      assertEquals((-1), option.getArgs());
      assertTrue(option.hasArgName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetOptReturningNonEmptyString() throws Throwable  {
      Option option = new Option("L", "org.apache.commons.cli.Option", false, "org.apache.commons.cli.Option");
      option.getOpt();
      assertEquals("org.apache.commons.cli.Option", option.getDescription());
      assertEquals((-1), option.getArgs());
      assertTrue(option.hasArgName());
      assertEquals("org.apache.commons.cli.Option", option.getLongOpt());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetLongOptReturningNonEmptyString() throws Throwable  {
      Option option = new Option("", false, "?u");
      assertFalse(option.hasLongOpt());
      
      option.setLongOpt("&f,Rb>ungY(XiLVRz%D");
      option.getLongOpt();
      assertEquals("?u", option.getDescription());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetKeyReturningNonEmptyString() throws Throwable  {
      Option option = new Option("yB", "yB");
      option.getKey();
      assertFalse(option.hasLongOpt());
      assertEquals("arg", option.getArgName());
      assertEquals((-1), option.getArgs());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetKeyReturningEmptyString() throws Throwable  {
      Option option = new Option("", "");
      option.getKey();
      assertEquals((-1), option.getArgs());
      assertFalse(option.hasLongOpt());
      assertEquals("arg", option.getArgName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetDescriptionReturningNonEmptyString() throws Throwable  {
      Option option = new Option("D", "D", true, "D");
      option.getDescription();
      assertEquals(1, option.getArgs());
      assertTrue(option.hasArgName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetDescriptionReturningEmptyString() throws Throwable  {
      Option option = new Option("", "");
      String description = option.getDescription();
      assertTrue(option.hasArgName());
      assertNotNull(description);
      assertEquals((-1), option.getArgs());
      assertFalse(option.hasLongOpt());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetArgsReturningZero() throws Throwable  {
      Option option = new Option("", "");
      assertEquals((-1), option.getArgs());
      
      option.setArgs(0);
      int args = option.getArgs();
      assertEquals(0, args);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetArgsReturningPositive() throws Throwable  {
      Option option = new Option("", true, "");
      int args = option.getArgs();
      assertEquals(1, args);
      assertFalse(option.hasLongOpt());
      assertEquals("arg", option.getArgName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetArgNameReturningNull() throws Throwable  {
      Option option = new Option((String) null, "$fP^cQ", false, "illegal option value '");
      assertTrue(option.hasArgName());
      
      option.setArgName((String) null);
      option.getArgName();
      assertEquals((-1), option.getArgs());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetArgNameReturningEmptyString() throws Throwable  {
      Option option = new Option("", false, "");
      assertTrue(option.hasArgName());
      
      option.setArgName("");
      option.getArgName();
      assertFalse(option.hasLongOpt());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetValueTakingNoArgumentsReturningNull() throws Throwable  {
      Option option = new Option("", false, "");
      option.getValue();
      assertEquals((-1), option.getArgs());
      assertFalse(option.hasLongOpt());
      assertTrue(option.hasArgName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHasValueSeparatorReturningTrue() throws Throwable  {
      Option option = new Option("", true, "");
      option.setValueSeparator('w');
      boolean valueSeparator = option.hasValueSeparator();
      assertEquals('w', option.getValueSeparator());
      assertTrue(valueSeparator);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetValueSeparatorReturningOtherChar() throws Throwable  {
      Option option = new Option("", false, "");
      option.getValueSeparator();
      assertEquals((-1), option.getArgs());
      assertTrue(option.hasArgName());
      assertFalse(option.hasLongOpt());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesOptionTaking4ArgumentsAndCallsHashCode() throws Throwable  {
      Option option = new Option("D", "D", true, "D");
      option.hashCode();
      assertEquals("arg", option.getArgName());
      assertEquals(1, option.getArgs());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesOptionTaking3ArgumentsAndCallsHashCode() throws Throwable  {
      Option option = new Option((String) null, true, "");
      option.hashCode();
      assertEquals("arg", option.getArgName());
      assertFalse(option.hasLongOpt());
      assertEquals(1, option.getArgs());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesOptionTaking3ArgumentsAndCallsEquals0() throws Throwable  {
      Option option = new Option("", "$fP^cQ", true, "$fP^cQ");
      Option arg0 = new Option("", true, "$fP^cQ");
      boolean equals = option.equals(arg0);
      assertFalse(equals);
      assertEquals("$fP^cQ", arg0.getDescription());
      assertEquals("arg", arg0.getArgName());
      assertTrue(arg0.hasArg());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesOptionTaking3ArgumentsAndCallsEquals1() throws Throwable  {
      Option option = new Option((String) null, true, "");
      Option arg0 = new Option("", (String) null, false, ":");
      boolean equals = option.equals(arg0);
      assertFalse(equals);
      assertTrue(option.hasArg());
      assertEquals(":", arg0.getDescription());
      assertFalse(arg0.hasLongOpt());
      assertEquals((-1), arg0.getArgs());
      assertTrue(arg0.hasArgName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesOptionTaking2ArgumentsAndCallsEquals0() throws Throwable  {
      Option option = new Option("", "", true, "bo&&{");
      Option arg0 = new Option((String) null, "#{%HzGH-bR2}");
      boolean equals = option.equals(arg0);
      assertTrue(arg0.hasArgName());
      assertEquals((-1), arg0.getArgs());
      assertEquals("bo&&{", option.getDescription());
      assertEquals(1, option.getArgs());
      assertFalse(equals);
      assertFalse(arg0.hasLongOpt());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesOptionTaking2ArgumentsAndEqualsAndEqualsReturningTrue() throws Throwable  {
      Option option = new Option((String) null, "eXc,$");
      Option arg0 = new Option((String) null, "eXc,$");
      boolean equals = option.equals(arg0);
      assertEquals((-1), arg0.getArgs());
      assertFalse(arg0.hasLongOpt());
      assertTrue(equals);
      assertEquals("arg", arg0.getArgName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesOptionTaking2ArgumentsAndCallsEquals1() throws Throwable  {
      Option option = new Option("", "");
      Option arg0 = new Option("", " ]", true, "'m.");
      boolean equals = option.equals(arg0);
      assertEquals("'m.", arg0.getDescription());
      assertFalse(equals);
      assertEquals(" ]", arg0.getLongOpt());
      assertTrue(arg0.hasArg());
      assertFalse(arg0.equals((Object)option));
      assertEquals((-1), option.getArgs());
      assertEquals("arg", arg0.getArgName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsWithNonNull() throws Throwable  {
      Option option = new Option("", "");
      Object arg0 = new Object();
      boolean equals = option.equals(arg0);
      assertFalse(option.hasLongOpt());
      assertEquals("arg", option.getArgName());
      assertFalse(equals);
      assertEquals((-1), option.getArgs());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesOptionTaking3ArgumentsAndEqualsAndEqualsReturningTrue() throws Throwable  {
      Option arg0 = new Option("", true, "");
      boolean equals = arg0.equals(arg0);
      assertTrue(equals);
      assertFalse(arg0.hasLongOpt());
      assertEquals(1, arg0.getArgs());
      assertTrue(arg0.hasArgName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsWithNull() throws Throwable  {
      Option option = new Option("arg", "$fP^cQ", false, "a?ZQEujs 95:,");
      boolean equals = option.equals((Object) null);
      assertEquals("$fP^cQ", option.getLongOpt());
      assertFalse(equals);
      assertEquals((-1), option.getArgs());
      assertEquals("arg", option.getArgName());
      assertEquals("a?ZQEujs 95:,", option.getDescription());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testToString() throws Throwable  {
      Option option = new Option("", "");
      assertEquals((-1), option.getArgs());
      
      option.setArgs((-2));
      option.toString();
      assertEquals((-2), option.getArgs());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetLongOpt() throws Throwable  {
      Option option = new Option("", true, "");
      assertFalse(option.hasLongOpt());
      
      option.setLongOpt("");
      String string = option.toString();
      assertEquals("[ option:    [ARG] ::  ]", string);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesOptionTaking2ArgumentsAndCallsToString() throws Throwable  {
      Option option = new Option("", "");
      String string = option.toString();
      assertTrue(option.hasArgName());
      assertEquals("[ option:   ::  ]", string);
      assertEquals((-1), option.getArgs());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetValuesReturningNull() throws Throwable  {
      Option option = new Option("", true, "");
      String[] values = option.getValues();
      assertNull(values);
      assertTrue(option.hasArgName());
      assertFalse(option.hasLongOpt());
      assertEquals(1, option.getArgs());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetValuesReturningNonEmptyArray() throws Throwable  {
      Option option = new Option("", true, "");
      option.addValueForProcessing("");
      String[] values = option.getValues();
      assertNotNull(values);
      assertFalse(option.hasLongOpt());
      assertFalse(option.hasValueSeparator());
      assertEquals(1, option.getArgs());
      assertTrue(option.hasArgName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetValueTakingStringReturningNonEmptyString() throws Throwable  {
      Option option = new Option("arg", true, "M!lW{");
      option.addValueForProcessing("M!lW{");
      option.getValue("M!lW{");
      assertFalse(option.hasLongOpt());
      assertEquals(1, option.getArgs());
      assertEquals("M!lW{", option.getDescription());
      assertFalse(option.hasValueSeparator());
      assertTrue(option.hasArgName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetValueTakingIntReturningNull() throws Throwable  {
      Option option = new Option("", true, "");
      option.getValue(526);
      assertFalse(option.hasLongOpt());
      assertEquals(1, option.getArgs());
      assertEquals("arg", option.getArgName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetValueTakingIntReturningEmptyString() throws Throwable  {
      Option option = new Option("", true, "");
      option.addValueForProcessing("");
      String value = option.getValue(0);
      assertFalse(option.hasLongOpt());
      assertTrue(option.hasArg());
      assertFalse(option.hasValueSeparator());
      assertEquals("arg", option.getArgName());
      assertNotNull(value);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetValueTakingStringReturningEmptyString() throws Throwable  {
      Option option = new Option("", "", true, "");
      String value = option.getValue("");
      assertTrue(option.hasArg());
      assertNotNull(value);
      assertTrue(option.hasArgName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetValueTakingNoArgumentsReturningEmptyString() throws Throwable  {
      Option option = new Option("", true, "");
      option.addValueForProcessing("");
      String value = option.getValue();
      assertFalse(option.hasValueSeparator());
      assertFalse(option.hasLongOpt());
      assertEquals("arg", option.getArgName());
      assertNotNull(value);
      assertEquals(1, option.getArgs());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetValuesListReturningListWhereIsEmptyIsFalse() throws Throwable  {
      Option option = new Option("EF", "EF");
      option.setArgs((-1494));
      option.addValueForProcessing("EF");
      option.getValuesList();
      assertEquals((-1494), option.getArgs());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAddValueForProcessingThrowsRuntimeExceptionAndCreatesOptionTaking3Arguments() throws Throwable  {
      Option option = new Option("", true, "");
      option.addValueForProcessing("");
      // Undeclared exception!
      try { 
        option.addValueForProcessing("qph#fVg)Pf8");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot add value, list full.
         //
         verifyException("org.apache.commons.cli.Option", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAddValueForProcessingThrowsRuntimeExceptionAndCreatesOptionTaking2Arguments() throws Throwable  {
      Option option = new Option("", "");
      // Undeclared exception!
      try { 
        option.addValueForProcessing("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // NO_ARGS_ALLOWED
         //
         verifyException("org.apache.commons.cli.Option", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHasValueSeparatorReturningFalse() throws Throwable  {
      Option option = new Option("hjIh", "");
      boolean valueSeparator = option.hasValueSeparator();
      assertFalse(valueSeparator);
      assertEquals((-1), option.getArgs());
      assertFalse(option.hasLongOpt());
      assertTrue(option.hasArgName());
      assertEquals("", option.getDescription());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHasArgsAndSetArgsWithNegative() throws Throwable  {
      Option option = new Option("", "");
      assertFalse(option.hasArgs());
      
      option.setArgs((-2));
      boolean args = option.hasArgs();
      assertEquals((-2), option.getArgs());
      assertTrue(args);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHasArgsReturningFalse() throws Throwable  {
      Option option = new Option("", false, "");
      boolean args = option.hasArgs();
      assertEquals((-1), option.getArgs());
      assertEquals("arg", option.getArgName());
      assertFalse(args);
      assertFalse(option.hasLongOpt());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHasArgsAndSetArgsWithPositive() throws Throwable  {
      Option option = new Option("", "");
      option.setArgs(2747);
      boolean args = option.hasArgs();
      assertEquals(2747, option.getArgs());
      assertTrue(args);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHasArgNameReturningTrue() throws Throwable  {
      Option option = new Option("arg", true, "M!lW{");
      boolean argName = option.hasArgName();
      assertFalse(option.hasLongOpt());
      assertTrue(argName);
      assertEquals(1, option.getArgs());
      assertEquals("M!lW{", option.getDescription());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetArgNameWithNull() throws Throwable  {
      Option option = new Option("arg", true, "M!lW{");
      assertTrue(option.hasArgName());
      
      option.setArgName((String) null);
      boolean argName = option.hasArgName();
      assertFalse(argName);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHasArg() throws Throwable  {
      Option option = new Option("hjIh", "");
      assertFalse(option.hasArgs());
      
      option.setArgs((-2));
      boolean arg = option.hasArg();
      assertTrue(option.hasArgs());
      assertTrue(arg);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHasArgReturningFalse() throws Throwable  {
      Option option = new Option("", "");
      boolean arg = option.hasArg();
      assertFalse(option.hasLongOpt());
      assertEquals((-1), option.getArgs());
      assertEquals("arg", option.getArgName());
      assertFalse(arg);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesOptionTaking3ArgumentsAndCallsHasArg() throws Throwable  {
      Option option = new Option("", true, "");
      boolean arg = option.hasArg();
      assertTrue(arg);
      assertEquals("arg", option.getArgName());
      assertFalse(option.hasLongOpt());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHasLongOptReturningTrue() throws Throwable  {
      Option option = new Option("", true, "");
      assertFalse(option.hasLongOpt());
      
      option.setLongOpt("");
      boolean longOpt = option.hasLongOpt();
      assertTrue(longOpt);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHasLongOptReturningFalse() throws Throwable  {
      Option option = new Option("", true, "");
      boolean longOpt = option.hasLongOpt();
      assertTrue(option.hasArgName());
      assertFalse(longOpt);
      assertTrue(option.hasArg());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetKeyReturningNull() throws Throwable  {
      Option option = new Option((String) null, (String) null, true, "");
      String key = option.getKey();
      assertNull(key);
      assertEquals("arg", option.getArgName());
      assertEquals(1, option.getArgs());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testClearValues() throws Throwable  {
      Option option = new Option("", false, "");
      option.clearValues();
      assertFalse(option.hasLongOpt());
      assertEquals((-1), option.getArgs());
      assertTrue(option.hasArgName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetArgsReturningNegative() throws Throwable  {
      Option option = new Option("", "");
      int args = option.getArgs();
      assertEquals((-1), args);
      assertFalse(option.hasLongOpt());
      assertTrue(option.hasArgName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetLongOptReturningEmptyString() throws Throwable  {
      Option option = new Option("", false, "?u");
      assertFalse(option.hasLongOpt());
      
      option.setLongOpt("");
      option.getLongOpt();
      assertEquals("?u", option.getDescription());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetOptReturningEmptyString() throws Throwable  {
      Option option = new Option("", "");
      option.getOpt();
      assertFalse(option.hasLongOpt());
      assertEquals((-1), option.getArgs());
      assertTrue(option.hasArgName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHasOptionalArgReturningFalse() throws Throwable  {
      Option option = new Option("", true, "");
      option.hasOptionalArg();
      assertFalse(option.hasLongOpt());
      assertTrue(option.hasArgName());
      assertTrue(option.hasArg());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetArgNameWithEmptyString() throws Throwable  {
      Option option = new Option("", "org.apache.commons.cli.Option", false, "org.apache.commons.cli.Option");
      assertEquals("arg", option.getArgName());
      
      option.setArgName("");
      boolean argName = option.hasArgName();
      assertFalse(argName);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetDescription() throws Throwable  {
      Option option = new Option("", false, "");
      option.setDescription("^~|i");
      assertTrue(option.hasArgName());
      assertFalse(option.hasLongOpt());
      assertEquals((-1), option.getArgs());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetTypeReturningNull() throws Throwable  {
      Option option = new Option("ebBQ", "ebBQ");
      option.getType();
      assertEquals((-1), option.getArgs());
      assertTrue(option.hasArgName());
      assertFalse(option.hasLongOpt());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testClone() throws Throwable  {
      Option option = new Option("", "$fP^cQ", true, "bo&&{");
      Option arg0 = (Option)option.clone();
      boolean equals = option.equals(arg0);
      assertEquals("$fP^cQ", arg0.getLongOpt());
      assertTrue(equals);
      assertEquals("bo&&{", arg0.getDescription());
      assertTrue(arg0.hasArgName());
      assertEquals(1, arg0.getArgs());
      assertNotSame(arg0, option);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAddValueThrowsUnsupportedOperationException() throws Throwable  {
      Option option = new Option((String) null, "$fP^cQ", false, "illegal option value '");
      // Undeclared exception!
      try { 
        option.addValue("org.apache.commons.cli.OptionValidator");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. 
         //
         verifyException("org.apache.commons.cli.Option", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetId() throws Throwable  {
      Option option = new Option("hjIh", "");
      assertEquals("hjIh", option.getOpt());
      
      int id = option.getId();
      assertEquals("", option.getDescription());
      assertTrue(option.hasArgName());
      assertEquals(104, id);
      assertFalse(option.hasLongOpt());
      assertEquals((-1), option.getArgs());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetLongOptReturningNull() throws Throwable  {
      Option option = new Option("", false, "?u");
      String longOpt = option.getLongOpt();
      assertNull(longOpt);
      assertEquals("", option.getOpt());
      assertEquals("?u", option.getDescription());
      assertEquals((-1), option.getArgs());
      assertTrue(option.hasArgName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetValuesListReturningListWhereIsEmptyIsTrueAndListWhereSizeIsZero() throws Throwable  {
      Option option = new Option("EF", "EF");
      option.getValuesList();
      assertEquals((-1), option.getArgs());
      assertFalse(option.hasLongOpt());
      assertEquals("arg", option.getArgName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsRequiredReturningFalse() throws Throwable  {
      Option option = new Option("", true, "");
      option.isRequired();
      assertTrue(option.hasArgName());
      assertFalse(option.hasLongOpt());
      assertTrue(option.hasArg());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAddValueForProcessingAndSetArgs() throws Throwable  {
      Option option = new Option(" ", true, " ");
      option.setArgs(2372);
      option.setValueSeparator('h');
      option.addValueForProcessing("qph#fVg)Pf8");
      assertEquals(2372, option.getArgs());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetRequired() throws Throwable  {
      Option option = new Option("", true, "");
      option.setRequired(true);
      boolean required = option.isRequired();
      assertTrue(required);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetOptionalArg() throws Throwable  {
      Option option = new Option("", true, "");
      option.setOptionalArg(true);
      boolean optionalArg = option.hasOptionalArg();
      assertTrue(optionalArg);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetArgNameReturningNonEmptyString() throws Throwable  {
      Option option = new Option((String) null, "$fP^cQ", false, "illegal option value '");
      String argName = option.getArgName();
      assertEquals((-1), option.getArgs());
      assertEquals(36, option.getId());
      assertTrue(option.hasLongOpt());
      assertEquals("arg", argName);
      assertEquals("illegal option value '", option.getDescription());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetDescriptionReturningNull() throws Throwable  {
      Option option = new Option((String) null, false, (String) null);
      option.getDescription();
      assertEquals((-1), option.getArgs());
      assertEquals("arg", option.getArgName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAddValueForProcessing() throws Throwable  {
      Option option = new Option(" ", true, " ");
      option.setValueSeparator('h');
      option.addValueForProcessing("qph#fVg)Pf8");
      assertEquals('h', option.getValueSeparator());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetType() throws Throwable  {
      Option option = new Option("", true, "");
      option.setType("");
      String string = option.toString();
      assertEquals("arg", option.getArgName());
      assertEquals("[ option:   [ARG] ::  ::  ]", string);
  }
}