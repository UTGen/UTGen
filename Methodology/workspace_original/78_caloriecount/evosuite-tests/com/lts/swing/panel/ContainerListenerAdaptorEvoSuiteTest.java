/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.swing.panel;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.swing.panel.ContainerListenerAdaptor;
import java.awt.Component;
import java.awt.event.ContainerEvent;
import javax.swing.JTabbedPane;
import javax.swing.JToolTip;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ContainerListenerAdaptorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ContainerListenerAdaptor containerListenerAdaptor0 = new ContainerListenerAdaptor();
      containerListenerAdaptor0.componentAdded((ContainerEvent) null);
  }

  @Test
  public void test1()  throws Throwable  {
      ContainerListenerAdaptor containerListenerAdaptor0 = new ContainerListenerAdaptor();
      JTabbedPane jTabbedPane0 = new JTabbedPane();
      JToolTip jToolTip0 = jTabbedPane0.createToolTip();
      ContainerEvent containerEvent0 = new ContainerEvent((Component) jToolTip0, 0, (Component) jToolTip0);
      containerListenerAdaptor0.componentRemoved(containerEvent0);
  }
}
