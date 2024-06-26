/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Wed Mar 20 10:56:24 GMT 2024
 */

package JSci.maths;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import JSci.maths.NumericalConstants;
import JSci.maths.SpecialMath;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SpecialMath_Original_ESTest extends SpecialMath_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testChebyshevReturningPositive() throws Throwable  {
      double[] arg1 = new double[5];
      arg1[0] = 1.3562611692058875E-64;
      double chebyshev = SpecialMath.chebyshev(1.0634833707413236, arg1);
      assertEquals(6.781305846029437E-65, chebyshev, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testChebyshevReturningNegative() throws Throwable  {
      double[] arg1 = new double[1];
      arg1[0] = Double.NEGATIVE_INFINITY;
      double chebyshev = SpecialMath.chebyshev(0.0, arg1);
      assertEquals(Double.NEGATIVE_INFINITY, chebyshev, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testComplementaryError0() throws Throwable  {
      double complementaryError = SpecialMath.complementaryError(2.5066282746310007);
      assertEquals(3.927505882862938E-4, complementaryError, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testErrorReturningZero() throws Throwable  {
      double error = SpecialMath.error(0.0);
      assertEquals(0.0, error, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLogGamma0() throws Throwable  {
      double logGamma = SpecialMath.logGamma(388.0);
      assertEquals(1922.808722413808, logGamma, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testBesselSecondOneReturningNegative() throws Throwable  {
      double _double = NumericalConstants.SQRT2;
      SpecialMath.modBesselFirstZero(2.6532183907134017E-13);
      SpecialMath.complementaryError(1544.3325);
      SpecialMath.gamma(0.0);
      SpecialMath.besselSecondOne(2.4E-17);
      SpecialMath.besselSecondZero((-3643.103));
      double besselFirstZero = SpecialMath.besselFirstZero((-262.71874381716));
      double logGamma = SpecialMath.logGamma(0.011277839392865573);
      assertNotEquals(logGamma, besselFirstZero, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLogGammaWithNegative() throws Throwable  {
      double logGamma = SpecialMath.logGamma((-1547.3829954482));
      assertEquals(1.7976931348623157E308, logGamma, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLogGamma1() throws Throwable  {
      double logGamma = SpecialMath.logGamma(2.55E305);
      assertEquals(1.7906725941420033E308, logGamma, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testChebyshevReturningZero() throws Throwable  {
      double[] arg1 = new double[1];
      double chebyshev = SpecialMath.chebyshev(0.0, arg1);
      assertEquals(0.0, chebyshev, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testComplementaryError1() throws Throwable  {
      double complementaryError = SpecialMath.complementaryError(12.0);
      assertEquals(1.3562611692058875E-64, complementaryError, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testComplementaryErrorWithNegative() throws Throwable  {
      double complementaryError = SpecialMath.complementaryError((-1898.450318904));
      assertEquals(2.0, complementaryError, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testError0() throws Throwable  {
      double error = SpecialMath.error(6.655343737258E7);
      assertEquals(1.0, error, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testError1() throws Throwable  {
      double error = SpecialMath.error(1.4142135623730951);
      assertEquals(0.9544997361036416, error, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testBesselFirstOneReturningPositive() throws Throwable  {
      double complementaryError = SpecialMath.complementaryError(0.33034212811556346);
      assertEquals(0.6403751665137638, complementaryError, 0.01);
      
      double besselFirstZero = SpecialMath.besselFirstZero(66.0);
      assertEquals((-0.07113722783672548), besselFirstZero, 0.01);
      
      SpecialMath.incompleteBeta((-1160.571117845838), 6.283185307179586, 865.27);
      SpecialMath.logGamma(11.156544834846414);
      double error = SpecialMath.error(1.4142135623730951);
      assertEquals(0.9544997361036416, error, 0.01);
      
      double besselFirstOne = SpecialMath.besselFirstOne(0.6403751665137638);
      assertEquals(0.3040528107054731, besselFirstOne, 0.01);
      
      double besselSecondZero = SpecialMath.besselSecondZero(2.302585092994046);
      assertEquals(0.4705341456530895, besselSecondZero, 0.01);
      
      double beta = SpecialMath.beta(483.182877883, (-3643.103));
      assertEquals(0.0, beta, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testErrorReturningNegative() throws Throwable  {
      double error = SpecialMath.error((-1.0));
      assertEquals((-0.8427007929497149), error, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIncompleteBetaReturningZero() throws Throwable  {
      double incompleteBeta = SpecialMath.incompleteBeta(Double.NaN, 2.55E305, 2.55E305);
      assertEquals(0.0, incompleteBeta, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIncompleteBetaWithNegativeAndPositive0() throws Throwable  {
      double incompleteBeta = SpecialMath.incompleteBeta(3.14E-15, 2.356194490192345, (-1191.7307011173));
      assertEquals(0.0, incompleteBeta, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIncompleteBetaWithNegativeAndPositive1() throws Throwable  {
      double incompleteBeta = SpecialMath.incompleteBeta(9.862928057727998E-4, (-9.0E-16), 9.862928057727998E-4);
      assertEquals(0.0, incompleteBeta, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIncompleteBetaAndIncompleteBetaReturningPositive0() throws Throwable  {
      double incompleteBeta = SpecialMath.incompleteBeta(1.6726711843478408E297, 1.6726711843478408E297, 1.5);
      assertEquals(1.0, incompleteBeta, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLogBetaWithPositiveAndPositive() throws Throwable  {
      double logBeta = SpecialMath.logBeta(2.55E305, 2.55E305);
      assertEquals(0.0, logBeta, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLogBetaWithNegative() throws Throwable  {
      double logBeta = SpecialMath.logBeta(Double.NaN, (-1662.0225124));
      assertEquals(0.0, logBeta, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLogBetaWithZero() throws Throwable  {
      double logBeta = SpecialMath.logBeta(0.0, (-1420.3418606158023));
      assertEquals(0.0, logBeta, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testBeta() throws Throwable  {
      double beta = SpecialMath.beta(2.55E305, 2.55E305);
      assertEquals(0.0, beta, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testBetaWithNegative() throws Throwable  {
      double beta = SpecialMath.beta((-2498.314), (-2398.533));
      assertEquals(0.0, beta, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIncompleteGammaWithPositive() throws Throwable  {
      double incompleteGamma = SpecialMath.incompleteGamma(1.7976931348623157E308, 2.4E-17);
      assertEquals(0.0, incompleteGamma, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIncompleteGamma() throws Throwable  {
      double incompleteGamma = SpecialMath.incompleteGamma((-1454.9282488858364), 1.32979E-11);
      assertEquals(0.0, incompleteGamma, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIncompleteGammaWithNegative() throws Throwable  {
      double incompleteGamma = SpecialMath.incompleteGamma((-3960.0), (-1898.450318904));
      assertEquals(0.0, incompleteGamma, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIncompleteGammaReturningPositive() throws Throwable  {
      double incompleteGamma = SpecialMath.incompleteGamma(6.283185307179586, 6.283185307179586);
      assertEquals(0.5530815666191685, incompleteGamma, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLogGammaReturningNegative() throws Throwable  {
      double logGamma = SpecialMath.logGamma(1.618033988749895);
      assertEquals((-0.11017971860102571), logGamma, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIncompleteBetaAndIncompleteBetaReturningPositive1() throws Throwable  {
      double incompleteBeta = SpecialMath.incompleteBeta(0.2732573483808364, 0.2732573483808364, 0.2732573483808364);
      assertEquals(0.40212898576264705, incompleteBeta, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLogGammaReturningZero() throws Throwable  {
      double logGamma = SpecialMath.logGamma(1.0);
      assertEquals(0.0, logGamma, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLogBetaReturningPositive() throws Throwable  {
      double logBeta = SpecialMath.logBeta(4.17E-14, 3261.3);
      assertEquals(30.808275266106648, logBeta, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIncompleteBeta() throws Throwable  {
      double incompleteBeta = SpecialMath.incompleteBeta(1.0635998144060952E-19, 1.0637257298320818E-19, 2.55E305);
      assertEquals(Double.NaN, incompleteBeta, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLogBetaReturningNegative() throws Throwable  {
      SpecialMath.logBeta(1.0, 1675.650112535877);
      SpecialMath.modBesselFirstZero((-7.4239564958443225));
      SpecialMath.complementaryError(0.0);
      double logGamma = SpecialMath.logGamma(1.7976931348623157E308);
      assertEquals(1.7976931348623157E308, logGamma, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIncompleteGammaReturningNegative() throws Throwable  {
      double incompleteGamma = SpecialMath.incompleteGamma(2.55E305, 1.7906725941420033E308);
      assertEquals(Double.NEGATIVE_INFINITY, incompleteGamma, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testBetaReturningPositive() throws Throwable  {
      double beta = SpecialMath.beta(Double.NaN, 13.5075212);
      assertEquals(1.0, beta, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testBesselSecondOneWithZero() throws Throwable  {
      SpecialMath.gamma(1373.681172);
      SpecialMath.besselSecondOne(0.0);
      double error = SpecialMath.error(2.5104152792E-7);
      SpecialMath.complementaryError(3479.0699778126614);
      SpecialMath.modBesselFirstZero((-2004.0));
      SpecialMath.complementaryError((-1898.450318904));
      SpecialMath.incompleteGamma((-3960.0), (-1898.450318904));
      double logGamma = SpecialMath.logGamma(2.22E-16);
      assertNotEquals(logGamma, error, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGammaAndGammaWithNegative0() throws Throwable  {
      double gamma = SpecialMath.gamma((-33.717496492649424));
      assertEquals(3.7268496519797757E-38, gamma, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGammaAndGammaWithPositive0() throws Throwable  {
      double gamma = SpecialMath.gamma(8.12652533730749E-18);
      assertEquals(1.23053821712604624E17, gamma, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGammaAndGammaWithPositive1() throws Throwable  {
      double gamma = SpecialMath.gamma(3.483E-321);
      assertEquals(1.7976931348623157E308, gamma, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGammaReturningNegative() throws Throwable  {
      double gamma = SpecialMath.gamma((-2.9183389184E-7));
      assertEquals((-3426607.383214542), gamma, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGammaAndGammaWithNegative1() throws Throwable  {
      double gamma = SpecialMath.gamma((-1.1943639267486825));
      assertEquals(4.988156541855706, gamma, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGammaAndGammaWithPositive2() throws Throwable  {
      double gamma = SpecialMath.gamma(1.176836406102666E-14);
      assertEquals(8.497357787491444E13, gamma, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testBesselSecondOneReturningPositive() throws Throwable  {
      double besselSecondOne = SpecialMath.besselSecondOne(419.7804681670614);
      assertEquals(0.015403521705266335, besselSecondOne, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testBesselSecondZeroReturningNegative() throws Throwable  {
      double besselSecondZero = SpecialMath.besselSecondZero(4.478509887770736);
      assertEquals((-0.1881765168430667), besselSecondZero, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testModBesselFirstOneReturningNegative() throws Throwable  {
      double modBesselFirstOne = SpecialMath.modBesselFirstOne((-786.1));
      double[] doubleArray = new double[6];
      doubleArray[0] = 1399.4398;
      doubleArray[1] = Double.NEGATIVE_INFINITY;
      doubleArray[2] = Double.NEGATIVE_INFINITY;
      doubleArray[3] = (-2.79614E-12);
      doubleArray[4] = (-786.1);
      doubleArray[5] = 2.0;
      double logGamma = SpecialMath.logGamma(0.5772156649015329);
      assertNotEquals(logGamma, modBesselFirstOne, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testModBesselFirstOne0() throws Throwable  {
      double modBesselFirstOne = SpecialMath.modBesselFirstOne(1.4142135623730951);
      assertEquals(0.8992442797523064, modBesselFirstOne, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testModBesselFirstOne1() throws Throwable  {
      double modBesselFirstOne = SpecialMath.modBesselFirstOne(6.283185307179586);
      assertEquals(79.83900839670365, modBesselFirstOne, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testModBesselFirstOneReturningZero() throws Throwable  {
      double modBesselFirstOne = SpecialMath.modBesselFirstOne(0.0);
      assertEquals(0.0, modBesselFirstOne, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testBesselFirstOneReturningNegative() throws Throwable  {
      double besselFirstOne = SpecialMath.besselFirstOne(4090.6);
      assertEquals((-0.0064026051846008), besselFirstOne, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testBesselFirstOneReturningZero() throws Throwable  {
      double besselFirstOne = SpecialMath.besselFirstOne(0.0);
      assertEquals(0.0, besselFirstOne, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testBesselFirstZero() throws Throwable  {
      double besselFirstZero = SpecialMath.besselFirstZero(3.483E-321);
      assertEquals(1.0, besselFirstZero, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testBesselFirstZeroWithZero() throws Throwable  {
      double besselFirstZero = SpecialMath.besselFirstZero(0.0);
      assertEquals(1.0, besselFirstZero, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAiry() throws Throwable  {
      double airy = SpecialMath.airy((-2.0));
      assertEquals(0.22740742820168558, airy, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAiryReturningZero() throws Throwable  {
      double airy = SpecialMath.airy(329955.5621774619);
      assertEquals(0.0, airy, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAiryWithZero() throws Throwable  {
      double airy = SpecialMath.airy(0.0);
      assertEquals(0.3550280538878172, airy, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAiryReturningNegative() throws Throwable  {
      double airy = SpecialMath.airy((-1008.1778));
      assertEquals((-0.08027955303507081), airy, 0.01);
  }
}
