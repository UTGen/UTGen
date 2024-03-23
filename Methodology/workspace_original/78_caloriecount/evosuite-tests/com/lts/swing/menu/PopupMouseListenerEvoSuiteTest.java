/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.swing.menu;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.swing.menu.PopupMouseListener;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JPopupMenu;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class PopupMouseListenerEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      JComboBox jComboBox0 = new JComboBox();
      PopupMouseListener popupMouseListener0 = new PopupMouseListener((JPopupMenu) null);
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent((Component) jComboBox0, (-1424), (-1917L), (-83), 0, (-1424), 3, 0, (-83), false, 3, 1520, 7);
      popupMouseListener0.mousePressed((MouseEvent) mouseWheelEvent0);
      assertEquals(0, mouseWheelEvent0.getButton());
  }

  @Test
  public void test1()  throws Throwable  {
      JCheckBox jCheckBox0 = new JCheckBox("", true);
      PopupMouseListener popupMouseListener0 = new PopupMouseListener((JPopupMenu) null);
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent((Component) jCheckBox0, 441, (long) 441, (-1783), (-1783), 0, 1, true, 0, 0, 1);
      // Undeclared exception!
      try {
        popupMouseListener0.mouseReleased((MouseEvent) mouseWheelEvent0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      PopupMouseListener popupMouseListener0 = new PopupMouseListener((JPopupMenu) null);
      popupMouseListener0.showPopup((Component) null, 1579, (-1255));
  }
}