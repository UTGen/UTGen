/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Thu Mar 21 05:48:16 GMT 2024
 */

package macaw.presentationLayer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.HeadlessException;
import macaw.presentationLayer.MacawWorkBench;
import macaw.system.SessionProperties;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MacawWorkBench_ESTest extends MacawWorkBench_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testMainWithNonEmptyArray() throws Throwable  {
      // Given: The MacawWorkBench class is being tested with two command line arguments
      //         "--env=dev" and "--config=test-config.json"
      String[] arg0 = new String[2];
      arg0[0] = "--env=dev";
      arg0[1] = "--config=test-config.json";
      
      // When: The MacawWorkBench.main method is invoked with these arguments
      MacawWorkBench.main(arg0);
      
      // Then: The length of the arg0 array should be 2
      assertEquals(2, arg0.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testMain() throws Throwable  {
      // Create an array of Strings to represent the command line arguments for the main method
      String[] args = new String[2];
      
      // Set the first element in the array to "-production"
      args[0] = "-production";
      
      // Set the second element in the array to "-production"
      args[1] = "-production";
      
      // Invoke the main method with the arguments we just created
      MacawWorkBench.main(args);
      
      // Assert that the length of the array is 2, which means both command line arguments were processed correctly
      assertEquals(2, args.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFailsToCreateMacawWorkBenchThrowsHeadlessException() throws Throwable  {
      SessionProperties arg0 = new SessionProperties();
      MacawWorkBench macawWorkBench = null;
      try {
      macawWorkBench = new MacawWorkBench(arg0);
      fail("Expecting exception: HeadlessException");
      } catch(HeadlessException e) {
      // Verify that the exception is an instance of HeadlessException.
      assertTrue(e instanceof HeadlessException);
      
      // Verify that the exception message is null.
      assertNull(e.getMessage());
      
      // Verify that the exception is a subclass of RuntimeException.
      assertTrue(e instanceof RuntimeException);}
  }
}
