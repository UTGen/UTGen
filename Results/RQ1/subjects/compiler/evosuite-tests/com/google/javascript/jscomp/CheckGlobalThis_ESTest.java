/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Thu Mar 21 13:39:03 GMT 2024
 */

package com.google.javascript.jscomp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import com.google.javascript.jscomp.CheckGlobalThis;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CheckGlobalThis_ESTest extends CheckGlobalThis_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testShouldTraverseWithNodeWhereWasEmptyNodeIsFalse() throws Throwable  {
      // Given a Compiler instance and two Node instances representing a global this reference
      Compiler compiler = new Compiler();
      Node node1 = new Node(105, 105, 0);
      Node node2 = new Node(86, node1, node1);
      
      // When we pass the two nodes to the CheckGlobalThis class
      CheckGlobalThis checkGlobalThis = new CheckGlobalThis(compiler);
      boolean shouldTraverse = checkGlobalThis.shouldTraverse((NodeTraversal) null, node1, node2);
      
      // Then it should identify and report the global this reference
      assertTrue(shouldTraverse);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testShouldTraverseWithNull() throws Throwable  {
      // Arrange
      Compiler compiler = new Compiler();
      CheckGlobalThis checkGlobalThis = new CheckGlobalThis(compiler);
      Node node = new Node(87);
      
      // Act
      boolean shouldTraverse = checkGlobalThis.shouldTraverse((NodeTraversal) null, node, (Node) null);
      
      // Assert
      assertTrue(shouldTraverse);
  }
}
