/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Thu Mar 21 00:11:36 GMT 2024
 */

package httpanalyzer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import httpanalyzer.HttpAnalyzerApp;
import httpanalyzer.HttpAnalyzerView;
import java.awt.HeadlessException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class HttpAnalyzerView_Original_ESTest extends HttpAnalyzerView_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFailsToCreateHttpAnalyzerViewThrowsHeadlessException() throws Throwable  {
      HttpAnalyzerApp arg0 = HttpAnalyzerApp.getApplication();
      HttpAnalyzerView httpAnalyzerView = null;
      try {
        httpAnalyzerView = new HttpAnalyzerView(arg0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
      }
  }
}
