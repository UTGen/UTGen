/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Thu Mar 21 11:32:31 GMT 2024
 */

package src;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import src.VassalRebellion;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class VassalRebellion_Original_ESTest extends VassalRebellion_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testPerformThrowsNoClassDefFoundError() throws Throwable  {
      VassalRebellion vassalRebellion = new VassalRebellion();
      ArrayList<Object> arg0 = new ArrayList<Object>();
      arg0.add((Object) null);
      // Undeclared exception!
      try { 
        vassalRebellion.perform(arg0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class src.Map
         //
         verifyException("src.VassalRebellion", e);
      }
  }
}
