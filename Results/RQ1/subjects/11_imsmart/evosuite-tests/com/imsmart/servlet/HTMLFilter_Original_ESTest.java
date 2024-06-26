/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Wed Mar 20 20:29:54 GMT 2024
 */

package com.imsmart.servlet;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import com.imsmart.servlet.HTMLFilter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class HTMLFilter_Original_ESTest extends HTMLFilter_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFilterReturningNonEmptyString() throws Throwable  {
      String filter = HTMLFilter.filter(">3p)Z^$YJiq|8z{|Y");
      assertEquals("&gt;3p)Z^$YJiq|8z{|Y", filter);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFilterWithNonEmptyString() throws Throwable  {
      String filter = HTMLFilter.filter("[.m<O!aR3");
      assertEquals("[.m&lt;O!aR3", filter);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFilter0() throws Throwable  {
      String filter = HTMLFilter.filter("W\"_*18jy,0zDi*bp");
      assertEquals("W&quot;_*18jy,0zDi*bp", filter);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFilter1() throws Throwable  {
      String filter = HTMLFilter.filter("&lt;");
      assertEquals("&amp;lt;", filter);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFilterReturningNull() throws Throwable  {
      String filter = HTMLFilter.filter((String) null);
      assertNull(filter);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFilterReturningEmptyString() throws Throwable  {
      String filter = HTMLFilter.filter("");
      assertEquals("", filter);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesHTMLFilter() throws Throwable  {
      HTMLFilter hTMLFilter = new HTMLFilter();
  }
}
