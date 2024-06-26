/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.xmlser.fixups;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.LTSException;
import com.lts.xmlser.XmlSerializer;
import com.lts.xmlser.fixups.FieldFixup;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class FieldFixupEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      FieldFixup fieldFixup0 = new FieldFixup();
      XmlSerializer xmlSerializer0 = new XmlSerializer();
      boolean boolean0 = fieldFixup0.fixupSuccessful(xmlSerializer0);
      assertEquals(false, boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      FieldFixup fieldFixup0 = new FieldFixup();
      XmlSerializer xmlSerializer0 = new XmlSerializer();
      xmlSerializer0.addObject((Integer) null, (Object) "replicate");
      // Undeclared exception!
      try {
        fieldFixup0.fixupSuccessful(xmlSerializer0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
