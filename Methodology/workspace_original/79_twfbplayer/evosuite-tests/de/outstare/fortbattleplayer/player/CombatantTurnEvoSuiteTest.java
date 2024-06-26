/*
 * This file was automatically generated by EvoSuite
 */

package de.outstare.fortbattleplayer.player;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import de.outstare.fortbattleplayer.player.Action;
import de.outstare.fortbattleplayer.player.CombatantTurn;
import de.outstare.fortbattleplayer.player.PlayerConfiguration;
import java.util.LinkedList;
import java.util.List;

@RunWith(EvoSuiteRunner.class)
public class CombatantTurnEvoSuiteTest {


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 de.outstare.fortbattleplayer.player.CombatantTurn.execute(Lde/outstare/fortbattleplayer/player/PlayerConfiguration;)V: I9 Branch 1 IFEQ L51 - true
   * 2 de.outstare.fortbattleplayer.player.CombatantTurn.<init>(Ljava/util/List;)V: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      LinkedList<Action> linkedList0 = new LinkedList<Action>();
      CombatantTurn combatantTurn0 = new CombatantTurn((List<Action>) linkedList0);
      combatantTurn0.execute((PlayerConfiguration) null);
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 de.outstare.fortbattleplayer.player.CombatantTurn.execute(Lde/outstare/fortbattleplayer/player/PlayerConfiguration;)V: I9 Branch 1 IFEQ L51 - false
   * 2 de.outstare.fortbattleplayer.player.CombatantTurn.<init>(Ljava/util/List;)V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      LinkedList<Action> linkedList0 = new LinkedList<Action>();
      CombatantTurn combatantTurn0 = new CombatantTurn((List<Action>) linkedList0);
      linkedList0.offer((Action) null);
      PlayerConfiguration playerConfiguration0 = new PlayerConfiguration();
      // Undeclared exception!
      try {
        combatantTurn0.execute(playerConfiguration0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
