/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.swing.menu;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.LTSException;
import com.lts.swing.menu.MenuMapping;
import java.lang.reflect.Method;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class MenuMappingEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      MenuMapping menuMapping0 = new MenuMapping("", (Method) null);
      // Undeclared exception!
      try {
        menuMapping0.invoke((Object) "");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      MenuMapping menuMapping0 = new MenuMapping("", (Method) null);
      String string0 = menuMapping0.toString();
      assertEquals(" maps to null", string0);
      assertNotNull(string0);
  }
}
