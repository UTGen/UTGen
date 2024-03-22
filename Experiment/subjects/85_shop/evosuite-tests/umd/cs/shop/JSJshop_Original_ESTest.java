/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Mon Mar 18 08:04:31 GMT 2024
 */

package umd.cs.shop;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedReader;
import javax.swing.JApplet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import umd.cs.shop.JSJshop;
import umd.cs.shop.JSJshopNode;
import umd.cs.shop.JSListLogicalAtoms;
import umd.cs.shop.JSPairPlanTSListNodes;
import umd.cs.shop.JSPlan;
import umd.cs.shop.JSPlanningDomain;
import umd.cs.shop.JSPlanningProblem;
import umd.cs.shop.JSTaskAtom;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class JSJshop_Original_ESTest extends JSJshop_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testTestParserThrowsSystemExitException() throws Throwable  {
      JSJshop jSJshop = new JSJshop();
      // Undeclared exception!
      try { 
        jSJshop.testParser();
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testParserFile() throws Throwable  {
      JSJshop jSJshop = new JSJshop();
      boolean parserFile = jSJshop.parserFile("MGNZV)Cr<)*l");
      assertFalse(parserFile);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetBufferedReaderReturningNonNull() throws Throwable  {
      JSJshop jSJshop = new JSJshop();
      EvoSuiteFile arg0 = new EvoSuiteFile("MGNZV)Cr<)*l/File parsed");
      FileSystemHandling.appendLineToFile(arg0, "MGNZV)Cr<)*l");
      BufferedReader bufferedReader = jSJshop.getBufferedReader("MGNZV)Cr<)*l", "File parsed", (JApplet) null);
      assertNotNull(bufferedReader);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetBufferedReaderWithNullAndNull() throws Throwable  {
      JSJshop jSJshop = new JSJshop();
      BufferedReader bufferedReader = jSJshop.getBufferedReader((String) null, (String) null, (JApplet) null);
      assertNull(bufferedReader);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesJSJshopTakingNoArgumentsAndCallsGetBufferedReader() throws Throwable  {
      JSJshop jSJshop = new JSJshop();
      BufferedReader bufferedReader = jSJshop.getBufferedReader("+ ", "b\"m~#m%jn*^obx:| { ", (JApplet) null);
      assertNull(bufferedReader);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFailsToCreateJSJshopTaking2ArgumentsThrowsNullPointerException() throws Throwable  {
      EvoSuiteFile arg0 = new EvoSuiteFile("{@2");
      FileSystemHandling.appendStringToFile(arg0, "N]P97IwC#=/0Z]h[4");
      JSJshop jSJshop = null;
      try {
        jSJshop = new JSJshop("{@2", (JSTaskAtom) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSJshop", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetDeleteList() throws Throwable  {
      JSJshop jSJshop = new JSJshop();
      JSListLogicalAtoms deleteList = jSJshop.getDeleteList();
      assertNull(deleteList);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAddList() throws Throwable  {
      JSJshop jSJshop = new JSJshop();
      JSListLogicalAtoms addList = jSJshop.getAddList();
      assertNull(addList);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFailsToCreateJSJshopTaking2ArgumentsThrowsSystemExitException0() throws Throwable  {
      EvoSuiteFile arg0 = new EvoSuiteFile("> ");
      byte[] arg1 = new byte[8];
      FileSystemHandling.appendDataToFile(arg0, arg1);
      JSJshop jSJshop = null;
      try {
        jSJshop = new JSJshop("> ", "+FV1.$");
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFailsToCreateJSJshopTaking2ArgumentsThrowsSystemExitException1() throws Throwable  {
      JSJshop jSJshop = null;
      try {
        jSJshop = new JSJshop("", "Plan # ");
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesJSJshopTaking2Arguments() throws Throwable  {
      EvoSuiteFile arg0 = new EvoSuiteFile("> ");
      byte[] arg1 = new byte[10];
      FileSystemHandling.appendDataToFile(arg0, arg1);
      JSJshop jSJshop = new JSJshop("> ", "> ");
      assertFalse(JSJshop.corbaToHicap);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testMain0() throws Throwable  {
      String[] arg0 = new String[8];
      JSJshop.main(arg0);
      assertEquals(8, arg0.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testMain1() throws Throwable  {
      String[] arg0 = new String[3];
      JSJshop.main(arg0);
      assertEquals(3, arg0.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testMainWithEmptyArray() throws Throwable  {
      String[] arg0 = new String[0];
      JSJshop.main(arg0);
      assertEquals(0, arg0.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDom() throws Throwable  {
      JSJshop jSJshop = new JSJshop();
      JSPlanningDomain dom = jSJshop.dom();
      assertNull(dom);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testProb() throws Throwable  {
      JSJshop jSJshop = new JSJshop();
      JSPlanningProblem prob = jSJshop.prob();
      assertNull(prob);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testTree() throws Throwable  {
      JSJshop jSJshop = new JSJshop();
      JSJshopNode tree = jSJshop.tree();
      assertNull(tree);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSol() throws Throwable  {
      JSJshop jSJshop = new JSJshop();
      JSPlan sol = jSJshop.sol();
      assertNull(sol);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetSolution() throws Throwable  {
      JSJshop jSJshop = new JSJshop();
      JSPairPlanTSListNodes solution = jSJshop.getSolution();
      assertNull(solution);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAppletURLThrowsNullPointerException() throws Throwable  {
      JSJshop jSJshop = new JSJshop();
      // Undeclared exception!
      try { 
        jSJshop.getAppletURL("YN{", (JApplet) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSJshop", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetTree() throws Throwable  {
      JSJshop jSJshop = new JSJshop();
      JSJshopNode tree = jSJshop.getTree();
      assertNull(tree);
  }
}
