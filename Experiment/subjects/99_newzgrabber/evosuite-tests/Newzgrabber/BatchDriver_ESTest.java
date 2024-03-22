/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Mon Mar 18 09:29:01 GMT 2024
 */

package Newzgrabber;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import Newzgrabber.BatchDriver;
import Newzgrabber.BatchJob;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class BatchDriver_ESTest extends BatchDriver_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetBatchJob() throws Throwable  {
      // Given a file path "|)Ni-"
      EvoSuiteFile arg0 = new EvoSuiteFile("|)Ni-");
      
      // And a byte array of length 1
      byte[] arg1 = new byte[1];
      
      // When the method appendDataToFile is called with these parameters
      FileSystemHandling.appendDataToFile(arg0, arg1);
      
      // Then the batch driver should be null
      BatchDriver batchDriver = new BatchDriver("|)Ni-", "|)Ni-");
      BatchJob batchJob = batchDriver.getBatchJob("|)Ni-");
      assertNull(batchJob);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetGroups() throws Throwable  {
      // Given: A file object and a string to be appended to it
      EvoSuiteFile file = new EvoSuiteFile("|)Ni-");
      String stringToAppend = "|)Ni-";
      
      // When: The string is appended to the file using the appendStringToFile method
      FileSystemHandling.appendStringToFile(file, stringToAppend);
      
      // Then: The length of the groups array should be 0
      BatchDriver batchDriver = new BatchDriver("|)Ni-", "|)Ni-");
      String[] groups = batchDriver.getGroups();
      assertEquals(0, groups.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetSubjectLines() throws Throwable  {
      // Given
      EvoSuiteFile evoSuiteFile = new EvoSuiteFile("|)Ni-");
      FileSystemHandling fileSystemHandling = new FileSystemHandling();
      
      // When
      fileSystemHandling.appendStringToFile(evoSuiteFile, "|)Ni-");
      
      // Then
      BatchDriver batchDriver = new BatchDriver("|)Ni-", "|)Ni-");
      String[] subjectLines = batchDriver.getSubjectLines();
      assertNull(subjectLines);
  }
}
