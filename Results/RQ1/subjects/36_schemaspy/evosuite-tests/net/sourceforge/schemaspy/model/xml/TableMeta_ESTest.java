/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Thu Mar 21 00:22:53 GMT 2024
 */

package net.sourceforge.schemaspy.model.xml;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import javax.imageio.metadata.IIOMetadataNode;
import net.sourceforge.schemaspy.model.xml.TableColumnMeta;
import net.sourceforge.schemaspy.model.xml.TableMeta;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TableMeta_ESTest extends TableMeta_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetRemoteCatalogReturningNonEmptyString() throws Throwable  {
      // Given a TableMeta object with some metadata information
      IIOMetadataNode arg0 = new IIOMetadataNode("name");
      arg0.setAttribute("remoteCatalog", "[>jES2?WM{/]7"); // Set the remote catalog attribute to some value
      arg0.setAttribute("name", "name"); // Set the name attribute to some value
      TableMeta tableMeta = new TableMeta(arg0);
      
      // When we get the remote catalog from the table meta object
      String remoteCatalog = tableMeta.getRemoteCatalog();
      
      // Then we expect the remote catalog to match the value set in the metadata
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetNameReturningNonEmptyString() throws Throwable  {
      // Given a IIOMetadataNode representing a table with the name "name"
      IIOMetadataNode arg0 = new IIOMetadataNode("name");
      arg0.setAttribute("name", "name");
      TableMeta tableMeta = new TableMeta(arg0);
      
      // When the name of the table is retrieved
      String name = tableMeta.getName();
      
      // Then the expected name "name" should be returned
      assertEquals("name", name);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetNameReturningEmptyString() throws Throwable  {
      // Given a table meta with a name attribute set to an empty string
      IIOMetadataNode tableMetaNode = new IIOMetadataNode("table");
      tableMetaNode.setAttribute("name", "");
      TableMeta tableMeta = new TableMeta(tableMetaNode);
      
      // When the name is retrieved
      String actualName = tableMeta.getName();
      
      // Then it should be an empty string
      assertEquals("", actualName);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetCommentsReturningNonEmptyString() throws Throwable  {
      // Given a IIOMetadataNode with name and remarks attributes
      IIOMetadataNode node = new IIOMetadataNode("name");
      node.setAttribute("name", "value1");
      node.setAttributeNS("name", "remarks", "value2");
      
      // When the TableMeta class is created with this node as an argument
      TableMeta tableMeta = new TableMeta(node);
      
      // Then the getComments() method should return the value of the remarks attribute
      String comments = tableMeta.getComments();
      assertEquals("value2", comments);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetColumnsReturningListWhereIsEmptyIsTrueAndListWhereSizeIsZero() throws Throwable  {
      // Create an IIOMetadataNode object with the "name" attribute set to "name".
      IIOMetadataNode arg0 = new IIOMetadataNode("name");
      arg0.setAttribute("name", "name");
      
      // Create a TableMeta object from the IIOMetadataNode.
      TableMeta tableMeta = new TableMeta(arg0);
      
      // Get the list of columns in the TableMeta object.
      List<TableColumnMeta> columns = tableMeta.getColumns();
      
      // Assert that the list is empty.
      assertEquals(0, columns.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetRemoteCatalogReturningEmptyString() throws Throwable  {
      // Given a IIOMetadataNode with the name "name" and an empty string as its remote catalog attribute value
      IIOMetadataNode arg0 = new IIOMetadataNode("name");
      arg0.setAttribute("remoteCatalog", "");
      
      // When we create a TableMeta object with this IIOMetadataNode
      TableMeta tableMeta = new TableMeta(arg0);
      
      // Then the remote catalog attribute value of the TableMeta object should be an empty string
      String remoteCatalog = tableMeta.getRemoteCatalog();
      assertEquals("", remoteCatalog);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFailsToCreateTableMetaThrowsNullPointerException0() throws Throwable  {
      IIOMetadataNode arg0 = new IIOMetadataNode();
      arg0.setAttributeNS("name", "remoteSchema", "https://www.example.com/schema");
      arg0.setAttribute("name", "myTable");
      TableMeta tableMeta = null;
      try {
      // Try to construct a TableMeta object with a remote schema specified
      tableMeta = new TableMeta(arg0);
      fail("Expecting exception: NullPointerException");
      } catch (NullPointerException e) {
      // Verify that the exception is thrown as expected
      assertEquals(e.getMessage(), null);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFailsToCreateTableMetaThrowsNullPointerException1() throws Throwable  {
      IIOMetadataNode arg0 = new IIOMetadataNode();
      arg0.setAttribute("name", "");
      arg0.setAttributeNS("", "remarks", "");
      
      // Check that a null argument throws a NullPointerException
      TableMeta tableMeta = null;
      try {
      tableMeta = new TableMeta(arg0);
      fail("Expecting exception: NullPointerException");
      } catch (NullPointerException e) {
      assertEquals(null, e.getMessage());}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesTableMeta() throws Throwable  {
      // Given: We have a JUnit test that tests the functionality of the TableMeta class, specifically the getRemoteSchema() method.
      // When: We call the getRemoteSchema() method on an instance of the TableMeta class with valid arguments.
      IIOMetadataNode arg0 = new IIOMetadataNode("name");
      arg0.setAttribute("comments", "name");
      arg0.setAttribute("name", "name");
      TableMeta tableMeta = new TableMeta(arg0);
      String remoteSchema = tableMeta.getRemoteSchema();
      
      // Then: We expect the getRemoteSchema() method to return null, as there is no remote schema associated with this instance of the TableMeta class.
      assertNull(remoteSchema);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetRemoteSchema() throws Throwable  {
      IIOMetadataNode column = new IIOMetadataNode("column");
      // Set the name attribute to "name"
      column.setAttribute("name", "name");
      // Create a TableMeta object using the column metadata node
      TableMeta tableMeta = new TableMeta(column);
      // Get the remote schema of the table meta data
      String remoteSchema = tableMeta.getRemoteSchema();
      // Assert that the remote schema is null, indicating that no remote schema was set
      assertNull(remoteSchema);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetRemoteCatalogReturningNull() throws Throwable  {
      // Given a TableMeta object with name "name" and no remote catalog set
      IIOMetadataNode arg0 = new IIOMetadataNode("name");
      arg0.setAttribute("name", "name");
      TableMeta tableMeta = new TableMeta(arg0);
      
      // When the getRemoteCatalog method is called on the TableMeta object
      String remoteCatalog = tableMeta.getRemoteCatalog();
      
      // Then the returned value should be null
      assertNull(remoteCatalog);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetColumnsReturningListWhereIsEmptyIsFalse() throws Throwable  {
      // Given: A table with a column named "name"
      IIOMetadataNode column = new IIOMetadataNode("column");
      column.setAttribute("name", "name");
      
      // When: We retrieve the columns of the table
      TableMeta tableMeta = new TableMeta(column);
      List<TableColumnMeta> columns = tableMeta.getColumns();
      
      // Then: The list of columns should not be empty
      assertFalse(columns.isEmpty());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetNameReturningNull() throws Throwable  {
      // Given
      IIOMetadataNode node = new IIOMetadataNode("name");
      node.setAttribute("name", (String) null);
      TableMeta tableMeta = new TableMeta(node);
      
      // When
      String name = tableMeta.getName();
      
      // Then
      assertNull(name);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetCommentsReturningNull() throws Throwable  {
      // Given a IIOMetadataNode with no attributes
      IIOMetadataNode arg0 = new IIOMetadataNode("name");
      
      // When the TableMeta constructor is called with this node
      TableMeta tableMeta = new TableMeta(arg0);
      
      // Then the getComments method should return null
      String comments = tableMeta.getComments();
      assertNull(comments);
  }
}