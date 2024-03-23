/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.swing.table.dragndrop.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.swing.table.dragndrop.test.ExportDoneCalled;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ExportDoneCalledEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      StringSelection stringSelection0 = new StringSelection("Emm,\"rs)9o^'V7M}");
      ExportDoneCalled exportDoneCalled0 = new ExportDoneCalled((Transferable) stringSelection0, 2);
      // Undeclared exception!
      try {
        exportDoneCalled0.appendSubclassToString((StringBuffer) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}