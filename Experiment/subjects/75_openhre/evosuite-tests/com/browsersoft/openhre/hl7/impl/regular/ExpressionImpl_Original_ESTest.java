/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Thu Mar 21 06:56:34 GMT 2024
 */

package com.browsersoft.openhre.hl7.impl.regular;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import com.browsersoft.openhre.hl7.api.regular.ExpressionElementMapper;
import com.browsersoft.openhre.hl7.api.regular.ExpressionPart;
import com.browsersoft.openhre.hl7.impl.regular.ExpressionElementMapperImpl;
import com.browsersoft.openhre.hl7.impl.regular.ExpressionImpl;
import com.browsersoft.openhre.hl7.impl.regular.ExpressionPartImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ExpressionImpl_Original_ESTest extends ExpressionImpl_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSizeReturningPositive() throws Throwable  {
      ExpressionImpl expressionImpl = new ExpressionImpl();
      expressionImpl.readFromStringForDebug("Y1iH6]@4");
      int size = expressionImpl.size();
      assertEquals(3, size);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetNumberOfElementTypesReturningPositive() throws Throwable  {
      ExpressionImpl expressionImpl = new ExpressionImpl();
      expressionImpl.readFromStringForDebug("}.T@{ t");
      int numberOfElementTypes = expressionImpl.getNumberOfElementTypes();
      assertEquals(1, numberOfElementTypes);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetItemReturningExpressionPartWhereGetTypeIsPositive() throws Throwable  {
      ExpressionImpl expressionImpl = new ExpressionImpl();
      ExpressionPartImpl arg0 = new ExpressionPartImpl();
      arg0.setType(1098);
      expressionImpl.addItem(arg0);
      ExpressionPart item = expressionImpl.getItem(0);
      assertEquals(0, item.getElementID());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetItemReturningExpressionPartWhereGetTypeIsNegative() throws Throwable  {
      ExpressionImpl expressionImpl = new ExpressionImpl();
      ExpressionPartImpl arg0 = new ExpressionPartImpl();
      arg0.setType((-1128));
      expressionImpl.addItem(arg0);
      ExpressionPart item = expressionImpl.getItem(0);
      assertEquals((-1128), item.getType());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetItemReturningExpressionPartWhereGetElementIDIsZeroAndExpressionPartWhereGetTypeIsZero() throws Throwable  {
      ExpressionImpl expressionImpl = new ExpressionImpl();
      expressionImpl.readFromStringForDebug("YTq\"a$(rrDK6[");
      expressionImpl.getItem(0);
      assertEquals(4, expressionImpl.getNumberOfElementTypes());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetItemReturningExpressionPartWhereGetElementIDIsNegative() throws Throwable  {
      ExpressionImpl expressionImpl = new ExpressionImpl();
      ExpressionPartImpl arg0 = new ExpressionPartImpl();
      arg0.setElementID((-3248));
      expressionImpl.addItem(arg0);
      ExpressionPart item = expressionImpl.getItem(0);
      assertSame(item, arg0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetItemReturningExpressionPartWhereGetElementIDIsPositive() throws Throwable  {
      ExpressionImpl expressionImpl = new ExpressionImpl();
      expressionImpl.readFromStringForDebug("Nn?V`e8(\":@kW^gEDUH");
      expressionImpl.getItem(3);
      assertEquals(7, expressionImpl.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSizeReturningZero() throws Throwable  {
      ExpressionImpl expressionImpl = new ExpressionImpl();
      int size = expressionImpl.size();
      assertEquals(0, size);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testToStringTakingNoArgumentsReturningNonEmptyString() throws Throwable  {
      ExpressionImpl expressionImpl = new ExpressionImpl();
      expressionImpl.readFromStringForDebug("ELEMENT 20");
      expressionImpl.toString();
      assertEquals(7, expressionImpl.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testToStringTakingNoArgumentsReturningEmptyString() throws Throwable  {
      ExpressionImpl expressionImpl = new ExpressionImpl();
      String string = expressionImpl.toString();
      assertEquals("", string);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testToStringTakingExpressionElementMapperReturningNonEmptyString() throws Throwable  {
      ExpressionImpl expressionImpl = new ExpressionImpl();
      ExpressionElementMapperImpl arg0 = new ExpressionElementMapperImpl();
      expressionImpl.readFromStringForDebug("Y1iH6]@4");
      expressionImpl.toString((ExpressionElementMapper) arg0);
      assertEquals(3, expressionImpl.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadFromStringForDebugWithNonEmptyString() throws Throwable  {
      ExpressionImpl expressionImpl = new ExpressionImpl();
      expressionImpl.readFromStringForDebug("[");
      ExpressionElementMapperImpl arg0 = new ExpressionElementMapperImpl();
      expressionImpl.toString((ExpressionElementMapper) arg0);
      assertEquals(1, expressionImpl.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testToStringTakingExpressionElementMapperWithNull() throws Throwable  {
      ExpressionImpl expressionImpl = new ExpressionImpl();
      expressionImpl.readFromStringForDebug("}");
      expressionImpl.toString((ExpressionElementMapper) null);
      assertEquals(1, expressionImpl.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRemoveItemWithZero() throws Throwable  {
      ExpressionImpl expressionImpl = new ExpressionImpl();
      expressionImpl.readFromStringForDebug("ELEMENT 20");
      expressionImpl.removeItem(0);
      assertEquals(6, expressionImpl.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRemoveItemWithPositive() throws Throwable  {
      ExpressionImpl expressionImpl = new ExpressionImpl();
      expressionImpl.removeItem(5);
      assertEquals(0, expressionImpl.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRemoveItemWithNegative() throws Throwable  {
      ExpressionImpl expressionImpl = new ExpressionImpl();
      expressionImpl.removeItem((-601));
      assertEquals(0, expressionImpl.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAddItemWithNull() throws Throwable  {
      ExpressionImpl expressionImpl = new ExpressionImpl();
      ExpressionPartImpl arg0 = new ExpressionPartImpl();
      expressionImpl.readFromStringForDebug("Y1iH6]@4");
      expressionImpl.addItem(arg0);
      expressionImpl.addItem(arg0);
      expressionImpl.addItem((ExpressionPart) null);
      expressionImpl.setItem(5, (ExpressionPart) null);
      assertEquals(2, expressionImpl.getNumberOfElementTypes());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetItem() throws Throwable  {
      ExpressionImpl expressionImpl = new ExpressionImpl();
      expressionImpl.setItem(5, (ExpressionPart) null);
      assertEquals(0, expressionImpl.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetItemWithNegative() throws Throwable  {
      ExpressionImpl expressionImpl = new ExpressionImpl();
      expressionImpl.setItem((-908), (ExpressionPart) null);
      assertEquals(0, expressionImpl.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetItemReturningNull() throws Throwable  {
      ExpressionImpl expressionImpl = new ExpressionImpl();
      ExpressionPart item = expressionImpl.getItem(5);
      assertNull(item);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetItemWithNegative() throws Throwable  {
      ExpressionImpl expressionImpl = new ExpressionImpl();
      ExpressionPart item = expressionImpl.getItem((-908));
      assertNull(item);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testClearAll() throws Throwable  {
      ExpressionImpl expressionImpl = new ExpressionImpl();
      expressionImpl.clearAll();
      assertEquals(0, expressionImpl.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testToStringTakingExpressionElementMapperWithExpressionElementMapperWhereSizeIsZero() throws Throwable  {
      ExpressionImpl expressionImpl = new ExpressionImpl();
      expressionImpl.readFromStringForDebug("A{lLY");
      ExpressionElementMapperImpl arg0 = new ExpressionElementMapperImpl();
      expressionImpl.toString((ExpressionElementMapper) arg0);
      assertEquals(4, expressionImpl.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetNumberOfElementTypes() throws Throwable  {
      ExpressionImpl expressionImpl = new ExpressionImpl();
      expressionImpl.setNumberOfElementTypes((-1128));
      int numberOfElementTypes = expressionImpl.getNumberOfElementTypes();
      assertEquals((-1128), numberOfElementTypes);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetNumberOfElementTypesReturningZero() throws Throwable  {
      ExpressionImpl expressionImpl = new ExpressionImpl();
      int numberOfElementTypes = expressionImpl.getNumberOfElementTypes();
      assertEquals(0, numberOfElementTypes);
  }
}
