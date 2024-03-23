/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.util.notifyinglist;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.util.notifyinglist.ListProxy;
import com.lts.util.notifyinglist.NotifyingList;
import com.lts.util.notifyinglist.NotifyingListAdaptor;
import com.lts.util.notifyinglist.NotifyingListListener;
import com.lts.util.notifyinglist.NotifyingListListenerAdaptor;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import javax.swing.text.StyleConstants;

@RunWith(EvoSuiteRunner.class)
public class NotifyingListAdaptorEvoSuiteTest {


  //Test case number: 0
  /*
   * 4 covered goals:
   * 1 com.lts.util.notifyinglist.NotifyingListAdaptor.toArray([Ljava/lang/Object;)[Ljava/lang/Object;: root-Branch
   * 2 com.lts.util.notifyinglist.NotifyingListAdaptor.toArray()[Ljava/lang/Object;: root-Branch
   * 3 com.lts.util.notifyinglist.NotifyingListAdaptor.<init>()V: root-Branch
   * 4 com.lts.util.notifyinglist.NotifyingListAdaptor.initialize(Ljava/util/List;)V: I11 Branch 1 IF_ACMPNE L29 - false
   */
  @Test
  public void test0()  throws Throwable  {
      NotifyingListAdaptor<String> notifyingListAdaptor0 = new NotifyingListAdaptor<String>();
      NotifyingListAdaptor<Object> notifyingListAdaptor1 = new NotifyingListAdaptor<Object>();
      Object[] objectArray0 = notifyingListAdaptor1.toArray();
      Object[] objectArray1 = notifyingListAdaptor0.toArray(objectArray0);
      assertSame(objectArray0, objectArray1);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 com.lts.util.notifyinglist.NotifyingListAdaptor.isEmpty()Z: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      NotifyingListAdaptor<Integer> notifyingListAdaptor0 = new NotifyingListAdaptor<Integer>();
      boolean boolean0 = notifyingListAdaptor0.isEmpty();
      assertEquals(true, boolean0);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 com.lts.util.notifyinglist.NotifyingListAdaptor.lastIndexOf(Ljava/lang/Object;)I: root-Branch
   */
  @Test
  public void test2()  throws Throwable  {
      NotifyingListAdaptor<StyleConstants> notifyingListAdaptor0 = new NotifyingListAdaptor<StyleConstants>();
      int int0 = notifyingListAdaptor0.lastIndexOf((Object) null);
      assertEquals((-1), int0);
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * 1 com.lts.util.notifyinglist.NotifyingListAdaptor.set(ILjava/lang/Object;)Ljava/lang/Object;: root-Branch
   * 2 com.lts.util.notifyinglist.NotifyingListAdaptor.basicSet(ILjava/lang/Object;)Ljava/lang/Object;: root-Branch
   */
  @Test
  public void test3()  throws Throwable  {
      NotifyingListAdaptor<Object> notifyingListAdaptor0 = new NotifyingListAdaptor<Object>();
      // Undeclared exception!
      try {
        notifyingListAdaptor0.set(0, (Object) "SwingSelectedKey");
        fail("Expecting exception: IndexOutOfBoundsException");
      } catch(IndexOutOfBoundsException e) {
        /*
         * Index: 0, Size: 0
         */
      }
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 com.lts.util.notifyinglist.NotifyingListAdaptor.equals(Ljava/lang/Object;)Z: root-Branch
   */
  @Test
  public void test4()  throws Throwable  {
      NotifyingListAdaptor<Object> notifyingListAdaptor0 = new NotifyingListAdaptor<Object>();
      boolean boolean0 = notifyingListAdaptor0.equals((Object) "horizontalAlignment");
      assertEquals(false, boolean0);
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 com.lts.util.notifyinglist.NotifyingListAdaptor.clear()V: root-Branch
   */
  @Test
  public void test5()  throws Throwable  {
      NotifyingListAdaptor<NotifyingList<Object>> notifyingListAdaptor0 = new NotifyingListAdaptor<NotifyingList<Object>>();
      notifyingListAdaptor0.clear();
      assertEquals(true, notifyingListAdaptor0.isEmpty());
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 com.lts.util.notifyinglist.NotifyingListAdaptor.subList(II)Ljava/util/List;: root-Branch
   */
  @Test
  public void test6()  throws Throwable  {
      NotifyingListAdaptor<NotifyingList<Object>> notifyingListAdaptor0 = new NotifyingListAdaptor<NotifyingList<Object>>();
      List<Object> list0 = notifyingListAdaptor0.subList(0, 0);
      assertEquals(true, list0.isEmpty());
  }

  //Test case number: 7
  /*
   * 2 covered goals:
   * 1 com.lts.util.notifyinglist.NotifyingListAdaptor.replaceWith(Ljava/util/List;)V: root-Branch
   * 2 com.lts.util.notifyinglist.NotifyingListAdaptor.basicReplaceWith(Ljava/util/List;)V: root-Branch
   */
  @Test
  public void test7()  throws Throwable  {
      NotifyingListAdaptor<NotifyingList<StyleConstants>> notifyingListAdaptor0 = new NotifyingListAdaptor<NotifyingList<StyleConstants>>();
      Vector<NotifyingList<StyleConstants>> vector0 = new Vector<NotifyingList<StyleConstants>>();
      notifyingListAdaptor0.replaceWith((List<NotifyingList<StyleConstants>>) vector0);
      assertEquals(0, notifyingListAdaptor0.size());
  }

  //Test case number: 8
  /*
   * 5 covered goals:
   * 1 com.lts.util.notifyinglist.NotifyingListAdaptor.listIterator(I)Ljava/util/ListIterator;: root-Branch
   * 2 com.lts.util.notifyinglist.NotifyingListAdaptor.addListener(Lcom/lts/util/notifyinglist/NotifyingListListener;)V: root-Branch
   * 3 com.lts.util.notifyinglist.NotifyingListAdaptor.addAll(Ljava/util/Collection;)Z: I24 Branch 3 IFLE L55 - true
   * 4 com.lts.util.notifyinglist.NotifyingListAdaptor.size()I: root-Branch
   * 5 com.lts.util.notifyinglist.NotifyingListAdaptor.addAll(Ljava/util/Collection;)Z: I8 Branch 2 IFEQ L50 - true
   */
  @Test
  public void test8()  throws Throwable  {
      NotifyingListAdaptor<Object> notifyingListAdaptor0 = new NotifyingListAdaptor<Object>();
      ListProxy<Object> listProxy0 = new ListProxy<Object>((NotifyingList<Object>) notifyingListAdaptor0);
      assertNotNull(listProxy0);
      
      boolean boolean0 = notifyingListAdaptor0.addAll((Collection<?>) listProxy0);
      assertEquals(false, boolean0);
  }

  //Test case number: 9
  /*
   * 3 covered goals:
   * 1 com.lts.util.notifyinglist.NotifyingListAdaptor.clone()Ljava/lang/Object;: root-Branch
   * 2 com.lts.util.notifyinglist.NotifyingListAdaptor.initialize(Ljava/util/List;)V: I11 Branch 1 IF_ACMPNE L29 - true
   * 3 com.lts.util.notifyinglist.NotifyingListAdaptor.<init>(Ljava/util/List;)V: root-Branch
   */
  @Test
  public void test9()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      NotifyingListAdaptor<Integer> notifyingListAdaptor0 = new NotifyingListAdaptor<Integer>((List<Integer>) linkedList0);
      // Undeclared exception!
      try {
        notifyingListAdaptor0.clone();
        fail("Expecting exception: RuntimeException");
      } catch(RuntimeException e) {
        /*
         * java.lang.CloneNotSupportedException: com.lts.util.notifyinglist.NotifyingListAdaptor
         */
      }
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * 1 com.lts.util.notifyinglist.NotifyingListAdaptor.get(I)Ljava/lang/Object;: root-Branch
   */
  @Test
  public void test10()  throws Throwable  {
      NotifyingListAdaptor<NotifyingList<Integer>> notifyingListAdaptor0 = new NotifyingListAdaptor<NotifyingList<Integer>>();
      // Undeclared exception!
      try {
        notifyingListAdaptor0.get(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      } catch(IndexOutOfBoundsException e) {
        /*
         * Index: 0, Size: 0
         */
      }
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * 1 com.lts.util.notifyinglist.NotifyingListAdaptor.contains(Ljava/lang/Object;)Z: root-Branch
   */
  @Test
  public void test11()  throws Throwable  {
      NotifyingListAdaptor<String> notifyingListAdaptor0 = new NotifyingListAdaptor<String>();
      boolean boolean0 = notifyingListAdaptor0.contains((Object) null);
      assertEquals(true, boolean0);
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * 1 com.lts.util.notifyinglist.NotifyingListAdaptor.hashCode()I: root-Branch
   */
  @Test
  public void test12()  throws Throwable  {
      NotifyingListAdaptor<String> notifyingListAdaptor0 = new NotifyingListAdaptor<String>();
      int int0 = notifyingListAdaptor0.hashCode();
      assertEquals(1, int0);
  }

  //Test case number: 13
  /*
   * 3 covered goals:
   * 1 com.lts.util.notifyinglist.NotifyingListAdaptor.containsAll(Ljava/util/Collection;)Z: root-Branch
   * 2 com.lts.util.notifyinglist.NotifyingListAdaptor.<init>(Ljava/util/List;)V: root-Branch
   * 3 com.lts.util.notifyinglist.NotifyingListAdaptor.iterator()Ljava/util/Iterator;: root-Branch
   */
  @Test
  public void test13()  throws Throwable  {
      NotifyingListAdaptor<NotifyingList<String>> notifyingListAdaptor0 = new NotifyingListAdaptor<NotifyingList<String>>();
      NotifyingListAdaptor<String> notifyingListAdaptor1 = new NotifyingListAdaptor<String>((List<String>) null);
      boolean boolean0 = notifyingListAdaptor1.containsAll((Collection) notifyingListAdaptor0);
      assertEquals(false, boolean0);
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * 1 com.lts.util.notifyinglist.NotifyingListAdaptor.removeListener(Lcom/lts/util/notifyinglist/NotifyingListListener;)Z: root-Branch
   */
  @Test
  public void test14()  throws Throwable  {
      NotifyingListAdaptor<Object> notifyingListAdaptor0 = new NotifyingListAdaptor<Object>();
      NotifyingListListenerAdaptor notifyingListListenerAdaptor0 = new NotifyingListListenerAdaptor();
      boolean boolean0 = notifyingListAdaptor0.removeListener((NotifyingListListener) notifyingListListenerAdaptor0);
      assertEquals(false, boolean0);
  }

  //Test case number: 15
  /*
   * 6 covered goals:
   * 1 com.lts.util.notifyinglist.NotifyingListAdaptor.addAll(Ljava/util/Collection;)Z: I8 Branch 2 IFEQ L50 - false
   * 2 com.lts.util.notifyinglist.NotifyingListAdaptor.addAll(Ljava/util/Collection;)Z: I24 Branch 3 IFLE L55 - false
   * 3 com.lts.util.notifyinglist.NotifyingListAdaptor.addAll(Ljava/util/Collection;)Z: I8 Branch 2 IFEQ L50 - true
   * 4 com.lts.util.notifyinglist.NotifyingListAdaptor.add(Ljava/lang/Object;)Z: root-Branch
   * 5 com.lts.util.notifyinglist.NotifyingListAdaptor.add(ILjava/lang/Object;)V: root-Branch
   * 6 com.lts.util.notifyinglist.NotifyingListAdaptor.basicAdd(ILjava/lang/Object;)I: I4 Branch 16 IF_ICMPNE L259 - true
   */
  @Test
  public void test15()  throws Throwable  {
      NotifyingListAdaptor<String> notifyingListAdaptor0 = new NotifyingListAdaptor<String>();
      notifyingListAdaptor0.add("");
      NotifyingListAdaptor<Object> notifyingListAdaptor1 = new NotifyingListAdaptor<Object>();
      boolean boolean0 = notifyingListAdaptor1.addAll((Collection<?>) notifyingListAdaptor0);
      assertEquals(true, notifyingListAdaptor0.isEmpty());
      assertEquals(true, boolean0);
  }

  //Test case number: 16
  /*
   * 2 covered goals:
   * 1 com.lts.util.notifyinglist.NotifyingListAdaptor.addAll(ILjava/util/Collection;)Z: I8 Branch 4 IFEQ L60 - true
   * 2 com.lts.util.notifyinglist.NotifyingListAdaptor.addAll(ILjava/util/Collection;)Z: I24 Branch 5 IFLE L65 - true
   */
  @Test
  public void test16()  throws Throwable  {
      NotifyingListAdaptor<Object> notifyingListAdaptor0 = new NotifyingListAdaptor<Object>();
      NotifyingListAdaptor<NotifyingList<String>> notifyingListAdaptor1 = new NotifyingListAdaptor<NotifyingList<String>>();
      boolean boolean0 = notifyingListAdaptor0.addAll((-1449), (Collection<?>) notifyingListAdaptor1);
      assertEquals(false, boolean0);
  }

  //Test case number: 17
  /*
   * 6 covered goals:
   * 1 com.lts.util.notifyinglist.NotifyingListAdaptor.remove(Ljava/lang/Object;)Z: I10 Branch 6 IF_ICMPEQ L150 - true
   * 2 com.lts.util.notifyinglist.NotifyingListAdaptor.remove(Ljava/lang/Object;)Z: I29 Branch 7 IF_ICMPEQ L156 - true
   * 3 com.lts.util.notifyinglist.NotifyingListAdaptor.removeAll(Ljava/util/Collection;)Z: I8 Branch 10 IFEQ L174 - true
   * 4 com.lts.util.notifyinglist.NotifyingListAdaptor.removeAll(Ljava/util/Collection;)Z: I8 Branch 10 IFEQ L174 - false
   * 5 com.lts.util.notifyinglist.NotifyingListAdaptor.removeAll(Ljava/util/Collection;)Z: I24 Branch 11 IFLE L179 - false
   * 6 com.lts.util.notifyinglist.NotifyingListAdaptor.indexOf(Ljava/lang/Object;)I: root-Branch
   */
  @Test
  public void test17()  throws Throwable  {
      NotifyingListAdaptor<String> notifyingListAdaptor0 = new NotifyingListAdaptor<String>();
      notifyingListAdaptor0.add("x3Y\"xI\u0000|)q");
      NotifyingListAdaptor<NotifyingList<Object>> notifyingListAdaptor1 = new NotifyingListAdaptor<NotifyingList<Object>>();
      boolean boolean0 = notifyingListAdaptor1.removeAll((Collection) notifyingListAdaptor0);
      assertEquals("{x3Y\"xI\u0000|)q}", notifyingListAdaptor0.toString());
      assertEquals(true, boolean0);
  }

  //Test case number: 18
  /*
   * 3 covered goals:
   * 1 com.lts.util.notifyinglist.NotifyingListAdaptor.remove(Ljava/lang/Object;)Z: I10 Branch 6 IF_ICMPEQ L150 - false
   * 2 com.lts.util.notifyinglist.NotifyingListAdaptor.remove(Ljava/lang/Object;)Z: I29 Branch 7 IF_ICMPEQ L156 - false
   * 3 com.lts.util.notifyinglist.NotifyingListAdaptor.indexOf(Ljava/lang/Object;)I: root-Branch
   */
  @Test
  public void test18()  throws Throwable  {
      NotifyingListAdaptor<String> notifyingListAdaptor0 = new NotifyingListAdaptor<String>();
      notifyingListAdaptor0.add("selection-end-line");
      assertEquals(true, notifyingListAdaptor0.isEmpty());
      
      boolean boolean0 = notifyingListAdaptor0.remove((Object) "selection-end-line");
      assertEquals(true, boolean0);
  }

  //Test case number: 19
  /*
   * 4 covered goals:
   * 1 com.lts.util.notifyinglist.NotifyingListAdaptor.removeAll([I)V: I4 Branch 8 IF_ACMPNE L161 - true
   * 2 com.lts.util.notifyinglist.NotifyingListAdaptor.removeAll([I)V: I28 Branch 9 IFLT L166 - false
   * 3 com.lts.util.notifyinglist.NotifyingListAdaptor.basicRemove(I)Ljava/lang/Object;: root-Branch
   * 4 com.lts.util.notifyinglist.NotifyingListAdaptor.remove(I)Ljava/lang/Object;: root-Branch
   */
  @Test
  public void test19()  throws Throwable  {
      NotifyingListAdaptor<Object> notifyingListAdaptor0 = new NotifyingListAdaptor<Object>();
      int[] intArray0 = new int[1];
      // Undeclared exception!
      try {
        notifyingListAdaptor0.removeAll(intArray0);
        fail("Expecting exception: IndexOutOfBoundsException");
      } catch(IndexOutOfBoundsException e) {
        /*
         * Index: 0, Size: 0
         */
      }
  }

  //Test case number: 20
  /*
   * 2 covered goals:
   * 1 com.lts.util.notifyinglist.NotifyingListAdaptor.removeAll(Ljava/util/Collection;)Z: I24 Branch 11 IFLE L179 - true
   * 2 com.lts.util.notifyinglist.NotifyingListAdaptor.removeAll(Ljava/util/Collection;)Z: I8 Branch 10 IFEQ L174 - true
   */
  @Test
  public void test20()  throws Throwable  {
      NotifyingListAdaptor<Object> notifyingListAdaptor0 = new NotifyingListAdaptor<Object>();
      NotifyingListAdaptor<StyleConstants> notifyingListAdaptor1 = new NotifyingListAdaptor<StyleConstants>();
      boolean boolean0 = notifyingListAdaptor0.removeAll((Collection) notifyingListAdaptor1);
      assertEquals(false, boolean0);
  }

  //Test case number: 21
  /*
   * 10 covered goals:
   * 1 com.lts.util.notifyinglist.NotifyingListAdaptor.retainAll(Ljava/util/Collection;)Z: I14 Branch 12 IFLT L186 - false
   * 2 com.lts.util.notifyinglist.NotifyingListAdaptor.retainAll(Ljava/util/Collection;)Z: I27 Branch 13 IFGT L189 - false
   * 3 com.lts.util.notifyinglist.NotifyingListAdaptor.basicRemove(I)Ljava/lang/Object;: root-Branch
   * 4 com.lts.util.notifyinglist.NotifyingListAdaptor.iterator()Ljava/util/Iterator;: root-Branch
   * 5 com.lts.util.notifyinglist.NotifyingListAdaptor.add(Ljava/lang/Object;)Z: root-Branch
   * 6 com.lts.util.notifyinglist.NotifyingListAdaptor.add(ILjava/lang/Object;)V: root-Branch
   * 7 com.lts.util.notifyinglist.NotifyingListAdaptor.remove(I)Ljava/lang/Object;: root-Branch
   * 8 com.lts.util.notifyinglist.NotifyingListAdaptor.size()I: root-Branch
   * 9 com.lts.util.notifyinglist.NotifyingListAdaptor.retainAll(Ljava/util/Collection;)Z: I14 Branch 12 IFLT L186 - true
   * 10 com.lts.util.notifyinglist.NotifyingListAdaptor.basicAdd(ILjava/lang/Object;)I: I4 Branch 16 IF_ICMPNE L259 - true
   */
  @Test
  public void test21()  throws Throwable  {
      NotifyingListAdaptor<String> notifyingListAdaptor0 = new NotifyingListAdaptor<String>();
      notifyingListAdaptor0.add("x3Y\"xI\u0000|)q");
      assertEquals("{x3Y\"xI\u0000|)q}", notifyingListAdaptor0.toString());
      
      NotifyingListAdaptor<Object> notifyingListAdaptor1 = new NotifyingListAdaptor<Object>();
      boolean boolean0 = notifyingListAdaptor0.retainAll((Collection) notifyingListAdaptor1);
      assertEquals(true, boolean0);
  }

  //Test case number: 22
  /*
   * 3 covered goals:
   * 1 com.lts.util.notifyinglist.NotifyingListAdaptor.toString()Ljava/lang/String;: I25 Branch 14 IFEQ L225 - true
   * 2 com.lts.util.notifyinglist.NotifyingListAdaptor.<init>()V: root-Branch
   * 3 com.lts.util.notifyinglist.NotifyingListAdaptor.initialize(Ljava/util/List;)V: I11 Branch 1 IF_ACMPNE L29 - false
   */
  @Test
  public void test22()  throws Throwable  {
      NotifyingListAdaptor<Object> notifyingListAdaptor0 = new NotifyingListAdaptor<Object>();
      String string0 = notifyingListAdaptor0.toString();
      assertNotNull(string0);
      assertEquals("{}", string0);
  }
}
