/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Mon Mar 18 05:10:25 GMT 2024
 */

package client.network;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import client.BomberClient;
import client.ClientGameRound;
import client.network.ForwardingObserver;
import java.awt.GridBagLayout;
import java.awt.Point;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ForwardingObserver_Original_ESTest extends ForwardingObserver_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesForwardingObserverAndCallsUpdate() throws Throwable  {
      BomberClient arg0 = BomberClient.getInstance();
      GridBagLayout gridBagLayout = new GridBagLayout();
      Point arg1 = gridBagLayout.getLayoutOrigin();
      ForwardingObserver forwardingObserver = new ForwardingObserver(arg0, (ClientGameRound) null);
      forwardingObserver.update(arg0, arg1);
      assertFalse(arg0.hasChanged());
  }
}
