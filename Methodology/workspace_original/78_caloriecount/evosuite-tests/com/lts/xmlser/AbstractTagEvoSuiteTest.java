/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.xmlser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.LTSException;
import com.lts.io.IndentingPrintWriter;
import com.lts.xmlser.XmlSerializer;
import com.lts.xmlser.tags.ArrayTag;
import com.lts.xmlser.tags.ByteTag;
import com.lts.xmlser.tags.DoubleTag;
import com.lts.xmlser.tags.FloatTag;
import com.lts.xmlser.tags.IntegerTag;
import com.lts.xmlser.tags.ShortTag;
import java.io.ByteArrayOutputStream;
import java.io.CharArrayWriter;
import java.io.OutputStream;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Field;
import javax.imageio.metadata.IIOMetadataNode;
import org.junit.BeforeClass;
import org.w3c.dom.Element;

@RunWith(EvoSuiteRunner.class)
public class AbstractTagEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ArrayTag arrayTag0 = new ArrayTag();
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("");
      XmlSerializer xmlSerializer0 = new XmlSerializer();
      try {
        arrayTag0.read(xmlSerializer0, (Element) iIOMetadataNode0, true);
        fail("Expecting exception: LTSException");
      } catch(LTSException e) {
        /*
         * Required attribute, class, was missing in tag 
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      ByteTag byteTag0 = XmlSerializer.BYTE_TAG;
      XmlSerializer xmlSerializer0 = new XmlSerializer();
      StringWriter stringWriter0 = new StringWriter();
      IndentingPrintWriter indentingPrintWriter0 = new IndentingPrintWriter((Writer) stringWriter0);
      byteTag0.printSimpleValue(xmlSerializer0, indentingPrintWriter0, "}:9~~J1F", "}:9~~J1F", "}:9~~J1F");
      assertEquals("<}:9~~J1F value=\"}:9~~J1F\" class=\"}:9~~J1F\"/>\n", stringWriter0.toString());
  }

  @Test
  public void test2()  throws Throwable  {
      IntegerTag integerTag0 = new IntegerTag();
      XmlSerializer xmlSerializer0 = new XmlSerializer();
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      IndentingPrintWriter indentingPrintWriter0 = new IndentingPrintWriter((Writer) charArrayWriter0);
      integerTag0.write(xmlSerializer0, indentingPrintWriter0, "j}c>Ik+J", (Object) "null");
      assertEquals("<j}c>Ik+J>null</j}c>Ik+J>\n", charArrayWriter0.toString());
      assertEquals(26, charArrayWriter0.size());
  }

  @Test
  public void test3()  throws Throwable  {
      ShortTag shortTag0 = new ShortTag();
      try {
        shortTag0.stringToClass("}:9~~J1F");
        fail("Expecting exception: LTSException");
      } catch(LTSException e) {
        /*
         * java.lang.ClassNotFoundException: Class '}:9~~J1F.class' should be in target project, but could not be found!
         */
      }
  }

  @Test
  public void test4()  throws Throwable  {
      XmlSerializer xmlSerializer0 = new XmlSerializer();
      // Undeclared exception!
      try {
        xmlSerializer0.REFERENCE_TAG.getFieldValue((Object) "ref", (Field) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test5()  throws Throwable  {
      DoubleTag doubleTag0 = XmlSerializer.DOUBLE_TAG;
      XmlSerializer xmlSerializer0 = new XmlSerializer();
      String string0 = "o4@-1V\\uI";
      // Undeclared exception!
      try {
        doubleTag0.printValueElement(xmlSerializer0, (IndentingPrintWriter) null, string0, string0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test6()  throws Throwable  {
      FloatTag floatTag0 = new FloatTag();
      try {
        floatTag0.createInstance("lRImKq'`Yt|,w3I/");
        fail("Expecting exception: LTSException");
      } catch(LTSException e) {
        /*
         * java.lang.ClassNotFoundException: lRImKq'`Yt|,w3I/
         */
      }
  }

  @Test
  public void test7()  throws Throwable  {
      ShortTag shortTag0 = XmlSerializer.SHORT_TAG;
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      IndentingPrintWriter indentingPrintWriter0 = new IndentingPrintWriter((OutputStream) byteArrayOutputStream0);
      shortTag0.printClosingElement(indentingPrintWriter0, "", false);
      assertEquals(false, indentingPrintWriter0.needToPrintPrefix());
      assertEquals("</>", byteArrayOutputStream0.toString());
  }

  @Test
  public void test8()  throws Throwable  {
      XmlSerializer xmlSerializer0 = new XmlSerializer();
      String string0 = xmlSerializer0.STRING_SERIALIZED_TAG.escapeCharacters("<R,");
      assertEquals("&lt;R,", string0);
      assertNotNull(string0);
  }

  @Test
  public void test9()  throws Throwable  {
      IntegerTag integerTag0 = new IntegerTag();
      String string0 = integerTag0.escapeCharacters("lRImKq'`Yt|,w3I/");
      assertEquals("lRImKq'`Yt|,w3I/", string0);
  }

  @Test
  public void test10()  throws Throwable  {
      ArrayTag arrayTag0 = new ArrayTag();
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("");
      String string0 = arrayTag0.stringChildValue((Element) iIOMetadataNode0);
      assertNotNull(string0);
      assertEquals("", string0);
  }

  @Test
  public void test11()  throws Throwable  {
      ArrayTag arrayTag0 = new ArrayTag();
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("");
      String string0 = arrayTag0.getValueOrText((Element) iIOMetadataNode0, false);
      assertNull(string0);
  }

  @Test
  public void test12()  throws Throwable  {
      ByteTag byteTag0 = new ByteTag();
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      try {
        byteTag0.getValueOrText((Element) iIOMetadataNode0, true);
        fail("Expecting exception: LTSException");
      } catch(LTSException e) {
        /*
         * Empty or null value for null
         */
      }
  }

  @Test
  public void test13()  throws Throwable  {
      DoubleTag doubleTag0 = new DoubleTag();
      XmlSerializer xmlSerializer0 = new XmlSerializer();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(1);
      IndentingPrintWriter indentingPrintWriter0 = new IndentingPrintWriter((OutputStream) byteArrayOutputStream0);
      // Undeclared exception!
      try {
        doubleTag0.printSimpleValue(xmlSerializer0, indentingPrintWriter0, (String) null, (String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
