/*
 * This file was automatically generated by EvoSuite
 */

package de.outstare.fortbattleplayer.player.actions;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import de.outstare.fortbattleplayer.model.Combatant;
import de.outstare.fortbattleplayer.player.actions.OnlineAction;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class OnlineActionEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      OnlineAction onlineAction0 = new OnlineAction((Combatant) null, true);
      // Undeclared exception!
      try {
        onlineAction0.execute();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      OnlineAction onlineAction0 = new OnlineAction((Combatant) null, false);
      String string0 = onlineAction0.toString();
      assertNotNull(string0);
      assertEquals("null is offline", string0);
  }

  @Test
  public void test2()  throws Throwable  {
      OnlineAction onlineAction0 = new OnlineAction((Combatant) null, true);
      String string0 = onlineAction0.toString();
      assertNotNull(string0);
      assertEquals("null is online", string0);
  }
}
