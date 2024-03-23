/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Wed Mar 20 20:28:30 GMT 2024
 */

package net.sourceforge.squirrel_sql.fw.gui;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import javax.swing.JInternalFrame;
import net.sourceforge.squirrel_sql.fw.gui.CascadeInternalFramePositioner;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CascadeInternalFramePositioner_Original_ESTest extends CascadeInternalFramePositioner_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testPositionInternalFrameWithJInternalFrameWhereGetFocusTraversalKeysEnabledIsTrue() throws Throwable  {
      JInternalFrame arg0 = new JInternalFrame();
      arg0.setIcon(true);
      CascadeInternalFramePositioner cascadeInternalFramePositioner = new CascadeInternalFramePositioner();
      cascadeInternalFramePositioner.positionInternalFrame(arg0);
      assertFalse(arg0.getIgnoreRepaint());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testPositionInternalFrameWithJInternalFrameWhereGetIgnoreRepaintIsFalse() throws Throwable  {
      CascadeInternalFramePositioner cascadeInternalFramePositioner = new CascadeInternalFramePositioner();
      JInternalFrame arg0 = new JInternalFrame();
      arg0.setTitle("w5");
      JInternalFrame jInternalFrame = new JInternalFrame("", false, false, true, false);
      jInternalFrame.setContentPane(arg0);
      cascadeInternalFramePositioner.positionInternalFrame(arg0);
      assertFalse(arg0.isFocusTraversalPolicyProvider());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testPositionInternalFrameWithJInternalFrameWhereIsFocusTraversalPolicyProviderIsFalse() throws Throwable  {
      CascadeInternalFramePositioner cascadeInternalFramePositioner = new CascadeInternalFramePositioner();
      JInternalFrame arg0 = new JInternalFrame();
      JInternalFrame jInternalFrame = new JInternalFrame("", false, false, true, false);
      jInternalFrame.setContentPane(arg0);
      cascadeInternalFramePositioner.positionInternalFrame(arg0);
      assertFalse(arg0.getIgnoreRepaint());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testPositionInternalFrameWithJInternalFrameWhereIsFocusTraversalPolicySetIsTrue() throws Throwable  {
      CascadeInternalFramePositioner cascadeInternalFramePositioner = new CascadeInternalFramePositioner();
      JInternalFrame arg0 = new JInternalFrame();
      arg0.dispose();
      cascadeInternalFramePositioner.positionInternalFrame(arg0);
      assertTrue(arg0.isFocusTraversalPolicySet());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testPositionInternalFrameThrowsIllegalArgumentException() throws Throwable  {
      CascadeInternalFramePositioner cascadeInternalFramePositioner = new CascadeInternalFramePositioner();
      // Undeclared exception!
      try { 
        cascadeInternalFramePositioner.positionInternalFrame((JInternalFrame) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null JInternalFrame passed
         //
         verifyException("net.sourceforge.squirrel_sql.fw.gui.CascadeInternalFramePositioner", e);
      }
  }
}