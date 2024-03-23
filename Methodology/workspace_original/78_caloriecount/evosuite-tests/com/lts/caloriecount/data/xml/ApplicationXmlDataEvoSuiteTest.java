/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.caloriecount.data.xml;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.LTSException;
import com.lts.caloriecount.data.meal.MealList;
import com.lts.caloriecount.data.xml.CalorieCountXml;
import java.io.File;
import java.util.List;
import java.util.Vector;
import javax.imageio.metadata.IIOMetadataNode;
import org.junit.BeforeClass;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

@RunWith(EvoSuiteRunner.class)
public class ApplicationXmlDataEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      CalorieCountXml calorieCountXml0 = new CalorieCountXml();
      File file0 = new File("");
      try {
        calorieCountXml0.loadData(file0);
        fail("Expecting exception: LTSException");
      } catch(LTSException e) {
        /*
         * Error parsing 
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      CalorieCountXml calorieCountXml0 = new CalorieCountXml();
      // Undeclared exception!
      try {
        calorieCountXml0.saveData((File) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      CalorieCountXml calorieCountXml0 = new CalorieCountXml();
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("U");
      MealList mealList0 = new MealList();
      calorieCountXml0.populateList((List) mealList0, (Element) iIOMetadataNode0);
      assertEquals(0, mealList0.size());
  }

  @Test
  public void test3()  throws Throwable  {
      CalorieCountXml calorieCountXml0 = new CalorieCountXml();
      assertNotNull(calorieCountXml0);
      
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("how");
      iIOMetadataNode0.appendChild((Node) iIOMetadataNode0);
      Vector<String> vector0 = new Vector<String>();
      // Undeclared exception!
      try {
        calorieCountXml0.populateList((List) vector0, (Element) iIOMetadataNode0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}