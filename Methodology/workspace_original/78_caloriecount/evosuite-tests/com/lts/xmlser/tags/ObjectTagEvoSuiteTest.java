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
import com.lts.xmlser.tags.ObjectTag;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.text.Format;
import javax.imageio.metadata.IIOMetadataNode;
import org.junit.BeforeClass;
import org.w3c.dom.Element;

@RunWith(EvoSuiteRunner.class)
public class ObjectTagEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ObjectTag objectTag0 = XmlSerializer.OBJECT_TAG;
      XmlSerializer xmlSerializer0 = new XmlSerializer();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      IndentingPrintWriter indentingPrintWriter0 = new IndentingPrintWriter((OutputStream) byteArrayOutputStream0);
      objectTag0.write(xmlSerializer0, indentingPrintWriter0, "java.lang.String", (Object) "java.lang.String", true);
      assertEquals(536, byteArrayOutputStream0.size());
      assertEquals("<java.lang.String id=\"0\">\n    <count>16</count>\n    <hash>0</hash>\n    <offset>0</offset>\n    <value id=\"1\" array=\"true\" class=\"char\">\n        <char>j</char>\n        <char>a</char>\n        <char>v</char>\n        <char>a</char>\n        <char>.</char>\n        <char>l</char>\n        <char>a</char>\n        <char>n</char>\n        <char>g</char>\n        <char>.</char>\n        <char>S</char>\n        <char>t</char>\n        <char>r</char>\n        <char>i</char>\n        <char>n</char>\n        <char>g</char>\n    </value>\n</java.lang.String>\n", byteArrayOutputStream0.toString());
  }

  @Test
  public void test1()  throws Throwable  {
      ObjectTag objectTag0 = new ObjectTag();
      // Undeclared exception!
      try {
        objectTag0.setFinalValue((Object) "/", (Object) null, (Field) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      ObjectTag objectTag0 = new ObjectTag();
      String string0 = objectTag0.getTagName((Object) "value");
      assertEquals("java.lang.String", string0);
  }

  @Test
  public void test3()  throws Throwable  {
      ObjectTag objectTag0 = XmlSerializer.OBJECT_TAG;
      Class<?> class0 = Format.Field.class;
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("V4rJ.t>MBh");
      XmlSerializer xmlSerializer0 = new XmlSerializer();
      try {
        objectTag0.toFieldValue("V4rJ.t>MBh", (Class) class0, (Element) iIOMetadataNode0, xmlSerializer0);
        fail("Expecting exception: LTSException");
      } catch(LTSException e) {
        /*
         * Could not find field, V4rJ.t>MBh, in class java.text.Format$Field
         */
      }
  }

  @Test
  public void test4()  throws Throwable  {
      ObjectTag objectTag0 = XmlSerializer.OBJECT_TAG;
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      XmlSerializer xmlSerializer0 = new XmlSerializer();
      try {
        objectTag0.processProperty("Y\"\"Ct4Asv2M&v", (Object) "string", (Element) iIOMetadataNode0, xmlSerializer0);
        fail("Expecting exception: LTSException");
      } catch(LTSException e) {
        /*
         * Could not find field, Y\"\"Ct4Asv2M&v, in class java.lang.String
         */
      }
  }

  @Test
  public void test5()  throws Throwable  {
      ObjectTag objectTag0 = new ObjectTag();
      XmlSerializer xmlSerializer0 = new XmlSerializer();
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("java.lang.String");
      try {
        objectTag0.read(xmlSerializer0, (Element) iIOMetadataNode0, true);
        fail("Expecting exception: LTSException");
      } catch(LTSException e) {
        /*
         * Required attribute, id, was missing in tag java.lang.String
         */
      }
  }
}
