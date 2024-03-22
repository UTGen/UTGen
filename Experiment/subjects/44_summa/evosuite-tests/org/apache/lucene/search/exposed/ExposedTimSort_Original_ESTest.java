/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Mon Mar 18 03:58:37 GMT 2024
 */

package org.apache.lucene.search.exposed;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.lucene.search.exposed.ExposedTimSort;
import org.apache.lucene.search.exposed.compare.ComparatorFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ExposedTimSort_Original_ESTest extends ExposedTimSort_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSortTaking4Arguments0() throws Throwable  {
      int[] arg0 = new int[510];
      ComparatorFactory.IndirectComparator arg3 = new ComparatorFactory.IndirectComparator(arg0);
      arg0[469] = 309;
      arg0[451] = 309;
      ExposedTimSort.sort(arg0, 309, 502, (ComparatorFactory.OrdinalComparator) arg3);
      assertEquals(510, arg0.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSortTaking4ArgumentsThrowsArrayIndexOutOfBoundsException0() throws Throwable  {
      int[] arg0 = new int[5];
      // Undeclared exception!
      try { 
        ExposedTimSort.sort(arg0, (-1224), 0, (ComparatorFactory.OrdinalComparator) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: -1224
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSortTaking4ArgumentsThrowsArrayIndexOutOfBoundsException1() throws Throwable  {
      int[] arg0 = new int[496];
      ComparatorFactory.IndirectComparator arg3 = new ComparatorFactory.IndirectComparator(arg0);
      // Undeclared exception!
      try { 
        ExposedTimSort.sort(arg0, 0, 510, (ComparatorFactory.OrdinalComparator) arg3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.lucene.search.exposed.ExposedTimSort", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSortTaking4ArgumentsWithNegative() throws Throwable  {
      int[] arg0 = new int[506];
      ComparatorFactory.IndirectComparator arg3 = new ComparatorFactory.IndirectComparator(arg0);
      // Undeclared exception!
      try { 
        ExposedTimSort.sort(arg0, (-1808), (-1808), (ComparatorFactory.OrdinalComparator) arg3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.lucene.search.exposed.ExposedTimSort", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSortTaking4ArgumentsThrowsIllegalArgumentExceptionAndSortTaking4ArgumentsWithZero() throws Throwable  {
      int[] arg0 = new int[510];
      ComparatorFactory.IndirectComparator arg3 = new ComparatorFactory.IndirectComparator(arg0);
      // Undeclared exception!
      try { 
        ExposedTimSort.sort(arg0, 309, 0, (ComparatorFactory.OrdinalComparator) arg3);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // fromIndex(309) > toIndex(0)
         //
         verifyException("org.apache.lucene.search.exposed.ExposedTimSort", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSortTaking4ArgumentsAndSortTaking4ArgumentsWithZeroAndSortTaking4ArgumentsWithPositive() throws Throwable  {
      int[] arg0 = new int[487];
      ComparatorFactory.IndirectComparator arg3 = new ComparatorFactory.IndirectComparator(arg0);
      arg0[416] = 362;
      arg0[469] = 362;
      arg0[451] = 362;
      ExposedTimSort.sort(arg0, 362, 479, (ComparatorFactory.OrdinalComparator) arg3);
      ExposedTimSort.sort(arg0, 0, 367, (ComparatorFactory.OrdinalComparator) arg3);
      assertEquals(487, arg0.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSortTaking4ArgumentsThrowsIllegalArgumentException0() throws Throwable  {
      int[] arg0 = new int[510];
      ComparatorFactory.IndirectComparator arg3 = new ComparatorFactory.IndirectComparator(arg0);
      arg0[416] = 283;
      arg0[353] = 283;
      arg0[313] = 283;
      // Undeclared exception!
      try { 
        ExposedTimSort.sort(arg0, 283, 496, (ComparatorFactory.OrdinalComparator) arg3);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Comparison method violates its general contract!
         //
         verifyException("org.apache.lucene.search.exposed.ExposedTimSort", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSortTaking4ArgumentsAndSortTaking2Arguments0() throws Throwable  {
      int[] arg0 = new int[510];
      ComparatorFactory.IndirectComparator arg1 = new ComparatorFactory.IndirectComparator(arg0);
      arg0[416] = 309;
      arg0[469] = 309;
      ExposedTimSort.sort(arg0, 309, 502, (ComparatorFactory.OrdinalComparator) arg1);
      ExposedTimSort.sort(arg0, (ComparatorFactory.OrdinalComparator) arg1);
      assertEquals(510, arg0.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSortTaking4ArgumentsAndSortTaking2Arguments1() throws Throwable  {
      int[] arg0 = new int[505];
      ComparatorFactory.IndirectComparator arg1 = new ComparatorFactory.IndirectComparator(arg0);
      arg0[416] = 283;
      arg0[469] = 283;
      arg0[313] = 283;
      ExposedTimSort.sort(arg0, 283, 496, (ComparatorFactory.OrdinalComparator) arg1);
      ExposedTimSort.sort(arg0, (ComparatorFactory.OrdinalComparator) arg1);
      assertEquals(505, arg0.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSortTaking4ArgumentsThrowsIllegalArgumentException1() throws Throwable  {
      int[] arg0 = new int[510];
      ComparatorFactory.IndirectComparator arg3 = new ComparatorFactory.IndirectComparator(arg0);
      arg0[316] = 309;
      arg0[313] = 309;
      // Undeclared exception!
      try { 
        ExposedTimSort.sort(arg0, 309, 502, (ComparatorFactory.OrdinalComparator) arg3);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Comparison method violates its general contract!
         //
         verifyException("org.apache.lucene.search.exposed.ExposedTimSort", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSortTaking2Arguments0() throws Throwable  {
      int[] arg0 = new int[463];
      ComparatorFactory.IndirectComparator arg1 = new ComparatorFactory.IndirectComparator(arg0);
      arg0[462] = 419;
      ExposedTimSort.sort(arg0, (ComparatorFactory.OrdinalComparator) arg1);
      assertEquals(463, arg0.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSortTaking4Arguments1() throws Throwable  {
      int[] arg0 = new int[506];
      ComparatorFactory.IndirectComparator arg3 = new ComparatorFactory.IndirectComparator(arg0);
      ExposedTimSort.sort(arg0, 474, 478, (ComparatorFactory.OrdinalComparator) arg3);
      assertEquals(506, arg0.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSortTaking4ArgumentsAndSortTaking4ArgumentsWithZeroAndSortTaking4ArgumentsWithZero() throws Throwable  {
      int[] arg0 = new int[490];
      ComparatorFactory.IndirectComparator arg3 = new ComparatorFactory.IndirectComparator(arg0);
      ExposedTimSort.sort(arg0, 0, 0, (ComparatorFactory.OrdinalComparator) arg3);
      assertEquals(490, arg0.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSortTaking2ArgumentsWithNull() throws Throwable  {
      int[] arg0 = new int[10];
      ExposedTimSort.sort(arg0, (ComparatorFactory.OrdinalComparator) null);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, arg0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSortTaking2Arguments1() throws Throwable  {
      int[] arg0 = new int[528];
      ComparatorFactory.IndirectComparator arg1 = new ComparatorFactory.IndirectComparator(arg0);
      ExposedTimSort.sort(arg0, (ComparatorFactory.OrdinalComparator) arg1);
      assertEquals(528, arg0.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSortTaking2Arguments2() throws Throwable  {
      int[] arg0 = new int[33];
      ComparatorFactory.IndirectComparator arg1 = new ComparatorFactory.IndirectComparator(arg0);
      ExposedTimSort.sort(arg0, (ComparatorFactory.OrdinalComparator) arg1);
      assertEquals(33, arg0.length);
  }
}