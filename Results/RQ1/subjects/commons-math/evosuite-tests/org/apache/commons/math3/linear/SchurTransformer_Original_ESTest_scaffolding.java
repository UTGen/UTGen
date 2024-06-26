/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Mar 21 13:34:08 GMT 2024
 */

package org.apache.commons.math3.linear;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class SchurTransformer_Original_ESTest_scaffolding {

  @org.junit.jupiter.api.extension.RegisterExtension
  public org.evosuite.runtime.vnet.NonFunctionalRequirementExtension nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementExtension();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeAll
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.math3.linear.SchurTransformer"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.OFF; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @BeforeEach
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @AfterEach
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    /*No java.lang.System property to set*/
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(SchurTransformer_Original_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.math3.linear.RealVector$2",
      "org.apache.commons.math3.util.Precision",
      "org.apache.commons.math3.linear.RealVectorFormat",
      "org.apache.commons.math3.linear.FieldVector",
      "org.apache.commons.math3.linear.DefaultRealMatrixPreservingVisitor",
      "org.apache.commons.math3.linear.RealVector",
      "org.apache.commons.math3.exception.util.ArgUtils",
      "org.apache.commons.math3.exception.MathArithmeticException",
      "org.apache.commons.math3.exception.OutOfRangeException",
      "org.apache.commons.math3.exception.NotPositiveException",
      "org.apache.commons.math3.linear.FieldMatrix",
      "org.apache.commons.math3.linear.ArrayRealVector",
      "org.apache.commons.math3.linear.AbstractRealMatrix$5",
      "org.apache.commons.math3.exception.MathIllegalArgumentException",
      "org.apache.commons.math3.exception.MathUnsupportedOperationException",
      "org.apache.commons.math3.linear.RealMatrixFormat",
      "org.apache.commons.math3.linear.Array2DRowFieldMatrix",
      "org.apache.commons.math3.exception.ZeroException",
      "org.apache.commons.math3.linear.SchurTransformer$1",
      "org.apache.commons.math3.linear.AbstractFieldMatrix",
      "org.apache.commons.math3.util.FastMath",
      "org.apache.commons.math3.linear.SparseRealMatrix",
      "org.apache.commons.math3.linear.HessenbergTransformer",
      "org.apache.commons.math3.exception.NumberIsTooLargeException",
      "org.apache.commons.math3.analysis.BivariateFunction",
      "org.apache.commons.math3.exception.NotStrictlyPositiveException",
      "org.apache.commons.math3.linear.SchurTransformer$ShiftInfo",
      "org.apache.commons.math3.exception.NoDataException",
      "org.apache.commons.math3.analysis.UnivariateFunction",
      "org.apache.commons.math3.linear.RealMatrix",
      "org.apache.commons.math3.exception.NotFiniteNumberException",
      "org.apache.commons.math3.linear.RealLinearOperator",
      "org.apache.commons.math3.linear.RealMatrixPreservingVisitor",
      "org.apache.commons.math3.exception.util.ExceptionContextProvider",
      "org.apache.commons.math3.linear.BlockRealMatrix",
      "org.apache.commons.math3.linear.OpenMapRealMatrix",
      "org.apache.commons.math3.linear.BlockFieldMatrix",
      "org.apache.commons.math3.linear.SchurTransformer",
      "org.apache.commons.math3.exception.NumberIsTooSmallException",
      "org.apache.commons.math3.exception.MathIllegalStateException",
      "org.apache.commons.math3.linear.MatrixDimensionMismatchException",
      "org.apache.commons.math3.linear.FieldMatrixPreservingVisitor",
      "org.apache.commons.math3.linear.NonSquareMatrixException",
      "org.apache.commons.math3.linear.MatrixUtils",
      "org.apache.commons.math3.exception.MultiDimensionMismatchException",
      "org.apache.commons.math3.linear.NonSymmetricMatrixException",
      "org.apache.commons.math3.linear.Array2DRowRealMatrix",
      "org.apache.commons.math3.util.MathUtils",
      "org.apache.commons.math3.exception.MathIllegalNumberException",
      "org.apache.commons.math3.util.CompositeFormat",
      "org.apache.commons.math3.exception.util.LocalizedFormats",
      "org.apache.commons.math3.linear.AbstractRealMatrix",
      "org.apache.commons.math3.linear.AnyMatrix",
      "org.apache.commons.math3.exception.MathParseException",
      "org.apache.commons.math3.exception.DimensionMismatchException",
      "org.apache.commons.math3.exception.MaxCountExceededException",
      "org.apache.commons.math3.exception.util.Localizable",
      "org.apache.commons.math3.exception.util.ExceptionContext",
      "org.apache.commons.math3.exception.NullArgumentException",
      "org.apache.commons.math3.linear.RealVectorPreservingVisitor",
      "org.apache.commons.math3.linear.RealVectorChangingVisitor",
      "org.apache.commons.math3.linear.DiagonalMatrix",
      "org.apache.commons.math3.linear.RealMatrixChangingVisitor"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(SchurTransformer_Original_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.math3.linear.SchurTransformer",
      "org.apache.commons.math3.linear.SchurTransformer$ShiftInfo",
      "org.apache.commons.math3.util.Precision",
      "org.apache.commons.math3.exception.util.LocalizedFormats",
      "org.apache.commons.math3.linear.RealLinearOperator",
      "org.apache.commons.math3.linear.RealMatrixFormat",
      "org.apache.commons.math3.util.CompositeFormat",
      "org.apache.commons.math3.linear.AbstractRealMatrix",
      "org.apache.commons.math3.linear.BlockRealMatrix",
      "org.apache.commons.math3.linear.RealVector",
      "org.apache.commons.math3.linear.RealVectorFormat",
      "org.apache.commons.math3.linear.ArrayRealVector",
      "org.apache.commons.math3.exception.MathIllegalArgumentException",
      "org.apache.commons.math3.exception.MathIllegalNumberException",
      "org.apache.commons.math3.exception.NumberIsTooLargeException",
      "org.apache.commons.math3.exception.util.ExceptionContext",
      "org.apache.commons.math3.exception.util.ArgUtils",
      "org.apache.commons.math3.linear.DiagonalMatrix",
      "org.apache.commons.math3.util.MathUtils",
      "org.apache.commons.math3.linear.HessenbergTransformer",
      "org.apache.commons.math3.util.FastMath",
      "org.apache.commons.math3.linear.MatrixUtils",
      "org.apache.commons.math3.linear.Array2DRowRealMatrix",
      "org.apache.commons.math3.exception.OutOfRangeException",
      "org.apache.commons.math3.exception.NoDataException",
      "org.apache.commons.math3.exception.DimensionMismatchException",
      "org.apache.commons.math3.linear.AbstractRealMatrix$2",
      "org.apache.commons.math3.linear.DefaultRealMatrixPreservingVisitor",
      "org.apache.commons.math3.linear.AbstractRealMatrix$5",
      "org.apache.commons.math3.linear.NonSquareMatrixException",
      "org.apache.commons.math3.exception.NumberIsTooSmallException",
      "org.apache.commons.math3.exception.NotStrictlyPositiveException",
      "org.apache.commons.math3.exception.MultiDimensionMismatchException",
      "org.apache.commons.math3.linear.MatrixDimensionMismatchException",
      "org.apache.commons.math3.exception.NullArgumentException",
      "org.apache.commons.math3.exception.MathIllegalStateException",
      "org.apache.commons.math3.exception.MaxCountExceededException",
      "org.apache.commons.math3.linear.DefaultRealMatrixChangingVisitor",
      "org.apache.commons.math3.linear.AbstractRealMatrix$1",
      "org.apache.commons.math3.linear.RealVector$1",
      "org.apache.commons.math3.linear.RealVector$Entry",
      "org.apache.commons.math3.exception.MathArithmeticException",
      "org.apache.commons.math3.exception.NotPositiveException",
      "org.apache.commons.math3.analysis.function.Cos",
      "org.apache.commons.math3.util.FastMath$CodyWaite",
      "org.apache.commons.math3.analysis.function.Sigmoid",
      "org.apache.commons.math3.util.FastMathLiteralArrays",
      "org.apache.commons.math3.util.FastMath$ExpIntTable",
      "org.apache.commons.math3.util.FastMath$ExpFracTable",
      "org.apache.commons.math3.analysis.function.Power",
      "org.apache.commons.math3.util.FastMath$lnMant",
      "org.apache.commons.math3.analysis.function.Atanh",
      "org.apache.commons.math3.analysis.function.Sinc",
      "org.apache.commons.math3.analysis.polynomials.PolynomialFunctionNewtonForm",
      "org.apache.commons.math3.analysis.function.Logistic",
      "org.apache.commons.math3.analysis.polynomials.PolynomialFunction",
      "org.apache.commons.math3.linear.RealVector$2",
      "org.apache.commons.math3.analysis.polynomials.PolynomialSplineFunction",
      "org.apache.commons.math3.analysis.function.Log1p",
      "org.apache.commons.math3.analysis.function.Ceil",
      "org.apache.commons.math3.analysis.function.Acos",
      "org.apache.commons.math3.analysis.function.Gaussian",
      "org.apache.commons.math3.analysis.function.Logit",
      "org.apache.commons.math3.analysis.differentiation.DerivativeStructure",
      "org.apache.commons.math3.analysis.differentiation.DSCompiler",
      "org.apache.commons.math3.analysis.function.Tanh",
      "org.apache.commons.math3.analysis.function.Minus",
      "org.apache.commons.math3.analysis.function.Inverse",
      "org.apache.commons.math3.analysis.function.Ulp",
      "org.apache.commons.math3.analysis.function.Sqrt",
      "org.apache.commons.math3.analysis.function.Atan",
      "org.apache.commons.math3.analysis.function.Signum",
      "org.apache.commons.math3.analysis.function.Exp",
      "org.apache.commons.math3.analysis.function.Constant",
      "org.apache.commons.math3.analysis.function.Cosh",
      "org.apache.commons.math3.analysis.function.Cbrt",
      "org.apache.commons.math3.analysis.function.Log",
      "org.apache.commons.math3.analysis.function.Rint",
      "org.apache.commons.math3.analysis.function.Acosh",
      "org.apache.commons.math3.analysis.function.Asinh",
      "org.apache.commons.math3.analysis.function.Floor",
      "org.apache.commons.math3.analysis.function.Sinh",
      "org.apache.commons.math3.analysis.function.Sin",
      "org.apache.commons.math3.analysis.function.Log10",
      "org.apache.commons.math3.analysis.function.HarmonicOscillator",
      "org.apache.commons.math3.analysis.function.Expm1",
      "org.apache.commons.math3.analysis.polynomials.PolynomialFunctionLagrangeForm",
      "org.apache.commons.math3.util.MathArrays$OrderDirection",
      "org.apache.commons.math3.util.MathArrays",
      "org.apache.commons.math3.util.MathArrays$2",
      "org.apache.commons.math3.util.Pair",
      "org.apache.commons.math3.util.MathArrays$1",
      "org.apache.commons.math3.exception.NonMonotonicSequenceException",
      "org.apache.commons.math3.analysis.function.Asin",
      "org.apache.commons.math3.analysis.function.Identity",
      "org.apache.commons.math3.analysis.function.Tan"
    );
  }
}
