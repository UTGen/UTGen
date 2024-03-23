/*
 * This file was automatically generated by EvoSuite
 */

package de.outstare.fortbattleplayer.gui.battlefield;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import de.outstare.fortbattleplayer.gui.battlefield.BattlefieldDrawing;
import de.outstare.fortbattleplayer.model.Area;
import de.outstare.fortbattleplayer.model.Battlefield;
import de.outstare.fortbattleplayer.model.impl.SimpleBattleField;
import de.outstare.fortbattleplayer.player.PlayerConfiguration;
import de.outstare.fortbattleplayer.statistics.AreaStatistic;
import de.outstare.fortbattleplayer.statistics.BattleStatistics;
import java.awt.Image;
import java.util.Map;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class BattlefieldDrawingEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      SimpleBattleField simpleBattleField0 = new SimpleBattleField((-820), (-685));
      PlayerConfiguration playerConfiguration0 = new PlayerConfiguration();
      BattleStatistics battleStatistics0 = new BattleStatistics(3000, 0);
      Map<Area, AreaStatistic> map0 = battleStatistics0.getFieldStatistics();
      BattlefieldDrawing battlefieldDrawing0 = new BattlefieldDrawing((Battlefield) simpleBattleField0, (Image) null, playerConfiguration0, map0);
      assertNotNull(battlefieldDrawing0);
      
      battlefieldDrawing0.changedShowShootingLine(false);
      assertEquals(true, battlefieldDrawing0.isBackgroundSet());
      assertEquals("de.outstare.fortbattleplayer.gui.battlefield.BattlefieldDrawing[,0,0,0x0,invalid,layout=de.outstare.fortbattleplayer.gui.battlefield.BattleFieldLayoutManager,alignmentX=0.0,alignmentY=0.0,border=,flags=0,maximumSize=,minimumSize=,preferredSize=]", battlefieldDrawing0.toString());
  }
}