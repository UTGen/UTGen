/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.swing.editlist;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.swing.SimpleListModel;
import com.lts.swing.editlist.EditListPanel;
import java.awt.HeadlessException;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.util.List;
import java.util.Vector;
import javax.swing.JButton;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class EditListPanelEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Vector<String> vector0 = new Vector<String>();
      EditListPanel editListPanel0 = new EditListPanel((List) vector0);
      assertEquals(3, editListPanel0.getButtonPosition());
      assertNotNull(editListPanel0);
  }

  @Test
  public void test1()  throws Throwable  {
      EditListPanel editListPanel0 = new EditListPanel("");
      assertNotNull(editListPanel0);
      
      editListPanel0.setConfirmDeletes(true);
      assertEquals(3, editListPanel0.getButtonPosition());
      assertEquals(1, editListPanel0.getGridx());
  }

  @Test
  public void test2()  throws Throwable  {
      EditListPanel editListPanel0 = new EditListPanel("");
      assertNotNull(editListPanel0);
      
      int int0 = editListPanel0.userMoveDown(994);
      assertEquals(3, editListPanel0.getButtonPosition());
      assertEquals(994, int0);
  }

  @Test
  public void test3()  throws Throwable  {
      EditListPanel editListPanel0 = new EditListPanel("deleteAction");
      assertNotNull(editListPanel0);
      
      ActionEvent actionEvent0 = new ActionEvent((Object) "verticalTextPosition", (-1924), "deleteAction");
      editListPanel0.downButtonEvent(actionEvent0);
      assertEquals(3, editListPanel0.getButtonPosition());
  }

  @Test
  public void test4()  throws Throwable  {
      EditListPanel editListPanel0 = new EditListPanel((-9));
      assertNotNull(editListPanel0);
      
      ActionEvent actionEvent0 = new ActionEvent((Object) "[]", (-9), "[]", (long) (-9), (-9));
      editListPanel0.upButtonEvent(actionEvent0);
      assertEquals(-9, editListPanel0.getButtonPosition());
  }

  @Test
  public void test5()  throws Throwable  {
      EditListPanel editListPanel0 = new EditListPanel((List) null, 1274);
      assertNotNull(editListPanel0);
      
      // Undeclared exception!
      try {
        editListPanel0.userEditElement((Object) null);
        fail("Expecting exception: HeadlessException");
      } catch(HeadlessException e) {
      }
  }

  @Test
  public void test6()  throws Throwable  {
      EditListPanel editListPanel0 = new EditListPanel(15);
      assertNotNull(editListPanel0);
      
      ActionEvent actionEvent0 = new ActionEvent((Object) "1111", 15, "1111", (long) 15, 15);
      // Undeclared exception!
      try {
        editListPanel0.deleteButtonAction(actionEvent0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test
  public void test7()  throws Throwable  {
      EditListPanel editListPanel0 = new EditListPanel(1);
      assertNotNull(editListPanel0);
      
      JButton jButton0 = editListPanel0.createDeleteButton();
      editListPanel0.setAddButton(jButton0);
      assertEquals(1, editListPanel0.getButtonPosition());
  }

  @Test
  public void test8()  throws Throwable  {
      EditListPanel editListPanel0 = new EditListPanel();
      assertNotNull(editListPanel0);
      
      int int0 = editListPanel0.userMoveUp(2);
      assertEquals(1, int0);
      assertEquals(3, editListPanel0.getButtonPosition());
  }

  @Test
  public void test9()  throws Throwable  {
      EditListPanel editListPanel0 = new EditListPanel(0);
      assertNotNull(editListPanel0);
      
      ActionEvent actionEvent0 = new ActionEvent((Object) "[]", 0, "[]", (-14L), 163);
      // Undeclared exception!
      try {
        editListPanel0.addButtonAction(actionEvent0);
        fail("Expecting exception: HeadlessException");
      } catch(HeadlessException e) {
      }
  }

  @Test
  public void test10()  throws Throwable  {
      EditListPanel editListPanel0 = new EditListPanel("deleteAction");
      assertNotNull(editListPanel0);
      
      editListPanel0.getAddButton();
      assertEquals(3, editListPanel0.getButtonPosition());
  }

  @Test
  public void test11()  throws Throwable  {
      EditListPanel editListPanel0 = new EditListPanel("");
      assertNotNull(editListPanel0);
      
      // Undeclared exception!
      try {
        editListPanel0.userEditElement((Object) "printer-is-accepting-jobs");
        fail("Expecting exception: HeadlessException");
      } catch(HeadlessException e) {
      }
  }

  @Test
  public void test12()  throws Throwable  {
      EditListPanel editListPanel0 = new EditListPanel(0);
      assertNotNull(editListPanel0);
      
      int int0 = editListPanel0.userMoveUp(0);
      assertEquals(0, int0);
      assertEquals(2, editListPanel0.countComponents());
      assertEquals(0, editListPanel0.getButtonPosition());
  }

  @Test
  public void test13()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      Object object0 = RenderingHints.VALUE_INTERPOLATION_BICUBIC;
      objectArray0[1] = object0;
      objectArray0[3] = objectArray0[1];
      SimpleListModel simpleListModel0 = new SimpleListModel(objectArray0);
      List<Object> list0 = simpleListModel0.asList();
      EditListPanel editListPanel0 = new EditListPanel((List) list0, 0);
      assertNotNull(editListPanel0);
      
      int int0 = editListPanel0.userMoveDown(0);
      assertEquals(2, editListPanel0.getListSize());
      assertEquals(0, editListPanel0.getButtonPosition());
      assertEquals(1, int0);
  }

  @Test
  public void test14()  throws Throwable  {
      EditListPanel editListPanel0 = new EditListPanel((-9));
      assertNotNull(editListPanel0);
      
      ActionEvent actionEvent0 = new ActionEvent((Object) "[]", (-9), "[]", (long) (-9), (-9));
      editListPanel0.editButtonAction(actionEvent0);
      assertEquals(-9, editListPanel0.getButtonPosition());
  }

  @Test
  public void test15()  throws Throwable  {
      EditListPanel editListPanel0 = new EditListPanel(2);
      assertNotNull(editListPanel0);
      assertEquals(2, editListPanel0.getButtonPosition());
  }
}
