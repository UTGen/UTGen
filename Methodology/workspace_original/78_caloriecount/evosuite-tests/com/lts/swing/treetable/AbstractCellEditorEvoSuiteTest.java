/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.swing.treetable;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.swing.treetable.AbstractCellEditor;
import java.util.EventObject;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.event.CellEditorListener;
import javax.swing.table.DefaultTableModel;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class AbstractCellEditorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      AbstractCellEditor abstractCellEditor0 = new AbstractCellEditor();
      Object object0 = abstractCellEditor0.getCellEditorValue();
      assertNull(object0);
  }

  @Test
  public void test1()  throws Throwable  {
      AbstractCellEditor abstractCellEditor0 = new AbstractCellEditor();
      boolean boolean0 = abstractCellEditor0.shouldSelectCell((EventObject) null);
      assertEquals(false, boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      AbstractCellEditor abstractCellEditor0 = new AbstractCellEditor();
      boolean boolean0 = abstractCellEditor0.stopCellEditing();
      assertEquals(true, boolean0);
  }

  @Test
  public void test3()  throws Throwable  {
      AbstractCellEditor abstractCellEditor0 = new AbstractCellEditor();
      abstractCellEditor0.cancelCellEditing();
      assertEquals(true, abstractCellEditor0.stopCellEditing());
  }

  @Test
  public void test4()  throws Throwable  {
      AbstractCellEditor abstractCellEditor0 = new AbstractCellEditor();
      boolean boolean0 = abstractCellEditor0.isCellEditable((EventObject) null);
      assertEquals(true, boolean0);
  }

  @Test
  public void test5()  throws Throwable  {
      AbstractCellEditor abstractCellEditor0 = new AbstractCellEditor();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      Vector<Object> vector0 = defaultTableModel0.getDataVector();
      JTable jTable0 = new JTable(vector0, vector0);
      abstractCellEditor0.removeCellEditorListener((CellEditorListener) jTable0);
      assertEquals(true, jTable0.getShowHorizontalLines());
  }

  @Test
  public void test6()  throws Throwable  {
      AbstractCellEditor abstractCellEditor0 = new AbstractCellEditor();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      Vector<Object> vector0 = defaultTableModel0.getDataVector();
      JTable jTable0 = new JTable(vector0, vector0);
      abstractCellEditor0.addCellEditorListener((CellEditorListener) jTable0);
      abstractCellEditor0.fireEditingCanceled();
      assertEquals(true, abstractCellEditor0.stopCellEditing());
  }

  @Test
  public void test7()  throws Throwable  {
      AbstractCellEditor abstractCellEditor0 = new AbstractCellEditor();
      JTable jTable0 = new JTable();
      abstractCellEditor0.addCellEditorListener((CellEditorListener) jTable0);
      abstractCellEditor0.fireEditingStopped();
      assertEquals(true, abstractCellEditor0.stopCellEditing());
  }

  @Test
  public void test8()  throws Throwable  {
      AbstractCellEditor abstractCellEditor0 = new AbstractCellEditor();
      abstractCellEditor0.fireEditingCanceled();
      assertEquals(true, abstractCellEditor0.stopCellEditing());
  }
}