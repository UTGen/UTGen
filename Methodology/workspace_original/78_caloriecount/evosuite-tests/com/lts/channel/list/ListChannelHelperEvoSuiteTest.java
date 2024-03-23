/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.channel.list;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.channel.list.ListChannel;
import com.lts.channel.list.ListChannelEvent;
import com.lts.channel.list.ListChannelHelper;
import com.lts.channel.list.ListChannelListenerAdaptor;
import com.lts.event.ListenerHelper;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ListChannelHelperEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ListChannelHelper listChannelHelper0 = new ListChannelHelper();
      ListChannel listChannel0 = new ListChannel();
      ListChannelEvent listChannelEvent0 = new ListChannelEvent(0, listChannel0, 0);
      listChannelHelper0.addListener((Object) null);
      ListenerHelper.DeferredEvent listenerHelper_DeferredEvent0 = new ListenerHelper.DeferredEvent(818, (Object) listChannelEvent0);
      // Undeclared exception!
      try {
        listChannelHelper0.fire(listenerHelper_DeferredEvent0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      ListChannelHelper listChannelHelper0 = new ListChannelHelper();
      ListChannel listChannel0 = new ListChannel();
      ListChannelListenerAdaptor listChannelListenerAdaptor0 = new ListChannelListenerAdaptor();
      ListChannelEvent listChannelEvent0 = new ListChannelEvent(1, listChannel0);
      listChannelHelper0.notifyListener((Object) listChannelListenerAdaptor0, 1, (Object) listChannelEvent0);
      assertEquals(1, listChannelEvent0.getEventType());
  }

  @Test
  public void test2()  throws Throwable  {
      ListChannelHelper listChannelHelper0 = new ListChannelHelper();
      ListChannelListenerAdaptor listChannelListenerAdaptor0 = new ListChannelListenerAdaptor();
      ListChannel listChannel0 = new ListChannel();
      ListChannelEvent listChannelEvent0 = new ListChannelEvent(3, listChannel0);
      listChannelHelper0.notifyListener((Object) listChannelListenerAdaptor0, 3, (Object) listChannelEvent0);
      assertEquals(-1, listChannelEvent0.getOldIndex());
  }

  @Test
  public void test3()  throws Throwable  {
      ListChannelHelper listChannelHelper0 = new ListChannelHelper();
      ListChannelListenerAdaptor listChannelListenerAdaptor0 = new ListChannelListenerAdaptor();
      ListChannel listChannel0 = new ListChannel();
      ListChannelEvent listChannelEvent0 = new ListChannelEvent(1889, listChannel0, 1889);
      // Undeclared exception!
      try {
        listChannelHelper0.notifyListener((Object) listChannelListenerAdaptor0, 1889, (Object) listChannelEvent0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
      }
  }
}