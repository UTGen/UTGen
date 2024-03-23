/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.xmlser.tags;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.LTSException;
import com.lts.io.IndentingPrintWriter;
import com.lts.xmlser.XmlSerializer;
import com.lts.xmlser.tags.BooleanTag;
import java.io.PipedWriter;
import java.io.Writer;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class BooleanTagEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      BooleanTag booleanTag0 = new BooleanTag();
      Boolean boolean0 = (Boolean)booleanTag0.toValue("");
      assertEquals("false", boolean0.toString());
  }

  @Test
  public void test1()  throws Throwable  {
      BooleanTag booleanTag0 = XmlSerializer.BOOLEAN_TAG;
      XmlSerializer xmlSerializer0 = new XmlSerializer();
      PipedWriter pipedWriter0 = new PipedWriter();
      IndentingPrintWriter indentingPrintWriter0 = new IndentingPrintWriter((Writer) pipedWriter0);
      booleanTag0.write(xmlSerializer0, indentingPrintWriter0, "", (Object) "java.lang.Float", true);
      assertEquals("java.lang.Boolean", booleanTag0.getTagClassName());
  }

  @Test
  public void test2()  throws Throwable  {
      BooleanTag booleanTag0 = new BooleanTag();
      String string0 = booleanTag0.getTagName((Object) "double");
      assertEquals("boolean", string0);
  }
}
