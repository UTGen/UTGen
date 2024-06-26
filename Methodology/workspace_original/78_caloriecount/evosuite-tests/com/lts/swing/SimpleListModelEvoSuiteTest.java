/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.swing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.swing.SimpleListModel;
import java.util.List;
import javax.swing.SpinnerListModel;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class SimpleListModelEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      SimpleListModel simpleListModel0 = new SimpleListModel((List) null);
      assertNotNull(simpleListModel0);
      
      simpleListModel0.add((Object) "UPPER_RIGHT_CORNER");
      simpleListModel0.addSorted(", was not recognized.");
      assertEquals(2, simpleListModel0.getSize());
      assertEquals("[, was not recognized., UPPER_RIGHT_CORNER]", simpleListModel0.toString());
  }

  @Test
  public void test1()  throws Throwable  {
      SimpleListModel simpleListModel0 = new SimpleListModel();
      List<Object> list0 = simpleListModel0.asList();
      simpleListModel0.setElements(list0);
      assertEquals(true, list0.isEmpty());
  }

  @Test
  public void test2()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      SimpleListModel simpleListModel0 = new SimpleListModel(objectArray0);
      assertNotNull(simpleListModel0);
      
      SpinnerListModel spinnerListModel0 = new SpinnerListModel();
      List<?> list0 = spinnerListModel0.getList();
      simpleListModel0.addAll(list0);
      assertEquals(5, simpleListModel0.getSize());
      assertEquals("[null, null, null, null, empty]", simpleListModel0.toString());
  }

  @Test
  public void test3()  throws Throwable  {
      SimpleListModel simpleListModel0 = new SimpleListModel((Object[]) null);
      // Undeclared exception!
      try {
        simpleListModel0.moveElementDown((-1798));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test
  public void test4()  throws Throwable  {
      SimpleListModel simpleListModel0 = new SimpleListModel();
      List<Object> list0 = simpleListModel0.copyToFileList();
      assertEquals(true, list0.isEmpty());
  }

  @Test
  public void test5()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      SimpleListModel simpleListModel0 = new SimpleListModel();
      simpleListModel0.initialize(objectArray0);
      // Undeclared exception!
      try {
        simpleListModel0.copyToFileList();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test6()  throws Throwable  {
      SimpleListModel simpleListModel0 = new SimpleListModel();
      simpleListModel0.add(0, (Object) "SwingLargeIconKey");
      List<Object> list0 = simpleListModel0.copyToList();
      assertNotNull(list0);
      assertEquals(1, list0.size());
  }

  @Test
  public void test7()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      SimpleListModel simpleListModel0 = new SimpleListModel(objectArray0);
      assertNotNull(simpleListModel0);
      
      int[] intArray0 = new int[3];
      simpleListModel0.remove(intArray0);
      assertEquals("[null]", simpleListModel0.toString());
      assertEquals(1, simpleListModel0.getSize());
  }

  @Test
  public void test8()  throws Throwable  {
      SimpleListModel simpleListModel0 = new SimpleListModel();
      // Undeclared exception!
      try {
        simpleListModel0.moveElementUp(1690);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * 1690 >= 0
         */
      }
  }

  @Test
  public void test9()  throws Throwable  {
      SimpleListModel simpleListModel0 = new SimpleListModel();
      simpleListModel0.moveElementUp((-1));
      assertEquals("[]", simpleListModel0.toString());
  }

  @Test
  public void test10()  throws Throwable  {
      SimpleListModel simpleListModel0 = new SimpleListModel();
      simpleListModel0.moveElementDown(516);
      assertEquals(0, simpleListModel0.getSize());
  }

  @Test
  public void test11()  throws Throwable  {
      SimpleListModel simpleListModel0 = new SimpleListModel((List) null);
      assertNotNull(simpleListModel0);
      
      simpleListModel0.add((Object) "UPPER_RIGHT_CORNER");
      simpleListModel0.addSorted("UPPER_RIGHT_CORNER");
      assertEquals(2, simpleListModel0.size());
      assertEquals(2, simpleListModel0.getSize());
  }
}
