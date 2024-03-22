/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Wed Mar 20 23:06:57 GMT 2024
 */

package org.saxpath;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.saxpath.Axis;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Axis_Original_ESTest extends Axis_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLookupTakingString0() throws Throwable  {
      int lookup = Axis.lookup("ancestor-or-self");
      assertEquals(13, lookup);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLookupTakingString1() throws Throwable  {
      int lookup = Axis.lookup("descendant-or-self");
      assertEquals(12, lookup);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLookupTakingString2() throws Throwable  {
      int lookup = Axis.lookup("self");
      assertEquals(11, lookup);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLookupTakingString3() throws Throwable  {
      int lookup = Axis.lookup("namespace");
      assertEquals(10, lookup);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLookupTakingString4() throws Throwable  {
      int lookup = Axis.lookup("attribute");
      assertEquals(9, lookup);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLookupTakingString5() throws Throwable  {
      int lookup = Axis.lookup("preceding");
      assertEquals(8, lookup);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLookupTakingString6() throws Throwable  {
      int lookup = Axis.lookup("following");
      assertEquals(7, lookup);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLookupTakingString7() throws Throwable  {
      int lookup = Axis.lookup("preceding-sibling");
      assertEquals(6, lookup);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLookupTakingString8() throws Throwable  {
      int lookup = Axis.lookup("following-sibling");
      assertEquals(5, lookup);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLookupTakingString9() throws Throwable  {
      int lookup = Axis.lookup("ancestor");
      assertEquals(4, lookup);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLookupTakingString10() throws Throwable  {
      int lookup = Axis.lookup("parent");
      assertEquals(3, lookup);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLookupTakingString11() throws Throwable  {
      int lookup = Axis.lookup("descendant");
      assertEquals(2, lookup);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLookupTakingString12() throws Throwable  {
      int lookup = Axis.lookup("child");
      assertEquals(1, lookup);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLookupTakingStringReturningZero() throws Throwable  {
      int lookup = Axis.lookup("");
      assertEquals(0, lookup);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLookupTakingInt0() throws Throwable  {
      String lookup = Axis.lookup(13);
      assertNotNull(lookup);
      assertEquals("ancestor-or-self", lookup);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLookupTakingInt1() throws Throwable  {
      String lookup = Axis.lookup(12);
      assertEquals("descendant-or-self", lookup);
      assertNotNull(lookup);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLookupTakingInt2() throws Throwable  {
      String lookup = Axis.lookup(11);
      assertEquals("self", lookup);
      assertNotNull(lookup);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLookupTakingInt3() throws Throwable  {
      String lookup = Axis.lookup(10);
      assertEquals("namespace", lookup);
      assertNotNull(lookup);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLookupTakingInt4() throws Throwable  {
      String lookup = Axis.lookup(9);
      assertNotNull(lookup);
      assertEquals("attribute", lookup);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLookupTakingInt5() throws Throwable  {
      String lookup = Axis.lookup(8);
      assertEquals("preceding", lookup);
      assertNotNull(lookup);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLookupTakingInt6() throws Throwable  {
      String lookup = Axis.lookup(7);
      assertEquals("following", lookup);
      assertNotNull(lookup);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLookupTakingInt7() throws Throwable  {
      String lookup = Axis.lookup(6);
      assertNotNull(lookup);
      assertEquals("preceding-sibling", lookup);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLookupTakingInt8() throws Throwable  {
      String lookup = Axis.lookup(5);
      assertNotNull(lookup);
      assertEquals("following-sibling", lookup);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLookupTakingInt9() throws Throwable  {
      String lookup = Axis.lookup(4);
      assertNotNull(lookup);
      assertEquals("ancestor", lookup);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLookupTakingInt10() throws Throwable  {
      String lookup = Axis.lookup(3);
      assertEquals("parent", lookup);
      assertNotNull(lookup);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLookupTakingInt11() throws Throwable  {
      String lookup = Axis.lookup(2);
      assertEquals("descendant", lookup);
      assertNotNull(lookup);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLookupTakingIntReturningNull() throws Throwable  {
      String lookup = Axis.lookup(0);
      assertNull(lookup);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLookupTakingInt12() throws Throwable  {
      String lookup = Axis.lookup(1);
      assertNotNull(lookup);
      assertEquals("child", lookup);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesAxis() throws Throwable  {
      Axis axis = new Axis();
      assertEquals(3, Axis.PARENT);
  }
}
