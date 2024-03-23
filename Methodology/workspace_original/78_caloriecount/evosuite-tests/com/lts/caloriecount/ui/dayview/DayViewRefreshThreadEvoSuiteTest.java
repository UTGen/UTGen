/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.caloriecount.ui.dayview;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.caloriecount.ui.dayview.DayView;
import com.lts.caloriecount.ui.dayview.DayViewRefreshThread;
import java.awt.Component;
import java.awt.event.WindowEvent;
import javax.swing.DefaultListCellRenderer;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class DayViewRefreshThreadEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DefaultListCellRenderer defaultListCellRenderer0 = new DefaultListCellRenderer();
      DayViewRefreshThread dayViewRefreshThread0 = DayViewRefreshThread.launch((DayView) null, (Component) defaultListCellRenderer0);
      dayViewRefreshThread0.windowOpened((WindowEvent) null);
      // Undeclared exception!
      try {
        dayViewRefreshThread0.run();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      DefaultListCellRenderer defaultListCellRenderer0 = new DefaultListCellRenderer();
      DayViewRefreshThread dayViewRefreshThread0 = DayViewRefreshThread.launch((DayView) null, (Component) defaultListCellRenderer0);
      dayViewRefreshThread0.windowClosed((WindowEvent) null);
      dayViewRefreshThread0.run();
  }

  @Test
  public void test2()  throws Throwable  {
      DefaultListCellRenderer defaultListCellRenderer0 = new DefaultListCellRenderer();
      DayViewRefreshThread dayViewRefreshThread0 = DayViewRefreshThread.launch((DayView) null, (Component) defaultListCellRenderer0);
      dayViewRefreshThread0.stop();
  }
}