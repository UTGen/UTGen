/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Wed Mar 20 22:55:08 GMT 2024
 */

package net.sourceforge.jwbf.mediawiki.actions.editing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import net.sourceforge.jwbf.mediawiki.actions.editing.MovePage;
import net.sourceforge.jwbf.mediawiki.bots.MediaWikiBot;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MovePage_Original_ESTest extends MovePage_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFailsToCreateMovePageThrowsNullPointerException() throws Throwable  {
      MovePage movePage = null;
      try {
        movePage = new MovePage((MediaWikiBot) null, "!&!0Ndp\b#K8", "!&!0Ndp\b#K8", "!&!0Ndp\b#K8", true, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.jwbf.mediawiki.actions.editing.MovePage", e);
      }
  }
}
