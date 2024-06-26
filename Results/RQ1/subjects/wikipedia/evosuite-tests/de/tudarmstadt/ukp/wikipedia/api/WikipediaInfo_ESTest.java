/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Wed Mar 20 17:35:16 GMT 2024
 */

package de.tudarmstadt.ukp.wikipedia.api;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import de.tudarmstadt.ukp.wikipedia.api.CategoryGraph;
import de.tudarmstadt.ukp.wikipedia.api.Page;
import de.tudarmstadt.ukp.wikipedia.api.Wikipedia;
import de.tudarmstadt.ukp.wikipedia.api.WikipediaInfo;
import java.util.LinkedHashSet;
import java.util.Stack;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class WikipediaInfo_ESTest extends WikipediaInfo_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetNumberOfCategorizedArticles() throws Throwable  {
      // Set up the stack of pages for the WikipediaInfo instance
      Stack<Page> arg0 = new Stack<>();
      
      // Create a new WikipediaInfo instance with the stack of pages
      WikipediaInfo wikipediaInfo = new WikipediaInfo(arg0);
      
      // Create a new CategoryGraph instance
      CategoryGraph arg1 = new CategoryGraph();
      
      // Invoke the getNumberOfCategorizedArticles() method on the WikipediaInfo instance with null as the first argument and the CategoryGraph instance as the second argument
      wikipediaInfo.getNumberOfCategorizedArticles((Wikipedia) null, arg1);
      
      // Assert that the number of pages returned by the getNumberOfPages() method is equal to 0
      assertEquals(0, wikipediaInfo.getNumberOfPages());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetDistributionOfArticlesByCategory() throws Throwable  {
      // Set up the test data
      Stack<Page> arg0 = new Stack<Page>();
      WikipediaInfo wikipediaInfo = new WikipediaInfo(arg0);
      CategoryGraph arg1 = new CategoryGraph();
      
      // Call the method under test
      wikipediaInfo.getDistributionOfArticlesByCategory((Wikipedia) null, arg1);
      
      // Assert that the expected result is returned
      assertEquals(0, wikipediaInfo.getNumberOfPages());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAverageFanOutThrowsNullPointerException0() throws Throwable  {
      // No Comments were added
      LinkedHashSet<Page> arg0 = new LinkedHashSet<Page>();
      WikipediaInfo wikipediaInfo = new WikipediaInfo(arg0);
      arg0.add((Page) null);
      // Undeclared exception!
      try { 
        wikipediaInfo.getAverageFanOut();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.tudarmstadt.ukp.wikipedia.api.WikipediaInfo", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAverageFanOutThrowsNullPointerException1() throws Throwable  {
      // Test that getAverageFanOut() throws a NullPointerException when called on a null stack
      Stack<Page> arg0 = new Stack<Page>(); // Create an empty stack
      WikipediaInfo wikipediaInfo = new WikipediaInfo(arg0); // Create a new instance of the WikipediaInfo class using the empty stack
      try {
      wikipediaInfo.getAverageFanOut(); // Call getAverageFanOut() on the WikipediaInfo object, which should throw a NullPointerException
      fail("Expecting exception: NullPointerException"); // Fail if no exception is thrown or if the wrong exception is thrown
      } catch(NullPointerException e) {
      // Verify that the correct exception is thrown and that it has no message (getMessage() returned null)
      verifyException("de.tudarmstadt.ukp.wikipedia.api.WikipediaInfo", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFailsToCreateWikipediaInfoTakingIterableThrowsTooManyResourcesException() throws Throwable  {
      // Given: A Stack of Pages with a null element
      Stack<Page> pageStack = new Stack<Page>();
      pageStack.add(null);
      
      // When: Creating a WikipediaInfo object with the stack as argument
      WikipediaInfo wikipediaInfo = new WikipediaInfo(pageStack);
      
      // Then: The WikipediaInfo object should not be null
      assertNotNull(wikipediaInfo);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesWikipediaInfoTakingIterable() throws Throwable  {
      // No Comments were added
      WikipediaInfo wikipediaInfo = null;
      try {
        wikipediaInfo = new WikipediaInfo((Iterable<Page>) null);
        fail("Expecting exception: Exception");
      
      } catch(Throwable e) {
         //
         // The page set has to be initialized.
         //
         verifyException("de.tudarmstadt.ukp.wikipedia.api.WikipediaInfo", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAveragePathLengthFromRootThrowsNullPointerException() throws Throwable  {
      // No Comments were added
      Stack<Page> arg0 = new Stack<Page>();
      WikipediaInfo wikipediaInfo = new WikipediaInfo(arg0);
      CategoryGraph arg1 = new CategoryGraph();
      // Undeclared exception!
      try { 
        wikipediaInfo.getAveragePathLengthFromRoot((Wikipedia) null, arg1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.tudarmstadt.ukp.wikipedia.api.WikipediaInfo", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetCategorizedArticlesThrowsNullPointerException() throws Throwable  {
      // No Comments were added
      Stack<Page> arg0 = new Stack<Page>();
      WikipediaInfo wikipediaInfo = new WikipediaInfo(arg0);
      CategoryGraph arg1 = new CategoryGraph();
      // Undeclared exception!
      try { 
        wikipediaInfo.getCategorizedArticles((Wikipedia) null, arg1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.tudarmstadt.ukp.wikipedia.api.WikipediaInfo", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetNumberOfPages() throws Throwable  {
      // Given: The system has a WikipediaInfo object with an empty stack of pages
      Stack<Page> emptyStack = new Stack<Page>();
      WikipediaInfo wikipediaInfo = new WikipediaInfo(emptyStack);
      
      // When: We call the getNumberOfPages() method on the WikipediaInfo object
      int numberOfPages = wikipediaInfo.getNumberOfPages();
      
      // Then: The returned value should be 0, as there are no pages in the stack
      assertEquals(0, numberOfPages);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFailsToCreateWikipediaInfoTakingWikipediaThrowsNullPointerException() throws Throwable  {
      // No Comments were added
      WikipediaInfo wikipediaInfo = null;
      try {
        wikipediaInfo = new WikipediaInfo((Wikipedia) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.tudarmstadt.ukp.wikipedia.api.WikipediaInfo", e);
      }
  }
}
