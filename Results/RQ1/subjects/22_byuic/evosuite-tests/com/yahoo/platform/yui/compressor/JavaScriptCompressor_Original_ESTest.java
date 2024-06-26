/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Mon Mar 18 01:59:08 GMT 2024
 */

package com.yahoo.platform.yui.compressor;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import com.yahoo.platform.yui.compressor.JavaScriptCompressor;
import java.io.StringReader;
import java.io.Writer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.ErrorReporter;
import org.mozilla.javascript.tools.ToolErrorReporter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class JavaScriptCompressor_Original_ESTest extends JavaScriptCompressor_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCompressThrowsNullPointerException() throws Throwable  {
      ToolErrorReporter arg1 = new ToolErrorReporter(false);
      StringReader arg0 = new StringReader(" Yl79vN;N$K,Ni");
      JavaScriptCompressor javaScriptCompressor = new JavaScriptCompressor(arg0, arg1);
      // Undeclared exception!
      try { 
        javaScriptCompressor.compress((Writer) null, 8, false, false, false, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.yahoo.platform.yui.compressor.JavaScriptCompressor", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCompressWithTrue() throws Throwable  {
      StringReader arg0 = new StringReader("eval");
      ContextFactory global = ContextFactory.getGlobal();
      Context enterContext = global.enterContext();
      ErrorReporter arg1 = enterContext.getErrorReporter();
      JavaScriptCompressor javaScriptCompressor = new JavaScriptCompressor(arg0, arg1);
      // Undeclared exception!
      try { 
        javaScriptCompressor.compress((Writer) null, 10, false, true, false, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.yahoo.platform.yui.compressor.JavaScriptCompressor", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCompressWithNull() throws Throwable  {
      StringReader arg0 = new StringReader("ev+I");
      ToolErrorReporter arg1 = new ToolErrorReporter(false);
      JavaScriptCompressor javaScriptCompressor = new JavaScriptCompressor(arg0, arg1);
      // Undeclared exception!
      try { 
        javaScriptCompressor.compress((Writer) null, 100, false, false, false, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.yahoo.platform.yui.compressor.JavaScriptCompressor", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCompressWithTrueAndTrue() throws Throwable  {
      ToolErrorReporter arg1 = new ToolErrorReporter(false);
      StringReader arg0 = new StringReader("top");
      JavaScriptCompressor javaScriptCompressor = new JavaScriptCompressor(arg0, arg1);
      // Undeclared exception!
      try { 
        javaScriptCompressor.compress((Writer) null, 2, true, true, true, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.yahoo.platform.yui.compressor.JavaScriptCompressor", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCompressWithPositive() throws Throwable  {
      StringReader arg0 = new StringReader("0^Q3J");
      ToolErrorReporter arg1 = new ToolErrorReporter(false);
      JavaScriptCompressor javaScriptCompressor = new JavaScriptCompressor(arg0, arg1);
      // Undeclared exception!
      try { 
        javaScriptCompressor.compress((Writer) null, 120, false, false, false, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.yahoo.platform.yui.compressor.JavaScriptCompressor", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCompressWithNegative() throws Throwable  {
      StringReader arg0 = new StringReader("!c9g;O");
      ToolErrorReporter arg1 = new ToolErrorReporter(false);
      JavaScriptCompressor javaScriptCompressor = new JavaScriptCompressor(arg0, arg1);
      // Undeclared exception!
      try { 
        javaScriptCompressor.compress((Writer) null, (-1293), true, false, false, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.yahoo.platform.yui.compressor.JavaScriptCompressor", e);
      }
  }
}
