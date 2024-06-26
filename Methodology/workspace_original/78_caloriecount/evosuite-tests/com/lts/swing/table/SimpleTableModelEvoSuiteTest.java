/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.swing.table;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.LTSException;
import com.lts.swing.table.SimpleTableModel;
import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import javax.swing.SpinnerListModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class SimpleTableModelEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Object[][] objectArray0 = new Object[8][10];
      SimpleTableModel simpleTableModel0 = null;
      try {
        simpleTableModel0 = new SimpleTableModel(objectArray0, objectArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      Object[][] objectArray0 = new Object[8][10];
      String[] stringArray0 = new String[13];
      SimpleTableModel simpleTableModel0 = new SimpleTableModel(stringArray0, objectArray0);
      int int0 = simpleTableModel0.getRowCount();
      assertEquals(8, int0);
  }

  @Test
  public void test2()  throws Throwable  {
      String[] stringArray0 = new String[15];
      TableRowSorter<DefaultTableModel> tableRowSorter0 = new TableRowSorter<DefaultTableModel>();
      List<?> list0 = tableRowSorter0.getSortKeys();
      SimpleTableModel simpleTableModel0 = new SimpleTableModel(stringArray0, (List) list0);
      assertNotNull(simpleTableModel0);
      
      Class<?>[] classArray0 = (Class<?>[]) Array.newInstance(Class.class, 15);
      boolean[] booleanArray0 = new boolean[14];
      simpleTableModel0.initialize((List) list0, (List) list0, (Class[]) classArray0, booleanArray0);
      assertEquals(0, simpleTableModel0.getColumnCount());
  }

  @Test
  public void test3()  throws Throwable  {
      String[] stringArray0 = new String[4];
      String[][] stringArray1 = new String[26][9];
      SimpleTableModel simpleTableModel0 = new SimpleTableModel(stringArray0, stringArray1);
      assertEquals(26, simpleTableModel0.getRowCount());
  }

  @Test
  public void test4()  throws Throwable  {
      DefaultTableModel defaultTableModel0 = new DefaultTableModel((Vector) null, (Vector) null);
      SimpleTableModel simpleTableModel0 = new SimpleTableModel();
      // Undeclared exception!
      try {
        simpleTableModel0.setValueAt((Object) defaultTableModel0, (-605), (-605));
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test5()  throws Throwable  {
      String[] stringArray0 = new String[2];
      SimpleTableModel simpleTableModel0 = new SimpleTableModel(stringArray0);
      assertNotNull(simpleTableModel0);
      
      simpleTableModel0.findColumn("?teeB}|n2ES[1");
      assertEquals(256, simpleTableModel0.getRowCount());
  }

  @Test
  public void test6()  throws Throwable  {
      Object[][] objectArray0 = new Object[8][10];
      String[] stringArray0 = new String[13];
      SimpleTableModel simpleTableModel0 = new SimpleTableModel(stringArray0, objectArray0);
      simpleTableModel0.setData(objectArray0);
      assertEquals(8, simpleTableModel0.getRowCount());
  }

  @Test
  public void test7()  throws Throwable  {
      SimpleTableModel simpleTableModel0 = new SimpleTableModel();
      // Undeclared exception!
      try {
        simpleTableModel0.isCellEditable(0, 0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test8()  throws Throwable  {
      String[] stringArray0 = new String[10];
      SimpleTableModel simpleTableModel0 = new SimpleTableModel(stringArray0);
      assertNotNull(simpleTableModel0);
      
      Class<Object> class0 = simpleTableModel0.getColumnClass(0);
      assertEquals(256, simpleTableModel0.getRowCount());
      assertNotNull(class0);
  }

  @Test
  public void test9()  throws Throwable  {
      SimpleTableModel.SimpleColumnSpec simpleTableModel_SimpleColumnSpec0 = new SimpleTableModel.SimpleColumnSpec((String) null, (Class) null, false);
      assertEquals(false, simpleTableModel_SimpleColumnSpec0.editable);
  }

  @Test
  public void test10()  throws Throwable  {
      SimpleTableModel simpleTableModel0 = new SimpleTableModel();
      Object[][] objectArray0 = simpleTableModel0.buildData(0, 0);
      simpleTableModel0.initialize(objectArray0, (Object[][]) null);
      assertEquals(0, simpleTableModel0.getColumnCount());
  }

  @Test
  public void test11()  throws Throwable  {
      String[] stringArray0 = new String[16];
      SpinnerListModel spinnerListModel0 = new SpinnerListModel((Object[]) stringArray0);
      List<?> list0 = spinnerListModel0.getList();
      SimpleTableModel simpleTableModel0 = new SimpleTableModel(stringArray0, (List) list0);
      assertEquals(256, simpleTableModel0.getRowCount());
      assertNotNull(simpleTableModel0);
  }

  @Test
  public void test12()  throws Throwable  {
      String[] stringArray0 = new String[19];
      Object[][] objectArray0 = new Object[9][1];
      SimpleTableModel simpleTableModel0 = new SimpleTableModel(stringArray0, objectArray0);
      Object[] objectArray1 = simpleTableModel0.toRowData((Object) stringArray0);
      assertSame(stringArray0, objectArray1);
  }

  @Test
  public void test13()  throws Throwable  {
      SimpleTableModel simpleTableModel0 = new SimpleTableModel();
      LinkedList<Boolean> linkedList0 = new LinkedList<Boolean>();
      simpleTableModel0.addAll((List) linkedList0);
      Boolean boolean0 = Boolean.FALSE;
      linkedList0.add(boolean0);
      // Undeclared exception!
      try {
        simpleTableModel0.addAll((List) linkedList0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test
  public void test14()  throws Throwable  {
      SimpleTableModel simpleTableModel0 = new SimpleTableModel();
      int int0 = simpleTableModel0.getPopulatedCount();
      assertEquals(0, int0);
  }

  @Test
  public void test15()  throws Throwable  {
      SimpleTableModel simpleTableModel0 = new SimpleTableModel();
      String[] stringArray0 = new String[2];
      LinkedList<Boolean> linkedList0 = new LinkedList<Boolean>();
      stringArray0[0] = "?teeB}|n2ES[1";
      Object[][] objectArray0 = simpleTableModel0.buildData(0, 0);
      assertEquals(0, simpleTableModel0.getPopulatedCount());
      
      Object[][] objectArray1 = new Object[2][6];
      objectArray1[0] = (Object[]) stringArray0;
      simpleTableModel0.initialize(objectArray0, objectArray1);
      simpleTableModel0.addAll((List) linkedList0);
      assertEquals(1, simpleTableModel0.getPopulatedCount());
  }

  @Test
  public void test16()  throws Throwable  {
      SimpleTableModel simpleTableModel0 = new SimpleTableModel();
      String[] stringArray0 = new String[2];
      LinkedList<Boolean> linkedList0 = new LinkedList<Boolean>();
      stringArray0[0] = "?teeB}|n2ES[1";
      Boolean boolean0 = Boolean.FALSE;
      linkedList0.add(boolean0);
      Object[][] objectArray0 = simpleTableModel0.buildData(0, 0);
      Object[][] objectArray1 = new Object[2][6];
      objectArray1[0] = (Object[]) stringArray0;
      objectArray1[1] = (Object[]) stringArray0;
      simpleTableModel0.initialize(objectArray0, objectArray1);
      simpleTableModel0.addAll((List) linkedList0);
      assertEquals(2, simpleTableModel0.getPopulatedCount());
  }

  @Test
  public void test17()  throws Throwable  {
      String[] stringArray0 = new String[10];
      SimpleTableModel simpleTableModel0 = new SimpleTableModel(stringArray0);
      assertNotNull(simpleTableModel0);
      
      SpinnerListModel spinnerListModel0 = new SpinnerListModel((Object[]) stringArray0);
      List<?> list0 = spinnerListModel0.getList();
      Class<?>[] classArray0 = (Class<?>[]) Array.newInstance(Class.class, 10);
      boolean[] booleanArray0 = new boolean[2];
      // Undeclared exception!
      try {
        simpleTableModel0.initialize((List) list0, (List) list0, (Class[]) classArray0, booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * 2
         */
      }
  }

  @Test
  public void test18()  throws Throwable  {
      SimpleTableModel simpleTableModel0 = new SimpleTableModel();
      LinkedList<Boolean> linkedList0 = new LinkedList<Boolean>();
      Boolean boolean0 = Boolean.FALSE;
      linkedList0.add(boolean0);
      simpleTableModel0.setColumns((List) linkedList0);
      assertEquals(1, simpleTableModel0.getColumnCount());
  }
}
