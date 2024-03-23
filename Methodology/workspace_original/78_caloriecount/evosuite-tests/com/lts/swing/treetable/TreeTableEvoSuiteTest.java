/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.swing.treetable;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.swing.treetable.DefaultTreeTableModel;
import com.lts.swing.treetable.TreeTable;
import com.lts.swing.treetable.TreeTableModel;
import com.lts.swing.treetable.TreeTableModelAdapter;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.util.EventObject;
import javax.swing.JTable;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreeModel;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TreeTableEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DefaultTreeTableModel defaultTreeTableModel0 = new DefaultTreeTableModel();
      TreeTable treeTable0 = new TreeTable((TreeTableModel) defaultTreeTableModel0);
      assertNotNull(treeTable0);
      
      TreeTableModelAdapter treeTableModelAdapter0 = treeTable0.getAdapter();
      assertEquals(true, treeTable0.isBackgroundSet());
      assertEquals(true, treeTable0.isForegroundSet());
      assertEquals(true, treeTable0.isFontSet());
      assertNotNull(treeTableModelAdapter0);
      assertEquals("com.lts.swing.treetable.TreeTable[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=251658568,maximumSize=,minimumSize=,preferredSize=,autoCreateColumnsFromModel=true,autoResizeMode=AUTO_RESIZE_SUBSEQUENT_COLUMNS,cellSelectionEnabled=false,editingColumn=-1,editingRow=-1,gridColor=javax.swing.plaf.ColorUIResource[r=122,g=138,b=153],preferredViewportSize=java.awt.Dimension[width=450,height=400],rowHeight=16,rowMargin=0,rowSelectionAllowed=true,selectionBackground=javax.swing.plaf.ColorUIResource[r=184,g=207,b=229],selectionForeground=sun.swing.PrintColorUIResource[r=51,g=51,b=51],showHorizontalLines=false,showVerticalLines=false]", treeTable0.toString());
  }

  @Test
  public void test1()  throws Throwable  {
      DefaultTreeTableModel defaultTreeTableModel0 = new DefaultTreeTableModel();
      TreeTable treeTable0 = new TreeTable((TreeTableModel) defaultTreeTableModel0);
      assertNotNull(treeTable0);
      
      // Undeclared exception!
      try {
        treeTable0.removeNode((MutableTreeNode) null);
        fail("Expecting exception: ClassCastException");
      } catch(ClassCastException e) {
        /*
         * com.lts.swing.treetable.DefaultTreeTableModel cannot be cast to javax.swing.tree.DefaultTreeModel
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      DefaultTreeTableModel defaultTreeTableModel0 = new DefaultTreeTableModel();
      TreeTable treeTable0 = new TreeTable((TreeTableModel) defaultTreeTableModel0);
      assertNotNull(treeTable0);
      
      TreeTable.TreeTableCellRenderer treeTable_TreeTableCellRenderer0 = treeTable0.new TreeTableCellRenderer((TreeModel) defaultTreeTableModel0);
      // Undeclared exception!
      try {
        treeTable_TreeTableCellRenderer0.print((Graphics) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      DefaultTreeTableModel defaultTreeTableModel0 = new DefaultTreeTableModel();
      TreeTable treeTable0 = new TreeTable((TreeTableModel) defaultTreeTableModel0);
      assertNotNull(treeTable0);
      
      TreeTable.TreeTableCellRenderer treeTable_TreeTableCellRenderer0 = treeTable0.new TreeTableCellRenderer((TreeModel) defaultTreeTableModel0);
      treeTable_TreeTableCellRenderer0.setSize(0, 0);
      assertEquals("com.lts.swing.treetable.TreeTable[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=251658568,maximumSize=,minimumSize=,preferredSize=,autoCreateColumnsFromModel=true,autoResizeMode=AUTO_RESIZE_SUBSEQUENT_COLUMNS,cellSelectionEnabled=false,editingColumn=-1,editingRow=-1,gridColor=javax.swing.plaf.ColorUIResource[r=122,g=138,b=153],preferredViewportSize=java.awt.Dimension[width=450,height=400],rowHeight=16,rowMargin=0,rowSelectionAllowed=true,selectionBackground=javax.swing.plaf.ColorUIResource[r=184,g=207,b=229],selectionForeground=sun.swing.PrintColorUIResource[r=51,g=51,b=51],showHorizontalLines=false,showVerticalLines=false]", treeTable0.toString());
      assertEquals(true, treeTable0.isForegroundSet());
      assertEquals("com.lts.swing.treetable.TreeTable$TreeTableCellRenderer[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=16777576,maximumSize=,minimumSize=,preferredSize=,editable=false,invokesStopCellEditing=false,largeModel=false,rootVisible=true,rowHeight=16,scrollsOnExpand=true,showsRootHandles=false,toggleClickCount=2,visibleRowCount=20]", treeTable_TreeTableCellRenderer0.toString());
      assertEquals(true, treeTable0.isBackgroundSet());
      assertEquals(true, treeTable0.isFontSet());
      assertEquals(0, treeTable_TreeTableCellRenderer0.getWidth());
  }

  @Test
  public void test4()  throws Throwable  {
      DefaultTreeTableModel defaultTreeTableModel0 = new DefaultTreeTableModel();
      TreeTable treeTable0 = new TreeTable((TreeTableModel) defaultTreeTableModel0);
      assertNotNull(treeTable0);
      
      treeTable0.addRowSelectionInterval(0, 0);
      assertEquals(1, treeTable0.getSelectedRowCount());
      
      treeTable0.getSelectedNode();
      assertEquals(16, treeTable0.getRowHeight());
  }

  @Test
  public void test5()  throws Throwable  {
      DefaultTreeTableModel defaultTreeTableModel0 = new DefaultTreeTableModel();
      TreeTable treeTable0 = new TreeTable((TreeTableModel) defaultTreeTableModel0);
      assertNotNull(treeTable0);
      
      TreeTable.TreeTableCellEditor treeTable_TreeTableCellEditor0 = treeTable0.new TreeTableCellEditor();
      TreeTable.TreeTableCellRenderer treeTable_TreeTableCellRenderer0 = (TreeTable.TreeTableCellRenderer)treeTable_TreeTableCellEditor0.getTableCellEditorComponent((JTable) treeTable0, (Object) "ButtonUI", true, 773, 773);
      assertNotNull(treeTable_TreeTableCellRenderer0);
      assertEquals(true, treeTable0.isBackgroundSet());
      assertEquals("com.lts.swing.treetable.TreeTable[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=251658568,maximumSize=,minimumSize=,preferredSize=,autoCreateColumnsFromModel=true,autoResizeMode=AUTO_RESIZE_SUBSEQUENT_COLUMNS,cellSelectionEnabled=false,editingColumn=-1,editingRow=-1,gridColor=javax.swing.plaf.ColorUIResource[r=122,g=138,b=153],preferredViewportSize=java.awt.Dimension[width=450,height=400],rowHeight=16,rowMargin=0,rowSelectionAllowed=true,selectionBackground=javax.swing.plaf.ColorUIResource[r=184,g=207,b=229],selectionForeground=sun.swing.PrintColorUIResource[r=51,g=51,b=51],showHorizontalLines=false,showVerticalLines=false]", treeTable0.toString());
      assertEquals(true, treeTable0.isForegroundSet());
      assertEquals(true, treeTable0.isFontSet());
      assertEquals(16, treeTable0.getRowHeight());
  }

  @Test
  public void test6()  throws Throwable  {
      DefaultTreeTableModel defaultTreeTableModel0 = new DefaultTreeTableModel();
      TreeTable treeTable0 = new TreeTable((TreeTableModel) defaultTreeTableModel0);
      assertNotNull(treeTable0);
      
      DefaultMutableTreeNode defaultMutableTreeNode0 = (DefaultMutableTreeNode)treeTable0.getSelectedNode();
      assertEquals(true, treeTable0.isForegroundSet());
      assertEquals("com.lts.swing.treetable.TreeTable[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=251658568,maximumSize=,minimumSize=,preferredSize=,autoCreateColumnsFromModel=true,autoResizeMode=AUTO_RESIZE_SUBSEQUENT_COLUMNS,cellSelectionEnabled=false,editingColumn=-1,editingRow=-1,gridColor=javax.swing.plaf.ColorUIResource[r=122,g=138,b=153],preferredViewportSize=java.awt.Dimension[width=450,height=400],rowHeight=16,rowMargin=0,rowSelectionAllowed=true,selectionBackground=javax.swing.plaf.ColorUIResource[r=184,g=207,b=229],selectionForeground=sun.swing.PrintColorUIResource[r=51,g=51,b=51],showHorizontalLines=false,showVerticalLines=false]", treeTable0.toString());
      assertEquals(true, treeTable0.isBackgroundSet());
      assertEquals(true, treeTable0.isFontSet());
      assertNull(defaultMutableTreeNode0);
  }

  @Test
  public void test7()  throws Throwable  {
      DefaultTreeTableModel defaultTreeTableModel0 = new DefaultTreeTableModel();
      TreeTable treeTable0 = new TreeTable((TreeTableModel) defaultTreeTableModel0);
      assertNotNull(treeTable0);
      
      treeTable0.updateUI();
      assertEquals(true, treeTable0.isFontSet());
      assertEquals("com.lts.swing.treetable.TreeTable[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=251658568,maximumSize=,minimumSize=,preferredSize=,autoCreateColumnsFromModel=true,autoResizeMode=AUTO_RESIZE_SUBSEQUENT_COLUMNS,cellSelectionEnabled=false,editingColumn=-1,editingRow=-1,gridColor=javax.swing.plaf.ColorUIResource[r=122,g=138,b=153],preferredViewportSize=java.awt.Dimension[width=450,height=400],rowHeight=16,rowMargin=0,rowSelectionAllowed=true,selectionBackground=javax.swing.plaf.ColorUIResource[r=184,g=207,b=229],selectionForeground=sun.swing.PrintColorUIResource[r=51,g=51,b=51],showHorizontalLines=false,showVerticalLines=false]", treeTable0.toString());
      assertEquals(true, treeTable0.isBackgroundSet());
      assertEquals(true, treeTable0.isForegroundSet());
  }

  @Test
  public void test8()  throws Throwable  {
      DefaultTreeTableModel defaultTreeTableModel0 = new DefaultTreeTableModel();
      TreeTable treeTable0 = new TreeTable((TreeTableModel) defaultTreeTableModel0);
      assertNotNull(treeTable0);
      
      int int0 = treeTable0.getEditingRow();
      assertEquals("com.lts.swing.treetable.TreeTable[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=251658568,maximumSize=,minimumSize=,preferredSize=,autoCreateColumnsFromModel=true,autoResizeMode=AUTO_RESIZE_SUBSEQUENT_COLUMNS,cellSelectionEnabled=false,editingColumn=-1,editingRow=-1,gridColor=javax.swing.plaf.ColorUIResource[r=122,g=138,b=153],preferredViewportSize=java.awt.Dimension[width=450,height=400],rowHeight=16,rowMargin=0,rowSelectionAllowed=true,selectionBackground=javax.swing.plaf.ColorUIResource[r=184,g=207,b=229],selectionForeground=sun.swing.PrintColorUIResource[r=51,g=51,b=51],showHorizontalLines=false,showVerticalLines=false]", treeTable0.toString());
      assertEquals(true, treeTable0.isForegroundSet());
      assertEquals((-1), int0);
      assertEquals(true, treeTable0.isFontSet());
      assertEquals(true, treeTable0.isBackgroundSet());
  }

  @Test
  public void test9()  throws Throwable  {
      DefaultTreeTableModel defaultTreeTableModel0 = new DefaultTreeTableModel();
      TreeTable treeTable0 = new TreeTable((TreeTableModel) defaultTreeTableModel0);
      assertNotNull(treeTable0);
      
      TreeTable.TreeTableCellRenderer treeTable_TreeTableCellRenderer0 = treeTable0.new TreeTableCellRenderer((TreeModel) defaultTreeTableModel0);
      treeTable_TreeTableCellRenderer0.setRowHeight(40);
      assertEquals(40, treeTable0.getRowHeight());
      assertEquals("com.lts.swing.treetable.TreeTable[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=251658568,maximumSize=,minimumSize=,preferredSize=,autoCreateColumnsFromModel=true,autoResizeMode=AUTO_RESIZE_SUBSEQUENT_COLUMNS,cellSelectionEnabled=false,editingColumn=-1,editingRow=-1,gridColor=javax.swing.plaf.ColorUIResource[r=122,g=138,b=153],preferredViewportSize=java.awt.Dimension[width=450,height=400],rowHeight=40,rowMargin=0,rowSelectionAllowed=true,selectionBackground=javax.swing.plaf.ColorUIResource[r=184,g=207,b=229],selectionForeground=sun.swing.PrintColorUIResource[r=51,g=51,b=51],showHorizontalLines=false,showVerticalLines=false]", treeTable0.toString());
  }

  @Test
  public void test10()  throws Throwable  {
      DefaultTreeTableModel defaultTreeTableModel0 = new DefaultTreeTableModel();
      TreeTable treeTable0 = new TreeTable((TreeTableModel) defaultTreeTableModel0);
      assertNotNull(treeTable0);
      
      TreeTable.TreeTableCellRenderer treeTable_TreeTableCellRenderer0 = treeTable0.new TreeTableCellRenderer((TreeModel) defaultTreeTableModel0);
      TreeTable.TreeTableCellRenderer treeTable_TreeTableCellRenderer1 = (TreeTable.TreeTableCellRenderer)treeTable_TreeTableCellRenderer0.getTableCellRendererComponent((JTable) treeTable0, (Object) treeTable_TreeTableCellRenderer0, false, false, 0, 0);
      assertEquals(true, treeTable0.isFontSet());
      assertEquals("com.lts.swing.treetable.TreeTable[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=251658568,maximumSize=,minimumSize=,preferredSize=,autoCreateColumnsFromModel=true,autoResizeMode=AUTO_RESIZE_SUBSEQUENT_COLUMNS,cellSelectionEnabled=false,editingColumn=-1,editingRow=-1,gridColor=javax.swing.plaf.ColorUIResource[r=122,g=138,b=153],preferredViewportSize=java.awt.Dimension[width=450,height=400],rowHeight=16,rowMargin=0,rowSelectionAllowed=true,selectionBackground=javax.swing.plaf.ColorUIResource[r=184,g=207,b=229],selectionForeground=sun.swing.PrintColorUIResource[r=51,g=51,b=51],showHorizontalLines=false,showVerticalLines=false]", treeTable0.toString());
      assertEquals(true, treeTable_TreeTableCellRenderer1.isBackgroundSet());
  }

  @Test
  public void test11()  throws Throwable  {
      DefaultTreeTableModel defaultTreeTableModel0 = new DefaultTreeTableModel();
      TreeTable treeTable0 = new TreeTable((TreeTableModel) defaultTreeTableModel0);
      assertNotNull(treeTable0);
      
      TreeTable.TreeTableCellRenderer treeTable_TreeTableCellRenderer0 = treeTable0.new TreeTableCellRenderer((TreeModel) defaultTreeTableModel0);
      TreeTable.TreeTableCellRenderer treeTable_TreeTableCellRenderer1 = (TreeTable.TreeTableCellRenderer)treeTable_TreeTableCellRenderer0.getTableCellRendererComponent((JTable) treeTable0, (Object) treeTable_TreeTableCellRenderer0, true, true, 0, 0);
      assertEquals(true, treeTable_TreeTableCellRenderer1.isBackgroundSet());
      assertEquals(true, treeTable0.isForegroundSet());
      assertEquals(true, treeTable0.isFontSet());
      assertEquals("com.lts.swing.treetable.TreeTable[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=251658568,maximumSize=,minimumSize=,preferredSize=,autoCreateColumnsFromModel=true,autoResizeMode=AUTO_RESIZE_SUBSEQUENT_COLUMNS,cellSelectionEnabled=false,editingColumn=-1,editingRow=-1,gridColor=javax.swing.plaf.ColorUIResource[r=122,g=138,b=153],preferredViewportSize=java.awt.Dimension[width=450,height=400],rowHeight=16,rowMargin=0,rowSelectionAllowed=true,selectionBackground=javax.swing.plaf.ColorUIResource[r=184,g=207,b=229],selectionForeground=sun.swing.PrintColorUIResource[r=51,g=51,b=51],showHorizontalLines=false,showVerticalLines=false]", treeTable0.toString());
      assertEquals(true, treeTable0.isBackgroundSet());
  }

  @Test
  public void test12()  throws Throwable  {
      DefaultTreeTableModel defaultTreeTableModel0 = new DefaultTreeTableModel();
      TreeTable treeTable0 = new TreeTable((TreeTableModel) defaultTreeTableModel0);
      assertNotNull(treeTable0);
      
      TreeTable.TreeTableCellEditor treeTable_TreeTableCellEditor0 = treeTable0.new TreeTableCellEditor();
      FocusEvent focusEvent0 = new FocusEvent((Component) treeTable0, 40, false, (Component) treeTable0);
      boolean boolean0 = treeTable_TreeTableCellEditor0.isCellEditable((EventObject) focusEvent0);
      assertEquals(false, boolean0);
      assertEquals(true, treeTable0.isFontSet());
      assertEquals(true, treeTable0.isForegroundSet());
      assertEquals(true, treeTable0.isBackgroundSet());
      assertEquals("com.lts.swing.treetable.TreeTable[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=251658568,maximumSize=,minimumSize=,preferredSize=,autoCreateColumnsFromModel=true,autoResizeMode=AUTO_RESIZE_SUBSEQUENT_COLUMNS,cellSelectionEnabled=false,editingColumn=-1,editingRow=-1,gridColor=javax.swing.plaf.ColorUIResource[r=122,g=138,b=153],preferredViewportSize=java.awt.Dimension[width=450,height=400],rowHeight=16,rowMargin=0,rowSelectionAllowed=true,selectionBackground=javax.swing.plaf.ColorUIResource[r=184,g=207,b=229],selectionForeground=sun.swing.PrintColorUIResource[r=51,g=51,b=51],showHorizontalLines=false,showVerticalLines=false]", treeTable0.toString());
  }

  @Test
  public void test13()  throws Throwable  {
      DefaultTreeTableModel defaultTreeTableModel0 = new DefaultTreeTableModel();
      TreeTable treeTable0 = new TreeTable((TreeTableModel) defaultTreeTableModel0);
      assertNotNull(treeTable0);
      
      treeTable0.changeSelection(17, 17, false, false);
      treeTable0.clearSelection();
      assertEquals("com.lts.swing.treetable.TreeTable[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=251658568,maximumSize=,minimumSize=,preferredSize=,autoCreateColumnsFromModel=true,autoResizeMode=AUTO_RESIZE_SUBSEQUENT_COLUMNS,cellSelectionEnabled=false,editingColumn=-1,editingRow=-1,gridColor=javax.swing.plaf.ColorUIResource[r=122,g=138,b=153],preferredViewportSize=java.awt.Dimension[width=450,height=400],rowHeight=16,rowMargin=0,rowSelectionAllowed=true,selectionBackground=javax.swing.plaf.ColorUIResource[r=184,g=207,b=229],selectionForeground=sun.swing.PrintColorUIResource[r=51,g=51,b=51],showHorizontalLines=false,showVerticalLines=false]", treeTable0.toString());
      assertEquals(true, treeTable0.isForegroundSet());
      assertEquals(true, treeTable0.isFontSet());
  }
}
