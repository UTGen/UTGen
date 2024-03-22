/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Tue Mar 19 15:57:05 GMT 2024
 */

package org.apache.commons.math3.optimization.linear;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.optimization.linear.SimplexTableau;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SimplexTableau_Original_ESTest extends SimplexTableau_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetInvertedCoefficientSum() throws Throwable  {
      ArrayRealVector arg0 = new ArrayRealVector(224);
      double invertedCoefficientSum = SimplexTableau.getInvertedCoefficientSum(arg0);
      assertEquals(0.0, invertedCoefficientSum, 0.01);
  }
}
