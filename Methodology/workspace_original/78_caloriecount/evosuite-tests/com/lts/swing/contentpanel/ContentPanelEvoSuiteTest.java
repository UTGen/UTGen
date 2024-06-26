/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.swing.contentpanel;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.LTSException;
import com.lts.Suspender;
import com.lts.event.Callback;
import com.lts.exception.NotImplementedException;
import com.lts.swing.LTSPanel;
import com.lts.swing.TextContentPanel;
import com.lts.swing.contentpanel.CPMouseListener;
import java.awt.Component;
import java.awt.Container;
import java.awt.HeadlessException;
import java.awt.Insets;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.util.Map;
import javax.swing.JRadioButton;
import javax.swing.table.DefaultTableModel;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ContentPanelEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel("Ntn,Rc", 3, "Ntn,Rc");
      assertNotNull(textContentPanel0);
      
      LTSPanel lTSPanel0 = textContentPanel0.createControlPanel(3);
      assertEquals(3, textContentPanel0.getBottomPanelMode());
      assertNotNull(lTSPanel0);
      assertEquals("Ntn,Rc", textContentPanel0.getHeadingString());
      assertEquals("Ntn,Rc", textContentPanel0.getWindowTitle());
  }

  @Test
  public void test1()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel("", 0, "");
      assertNotNull(textContentPanel0);
      
      // Undeclared exception!
      try {
        textContentPanel0.noButtonPressed();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel("", 0, "");
      assertNotNull(textContentPanel0);
      
      textContentPanel0.doubleClick((Object) "application/x-java-serialized-object");
      assertEquals(0, textContentPanel0.getBottomPanelMode());
      assertEquals(false, textContentPanel0.exitOnClose());
      assertEquals("", textContentPanel0.getWindowTitle());
      assertEquals("", textContentPanel0.getHeadingString());
  }

  @Test
  public void test3()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel("B`vnB|],Z.5v,_cWSA", 0, "B`vnB|],Z.5v,_cWSA");
      assertNotNull(textContentPanel0);
      
      String[][] stringArray0 = new String[3][8];
      textContentPanel0.setMenuSpec(stringArray0);
      assertEquals("B`vnB|],Z.5v,_cWSA", textContentPanel0.getHeadingString());
      assertEquals(0, textContentPanel0.getBottomPanelMode());
      assertEquals("B`vnB|],Z.5v,_cWSA", textContentPanel0.getWindowTitle());
      assertEquals(false, textContentPanel0.exitOnClose());
  }

  @Test
  public void test4()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel("MRu7u,#|&{", (-806), "");
      assertNotNull(textContentPanel0);
      
      // Undeclared exception!
      try {
        textContentPanel0.toPercentOfScreen((-1529.0175297167496));
        fail("Expecting exception: HeadlessException");
      } catch(HeadlessException e) {
      }
  }

  @Test
  public void test5()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel("", 0, "");
      assertNotNull(textContentPanel0);
      
      textContentPanel0.done();
      assertEquals("", textContentPanel0.getHeadingString());
      assertEquals(false, textContentPanel0.exitOnClose());
      assertEquals(0, textContentPanel0.getBottomPanelMode());
      assertEquals("", textContentPanel0.getWindowTitle());
  }

  @Test
  public void test6()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel("a", 1603, "e~k&\u0006E|(,");
      assertNotNull(textContentPanel0);
      
      int int0 = textContentPanel0.getResult();
      assertEquals(1603, textContentPanel0.getBottomPanelMode());
      assertEquals(0, int0);
      assertEquals("a", textContentPanel0.getHeadingString());
      assertEquals("a", textContentPanel0.getWindowTitle());
      assertEquals(false, textContentPanel0.exitOnClose());
  }

  @Test
  public void test7()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel("V-4t6Xh5.`", (-1509), "V-4t6Xh5.`");
      assertNotNull(textContentPanel0);
      
      // Undeclared exception!
      try {
        textContentPanel0.compact();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test8()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel("V-4t6Xh5.`", (-1509), "V-4t6Xh5.`");
      assertNotNull(textContentPanel0);
      
      textContentPanel0.singleClick((Object) null);
      assertEquals("V-4t6Xh5.`", textContentPanel0.getWindowTitle());
      assertEquals(false, textContentPanel0.exitOnClose());
      assertEquals(-1509, textContentPanel0.getBottomPanelMode());
      assertEquals("V-4t6Xh5.`", textContentPanel0.getHeadingString());
  }

  @Test
  public void test9()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel("a", 1603, "e~k&\u0006E|(,");
      assertNotNull(textContentPanel0);
      
      // Undeclared exception!
      try {
        textContentPanel0.initialize((Container) textContentPanel0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test10()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel("P1so]", 0, "sT0k'|AFfa(uD");
      assertNotNull(textContentPanel0);
      
      textContentPanel0.tellSuccessListeners();
      assertEquals("P1so]", textContentPanel0.getHeadingString());
      assertEquals(0, textContentPanel0.getBottomPanelMode());
      assertEquals("P1so]", textContentPanel0.getWindowTitle());
      assertEquals(false, textContentPanel0.exitOnClose());
  }

  @Test
  public void test11()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel("P1so]", 0, "sT0k'|AFfa(uD");
      assertNotNull(textContentPanel0);
      
      // Undeclared exception!
      try {
        textContentPanel0.okButtonPressed();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test12()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel("r$$FF^<Z8Ftt:j", 2, "r$$FF^<Z8Ftt:j");
      assertNotNull(textContentPanel0);
      
      // Undeclared exception!
      try {
        textContentPanel0.selectButtonPressed();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test13()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel("o<Z7p?>", (-1873), "o<Z7p?>");
      assertNotNull(textContentPanel0);
      
      // Undeclared exception!
      try {
        textContentPanel0.notImplemented();
        fail("Expecting exception: HeadlessException");
      } catch(HeadlessException e) {
      }
  }

  @Test
  public void test14()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel("", (-1870), "");
      assertNotNull(textContentPanel0);
      
      textContentPanel0.windowActivated((WindowEvent) null);
      assertEquals(false, textContentPanel0.exitOnClose());
      assertEquals("", textContentPanel0.getHeadingString());
      assertEquals(-1870, textContentPanel0.getBottomPanelMode());
      assertEquals("", textContentPanel0.getWindowTitle());
  }

  @Test
  public void test15()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel("Window must be an instance of JFrame or JDialog.  Window class: ", 469, "IpX_RG',gRoJYLc3");
      assertNotNull(textContentPanel0);
      
      // Undeclared exception!
      try {
        textContentPanel0.cancelButtonPressed();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test16()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel("I#0w9?g", 49, "I#0w9?g");
      assertNotNull(textContentPanel0);
      
      boolean boolean0 = textContentPanel0.exitOnClose();
      assertEquals("I#0w9?g", textContentPanel0.getWindowTitle());
      assertEquals(false, boolean0);
      assertEquals(49, textContentPanel0.getBottomPanelMode());
      assertEquals("I#0w9?g", textContentPanel0.getHeadingString());
  }

  @Test
  public void test17()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel("", (-1051), "");
      assertNotNull(textContentPanel0);
      
      // Undeclared exception!
      try {
        textContentPanel0.initializeWindow((Window) null);
        fail("Expecting exception: HeadlessException");
      } catch(HeadlessException e) {
      }
  }

  @Test
  public void test18()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel("Window must be an instance of JFrame or JDialog.  Window class: ", 469, "IpX_RG',gRoJYLc3");
      assertNotNull(textContentPanel0);
      
      textContentPanel0.windowIconified((WindowEvent) null);
      assertEquals(false, textContentPanel0.exitOnClose());
      assertEquals("Window must be an instance of JFrame or JDialog.  Window class: ", textContentPanel0.getHeadingString());
      assertEquals("Window must be an instance of JFrame or JDialog.  Window class: ", textContentPanel0.getWindowTitle());
      assertEquals(469, textContentPanel0.getBottomPanelMode());
  }

  @Test
  public void test19()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel("", 1, "");
      assertNotNull(textContentPanel0);
      
      String string0 = textContentPanel0.getWindowTitle();
      assertEquals("", string0);
      assertNotNull(string0);
      assertEquals("", textContentPanel0.getHeadingString());
      assertEquals(1, textContentPanel0.getBottomPanelMode());
      assertEquals(false, textContentPanel0.exitOnClose());
  }

  @Test
  public void test20()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel((String) null, 0, (String) null);
      assertNotNull(textContentPanel0);
      
      Suspender suspender0 = new Suspender((Callback) null);
      textContentPanel0.addSuccessListener((Callback) suspender0);
      assertEquals(0, textContentPanel0.getBottomPanelMode());
      assertEquals(false, textContentPanel0.exitOnClose());
  }

  @Test
  public void test21()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel("", 1, "");
      assertNotNull(textContentPanel0);
      
      textContentPanel0.initializeMenuBar();
      assertEquals(false, textContentPanel0.exitOnClose());
      assertEquals("", textContentPanel0.getHeadingString());
      assertEquals(1, textContentPanel0.getBottomPanelMode());
      assertEquals("", textContentPanel0.getWindowTitle());
  }

  @Test
  public void test22()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel("", (-90), "");
      assertNotNull(textContentPanel0);
      
      // Undeclared exception!
      try {
        textContentPanel0.waitForClose((Window) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test23()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel("", 9, "");
      assertNotNull(textContentPanel0);
      
      Object[][] objectArray0 = new Object[7][9];
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(objectArray0, objectArray0[0]);
      ActionEvent actionEvent0 = new ActionEvent((Object) defaultTableModel0, (-1569), "", (-1274));
      textContentPanel0.processActionEvent(actionEvent0);
      assertEquals(9, textContentPanel0.getBottomPanelMode());
      assertEquals("", textContentPanel0.getHeadingString());
      assertEquals("", textContentPanel0.getWindowTitle());
      assertEquals(false, textContentPanel0.exitOnClose());
  }

  @Test
  public void test24()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel("", 1, "");
      assertNotNull(textContentPanel0);
      
      textContentPanel0.setOkToClose(false);
      assertEquals("", textContentPanel0.getHeadingString());
      assertEquals(false, textContentPanel0.okToClose());
      assertEquals(1, textContentPanel0.getBottomPanelMode());
      assertEquals(false, textContentPanel0.exitOnClose());
      assertEquals("", textContentPanel0.getWindowTitle());
  }

  @Test
  public void test25()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel("OV$[w-`Zl*s4Q]Bz", (-74), "OV$[w-`Zl*s4Q]Bz");
      assertNotNull(textContentPanel0);
      
      textContentPanel0.okToClose();
      assertEquals("OV$[w-`Zl*s4Q]Bz", textContentPanel0.getHeadingString());
      assertEquals(false, textContentPanel0.exitOnClose());
      assertEquals(-74, textContentPanel0.getBottomPanelMode());
      assertEquals("OV$[w-`Zl*s4Q]Bz", textContentPanel0.getWindowTitle());
  }

  @Test
  public void test26()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel("", (-402), "");
      assertNotNull(textContentPanel0);
      
      // Undeclared exception!
      try {
        textContentPanel0.basicBuildMenuBar();
        fail("Expecting exception: NotImplementedException");
      } catch(NotImplementedException e) {
      }
  }

  @Test
  public void test27()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel("", (-90), "");
      assertNotNull(textContentPanel0);
      
      textContentPanel0.getActionListener();
      assertEquals(false, textContentPanel0.exitOnClose());
      assertEquals(-90, textContentPanel0.getBottomPanelMode());
      assertEquals("", textContentPanel0.getWindowTitle());
      assertEquals("", textContentPanel0.getHeadingString());
  }

  @Test
  public void test28()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel("B`vnB|],Z.5v,_cWSA", 0, "B`vnB|],Z.5v,_cWSA");
      assertNotNull(textContentPanel0);
      
      // Undeclared exception!
      try {
        textContentPanel0.yesButtonPressed();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test29()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel((String) null, 1, (String) null);
      assertNotNull(textContentPanel0);
      
      // Undeclared exception!
      try {
        textContentPanel0.makeOkDefaultFor((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test30()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel("r$$FF^<Z8Ftt:j", 2, "r$$FF^<Z8Ftt:j");
      assertNotNull(textContentPanel0);
      
      Suspender suspender0 = new Suspender();
      textContentPanel0.removeSuccessListener((Callback) suspender0);
      assertEquals(false, textContentPanel0.exitOnClose());
      assertEquals(2, textContentPanel0.getBottomPanelMode());
      assertEquals("r$$FF^<Z8Ftt:j", textContentPanel0.getHeadingString());
      assertEquals("r$$FF^<Z8Ftt:j", textContentPanel0.getWindowTitle());
  }

  @Test
  public void test31()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel("", 1, "");
      assertNotNull(textContentPanel0);
      
      textContentPanel0.addBottomPanel();
      assertEquals(1, textContentPanel0.getGridy());
      assertEquals(1, textContentPanel0.getComponentCount());
  }

  @Test
  public void test32()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel("I#0w9?g", 49, "I#0w9?g");
      assertNotNull(textContentPanel0);
      
      // Undeclared exception!
      try {
        textContentPanel0.closeButtonPressed();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test33()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel("", 0, "");
      assertNotNull(textContentPanel0);
      
      textContentPanel0.windowClosed((WindowEvent) null);
      assertEquals(false, textContentPanel0.exitOnClose());
      assertEquals("", textContentPanel0.getWindowTitle());
      assertEquals(0, textContentPanel0.getBottomPanelMode());
      assertEquals("", textContentPanel0.getHeadingString());
  }

  @Test
  public void test34()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel("V-4t6Xh5.`", (-1519), "V-4t6Xh5.`");
      assertNotNull(textContentPanel0);
      
      textContentPanel0.setSubHeadingString("V-4t6Xh5.`");
      textContentPanel0.addTopPanel();
      assertEquals(1, textContentPanel0.getComponentCount());
      assertEquals(-1519, textContentPanel0.getBottomPanelMode());
  }

  @Test
  public void test35()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel("P1so]", 0, "sT0k'|AFfa(uD");
      assertNotNull(textContentPanel0);
      
      textContentPanel0.unregisterPopup((Component) textContentPanel0);
      assertEquals(false, textContentPanel0.exitOnClose());
      assertEquals("P1so]", textContentPanel0.getHeadingString());
      assertEquals(0, textContentPanel0.getBottomPanelMode());
      assertEquals("P1so]", textContentPanel0.getWindowTitle());
  }

  @Test
  public void test36()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel("OV$[w-`Zl*s4Q]Bz", (-74), "OV$[w-`Zl*s4Q]Bz");
      assertNotNull(textContentPanel0);
      
      textContentPanel0.getPopup((Component) null);
      assertEquals(-74, textContentPanel0.getBottomPanelMode());
      assertEquals(false, textContentPanel0.exitOnClose());
      assertEquals("OV$[w-`Zl*s4Q]Bz", textContentPanel0.getWindowTitle());
      assertEquals("OV$[w-`Zl*s4Q]Bz", textContentPanel0.getHeadingString());
  }

  @Test
  public void test37()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel((String) null, 1, (String) null);
      assertEquals(false, textContentPanel0.exitOnClose());
      assertNotNull(textContentPanel0);
      
      textContentPanel0.setExitOnClose(true);
      assertEquals(true, textContentPanel0.exitOnClose());
      assertEquals(1, textContentPanel0.getBottomPanelMode());
  }

  @Test
  public void test38()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel("", 9, "");
      assertNotNull(textContentPanel0);
      
      textContentPanel0.addBottomPanel();
      assertEquals(1, textContentPanel0.countComponents());
      assertEquals(9, textContentPanel0.getBottomPanelMode());
  }

  @Test
  public void test39()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel("", 10, "");
      assertNotNull(textContentPanel0);
      
      LTSPanel lTSPanel0 = (LTSPanel)textContentPanel0.createBottomPanel();
      assertEquals(false, textContentPanel0.exitOnClose());
      assertEquals(10, textContentPanel0.getBottomPanelMode());
      assertNotNull(lTSPanel0);
      assertEquals(2, lTSPanel0.countComponents());
  }

  @Test
  public void test40()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel("r$$FF^<Z8Ftt:j", 2, "r$$FF^<Z8Ftt:j");
      assertNotNull(textContentPanel0);
      
      LTSPanel lTSPanel0 = textContentPanel0.createControlPanel(2);
      assertEquals(2, textContentPanel0.getBottomPanelMode());
      assertEquals("r$$FF^<Z8Ftt:j", textContentPanel0.getHeadingString());
      assertNotNull(lTSPanel0);
      assertEquals(false, textContentPanel0.exitOnClose());
      assertEquals("r$$FF^<Z8Ftt:j", textContentPanel0.getWindowTitle());
  }

  @Test
  public void test41()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel("I#0w9?g", 49, "I#0w9?g");
      assertNotNull(textContentPanel0);
      
      Insets insets0 = textContentPanel0.getDefaultInsets();
      assertNotNull(insets0);
      
      textContentPanel0.setDefaultInsets(insets0);
      assertEquals("java.awt.Insets[top=5,left=5,bottom=5,right=5]", insets0.toString());
      assertEquals(49, textContentPanel0.getBottomPanelMode());
      assertEquals("I#0w9?g", textContentPanel0.getWindowTitle());
      assertEquals("I#0w9?g", textContentPanel0.getHeadingString());
      assertEquals(false, textContentPanel0.exitOnClose());
  }

  @Test
  public void test42()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel("V-4t6Xh5.`", (-1519), "V-4t6Xh5.`");
      assertNotNull(textContentPanel0);
      
      textContentPanel0.getMouseListener();
      CPMouseListener cPMouseListener0 = textContentPanel0.getMouseListener();
      assertEquals(false, textContentPanel0.exitOnClose());
      assertEquals("V-4t6Xh5.`", textContentPanel0.getHeadingString());
      assertNotNull(cPMouseListener0);
      assertEquals(-1519, textContentPanel0.getBottomPanelMode());
      assertEquals("V-4t6Xh5.`", textContentPanel0.getWindowTitle());
  }

  @Test
  public void test43()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel("o<Z7p?>", (-1873), "o<Z7p?>");
      assertNotNull(textContentPanel0);
      
      Map<Object, Object> map0 = textContentPanel0.getComponentToPopupMap();
      assertNotNull(map0);
      
      textContentPanel0.setComponentToPopupMap(map0);
      assertEquals(-1873, textContentPanel0.getBottomPanelMode());
      assertEquals("o<Z7p?>", textContentPanel0.getHeadingString());
      assertEquals(false, textContentPanel0.exitOnClose());
      assertEquals("o<Z7p?>", textContentPanel0.getWindowTitle());
  }

  @Test
  public void test44()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel("", 0, "");
      assertNotNull(textContentPanel0);
      
      textContentPanel0.setComponentToPopupMap((Map) null);
      assertEquals("", textContentPanel0.getHeadingString());
      assertEquals(false, textContentPanel0.exitOnClose());
      assertEquals("", textContentPanel0.getWindowTitle());
      assertEquals(0, textContentPanel0.getBottomPanelMode());
  }

  @Test
  public void test45()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel("", 0, "");
      assertNotNull(textContentPanel0);
      
      textContentPanel0.addBottomPanel();
      assertEquals(false, textContentPanel0.exitOnClose());
      assertEquals(0, textContentPanel0.getBottomPanelMode());
      assertEquals("", textContentPanel0.getHeadingString());
      assertEquals("", textContentPanel0.getWindowTitle());
      assertEquals(0, textContentPanel0.getGridy());
  }

  @Test
  public void test46()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel("", (-212), "");
      assertNotNull(textContentPanel0);
      
      // Undeclared exception!
      try {
        textContentPanel0.createControlPanel((-212));
        fail("Expecting exception: RuntimeException");
      } catch(RuntimeException e) {
        /*
         * Unrecognized code: -212
         */
      }
  }

  @Test
  public void test47()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel("/@OJj\"nU", 14, "/@OJj\"nU");
      assertNotNull(textContentPanel0);
      
      // Undeclared exception!
      try {
        textContentPanel0.makeContentFor((Window) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test48()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel("", 1659, "");
      assertNotNull(textContentPanel0);
      
      JRadioButton jRadioButton0 = new JRadioButton();
      // Undeclared exception!
      try {
        textContentPanel0.initializeWindow((Container) jRadioButton0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
      }
  }

  @Test
  public void test49()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel((String) null, 0, (String) null);
      assertNotNull(textContentPanel0);
      
      textContentPanel0.addTopPanel();
      assertEquals(0, textContentPanel0.getBottomPanelMode());
      assertEquals(0, textContentPanel0.countComponents());
      assertEquals(false, textContentPanel0.exitOnClose());
  }

  @Test
  public void test50()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel("V-4t6Xh5.`", (-1519), "V-4t6Xh5.`");
      assertNotNull(textContentPanel0);
      
      textContentPanel0.addTopPanel();
      // Undeclared exception!
      try {
        textContentPanel0.compact();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test51()  throws Throwable  {
      TextContentPanel textContentPanel0 = new TextContentPanel("", (-402), "");
      assertNotNull(textContentPanel0);
      
      textContentPanel0.centerWindow();
      assertEquals(-402, textContentPanel0.getBottomPanelMode());
      assertEquals("", textContentPanel0.getHeadingString());
      assertEquals("", textContentPanel0.getWindowTitle());
      assertEquals(false, textContentPanel0.exitOnClose());
  }
}
