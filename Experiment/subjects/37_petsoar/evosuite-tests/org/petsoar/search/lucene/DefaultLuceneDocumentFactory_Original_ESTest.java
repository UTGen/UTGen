/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Thu Mar 21 00:42:27 GMT 2024
 */

package org.petsoar.search.lucene;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.Reader;
import java.io.StringReader;
import java.util.List;
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.TokenStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.petsoar.search.lucene.DefaultLuceneDocumentFactory;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DefaultLuceneDocumentFactory_Original_ESTest extends DefaultLuceneDocumentFactory_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetType() throws Throwable  {
      DefaultLuceneDocumentFactory.FieldConfiguration defaultLuceneDocumentFactory_FieldConfiguration = new DefaultLuceneDocumentFactory.FieldConfiguration();
      defaultLuceneDocumentFactory_FieldConfiguration.setType("NgUVYq#6j-NnTE92");
      assertEquals("NgUVYq#6j-NnTE92", defaultLuceneDocumentFactory_FieldConfiguration.getType());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetType() throws Throwable  {
      DefaultLuceneDocumentFactory.FieldConfiguration defaultLuceneDocumentFactory_FieldConfiguration = new DefaultLuceneDocumentFactory.FieldConfiguration();
      String type = defaultLuceneDocumentFactory_FieldConfiguration.getType();
      assertNull(type);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesFieldConfigurationAndCallsToString() throws Throwable  {
      DefaultLuceneDocumentFactory.FieldConfiguration defaultLuceneDocumentFactory_FieldConfiguration = new DefaultLuceneDocumentFactory.FieldConfiguration();
      String string = defaultLuceneDocumentFactory_FieldConfiguration.toString();
      assertNotNull(string);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAttributeName() throws Throwable  {
      DefaultLuceneDocumentFactory.FieldConfiguration defaultLuceneDocumentFactory_FieldConfiguration = new DefaultLuceneDocumentFactory.FieldConfiguration();
      String attributeName = defaultLuceneDocumentFactory_FieldConfiguration.getAttributeName();
      assertNull(attributeName);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetFieldName() throws Throwable  {
      DefaultLuceneDocumentFactory.FieldConfiguration defaultLuceneDocumentFactory_FieldConfiguration = new DefaultLuceneDocumentFactory.FieldConfiguration();
      String fieldName = defaultLuceneDocumentFactory_FieldConfiguration.getFieldName();
      assertNull(fieldName);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesFieldConfigurationAndCallsEquals() throws Throwable  {
      DefaultLuceneDocumentFactory.FieldConfiguration defaultLuceneDocumentFactory_FieldConfiguration = new DefaultLuceneDocumentFactory.FieldConfiguration();
      boolean equals = defaultLuceneDocumentFactory_FieldConfiguration.equals((Object) null);
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetFieldName() throws Throwable  {
      DefaultLuceneDocumentFactory.FieldConfiguration defaultLuceneDocumentFactory_FieldConfiguration = new DefaultLuceneDocumentFactory.FieldConfiguration();
      defaultLuceneDocumentFactory_FieldConfiguration.setFieldName("");
      assertEquals("", defaultLuceneDocumentFactory_FieldConfiguration.getFieldName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetAttributeName() throws Throwable  {
      DefaultLuceneDocumentFactory.FieldConfiguration defaultLuceneDocumentFactory_FieldConfiguration = new DefaultLuceneDocumentFactory.FieldConfiguration();
      defaultLuceneDocumentFactory_FieldConfiguration.setAttributeName("Unknown type for a field, fieldName=");
      assertEquals("Unknown type for a field, fieldName=", defaultLuceneDocumentFactory_FieldConfiguration.getAttributeName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesDefaultAnalyzerAndCallsTokenStream() throws Throwable  {
      DefaultLuceneDocumentFactory.DefaultAnalyzer defaultLuceneDocumentFactory_DefaultAnalyzer = new DefaultLuceneDocumentFactory.DefaultAnalyzer();
      StringReader arg1 = new StringReader("Q*9(_F)}vKooyZ");
      TokenStream tokenStream = defaultLuceneDocumentFactory_DefaultAnalyzer.tokenStream(".;", (Reader) arg1);
      assertNotNull(tokenStream);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetHandleFieldNameThrowsRuntimeException() throws Throwable  {
      DefaultLuceneDocumentFactory arg0 = new DefaultLuceneDocumentFactory();
      // Undeclared exception!
      try { 
        arg0.getHandleFieldName(arg0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Couldn't load lucene config file successfully, file=class org.petsoar.search.lucene.DefaultLuceneDocumentFactory
         //
         verifyException("org.petsoar.search.lucene.DefaultLuceneDocumentFactory", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreateAnalyzer() throws Throwable  {
      DefaultLuceneDocumentFactory defaultLuceneDocumentFactory = new DefaultLuceneDocumentFactory();
      Analyzer createAnalyzer = defaultLuceneDocumentFactory.createAnalyzer();
      assertNotNull(createAnalyzer);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreateDocumentThrowsRuntimeException() throws Throwable  {
      DefaultLuceneDocumentFactory.FieldConfiguration arg0 = new DefaultLuceneDocumentFactory.FieldConfiguration();
      DefaultLuceneDocumentFactory defaultLuceneDocumentFactory = new DefaultLuceneDocumentFactory();
      // Undeclared exception!
      try { 
        defaultLuceneDocumentFactory.createDocument(arg0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Couldn't load lucene config file successfully, file=class org.petsoar.search.lucene.DefaultLuceneDocumentFactory$FieldConfiguration
         //
         verifyException("org.petsoar.search.lucene.DefaultLuceneDocumentFactory", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetHandleAttributeNameThrowsRuntimeException() throws Throwable  {
      DefaultLuceneDocumentFactory arg0 = new DefaultLuceneDocumentFactory();
      // Undeclared exception!
      try { 
        arg0.getHandleAttributeName(arg0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Couldn't load lucene config file successfully, file=class org.petsoar.search.lucene.DefaultLuceneDocumentFactory
         //
         verifyException("org.petsoar.search.lucene.DefaultLuceneDocumentFactory", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAddFieldConfiguration() throws Throwable  {
      DefaultLuceneDocumentFactory.FieldConfiguration arg0 = new DefaultLuceneDocumentFactory.FieldConfiguration();
      DefaultLuceneDocumentFactory.ClassConfiguration defaultLuceneDocumentFactory_ClassConfiguration = new DefaultLuceneDocumentFactory.ClassConfiguration();
      defaultLuceneDocumentFactory_ClassConfiguration.addFieldConfiguration(arg0);
      assertNull(arg0.getType());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesClassConfigurationAndCallsToString() throws Throwable  {
      DefaultLuceneDocumentFactory.ClassConfiguration defaultLuceneDocumentFactory_ClassConfiguration = new DefaultLuceneDocumentFactory.ClassConfiguration();
      String string = defaultLuceneDocumentFactory_ClassConfiguration.toString();
      assertNotNull(string);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesClassConfigurationAndCallsEquals() throws Throwable  {
      DefaultLuceneDocumentFactory.ClassConfiguration defaultLuceneDocumentFactory_ClassConfiguration = new DefaultLuceneDocumentFactory.ClassConfiguration();
      boolean equals = defaultLuceneDocumentFactory_ClassConfiguration.equals("org.petsoar.search.lucene.DefaultLuceneDocumentFactory$FieldConfiguration@1[attributeName=<null>,fieldName=<null>,type=<null>]");
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetFieldConfigurations() throws Throwable  {
      DefaultLuceneDocumentFactory.ClassConfiguration defaultLuceneDocumentFactory_ClassConfiguration = new DefaultLuceneDocumentFactory.ClassConfiguration();
      List fieldConfigurations = defaultLuceneDocumentFactory_ClassConfiguration.getFieldConfigurations();
      assertTrue(fieldConfigurations.isEmpty());
  }
}