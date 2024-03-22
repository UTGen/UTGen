/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Wed Mar 20 12:32:14 GMT 2024
 */

package gnu.trove.decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import gnu.trove.decorator.TShortByteMapDecorator;
import gnu.trove.map.TShortByteMap;
import gnu.trove.map.hash.TShortByteHashMap;
import java.io.ObjectInput;
import java.util.Map;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TShortByteMapDecorator_Original_ESTest extends TShortByteMapDecorator_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEntrySet() throws Throwable  {
      TShortByteMapDecorator tShortByteMapDecorator = new TShortByteMapDecorator();
      Set<Map.Entry<Short, Byte>> entrySet = (Set<Map.Entry<Short, Byte>>)tShortByteMapDecorator.entrySet();
      assertNotNull(entrySet);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testWrapValueReturningZero() throws Throwable  {
      TShortByteHashMap arg0 = new TShortByteHashMap(1, 1, (short)2, (byte)83);
      TShortByteMapDecorator tShortByteMapDecorator = new TShortByteMapDecorator(arg0);
      Byte wrapValue = tShortByteMapDecorator.wrapValue((byte)0);
      assertEquals((byte)0, (byte)wrapValue);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testWrapValueReturningPositive() throws Throwable  {
      TShortByteMapDecorator tShortByteMapDecorator = new TShortByteMapDecorator();
      Byte wrapValue = tShortByteMapDecorator.wrapValue((byte)15);
      assertEquals((byte)15, (byte)wrapValue);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testWrapValueReturningNegative() throws Throwable  {
      TShortByteMapDecorator tShortByteMapDecorator = new TShortByteMapDecorator();
      Byte wrapValue = tShortByteMapDecorator.wrapValue((byte) (-83));
      assertEquals((byte) (-83), (byte)wrapValue);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testUnwrapValueReturningZero() throws Throwable  {
      TShortByteHashMap arg0 = new TShortByteHashMap(1, 1, (short)2, (byte)83);
      TShortByteMapDecorator tShortByteMapDecorator = new TShortByteMapDecorator(arg0);
      byte unwrapValue = tShortByteMapDecorator.unwrapValue(arg0.FREE);
      assertEquals((byte)0, unwrapValue);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testUnwrapValueReturningPositive() throws Throwable  {
      TShortByteHashMap tShortByteHashMap = new TShortByteHashMap(96, 111.1F);
      TShortByteMapDecorator tShortByteMapDecorator = new TShortByteMapDecorator();
      byte unwrapValue = tShortByteMapDecorator.unwrapValue(tShortByteHashMap.FULL);
      assertEquals((byte)1, unwrapValue);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testUnwrapValueReturningNegative() throws Throwable  {
      TShortByteMapDecorator tShortByteMapDecorator = new TShortByteMapDecorator();
      Byte arg0 = new Byte((byte) (-86));
      byte unwrapValue = tShortByteMapDecorator.unwrapValue(arg0);
      assertEquals((byte) (-86), unwrapValue);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testUnwrapKeyReturningZeroAndWrapKeyReturningZero() throws Throwable  {
      TShortByteMapDecorator tShortByteMapDecorator = new TShortByteMapDecorator();
      Short arg0 = tShortByteMapDecorator.wrapKey((short)0);
      short unwrapKey = tShortByteMapDecorator.unwrapKey(arg0);
      assertEquals((short)0, unwrapKey);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testUnwrapKeyReturningNegativeAndWrapKeyReturningNegative() throws Throwable  {
      TShortByteMapDecorator tShortByteMapDecorator = new TShortByteMapDecorator();
      Short arg0 = tShortByteMapDecorator.wrapKey((short) (-2515));
      short unwrapKey = tShortByteMapDecorator.unwrapKey(arg0);
      assertEquals((short) (-2515), unwrapKey);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetMapReturningTShortByteMapWhereGetNoEntryKeyIsZero() throws Throwable  {
      TShortByteHashMap arg0 = new TShortByteHashMap((-3618), 0.0F);
      TShortByteMapDecorator tShortByteMapDecorator = new TShortByteMapDecorator(arg0);
      TShortByteMap map = tShortByteMapDecorator.getMap();
      assertSame(arg0, map);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetMapReturningTShortByteMapWhereGetNoEntryKeyIsPositive() throws Throwable  {
      TShortByteHashMap arg0 = new TShortByteHashMap((-1), (-1), (short)1306, (byte)15);
      TShortByteMapDecorator tShortByteMapDecorator = new TShortByteMapDecorator(arg0);
      TShortByteMap map = tShortByteMapDecorator.getMap();
      assertSame(arg0, map);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetMapReturningTShortByteMapWhereGetNoEntryKeyIsNegative() throws Throwable  {
      TShortByteMapDecorator tShortByteMapDecorator = new TShortByteMapDecorator();
      TShortByteHashMap tShortByteHashMap = new TShortByteHashMap((byte)0, (short)0, (short) (-32768), (byte) (-44));
      tShortByteMapDecorator._map = (TShortByteMap) tShortByteHashMap;
      TShortByteMap map = tShortByteMapDecorator.getMap();
      assertSame(map, tShortByteHashMap);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSize() throws Throwable  {
      TShortByteHashMap arg0 = new TShortByteHashMap(3597, (-4881.31F));
      TShortByteMapDecorator tShortByteMapDecorator = new TShortByteMapDecorator(arg0);
      int size = tShortByteMapDecorator.size();
      assertEquals(0, size);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsEmpty() throws Throwable  {
      TShortByteMapDecorator tShortByteMapDecorator = new TShortByteMapDecorator();
      TShortByteHashMap tShortByteHashMap = new TShortByteHashMap((byte)0, (short)0, (short)0, (byte) (-44));
      tShortByteMapDecorator._map = (TShortByteMap) tShortByteHashMap;
      boolean empty = tShortByteMapDecorator.isEmpty();
      assertTrue(empty);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesTShortByteMapDecoratorTakingNoArguments() throws Throwable  {
      TShortByteHashMap tShortByteHashMap = new TShortByteHashMap(96, 111.1F);
      TShortByteMapDecorator tShortByteMapDecorator = new TShortByteMapDecorator();
      boolean containsKey = tShortByteMapDecorator.containsKey(tShortByteHashMap.REMOVED);
      assertFalse(containsKey);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testContainsKeyWithNull() throws Throwable  {
      TShortByteHashMap arg0 = new TShortByteHashMap();
      TShortByteMapDecorator tShortByteMapDecorator = new TShortByteMapDecorator(arg0);
      boolean containsKey = tShortByteMapDecorator.containsKey((Object) null);
      assertFalse(containsKey);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testContainsValue() throws Throwable  {
      TShortByteHashMap arg0 = new TShortByteHashMap((-128), (-128));
      TShortByteMapDecorator tShortByteMapDecorator = new TShortByteMapDecorator(arg0);
      boolean containsValue = tShortByteMapDecorator.containsValue(arg0.REMOVED);
      assertFalse(containsValue);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testContainsValueWithNull() throws Throwable  {
      TShortByteHashMap arg0 = new TShortByteHashMap(1, 0.0F);
      TShortByteMapDecorator tShortByteMapDecorator = new TShortByteMapDecorator(arg0);
      boolean containsValue = tShortByteMapDecorator.containsValue((Object) null);
      assertFalse(containsValue);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRemove() throws Throwable  {
      TShortByteHashMap arg0 = new TShortByteHashMap((-388), (-388));
      TShortByteMapDecorator tShortByteMapDecorator = new TShortByteMapDecorator(arg0);
      Byte arg1 = new Byte((byte) (-121));
      tShortByteMapDecorator.put((Short) null, arg1);
      tShortByteMapDecorator.remove((Object) null);
      assertEquals(0, tShortByteMapDecorator.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGet() throws Throwable  {
      TShortByteHashMap arg0 = new TShortByteHashMap((-1), 3592.716F, (short) (-1217), (byte)107);
      TShortByteMapDecorator tShortByteMapDecorator = new TShortByteMapDecorator(arg0);
      Byte get = tShortByteMapDecorator.get(arg0);
      assertNull(get);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testContainsKeyReturningTrue() throws Throwable  {
      TShortByteHashMap arg0 = new TShortByteHashMap();
      TShortByteMapDecorator tShortByteMapDecorator = new TShortByteMapDecorator(arg0);
      Byte put = tShortByteMapDecorator.put((Short) null, (Byte) arg0.FULL);
      assertNull(put);
      
      boolean containsKey = tShortByteMapDecorator.containsKey((Object) null);
      assertTrue(containsKey);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testClear() throws Throwable  {
      TShortByteHashMap arg0 = new TShortByteHashMap((-388), (-388));
      TShortByteMapDecorator tShortByteMapDecorator = new TShortByteMapDecorator(arg0);
      tShortByteMapDecorator.clear();
      assertEquals(0, tShortByteMapDecorator.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetMapReturningNull() throws Throwable  {
      TShortByteMapDecorator tShortByteMapDecorator = new TShortByteMapDecorator();
      TShortByteMap map = tShortByteMapDecorator.getMap();
      assertNull(map);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadExternalThrowsNullPointerException() throws Throwable  {
      TShortByteMapDecorator tShortByteMapDecorator = new TShortByteMapDecorator();
      // Undeclared exception!
      try { 
        tShortByteMapDecorator.readExternal((ObjectInput) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("gnu.trove.decorator.TShortByteMapDecorator", e);
      }
  }
}
