/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Wed Mar 20 11:16:41 GMT 2024
 */

package org.scribe.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.scribe.model.OAuthConfig;
import org.scribe.model.SignatureType;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class OAuthConfig_ESTest extends OAuthConfig_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetScopeReturningNull() throws Throwable  {
      // Given an OAuthConfig instance with null values for the callback and scope parameters
      OAuthConfig oAuthConfig = new OAuthConfig("ENUM$VALUES", (String) null);
      
      // When we call the getScope method on this instance
      String scope = oAuthConfig.getScope();
      
      // Then the returned value should be null
      assertNull(scope);
      
      // And when we call the getCallback method on this instance
      assertEquals("oob", oAuthConfig.getCallback());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetScopeReturningEmptyString() throws Throwable  {
      // Test that the OAuthConfig class is initialized with the correct parameters
      SignatureType arg3 = SignatureType.QueryString;
      OAuthConfig oAuthConfig = new OAuthConfig("{=N", "", "", arg3, "");
      
      // Test that the scope is empty string
      assertEquals("", oAuthConfig.getScope());
      
      // Test that the apiKey is correct
      assertEquals("{=N", oAuthConfig.getApiKey());
      
      // Test that the signatureType is QueryString
      assertEquals(SignatureType.QueryString, oAuthConfig.getSignatureType());
      
      // Test that the callback is empty string
      assertEquals("", oAuthConfig.getCallback());
      
      // Test that the apiSecret is empty string
      assertEquals("", oAuthConfig.getApiSecret());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetCallbackReturningNonEmptyString() throws Throwable  {
      // Set up an OAuth configuration object with some sample data
      OAuthConfig oAuthConfig = new OAuthConfig("", "28}+", "28}+", SignatureType.Header, "28}+");
      
      // Get the callback URL from the OAuth configuration object
      String callback = oAuthConfig.getCallback();
      
      // Assert that the API secret is set to the expected value
      assertEquals("28}+", oAuthConfig.getApiSecret());
      
      // Assert that the scope is set to the expected value
      assertEquals("28}+", oAuthConfig.getScope());
      
      // Assert that the callback URL is set to the expected value
      assertEquals("28}+", callback);
      
      // Assert that the API key is not set (as it is not required for this test)
      assertEquals("", oAuthConfig.getApiKey());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetApiSecretReturningNull() throws Throwable  {
      // Create an instance of OAuthConfig with the ENUM$VALUES value for apiKey and null for apiSecret
      OAuthConfig oAuthConfig = new OAuthConfig("ENUM$VALUES", (String) null);
      
      // Verify that the configuration does not have any scope defined
      assertFalse(oAuthConfig.hasScope());
      
      // Verify that the callback URL is set to "oob"
      assertEquals("oob", oAuthConfig.getCallback());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetApiSecretReturningNonEmptyString() throws Throwable  {
      // Given an OAuth configuration object with some pre-defined values
      SignatureType arg3 = SignatureType.Header;
      OAuthConfig oAuthConfig = new OAuthConfig("", "28}+", "28}+", arg3, "28}+");
      
      // When the API secret is retrieved from the configuration object
      String apiSecret = oAuthConfig.getApiSecret();
      
      // Then the value of the API secret should be the same as the one provided in the constructor
      assertEquals("28}+", apiSecret);
      
      // And the scope, callback, and API key should all be empty strings
      assertEquals("", oAuthConfig.getScope());
      assertEquals("", oAuthConfig.getCallback());
      assertEquals("", oAuthConfig.getApiKey());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetApiKeyReturningNonEmptyString() throws Throwable  {
      // Given an OAuthConfig object with query string signature type
      SignatureType signatureType = SignatureType.QueryString;
      OAuthConfig oAuthConfig = new OAuthConfig("{=N", "", "", signatureType, "");
      
      // When the api key is retrieved
      String apiKey = oAuthConfig.getApiKey();
      
      // Then the api key should be equal to "{=N"
      assertEquals("{=N", apiKey);
      
      // And the callback should be empty
      assertEquals("", oAuthConfig.getCallback());
      
      // And the signature type should be query string
      assertEquals(SignatureType.QueryString, oAuthConfig.getSignatureType());
      
      // And the scope should be empty
      assertEquals("", oAuthConfig.getScope());
      
      // And the api secret should be empty
      assertEquals("", oAuthConfig.getApiSecret());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetApiKeyReturningEmptyString() throws Throwable  {
      // No Comments were added
      SignatureType arg3 = SignatureType.Header;
      OAuthConfig oAuthConfig = new OAuthConfig("", "28}+", "28}+", arg3, "28}+");
      String apiKey = oAuthConfig.getApiKey();
      assertEquals("28}+", oAuthConfig.getApiSecret());
      assertEquals("28}+", oAuthConfig.getCallback());
      assertEquals("28}+", oAuthConfig.getScope());
      assertEquals("", apiKey);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHasScopeReturningTrue() throws Throwable  {
      // Given a new OAuthConfig instance with some pre-defined values
      SignatureType signatureType = SignatureType.Header;
      OAuthConfig oAuthConfig = new OAuthConfig("clientId", "clientSecret", "", signatureType, "Tu4hD1g[S");
      
      // When the hasScope method is called on the config instance
      boolean scope = oAuthConfig.hasScope();
      
      // Then the return value should be true, and the scope should be set to the pre-defined value
      assertTrue(scope);
      assertEquals("Tu4hD1g[S", oAuthConfig.getScope());
      
      // When the callback method is called on the config instance
      String callback = oAuthConfig.getCallback();
      
      // Then the return value should be an empty string, as the callback is not set
      assertEquals("", callback);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHasScopeReturningFalse() throws Throwable  {
      // Given a new OAuth configuration with an out-of-band callback URL
      OAuthConfig oAuthConfig = new OAuthConfig("oob", "oob");
      
      // When checking if the configuration has any scope
      boolean scope = oAuthConfig.hasScope();
      
      // Then it should return false, as there are no scopes defined
      assertFalse(scope);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetCallbackReturningEmptyString() throws Throwable  {
      // Given
      SignatureType arg3 = SignatureType.Header;
      OAuthConfig oAuthConfig = new OAuthConfig((String) null, "", "", arg3, "Tu4hD1g[S");
      
      // When
      String callback = oAuthConfig.getCallback();
      boolean hasScope = oAuthConfig.hasScope();
      String scope = oAuthConfig.getScope();
      String apiSecret = oAuthConfig.getApiSecret();
      
      // Then
      assertTrue(hasScope);
      assertNotNull(callback);
      assertEquals("", callback);
      assertEquals("Tu4hD1g[S", scope);
      assertEquals("", apiSecret);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetScopeReturningNonEmptyString() throws Throwable  {
      // Given
      String apiSecret = "";
      String callback = "";
      SignatureType signatureType = SignatureType.Header;
      OAuthConfig oAuthConfig = new OAuthConfig(apiSecret, "", "", signatureType, "Tu4hD1g[S");
      
      // When
      String scope = oAuthConfig.getScope();
      
      // Then
      assertEquals("", oAuthConfig.getApiSecret());
      assertNotNull(scope);
      assertEquals("Tu4hD1g[S", scope);
      assertEquals("", oAuthConfig.getCallback());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetApiKeyReturningNull() throws Throwable  {
      // rollbacked to evosuite
      SignatureType arg3 = SignatureType.Header;
      OAuthConfig oAuthConfig = new OAuthConfig((String) null, "", "", arg3, "Tu4hD1g[S");
      String apiKey = oAuthConfig.getApiKey();
      assertTrue(oAuthConfig.hasScope());
      assertEquals("", oAuthConfig.getCallback());
      assertEquals("Tu4hD1g[S", oAuthConfig.getScope());
      assertEquals("", oAuthConfig.getApiSecret());
      assertNull(apiKey);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetApiSecretReturningEmptyString() throws Throwable  {
      // Arrange
      String callback = "";
      SignatureType signatureType = SignatureType.Header;
      OAuthConfig oAuthConfig = new OAuthConfig(null, "", callback, signatureType, "Tu4hD1g[S");
      
      // Act
      String apiSecret = oAuthConfig.getApiSecret();
      
      // Assert
      assertEquals("", oAuthConfig.getCallback());
      assertTrue(oAuthConfig.hasScope());
      assertNotNull(apiSecret);
      assertEquals("Tu4hD1g[S", oAuthConfig.getScope());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetSignatureType() throws Throwable  {
      // rollbacked to evosuite
      OAuthConfig oAuthConfig = new OAuthConfig(")56$EA%C||c}V3", ")56$EA%C||c}V3");
      oAuthConfig.getSignatureType();
      assertFalse(oAuthConfig.hasScope());
      assertEquals("oob", oAuthConfig.getCallback());
  }
}
