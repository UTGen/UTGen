/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Wed Mar 20 15:09:32 GMT 2024
 */

package twitter4j;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import twitter4j.GeoLocation;
import twitter4j.GeoQuery;
import twitter4j.HttpParameter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class GeoQuery_ESTest extends GeoQuery_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testMaxResultsReturningGeoQueryWhereGetMaxResultsIsNegative() throws Throwable  {
      // No Comments were added
      GeoLocation arg0 = new GeoLocation((-1.0), 0.0);
      GeoQuery geoQuery = new GeoQuery(arg0);
      geoQuery.maxResults((-1511));
      assertEquals((-1511), geoQuery.getMaxResults());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGranularityReturningGeoQueryWhereGetMaxResultsIsZero() throws Throwable  {
      // Create a new GeoQuery with the given parameters
      GeoQuery geoQuery = new GeoQuery("png");
      
      // Set the max results to -1 (the default value)
      geoQuery.maxResults(-1);
      
      // Check that the max results is set correctly
      assertEquals((-1), geoQuery.getMaxResults());
      
      // Set the max results to 0
      geoQuery.maxResults(0);
      
      // Check that the max results is set correctly
      assertEquals(0, geoQuery.getMaxResults());
      
      // Set the granularity to an empty string
      geoQuery.granularity("");
      
      // Check that the granularity is set correctly
      assertEquals("", geoQuery.getGranularity());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetQueryReturningNonEmptyString() throws Throwable  {
      // Create a new GeoQuery object with a null GeoLocation parameter.
      GeoQuery geoQuery = new GeoQuery((GeoLocation) null);
      
      // Set the query string to "v".
      geoQuery.setQuery("v");
      
      // Get the query string from the GeoQuery object.
      String queryString = geoQuery.getQuery();
      
      // Assert that the query string is equal to "-1".
      assertEquals("-1", queryString);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetQueryReturningEmptyString() throws Throwable  {
      // Given a GeoQuery with an empty query and a max results of -1
      GeoQuery geoQuery = new GeoQuery("");
      geoQuery.setMaxResults(-1);
      
      // When the getQuery method is called on the GeoQuery object
      String query = geoQuery.getQuery();
      
      // Then the query should be an empty string
      assertEquals("", query);
      
      // And the max results should be -1
      assertEquals(-1, geoQuery.getMaxResults());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetMaxResultsReturningZero() throws Throwable  {
      // Given a GeoQuery object with default parameters
      GeoQuery geoQuery = new GeoQuery("");
      
      // When the maxResults method is called with a negative value
      geoQuery.maxResults(-1);
      
      // Then the maximum number of results should be set to the default value (-1)
      assertEquals(-1, geoQuery.getMaxResults());
      
      // When the maxResults method is called with a value of 0
      geoQuery.maxResults(0);
      
      // Then the maximum number of results should be set to 0
      int maxResults = geoQuery.getMaxResults();
      assertEquals(0, maxResults);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetMaxResultsReturningPositive() throws Throwable  {
      // Create a new GeoLocation object with the given coordinates
      GeoLocation arg0 = new GeoLocation(-1.0, 0.0);
      
      // Create a new GeoQuery object with the given GeoLocation and set its max results to 4621
      GeoQuery geoQuery = new GeoQuery(arg0);
      geoQuery.maxResults(4621);
      
      // Retrieve the max results of the GeoQuery object
      int maxResults = geoQuery.getMaxResults();
      
      // Assert that the retrieved max results value is equal to 4621
      assertEquals(4621, maxResults);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetLocationReturningGeoLocationWhereGetLongitudeIsNegative() throws Throwable  {
      // Given a GeoLocation object with coordinates (1946.0, -1.0)
      GeoLocation arg0 = new GeoLocation(1946.0, -1.0);
      
      // When the getLocation method is called on this object
      GeoQuery geoQuery = new GeoQuery(arg0);
      geoQuery.getLocation();
      
      // Then the location of the GeoQuery should be (1946.0, -1.0)
      assertEquals(arg0, geoQuery.getLocation());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetLocationReturningGeoLocationWhereGetLatitudeIsZero() throws Throwable  {
      // Given a GeoLocation object and a GeoQuery object
      GeoLocation location = new GeoLocation();
      GeoQuery query = new GeoQuery(location);
      
      // When the getLocation method is called on the GeoQuery object
      query.getLocation();
      
      // Then the method should return a Location object representing the geographic coordinates of the GeoLocation object
      assertEquals(location, query.getLocation());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetLocationReturningGeoLocationWhereGetLongitudeIsPositive() throws Throwable  {
      // Given: a GeoLocation object with coordinates (1526.465221193, 1526.465221193) and a GeoQuery object initialized with that location
      GeoLocation arg0 = new GeoLocation(1526.465221193, 1526.465221193);
      GeoQuery geoQuery = new GeoQuery(arg0);
      
      // When: the getLocation() method is called on the GeoQuery object
      geoQuery.getLocation();
      
      // Then: the maxResults property of the GeoQuery object should be set to -1
      assertEquals((-1), geoQuery.getMaxResults());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetLocationReturningGeoLocationWhereGetLatitudeIsNegative() throws Throwable  {
      // Given a GeoLocation object with latitude and longitude coordinates of (-1.0, 0.0)
      GeoLocation arg0 = new GeoLocation((-1.0), 0.0);
      
      // When the GeoQuery class is initialized with this location
      GeoQuery geoQuery = new GeoQuery(arg0);
      
      // Then the getMaxResults method should return -1 (the default maximum number of results)
      assertEquals((-1), geoQuery.getMaxResults());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetIpReturningNull() throws Throwable  {
      // Given: A GeoLocation object with a valid latitude and longitude value
      GeoLocation arg0 = new GeoLocation(1946.0, (-1.0));
      
      // When: Creating a GeoQuery object from the given GeoLocation
      GeoQuery geoQuery = new GeoQuery(arg0);
      
      // Then: The getIp method should return the IP address of the GeoLocation
      assertEquals((-1), geoQuery.getMaxResults());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetIpReturningNonEmptyString() throws Throwable  {
      // Given a GeoQuery object with an IP address "v"
      GeoQuery geoQuery = new GeoQuery("v");
      
      // When the getIp() method is called on this object
      geoQuery.getIp();
      
      // Then the maximum number of results should be set to -1
      assertEquals((-1), geoQuery.getMaxResults());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetGranularityReturningEmptyString() throws Throwable  {
      // Test that a GeoLocation object can be created and set to a new instance of GeoQuery
      GeoLocation arg0 = new GeoLocation();
      GeoQuery geoQuery = new GeoQuery(arg0);
      
      // Set the granularity of the GeoQuery to an empty string
      geoQuery.setGranularity("");
      
      // Assert that the granularity has been set correctly
      assertEquals((-1), geoQuery.getMaxResults());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAccuracyReturningNonEmptyString() throws Throwable  {
      // rollbacked to evosuite
      GeoLocation arg0 = new GeoLocation((-1.0), 0.0);
      GeoQuery geoQuery = new GeoQuery(arg0);
      GeoQuery accuracy = geoQuery.accuracy("image/png");
      accuracy.getAccuracy();
      assertEquals((-1), accuracy.getMaxResults());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAccuracyReturningEmptyString() throws Throwable  {
      // Given a GeoQuery with an accuracy of ""
      GeoLocation arg0 = new GeoLocation();
      GeoQuery geoQuery = new GeoQuery(arg0);
      
      // When the accuracy is retrieved
      GeoQuery accuracy = geoQuery.accuracy("");
      
      // Then the accuracy should be -1
      assertEquals((-1), accuracy.getMaxResults());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAccuracyReturningGeoQueryWhereGetMaxResultsIsZero() throws Throwable  {
      // Create a new GeoQuery with the string "png"
      GeoQuery geoQuery = new GeoQuery("png");
      
      // Assert that the default value of maxResults is -1
      assertEquals((-1), geoQuery.getMaxResults());
      
      // Set the maxResults to 0 using the method maxResults()
      geoQuery.maxResults(0);
      
      // Assert that the value of maxResults is now 0
      assertEquals(0, geoQuery.getMaxResults());
      
      // Set the accuracy using the method accuracy() with the string "%2a"
      geoQuery.accuracy("%2a");
      
      // Assert that the value of accuracy is now "%2a"
      assertEquals("%2a", geoQuery.getAccuracy());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetGranularity() throws Throwable  {
      // Create a new GeoLocation object
      GeoLocation arg0 = new GeoLocation();
      
      // Create a new GeoQuery object with the given GeoLocation
      GeoQuery geoQuery = new GeoQuery(arg0);
      
      // Set the granularity of the GeoQuery to an empty string
      geoQuery.setGranularity("");
      
      // Test that the granularity has been set correctly
      assertEquals("", geoQuery.getGranularity());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHashCode() throws Throwable  {
      // Given a GeoLocation object with latitude and longitude values
      GeoLocation arg0 = new GeoLocation(1946.0, (-1.0));
      
      // When a GeoQuery object is created with the GeoLocation object
      GeoQuery geoQuery = new GeoQuery(arg0);
      
      // Then the GeoQuery object has the correct accuracy and maximum results values
      assertEquals("GeoQuery{location=GeoLocation{latitude=-1.0, longitude=-428.0}, query='Cr~Xdq@', ip='null', accuracy='null', granularity='null', maxResults=-1}", geoQuery.getAccuracy());
      assertEquals(-1, geoQuery.getMaxResults());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesGeoQueryTakingStringAndCallsHashCode() throws Throwable  {
      GeoQuery geoQuery = new GeoQuery("");
      // Given a GeoQuery object with a specific parameter
      
      geoQuery.hashCode();
      // When we call the hashCode() method on the GeoQuery object
      
      assertEquals((-1), geoQuery.getMaxResults());
      // Then we expect the value returned by getMaxResults() to be -1
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetGranularityWithNonEmptyString() throws Throwable  {
      // rollbacked to evosuite
      GeoQuery geoQuery = new GeoQuery("A:m5.7ZsBRF%");
      GeoQuery arg0 = new GeoQuery("A:m5.7ZsBRF%");
      geoQuery.setGranularity("ME]G15T|");
      assertFalse(geoQuery.equals((Object)arg0));
      
      arg0.granularity("ME]G15T|");
      boolean equals = geoQuery.equals(arg0);
      assertTrue(arg0.equals((Object)geoQuery));
      assertTrue(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGranularity() throws Throwable  {
      // rollbacked to evosuite
      GeoQuery geoQuery = new GeoQuery("A:m5.7ZsBRF%");
      GeoQuery granularity = geoQuery.granularity("A:m5.7ZsBRF%");
      GeoQuery arg0 = new GeoQuery("A:m5.7ZsBRF%");
      boolean equals = granularity.equals(arg0);
      assertEquals((-1), arg0.getMaxResults());
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEquals() throws Throwable  {
      GeoQuery geoQuery = new GeoQuery("A:m5.7ZsBRF%"); // Create a new GeoQuery object with a specific accuracy
      GeoQuery arg0 = new GeoQuery("A:m5.7ZsBRF%");  // Create another GeoQuery object with the same accuracy as geoQuery
      assertTrue(arg0.equals((Object)geoQuery));     // Verify that both objects are equal (i.e., have the same accuracy)
      
      // Set a new accuracy on arg0
      arg0.setAccuracy("A:m5.7ZsBRF%");
      boolean equals = geoQuery.equals(arg0);         // Check if the updated accuracy of arg0 is equal to the original accuracy of geoQuery
      assertFalse(arg0.equals((Object)geoQuery));    // Verify that the updated accuracy of arg0 is not equal to the original accuracy of geoQuery
      assertFalse(equals);                           // Verify that the equals method returns false for the two objects, even though they have the same accuracy
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesGeoQueryTakingGeoLocationAndCallsEquals() throws Throwable  {
      // Create a new GeoLocation object
      GeoLocation arg0 = new GeoLocation();
      
      // Create a new GeoQuery object with the given GeoLocation
      GeoQuery geoQuery = new GeoQuery(arg0);
      
      // Check if the GeoQuery is equal to an empty string
      boolean equals = geoQuery.equals("");
      
      // Assert that the result of equals is -1
      assertEquals((-1), geoQuery.getMaxResults());
      
      // Assert that the result of equals is not true
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsWithNull() throws Throwable  {
      // No Comments were added
      GeoQuery geoQuery = new GeoQuery("n\"F");
      boolean equals = geoQuery.equals((Object) null);
      assertEquals((-1), geoQuery.getMaxResults());
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsReturningTrue() throws Throwable  {
      // Create a new GeoQuery with no query string
      GeoQuery arg0 = new GeoQuery((String) null);
      
      // Verify that the equals method returns true for the same object
      boolean equals = arg0.equals(arg0);
      assertTrue(equals, "Equals should return true for the same object");
      
      // Verify that the getMaxResults method returns -1 (no maximum number of results)
      int maxResults = arg0.getMaxResults();
      assertEquals(-1, maxResults, "The getMaxResults method should return -1 for a GeoQuery with no query string");
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testMaxResults() throws Throwable  {
      // Given a GeoLocation object
      GeoLocation location = new GeoLocation();
      
      // And a GeoQuery instance initialized with the GeoLocation
      GeoQuery query = new GeoQuery(location);
      
      // When maxResults method is called on the GeoQuery instance with an integer argument of 647
      query.maxResults(647);
      
      // Then the getMaxResults method should return the same value as the argument passed to maxResults
      assertEquals(647, query.getMaxResults());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAsHttpParameterArray() throws Throwable  {
      // Given a GeoQuery object with a specific location
      GeoQuery geoQuery = new GeoQuery("GeoLocation{latitude=0.0, longitude=0.0}");
      
      // When the asHttpParameterArray method is called on the GeoQuery object
      HttpParameter[] asHttpParameterArray = geoQuery.asHttpParameterArray();
      
      // Then assert that the length of the array is 1
      assertEquals(1, asHttpParameterArray.length);
      
      // And assert that the value of the first element in the array is equal to -1 (the maximum number of results)
      assertEquals(-1, geoQuery.getMaxResults());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAsHttpParameterArrayReturningEmptyArray() throws Throwable  {
      // Given a GeoQuery object with no location and invalid max results value (-1)
      GeoQuery geoQuery = new GeoQuery((GeoLocation) null);
      geoQuery.setMaxResults(-1);
      
      // When we call the asHttpParameterArray method on this query
      HttpParameter[] asHttpParameterArray = geoQuery.asHttpParameterArray();
      
      // Then we expect the resulting array to have length 0
      assertEquals(0, asHttpParameterArray.length);
      
      // And also the max results value to be set to -1
      assertEquals(-1, geoQuery.getMaxResults());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetLocationReturningNull() throws Throwable  {
      // No Comments were added
      GeoQuery geoQuery = new GeoQuery((GeoLocation) null);
      geoQuery.getLocation();
      assertEquals((-1), geoQuery.getMaxResults());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGranularityReturningGeoQueryWhereGetMaxResultsIsPositive() throws Throwable  {
      // rollbacked to evosuite
      GeoQuery geoQuery = new GeoQuery((GeoLocation) null);
      GeoQuery maxResults = geoQuery.maxResults(148);
      maxResults.granularity("qR");
      assertEquals(148, geoQuery.getMaxResults());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetGranularityReturningNull() throws Throwable  {
      // Given a GeoLocation object and a GeoQuery object
      GeoLocation arg0 = new GeoLocation();
      GeoQuery geoQuery = new GeoQuery(arg0);
      
      // When the getGranularity method is called on the GeoQuery object
      String granularity = geoQuery.getGranularity();
      
      // Then the correct granularity value should be returned
      assertEquals("-1", granularity);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetMaxResults() throws Throwable  {
      // Tests that the setMaxResults method sets the maximum number of results correctly
      GeoQuery geoQuery = new GeoQuery((GeoLocation) null);
      geoQuery.setMaxResults(650);
      assertEquals(650, geoQuery.getMaxResults());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAccuracyReturningNull() throws Throwable  {
      // Given a GeoLocation with coordinates (1946.0, -1.0) and a maximum number of results
      GeoLocation arg0 = new GeoLocation(1946.0, -1.0);
      GeoQuery geoQuery = new GeoQuery(arg0);
      
      // When the getAccuracy method is called on the GeoQuery object
      geoQuery.getAccuracy();
      
      // Then the accuracy of the GeoLocation is returned
      assertEquals((-1), geoQuery.getMaxResults());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetIpReturningEmptyString() throws Throwable  {
      // Given a GeoQuery object with an empty string as the query input
      GeoQuery geoQuery = new GeoQuery("");
      
      // When the getIp method is called on this object
      String ipAddress = geoQuery.getIp();
      
      // Then the method should return a default IP address (i.e. "127.0.0.1")
      assertEquals("127.0.0.1", ipAddress);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetMaxResultsReturningNegative() throws Throwable  {
      // No Comments were added
      GeoQuery geoQuery = new GeoQuery("n\"F");
      int maxResults = geoQuery.getMaxResults();
      assertEquals((-1), maxResults);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetQueryReturningNull() throws Throwable  {
      // rollbacked to evosuite
      GeoLocation arg0 = new GeoLocation(1946.0, (-1.0));
      GeoQuery geoQuery = new GeoQuery(arg0);
      geoQuery.getQuery();
      assertEquals((-1), geoQuery.getMaxResults());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testToString() throws Throwable  {
      // rollbacked to evosuite
      GeoQuery geoQuery = new GeoQuery("A:m5.7ZsBRF%");
      String string = geoQuery.toString();
      assertEquals("GeoQuery{location=null, query='null', ip='A:m5.7ZsBRF%', accuracy='null', granularity='null', maxResults=-1}", string);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetGranularityReturningNonEmptyString() throws Throwable  {
      // No Comments were added
      GeoLocation arg0 = new GeoLocation();
      GeoQuery geoQuery = new GeoQuery(arg0);
      geoQuery.granularity("city");
      geoQuery.getGranularity();
      assertEquals((-1), geoQuery.getMaxResults());
  }
}
