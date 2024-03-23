/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.io.archive;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.io.archive.Archive;
import com.lts.io.archive.ArchiveTreeNode;
import com.lts.io.archive.ZipArchive;
import com.lts.util.TreeNode;
import com.lts.util.deepcopy.DeepCopyException;
import java.io.File;
import java.util.Map;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ArchiveTreeNodeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      File file0 = new File("");
      ZipArchive zipArchive0 = new ZipArchive(file0);
      ArchiveTreeNode archiveTreeNode0 = new ArchiveTreeNode((Archive) zipArchive0, "");
      ZipArchive zipArchive1 = (ZipArchive)archiveTreeNode0.getArchive();
      assertNotNull(zipArchive1);
      assertEquals("", archiveTreeNode0.getAbsoluteEntry());
  }

  @Test
  public void test1()  throws Throwable  {
      ZipArchive zipArchive0 = new ZipArchive();
      ArchiveTreeNode archiveTreeNode0 = new ArchiveTreeNode((Archive) zipArchive0, "", (-13));
      String string0 = archiveTreeNode0.getAbsoluteEntry();
      assertEquals("", string0);
      assertNotNull(string0);
      assertEquals(-13, archiveTreeNode0.getNodeType());
  }

  @Test
  public void test2()  throws Throwable  {
      ZipArchive zipArchive0 = new ZipArchive();
      ArchiveTreeNode archiveTreeNode0 = new ArchiveTreeNode((Archive) zipArchive0, "d5ihGY.8)*=");
      // Undeclared exception!
      try {
        archiveTreeNode0.deepCopyData((Object) "d5ihGY.8)*=", (Map) null, false);
        fail("Expecting exception: ClassCastException");
      } catch(ClassCastException e) {
        /*
         * java.lang.String cannot be cast to com.lts.util.TreeNode
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      ZipArchive zipArchive0 = new ZipArchive();
      ArchiveTreeNode archiveTreeNode0 = new ArchiveTreeNode((Archive) zipArchive0, "d5ihGY.8)*=");
      int int0 = archiveTreeNode0.getNodeType();
      assertEquals("d5ihGY.8)*=", archiveTreeNode0.getAbsoluteEntry());
      assertEquals(0, int0);
  }

  @Test
  public void test4()  throws Throwable  {
      ZipArchive zipArchive0 = new ZipArchive();
      ArchiveTreeNode archiveTreeNode0 = new ArchiveTreeNode((Archive) zipArchive0, "", (-13));
      assertEquals("", archiveTreeNode0.getAbsoluteEntry());
      
      archiveTreeNode0.setParent((TreeNode) archiveTreeNode0);
      // Undeclared exception!
      try {
        archiveTreeNode0.getAbsoluteEntry();
        fail("Expecting exception: StackOverflowError");
      } catch(StackOverflowError e) {
      }
  }
}
