/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.io;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.io.IOUtilities;
import com.lts.io.ImprovedFile;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.LineNumberReader;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import java.io.PipedReader;
import java.io.PrintStream;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.evosuite.Properties.SandboxMode;
import org.evosuite.sandbox.Sandbox;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class IOUtilitiesEvoSuiteTest {

  private static ExecutorService executor; 

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
    org.evosuite.Properties.SANDBOX_MODE = SandboxMode.RECOMMENDED; 
    Sandbox.initializeSecurityManagerForSUT(); 
    executor = Executors.newCachedThreadPool(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    executor.shutdownNow(); 
    Sandbox.resetDefaultSecurityManager(); 
  } 

  @Before 
  public void initTestCase(){ 
    Sandbox.goingToExecuteSUTCode(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    Sandbox.doneWithExecutingSUTCode(); 
  } 


  @Test
  public void test0()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
        try {
          // Undeclared exception!
          try {
            IOUtilities.createTempDirectory("[cTHU$Qu");
            fail("Expecting exception: SecurityException");
          } catch(SecurityException e) {
            /*
             * Security manager blocks (java.io.FilePermission /tmp/[cTHU$Qu1191653409124456728 write)
             * java.lang.Thread.getStackTrace(Thread.java:1479)
             * org.evosuite.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:303)
             * java.lang.SecurityManager.checkWrite(SecurityManager.java:962)
             * java.io.File.checkAndCreate(File.java:1696)
             * java.io.File.createTempFile(File.java:1792)
             * java.io.File.createTempFile(File.java:1828)
             * com.lts.io.IOUtilities.createTempDirectory(IOUtilities.java:139)
             * com.lts.io.IOUtilities.createTempDirectory(IOUtilities.java:164)
             * sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
             * sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:39)
             * sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:25)
             * java.lang.reflect.Method.invoke(Method.java:597)
             * org.evosuite.testcase.MethodStatement$1.execute(MethodStatement.java:262)
             * org.evosuite.testcase.AbstractStatement.exceptionHandler(AbstractStatement.java:142)
             * org.evosuite.testcase.MethodStatement.execute(MethodStatement.java:217)
             * org.evosuite.testcase.TestRunnable.call(TestRunnable.java:291)
             * org.evosuite.testcase.TestRunnable.call(TestRunnable.java:44)
             * java.util.concurrent.FutureTask$Sync.innerRun(FutureTask.java:303)
             * java.util.concurrent.FutureTask.run(FutureTask.java:138)
             * java.util.concurrent.ThreadPoolExecutor$Worker.runTask(ThreadPoolExecutor.java:886)
             * java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:908)
             * java.lang.Thread.run(Thread.java:662)
             */
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }

  @Test
  public void test1()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("", "");
      try {
        IOUtilities.backup((File) improvedFile0);
        fail("Expecting exception: FileNotFoundException");
      } catch(FileNotFoundException e) {
        /*
         * / (Is a directory)
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      IOUtilities.close((Reader) null);
  }

  @Test
  public void test3()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      IOUtilities.close((Writer) stringWriter0);
      assertEquals("", stringWriter0.toString());
  }

  @Test
  public void test4()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
        try {
          ImprovedFile improvedFile0 = new ImprovedFile("{#gG `v/s&h@", "{#gG `v/s&h@");
          // Undeclared exception!
          try {
            IOUtilities.createTempDirectory((File) improvedFile0, "{#gG `v/s&h@");
            fail("Expecting exception: SecurityException");
          } catch(SecurityException e) {
            /*
             * Security manager blocks (java.io.FilePermission {#gG `v/s&h@/{#gG `v/s&h@/{#gG `v/s&h@6243197744007462103 write)
             * java.lang.Thread.getStackTrace(Thread.java:1479)
             * org.evosuite.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:303)
             * java.lang.SecurityManager.checkWrite(SecurityManager.java:962)
             * java.io.File.checkAndCreate(File.java:1696)
             * java.io.File.createTempFile(File.java:1792)
             * com.lts.io.IOUtilities.createTempDirectory(IOUtilities.java:141)
             * com.lts.io.IOUtilities.createTempDirectory(IOUtilities.java:170)
             * sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
             * sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:39)
             * sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:25)
             * java.lang.reflect.Method.invoke(Method.java:597)
             * org.evosuite.testcase.MethodStatement$1.execute(MethodStatement.java:262)
             * org.evosuite.testcase.AbstractStatement.exceptionHandler(AbstractStatement.java:142)
             * org.evosuite.testcase.MethodStatement.execute(MethodStatement.java:217)
             * org.evosuite.testcase.TestRunnable.call(TestRunnable.java:291)
             * org.evosuite.testcase.TestRunnable.call(TestRunnable.java:44)
             * java.util.concurrent.FutureTask$Sync.innerRun(FutureTask.java:303)
             * java.util.concurrent.FutureTask.run(FutureTask.java:138)
             * java.util.concurrent.ThreadPoolExecutor$Worker.runTask(ThreadPoolExecutor.java:886)
             * java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:908)
             * java.lang.Thread.run(Thread.java:662)
             */
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }

  @Test
  public void test5()  throws Throwable  {
      IOUtilities iOUtilities0 = new IOUtilities();
      assertNotNull(iOUtilities0);
  }

  @Test
  public void test6()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      IOUtilities.closeNoExceptions((OutputStream) pipedOutputStream0);
  }

  @Test
  public void test7()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (int) (byte)28, (int) (byte)28);
      IOUtilities.closeNoExceptions((InputStream) byteArrayInputStream0);
      assertEquals(-1, byteArrayInputStream0.read());
  }

  @Test
  public void test8()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader();
      IOUtilities.close((Reader) pipedReader0);
      assertEquals(false, pipedReader0.markSupported());
  }

  @Test
  public void test9()  throws Throwable  {
      IOUtilities.closeNoExceptions((Writer) null);
  }

  @Test
  public void test10()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader();
      LineNumberReader lineNumberReader0 = new LineNumberReader((Reader) pipedReader0);
      IOUtilities.closeNoExceptions((BufferedReader) lineNumberReader0);
      assertEquals(true, lineNumberReader0.markSupported());
  }

  @Test
  public void test11()  throws Throwable  {
      IOUtilities.closeNoExceptions((BufferedReader) null);
  }

  @Test
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try {
        IOUtilities.toImprovedFile((File) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test13()  throws Throwable  {
      File file0 = new File("np0j);}j", "np0j);}j");
      ImprovedFile improvedFile0 = new ImprovedFile(file0, "np0j);}j");
      ImprovedFile improvedFile1 = IOUtilities.toImprovedFile((File) improvedFile0);
      assertSame(improvedFile0, improvedFile1);
  }

  @Test
  public void test14()  throws Throwable  {
      File file0 = IOUtilities.backup((File) null);
      assertNull(file0);
  }

  @Test
  public void test15()  throws Throwable  {
      File file0 = new File("np0j);}j", "np0j);}j");
      File file1 = IOUtilities.backup(file0);
      assertNull(file1);
  }

  @Test
  public void test16()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile(".", ".");
      try {
        IOUtilities.backup((File) improvedFile0);
        fail("Expecting exception: FileNotFoundException");
      } catch(FileNotFoundException e) {
        /*
         * ./. (Is a directory)
         */
      }
  }

  @Test
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      PrintStream printStream0 = new PrintStream((OutputStream) byteArrayOutputStream0, true);
      IOUtilities.copyStream((InputStream) byteArrayInputStream0, printStream0);
      assertEquals(-1, byteArrayInputStream0.read());
      assertEquals("\u0000\n", byteArrayOutputStream0.toString());
  }
}