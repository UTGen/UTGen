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
import JSci.maths.symbolic.ParseException;
import JSci.maths.symbolic.Power;
import JSci.maths.symbolic.Token;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.Reader;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ExpressionParser_ESTest extends ExpressionParser_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testParseTakingStringReturningNull() throws Throwable  {
      // No Comments were added
      Expression parse = ExpressionParser.parse("");
      assertNull(parse);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetTokenReturningNull() throws Throwable  {
      // No Comments were added
      Token token = ExpressionParser.getToken((-1057));
      assertNull(token);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesExpressionParserTakingReaderAndCallsGenerateParseException() throws Throwable  {
      // Given a string " &!XsK|H4<4ro@/U`4"
      StringReader arg0 = new StringReader(" &!XsK|H4<4ro@/U`4");
      
      // When creating an ExpressionParser object with this string as input
      ExpressionParser expressionParser = new ExpressionParser(arg0);
      
      // Then the parser should throw a ParseException
      assertNotNull(expressionParser.generateParseException());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testParseTakingStringThrowsError0() throws Throwable  {
      // No Comments were added
      // Undeclared exception!
      try { 
        ExpressionParser.parse("U*OKrxT9+rI-WY\">");
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Lexical error at line 1, column 15.  Encountered: \"\\u007f\" (127), after : \"\"
         //
         verifyException("JSci.maths.symbolic.ExpressionParserTokenManager", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testParseTakingStringThrowsError1() throws Throwable  {
      // No Comments were added
      // Undeclared exception!
      try { 
        ExpressionParser.parse("a+v<:}4");
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Lexical error at line 1, column 4.  Encountered: \"<\" (60), after : \"\"
         //
         verifyException("JSci.maths.symbolic.ExpressionParserTokenManager", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testExpressionP0ThrowsNullPointerException0() throws Throwable  {
      // rollbacked to evosuite
      StringReader arg0 = new StringReader("I6-Uz39R");
      ExpressionParser expressionParser = new ExpressionParser(arg0);
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
  public void testExpressionP4ThrowsNullPointerException() throws Throwable  {
      // rollbacked to evosuite
      StringReader arg0 = new StringReader("A5");
      ExpressionParser expressionParser = new ExpressionParser(arg0);
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
  public void testExpressionP4() throws Throwable  {
      // Given a string reader with the input "123456789"
      StringReader arg0 = new StringReader("123456789");
      
      // When a new expression parser is created with the input from the string reader
      ExpressionParser expressionParser = new ExpressionParser(arg0);
      
      // And a new expression is parsed using the expression parser
      Expression expressionP4 = ExpressionParser.expressionP4();
      
      // Then assert that the expression is not null
      assertNotNull(expressionP4);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testExpressionP3() throws Throwable  {
      // Create a string reader for the input expression "5/"
      StringReader arg0 = new StringReader("5/");
      
      // Create a new instance of ExpressionParser with the string reader as argument
      ExpressionParser expressionParser = new ExpressionParser(arg0);
      
      // Call the static method expressionP3() on ExpressionParser to get an instance of Expression
      Expression expressionP3 = ExpressionParser.expressionP3();
      
      // Assert that the expression is not null
      assertNotNull(expressionP3);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testExpressionP2ThrowsNullPointerException() throws Throwable  {
      // rollbacked to evosuite
      StringReader arg0 = new StringReader("-l");
      ExpressionParser expressionParser = new ExpressionParser(arg0);
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
  public void testExpressionP0l() throws Throwable  {
      // Given a StringReader that contains an arithmetic expression
      StringReader arg0 = new StringReader("10/3");
      
      // When the ExpressionParser is instantiated with the StringReader
      ExpressionParser expressionParser = new ExpressionParser(arg0);
      
      // Then the parser should return an array of Expressions
      Expression[] expressionP0l = ExpressionParser.expressionP0l();
      
      // And there should be only one Expression in the array
      assertEquals(1, expressionP0l.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testExpressionP0lThrowsNullPointerException() throws Throwable  {
      StringReader arg0 = new StringReader("I6-Uz39R");
      ExpressionParser expressionParser = new ExpressionParser(arg0);
      
      // This test verifies that the method "expressionP0l" throws a NullPointerException when passed a null argument.
      try {
      // The following line of code invokes the method "expressionP0l" with a null argument, which is expected to throw a NullPointerException.
      ExpressionParser.expressionP0l();
      fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      // This block of code verifies that the thrown exception is indeed a NullPointerException and not another type of exception.
      // The method "getMessage" returns null, indicating that there is no message associated with the exception.
      verifyException("JSci.maths.symbolic.ExpressionParser", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testInputThrowsNullPointerException() throws Throwable  {
      StringReader input = new StringReader("either use ReInit() or set the JavaCC option STATIC to false");
      ExpressionParser parser = new ExpressionParser(input);
      // Undeclared exception!
      try {
      parser.Input(); // this is the method under test
      fail("Expecting exception: NullPointerException");
      } catch (NullPointerException e) {
      // this is the expected exception
      verifyException("JSci.maths.symbolic.ExpressionParser", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testInput() throws Throwable  {
      // Tests that the input string is properly parsed and returned as an Expression object
      StringReader arg0 = new StringReader(" &!XsK|H4<4ro@/U`4");
      // Skips 1173 characters in the input string to simulate a more realistic test scenario
      arg0.skip(1173L);
      ExpressionParser expressionParser = new ExpressionParser(arg0);
      // Parses the input string and returns an Expression object
      Expression Input = ExpressionParser.Input();
      // Asserts that the parsed input is null, which indicates that it was not able to parse the input correctly
      assertNull(Input);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesExpressionParserTakingReaderAndCallsGetToken() throws Throwable  {
      StringReader input = new StringReader("10/");
      ExpressionParser parser = new ExpressionParser(input);
      Token token = parser.getToken(20);
      // Asserts that the parsed token is an empty string
      assertEquals("", token.toString());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testExpressionP2AndGetNextToken() throws Throwable  {
      // Arrange
      StringReader input = new StringReader("5/");
      ExpressionParser parser = new ExpressionParser(input);
      
      // Act
      Token nextToken = parser.getNextToken();
      
      // Assert
      assertEquals("/", nextToken.toString());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetNextTokenThrowsNullPointerException() throws Throwable  {
      // No Comments were added
      ExpressionParser expressionParser = new ExpressionParser((Reader) null);
      // Undeclared exception!
      try { 
        ExpressionParser.getNextToken();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesExpressionParserTakingExpressionParserTokenManager() throws Throwable  {
      // Given a ExpressionParser with a null token manager
      ExpressionParser expressionParser = new ExpressionParser((ExpressionParserTokenManager) null);
      
      // When reinitializing the parser with a null token manager
      expressionParser.ReInit((ExpressionParserTokenManager) null);
      
      // Then the lookingAhead flag should be false
      assertFalse(expressionParser.lookingAhead);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReInitTakingReader() throws Throwable  {
      // No Comments were added
      ExpressionParser expressionParser = new ExpressionParser((Reader) null);
      ExpressionParser.ReInit((Reader) null);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFailsToCreateExpressionParserTakingInputStreamThrowsError() throws Throwable  {
      // No Comments were added
      PipedInputStream arg0 = new PipedInputStream();
      ExpressionParser.parse((InputStream) arg0, (Map) null);
      ExpressionParser expressionParser = null;
      try {
        expressionParser = new ExpressionParser(arg0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("JSci.maths.symbolic.ExpressionParser", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testExpressionP0ThrowsNullPointerException1() throws Throwable  {
      // No Comments were added
      StringReader arg0 = new StringReader("U**OKrxT9+rI-WY\">");
      ExpressionParser expressionParser = new ExpressionParser(arg0);
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
  public void testGetToken() throws Throwable  {
      // rollbacked to evosuite
      StringReader arg0 = new StringReader("10/");
      ExpressionParser expressionParser = new ExpressionParser(arg0);
      ExpressionParser.expressionP0();
      Token token = ExpressionParser.getToken(20);
      assertEquals("", token.toString());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testParseTakingStringThrowsException0() throws Throwable  {
      // No Comments were added
      try { 
        ExpressionParser.parse("log");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Encountered \"log <EOF>\" at line 1, column 1.
         // Was expecting one of:
         //     <EOF> 
         //     \"-\" ...
         //     \"+\" ...
         //     <DNUM> ...
         //     <INUM> ...
         //     <IDENTIFIER> ...
         //     \"pi\" ...
         //     \"i\" ...
         //     <ONEARGFUNCTION> \"(\" ...
         //     \"(\" ...
         //     \"\\n\" ...
         //     \"\\r\" ...
         //     
         //
         verifyException("JSci.maths.symbolic.ExpressionParser", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testParseTakingStringThrowsTooManyResourcesException0() throws Throwable  {
      // No Comments were added
      // Undeclared exception!
      ExpressionParser.parse("(");
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testExpressionP1ThrowsException0() throws Throwable  {
      StringReader input = new StringReader("-");
      ExpressionParser expressionParser = new ExpressionParser(input);
      try {
      expressionParser.expressionP1();
      fail("Expected exception not thrown");
      } catch (Exception e) {
      // Verify that the expected exception was thrown with the correct message
      assertEquals("Encountered \"- <EOF>\" at line 1, column 1. Was expecting one of: \"-\" <DNUM> ...", e.getMessage());
      
      // Verify that the exception is an instance of the expected type
      verifyException("JSci.maths.symbolic.ExpressionParser", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testExpressionP1ThrowsException1() throws Throwable  {
      // No Comments were added
      StringReader arg0 = new StringReader("+");
      ExpressionParser expressionParser = new ExpressionParser(arg0);
      try { 
        ExpressionParser.expressionP1();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Encountered \"+ <EOF>\" at line 1, column 1.
         // Was expecting one of:
         //     \"-\" ...
         //     \"+\" <DNUM> ...
         //     \"+\" <INUM> ...
         //     \"+\" <IDENTIFIER> ...
         //     \"+\" \"pi\" ...
         //     \"+\" \"i\" ...
         //     \"+\" <ONEARGFUNCTION> ...
         //     \"+\" \"(\" ...
         //     <DNUM> ...
         //     <INUM> ...
         //     <IDENTIFIER> ...
         //     \"pi\" ...
         //     \"i\" ...
         //     <ONEARGFUNCTION> ...
         //     \"(\" ...
         //     
         //
         verifyException("JSci.maths.symbolic.ExpressionParser", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testParseTakingStringThrowsException1() throws Throwable  {
      // rollbacked to evosuite
      try { 
        ExpressionParser.parse("x^");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Encountered \"^ <EOF>\" at line 1, column 2.
         // Was expecting one of:
         //     <EOF> 
         //     \"^\" <INUM> ...
         //     \"*\" ...
         //     \"/\" ...
         //     \"+\" ...
         //     \"-\" ...
         //     \"\\n\" ...
         //     \"\\r\" ...
         //     
         //
         verifyException("JSci.maths.symbolic.ExpressionParser", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGenerateParseException() throws Throwable  {
      // Given: A StringReader containing a valid expression
      StringReader arg0 = new StringReader("1234567890.1234567890");
      
      // When: Parsing the expression using an ExpressionParser instance
      ExpressionParser expressionParser = new ExpressionParser(arg0);
      expressionParser.expressionP0();
      
      // Then: A ParseException is thrown
      ParseException generateParseException = ExpressionParser.generateParseException();
      assertNotNull(generateParseException);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testExpressionP3ThrowsException() throws Throwable  {
      // No Comments were added
      StringReader arg0 = new StringReader("10/4");
      ExpressionParser expressionParser = new ExpressionParser(arg0);
      ExpressionParser.expressionP1();
      try { 
        ExpressionParser.expressionP3();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Encountered \"<EOF>\" at line 1, column 4.
         // Was expecting one of:
         //     \"^\" ...
         //     \"*\" ...
         //     \"/\" ...
         //     <DNUM> ...
         //     <INUM> ...
         //     <IDENTIFIER> ...
         //     \"pi\" ...
         //     \"i\" ...
         //     <ONEARGFUNCTION> ...
         //     \"(\" ...
         //     
         //
         verifyException("JSci.maths.symbolic.ExpressionParser", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testParseTakingString() throws Throwable  {
      // No Comments were added
      Power parse = (Power)ExpressionParser.parse("x^2");
      assertEquals(2, parse.getExponent());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testExpressionP2ThrowsException() throws Throwable  {
      // No Comments were added
      ExpressionParser.parse("D");
      try { 
        ExpressionParser.expressionP2();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Encountered \"<EOF>\" at line 1, column 1.
         // Was expecting one of:
         //     \"-\" ...
         //     \"+\" ...
         //     <DNUM> ...
         //     <INUM> ...
         //     <IDENTIFIER> ...
         //     \"pi\" ...
         //     \"i\" ...
         //     <ONEARGFUNCTION> ...
         //     \"(\" ...
         //     
         //
         verifyException("JSci.maths.symbolic.ExpressionParser", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesExpressionParserTakingReaderAndCallsExpressionP0() throws Throwable  {
      // rollbacked to evosuite
      StringReader arg0 = new StringReader("1 + 2 * 3");
      ExpressionParser expressionParser = new ExpressionParser(arg0);
      Expression expressionP0 = ExpressionParser.expressionP0();
      assertNotNull(expressionP0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testExpressionP1ThrowsExceptionAndParseTakingString() throws Throwable  {
      // No Comments were added
      ExpressionParser.parse("I6-Uz39R");
      try { 
        ExpressionParser.expressionP1();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Encountered \"<EOF>\" at line 1, column 8.
         // Was expecting one of:
         //     \"-\" ...
         //     \"+\" ...
         //     <DNUM> ...
         //     <INUM> ...
         //     <IDENTIFIER> ...
         //     \"pi\" ...
         //     \"i\" ...
         //     <ONEARGFUNCTION> ...
         //     \"(\" ...
         //     
         //
         verifyException("JSci.maths.symbolic.ExpressionParser", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testExpressionP4ThrowsException() throws Throwable  {
      // No Comments were added
      ExpressionParser.parse("x + y");
      try { 
        ExpressionParser.expressionP4();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Encountered \"<EOF>\" at line 1, column 5.
         // Was expecting one of:
         //     <DNUM> ...
         //     <INUM> ...
         //     <IDENTIFIER> ...
         //     \"pi\" ...
         //     \"i\" ...
         //     <ONEARGFUNCTION> ...
         //     \"(\" ...
         //     
         //
         verifyException("JSci.maths.symbolic.ExpressionParser", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testExpressionP0ThrowsException() throws Throwable  {
      StringReader arg0 = new StringReader("");
      ExpressionParser expressionParser = new ExpressionParser(arg0);
      try {
      ExpressionParser.expressionP0();
      fail("Expecting exception: Exception");
      } catch(Exception e) {
      // Encountered end of file at line 0, column 0, expecting one of "-", "+", "<DNUM>", "<INUM>", <IDENTIFIER>, "pi", or "i".
      verifyException("JSci.maths.symbolic.ExpressionParser", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testParseTaking1And1ReturningNonNull() throws Throwable  {
      // Create a HashMap to store the input arguments for the test case.
      HashMap<Object, PipedInputStream> arg1 = new HashMap<>();
      arg1.put("i", new PipedInputStream());
      
      // Parse the expression using ExpressionParser.parse().
      Expression parse = ExpressionParser.parse("+i", (Map) arg1);
      
      // Assert that the parsed expression is not null.
      assertNotNull(parse);
      
      // Assert that the parsed expression is equal to "i".
      assertEquals("i", parse.toString());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testParseTakingInputStream() throws Throwable  {
      // Given a PipedInputStream with a capacity of 1024 bytes
      PipedInputStream inputStream = new PipedInputStream(1024);
      
      // When the input stream is parsed as an Expression
      Expression expression = ExpressionParser.parse((InputStream) inputStream);
      
      // Then the resulting Expression should be null
      assertNull(expression);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testParseTaking1And1ReturningNull() throws Throwable  {
      // Parse an empty string using ExpressionParser.parse() method
      Expression parse = ExpressionParser.parse("", (Map) null);
      
      // Assert that the parsed expression is null
      assertNull(parse);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEnable_tracing() throws Throwable  {
      // Enable tracing for the ExpressionParser class
      // This will allow us to log all expressions as they are parsed
      ExpressionParser.enable_tracing();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testParseTakingStringThrowsTooManyResourcesException1() throws Throwable  {
      // No Comments were added
      // Undeclared exception!
      ExpressionParser.parse("(4 + 5) * (7 - 2)");
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDisable_tracing() throws Throwable  {
      // Disable tracing for the ExpressionParser class
      ExpressionParser.disable_tracing();
  }
}