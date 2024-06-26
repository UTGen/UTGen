/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Mon Mar 18 04:55:27 GMT 2024
 */

package com.gbshape.dbe.utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.gbshape.dbe.struts.bean.ColumnBean;
import com.gbshape.dbe.struts.bean.DBDataBean;
import com.gbshape.dbe.struts.bean.DataTypeBean;
import com.gbshape.dbe.utils.DBEHelper;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.HashMap;
import javax.servlet.ServletContext;
import oracle.sql.RAW;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DBEHelper_ESTest extends DBEHelper_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetDimDataTypes() throws Throwable  {
      // rollbacked to evosuite
      DBDataBean arg0 = new DBDataBean();
      arg0.setDbType("@#1");
      DBEHelper.getDimDataTypes(arg0);
      DBDataBean dBDataBean = new DBDataBean();
      assertEquals("", dBDataBean.getDbType());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testShowTableStatus() throws Throwable  {
      // Given a DBDataBean instance with some data
      DBDataBean arg0 = new DBDataBean();
      
      // When the showTableStatus method is called on this instance
      boolean showTableStatus = DBEHelper.showTableStatus(arg0);
      
      // Then assert that the status of the table is true
      assertTrue(showTableStatus);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testShowDataBases() throws Throwable  {
      // Given a database connection
      DBDataBean arg0 = new DBDataBean();
      
      // When the showDatabases method is called on the connection
      boolean showDataBases = DBEHelper.showDataBases(arg0);
      
      // Then the method should return false, indicating that no databases are available
      assertFalse(showDataBases);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testParseJSON() throws Throwable  {
      HashMap<String, Object> parseJSON = DBEHelper.parseJSON(":@C_/lma' MLU");
      assertEquals(1, parseJSON.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsDBAvailableReturningTrue() throws Throwable  {
      // Check if a database connection is available for the "oracle" database
      boolean dbAvailable = DBEHelper.isDBAvailable("oracle");
      
      // Assert that a database connection is available
      assertTrue(dbAvailable);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsColumnExtra() throws Throwable  {
      // rollbacked to evosuite
      DBDataBean arg0 = new DBDataBean();
      DBEHelper.isColumnExtra(arg0);
      ColumnBean columnBean = new ColumnBean();
      assertEquals("", columnBean.getDataType());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetImportTasks() throws Throwable  {
      // No Comments were added
      DBEHelper.getImportTasks();
      DBDataBean dBDataBean = new DBDataBean();
      assertEquals("", dBDataBean.getTempDir());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetImplementationVersionReturningNull() throws Throwable  {
      // Given: A RAW object that has a method to create an ASCII stream value
      RAW rAW = new RAW();
      InputStream asciiStreamValue = rAW.asciiStreamValue();
      
      // When: The method getResourceAsStream is called on the ServletContext with any string argument
      ServletContext arg0 = mock(ServletContext.class, new ViolatedAssumptionAnswer());
      doReturn(asciiStreamValue).when(arg0).getResourceAsStream(anyString());
      
      // Then: The implementation version should be null
      String implementationVersion = DBEHelper.getImplementationVersion(arg0);
      assertNull(implementationVersion);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetDataTypes() throws Throwable  {
      // rollbacked to evosuite
      DBDataBean arg0 = new DBDataBean();
      String[] dataTypes = DBEHelper.getDataTypes(arg0);
      assertNull(dataTypes);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetConnectionStartURL() throws Throwable  {
      // Given a DBDataBean instance with an empty string as the URL
      DBDataBean dbDataBean = new DBDataBean();
      dbDataBean.setUrl("");
      
      // When the method getConnectionStartURL is called with the DBDataBean instance as a parameter
      String connectionStartURL = DBEHelper.getConnectionStartURL(dbDataBean);
      
      // Then the empty string should be returned
      assertEquals("", connectionStartURL);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDecodeISOReturningNull() throws Throwable  {
      // Given a DBDataBean object and a null String parameter
      DBDataBean arg0 = new DBDataBean();
      String param = null;
      
      // When we call the decodeISO method with these parameters
      String decodeISO = DBEHelper.decodeISO(arg0, param);
      
      // Then the return value should be null
      assertNull(decodeISO);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDecodeISOReturningEmptyString() throws Throwable  {
      // Given a DBDataBean object with some data
      DBDataBean dbDataBean = new DBDataBean();
      
      // When the decodeISO method is called on the DBDataBean
      String decodedString = DBEHelper.decodeISO(dbDataBean, "");
      
      // Then the decoded string should be an empty string
      assertEquals("", decodedString);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDecodeAjaxReturningNull() throws Throwable  {
      // Given a DBDataBean with a null input string
      DBDataBean arg0 = new DBDataBean();
      
      // When decodeAjax is called with the null input string
      String decodeAjax = DBEHelper.decodeAjax(arg0, (String) null);
      
      // Then assert that the return value is null
      assertNull(decodeAjax);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDecodeAjaxReturningEmptyString() throws Throwable  {
      // Given a DBDataBean object containing data to be decoded
      DBDataBean arg0 = new DBDataBean();
      
      // When the decodeAjax method is called on the DBDataBean object
      String decodeAjax = DBEHelper.decodeAjax(arg0, "");
      
      // Then the expected result is an empty string
      assertEquals("", decodeAjax);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCanCreateSequence() throws Throwable  {
      // Given a DBDataBean with user "oracle.sql.CharacterSetFactoryDefault"
      DBDataBean dbDataBean = new DBDataBean();
      dbDataBean.setUser("oracle.sql.CharacterSetFactoryDefault");
      
      // When the method canCreateSequence is called with the DBDataBean
      boolean result = DBEHelper.canCreateSequence(dbDataBean);
      
      // Then the method should return true
      assertTrue(result);
      
      // And the language of the DBDataBean should be "FR"
      assertEquals("FR", dbDataBean.getLanguage());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetDataTypeBeanWithEmptyString() throws Throwable  {
      // Given: a DBDataBean with no data
      DBDataBean arg0 = new DBDataBean();
      
      // When: getDataTypeBean is called with an empty string as the second argument
      DataTypeBean dataTypeBean = DBEHelper.getDataTypeBean(arg0, "");
      
      // Then: null should be returned
      assertNull(dataTypeBean);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAppendValuesNoDecodeAjax() throws Throwable  {
      // Arrange
      DBDataBean dbDataBean = new DBDataBean();
      StringBuffer stringBuffer = new StringBuffer();
      ColumnBean columnBean = new ColumnBean();
      
      // Act
      DBEHelper.appendValuesNoDecodeAjax(dbDataBean, stringBuffer, columnBean, null);
      
      // Assert
      assertEquals(6, stringBuffer.length());
      assertEquals(" NULL ", stringBuffer.toString());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesDBEHelper() throws Throwable  {
      // rollbacked to evosuite
      ServletContext arg0 = mock(ServletContext.class, new ViolatedAssumptionAnswer());
      doReturn((ByteArrayInputStream) null).when(arg0).getResourceAsStream(anyString());
      DBEHelper.getImplementationVersion(arg0);
      DBEHelper dBEHelper = new DBEHelper();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetJDBCDriver() throws Throwable  {
      // rollbacked to evosuite
      DBDataBean arg0 = new DBDataBean();
      arg0.setNickName("TestUser");
      DBEHelper.getDataTypeBean(arg0, "INSERT INTO users (name, age) VALUES ('TestUser', 25)");
      String jDBCDriver = DBEHelper.getJDBCDriver(arg0);
      assertEquals("", jDBCDriver);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAppendValuesNoDecodeAjaxThrowsNullPointerException() throws Throwable  {
      // Given: a DBDataBean object and a StringBuffer to hold the appended values
      DBDataBean arg0 = new DBDataBean();
      StringBuffer arg1 = new StringBuffer();
      
      // When: the appendValuesNoDecodeAjax method is called with a test string as an argument
      ColumnBean arg2 = new ColumnBean();
      try {
      DBEHelper.appendValuesNoDecodeAjax(arg0, arg1, arg2, "This is a test string.");
      } catch (NullPointerException e) {
      // Then: a NullPointerException should be thrown because the method does not support null values
      verifyException("com.gbshape.dbe.utils.DBEHelper", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAppendValuesWithNullAndEmptyString() throws Throwable  {
      // Given
      DBDataBean arg0 = new DBDataBean();
      ColumnBean arg2 = new ColumnBean();
      
      try {
      // When
      DBEHelper.appendValues(arg0, null, arg2, "");
      
      // Then
      fail("Expected NullPointerException to be thrown");
      
      } catch (NullPointerException e) {
      // no message in exception (getMessage() returned null)
      verifyException("com.gbshape.dbe.utils.DBEHelper", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAppendValuesWithStringBufferWhereLengthIsZeroAndNonEmptyString() throws Throwable  {
      // No Comments were added
      DBDataBean arg0 = new DBDataBean();
      StringBuffer arg1 = new StringBuffer();
      ColumnBean arg2 = new ColumnBean();
      // Undeclared exception!
      try { 
        DBEHelper.appendValues(arg0, arg1, arg2, "!@#$%^&*()_+-=[]{}|;':\"<>,./`~");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.gbshape.dbe.utils.DBEHelper", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAppendValue() throws Throwable  {
      // No Comments were added
      DBDataBean arg0 = new DBDataBean();
      StringBuffer arg1 = new StringBuffer(252);
      ColumnBean arg2 = new ColumnBean();
      DBEHelper.appendValue(arg0, arg1, arg2, "");
      ColumnBean columnBean = new ColumnBean();
      assertFalse(columnBean.isIndex());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testParseJSONThrowsStringIndexOutOfBoundsException() throws Throwable  {
      // No Comments were added
      // Undeclared exception!
      try { 
        DBEHelper.parseJSON("\" all_objects o\n");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetConnectionThrowsSQLException() throws Throwable  {
      // Given a DBDataBean with an invalid Oracle URL
      DBDataBean arg0 = new DBDataBean();
      arg0.setDriver("oracle.sql.SQLName");
      
      // When the connection is retrieved using DBEHelper
      try {
      DBEHelper.getConnection(arg0);
      fail("Expecting exception: SQLException");
      } catch (SQLException e) {
      // Then an invalid Oracle URL exception should be thrown
      verifyException("oracle.jdbc.driver.DatabaseError", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDecodeISOReturningNonEmptyString() throws Throwable  {
      // Given
      String inputString = "This is a test string.";
      DBDataBean arg0 = new DBDataBean();
      
      // When
      String decodeISO = DBEHelper.decodeISO(arg0, inputString);
      
      // Then
      assertEquals("This is a test string.", decodeISO);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDecodeAjaxReturningNonEmptyString() throws Throwable  {
      // Arrange
      DBDataBean dbDataBean = new DBDataBean();
      
      // Act
      String decodedAjax = DBEHelper.decodeAjax(dbDataBean, "?");
      
      // Assert
      assertEquals("?", decodedAjax);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsDBAvailableReturningFalse() throws Throwable  {
      // Given: We have a MySQL database instance available
      // When: We check if the database is available
      // Then: The database should not be available
      boolean dBAvailable = DBEHelper.isDBAvailable("MySQL");
      assertFalse(dBAvailable);
  }
}
