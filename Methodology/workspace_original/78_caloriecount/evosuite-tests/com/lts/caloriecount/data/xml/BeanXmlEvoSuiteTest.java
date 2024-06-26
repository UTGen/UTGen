/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.caloriecount.data.xml;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.LTSException;
import com.lts.caloriecount.data.xml.BeanXml;
import javax.imageio.metadata.IIOMetadataNode;
import org.junit.BeforeClass;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

@RunWith(EvoSuiteRunner.class)
public class BeanXmlEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Class<?> class0 = String.class;
      BeanXml beanXml0 = new BeanXml((String) null, (Class) class0);
      String string0 = beanXml0.getBeanName();
      assertEquals("String", string0);
  }

  @Test
  public void test1()  throws Throwable  {
      Class<?> class0 = Integer.class;
      BeanXml beanXml0 = new BeanXml("z{`7Py'v", (Class) class0);
      Class<Object> class1 = beanXml0.getBeanClass();
      assertEquals(false, class1.isPrimitive());
  }

  @Test
  public void test2()  throws Throwable  {
      Class<?> class0 = String.class;
      BeanXml beanXml0 = new BeanXml((String) null, (Class) class0);
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode((String) null);
      iIOMetadataNode0.appendChild((Node) iIOMetadataNode0);
      String string0 = (String)beanXml0.createAndPopulate((Element) iIOMetadataNode0);
      assertEquals("", string0);
  }
}
