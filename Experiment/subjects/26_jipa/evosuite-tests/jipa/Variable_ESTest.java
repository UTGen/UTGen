/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Wed Mar 20 23:58:56 GMT 2024
 */

package jipa;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import jipa.Variable;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Variable_ESTest extends Variable_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetVariableValueReturningZero() throws Throwable  {
      // rollbacked to evosuite
      int variableValue = Variable.getVariableValue("&");
      assertEquals(0, variableValue);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetVariableValue() throws Throwable  {
      // No Comments were added
      Variable.setVariableValue("", (-88));
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetVariableValueReturningPositive() throws Throwable  {
      // No Comments were added
      int variableValue = Variable.getVariableValue("");
      assertEquals(0, variableValue);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetVariableValueReturningNegative() throws Throwable  {
      // Given a variable with a value of "*", which represents a wildcard character.
      int variableValue = Variable.getVariableValue("*");
      
      // When the method "getVariableValue" is called on this variable, it returns -1.
      assertEquals((-1), variableValue);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRemoveVariableWithEmptyString() throws Throwable  {
      // No Comments were added
      Variable.removeVariable("");
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRemoveVariableWithNonEmptyString() throws Throwable  {
      // No Comments were added
      Variable.removeVariable("=7fN=+Sq|5794D");
  }
}
