/*
 * This file was automatically generated by EvoSuite
 */

package de.outstare.fortbattleplayer.gui;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import de.outstare.fortbattleplayer.gui.SelectAllOnFocus;
import java.awt.Component;
import java.awt.event.FocusEvent;
import javax.swing.JPasswordField;
import javax.swing.text.JTextComponent;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class SelectAllOnFocusEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      JPasswordField jPasswordField0 = new JPasswordField((String) null);
      SelectAllOnFocus selectAllOnFocus0 = new SelectAllOnFocus((JTextComponent) jPasswordField0);
      FocusEvent focusEvent0 = new FocusEvent((Component) jPasswordField0, 272);
      selectAllOnFocus0.focusGained(focusEvent0);
      assertEquals("unknown type,permanent,opposite=null", focusEvent0.paramString());
  }
}
