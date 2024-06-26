/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.pest.data;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.pest.data.DataItemAdapter;
import com.lts.pest.data.event.DataChangeListener;
import com.lts.pest.data.event.DataChangeListenerHelper;
import com.lts.util.deepcopy.DeepCopier;
import com.lts.util.deepcopy.DeepCopyException;
import java.util.HashMap;
import java.util.Map;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class DataItemAdapterEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DataItemAdapter dataItemAdapter0 = new DataItemAdapter();
      DataItemAdapter dataItemAdapter1 = (DataItemAdapter)dataItemAdapter0.deepCopy();
      assertNotNull(dataItemAdapter1);
      assertEquals(false, dataItemAdapter0.isDirty());
      assertEquals(false, dataItemAdapter1.isDirty());
  }

  @Test
  public void test1()  throws Throwable  {
      DataItemAdapter dataItemAdapter0 = new DataItemAdapter();
      HashMap<DeepCopier, Integer> hashMap0 = new HashMap<DeepCopier, Integer>();
      dataItemAdapter0.continueDeepCopy((Map) hashMap0, true);
      assertEquals(false, hashMap0.isEmpty());
      assertEquals(1, hashMap0.size());
  }

  @Test
  public void test2()  throws Throwable  {
      DataItemAdapter dataItemAdapter0 = new DataItemAdapter();
      boolean boolean0 = dataItemAdapter0.isDirty();
      assertEquals(false, boolean0);
  }

  @Test
  public void test3()  throws Throwable  {
      DataItemAdapter dataItemAdapter0 = new DataItemAdapter();
      DataItemAdapter dataItemAdapter1 = (DataItemAdapter)dataItemAdapter0.deepCopy(true);
      assertEquals(false, dataItemAdapter0.isDirty());
      assertNotNull(dataItemAdapter1);
      assertEquals(false, dataItemAdapter1.isDirty());
  }

  @Test
  public void test4()  throws Throwable  {
      DataItemAdapter dataItemAdapter0 = new DataItemAdapter();
      dataItemAdapter0.removeDataChangeListener((DataChangeListener) null);
      assertEquals(false, dataItemAdapter0.isDirty());
  }

  @Test
  public void test5()  throws Throwable  {
      DataItemAdapter dataItemAdapter0 = new DataItemAdapter();
      dataItemAdapter0.addDataChangeListener((DataChangeListener) null);
      assertEquals(false, dataItemAdapter0.isDirty());
  }

  @Test
  public void test6()  throws Throwable  {
      DataItemAdapter dataItemAdapter0 = new DataItemAdapter();
      assertEquals(false, dataItemAdapter0.isDirty());
      
      dataItemAdapter0.setDirty(true);
      assertEquals(true, dataItemAdapter0.isDirty());
  }

  @Test
  public void test7()  throws Throwable  {
      DataItemAdapter dataItemAdapter0 = new DataItemAdapter();
      DataChangeListenerHelper dataChangeListenerHelper0 = dataItemAdapter0.getHelper();
      assertNotNull(dataChangeListenerHelper0);
      
      dataItemAdapter0.fireDataChanged();
      assertEquals(false, dataItemAdapter0.isDirty());
  }
}
