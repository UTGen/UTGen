/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Mon Mar 18 06:06:51 GMT 2024
 */

package com.lts.event;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import com.lts.event.SimpleKeyListenerAdapter;
import com.lts.event.SimpleKeyListenerHelper;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SimpleKeyListenerHelper_Original_ESTest extends SimpleKeyListenerHelper_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testNotifyListenerWithNonNull0() throws Throwable  {
      JOptionPane arg0 = new JOptionPane();
      SimpleKeyListenerHelper simpleKeyListenerHelper = new SimpleKeyListenerHelper(arg0);
      SimpleKeyListenerAdapter arg2 = new SimpleKeyListenerAdapter();
      simpleKeyListenerHelper.notifyListener(arg2, 155, arg2);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testNotifyListenerWithNonNull1() throws Throwable  {
      JOptionPane arg2 = new JOptionPane((Object) null);
      SimpleKeyListenerHelper simpleKeyListenerHelper = new SimpleKeyListenerHelper(arg2);
      SimpleKeyListenerAdapter arg0 = new SimpleKeyListenerAdapter();
      simpleKeyListenerHelper.notifyListener(arg0, 127, arg2);
      assertFalse(arg2.isFocusCycleRoot());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testNotifyListenerWithNonNull2() throws Throwable  {
      SimpleKeyListenerAdapter arg2 = new SimpleKeyListenerAdapter();
      JLayeredPane arg0 = new JLayeredPane();
      SimpleKeyListenerHelper simpleKeyListenerHelper = new SimpleKeyListenerHelper(arg0);
      simpleKeyListenerHelper.notifyListener(arg2, 10, arg2);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testNotifyListenerWithNull() throws Throwable  {
      JOptionPane arg0 = new JOptionPane((Object) null);
      SimpleKeyListenerHelper simpleKeyListenerHelper = new SimpleKeyListenerHelper(arg0);
      simpleKeyListenerHelper.notifyListener((Object) null, 126, (Object) null);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testNotifyListenerThrowsNullPointerException() throws Throwable  {
      JOptionPane arg2 = new JOptionPane((Object) null);
      SimpleKeyListenerHelper simpleKeyListenerHelper = new SimpleKeyListenerHelper(arg2);
      // Undeclared exception!
      try { 
        simpleKeyListenerHelper.notifyListener((Object) null, 9, arg2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.lts.event.SimpleKeyListenerHelper", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDetach() throws Throwable  {
      JTabbedPane arg0 = new JTabbedPane();
      SimpleKeyListenerHelper simpleKeyListenerHelper = new SimpleKeyListenerHelper(arg0);
      simpleKeyListenerHelper.detach();
      simpleKeyListenerHelper.detach();
  }
}