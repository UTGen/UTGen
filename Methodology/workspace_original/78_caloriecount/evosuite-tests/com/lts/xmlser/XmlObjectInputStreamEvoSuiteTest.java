/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.xmlser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.LTSException;
import com.lts.xmlser.XmlObjectInputStream;
import com.lts.xmlser.XmlSerializer;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.MalformedURLException;
import org.junit.BeforeClass;
import org.w3c.dom.Document;

@RunWith(EvoSuiteRunner.class)
public class XmlObjectInputStreamEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      File file0 = new File("&lt;", "&lt;");
      XmlObjectInputStream xmlObjectInputStream0 = null;
      try {
        xmlObjectInputStream0 = new XmlObjectInputStream(file0);
        fail("Expecting exception: FileNotFoundException");
      } catch(FileNotFoundException e) {
        /*
         * &lt;/&lt; (No such file or directory)
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      XmlObjectInputStream xmlObjectInputStream0 = new XmlObjectInputStream();
      // Undeclared exception!
      try {
        xmlObjectInputStream0.readFloat();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      XmlObjectInputStream xmlObjectInputStream0 = new XmlObjectInputStream();
      // Undeclared exception!
      try {
        xmlObjectInputStream0.readByte();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      XmlObjectInputStream xmlObjectInputStream0 = new XmlObjectInputStream();
      xmlObjectInputStream0.setForgiving(false);
      assertEquals(false, xmlObjectInputStream0.forgiving());
  }

  @Test
  public void test4()  throws Throwable  {
      XmlObjectInputStream xmlObjectInputStream0 = null;
      try {
        xmlObjectInputStream0 = new XmlObjectInputStream("<9-- ");
        fail("Expecting exception: FileNotFoundException");
      } catch(FileNotFoundException e) {
        /*
         * <9--  (No such file or directory)
         */
      }
  }

  @Test
  public void test5()  throws Throwable  {
      XmlObjectInputStream xmlObjectInputStream0 = new XmlObjectInputStream();
      // Undeclared exception!
      try {
        xmlObjectInputStream0.readDouble();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test6()  throws Throwable  {
      XmlObjectInputStream xmlObjectInputStream0 = new XmlObjectInputStream();
      boolean boolean0 = xmlObjectInputStream0.forgiving();
      assertEquals(false, boolean0);
  }

  @Test
  public void test7()  throws Throwable  {
      XmlObjectInputStream xmlObjectInputStream0 = new XmlObjectInputStream();
      // Undeclared exception!
      try {
        xmlObjectInputStream0.readInt();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test8()  throws Throwable  {
      XmlObjectInputStream xmlObjectInputStream0 = new XmlObjectInputStream();
      xmlObjectInputStream0.setDocument((Document) null);
      assertEquals(0, xmlObjectInputStream0.getIndex());
  }

  @Test
  public void test9()  throws Throwable  {
      XmlObjectInputStream xmlObjectInputStream0 = null;
      try {
        xmlObjectInputStream0 = new XmlObjectInputStream((Reader) null);
        fail("Expecting exception: MalformedURLException");
      } catch(MalformedURLException e) {
      }
  }

  @Test
  public void test10()  throws Throwable  {
      XmlObjectInputStream xmlObjectInputStream0 = new XmlObjectInputStream();
      // Undeclared exception!
      try {
        xmlObjectInputStream0.readBoolean();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test11()  throws Throwable  {
      XmlObjectInputStream xmlObjectInputStream0 = null;
      try {
        xmlObjectInputStream0 = new XmlObjectInputStream((InputStream) null);
        fail("Expecting exception: MalformedURLException");
      } catch(MalformedURLException e) {
      }
  }

  @Test
  public void test12()  throws Throwable  {
      XmlObjectInputStream xmlObjectInputStream0 = new XmlObjectInputStream();
      // Undeclared exception!
      try {
        xmlObjectInputStream0.readLong();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test13()  throws Throwable  {
      XmlObjectInputStream xmlObjectInputStream0 = new XmlObjectInputStream();
      XmlSerializer xmlSerializer0 = new XmlSerializer();
      xmlObjectInputStream0.validateGraph(xmlSerializer0);
      assertEquals(0, xmlObjectInputStream0.getIndex());
  }

  @Test
  public void test14()  throws Throwable  {
      XmlObjectInputStream xmlObjectInputStream0 = new XmlObjectInputStream();
      // Undeclared exception!
      try {
        xmlObjectInputStream0.readChar();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test15()  throws Throwable  {
      XmlObjectInputStream xmlObjectInputStream0 = new XmlObjectInputStream();
      xmlObjectInputStream0.setIndex(386);
      // Undeclared exception!
      try {
        xmlObjectInputStream0.readShort();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test16()  throws Throwable  {
      XmlObjectInputStream xmlObjectInputStream0 = new XmlObjectInputStream();
      xmlObjectInputStream0.close();
      assertEquals(0, xmlObjectInputStream0.getIndex());
  }
}
