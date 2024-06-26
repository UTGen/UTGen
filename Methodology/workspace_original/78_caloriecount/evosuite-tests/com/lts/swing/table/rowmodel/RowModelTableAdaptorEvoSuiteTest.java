/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.swing.table.rowmodel;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.caloriecount.ui.dayview.MealRowModel;
import com.lts.caloriecount.ui.entry.EntryRowModel;
import com.lts.caloriecount.ui.foodwin.FoodRowModel;
import com.lts.swing.table.rowmodel.RowModel;
import com.lts.util.notifyinglist.ListProxy;
import com.lts.util.notifyinglist.NotifyingList;
import com.lts.util.notifyinglist.NotifyingListAdaptor;
import com.lts.util.notifyinglist.OtherNotifyingListAdaptor;
import com.lts.util.notifyinglist.TableBridge;
import javax.swing.JLayeredPane;
import javax.swing.JTable;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class RowModelTableAdaptorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      NotifyingListAdaptor<String> notifyingListAdaptor0 = new NotifyingListAdaptor<String>();
      MealRowModel mealRowModel0 = new MealRowModel();
      TableBridge<String> tableBridge0 = new TableBridge<String>((NotifyingList<String>) notifyingListAdaptor0, (RowModel) mealRowModel0);
      JTable jTable0 = new JTable((TableModel) tableBridge0);
      assertNotNull(jTable0);
      
      tableBridge0.removeTableModelListener((TableModelListener) jTable0);
      assertEquals(3, jTable0.getColumnCount());
      assertEquals(3, tableBridge0.getColumnCount());
  }

  @Test
  public void test1()  throws Throwable  {
      NotifyingListAdaptor<Object> notifyingListAdaptor0 = new NotifyingListAdaptor<Object>();
      EntryRowModel entryRowModel0 = new EntryRowModel();
      TableBridge<Object> tableBridge0 = new TableBridge<Object>((NotifyingList<Object>) notifyingListAdaptor0, (RowModel) entryRowModel0);
      // Undeclared exception!
      try {
        tableBridge0.getValueAt((-1), (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      NotifyingListAdaptor<String> notifyingListAdaptor0 = new NotifyingListAdaptor<String>();
      MealRowModel mealRowModel0 = new MealRowModel();
      TableBridge<String> tableBridge0 = new TableBridge<String>((NotifyingList<String>) notifyingListAdaptor0, (RowModel) mealRowModel0);
      boolean boolean0 = tableBridge0.isCellEditable(0, (-1));
      assertEquals(false, boolean0);
  }

  @Test
  public void test3()  throws Throwable  {
      NotifyingListAdaptor<Integer> notifyingListAdaptor0 = new NotifyingListAdaptor<Integer>();
      ListProxy<Integer> listProxy0 = new ListProxy<Integer>((NotifyingList<Integer>) notifyingListAdaptor0);
      EntryRowModel entryRowModel0 = new EntryRowModel();
      TableBridge<Integer> tableBridge0 = new TableBridge<Integer>((NotifyingList<Integer>) listProxy0, (RowModel) entryRowModel0);
      // Undeclared exception!
      try {
        tableBridge0.setValueAt((Object) "ApproveButtonTextChangedProperty", 0, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      } catch(IndexOutOfBoundsException e) {
        /*
         * Index: 0, Size: 0
         */
      }
  }

  @Test
  public void test4()  throws Throwable  {
      NotifyingListAdaptor<Integer> notifyingListAdaptor0 = new NotifyingListAdaptor<Integer>();
      FoodRowModel foodRowModel0 = new FoodRowModel();
      TableBridge<Integer> tableBridge0 = new TableBridge<Integer>((NotifyingList<Integer>) notifyingListAdaptor0, (RowModel) foodRowModel0);
      // Undeclared exception!
      try {
        tableBridge0.getColumnClass((-1249));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * -1249
         */
      }
  }

  @Test
  public void test5()  throws Throwable  {
      OtherNotifyingListAdaptor<String> otherNotifyingListAdaptor0 = new OtherNotifyingListAdaptor<String>();
      EntryRowModel entryRowModel0 = new EntryRowModel();
      TableBridge<String> tableBridge0 = new TableBridge<String>((NotifyingList<String>) otherNotifyingListAdaptor0, (RowModel) entryRowModel0);
      tableBridge0.append((Object) "section");
      assertEquals(1, tableBridge0.getRowCount());
      assertEquals(true, otherNotifyingListAdaptor0.isEmpty());
  }

  @Test
  public void test6()  throws Throwable  {
      NotifyingListAdaptor<Integer> notifyingListAdaptor0 = new NotifyingListAdaptor<Integer>();
      Integer integer0 = JLayeredPane.FRAME_CONTENT_LAYER;
      notifyingListAdaptor0.add(integer0);
      ListProxy<Integer> listProxy0 = new ListProxy<Integer>((NotifyingList<Integer>) notifyingListAdaptor0);
      EntryRowModel entryRowModel0 = new EntryRowModel();
      TableBridge<Integer> tableBridge0 = new TableBridge<Integer>((NotifyingList<Integer>) listProxy0, (RowModel) entryRowModel0);
      int[] intArray0 = new int[1];
      tableBridge0.remove(intArray0);
      assertEquals(0, tableBridge0.getRowCount());
      assertEquals("{}", notifyingListAdaptor0.toString());
  }
}
