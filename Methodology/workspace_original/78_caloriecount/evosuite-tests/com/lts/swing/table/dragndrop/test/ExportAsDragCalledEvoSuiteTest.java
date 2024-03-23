/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.swing.table.dragndrop.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.swing.table.dragndrop.test.ExportAsDragCalled;
import java.awt.Component;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.io.StringWriter;
import javax.swing.Box;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ExportAsDragCalledEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Box box0 = Box.createHorizontalBox();
      MouseEvent mouseEvent0 = new MouseEvent((Component) box0, 0, (long) 0, 0, 0, 0, 0, false, 0);
      ExportAsDragCalled exportAsDragCalled0 = new ExportAsDragCalled((InputEvent) mouseEvent0, 0);
      StringWriter stringWriter0 = new StringWriter(0);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      exportAsDragCalled0.appendSubclassToString(stringBuffer0);
      assertEquals(", unknown: 0", stringWriter0.toString());
      assertEquals(12, stringBuffer0.length());
  }
}