/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.xml;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.LTSException;
import com.lts.xml.XMLUtils;
import com.sun.org.apache.xerces.internal.dom.DocumentImpl;
import com.sun.org.apache.xerces.internal.dom.ElementImpl;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import javax.imageio.metadata.IIOMetadataNode;
import org.evosuite.Properties.SandboxMode;
import org.evosuite.sandbox.Sandbox;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

@RunWith(EvoSuiteRunner.class)
public class XMLUtilsEvoSuiteTest {

  private static ExecutorService executor; 

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
    org.evosuite.Properties.SANDBOX_MODE = SandboxMode.RECOMMENDED; 
    Sandbox.initializeSecurityManagerForSUT(); 
    executor = Executors.newCachedThreadPool(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    executor.shutdownNow(); 
    Sandbox.resetDefaultSecurityManager(); 
  } 

  @Before 
  public void initTestCase(){ 
    Sandbox.goingToExecuteSUTCode(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    Sandbox.doneWithExecutingSUTCode(); 
  } 


  @Test
  public void test0()  throws Throwable  {
      DocumentImpl documentImpl0 = (DocumentImpl)XMLUtils.createDocument();
      assertNotNull(documentImpl0);
      
      ElementImpl elementImpl0 = (ElementImpl)XMLUtils.createElement((Document) documentImpl0, "S", "S");
      assertNotNull(elementImpl0);
      
      XMLUtils.addText((Element) elementImpl0, "Error parsing ");
      assertEquals("SError parsing ", elementImpl0.getTextContent());
      assertEquals("S", elementImpl0.getTagName());
  }

  @Test
  public void test1()  throws Throwable  {
      DocumentImpl documentImpl0 = (DocumentImpl)XMLUtils.createDocument();
      assertNotNull(documentImpl0);
      
      ElementImpl elementImpl0 = (ElementImpl)XMLUtils.createElement((Document) documentImpl0, "i", "i");
      assertNotNull(elementImpl0);
      
      XMLUtils.createAttr((Element) elementImpl0, "i", (-7L));
      String string0 = XMLUtils.getAttrOrChild((Element) elementImpl0, "i");
      assertEquals(true, elementImpl0.hasAttributes());
      assertEquals("-7", string0);
  }

  @Test
  public void test2()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      String[] stringArray0 = new String[6];
      // Undeclared exception!
      try {
        XMLUtils.getChildTime((Element) iIOMetadataNode0, "?eVbTw(he\"", stringArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      DocumentImpl documentImpl0 = (DocumentImpl)XMLUtils.createDocument();
      assertNotNull(documentImpl0);
      
      ElementImpl elementImpl0 = (ElementImpl)XMLUtils.createElement((Document) documentImpl0, "S", "S");
      assertNotNull(elementImpl0);
      
      XMLUtils.createChildAndText((Element) elementImpl0, "S", "S");
      XMLUtils.getChild("i", (Element) elementImpl0);
      assertEquals(2, elementImpl0.getLength());
      assertEquals("[S: null]", elementImpl0.toString());
  }

  @Test
  public void test4()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      XMLUtils.createAttr((Element) iIOMetadataNode0, "N7UCffH", 824);
      Integer integer0 = XMLUtils.getIntegerAttr((Node) iIOMetadataNode0, "N7UCffH");
      assertEquals(true, iIOMetadataNode0.hasAttributes());
      assertEquals(824, (int)integer0);
  }

  @Test
  public void test5()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("R2}jA%ue%G");
      // Undeclared exception!
      try {
        XMLUtils.createChild((Element) iIOMetadataNode0, "R2}jA%ue%G");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test6()  throws Throwable  {
      XMLUtils xMLUtils0 = new XMLUtils();
      assertNotNull(xMLUtils0);
  }

  @Test
  public void test7()  throws Throwable  {
      DocumentImpl documentImpl0 = (DocumentImpl)XMLUtils.createDocument();
      assertNotNull(documentImpl0);
      
      ElementImpl elementImpl0 = (ElementImpl)XMLUtils.createElement((Document) documentImpl0, "S", "S");
      assertNotNull(elementImpl0);
      
      ElementImpl elementImpl1 = (ElementImpl)XMLUtils.createChildTime((Element) elementImpl0, "i", (-769L));
      String string0 = XMLUtils.getAbsolutePath((Element) elementImpl1);
      assertEquals(2, elementImpl0.getLength());
      assertEquals("/S/i", string0);
  }

  @Test
  public void test8()  throws Throwable  {
      DocumentImpl documentImpl0 = (DocumentImpl)XMLUtils.createDocument();
      assertNotNull(documentImpl0);
      
      ElementImpl elementImpl0 = (ElementImpl)XMLUtils.createElement((Document) documentImpl0, "S", "S");
      assertNotNull(elementImpl0);
      
      String string0 = XMLUtils.getAbsolutePath((Element) elementImpl0);
      assertEquals("S", elementImpl0.getTextContent());
      assertEquals("/S", string0);
      assertNotNull(string0);
  }

  @Test
  public void test9()  throws Throwable  {
      // Undeclared exception!
      try {
        XMLUtils.readDocument((File) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * File cannot be null
         */
      }
  }

  @Test
  public void test10()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
        try {
          File file0 = new File("#5_wo^=sa3nMCXzc");
          DocumentImpl documentImpl0 = (DocumentImpl)XMLUtils.createDocument();
          // Undeclared exception!
          try {
            XMLUtils.writeDocument(file0, (Document) documentImpl0);
            fail("Expecting exception: SecurityException");
          } catch(SecurityException e) {
            /*
             * Security manager blocks (java.io.FilePermission #5_wo^=sa3nMCXzc write)
             * java.lang.Thread.getStackTrace(Thread.java:1479)
             * org.evosuite.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:303)
             * java.lang.SecurityManager.checkWrite(SecurityManager.java:962)
             * java.io.FileOutputStream.<init>(FileOutputStream.java:183)
             * java.io.FileOutputStream.<init>(FileOutputStream.java:145)
             * java.io.FileWriter.<init>(FileWriter.java:73)
             * com.lts.xml.XMLUtils.writeDocument(XMLUtils.java:541)
             * sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
             * sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:39)
             * sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:25)
             * java.lang.reflect.Method.invoke(Method.java:597)
             * org.evosuite.testcase.MethodStatement$1.execute(MethodStatement.java:262)
             * org.evosuite.testcase.AbstractStatement.exceptionHandler(AbstractStatement.java:142)
             * org.evosuite.testcase.MethodStatement.execute(MethodStatement.java:217)
             * org.evosuite.testcase.TestRunnable.call(TestRunnable.java:291)
             * org.evosuite.testcase.TestRunnable.call(TestRunnable.java:44)
             * java.util.concurrent.FutureTask$Sync.innerRun(FutureTask.java:303)
             * java.util.concurrent.FutureTask.run(FutureTask.java:138)
             * java.util.concurrent.ThreadPoolExecutor$Worker.runTask(ThreadPoolExecutor.java:886)
             * java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:908)
             * java.lang.Thread.run(Thread.java:662)
             */
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }

  @Test
  public void test11()  throws Throwable  {
      DocumentImpl documentImpl0 = (DocumentImpl)XMLUtils.createDocument();
      assertNotNull(documentImpl0);
      
      ElementImpl elementImpl0 = (ElementImpl)XMLUtils.createElement((Document) documentImpl0, "i", "i");
      assertNotNull(elementImpl0);
      
      ElementImpl elementImpl1 = (ElementImpl)XMLUtils.createChild((Element) elementImpl0, "i", (double) (-12));
      assertEquals(2, elementImpl0.getLength());
      assertEquals(true, elementImpl1.hasAttributes());
  }

  @Test
  public void test12()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      // Undeclared exception!
      try {
        XMLUtils.getChildInt((Element) iIOMetadataNode0, "/null");
        fail("Expecting exception: NumberFormatException");
      } catch(NumberFormatException e) {
        /*
         * null
         */
      }
  }

  @Test
  public void test13()  throws Throwable  {
      DocumentImpl documentImpl0 = (DocumentImpl)XMLUtils.createDocument();
      assertNotNull(documentImpl0);
      
      ElementImpl elementImpl0 = (ElementImpl)XMLUtils.createElement((Document) documentImpl0, "S", "S");
      assertNotNull(elementImpl0);
      
      String string0 = XMLUtils.getAttrOrChild((Element) elementImpl0, "S");
      assertNull(string0);
      assertEquals("S", elementImpl0.getTextContent());
      assertEquals("S", elementImpl0.getNodeName());
      assertEquals(1, elementImpl0.getLength());
  }

  @Test
  public void test14()  throws Throwable  {
      DocumentImpl documentImpl0 = (DocumentImpl)XMLUtils.createDocument();
      assertNotNull(documentImpl0);
      
      ElementImpl elementImpl0 = (ElementImpl)XMLUtils.createElement((Document) documentImpl0, "S", "S");
      assertNotNull(elementImpl0);
      
      Long long0 = XMLUtils.getChildTime((Element) elementImpl0, "S");
      assertEquals("S", elementImpl0.getNodeName());
      assertEquals(0L, (long)long0);
      assertEquals("S", elementImpl0.getTextContent());
  }

  @Test
  public void test15()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      XMLUtils.getIntegerAttr((Node) iIOMetadataNode0, "N7UCffH");
  }

  @Test
  public void test16()  throws Throwable  {
      DocumentImpl documentImpl0 = (DocumentImpl)XMLUtils.createDocument();
      assertNotNull(documentImpl0);
      
      ElementImpl elementImpl0 = (ElementImpl)XMLUtils.createElement((Document) documentImpl0, "i", "i");
      assertNotNull(elementImpl0);
      
      XMLUtils.createAttr((Element) elementImpl0, "i", (-7L));
      Boolean boolean0 = XMLUtils.getBooleanAttr((Node) elementImpl0, "i");
      assertEquals(true, elementImpl0.hasAttributes());
      assertEquals(false, (boolean)boolean0);
  }

  @Test
  public void test17()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("PIKjYFriJ|1Sa+~z");
      XMLUtils.getBooleanAttr((Node) iIOMetadataNode0, "yXN\"8PmtG]q");
  }

  @Test
  public void test18()  throws Throwable  {
      DocumentImpl documentImpl0 = (DocumentImpl)XMLUtils.createDocument();
      assertNotNull(documentImpl0);
      
      ElementImpl elementImpl0 = (ElementImpl)XMLUtils.createElement((Document) documentImpl0, "i", "i");
      assertNotNull(elementImpl0);
      
      XMLUtils.createChildAndText((Element) elementImpl0, "i", "i");
      XMLUtils.getChild("i", (Element) elementImpl0);
      assertEquals(2, elementImpl0.getLength());
      assertEquals("ii", elementImpl0.getTextContent());
  }

  @Test
  public void test19()  throws Throwable  {
      DocumentImpl documentImpl0 = (DocumentImpl)XMLUtils.createDocument();
      assertNotNull(documentImpl0);
      
      ElementImpl elementImpl0 = (ElementImpl)XMLUtils.createElement((Document) documentImpl0, "S", "S");
      assertNotNull(elementImpl0);
      
      ElementImpl elementImpl1 = (ElementImpl)XMLUtils.getChild("i", (Element) elementImpl0);
      assertEquals("S", elementImpl0.getTextContent());
      assertEquals("[S: null]", elementImpl0.toString());
      assertNull(elementImpl1);
  }

  @Test
  public void test20()  throws Throwable  {
      DocumentImpl documentImpl0 = (DocumentImpl)XMLUtils.createDocument();
      ElementImpl elementImpl0 = (ElementImpl)XMLUtils.createElement((Document) documentImpl0, "S", "S");
      assertNotNull(elementImpl0);
      
      XMLUtils.createChildAndText((Element) elementImpl0, "S", "S");
      XMLUtils.getChildTime((Element) elementImpl0, "S");
      assertEquals(2, elementImpl0.getLength());
      assertEquals("SS", elementImpl0.getTextContent());
  }

  @Test
  public void test21()  throws Throwable  {
      DocumentImpl documentImpl0 = (DocumentImpl)XMLUtils.createDocument();
      assertNotNull(documentImpl0);
      
      ElementImpl elementImpl0 = (ElementImpl)XMLUtils.createElement((Document) documentImpl0, "S", "S");
      assertNotNull(elementImpl0);
      
      XMLUtils.createChildAndText((Element) elementImpl0, "S", "S");
      // Undeclared exception!
      try {
        XMLUtils.getChildLong((Element) elementImpl0, "/i/i");
        fail("Expecting exception: NumberFormatException");
      } catch(NumberFormatException e) {
        /*
         * null
         */
      }
  }

  @Test
  public void test22()  throws Throwable  {
      DocumentImpl documentImpl0 = (DocumentImpl)XMLUtils.createDocument();
      assertNotNull(documentImpl0);
      
      ElementImpl elementImpl0 = (ElementImpl)XMLUtils.createElement((Document) documentImpl0, "i", "i");
      assertNotNull(elementImpl0);
      
      XMLUtils.getChild((Element) elementImpl0, "i");
      assertEquals("i", elementImpl0.getTextContent());
      assertEquals("[i: null]", elementImpl0.toString());
      assertEquals(1, elementImpl0.getLength());
  }

  @Test
  public void test23()  throws Throwable  {
      DocumentImpl documentImpl0 = (DocumentImpl)XMLUtils.createDocument();
      assertNotNull(documentImpl0);
      
      ElementImpl elementImpl0 = (ElementImpl)XMLUtils.createElement((Document) documentImpl0, "i", "i");
      assertNotNull(elementImpl0);
      
      XMLUtils.createChildAndText((Element) elementImpl0, "i", "i");
      XMLUtils.getChild((Element) elementImpl0, "i");
      assertEquals("ii", elementImpl0.getTextContent());
      assertEquals(2, elementImpl0.getLength());
  }

  @Test
  public void test24()  throws Throwable  {
      DocumentImpl documentImpl0 = (DocumentImpl)XMLUtils.createDocument();
      assertNotNull(documentImpl0);
      
      ElementImpl elementImpl0 = (ElementImpl)XMLUtils.createElement((Document) documentImpl0, "i");
      assertNotNull(elementImpl0);
      
      XMLUtils.createChildTime((Element) elementImpl0, "i", (-751L));
      Map<String, String> map0 = XMLUtils.buildNameValueMap((Element) elementImpl0);
      assertEquals(1, elementImpl0.getLength());
      assertEquals(false, map0.isEmpty());
  }

  @Test
  public void test25()  throws Throwable  {
      DocumentImpl documentImpl0 = (DocumentImpl)XMLUtils.createDocument();
      assertNotNull(documentImpl0);
      
      ElementImpl elementImpl0 = (ElementImpl)XMLUtils.createElement((Document) documentImpl0, "i");
      assertNotNull(elementImpl0);
      
      ElementImpl elementImpl1 = (ElementImpl)XMLUtils.createChildTime((Element) elementImpl0, "i", (-751L));
      XMLUtils.createChild((Element) elementImpl1, "i", 0);
      // Undeclared exception!
      try {
        XMLUtils.getChildLong((Element) elementImpl0, "i");
        fail("Expecting exception: NumberFormatException");
      } catch(NumberFormatException e) {
        /*
         * null
         */
      }
  }

  @Test
  public void test26()  throws Throwable  {
      DocumentImpl documentImpl0 = (DocumentImpl)XMLUtils.createDocument();
      assertNotNull(documentImpl0);
      
      ElementImpl elementImpl0 = (ElementImpl)XMLUtils.createElement((Document) documentImpl0, "S", "S");
      assertNotNull(elementImpl0);
      
      XMLUtils.createChildAndText((Element) elementImpl0, "S", "S");
      String string0 = XMLUtils.getAttrOrChild((Element) elementImpl0, "S");
      assertEquals(2, elementImpl0.getLength());
      assertEquals("S", string0);
  }

  @Test
  public void test27()  throws Throwable  {
      DocumentImpl documentImpl0 = (DocumentImpl)XMLUtils.createDocument();
      assertNotNull(documentImpl0);
      
      ElementImpl elementImpl0 = (ElementImpl)XMLUtils.createElement((Document) documentImpl0, "i", "i");
      assertNotNull(elementImpl0);
      
      String string0 = XMLUtils.getValue((Element) elementImpl0);
      assertEquals("i", elementImpl0.getNodeName());
      assertNotNull(string0);
      assertEquals("i", string0);
  }

  @Test
  public void test28()  throws Throwable  {
      DocumentImpl documentImpl0 = (DocumentImpl)XMLUtils.createDocument();
      assertNotNull(documentImpl0);
      
      ElementImpl elementImpl0 = (ElementImpl)XMLUtils.createElement((Document) documentImpl0, "i");
      assertNotNull(elementImpl0);
      
      XMLUtils.createChildTime((Element) elementImpl0, "i", (-751L));
      XMLUtils.getValue((Element) elementImpl0);
      assertEquals(1, elementImpl0.getLength());
  }

  @Test
  public void test29()  throws Throwable  {
      String string0 = XMLUtils.getAbsolutePath((Element) null);
      assertEquals("", string0);
  }
}
