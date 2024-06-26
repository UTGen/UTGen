/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.swing.table;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.swing.table.KeyHelper;
import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.JMenu;
import javax.swing.text.StyledEditorKit;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class KeyHelperEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      KeyHelper.Mapping keyHelper_Mapping0 = KeyHelper.Mapping.Enter;
      StyledEditorKit.FontFamilyAction styledEditorKit_FontFamilyAction0 = new StyledEditorKit.FontFamilyAction("Enter", "Enter");
      JMenu jMenu0 = new JMenu((Action) styledEditorKit_FontFamilyAction0);
      KeyHelper.mapKey(keyHelper_Mapping0, (JComponent) jMenu0, (Action) styledEditorKit_FontFamilyAction0);
      assertEquals(false, jMenu0.isPaintingForPrint());
  }

  @Test
  public void test1()  throws Throwable  {
      KeyHelper keyHelper0 = new KeyHelper();
      assertNotNull(keyHelper0);
  }
}
