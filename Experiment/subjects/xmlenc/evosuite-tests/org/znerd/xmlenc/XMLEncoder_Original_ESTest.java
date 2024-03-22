/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Wed Mar 20 18:04:56 GMT 2024
 */

package org.znerd.xmlenc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.znerd.xmlenc.XMLEncoder;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class XMLEncoder_Original_ESTest extends XMLEncoder_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testTextTaking5ArgumentsThrowsRuntimeExceptionAndCreatesXMLEncoder0() throws Throwable  {
      XMLEncoder xMLEncoder = new XMLEncoder("UTF-16");
      StringWriter arg0 = new StringWriter();
      char[] arg1 = new char[6];
      arg1[0] = 'P';
      arg1[1] = 'd';
      arg1[2] = '>';
      try { 
        xMLEncoder.text((Writer) arg0, arg1, 0, 13, false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // The character 0x0 is not valid.
         //
         verifyException("org.znerd.xmlenc.XMLEncoder", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testTextTaking5ArgumentsThrowsRuntimeExceptionAndCreatesXMLEncoder1() throws Throwable  {
      XMLEncoder xMLEncoder = new XMLEncoder("UTF-16");
      StringWriter arg0 = new StringWriter();
      char[] arg1 = new char[3];
      arg1[0] = '&';
      try { 
        xMLEncoder.text((Writer) arg0, arg1, 0, 112, false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // The character 0x0 is not valid.
         //
         verifyException("org.znerd.xmlenc.XMLEncoder", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testTextTaking5ArgumentsThrowsRuntimeExceptionAndGetEncoder0() throws Throwable  {
      XMLEncoder encoder = XMLEncoder.getEncoder("UTF-16");
      StringWriter arg0 = new StringWriter();
      char[] arg1 = new char[5];
      arg1[0] = 'l';
      arg1[1] = '6';
      arg1[2] = '=';
      try { 
        encoder.text((Writer) arg0, arg1, 0, 1227, true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // The character 0x0 is not valid.
         //
         verifyException("org.znerd.xmlenc.XMLEncoder", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testTextTaking5ArgumentsThrowsArrayIndexOutOfBoundsExceptionAndGetEncoder() throws Throwable  {
      XMLEncoder encoder = XMLEncoder.getEncoder("UTF-16");
      StringWriter arg0 = new StringWriter();
      char[] arg1 = new char[3];
      arg1[0] = '/';
      arg1[1] = '/';
      arg1[2] = ' ';
      try { 
        encoder.text((Writer) arg0, arg1, 0, 53, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.znerd.xmlenc.XMLEncoder", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testTextTaking5ArgumentsThrowsIndexOutOfBoundsException() throws Throwable  {
      XMLEncoder xMLEncoder = new XMLEncoder("UTF-16");
      StringWriter arg0 = new StringWriter();
      char[] arg1 = new char[8];
      try { 
        xMLEncoder.text((Writer) arg0, arg1, (-171), (-171), true);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringWriter", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesXMLEncoder0() throws Throwable  {
      XMLEncoder xMLEncoder = new XMLEncoder("UTF-8");
      assertEquals("UTF-8", xMLEncoder.getEncoding());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testWhitespaceTaking4ArgumentsThrowsIndexOutOfBoundsException() throws Throwable  {
      XMLEncoder xMLEncoder = new XMLEncoder("UTF-16");
      StringWriter arg0 = new StringWriter();
      char[] arg1 = new char[4];
      try { 
        xMLEncoder.whitespace((Writer) arg0, arg1, 2565, 2565);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringWriter", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesXMLEncoderAndAttributeAndAttributeWithTrue() throws Throwable  {
      XMLEncoder xMLEncoder = new XMLEncoder("ISO-8859-'O;LYXA\" %>|KAOQI");
      StringWriter arg0 = new StringWriter();
      xMLEncoder.attribute(arg0, "ISO-8859-'O;LYXA\" %>|KAOQI", "ISO-8859-'O;LYXA\" %>|KAOQI", '\'', true);
      assertEquals(" ISO-8859-'O;LYXA\" %>|KAOQI='ISO-8859-&apos;O;LYXA\" %&gt;|KAOQI'", arg0.toString());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesXMLEncoderAndCallsAttribute0() throws Throwable  {
      XMLEncoder xMLEncoder = new XMLEncoder("ISO-8859-5V> =I[&JV+<^%QPOT");
      StringWriter arg0 = new StringWriter();
      xMLEncoder.attribute(arg0, "ISO-8859-5V> =I[&JV+<^%QPOT", "ISO-8859-5V> =I[&JV+<^%QPOT", '\'', false);
      assertEquals(" ISO-8859-5V> =I[&JV+<^%QPOT='ISO-8859-5V&gt; =I[&JV+&lt;^%QPOT'", arg0.toString());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesXMLEncoderAndCallsAttribute1() throws Throwable  {
      XMLEncoder xMLEncoder = new XMLEncoder("ISO-8859-G.7FMI{U%MJPP\"({AZ");
      StringWriter arg0 = new StringWriter();
      xMLEncoder.attribute(arg0, "ISO-8859-G.7FMI{U%MJPP\"({AZ", "ISO-8859-G.7FMI{U%MJPP\"({AZ", '\"', false);
      assertEquals(" ISO-8859-G.7FMI{U%MJPP\"({AZ=\"ISO-8859-G.7FMI{U%MJPP&quot;({AZ\"", arg0.toString());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAttributeAndGetEncoder() throws Throwable  {
      XMLEncoder encoder = XMLEncoder.getEncoder("ISO-8859-5V> =I[&JV+<^%QPOT");
      StringWriter arg0 = new StringWriter();
      encoder.attribute(arg0, "ISO-8859-5V> =I[&JV+<^%QPOT", "ISO-8859-5V> =I[&JV+<^%QPOT", '\'', true);
      assertEquals(" ISO-8859-5V> =I[&JV+<^%QPOT='ISO-8859-5V&gt; =I[&amp;JV+&lt;^%QPOT'", arg0.toString());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesXMLEncoderAndCallsAttribute2() throws Throwable  {
      StringWriter arg0 = new StringWriter();
      XMLEncoder xMLEncoder = new XMLEncoder("ISO-8859-' (0X");
      xMLEncoder.attribute(arg0, "ISO-8859-' (0X", "ISO-8859-' (0X", '\"', false);
      assertEquals(" ISO-8859-' (0X=\"ISO-8859-' (0X\"", arg0.toString());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAttributeThrowsIllegalArgumentException() throws Throwable  {
      XMLEncoder encoder = XMLEncoder.getEncoder("UTF-16");
      // Undeclared exception!
      try { 
        encoder.attribute((Writer) null, "UTF-16", "UTF-16", '>', false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Character 0x3e ('>') is not a valid quotation mark.
         //
         verifyException("org.znerd.xmlenc.XMLEncoder", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetEncoderAndTextTaking11And1AndTextTaking11And1WithOtherChar0() throws Throwable  {
      XMLEncoder encoder = XMLEncoder.getEncoder("UTF-16");
      StringWriter arg0 = new StringWriter();
      encoder.text((Writer) arg0, '>', false);
      assertEquals("&gt;", arg0.toString());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetEncoderAndTextTaking11And1AndTextTaking11And1WithOtherChar1() throws Throwable  {
      XMLEncoder encoder = XMLEncoder.getEncoder("ISO-8859-DAAE+=;T++{");
      StringWriter arg0 = new StringWriter();
      encoder.text((Writer) arg0, '<', false);
      assertEquals("&lt;", arg0.toString());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetEncoderAndTextTaking11And1AndTextTaking11And1WithOtherChar2() throws Throwable  {
      XMLEncoder encoder = XMLEncoder.getEncoder("UTF-16");
      StringWriter arg0 = new StringWriter();
      encoder.text((Writer) arg0, '\t', false);
      assertEquals("\t", arg0.toString());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesXMLEncoderAndTextTaking11And1AndTextTaking11And1WithTrue0() throws Throwable  {
      XMLEncoder xMLEncoder = new XMLEncoder("ISO-8859-CP]){TTMN{MBHBEBB&~");
      StringWriter arg0 = new StringWriter();
      xMLEncoder.text((Writer) arg0, '=', true);
      assertEquals("=", arg0.toString());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesXMLEncoderAndTextTaking11And1AndTextTaking11And1WithFalse0() throws Throwable  {
      XMLEncoder xMLEncoder = new XMLEncoder("UTF-16");
      StringWriter arg0 = new StringWriter();
      xMLEncoder.text((Writer) arg0, '\r', false);
      assertEquals("\r", arg0.toString());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesXMLEncoderAndTextTaking11And1AndTextTaking11And1WithFalse1() throws Throwable  {
      XMLEncoder xMLEncoder = new XMLEncoder("UTF-16");
      StringWriter arg0 = new StringWriter();
      xMLEncoder.text((Writer) arg0, '\n', false);
      assertEquals("\n", arg0.toString());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetEncoderAndTextTaking11And1AndTextTaking11And1WithTrue() throws Throwable  {
      XMLEncoder encoder = XMLEncoder.getEncoder("UTF-16");
      StringWriter arg0 = new StringWriter();
      encoder.text((Writer) arg0, '\uFFFF', true);
      assertEquals("\uFFFF", arg0.toString());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesXMLEncoderAndTextTaking11And1AndTextTaking11And1WithFalse2() throws Throwable  {
      XMLEncoder xMLEncoder = new XMLEncoder("UTF-16");
      StringWriter arg0 = new StringWriter();
      xMLEncoder.text((Writer) arg0, '&', false);
      assertEquals("&amp;", arg0.toString());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesXMLEncoderAndTextTaking11And1AndTextTaking11And1WithTrue1() throws Throwable  {
      XMLEncoder xMLEncoder = new XMLEncoder("ISO-8859-DAAEI=;T++{");
      StringWriter arg0 = new StringWriter();
      xMLEncoder.text((Writer) arg0, '&', true);
      assertEquals("&", arg0.toString());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesXMLEncoderAndTextTaking11And1AndTextTaking11And1WithTrue2() throws Throwable  {
      XMLEncoder xMLEncoder = new XMLEncoder("UTF-16");
      StringWriter arg0 = new StringWriter();
      xMLEncoder.text((Writer) arg0, '\"', true);
      assertEquals("\"", arg0.toString());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testTextTaking11And1ThrowsRuntimeException() throws Throwable  {
      StringWriter arg0 = new StringWriter();
      XMLEncoder xMLEncoder = new XMLEncoder("UTF-16");
      try { 
        xMLEncoder.text((Writer) arg0, '\u001C', true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // The character 0x1c is not valid.
         //
         verifyException("org.znerd.xmlenc.XMLEncoder", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetEncoderAndTextTaking11And1() throws Throwable  {
      XMLEncoder encoder = XMLEncoder.getEncoder("UTF-16");
      StringWriter arg0 = new StringWriter();
      encoder.text((Writer) arg0, 'D', false);
      assertEquals("D", arg0.toString());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetEncoderAndTextTaking11And1AndTextTaking11And1WithOtherChar3() throws Throwable  {
      XMLEncoder encoder = XMLEncoder.getEncoder("ISO-8859-DAAEI=;T++{");
      StringWriter arg0 = new StringWriter();
      encoder.text((Writer) arg0, '\uFFFA', false);
      assertEquals("&#65530;", arg0.toString());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testTextTaking11And1ThrowsNullPointerException() throws Throwable  {
      XMLEncoder encoder = XMLEncoder.getEncoder("UTF-16");
      // Undeclared exception!
      try { 
        encoder.text((Writer) null, '(', true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.znerd.xmlenc.XMLEncoder", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testTextTaking2ArgumentsThrowsRuntimeException() throws Throwable  {
      XMLEncoder xMLEncoder = new XMLEncoder("UTF-16");
      StringWriter arg0 = new StringWriter();
      try { 
        xMLEncoder.text((Writer) arg0, '\u001F');
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // The character 0x1f is not valid.
         //
         verifyException("org.znerd.xmlenc.XMLEncoder", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testTextTaking2ArgumentsThrowsNullPointerExceptionAndTextTaking2ArgumentsWithOtherChar0() throws Throwable  {
      XMLEncoder encoder = XMLEncoder.getEncoder("UTF-16");
      // Undeclared exception!
      try { 
        encoder.text((Writer) null, '>');
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.znerd.xmlenc.XMLEncoder", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesXMLEncoderAndCallsTextTaking2Arguments0() throws Throwable  {
      XMLEncoder xMLEncoder = new XMLEncoder("ISO-8859-DAAEI=;T++{");
      StringWriter arg0 = new StringWriter();
      xMLEncoder.text((Writer) arg0, '<');
      assertEquals("&lt;", arg0.toString());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetEncoderAndTextTaking2Arguments0() throws Throwable  {
      XMLEncoder encoder = XMLEncoder.getEncoder("UTF-16");
      StringWriter arg0 = new StringWriter();
      encoder.text((Writer) arg0, '=');
      assertEquals("=", arg0.toString());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesXMLEncoderAndCallsTextTaking2Arguments1() throws Throwable  {
      XMLEncoder xMLEncoder = new XMLEncoder("UTF-16");
      StringWriter arg0 = new StringWriter();
      xMLEncoder.text((Writer) arg0, '\r');
      assertEquals("\r", arg0.toString());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesXMLEncoderAndCallsTextTaking2Arguments2() throws Throwable  {
      XMLEncoder xMLEncoder = new XMLEncoder("UTF-16");
      StringWriter arg0 = new StringWriter();
      xMLEncoder.text((Writer) arg0, '\n');
      assertEquals("\n", arg0.toString());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesXMLEncoderAndCallsTextTaking2Arguments3() throws Throwable  {
      XMLEncoder xMLEncoder = new XMLEncoder("UTF-16");
      StringWriter arg0 = new StringWriter();
      xMLEncoder.text((Writer) arg0, '\uFFFA');
      assertEquals("\uFFFA", arg0.toString());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesXMLEncoderAndCallsTextTaking2Arguments4() throws Throwable  {
      XMLEncoder xMLEncoder = new XMLEncoder("ISO-8859-DAAEI=;T++{");
      StringWriter arg0 = new StringWriter();
      xMLEncoder.text((Writer) arg0, '&');
      assertEquals("&", arg0.toString());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetEncoderAndTextTaking2Arguments1() throws Throwable  {
      XMLEncoder encoder = XMLEncoder.getEncoder("UTF-16");
      StringWriter arg0 = new StringWriter();
      encoder.text((Writer) arg0, '\t');
      assertEquals("\t", arg0.toString());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testTextTaking2ArgumentsWithDigit() throws Throwable  {
      XMLEncoder xMLEncoder = new XMLEncoder("UTF-16");
      StringWriter arg0 = new StringWriter();
      xMLEncoder.text((Writer) arg0, '9');
      assertEquals("9", arg0.toString());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesXMLEncoderAndCallsTextTaking2Arguments5() throws Throwable  {
      XMLEncoder xMLEncoder = new XMLEncoder("ISO-8859-DAAEI=;T++{");
      StringWriter arg0 = new StringWriter();
      xMLEncoder.text((Writer) arg0, '\uFFFC');
      assertEquals("&#65532;", arg0.toString());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testTextTaking2ArgumentsThrowsNullPointerException() throws Throwable  {
      XMLEncoder encoder = XMLEncoder.getEncoder("UTF-16");
      // Undeclared exception!
      try { 
        encoder.text((Writer) null, 'H');
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.znerd.xmlenc.XMLEncoder", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testTextTaking2ArgumentsThrowsNullPointerExceptionAndTextTaking2ArgumentsWithOtherChar1() throws Throwable  {
      XMLEncoder encoder = XMLEncoder.getEncoder("UTF-16");
      // Undeclared exception!
      try { 
        encoder.text((Writer) null, '#');
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.znerd.xmlenc.XMLEncoder", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testTextTaking5ArgumentsWithPositive() throws Throwable  {
      StringWriter arg0 = new StringWriter();
      XMLEncoder encoder = XMLEncoder.getEncoder("ISO-8859-DAAEI=;T++{");
      char[] arg1 = new char[6];
      arg1[4] = '\t';
      try { 
        encoder.text((Writer) arg0, arg1, 4, 62, true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // The character 0x0 is not valid.
         //
         verifyException("org.znerd.xmlenc.XMLEncoder", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testTextTaking5ArgumentsThrowsArrayIndexOutOfBoundsException0() throws Throwable  {
      XMLEncoder xMLEncoder = new XMLEncoder("UTF-16");
      StringWriter arg0 = new StringWriter();
      char[] arg1 = new char[6];
      arg1[0] = 'P';
      arg1[1] = 'P';
      arg1[2] = 'P';
      arg1[3] = '9';
      arg1[4] = '<';
      arg1[5] = '\r';
      try { 
        xMLEncoder.text((Writer) arg0, arg1, 0, 13, false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("org.znerd.xmlenc.XMLEncoder", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testTextTaking5ArgumentsThrowsArrayIndexOutOfBoundsExceptionAndTextTaking5ArgumentsWithTrue() throws Throwable  {
      XMLEncoder xMLEncoder = new XMLEncoder("UTF-16");
      StringWriter arg0 = new StringWriter();
      char[] arg1 = new char[1];
      arg1[0] = '\n';
      try { 
        xMLEncoder.text((Writer) arg0, arg1, 0, (int) '\n', true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.znerd.xmlenc.XMLEncoder", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testTextTaking5ArgumentsThrowsArrayIndexOutOfBoundsException1() throws Throwable  {
      XMLEncoder xMLEncoder = new XMLEncoder("UTF-16");
      StringWriter arg0 = new StringWriter();
      char[] arg1 = new char[1];
      arg1[0] = '\uFFFD';
      try { 
        xMLEncoder.text((Writer) arg0, arg1, 0, (int) '\uFFFD', false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.znerd.xmlenc.XMLEncoder", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testTextTaking5ArgumentsThrowsRuntimeExceptionAndGetEncoder1() throws Throwable  {
      XMLEncoder encoder = XMLEncoder.getEncoder("UTF-16");
      StringWriter arg0 = new StringWriter();
      char[] arg1 = new char[6];
      arg1[0] = '&';
      try { 
        encoder.text((Writer) arg0, arg1, 0, (int) '&', true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // The character 0x0 is not valid.
         //
         verifyException("org.znerd.xmlenc.XMLEncoder", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testTextTaking5ArgumentsThrowsRuntimeExceptionAndGetEncoder2() throws Throwable  {
      XMLEncoder encoder = XMLEncoder.getEncoder("ISO-8859-UF-6");
      StringWriter arg0 = new StringWriter();
      char[] arg1 = new char[6];
      arg1[0] = '\uFFFD';
      try { 
        encoder.text((Writer) arg0, arg1, 0, (int) '\uFFFD', true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // The character 0x0 is not valid.
         //
         verifyException("org.znerd.xmlenc.XMLEncoder", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFailsToCreateXMLEncoderThrowsUnsupportedEncodingException() throws Throwable  {
      XMLEncoder xMLEncoder = null;
      try {
        xMLEncoder = new XMLEncoder("!ELkdX");
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(Throwable e) {
         //
         // !ELkdX
         //
         verifyException("org.znerd.xmlenc.XMLEncoder", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesXMLEncoder1() throws Throwable  {
      XMLEncoder xMLEncoder = new XMLEncoder("ASCII");
      assertEquals("ASCII", xMLEncoder.getEncoding());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesXMLEncoder2() throws Throwable  {
      XMLEncoder xMLEncoder = new XMLEncoder("US-ASCII");
      assertEquals("US-ASCII", xMLEncoder.getEncoding());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFailsToCreateXMLEncoderThrowsIllegalArgumentException() throws Throwable  {
      XMLEncoder xMLEncoder = null;
      try {
        xMLEncoder = new XMLEncoder((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // encoding == null
         //
         verifyException("org.znerd.xmlenc.XMLEncoder", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testTextTaking11And1() throws Throwable  {
      XMLEncoder xMLEncoder = new XMLEncoder("ISO-8859-5V> =I[&JV+<^%QPOT");
      StringWriter arg0 = new StringWriter();
      xMLEncoder.text((Writer) arg0, "ISO-8859-5V> =I[&JV+<^%QPOT", false);
      assertEquals("ISO-8859-5V&gt; =I[&JV+&lt;^%QPOT", arg0.toString());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetEncoding() throws Throwable  {
      XMLEncoder encoder = XMLEncoder.getEncoder("UTF-8");
      String encoding = encoder.getEncoding();
      assertEquals("UTF-8", encoding);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDeclaration() throws Throwable  {
      XMLEncoder encoder = XMLEncoder.getEncoder("ISO-8859-ISO-8859-DAAE+=;T++{");
      StringWriter arg0 = new StringWriter();
      encoder.declaration(arg0);
      assertEquals("<?xml version=\"1.0\" encoding=\"ISO-8859-ISO-8859-DAAE+=;T++{\"?>", arg0.toString());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testWhitespaceTaking2Arguments() throws Throwable  {
      XMLEncoder encoder = XMLEncoder.getEncoder("UTF-16");
      StringWriter arg0 = new StringWriter();
      encoder.whitespace((Writer) arg0, "");
      assertEquals("UTF-16", encoder.getEncoding());
  }
}