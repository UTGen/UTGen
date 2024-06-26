/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Mon Mar 18 08:35:18 GMT 2024
 */

package jigl.image.ops;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import jigl.image.ops.ConnectedComponents;
import jigl.image.types.BinaryImage;
import jigl.image.types.GrayImage;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ConnectedComponents_Original_ESTest extends ConnectedComponents_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testApplyReturningGrayImageWhereXIsZeroAndGrayImageWhereYIsZero() throws Throwable  {
      ConnectedComponents connectedComponents = new ConnectedComponents(0, 0);
      BinaryImage arg0 = new BinaryImage();
      GrayImage apply = connectedComponents.apply(arg0);
      assertEquals(0L, apply.sqrSum());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testApply0() throws Throwable  {
      BinaryImage arg0 = new BinaryImage(1, 1306);
      ConnectedComponents connectedComponents = new ConnectedComponents(1, 1);
      GrayImage apply = connectedComponents.apply(arg0);
      assertEquals(1306, apply.absSum());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testApplyThrowsNullPointerException() throws Throwable  {
      ConnectedComponents connectedComponents = new ConnectedComponents(1, 1);
      BinaryImage arg0 = new BinaryImage(999, 67);
      // Undeclared exception!
      try { 
        connectedComponents.apply(arg0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.ops.ConnectedComponents", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testApply1() throws Throwable  {
      BinaryImage arg0 = new BinaryImage(3, 1);
      ConnectedComponents connectedComponents = new ConnectedComponents(0, 1);
      GrayImage apply = connectedComponents.apply(arg0);
      assertEquals(3L, apply.sqrSum());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testApply2() throws Throwable  {
      BinaryImage arg0 = new BinaryImage(1, 1306);
      ConnectedComponents connectedComponents = new ConnectedComponents(0, 1);
      GrayImage apply = connectedComponents.apply(arg0);
      assertEquals(1306L, apply.sqrSum());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testApplyReturningGrayImageWhereSqrSumIsZero() throws Throwable  {
      ConnectedComponents connectedComponents = new ConnectedComponents(0, 0);
      BinaryImage arg0 = new BinaryImage(1, 1306);
      GrayImage apply = connectedComponents.apply(arg0);
      assertEquals(0, apply.absSum());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFailsToCreateConnectedComponentsThrowsException0() throws Throwable  {
      ConnectedComponents connectedComponents = null;
      try {
        connectedComponents = new ConnectedComponents(2879, 968);
        fail("Expecting exception: Exception");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.ops.ConnectedComponents", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFailsToCreateConnectedComponentsThrowsException1() throws Throwable  {
      ConnectedComponents connectedComponents = null;
      try {
        connectedComponents = new ConnectedComponents(1, 255);
        fail("Expecting exception: Exception");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.ops.ConnectedComponents", e);
      }
  }
}
