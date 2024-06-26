/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.util.deepcopy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.util.TreeNode;
import com.lts.util.deepcopy.DeepCopier;
import com.lts.util.deepcopy.DeepCopyException;
import com.lts.util.deepcopy.DeepCopyUtil;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.evosuite.testcase.CodeUnderTestException;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class DeepCopyUtilEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      TreeNode treeNode0 = new TreeNode();
      TreeNode treeNode1 = (TreeNode)DeepCopyUtil.deepCopy((DeepCopier) treeNode0, false);
      assertNotSame(treeNode0, treeNode1);
      assertNotNull(treeNode1);
  }

  @Test
  public void test1()  throws Throwable  {
      HashMap<String, Method> hashMap0 = new HashMap<String, Method>();
      try {
        DeepCopyUtil.continueDeepCopy((Object) "$qW'/dV", (Map) hashMap0, false);
        fail("Expecting exception: DeepCopyException");
      } catch(DeepCopyException e) {
        /*
         * The object, $qW'/dV, of class class java.lang.String, does not implement com.lts.util.deepcopy.DeepCopier
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      DeepCopyUtil deepCopyUtil0 = new DeepCopyUtil();
      assertNotNull(deepCopyUtil0);
  }

  @Test
  public void test3()  throws Throwable  {
      Object object0 = DeepCopyUtil.createInstance((Object) null);
      assertNull(object0);
  }

  @Test
  public void test4()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      HashMap<DeepCopier, List<Method>> hashMap0 = new HashMap<DeepCopier, List<Method>>();
      List<Object> list0 = DeepCopyUtil.copyList((List) linkedList0, (Map) hashMap0, true);
      DeepCopyUtil.copyList((List) list0, (Map) hashMap0, true);
      assertEquals(false, hashMap0.isEmpty());
      assertEquals("{[]=[]}", hashMap0.toString());
  }

  @Test
  public void test5()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      TreeNode treeNode0 = new TreeNode((Object) linkedList0);
      List<Object> list0 = treeNode0.getChildren();
      linkedList0.add((Object) list0);
      IdentityHashMap<String, String> identityHashMap0 = new IdentityHashMap<String, String>();
      try {
        DeepCopyUtil.copyList((List) linkedList0, (Map) identityHashMap0, true);
        fail("Expecting exception: DeepCopyException");
      } catch(DeepCopyException e) {
        /*
         * The object, [], of class class java.util.ArrayList, does not implement com.lts.util.deepcopy.DeepCopier
         */
      }
  }

  @Test
  public void test6()  throws Throwable  {
      TreeNode treeNode0 = new TreeNode();
      treeNode0.addChild(treeNode0);
      TreeNode treeNode1 = (TreeNode)DeepCopyUtil.startDeepCopy((DeepCopier) treeNode0);
      assertEquals(1, treeNode0.getChildCount());
      assertEquals(1, treeNode1.getChildCount());
  }

  @Test
  public void test7()  throws Throwable  {
      IdentityHashMap<Class<Object>, Method> identityHashMap0 = new IdentityHashMap<Class<Object>, Method>();
      Object object0 = new Object();
  }

  @Test
  public void test8()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      HashMap<DeepCopier, List<Method>> hashMap0 = new HashMap<DeepCopier, List<Method>>();
      List<Object> list0 = DeepCopyUtil.copyList((List) linkedList0, (Map) hashMap0, true);
      HashMap<Integer, List<String>> hashMap1 = new HashMap<Integer, List<String>>();
      DeepCopyUtil.copyList((List) list0, (Map) hashMap1, true);
      DeepCopyUtil.deepCopyField((Object) list0, (Map) hashMap1, true);
      assertEquals(1, hashMap0.size());
      assertEquals("{[]=[]}", hashMap0.toString());
  }

  @Test
  public void test9()  throws Throwable  {
      TreeNode treeNode0 = new TreeNode();
      IdentityHashMap<Method, Method> identityHashMap0 = new IdentityHashMap<Method, Method>();
      TreeNode treeNode1 = (TreeNode)DeepCopyUtil.deepCopyField((Object) treeNode0, (Map) identityHashMap0, false);
      assertNull(treeNode1);
      assertEquals(0, identityHashMap0.size());
  }
}
