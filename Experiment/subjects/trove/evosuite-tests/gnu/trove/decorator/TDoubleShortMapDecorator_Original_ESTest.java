/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Wed Mar 20 12:22:26 GMT 2024
 */

package gnu.trove.decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import gnu.trove.decorator.TDoubleShortMapDecorator;
import gnu.trove.impl.hash.TPrimitiveHash;
import gnu.trove.map.TDoubleShortMap;
import gnu.trove.map.hash.TDoubleShortHashMap;
import java.io.ObjectInput;
import java.util.Map;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TDoubleShortMapDecorator_Original_ESTest extends TDoubleShortMapDecorator_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testWrapValueReturningNegative() throws Throwable  {
      TDoubleShortHashMap arg0 = new TDoubleShortHashMap((-205));
      TDoubleShortMapDecorator tDoubleShortMapDecorator = new TDoubleShortMapDecorator(arg0);
      Short wrapValue = tDoubleShortMapDecorator.wrapValue((short) (-1988));
      assertEquals((short) (-1988), (short)wrapValue);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetMapReturningTDoubleShortMapWhereGetNoEntryKeyIsZero() throws Throwable  {
      TDoubleShortHashMap arg0 = new TDoubleShortHashMap();
      TDoubleShortMapDecorator tDoubleShortMapDecorator = new TDoubleShortMapDecorator(arg0);
      TDoubleShortMap map = tDoubleShortMapDecorator.getMap();
      assertTrue(map.isEmpty());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetMapReturningTDoubleShortMapWhereGetNoEntryKeyIsPositive() throws Throwable  {
      TDoubleShortHashMap arg0 = new TDoubleShortHashMap(4275, 0.0F, 4275, (short)57);
      TDoubleShortMapDecorator tDoubleShortMapDecorator = new TDoubleShortMapDecorator(arg0);
      TDoubleShortMap map = tDoubleShortMapDecorator.getMap();
      assertEquals(0, map.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetMapReturningTDoubleShortMapWhereGetNoEntryKeyIsNegative() throws Throwable  {
      TDoubleShortHashMap arg0 = new TDoubleShortHashMap((-1254), (-1254), (-1254), (short) (-694));
      TDoubleShortMapDecorator tDoubleShortMapDecorator = new TDoubleShortMapDecorator(arg0);
      TDoubleShortHashMap map = (TDoubleShortHashMap)tDoubleShortMapDecorator.getMap();
      assertEquals((byte)0, TPrimitiveHash.FREE);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetReturningNull() throws Throwable  {
      TDoubleShortHashMap arg0 = new TDoubleShortHashMap();
      TDoubleShortMapDecorator tDoubleShortMapDecorator = new TDoubleShortMapDecorator(arg0);
      Short get = tDoubleShortMapDecorator.get((Object) null);
      assertNull(get);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetReturningNegative() throws Throwable  {
      TDoubleShortMapDecorator tDoubleShortMapDecorator = new TDoubleShortMapDecorator();
      double[] arg0 = new double[8];
      arg0[2] = (-1.0);
      arg0[3] = (-709.06487074);
      arg0[4] = (-2156.961444906309);
      arg0[5] = 706.91503636;
      arg0[6] = 2116.183367416589;
      arg0[7] = (-3660.71);
      short[] arg1 = new short[8];
      arg1[1] = (short) (-3863);
      TDoubleShortHashMap tDoubleShortHashMap = new TDoubleShortHashMap(arg0, arg1);
      tDoubleShortMapDecorator._map = (TDoubleShortMap) tDoubleShortHashMap;
      Short get = tDoubleShortMapDecorator.get((Object) null);
      assertEquals((short) (-3863), (short)get);
      assertNotNull(get);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSize() throws Throwable  {
      TDoubleShortHashMap arg0 = new TDoubleShortHashMap(641, (-1.0F), (-1.0F), (short)1796);
      TDoubleShortMapDecorator tDoubleShortMapDecorator = new TDoubleShortMapDecorator(arg0);
      int size = tDoubleShortMapDecorator.size();
      assertEquals(0, size);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testContainsKey() throws Throwable  {
      TDoubleShortHashMap arg0 = new TDoubleShortHashMap(0);
      TDoubleShortMapDecorator tDoubleShortMapDecorator = new TDoubleShortMapDecorator(arg0);
      boolean containsKey = tDoubleShortMapDecorator.containsKey((Object) null);
      assertFalse(containsKey);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRemoveReturningNull() throws Throwable  {
      TDoubleShortMapDecorator tDoubleShortMapDecorator = new TDoubleShortMapDecorator();
      Object arg0 = new Object();
      Short remove = tDoubleShortMapDecorator.remove(arg0);
      assertNull(remove);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesTDoubleShortMapDecoratorTakingTDoubleShortMap() throws Throwable  {
      TDoubleShortHashMap arg0 = new TDoubleShortHashMap();
      TDoubleShortMapDecorator tDoubleShortMapDecorator = new TDoubleShortMapDecorator(arg0);
      Short arg1 = new Short((byte)2);
      Short orDefault = tDoubleShortMapDecorator.getOrDefault(arg0, arg1);
      assertEquals((short)2, (short)orDefault);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRemoveReturningPositive() throws Throwable  {
      TDoubleShortHashMap arg0 = new TDoubleShortHashMap();
      TDoubleShortMapDecorator tDoubleShortMapDecorator = new TDoubleShortMapDecorator(arg0);
      Short arg1 = new Short((byte)2);
      tDoubleShortMapDecorator.putIfAbsent((Double) null, arg1);
      assertEquals(1, tDoubleShortMapDecorator.size());
      
      Short remove = tDoubleShortMapDecorator.remove((Object) null);
      assertEquals((short)2, (short)remove);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testUnwrapValue() throws Throwable  {
      TDoubleShortMapDecorator tDoubleShortMapDecorator = new TDoubleShortMapDecorator();
      Short arg0 = new Short((short)12105);
      short unwrapValue = tDoubleShortMapDecorator.unwrapValue(arg0);
      assertEquals((short)12105, unwrapValue);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testUnwrapKey() throws Throwable  {
      TDoubleShortMapDecorator tDoubleShortMapDecorator = new TDoubleShortMapDecorator();
      Double arg0 = tDoubleShortMapDecorator.wrapKey((-584.1));
      double unwrapKey = tDoubleShortMapDecorator.unwrapKey(arg0);
      assertEquals((-584.1), unwrapKey, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadExternalThrowsNullPointerException() throws Throwable  {
      TDoubleShortMapDecorator tDoubleShortMapDecorator = new TDoubleShortMapDecorator();
      // Undeclared exception!
      try { 
        tDoubleShortMapDecorator.readExternal((ObjectInput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("gnu.trove.decorator.TDoubleShortMapDecorator", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsEmpty() throws Throwable  {
      TDoubleShortHashMap arg0 = new TDoubleShortHashMap((-428), (-428), (-428), (short)573);
      TDoubleShortMapDecorator tDoubleShortMapDecorator = new TDoubleShortMapDecorator(arg0);
      boolean empty = tDoubleShortMapDecorator.isEmpty();
      assertTrue(empty);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testClear() throws Throwable  {
      TDoubleShortHashMap arg0 = new TDoubleShortHashMap(1084);
      TDoubleShortMapDecorator tDoubleShortMapDecorator = new TDoubleShortMapDecorator(arg0);
      tDoubleShortMapDecorator.clear();
      assertTrue(tDoubleShortMapDecorator.isEmpty());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testWrapValueReturningPositive() throws Throwable  {
      TDoubleShortMapDecorator tDoubleShortMapDecorator = new TDoubleShortMapDecorator();
      Short wrapValue = tDoubleShortMapDecorator.wrapValue((short)2501);
      assertEquals((short)2501, (short)wrapValue);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testWrapKeyReturningZero() throws Throwable  {
      TDoubleShortHashMap arg0 = new TDoubleShortHashMap(0);
      TDoubleShortMapDecorator tDoubleShortMapDecorator = new TDoubleShortMapDecorator(arg0);
      Double wrapKey = tDoubleShortMapDecorator.wrapKey((byte)0);
      assertEquals(0.0, (double)wrapKey, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEntrySet() throws Throwable  {
      TDoubleShortMapDecorator tDoubleShortMapDecorator = new TDoubleShortMapDecorator();
      Set<Map.Entry<Double, Short>> entrySet = (Set<Map.Entry<Double, Short>>)tDoubleShortMapDecorator.entrySet();
      assertNotNull(entrySet);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetMapReturningNull() throws Throwable  {
      TDoubleShortMapDecorator tDoubleShortMapDecorator = new TDoubleShortMapDecorator();
      TDoubleShortMap map = tDoubleShortMapDecorator.getMap();
      assertNull(map);
  }
}
