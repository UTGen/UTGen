/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.event;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.swing.ListPanel;
import java.awt.Component;
import java.awt.event.KeyEvent;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ReturnKeyListenerEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ListPanel listPanel0 = new ListPanel();
      ListPanel.ListReturnKeyListener listPanel_ListReturnKeyListener0 = listPanel0.new ListReturnKeyListener();
      KeyEvent keyEvent0 = new KeyEvent((Component) listPanel0, 1172, (long) 1172, 1172, 1172, 'i');
      listPanel_ListReturnKeyListener0.keyTyped(keyEvent0);
      assertEquals(1152, keyEvent0.getModifiersEx());
  }
}
