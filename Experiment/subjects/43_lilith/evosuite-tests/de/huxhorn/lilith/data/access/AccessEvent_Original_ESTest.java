/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Thu Mar 21 01:47:09 GMT 2024
 */

package de.huxhorn.lilith.data.access;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import de.huxhorn.lilith.data.access.AccessEvent;
import de.huxhorn.lilith.data.access.LoggerContext;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AccessEvent_Original_ESTest extends AccessEvent_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetTimeStampReturningZero() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      Long arg0 = new Long(0L);
      accessEvent.setTimeStamp(arg0);
      Long timeStamp = accessEvent.getTimeStamp();
      assertEquals(0L, (long)timeStamp);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetTimeStampReturningPositive() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      Long arg0 = new Long(2138L);
      accessEvent.setTimeStamp(arg0);
      Long timeStamp = accessEvent.getTimeStamp();
      assertEquals(2138L, (long)timeStamp);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetTimeStampReturningNegative() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      Long arg0 = new Long((-1L));
      accessEvent.setTimeStamp(arg0);
      Long timeStamp = accessEvent.getTimeStamp();
      assertEquals((-1L), (long)timeStamp);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetStatusCodeReturningPositive() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      accessEvent.setStatusCode(3209);
      int statusCode = accessEvent.getStatusCode();
      assertEquals(3209, statusCode);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetStatusCodeReturningNegative() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      accessEvent.setStatusCode((-1));
      int statusCode = accessEvent.getStatusCode();
      assertEquals((-1), statusCode);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetServerNameReturningNonEmptyString() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      accessEvent.setServerName(", birthTime=");
      String serverName = accessEvent.getServerName();
      assertEquals(", birthTime=", serverName);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetResponseHeadersReturningMapWhereIsEmptyIsTrue() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      HashMap<String, String> arg0 = new HashMap<String, String>();
      accessEvent.setResponseHeaders(arg0);
      Map<String, String> responseHeaders = accessEvent.getResponseHeaders();
      assertEquals(0, responseHeaders.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetResponseHeadersReturningMapWhereIsEmptyIsFalse() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      HashMap<String, String> arg0 = new HashMap<String, String>();
      arg0.put((String) null, "");
      accessEvent.setResponseHeaders(arg0);
      Map<String, String> responseHeaders = accessEvent.getResponseHeaders();
      assertEquals(1, responseHeaders.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetRequestURLReturningNonEmptyString() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      accessEvent.setRequestURL("LoggerContext[name=");
      String requestURL = accessEvent.getRequestURL();
      assertEquals("LoggerContext[name=", requestURL);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetRequestURIReturningNonEmptyString() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      accessEvent.setRequestURI(", birthTime=");
      String requestURI = accessEvent.getRequestURI();
      assertEquals(", birthTime=", requestURI);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetRequestParametersReturningMapWhereIsEmptyIsFalse() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      HashMap<String, String[]> arg0 = new HashMap<String, String[]>();
      String[] arg1 = new String[0];
      arg0.put((String) null, arg1);
      accessEvent.setRequestParameters(arg0);
      Map<String, String[]> requestParameters = accessEvent.getRequestParameters();
      assertFalse(requestParameters.isEmpty());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetRequestHeadersReturningMapWhereIsEmptyIsFalse() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      HashMap<String, String> arg0 = new HashMap<String, String>();
      arg0.put(", birthTime=", ", birthTime=");
      accessEvent.setRequestHeaders(arg0);
      Map<String, String> requestHeaders = accessEvent.getRequestHeaders();
      assertEquals(1, requestHeaders.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetRemoteUserReturningNonEmptyString() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      accessEvent.setRemoteUser("Uy{");
      String remoteUser = accessEvent.getRemoteUser();
      assertEquals("Uy{", remoteUser);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetRemoteHostReturningNonEmptyString() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      accessEvent.setRemoteHost("{0;n_sJW!oj,=i>c9$O");
      String remoteHost = accessEvent.getRemoteHost();
      assertEquals("{0;n_sJW!oj,=i>c9$O", remoteHost);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetRemoteAddressReturningNonEmptyString() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      accessEvent.setRemoteAddress("AccessEvent[loggerContext=null, timeStamp=null]");
      String remoteAddress = accessEvent.getRemoteAddress();
      assertEquals("AccessEvent[loggerContext=null, timeStamp=null]", remoteAddress);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetProtocolReturningEmptyString() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      accessEvent.setProtocol("");
      String protocol = accessEvent.getProtocol();
      assertEquals("", protocol);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetMethodReturningNonEmptyString() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      accessEvent.setMethod("V");
      String method = accessEvent.getMethod();
      assertEquals("V", method);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetMethodReturningEmptyString() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      accessEvent.setMethod("");
      String method = accessEvent.getMethod();
      assertEquals("", method);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetLoggerContextReturningNonNull() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      LoggerContext arg0 = new LoggerContext();
      accessEvent.setLoggerContext(arg0);
      LoggerContext loggerContext = accessEvent.getLoggerContext();
      assertNull(loggerContext.getName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetLocalPortReturningPositive() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      accessEvent.setLocalPort(500);
      int localPort = accessEvent.getLocalPort();
      assertEquals(500, localPort);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHashCodeAndSetRemoteAddress() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      accessEvent.setRemoteAddress("loggerContext=");
      accessEvent.hashCode();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHashCodeAndSetServerName() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      accessEvent.setServerName("de.huxhorn.lilith.data.access.AccessEvent");
      accessEvent.hashCode();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHashCodeAndSetProtocol() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      accessEvent.setProtocol("AccessEvent[loggerContext=null, timeStamp=null]");
      accessEvent.hashCode();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHashCodeAndSetRemoteUser() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      accessEvent.setRemoteUser("AccessEvent[loggerContext=null, timeStamp=null]");
      accessEvent.hashCode();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHashCodeAndSetRemoteHost() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      accessEvent.setRemoteHost("@E0QKm25thB");
      accessEvent.hashCode();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHashCodeAndSetRequestURL() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      accessEvent.setRequestURL("]");
      accessEvent.hashCode();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHashCodeAndSetRequestURI() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      accessEvent.setRequestURI(", birthTime=");
      accessEvent.hashCode();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetLoggerContext() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      LoggerContext arg0 = new LoggerContext();
      accessEvent.setLoggerContext(arg0);
      accessEvent.hashCode();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetTimeStamp() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      Long arg0 = new Long(0L);
      accessEvent.setTimeStamp(arg0);
      accessEvent.hashCode();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsAndSetRemoteUserAndSetServerName() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      accessEvent.setRemoteUser("I]");
      AccessEvent arg0 = new AccessEvent();
      arg0.setServerName("I]");
      arg0.setRemoteUser("I]");
      boolean equals = accessEvent.equals(arg0);
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetServerNameWithEmptyString() throws Throwable  {
      AccessEvent arg0 = new AccessEvent();
      AccessEvent accessEvent = new AccessEvent();
      arg0.setServerName("");
      assertFalse(arg0.equals((Object)accessEvent));
      
      accessEvent.setServerName("");
      boolean equals = accessEvent.equals(arg0);
      assertTrue(arg0.equals((Object)accessEvent));
      assertTrue(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsAndSetServerName() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      accessEvent.setServerName("hQ6[i?~?");
      AccessEvent arg0 = new AccessEvent();
      boolean equals = accessEvent.equals(arg0);
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsAndSetRequestURL0() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      AccessEvent arg0 = new AccessEvent();
      assertTrue(arg0.equals((Object)accessEvent));
      
      arg0.setRequestURL("g3");
      boolean equals = accessEvent.equals(arg0);
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsAndSetRequestURLAndEqualsReturningTrue() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      accessEvent.setRequestURL("jR");
      AccessEvent arg0 = new AccessEvent();
      assertFalse(arg0.equals((Object)accessEvent));
      
      arg0.setRequestURL("jR");
      boolean equals = accessEvent.equals(arg0);
      assertTrue(arg0.equals((Object)accessEvent));
      assertTrue(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsAndSetRequestURL1() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      accessEvent.setRequestURL("jR");
      AccessEvent arg0 = new AccessEvent();
      boolean equals = accessEvent.equals(arg0);
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsAndSetRequestURI0() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      AccessEvent arg0 = new AccessEvent();
      assertTrue(arg0.equals((Object)accessEvent));
      
      arg0.setRequestURI("3`H!B Au+W");
      boolean equals = accessEvent.equals(arg0);
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsAndSetRequestURIAndEqualsReturningTrue() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      AccessEvent arg0 = new AccessEvent();
      arg0.setRequestURI("Uy{");
      assertFalse(arg0.equals((Object)accessEvent));
      
      accessEvent.setRequestURI("Uy{");
      boolean equals = accessEvent.equals(arg0);
      assertTrue(arg0.equals((Object)accessEvent));
      assertTrue(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsAndSetRequestURI1() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      accessEvent.setRequestURI("loggerContext=");
      AccessEvent arg0 = new AccessEvent();
      boolean equals = accessEvent.equals(arg0);
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsAndSetRemoteUser0() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      AccessEvent arg0 = new AccessEvent();
      assertTrue(arg0.equals((Object)accessEvent));
      
      arg0.setRemoteUser("=U?");
      boolean equals = accessEvent.equals(arg0);
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsAndSetRemoteUser1() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      accessEvent.setRemoteUser("I]");
      AccessEvent arg0 = new AccessEvent();
      boolean equals = accessEvent.equals(arg0);
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsAndSetRemoteHost0() throws Throwable  {
      AccessEvent arg0 = new AccessEvent();
      AccessEvent accessEvent = new AccessEvent();
      assertTrue(accessEvent.equals((Object)arg0));
      
      arg0.setRemoteHost("yG`&Xib:9**&");
      boolean equals = accessEvent.equals(arg0);
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsAndSetRemoteHostAndEqualsReturningTrue() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      accessEvent.setRemoteHost("^");
      AccessEvent arg0 = new AccessEvent();
      assertFalse(arg0.equals((Object)accessEvent));
      
      arg0.setRemoteHost("^");
      boolean equals = accessEvent.equals(arg0);
      assertTrue(arg0.equals((Object)accessEvent));
      assertTrue(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsAndSetRemoteHost1() throws Throwable  {
      AccessEvent arg0 = new AccessEvent();
      AccessEvent accessEvent = new AccessEvent();
      assertTrue(accessEvent.equals((Object)arg0));
      
      accessEvent.setRemoteHost("yG`&Xib:9**&");
      boolean equals = accessEvent.equals(arg0);
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsAndSetRemoteAddress0() throws Throwable  {
      AccessEvent arg0 = new AccessEvent();
      arg0.setRemoteAddress("Uy{");
      AccessEvent accessEvent = new AccessEvent();
      boolean equals = accessEvent.equals(arg0);
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsAndSetRemoteAddressAndEqualsReturningTrue() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      accessEvent.setRemoteAddress("hQ6[i?~?");
      AccessEvent arg0 = new AccessEvent();
      assertFalse(arg0.equals((Object)accessEvent));
      
      arg0.setRemoteAddress("hQ6[i?~?");
      boolean equals = accessEvent.equals(arg0);
      assertTrue(arg0.equals((Object)accessEvent));
      assertTrue(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsAndSetRemoteAddress1() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      accessEvent.setRemoteAddress("hQ6[i?~?");
      AccessEvent arg0 = new AccessEvent();
      boolean equals = accessEvent.equals(arg0);
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsAndSetProtocol0() throws Throwable  {
      AccessEvent arg0 = new AccessEvent();
      arg0.setProtocol("NaqduIEMPQHmw");
      AccessEvent accessEvent = new AccessEvent();
      boolean equals = accessEvent.equals(arg0);
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsAndSetProtocolAndEqualsReturningTrue() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      accessEvent.setProtocol("NaqduIEMPQHmw");
      AccessEvent arg0 = new AccessEvent();
      assertFalse(arg0.equals((Object)accessEvent));
      
      arg0.setProtocol("NaqduIEMPQHmw");
      boolean equals = accessEvent.equals(arg0);
      assertTrue(arg0.equals((Object)accessEvent));
      assertTrue(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsAndSetProtocol1() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      accessEvent.setProtocol("NaqduIEMPQHmw");
      AccessEvent arg0 = new AccessEvent();
      boolean equals = accessEvent.equals(arg0);
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsAndSetMethod0() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      AccessEvent arg0 = new AccessEvent();
      assertTrue(arg0.equals((Object)accessEvent));
      
      arg0.setMethod("jR");
      boolean equals = accessEvent.equals(arg0);
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsAndSetMethodAndEqualsReturningTrue() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      accessEvent.setMethod("`e");
      AccessEvent arg0 = new AccessEvent();
      assertFalse(arg0.equals((Object)accessEvent));
      
      arg0.setMethod("`e");
      boolean equals = accessEvent.equals(arg0);
      assertTrue(arg0.equals((Object)accessEvent));
      assertTrue(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsAndSetMethod1() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      accessEvent.setMethod("`e");
      AccessEvent arg0 = new AccessEvent();
      boolean equals = accessEvent.equals(arg0);
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetLocalPort() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      AccessEvent arg0 = new AccessEvent();
      arg0.setLocalPort((-1396));
      boolean equals = accessEvent.equals(arg0);
      assertEquals((-1396), arg0.getLocalPort());
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEquals() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      boolean equals = accessEvent.equals("yS_z6:");
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsWithNull() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      boolean equals = accessEvent.equals((Object) null);
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsAndEqualsReturningTrue() throws Throwable  {
      AccessEvent arg0 = new AccessEvent();
      boolean equals = arg0.equals(arg0);
      assertTrue(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetMethodWithEmptyString() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      accessEvent.setMethod("");
      accessEvent.hashCode();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetRemoteAddressReturningEmptyString() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      accessEvent.setRemoteAddress("");
      String remoteAddress = accessEvent.getRemoteAddress();
      assertEquals("", remoteAddress);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetRequestURIReturningNull() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      String requestURI = accessEvent.getRequestURI();
      assertNull(requestURI);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetMethodReturningNull() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      String method = accessEvent.getMethod();
      assertNull(method);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetTimeStampReturningNull() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      Long timeStamp = accessEvent.getTimeStamp();
      assertNull(timeStamp);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetRemoteAddressReturningNull() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      String remoteAddress = accessEvent.getRemoteAddress();
      assertNull(remoteAddress);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetServerNameReturningEmptyString() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      accessEvent.setServerName("");
      String serverName = accessEvent.getServerName();
      assertEquals("", serverName);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetRemoteUserReturningEmptyString() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      accessEvent.setRemoteUser("");
      String remoteUser = accessEvent.getRemoteUser();
      assertEquals("", remoteUser);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetLoggerContextReturningNull() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      LoggerContext loggerContext = accessEvent.getLoggerContext();
      assertNull(loggerContext);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetRequestURIReturningEmptyString() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      accessEvent.setRequestURI("");
      String requestURI = accessEvent.getRequestURI();
      assertEquals("", requestURI);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetResponseHeadersReturningNull() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      Map<String, String> responseHeaders = accessEvent.getResponseHeaders();
      assertNull(responseHeaders);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetStatusCodeReturningZero() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      int statusCode = accessEvent.getStatusCode();
      assertEquals(0, statusCode);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetProtocolReturningNonEmptyString() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      accessEvent.setProtocol(" 7SE8OQk[M('");
      String protocol = accessEvent.getProtocol();
      assertEquals(" 7SE8OQk[M('", protocol);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetRemoteHostReturningNull() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      String remoteHost = accessEvent.getRemoteHost();
      assertNull(remoteHost);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetRequestURLReturningNull() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      String requestURL = accessEvent.getRequestURL();
      assertNull(requestURL);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetRequestHeadersReturningNull() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      Map<String, String> requestHeaders = accessEvent.getRequestHeaders();
      assertNull(requestHeaders);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetRequestHeadersReturningMapWhereIsEmptyIsTrue() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      HashMap<String, String> arg0 = new HashMap<String, String>();
      accessEvent.setRequestHeaders(arg0);
      Map<String, String> requestHeaders = accessEvent.getRequestHeaders();
      assertTrue(requestHeaders.isEmpty());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetProtocolReturningNull() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      String protocol = accessEvent.getProtocol();
      assertNull(protocol);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetLocalPortReturningNegative() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      accessEvent.setLocalPort((-2214));
      int localPort = accessEvent.getLocalPort();
      assertEquals((-2214), localPort);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetServerNameReturningNull() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      String serverName = accessEvent.getServerName();
      assertNull(serverName);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetRequestParametersReturningMapWhereIsEmptyIsTrue() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      HashMap<String, String[]> arg0 = new HashMap<String, String[]>();
      accessEvent.setRequestParameters(arg0);
      Map<String, String[]> requestParameters = accessEvent.getRequestParameters();
      assertEquals(0, requestParameters.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetRequestURLReturningEmptyString() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      accessEvent.setRequestURL("");
      String requestURL = accessEvent.getRequestURL();
      assertEquals("", requestURL);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetLocalPortReturningZero() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      int localPort = accessEvent.getLocalPort();
      assertEquals(0, localPort);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetRequestParametersReturningNull() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      Map<String, String[]> requestParameters = accessEvent.getRequestParameters();
      assertNull(requestParameters);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetRemoteHostReturningEmptyString() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      accessEvent.setRemoteHost("");
      String remoteHost = accessEvent.getRemoteHost();
      assertEquals("", remoteHost);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testToString() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      String string = accessEvent.toString();
      assertEquals("AccessEvent[loggerContext=null, timeStamp=null]", string);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetRemoteUserReturningNull() throws Throwable  {
      AccessEvent accessEvent = new AccessEvent();
      String remoteUser = accessEvent.getRemoteUser();
      assertNull(remoteUser);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetStatusCode() throws Throwable  {
      AccessEvent arg0 = new AccessEvent();
      arg0.setStatusCode((-1));
      AccessEvent accessEvent = new AccessEvent();
      boolean equals = accessEvent.equals(arg0);
      assertEquals((-1), arg0.getStatusCode());
      assertFalse(equals);
  }
}