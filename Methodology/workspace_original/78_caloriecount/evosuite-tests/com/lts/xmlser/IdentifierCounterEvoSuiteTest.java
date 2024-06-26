/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.xmlser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.xmlser.IdentifierCounter;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class IdentifierCounterEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      IdentifierCounter identifierCounter0 = new IdentifierCounter();
      int int0 = identifierCounter0.currentID();
      assertEquals(1, identifierCounter0.nextID());
      assertEquals(0, int0);
  }

  @Test
  public void test1()  throws Throwable  {
      IdentifierCounter identifierCounter0 = new IdentifierCounter();
      int int0 = identifierCounter0.nextID();
      assertEquals(2, identifierCounter0.nextID());
      assertEquals(1, int0);
  }
}
