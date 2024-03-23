/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Wed Mar 20 11:36:52 GMT 2024
 */

package org.scribe.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.scribe.model.Token;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Token_ESTest extends Token_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetSecretReturningNull() throws Throwable  {
      // Given a token with null values for the secret field
      Token token = new Token((String) null, (String) null, (String) null);
      
      // When the getSecret method is called on the token
      String secret = token.getSecret();
      
      // Then the value returned should be null
      assertNull(secret);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetSecretReturningNonEmptyString() throws Throwable  {
      // No Comments were added
      Token token = new Token("h1I:VF' ", ";yS=*v", "8{5$$\"1NL6Qx'o*T'");
      String secret = token.getSecret();
      assertEquals(";yS=*v", secret);
      assertEquals("h1I:VF' ", token.getToken());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetRawResponseReturningNonEmptyString() throws Throwable  {
      // No Comments were added
      Token token = new Token("h1I:VF' ", ";yS=*v", "8{5$$\"1NL6Qx'o*T'");
      String rawResponse = token.getRawResponse();
      assertEquals("h1I:VF' ", token.getToken());
      assertEquals("8{5$$\"1NL6Qx'o*T'", rawResponse);
      assertEquals(";yS=*v", token.getSecret());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetRawResponseThrowsIllegalStateException() throws Throwable  {
      // No Comments were added
      Token token = new Token((String) null, (String) null);
      // Undeclared exception!
      try { 
        token.getRawResponse();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // This token object was not constructed by scribe and does not have a rawResponse
         //
         verifyException("org.scribe.model.Token", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetRawResponseReturningEmptyString() throws Throwable  {
      // Given a Token object with a non-empty string as its identifier
      String identifier = "test";
      Token token = new Token(identifier, "", "");
      
      // When the getRawResponse method is called on that token object
      String rawResponse = token.getRawResponse();
      
      // Then the method should return an empty string as it has not been set yet
      assertEquals("", rawResponse);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testToString() throws Throwable  {
      // No Comments were added
      Token token = new Token((String) null, (String) null, (String) null);
      String string = token.toString();
      assertEquals("Token[null , null]", string);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetSecretReturningEmptyString() throws Throwable  {
      // Arrange
      Token token = new Token("", "", "");
      
      // Act
      String secret = token.getSecret();
      
      // Assert
      assertEquals("", secret);
  }
}