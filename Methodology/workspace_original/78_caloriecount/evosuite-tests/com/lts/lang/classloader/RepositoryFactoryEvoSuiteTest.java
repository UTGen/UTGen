/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.lang.classloader;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.LTSException;
import com.lts.lang.classloader.DirectoryClassRepository;
import com.lts.lang.classloader.RepositoryFactory;
import java.io.File;
import java.util.LinkedList;
import java.util.List;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class RepositoryFactoryEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      RepositoryFactory repositoryFactory0 = new RepositoryFactory();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add(".zip");
      repositoryFactory0.fileNamesToRepositories((List) linkedList0);
      assertEquals("[.zip]", linkedList0.toString());
      assertEquals(1, linkedList0.size());
  }

  @Test
  public void test1()  throws Throwable  {
      File file0 = new File(".class");
      boolean boolean0 = RepositoryFactory.isArchiveFile(file0);
      assertEquals(false, boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      RepositoryFactory repositoryFactory0 = new RepositoryFactory();
      File file0 = new File("", "");
      DirectoryClassRepository directoryClassRepository0 = (DirectoryClassRepository)repositoryFactory0.createRepository(file0);
      assertEquals("/", directoryClassRepository0.toString());
  }

  @Test
  public void test3()  throws Throwable  {
      RepositoryFactory repositoryFactory0 = new RepositoryFactory();
      File file0 = new File("}&r4S~d}a");
      try {
        repositoryFactory0.createRepository(file0);
        fail("Expecting exception: LTSException");
      } catch(LTSException e) {
        /*
         * Unrecognized repository type, }&r4S~d}a
         */
      }
  }
}