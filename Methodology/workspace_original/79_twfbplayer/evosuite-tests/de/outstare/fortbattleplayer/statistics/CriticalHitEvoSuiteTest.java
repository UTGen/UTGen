/*
 * This file was automatically generated by EvoSuite
 */

package de.outstare.fortbattleplayer.statistics;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import de.outstare.fortbattleplayer.model.Combatant;
import de.outstare.fortbattleplayer.statistics.CriticalHit;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class CriticalHitEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      CriticalHit criticalHit0 = null;
      try {
        criticalHit0 = new CriticalHit((Combatant) null, (Combatant) null, 413, 413);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}