/*
 * This file was automatically generated by EvoSuite
 */

package de.outstare.fortbattleplayer.logging;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import de.outstare.fortbattleplayer.logging.BackupLogLevels;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class BackupLogLevelsEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      HashMap<String, Level> hashMap0 = new HashMap<String, Level>();
      BackupLogLevels backupLogLevels0 = new BackupLogLevels((Map<String, Level>) hashMap0);
      backupLogLevels0.applyToAll();
      assertEquals(false, hashMap0.isEmpty());
      assertEquals("{=INFO, sun.rmi.transport.tcp=null, yiLJHGgrR>=null, sun.rmi.client.ref=null, global=null, sun.rmi.dgc=null, sun.rmi.loader=null, sun.rmi.transport.misc=null, sun.rmi.server.call=null, sun.awt.AppContext=null, sun.rmi.client.call=null, sun.rmi.transport.tcp.proxy=null, V_tAV2qlhT,M<q+H%kz=null, sun.rmi.server.ref=null, sun.rmi.runtime=null, H,=null, HM{A]+Bu.EyYmkcNdf=null}", hashMap0.toString());
  }
}
