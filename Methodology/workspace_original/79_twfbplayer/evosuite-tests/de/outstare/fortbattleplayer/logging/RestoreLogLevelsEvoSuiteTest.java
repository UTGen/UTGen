/*
 * This file was automatically generated by EvoSuite
 */

package de.outstare.fortbattleplayer.logging;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import de.outstare.fortbattleplayer.logging.RestoreLogLevels;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class RestoreLogLevelsEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      HashMap<String, Level> hashMap0 = new HashMap<String, Level>();
      RestoreLogLevels restoreLogLevels0 = new RestoreLogLevels((Map<String, Level>) hashMap0);
      ConsoleHandler consoleHandler0 = new ConsoleHandler();
      Level level0 = consoleHandler0.getLevel();
      hashMap0.put("", level0);
      restoreLogLevels0.applyToAll();
  }
}
