/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Tue Mar 19 18:22:13 GMT 2024
 */

package org.jdom2.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Iterator;
import java.util.function.Consumer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jdom2.Attribute;
import org.jdom2.Element;
import org.jdom2.Namespace;
import org.jdom2.util.NamespaceStack;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class NamespaceStack_Original_ESTest extends NamespaceStack_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetScopeReturningEmptyArray() throws Throwable  {
      Namespace[] arg0 = new Namespace[0];
      NamespaceStack namespaceStack = new NamespaceStack(arg0);
      Namespace[] scope = namespaceStack.getScope();
      assertNotSame(arg0, scope);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesNamespaceStackTakingNoArgumentsAndCallsIsInScope0() throws Throwable  {
      NamespaceStack namespaceStack = new NamespaceStack();
      Namespace arg0 = Namespace.XML_NAMESPACE;
      boolean inScope = namespaceStack.isInScope(arg0);
      assertTrue(inScope);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesNamespaceStackTakingNamespaceArrayAndCallsAddedReverse() throws Throwable  {
      Namespace[] arg0 = new Namespace[0];
      NamespaceStack namespaceStack = new NamespaceStack(arg0);
      Iterable<Namespace> addedReverse = namespaceStack.addedReverse();
      assertNotNull(addedReverse);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesNamespaceStackTakingNoArgumentsAndCallsAddedReverse() throws Throwable  {
      NamespaceStack namespaceStack = new NamespaceStack();
      Iterable<Namespace> addedReverse = namespaceStack.addedReverse();
      assertNotNull(addedReverse);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesNamespaceStackTakingNamespaceArrayAndCallsAddedForward() throws Throwable  {
      Namespace[] arg0 = new Namespace[0];
      NamespaceStack namespaceStack = new NamespaceStack(arg0);
      Iterable<Namespace> addedForward = namespaceStack.addedForward();
      assertNotNull(addedForward);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testPopThrowsIllegalStateException() throws Throwable  {
      NamespaceStack namespaceStack = new NamespaceStack();
      // Undeclared exception!
      try { 
        namespaceStack.pop();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Cannot over-pop the stack.
         //
         verifyException("org.jdom2.util.NamespaceStack", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testPushTakingElementWithElementWhereHasAttributesIsFalse() throws Throwable  {
      NamespaceStack namespaceStack = new NamespaceStack();
      Element arg0 = new Element("xml");
      namespaceStack.push(arg0);
      namespaceStack.push(arg0);
      namespaceStack.push(arg0);
      namespaceStack.push(arg0);
      namespaceStack.push(arg0);
      namespaceStack.push(arg0);
      namespaceStack.push(arg0);
      namespaceStack.push(arg0);
      namespaceStack.push(arg0);
      namespaceStack.push(arg0);
      assertFalse(arg0.isRootElement());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesNamespaceStackTakingNoArgumentsAndCallsPushTakingElement0() throws Throwable  {
      NamespaceStack namespaceStack = new NamespaceStack();
      Element arg0 = new Element("xml");
      Namespace arg2 = Namespace.XML_NAMESPACE;
      arg0.setNamespace(arg2);
      arg0.setAttribute("xml", "xml", arg2);
      namespaceStack.push(arg0);
      assertFalse(arg0.isRootElement());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesNamespaceStackTakingNoArgumentsAndCallsPushTakingElement1() throws Throwable  {
      NamespaceStack namespaceStack = new NamespaceStack();
      Element arg0 = new Element("xml");
      arg0.setAttribute("xml", "xml");
      namespaceStack.push(arg0);
      assertFalse(arg0.isRootElement());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesNamespaceStackTakingNoArgumentsAndCallsPushTakingElement2() throws Throwable  {
      NamespaceStack namespaceStack = new NamespaceStack();
      Element arg0 = new Element("xml");
      Namespace arg2 = Namespace.XML_NAMESPACE;
      arg0.setAttribute("xml", "xml", arg2);
      namespaceStack.push(arg0);
      namespaceStack.push(arg0);
      assertEquals("", arg0.getNamespaceURI());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesNamespaceStackTakingNoArguments() throws Throwable  {
      NamespaceStack namespaceStack = new NamespaceStack();
      Consumer<Object> arg0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      namespaceStack.forEach(arg0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesNamespaceStackTakingNoArgumentsAndCallsIsInScope1() throws Throwable  {
      NamespaceStack namespaceStack = new NamespaceStack();
      Namespace arg0 = Namespace.NO_NAMESPACE;
      boolean inScope = namespaceStack.isInScope(arg0);
      assertTrue(inScope);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetScopeReturningNonEmptyArray() throws Throwable  {
      NamespaceStack namespaceStack = new NamespaceStack();
      Namespace[] scope = namespaceStack.getScope();
      assertEquals(2, scope.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIterator() throws Throwable  {
      NamespaceStack namespaceStack = new NamespaceStack();
      Iterator<Namespace> iterator = namespaceStack.iterator();
      assertNotNull(iterator);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testPushTakingAttribute() throws Throwable  {
      NamespaceStack namespaceStack = new NamespaceStack();
      Attribute arg0 = new Attribute("xmmq", "xmmq");
      namespaceStack.push(arg0);
      namespaceStack.pop();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesNamespaceStackTakingNoArgumentsAndCallsAddedForward() throws Throwable  {
      NamespaceStack namespaceStack = new NamespaceStack();
      Iterable<Namespace> addedForward = namespaceStack.addedForward();
      assertNotNull(addedForward);
  }
}
