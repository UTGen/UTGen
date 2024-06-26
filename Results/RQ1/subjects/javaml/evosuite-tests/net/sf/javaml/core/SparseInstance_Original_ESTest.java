/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Tue Mar 19 18:02:52 GMT 2024
 */

package net.sf.javaml.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import net.sf.javaml.core.AbstractInstance;
import net.sf.javaml.core.DenseInstance;
import net.sf.javaml.core.Instance;
import net.sf.javaml.core.SparseInstance;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SparseInstance_Original_ESTest extends SparseInstance_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testValueReturningPositive() throws Throwable  {
      Object arg2 = new Object();
      SparseInstance sparseInstance = new SparseInstance(1, 1602.16578, arg2);
      double value = sparseInstance.value(1);
      assertEquals(1602.16578, value, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testValueReturningNegative() throws Throwable  {
      double[] arg0 = new double[0];
      Object arg2 = new Object();
      SparseInstance sparseInstance = new SparseInstance(arg0, (-269.3), arg2);
      double value = sparseInstance.value(0);
      assertEquals((-269.3), value, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSizeReturningPositive() throws Throwable  {
      double[] arg0 = new double[3];
      SparseInstance sparseInstance = new SparseInstance(arg0, (-1941.43465972));
      int size = sparseInstance.size();
      assertEquals(3, size);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRemoveReturningPositive() throws Throwable  {
      SparseInstance sparseInstance = new SparseInstance();
      double[] doubleArray = new double[2];
      doubleArray[1] = (double) 1;
      sparseInstance.put((Integer) null, (Double) doubleArray[1]);
      Double remove = sparseInstance.remove((Object) null);
      assertEquals(1.0, (double)remove, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testPutReturningZero() throws Throwable  {
      SparseInstance sparseInstance = new SparseInstance();
      Double arg1 = new Double(0.0);
      Integer arg0 = new Integer(2146748957);
      sparseInstance.put(arg0, arg1);
      Double put = sparseInstance.put(arg0, arg1);
      assertEquals(0.0, (double)put, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsEmptyReturningFalse() throws Throwable  {
      double[] arg0 = new double[6];
      arg0[0] = (-835.72986484);
      SparseInstance sparseInstance = new SparseInstance(arg0, (Object) null);
      boolean empty = sparseInstance.isEmpty();
      assertEquals(1, sparseInstance.size());
      assertFalse(empty);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGet() throws Throwable  {
      double[] arg0 = new double[7];
      Object arg2 = new Object();
      SparseInstance sparseInstance = new SparseInstance(arg0, 5771.13342, arg2);
      Double get = sparseInstance.get(arg0[0]);
      assertEquals(7, sparseInstance.size());
      assertEquals(5771.13342, (double)get, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCopyReturningInstanceWhereIsEmptyIsFalse() throws Throwable  {
      Double arg2 = new Double(1);
      SparseInstance sparseInstance = new SparseInstance(1, 1, arg2);
      Integer arg0 = new Integer(1218);
      sparseInstance.replace(arg0, arg2, arg2);
      sparseInstance.copy();
      assertFalse(sparseInstance.isEmpty());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCopyReturningInstanceWhereGetIDIsZero() throws Throwable  {
      SparseInstance sparseInstance = new SparseInstance(0);
      AbstractInstance.nextID = 0;
      Instance copy = sparseInstance.copy();
      assertNotSame(copy, sparseInstance);
      assertTrue(copy.equals((Object)sparseInstance));
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testContainsValueReturningFalse() throws Throwable  {
      SparseInstance arg0 = new SparseInstance((-1146));
      boolean containsValue = arg0.containsValue(arg0);
      assertFalse(containsValue);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testContainsKeyReturningTrue() throws Throwable  {
      SparseInstance sparseInstance = new SparseInstance();
      Double arg1 = new Double((-1885.2724771806654));
      sparseInstance.replace((Integer) null, arg1);
      boolean containsKey = sparseInstance.containsKey((Object) null);
      assertTrue(containsKey);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSizeReturningZero() throws Throwable  {
      Object arg2 = new Object();
      SparseInstance sparseInstance = new SparseInstance((-2133493526), (-2133493526), arg2);
      int size = sparseInstance.size();
      assertEquals(0, size);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsReturningTrue() throws Throwable  {
      Object arg2 = new Object();
      SparseInstance sparseInstance = new SparseInstance((-2133493526), (-2133493526), arg2);
      Instance arg0 = sparseInstance.copy();
      boolean equals = sparseInstance.equals(arg0);
      assertTrue(equals);
      assertEquals(1, arg0.getID());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsWithNull() throws Throwable  {
      SparseInstance sparseInstance = new SparseInstance();
      boolean equals = sparseInstance.equals((Object) null);
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHashCode() throws Throwable  {
      Object arg2 = new Object();
      SparseInstance sparseInstance = new SparseInstance((-2133493526), (-2133493526), arg2);
      sparseInstance.hashCode();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRemoveAttributeWithNegative() throws Throwable  {
      double[] arg0 = new double[5];
      arg0[0] = 2663.0022;
      SparseInstance arg1 = new SparseInstance((-4666));
      SparseInstance sparseInstance = new SparseInstance(arg0, arg1);
      sparseInstance.removeAttribute((-2146663268));
      assertEquals(1, sparseInstance.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRemoveAttributeWithPositive() throws Throwable  {
      double[] arg0 = new double[5];
      arg0[0] = 237.45;
      Object arg1 = new Object();
      SparseInstance sparseInstance = new SparseInstance(arg0, arg1);
      sparseInstance.removeAttribute(1749);
      assertEquals(1, sparseInstance.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRemoveAttributes() throws Throwable  {
      SparseInstance sparseInstance = new SparseInstance();
      DenseInstance denseInstance = new DenseInstance(3209);
      SortedSet<Integer> arg0 = denseInstance.keySet();
      sparseInstance.removeAttributes(arg0);
      assertFalse(arg0.isEmpty());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testNoAttributesReturningNegative() throws Throwable  {
      SparseInstance sparseInstance = new SparseInstance();
      Integer arg0 = new Integer((-1024));
      sparseInstance.replace(arg0, (Double) 0.0);
      int noAttributes = sparseInstance.noAttributes();
      assertEquals((-1023), noAttributes);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testNoAttributesReturningZero() throws Throwable  {
      Object arg2 = new Object();
      SparseInstance sparseInstance = new SparseInstance((-2133493526), (-2133493526), arg2);
      int noAttributes = sparseInstance.noAttributes();
      assertEquals(0, noAttributes);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesSparseInstanceTaking2Arguments0() throws Throwable  {
      double[] arg0 = new double[3];
      SparseInstance sparseInstance = new SparseInstance(arg0, (-1146.0));
      Instance sqrt = sparseInstance.sqrt();
      assertEquals(3, sparseInstance.size());
      assertEquals(3, sqrt.noAttributes());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRemoveReturningNull() throws Throwable  {
      Object arg2 = new Object();
      SparseInstance sparseInstance = new SparseInstance((-2133493526), (-2133493526), arg2);
      Double remove = sparseInstance.remove((Object) null);
      assertNull(remove);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testKeySet() throws Throwable  {
      Object arg2 = new Object();
      SparseInstance sparseInstance = new SparseInstance((-2133493526), (-2133493526), arg2);
      TreeSet<Integer> keySet = sparseInstance.keySet();
      assertFalse(keySet.contains((-2133493526)));
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testPutAll() throws Throwable  {
      SparseInstance arg0 = new SparseInstance();
      arg0.putAll(arg0);
      assertTrue(arg0.isEmpty());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetNoAttributes() throws Throwable  {
      double[] arg0 = new double[1];
      SparseInstance sparseInstance = new SparseInstance(arg0, 0.0);
      sparseInstance.setNoAttributes(0);
      assertEquals(0, sparseInstance.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testValueReturningZero() throws Throwable  {
      Object arg2 = new Object();
      SparseInstance sparseInstance = new SparseInstance(0, 0, arg2);
      double value = sparseInstance.value(0);
      assertEquals(0.0, value, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testToString() throws Throwable  {
      Object arg2 = new Object();
      SparseInstance sparseInstance = new SparseInstance((-2133493526), (-2133493526), arg2);
      String string = sparseInstance.toString();
      assertNotNull(string);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesSparseInstanceTaking2ArgumentsAndCallsEntrySet() throws Throwable  {
      Object arg2 = new Object();
      SparseInstance sparseInstance = new SparseInstance((-2133493526), (-2133493526), arg2);
      Set<Map.Entry<Integer, Double>> arg1 = (Set<Map.Entry<Integer, Double>>)sparseInstance.entrySet();
      SparseInstance arg0 = new SparseInstance(1, arg1);
      boolean equals = sparseInstance.equals(arg0);
      assertFalse(arg0.equals((Object)sparseInstance));
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testValues() throws Throwable  {
      Object arg2 = new Object();
      SparseInstance sparseInstance = new SparseInstance((-2133493526), (-2133493526), arg2);
      Collection<Double> values = sparseInstance.values();
      assertNotNull(values);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testClear() throws Throwable  {
      Object arg2 = new Object();
      SparseInstance sparseInstance = new SparseInstance((-2133493526), (-2133493526), arg2);
      sparseInstance.clear();
      assertEquals(0, sparseInstance.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testContainsKeyReturningFalse() throws Throwable  {
      Object arg0 = new Object();
      SparseInstance sparseInstance = new SparseInstance((-2133493526), (-2133493526), arg0);
      boolean containsKey = sparseInstance.containsKey(arg0);
      assertFalse(containsKey);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesSparseInstanceTakingDoubleArray() throws Throwable  {
      double[] arg0 = new double[3];
      SparseInstance sparseInstance = new SparseInstance(arg0);
      int noAttributes = sparseInstance.noAttributes();
      assertTrue(sparseInstance.isEmpty());
      assertEquals(3, noAttributes);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsEmptyReturningTrue() throws Throwable  {
      SparseInstance sparseInstance = new SparseInstance();
      boolean empty = sparseInstance.isEmpty();
      assertTrue(empty);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testContainsValueReturningTrue() throws Throwable  {
      double[] arg0 = new double[2];
      SparseInstance sparseInstance = new SparseInstance(arg0, 2907.154512804876, arg0[1]);
      boolean containsValue = sparseInstance.containsValue(arg0[0]);
      assertEquals(2, sparseInstance.size());
      assertTrue(containsValue);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesSparseInstanceTaking2Arguments1() throws Throwable  {
      SparseInstance sparseInstance = new SparseInstance((-1798), (-1798));
      assertTrue(sparseInstance.isEmpty());
  }
}
