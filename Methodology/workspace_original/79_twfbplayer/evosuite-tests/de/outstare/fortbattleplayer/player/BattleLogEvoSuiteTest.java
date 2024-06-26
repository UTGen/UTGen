/*
 * This file was automatically generated by EvoSuite
 */

package de.outstare.fortbattleplayer.player;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import de.outstare.fortbattleplayer.model.Combatant;
import de.outstare.fortbattleplayer.player.BattleLog;
import de.outstare.fortbattleplayer.player.Battleplayer;
import de.outstare.fortbattleplayer.player.CombatantEventDispatcher;
import java.io.PrintStream;
import java.util.Collection;
import java.util.LinkedHashSet;
import javax.swing.DebugGraphics;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class BattleLogEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      LinkedHashSet<Combatant> linkedHashSet0 = new LinkedHashSet<Combatant>();
      CombatantEventDispatcher combatantEventDispatcher0 = new CombatantEventDispatcher((Collection<Combatant>) linkedHashSet0);
      BattleLog battleLog0 = null;
      try {
        battleLog0 = new BattleLog((PrintStream) null, (Battleplayer) null, combatantEventDispatcher0);
        fail("Expecting exception: AssertionError");
      } catch(AssertionError e) {
        /*
         * output may not be null!
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      PrintStream printStream0 = DebugGraphics.logStream();
      BattleLog battleLog0 = null;
      try {
        battleLog0 = new BattleLog(printStream0, (Battleplayer) null, (CombatantEventDispatcher) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
