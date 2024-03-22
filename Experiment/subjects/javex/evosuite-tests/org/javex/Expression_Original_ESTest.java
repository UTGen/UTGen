/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Tue Mar 19 18:15:34 GMT 2024
 */

package org.javex;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.javex.Expression;
import org.javex.ExpressionImpl;
import org.javex.ExpressionStack;
import org.javex.FunctionExpression;
import org.javex.GenericFunctionExpression;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Expression_Original_ESTest extends Expression_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDoEvaluationStack() throws Throwable  {
      ExpressionImpl expressionImpl = new ExpressionImpl("org.jave!.evaluators.three.logicaM.StartsWithEvaluator");
      expressionImpl.doEvaluationStack();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetExternalFunctionsReturningListWhereIsEmptyIsTrue() throws Throwable  {
      ExpressionImpl expressionImpl = new ExpressionImpl("/muC7D&");
      ExpressionStack expressionStack = new ExpressionStack();
      expressionImpl.externalFunctions = (List) expressionStack;
      List externalFunctions = expressionImpl.getExternalFunctions();
      assertTrue(externalFunctions.isEmpty());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetExternalFunctionsReturningListWhereIsEmptyIsFalse() throws Throwable  {
      ExpressionImpl expressionImpl = new ExpressionImpl("\"");
      ExpressionStack expressionStack = new ExpressionStack();
      expressionImpl.externalFunctions = (List) expressionStack;
      expressionStack.add((Object) "\"");
      List externalFunctions = expressionImpl.getExternalFunctions();
      assertEquals(1, externalFunctions.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEvaluate() throws Throwable  {
      ExpressionImpl expressionImpl = new ExpressionImpl("U~:oZi,8$yQL9q:");
      Object evaluate = expressionImpl.evaluate();
      assertNull(evaluate);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsFunction() throws Throwable  {
      GenericFunctionExpression genericFunctionExpression = new GenericFunctionExpression((String) null);
      boolean function = genericFunctionExpression.isFunction("+");
      assertTrue(function);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetFunction() throws Throwable  {
      ExpressionImpl expressionImpl = new ExpressionImpl("wVaoIo");
      FunctionExpression function = expressionImpl.getFunction("or");
      assertEquals(0, FunctionExpression.LOGICAL);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetExternalFunctionWithNull() throws Throwable  {
      ExpressionImpl expressionImpl = new ExpressionImpl("wVaoIo");
      FunctionExpression externalFunction = expressionImpl.getExternalFunction((String) null);
      assertNull(externalFunction);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsLogicalFunction() throws Throwable  {
      ExpressionImpl expressionImpl = new ExpressionImpl("\"");
      boolean logicalFunction = expressionImpl.isLogicalFunction("!");
      assertTrue(logicalFunction);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetReservedFunctionsThrowsNullPointerException() throws Throwable  {
      // Undeclared exception!
      try { 
        Expression.getReservedFunctions((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testPrepare0() throws Throwable  {
      ExpressionImpl expressionImpl = new ExpressionImpl(",H~\";&Kov-wd66w");
      expressionImpl.prepare();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testPrepare1() throws Throwable  {
      ExpressionImpl expressionImpl = new ExpressionImpl(",");
      expressionImpl.prepare();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testPrepare2() throws Throwable  {
      ExpressionImpl expressionImpl = new ExpressionImpl(";v5 ");
      expressionImpl.prepare();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testPrepare3() throws Throwable  {
      ExpressionImpl expressionImpl = new ExpressionImpl("gH`4ig'x3kZIjIB.K*");
      expressionImpl.prepare();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testPrepareThrowsNullPointerException() throws Throwable  {
      GenericFunctionExpression genericFunctionExpression = new GenericFunctionExpression("f");
      // Undeclared exception!
      try { 
        genericFunctionExpression.prepare();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testPrepare4() throws Throwable  {
      ExpressionImpl expressionImpl = new ExpressionImpl("J=_}#j|C'y&\"[P'9bP");
      expressionImpl.prepare();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsExternalFunction() throws Throwable  {
      ExpressionImpl expressionImpl = new ExpressionImpl("U~:oZi,8$yQL9q:");
      boolean externalFunction = expressionImpl.isExternalFunction((String) null);
      assertFalse(externalFunction);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetExternalFunctionThrowsNullPointerException() throws Throwable  {
      ExpressionImpl expressionImpl = new ExpressionImpl("|");
      ExpressionStack expressionStack = new ExpressionStack();
      expressionImpl.externalFunctions = (List) expressionStack;
      expressionStack.push((Object) null);
      // Undeclared exception!
      try { 
        expressionImpl.getExternalFunction("org.javex.functions.date.DateAddFunction");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetExternalFunction() throws Throwable  {
      ExpressionImpl expressionImpl = new ExpressionImpl("\"");
      ExpressionStack expressionStack = new ExpressionStack();
      expressionImpl.externalFunctions = (List) expressionStack;
      FunctionExpression externalFunction = expressionImpl.getExternalFunction("*");
      assertNull(externalFunction);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsStringFunction() throws Throwable  {
      GenericFunctionExpression genericFunctionExpression = new GenericFunctionExpression("{;uM ^J%c'I=Q7zP");
      boolean stringFunction = genericFunctionExpression.isStringFunction("empty");
      assertFalse(stringFunction);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsDateFunction() throws Throwable  {
      GenericFunctionExpression genericFunctionExpression = new GenericFunctionExpression("");
      boolean dateFunction = genericFunctionExpression.isDateFunction("or");
      assertFalse(dateFunction);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsMathFunction() throws Throwable  {
      ExpressionImpl expressionImpl = new ExpressionImpl("wVaoIo");
      boolean mathFunction = expressionImpl.isMathFunction("or");
      assertFalse(mathFunction);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsReservedFunction() throws Throwable  {
      GenericFunctionExpression genericFunctionExpression = new GenericFunctionExpression(",", 952);
      boolean reservedFunction = genericFunctionExpression.isReservedFunction(",");
      assertFalse(reservedFunction);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testPrepare5() throws Throwable  {
      ExpressionImpl expressionImpl = new ExpressionImpl("pDfs-j+-[DD");
      expressionImpl.prepare();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testPrepare6() throws Throwable  {
      ExpressionImpl expressionImpl = new ExpressionImpl("D Z(+;^{P;0|U)^/<D");
      expressionImpl.prepare();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testPrepare7() throws Throwable  {
      ExpressionImpl expressionImpl = new ExpressionImpl(">1g(z+L)ZP^oVg6");
      expressionImpl.prepare();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetExternalFunctionsReturningNull() throws Throwable  {
      ExpressionImpl expressionImpl = new ExpressionImpl("/muC7D&");
      List externalFunctions = expressionImpl.getExternalFunctions();
      assertNull(externalFunctions);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testPrepare8() throws Throwable  {
      ExpressionImpl expressionImpl = new ExpressionImpl(" m,eE");
      expressionImpl.prepare();
  }
}
