/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.pest.data;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.pest.data.DataContainerAdaptor;
import com.lts.pest.data.DataItem;
import com.lts.pest.data.DataItemAdapter;
import com.lts.pest.data.event.DataChangeListener;
import com.lts.util.deepcopy.DeepCopyException;
import java.util.HashMap;
import java.util.Map;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class DataContainerAdaptorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DataContainerAdaptor dataContainerAdaptor0 = new DataContainerAdaptor();
      HashMap<DataContainerAdaptor, DataItem> hashMap0 = new HashMap<DataContainerAdaptor, DataItem>();
      dataContainerAdaptor0.continueDeepCopy((Map) hashMap0, false);
      assertEquals(false, hashMap0.isEmpty());
      assertEquals(2, hashMap0.size());
  }

  @Test
  public void test1()  throws Throwable  {
      DataContainerAdaptor dataContainerAdaptor0 = new DataContainerAdaptor();
      boolean boolean0 = dataContainerAdaptor0.removeDataChangeListener((DataChangeListener) null);
      assertEquals(false, boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      DataContainerAdaptor dataContainerAdaptor0 = new DataContainerAdaptor();
      // Undeclared exception!
      try {
        dataContainerAdaptor0.getComponents();
        fail("Expecting exception: ClassCastException");
      } catch(ClassCastException e) {
        /*
         * [Ljava.lang.Object; cannot be cast to [Lcom.lts.pest.data.DataItem;
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      DataContainerAdaptor dataContainerAdaptor0 = new DataContainerAdaptor();
      boolean boolean0 = dataContainerAdaptor0.removeComponent((DataItem) null);
      assertEquals(false, boolean0);
  }

  @Test
  public void test4()  throws Throwable  {
      DataContainerAdaptor dataContainerAdaptor0 = new DataContainerAdaptor();
      DataContainerAdaptor dataContainerAdaptor1 = (DataContainerAdaptor)dataContainerAdaptor0.deepCopy();
      assertEquals(false, dataContainerAdaptor1.isDirty());
  }

  @Test
  public void test5()  throws Throwable  {
      DataContainerAdaptor dataContainerAdaptor0 = new DataContainerAdaptor();
      dataContainerAdaptor0.addDataChangeListener((DataChangeListener) null);
      assertEquals(false, dataContainerAdaptor0.isDirty());
  }

  @Test
  public void test6()  throws Throwable  {
      DataContainerAdaptor dataContainerAdaptor0 = new DataContainerAdaptor();
      DataContainerAdaptor dataContainerAdaptor1 = (DataContainerAdaptor)dataContainerAdaptor0.deepCopy(false);
      assertFalse(dataContainerAdaptor0.equals(dataContainerAdaptor1));
  }

  @Test
  public void test7()  throws Throwable  {
      DataContainerAdaptor dataContainerAdaptor0 = new DataContainerAdaptor();
      DataItemAdapter dataItemAdapter0 = new DataItemAdapter();
      dataContainerAdaptor0.addComponent((DataItem) dataItemAdapter0);
      dataContainerAdaptor0.addComponent((DataItem) dataItemAdapter0);
      assertEquals(false, dataContainerAdaptor0.isDirty());
  }

  @Test
  public void test8()  throws Throwable  {
      DataContainerAdaptor dataContainerAdaptor0 = new DataContainerAdaptor();
      DataItemAdapter dataItemAdapter0 = new DataItemAdapter();
      dataContainerAdaptor0.addComponent((DataItem) dataItemAdapter0);
      boolean boolean0 = dataContainerAdaptor0.isDirty();
      assertEquals(false, boolean0);
  }

  @Test
  public void test9()  throws Throwable  {
      DataContainerAdaptor dataContainerAdaptor0 = new DataContainerAdaptor();
      DataItemAdapter dataItemAdapter0 = new DataItemAdapter();
      dataContainerAdaptor0.addComponent((DataItem) dataItemAdapter0);
      dataContainerAdaptor0.setDirty(true);
      boolean boolean0 = dataContainerAdaptor0.isDirty();
      assertEquals(true, dataContainerAdaptor0.isDirty());
      assertEquals(true, boolean0);
  }
}
