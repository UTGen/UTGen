/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.pest.data;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.pest.tree.DirtyCleanTree;
import com.lts.pest.tree.IdTreeNode;
import com.lts.util.deepcopy.DeepCopyException;
import java.io.InvalidObjectException;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class IdTreeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DirtyCleanTree dirtyCleanTree0 = new DirtyCleanTree();
      // Undeclared exception!
      try {
        dirtyCleanTree0.initialize((IdTreeNode) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      DirtyCleanTree dirtyCleanTree0 = new DirtyCleanTree();
      dirtyCleanTree0.idToNode(151);
      // Undeclared exception!
      try {
        dirtyCleanTree0.removeNodeFrom((IdTreeNode) null, (IdTreeNode) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      DirtyCleanTree dirtyCleanTree0 = new DirtyCleanTree();
      // Undeclared exception!
      try {
        dirtyCleanTree0.validateObject();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      DirtyCleanTree dirtyCleanTree0 = new DirtyCleanTree();
      int int0 = dirtyCleanTree0.nextIntegerValue();
      assertEquals(2, dirtyCleanTree0.nextIntegerValue());
      assertEquals(1, int0);
  }

  @Test
  public void test4()  throws Throwable  {
      DirtyCleanTree dirtyCleanTree0 = new DirtyCleanTree();
      // Undeclared exception!
      try {
        dirtyCleanTree0.addNodeTo((IdTreeNode) null, (IdTreeNode) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test5()  throws Throwable  {
      DirtyCleanTree dirtyCleanTree0 = new DirtyCleanTree();
      // Undeclared exception!
      try {
        dirtyCleanTree0.removeNodeFrom((IdTreeNode) null, (IdTreeNode) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test6()  throws Throwable  {
      DirtyCleanTree dirtyCleanTree0 = new DirtyCleanTree();
      long long0 = dirtyCleanTree0.nextLongValue();
      assertEquals(2L, dirtyCleanTree0.nextLongValue());
      assertEquals(1L, long0);
  }

  @Test
  public void test7()  throws Throwable  {
      DirtyCleanTree dirtyCleanTree0 = new DirtyCleanTree();
      DirtyCleanTree dirtyCleanTree1 = (DirtyCleanTree)dirtyCleanTree0.deepCopy();
      assertEquals(1L, dirtyCleanTree1.nextLongValue());
      assertNotNull(dirtyCleanTree1);
      assertEquals(1, dirtyCleanTree1.nextIntegerValue());
  }

  @Test
  public void test8()  throws Throwable  {
      DirtyCleanTree dirtyCleanTree0 = new DirtyCleanTree();
      try {
        dirtyCleanTree0.deepCopy(true);
        fail("Expecting exception: DeepCopyException");
      } catch(DeepCopyException e) {
        /*
         * com.lts.pest.tree.DirtyCleanTree does not implement copying transient data
         */
      }
  }
}
