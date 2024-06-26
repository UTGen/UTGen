/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.caloriecount.data.xml;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.caloriecount.data.xml.BeanPropertyAccessor;
import java.beans.BeanInfo;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;
import javax.imageio.metadata.IIOMetadataNode;
import org.junit.BeforeClass;
import org.w3c.dom.Element;

@RunWith(EvoSuiteRunner.class)
public class BeanPropertyAccessorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      BeanPropertyAccessor beanPropertyAccessor0 = new BeanPropertyAccessor((PropertyDescriptor) null);
      Object object0 = new Object();
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode((String) null);
      beanPropertyAccessor0.populateProperty(object0, (Element) iIOMetadataNode0);
      assertNull(iIOMetadataNode0.getLocalName());
  }

  @Test
  public void test1()  throws Throwable  {
      SimpleBeanInfo simpleBeanInfo0 = new SimpleBeanInfo();
      BeanPropertyAccessor beanPropertyAccessor0 = null;
      try {
        beanPropertyAccessor0 = new BeanPropertyAccessor("", (BeanInfo) simpleBeanInfo0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      BeanPropertyAccessor beanPropertyAccessor0 = new BeanPropertyAccessor((PropertyDescriptor) null);
      Object object0 = new Object();
      beanPropertyAccessor0.populateProperty(object0, (Element) null);
  }
}
