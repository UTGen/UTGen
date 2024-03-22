/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Wed Mar 20 22:47:11 GMT 2024
 */

package geo.google.datamodel;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import geo.google.datamodel.GeoStatusCode;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class GeoStatusCode_ESTest extends GeoStatusCode_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testValuesReturningNonEmptyArray() throws Throwable  {
      // No Comments were added
      GeoStatusCode[] values = GeoStatusCode.values();
      assertEquals(10, values.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testValueOfReturningGeoStatusCodeWhereGetCodeIsPositive() throws Throwable  {
      // Create a GeoStatusCode object with the status code "G_GEO_SUCCESS"
      GeoStatusCode geoStatusCode = GeoStatusCode.valueOf("G_GEO_SUCCESS");
      
      // Assert that the value returned by the "valueOf" method is equal to the expected value
      assertEquals(GeoStatusCode.G_GEO_SUCCESS, geoStatusCode);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testValueOfReturningGeoStatusCodeWhereGetCodeIsNegative() throws Throwable  {
      // Test the GeoStatusCode.valueOf() method with a valid status code
      GeoStatusCode valueOf = GeoStatusCode.valueOf("G_GEO_UNKOWN_STATUS");
      assertEquals((-1), valueOf.getCode());
      // Test the GeoStatusCode.valueOf() method with an invalid status code
      GeoStatusCode valueOf2 = GeoStatusCode.valueOf("G_GEO_INVALID_STATUS");
      assertNull(valueOf2);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetCodeReturningNegative() throws Throwable  {
      // Arrange
      GeoStatusCode statusCode = GeoStatusCode.getStatusCode(100);
      
      // Act
      int code = statusCode.getCode();
      
      // Assert
      assertEquals(100, code);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetStatusCodeReturningGeoStatusCodeWhereGetCodeIsPositive() throws Throwable  {
      // Test that the correct GeoStatusCode is returned for a given input value
      GeoStatusCode statusCode = GeoStatusCode.getStatusCode(620);
      assertEquals(GeoStatusCode.G_GEO_TOO_MANY_QUERIES, statusCode);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetStatusCodeWithPositive() throws Throwable  {
      // Get the GeoStatusCode for a specific key value
      GeoStatusCode statusCode = GeoStatusCode.getStatusCode(610);
      
      // Assert that the returned status code matches our expected value
      assertEquals(GeoStatusCode.G_GEO_BAD_KEY, statusCode);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetStatusCode0() throws Throwable  {
      // rollbacked to evosuite
      GeoStatusCode statusCode = GeoStatusCode.getStatusCode(604);
      assertEquals(GeoStatusCode.G_GEO_UNKNOWN_DIRECTIONS, statusCode);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetStatusCode1() throws Throwable  {
      // No Comments were added
      GeoStatusCode statusCode = GeoStatusCode.getStatusCode(603);
      assertEquals(GeoStatusCode.G_GEO_UNAVAILABLE_ADDRESS, statusCode);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetStatusCode2() throws Throwable  {
      // Given: A GeoStatusCode object with a value of 602
      GeoStatusCode statusCode = GeoStatusCode.getStatusCode(602);
      
      // When: We call the getStatusCode method on the object with the value 602
      statusCode = GeoStatusCode.getStatusCode(602);
      
      // Then: The returned status code should be G_GEO_UNKNOWN_ADDRESS
      assertEquals(GeoStatusCode.G_GEO_UNKNOWN_ADDRESS, statusCode);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetStatusCode3() throws Throwable  {
      // No Comments were added
      GeoStatusCode statusCode = GeoStatusCode.getStatusCode(601);
      assertEquals(GeoStatusCode.G_GEO_MISSING_QUERY, statusCode);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetStatusCode4() throws Throwable  {
      // Test that the correct GeoStatusCode is returned for a given HTTP status code
      GeoStatusCode statusCode = GeoStatusCode.getStatusCode(500);
      assertEquals(GeoStatusCode.G_GEO_SERVER_ERROR, statusCode);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetStatusCode5() throws Throwable  {
      // Given: A GeoStatusCode object with the value 400
      GeoStatusCode statusCode = GeoStatusCode.getStatusCode(400);
      
      // When: The value is compared to a known GeoStatusCode
      assertEquals(GeoStatusCode.G_GEO_BAD_REQUEST, statusCode);
      
      // Then: The values should be equal
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetStatusCode6() throws Throwable  {
      // No Comments were added
      GeoStatusCode statusCode = GeoStatusCode.getStatusCode(200);
      assertEquals(GeoStatusCode.G_GEO_SUCCESS, statusCode);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetCodeReturningPositive() throws Throwable  {
      // Given: A GeoStatusCode object is created with a G_GEO_SUCCESS value
      GeoStatusCode geoStatusCode = GeoStatusCode.G_GEO_SUCCESS;
      
      // When: The code property of the GeoStatusCode object is accessed
      int code = geoStatusCode.getCode();
      
      // Then: The expected value (200) should be returned
      assertEquals(200, code);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetCodeName() throws Throwable  {
      // Given a GeoStatusCode with the value G_GEO_UNKNOWN_DIRECTIONS
      GeoStatusCode geoStatusCode = GeoStatusCode.G_GEO_UNKNOWN_DIRECTIONS;
      
      // When we call getCodeName on this status code
      String codeName = geoStatusCode.getCodeName();
      
      // Then we expect the code name to be "G_GEO_UNKNOWN_DIRECTIONS"
      assertEquals("G_GEO_UNKNOWN_DIRECTIONS", codeName);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetDescription() throws Throwable  {
      // Given a GeoStatusCode with an unknown direction
      GeoStatusCode geoStatusCode = GeoStatusCode.G_GEO_UNKNOWN_DIRECTIONS;
      
      // When we call getDescription on the GeoStatusCode
      String description = geoStatusCode.getDescription();
      
      // Then the method should return a description of the status code
      assertEquals("The GDirections object could not compute directions between the points mentioned in the query. This is usually because there is no route available between the two points, or because we do not have data for routing in that region. (Since 2.81)", description);
  }
}