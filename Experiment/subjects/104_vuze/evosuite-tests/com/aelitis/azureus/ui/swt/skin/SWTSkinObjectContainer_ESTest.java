/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Sun Mar 17 20:56:58 GMT 2024
 */

package com.aelitis.azureus.ui.swt.skin;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import com.aelitis.azureus.ui.swt.skin.SWTSkin;
import com.aelitis.azureus.ui.swt.skin.SWTSkinObject;
import com.aelitis.azureus.ui.swt.skin.SWTSkinObjectContainer;
import com.aelitis.azureus.ui.swt.skin.SWTSkinPropertiesImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SWTSkinObjectContainer_ESTest extends SWTSkinObjectContainer_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFailsToCreateSWTSkinObjectContainerTaking5ArgumentsThrowsNullPointerException() throws Throwable  {
      // Test that a null skin is not allowed to be passed to the constructor.
      SWTSkinPropertiesImpl arg1 = new SWTSkinPropertiesImpl();
      SWTSkinObjectContainer sWTSkinObjectContainer = null;
      try {
      // Create a new instance of the SWTSkinObjectContainer class using the constructor that takes a skin and a properties object as arguments.
      // The skin is set to null, which should result in an exception being thrown.
      sWTSkinObjectContainer = new SWTSkinObjectContainer(null, arg1, "com/aelitis/azureus/ui/skin/", "com/aelitis/azureus/ui/skin/", (SWTSkinObject) null);
      
      // Verify that an exception is thrown as expected.
      fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      // The exception message should be empty or null, since the skin was set to null in the constructor.
      verifyException("com.aelitis.azureus.ui.swt.skin.SWTSkinObjectContainer", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFailsToCreateSWTSkinObjectContainerTaking6ArgumentsThrowsNullPointerException() throws Throwable  {
      // Tests that the constructor throws a NullPointerException when passed a null skin parameter
      String[] arg4 = new String[5];
      SWTSkinPropertiesImpl arg1 = new SWTSkinPropertiesImpl();
      SWTSkinObjectContainer sWTSkinObjectContainer = null;
      try {
      sWTSkinObjectContainer = new SWTSkinObjectContainer(null, arg1, "PiecesView.DistributionView.SeedAvl", "", arg4, (SWTSkinObject) null);
      fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      // Verify that the exception is the expected type and has no message
      verifyException("com.aelitis.azureus.ui.swt.skin.SWTSkinObjectContainer", e);}
  }
}
