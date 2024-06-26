/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.caloriecount.ui.entry;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.caloriecount.ui.entry.EntryRowModel;
import java.util.Comparator;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class EntryRowModelEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      EntryRowModel entryRowModel0 = new EntryRowModel();
      // Undeclared exception!
      try {
        entryRowModel0.getValueAt(0, (Object) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      EntryRowModel entryRowModel0 = new EntryRowModel();
      entryRowModel0.setValueAt(0, (Object) "AcceleratorKey", 0, (Object) "AcceleratorKey");
      assertEquals(false, entryRowModel0.getShowTimeOnly());
  }

  @Test
  public void test2()  throws Throwable  {
      EntryRowModel entryRowModel0 = new EntryRowModel();
      entryRowModel0.setShowTimeOnly(true);
      // Undeclared exception!
      try {
        entryRowModel0.getValueAt(0, (Object) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      EntryRowModel entryRowModel0 = new EntryRowModel();
      String[] stringArray0 = entryRowModel0.getColumnNames();
      // Undeclared exception!
      try {
        entryRowModel0.compareRows((Object) null, (Object) stringArray0);
        fail("Expecting exception: ClassCastException");
      } catch(ClassCastException e) {
        /*
         * [Ljava.lang.String; cannot be cast to com.lts.caloriecount.data.entry.Entry
         */
      }
  }

  @Test
  public void test4()  throws Throwable  {
      EntryRowModel entryRowModel0 = new EntryRowModel();
      String string0 = entryRowModel0.getColumnName(0);
      assertEquals("Time", string0);
      assertNotNull(string0);
  }

  @Test
  public void test5()  throws Throwable  {
      EntryRowModel entryRowModel0 = new EntryRowModel();
      Class<Object> class0 = entryRowModel0.getColumnClass(0);
      assertNotNull(class0);
      assertEquals("java.lang.String", class0.getCanonicalName());
  }

  @Test
  public void test6()  throws Throwable  {
      EntryRowModel entryRowModel0 = new EntryRowModel();
      Comparator<Object> comparator0 = entryRowModel0.getComparator();
      assertNull(comparator0);
  }

  @Test
  public void test7()  throws Throwable  {
      EntryRowModel entryRowModel0 = new EntryRowModel();
      int int0 = entryRowModel0.getColumnCount();
      assertEquals(3, int0);
  }

  @Test
  public void test8()  throws Throwable  {
      EntryRowModel entryRowModel0 = new EntryRowModel();
      boolean boolean0 = entryRowModel0.isColumnEditable(0);
      assertEquals(false, boolean0);
  }

  @Test
  public void test9()  throws Throwable  {
      EntryRowModel entryRowModel0 = new EntryRowModel();
      Object object0 = entryRowModel0.getValueAt(3, (Object) null);
      assertNull(object0);
  }

  @Test
  public void test10()  throws Throwable  {
      EntryRowModel entryRowModel0 = new EntryRowModel();
      // Undeclared exception!
      try {
        entryRowModel0.getValueAt(1, (Object) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
