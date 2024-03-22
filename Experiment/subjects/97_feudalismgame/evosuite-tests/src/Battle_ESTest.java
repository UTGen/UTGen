/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Thu Mar 21 11:41:17 GMT 2024
 */

package src;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import src.Battle;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Battle_ESTest extends Battle_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRollDice() throws Throwable  {
      // Create a new instance of the Battle class
      Battle battle = new Battle();
      
      // Roll 5 dice and store the results in an array
      int[] rollDice = battle.rollDice(5);
      
      // Assert that the rolled dice are equal to [5, 0, 0, 0, 0, 0]
      assertArrayEquals(new int[] {5, 0, 0, 0, 0, 0}, rollDice);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testPerform() throws Throwable  {
      // Given: A new battle is created with an empty list of objects as the argument
      Battle battle = new Battle();
      LinkedList<Object> arg0 = new LinkedList<Object>();
      
      // When: The battle performs a certain action on the list of objects
      battle.perform(arg0);
      
      // Then: The list of objects is empty after the action
      assertEquals(0, arg0.size());
  }
}
