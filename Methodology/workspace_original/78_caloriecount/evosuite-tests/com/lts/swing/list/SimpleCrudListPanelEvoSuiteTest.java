/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.swing.list;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.swing.keyboard.InputKey;
import com.lts.swing.list.SimpleCrudListPanel;
import java.awt.HeadlessException;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DefaultEditorKit;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class SimpleCrudListPanelEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      SimpleCrudListPanel.PanelMode simpleCrudListPanel_PanelMode0 = SimpleCrudListPanel.PanelMode.AllButtons;
      SimpleCrudListPanel simpleCrudListPanel0 = new SimpleCrudListPanel(simpleCrudListPanel_PanelMode0);
      assertNotNull(simpleCrudListPanel0);
      
      simpleCrudListPanel0.processDoubleClick(0);
      assertEquals(1, simpleCrudListPanel0.getGridx());
      assertEquals(2, simpleCrudListPanel0.getComponentCount());
      assertEquals(2, simpleCrudListPanel0.countComponents());
  }

  @Test
  public void test1()  throws Throwable  {
      SimpleCrudListPanel.PanelMode simpleCrudListPanel_PanelMode0 = SimpleCrudListPanel.PanelMode.None;
      SimpleCrudListPanel simpleCrudListPanel0 = new SimpleCrudListPanel(simpleCrudListPanel_PanelMode0);
      assertNotNull(simpleCrudListPanel0);
      
      simpleCrudListPanel0.removeAt(0);
      assertEquals(1, simpleCrudListPanel0.getGridx());
      assertEquals(2, simpleCrudListPanel0.countComponents());
      assertEquals(2, simpleCrudListPanel0.getComponentCount());
  }

  @Test
  public void test2()  throws Throwable  {
      SimpleCrudListPanel.PanelMode simpleCrudListPanel_PanelMode0 = SimpleCrudListPanel.PanelMode.JustDelete;
      SimpleCrudListPanel simpleCrudListPanel0 = new SimpleCrudListPanel(simpleCrudListPanel_PanelMode0);
      assertNotNull(simpleCrudListPanel0);
      
      simpleCrudListPanel0.addIfAbsent((Object) null);
      assertEquals(2, simpleCrudListPanel0.countComponents());
      assertEquals(1, simpleCrudListPanel0.getGridy());
      assertEquals(1, simpleCrudListPanel0.getGridx());
  }

  @Test
  public void test3()  throws Throwable  {
      SimpleCrudListPanel.PanelMode simpleCrudListPanel_PanelMode0 = SimpleCrudListPanel.PanelMode.MinusAdd;
      SimpleCrudListPanel simpleCrudListPanel0 = new SimpleCrudListPanel(simpleCrudListPanel_PanelMode0);
      assertNotNull(simpleCrudListPanel0);
      
      // Undeclared exception!
      try {
        simpleCrudListPanel0.update((-1), (Object) "$ename");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * -1
         */
      }
  }

  @Test
  public void test4()  throws Throwable  {
      SimpleCrudListPanel.PanelMode simpleCrudListPanel_PanelMode0 = SimpleCrudListPanel.PanelMode.MovementButtons;
      SimpleCrudListPanel simpleCrudListPanel0 = new SimpleCrudListPanel(simpleCrudListPanel_PanelMode0);
      assertNotNull(simpleCrudListPanel0);
      
      int int0 = simpleCrudListPanel0.getSelectedIndex();
      assertEquals((-1), int0);
      assertEquals(1, simpleCrudListPanel0.getGridx());
      assertEquals(2, simpleCrudListPanel0.getComponentCount());
  }

  @Test
  public void test5()  throws Throwable  {
      SimpleCrudListPanel.PanelMode simpleCrudListPanel_PanelMode0 = SimpleCrudListPanel.PanelMode.EditButtons;
      SimpleCrudListPanel simpleCrudListPanel0 = new SimpleCrudListPanel(simpleCrudListPanel_PanelMode0);
      assertNotNull(simpleCrudListPanel0);
      
      simpleCrudListPanel0.mapMouse();
      assertEquals(2, simpleCrudListPanel0.getComponentCount());
      assertEquals(1, simpleCrudListPanel0.getGridx());
      assertEquals(2, simpleCrudListPanel0.countComponents());
  }

  @Test
  public void test6()  throws Throwable  {
      SimpleCrudListPanel.PanelMode simpleCrudListPanel_PanelMode0 = SimpleCrudListPanel.PanelMode.EditButtons;
      SimpleCrudListPanel simpleCrudListPanel0 = new SimpleCrudListPanel(simpleCrudListPanel_PanelMode0);
      assertNotNull(simpleCrudListPanel0);
      
      simpleCrudListPanel0.addElement((Object) simpleCrudListPanel_PanelMode0);
      assertEquals(2, simpleCrudListPanel0.countComponents());
      assertEquals(2, simpleCrudListPanel0.getComponentCount());
  }

  @Test
  public void test7()  throws Throwable  {
      SimpleCrudListPanel.PanelMode simpleCrudListPanel_PanelMode0 = SimpleCrudListPanel.PanelMode.EditButtons;
      SimpleCrudListPanel simpleCrudListPanel0 = new SimpleCrudListPanel(simpleCrudListPanel_PanelMode0);
      assertNotNull(simpleCrudListPanel0);
      
      simpleCrudListPanel0.getSelectedItem();
      assertEquals(2, simpleCrudListPanel0.getComponentCount());
      assertEquals(1, simpleCrudListPanel0.getGridx());
      assertEquals(1, simpleCrudListPanel0.getGridy());
  }

  @Test
  public void test8()  throws Throwable  {
      SimpleCrudListPanel.PanelMode simpleCrudListPanel_PanelMode0 = SimpleCrudListPanel.PanelMode.None;
      SimpleCrudListPanel simpleCrudListPanel0 = new SimpleCrudListPanel(simpleCrudListPanel_PanelMode0);
      assertNotNull(simpleCrudListPanel0);
      
      DefaultEditorKit.DefaultKeyTypedAction defaultEditorKit_DefaultKeyTypedAction0 = new DefaultEditorKit.DefaultKeyTypedAction();
      simpleCrudListPanel0.addDoubleClickListener((ActionListener) defaultEditorKit_DefaultKeyTypedAction0);
      assertEquals(1, simpleCrudListPanel0.getGridx());
      assertEquals(2, simpleCrudListPanel0.getComponentCount());
      assertEquals(1, simpleCrudListPanel0.getGridy());
  }

  @Test
  public void test9()  throws Throwable  {
      SimpleCrudListPanel.PanelMode simpleCrudListPanel_PanelMode0 = SimpleCrudListPanel.PanelMode.EditButtons;
      SimpleCrudListPanel simpleCrudListPanel0 = new SimpleCrudListPanel(simpleCrudListPanel_PanelMode0);
      assertNotNull(simpleCrudListPanel0);
      
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      simpleCrudListPanel0.containsElement((Object) defaultTableModel0);
      assertEquals(2, simpleCrudListPanel0.getComponentCount());
      assertEquals(2, simpleCrudListPanel0.countComponents());
  }

  @Test
  public void test10()  throws Throwable  {
      SimpleCrudListPanel.PanelMode simpleCrudListPanel_PanelMode0 = SimpleCrudListPanel.PanelMode.None;
      SimpleCrudListPanel simpleCrudListPanel0 = new SimpleCrudListPanel(simpleCrudListPanel_PanelMode0);
      assertNotNull(simpleCrudListPanel0);
      
      SimpleCrudListPanel.PanelButton[] simpleCrudListPanel_PanelButtonArray0 = new SimpleCrudListPanel.PanelButton[7];
      // Undeclared exception!
      try {
        simpleCrudListPanel0.initialize(simpleCrudListPanel_PanelButtonArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test11()  throws Throwable  {
      SimpleCrudListPanel.PanelMode simpleCrudListPanel_PanelMode0 = SimpleCrudListPanel.PanelMode.AllButtons;
      SimpleCrudListPanel simpleCrudListPanel0 = new SimpleCrudListPanel(simpleCrudListPanel_PanelMode0);
      assertNotNull(simpleCrudListPanel0);
      
      InputKey inputKey0 = InputKey.Delete;
      simpleCrudListPanel0.processKey(inputKey0);
      assertEquals(2, simpleCrudListPanel0.getComponentCount());
      assertEquals(2, simpleCrudListPanel0.countComponents());
  }

  @Test
  public void test12()  throws Throwable  {
      SimpleCrudListPanel.PanelMode simpleCrudListPanel_PanelMode0 = SimpleCrudListPanel.PanelMode.AllButtons;
      SimpleCrudListPanel simpleCrudListPanel0 = new SimpleCrudListPanel(simpleCrudListPanel_PanelMode0);
      assertNotNull(simpleCrudListPanel0);
      
      InputKey inputKey0 = InputKey.DownArrow;
      // Undeclared exception!
      try {
        simpleCrudListPanel0.processKey(inputKey0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Unrecognized key code: DownArrow
         */
      }
  }

  @Test
  public void test13()  throws Throwable  {
      SimpleCrudListPanel.PanelMode simpleCrudListPanel_PanelMode0 = SimpleCrudListPanel.PanelMode.EditButtons;
      SimpleCrudListPanel simpleCrudListPanel0 = new SimpleCrudListPanel(simpleCrudListPanel_PanelMode0);
      assertNotNull(simpleCrudListPanel0);
      
      InputKey inputKey0 = InputKey.Insert;
      // Undeclared exception!
      try {
        simpleCrudListPanel0.processKey(inputKey0);
        fail("Expecting exception: HeadlessException");
      } catch(HeadlessException e) {
      }
  }

  @Test
  public void test14()  throws Throwable  {
      SimpleCrudListPanel.PanelMode simpleCrudListPanel_PanelMode0 = SimpleCrudListPanel.PanelMode.EditButtons;
      SimpleCrudListPanel simpleCrudListPanel0 = new SimpleCrudListPanel(simpleCrudListPanel_PanelMode0);
      assertNotNull(simpleCrudListPanel0);
      
      simpleCrudListPanel0.processUpdate();
      assertEquals(2, simpleCrudListPanel0.getComponentCount());
      assertEquals(2, simpleCrudListPanel0.countComponents());
  }

  @Test
  public void test15()  throws Throwable  {
      SimpleCrudListPanel.PanelMode simpleCrudListPanel_PanelMode0 = SimpleCrudListPanel.PanelMode.AllButtons;
      SimpleCrudListPanel simpleCrudListPanel0 = new SimpleCrudListPanel(simpleCrudListPanel_PanelMode0);
      assertNotNull(simpleCrudListPanel0);
      
      simpleCrudListPanel0.processMoveUp();
      assertEquals(2, simpleCrudListPanel0.countComponents());
      assertEquals(1, simpleCrudListPanel0.getGridx());
      assertEquals(2, simpleCrudListPanel0.getComponentCount());
  }

  @Test
  public void test16()  throws Throwable  {
      SimpleCrudListPanel.PanelMode simpleCrudListPanel_PanelMode0 = SimpleCrudListPanel.PanelMode.AllButtons;
      SimpleCrudListPanel simpleCrudListPanel0 = new SimpleCrudListPanel(simpleCrudListPanel_PanelMode0);
      assertNotNull(simpleCrudListPanel0);
      
      simpleCrudListPanel0.processMoveDown();
      assertEquals(1, simpleCrudListPanel0.getGridx());
  }

  @Test
  public void test17()  throws Throwable  {
      SimpleCrudListPanel.PanelMode simpleCrudListPanel_PanelMode0 = SimpleCrudListPanel.PanelMode.MinusAdd;
      SimpleCrudListPanel simpleCrudListPanel0 = new SimpleCrudListPanel(simpleCrudListPanel_PanelMode0);
      assertNotNull(simpleCrudListPanel0);
      
      int int0 = simpleCrudListPanel0.insertOrAdd((Object) "$ename");
      assertEquals((-1), int0);
      assertEquals(2, simpleCrudListPanel0.getComponentCount());
  }

  @Test
  public void test18()  throws Throwable  {
      SimpleCrudListPanel.PanelMode simpleCrudListPanel_PanelMode0 = SimpleCrudListPanel.PanelMode.EditButtons;
      SimpleCrudListPanel simpleCrudListPanel0 = new SimpleCrudListPanel(simpleCrudListPanel_PanelMode0);
      assertNotNull(simpleCrudListPanel0);
      
      DefaultTableModel defaultTableModel0 = new DefaultTableModel((Object[]) simpleCrudListPanel0.DEFAULT_MAPPED_KEYS, 13);
      Vector<Object> vector0 = defaultTableModel0.getDataVector();
      simpleCrudListPanel0.setElements((List) vector0);
      assertEquals(1, simpleCrudListPanel0.getGridy());
      assertEquals(2, simpleCrudListPanel0.getComponentCount());
      assertEquals(1, simpleCrudListPanel0.getGridx());
  }

  @Test
  public void test19()  throws Throwable  {
      SimpleCrudListPanel.PanelMode simpleCrudListPanel_PanelMode0 = SimpleCrudListPanel.PanelMode.JustDelete;
      SimpleCrudListPanel simpleCrudListPanel0 = new SimpleCrudListPanel(simpleCrudListPanel_PanelMode0);
      assertNotNull(simpleCrudListPanel0);
      
      List<Object> list0 = simpleCrudListPanel0.getElements();
      assertNotNull(list0);
      
      simpleCrudListPanel0.replaceWith(list0);
      assertEquals(1, simpleCrudListPanel0.getGridx());
      assertEquals(1, simpleCrudListPanel0.getGridy());
  }
}
