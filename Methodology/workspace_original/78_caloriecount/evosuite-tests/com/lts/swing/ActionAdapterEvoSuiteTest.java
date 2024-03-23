/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.swing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.swing.ActionAdapter;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeListenerProxy;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ActionAdapterEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ActionAdapter actionAdapter0 = new ActionAdapter();
      actionAdapter0.putValue("Np<_Yff3lC", (Object) null);
      assertEquals(false, actionAdapter0.isEnabled());
  }

  @Test
  public void test1()  throws Throwable  {
      ActionAdapter actionAdapter0 = new ActionAdapter();
      boolean boolean0 = actionAdapter0.isEnabled();
      assertEquals(false, boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      ActionAdapter actionAdapter0 = new ActionAdapter();
      actionAdapter0.actionPerformed((ActionEvent) null);
      assertEquals(false, actionAdapter0.isEnabled());
  }

  @Test
  public void test3()  throws Throwable  {
      ActionAdapter actionAdapter0 = new ActionAdapter();
      actionAdapter0.setEnabled(true);
      assertEquals(false, actionAdapter0.isEnabled());
  }

  @Test
  public void test4()  throws Throwable  {
      ActionAdapter actionAdapter0 = new ActionAdapter();
      actionAdapter0.removePropertyChangeListener((PropertyChangeListener) null);
      assertEquals(false, actionAdapter0.isEnabled());
  }

  @Test
  public void test5()  throws Throwable  {
      ActionAdapter actionAdapter0 = new ActionAdapter();
      PropertyChangeListenerProxy propertyChangeListenerProxy0 = new PropertyChangeListenerProxy("TF238*Xmj1gqyY", (PropertyChangeListener) null);
      actionAdapter0.addPropertyChangeListener((PropertyChangeListener) propertyChangeListenerProxy0);
      assertEquals("TF238*Xmj1gqyY", propertyChangeListenerProxy0.getPropertyName());
  }

  @Test
  public void test6()  throws Throwable  {
      ActionAdapter actionAdapter0 = new ActionAdapter();
      Object object0 = actionAdapter0.getValue("");
      assertNull(object0);
  }
}
