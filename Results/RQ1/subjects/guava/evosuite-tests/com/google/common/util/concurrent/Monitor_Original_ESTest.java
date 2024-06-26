/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Tue Mar 19 15:06:03 GMT 2024
 */

package com.google.common.util.concurrent;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.util.concurrent.Monitor;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThread;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Monitor_Original_ESTest extends Monitor_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testWaitForUninterruptiblyTaking3ArgumentsThrowsNullPointerException() throws Throwable  {
      Monitor monitor = new Monitor();
      TimeUnit arg2 = TimeUnit.MICROSECONDS;
      // Undeclared exception!
      try { 
        monitor.waitForUninterruptibly((Monitor.Guard) null, 0L, arg2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.util.concurrent.Monitor", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testWaitForUninterruptiblyTakingMonitor$GuardThrowsNullPointerException() throws Throwable  {
      Monitor monitor = new Monitor();
      // Undeclared exception!
      try { 
        monitor.waitForUninterruptibly((Monitor.Guard) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.util.concurrent.Monitor", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testWaitForTaking3ArgumentsThrowsNullPointerException() throws Throwable  {
      Monitor monitor = new Monitor();
      TimeUnit arg2 = TimeUnit.MINUTES;
      // Undeclared exception!
      try { 
        monitor.waitFor((Monitor.Guard) null, (-1L), arg2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.util.concurrent.Monitor", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testWaitForTakingMonitor$GuardThrowsNullPointerException() throws Throwable  {
      Monitor monitor = new Monitor(true);
      // Undeclared exception!
      try { 
        monitor.waitFor((Monitor.Guard) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.util.concurrent.Monitor", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testTryEnterIfThrowsNullPointerException() throws Throwable  {
      Monitor monitor = new Monitor();
      // Undeclared exception!
      try { 
        monitor.tryEnterIf((Monitor.Guard) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.util.concurrent.Monitor", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHasWaitersThrowsNullPointerException() throws Throwable  {
      Monitor monitor = new Monitor();
      // Undeclared exception!
      try { 
        monitor.hasWaiters((Monitor.Guard) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.util.concurrent.Monitor", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEnterWhenUninterruptiblyTaking3ArgumentsThrowsNullPointerException() throws Throwable  {
      Monitor monitor = new Monitor();
      TimeUnit arg2 = TimeUnit.NANOSECONDS;
      // Undeclared exception!
      try { 
        monitor.enterWhenUninterruptibly((Monitor.Guard) null, 1046L, arg2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.util.concurrent.Monitor", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEnterWhenUninterruptiblyTakingMonitor$GuardThrowsNullPointerException() throws Throwable  {
      Monitor monitor = new Monitor(false);
      // Undeclared exception!
      try { 
        monitor.enterWhenUninterruptibly((Monitor.Guard) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.util.concurrent.Monitor", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEnterWhenTaking3ArgumentsThrowsNullPointerException() throws Throwable  {
      Monitor monitor = new Monitor();
      TimeUnit arg2 = TimeUnit.MILLISECONDS;
      // Undeclared exception!
      try { 
        monitor.enterWhen((Monitor.Guard) null, (-2086L), arg2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.util.concurrent.Monitor", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEnterWhenTakingMonitor$GuardThrowsNullPointerException() throws Throwable  {
      Monitor monitor = new Monitor(false);
      // Undeclared exception!
      try { 
        monitor.enterWhen((Monitor.Guard) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.util.concurrent.Monitor", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEnterIfInterruptiblyTaking3ArgumentsThrowsNullPointerException() throws Throwable  {
      Monitor monitor = new Monitor(true);
      TimeUnit arg2 = TimeUnit.NANOSECONDS;
      // Undeclared exception!
      try { 
        monitor.enterIfInterruptibly((Monitor.Guard) null, 0L, arg2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.util.concurrent.Monitor", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEnterIfInterruptiblyTakingMonitor$GuardThrowsNullPointerException() throws Throwable  {
      Monitor monitor = new Monitor();
      // Undeclared exception!
      try { 
        monitor.enterIfInterruptibly((Monitor.Guard) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.util.concurrent.Monitor", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEnterIfTaking3ArgumentsThrowsNullPointerException() throws Throwable  {
      Monitor monitor = new Monitor(false);
      TimeUnit arg2 = TimeUnit.HOURS;
      // Undeclared exception!
      try { 
        monitor.enterIf((Monitor.Guard) null, (-2281L), arg2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.util.concurrent.Monitor", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEnterIfTakingMonitor$GuardThrowsNullPointerException() throws Throwable  {
      Monitor monitor = new Monitor();
      // Undeclared exception!
      try { 
        monitor.enterIf((Monitor.Guard) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.util.concurrent.Monitor", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsOccupiedByCurrentThreadReturningTrue() throws Throwable  {
      Monitor monitor = new Monitor();
      monitor.tryEnter();
      monitor.isOccupiedByCurrentThread();
      assertFalse(monitor.isFair());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsFairReturningTrue() throws Throwable  {
      Monitor monitor = new Monitor(true);
      boolean fair = monitor.isFair();
      assertTrue(fair);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetOccupiedDepthReturningPositive() throws Throwable  {
      Monitor monitor = new Monitor(true);
      monitor.enterInterruptibly();
      monitor.getOccupiedDepth();
      assertTrue(monitor.isFair());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testTryEnter() throws Throwable  {
      Monitor monitor = new Monitor(false);
      monitor.tryEnter();
      monitor.tryEnter();
      monitor.leave();
      assertFalse(monitor.isFair());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEnterTaking2ArgumentsWithZero() throws Throwable  {
      Monitor monitor = new Monitor();
      TimeUnit arg1 = TimeUnit.SECONDS;
      boolean enter = monitor.enter(0L, arg1);
      assertTrue(enter);
      assertFalse(monitor.isFair());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEnterTaking2ArgumentsWithPositive() throws Throwable  {
      Monitor monitor = new Monitor(true);
      TimeUnit arg1 = TimeUnit.NANOSECONDS;
      monitor.enter(3264L, arg1);
      assertTrue(monitor.isFair());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEnterInterruptiblyTaking2Arguments() throws Throwable  {
      Monitor monitor = new Monitor();
      TimeUnit arg1 = TimeUnit.SECONDS;
      monitor.enterInterruptibly((-254L), arg1);
      assertFalse(monitor.isFair());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsOccupiedReturningTrue() throws Throwable  {
      Monitor monitor = new Monitor();
      monitor.tryEnter();
      monitor.isOccupied();
      assertFalse(monitor.isFair());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsFairReturningFalse() throws Throwable  {
      Monitor monitor = new Monitor();
      boolean fair = monitor.isFair();
      assertFalse(fair);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEnterTakingNoArguments() throws Throwable  {
      Monitor monitor = new Monitor(false);
      monitor.enter();
      assertFalse(monitor.isFair());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsOccupiedByCurrentThreadReturningFalse() throws Throwable  {
      Monitor monitor = new Monitor();
      monitor.isOccupiedByCurrentThread();
      assertFalse(monitor.isFair());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEnterInterruptiblyTakingNoArguments() throws Throwable  {
      Monitor monitor = new Monitor();
      monitor.enterInterruptibly();
      monitor.leave();
      assertFalse(monitor.isFair());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHasQueuedThreads() throws Throwable  {
      Monitor monitor = new Monitor();
      monitor.hasQueuedThreads();
      assertFalse(monitor.isFair());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsOccupiedReturningFalse() throws Throwable  {
      Monitor monitor = new Monitor(true);
      monitor.isOccupied();
      assertTrue(monitor.isFair());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetOccupiedDepthReturningZero() throws Throwable  {
      Monitor monitor = new Monitor(false);
      monitor.getOccupiedDepth();
      assertFalse(monitor.isFair());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHasQueuedThread() throws Throwable  {
      Monitor monitor = new Monitor(false);
      MockThread arg0 = new MockThread("");
      monitor.hasQueuedThread(arg0);
      assertFalse(monitor.isFair());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetQueueLength() throws Throwable  {
      Monitor monitor = new Monitor();
      monitor.getQueueLength();
      assertFalse(monitor.isFair());
  }
}
