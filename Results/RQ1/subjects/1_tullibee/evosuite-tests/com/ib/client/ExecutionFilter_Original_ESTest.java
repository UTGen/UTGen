/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Wed Mar 20 19:41:40 GMT 2024
 */

package com.ib.client;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import com.ib.client.ExecutionFilter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ExecutionFilter_Original_ESTest extends ExecutionFilter_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesExecutionFilterTaking7ArgumentsAndEqualsReturningTrue() throws Throwable  {
      ExecutionFilter executionFilter = new ExecutionFilter(0, "", "", "", "", "", "");
      ExecutionFilter arg0 = new ExecutionFilter(0, "", "", "", "", "", "");
      boolean equals = executionFilter.equals(arg0);
      assertEquals(0, arg0.m_clientId);
      assertTrue(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesExecutionFilterTaking7Arguments0() throws Throwable  {
      ExecutionFilter executionFilter = new ExecutionFilter(0, "", "", "", "", "", "q e(lo>0");
      executionFilter.m_exchange = "?fwynaa";
      ExecutionFilter arg0 = new ExecutionFilter(0, "", "", "", "", "", "");
      boolean equals = executionFilter.equals(arg0);
      assertFalse(equals);
      assertEquals(0, arg0.m_clientId);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesExecutionFilterTaking7Arguments1() throws Throwable  {
      ExecutionFilter executionFilter = new ExecutionFilter(0, "", "", "?Fwy=AE", "", (String) null, "q e(lo>0");
      ExecutionFilter arg0 = new ExecutionFilter(0, "", "", "?Fwy=AE", "?Fwy=AE", "?Fwy=AE", (String) null);
      executionFilter.equals(arg0);
      assertEquals(0, arg0.m_clientId);
      assertEquals(0, executionFilter.m_clientId);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesExecutionFilterTaking7Arguments2() throws Throwable  {
      ExecutionFilter executionFilter = new ExecutionFilter(0, "", "", "?Fwy=AE", "", (String) null, "");
      ExecutionFilter arg0 = new ExecutionFilter(0, "", "", (String) null, "?Fwy=AE", (String) null, "");
      boolean equals = executionFilter.equals(arg0);
      assertFalse(equals);
      assertEquals(0, arg0.m_clientId);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesExecutionFilterTakingNoArgumentsAndCreatesExecutionFilterTaking7Arguments0() throws Throwable  {
      ExecutionFilter arg0 = new ExecutionFilter();
      arg0.m_acctCode = "";
      ExecutionFilter executionFilter = new ExecutionFilter(0, "", "", "?Fwy=AE", "", (String) null, "");
      boolean equals = executionFilter.equals(arg0);
      assertFalse(equals);
      assertEquals(0, arg0.m_clientId);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesExecutionFilterTakingNoArgumentsAndCreatesExecutionFilterTaking7Arguments1() throws Throwable  {
      ExecutionFilter arg0 = new ExecutionFilter();
      ExecutionFilter executionFilter = new ExecutionFilter(0, "", "", "", "", "", "q e(lo>0");
      boolean equals = executionFilter.equals(arg0);
      assertFalse(equals);
      assertEquals(0, executionFilter.m_clientId);
      assertEquals(0, arg0.m_clientId);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesExecutionFilterTakingNoArgumentsAndCreatesExecutionFilterTaking7Arguments2() throws Throwable  {
      ExecutionFilter executionFilter = new ExecutionFilter((-2344), "j!", "j!", "j!", "Kj}>gq[", "Kj}>gq[", ";^g*iy-khp-q)8d");
      ExecutionFilter arg0 = new ExecutionFilter();
      boolean equals = executionFilter.equals(arg0);
      assertEquals(0, arg0.m_clientId);
      assertFalse(equals);
      assertEquals((-2344), executionFilter.m_clientId);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsWithNull() throws Throwable  {
      ExecutionFilter executionFilter = new ExecutionFilter(0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null);
      boolean equals = executionFilter.equals((Object) null);
      assertFalse(equals);
      assertEquals(0, executionFilter.m_clientId);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesExecutionFilterTaking7Arguments3() throws Throwable  {
      ExecutionFilter executionFilter = new ExecutionFilter(0, "", "", "", "", "", "q e(lo>0");
      ExecutionFilter arg0 = new ExecutionFilter(0, "", "", "", "", "", "");
      boolean equals = executionFilter.equals(arg0);
      assertFalse(equals);
      assertFalse(arg0.equals((Object)executionFilter));
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesExecutionFilterTakingNoArguments() throws Throwable  {
      ExecutionFilter arg0 = new ExecutionFilter();
      boolean equals = arg0.equals(arg0);
      assertTrue(equals);
      assertEquals(0, arg0.m_clientId);
  }
}
