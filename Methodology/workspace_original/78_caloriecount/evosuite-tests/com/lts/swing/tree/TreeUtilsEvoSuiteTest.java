/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.swing.tree;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.swing.tree.TreeUtils;
import java.util.List;
import java.util.Vector;
import javax.swing.JTree;
import javax.swing.SpinnerListModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TreeUtilsEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      TreeUtils treeUtils0 = new TreeUtils();
      assertNotNull(treeUtils0);
  }

  @Test
  public void test1()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "TWe< noe, ";
      stringArray0[1] = "TWe< noe, ";
      DefaultMutableTreeNode defaultMutableTreeNode0 = TreeUtils.buildTree(stringArray0, "TWe< noe, ");
      assertNotNull(defaultMutableTreeNode0);
      
      DefaultMutableTreeNode defaultMutableTreeNode1 = (DefaultMutableTreeNode)TreeUtils.findChildNamed("TWe< noe, ", (TreeNode) defaultMutableTreeNode0);
      assertNotNull(defaultMutableTreeNode1);
      assertEquals(1, defaultMutableTreeNode1.getSiblingCount());
      assertEquals(true, defaultMutableTreeNode1.isLeaf());
  }

  @Test
  public void test2()  throws Throwable  {
      Vector<DefaultMutableTreeNode> vector0 = new Vector<DefaultMutableTreeNode>();
      DefaultMutableTreeNode defaultMutableTreeNode0 = TreeUtils.buildTree((List) vector0);
      assertEquals(true, defaultMutableTreeNode0.isLeaf());
  }

  @Test
  public void test3()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      SpinnerListModel spinnerListModel0 = new SpinnerListModel(objectArray0);
      List<?> list0 = spinnerListModel0.getList();
      // Undeclared exception!
      try {
        TreeUtils.buildTree(list0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test4()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "TWe< noe, ";
      stringArray0[1] = "TWe< noe, ";
      DefaultMutableTreeNode defaultMutableTreeNode0 = TreeUtils.buildTree(stringArray0, "TWe< noe, ");
      assertNotNull(defaultMutableTreeNode0);
      
      DefaultMutableTreeNode defaultMutableTreeNode1 = (DefaultMutableTreeNode)TreeUtils.findChildNamed("", (TreeNode) defaultMutableTreeNode0);
      assertNull(defaultMutableTreeNode1);
      assertEquals(1, defaultMutableTreeNode0.getChildCount());
      assertEquals(1, defaultMutableTreeNode0.getDepth());
  }

  @Test
  public void test5()  throws Throwable  {
      JTree jTree0 = new JTree();
      int[] intArray0 = new int[5];
      jTree0.addSelectionRows(intArray0);
      DefaultMutableTreeNode defaultMutableTreeNode0 = (DefaultMutableTreeNode)TreeUtils.getSelectedNode(jTree0);
      assertEquals(true, defaultMutableTreeNode0.isRoot());
  }

  @Test
  public void test6()  throws Throwable  {
      JTree jTree0 = new JTree();
      Object object0 = TreeUtils.getSelectedNode(jTree0);
      assertNull(object0);
  }
}
