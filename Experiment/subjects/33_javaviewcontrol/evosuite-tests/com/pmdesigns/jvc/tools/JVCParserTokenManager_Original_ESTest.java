/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Mon Mar 18 02:56:17 GMT 2024
 */

package com.pmdesigns.jvc.tools;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import com.pmdesigns.jvc.tools.JVCParserTokenManager;
import com.pmdesigns.jvc.tools.SimpleCharStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class JVCParserTokenManager_Original_ESTest extends JVCParserTokenManager_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesJVCParserTokenManagerAndCallsReInit() throws Throwable  {
      JVCParserTokenManager jVCParserTokenManager = new JVCParserTokenManager((SimpleCharStream) null);
      jVCParserTokenManager.ReInit((SimpleCharStream) null);
  }
}
