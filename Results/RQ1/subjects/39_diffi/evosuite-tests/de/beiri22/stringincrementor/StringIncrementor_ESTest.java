/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Thu Mar 21 00:51:38 GMT 2024
 */

package de.beiri22.stringincrementor;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import de.beiri22.stringincrementor.StringIncrementor;
import de.beiri22.stringincrementor.relativestring.RelativeString;
import de.beiri22.stringincrementor.relativestring.StringLink;
import java.io.InputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class StringIncrementor_ESTest extends StringIncrementor_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testPatchTaking2ArgumentsReturningEmptyString() throws Throwable  {
      // Given: A RelativeString with a null input stream
      RelativeString arg1 = new RelativeString((InputStream) null);
      
      // When: The patch method is called with an empty string and the RelativeString object
      String patch = StringIncrementor.patch("", arg1);
      
      // Then: The patched string should be an empty string
      assertEquals("", patch);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDiffTaking3ArgumentsReturningRelativeStringWhereGetLengthIsZero() throws Throwable  {
      // Given a string with no links
      String input = "";
      
      // When the diff is calculated
      RelativeString diff = StringIncrementor.diff(input, "", false);
      
      // Then the diff should have zero links
      assertEquals(0, diff.linksCount());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testPatchTaking3ArgumentsReturningEmptyString() throws Throwable  {
      // Arrange
      RelativeString arg1 = StringIncrementor.diff("", "");
      String expectedPatch = "";
      
      // Act
      String patch = StringIncrementor.patch("", arg1, true);
      
      // Assert
      assertEquals(expectedPatch, patch);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDiffTaking3ArgumentsWithFalse() throws Throwable  {
      // No Comments were added
      RelativeString diff = StringIncrementor.diff("This is a sample input", "This is another sample input", false);
      assertEquals("This is another", diff.getAbsolute());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testPatchTaking3ArgumentsThrowsStringIndexOutOfBoundsException() throws Throwable  {
      // No Comments were added
      RelativeString arg1 = StringIncrementor.diff("Nd8o%BLW#:6qqn", "Nd8o%BLW#:6qqn");
      StringLink arg0 = new StringLink(11, 11, 1);
      arg1.addLink(arg0);
      // Undeclared exception!
      try { 
        StringIncrementor.patch("Nd8o%BLW#:6qqn", arg1, true);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testPatchTaking2ArgumentsReturningNonEmptyString() throws Throwable  {
      RelativeString arg1 = StringIncrementor.diff("p``exaE2_!2e@/", "p``exaE2_!2e@/");
      // This line generates a relative string representation of the patch between two strings
      String patch = StringIncrementor.patch("p``exaE2_!2e@/", arg1);
      // These lines assert that the patched string is equal to the original string and that the absolute value of the relative string is zero
      assertEquals("p``exaE2_!2e@/", patch);
      assertEquals(0, arg1.getAbsolute());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDiffTaking3ArgumentsWithTrue() throws Throwable  {
      // Arrange
      StringIncrementor incrementor = new StringIncrementor();
      
      // Act
      RelativeString diff = incrementor.diff("zV x)(Sg3lA7JElEm'", "zV x)(Sg3lA7JElEm'", true);
      
      // Assert
      assertEquals("", diff.getAbsolute());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDiffTaking3ArgumentsThrowsArithmeticException() throws Throwable  {
      // Given two strings, "sK/TisceT*eHbr54" and "p``exaE2_!2e@",
      // when we call the StringIncrementor.diff method with the third parameter set to true,
      // then an ArithmeticException should be thrown because of a division by zero error.
      try {
      StringIncrementor.diff("sK/TisceT*eHbr54", "p``exaE2_!2e@", true);
      fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
      //
      // / by zero
      //
      verifyException("de.beiri22.stringincrementor.StringIncrementor", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testPatchTaking3ArgumentsReturningNonEmptyString() throws Throwable  {
      // No Comments were added
      RelativeString arg1 = StringIncrementor.diff("eating index...", "Creating index...");
      String patch = StringIncrementor.patch("eating index...", arg1, false);
      assertEquals("Cr", arg1.getAbsolute());
      assertEquals("Creating index...", patch);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesStringIncrementor() throws Throwable  {
      // rollbacked to evosuite
      StringIncrementor stringIncrementor = new StringIncrementor();
  }
}