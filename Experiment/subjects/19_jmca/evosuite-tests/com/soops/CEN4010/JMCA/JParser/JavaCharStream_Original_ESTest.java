/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Wed Mar 20 21:29:47 GMT 2024
 */

package com.soops.CEN4010.JMCA.JParser;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import com.soops.CEN4010.JMCA.JParser.JavaCharStream;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class JavaCharStream_Original_ESTest extends JavaCharStream_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetEndLineReturningZero() throws Throwable  {
      StringReader arg0 = new StringReader("com.soops.CEN4010.JMCA.JParser.JavaCharStream");
      JavaCharStream javaCharStream = new JavaCharStream(arg0);
      javaCharStream.backup(0);
      javaCharStream.getEndLine();
      assertEquals(4095, javaCharStream.bufpos);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetEndLineReturningPositive() throws Throwable  {
      StringReader arg0 = new StringReader("_,U avKQ*l^TMQC7");
      JavaCharStream javaCharStream = new JavaCharStream(arg0, 0, 0);
      javaCharStream.adjustBeginLineColumn(92, (-2665));
      javaCharStream.readChar();
      int endLine = javaCharStream.getEndLine();
      assertEquals(0, javaCharStream.bufpos);
      assertEquals(93, endLine);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetEndLineReturningNegative() throws Throwable  {
      StringReader arg0 = new StringReader("_,U avKQ*l^TMQC7");
      JavaCharStream javaCharStream = new JavaCharStream(arg0, 0, 0);
      javaCharStream.adjustBeginLineColumn((-16), (-16));
      javaCharStream.bufpos = 0;
      int endLine = javaCharStream.getEndLine();
      assertEquals((-16), javaCharStream.getBeginColumn());
      assertEquals((-15), endLine);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetEndColumnReturningPositive() throws Throwable  {
      StringReader arg0 = new StringReader("p4g3");
      JavaCharStream javaCharStream = new JavaCharStream(arg0);
      javaCharStream.readChar();
      int endColumn = javaCharStream.getEndColumn();
      assertEquals(0, javaCharStream.bufpos);
      assertEquals(1, endColumn);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetEndColumnReturningNegative() throws Throwable  {
      StringReader arg0 = new StringReader("_,U avKQ*l^TMQC7");
      JavaCharStream javaCharStream = new JavaCharStream(arg0, 0, 0);
      javaCharStream.adjustBeginLineColumn((-16), (-16));
      javaCharStream.bufpos = 0;
      int endColumn = javaCharStream.getEndColumn();
      assertEquals((-15), javaCharStream.getBeginLine());
      assertEquals((-16), endColumn);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetColumnReturningZero() throws Throwable  {
      StringReader arg0 = new StringReader("_,U avKQ*l^TMQC7");
      JavaCharStream javaCharStream = new JavaCharStream(arg0, 1, 0);
      javaCharStream.readChar();
      int column = javaCharStream.getColumn();
      assertEquals(0, javaCharStream.bufpos);
      assertEquals(0, column);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetColumnReturningPositive() throws Throwable  {
      StringReader arg0 = new StringReader("p4g3");
      JavaCharStream javaCharStream = new JavaCharStream(arg0);
      javaCharStream.readChar();
      int column = javaCharStream.getColumn();
      assertEquals(0, javaCharStream.bufpos);
      assertEquals(1, column);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetBeginLineReturningPositive() throws Throwable  {
      StringReader arg0 = new StringReader("Invalid escape character at line ");
      JavaCharStream javaCharStream = new JavaCharStream(arg0);
      javaCharStream.BeginToken();
      int beginLine = javaCharStream.getBeginLine();
      assertEquals(0, javaCharStream.bufpos);
      assertEquals(1, beginLine);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetBeginLineReturningNegative() throws Throwable  {
      StringReader arg0 = new StringReader("_,U avKQ*l^TMQC7");
      JavaCharStream javaCharStream = new JavaCharStream(arg0, 0, 0);
      javaCharStream.adjustBeginLineColumn((-16), (-16));
      int beginLine = javaCharStream.getBeginLine();
      assertEquals((-16), javaCharStream.getBeginColumn());
      assertEquals((-15), beginLine);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetBeginColumnReturningPositive() throws Throwable  {
      StringReader arg0 = new StringReader("Sp1494<;i;8cBt;++V:");
      JavaCharStream javaCharStream = new JavaCharStream(arg0);
      javaCharStream.BeginToken();
      int beginColumn = javaCharStream.getBeginColumn();
      assertEquals(1, beginColumn);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetBeginColumnReturningNegative() throws Throwable  {
      StringReader arg0 = new StringReader("_,U avKQ*l^TMQC7");
      JavaCharStream javaCharStream = new JavaCharStream(arg0, 0, 0);
      javaCharStream.adjustBeginLineColumn(92, (-2665));
      int beginColumn = javaCharStream.getBeginColumn();
      assertEquals(93, javaCharStream.getBeginLine());
      assertEquals((-2665), beginColumn);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadByteReturningDigit() throws Throwable  {
      StringReader arg0 = new StringReader("8FHvUBF");
      JavaCharStream javaCharStream = new JavaCharStream(arg0, 1527, 644);
      char ReadByte = javaCharStream.ReadByte();
      assertEquals('8', ReadByte);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadByteReturningAlphabeticChar() throws Throwable  {
      StringReader arg0 = new StringReader("Invalid escape character at line ");
      JavaCharStream javaCharStream = new JavaCharStream(arg0, 1873, 84, 84);
      char ReadByte = javaCharStream.ReadByte();
      assertEquals('I', ReadByte);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testBeginTokenReturningDigit() throws Throwable  {
      StringReader arg0 = new StringReader("9ryx");
      JavaCharStream javaCharStream = new JavaCharStream(arg0);
      char BeginToken = javaCharStream.BeginToken();
      assertEquals(0, javaCharStream.bufpos);
      assertEquals('9', BeginToken);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReInitTaking4ArgumentsWithNullAndPositive() throws Throwable  {
      JavaCharStream javaCharStream = new JavaCharStream((Reader) null, 9, 1691, 731);
      javaCharStream.ReInit((Reader) null, 86, 3234, 731);
      assertEquals((-1), javaCharStream.bufpos);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testExpandBuff() throws Throwable  {
      JavaCharStream javaCharStream = new JavaCharStream((Reader) null);
      javaCharStream.backup((-1692));
      javaCharStream.ExpandBuff(true);
      assertEquals(5787, javaCharStream.bufpos);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesJavaCharStreamTaking4ArgumentsAndCallsReadChar() throws Throwable  {
      StringReader arg0 = new StringReader("_,U avKQ*l^TMQC7");
      JavaCharStream javaCharStream = new JavaCharStream(arg0, 86, 1918, 0);
      char readChar = javaCharStream.readChar();
      assertEquals(1918, javaCharStream.getBeginColumn());
      assertEquals(86, javaCharStream.getBeginLine());
      assertEquals('_', readChar);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAdjustBeginLineColumnWithZero() throws Throwable  {
      StringReader arg0 = new StringReader("Sp1494<;i;8cBt;++V:");
      JavaCharStream javaCharStream = new JavaCharStream(arg0);
      javaCharStream.BeginToken();
      javaCharStream.adjustBeginLineColumn(0, 0);
      assertEquals(0, javaCharStream.bufpos);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAdjustBeginLineColumnWithPositive() throws Throwable  {
      StringReader arg0 = new StringReader("_,U avKQ*l^TMQC7");
      JavaCharStream javaCharStream = new JavaCharStream(arg0, 0, 0);
      javaCharStream.adjustBeginLineColumn(0, 1689);
      assertEquals(1689, javaCharStream.getBeginColumn());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetSuffixReturningEmptyArray() throws Throwable  {
      StringReader arg0 = new StringReader("Invalid escape character at line ");
      JavaCharStream javaCharStream = new JavaCharStream(arg0);
      char[] GetSuffix = javaCharStream.GetSuffix(0);
      assertEquals(0, GetSuffix.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetSuffixReturningNonEmptyArray() throws Throwable  {
      StringReader arg0 = new StringReader("_,U avKQ*l^TMQC7");
      JavaCharStream javaCharStream = new JavaCharStream(arg0, 0, 0);
      char[] GetSuffix = javaCharStream.GetSuffix(1620);
      assertEquals(1620, GetSuffix.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetImage() throws Throwable  {
      StringReader arg0 = new StringReader("");
      JavaCharStream javaCharStream = new JavaCharStream(arg0, 731, 731, 0);
      assertEquals((-1), javaCharStream.bufpos);
      
      String GetImage = javaCharStream.GetImage();
      assertEquals("", GetImage);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReInitTaking4ArgumentsThrowsNegativeArraySizeException() throws Throwable  {
      StringReader arg0 = new StringReader("_,U avKQ*l^TMQC7");
      JavaCharStream javaCharStream = new JavaCharStream(arg0, 0, 0);
      // Undeclared exception!
      try { 
        javaCharStream.ReInit((Reader) arg0, (-1062), 1689, (-2825));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAdjustBuffSizeThrowsError() throws Throwable  {
      StringReader arg0 = new StringReader("Tp,V");
      JavaCharStream javaCharStream = new JavaCharStream(arg0, (-1), (-1), 731);
      javaCharStream.available = (-1);
      // Undeclared exception!
      try { 
        javaCharStream.AdjustBuffSize();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFillBuffThrowsIOException() throws Throwable  {
      StringReader arg0 = new StringReader("");
      JavaCharStream javaCharStream = new JavaCharStream(arg0);
      try { 
        javaCharStream.FillBuff();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testBeginTokenThrowsIOException() throws Throwable  {
      StringReader arg0 = new StringReader("");
      JavaCharStream javaCharStream = new JavaCharStream(arg0, 2882, 13, 0);
      try { 
        javaCharStream.BeginToken();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHexvalThrowsIOExceptionAndHexvalWithOtherChar0() throws Throwable  {
      try { 
        JavaCharStream.hexval('');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHexval0() throws Throwable  {
      int hexval = JavaCharStream.hexval('f');
      assertEquals(15, hexval);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHexval1() throws Throwable  {
      int hexval = JavaCharStream.hexval('e');
      assertEquals(14, hexval);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHexval2() throws Throwable  {
      int hexval = JavaCharStream.hexval('d');
      assertEquals(13, hexval);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHexval3() throws Throwable  {
      int hexval = JavaCharStream.hexval('c');
      assertEquals(12, hexval);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHexval4() throws Throwable  {
      int hexval = JavaCharStream.hexval('b');
      assertEquals(11, hexval);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHexvalAndHexvalWithAlphabeticChar0() throws Throwable  {
      int hexval = JavaCharStream.hexval('a');
      assertEquals(10, hexval);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHexvalThrowsIOExceptionAndHexvalWithOtherChar1() throws Throwable  {
      try { 
        JavaCharStream.hexval('`');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHexvalThrowsIOExceptionAndHexvalWithOtherChar2() throws Throwable  {
      try { 
        JavaCharStream.hexval('_');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHexvalThrowsIOExceptionAndHexvalWithOtherChar3() throws Throwable  {
      try { 
        JavaCharStream.hexval('^');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHexvalThrowsIOExceptionAndHexvalWithOtherChar4() throws Throwable  {
      try { 
        JavaCharStream.hexval(']');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHexvalThrowsIOExceptionAndHexvalWithOtherChar5() throws Throwable  {
      try { 
        JavaCharStream.hexval('\\');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHexvalThrowsIOExceptionAndHexvalWithOtherChar6() throws Throwable  {
      try { 
        JavaCharStream.hexval('[');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHexvalThrowsIOExceptionAndHexvalWithAlphabeticChar() throws Throwable  {
      try { 
        JavaCharStream.hexval('Z');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHexvalThrowsIOException0() throws Throwable  {
      try { 
        JavaCharStream.hexval('Y');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHexvalThrowsIOException1() throws Throwable  {
      try { 
        JavaCharStream.hexval('X');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHexvalThrowsIOException2() throws Throwable  {
      try { 
        JavaCharStream.hexval('W');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHexvalThrowsIOException3() throws Throwable  {
      try { 
        JavaCharStream.hexval('V');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHexvalThrowsIOException4() throws Throwable  {
      try { 
        JavaCharStream.hexval('U');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHexvalThrowsIOException5() throws Throwable  {
      try { 
        JavaCharStream.hexval('T');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHexvalThrowsIOException6() throws Throwable  {
      try { 
        JavaCharStream.hexval('S');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHexvalThrowsIOException7() throws Throwable  {
      try { 
        JavaCharStream.hexval('R');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHexvalThrowsIOException8() throws Throwable  {
      try { 
        JavaCharStream.hexval('Q');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHexvalThrowsIOException9() throws Throwable  {
      try { 
        JavaCharStream.hexval('P');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHexvalThrowsIOException10() throws Throwable  {
      try { 
        JavaCharStream.hexval('O');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHexvalThrowsIOException11() throws Throwable  {
      try { 
        JavaCharStream.hexval('N');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHexvalThrowsIOException12() throws Throwable  {
      try { 
        JavaCharStream.hexval('M');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHexvalThrowsIOException13() throws Throwable  {
      try { 
        JavaCharStream.hexval('L');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHexvalThrowsIOException14() throws Throwable  {
      try { 
        JavaCharStream.hexval('K');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHexvalThrowsIOException15() throws Throwable  {
      try { 
        JavaCharStream.hexval('J');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHexvalThrowsIOException16() throws Throwable  {
      try { 
        JavaCharStream.hexval('I');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHexvalThrowsIOException17() throws Throwable  {
      try { 
        JavaCharStream.hexval('H');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHexvalThrowsIOException18() throws Throwable  {
      try { 
        JavaCharStream.hexval('G');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHexval5() throws Throwable  {
      int hexval = JavaCharStream.hexval('F');
      assertEquals(15, hexval);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHexval6() throws Throwable  {
      int hexval = JavaCharStream.hexval('E');
      assertEquals(14, hexval);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHexval7() throws Throwable  {
      int hexval = JavaCharStream.hexval('D');
      assertEquals(13, hexval);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHexval8() throws Throwable  {
      int hexval = JavaCharStream.hexval('C');
      assertEquals(12, hexval);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHexval9() throws Throwable  {
      int hexval = JavaCharStream.hexval('B');
      assertEquals(11, hexval);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHexvalAndHexvalWithAlphabeticChar1() throws Throwable  {
      int hexval = JavaCharStream.hexval('A');
      assertEquals(10, hexval);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHexvalThrowsIOExceptionAndHexvalWithOtherChar7() throws Throwable  {
      try { 
        JavaCharStream.hexval('@');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHexvalThrowsIOExceptionAndHexvalWithOtherChar8() throws Throwable  {
      try { 
        JavaCharStream.hexval('?');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHexvalThrowsIOExceptionAndHexvalWithOtherChar9() throws Throwable  {
      try { 
        JavaCharStream.hexval('>');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHexvalThrowsIOExceptionAndHexvalWithOtherChar10() throws Throwable  {
      try { 
        JavaCharStream.hexval('=');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHexvalThrowsIOExceptionAndHexvalWithOtherChar11() throws Throwable  {
      try { 
        JavaCharStream.hexval('<');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHexvalThrowsIOExceptionAndHexvalWithOtherChar12() throws Throwable  {
      try { 
        JavaCharStream.hexval(';');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHexvalThrowsIOExceptionAndHexvalWithOtherChar13() throws Throwable  {
      try { 
        JavaCharStream.hexval(':');
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.soops.CEN4010.JMCA.JParser.JavaCharStream", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHexvalAndHexvalWithDigit0() throws Throwable  {
      int hexval = JavaCharStream.hexval('9');
      assertEquals(9, hexval);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHexvalAndHexvalWithDigit1() throws Throwable  {
      int hexval = JavaCharStream.hexval('8');
      assertEquals(8, hexval);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHexvalAndHexvalWithDigit2() throws Throwable  {
      int hexval = JavaCharStream.hexval('7');
      assertEquals(7, hexval);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHexvalAndHexvalWithDigit3() throws Throwable  {
      int hexval = JavaCharStream.hexval('6');
      assertEquals(6, hexval);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHexvalAndHexvalWithDigit4() throws Throwable  {
      int hexval = JavaCharStream.hexval('5');
      assertEquals(5, hexval);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHexvalAndHexvalWithDigit5() throws Throwable  {
      int hexval = JavaCharStream.hexval('4');
      assertEquals(4, hexval);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHexvalAndHexvalWithDigit6() throws Throwable  {
      int hexval = JavaCharStream.hexval('3');
      assertEquals(3, hexval);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHexvalAndHexvalWithDigit7() throws Throwable  {
      int hexval = JavaCharStream.hexval('2');
      assertEquals(2, hexval);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHexvalAndHexvalWithDigit8() throws Throwable  {
      int hexval = JavaCharStream.hexval('1');
      assertEquals(1, hexval);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHexvalReturningZero() throws Throwable  {
      int hexval = JavaCharStream.hexval('0');
      assertEquals(0, hexval);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDone() throws Throwable  {
      StringReader arg0 = new StringReader("Tp,V");
      JavaCharStream javaCharStream = new JavaCharStream(arg0);
      javaCharStream.Done();
      javaCharStream.ReInit((Reader) arg0, (-1009), 2751, 65533);
      assertEquals((-1), javaCharStream.bufpos);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetBeginLineReturningZero() throws Throwable  {
      StringReader arg0 = new StringReader("_,U avKQ*l^TMQC7");
      JavaCharStream javaCharStream = new JavaCharStream(arg0, 0, 0);
      javaCharStream.getBeginLine();
      assertEquals((-1), javaCharStream.bufpos);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReInitTaking3Arguments() throws Throwable  {
      JavaCharStream javaCharStream = new JavaCharStream((Reader) null);
      javaCharStream.ReInit((Reader) null, 3234, 86);
      assertEquals((-1), javaCharStream.bufpos);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadByteReturningOtherChar() throws Throwable  {
      StringReader arg0 = new StringReader(" D+!``27^W02");
      JavaCharStream javaCharStream = new JavaCharStream(arg0, 0, 5);
      char ReadByte = javaCharStream.ReadByte();
      assertEquals((-1), javaCharStream.bufpos);
      assertEquals(' ', ReadByte);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetBeginColumnReturningZero() throws Throwable  {
      StringReader arg0 = new StringReader("Sp1494<;i;8cBt;++V:");
      JavaCharStream javaCharStream = new JavaCharStream(arg0);
      javaCharStream.getBeginColumn();
      assertEquals((-1), javaCharStream.bufpos);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReInitTakingReader() throws Throwable  {
      StringReader arg0 = new StringReader("");
      JavaCharStream javaCharStream = new JavaCharStream(arg0);
      javaCharStream.ReInit((Reader) arg0);
      assertEquals((-1), javaCharStream.bufpos);
  }
}
