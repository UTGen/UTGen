/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Tue Mar 19 15:51:18 GMT 2024
 */

package com.google.common.base;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.base.Function;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Suppliers_Original_ESTest extends Suppliers_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesExpiringMemoizingSupplierTaking3ArgumentsAndCallsGet() throws Throwable  {
      TimeUnit arg2 = TimeUnit.SECONDS;
      Supplier<TimeUnit> arg0 = Suppliers.ofInstance(arg2);
      Suppliers.ExpiringMemoizingSupplier<TimeUnit> suppliers_ExpiringMemoizingSupplier = new Suppliers.ExpiringMemoizingSupplier<TimeUnit>(arg0, 331L, arg2);
      suppliers_ExpiringMemoizingSupplier.expirationNanos = 331L;
      TimeUnit get = suppliers_ExpiringMemoizingSupplier.get();
      assertSame(arg2, get);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testMemoizeWithExpirationThrowsIllegalArgumentException() throws Throwable  {
      TimeUnit arg2 = TimeUnit.HOURS;
      Supplier<TimeUnit> arg0 = Suppliers.ofInstance(arg2);
      // Undeclared exception!
      try { 
        Suppliers.memoizeWithExpiration(arg0, (-436L), arg2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testMemoizeWithExpiration() throws Throwable  {
      Suppliers.MemoizingSupplier<TimeUnit> arg0 = new Suppliers.MemoizingSupplier<TimeUnit>((Supplier<TimeUnit>) null);
      TimeUnit arg2 = TimeUnit.MICROSECONDS;
      Supplier<TimeUnit> memoizeWithExpiration = Suppliers.memoizeWithExpiration((Supplier<TimeUnit>) arg0, 1429L, arg2);
      assertNotNull(memoizeWithExpiration);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSupplierFunction() throws Throwable  {
      Function<Supplier<Integer>, Integer> supplierFunction = Suppliers.supplierFunction();
      assertNotNull(supplierFunction);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testMemoize() throws Throwable  {
      Suppliers.MemoizingSupplier<Integer> arg0 = new Suppliers.MemoizingSupplier<Integer>((Supplier<Integer>) null);
      Supplier<Integer> memoize = Suppliers.memoize((Supplier<Integer>) arg0);
      assertNotNull(memoize);
  }
}
