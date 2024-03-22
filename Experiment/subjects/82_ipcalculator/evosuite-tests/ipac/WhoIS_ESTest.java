/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Thu Mar 21 08:45:48 GMT 2024
 */

package ipac;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import ipac.WhoIS;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class WhoIS_ESTest extends WhoIS_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesWhoISAndCallsReset() throws Throwable  {
      // Given a WhoIS object with default settings
      WhoIS whoIs = new WhoIS();
      
      // When the ignore repaint option is set to false
      whoIs.reset();
      assertFalse(whoIs.getIgnoreRepaint());
  }
}
