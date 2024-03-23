/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.swing.table.dragndrop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.swing.table.dragndrop.example.ExampleModel;
import java.lang.reflect.Array;
import javax.swing.JTable;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TableModelAdaptorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ExampleModel exampleModel0 = new ExampleModel();
      JTable jTable0 = new JTable((TableModel) exampleModel0);
      assertEquals(0, jTable0.getWidth());
  }

  @Test
  public void test1()  throws Throwable  {
      ExampleModel exampleModel0 = new ExampleModel();
      JTable jTable0 = new JTable();
      exampleModel0.removeTableModelListener((TableModelListener) jTable0);
      assertEquals(true, jTable0.isVisible());
  }

  @Test
  public void test2()  throws Throwable  {
      ExampleModel exampleModel0 = new ExampleModel();
      Class<?>[] classArray0 = (Class<?>[]) Array.newInstance(Class.class, 10);
      exampleModel0.setColumnClasses(classArray0);
      Class<?> class0 = exampleModel0.getColumnClass(1);
      assertNull(class0);
  }

  @Test
  public void test3()  throws Throwable  {
      ExampleModel exampleModel0 = new ExampleModel();
      String[] stringArray0 = new String[10];
      exampleModel0.setColumnNames(stringArray0);
      assertEquals(10, exampleModel0.getColumnCount());
  }

  @Test
  public void test4()  throws Throwable  {
      ExampleModel exampleModel0 = new ExampleModel();
      boolean[] booleanArray0 = new boolean[1];
      exampleModel0.setColumnEditable(booleanArray0);
      // Undeclared exception!
      try {
        exampleModel0.isCellEditable((-1133), 155);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * 155
         */
      }
  }

  @Test
  public void test5()  throws Throwable  {
      ExampleModel exampleModel0 = new ExampleModel();
      Class<?> class0 = exampleModel0.getColumnClass(1);
      assertEquals(false, class0.isInterface());
  }

  @Test
  public void test6()  throws Throwable  {
      ExampleModel exampleModel0 = new ExampleModel();
      boolean boolean0 = exampleModel0.isCellEditable(866, 613);
      assertEquals(true, boolean0);
  }
}
