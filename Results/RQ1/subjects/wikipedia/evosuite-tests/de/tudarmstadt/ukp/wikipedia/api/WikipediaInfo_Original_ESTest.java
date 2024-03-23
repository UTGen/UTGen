/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Wed Mar 20 17:35:17 GMT 2024
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
public class WikipediaInfo_Original_ESTest extends WikipediaInfo_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetNumberOfCategorizedArticles() throws Throwable  {
      Stack<Page> arg0 = new Stack<Page>();
      WikipediaInfo wikipediaInfo = new WikipediaInfo(arg0);
      CategoryGraph arg1 = new CategoryGraph();
      wikipediaInfo.getNumberOfCategorizedArticles((Wikipedia) null, arg1);
      assertEquals(0, wikipediaInfo.getNumberOfPages());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetDistributionOfArticlesByCategory() throws Throwable  {
      Stack<Page> arg0 = new Stack<Page>();
      WikipediaInfo wikipediaInfo = new WikipediaInfo(arg0);
      CategoryGraph arg1 = new CategoryGraph();
      wikipediaInfo.getDistributionOfArticlesByCategory((Wikipedia) null, arg1);
      assertEquals(0, wikipediaInfo.getNumberOfPages());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAverageFanOutThrowsNullPointerException0() throws Throwable  {
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
      Stack<Page> arg0 = new Stack<Page>();
      WikipediaInfo wikipediaInfo = new WikipediaInfo(arg0);
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
  public void testFailsToCreateWikipediaInfoTakingIterableThrowsTooManyResourcesException() throws Throwable  {
      Stack<Page> arg0 = new Stack<Page>();
      arg0.add((Page) null);
      WikipediaInfo wikipediaInfo = new WikipediaInfo(arg0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesWikipediaInfoTakingIterable() throws Throwable  {
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
      Stack<Page> arg0 = new Stack<Page>();
      WikipediaInfo wikipediaInfo = new WikipediaInfo(arg0);
      int numberOfPages = wikipediaInfo.getNumberOfPages();
      assertEquals(0, numberOfPages);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFailsToCreateWikipediaInfoTakingWikipediaThrowsNullPointerException() throws Throwable  {
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