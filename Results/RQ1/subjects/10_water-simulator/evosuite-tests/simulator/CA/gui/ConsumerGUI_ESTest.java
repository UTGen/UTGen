/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Wed Mar 20 19:47:56 GMT 2024
 */

package simulator.CA.gui;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import simulator.CA.ConsumerAgent;
import simulator.util.ConsumerAttributes;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ConsumerGUI_ESTest extends ConsumerGUI_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesConsumerGUI() throws Throwable  {
      // rollbacked to evosuite
      ConsumerAgent consumerAgent = new ConsumerAgent();
      Vector<Object> vector = new Vector<Object>();
      ConsumerAttributes[] consumerAttributesArray = new ConsumerAttributes[2];
  }
}
