/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Wed Mar 20 19:52:56 GMT 2024
 */

package simulator.CA;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import jade.content.OntoACLMessage;
import jade.core.Agent;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import simulator.CA.ConsumerAgent;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ConsumerAgent_Original_ESTest extends ConsumerAgent_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetupThrowsNullPointerException() throws Throwable  {
      ConsumerAgent consumerAgent = new ConsumerAgent();
      // Undeclared exception!
      try { 
        consumerAgent.setup();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("simulator.CA.ConsumerAgent", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreateQueryMsgForNeighbourhoodThrowsNullPointerException() throws Throwable  {
      ConsumerAgent consumerAgent = new ConsumerAgent();
      // Undeclared exception!
      try { 
        consumerAgent.createQueryMsgForNeighbourhood();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("simulator.CA.ConsumerAgent", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testConsumeWaterThrowsNullPointerException() throws Throwable  {
      ConsumerAgent consumerAgent = new ConsumerAgent();
      // Undeclared exception!
      try { 
        consumerAgent.consumeWater();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jade.content.ContentManager", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testOnFailure() throws Throwable  {
      ConsumerAgent consumerAgent = new ConsumerAgent();
      OntoACLMessage arg0 = new OntoACLMessage();
      consumerAgent.onFailure(arg0);
      assertEquals(5, Agent.AP_WAITING);
  }
}