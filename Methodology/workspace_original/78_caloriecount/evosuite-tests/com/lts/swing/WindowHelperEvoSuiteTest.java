/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.swing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.LTSException;
import com.lts.swing.LTSPanel;
import com.lts.swing.SimpleGridBagConstraint;
import com.lts.swing.SwingWindow;
import com.lts.swing.WindowHelper;
import java.awt.Color;
import java.awt.Component;
import java.awt.HeadlessException;
import java.awt.event.FocusListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.beans.PropertyChangeListener;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.plaf.basic.BasicLabelUI;
import javax.swing.plaf.metal.MetalComboBoxEditor;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import org.jdesktop.swingx.color.EyeDropperColorChooserPanel;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class WindowHelperEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      WindowHelper windowHelper0 = new WindowHelper((SwingWindow) null);
      WindowHelper.StandardRKL windowHelper_StandardRKL0 = windowHelper0.new StandardRKL();
      windowHelper_StandardRKL0.performAction((Object) "notify-field-accept");
      assertEquals(false, windowHelper0.exitOnClose());
      assertEquals(true, windowHelper0.promptBeforeExit());
  }

  @Test
  public void test1()  throws Throwable  {
      WindowHelper windowHelper0 = new WindowHelper((SwingWindow) null);
      // Undeclared exception!
      try {
        windowHelper0.location();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      WindowHelper windowHelper0 = new WindowHelper((SwingWindow) null);
      // Undeclared exception!
      try {
        windowHelper0.repaint(0L, 13, 13, 13, (-9));
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      WindowHelper windowHelper0 = new WindowHelper((SwingWindow) null);
      // Undeclared exception!
      try {
        windowHelper0.getContainerListeners();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test4()  throws Throwable  {
      WindowHelper windowHelper0 = new WindowHelper((SwingWindow) null);
      // Undeclared exception!
      try {
        windowHelper0.windowCloseRequest();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test5()  throws Throwable  {
      WindowHelper windowHelper0 = new WindowHelper((SwingWindow) null);
      windowHelper0.doubleClick((Object) "showsRootHandles");
      assertEquals(true, windowHelper0.promptBeforeExit());
      assertEquals(false, windowHelper0.exitOnClose());
  }

  @Test
  public void test6()  throws Throwable  {
      WindowHelper windowHelper0 = new WindowHelper((SwingWindow) null);
      // Undeclared exception!
      try {
        windowHelper0.isResizable();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test7()  throws Throwable  {
      WindowHelper windowHelper0 = new WindowHelper((SwingWindow) null);
      // Undeclared exception!
      try {
        windowHelper0.getKeyListeners();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test8()  throws Throwable  {
      WindowHelper windowHelper0 = new WindowHelper((SwingWindow) null);
      // Undeclared exception!
      try {
        windowHelper0.setResizable(false);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test9()  throws Throwable  {
      WindowHelper windowHelper0 = new WindowHelper((SwingWindow) null);
      JPanel jPanel0 = windowHelper0.createBottomPanel(0);
      assertEquals(false, windowHelper0.exitOnClose());
      assertNotNull(jPanel0);
      assertEquals(true, windowHelper0.promptBeforeExit());
      assertEquals(1, jPanel0.countComponents());
  }

  @Test
  public void test10()  throws Throwable  {
      WindowHelper windowHelper0 = new WindowHelper((SwingWindow) null);
      // Undeclared exception!
      try {
        windowHelper0.removeNotify();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test11()  throws Throwable  {
      WindowHelper windowHelper0 = new WindowHelper((SwingWindow) null);
      // Undeclared exception!
      try {
        windowHelper0.getLocationOnScreen();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test12()  throws Throwable  {
      WindowHelper windowHelper0 = new WindowHelper((SwingWindow) null);
      // Undeclared exception!
      try {
        windowHelper0.resizeTo(716);
        fail("Expecting exception: HeadlessException");
      } catch(HeadlessException e) {
      }
  }

  @Test
  public void test13()  throws Throwable  {
      WindowHelper windowHelper0 = new WindowHelper((SwingWindow) null);
      // Undeclared exception!
      try {
        windowHelper0.isFocusOwner();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test14()  throws Throwable  {
      WindowHelper windowHelper0 = new WindowHelper((SwingWindow) null);
      JMenuItem jMenuItem0 = new JMenuItem();
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent((Component) jMenuItem0, 0, 0L, 1101, 0, 0, (-746), true, (-1157), (-1558), (-1157));
      windowHelper0.singleMouseClick((MouseEvent) mouseWheelEvent0);
      assertEquals(false, windowHelper0.exitOnClose());
      assertEquals(true, windowHelper0.promptBeforeExit());
  }

  @Test
  public void test15()  throws Throwable  {
      WindowHelper windowHelper0 = new WindowHelper((SwingWindow) null);
      // Undeclared exception!
      try {
        windowHelper0.getInputMethodListeners();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test16()  throws Throwable  {
      WindowHelper windowHelper0 = new WindowHelper((SwingWindow) null);
      JPanel jPanel0 = windowHelper0.createCenterPanel();
      windowHelper0.addCancelButton(jPanel0);
      assertEquals(1, jPanel0.getComponentCount());
      assertEquals(false, windowHelper0.exitOnClose());
  }

  @Test
  public void test17()  throws Throwable  {
      WindowHelper windowHelper0 = new WindowHelper((SwingWindow) null);
      LTSPanel lTSPanel0 = new LTSPanel();
      windowHelper0.createOkClosePanel((JPanel) lTSPanel0);
      assertEquals(2, lTSPanel0.getComponentCount());
      assertEquals(2, lTSPanel0.countComponents());
  }

  @Test
  public void test18()  throws Throwable  {
      WindowHelper windowHelper0 = new WindowHelper((SwingWindow) null);
      SimpleGridBagConstraint simpleGridBagConstraint0 = (SimpleGridBagConstraint)windowHelper0.topPanelConstraints(1);
      assertEquals(1, simpleGridBagConstraint0.gridy);
      assertNotNull(simpleGridBagConstraint0);
      assertEquals(0, simpleGridBagConstraint0.gridx);
      assertEquals(false, windowHelper0.exitOnClose());
      assertEquals(true, windowHelper0.promptBeforeExit());
  }

  @Test
  public void test19()  throws Throwable  {
      WindowHelper windowHelper0 = new WindowHelper((SwingWindow) null);
      EyeDropperColorChooserPanel eyeDropperColorChooserPanel0 = new EyeDropperColorChooserPanel();
      windowHelper0.createApplyCancel((JPanel) eyeDropperColorChooserPanel0);
      assertEquals(10, eyeDropperColorChooserPanel0.countComponents());
      assertEquals(false, windowHelper0.exitOnClose());
  }

  @Test
  public void test20()  throws Throwable  {
      WindowHelper windowHelper0 = new WindowHelper((SwingWindow) null);
      // Undeclared exception!
      try {
        windowHelper0.setName("Quit Application?");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test21()  throws Throwable  {
      WindowHelper windowHelper0 = new WindowHelper((SwingWindow) null);
      BasicLabelUI basicLabelUI0 = new BasicLabelUI();
      // Undeclared exception!
      try {
        windowHelper0.addPropertyChangeListener("createNode", (PropertyChangeListener) basicLabelUI0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test22()  throws Throwable  {
      WindowHelper windowHelper0 = new WindowHelper((SwingWindow) null);
      // Undeclared exception!
      try {
        windowHelper0.getParent();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test23()  throws Throwable  {
      WindowHelper windowHelper0 = new WindowHelper((SwingWindow) null);
      windowHelper0.getWindowTitle();
      assertEquals(true, windowHelper0.promptBeforeExit());
      assertEquals(false, windowHelper0.exitOnClose());
  }

  @Test
  public void test24()  throws Throwable  {
      WindowHelper windowHelper0 = new WindowHelper((SwingWindow) null);
      SimpleGridBagConstraint simpleGridBagConstraint0 = (SimpleGridBagConstraint)windowHelper0.bottomPanelConstraints(884);
      assertEquals(0, simpleGridBagConstraint0.gridx);
      assertEquals(884, simpleGridBagConstraint0.gridy);
      assertNotNull(simpleGridBagConstraint0);
      assertEquals(false, windowHelper0.exitOnClose());
      assertEquals(true, windowHelper0.promptBeforeExit());
  }

  @Test
  public void test25()  throws Throwable  {
      WindowHelper windowHelper0 = new WindowHelper((SwingWindow) null);
      SimpleGridBagConstraint simpleGridBagConstraint0 = (SimpleGridBagConstraint)windowHelper0.centerPanelConstraints(1);
      assertEquals(1, simpleGridBagConstraint0.gridy);
      assertEquals(0, simpleGridBagConstraint0.gridx);
      assertEquals(true, windowHelper0.promptBeforeExit());
      assertNotNull(simpleGridBagConstraint0);
      assertEquals(false, windowHelper0.exitOnClose());
  }

  @Test
  public void test26()  throws Throwable  {
      WindowHelper windowHelper0 = new WindowHelper((SwingWindow) null);
      MetalComboBoxEditor metalComboBoxEditor0 = new MetalComboBoxEditor();
      // Undeclared exception!
      try {
        windowHelper0.removeFocusListener((FocusListener) metalComboBoxEditor0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test27()  throws Throwable  {
      WindowHelper windowHelper0 = new WindowHelper((SwingWindow) null);
      // Undeclared exception!
      try {
        windowHelper0.bounds();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test28()  throws Throwable  {
      WindowHelper windowHelper0 = new WindowHelper((SwingWindow) null);
      // Undeclared exception!
      try {
        windowHelper0.nextFocus();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test29()  throws Throwable  {
      WindowHelper windowHelper0 = new WindowHelper((SwingWindow) null);
      windowHelper0.createPopupMenu();
      assertEquals(true, windowHelper0.promptBeforeExit());
      assertEquals(false, windowHelper0.exitOnClose());
  }

  @Test
  public void test30()  throws Throwable  {
      WindowHelper windowHelper0 = new WindowHelper((SwingWindow) null);
      windowHelper0.setPopupMenu((JPopupMenu) null);
      assertEquals(false, windowHelper0.exitOnClose());
      assertEquals(true, windowHelper0.promptBeforeExit());
  }

  @Test
  public void test31()  throws Throwable  {
      WindowHelper windowHelper0 = new WindowHelper((SwingWindow) null);
      WindowHelper.LTSMousePopupListener windowHelper_LTSMousePopupListener0 = windowHelper0.new LTSMousePopupListener();
      // Undeclared exception!
      try {
        windowHelper0.removeMouseWheelListener((MouseWheelListener) windowHelper_LTSMousePopupListener0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test32()  throws Throwable  {
      WindowHelper windowHelper0 = new WindowHelper((SwingWindow) null);
      JMenuItem jMenuItem0 = new JMenuItem();
      WindowHelper.LTSMouseListener windowHelper_LTSMouseListener0 = windowHelper0.new LTSMouseListener();
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent((Component) jMenuItem0, 0, 0L, 1101, 0, 0, (-746), true, (-1157), (-1558), (-1157));
      windowHelper_LTSMouseListener0.mouseReleased((MouseEvent) mouseWheelEvent0);
      assertEquals(false, windowHelper0.exitOnClose());
      assertEquals(true, windowHelper0.promptBeforeExit());
  }

  @Test
  public void test33()  throws Throwable  {
      WindowHelper windowHelper0 = new WindowHelper((SwingWindow) null);
      windowHelper0.changesAccepted();
      assertEquals(false, windowHelper0.exitOnClose());
      assertEquals(true, windowHelper0.promptBeforeExit());
  }

  @Test
  public void test34()  throws Throwable  {
      WindowHelper windowHelper0 = new WindowHelper((SwingWindow) null);
      windowHelper0.getWindow();
      assertEquals(false, windowHelper0.exitOnClose());
      assertEquals(true, windowHelper0.promptBeforeExit());
  }

  @Test
  public void test35()  throws Throwable  {
      WindowHelper windowHelper0 = new WindowHelper((SwingWindow) null);
      // Undeclared exception!
      try {
        windowHelper0.size();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test36()  throws Throwable  {
      WindowHelper windowHelper0 = new WindowHelper((SwingWindow) null);
      windowHelper0.createMenuBar();
      assertEquals(false, windowHelper0.exitOnClose());
      assertEquals(true, windowHelper0.promptBeforeExit());
  }

  @Test
  public void test37()  throws Throwable  {
      WindowHelper windowHelper0 = new WindowHelper((SwingWindow) null);
      // Undeclared exception!
      try {
        windowHelper0.initialize();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test38()  throws Throwable  {
      WindowHelper windowHelper0 = new WindowHelper((SwingWindow) null);
      // Undeclared exception!
      try {
        windowHelper0.getForeground();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test39()  throws Throwable  {
      WindowHelper windowHelper0 = new WindowHelper((SwingWindow) null);
      // Undeclared exception!
      try {
        windowHelper0.minimumSize();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test40()  throws Throwable  {
      WindowHelper windowHelper0 = new WindowHelper((SwingWindow) null);
      // Undeclared exception!
      try {
        windowHelper0.getOwner();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test41()  throws Throwable  {
      WindowHelper windowHelper0 = new WindowHelper((SwingWindow) null);
      WindowHelper.LocalListSelectionListener windowHelper_LocalListSelectionListener0 = windowHelper0.new LocalListSelectionListener();
      ListSelectionEvent listSelectionEvent0 = new ListSelectionEvent((Object) "model", 0, 0, true);
      windowHelper_LocalListSelectionListener0.valueChanged(listSelectionEvent0);
      assertEquals(false, windowHelper0.exitOnClose());
      assertEquals(true, windowHelper0.promptBeforeExit());
  }

  @Test
  public void test42()  throws Throwable  {
      WindowHelper windowHelper0 = new WindowHelper((SwingWindow) null);
      JTextPane jTextPane0 = new JTextPane();
      Color color0 = jTextPane0.getCaretColor();
      // Undeclared exception!
      try {
        windowHelper0.setBackground(color0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test43()  throws Throwable  {
      WindowHelper windowHelper0 = new WindowHelper((SwingWindow) null);
      // Undeclared exception!
      try {
        windowHelper0.invalidate();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test44()  throws Throwable  {
      WindowHelper windowHelper0 = new WindowHelper((SwingWindow) null);
      // Undeclared exception!
      try {
        windowHelper0.transferFocus();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test45()  throws Throwable  {
      WindowHelper windowHelper0 = new WindowHelper((SwingWindow) null);
      // Undeclared exception!
      try {
        windowHelper0.getLayout();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test46()  throws Throwable  {
      WindowHelper windowHelper0 = new WindowHelper((SwingWindow) null);
      WindowHelper.StandardRKL windowHelper_StandardRKL0 = (WindowHelper.StandardRKL)windowHelper0.getReturnKeyListener();
      assertNotNull(windowHelper_StandardRKL0);
      
      // Undeclared exception!
      try {
        windowHelper0.removeKeyListener((KeyListener) windowHelper_StandardRKL0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test47()  throws Throwable  {
      WindowHelper windowHelper0 = new WindowHelper((SwingWindow) null);
      boolean boolean0 = windowHelper0.promptBeforeExit();
      assertEquals(false, windowHelper0.exitOnClose());
      assertEquals(true, boolean0);
  }

  @Test
  public void test48()  throws Throwable  {
      WindowHelper windowHelper0 = new WindowHelper((SwingWindow) null);
      assertEquals(true, windowHelper0.promptBeforeExit());
      
      windowHelper0.setPromptBeforeExit(false);
      assertEquals(false, windowHelper0.promptBeforeExit());
      assertEquals(false, windowHelper0.exitOnClose());
  }

  @Test
  public void test49()  throws Throwable  {
      WindowHelper windowHelper0 = new WindowHelper((SwingWindow) null);
      windowHelper0.deleteKeyPressed((Object) "ROW_HEADER");
      assertEquals(true, windowHelper0.promptBeforeExit());
      assertEquals(false, windowHelper0.exitOnClose());
  }

  @Test
  public void test50()  throws Throwable  {
      WindowHelper windowHelper0 = new WindowHelper((SwingWindow) null);
      // Undeclared exception!
      try {
        windowHelper0.getLocale();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test51()  throws Throwable  {
      WindowHelper windowHelper0 = new WindowHelper((SwingWindow) null);
      JPanel jPanel0 = windowHelper0.createTopPanel();
      assertEquals(false, windowHelper0.exitOnClose());
      assertEquals(true, windowHelper0.promptBeforeExit());
      assertNull(jPanel0);
  }

  @Test
  public void test52()  throws Throwable  {
      WindowHelper windowHelper0 = new WindowHelper((SwingWindow) null);
      // Undeclared exception!
      try {
        windowHelper0.insets();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test53()  throws Throwable  {
      WindowHelper windowHelper0 = new WindowHelper((SwingWindow) null);
      JMenuItem jMenuItem0 = new JMenuItem();
      WindowHelper.LTSMouseListener windowHelper_LTSMouseListener0 = windowHelper0.new LTSMouseListener();
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent((Component) jMenuItem0, 0, 0L, 1101, 0, 0, (-746), true, (-1157), (-1558), (-1157));
      windowHelper_LTSMouseListener0.mousePressed((MouseEvent) mouseWheelEvent0);
      assertEquals(false, windowHelper0.exitOnClose());
      assertEquals(true, windowHelper0.promptBeforeExit());
  }

  @Test
  public void test54()  throws Throwable  {
      WindowHelper windowHelper0 = new WindowHelper((SwingWindow) null);
      WindowHelper.LTSWindow windowHelper_LTSWindow0 = windowHelper0.new LTSWindow();
      assertEquals(false, windowHelper0.exitOnClose());
      assertEquals(true, windowHelper0.promptBeforeExit());
  }

  @Test
  public void test55()  throws Throwable  {
      WindowHelper windowHelper0 = new WindowHelper((SwingWindow) null);
      WindowHelper.StandardKeyListener windowHelper_StandardKeyListener0 = (WindowHelper.StandardKeyListener)windowHelper0.getKeyListener();
      assertNotNull(windowHelper_StandardKeyListener0);
      assertEquals(true, windowHelper0.promptBeforeExit());
      assertEquals(false, windowHelper0.exitOnClose());
  }

  @Test
  public void test56()  throws Throwable  {
      WindowHelper windowHelper0 = new WindowHelper((SwingWindow) null);
      windowHelper0.performAction((Object) "ControlButtonsAreShownChangedProperty");
      assertEquals(false, windowHelper0.changesAccepted());
      assertEquals(false, windowHelper0.exitOnClose());
      assertEquals(true, windowHelper0.promptBeforeExit());
  }

  @Test
  public void test57()  throws Throwable  {
      WindowHelper windowHelper0 = new WindowHelper((SwingWindow) null);
      LTSPanel lTSPanel0 = (LTSPanel)windowHelper0.createBottomPanel();
      assertNotNull(lTSPanel0);
      assertEquals(false, windowHelper0.exitOnClose());
      assertEquals(2, lTSPanel0.getComponentCount());
      assertEquals(true, windowHelper0.promptBeforeExit());
  }

  @Test
  public void test58()  throws Throwable  {
      WindowHelper windowHelper0 = new WindowHelper((SwingWindow) null);
      // Undeclared exception!
      try {
        windowHelper0.setHeading("ControlButtonsAreShownChangedProperty");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test59()  throws Throwable  {
      WindowHelper windowHelper0 = new WindowHelper((SwingWindow) null);
      WindowHelper.LTSMouseListener windowHelper_LTSMouseListener0 = windowHelper0.new LTSMouseListener();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(0, 0);
      JTable jTable0 = new JTable((TableModel) defaultTableModel0, (TableColumnModel) null);
      MouseEvent mouseEvent0 = new MouseEvent((Component) jTable0, 0, (-16L), 0, (-2017), 0, (-2017), false);
      windowHelper_LTSMouseListener0.maybeShowPopup(mouseEvent0);
      assertEquals(true, windowHelper0.promptBeforeExit());
      assertEquals(false, windowHelper0.exitOnClose());
  }

  @Test
  public void test60()  throws Throwable  {
      WindowHelper windowHelper0 = new WindowHelper((SwingWindow) null);
      WindowHelper.LTSMouseListener windowHelper_LTSMouseListener0 = (WindowHelper.LTSMouseListener)windowHelper0.getMouseAdapter();
      assertEquals(true, windowHelper0.promptBeforeExit());
      assertNotNull(windowHelper_LTSMouseListener0);
      assertEquals(false, windowHelper0.exitOnClose());
  }

  @Test
  public void test61()  throws Throwable  {
      String string0 = WindowHelper.trimString("Quit Application?");
      assertEquals("Quit Application?", string0);
  }

  @Test
  public void test62()  throws Throwable  {
      String string0 = WindowHelper.trimString("");
      assertNull(string0);
  }

  @Test
  public void test63()  throws Throwable  {
      WindowHelper windowHelper0 = new WindowHelper((SwingWindow) null);
      WindowHelper.LocalListSelectionListener windowHelper_LocalListSelectionListener0 = (WindowHelper.LocalListSelectionListener)windowHelper0.getListSelectionListener();
      WindowHelper.LocalListSelectionListener windowHelper_LocalListSelectionListener1 = (WindowHelper.LocalListSelectionListener)windowHelper0.getListSelectionListener();
      assertEquals(false, windowHelper0.exitOnClose());
      assertSame(windowHelper_LocalListSelectionListener1, windowHelper_LocalListSelectionListener0);
      assertNotNull(windowHelper_LocalListSelectionListener1);
      assertEquals(true, windowHelper0.promptBeforeExit());
  }
}
