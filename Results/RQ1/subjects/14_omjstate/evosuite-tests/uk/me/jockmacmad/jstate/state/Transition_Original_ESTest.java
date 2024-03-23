/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Wed Mar 20 20:43:32 GMT 2024
 */

package uk.me.jockmacmad.jstate.state;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.me.jockmacmad.jstate.state.EndState;
import uk.me.jockmacmad.jstate.state.Event;
import uk.me.jockmacmad.jstate.state.IGuardCondition;
import uk.me.jockmacmad.jstate.state.IState;
import uk.me.jockmacmad.jstate.state.StartState;
import uk.me.jockmacmad.jstate.state.Transition;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Transition_Original_ESTest extends Transition_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetTriggerEventReturningNonNull() throws Throwable  {
      Vector<Object> arg2 = new Vector<Object>();
      Event arg1 = new Event(">", arg2, arg2);
      EndState arg3 = new EndState();
      Transition transition = new Transition(">", arg1, arg3, arg3);
      Event triggerEvent = transition.getTriggerEvent();
      assertSame(triggerEvent, arg1);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsReturningTrue() throws Throwable  {
      Vector<Object> arg2 = new Vector<Object>();
      Event arg1 = new Event(">", arg2, arg2);
      EndState arg3 = new EndState();
      Transition arg0 = new Transition(">", arg1, arg3, arg3);
      boolean equals = arg0.equals(arg0);
      assertTrue(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHashCode() throws Throwable  {
      Vector<Object> arg2 = new Vector<Object>();
      Event arg1 = new Event(">", arg2, arg2);
      EndState arg3 = new EndState();
      Transition transition = new Transition(">", arg1, arg3, arg3);
      transition.hashCode();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testWillTrigger() throws Throwable  {
      Vector<Object> arg2 = new Vector<Object>();
      Event arg1 = new Event(">", arg2, arg2);
      EndState arg0 = new EndState();
      Transition transition = new Transition(">", arg1, arg0, arg0);
      boolean willTrigger = transition.willTrigger(arg0, arg1);
      assertFalse(willTrigger);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testTrigger() throws Throwable  {
      Vector<Object> arg2 = new Vector<Object>();
      Event arg1 = new Event(">", arg2, arg2);
      EndState arg0 = new EndState();
      Transition transition = new Transition(">", arg1, arg0, arg0);
      IState trigger = transition.trigger(arg0, arg1);
      assertSame(trigger, arg0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsReturningFalse() throws Throwable  {
      StartState arg0 = StartState.getSingleton();
      Transition transition = new Transition("com.objectmentors.state.StartState", (Event) null, arg0, arg0);
      boolean equals = transition.equals(arg0);
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetTriggerEventReturningNull() throws Throwable  {
      EndState arg3 = new EndState();
      Transition transition = new Transition("", (Event) null, arg3, arg3);
      Event triggerEvent = transition.getTriggerEvent();
      assertNull(triggerEvent);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAddGuardCondition() throws Throwable  {
      StartState arg3 = StartState.getSingleton();
      Transition transition = new Transition("com.objectmentors.state.StartState", (Event) null, arg3, arg3);
      transition.addGuardCondition((IGuardCondition) null);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testToString() throws Throwable  {
      StartState arg3 = StartState.getSingleton();
      Transition transition = new Transition("com.objectmentors.state.StartState", (Event) null, arg3, arg3);
      String string = transition.toString();
      assertNotNull(string);
  }
}