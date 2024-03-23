/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.application;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.application.DeleteFileCallback;
import com.lts.io.ImprovedFile;
import java.io.File;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class DeleteFileCallbackEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DeleteFileCallback deleteFileCallback0 = new DeleteFileCallback();
      ImprovedFile improvedFile0 = new ImprovedFile("&HnJfrhRPwB$", "&HnJfrhRPwB$");
      deleteFileCallback0.addFile((File) improvedFile0);
      deleteFileCallback0.addFile((File) improvedFile0);
      assertEquals(false, improvedFile0.isHidden());
  }

  @Test
  public void test1()  throws Throwable  {
      DeleteFileCallback deleteFileCallback0 = new DeleteFileCallback();
      deleteFileCallback0.addFile((File) null);
  }

  @Test
  public void test2()  throws Throwable  {
      DeleteFileCallback deleteFileCallback0 = new DeleteFileCallback();
      ImprovedFile improvedFile0 = new ImprovedFile("&HnJfrhRPwB$", "&HnJfrhRPwB$");
      File file0 = improvedFile0.getAbsoluteFile();
      deleteFileCallback0.addFile(file0);
      assertEquals(false, file0.isFile());
  }

  @Test
  public void test3()  throws Throwable  {
      DeleteFileCallback deleteFileCallback0 = new DeleteFileCallback();
      File file0 = new File("lvI_d1KS", "lvI_d1KS");
      boolean boolean0 = deleteFileCallback0.removeFile(file0);
      assertEquals(false, boolean0);
  }

  @Test
  public void test4()  throws Throwable  {
      DeleteFileCallback deleteFileCallback0 = new DeleteFileCallback();
      boolean boolean0 = deleteFileCallback0.removeFile((File) null);
      assertEquals(false, boolean0);
  }

  @Test
  public void test5()  throws Throwable  {
      DeleteFileCallback deleteFileCallback0 = new DeleteFileCallback();
      ImprovedFile improvedFile0 = new ImprovedFile("Q1p?^D2nyAYgC`5VE4");
      deleteFileCallback0.addFile((File) improvedFile0);
      boolean boolean0 = deleteFileCallback0.removeFile((File) improvedFile0);
      assertEquals(true, boolean0);
  }

  @Test
  public void test6()  throws Throwable  {
      DeleteFileCallback deleteFileCallback0 = new DeleteFileCallback();
      ImprovedFile improvedFile0 = new ImprovedFile("Q1p?^D2nyAYgC`5VE4");
      deleteFileCallback0.addFile((File) improvedFile0);
      // Undeclared exception!
      try {
        deleteFileCallback0.callback((Object) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test7()  throws Throwable  {
      DeleteFileCallback deleteFileCallback0 = new DeleteFileCallback();
      deleteFileCallback0.callback((Object) "");
  }
}