/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Thu Mar 21 01:19:59 GMT 2024
 */

package ghm.follow.gui;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import ghm.follow.config.FollowAppAttributes;
import ghm.follow.gui.FileFollowingPane;
import ghm.follow.gui.TabbedPane;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TabbedPane_Original_ESTest extends TabbedPane_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetSelectedComponent() throws Throwable  {
      FollowAppAttributes arg0 = new FollowAppAttributes();
      TabbedPane tabbedPane = new TabbedPane(arg0);
      tabbedPane.add("confirmDelete", (Component) null);
      tabbedPane.setSelectedComponent((FileFollowingPane) null);
      assertFalse(tabbedPane.isFocusCycleRoot());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFindComponentAtReturningComponentWhereGetFocusTraversalKeysEnabledIsTrue() throws Throwable  {
      FollowAppAttributes arg0 = new FollowAppAttributes();
      TabbedPane tabbedPane = new TabbedPane(arg0);
      tabbedPane.setIgnoreRepaint(true);
      tabbedPane.setBounds(7, 0, 5, 7);
      Component findComponentAt = tabbedPane.findComponentAt(0, 0);
      assertSame(findComponentAt, tabbedPane);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFindComponentAtReturningComponentWhereGetFocusTraversalKeysEnabledIsFalse() throws Throwable  {
      FollowAppAttributes arg0 = new FollowAppAttributes();
      TabbedPane tabbedPane = new TabbedPane(arg0);
      tabbedPane.setFocusTraversalKeysEnabled(false);
      tabbedPane.setBounds(7, 0, 5, 7);
      Component findComponentAt = tabbedPane.findComponentAt(0, 0);
      assertSame(findComponentAt, tabbedPane);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRemoveTabAt() throws Throwable  {
      FollowAppAttributes arg0 = new FollowAppAttributes();
      TabbedPane tabbedPane = new TabbedPane(arg0);
      tabbedPane.add("bufferSize", (Component) null);
      tabbedPane.removeTabAt(0);
      assertTrue(tabbedPane.getFocusTraversalKeysEnabled());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFindComponentAtThrowsIndexOutOfBoundsException() throws Throwable  {
      FollowAppAttributes arg0 = new FollowAppAttributes();
      TabbedPane tabbedPane = new TabbedPane(arg0);
      DefaultListCellRenderer.UIResource arg1 = new DefaultListCellRenderer.UIResource();
      tabbedPane.add("followedFiles", (Component) arg1);
      tabbedPane.setBounds(6, 0, 5, 7);
      // Undeclared exception!
      try { 
        tabbedPane.findComponentAt(1, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFindComponentAtReturningNull() throws Throwable  {
      FollowAppAttributes arg0 = new FollowAppAttributes();
      TabbedPane tabbedPane = new TabbedPane(arg0);
      Component findComponentAt = tabbedPane.findComponentAt((-839), 2);
      assertNull(findComponentAt);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetSelectedIndexThrowsIndexOutOfBoundsException() throws Throwable  {
      FollowAppAttributes arg0 = new FollowAppAttributes();
      TabbedPane tabbedPane = new TabbedPane(arg0);
      // Undeclared exception!
      try { 
        tabbedPane.setSelectedIndex(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Tab count: 0
         //
         verifyException("javax.swing.JTabbedPane", e);
      }
  }
}