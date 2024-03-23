/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.event;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.event.SimpleKeyListenerHelper;
import java.awt.Component;
import java.awt.event.KeyEvent;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JToolBar;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class SimpleKeyListenerHelperEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      JButton jButton0 = new JButton((Icon) null);
      SimpleKeyListenerHelper simpleKeyListenerHelper0 = new SimpleKeyListenerHelper((Component) jButton0);
      KeyEvent keyEvent0 = new KeyEvent((Component) jButton0, 0, (long) 0, 0, 0, 'D');
      simpleKeyListenerHelper0.keyTyped(keyEvent0);
      assertEquals("unknown type,keyCode=0,keyText=Unknown keyCode: 0x0,keyChar='D',keyLocation=KEY_LOCATION_UNKNOWN,rawCode=0,primaryLevelUnicode=0,scancode=0", keyEvent0.paramString());
  }

  @Test
  public void test1()  throws Throwable  {
      JToolBar jToolBar0 = new JToolBar();
      SimpleKeyListenerHelper simpleKeyListenerHelper0 = new SimpleKeyListenerHelper((Component) jToolBar0);
      KeyEvent keyEvent0 = new KeyEvent((Component) jToolBar0, 383, (long) 383, 383, 383, 'b');
      simpleKeyListenerHelper0.keyReleased(keyEvent0);
      assertEquals(383, keyEvent0.getKeyCode());
  }

  @Test
  public void test2()  throws Throwable  {
      JCheckBoxMenuItem jCheckBoxMenuItem0 = new JCheckBoxMenuItem(", was not recognized.", false);
      SimpleKeyListenerHelper simpleKeyListenerHelper0 = new SimpleKeyListenerHelper((Component) jCheckBoxMenuItem0);
      simpleKeyListenerHelper0.detach();
      simpleKeyListenerHelper0.detach();
  }

  @Test
  public void test3()  throws Throwable  {
      JCheckBoxMenuItem jCheckBoxMenuItem0 = new JCheckBoxMenuItem(", was not recognized.", false);
      SimpleKeyListenerHelper simpleKeyListenerHelper0 = new SimpleKeyListenerHelper((Component) jCheckBoxMenuItem0);
      // Undeclared exception!
      try {
        simpleKeyListenerHelper0.notifyListener((Object) null, 155, (Object) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test4()  throws Throwable  {
      JToolBar jToolBar0 = new JToolBar();
      SimpleKeyListenerHelper simpleKeyListenerHelper0 = new SimpleKeyListenerHelper((Component) jToolBar0);
      simpleKeyListenerHelper0.addListener((Object) null);
      KeyEvent keyEvent0 = new KeyEvent((Component) jToolBar0, (-611), (long) 2, (-611), 10, '\u0080');
      // Undeclared exception!
      try {
        simpleKeyListenerHelper0.keyPressed(keyEvent0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test5()  throws Throwable  {
      JToolBar jToolBar0 = new JToolBar();
      SimpleKeyListenerHelper simpleKeyListenerHelper0 = new SimpleKeyListenerHelper((Component) jToolBar0);
      simpleKeyListenerHelper0.addListener((Object) null);
      simpleKeyListenerHelper0.fire((int) '\u0080');
  }

  @Test
  public void test6()  throws Throwable  {
      JToolBar jToolBar0 = new JToolBar();
      SimpleKeyListenerHelper simpleKeyListenerHelper0 = new SimpleKeyListenerHelper((Component) jToolBar0);
      KeyEvent keyEvent0 = new KeyEvent((Component) jToolBar0, (int) '\u0080', (long) (-611), 2, (int) '\u0080', '\u0080', 1);
      simpleKeyListenerHelper0.keyPressed(keyEvent0);
      assertEquals(128, keyEvent0.getID());
  }
}
