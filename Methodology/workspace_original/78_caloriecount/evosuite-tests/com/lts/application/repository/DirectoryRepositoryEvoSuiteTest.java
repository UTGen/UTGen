/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.application.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.application.ApplicationException;
import com.lts.application.data.ApplicationData;
import com.lts.application.data.coll.ADCAdaptor;
import com.lts.application.repository.DirectoryRepository;
import com.lts.io.ImprovedFile;
import java.io.File;
import java.util.List;
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
public class DirectoryRepositoryEvoSuiteTest {

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
      File file0 = new File("");
      DirectoryRepository directoryRepository0 = new DirectoryRepository(file0, file0);
      try {
        directoryRepository0.commitAs(file0);
        fail("Expecting exception: ApplicationException");
      } catch(ApplicationException e) {
        /*
         * rename/move failed
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      File file0 = new File("YD!oX:G*");
      DirectoryRepository directoryRepository0 = new DirectoryRepository(file0, file0);
      try {
        directoryRepository0.rollback();
        fail("Expecting exception: ApplicationException");
      } catch(ApplicationException e) {
        /*
         * Caught exception while trying to roll back repository
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      File file0 = new File("The drec|ory,f", "The drec|ory,f");
      DirectoryRepository directoryRepository0 = new DirectoryRepository(file0, file0);
      List<String> list0 = directoryRepository0.listEntries("The drec|ory,f");
      assertEquals(0, list0.size());
  }

  @Test
  public void test3()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
        try {
          File file0 = new File("");
          DirectoryRepository directoryRepository0 = new DirectoryRepository(file0, file0);
          // Undeclared exception!
          try {
            directoryRepository0.storeAsXml("", "");
            fail("Expecting exception: SecurityException");
          } catch(SecurityException e) {
            /*
             * Security manager blocks (java.io.FilePermission / write)
             * java.lang.Thread.getStackTrace(Thread.java:1479)
             * org.evosuite.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:303)
             * java.lang.SecurityManager.checkWrite(SecurityManager.java:962)
             * java.io.FileOutputStream.<init>(FileOutputStream.java:183)
             * com.lts.application.repository.DirectoryRepository.getOutputStream(DirectoryRepository.java:280)
             * com.lts.application.repository.DirectoryRepository.getXmlOutputStream(DirectoryRepository.java:224)
             * com.lts.application.repository.DirectoryRepository.storeAsXml(DirectoryRepository.java:170)
             * sun.reflect.GeneratedMethodAccessor118.invoke(Unknown Source)
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
  public void test4()  throws Throwable  {
      File file0 = new File("gnXk");
      DirectoryRepository directoryRepository0 = new DirectoryRepository(file0, file0);
      boolean boolean0 = directoryRepository0.repositoryUsesDirectories();
      assertEquals(true, boolean0);
  }

  @Test
  public void test5()  throws Throwable  {
      File file0 = new File("f}prY#]eT0");
      DirectoryRepository directoryRepository0 = new DirectoryRepository(file0, file0);
      ImprovedFile improvedFile0 = (ImprovedFile)directoryRepository0.getRepositoryFile();
      assertEquals(0L, improvedFile0.lastModified());
  }

  @Test
  public void test6()  throws Throwable  {
      File file0 = new File("The drec|ory,f", "The drec|ory,f");
      DirectoryRepository directoryRepository0 = new DirectoryRepository(file0, file0);
      directoryRepository0.delete();
      assertEquals(false, directoryRepository0.getTempRepository());
  }

  @Test
  public void test7()  throws Throwable  {
      File file0 = new File("");
      DirectoryRepository directoryRepository0 = new DirectoryRepository(file0, file0);
      directoryRepository0.close();
      assertEquals(false, directoryRepository0.isTempRepository());
  }

  @Test
  public void test8()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
        try {
          File file0 = new File("", "");
          DirectoryRepository directoryRepository0 = new DirectoryRepository(file0, file0);
          // Undeclared exception!
          try {
            directoryRepository0.close();
            fail("Expecting exception: SecurityException");
          } catch(SecurityException e) {
            /*
             * Security manager blocks (java.io.FilePermission /proc/checkpoint/ctrl delete)
             * java.lang.Thread.getStackTrace(Thread.java:1479)
             * org.evosuite.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:303)
             * java.lang.SecurityManager.checkDelete(SecurityManager.java:990)
             * java.io.File.delete(File.java:902)
             * com.lts.io.ImprovedFile.rmdir(ImprovedFile.java:360)
             * com.lts.io.ImprovedFile.rmdir(ImprovedFile.java:359)
             * com.lts.io.ImprovedFile.rmdir(ImprovedFile.java:359)
             * com.lts.io.ImprovedFile.deleteDirectory(ImprovedFile.java:384)
             * com.lts.io.ImprovedFile.deleteDirectory(ImprovedFile.java:410)
             * com.lts.io.ImprovedFile.deleteAll(ImprovedFile.java:402)
             * com.lts.application.repository.DirectoryRepository.close(DirectoryRepository.java:62)
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
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }

  @Test
  public void test9()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
        try {
          File file0 = new File("", "");
          DirectoryRepository directoryRepository0 = new DirectoryRepository(file0, file0);
          // Undeclared exception!
          try {
            directoryRepository0.commit();
            fail("Expecting exception: SecurityException");
          } catch(SecurityException e) {
            /*
             * Security manager blocks (java.io.FilePermission / write)
             * java.lang.Thread.getStackTrace(Thread.java:1479)
             * org.evosuite.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:303)
             * java.lang.SecurityManager.checkWrite(SecurityManager.java:962)
             * java.io.File.renameTo(File.java:1225)
             * com.lts.io.ImprovedFile.move(ImprovedFile.java:674)
             * com.lts.application.repository.DirectoryRepository.commit(DirectoryRepository.java:83)
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
  public void test10()  throws Throwable  {
      File file0 = new File("");
      DirectoryRepository directoryRepository0 = new DirectoryRepository(file0, file0);
      ApplicationData applicationData0 = directoryRepository0.getApplicationData();
      assertNull(applicationData0);
  }

  @Test
  public void test11()  throws Throwable  {
      File file0 = new File("The drec|ory,f", "The drec|ory,f");
      DirectoryRepository directoryRepository0 = new DirectoryRepository(file0, file0);
      Object object0 = directoryRepository0.loadXml("The drec|ory,f");
      assertNull(object0);
  }

  @Test
  public void test12()  throws Throwable  {
      File file0 = new File("");
      DirectoryRepository directoryRepository0 = new DirectoryRepository(file0, file0);
      try {
        directoryRepository0.loadXml("");
        fail("Expecting exception: ApplicationException");
      } catch(ApplicationException e) {
        /*
         * Could not find /, [0] java.io.FileNotFoundException: / (Is a directory)
         */
      }
  }

  @Test
  public void test13()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
        try {
          File file0 = new File("");
          DirectoryRepository directoryRepository0 = new DirectoryRepository(file0, file0);
          // Undeclared exception!
          try {
            directoryRepository0.removeEntry("");
            fail("Expecting exception: SecurityException");
          } catch(SecurityException e) {
            /*
             * Security manager blocks (java.io.FilePermission /proc/checkpoint/ctrl delete)
             * java.lang.Thread.getStackTrace(Thread.java:1479)
             * org.evosuite.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:303)
             * java.lang.SecurityManager.checkDelete(SecurityManager.java:990)
             * java.io.File.delete(File.java:902)
             * com.lts.io.ImprovedFile.rmdir(ImprovedFile.java:360)
             * com.lts.io.ImprovedFile.rmdir(ImprovedFile.java:359)
             * com.lts.io.ImprovedFile.rmdir(ImprovedFile.java:359)
             * com.lts.io.ImprovedFile.deleteDirectory(ImprovedFile.java:384)
             * com.lts.io.ImprovedFile.deleteDirectory(ImprovedFile.java:410)
             * com.lts.io.ImprovedFile.deleteAll(ImprovedFile.java:402)
             * com.lts.application.repository.DirectoryRepository.removeEntry(DirectoryRepository.java:304)
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
  public void test14()  throws Throwable  {
      File file0 = new File("The drec|ory,f", "The drec|ory,f");
      DirectoryRepository directoryRepository0 = new DirectoryRepository(file0, file0);
      boolean boolean0 = directoryRepository0.removeEntry("The drec|ory,f");
      assertEquals(true, boolean0);
  }

  @Test
  public void test15()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
        try {
          File file0 = new File("Wold QoT reate directory ", "Wold QoT reate directory ");
          DirectoryRepository directoryRepository0 = new DirectoryRepository(file0, file0);
          ADCAdaptor aDCAdaptor0 = new ADCAdaptor();
          // Undeclared exception!
          try {
            directoryRepository0.storeApplicationData((ApplicationData) aDCAdaptor0);
            fail("Expecting exception: SecurityException");
          } catch(SecurityException e) {
            /*
             * Security manager blocks (java.io.FilePermission Wold QoT reate directory /Wold QoT reate directory /data.xml write)
             * java.lang.Thread.getStackTrace(Thread.java:1479)
             * org.evosuite.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:303)
             * java.lang.SecurityManager.checkWrite(SecurityManager.java:962)
             * java.io.FileOutputStream.<init>(FileOutputStream.java:183)
             * com.lts.application.repository.DirectoryRepository.getOutputStream(DirectoryRepository.java:280)
             * com.lts.application.repository.DirectoryRepository.storeApplicationData(DirectoryRepository.java:345)
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
}
