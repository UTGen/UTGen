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
import com.lts.xmlser.tags.SimpleTag;
import java.io.StringWriter;
import java.io.Writer;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class SimpleTagEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      SimpleTag simpleTag0 = new SimpleTag();
      XmlSerializer xmlSerializer0 = new XmlSerializer();
      Character character0 = new Character('$');
      // Undeclared exception!
      try {
        simpleTag0.write(xmlSerializer0, (IndentingPrintWriter) null, "", (Object) character0, false);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      SimpleTag simpleTag0 = XmlSerializer.SIMPLE_TAG;
      XmlSerializer xmlSerializer0 = new XmlSerializer();
      StringWriter stringWriter0 = new StringWriter();
      IndentingPrintWriter indentingPrintWriter0 = new IndentingPrintWriter((Writer) stringWriter0);
      // Undeclared exception!
      try {
        simpleTag0.writeAsAttribute(xmlSerializer0, indentingPrintWriter0, (String) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      int int0 = SimpleTag.stringToType((String) null);
      assertEquals((-1), int0);
  }

  @Test
  public void test3()  throws Throwable  {
      XmlSerializer xmlSerializer0 = new XmlSerializer();
      String string0 = xmlSerializer0.SIMPLE_TAG.getTagName((Object) xmlSerializer0);
      assertEquals("com.lts.xmlser.XmlSerializer", string0);
  }

  @Test
  public void test4()  throws Throwable  {
      SimpleTag simpleTag0 = XmlSerializer.SIMPLE_TAG;
      XmlSerializer xmlSerializer0 = new XmlSerializer();
      // Undeclared exception!
      try {
        simpleTag0.write(xmlSerializer0, (IndentingPrintWriter) null, "ref", (Object) "ref");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
