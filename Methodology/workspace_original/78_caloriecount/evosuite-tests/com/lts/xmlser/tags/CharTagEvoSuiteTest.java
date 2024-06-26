/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.xmlser.tags;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.xmlser.XmlSerializer;
import com.lts.xmlser.tags.CharTag;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class CharTagEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      CharTag charTag0 = new CharTag();
      Character character0 = (Character)charTag0.toValue("b6*xcyBfa0");
      assertEquals('b', (char)character0);
  }

  @Test
  public void test1()  throws Throwable  {
      CharTag charTag0 = XmlSerializer.CHAR_TAG;
      String string0 = charTag0.getTagName((Object) "value");
      assertEquals("char", string0);
  }

  @Test
  public void test2()  throws Throwable  {
      CharTag charTag0 = XmlSerializer.CHAR_TAG;
      String string0 = charTag0.getTagClassName();
      assertEquals("java.lang.Short", string0);
  }
}
