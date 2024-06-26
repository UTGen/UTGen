/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Thu Mar 21 11:28:51 GMT 2024
 */

package org.heal.module.search;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import com.microsoft.jdbcx.base.BaseXADataSource;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.heal.module.search.AdvSearchDAO;
import org.heal.module.search.ParameterBean;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AdvSearchDAO_ESTest extends AdvSearchDAO_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAdvSearchThrowsNullPointerException() throws Throwable  {
      ParameterBean parameterBean = new ParameterBean("Metadata.PublicationId IN (SELECT Publications.PublicationId FROM Publications WHERE PublicationName LIKE '");
      
      // When: The AdvSearch method is called with the ParameterBean
      AdvSearchDAO advSearchDAO = new AdvSearchDAO();
      try {
      advSearchDAO.AdvSearch(parameterBean);
      fail("Expecting exception: NullPointerException");
      } catch (NullPointerException e) {
      // Then: An exception is thrown with a message indicating that the publication id is null
      String expectedMessage = "Publication id cannot be null";
      assertEquals(expectedMessage, e.getMessage());}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetMultiSelectionReturningEmptyString() throws Throwable  {
      // Given: An AdvSearchDAO instance with an empty array as input
      AdvSearchDAO advSearchDAO = new AdvSearchDAO();
      String[] arg0 = new String[0];
      
      // When: The getMultiSelection method is called with the empty array and a specific selection value (CopyRights)
      String multiSelection = advSearchDAO.getMultiSelection(arg0, "CopyRights");
      
      // Then: The method should return an empty string ""
      assertEquals("", multiSelection);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAddDefaultConnectivesReturningEmptyString() throws Throwable  {
      // Given: A blank string as input
      String input = "";
      
      // When: The method is called with the blank string
      AdvSearchDAO advSearchDAO = new AdvSearchDAO();
      String addDefaultConnectives = advSearchDAO.addDefaultConnectives(input);
      
      // Then: The result should be a blank string
      assertEquals("", addDefaultConnectives);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetMultiSelectionReturningNonEmptyString() throws Throwable  {
      // Given a list of search parameters and a specific field to search for
      String[] args = new String[8];
      AdvSearchDAO advSearchDAO = new AdvSearchDAO();
      String multiSelection = advSearchDAO.getMultiSelection(args, "CopyRights");
      
      // When the method is called with these arguments and a specific field to search for
      
      // Then the returned selection should be a SQL query that includes the specified field and any relevant values from the input parameters
      assertEquals("CopyRights like '%null%' OR CopyRights like '%null%' OR CopyRights like '%null%' OR CopyRights like '%null%' OR CopyRights like '%null%' OR CopyRights like '%null%' OR CopyRights like '%null%' OR CopyRights like '%null%' ", multiSelection);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAddDefaultConnectives0() throws Throwable  {
      // Arrange
      AdvSearchDAO advSearchDAO = new AdvSearchDAO();
      
      // Act
      String actualResult = advSearchDAO.addDefaultConnectives("Error closing Blob or Clob object.");
      
      // Assert
      assertEquals("Error  and closing  and Blob or Clob  and object. ", actualResult);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testMakeQueryThrowsNullPointerException() throws Throwable  {
      // Given: a AdvSearchDAO instance and an invalid parameter (null)
      AdvSearchDAO advSearchDAO = new AdvSearchDAO();
      ParameterBean arg0 = new ParameterBean("all");
      arg0.setHidden(true);
      
      // When: the makeQuery method is called with the null parameter
      try {
      advSearchDAO.makeQuery(arg0);
      fail("Expecting exception: NullPointerException");
      } catch (NullPointerException e) {
      // Then: a NullPointerException is thrown
      verifyException("org.heal.module.search.AdvSearchDAO", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testBuildMutiQuery0() throws Throwable  {
      // Given: The AdvSearchDAO class is initialized with the test data
      AdvSearchDAO advSearchDAO = new AdvSearchDAO();
      
      // When: The buildMutiQuery method is called with specific parameters
      String buildMutiQuery = advSearchDAO.buildMutiQuery("Could not find Transliteration table.", "Transliteration table not found.", "Could not find Transliteration table.", "Specified parameter values not supported for method: search", " \nUNION ");
      
      // Then: The resulting query is valid and includes the expected columns and conditions
      assertEquals("SELECT Could not find Transliteration table..metadataID from Could not find Transliteration table. WHERE Transliteration table not found. IN (Select Transliteration table not found. from Specified parameter values not supported for method: search WHERE  \nUNION  like 'Could%' OR  \nUNION  like '% Could%'  AND Transliteration table not found. NOT IN (SELECT Transliteration table not found. FROM Specified parameter values not supported for method: search WHERE  \nUNION  like 'find%' OR  \nUNION  like '% find%' ) AND Transliteration table not found. IN (SELECT Transliteration table not found. FROM Specified parameter values not supported for method: search WHERE  \nUNION  like 'Transliteration%' OR  \nUNION  like '% Transliteration%' ) AND Transliteration table not found. IN (SELECT Transliteration table not found. FROM Specified parameter values not supported for method: search WHERE  \nUNION  like 'table.%' OR  \nUNION  like '% table.%' ))", buildMutiQuery);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testBuildMutiQuery1() throws Throwable  {
      // AdvSearchDAO represents the class that contains the method "buildMutiQuery".
      AdvSearchDAO advSearchDAO = new AdvSearchDAO();
      
      // The following line of code builds a multi-query based on the specified criteria.
      String buildMutiQuery = advSearchDAO.buildMutiQuery(" AND Metadata.MetadataID NOT IN (select MetadataID from TargetUserGroups where TargetUserGroup = 'Consumer Health/Patient Education' or TargetUserGroup = 'K-12')", " AND Metadata.MetadataID NOT IN (select MetadataID from TargetUserGroups where TargetUserGroup = 'Higher Education' or TargetUserGroup ='Health Profession Education')", " AND Metadata.MetadataID NOT IN (select MetadataID from TargetUserGroups where TargetUserGroup = 'Consumer Health/Patient Education' or TargetUserGroup = 'K-12')", " AND Metadata.MetadataID NOT IN (select MetadataID from TargetUserGroups where TargetUserGroup = 'Higher Education' or TargetUserGroup ='Health Profession Education')", " AND Metadata.MetadataID NOT IN (select MetadataID from TargetUserGroups where TargetUserGroup = 'Consumer Health/Patient Education' or TargetUserGroup = 'K-12')");
      
      // The following line of code asserts that the built multi-query is not null.
      assertNotNull(buildMutiQuery);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testBuildMutiQuery2() throws Throwable  {
      // Arrange
      AdvSearchDAO advSearchDAO = new AdvSearchDAO();
      
      // Act
      String buildMutiQuery = advSearchDAO.buildMutiQuery("SELECT =$FG{b.>h)aC^: 3.metadataID from =$FG{b.>h)aC^: 3 WHERE =$FG{b.>h)aC^: 3 like '=$FG{b.>h)aC^:%' OR =$FG{b.>h)aC^: 3 like '% =$FG{b.>h)aC^:%'  AND Metadata.metadataID IN (SELECT =$FG{b.>h)aC^: 3.MetadataID from =$FG{b.>h)aC^: 3 where =$FG{b.>h)aC^: 3 like '3%' OR =$FG{b.>h)aC^: 3 like '% 3%' )", "SELECT =$FG{b.>h)aC^: 3.metadataID from =$FG{b.>h)aC^: 3 WHERE =$FG{b.>h)aC^: 3 like '=$FG{b.>h)aC^:%' OR =$FG{b.>h)aC^: 3 like '% =$FG{b.>h)aC^:%'  AND Metadata.metadataID IN (SELECT =$FG{b.>h)aC^: 3.MetadataID from =$FG{b.>h)aC^: 3 where =$FG{b.>h)aC^: 3 like '3%' OR =$FG{b.>h)aC^: 3 like '% 3%' )", "SELECT =$FG{b.>h)aC^: 3.metadataID from =$FG{b.>h)aC^: 3 WHERE =$FG{b.>h)aC^: 3 like '=$FG{b.>h)aC^:%' OR =$FG{b.>h)aC^: 3 like '% =$FG{b.>h)aC^:%'  AND Metadata.metadataID IN (SELECT =$FG{b.>h)aC^: 3.MetadataID from =$FG{b.>h)aC^: 3 where =$FG{b.>h)aC^: 3 like '3%' OR =$FG{b.>h)aC^: 3 like '% 3%' )", "SELECT =$FG{b.>h)aC^: 3.metadataID from =$FG{b.>h)aC^: 3 WHERE =$FG{b.>h)aC^: 3 like '=$FG{b.>h)aC^:%' OR =$FG{b.>h)aC^: 3 like '% =$FG{b.>h)aC^:%'  AND Metadata.metadataID IN (SELECT =$FG{b.>h)aC^: 3.MetadataID from =$FG{b.>h)aC^: 3 where =$FG{b.>h)aC^: 3 like '3%' OR =$FG{b.>h)aC^: 3 like '% 3%' )", "SELECT =$FG{b.>h)aC^: 3.metadataID from =$FG{b.>h)aC^: 3 WHERE =$FG{b.>h)aC^: 3 like '=$FG{b.>h)aC^:%' OR =$FG{b.>h)aC^: 3 like '% =$FG{b.>h)aC^:%'  AND Metadata.metadataID IN (SELECT =$FG{b.>h)aC^: 3.MetadataID from =$FG{b.>h)aC^: 3 where =$FG{b.>h)aC^: 3 like '3%' OR =$FG{b.>h)aC^: 3 like '% 3%' )");
      
      // Assert
      assertNotNull(buildMutiQuery);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testBuildMutiQuery3() throws Throwable  {
      // Given
      AdvSearchDAO advSearchDAO = new AdvSearchDAO();
      
      // When
      String buildMutiQuery = advSearchDAO.buildMutiQuery("(", "(", "#m[;4pb", "(", "K4O<");
      
      // Then
      assertEquals("SELECT #m[;4pb.metadataID from #m[;4pb WHERE ( IN (Select ( from ( WHERE ( )", buildMutiQuery);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testBuildMutiQueryWithNullAndNull() throws Throwable  {
      // rollbacked to evosuite
      AdvSearchDAO advSearchDAO = new AdvSearchDAO();
      String buildMutiQuery = advSearchDAO.buildMutiQuery("SELECT \"metadataID\" from \" WHERE OQrQvxK $ like ';password=my_secret_password' OR OQrQvxK $ like '% ;password=my_secret_password' ", "mgL6:dtG_sz;IT", "OQrQvxK $", (String) null, (String) null);
      assertEquals("SELECT OQrQvxK $.metadataID from OQrQvxK $ WHERE mgL6:dtG_sz;IT IN (Select mgL6:dtG_sz;IT from null WHERE null like 'SELECT%' OR null like '% SELECT%'  AND mgL6:dtG_sz;IT IN (SELECT mgL6:dtG_sz;IT FROM null WHERE null like '\"metadataID\"%' OR null like '% \"metadataID\"%' ) AND mgL6:dtG_sz;IT IN (SELECT mgL6:dtG_sz;IT FROM null WHERE null like 'from%' OR null like '% from%' ) AND mgL6:dtG_sz;IT IN (SELECT mgL6:dtG_sz;IT FROM null WHERE null like '% and WHERE and OQrQvxK and $ and like and ';password=my_secret_password' and OR and OQrQvxK and $ and like and '% and %' OR null like '% and WHERE and OQrQvxK and $ and like and ';password=my_secret_password' and OR and OQrQvxK and $ and like and '% and%' OR null like '% and WHERE and OQrQvxK and $ and like and ';password=my_secret_password' and OR and OQrQvxK and $ and like and '% and %'))", buildMutiQuery);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testBuildMutiQuery4() throws Throwable  {
      // No Comments were added
      AdvSearchDAO advSearchDAO = new AdvSearchDAO();
      String buildMutiQuery = advSearchDAO.buildMutiQuery("SELECT  \" .metadataID from  \"  WHERE cQrQvxN $ like ';password=%' OR cQrQvxN $ like '% ;password=%' ", "mgL6dtG_sz;IT", " \" ", "mgL6dtG_sz;IT", "wD2*<nA@?");
      assertNotNull(buildMutiQuery);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testBuildCommonQuery0() throws Throwable  {
      // No Comments were added
      AdvSearchDAO advSearchDAO = new AdvSearchDAO();
      String buildCommonQuery = advSearchDAO.buildCommonQuery("Transliteration table {0} not found.", "Transliteration table {0} not found.", "Transliteration table {0} not found.");
      assertEquals("SELECT Transliteration table {0} not found..metadataID from Transliteration table {0} not found. WHERE Transliteration table {0} not found. like 'Transliteration%' OR Transliteration table {0} not found. like '% Transliteration%'  AND Metadata.metadataID IN (SELECT Transliteration table {0} not found..MetadataID from Transliteration table {0} not found. where Transliteration table {0} not found. like 'table%' OR Transliteration table {0} not found. like '% table%' ) AND Metadata.metadataID IN (SELECT Transliteration table {0} not found..MetadataID from Transliteration table {0} not found. where Transliteration table {0} not found. like '{0}%' OR Transliteration table {0} not found. like '% {0}%' ) AND Metadata.metadataID NOT IN (SELECT Transliteration table {0} not found..MetadataID from Transliteration table {0} not found. where Transliteration table {0} not found. like 'found.%' OR Transliteration table {0} not found. like '% found.%' )", buildCommonQuery);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testBuildCommonQuery1() throws Throwable  {
      AdvSearchDAO advSearchDAO = new AdvSearchDAO();
      String expectedSQL = "SELECT metadataID from table WHERE null like 'Discarded%' OR null like '% Discarded%'  AND Metadata.metadataID IN (SELECT MetadataID from table where null like 'ResultSet%' OR null like '% ResultSet%' ) AND Metadata.metadataID IN (SELECT MetadataID from table where null like 'during%' OR null like '% during%' ) AND Metadata.metadataID IN (SELECT MetadataID from table where null like 'executeUpdate.%' OR null like '% executeUpdate.%' )";
      String actualSQL = advSearchDAO.buildCommonQuery("SELECT :@e.9|3fug.metadataID from :@e.9|3fug WHERE null like 'Discarded%' OR null like '% Discarded%'  AND Metadata.metadataID IN (SELECT :@e.9|3fug.MetadataID from :@e.9|3fug where null like 'ResultSet%' OR null like '% ResultSet%' ) AND Metadata.metadataID IN (SELECT :@e.9|3fug.MetadataID from :@e.9|3fug where null like 'during%' OR null like '% during%' ) AND Metadata.metadataID IN (SELECT :@e.9|3fug.MetadataID from :@e.9|3fug where null like 'executeUpdate.%' OR null like '% executeUpdate.%' )", "SELECT :@e.9|3fug.metadataID from :@e.9|3fug WHERE null like 'Discarded%' OR null like '% Discarded%'  AND Metadata.metadataID IN (SELECT :@e.9|3fug.MetadataID from :@e.9|3fug where null like 'ResultSet%' OR null like '% ResultSet%' ) AND Metadata.metadataID IN (SELECT :@e.9|3fug.MetadataID from :@e.9|3fug where null like 'during%' OR null like '% during%' ) AND Metadata.metadataID IN (SELECT :@e.9|3fug.MetadataID from :@e.9|3fug where null like 'executeUpdate.%' OR null like '% executeUpdate.%' )", "SELECT :@e.9|3fug.metadataID from :@e.9|3fug WHERE null like 'Discarded%' OR null like '% Discarded%'  AND Metadata.metadataID IN (SELECT :@e.9|3fug.MetadataID from :@e.9|3fug where null like 'ResultSet%' OR null like '% ResultSet%' ) AND Metadata.metadataID IN (SELECT :@e.9|3fug.MetadataID from :@e.9|3fug where null like 'during%' OR null like '% during%' ) AND Metadata.metadataID IN (SELECT :@e.9|3fug.MetadataID from :@e.9|3fug where null like 'executeUpdate.%' OR null like '% executeUpdate.%' )");
      assertEquals(expectedSQL, actualSQL);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testBuildCommonQuery2() throws Throwable  {
      // Create a new instance of the AdvSearchDAO class
      AdvSearchDAO advSearchDAO = new AdvSearchDAO();
      
      // Define the user ID to use in the query
      String userId = "123456";
      
      // Build the common query using the AdvSearchDAO's buildCommonQuery method
      String buildCommonQuery = advSearchDAO.buildCommonQuery("(", "user_id", userId);
      
      // Assert that the built query is as expected
      assertEquals("SELECT 123456.metadataID from 123456 WHERE ( ", buildCommonQuery);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testBuildCommonQuery3() throws Throwable  {
      // rollbacked to evosuite
      AdvSearchDAO advSearchDAO = new AdvSearchDAO();
      String buildCommonQuery = advSearchDAO.buildCommonQuery("SELECT \".metadataID from \" WHERE OQrQvxK $ like 'mgL6:dtG_sz;IT%' OR OQrQvxK $ like '% mgL6:dtG_sz;IT%' ", "SELECT \".metadataID from \" WHERE OQrQvxK $ like 'mgL6:dtG_sz;IT%' OR OQrQvxK $ like '% mgL6:dtG_sz;IT%' ", "OQrQvxK $");
      assertNotNull(buildCommonQuery);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testBuildCommonQuery4() throws Throwable  {
      // Arrange
      AdvSearchDAO advSearchDAO = new AdvSearchDAO();
      String inputQuery = "SELECT  \" .metadataID from  \"  WHERE ;password= IN (Select ;password= from OQrQvxK $ WHERE Vz-A8#ZV like 'OQrQvxK%' OR Vz-A8#ZV like '% OQrQvxK%'  AND ;password= IN (SELECT ;password= FROM OQrQvxK $ WHERE Vz-A8#ZV like '$%' OR Vz-A8#ZV like '% $%'))";
      String userId = "6H{,v  RY'";
      String password = "6H{,v  RY'";
      
      // Act
      String buildCommonQuery = advSearchDAO.buildCommonQuery(inputQuery, userId, password);
      
      // Assert
      assertNotNull(buildCommonQuery);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAddDefaultConnectives1() throws Throwable  {
      // Create a new instance of the AdvSearchDAO
      AdvSearchDAO advSearchDAO = new AdvSearchDAO();
      
      // Set up some sample input data for testing
      String searchQuery = "The and specified and SQL and type and is not supported and by and this and driver.";
      
      // Call the method to be tested, using our sample input data
      String actualResult = advSearchDAO.addDefaultConnectives(searchQuery);
      
      // Define the expected result of the test
      String expectedResult = "The and specified and SQL and type and is not supported and by and this and driver.";
      
      // Assert that the expected result matches the actual result
      assertEquals(expectedResult, actualResult);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testBuildCommonQuery5() throws Throwable  {
      // Given a set of target user groups for which content should be hidden
      String[] hiddenGroups = {"Consumer Health/Patient Education", "K-12", "Higher Education", "Health Profession Education"};
      
      // When the buildCommonQuery method is called with a list of metadata IDs and the hidden groups
      AdvSearchDAO advSearchDAO = new AdvSearchDAO();
      String buildCommonQuery = advSearchDAO.buildCommonQuery(" AND Metadata.MetadataID NOT IN (select MetadataID from TargetUserGroups where (TargetUserGroup = 'Consumer Health/Patient Education' or TargetUserGroup = 'K-12') AND MetadataID NOT IN (select MetadataID from TargetUserGroups where TargetUserGroup = 'Higher Education' or TargetUserGroup ='Health Profession Education'))", " AND Metadata.MetadataID NOT IN (select MetadataID from TargetUserGroups where (TargetUserGroup = 'Consumer Health/Patient Education' or TargetUserGroup = 'K-12') AND MetadataID NOT IN (select MetadataID from TargetUserGroups where TargetUserGroup = 'Higher Education' or TargetUserGroup ='Health Profession Education'))", " AND Metadata.MetadataID NOT IN (select MetadataID from TargetUserGroups where (TargetUserGroup = 'Consumer Health/Patient Education' or TargetUserGroup = 'K-12') AND MetadataID NOT IN (select MetadataID from TargetUserGroups where TargetUserGroup = 'Higher Education' or TargetUserGroup ='Health Profession Education'))");
      
      // Then the buildCommonQuery method should return a valid query with the appropriate WHERE clause
      assertNotNull(buildCommonQuery);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetDataSource() throws Throwable  {
      // rollbacked to evosuite
      AdvSearchDAO advSearchDAO = new AdvSearchDAO();
      BaseXADataSource arg0 = new BaseXADataSource();
      advSearchDAO.setDataSource(arg0);
      assertNull(arg0.getSpyAttributes());
  }
}
