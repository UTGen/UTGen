/*
 * This file was automatically generated by EvoSuite
 */

package de.outstare.fortbattleplayer.statistics;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import de.outstare.fortbattleplayer.model.Weapon;
import de.outstare.fortbattleplayer.model.impl.SimpleWeapon;
import de.outstare.fortbattleplayer.statistics.WeaponModCounter;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class WeaponModCounterEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      WeaponModCounter.FettesOilCounter weaponModCounter_FettesOilCounter0 = new WeaponModCounter.FettesOilCounter();
      SimpleWeapon simpleWeapon0 = new SimpleWeapon(0, "l!{su/Osi&ObdnMyq1", 0, 0);
      boolean boolean0 = weaponModCounter_FettesOilCounter0.counts((Weapon) simpleWeapon0);
      assertEquals(false, boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      WeaponModCounter.SchmierOilCounter weaponModCounter_SchmierOilCounter0 = new WeaponModCounter.SchmierOilCounter();
      SimpleWeapon simpleWeapon0 = new SimpleWeapon(0, "xGU2esP?,;zm", 0, 0);
      boolean boolean0 = weaponModCounter_SchmierOilCounter0.counts((Weapon) simpleWeapon0);
      assertEquals(false, boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      WeaponModCounter.LoadingchamberOrEnhancedPatronsCounter weaponModCounter_LoadingchamberOrEnhancedPatronsCounter0 = new WeaponModCounter.LoadingchamberOrEnhancedPatronsCounter();
      SimpleWeapon simpleWeapon0 = new SimpleWeapon(479, "E9uByDr1", 479, 479);
      boolean boolean0 = weaponModCounter_LoadingchamberOrEnhancedPatronsCounter0.counts((Weapon) simpleWeapon0);
      assertEquals(false, boolean0);
  }

  @Test
  public void test3()  throws Throwable  {
      WeaponModCounter.BayonetCounter weaponModCounter_BayonetCounter0 = new WeaponModCounter.BayonetCounter();
      SimpleWeapon simpleWeapon0 = new SimpleWeapon(0, "", 0, 0);
      boolean boolean0 = weaponModCounter_BayonetCounter0.counts((Weapon) simpleWeapon0);
      assertEquals(false, boolean0);
  }

  @Test
  public void test4()  throws Throwable  {
      WeaponModCounter.ShinyOilCounter weaponModCounter_ShinyOilCounter0 = new WeaponModCounter.ShinyOilCounter();
      SimpleWeapon simpleWeapon0 = new SimpleWeapon(0, "", 0, 0);
      boolean boolean0 = weaponModCounter_ShinyOilCounter0.counts((Weapon) simpleWeapon0);
      assertEquals(false, boolean0);
  }

  @Test
  public void test5()  throws Throwable  {
      WeaponModCounter.HipFlaskCounter weaponModCounter_HipFlaskCounter0 = new WeaponModCounter.HipFlaskCounter();
      SimpleWeapon simpleWeapon0 = new SimpleWeapon(0, "vOt|K ??", 1753, 1753);
      boolean boolean0 = weaponModCounter_HipFlaskCounter0.counts((Weapon) simpleWeapon0);
      assertEquals(false, boolean0);
  }

  @Test
  public void test6()  throws Throwable  {
      WeaponModCounter.GraphitLubricantCounter weaponModCounter_GraphitLubricantCounter0 = new WeaponModCounter.GraphitLubricantCounter();
      // Undeclared exception!
      try {
        weaponModCounter_GraphitLubricantCounter0.counts((Weapon) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
