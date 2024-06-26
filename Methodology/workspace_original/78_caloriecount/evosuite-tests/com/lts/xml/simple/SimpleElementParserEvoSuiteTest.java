/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.xml.simple;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.xml.simple.SimpleElement;
import com.lts.xml.simple.SimpleElementParser;
import javax.imageio.metadata.IIOMetadataNode;
import org.junit.BeforeClass;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

@RunWith(EvoSuiteRunner.class)
public class SimpleElementParserEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      SimpleElementParser simpleElementParser0 = new SimpleElementParser();
      // Undeclared exception!
      try {
        simpleElementParser0.parse((Document) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      SimpleElementParser simpleElementParser0 = new SimpleElementParser();
      SimpleElement simpleElement0 = simpleElementParser0.getRoot();
      assertNull(simpleElement0);
  }

  @Test
  public void test2()  throws Throwable  {
      SimpleElementParser simpleElementParser0 = new SimpleElementParser();
      SimpleElement simpleElement0 = new SimpleElement("background", 27.829407905095884);
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("background");
      iIOMetadataNode0.setAttributeNS("background", "background", "background");
      NodeList nodeList0 = iIOMetadataNode0.getElementsByTagNameNS("background", "background");
      simpleElementParser0.addChildren(simpleElement0, nodeList0);
      assertEquals("background", simpleElement0.toString());
      assertEquals(0.0, simpleElement0.getDoubleValue(), 0.01D);
  }
}
