/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.swing.keyboard;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.swing.keyboard.InputKey;
import com.lts.swing.keyboard.KeyStrokeAction;
import javax.swing.JComponent;
import javax.swing.JMenuBar;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class KeyStrokeActionEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      JMenuBar jMenuBar0 = new JMenuBar();
      InputKey inputKey0 = InputKey.Delete;
      KeyStrokeAction.mapInputKey(inputKey0, (KeyStrokeAction) null, (JComponent) jMenuBar0);
      assertEquals(true, jMenuBar0.isForegroundSet());
  }

  @Test
  public void test1()  throws Throwable  {
      JMenuBar jMenuBar0 = new JMenuBar();
      InputKey inputKey0 = InputKey.Delete;
      KeyStrokeAction.mapDefaultKey(inputKey0, (KeyStrokeAction) null, (JComponent) jMenuBar0);
      assertEquals(0, jMenuBar0.getMenuCount());
  }
}
