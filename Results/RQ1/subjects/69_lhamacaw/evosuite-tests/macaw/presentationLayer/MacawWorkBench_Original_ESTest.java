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
public class MacawWorkBench_Original_ESTest extends MacawWorkBench_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testMainWithEmptyArray() throws Throwable  {
      String[] arg0 = new String[0];
      MacawWorkBench.main(arg0);
      assertEquals(0, arg0.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testMainWithNonEmptyArray() throws Throwable  {
      String[] arg0 = new String[2];
      arg0[0] = "-production";
      arg0[1] = "-production";
      MacawWorkBench.main(arg0);
      assertEquals(2, arg0.length);
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
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }
}
