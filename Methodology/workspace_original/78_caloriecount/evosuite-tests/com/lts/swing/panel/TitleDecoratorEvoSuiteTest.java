/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.swing.panel;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.swing.panel.TitleDecorator;
import java.awt.Component;
import java.awt.Container;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JInternalFrame;
import javax.swing.JToolTip;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TitleDecoratorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DefaultListCellRenderer defaultListCellRenderer0 = new DefaultListCellRenderer();
      JToolTip jToolTip0 = defaultListCellRenderer0.createToolTip();
      TitleDecorator titleDecorator0 = new TitleDecorator((Container) defaultListCellRenderer0, "9");
      JToolTip jToolTip1 = (JToolTip)defaultListCellRenderer0.add((Component) jToolTip0);
      assertEquals(false, jToolTip1.isFocusOwner());
  }

  @Test
  public void test1()  throws Throwable  {
      DefaultListCellRenderer defaultListCellRenderer0 = new DefaultListCellRenderer();
      TitleDecorator titleDecorator0 = new TitleDecorator((Container) defaultListCellRenderer0, "9");
      titleDecorator0.changeTitle("9");
  }

  @Test
  public void test2()  throws Throwable  {
      DefaultListCellRenderer defaultListCellRenderer0 = new DefaultListCellRenderer();
      TitleDecorator titleDecorator0 = new TitleDecorator((Container) defaultListCellRenderer0, "9");
      titleDecorator0.containerChanged((Container) null);
  }

  @Test
  public void test3()  throws Throwable  {
      JInternalFrame jInternalFrame0 = new JInternalFrame("Q");
      TitleDecorator titleDecorator0 = new TitleDecorator((Container) jInternalFrame0, "Q");
      assertEquals(0, jInternalFrame0.getWidth());
      assertNotNull(titleDecorator0);
  }
}