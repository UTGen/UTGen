/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.util.DepthFirstTreeIterator;
import com.lts.util.TreeNode;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class DepthFirstTreeIteratorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Object object0 = new Object();
      TreeNode treeNode0 = new TreeNode(object0);
      DepthFirstTreeIterator depthFirstTreeIterator0 = new DepthFirstTreeIterator(treeNode0);
      assertNotNull(depthFirstTreeIterator0);
      
      depthFirstTreeIterator0.setCurrent(treeNode0);
      assertEquals(true, depthFirstTreeIterator0.hasNext());
  }

  @Test
  public void test1()  throws Throwable  {
      TreeNode treeNode0 = new TreeNode();
      DepthFirstTreeIterator depthFirstTreeIterator0 = new DepthFirstTreeIterator(treeNode0);
      assertNotNull(depthFirstTreeIterator0);
      
      // Undeclared exception!
      try {
        depthFirstTreeIterator0.remove();
        fail("Expecting exception: RuntimeException");
      } catch(RuntimeException e) {
        /*
         * Not implemented
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      Object object0 = new Object();
      TreeNode treeNode0 = new TreeNode(object0);
      DepthFirstTreeIterator depthFirstTreeIterator0 = new DepthFirstTreeIterator(treeNode0);
      assertNotNull(depthFirstTreeIterator0);
      
      depthFirstTreeIterator0.getCurrent();
      assertEquals(true, depthFirstTreeIterator0.hasNext());
  }

  @Test
  public void test3()  throws Throwable  {
      TreeNode treeNode0 = new TreeNode();
      DepthFirstTreeIterator depthFirstTreeIterator0 = new DepthFirstTreeIterator(treeNode0);
      assertNotNull(depthFirstTreeIterator0);
      
      TreeNode treeNode1 = (TreeNode)depthFirstTreeIterator0.next();
      assertNotNull(treeNode1);
      
      // Undeclared exception!
      try {
        depthFirstTreeIterator0.next();
        fail("Expecting exception: NoSuchElementException");
      } catch(NoSuchElementException e) {
      }
  }

  @Test
  public void test4()  throws Throwable  {
      Object object0 = new Object();
      TreeNode treeNode0 = new TreeNode(object0);
      List<Object> list0 = treeNode0.depthFirstList();
      TreeNode treeNode1 = new TreeNode(treeNode0, (Collection) list0);
      treeNode0.addChild(treeNode1);
      DepthFirstTreeIterator depthFirstTreeIterator0 = new DepthFirstTreeIterator(treeNode0);
      assertNotNull(depthFirstTreeIterator0);
      
      TreeNode treeNode2 = (TreeNode)depthFirstTreeIterator0.next();
      assertEquals(true, depthFirstTreeIterator0.hasNext());
      assertNotNull(treeNode2);
  }
}