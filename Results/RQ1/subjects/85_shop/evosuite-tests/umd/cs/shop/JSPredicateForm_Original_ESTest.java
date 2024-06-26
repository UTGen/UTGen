/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Mon Mar 18 07:42:30 GMT 2024
 */

package umd.cs.shop;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StreamTokenizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import umd.cs.shop.JSPredicateForm;
import umd.cs.shop.JSSubstitution;
import umd.cs.shop.JSTerm;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class JSPredicateForm_Original_ESTest extends JSPredicateForm_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testMatches() throws Throwable  {
      JSTerm jSTerm = new JSTerm();
      jSTerm.add((Object) "(");
      JSTerm arg0 = new JSTerm();
      JSSubstitution matches = jSTerm.matches((JSPredicateForm) arg0);
      assertTrue(matches.fail());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesJSPredicateFormTakingNoArgumentsAndCallsPrint() throws Throwable  {
      JSPredicateForm jSPredicateForm = new JSPredicateForm();
      jSPredicateForm.print();
      assertEquals("[]", jSPredicateForm.toString());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testToStr() throws Throwable  {
      JSPredicateForm jSPredicateForm = new JSPredicateForm("(PJ)q^ -;{~zk` O");
      StringBuffer str = jSPredicateForm.toStr();
      assertEquals(4, str.length());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFailsToCreateJSPredicateFormTakingStringThrowsError0() throws Throwable  {
      JSPredicateForm jSPredicateForm = null;
      try {
        jSPredicateForm = new JSPredicateForm("(r iJX|LEM;z(nK:ZO");
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFailsToCreateJSPredicateFormTakingStringThrowsError1() throws Throwable  {
      JSPredicateForm jSPredicateForm = null;
      try {
        jSPredicateForm = new JSPredicateForm("(");
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesJSPredicateFormTakingString() throws Throwable  {
      JSPredicateForm jSPredicateForm = new JSPredicateForm((String) null);
      assertTrue(jSPredicateForm.isEmpty());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFailsToCreateJSPredicateFormTakingStreamTokenizerThrowsError() throws Throwable  {
      JSPredicateForm jSPredicateForm = null;
      try {
        jSPredicateForm = new JSPredicateForm((StreamTokenizer) null);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("umd.cs.shop.JSPredicateForm", e);
      }
  }
}
