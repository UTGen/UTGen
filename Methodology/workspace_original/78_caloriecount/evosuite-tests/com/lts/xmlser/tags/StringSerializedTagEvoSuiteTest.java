/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.xmlser.tags;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.LTSException;
import com.lts.xmlser.XmlSerializer;
import com.lts.xmlser.tags.StringSerializedTag;
import java.io.Writer;
import javax.imageio.metadata.IIOMetadataNode;
import org.junit.BeforeClass;
import org.w3c.dom.Element;

@RunWith(EvoSuiteRunner.class)
public class StringSerializedTagEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      StringSerializedTag stringSerializedTag0 = new StringSerializedTag();
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      // Undeclared exception!
      try {
        stringSerializedTag0.read((XmlSerializer) null, (Element) iIOMetadataNode0, true);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      Class<?> class0 = Writer.class;
      try {
        StringSerializedTag.createInstance((Class) class0, "");
        fail("Expecting exception: LTSException");
      } catch(LTSException e) {
        /*
         * Error trying to create instance of class java.io.Writer, using a string constructor with value 
         */
      }
  }
}