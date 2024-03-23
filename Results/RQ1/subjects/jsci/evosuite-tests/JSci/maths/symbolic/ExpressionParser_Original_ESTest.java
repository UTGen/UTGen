/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Wed Mar 20 10:38:46 GMT 2024
 */

package JSci.maths.symbolic;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import JSci.maths.symbolic.Expression;
import JSci.maths.symbolic.ExpressionParser;
import JSci.maths.symbolic.ExpressionParserTokenManager;
import JSci.maths.symbolic.SimpleCharStream;
import JSci.maths.symbolic.Variable;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PipedInputStream;
import java.io.Reader;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ExpressionParser_Original_ESTest extends ExpressionParser_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testParseTaking1And1ThrowsNullPointerException() throws Throwable  {
      HashMap<Object, Variable> arg1 = new HashMap<Object, Variable>();
      // Undeclared exception!
      try { 
        ExpressionParser.parse((InputStream) null, (Map) arg1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGenerateParseExceptionThrowsNullPointerException() throws Throwable  {
      // Undeclared exception!
      try { 
        ExpressionParser.generateParseException();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("JSci.maths.symbolic.ExpressionParser", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetTokenThrowsNullPointerException() throws Throwable  {
      // Undeclared exception!
      try { 
        ExpressionParser.getToken(37);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("JSci.maths.symbolic.ExpressionParser", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetNextTokenThrowsNullPointerException() throws Throwable  {
      // Undeclared exception!
      try { 
        ExpressionParser.getNextToken();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("JSci.maths.symbolic.ExpressionParser", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesExpressionParserTakingExpressionParserTokenManager() throws Throwable  {
      ExpressionParserTokenManager arg0 = ExpressionParser.token_source;
      ExpressionParser expressionParser = new ExpressionParser(arg0);
      assertFalse(ExpressionParser.lookingAhead);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReInitTakingReaderThrowsNullPointerException() throws Throwable  {
      InputStreamReader arg0 = (InputStreamReader)SimpleCharStream.inputStream;
      // Undeclared exception!
      try { 
        ExpressionParser.ReInit((Reader) arg0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("JSci.maths.symbolic.ExpressionParser", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesExpressionParserTakingReader() throws Throwable  {
      StringReader arg0 = new StringReader(" &!XsK|H4<4ro@/U`4");
      ExpressionParser expressionParser = new ExpressionParser(arg0);
      assertFalse(ExpressionParser.lookingAhead);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReInitTakingInputStreamThrowsNullPointerException() throws Throwable  {
      PipedInputStream arg0 = new PipedInputStream();
      // Undeclared exception!
      try { 
        ExpressionParser.ReInit((InputStream) arg0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("JSci.maths.symbolic.ExpressionParser", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testExpressionP4ThrowsNullPointerException() throws Throwable  {
      // Undeclared exception!
      try { 
        ExpressionParser.expressionP4();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("JSci.maths.symbolic.ExpressionParser", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testExpressionP3ThrowsNullPointerException() throws Throwable  {
      // Undeclared exception!
      try { 
        ExpressionParser.expressionP3();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("JSci.maths.symbolic.ExpressionParser", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testExpressionP2ThrowsNullPointerException() throws Throwable  {
      // Undeclared exception!
      try { 
        ExpressionParser.expressionP2();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("JSci.maths.symbolic.ExpressionParser", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testExpressionP1lThrowsNullPointerException() throws Throwable  {
      // Undeclared exception!
      try { 
        ExpressionParser.expressionP1l();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("JSci.maths.symbolic.ExpressionParser", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testExpressionP1ThrowsNullPointerException() throws Throwable  {
      // Undeclared exception!
      try { 
        ExpressionParser.expressionP1();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("JSci.maths.symbolic.ExpressionParser", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testExpressionP0lThrowsNullPointerException() throws Throwable  {
      // Undeclared exception!
      try { 
        ExpressionParser.expressionP0l();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("JSci.maths.symbolic.ExpressionParser", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testExpressionP0ThrowsNullPointerException() throws Throwable  {
      // Undeclared exception!
      try { 
        ExpressionParser.expressionP0();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("JSci.maths.symbolic.ExpressionParser", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testInputThrowsNullPointerException() throws Throwable  {
      // Undeclared exception!
      try { 
        ExpressionParser.Input();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("JSci.maths.symbolic.ExpressionParser", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testParseTakingInputStream() throws Throwable  {
      PipedInputStream arg0 = new PipedInputStream(32);
      Expression parse = ExpressionParser.parse((InputStream) arg0);
      assertNull(parse);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testParseTaking1And1ThrowsError() throws Throwable  {
      Hashtable<Variable, Object> arg1 = new Hashtable<Variable, Object>();
      // Undeclared exception!
      try { 
        ExpressionParser.parse("C2;=rp", (Map) arg1);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Lexical error at line 1, column 3.  Encountered: \";\" (59), after : \"\"
         //
         verifyException("JSci.maths.symbolic.ExpressionParserTokenManager", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEnable_tracing() throws Throwable  {
      ExpressionParser.enable_tracing();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testParseTakingStringThrowsError() throws Throwable  {
      // Undeclared exception!
      try { 
        ExpressionParser.parse("OI[S_nC/Bhtz;+");
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Lexical error at line 1, column 3.  Encountered: \"[\" (91), after : \"\"
         //
         verifyException("JSci.maths.symbolic.ExpressionParserTokenManager", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDisable_tracing() throws Throwable  {
      ExpressionParser.disable_tracing();
  }
}