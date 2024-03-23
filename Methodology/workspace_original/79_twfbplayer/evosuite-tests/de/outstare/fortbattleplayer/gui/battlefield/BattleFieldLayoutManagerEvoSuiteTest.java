/*
 * This file was automatically generated by EvoSuite
 */

package de.outstare.fortbattleplayer.gui.battlefield;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import de.outstare.fortbattleplayer.gui.battlefield.BattleFieldLayoutManager;
import de.outstare.fortbattleplayer.model.Battlefield;
import de.outstare.fortbattleplayer.model.impl.SimpleBattleField;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.Box;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JRootPane;
import javax.swing.JSeparator;
import javax.swing.JSplitPane;
import javax.swing.JToolTip;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class BattleFieldLayoutManagerEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      SimpleBattleField simpleBattleField0 = new SimpleBattleField(0, 0);
      BattleFieldLayoutManager battleFieldLayoutManager0 = new BattleFieldLayoutManager((Battlefield) simpleBattleField0);
      JSeparator jSeparator0 = new JSeparator();
      JToolTip jToolTip0 = jSeparator0.createToolTip();
      Dimension dimension0 = battleFieldLayoutManager0.preferredLayoutSize((Container) jToolTip0);
      assertEquals("java.awt.Dimension[width=0,height=0]", dimension0.toString());
      assertNotNull(dimension0);
  }

  @Test
  public void test1()  throws Throwable  {
      SimpleBattleField simpleBattleField0 = new SimpleBattleField(0, 0);
      BattleFieldLayoutManager battleFieldLayoutManager0 = new BattleFieldLayoutManager((Battlefield) simpleBattleField0);
      JSplitPane jSplitPane0 = new JSplitPane(0, false);
      Dimension dimension0 = battleFieldLayoutManager0.minimumLayoutSize((Container) jSplitPane0);
      assertEquals("java.awt.Dimension[width=0,height=0]", dimension0.toString());
      assertNotNull(dimension0);
  }

  @Test
  public void test2()  throws Throwable  {
      SimpleBattleField simpleBattleField0 = new SimpleBattleField(0, 0);
      BattleFieldLayoutManager battleFieldLayoutManager0 = new BattleFieldLayoutManager((Battlefield) simpleBattleField0);
      JRadioButtonMenuItem jRadioButtonMenuItem0 = new JRadioButtonMenuItem("_HO", true);
      // Undeclared exception!
      try {
        battleFieldLayoutManager0.addLayoutComponent("_HO", (Component) jRadioButtonMenuItem0);
        fail("Expecting exception: UnsupportedOperationException");
      } catch(UnsupportedOperationException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      SimpleBattleField simpleBattleField0 = new SimpleBattleField(1797, 15);
      BattleFieldLayoutManager battleFieldLayoutManager0 = new BattleFieldLayoutManager((Battlefield) simpleBattleField0);
      JRootPane jRootPane0 = new JRootPane();
      battleFieldLayoutManager0.layoutContainer((Container) jRootPane0);
      assertEquals(true, jRootPane0.isFocusable());
  }

  @Test
  public void test4()  throws Throwable  {
      SimpleBattleField simpleBattleField0 = new SimpleBattleField(1051, 1051);
      BattleFieldLayoutManager battleFieldLayoutManager0 = new BattleFieldLayoutManager((Battlefield) simpleBattleField0);
      Box box0 = Box.createHorizontalBox();
      battleFieldLayoutManager0.removeLayoutComponent((Component) box0);
      assertEquals(true, box0.isEnabled());
  }
}