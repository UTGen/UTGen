/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Wed Mar 20 20:19:24 GMT 2024
 */

package com.sap.managementconsole.soap.axis.sapcontrol;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import com.sap.managementconsole.soap.axis.sapcontrol.J2EEApplicationAlias;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class J2EEApplicationAlias_ESTest extends J2EEApplicationAlias_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetTotalRequestsReturningPositive() throws Throwable  {
      // Arrange
      J2EEApplicationAlias j2EEApplicationAlias = new J2EEApplicationAlias("", "] not found.", 4546, "] not found.", (String) null);
      
      // Act
      int totalRequests = j2EEApplicationAlias.getTotalRequests();
      
      // Assert
      assertEquals(4546, totalRequests);
      assertEquals("", j2EEApplicationAlias.getAppName());
      assertEquals("] not found.", j2EEApplicationAlias.getAlias());
      assertEquals("] not found.", j2EEApplicationAlias.getAppActive());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetTotalRequestsReturningNegative() throws Throwable  {
      // Given a J2EEApplicationAlias object with a total requests value of -1079
      J2EEApplicationAlias j2EEApplicationAlias = new J2EEApplicationAlias();
      j2EEApplicationAlias.setTotalRequests(-1079);
      
      // When the getTotalRequests method is called
      int totalRequests = j2EEApplicationAlias.getTotalRequests();
      
      // Then the value returned should be -1079
      assertEquals(-1079, totalRequests);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetIgnoreCookieReturningNull() throws Throwable  {
      // Given: a new J2EEApplicationAlias instance
      J2EEApplicationAlias j2EEApplicationAlias = new J2EEApplicationAlias();
      
      // When: the getIgnoreCookie method is called
      String ignoreCookie = j2EEApplicationAlias.getIgnoreCookie();
      
      // Then: the returned value should be null
      assertNull(ignoreCookie);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetIgnoreCookieReturningEmptyString() throws Throwable  {
      // Given a J2EEApplicationAlias object with some initialized values
      J2EEApplicationAlias j2EEApplicationAlias = new J2EEApplicationAlias("xsd", "xsd", 1550, "xsd", "");
      
      // When the getIgnoreCookie method is called
      String ignoreCookie = j2EEApplicationAlias.getIgnoreCookie();
      
      // Then the correct value for the ignore cookie should be returned
      assertEquals("", ignoreCookie);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAppNameReturningNull() throws Throwable  {
      // Given: An instance of J2EEApplicationAlias is created
      J2EEApplicationAlias j2EEApplicationAlias = new J2EEApplicationAlias();
      
      // When: The app name is retrieved from the alias
      String appName = j2EEApplicationAlias.getAppName();
      
      // Then: The app name should be null
      assertNull(appName);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAppNameReturningNonEmptyString() throws Throwable  {
      // Given a J2EEApplicationAlias object with some initial values
      J2EEApplicationAlias j2EEApplicationAlias = new J2EEApplicationAlias("_3Ihbne", "_3Ihbne", 0, "_3Ihbne", ".,n[fA-kBq0tg");
      
      // When the appName is retrieved
      String appName = j2EEApplicationAlias.getAppName();
      
      // Then the correct appName value should be returned
      assertEquals("_3Ihbne", appName);
      
      // And the other properties of the J2EEApplicationAlias object should have the expected values
      assertEquals("_3Ihbne", j2EEApplicationAlias.getAppActive());
      assertEquals(".,n[fA-kBq0tg", j2EEApplicationAlias.getIgnoreCookie());
      assertEquals(0, j2EEApplicationAlias.getTotalRequests());
      assertEquals("_3Ihbne", j2EEApplicationAlias.getAlias());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAppActiveReturningNull() throws Throwable  {
      // Test that the getAppActive() method returns null when there is no active application
      J2EEApplicationAlias j2EEApplicationAlias = new J2EEApplicationAlias();
      String appActive = j2EEApplicationAlias.getAppActive();
      assertNull(appActive);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAppActiveReturningEmptyString() throws Throwable  {
      // Given a J2EE application alias with values
      J2EEApplicationAlias j2EEApplicationAlias = new J2EEApplicationAlias("m+Rc-", "9@-S", (-4451), "", "false");
      
      // When the getAppActive method is called
      String appActive = j2EEApplicationAlias.getAppActive();
      
      // Then the return value should be an empty string
      assertEquals("", appActive);
      
      // And the other methods should return their expected values
      assertEquals("false", j2EEApplicationAlias.getIgnoreCookie());
      assertEquals((-4451), j2EEApplicationAlias.getTotalRequests());
      assertEquals("9@-S", j2EEApplicationAlias.getAlias());
      assertEquals("m+Rc-", j2EEApplicationAlias.getAppName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAliasReturningNull() throws Throwable  {
      // Given: A J2EEApplicationAlias object is created and its alias is set to null
      J2EEApplicationAlias j2EEApplicationAlias = new J2EEApplicationAlias();
      j2EEApplicationAlias.setAlias(null);
      
      // When: The getAlias method is called on the J2EEApplicationAlias object
      String alias = j2EEApplicationAlias.getAlias();
      
      // Then: The returned value should be null, which means that the alias has not been set
      assertNull(alias);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAliasReturningNonEmptyString() throws Throwable  {
      J2EEApplicationAlias applicationAlias = new J2EEApplicationAlias("_3Ihbne", "_3Ihbne", 0, "_3Ihbne", ".,n[fA-kBq0tg");
      // Given a J2EEApplicationAlias with an alias and appActive of "_3Ihbne"
      String alias = applicationAlias.getAlias(); // When the getAlias method is called
      assertEquals("_3Ihbne", alias); // Then the alias should be equal to "_3Ihbne"
      
      String appActive = applicationAlias.getAppActive(); // When the getAppActive method is called
      assertEquals("_3Ihbne", appActive); // Then the appActive should be equal to "_3Ihbne"
      
      int totalRequests = applicationAlias.getTotalRequests(); // When the getTotalRequests method is called
      assertEquals(0, totalRequests); // Then the totalRequests should be equal to 0
      
      String appName = applicationAlias.getAppName(); // When the getAppName method is called
      assertEquals("_3Ihbne", appName); // Then the appName should be equal to "_3Ihbne"
      
      String ignoreCookie = applicationAlias.getIgnoreCookie(); // When the getIgnoreCookie method is called
      assertEquals(".,n[fA-kBq0tg", ignoreCookie); // Then the ignoreCookie should be equal to ".,n[fA-kBq0tg"
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAppNameReturningEmptyString() throws Throwable  {
      // Given
      J2EEApplicationAlias j2EEApplicationAlias = new J2EEApplicationAlias("", "]EU0q.+.", (-849), "]EU0q.+.", "]EU0q.+.");
      
      // When
      String appName = j2EEApplicationAlias.getAppName();
      
      // Then
      assertEquals((-849), j2EEApplicationAlias.getTotalRequests());
      assertEquals("]EU0q.+.", j2EEApplicationAlias.getAppActive());
      assertEquals("]EU0q.+.", j2EEApplicationAlias.getAlias());
      assertEquals("", appName);
      assertEquals("]EU0q.+.", j2EEApplicationAlias.getIgnoreCookie());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetIgnoreCookieReturningNonEmptyString() throws Throwable  {
      // Given a J2EEApplicationAlias instance with some initialized values
      J2EEApplicationAlias j2EEApplicationAlias = new J2EEApplicationAlias("_3Ihbne", "_3Ihbne", 0, "_3Ihbne", ".,n[fA-kBq0tg");
      
      // When the getIgnoreCookie() method is called
      String ignoreCookie = j2EEApplicationAlias.getIgnoreCookie();
      
      // Then the ignoreCookie variable should be set to the same value as the instance's ignoreCookie field
      assertEquals(".,n[fA-kBq0tg", ignoreCookie);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAppActiveReturningNonEmptyString() throws Throwable  {
      J2EEApplicationAlias j2EEApplicationAlias = new J2EEApplicationAlias("aliasName", "appName", 0, "activeAppName", "ignoreCookieValue");
      String appActive = j2EEApplicationAlias.getAppActive();
      // Assert that the total requests is 0
      assertEquals(0, j2EEApplicationAlias.getTotalRequests());
      // Assert that the alias name and active app name are equal
      assertEquals("aliasName", j2EEApplicationAlias.getAlias());
      assertEquals("activeAppName", appActive);
      // Assert that the app name and ignore cookie value are equal
      assertEquals("appName", j2EEApplicationAlias.getAppName());
      assertEquals("ignoreCookieValue", j2EEApplicationAlias.getIgnoreCookie());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAliasReturningEmptyString() throws Throwable  {
      // Given: an instance of J2EEApplicationAlias with some test data
      J2EEApplicationAlias j2EEApplicationAlias = new J2EEApplicationAlias("EaxVuis CHH}@_:H]@", "", 1, "", "");
      
      // When: the getAlias method is called
      String alias = j2EEApplicationAlias.getAlias();
      
      // Then: the alias should be equal to the empty string
      assertEquals("", alias);
      
      // And: the appActive, appName, ignoreCookie, and totalRequests should match the test data
      assertEquals("EaxVuis CHH}@_:H]@", j2EEApplicationAlias.getAppActive());
      assertEquals("", j2EEApplicationAlias.getAppName());
      assertEquals("", j2EEApplicationAlias.getIgnoreCookie());
      assertEquals(1, j2EEApplicationAlias.getTotalRequests());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetTotalRequestsReturningZero() throws Throwable  {
      // Given
      J2EEApplicationAlias j2EEApplicationAlias = new J2EEApplicationAlias();
      
      // When
      int totalRequests = j2EEApplicationAlias.getTotalRequests();
      
      // Then
      assertEquals(0, totalRequests);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesJ2EEApplicationAliasTaking5ArgumentsAndCallsHashCode() throws Throwable  {
      // Given a J2EEApplicationAlias instance with the following properties:
      J2EEApplicationAlias j2EEApplicationAlias = new J2EEApplicationAlias("_3Ihbne", "_3Ihbne", 0, "_3Ihbne", ".,n[fA-kBq0tg");
      
      // When the hashCode method is called on the instance:
      int hashCode = j2EEApplicationAlias.hashCode();
      
      // Then the hash code of the instance should be 0:
      assertEquals(0, hashCode);
      
      // And the total requests property should be equal to the expected value:
      assertEquals(0, j2EEApplicationAlias.getTotalRequests());
      
      // And the alias property should be equal to the expected value:
      assertEquals("_3Ihbne", j2EEApplicationAlias.getAlias());
      
      // And the ignoreCookie property should be equal to the expected value:
      assertEquals(".,n[fA-kBq0tg", j2EEApplicationAlias.getIgnoreCookie());
      
      // And the appActive and appName properties should be equal to the expected values:
      assertEquals("_3Ihbne", j2EEApplicationAlias.getAppActive());
      assertEquals("_3Ihbne", j2EEApplicationAlias.getAppName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsAndSetAppActiveAndSetIgnoreCookie() throws Throwable  {
      // Given: Two J2EEApplicationAlias objects, one with the expected values and one with different values
      J2EEApplicationAlias arg0 = new J2EEApplicationAlias();
      J2EEApplicationAlias j2EEApplicationAlias = new J2EEApplicationAlias();
      
      // When: The two objects are compared using the "equals" method
      boolean equals = j2EEApplicationAlias.equals(arg0);
      
      // Then: The two objects should be equal, as they have the same values
      assertTrue(equals);
      
      
      j2EEApplicationAlias.setIgnoreCookie("?{I");
      j2EEApplicationAlias.setAppActive("?{I");
      arg0.setAppActive("?{I");
      equals = j2EEApplicationAlias.equals(arg0);
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsAndSetIgnoreCookie() throws Throwable  {
      // No Comments were added
      J2EEApplicationAlias j2EEApplicationAlias = new J2EEApplicationAlias();
      J2EEApplicationAlias arg0 = new J2EEApplicationAlias();
      assertTrue(arg0.equals((Object)j2EEApplicationAlias));
      
      arg0.setIgnoreCookie("org.apache.axis.encoding.DeserializationContext");
      boolean equals = j2EEApplicationAlias.equals(arg0);
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsAndSetAppActive0() throws Throwable  {
      // Given a J2EEApplicationAlias object "j2EEApplicationAlias" and another object "arg0"
      J2EEApplicationAlias j2EEApplicationAlias = new J2EEApplicationAlias();
      Object arg0 = new Object();
      
      // When we call the equals method on "j2EEApplicationAlias" with "arg0" as an argument, we expect it to return true since both objects are equal
      assertTrue(j2EEApplicationAlias.equals((Object)arg0));
      
      // When we set a property of "j2EEApplicationAlias" called "appActive" to some value and then call the equals method again with "arg0" as an argument, we expect it to return false since the values are not equal
      j2EEApplicationAlias.setAppActive("?{I");
      boolean equals = j2EEApplicationAlias.equals(arg0);
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsAndSetAppActive1() throws Throwable  {
      // Create two J2EEApplicationAlias objects with different values for appActive
      J2EEApplicationAlias arg0 = new J2EEApplicationAlias();
      arg0.setAppActive("t");
      J2EEApplicationAlias other = new J2EEApplicationAlias();
      other.setAppActive("f");
      
      // Test that the objects are not equal
      assertFalse(arg0.equals(other));
      
      // Test that the equals method returns false when comparing an object with itself
      assertFalse(arg0.equals(arg0));
      
      // Test that the getTotalRequests() method returns the expected value
      assertEquals(0, arg0.getTotalRequests());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetTotalRequests() throws Throwable  {
      // Arrange
      J2EEApplicationAlias j2EEApplicationAlias = new J2EEApplicationAlias();
      J2EEApplicationAlias arg0 = new J2EEApplicationAlias();
      
      // Act
      boolean equals = j2EEApplicationAlias.equals(arg0);
      
      // Assert
      assertEquals(0, arg0.getTotalRequests());
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsAndSetAlias0() throws Throwable  {
      // Test that two J2EEApplicationAlias objects are equal if they have the same alias
      J2EEApplicationAlias arg0 = new J2EEApplicationAlias();
      J2EEApplicationAlias j2EEApplicationAlias = new J2EEApplicationAlias();
      assertTrue(j2EEApplicationAlias.equals((Object)arg0));
      
      // Test that two J2EEApplicationAlias objects are not equal if they have different aliases
      j2EEApplicationAlias.setAlias("Q8jHD4 LDw`");
      boolean equals = j2EEApplicationAlias.equals(arg0);
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsAndSetAlias1() throws Throwable  {
      // Given two J2EEApplicationAlias objects, arg0 and j2EEApplicationAlias
      J2EEApplicationAlias arg0 = new J2EEApplicationAlias();
      J2EEApplicationAlias j2EEApplicationAlias = new J2EEApplicationAlias();
      
      // When we set the alias of arg0 to "xsd"
      arg0.setAlias("xsd");
      
      // Then we expect the equals method to return false
      boolean equals = j2EEApplicationAlias.equals(arg0);
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesJ2EEApplicationAliasTaking5ArgumentsAndCallsEquals0() throws Throwable  {
      // Given
      J2EEApplicationAlias j2eeApp1 = new J2EEApplicationAlias("J4dU=yAC$Cb", "J4dU=yAC$Cb", 2433, "J4dU=yAC$Cb", "J4dU=yAC$Cb");
      J2EEApplicationAlias j2eeApp2 = new J2EEApplicationAlias("J4dU=yAC$Cb", "J4dU=yAC$Cb", 2433, "J4dU=yAC$Cb", "J4dU=yAC$Cb");
      
      // When
      boolean equals = j2eeApp1.equals(j2eeApp2);
      
      // Then
      assertEquals(2433, j2eeApp1.getTotalRequests());
      assertTrue(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesJ2EEApplicationAliasTakingNoArgumentsAndCallsEquals0() throws Throwable  {
      // No Comments were added
      J2EEApplicationAlias arg0 = new J2EEApplicationAlias();
      J2EEApplicationAlias j2EEApplicationAlias = new J2EEApplicationAlias();
      boolean equals = j2EEApplicationAlias.equals(arg0);
      assertTrue(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesJ2EEApplicationAliasTaking5ArgumentsAndCallsEquals1() throws Throwable  {
      // No Comments were added
      J2EEApplicationAlias j2EEApplicationAlias = new J2EEApplicationAlias();
      J2EEApplicationAlias arg0 = new J2EEApplicationAlias("Alias", "Alias", 6, "Alias", "Alias");
      boolean equals = j2EEApplicationAlias.equals(arg0);
      assertEquals(6, arg0.getTotalRequests());
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesJ2EEApplicationAliasTaking5ArgumentsAndEqualsAndEqualsReturningTrue() throws Throwable  {
      // Given: A J2EEApplicationAlias object named "j2EEApplicationAlias" with a total of 552 requests and a name "2tH2"
      J2EEApplicationAlias j2EEApplicationAlias = new J2EEApplicationAlias("2tH2", "2tH2", (-552), "2tH2", "2tH2");
      
      // When: The object is compared to another J2EEApplicationAlias object with the same name and total of requests
      J2EEApplicationAlias arg0 = new J2EEApplicationAlias("2tH2", "2tH2", (-552), "2tH2", "2tH2");
      boolean equals = j2EEApplicationAlias.equals(arg0);
      
      // Then: The two objects should be equal and the total requests should match
      assertEquals((-552), arg0.getTotalRequests());
      assertTrue(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesJ2EEApplicationAliasTakingNoArgumentsAndEqualsAndEqualsReturningFalse() throws Throwable  {
      // Given: A J2EEApplicationAlias instance with the default values
      J2EEApplicationAlias j2EEApplicationAlias = new J2EEApplicationAlias();
      
      // When: The equals method is called with a modified string
      boolean actualResult = j2EEApplicationAlias.equals("This is a test string that has been modified");
      
      // Then: The result should be false
      assertFalse(actualResult);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesJ2EEApplicationAliasTakingNoArgumentsAndCallsEquals1() throws Throwable  {
      // Given a J2EEApplicationAlias instance
      J2EEApplicationAlias alias = new J2EEApplicationAlias();
      
      // When the equals method is called with the same instance
      boolean result = alias.equals(alias);
      
      // Then the method returns true
      assertTrue(result);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetDeserializer() throws Throwable  {
      // Given a deserializer instance with no input parameters
      Deserializer deserializer = J2EEApplicationAlias.getDeserializer("", (Class) null, (QName) null);
      
      // When the componentsReady method is called
      boolean ready = deserializer.componentsReady();
      
      // Then it returns false, indicating that the deserializer is not yet ready to deserialize data
      assertFalse(ready);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetAppName() throws Throwable  {
      // Given a J2EE application alias with a name "My Application"
      J2EEApplicationAlias j2EEApplicationAlias = new J2EEApplicationAlias();
      j2EEApplicationAlias.setAppName("My Application");
      
      // When the hashCode method is called on the alias
      int hashCode = j2EEApplicationAlias.hashCode();
      
      // Then the hash code should be 0
      assertEquals(0, hashCode);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetTypeDesc() throws Throwable  {
      // rollbacked to evosuite
      TypeDesc typeDesc = J2EEApplicationAlias.getTypeDesc();
      assertFalse(typeDesc.hasAttributes());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHashCode() throws Throwable  {
      // Given an instance of J2EEApplicationAlias with app active set to 1024
      J2EEApplicationAlias j2EEApplicationAlias = new J2EEApplicationAlias();
      j2EEApplicationAlias.setAppActive("1024");
      
      // When the hashCode method is called on the instance
      int hashCode = j2EEApplicationAlias.hashCode();
      
      // Then the total requests should be equal to 0
      assertEquals(0, j2EEApplicationAlias.getTotalRequests());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetSerializer() throws Throwable  {
      // No Comments were added
      Class<J2EEApplicationAlias> arg1 = J2EEApplicationAlias.class;
      QName arg2 = new QName("1I{j}#b@7X_Z~hc");
      Serializer serializer = J2EEApplicationAlias.getSerializer("1I{j}#b@7X_Z~hc", arg1, arg2);
      assertEquals("Axis SAX Mechanism", serializer.getMechanismType());
  }
}
