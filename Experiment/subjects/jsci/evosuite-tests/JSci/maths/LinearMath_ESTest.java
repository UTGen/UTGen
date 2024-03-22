/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Wed Mar 20 11:11:00 GMT 2024
 */

package JSci.maths;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import JSci.maths.LinearMath;
import JSci.maths.matrices.AbstractComplexSquareMatrix;
import JSci.maths.matrices.AbstractDoubleSquareMatrix;
import JSci.maths.matrices.ComplexDiagonalMatrix;
import JSci.maths.matrices.DoubleFileSquareMatrix;
import JSci.maths.matrices.DoubleSparseSquareMatrix;
import JSci.maths.matrices.DoubleTridiagonalMatrix;
import JSci.maths.polynomials.RealPolynomial;
import JSci.maths.vectors.AbstractComplexVector;
import JSci.maths.vectors.AbstractDoubleVector;
import JSci.maths.vectors.DoubleVector;
import JSci.maths.vectors.IntegerVector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class LinearMath_ESTest extends LinearMath_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEigenSolveHermitian() throws Throwable  {
      // rollbacked to evosuite
      AbstractComplexVector[] abstractComplexVectorArray = new AbstractComplexVector[1];
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testOrthonormalizeReturningNonEmptyArray() throws Throwable  {
      // Given a vector with 4 elements
      DoubleVector doubleVector = new DoubleVector(4);
      
      // And two vectors, each with 4 elements, that are identical to the first vector
      AbstractDoubleVector[] arg0 = new AbstractDoubleVector[2];
      arg0[0] = (AbstractDoubleVector) doubleVector;
      arg0[1] = (AbstractDoubleVector) doubleVector;
      
      // When we orthonormalize these vectors
      AbstractDoubleVector[] orthonormalize = LinearMath.orthonormalize(arg0);
      
      // Then the result should be an array with 2 elements, each element being a vector of length 4
      assertEquals(2, orthonormalize.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLeastSquaresFitReturningRealPolynomialWhereIsZeroIsFalse() throws Throwable  {
      // Given a set of input data
      double[][] arg1 = new double[2][9];
      double[] doubleArray = new double[1];
      doubleArray[0] = 822.85473;
      arg1[0] = doubleArray;
      arg1[1] = doubleArray;
      
      // When the least squares fit is computed
      RealPolynomial leastSquaresFit = LinearMath.leastSquaresFit(0, arg1);
      
      // Then the resulting polynomial should not be equal to zero or one
      assertFalse(leastSquaresFit.isZero());
      assertFalse(leastSquaresFit.isOne());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEigenvalueSolveSymmetricTaking3ArgumentsThrowsTooManyResourcesException() throws Throwable  {
      // Given: a matrix with dimensions (m x n), where m != n
      DoubleSparseSquareMatrix arg0 = new DoubleSparseSquareMatrix(1742, 195);
      
      // When: calling eigenvalueSolveSymmetric on the matrix with a maximum number of eigenvalues set to 10
      IntegerVector integerVector = new IntegerVector(1742);
      AbstractDoubleVector arg1 = integerVector.toDoubleVector();
      LinearMath.eigenvalueSolveSymmetric((AbstractDoubleSquareMatrix) arg0, arg1, 10);
      
      // Then: an IllegalArgumentException is thrown
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEigenvalueSolveSymmetricTaking3Arguments() throws Throwable  {
      // Arrange
      DoubleSparseSquareMatrix matrix = new DoubleSparseSquareMatrix(1251, 1251);
      IntegerVector vector = new IntegerVector(1251);
      AbstractDoubleVector doubleVector = vector.toDoubleVector();
      
      // Act
      double[] eigenvalueSolveSymmetric = LinearMath.eigenvalueSolveSymmetric((AbstractDoubleSquareMatrix) matrix, doubleVector, 1);
      
      // Assert
      assertEquals(1, eigenvalueSolveSymmetric.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test0() throws Throwable  {
      // Given a matrix representing a 2x2 system of linear equations with real coefficients,
      double[] arg1 = new double[6];
      arg1[0] = (double) 250;
      arg1[1] = (double) 250;
      ComplexDiagonalMatrix complexDiagonalMatrix = new ComplexDiagonalMatrix(arg1, arg1);
      
      // When the matrix is polar decomposed,
      AbstractComplexSquareMatrix[] polarDecompose = complexDiagonalMatrix.polarDecompose();
      
      // Then the decomposition should have two matrices
      assertEquals(2, polarDecompose.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test1() throws Throwable  {
      // Given a ComplexDiagonalMatrix object with a NaN value in arg1
      double[] arg1 = new double[3];
      arg1[1] = Double.NaN;
      ComplexDiagonalMatrix complexDiagonalMatrix = new ComplexDiagonalMatrix(arg1, arg1);
      
      // When the polarDecompose method is called with this matrix
      AbstractComplexSquareMatrix[] polarDecompose = complexDiagonalMatrix.polarDecompose();
      
      // Then the returned value should be null
      assertNull(polarDecompose);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEigenvalueSolveHermitian() throws Throwable  {
      // Given a ComplexDiagonalMatrix with diagonal elements 1251 and 1251
      double[] arg1 = new double[4];
      arg1[0] = (double) 1251;
      arg1[1] = (double) 1251;
      ComplexDiagonalMatrix arg0 = new ComplexDiagonalMatrix(arg1, arg1);
      
      // When the eigenvalueSolveHermitian method is called on this matrix
      double[] eigenvalueSolveHermitian = LinearMath.eigenvalueSolveHermitian(arg0);
      
      // Then the resulting eigenvalues should be 2502 and 0, with an error tolerance of 0.01
      assertArrayEquals(new double[] {2502.0, 2.2737367544323206E-13, 0.0, 0.0}, eigenvalueSolveHermitian, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEigenvalueSolveHermitianThrowsException() throws Throwable  {
      // Given: A complex diagonal matrix with a negative infinity value on the third diagonal element.
      double[] arg1 = new double[7];
      arg1[3] = Double.NEGATIVE_INFINITY;
      ComplexDiagonalMatrix arg0 = new ComplexDiagonalMatrix(arg1, arg1);
      
      // When: The eigenvalueSolveHermitian() method is called on the matrix.
      try {
      LinearMath.eigenvalueSolveHermitian(arg0);
      fail("Expecting exception: Exception");
      } catch(Exception e) {
      // No convergence after 250 iterations.
      verifyException("JSci.maths.LinearMath", e);
      }
      
      // Then: The method should throw an exception because the matrix is not Hermitian.
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEigenSolveSymmetricTaking1And1AndEigenSolveSymmetricTaking1And1AndEigenSolveSymmetricTaking1And1ReturningNonEmptyArray0() throws Throwable  {
      // Set up the input matrix with a size of 5x5
      DoubleFileSquareMatrix arg0 = new DoubleFileSquareMatrix(5);
      
      // Initialize an array to hold the eigenvectors
      AbstractDoubleVector[] arg1 = new AbstractDoubleVector[7];
      
      // Compute the eigenvalues and eigenvectors of the input matrix using LinearMath.eigenSolveSymmetric()
      double[] eigenSolveSymmetric = LinearMath.eigenSolveSymmetric((AbstractDoubleSquareMatrix) arg0, arg1);
      
      // Assert that the first 5 elements of the output array are all approximately equal to 0
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0}, eigenSolveSymmetric, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEigenvalueSolveSymmetricTakingAbstractDoubleSquareMatrix() throws Throwable  {
      // Create a tridiagonal matrix of size 82
      DoubleTridiagonalMatrix arg0 = new DoubleTridiagonalMatrix(82);
      
      // Solve for eigenvalues of the symmetric matrix
      double[] eigenvalueSolveSymmetric = LinearMath.eigenvalueSolveSymmetric((AbstractDoubleSquareMatrix) arg0);
      
      // Assert that the length of the array returned by eigenvalueSolveSymmetric is 82
      assertEquals(82, eigenvalueSolveSymmetric.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEigenSolveSymmetricTaking1And1AndEigenSolveSymmetricTaking1And1AndEigenSolveSymmetricTaking1And1ReturningNonEmptyArray1() throws Throwable  {
      // Given a tridiagonal matrix and an array of vectors, when solving for eigenvalues, we expect to get back the correct number of eigenvalues.
      DoubleTridiagonalMatrix arg0 = new DoubleTridiagonalMatrix(4);
      AbstractDoubleVector[] arg1 = new AbstractDoubleVector[4];
      double[] eigenSolveSymmetric = LinearMath.eigenSolveSymmetric(arg0, arg1);
      // Then we verify that the length of the array returned by eigenSolveSymmetric is equal to the number of eigenvalues expected for this matrix.
      assertEquals(4, eigenSolveSymmetric.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEigenvalueSolveSymmetricTakingDoubleTridiagonalMatrix() throws Throwable  {
      // Given a symmetric matrix of size 4x4
      DoubleTridiagonalMatrix arg0 = new DoubleTridiagonalMatrix(4);
      
      // When the eigenvalue solve method is called on the matrix
      double[] eigenvalueSolveSymmetric = LinearMath.eigenvalueSolveSymmetric(arg0);
      
      // Then the result should be an array of zeros with a tolerance of 0.01
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0}, eigenvalueSolveSymmetric, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testOrthonormalizeReturningEmptyArray() throws Throwable  {
      // Given a set of zero-dimensional AbstractDoubleVectors
      AbstractDoubleVector[] arg0 = new AbstractDoubleVector[0];
      
      // When the vectors are orthogonalized using LinearMath.orthonormalize()
      AbstractDoubleVector[] orthonormalize = LinearMath.orthonormalize(arg0);
      
      // Then the result should be an empty vector array with length 0
      assertEquals(0, orthonormalize.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLinearRegression() throws Throwable  {
      // Given a matrix of double values
      double[][] arg0 = new double[3][3];
      
      // When we perform linear regression on this matrix
      AbstractDoubleVector linearRegression = LinearMath.linearRegression(arg0);
      
      // Then the resulting vector should have 3 dimensions
      assertEquals(3, linearRegression.dimension());
      
      // And the norm of the vector should be NaN with an error less than 0.01
      assertEquals(Double.NaN, linearRegression.infNorm(), 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSolveGMResThrowsAssertionError() throws Throwable  {
      // No Comments were added
      DoubleSparseSquareMatrix arg0 = new DoubleSparseSquareMatrix(250);
      DoubleVector arg1 = new DoubleVector(250);
      // Undeclared exception!
      try { 
        LinearMath.solveGMRes(arg0, arg1, 250, 250);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // There is a bug.
         //
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSolveGMResWithNegative() throws Throwable  {
      // No Comments were added
      DoubleSparseSquareMatrix arg0 = new DoubleSparseSquareMatrix(1251, 1251);
      DoubleVector arg1 = new DoubleVector(1251);
      // Undeclared exception!
      try { 
        LinearMath.solveGMRes(arg0, arg1, 1251, (-0.5));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Tolerance must be positive or zero: -0.5 < 0.
         //
         verifyException("JSci.maths.LinearMath", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSolveGMResWithNullAndNegative() throws Throwable  {
      // Create a DoubleFileSquareMatrix with 5 rows and columns.
      DoubleFileSquareMatrix arg0 = new DoubleFileSquareMatrix(5);
      
      // Try to solve the linear system using GMRES with an invalid number of iterations.
      try {
      LinearMath.solveGMRes(arg0, null, -1620, 5);
      
      // The IllegalArgumentException should be thrown because the number of allowed iterations must be a positive integer.
      fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      
      // Verify that the expected exception is thrown with the correct message.
      verifyException("JSci.maths.LinearMath", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSolveCG() throws Throwable  {
      // Given
      DoubleSparseSquareMatrix matrix = new DoubleSparseSquareMatrix(4);
      DoubleVector b = new DoubleVector(4);
      AbstractDoubleVector x = LinearMath.solveCG(matrix, b, b, 4, 4, 4);
      
      // When
      double infNorm = x.infNorm();
      
      // Then
      assertEquals(0.0, infNorm, 0.01);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSolveCGWithZero() throws Throwable  {
      // Create a square matrix with 45 elements
      DoubleFileSquareMatrix arg0 = new DoubleFileSquareMatrix(45);
      
      // Passing null as the third argument (allowed iterations) should throw an IllegalArgumentException
      try {
      LinearMath.solveCG(arg0, null, null, 45, 0, 45);
      fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
      // Verify that the thrown exception is an IllegalArgumentException with the expected message
      assertEquals("Number of allowed iterations must be a positive integer: 0 <= 0.", e.getMessage());}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSolveCGWithNegative() throws Throwable  {
      DoubleFileSquareMatrix arg0 = new DoubleFileSquareMatrix(20);
      // Create a 20x20 matrix with random values
      try {
      LinearMath.solveCG(arg0, (AbstractDoubleVector) null, (AbstractDoubleVector) null, 20, 1220, (-1135.3552093));
      } catch(IllegalArgumentException e) {
      // This test expects an IllegalArgumentException to be thrown when a negative tolerance is used
      verifyException("JSci.maths.LinearMath", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLeastSquaresFitReturningRealPolynomialWhereIsZeroIsTrue() throws Throwable  {
      // rollbacked to evosuite
      double[][] arg1 = new double[3][9];
      RealPolynomial leastSquaresFit = LinearMath.leastSquaresFit(26, arg1);
      assertTrue(leastSquaresFit.isOne());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSolve() throws Throwable  {
      // Given: A square matrix of size 5x5 and a vector of size 5.
      DoubleFileSquareMatrix matrix = new DoubleFileSquareMatrix(5);
      DoubleVector vector = new DoubleVector(5);
      
      // When: The {@link LinearMath#solve(DoubleFileSquareMatrix, DoubleVector)} method is called with the given matrix and vector.
      AbstractDoubleVector solution = LinearMath.solve(matrix, vector);
      
      // Then: The returned solution has an inf-norm of approximately 0.
      assertEquals(Double.NaN, solution.infNorm(), 0.01);
  }
}