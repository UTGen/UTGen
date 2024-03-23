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
import com.lts.xmlser.tags.IntegerTag;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class IntegerTagEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      IntegerTag integerTag0 = new IntegerTag();
      // Undeclared exception!
      try {
        integerTag0.toValue("int");
        fail("Expecting exception: NumberFormatException");
      } catch(NumberFormatException e) {
        /*
         * For input string: \"int\"
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      IntegerTag integerTag0 = new IntegerTag();
      XmlSerializer xmlSerializer0 = new XmlSerializer();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(1286);
      PrintStream printStream0 = new PrintStream((OutputStream) byteArrayOutputStream0, true);
      IndentingPrintWriter indentingPrintWriter0 = new IndentingPrintWriter((OutputStream) printStream0);
      // Undeclared exception!
      try {
        integerTag0.write(xmlSerializer0, indentingPrintWriter0, (String) null, (Object) "class", true);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      IntegerTag integerTag0 = new IntegerTag();
      String string0 = integerTag0.getTagName((Object) null);
      assertEquals("int", string0);
  }
}
