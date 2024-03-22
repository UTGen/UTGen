/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Wed Mar 20 11:40:36 GMT 2024
 */

package org.scribe.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.scribe.model.Verifier;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Verifier_Original_ESTest extends Verifier_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetValueReturningEmptyString() throws Throwable  {
      Verifier verifier = new Verifier("");
      String value = verifier.getValue();
      assertEquals("", value);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetValueReturningNonEmptyString() throws Throwable  {
      Verifier verifier = new Verifier("?z`C'R:$@?jbPm)M");
      String value = verifier.getValue();
      assertEquals("?z`C'R:$@?jbPm)M", value);
  }
}
