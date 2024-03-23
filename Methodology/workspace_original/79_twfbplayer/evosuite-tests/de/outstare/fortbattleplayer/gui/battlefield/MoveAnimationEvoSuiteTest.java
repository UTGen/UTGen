/*
 * This file was automatically generated by EvoSuite
 */

package de.outstare.fortbattleplayer.gui.battlefield;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import de.outstare.fortbattleplayer.gui.battlefield.MoveAnimation;
import java.awt.Point;
import javax.swing.DefaultListCellRenderer;
import javax.swing.Icon;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class MoveAnimationEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      JRadioButton jRadioButton0 = new JRadioButton();
      JLabel jLabel0 = new JLabel();
      Point point0 = jLabel0.getLocation();
      MoveAnimation moveAnimation0 = new MoveAnimation((JComponent) jRadioButton0, point0, 1);
      assertNotNull(moveAnimation0);
  }

  @Test
  public void test1()  throws Throwable  {
      DefaultListCellRenderer defaultListCellRenderer0 = new DefaultListCellRenderer();
      Point point0 = defaultListCellRenderer0.getLocation();
      MoveAnimation moveAnimation0 = new MoveAnimation((JComponent) null, point0, 0);
      assertNotNull(moveAnimation0);
  }

  @Test
  public void test2()  throws Throwable  {
      JCheckBox jCheckBox0 = new JCheckBox((Icon) null, true);
      MoveAnimation moveAnimation0 = new MoveAnimation((JComponent) jCheckBox0, (Point) null, 961);
      assertNotNull(moveAnimation0);
  }

  @Test
  public void test3()  throws Throwable  {
      JCheckBoxMenuItem jCheckBoxMenuItem0 = new JCheckBoxMenuItem("q`q9gL");
      DefaultListCellRenderer defaultListCellRenderer0 = new DefaultListCellRenderer();
      Point point0 = defaultListCellRenderer0.getLocation();
      MoveAnimation moveAnimation0 = new MoveAnimation((JComponent) jCheckBoxMenuItem0, point0, 0);
      assertNotNull(moveAnimation0);
  }
}