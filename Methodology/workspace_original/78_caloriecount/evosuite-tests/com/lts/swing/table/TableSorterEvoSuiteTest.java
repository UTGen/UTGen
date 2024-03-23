/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.swing.table;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.swing.table.TableSorter;
import java.awt.color.ICC_Profile;
import java.util.Comparator;
import java.util.Vector;
import javax.swing.Icon;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.tree.TreeModel;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TableSorterEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      JTable jTable0 = new JTable();
      JTableHeader jTableHeader0 = jTable0.getTableHeader();
      TableSorter tableSorter0 = new TableSorter((TableModel) defaultTableModel0, jTableHeader0);
      Object[] objectArray0 = new Object[8];
      tableSorter0.setSortingStatus(530, 20);
      defaultTableModel0.addColumn((Object) null, objectArray0);
      assertEquals(8, defaultTableModel0.getRowCount());
  }

  @Test
  public void test1()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      TableSorter tableSorter0 = new TableSorter((TableModel) defaultTableModel0);
      assertNotNull(tableSorter0);
      
      // Undeclared exception!
      try {
        tableSorter0.getValueAt(0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * 0
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      TableSorter tableSorter0 = new TableSorter();
      TableModel tableModel0 = tableSorter0.getTableModel();
      assertNull(tableModel0);
  }

  @Test
  public void test3()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      JTable jTable0 = new JTable();
      JTableHeader jTableHeader0 = jTable0.getTableHeader();
      TableSorter tableSorter0 = new TableSorter((TableModel) defaultTableModel0, jTableHeader0);
      JTableHeader jTableHeader1 = tableSorter0.getTableHeader();
      assertEquals(false, jTableHeader1.requestDefaultFocus());
  }

  @Test
  public void test4()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      JTable jTable0 = new JTable();
      JTableHeader jTableHeader0 = jTable0.getTableHeader();
      TableSorter tableSorter0 = new TableSorter((TableModel) defaultTableModel0, jTableHeader0);
      tableSorter0.setSortingStatus(530, 20);
      defaultTableModel0.fireTableCellUpdated((-1128), 127);
      assertEquals(0, defaultTableModel0.getRowCount());
  }

  @Test
  public void test5()  throws Throwable  {
      TableSorter tableSorter0 = new TableSorter();
      // Undeclared exception!
      try {
        tableSorter0.getColumnClass(0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test6()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      JTable jTable0 = new JTable();
      JTableHeader jTableHeader0 = jTable0.getTableHeader();
      TableSorter tableSorter0 = new TableSorter((TableModel) defaultTableModel0, jTableHeader0);
      assertNotNull(tableSorter0);
      
      String string0 = tableSorter0.getColumnName((-1));
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test
  public void test7()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      JTable jTable0 = new JTable();
      JTableHeader jTableHeader0 = jTable0.getTableHeader();
      TableSorter tableSorter0 = new TableSorter((TableModel) defaultTableModel0, jTableHeader0);
      assertNotNull(tableSorter0);
      
      tableSorter0.setSortingStatus(20, 20);
      tableSorter0.getHeaderRendererIcon(20, 20);
      assertEquals(true, tableSorter0.isSorting());
  }

  @Test
  public void test8()  throws Throwable  {
      TableSorter tableSorter0 = new TableSorter();
      TableSorter tableSorter1 = new TableSorter((TableModel) tableSorter0);
      tableSorter1.setTableModel((TableModel) tableSorter0);
      assertFalse(tableSorter1.equals(tableSorter0));
  }

  @Test
  public void test9()  throws Throwable  {
      JTable jTable0 = new JTable();
      JTableHeader jTableHeader0 = jTable0.getTableHeader();
      TableSorter tableSorter0 = new TableSorter((TableModel) null, jTableHeader0);
      assertNotNull(tableSorter0);
      
      tableSorter0.setSortingStatus(0, 1);
      tableSorter0.setSortingStatus(0, 1);
      assertEquals(true, tableSorter0.isSorting());
  }

  @Test
  public void test10()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      JTable jTable0 = new JTable();
      JTableHeader jTableHeader0 = jTable0.getTableHeader();
      TableSorter tableSorter0 = new TableSorter((TableModel) defaultTableModel0, jTableHeader0);
      tableSorter0.setTableHeader(jTableHeader0);
      assertEquals(true, jTableHeader0.isFontSet());
  }

  @Test
  public void test11()  throws Throwable  {
      TableSorter tableSorter0 = new TableSorter();
      TableSorter tableSorter1 = new TableSorter((TableModel) tableSorter0, (JTableHeader) null);
      assertFalse(tableSorter0.equals(tableSorter1));
  }

  @Test
  public void test12()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      TableSorter tableSorter0 = new TableSorter((TableModel) defaultTableModel0);
      assertEquals(false, tableSorter0.isSorting());
      assertNotNull(tableSorter0);
      
      tableSorter0.setSortingStatus(0, 1);
      TableModelEvent tableModelEvent0 = new TableModelEvent((TableModel) tableSorter0, 0, 0, 0, 0);
      defaultTableModel0.rowsRemoved(tableModelEvent0);
      assertEquals(true, tableSorter0.isSorting());
  }

  @Test
  public void test13()  throws Throwable  {
      Vector<DefaultTableColumnModel> vector0 = new Vector<DefaultTableColumnModel>();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(vector0, vector0);
      TableSorter tableSorter0 = new TableSorter((TableModel) defaultTableModel0);
      assertNotNull(tableSorter0);
      
      tableSorter0.setSortingStatus((-1627), 0);
      assertEquals(false, tableSorter0.isSorting());
  }

  @Test
  public void test14()  throws Throwable  {
      Vector<Comparator<Object>> vector0 = new Vector<Comparator<Object>>();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(vector0, vector0);
      TableSorter tableSorter0 = new TableSorter((TableModel) defaultTableModel0);
      Icon icon0 = tableSorter0.getHeaderRendererIcon(1578, 1578);
      assertNull(icon0);
  }

  @Test
  public void test15()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      JTable jTable0 = new JTable();
      JTableHeader jTableHeader0 = jTable0.getTableHeader();
      TableSorter tableSorter0 = new TableSorter((TableModel) defaultTableModel0, jTableHeader0);
      assertNotNull(tableSorter0);
      
      tableSorter0.setSortingStatus((-1), (-1));
      tableSorter0.getHeaderRendererIcon((-1), (-1));
      assertEquals(true, tableSorter0.isSorting());
  }

  @Test
  public void test16()  throws Throwable  {
      Vector<DefaultTableColumnModel> vector0 = new Vector<DefaultTableColumnModel>();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(vector0, vector0);
      TableSorter tableSorter0 = new TableSorter((TableModel) defaultTableModel0);
      Class<?> class0 = TreeModel.class;
      Comparator<Object> comparator0 = tableSorter0.getComparator(0);
      tableSorter0.setColumnComparator((Class) class0, (Comparator) comparator0);
      assertEquals(0, tableSorter0.getRowCount());
  }

  @Test
  public void test17()  throws Throwable  {
      TableSorter tableSorter0 = new TableSorter();
      Class<?> class0 = ICC_Profile.class;
      tableSorter0.setColumnComparator((Class) class0, (Comparator) null);
      assertEquals(false, tableSorter0.isSorting());
  }

  @Test
  public void test18()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(objectArray0, 942);
      DefaultTableColumnModel defaultTableColumnModel0 = new DefaultTableColumnModel();
      JTableHeader jTableHeader0 = new JTableHeader((TableColumnModel) defaultTableColumnModel0);
      TableSorter tableSorter0 = new TableSorter((TableModel) defaultTableModel0, jTableHeader0);
      assertNotNull(tableSorter0);
      
      int int0 = tableSorter0.modelIndex(0);
      assertEquals(0, int0);
      assertEquals(1, tableSorter0.getColumnCount());
      
      // Undeclared exception!
      try {
        tableSorter0.setValueAt((Object) null, 942, 942);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * 942
         */
      }
  }

  @Test
  public void test19()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      TableSorter tableSorter0 = new TableSorter((TableModel) defaultTableModel0);
      int int0 = tableSorter0.getRowCount();
      assertEquals(0, int0);
  }

  @Test
  public void test20()  throws Throwable  {
      TableSorter tableSorter0 = new TableSorter();
      int int0 = tableSorter0.getRowCount();
      assertEquals(0, int0);
  }

  @Test
  public void test21()  throws Throwable  {
      TableSorter tableSorter0 = new TableSorter();
      TableSorter tableSorter1 = new TableSorter((TableModel) tableSorter0);
      assertNotNull(tableSorter1);
      
      tableSorter1.findColumn("Ul)nhXxGU2");
      assertEquals(0, tableSorter1.getColumnCount());
      assertEquals(0, tableSorter0.getColumnCount());
  }

  @Test
  public void test22()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      JTable jTable0 = new JTable();
      JTableHeader jTableHeader0 = jTable0.getTableHeader();
      TableSorter tableSorter0 = new TableSorter((TableModel) defaultTableModel0, jTableHeader0);
      assertNotNull(tableSorter0);
      
      Object[] objectArray0 = new Object[8];
      defaultTableModel0.addColumn((Object) null, objectArray0);
      tableSorter0.setSortingStatus(20, 20);
      // Undeclared exception!
      try {
        tableSorter0.isCellEditable(20, 20);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * 20 >= 1
         */
      }
  }

  @Test
  public void test23()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      JTable jTable0 = new JTable();
      JTableHeader jTableHeader0 = jTable0.getTableHeader();
      TableSorter tableSorter0 = new TableSorter((TableModel) defaultTableModel0, jTableHeader0);
      assertNotNull(tableSorter0);
      
      TableSorter tableSorter1 = new TableSorter((TableModel) tableSorter0, jTableHeader0);
      tableSorter1.setSortingStatus(530, 20);
      assertEquals(true, tableSorter1.isSorting());
      
      tableSorter0.fireTableRowsDeleted(3, 20);
      assertEquals(false, tableSorter0.isSorting());
  }

  @Test
  public void test24()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      JTable jTable0 = new JTable();
      JTableHeader jTableHeader0 = jTable0.getTableHeader();
      TableSorter tableSorter0 = new TableSorter((TableModel) defaultTableModel0, jTableHeader0);
      assertNotNull(tableSorter0);
      
      TableSorter tableSorter1 = new TableSorter((TableModel) tableSorter0, jTableHeader0);
      tableSorter1.setSortingStatus(0, (-1));
      assertEquals(true, tableSorter1.isSorting());
      
      tableSorter0.fireTableRowsDeleted(0, 0);
      assertEquals(false, tableSorter0.isSorting());
  }
}
