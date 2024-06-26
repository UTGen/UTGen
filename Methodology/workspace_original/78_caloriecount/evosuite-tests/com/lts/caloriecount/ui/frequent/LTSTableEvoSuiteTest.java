/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.caloriecount.ui.frequent;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.caloriecount.ui.dnd.JTableDragAndDrop;
import com.lts.caloriecount.ui.frequent.FrequentTableDragAndDrop;
import com.lts.caloriecount.ui.frequent.LTSTable;
import java.awt.Component;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.JPopupMenu;
import javax.swing.JToggleButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.text.StyledEditorKit;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class LTSTableEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      LTSTable lTSTable0 = new LTSTable();
      assertNotNull(lTSTable0);
      
      lTSTable0.getActionEvent();
      assertEquals("com.lts.caloriecount.ui.frequent.LTSTable[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=251658568,maximumSize=,minimumSize=,preferredSize=,autoCreateColumnsFromModel=true,autoResizeMode=AUTO_RESIZE_SUBSEQUENT_COLUMNS,cellSelectionEnabled=false,editingColumn=-1,editingRow=-1,gridColor=javax.swing.plaf.ColorUIResource[r=122,g=138,b=153],preferredViewportSize=java.awt.Dimension[width=450,height=400],rowHeight=16,rowMargin=1,rowSelectionAllowed=true,selectionBackground=javax.swing.plaf.ColorUIResource[r=184,g=207,b=229],selectionForeground=sun.swing.PrintColorUIResource[r=51,g=51,b=51],showHorizontalLines=true,showVerticalLines=true]", lTSTable0.toString());
  }

  @Test
  public void test1()  throws Throwable  {
      LTSTable lTSTable0 = new LTSTable();
      assertNotNull(lTSTable0);
      
      lTSTable0.keyDelete();
      assertEquals("com.lts.caloriecount.ui.frequent.LTSTable[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=251658568,maximumSize=,minimumSize=,preferredSize=,autoCreateColumnsFromModel=true,autoResizeMode=AUTO_RESIZE_SUBSEQUENT_COLUMNS,cellSelectionEnabled=false,editingColumn=-1,editingRow=-1,gridColor=javax.swing.plaf.ColorUIResource[r=122,g=138,b=153],preferredViewportSize=java.awt.Dimension[width=450,height=400],rowHeight=16,rowMargin=1,rowSelectionAllowed=true,selectionBackground=javax.swing.plaf.ColorUIResource[r=184,g=207,b=229],selectionForeground=sun.swing.PrintColorUIResource[r=51,g=51,b=51],showHorizontalLines=true,showVerticalLines=true]", lTSTable0.toString());
  }

  @Test
  public void test2()  throws Throwable  {
      LTSTable lTSTable0 = new LTSTable();
      assertNotNull(lTSTable0);
      
      lTSTable0.mouseSingle();
      assertEquals("com.lts.caloriecount.ui.frequent.LTSTable[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=251658568,maximumSize=,minimumSize=,preferredSize=,autoCreateColumnsFromModel=true,autoResizeMode=AUTO_RESIZE_SUBSEQUENT_COLUMNS,cellSelectionEnabled=false,editingColumn=-1,editingRow=-1,gridColor=javax.swing.plaf.ColorUIResource[r=122,g=138,b=153],preferredViewportSize=java.awt.Dimension[width=450,height=400],rowHeight=16,rowMargin=1,rowSelectionAllowed=true,selectionBackground=javax.swing.plaf.ColorUIResource[r=184,g=207,b=229],selectionForeground=sun.swing.PrintColorUIResource[r=51,g=51,b=51],showHorizontalLines=true,showVerticalLines=true]", lTSTable0.toString());
  }

  @Test
  public void test3()  throws Throwable  {
      LTSTable lTSTable0 = new LTSTable();
      assertNotNull(lTSTable0);
      assertEquals("com.lts.caloriecount.ui.frequent.LTSTable[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=251658568,maximumSize=,minimumSize=,preferredSize=,autoCreateColumnsFromModel=true,autoResizeMode=AUTO_RESIZE_SUBSEQUENT_COLUMNS,cellSelectionEnabled=false,editingColumn=-1,editingRow=-1,gridColor=javax.swing.plaf.ColorUIResource[r=122,g=138,b=153],preferredViewportSize=java.awt.Dimension[width=450,height=400],rowHeight=16,rowMargin=1,rowSelectionAllowed=true,selectionBackground=javax.swing.plaf.ColorUIResource[r=184,g=207,b=229],selectionForeground=sun.swing.PrintColorUIResource[r=51,g=51,b=51],showHorizontalLines=true,showVerticalLines=true]", lTSTable0.toString());
      
      lTSTable0.mapKey(6, "", (Action) null);
      assertEquals("com.lts.caloriecount.ui.frequent.LTSTable[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=251658600,maximumSize=,minimumSize=,preferredSize=,autoCreateColumnsFromModel=true,autoResizeMode=AUTO_RESIZE_SUBSEQUENT_COLUMNS,cellSelectionEnabled=false,editingColumn=-1,editingRow=-1,gridColor=javax.swing.plaf.ColorUIResource[r=122,g=138,b=153],preferredViewportSize=java.awt.Dimension[width=450,height=400],rowHeight=16,rowMargin=1,rowSelectionAllowed=true,selectionBackground=javax.swing.plaf.ColorUIResource[r=184,g=207,b=229],selectionForeground=sun.swing.PrintColorUIResource[r=51,g=51,b=51],showHorizontalLines=true,showVerticalLines=true]", lTSTable0.toString());
  }

  @Test
  public void test4()  throws Throwable  {
      LTSTable lTSTable0 = new LTSTable();
      assertNotNull(lTSTable0);
      
      lTSTable0.setPopupMenu((JPopupMenu) null);
      assertEquals("com.lts.caloriecount.ui.frequent.LTSTable[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=251658568,maximumSize=,minimumSize=,preferredSize=,autoCreateColumnsFromModel=true,autoResizeMode=AUTO_RESIZE_SUBSEQUENT_COLUMNS,cellSelectionEnabled=false,editingColumn=-1,editingRow=-1,gridColor=javax.swing.plaf.ColorUIResource[r=122,g=138,b=153],preferredViewportSize=java.awt.Dimension[width=450,height=400],rowHeight=16,rowMargin=1,rowSelectionAllowed=true,selectionBackground=javax.swing.plaf.ColorUIResource[r=184,g=207,b=229],selectionForeground=sun.swing.PrintColorUIResource[r=51,g=51,b=51],showHorizontalLines=true,showVerticalLines=true]", lTSTable0.toString());
  }

  @Test
  public void test5()  throws Throwable  {
      LTSTable lTSTable0 = new LTSTable();
      assertNotNull(lTSTable0);
      
      int[] intArray0 = new int[2];
      lTSTable0.selectRows(intArray0);
      assertEquals("com.lts.caloriecount.ui.frequent.LTSTable[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=251658568,maximumSize=,minimumSize=,preferredSize=,autoCreateColumnsFromModel=true,autoResizeMode=AUTO_RESIZE_SUBSEQUENT_COLUMNS,cellSelectionEnabled=false,editingColumn=-1,editingRow=-1,gridColor=javax.swing.plaf.ColorUIResource[r=122,g=138,b=153],preferredViewportSize=java.awt.Dimension[width=450,height=400],rowHeight=16,rowMargin=1,rowSelectionAllowed=true,selectionBackground=javax.swing.plaf.ColorUIResource[r=184,g=207,b=229],selectionForeground=sun.swing.PrintColorUIResource[r=51,g=51,b=51],showHorizontalLines=true,showVerticalLines=true]", lTSTable0.toString());
  }

  @Test
  public void test6()  throws Throwable  {
      LTSTable lTSTable0 = new LTSTable();
      assertNotNull(lTSTable0);
      
      lTSTable0.keyInsert();
      assertEquals("com.lts.caloriecount.ui.frequent.LTSTable[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=251658568,maximumSize=,minimumSize=,preferredSize=,autoCreateColumnsFromModel=true,autoResizeMode=AUTO_RESIZE_SUBSEQUENT_COLUMNS,cellSelectionEnabled=false,editingColumn=-1,editingRow=-1,gridColor=javax.swing.plaf.ColorUIResource[r=122,g=138,b=153],preferredViewportSize=java.awt.Dimension[width=450,height=400],rowHeight=16,rowMargin=1,rowSelectionAllowed=true,selectionBackground=javax.swing.plaf.ColorUIResource[r=184,g=207,b=229],selectionForeground=sun.swing.PrintColorUIResource[r=51,g=51,b=51],showHorizontalLines=true,showVerticalLines=true]", lTSTable0.toString());
  }

  @Test
  public void test7()  throws Throwable  {
      LTSTable lTSTable0 = new LTSTable();
      assertNotNull(lTSTable0);
      
      DefaultTableModel defaultTableModel0 = (DefaultTableModel)lTSTable0.getModel();
      LTSTable lTSTable1 = new LTSTable((TableModel) defaultTableModel0);
      assertEquals("com.lts.caloriecount.ui.frequent.LTSTable[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=251658568,maximumSize=,minimumSize=,preferredSize=,autoCreateColumnsFromModel=true,autoResizeMode=AUTO_RESIZE_SUBSEQUENT_COLUMNS,cellSelectionEnabled=false,editingColumn=-1,editingRow=-1,gridColor=javax.swing.plaf.ColorUIResource[r=122,g=138,b=153],preferredViewportSize=java.awt.Dimension[width=450,height=400],rowHeight=16,rowMargin=1,rowSelectionAllowed=true,selectionBackground=javax.swing.plaf.ColorUIResource[r=184,g=207,b=229],selectionForeground=sun.swing.PrintColorUIResource[r=51,g=51,b=51],showHorizontalLines=true,showVerticalLines=true]", lTSTable1.toString());
      assertNotNull(lTSTable1);
      assertEquals("com.lts.caloriecount.ui.frequent.LTSTable[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=251658568,maximumSize=,minimumSize=,preferredSize=,autoCreateColumnsFromModel=true,autoResizeMode=AUTO_RESIZE_SUBSEQUENT_COLUMNS,cellSelectionEnabled=false,editingColumn=-1,editingRow=-1,gridColor=javax.swing.plaf.ColorUIResource[r=122,g=138,b=153],preferredViewportSize=java.awt.Dimension[width=450,height=400],rowHeight=16,rowMargin=1,rowSelectionAllowed=true,selectionBackground=javax.swing.plaf.ColorUIResource[r=184,g=207,b=229],selectionForeground=sun.swing.PrintColorUIResource[r=51,g=51,b=51],showHorizontalLines=true,showVerticalLines=true]", lTSTable0.toString());
  }

  @Test
  public void test8()  throws Throwable  {
      LTSTable lTSTable0 = new LTSTable();
      assertNotNull(lTSTable0);
      
      lTSTable0.getPopupMenu();
      assertEquals("com.lts.caloriecount.ui.frequent.LTSTable[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=251658568,maximumSize=,minimumSize=,preferredSize=,autoCreateColumnsFromModel=true,autoResizeMode=AUTO_RESIZE_SUBSEQUENT_COLUMNS,cellSelectionEnabled=false,editingColumn=-1,editingRow=-1,gridColor=javax.swing.plaf.ColorUIResource[r=122,g=138,b=153],preferredViewportSize=java.awt.Dimension[width=450,height=400],rowHeight=16,rowMargin=1,rowSelectionAllowed=true,selectionBackground=javax.swing.plaf.ColorUIResource[r=184,g=207,b=229],selectionForeground=sun.swing.PrintColorUIResource[r=51,g=51,b=51],showHorizontalLines=true,showVerticalLines=true]", lTSTable0.toString());
  }

  @Test
  public void test9()  throws Throwable  {
      LTSTable lTSTable0 = new LTSTable();
      assertNotNull(lTSTable0);
      
      lTSTable0.getDragAndDropHandler();
      assertEquals("com.lts.caloriecount.ui.frequent.LTSTable[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=251658568,maximumSize=,minimumSize=,preferredSize=,autoCreateColumnsFromModel=true,autoResizeMode=AUTO_RESIZE_SUBSEQUENT_COLUMNS,cellSelectionEnabled=false,editingColumn=-1,editingRow=-1,gridColor=javax.swing.plaf.ColorUIResource[r=122,g=138,b=153],preferredViewportSize=java.awt.Dimension[width=450,height=400],rowHeight=16,rowMargin=1,rowSelectionAllowed=true,selectionBackground=javax.swing.plaf.ColorUIResource[r=184,g=207,b=229],selectionForeground=sun.swing.PrintColorUIResource[r=51,g=51,b=51],showHorizontalLines=true,showVerticalLines=true]", lTSTable0.toString());
  }

  @Test
  public void test10()  throws Throwable  {
      LTSTable lTSTable0 = new LTSTable();
      assertNotNull(lTSTable0);
      
      lTSTable0.selectRow(10);
      assertEquals("com.lts.caloriecount.ui.frequent.LTSTable[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=251658568,maximumSize=,minimumSize=,preferredSize=,autoCreateColumnsFromModel=true,autoResizeMode=AUTO_RESIZE_SUBSEQUENT_COLUMNS,cellSelectionEnabled=false,editingColumn=-1,editingRow=-1,gridColor=javax.swing.plaf.ColorUIResource[r=122,g=138,b=153],preferredViewportSize=java.awt.Dimension[width=450,height=400],rowHeight=16,rowMargin=1,rowSelectionAllowed=true,selectionBackground=javax.swing.plaf.ColorUIResource[r=184,g=207,b=229],selectionForeground=sun.swing.PrintColorUIResource[r=51,g=51,b=51],showHorizontalLines=true,showVerticalLines=true]", lTSTable0.toString());
  }

  @Test
  public void test11()  throws Throwable  {
      LTSTable lTSTable0 = new LTSTable();
      assertNotNull(lTSTable0);
      
      lTSTable0.keyEnter();
      assertEquals("com.lts.caloriecount.ui.frequent.LTSTable[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=251658568,maximumSize=,minimumSize=,preferredSize=,autoCreateColumnsFromModel=true,autoResizeMode=AUTO_RESIZE_SUBSEQUENT_COLUMNS,cellSelectionEnabled=false,editingColumn=-1,editingRow=-1,gridColor=javax.swing.plaf.ColorUIResource[r=122,g=138,b=153],preferredViewportSize=java.awt.Dimension[width=450,height=400],rowHeight=16,rowMargin=1,rowSelectionAllowed=true,selectionBackground=javax.swing.plaf.ColorUIResource[r=184,g=207,b=229],selectionForeground=sun.swing.PrintColorUIResource[r=51,g=51,b=51],showHorizontalLines=true,showVerticalLines=true]", lTSTable0.toString());
  }

  @Test
  public void test12()  throws Throwable  {
      LTSTable lTSTable0 = new LTSTable();
      assertNotNull(lTSTable0);
      
      FrequentTableDragAndDrop frequentTableDragAndDrop0 = new FrequentTableDragAndDrop();
      // Undeclared exception!
      try {
        lTSTable0.setDragAndDropHandler((JTableDragAndDrop) frequentTableDragAndDrop0);
        fail("Expecting exception: HeadlessException");
      } catch(HeadlessException e) {
      }
  }

  @Test
  public void test13()  throws Throwable  {
      LTSTable lTSTable0 = new LTSTable();
      assertNotNull(lTSTable0);
      
      lTSTable0.mouseDouble();
      assertEquals("com.lts.caloriecount.ui.frequent.LTSTable[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=251658568,maximumSize=,minimumSize=,preferredSize=,autoCreateColumnsFromModel=true,autoResizeMode=AUTO_RESIZE_SUBSEQUENT_COLUMNS,cellSelectionEnabled=false,editingColumn=-1,editingRow=-1,gridColor=javax.swing.plaf.ColorUIResource[r=122,g=138,b=153],preferredViewportSize=java.awt.Dimension[width=450,height=400],rowHeight=16,rowMargin=1,rowSelectionAllowed=true,selectionBackground=javax.swing.plaf.ColorUIResource[r=184,g=207,b=229],selectionForeground=sun.swing.PrintColorUIResource[r=51,g=51,b=51],showHorizontalLines=true,showVerticalLines=true]", lTSTable0.toString());
  }

  @Test
  public void test14()  throws Throwable  {
      LTSTable lTSTable0 = new LTSTable();
      assertNotNull(lTSTable0);
      
      ActionEvent actionEvent0 = new ActionEvent((Object) "{rpx}FikYm", 10, "{rpx}FikYm", (long) 10, 10);
      lTSTable0.setActionEvent(actionEvent0);
      assertEquals("com.lts.caloriecount.ui.frequent.LTSTable[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=251658568,maximumSize=,minimumSize=,preferredSize=,autoCreateColumnsFromModel=true,autoResizeMode=AUTO_RESIZE_SUBSEQUENT_COLUMNS,cellSelectionEnabled=false,editingColumn=-1,editingRow=-1,gridColor=javax.swing.plaf.ColorUIResource[r=122,g=138,b=153],preferredViewportSize=java.awt.Dimension[width=450,height=400],rowHeight=16,rowMargin=1,rowSelectionAllowed=true,selectionBackground=javax.swing.plaf.ColorUIResource[r=184,g=207,b=229],selectionForeground=sun.swing.PrintColorUIResource[r=51,g=51,b=51],showHorizontalLines=true,showVerticalLines=true]", lTSTable0.toString());
  }

  @Test
  public void test15()  throws Throwable  {
      LTSTable lTSTable0 = new LTSTable();
      assertNotNull(lTSTable0);
      
      StyledEditorKit.BoldAction styledEditorKit_BoldAction0 = new StyledEditorKit.BoldAction();
      JToggleButton jToggleButton0 = new JToggleButton((Action) styledEditorKit_BoldAction0);
      lTSTable0.mouseShowPopup((Component) jToggleButton0, 11, 11);
      assertEquals("com.lts.caloriecount.ui.frequent.LTSTable[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=251658568,maximumSize=,minimumSize=,preferredSize=,autoCreateColumnsFromModel=true,autoResizeMode=AUTO_RESIZE_SUBSEQUENT_COLUMNS,cellSelectionEnabled=false,editingColumn=-1,editingRow=-1,gridColor=javax.swing.plaf.ColorUIResource[r=122,g=138,b=153],preferredViewportSize=java.awt.Dimension[width=450,height=400],rowHeight=16,rowMargin=1,rowSelectionAllowed=true,selectionBackground=javax.swing.plaf.ColorUIResource[r=184,g=207,b=229],selectionForeground=sun.swing.PrintColorUIResource[r=51,g=51,b=51],showHorizontalLines=true,showVerticalLines=true]", lTSTable0.toString());
  }

  @Test
  public void test16()  throws Throwable  {
      LTSTable lTSTable0 = new LTSTable();
      assertNotNull(lTSTable0);
      
      lTSTable0.initialize();
      assertEquals("com.lts.caloriecount.ui.frequent.LTSTable[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=251658568,maximumSize=,minimumSize=,preferredSize=,autoCreateColumnsFromModel=true,autoResizeMode=AUTO_RESIZE_SUBSEQUENT_COLUMNS,cellSelectionEnabled=false,editingColumn=-1,editingRow=-1,gridColor=javax.swing.plaf.ColorUIResource[r=122,g=138,b=153],preferredViewportSize=java.awt.Dimension[width=450,height=400],rowHeight=16,rowMargin=1,rowSelectionAllowed=true,selectionBackground=javax.swing.plaf.ColorUIResource[r=184,g=207,b=229],selectionForeground=sun.swing.PrintColorUIResource[r=51,g=51,b=51],showHorizontalLines=true,showVerticalLines=true]", lTSTable0.toString());
  }
}
