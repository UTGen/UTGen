/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Thu Mar 21 04:58:04 GMT 2024
 */

package com.gotoservers.ftp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import com.gotoservers.ftp.FtpApplet;
import java.awt.HeadlessException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FtpApplet_ESTest extends FtpApplet_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFailsToCreateFtpAppletThrowsHeadlessException() throws Throwable  {
      FtpApplet ftpApplet = null;
      try {
      ftpApplet = new FtpApplet();
      fail("Expecting exception: HeadlessException");
      } catch (HeadlessException e) {
      // given: the test is being run in headless mode
      // when: the applet is created
      // then: an exception should be thrown because the applet cannot function without a display
      verifyException("java.applet.Applet", e);}
  }
}
