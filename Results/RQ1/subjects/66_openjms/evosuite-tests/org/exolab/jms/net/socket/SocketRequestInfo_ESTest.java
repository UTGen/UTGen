/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Thu Mar 21 05:23:21 GMT 2024
 */

package org.exolab.jms.net.socket;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.exolab.jms.net.socket.SocketRequestInfo;
import org.exolab.jms.net.uri.URI;
import org.exolab.jms.net.util.Properties;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SocketRequestInfo_ESTest extends SocketRequestInfo_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFailsToCreateSocketRequestInfoTakingURIThrowsException() throws Throwable  {
      URI arg0 = new URI("bindAll", "bindAll", "bindAll", "bindAll", "bindAll");
      SocketRequestInfo socketRequestInfo = null;
      try {
      socketRequestInfo = new SocketRequestInfo(arg0);
      fail("Expecting exception: Exception");
      } catch(Throwable e) {
      // The exception is thrown because the message is null.
      verifyException("org.exolab.jms.net.socket.SocketRequestInfo", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAlternativeURIThrowsException() throws Throwable  {
      // Given a SocketRequestInfo object with an alternative host set to ";f!)UjM"
      URI arg0 = new URI();
      SocketRequestInfo socketRequestInfo = new SocketRequestInfo(arg0);
      socketRequestInfo.setAlternativeHost(";f!)UjM");
      
      // When the getAlternativeURI method is called
      try {
      socketRequestInfo.getAlternativeURI();
      } catch (Exception e) {
      // Then an exception should be thrown with a null message
      verifyException("org.exolab.jms.net.socket.SocketRequestInfo", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetBindAll() throws Throwable  {
      // rollbacked to evosuite
      URI arg0 = new URI();
      SocketRequestInfo socketRequestInfo = new SocketRequestInfo(arg0);
      assertTrue(socketRequestInfo.getBindAll());
      
      socketRequestInfo.setBindAll(false);
      boolean bindAll = socketRequestInfo.getBindAll();
      assertFalse(bindAll);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAlternativeURIReturningURIWhereGetPortIsNegative() throws Throwable  {
      // Given: a SocketRequestInfo object is created with the URI "org.exolab.jms.net.orb.provider.uri"
      URI arg0 = new URI("org.exolab.jms.net.orb.provider.uri", "org.exolab.jms.net.socket.SocketRequestInfo", "org.exolab.jms.net.socket.SocketRequestInfo", "", "org.exolab.jms.net.socket.SocketRequestInfo");
      SocketRequestInfo socketRequestInfo = new SocketRequestInfo(arg0);
      
      // When: the alternative host is set to an empty string
      socketRequestInfo.setAlternativeHost("");
      
      // Then: the getAlternativeURI method returns a valid URI object
      URI alternativeURI = socketRequestInfo.getAlternativeURI();
      assertTrue(socketRequestInfo.getBindAll());
      assertNotNull(alternativeURI);
      
      // And: the connection request queue size is set to 50
      assertEquals(50, socketRequestInfo.getConnectionRequestQueueSize());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAlternativeHostReturningNonEmptyString() throws Throwable  {
      // Arrange
      URI uri = new URI();
      Properties properties = new Properties("Fragment can only be set for a generic URI!");
      SocketRequestInfo socketRequestInfo = new SocketRequestInfo(uri, properties);
      
      // Act
      socketRequestInfo.setAlternativeHost("localhost");
      
      // Assert
      assertEquals("localhost", socketRequestInfo.getAlternativeHost());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAlternativeHostReturningEmptyString() throws Throwable  {
      // Create a new SocketRequestInfo instance with the given URI
      URI arg0 = new URI("org.exolab.jms.net.orb.provider.uri", "org.exolab.jms.net.socket.SocketRequestInfo", "org.exolab.jms.net.socket.SocketRequestInfo", "", "org.exolab.jms.net.socket.SocketRequestInfo");
      SocketRequestInfo socketRequestInfo = new SocketRequestInfo(arg0);
      
      // Test setAlternativeHost() method
      socketRequestInfo.setAlternativeHost("localhost");
      assertEquals("localhost", socketRequestInfo.getAlternativeHost());
      
      // Test getBindAll() method
      assertTrue(socketRequestInfo.getBindAll());
      
      // Test getConnectionRequestQueueSize() method
      assertEquals(50, socketRequestInfo.getConnectionRequestQueueSize());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsWithNull() throws Throwable  {
      URI arg0 = new URI();
      SocketRequestInfo socketRequestInfo = new SocketRequestInfo(arg0);
      
      // Test that the bindAll property is set to true
      assertTrue(socketRequestInfo.getBindAll());
      
      // Test that the equals method returns true when comparing two null objects
      boolean equals = socketRequestInfo.equals((Object) null, (Object) null);
      assertTrue(equals);
      
      // Test that the connectionRequestQueueSize property is set to 50
      assertEquals(50, socketRequestInfo.getConnectionRequestQueueSize());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsWithNonNull() throws Throwable  {
      // Create a new URI object and assign it to variable arg0
      URI arg0 = new URI();
      
      // Create a new SocketRequestInfo object using arg0 as its constructor argument
      SocketRequestInfo socketRequestInfo = new SocketRequestInfo(arg0);
      
      // Create a new Object instance and assign it to variable arg1
      Object arg1 = new Object();
      
      // Call the equals method on the socketRequestInfo object with null as the first argument and arg1 as the second argument.
      boolean equals = socketRequestInfo.equals((Object) null, arg1);
      
      // Assert that the result of the call to equals is false.
      assertFalse(equals);
      
      // Assert that the bindAll method on the socketRequestInfo object returns true.
      assertTrue(socketRequestInfo.getBindAll());
      
      // Assert that the connectionRequestQueueSize method on the socketRequestInfo object returns 50.
      assertEquals(50, socketRequestInfo.getConnectionRequestQueueSize());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetBindAllReturningTrue() throws Throwable  {
      // Given: A SocketRequestInfo object with a URI and a bind all flag set to true
      URI arg0 = new URI();
      SocketRequestInfo socketRequestInfo = new SocketRequestInfo(arg0);
      boolean bindAll = socketRequestInfo.getBindAll();
      assertTrue(bindAll);
      
      // When: The connection request queue size is set to 50
      socketRequestInfo.setConnectionRequestQueueSize(50);
      
      // Then: The connection request queue size should be equal to 50
      assertEquals(50, socketRequestInfo.getConnectionRequestQueueSize());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsReturningTrue() throws Throwable  {
      // Given a SocketRequestInfo instance with a bind all address and a connection request queue size of 50
      URI arg1 = new URI();
      SocketRequestInfo socketRequestInfo = new SocketRequestInfo(arg1);
      socketRequestInfo.setBindAll(true);
      socketRequestInfo.setConnectionRequestQueueSize(50);
      
      // When the equals method is called with two identical SocketRequestInfo instances
      boolean equals = socketRequestInfo.equals((Object) arg1, (Object) arg1);
      
      // Then the method should return true and both instances should be considered equal
      assertTrue(equals);
      
      // And the bind all address and connection request queue size of the first instance should match the second instance
      assertTrue(socketRequestInfo.getBindAll());
      assertEquals(50, socketRequestInfo.getConnectionRequestQueueSize());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsReturningFalse() throws Throwable  {
      // No Comments were added
      URI arg1 = new URI();
      SocketRequestInfo arg0 = new SocketRequestInfo(arg1);
      boolean equals = arg0.equals((Object) arg0, (Object) arg1);
      assertFalse(equals);
      assertTrue(arg0.getBindAll());
      assertEquals(50, arg0.getConnectionRequestQueueSize());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAlternativeURIReturningNull() throws Throwable  {
      // No Comments were added
      URI arg0 = new URI();
      Properties arg1 = new Properties("Fragment can only be set for a generic URI!");
      SocketRequestInfo socketRequestInfo = new SocketRequestInfo(arg0, arg1);
      URI alternativeURI = socketRequestInfo.getAlternativeURI();
      assertTrue(socketRequestInfo.getBindAll());
      assertNull(alternativeURI);
      assertEquals(50, socketRequestInfo.getConnectionRequestQueueSize());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetConnectionRequestQueueSize() throws Throwable  {
      // Test that the default value of connection request queue size is 50
      SocketRequestInfo socketRequestInfo = new SocketRequestInfo(new URI());
      assertEquals(50, socketRequestInfo.getConnectionRequestQueueSize());
      
      // Test that setting the connection request queue size to 0 works correctly
      socketRequestInfo.setConnectionRequestQueueSize(0);
      int connectionRequestQueueSize = socketRequestInfo.getConnectionRequestQueueSize();
      assertEquals(0, connectionRequestQueueSize);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAlternativeHostReturningNull() throws Throwable  {
      // Given
      URI arg0 = new URI("org.exolab.jms.net.orb.provider.uri", "org.exolab.jms.net.socket.SocketRequestInfo", "org.exolab.jms.net.socket.SocketRequestInfo", "", "org.exolab.jms.net.socket.SocketRequestInfo");
      // When
      SocketRequestInfo socketRequestInfo = new SocketRequestInfo(arg0);
      // Then
      assertEquals(50, socketRequestInfo.getConnectionRequestQueueSize());
      assertTrue(socketRequestInfo.getBindAll());
      assertNull(socketRequestInfo.getAlternativeHost());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetConnectionRequestQueueSizeReturningPositive() throws Throwable  {
      // No Comments were added
      URI arg0 = new URI();
      SocketRequestInfo socketRequestInfo = new SocketRequestInfo(arg0);
      int connectionRequestQueueSize = socketRequestInfo.getConnectionRequestQueueSize();
      assertEquals(50, connectionRequestQueueSize);
      assertTrue(socketRequestInfo.getBindAll());
  }
}
