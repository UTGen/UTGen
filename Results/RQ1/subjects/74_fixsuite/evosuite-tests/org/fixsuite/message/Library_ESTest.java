/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Thu Mar 21 06:26:39 GMT 2024
 */

package org.fixsuite.message;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.fixsuite.message.Library;
import org.fixsuite.message.info.DictionaryInfo;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Library_ESTest extends Library_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLoadFromDirectoryWithEmptyString() throws Throwable  {
      // Given: A Library instance is created
      Library library = new Library();
      
      // When: loadFromDirectory method is called with an empty string
      boolean loadFromDirectory = library.loadFromDirectory("");
      
      // Then: The method should return false
      assertFalse(loadFromDirectory);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLoadFromDirectoryWithNonEmptyString() throws Throwable  {
      // Given a Library instance and a directory path as a string,
      Library library = new Library();
      String directoryPath = "C:/Users/User/Documents";
      
      // When the loadFromDirectory method is called with the directory path,
      boolean loadFromDirectory = library.loadFromDirectory(directoryPath);
      
      // Then the method should return false, indicating that the library was not loaded from the directory successfully.
      assertFalse(loadFromDirectory);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetDictionary() throws Throwable  {
      // Setup
      Library library = new Library();
      
      // Action
      DictionaryInfo dictionary = library.getDictionary("books");
      
      // Assertion
      assertNull(dictionary);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetDictionaries() throws Throwable  {
      // Given: A Library object with no dictionaries
      Library library = new Library();
      
      // When: The getDictionaries method is called on the Library object
      List<DictionaryInfo> dictionaries = library.getDictionaries();
      
      // Then: An empty list of DictionaryInfo objects should be returned
      assertEquals(0, dictionaries.size());
  }
}
