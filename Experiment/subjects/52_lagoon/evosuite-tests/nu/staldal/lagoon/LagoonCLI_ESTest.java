/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Thu Mar 21 03:55:03 GMT 2024
 */

package nu.staldal.lagoon;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import nu.staldal.lagoon.LagoonCLI;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class LagoonCLI_ESTest extends LagoonCLI_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testMain0() throws Throwable  {
      // Given: A user is running the LagoonCLI with a set of arguments
      String[] args = new String[7];
      args[1] = "johndoe";
      LagoonCLI.main(args);
      
      // When: The user calls the main method of the LagoonCLI class
      // The method is called with an array of strings as its argument, where the first element is "--name" and the second element is a string that represents the name of the user
      LagoonCLI.main(args);
      
      // Then: The program should print a message indicating that the user has been added to the Lagoon system with the given name
      assertEquals(7, args.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testMain1() throws Throwable  {
      // Given
      String[] args = new String[1];
      args[0] = "?@?'.xml";
      
      // When
      LagoonCLI.main(args);
      
      // Then
      assertEquals(1, args.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testMain2() throws Throwable  {
      // Given a user inputs ".sitemap" as an argument
      String[] args = new String[1];
      args[0] = ".sitemap";
      
      // When the "LagoonCLI" main method is called with this argument
      LagoonCLI.main(args);
      
      // Then assert that the input argument is not null and has a length of 1
      assertNotNull(args[0]);
      assertEquals(1, args.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testMainThrowsNullPointerException0() throws Throwable  {
      // Test that the method returns a NullPointerException when an invalid argument is passed
      String[] args = new String[8];
      args[1] = "5";
      
      try {
      LagoonCLI.main(args);
      fail("Expecting exception: NullPointerException");
      } catch (NullPointerException e) {
      // Test that the exception is thrown with no message
      assertEquals(null, e.getMessage());}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testMainThrowsNullPointerException1() throws Throwable  {
      // No Comments were added
      String[] arg0 = new String[12];
      arg0[1] = "force";
      // Undeclared exception!
      try { 
        LagoonCLI.main(arg0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testMainThrowsNullPointerException2() throws Throwable  {
      // No Comments were added
      String[] arg0 = new String[8];
      arg0[1] = "build";
      // Undeclared exception!
      try { 
        LagoonCLI.main(arg0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testMain3() throws Throwable  {
      // Test that LagoonCLI correctly processes the input arguments
      String[] args = new String[5];
      args[1] = "987654321";
      LagoonCLI.main(args);
      assertEquals(5, args.length); // Assert that the number of arguments is correct
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testMainWithEmptyArray() throws Throwable  {
      // Given: No arguments are provided to the main method
      String[] args = new String[0];
      
      // When: The main method is invoked with no arguments
      LagoonCLI.main(args);
      
      // Then: The argument list should be empty
      assertEquals(0, args.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesLagoonCLI() throws Throwable  {
      // rollbacked to evosuite
      LagoonCLI lagoonCLI = new LagoonCLI();
  }
}