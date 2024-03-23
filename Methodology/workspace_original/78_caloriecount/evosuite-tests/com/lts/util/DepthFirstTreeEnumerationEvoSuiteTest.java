/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.util.DepthFirstTreeEnumeration;
import com.lts.util.TreeNode;
import java.util.NoSuchElementException;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class DepthFirstTreeEnumerationEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      TreeNode treeNode0 = new TreeNode();
      DepthFirstTreeEnumeration depthFirstTreeEnumeration0 = new DepthFirstTreeEnumeration(treeNode0);
      assertNotNull(depthFirstTreeEnumeration0);
      
      // Undeclared exception!
      try {
        depthFirstTreeEnumeration0.remove();
        fail("Expecting exception: RuntimeException");
      } catch(RuntimeException e) {
        /*
         * Not implemented
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      TreeNode treeNode0 = new TreeNode();
      DepthFirstTreeEnumeration depthFirstTreeEnumeration0 = new DepthFirstTreeEnumeration(treeNode0);
      assertNotNull(depthFirstTreeEnumeration0);
      
      // Undeclared exception!
      try {
        depthFirstTreeEnumeration0.next();
        fail("Expecting exception: NoSuchElementException");
      } catch(NoSuchElementException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      TreeNode treeNode0 = new TreeNode();
      DepthFirstTreeEnumeration depthFirstTreeEnumeration0 = new DepthFirstTreeEnumeration(treeNode0);
      assertNotNull(depthFirstTreeEnumeration0);
      
      depthFirstTreeEnumeration0.getCurrent();
      assertEquals(false, depthFirstTreeEnumeration0.hasNext());
  }

  @Test
  public void test3()  throws Throwable  {
      TreeNode treeNode0 = new TreeNode();
      DepthFirstTreeEnumeration depthFirstTreeEnumeration0 = new DepthFirstTreeEnumeration(treeNode0);
      assertNotNull(depthFirstTreeEnumeration0);
      
      depthFirstTreeEnumeration0.setCurrent(treeNode0);
      assertEquals(false, depthFirstTreeEnumeration0.hasNext());
  }
}