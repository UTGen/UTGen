/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.xmlser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.LTSException;
import com.lts.xmlser.XmlObjectOutputStream;
import java.io.CharArrayWriter;
import java.io.File;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.OutputStream;
import java.io.PipedOutputStream;
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
public class XmlObjectOutputStreamEvoSuiteTest {

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
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      XmlObjectOutputStream xmlObjectOutputStream0 = new XmlObjectOutputStream((Writer) charArrayWriter0);
      xmlObjectOutputStream0.write(649L);
      assertEquals(61, charArrayWriter0.size());
      assertEquals("<xml-serialized>\n<java.lang.Long id=\"0\">649</java.lang.Long>\n", charArrayWriter0.toString());
  }

  @Test
  public void test1()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      XmlObjectOutputStream xmlObjectOutputStream0 = new XmlObjectOutputStream((OutputStream) pipedOutputStream0);
      xmlObjectOutputStream0.write((short) (-854));
  }

  @Test
  public void test2()  throws Throwable  {
      XmlObjectOutputStream xmlObjectOutputStream0 = new XmlObjectOutputStream();
      // Undeclared exception!
      try {
        xmlObjectOutputStream0.writeObject((Object) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
        try {
          XmlObjectOutputStream xmlObjectOutputStream0 = null;
          try {
            xmlObjectOutputStream0 = new XmlObjectOutputStream(", was missing in tag ");
            fail("Expecting exception: SecurityException");
          } catch(SecurityException e) {
            /*
             * Security manager blocks (java.io.FilePermission , was missing in tag  write)
             * java.lang.Thread.getStackTrace(Thread.java:1479)
             * org.evosuite.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:303)
             * java.lang.SecurityManager.checkWrite(SecurityManager.java:962)
             * java.io.FileOutputStream.<init>(FileOutputStream.java:183)
             * java.io.FileOutputStream.<init>(FileOutputStream.java:84)
             * java.io.FileWriter.<init>(FileWriter.java:46)
             * com.lts.xmlser.XmlObjectOutputStream.initialize(XmlObjectOutputStream.java:70)
             * com.lts.xmlser.XmlObjectOutputStream.<init>(XmlObjectOutputStream.java:57)
             * sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
             * sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:39)
             * sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:27)
             * java.lang.reflect.Constructor.newInstance(Constructor.java:513)
             * org.evosuite.testcase.ConstructorStatement$1.execute(ConstructorStatement.java:226)
             * org.evosuite.testcase.AbstractStatement.exceptionHandler(AbstractStatement.java:142)
             * org.evosuite.testcase.ConstructorStatement.execute(ConstructorStatement.java:188)
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
  public void test4()  throws Throwable  {
      XmlObjectOutputStream xmlObjectOutputStream0 = new XmlObjectOutputStream();
      // Undeclared exception!
      try {
        xmlObjectOutputStream0.write((byte)0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test5()  throws Throwable  {
      XmlObjectOutputStream xmlObjectOutputStream0 = new XmlObjectOutputStream();
      // Undeclared exception!
      try {
        xmlObjectOutputStream0.write((double) 401.44638F);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test6()  throws Throwable  {
      XmlObjectOutputStream xmlObjectOutputStream0 = new XmlObjectOutputStream();
      // Undeclared exception!
      try {
        xmlObjectOutputStream0.write(22);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test7()  throws Throwable  {
      XmlObjectOutputStream xmlObjectOutputStream0 = new XmlObjectOutputStream();
      // Undeclared exception!
      try {
        xmlObjectOutputStream0.write((Object) "");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test8()  throws Throwable  {
      XmlObjectOutputStream xmlObjectOutputStream0 = new XmlObjectOutputStream();
      // Undeclared exception!
      try {
        xmlObjectOutputStream0.write(')');
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test9()  throws Throwable  {
      XmlObjectOutputStream xmlObjectOutputStream0 = new XmlObjectOutputStream();
      // Undeclared exception!
      try {
        xmlObjectOutputStream0.write(true);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test10()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
        try {
          File file0 = new File("sk;Orpu2gn{$SV", "sk;Orpu2gn{$SV");
          XmlObjectOutputStream xmlObjectOutputStream0 = null;
          try {
            xmlObjectOutputStream0 = new XmlObjectOutputStream(file0);
            fail("Expecting exception: SecurityException");
          } catch(SecurityException e) {
            /*
             * Security manager blocks (java.io.FilePermission sk;Orpu2gn{$SV/sk;Orpu2gn{$SV write)
             * java.lang.Thread.getStackTrace(Thread.java:1479)
             * org.evosuite.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:303)
             * java.lang.SecurityManager.checkWrite(SecurityManager.java:962)
             * java.io.FileOutputStream.<init>(FileOutputStream.java:183)
             * java.io.FileOutputStream.<init>(FileOutputStream.java:145)
             * java.io.FileWriter.<init>(FileWriter.java:73)
             * com.lts.xmlser.XmlObjectOutputStream.initialize(XmlObjectOutputStream.java:97)
             * com.lts.xmlser.XmlObjectOutputStream.<init>(XmlObjectOutputStream.java:63)
             * sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
             * sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:39)
             * sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:27)
             * java.lang.reflect.Constructor.newInstance(Constructor.java:513)
             * org.evosuite.testcase.ConstructorStatement$1.execute(ConstructorStatement.java:226)
             * org.evosuite.testcase.AbstractStatement.exceptionHandler(AbstractStatement.java:142)
             * org.evosuite.testcase.ConstructorStatement.execute(ConstructorStatement.java:188)
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
      XmlObjectOutputStream xmlObjectOutputStream0 = new XmlObjectOutputStream();
      // Undeclared exception!
      try {
        xmlObjectOutputStream0.write(401.44638F);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test12()  throws Throwable  {
      XmlObjectOutputStream xmlObjectOutputStream0 = new XmlObjectOutputStream();
      xmlObjectOutputStream0.close();
  }

  @Test
  public void test13()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      XmlObjectOutputStream xmlObjectOutputStream0 = new XmlObjectOutputStream((OutputStream) pipedOutputStream0);
      xmlObjectOutputStream0.close();
  }
}
