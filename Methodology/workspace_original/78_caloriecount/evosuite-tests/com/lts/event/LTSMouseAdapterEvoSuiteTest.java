/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.event;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.event.LTSMouseAdapter;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import javax.swing.Box;
import javax.swing.Icon;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JToggleButton;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class LTSMouseAdapterEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      LTSMouseAdapter lTSMouseAdapter0 = new LTSMouseAdapter();
      JRadioButtonMenuItem jRadioButtonMenuItem0 = new JRadioButtonMenuItem();
      MouseEvent mouseEvent0 = new MouseEvent((Component) jRadioButtonMenuItem0, (-1), 1L, (-1), (-1), (-1), 937, false);
      lTSMouseAdapter0.mousePressed(mouseEvent0);
      assertEquals(-1, mouseEvent0.getX());
  }

  @Test
  public void test1()  throws Throwable  {
      LTSMouseAdapter lTSMouseAdapter0 = new LTSMouseAdapter();
      // Undeclared exception!
      try {
        lTSMouseAdapter0.mouseReleased((MouseEvent) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      LTSMouseAdapter lTSMouseAdapter0 = new LTSMouseAdapter();
      lTSMouseAdapter0.setPopupMenu((JPopupMenu) null);
  }

  @Test
  public void test3()  throws Throwable  {
      LTSMouseAdapter lTSMouseAdapter0 = new LTSMouseAdapter();
      JToggleButton jToggleButton0 = new JToggleButton((Icon) null, false);
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent((Component) jToggleButton0, 534, (long) 534, 534, 534, 534, (-1), false, (-1), 534, 534);
      lTSMouseAdapter0.mouseClicked((MouseEvent) mouseWheelEvent0);
      assertEquals(false, mouseWheelEvent0.isConsumed());
  }

  @Test
  public void test4()  throws Throwable  {
      LTSMouseAdapter lTSMouseAdapter0 = new LTSMouseAdapter();
      JToggleButton jToggleButton0 = new JToggleButton((Icon) null, false);
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent((Component) jToggleButton0, 534, (long) 534, 534, 16, 534, 16, false, 534, 534, 16);
      lTSMouseAdapter0.mouseClicked((MouseEvent) mouseWheelEvent0);
      assertEquals("unknown type,(16,534),absolute(0,0),button=0,modifiers=Meta+Ctrl+Button1+Button3,extModifiers=Alt,clickCount=16,scrollType=unknown scroll type,scrollAmount=534,wheelRotation=16", mouseWheelEvent0.paramString());
  }

  @Test
  public void test5()  throws Throwable  {
      LTSMouseAdapter lTSMouseAdapter0 = new LTSMouseAdapter();
      JPopupMenu jPopupMenu0 = lTSMouseAdapter0.getPopupMenu();
      assertNull(jPopupMenu0);
  }

  @Test
  public void test6()  throws Throwable  {
      LTSMouseAdapter lTSMouseAdapter0 = new LTSMouseAdapter();
      MouseEvent mouseEvent0 = lTSMouseAdapter0.getEvent();
      assertNull(mouseEvent0);
  }

  @Test
  public void test7()  throws Throwable  {
      LTSMouseAdapter lTSMouseAdapter0 = new LTSMouseAdapter();
      Box box0 = Box.createVerticalBox();
      MouseEvent mouseEvent0 = new MouseEvent((Component) box0, 10, (long) 10, 10, 0, (-635), 12, true, 0);
      lTSMouseAdapter0.mousePressed(mouseEvent0);
      assertEquals(0, mouseEvent0.getYOnScreen());
  }

  @Test
  public void test8()  throws Throwable  {
      LTSMouseAdapter lTSMouseAdapter0 = new LTSMouseAdapter();
      Box box0 = Box.createVerticalBox();
      MouseEvent mouseEvent0 = new MouseEvent((Component) box0, 10, (long) 10, 10, 0, (-635), 12, true, 0);
      lTSMouseAdapter0.mouseClicked(mouseEvent0);
      assertEquals(0, mouseEvent0.getButton());
  }
}
