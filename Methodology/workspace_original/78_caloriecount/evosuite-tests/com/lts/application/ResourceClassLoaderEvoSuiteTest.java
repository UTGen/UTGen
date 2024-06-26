/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.application;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.application.ResourceClassLoader;
import java.net.URL;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ResourceClassLoaderEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ResourceClassLoader resourceClassLoader0 = new ResourceClassLoader(classLoader0);
      ResourceClassLoader resourceClassLoader1 = new ResourceClassLoader((ClassLoader) resourceClassLoader0);
      URL uRL0 = resourceClassLoader1.getResource("");
      assertEquals("jar:file:/mnt/fastdata/ac1gf/SF110/dist/78_caloriecount/caloriecount.jar!/com/lts/application/", uRL0.toExternalForm());
  }

  @Test
  public void test1()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      ResourceClassLoader resourceClassLoader0 = new ResourceClassLoader(classLoader0);
      URL uRL0 = resourceClassLoader0.getResource("");
      resourceClassLoader0.readURL(uRL0);
      assertNull(uRL0.getUserInfo());
  }
}
