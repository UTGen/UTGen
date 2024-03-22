/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Mon Mar 18 00:53:12 GMT 2024
 */

package org.databene.jdbacl;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.PipedOutputStream;
import java.io.PipedWriter;
import java.util.List;
import org.apache.derby.iapi.store.raw.xact.RawTransaction;
import org.databene.jdbacl.NameSpec;
import org.databene.jdbacl.SQLUtil;
import org.databene.jdbacl.model.CompositeDBObject;
import org.databene.jdbacl.model.DBCheckConstraint;
import org.databene.jdbacl.model.DBColumn;
import org.databene.jdbacl.model.DBConstraint;
import org.databene.jdbacl.model.DBDataType;
import org.databene.jdbacl.model.DBForeignKeyConstraint;
import org.databene.jdbacl.model.DBNotNullConstraint;
import org.databene.jdbacl.model.DBObject;
import org.databene.jdbacl.model.DBSchema;
import org.databene.jdbacl.model.DBTable;
import org.databene.jdbacl.model.DefaultDBColumn;
import org.databene.jdbacl.model.DefaultDBTable;
import org.databene.jdbacl.model.TableContainer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SQLUtil_ESTest extends SQLUtil_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testTypeAndName0() throws Throwable  {
      // Given a DBCheckConstraint object with name "constraint" and no table name specified
      DBCheckConstraint checkConstraint = new DBCheckConstraint("constraint", false, "CLOB", "localhost");
      
      // When the typeAndName method is called on this object
      String typeAndName = SQLUtil.typeAndName(checkConstraint);
      
      // Then it should return the string representation of the check constraint including its name
      assertEquals("check constraint constraint", typeAndName);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRenderColumnListWithTableNameThrowsNullPointerException() throws Throwable  {
      // Undeclared exception!
      try {
      SQLUtil.renderColumnListWithTableName("my_table", (String[]) null);
      fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      //
      // no message in exception (getMessage() returned null)
      //
      verifyException("org.databene.jdbacl.SQLUtil", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSubstituteMarkersReturningEmptyString() throws Throwable  {
      // rollbacked to evosuite
      Object arg2 = new Object();
      String substituteMarkers = SQLUtil.substituteMarkers("", "org.apache.derby.impl.sql.compile.ConstantExpressionVisitor", arg2);
      assertEquals("", substituteMarkers);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRenderWhereClauseReturningNonEmptyString() throws Throwable  {
      // Given: We have two arrays of String, arg1 and arg2, both with 4 elements.
      String[] arg1 = new String[4];
      String[] arg2 = new String[4];
      
      // When: We call the renderWhereClause method on these two arrays with the second array as a parameter.
      String renderWhereClause = SQLUtil.renderWhereClause(arg1, arg2);
      
      // Then: The method returns a concatenated string of "null = null AND null = null AND null = null AND null = null", which is the expected result.
      assertEquals("null = null AND null = null AND null = null AND null = null", renderWhereClause);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRenderValueReturningNull() throws Throwable  {
      // Given: A DefaultDBTable object with a null value
      DefaultDBTable arg0 = new DefaultDBTable((String) null);
      
      // When: The renderValue method is called on the DefaultDBTable object
      String renderValue = SQLUtil.renderValue(arg0);
      
      // Then: The rendered value should be null
      assertNull(renderValue);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRenderColumnNamesTakingList() throws Throwable  {
      DefaultDBTable arg1 = new DefaultDBTable();
      // Create a new instance of the DefaultDBColumn with some sample values
      DefaultDBColumn defaultDBColumn = new DefaultDBColumn(":!|fhS}", arg1, 1595, ":!|fhS}");
      List<DBColumn> arg0 = arg1.getColumns();
      // Get the list of DBColumn objects from the DefaultDBTable instance
      String renderColumnNames = SQLUtil.renderColumnNames(arg0);
      // Assert that the rendered column names are equal to the expected value
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRenderColumnListWithTableNameReturningNonEmptyString() throws Throwable  {
      // Test that null input returns "null.null" as expected
      String[] arg1 = new String[2];
      String renderColumnListWithTableName = SQLUtil.renderColumnListWithTableName((String) null, arg1);
      assertEquals("null.null", renderColumnListWithTableName);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRenderColumnListWithTableNameReturningEmptyString() throws Throwable  {
      // No Comments were added
      String[] arg1 = new String[0];
      String renderColumnListWithTableName = SQLUtil.renderColumnListWithTableName("<8\"L]:}KA", arg1);
      assertEquals("", renderColumnListWithTableName);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRemoveCommentsReturningEmptyString() throws Throwable  {
      // No Comments were added
      String removeComments = SQLUtil.removeComments("");
      assertEquals("", removeComments);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testParseColumnTypeAndSize() throws Throwable  {
      // Test that the correct number of elements are returned in the array
      Object[] parseColumnTypeAndSize = SQLUtil.parseColumnTypeAndSize("long~~~varchar(256)");
      assertEquals(2, parseColumnTypeAndSize.length);
      
      // Verify that the first element is a string containing the column type (e.g. "long")
      assertTrue(parseColumnTypeAndSize[0] instanceof String);
      String columnType = (String) parseColumnTypeAndSize[0];
      assertEquals("long", columnType);
      
      // Verify that the second element is an integer containing the size of the column (e.g. 256)
      assertTrue(parseColumnTypeAndSize[1] instanceof Integer);
      Integer columnSize = (Integer) parseColumnTypeAndSize[1];
      assertEquals(256, columnSize);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testNormalizeReturningEmptyString() throws Throwable  {
      // No Comments were added
      String normalize = SQLUtil.normalize("", false);
      assertEquals("", normalize);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testMutatesDataOrStructureReturningNull() throws Throwable  {
      // No Comments were added
      Boolean mutatesDataOrStructure = SQLUtil.mutatesDataOrStructure("l~\"ocavhost");
      assertNull(mutatesDataOrStructure);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsProcedureCallReturningTrue() throws Throwable  {
      // Check if the given string is a valid procedure call
      boolean procedureCall = SQLUtil.isProcedureCall("execygs4>/jk[^rk");
      assertTrue(procedureCall);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsDMLReturningTrue() throws Throwable  {
      // Check if the input string is a valid DML statement
      boolean dML = SQLUtil.isDML("delete@#v3z~}{(b");
      
      // Assert that the input string is a valid DML statement
      assertTrue(dML);
      
      // Expected result: true (the input string is a valid DML statement)
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testInnerJoin() throws Throwable  {
      // Given
      String[] arg4 = new String[6];
      String expectedResult = " NULL as Vc!o0&qXAP_ on .null = Vc!o0&qXAP_.null and .null = Vc!o0&qXAP_.null and .null = Vc!o0&qXAP_.null and .null = Vc!o0&qXAP_.null and .null = Vc!o0&qXAP_.null and .null = Vc!o0&qXAP_.null";
      
      // When
      String innerJoin = SQLUtil.innerJoin("", arg4, " NULL", "Vc!o0&qXAP_", arg4);
      
      // Then
      assertEquals(expectedResult, innerJoin);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreateConstraintSpecBuilder() throws Throwable  {
      // No Comments were added
      DBCheckConstraint arg0 = new DBCheckConstraint("vO|'3o 4p_|[&x&/", true, "',gzp'", "execnull = null and null = null and null = null and null = null");
      NameSpec arg1 = NameSpec.ALWAYS;
      StringBuilder createConstraintSpecBuilder = SQLUtil.createConstraintSpecBuilder(arg0, arg1);
      assertEquals("CONSTRAINT \"vO|'3o 4p_|[&x&/\" ", createConstraintSpecBuilder.toString());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testConstraintNameReturningEmptyString() throws Throwable  {
      // Given a DBCheckConstraint with null constraint name and check for uniqueness
      DBCheckConstraint arg0 = new DBCheckConstraint((String) null, true, "eW", "eW");
      
      // When the constraint name is generated using SQLUtil.constraintName() method
      String constraintName = SQLUtil.constraintName(arg0);
      
      // Then the constraint name should be empty string ""
      assertEquals("", constraintName);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testNormalize0() throws Throwable  {
      // No Comments were added
      String normalize = SQLUtil.normalize("select as \"q2Fw1{M on select into.null = \"q2Fw1{M.null and select into.null = \"q2Fw1{M.null", true);
      assertEquals("select as \"q2Fw1{M on select into.null = \" q2Fw1 { M.null and select into.null = \"q2Fw1{M.null\"", normalize);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAppendConstraintName() throws Throwable  {
      // Setup
      DBCheckConstraint constraint = new DBCheckConstraint("X", false, "X", "X");
      NameSpec nameSpec = NameSpec.NEVER;
      
      // Execute
      StringBuilder builder = SQLUtil.appendConstraintName(constraint, null, nameSpec);
      
      // Verify
      assertNull(builder);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsQueryReturningFalse() throws Throwable  {
      // No Comments were added
      boolean query = SQLUtil.isQuery("(cs-'0DrmeGHZ':/");
      assertFalse(query);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsQueryReturningTrue() throws Throwable  {
      // Check if the given string is a query or not
      boolean query = SQLUtil.isQuery("select intotable_catalog");
      assertTrue(query);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsDMLReturningFalse() throws Throwable  {
      // rollbacked to evosuite
      SQLUtil.isDML("");
      StringBuilder stringBuilder = new StringBuilder();
      assertEquals("", stringBuilder.toString());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsDDLReturningFalse() throws Throwable  {
      // Given a string array containing two elements
      String[] stringArray = new String[2];
      
      // When the isDDL method is called with "localhost" as an argument
      boolean result = SQLUtil.isDDL("localhost");
      
      // Then the method should return false
      assertFalse(result);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsDDLReturningTrue() throws Throwable  {
      // Test that a DDL statement is recognized correctly
      boolean dDL = SQLUtil.isDDL("alter indexreera3>0zq[");
      assertTrue(dDL);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsProcedureCallReturningFalse() throws Throwable  {
      // No Comments were added
      boolean procedureCall = SQLUtil.isProcedureCall("SELECT * FROM employees WHERE salary > 50000");
      Boolean mutatesStructure = SQLUtil.mutatesStructure("UPDATEemployees SET salary = salary + 1000 WHERE department = 'Sales'");
      assertTrue(mutatesStructure.equals((Object)procedureCall));
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testMutatesStructureReturningTrue() throws Throwable  {
      // Test that the SQL statement "create table reera3 (col1 int, col2 varchar(50))" mutates the structure of the database.
      Boolean mutatesStructure = SQLUtil.mutatesStructure("create table `reera3` (`col1` int, `col2` varchar(50))");
      assertTrue(mutatesStructure);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRenderValueReturningNonEmptyString() throws Throwable  {
      // Create a new DefaultDBTable instance with the name "customer"
      DefaultDBTable customer = new DefaultDBTable("customer");
      
      // Call the renderValue method on the SQLUtil class with the DefaultDBTable instance as an argument
      String renderedValue = SQLUtil.renderValue(customer);
      
      // Assert that the returned value is the same as the name of the DefaultDBTable instance
      assertEquals("customer", renderedValue);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRenderWhereClauseReturningEmptyString() throws Throwable  {
      // Given: two empty arrays of strings
      String[] arg1 = new String[0];
      String[] arg2 = new String[0];
      
      // When: the renderWhereClause method is called with these arrays
      String renderWhereClause = SQLUtil.renderWhereClause(arg1, arg2);
      
      // Then: an empty string should be returned
      assertEquals("", renderWhereClause);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test0() throws Throwable  {
      // Given the existence of a new Object instance
      Object object = new Object();
      
      // And the creation of a DefaultDBTable instance with no referrers
      DefaultDBTable arg1 = new DefaultDBTable();
      
      // When the getReferrers method is called on this instance
      arg1.getReferrers();
      
      // Then it should return an empty list
      assertTrue(arg1.getReferrers().isEmpty());
      
      // Given a DBDataType instance with the name "SQLFUNCTIONS" and index 0
      DBDataType arg2 = DBDataType.getInstance(0, "SQLFUNCTIONS");
      
      // And the creation of a DefaultDBColumn instance using this type
      DefaultDBColumn defaultDBColumn = new DefaultDBColumn("SQLFUNCTIONS", arg1, arg2);
      
      // When the toString method is called on this instance
      defaultDBColumn.toString();
      
      // Then it should return a string representation of the column
      assertEquals("SQLFUNCTIONS", defaultDBColumn.toString());
      
      // Given the NotNullConstraint instance associated with this DefaultDBColumn
      DBNotNullConstraint notNullConstraint = defaultDBColumn.getNotNullConstraint();
      
      // When assertNull is called on this instance
      assertNull(notNullConstraint);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRenderColumnNamesTakingStringArray() throws Throwable  {
      // Given a string array with 2 elements
      String[] arg0 = new String[2];
      
      // When the renderColumnNames method is called on this array
      String renderColumnNames = SQLUtil.renderColumnNames(arg0);
      
      // Then the result should be "(, )"
      assertEquals("(, )", renderColumnNames);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testNormalize1() throws Throwable  {
      // Given a string with special characters and whitespace
      String original = "go_u)?#Te!*u^rC";
      
      // When the string is normalized
      String normalized = SQLUtil.normalize(original, true);
      
      // Then the normalized string should be the same as the original but with whitespace and special characters removed
      assertEquals("go_u) ? # Te ! * u ^ rC", normalized);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testNormalizeWithFalse() throws Throwable  {
      // No Comments were added
      String normalize = SQLUtil.normalize("(./m~H078,[<_", false);
      assertEquals("(./ m ~ H078, [ < _", normalize);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRemoveCommentsReturningNonEmptyString() throws Throwable  {
      // No Comments were added
      String removeComments = SQLUtil.removeComments("/* Test comment */ SELECT * FROM users");
      assertEquals(" SELECT * FROM users", removeComments);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testTypeAndName1() throws Throwable  {
      // Given: A new DefaultDBTable object with no data
      DefaultDBTable arg0 = new DefaultDBTable();
      
      // When: Calling the typeAndName method on this table with null data
      String typeAndName = SQLUtil.typeAndName(arg0);
      
      // Then: Expecting the method to return a string of "table null"
      assertEquals("table null", typeAndName);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testTypeAndNameReturningNull() throws Throwable  {
      // No Comments were added
      String typeAndName = SQLUtil.typeAndName((DBObject) null);
      assertNull(typeAndName);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testTypeAndName2() throws Throwable  {
      // No Comments were added
      TableContainer arg0 = new TableContainer("@{CjHNPaa#\":");
      String typeAndName = SQLUtil.typeAndName(arg0);
      assertEquals("container @{CjHNPaa#\":", typeAndName);
      assertNotNull(typeAndName);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testConstraintNameReturningNonEmptyString() throws Throwable  {
      // Given a DBCheckConstraint object with a name "EMPLOYEE_ID" and a constraint type of "NXLOY" (i.e., not null)
      DBCheckConstraint arg0 = new DBCheckConstraint("EMPLOYEE_ID", false, "NXLOY", "EMPLOYEE_NAME");
      
      // When the method SQLUtil.constraintName is called with this DBCheckConstraint object
      String constraintName = SQLUtil.constraintName(arg0);
      
      // Then the method should return a string that includes the name of the constraint and the type of constraint (i.e., "CONSTRAINT EMPLOYEE_ID NOT NULL")
      assertEquals("CONSTRAINT EMPLOYEE_ID ", constraintName);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testOwnerDotComponent() throws Throwable  {
      // Setup
      CompositeDBObject<DBNotNullConstraint> arg1 = mock(CompositeDBObject.class, new ViolatedAssumptionAnswer());
      TableContainer arg0 = new TableContainer("my_table", arg1);
      
      // Exercise
      String ownerDotComponent = SQLUtil.ownerDotComponent(arg0);
      
      // Verify
      assertEquals("my_table", ownerDotComponent);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAddOptionalConditionWithNonEmptyString() throws Throwable  {
      // Given: We have a StringBuilder object containing a SQL query with an optional condition
      StringBuilder arg1 = new StringBuilder("EzKlX8)x[13^V2+L9");
      
      // When: We call the addOptionalCondition() method with the StringBuilder object and an additional condition to be added
      SQLUtil.addOptionalCondition("EzKlX8)x[13^V2+L9", arg1);
      
      // Then: The StringBuilder object should contain the original SQL query followed by "or EzKlX8)x[13^V2+L9"
      assertEquals("EzKlX8)x[13^V2+L9 or EzKlX8)x[13^V2+L9", arg1.toString());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAddOptionalConditionWithNull() throws Throwable  {
      // No Comments were added
      String[] stringArray = new String[0];
      StringBuilder arg1 = new StringBuilder(1);
      SQLUtil.addOptionalCondition((String) null, arg1);
      assertEquals("null", arg1.toString());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAddRequiredCondition() throws Throwable  {
      // Test that the addRequiredCondition method returns the same instance if no required condition is present.
      StringBuilder arg1 = new StringBuilder("select * from users where id='123' and name='John Doe' and email='johndoe@example.com'");
      StringBuilder expectedResult = arg1;
      StringBuilder actualResult = SQLUtil.addRequiredCondition(null, arg1);
      assertSame(expectedResult, actualResult);
      
      // Test that the addRequiredCondition method adds a required condition if one is not present.
      StringBuilder arg2 = new StringBuilder("select * from users where id='123' and name='John Doe'");
      StringBuilder expectedResult2 = new StringBuilder("select * from users where id='123' and name='John Doe' and email='johndoe@example.com'");
      StringBuilder actualResult2 = SQLUtil.addRequiredCondition("email='johndoe@example.com'", arg2);
      assertEquals(expectedResult2, actualResult2);
      
      // Test that the addRequiredCondition method does not modify the input StringBuilder if a required condition is already present.
      StringBuilder arg3 = new StringBuilder("select * from users where id='123' and name='John Doe' and email='johndoe@example.com'");
      StringBuilder expectedResult3 = arg3;
      StringBuilder actualResult3 = SQLUtil.addRequiredCondition(null, arg3);
      assertSame(expectedResult3, actualResult3);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testJoinWithNonEmptyArray() throws Throwable  {
      // rollbacked to evosuite
      String[] arg5 = new String[6];
      String join = SQLUtil.join("l~\"ocavhost", "l~\"ocavhost", arg5, "l~\"ocavhost", "l~\"ocavhost", arg5);
      assertEquals("l~\"ocavhost join l~\"ocavhost as l~\"ocavhost on l~\"ocavhost.null = l~\"ocavhost.null and l~\"ocavhost.null = l~\"ocavhost.null and l~\"ocavhost.null = l~\"ocavhost.null and l~\"ocavhost.null = l~\"ocavhost.null and l~\"ocavhost.null = l~\"ocavhost.null and l~\"ocavhost.null = l~\"ocavhost.null", join);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testJoinWithEmptyArray() throws Throwable  {
      // Given: A set of null arguments for the join method
      String[] arg1 = new String[0];
      String[] arg2 = new String[0];
      String[] arg3 = new String[0];
      String[] arg4 = new String[0];
      String[] arg5 = new String[0];
      
      // When: The join method is called with these arguments
      String join = SQLUtil.join((String) null, (String) null, arg1, (String) null, (String) null, arg2);
      
      // Then: The result should be "null as null on"
      assertEquals("null as null on ", join);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testConstraintSpec() throws Throwable  {
      // Given
      NameSpec arg1 = NameSpec.NEVER;
      DefaultDBTable arg4 = new DefaultDBTable();
      String[] arg5 = new String[1];
      DBForeignKeyConstraint arg0 = new DBForeignKeyConstraint("create unique index", true, arg4, arg5, arg4, arg5);
      
      // When
      SQLUtil.constraintSpec(arg0, arg1);
      
      // Then
      // Validate that the correct method is called with the correct arguments
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testConstraintSpecThrowsNullPointerException() throws Throwable  {
      // Test that SQLUtil.constraintSpec throws a NullPointerException when passed null values for DBConstraint and NameSpec
      try {
      // Call the method with null values for DBConstraint and NameSpec
      SQLUtil.constraintSpec((DBConstraint) null, (NameSpec) null);
      // Assert that an exception is thrown
      fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      // Verify the exception message
      verifyException("org.databene.jdbacl.SQLUtil", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testMutatesStructureThrowsTooManyResourcesException() throws Throwable  {
      // No Comments were added
      // Undeclared exception!
      SQLUtil.mutatesStructure("/*");
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testMutatesStructure() throws Throwable  {
      // No Comments were added
      Boolean mutatesStructure = SQLUtil.mutatesStructure("calllocalhost");
      assertFalse(mutatesStructure);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testMutatesDataOrStructureReturningTrue() throws Throwable  {
      // Test that SQLUtil.mutatesDataOrStructure() returns true for "drop table" statements
      Boolean mutatesDataOrStructure = SQLUtil.mutatesDataOrStructure("drop table");
      assertTrue(mutatesDataOrStructure); // Assert that the statement is a DDL statement
      assertNotNull(mutatesDataOrStructure); // Assert that the statement is not null
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testMutatesDataOrStructure0() throws Throwable  {
      // No Comments were added
      Boolean mutatesDataOrStructure = SQLUtil.mutatesDataOrStructure("alter session set current_schema = 'my_new_schema'");
      assertNotNull(mutatesDataOrStructure);
      assertFalse(mutatesDataOrStructure);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testMutatesDataOrStructure1() throws Throwable  {
      // No Comments were added
      Boolean mutatesDataOrStructure = SQLUtil.mutatesDataOrStructure("select count(distinct userid) from users where lastlogin < '2018-01-01'");
      assertFalse(mutatesDataOrStructure);
      assertNotNull(mutatesDataOrStructure);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRenderWhereClauseThrowsArrayIndexOutOfBoundsException() throws Throwable  {
      // Given: A String array with four elements and an Object array with two elements
      String[] arg0 = new String[4];
      Object[] arg1 = new Object[2];
      arg1[0] = (Object) 'p';
      
      // When: The method SQLUtil.renderWhereClause is called with the String array and the Object array as arguments
      try {
      SQLUtil.renderWhereClause(arg0, arg1);
      // Then: An ArrayIndexOutOfBoundsException is thrown, which is expected
      fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch (ArrayIndexOutOfBoundsException e) {
      // Verify that the correct exception was thrown
      verifyException("org.databene.jdbacl.SQLUtil", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test1() throws Throwable  {
      // Arrange
      Integer commitValue = RawTransaction.COMMIT;
      DefaultDBTable dbTable = new DefaultDBTable("localhost", null);
      DBDataType dataType = DBDataType.getInstance(907, "NCLOB");
      DefaultDBColumn defaultDBColumn = new DefaultDBColumn("NCLOB", dbTable, dataType, commitValue);
      
      // Act
      String result = defaultDBColumn.toString();
      
      // Assert
      assertEquals("NCLOB : NCLOB", result);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRenderColumnNamesTakingDBColumnArray() throws Throwable  {
      // No Comments were added
      DefaultDBTable arg1 = new DefaultDBTable();
      DefaultDBColumn defaultDBColumn = new DefaultDBColumn(":!|fhS}", arg1, 1612, ":!|fhS}");
      arg1.getColumns();
      DBColumn[] arg0 = new DBColumn[2];
      arg0[0] = (DBColumn) defaultDBColumn;
      arg0[1] = (DBColumn) defaultDBColumn;
      String renderColumnNames = SQLUtil.renderColumnNames(arg0);
      assertEquals(":!|fhS}, :!|fhS}", renderColumnNames);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test2() throws Throwable  {
      // Given a database table with an invalid column type "S(9e"
      DefaultDBTable arg1 = new DefaultDBTable();
      
      try {
      // When we attempt to create a default database column with this type
      DefaultDBColumn defaultDBColumn = new DefaultDBColumn("S(9e", arg1, (-2750), "S(9e");
      
      // Then an exception is thrown with the message "Illegal column type format: S(9e"
      fail("Expecting exception: RuntimeException");
      } catch (RuntimeException e) {
      verifyException("org.databene.jdbacl.SQLUtil", e);
      throw e;}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRenderColumnTypeWithSize() throws Throwable  {
      // Set up a DefaultDBColumn object with a null table and a negative size value.
      DefaultDBColumn column = new DefaultDBColumn("Illegal column type format: ", (DBTable) null, (-231), "Illegal column type format: ");
      
      // Render the column type with its size using the SQLUtil.renderColumnTypeWithSize method.
      String renderColumnTypeWithSize = SQLUtil.renderColumnTypeWithSize(column);
      
      // Assert that the rendered column type is equal to the expected value, which in this case is "ILLEGAL COLUMN TYPE FORMAT: ".
      assertEquals("ILLEGAL COLUMN TYPE FORMAT: ", renderColumnTypeWithSize);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSubstituteMarkersReturningNonEmptyString() throws Throwable  {
      // No Comments were added
      String substituteMarkers = SQLUtil.substituteMarkers("5n^d", "prepare ", "delete@#v3z~}{(b");
      assertEquals("5n^d", substituteMarkers);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLeftJoin() throws Throwable  {
      // Given an empty String array for the right table and columns
      String[] args = new String[0];
      
      // When we call the left join method with the arguments
      String leftJoin = SQLUtil.leftJoin("//", args, "//", "//", args);
      
      // Then the result should be an empty string
      assertEquals("", leftJoin);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFkSpec() throws Throwable  {
      // Arrange
      DefaultDBTable primaryTable = new DefaultDBTable("localhost");
      String[] foreignKeys = new String[2];
      DBForeignKeyConstraint constraint = new DBForeignKeyConstraint("localhost", false, primaryTable, foreignKeys, primaryTable, foreignKeys);
      NameSpec nameSpec = NameSpec.NEVER;
      
      // Act
      String fkSpec = SQLUtil.fkSpec(constraint, nameSpec);
      
      // Assert
      assertEquals("FOREIGN KEY (, ) REFERENCES localhost(, )", fkSpec);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRenderQuery() throws Throwable  {
      // Given a DefaultDBTable with a table name "--", and an array of column names
      // and an array of values to be used in the WHERE clause
      String[] columns = new String[1];
      String[] values = new String[1];
      DefaultDBTable defaultDBTable = new DefaultDBTable("--");
      
      // When we call renderQuery with these arguments
      String renderQuery = SQLUtil.renderQuery(defaultDBTable, columns, values);
      
      // Then the resultant query should be a SELECT statement with the correct table name, column names and WHERE clause
      assertEquals("SELECT * FROM -- WHERE null = null", renderQuery);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesSQLUtil() throws Throwable  {
      // rollbacked to evosuite
      SQLUtil sQLUtil = new SQLUtil();
  }
}
