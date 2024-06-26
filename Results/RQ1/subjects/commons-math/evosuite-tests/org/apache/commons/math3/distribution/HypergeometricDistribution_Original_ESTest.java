/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Tue Mar 19 11:28:02 GMT 2024
 */

package org.apache.commons.math3.distribution;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.distribution.HypergeometricDistribution;
import org.apache.commons.math3.random.RandomGenerator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class HypergeometricDistribution_Original_ESTest extends HypergeometricDistribution_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetSupportUpperBoundReturningZero() throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution = new HypergeometricDistribution(2, 0, 2);
      int supportUpperBound = hypergeometricDistribution.getSupportUpperBound();
      assertEquals(2, hypergeometricDistribution.getSampleSize());
      assertEquals(0, supportUpperBound);
      assertEquals(2, hypergeometricDistribution.getPopulationSize());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetSupportUpperBoundReturningPositive() throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution = new HypergeometricDistribution(4500, 4500, 4500);
      int supportUpperBound = hypergeometricDistribution.getSupportUpperBound();
      assertEquals(4500.0, hypergeometricDistribution.getNumericalMean(), 0.01);
      assertEquals(4500, supportUpperBound);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetSupportLowerBoundReturningZero() throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution = new HypergeometricDistribution(1, 1, 0);
      int supportLowerBound = hypergeometricDistribution.getSupportLowerBound();
      assertEquals(1, hypergeometricDistribution.getPopulationSize());
      assertEquals(0, hypergeometricDistribution.getSampleSize());
      assertEquals(0, supportLowerBound);
      assertEquals(1, hypergeometricDistribution.getNumberOfSuccesses());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetSupportLowerBoundReturningPositive() throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution = new HypergeometricDistribution(1718, 1718, 1718);
      int supportLowerBound = hypergeometricDistribution.getSupportLowerBound();
      assertEquals(1718, supportLowerBound);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetSampleSizeReturningZero() throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution = new HypergeometricDistribution(75, 75, 0);
      int sampleSize = hypergeometricDistribution.getSampleSize();
      assertEquals(75, hypergeometricDistribution.getPopulationSize());
      assertEquals(75, hypergeometricDistribution.getNumberOfSuccesses());
      assertEquals(0.0, hypergeometricDistribution.getNumericalMean(), 0.01);
      assertEquals(0, sampleSize);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetNumericalVarianceReturningZero() throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution = new HypergeometricDistribution(2, 0, 2);
      double numericalVariance = hypergeometricDistribution.getNumericalVariance();
      assertEquals(0, hypergeometricDistribution.getNumberOfSuccesses());
      assertEquals(0.0, numericalVariance, 0.01);
      assertEquals(2, hypergeometricDistribution.getPopulationSize());
      assertEquals(2, hypergeometricDistribution.getSampleSize());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetNumericalVarianceReturningPositive() throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution = new HypergeometricDistribution(1347, 579, 579);
      double numericalVariance = hypergeometricDistribution.getNumericalVariance();
      assertEquals(80.96537210712938, numericalVariance, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetNumericalMeanReturningZero() throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution = new HypergeometricDistribution(2, 0, 2);
      double numericalMean = hypergeometricDistribution.getNumericalMean();
      assertEquals(0.0, numericalMean, 0.01);
      assertEquals(2, hypergeometricDistribution.getSampleSize());
      assertEquals(2, hypergeometricDistribution.getPopulationSize());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetNumericalMeanReturningPositive() throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution = new HypergeometricDistribution(2134, 2134, 2134);
      double numericalMean = hypergeometricDistribution.getNumericalMean();
      assertEquals(2134.0, numericalMean, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetNumberOfSuccessesReturningZero() throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution = new HypergeometricDistribution(2, 0, 2);
      int numberOfSuccesses = hypergeometricDistribution.getNumberOfSuccesses();
      assertEquals(2, hypergeometricDistribution.getSampleSize());
      assertEquals(0.0, hypergeometricDistribution.getNumericalMean(), 0.01);
      assertEquals(2, hypergeometricDistribution.getPopulationSize());
      assertEquals(0, numberOfSuccesses);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCalculateNumericalVarianceReturningZero() throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution = new HypergeometricDistribution(419, 419, 419);
      double calculateNumericalVariance = hypergeometricDistribution.calculateNumericalVariance();
      assertEquals(0.0, calculateNumericalVariance, 0.01);
      assertEquals(419.0, hypergeometricDistribution.getNumericalMean(), 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCalculateNumericalVarianceReturningPositive() throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution = new HypergeometricDistribution(465, 441, 441);
      double calculateNumericalVariance = hypergeometricDistribution.calculateNumericalVariance();
      assertEquals(1.1165438300620762, calculateNumericalVariance, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testProbabilityReturningPositive() throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution = new HypergeometricDistribution(247, 2, 2);
      double probability = hypergeometricDistribution.probability(0);
      assertEquals(0.9838385833251042, probability, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetPopulationSize() throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution = new HypergeometricDistribution(1347, 579, 579);
      int populationSize = hypergeometricDistribution.getPopulationSize();
      assertEquals(248.87973273942094, hypergeometricDistribution.getNumericalMean(), 0.01);
      assertEquals(1347, populationSize);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetNumberOfSuccessesReturningPositive() throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution = new HypergeometricDistribution(1347, 579, 579);
      int numberOfSuccesses = hypergeometricDistribution.getNumberOfSuccesses();
      assertEquals(248.87973273942094, hypergeometricDistribution.getNumericalMean(), 0.01);
      assertEquals(579, numberOfSuccesses);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetSampleSizeReturningPositive() throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution = new HypergeometricDistribution(1347, 579, 579);
      int sampleSize = hypergeometricDistribution.getSampleSize();
      assertEquals(248.87973273942094, hypergeometricDistribution.getNumericalMean(), 0.01);
      assertEquals(579, sampleSize);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetNumericalVariance() throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution = new HypergeometricDistribution(1, 0, 1);
      hypergeometricDistribution.sample();
      double numericalVariance = hypergeometricDistribution.getNumericalVariance();
      assertEquals(0.0, hypergeometricDistribution.getNumericalMean(), 0.01);
      assertEquals(1, hypergeometricDistribution.getSampleSize());
      assertEquals(Double.NaN, numericalVariance, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testUpperCumulativeProbability0() throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution = new HypergeometricDistribution(465, 441, 441);
      double upperCumulativeProbability = hypergeometricDistribution.upperCumulativeProbability(441);
      assertEquals(1.0865886174980112E-40, upperCumulativeProbability, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testUpperCumulativeProbability1() throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution = new HypergeometricDistribution(465, 441, 441);
      double upperCumulativeProbability = hypergeometricDistribution.upperCumulativeProbability(11);
      assertEquals(418.23870967741937, hypergeometricDistribution.getNumericalMean(), 0.01);
      assertEquals(1.0, upperCumulativeProbability, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testUpperCumulativeProbabilityReturningZero() throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution = new HypergeometricDistribution(1, 1, 0);
      double upperCumulativeProbability = hypergeometricDistribution.upperCumulativeProbability(375);
      assertEquals(1, hypergeometricDistribution.getNumberOfSuccesses());
      assertEquals(0.0, upperCumulativeProbability, 0.01);
      assertEquals(1, hypergeometricDistribution.getPopulationSize());
      assertEquals(0.0, hypergeometricDistribution.getNumericalMean(), 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testProbabilityWithPositive() throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution = new HypergeometricDistribution(1, 0, 1);
      double probability = hypergeometricDistribution.probability(1134);
      assertEquals(0.0, probability, 0.01);
      assertEquals(1, hypergeometricDistribution.getPopulationSize());
      assertEquals(1, hypergeometricDistribution.getSampleSize());
      assertEquals(0.0, hypergeometricDistribution.getNumericalMean(), 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testProbabilityWithNegative() throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution = new HypergeometricDistribution(2, 0, 2);
      double probability = hypergeometricDistribution.probability((-4417));
      assertEquals(0.0, hypergeometricDistribution.getNumericalMean(), 0.01);
      assertEquals(2, hypergeometricDistribution.getSampleSize());
      assertEquals(2, hypergeometricDistribution.getPopulationSize());
      assertEquals(0.0, probability, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCumulativeProbabilityReturningPositive() throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution = new HypergeometricDistribution(586, 586, 586);
      double cumulativeProbability = hypergeometricDistribution.cumulativeProbability(586);
      assertEquals(1.0, cumulativeProbability, 0.01);
      assertEquals(586.0, hypergeometricDistribution.getNumericalMean(), 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCumulativeProbabilityReturningZero() throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution = new HypergeometricDistribution(2, 0, 2);
      double cumulativeProbability = hypergeometricDistribution.cumulativeProbability((-2117));
      assertEquals(0.0, cumulativeProbability, 0.01);
      assertEquals(2, hypergeometricDistribution.getPopulationSize());
      assertEquals(0.0, hypergeometricDistribution.getNumericalMean(), 0.01);
      assertEquals(2, hypergeometricDistribution.getSampleSize());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesHypergeometricDistributionTaking3Arguments0() throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution = null;
      try {
        hypergeometricDistribution = new HypergeometricDistribution(31, 31, 1573);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // sample size (1,573) must be less than or equal to population size (31)
         //
         verifyException("org.apache.commons.math3.distribution.HypergeometricDistribution", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesHypergeometricDistributionTaking3Arguments1() throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution = null;
      try {
        hypergeometricDistribution = new HypergeometricDistribution(2, 7, 7);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of successes (7) must be less than or equal to population size (2)
         //
         verifyException("org.apache.commons.math3.distribution.HypergeometricDistribution", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesHypergeometricDistributionTaking3Arguments2() throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution = null;
      try {
        hypergeometricDistribution = new HypergeometricDistribution(11, 11, (-200));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of samples (-200)
         //
         verifyException("org.apache.commons.math3.distribution.HypergeometricDistribution", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesHypergeometricDistributionTaking4Arguments() throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution = null;
      try {
        hypergeometricDistribution = new HypergeometricDistribution((RandomGenerator) null, 1039, (-1049), 836);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of successes (-1,049)
         //
         verifyException("org.apache.commons.math3.distribution.HypergeometricDistribution", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesHypergeometricDistributionTaking3Arguments3() throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution = null;
      try {
        hypergeometricDistribution = new HypergeometricDistribution((-186), 0, 4033);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // population size (-186)
         //
         verifyException("org.apache.commons.math3.distribution.HypergeometricDistribution", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsSupportConnected() throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution = new HypergeometricDistribution(2, 0, 2);
      boolean supportConnected = hypergeometricDistribution.isSupportConnected();
      assertTrue(supportConnected);
      assertEquals(0.0, hypergeometricDistribution.getNumericalMean(), 0.01);
      assertEquals(2, hypergeometricDistribution.getPopulationSize());
      assertEquals(2, hypergeometricDistribution.getSampleSize());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesHypergeometricDistributionTaking3Arguments4() throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution = new HypergeometricDistribution(1037, 931, 931);
      int sample = hypergeometricDistribution.sample();
      assertEquals(835.8351012536162, hypergeometricDistribution.getNumericalMean(), 0.01);
      assertEquals(840, sample);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetNumericalMeanReturningNegative() throws Throwable  {
      HypergeometricDistribution hypergeometricDistribution = new HypergeometricDistribution(9999957, 9999957, 9999957);
      double numericalMean = hypergeometricDistribution.getNumericalMean();
      assertEquals((-58.35534282797416), numericalMean, 0.01);
  }
}
