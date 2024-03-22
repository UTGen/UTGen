/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Wed Mar 20 10:22:26 GMT 2024
 */

package JSci.maths.symbolic;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import JSci.maths.symbolic.SimpleCharStream;
import java.io.InputStreamReader;
import java.io.PipedInputStream;
import java.io.Reader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SimpleCharStream_Original_ESTest extends SimpleCharStream_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFillBuffThrowsError() throws Throwable  {
      // Undeclared exception!
      try { 
        SimpleCharStream.FillBuff();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("JSci.maths.symbolic.SimpleCharStream", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesSimpleCharStreamTaking4Arguments() throws Throwable  {
      SimpleCharStream simpleCharStream = new SimpleCharStream((Reader) null, (-3077), 1, 0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAdjustBeginLineColumnThrowsNullPointerException() throws Throwable  {
      // Undeclared exception!
      try { 
        SimpleCharStream.adjustBeginLineColumn(8, (-1220));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("JSci.maths.symbolic.SimpleCharStream", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetSuffixThrowsNullPointerException() throws Throwable  {
      // Undeclared exception!
      try { 
        SimpleCharStream.GetSuffix(2140);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetImageThrowsNullPointerException() throws Throwable  {
      // Undeclared exception!
      try { 
        SimpleCharStream.GetImage();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testBackup() throws Throwable  {
      SimpleCharStream.backup(0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testUpdateLineColumnThrowsNullPointerException() throws Throwable  {
      // Undeclared exception!
      try { 
        SimpleCharStream.UpdateLineColumn('1');
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("JSci.maths.symbolic.SimpleCharStream", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadCharThrowsError() throws Throwable  {
      // Undeclared exception!
      try { 
        SimpleCharStream.readChar();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("JSci.maths.symbolic.SimpleCharStream", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testExpandBuffThrowsError() throws Throwable  {
      // Undeclared exception!
      try { 
        SimpleCharStream.ExpandBuff(true);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("JSci.maths.symbolic.SimpleCharStream", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesSimpleCharStreamTaking3ArgumentsAndCreatesSimpleCharStreamTaking3Arguments0() throws Throwable  {
      PipedInputStream arg0 = new PipedInputStream(10);
      SimpleCharStream simpleCharStream = new SimpleCharStream(arg0, 10, 10);
      assertEquals(0, simpleCharStream.getBeginLine());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDone() throws Throwable  {
      SimpleCharStream.Done();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetLineThrowsNullPointerException() throws Throwable  {
      // Undeclared exception!
      try { 
        SimpleCharStream.getLine();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("JSci.maths.symbolic.SimpleCharStream", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesSimpleCharStreamTaking3ArgumentsAndCreatesSimpleCharStreamTaking3Arguments1() throws Throwable  {
      InputStreamReader arg0 = (InputStreamReader)SimpleCharStream.inputStream;
      SimpleCharStream simpleCharStream = new SimpleCharStream(arg0, 1, 2348);
      assertEquals(0, simpleCharStream.getBeginColumn());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetEndLineThrowsNullPointerException() throws Throwable  {
      // Undeclared exception!
      try { 
        SimpleCharStream.getEndLine();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("JSci.maths.symbolic.SimpleCharStream", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesSimpleCharStreamTakingInputStream() throws Throwable  {
      PipedInputStream arg0 = new PipedInputStream();
      SimpleCharStream simpleCharStream = new SimpleCharStream(arg0);
      assertEquals(0, simpleCharStream.getBeginLine());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetEndColumnThrowsNullPointerException() throws Throwable  {
      // Undeclared exception!
      try { 
        SimpleCharStream.getEndColumn();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("JSci.maths.symbolic.SimpleCharStream", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetBeginLineThrowsNullPointerException() throws Throwable  {
      // Undeclared exception!
      try { 
        SimpleCharStream.getBeginLine();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("JSci.maths.symbolic.SimpleCharStream", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testBeginTokenThrowsNullPointerException() throws Throwable  {
      // Undeclared exception!
      try { 
        SimpleCharStream.BeginToken();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("JSci.maths.symbolic.SimpleCharStream", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetColumnThrowsNullPointerException() throws Throwable  {
      // Undeclared exception!
      try { 
        SimpleCharStream.getColumn();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("JSci.maths.symbolic.SimpleCharStream", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesSimpleCharStreamTakingReader() throws Throwable  {
      InputStreamReader arg0 = (InputStreamReader)SimpleCharStream.inputStream;
      SimpleCharStream simpleCharStream = new SimpleCharStream(arg0);
      assertEquals(0, simpleCharStream.getBeginColumn());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetBeginColumnThrowsNullPointerException() throws Throwable  {
      // Undeclared exception!
      try { 
        SimpleCharStream.getBeginColumn();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("JSci.maths.symbolic.SimpleCharStream", e);
      }
  }
}
