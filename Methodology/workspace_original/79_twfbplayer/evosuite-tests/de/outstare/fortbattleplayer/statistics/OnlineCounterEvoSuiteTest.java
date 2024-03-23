/*
 * This file was automatically generated by EvoSuite
 */

package de.outstare.fortbattleplayer.statistics;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import de.outstare.fortbattleplayer.statistics.OnlineCounter;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class OnlineCounterEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      OnlineCounter onlineCounter0 = new OnlineCounter();
      int int0 = onlineCounter0.onlineEvents();
      assertEquals(0, onlineCounter0.sumOfEvents());
      assertEquals(true, onlineCounter0.wasOffline());
      assertEquals(0, int0);
  }

  @Test
  public void test1()  throws Throwable  {
      OnlineCounter onlineCounter0 = new OnlineCounter();
      int int0 = onlineCounter0.firstOnline();
      assertEquals((-1), int0);
      assertEquals(0, onlineCounter0.sumOfEvents());
  }

  @Test
  public void test2()  throws Throwable  {
      OnlineCounter onlineCounter0 = new OnlineCounter();
      int int0 = onlineCounter0.sumOfEvents();
      assertEquals(0, int0);
      assertEquals(true, onlineCounter0.wasOffline());
  }

  @Test
  public void test3()  throws Throwable  {
      OnlineCounter onlineCounter0 = new OnlineCounter();
      onlineCounter0.addOffline();
      assertEquals(1, onlineCounter0.sumOfEvents());
      assertEquals(-1, onlineCounter0.firstOnline());
  }

  @Test
  public void test4()  throws Throwable  {
      OnlineCounter onlineCounter0 = new OnlineCounter();
      onlineCounter0.addOnline();
      onlineCounter0.addOnline();
      assertEquals(2, onlineCounter0.onlineEvents());
      assertEquals(0, onlineCounter0.firstOnline());
  }

  @Test
  public void test5()  throws Throwable  {
      OnlineCounter onlineCounter0 = new OnlineCounter();
      onlineCounter0.addOnline();
      boolean boolean0 = onlineCounter0.wasOffline();
      assertEquals(1, onlineCounter0.sumOfEvents());
      assertEquals(false, boolean0);
  }

  @Test
  public void test6()  throws Throwable  {
      OnlineCounter onlineCounter0 = new OnlineCounter();
      boolean boolean0 = onlineCounter0.wasOffline();
      assertEquals(0, onlineCounter0.sumOfEvents());
      assertEquals(true, boolean0);
  }
}
