/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.caloriecount.ui.entry;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.caloriecount.ui.entry.EntryListViewBuilder;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class EntryListViewBuilderEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      EntryListViewBuilder entryListViewBuilder0 = new EntryListViewBuilder();
      // Undeclared exception!
      try {
        entryListViewBuilder0.build();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
