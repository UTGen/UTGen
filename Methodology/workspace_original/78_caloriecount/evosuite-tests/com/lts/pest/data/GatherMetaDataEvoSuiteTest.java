/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.pest.data;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.pest.data.GatherMetaData;
import com.lts.pest.data.GatherMetaDataListener;
import com.lts.pest.data.GatherMetaDataListenerHelper;
import com.lts.util.deepcopy.DeepCopyException;
import java.util.HashMap;
import java.util.Map;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class GatherMetaDataEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      GatherMetaData gatherMetaData0 = new GatherMetaData();
      GatherMetaData gatherMetaData1 = (GatherMetaData)gatherMetaData0.deepCopy();
      assertEquals(68400000L, gatherMetaData1.getEndOfDay());
  }

  @Test
  public void test1()  throws Throwable  {
      GatherMetaData gatherMetaData0 = new GatherMetaData();
      gatherMetaData0.addGatherMetaDataListener((GatherMetaDataListener) null);
      assertEquals(false, gatherMetaData0.getGathering());
  }

  @Test
  public void test2()  throws Throwable  {
      GatherMetaData gatherMetaData0 = new GatherMetaData();
      boolean boolean0 = gatherMetaData0.getDirty();
      assertEquals(false, boolean0);
  }

  @Test
  public void test3()  throws Throwable  {
      GatherMetaData gatherMetaData0 = new GatherMetaData();
      gatherMetaData0.setStartOfDay(241L);
      assertEquals(241L, gatherMetaData0.getStartOfDay());
      assertEquals(true, gatherMetaData0.isDirty());
  }

  @Test
  public void test4()  throws Throwable  {
      GatherMetaData gatherMetaData0 = new GatherMetaData();
      gatherMetaData0.removeGatherMetaDataListener((GatherMetaDataListener) null);
      assertEquals(false, gatherMetaData0.isDirty());
  }

  @Test
  public void test5()  throws Throwable  {
      GatherMetaData gatherMetaData0 = new GatherMetaData();
      gatherMetaData0.setPeriod(813L);
      assertEquals(false, gatherMetaData0.isGathering());
  }

  @Test
  public void test6()  throws Throwable  {
      GatherMetaData gatherMetaData0 = new GatherMetaData();
      gatherMetaData0.stopGathering();
      assertEquals(false, gatherMetaData0.getGathering());
      assertEquals(false, gatherMetaData0.isGathering());
  }

  @Test
  public void test7()  throws Throwable  {
      GatherMetaData gatherMetaData0 = new GatherMetaData();
      HashMap<GatherMetaData, GatherMetaData> hashMap0 = new HashMap<GatherMetaData, GatherMetaData>(873);
      gatherMetaData0.continueDeepCopy((Map) hashMap0, true);
      assertEquals(false, hashMap0.isEmpty());
      assertEquals(1, hashMap0.size());
  }

  @Test
  public void test8()  throws Throwable  {
      GatherMetaData gatherMetaData0 = new GatherMetaData();
      boolean boolean0 = gatherMetaData0.getGathering();
      assertEquals(false, boolean0);
  }

  @Test
  public void test9()  throws Throwable  {
      GatherMetaData gatherMetaData0 = new GatherMetaData();
      gatherMetaData0.startGathering(1718L);
      assertEquals(true, gatherMetaData0.getGathering());
      assertEquals(true, gatherMetaData0.isGathering());
  }

  @Test
  public void test10()  throws Throwable  {
      GatherMetaData gatherMetaData0 = new GatherMetaData();
      gatherMetaData0.getPeriod();
  }

  @Test
  public void test11()  throws Throwable  {
      GatherMetaData gatherMetaData0 = new GatherMetaData();
      GatherMetaDataListenerHelper gatherMetaDataListenerHelper0 = gatherMetaData0.getHelper();
      GatherMetaDataListenerHelper gatherMetaDataListenerHelper1 = gatherMetaData0.getHelper();
      assertSame(gatherMetaDataListenerHelper1, gatherMetaDataListenerHelper0);
      assertNotNull(gatherMetaDataListenerHelper1);
  }

  @Test
  public void test12()  throws Throwable  {
      long long0 = GatherMetaData.alignTime(1718L, 1718L);
      assertEquals(1718L, long0);
  }

  @Test
  public void test13()  throws Throwable  {
      long long0 = GatherMetaData.alignTime((-782L), 869L);
      assertEquals(869L, long0);
  }

  @Test
  public void test14()  throws Throwable  {
      GatherMetaData gatherMetaData0 = new GatherMetaData();
      gatherMetaData0.getStartOfDay();
      long long0 = gatherMetaData0.getStartOfDay();
      assertEquals(21600000L, long0);
  }

  @Test
  public void test15()  throws Throwable  {
      GatherMetaData gatherMetaData0 = new GatherMetaData();
      gatherMetaData0.setEndOfDay((-1412L));
      long long0 = gatherMetaData0.getEndOfDay();
      assertEquals(true, gatherMetaData0.getDirty());
      assertEquals((-1412L), long0);
  }

  @Test
  public void test16()  throws Throwable  {
      GatherMetaData gatherMetaData0 = new GatherMetaData();
      long long0 = gatherMetaData0.getEndOfDay();
      assertEquals(68400000L, long0);
  }
}
