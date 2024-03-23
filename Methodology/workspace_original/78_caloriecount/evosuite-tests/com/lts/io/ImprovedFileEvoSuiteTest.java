/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.io;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.io.ImprovedFile;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PushbackInputStream;
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
public class ImprovedFileEvoSuiteTest {

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
      File file0 = new File("@u\u0000*_", "@u\u0000*_");
      ImprovedFile improvedFile0 = new ImprovedFile(file0);
      try {
        improvedFile0.move(file0);
        fail("Expecting exception: ImprovedFile.FileException");
      } catch(ImprovedFile.FileException e) {
        /*
         * @u\u0000*_/@u\u0000*_
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("", "");
      try {
        improvedFile0.backup(true);
        fail("Expecting exception: ImprovedFile.FileException");
      } catch(ImprovedFile.FileException e) {
        /*
         * java.io.FileNotFoundException: / (Is a directory)
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
          ImprovedFile improvedFile0 = new ImprovedFile("", "");
          // Undeclared exception!
          try {
            improvedFile0.tempRename();
            fail("Expecting exception: SecurityException");
          } catch(SecurityException e) {
            /*
             * Security manager blocks (java.io.FilePermission / write)
             * java.lang.Thread.getStackTrace(Thread.java:1479)
             * org.evosuite.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:303)
             * java.lang.SecurityManager.checkWrite(SecurityManager.java:962)
             * java.io.File.renameTo(File.java:1225)
             * com.lts.io.ImprovedFile.tempRename(ImprovedFile.java:231)
             * sun.reflect.GeneratedMethodAccessor119.invoke(Unknown Source)
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
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }

  @Test
  public void test3()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("", "");
      try {
        improvedFile0.copyTo((File) improvedFile0);
        fail("Expecting exception: FileNotFoundException");
      } catch(FileNotFoundException e) {
        /*
         * / (Is a directory)
         */
      }
  }

  @Test
  public void test4()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
        try {
          ImprovedFile improvedFile0 = new ImprovedFile("?)[D`(x");
          // Undeclared exception!
          try {
            improvedFile0.createTempDir("?)[D`(x", "?)[D`(x");
            fail("Expecting exception: SecurityException");
          } catch(SecurityException e) {
            /*
             * Security manager blocks (java.io.FilePermission ?)[D`(x write)
             * java.lang.Thread.getStackTrace(Thread.java:1479)
             * org.evosuite.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:303)
             * java.lang.SecurityManager.checkWrite(SecurityManager.java:962)
             * java.io.File.mkdir(File.java:1155)
             * java.io.File.mkdirs(File.java:1184)
             * com.lts.io.ImprovedFile.createTempDirectory(ImprovedFile.java:257)
             * com.lts.io.ImprovedFile.createTempDir(ImprovedFile.java:429)
             * sun.reflect.GeneratedMethodAccessor120.invoke(Unknown Source)
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
      ImprovedFile improvedFile0 = new ImprovedFile("", "");
      try {
        improvedFile0.deleteDirectory(false);
        fail("Expecting exception: IOException");
      } catch(IOException e) {
        /*
         * The directory, /, is not empty.
         */
      }
  }

  @Test
  public void test6()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("", "");
      try {
        improvedFile0.copyFrom((File) improvedFile0);
        fail("Expecting exception: IOException");
      } catch(IOException e) {
        /*
         * Could not create directory /
         */
      }
  }

  @Test
  public void test7()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("", "");
      // Undeclared exception!
      try {
        improvedFile0.tempBackup();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test8()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
        try {
          ImprovedFile improvedFile0 = new ImprovedFile("root should have null as its paent.");
          FileDescriptor fileDescriptor0 = FileDescriptor.err;
          FileInputStream fileInputStream0 = new FileInputStream(fileDescriptor0);
          DataInputStream dataInputStream0 = new DataInputStream((InputStream) fileInputStream0);
          // Undeclared exception!
          try {
            improvedFile0.copyFrom((InputStream) dataInputStream0);
            fail("Expecting exception: SecurityException");
          } catch(SecurityException e) {
            /*
             * Security manager blocks (java.io.FilePermission root should have null as its paent. write)
             * java.lang.Thread.getStackTrace(Thread.java:1479)
             * org.evosuite.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:303)
             * java.lang.SecurityManager.checkWrite(SecurityManager.java:962)
             * java.io.FileOutputStream.<init>(FileOutputStream.java:183)
             * java.io.FileOutputStream.<init>(FileOutputStream.java:145)
             * com.lts.io.ImprovedFile.copyFrom(ImprovedFile.java:110)
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
  public void test9()  throws Throwable  {
      // Undeclared exception!
      try {
        ImprovedFile.createTempDirectory();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test10()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
        try {
          ImprovedFile improvedFile0 = new ImprovedFile("", "");
          // Undeclared exception!
          try {
            improvedFile0.createTempDir();
            fail("Expecting exception: SecurityException");
          } catch(SecurityException e) {
            /*
             * Security manager blocks (java.io.FilePermission /tempdir1487002143816786376 write)
             * java.lang.Thread.getStackTrace(Thread.java:1479)
             * org.evosuite.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:303)
             * java.lang.SecurityManager.checkWrite(SecurityManager.java:962)
             * java.io.File.checkAndCreate(File.java:1696)
             * java.io.File.createTempFile(File.java:1792)
             * com.lts.io.ImprovedFile.createTempDirectory(ImprovedFile.java:271)
             * com.lts.io.ImprovedFile.createTempDir(ImprovedFile.java:435)
             * sun.reflect.GeneratedMethodAccessor125.invoke(Unknown Source)
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
  public void test11()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("tempdir", "tempdir");
      // Undeclared exception!
      try {
        improvedFile0.makeDirectories();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try {
        ImprovedFile.createTempImprovedFile("U>", "U>", (File) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Prefix string too short
         */
      }
  }

  @Test
  public void test13()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
        try {
          ImprovedFile improvedFile0 = new ImprovedFile("", "");
          // Undeclared exception!
          try {
            improvedFile0.move((File) improvedFile0);
            fail("Expecting exception: SecurityException");
          } catch(SecurityException e) {
            /*
             * Security manager blocks (java.io.FilePermission /etc/hosts.deny delete)
             * java.lang.Thread.getStackTrace(Thread.java:1479)
             * org.evosuite.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:303)
             * java.lang.SecurityManager.checkDelete(SecurityManager.java:990)
             * java.io.File.delete(File.java:902)
             * com.lts.io.ImprovedFile.rmdir(ImprovedFile.java:360)
             * com.lts.io.ImprovedFile.rmdir(ImprovedFile.java:359)
             * com.lts.io.ImprovedFile.deleteDirectory(ImprovedFile.java:384)
             * com.lts.io.ImprovedFile.deleteDirectory(ImprovedFile.java:410)
             * com.lts.io.ImprovedFile.deleteAll(ImprovedFile.java:402)
             * com.lts.io.ImprovedFile.move(ImprovedFile.java:664)
             * sun.reflect.GeneratedMethodAccessor126.invoke(Unknown Source)
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
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[11];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) byteArrayInputStream0);
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null, 1282);
      // Undeclared exception!
      try {
        ImprovedFile.copy((InputStream) pushbackInputStream0, (OutputStream) bufferedOutputStream0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test15()  throws Throwable  {
      File file0 = new File("Be", "Be");
      try {
        ImprovedFile.backup(file0, false);
        fail("Expecting exception: ImprovedFile.FileException");
      } catch(ImprovedFile.FileException e) {
        /*
         * Be/Be
         */
      }
  }

  @Test
  public void test16()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("Attempt 8o cop a directory, ");
      try {
        improvedFile0.tempBackup();
        fail("Expecting exception: IOException");
      } catch(IOException e) {
        /*
         * source file is neither directory nor file.  File: Attempt 8o cop a directory, 
         */
      }
  }

  @Test
  public void test17()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("", "");
      File file0 = ImprovedFile.createTempFileName("", "", (File) improvedFile0);
      assertNotNull(file0);
      assertEquals("/0.", file0.getCanonicalPath());
  }

  @Test
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try {
        ImprovedFile.createTempDirectory((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test19()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
        try {
          ImprovedFile improvedFile0 = new ImprovedFile("Gu{D)e'");
          // Undeclared exception!
          try {
            ImprovedFile.createTempDirectory(improvedFile0);
            fail("Expecting exception: SecurityException");
          } catch(SecurityException e) {
            /*
             * Security manager blocks (java.io.FilePermission Gu{D)e' write)
             * java.lang.Thread.getStackTrace(Thread.java:1479)
             * org.evosuite.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:303)
             * java.lang.SecurityManager.checkWrite(SecurityManager.java:962)
             * java.io.File.mkdir(File.java:1155)
             * com.lts.io.ImprovedFile.createTempDirectory(ImprovedFile.java:312)
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
  public void test20()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
        try {
          ImprovedFile improvedFile0 = new ImprovedFile("", "");
          // Undeclared exception!
          try {
            ImprovedFile.createTempDirectory(improvedFile0);
            fail("Expecting exception: SecurityException");
          } catch(SecurityException e) {
            /*
             * Security manager blocks (java.io.FilePermission / delete)
             * java.lang.Thread.getStackTrace(Thread.java:1479)
             * org.evosuite.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:303)
             * java.lang.SecurityManager.checkDelete(SecurityManager.java:990)
             * java.io.File.delete(File.java:902)
             * com.lts.io.ImprovedFile.createTempDirectory(ImprovedFile.java:302)
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
  public void test21()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("[", "[");
      improvedFile0.deleteAll();
      assertEquals(false, improvedFile0.canRead());
  }

  @Test
  public void test22()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("Attempt 8o cop a directory, ");
      String string0 = ImprovedFile.getLastPathComponent((File) improvedFile0);
      assertEquals("Attempt 8o cop a directory, ", string0);
      assertNotNull(string0);
  }

  @Test
  public void test23()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("M-a3Jos}Y/7|i~c");
      String string0 = ImprovedFile.getLastPathComponent((File) improvedFile0);
      assertEquals("/7|i~c", string0);
      assertNotNull(string0);
  }

  @Test
  public void test24()  throws Throwable  {
      File file0 = new File(";lJVpr+MN09zY+[c*TX", ";lJVpr+MN09zY+[c*TX");
      ImprovedFile.copyFromToDir(file0, file0);
      assertEquals(0L, file0.length());
  }

  @Test
  public void test25()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("createNode", "createNode");
      try {
        improvedFile0.copyFrom((File) improvedFile0);
        fail("Expecting exception: IOException");
      } catch(IOException e) {
        /*
         * Asked to copy non-existent file, createNode/createNode
         */
      }
  }

  @Test
  public void test26()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
        try {
          ImprovedFile improvedFile0 = new ImprovedFile("", "");
          ImprovedFile improvedFile1 = new ImprovedFile((File) null, "");
          // Undeclared exception!
          try {
            improvedFile1.copyFrom((File) improvedFile0);
            fail("Expecting exception: SecurityException");
          } catch(SecurityException e) {
            /*
             * Security manager blocks (java.io.FilePermission  write)
             * java.lang.Thread.getStackTrace(Thread.java:1479)
             * org.evosuite.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:303)
             * java.lang.SecurityManager.checkWrite(SecurityManager.java:962)
             * java.io.File.mkdir(File.java:1155)
             * java.io.File.mkdirs(File.java:1184)
             * com.lts.io.ImprovedFile.copyFromToDir(ImprovedFile.java:456)
             * com.lts.io.ImprovedFile.copyFrom(ImprovedFile.java:520)
             * com.lts.io.ImprovedFile.copyFrom(ImprovedFile.java:533)
             * sun.reflect.GeneratedMethodAccessor122.invoke(Unknown Source)
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
  public void test27()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("root should have null as its paent.");
      improvedFile0.basicMakeDirectories((File) null);
      assertEquals(false, improvedFile0.isAbsolute());
  }

  @Test
  public void test28()  throws Throwable  {
      ImprovedFile improvedFile0 = new ImprovedFile("");
      File file0 = improvedFile0.getAbsoluteFile();
      improvedFile0.basicMakeDirectories(file0);
      assertEquals("", improvedFile0.getPath());
  }

  @Test
  public void test29()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
        try {
          ImprovedFile improvedFile0 = new ImprovedFile("/kr z+:%3px0k-", "/kr z+:%3px0k-");
          // Undeclared exception!
          try {
            improvedFile0.basicMakeDirectories((File) improvedFile0);
            fail("Expecting exception: SecurityException");
          } catch(SecurityException e) {
            /*
             * Security manager blocks (java.io.FilePermission /kr z+:%3px0k- write)
             * java.lang.Thread.getStackTrace(Thread.java:1479)
             * org.evosuite.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:303)
             * java.lang.SecurityManager.checkWrite(SecurityManager.java:962)
             * java.io.File.mkdir(File.java:1155)
             * com.lts.io.ImprovedFile.basicMakeDirectories(ImprovedFile.java:631)
             * com.lts.io.ImprovedFile.basicMakeDirectories(ImprovedFile.java:622)
             * sun.reflect.GeneratedMethodAccessor137.invoke(Unknown Source)
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
}
