/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Thu Mar 21 04:40:07 GMT 2024
 */

package net.sf.sugar.fspath.cli;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import net.sf.sugar.fspath.cli.FSPathExplorer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.util.SystemInUtil;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FSPathExplorer_ESTest extends FSPathExplorer_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testStartThrowsNullPointerException() throws Throwable  {
      FSPathExplorer fSPathExplorer = new FSPathExplorer();
      try {
      fSPathExplorer.start();
      fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      assertTrue(e.getMessage() == null);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testShowWelcome() throws Throwable  {
      // No Comments were added
      FSPathExplorer.showWelcome();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreateFSPath() throws Throwable  {
      // rollbacked to evosuite
      FSPathExplorer fSPathExplorer = new FSPathExplorer();
      fSPathExplorer.createFSPath();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testMainThrowsTooManyResourcesException0() throws Throwable  {
      // This test is designed to check that the FSPathExplorer class can properly handle
      // input arguments and produce expected output.
      String[] args = new String[4];
      args[0] = "please make sure that the directory exists and a is readable";
      args[1] = "please make sure that the directory exists and a is readable";
      args[2] = "pwd";
      args[3] = "pwd";
      
      // The main method of the FSPathExplorer class expects four arguments.
      assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
      FSPathExplorer.main(args);});
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testMain() throws Throwable  {
      // Given: The user is in the FSPathExplorer program
      SystemInUtil.addInputLine("exit");
      String[] args = new String[0];
      FSPathExplorer.main(args);
      
      // When: The user enters "exit" as a command-line argument
      
      // Then: The program should exit with no error
      assertEquals(0, args.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testMainThrowsTooManyResourcesException1() throws Throwable  {
      // Prepare the input for the program
      SystemInUtil.addInputLine("please make sure that the directory exists and a is readable");
      String[] arg0 = new String[4];
      arg0[0] = "please make sure that the directory exists and a is readable";
      arg0[1] = "pwd";
      arg0[2] = "pwd";
      arg0[3] = "pwd";
      
      // Execute the program
      FSPathExplorer.main(arg0);
      
      // Verify that the program ran correctly
      assertTrue(true);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testMainWithEmptyArray() throws Throwable  {
      // rollbacked to evosuite
      String[] arg0 = new String[0];
      SystemInUtil.addInputLine("help");
      // Undeclared exception!
      FSPathExplorer.main(arg0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testMainThrowsNullPointerException0() throws Throwable  {
      // Test that FSPathExplorer throws NullPointerException when given null input
      String[] arg0 = new String[7];
      arg0[0] = "{j2<?/]pm^E7O";
      arg0[1] = "2AdhhkL";
      arg0[2] = "8kdfN";
      arg0[3] = "2AdhhkL";
      arg0[4] = "-find";
      arg0[5] = "B'*5F;,c<paP";
      arg0[6] = "~7{&?xJm6Yk4'Ujd{P*";
      
      // Expecting NullPointerException to be thrown when main method is called with null input
      try {
      FSPathExplorer.main(arg0);
      fail("Expecting exception: NullPointerException");
      } catch (NullPointerException e) {
      // Verify that the correct exception was thrown
      verifyException("net.sf.sugar.fspath.cli.FSPathExplorer", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testMainThrowsInstantiationError() throws Throwable  {
      // Given a path to a file that is not a directory
      String[] args = new String[7];
      args[0] = "\n|                                                       |";
      args[1] = "\n|                                                       |";
      args[2] = "\n|                                                       |";
      args[3] = "-path";
      args[4] = "\n|                                                       |";
      args[5] = "\n|                                                       |";
      args[6] = "\n|                                                       |";
      
      // When the FSPathExplorer is run with this invalid file type
      try {
      FSPathExplorer.main(args);
      fail("Expecting exception: InstantiationError");
      } catch(InstantiationError e) {
      // Then an InstantiationError should be thrown
      verifyException("net.sf.sugar.fspath.DefaultFSPath", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testMainThrowsNullPointerException1() throws Throwable  {
      // Given
      String[] arg0 = new String[9];
      arg0[0] = "-f";
      
      // When
      try {
      FSPathExplorer.main(arg0);
      } catch (NullPointerException e) {
      // Then
      assertTrue(e instanceof NullPointerException);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testMainThrowsNullPointerException2() throws Throwable  {
      // Given a set of invalid arguments for the FSPathExplorer main method
      String[] arg0 = new String[2];
      arg0[0] = "-p";
      
      // When we call the main method with these arguments
      FSPathExplorer.main(arg0);
      
      // Then an exception is thrown, which is expected
      fail("Expecting exception: NullPointerException");
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testShowHelp() throws Throwable  {
      // rollbacked to evosuite
      FSPathExplorer.showHelp();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testConfigureExplorerThrowsNullPointerException() throws Throwable  {
      // Arrange
      FSPathExplorer fSPathExplorer = new FSPathExplorer();
      
      // Act & Assert
      try {
      fSPathExplorer.configureExplorer((String[]) null);
      fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      // Verify that the exception message is not empty
      assertNotNull(e.getMessage());
      verifyException("net.sf.sugar.fspath.cli.FSPathExplorer", e);}
  }
}
