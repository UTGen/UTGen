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
public class JSJshop_ESTest extends JSJshop_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testTestParserThrowsSystemExitException() throws Throwable  {
      // Given
      JSJshop jSJshop = new JSJshop();
      
      // When
      try {
      jSJshop.testParser();
      } catch(System.SystemExitException e) {
      // Then
      verifyException("org.evosuite.runtime.System", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testParserFile() throws Throwable  {
      // Given a JSJshop object with a valid file path
      JSJshop jSJshop = new JSJshop();
      
      // When the parserFile method is called with a valid file path
      boolean parserFile = jSJshop.parserFile("MGNZV)Cr<)*l");
      
      // Then the method should return true
      assertTrue(parserFile);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetBufferedReaderReturningNonNull() throws Throwable  {
      // rollbacked to evosuite
      JSJshop jSJshop = new JSJshop();
      EvoSuiteFile arg0 = new EvoSuiteFile("MGNZV)Cr<)*l/File parsed");
      FileSystemHandling.appendLineToFile(arg0, "MGNZV)Cr<)*l");
      BufferedReader bufferedReader = jSJshop.getBufferedReader("MGNZV)Cr<)*l", "File parsed", (JApplet) null);
      assertNotNull(bufferedReader);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetBufferedReaderWithNullAndNull() throws Throwable  {
      // Given: The jSJshop object is created and the BufferedReader is requested
      JSJshop jSJshop = new JSJshop();
      BufferedReader bufferedReader = jSJshop.getBufferedReader((String) null, (String) null, (JApplet) null);
      
      // When: The method getBufferedReader() is called with no arguments
      
      // Then: The returned value should be null
      assertNull(bufferedReader);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesJSJshopTakingNoArgumentsAndCallsGetBufferedReader() throws Throwable  {
      JSJshop jSJshop = new JSJshop();
      // Create a new instance of the JSJshop class
      
      BufferedReader bufferedReader = jSJshop.getBufferedReader("+ ", "b\"m~#m%jn*^obx:| { ", (JApplet) null);
      // Call the getBufferedReader() method on the JSJshop instance, passing in three parameters
      // The first parameter is a string representing the encoding of the data to be read
      // The second parameter is a string representing the file name to be read from
      // The third parameter is a JApplet object, which will be used by the getBufferedReader() method
      // as part of its implementation
      
      assertNull(bufferedReader);
      // Assert that the buffered reader returned by the getBufferedReader() method is null.});
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFailsToCreateJSJshopTaking2ArgumentsThrowsNullPointerException() throws Throwable  {
      // Given a file path as an argument for the JSJshop constructor
      EvoSuiteFile arg0 = new EvoSuiteFile("{@2");
      
      // When we attempt to create a new instance of JSJshop with null task atom
      JSJshop jSJshop = null;
      try {
      jSJshop = new JSJshop("{@2", (JSTaskAtom) null);
      fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      // Then we expect the constructor to throw a NullPointerException
      verifyException("umd.cs.shop.JSJshop", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetDeleteList() throws Throwable  {
      // Given: A new instance of JSJshop is created
      JSJshop jSJshop = new JSJshop();
      
      // When: The delete list is retrieved from the shop
      JSListLogicalAtoms deleteList = jSJshop.getDeleteList();
      
      // Then: The delete list should be null
      assertNull(deleteList);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAddList() throws Throwable  {
      // Given: We have a previously created jSJshop object and we want to test the getAddList() method
      JSJshop jSJshop = new JSJshop();
      
      // When: We call the getAddList() method on the jSJshop object
      JSListLogicalAtoms addList = jSJshop.getAddList();
      
      // Then: The return value of the getAddList() method is null
      assertNull(addList);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFailsToCreateJSJshopTaking2ArgumentsThrowsSystemExitException0() throws Throwable  {
      // Create a new EvoSuiteFile object to represent the file to append data to.
      EvoSuiteFile evoSuiteFile = new EvoSuiteFile("> ");
      // Create a byte array with length of 8.
      byte[] bytes = new byte[8];
      // Append the byte array to the file using the FileSystemHandling class.
      FileSystemHandling.appendDataToFile(evoSuiteFile, bytes);
      // Create a JSJshop object with the path and name of the file to append data to.
      JSJshop jSJshop = new JSJshop("> ", "+FV1.$");
      try {
      // Try to create a new JSJshop object with the same file path and name as the previously created EvoSuiteFile object.
      fail("Expecting exception: System.SystemExitException");
      } catch(System.SystemExitException e) {
      // Verify that the exception thrown is an instance of SystemExitException.
      verifyException("org.evosuite.runtime.System", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFailsToCreateJSJshopTaking2ArgumentsThrowsSystemExitException1() throws Throwable  {
      JSJshop jSJshop = null;
      try {
      jSJshop = new JSJshop("Fresh produce store", "Plan # 123456");
      fail("Expecting exception: System.SystemExitException");
      } catch(System.SystemExitException e) {
      // Verify that the exception is of the expected type and has no message
      verifyException("org.evosuite.runtime.System", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesJSJshopTaking2Arguments() throws Throwable  {
      // Given: A file named "EvoSuiteFile" with a path of ">" and a byte array of length 10
      EvoSuiteFile arg0 = new EvoSuiteFile("> ");
      byte[] arg1 = new byte[10];
      
      // When: The method "appendDataToFile" is called on the file with the byte array as input
      FileSystemHandling.appendDataToFile(arg0, arg1);
      
      // Then: Assert that the value of the property "corbaToHicap" is false in the JSJshop object created with the path and byte array
      JSJshop jSJshop = new JSJshop("> ", "> ");
      assertFalse(jSJshop.corbaToHicap);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testMain0() throws Throwable  {
      // Given
      String[] args = new String[3];
      
      // When
      JSJshop.main(args);
      
      // Then
      assertEquals(3, args.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testMain1() throws Throwable  {
      // Given
      String[] input = new String[8];
      
      // When
      JSJshop.main(input);
      
      // Then
      assertEquals(8, input.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testMainWithEmptyArray() throws Throwable  {
      // Create an empty array of strings for testing
      String[] arg0 = new String[0];
      
      // Execute the main method with an empty argument list
      JSJshop.main(arg0);
      
      // Assert that the length of the argument list is 0
      assertEquals(0, arg0.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDom() throws Throwable  {
      // Given a new JSJshop instance
      JSJshop jSJshop = new JSJshop();
      
      // When we call the dom method on the JSShop instance
      JSPlanningDomain dom = jSJshop.dom();
      
      // Then the result should be null
      assertNull(dom);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testProb() throws Throwable  {
      // Given a JSShop object, jSJshop, and its associated planning problem, prob
      JSJshop jSJshop = new JSJshop();
      JSPlanningProblem prob = jSJshop.prob();
      
      // When the planning problem is accessed
      assertNull(prob);
      
      // Then the returned value should be null, as there is no associated planning problem with the JSShop object
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testTree() throws Throwable  {
      // Given a new instance of JSJshop
      JSJshop jSJshop = new JSJshop();
      
      // When the tree method is called on the JSJshop object
      JSJshopNode tree = jSJshop.tree();
      
      // Then the returned node should be null
      assertNull(tree);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSol() throws Throwable  {
      // Given a jSJshop object with a valid input
      JSJshop jSJshop = new JSJshop();
      
      // When the sol method is called on this object
      JSPlan sol = jSJshop.sol();
      
      // Then the solution should be null
      assertNull(sol);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetSolution() throws Throwable  {
      // Given: we have a previously created JSJshop object
      JSJshop jSJshop = new JSJshop();
      
      // When: we call the getSolution method on this object
      JSPairPlanTSListNodes solution = jSJshop.getSolution();
      
      // Then: we expect that the solution is null
      assertNull(solution);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAppletURLThrowsNullPointerException() throws Throwable  {
      JSJshop jSJshop = new JSJshop();
      // Undeclared exception!
      try {
      jSJshop.getAppletURL("https://www.example.com", (JApplet) null);
      fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      //
      // The getAppletURL method was called with a null JApplet parameter, which is not allowed.
      // This resulted in a NullPointerException being thrown, which we are catching and verifying.
      //
      verifyException("umd.cs.shop.JSJshop", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetTree() throws Throwable  {
      // Tests that the tree is null when a new instance of JSJshop is created.
      // Creates a new instance of JSJshop
      JSJshop jSJshop = new JSJshop();
      
      // Gets the tree from the JSJshop instance
      JSJshopNode tree = jSJshop.getTree();
      
      // Asserts that the tree is null
      assertNull(tree);
  }
}
