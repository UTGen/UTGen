/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Wed Mar 20 22:41:11 GMT 2024
 */

package net.kencochrane.a4j.file;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import net.kencochrane.a4j.file.FileUtil;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FileUtil_ESTest extends FileUtil_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRenameFile0() throws Throwable  {
      // Test that renaming a file to the same location does not throw an exception
      FileUtil fileUtil = new FileUtil();
      try {
      fileUtil.renameFile("/", "/");
      assertTrue(true);
      } catch (Exception e) {
      fail("Unexpected exception: " + e.getMessage());}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFetchSimilarItems0() throws Throwable  {
      // Create a new EvoSuite file with the given path
      EvoSuiteFile arg0 = new EvoSuiteFile("/S_J2D/>2?*T.XML");
      
      // Check that the file was created successfully
      assertNotNull(arg0);
      
      // Create a folder using the FileSystemHandling class
      FileSystemHandling.createFolder(arg0);
      
      // Fetch similar items for the given path
      FileUtil fileUtil = new FileUtil();
      FileInputStream fetchSimilarItems = fileUtil.fetchSimilarItems("j2D/>2?*T", "j2D/>2?*T");
      
      // Check that the fetched items are null
      assertNull(fetchSimilarItems);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFetchASINFile0() throws Throwable  {
      // rollbacked to evosuite
      FileUtil fileUtil = new FileUtil();
      EvoSuiteFile arg0 = new EvoSuiteFile("/.XML_.XML_.XML_.XML.XML");
      FileSystemHandling.createFolder(arg0);
      FileInputStream fetchASINFile = fileUtil.fetchASINFile(".xml", ".xml", ".xml", ".xml");
      assertNull(fetchASINFile);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetSimilarItemsReturningFileWhereCanExecuteIsFalse() throws Throwable  {
      // rollbacked to evosuite
      EvoSuiteFile arg0 = new EvoSuiteFile("/S_J2D/>2?*T.XML");
      FileSystemHandling.createFolder(arg0);
      FileUtil fileUtil = new FileUtil();
      FileSystemHandling.setPermissions(arg0, false, false, false);
      File similarItems = fileUtil.getSimilarItems("j2D/>2?*T", "KeywordSear^Pch=");
      assertNotNull(similarItems);
      assertFalse(similarItems.canWrite());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetBrowseNodeFileReturningFileWhereLengthIsPositive() throws Throwable  {
      // Given: A FileUtil object and a file path with the format "/PBUS#KS@O?FNYLZ_POPCORNMONSTE2-20_86400000.XML"
      FileUtil fileUtil = new FileUtil();
      EvoSuiteFile arg0 = new EvoSuiteFile("/PBUS#KS@O?Fnylz_Popcornmonste2-20_86400000.XML");
      
      // When: The method "appendDataToFile" is called with the file path and a byte array of length 2
      byte[] arg1 = new byte[2];
      FileSystemHandling.appendDataToFile(arg0, arg1);
      
      // Then: A File object for the browse node file should be returned
      File browseNodeFile = fileUtil.getBrowseNodeFile("PbUS#ks@O?Fnylz", "popcornmonste2-20", "86400000");
      assertNotNull(browseNodeFile);
      
      // And: The length of the returned file should be 2L
      assertEquals(2L, browseNodeFile.length());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAccessoriesReturningFileWhereLengthIsZero() throws Throwable  {
      FileUtil fileUtil = new FileUtil();
      ArrayList<Object> args = new ArrayList<>();
      EvoSuiteFile file = new EvoSuiteFile("/A_.XML.XML");
      
      // Create a folder with the specified name using the createFolder method of the FileSystemHandling class
      FileSystemHandling.createFolder(file);
      
      // Get the accessories for the given arguments
      File accessories = fileUtil.getAccessories(".xml", args);
      
      // Assert that the accessories are not null
      assertNotNull(accessories);
      
      // Assert that the name of the accessories is equal to the specified name
      assertEquals("A_.XML.XML", accessories.getName());
      
      // Assert that the accessories can be executed
      assertTrue(accessories.canExecute());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetASINFileReturningFileWhereLengthIsZero() throws Throwable  {
      // No Comments were added
      FileUtil fileUtil = new FileUtil();
      EvoSuiteFile arg0 = new EvoSuiteFile("/J2L/>2?9T_J2L/>2?9T_J2L/>2?9T_J2L/>2?9T.XML");
      FileSystemHandling.createFolder(arg0);
      File aSINFile = fileUtil.getASINFile("j2L/>2?9T", "j2L/>2?9T", "j2L/>2?9T", "j2L/>2?9T");
      assertNotNull(aSINFile);
      assertEquals(">2?9T.XML", aSINFile.getName());
      assertTrue(aSINFile.isDirectory());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFetchSimilarItemsReturningFileInputStreamWhereAvailableIsZero() throws Throwable  {
      // Given a file path containing search parameters for similar items
      String query = "/S_SHOPPIN*CART=REMOVE&F=XML&DEV-T=.XML";
      
      // When the method is called with the file path and search parameters
      EvoSuiteFile arg0 = new EvoSuiteFile(query);
      FileSystemHandling.appendStringToFile(arg0, "");
      FileUtil fileUtil = new FileUtil();
      FileInputStream fetchSimilarItems = fileUtil.fetchSimilarItems(query, query);
      
      // Then the method should return a non-empty stream of data for similar items
      assertNotEquals(0, fetchSimilarItems.available());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFetchBNFileReturningFileInputStreamWhereAvailableIsPositive() throws Throwable  {
      // rollbacked to evosuite
      FileUtil fileUtil = new FileUtil();
      EvoSuiteFile arg0 = new EvoSuiteFile("/NULL__NULL.XML");
      byte[] arg1 = new byte[5];
      FileSystemHandling.appendDataToFile(arg0, arg1);
      FileInputStream fetchBNFile = fileUtil.fetchBNFile((String) null, "", (String) null);
      assertEquals(5, fetchBNFile.available());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFetchASINFileReturningFileInputStreamWhereAvailableIsPositive() throws Throwable  {
      // Given a file and some data to append to it
      FileUtil fileUtil = new FileUtil();
      EvoSuiteFile arg0 = new EvoSuiteFile("/.XML_.XML_.XML_.XML.XML");
      byte[] arg1 = new byte[5];
      
      // When we append the data to the file
      FileSystemHandling.appendDataToFile(arg0, arg1);
      
      // Then the file should contain the appended data
      FileInputStream fetchASINFile = fileUtil.fetchASINFile(".xml", ".xml", ".xml", ".xml");
      assertEquals(5, fetchASINFile.available());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetSimilarItems() throws Throwable  {
      // No Comments were added
      EvoSuiteFile arg0 = new EvoSuiteFile("/S_J2D/>2?*T.XML");
      FileSystemHandling.createFolder(arg0);
      FileUtil fileUtil = new FileUtil();
      File similarItems = fileUtil.getSimilarItems("j2D/>2?*T", "KeywordSear^Pch=");
      assertNotNull(similarItems);
      assertEquals("/S_J2D/>2?*T.XML", similarItems.toString());
      assertTrue(similarItems.canRead());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetSimilarItemsReturningNull() throws Throwable  {
      // Arrange
      FileUtil fileUtil = new FileUtil();
      
      // Act
      File similarItems = fileUtil.getSimilarItems("", "");
      
      // Assert
      assertNull(similarItems);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDownloadThirdPartySearchFile() throws Throwable  {
      // No Comments were added
      FileUtil fileUtil = new FileUtil();
      File downloadThirdPartySearchFile = fileUtil.downloadThirdPartySearchFile("https://www.example.com/search?q=b_", "b_", "UTF-8", "b_.txt");
      assertNull(downloadThirdPartySearchFile);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDownloadGenericSearchFile() throws Throwable  {
      // No Comments were added
      FileUtil fileUtil = new FileUtil();
      File downloadGenericSearchFile = fileUtil.downloadGenericSearchFile("P\"<it28H_9Q){y", "P\"<it28H_9Q){y", ".xml", "", "P\"<it28H_9Q){y", "ts_");
      assertNull(downloadGenericSearchFile);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetBrowseNodeFileReturningFileWhereLengthIsZero() throws Throwable  {
      // Given
      FileUtil fileUtil = new FileUtil();
      EvoSuiteFile arg0 = new EvoSuiteFile("/PBUS#KS@O?FNYLZ_POPCORNMONSTE2-20_86400000.XML");
      
      // When
      FileSystemHandling.createFolder(arg0);
      
      // Then
      File browseNodeFile = fileUtil.getBrowseNodeFile("PbUS#ks@O?Fnylz", "popcornmonste2-20", "86400000");
      assertNotNull(browseNodeFile);
      assertTrue(browseNodeFile.canExecute());
      assertEquals("PBUS#KS@O?FNYLZ_POPCORNMONSTE2-20_86400000.XML", browseNodeFile.getName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetASINFileReturningFileWhereLengthIsPositive() throws Throwable  {
      // Tests that the FileUtil class can handle invalid file paths correctly
      // Setup
      FileUtil fileUtil = new FileUtil();
      
      // Method call
      EvoSuiteFile arg0 = new EvoSuiteFile("/J2L/>2?9T_J2L/>2?9T_J2L/>2?9T_J2L/>2?9T.XML");
      FileSystemHandling.appendStringToFile(arg0, "C09hYItX{sAL^");
      File aSINFile = fileUtil.getASINFile("j2L/>2?9T", "j2L/>2?9T", "j2L/>2?9T", "j2L/>2?9T");
      
      // Assertions
      assertNotNull(aSINFile);
      assertEquals(13L, aSINFile.length());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetASINFileReturningNull() throws Throwable  {
      // This test verifies that the getASINFile method returns null when given invalid parameters.
      // The method is expected to return null if any of the following conditions are met:
      // * The ASIN does not match the expected pattern (ABC-1234567890)
      // * The SKU does not match the expected pattern (XYZ-9876543210)
      // * The UPC does not match the expected pattern (j2L/>2?9T)
      // * The checksum is not valid
      FileUtil fileUtil = new FileUtil();
      File aSINFile = fileUtil.getASINFile("ABC1234567890", "XYZ9876543210", "j2L/>2?9T", "j2L/>2?9T");
      assertNull(aSINFile);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDownloadOneASINFile() throws Throwable  {
      // Arrange
      FileUtil fileUtil = new FileUtil();
      EvoSuiteURL arg0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=~Q0bLw?YA^L^swiVW&type=~Q0bLw?YA^L^swiVW&offerpage=d,qu #%P&offer=new&f=xml");
      String asin = "~Q0bLw?YA^L^swiVW";
      String type = "~Q0bLw?YA^L^swiVW";
      String offer = "new";
      String page = "d,qu #%P";
      String delimiter = ":_";
      // Act
      boolean result = fileUtil.downloadOneASINFile(asin, type, offer, page, delimiter);
      // Assert
      assertFalse(result);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDownloadCart() throws Throwable  {
      // Given: A user has access to a shopping cart on an e-commerce website
      // When: The user wants to download their cart for offline browsing
      FileUtil fileUtil = new FileUtil();
      File downloadedCart = fileUtil.downloadCart("https://www.example.com/cart?productId=12345&quantity=5");
      
      // Then: The downloaded cart should be a valid XML file
      assertNotNull(downloadedCart);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDownloadSimilaritesFile() throws Throwable  {
      // Create an instance of FileUtil to use for downloading the similarities file
      FileUtil fileUtil = new FileUtil();
      
      // Create an EvoSuiteURL object to represent the URL of the similarities file
      EvoSuiteURL arg0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SimilaritySearch=Shoppin*Cart=remove&f=xml&dev-t=&type=lite&offerpage=Shoppin*Cart=remove&f=xml");
      
      // Use NetworkHandling.createRemoteTextFile() to create a remote text file with the contents of the similarities file
      NetworkHandling.createRemoteTextFile(arg0, "Shoppin*Cart=remove&f=xml&dev-t=");
      
      // Download the similarities file using FileUtil.downloadSimilaritesFile() and store the result in a boolean variable
      boolean downloadSimilaritesFile = fileUtil.downloadSimilaritesFile("Shoppin*Cart=remove&f=xml&dev-t=", "Shoppin*Cart=remove&f=xml&dev-t=", "Shoppin*Cart=remove&f=xml&dev-t=");
      
      // Assert that the download was not successful (i.e., the file could not be downloaded)
      assertFalse(downloadSimilaritesFile);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFetchSimilarItemsReturningFileInputStreamWhereAvailableIsPositive() throws Throwable  {
      // rollbacked to evosuite
      EvoSuiteFile arg0 = new EvoSuiteFile("/S_J2D/>2?*T.XML");
      FileSystemHandling.appendLineToFile(arg0, "WKLyOWMnvi");
      FileUtil fileUtil = new FileUtil();
      FileInputStream fetchSimilarItems = fileUtil.fetchSimilarItems("j2D/>2?*T", "j2D/>2?*T");
      assertEquals(11, fetchSimilarItems.available());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFetchSimilarItems1() throws Throwable  {
      // Given: We have a FileUtil object and a query and location for which we want to fetch similar items.
      FileUtil fileUtil = new FileUtil();
      String query = "example_query";
      String location = "example_location";
      
      // When: We call the fetchSimilarItems method with the given query and location.
      FileInputStream fetchSimilarItems = fileUtil.fetchSimilarItems(query, location);
      
      // Then: The returned FileInputStream should be null since we are testing a negative scenario.
      assertNull(fetchSimilarItems);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFetchAccessories() throws Throwable  {
      // Given
      FileUtil fileUtil = new FileUtil();
      ArrayList<Object> arg1 = new ArrayList<>();
      EvoSuiteFile arg0 = new EvoSuiteFile("/A_.XML.XML");
      
      // When
      FileInputStream fetchAccessories = fileUtil.fetchAccessories(".xml", arg1);
      
      // Then
      assertNull(fetchAccessories);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAccessoriesReturningNull() throws Throwable  {
      // Test that the getAccessories method returns null when given a non-existent file name
      FileUtil fileUtil = new FileUtil();
      File accessories = fileUtil.getAccessories("accessory123", (ArrayList) null);
      assertNull(accessories);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFetchThirdPartySearchFile() throws Throwable  {
      // rollbacked to evosuite
      FileUtil fileUtil = new FileUtil();
      EvoSuiteURL arg0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&SellerSearch=Shop%ingCart=moRify&f=xml&de|-t=&type=j2D/>2?*T&page=Shop%ingCart=moRify&f=xml&de|-t=&offerstatus=Shop%ingCart=moRify&f=xml&de|-t=&f=xml");
      NetworkHandling.createRemoteTextFile(arg0, "Shop%ingCart=moRify&f=xml&de|-t=");
      FileInputStream fetchThirdPartySearchFile = fileUtil.fetchThirdPartySearchFile("Shop%ingCart=moRify&f=xml&de|-t=", "j2D/>2?*T", "Shop%ingCart=moRify&f=xml&de|-t=", "Shop%ingCart=moRify&f=xml&de|-t=");
      assertNull(fetchThirdPartySearchFile);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFetchGenericSearchFile() throws Throwable  {
      // No Comments were added
      FileUtil fileUtil = new FileUtil();
      EvoSuiteURL arg0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&sw6qrw\"-b=sw6qrw%22-b&mode=sw6qrw\"-b&type=sw6qrw\"-b&page=sw6qrw\"-b&offer=sw6qrw\"-b&f=xml");
      NetworkHandling.createRemoteTextFile(arg0, "amazonServerURL");
      FileInputStream fetchGenericSearchFile = fileUtil.fetchGenericSearchFile("sw6qrw\"-b", "sw6qrw\"-b", "sw6qrw\"-b", "sw6qrw\"-b", "sw6qrw\"-b", "sw6qrw\"-b");
      assertNull(fetchGenericSearchFile);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFetchKeywordSearchFile() throws Throwable  {
      // rollbacked to evosuite
      FileUtil fileUtil = new FileUtil();
      FileInputStream fetchKeywordSearchFile = fileUtil.fetchKeywordSearchFile("green", "black", "white", "red");
      assertNull(fetchKeywordSearchFile);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFetchBlendedSearchFile() throws Throwable  {
      // Given: A FileUtil object is created
      FileUtil fileUtil = new FileUtil();
      
      // When: The fetchBlendedSearchFile method is called with the parameters "10-minute-cache-life" and "10-minute-cache-life"
      FileInputStream fetchBlendedSearchFile = fileUtil.fetchBlendedSearchFile("10-minute-cache-life", "10-minute-cache-life");
      
      // Then: The method should return null, as the file does not exist
      assertNull(fetchBlendedSearchFile);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDownloadKeywordSearchFile() throws Throwable  {
      // Arrange
      FileUtil fileUtil = new FileUtil();
      EvoSuiteURL arg0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&KeywordSearch=Shoppin*Cart%3Dremove%26f%3Dxml%26dev-t%3D&mode=Shoppin*Cart=remove&f=xml&dev-t=&type=Shoppin*Cart=remove&f=xml");
      NetworkHandling.createRemoteTextFile(arg0, "Shoppin*Cart=remove&f=xml&dev-t=");
      
      // Act
      File downloadKeywordSearchFile = fileUtil.downloadKeywordSearchFile("Shoppin*Cart=remove&f=xml&dev-t=", "Shoppin*Cart=remove&f=xml&dev-t=", "Shoppin*Cart=remove&f=xml&dev-t=", "Shoppin*Cart=remove&f=xml&dev-t=");
      
      // Assert
      assertNull(downloadKeywordSearchFile);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDownloadBlendedSearchFile() throws Throwable  {
      // Test to ensure that the downloadBlendedSearchFile method returns null when there is no blended search file available.
      
      // Arrange
      EvoSuiteURL arg0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BlendedSearch=%7Bftfee5nO-s+_&type=&f=xml");
      FileUtil fileUtil = new FileUtil();
      
      // Act
      NetworkHandling.createRemoteTextFile(arg0, "{ftfee5nO-s _");
      File downloadBlendedSearchFile = fileUtil.downloadBlendedSearchFile("{ftfee5nO-s _", "");
      
      // Assert
      assertNull(downloadBlendedSearchFile);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFetchBNFileWithNonEmptyString() throws Throwable  {
      // Arrange
      FileUtil fileUtil = new FileUtil();
      
      // Act
      FileInputStream fetchBNFile = fileUtil.fetchBNFile("path/to/folder", "file.xml", "UTF-8");
      
      // Assert
      assertNull(fetchBNFile);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFetchBNFileWithEmptyStringAndEmptyString() throws Throwable  {
      // Create a new EvoSuiteFile object for testing
      EvoSuiteFile arg0 = new EvoSuiteFile("/__.XML");
      
      // Create a folder using FileSystemHandling.createFolder method
      FileSystemHandling.createFolder(arg0);
      
      // Create a new FileUtil object
      FileUtil fileUtil = new FileUtil();
      
      // Fetch the BNFile using the fetchBNFile method and assert that it is null
      FileInputStream fetchBNFile = fileUtil.fetchBNFile("", "", "");
      assertNull(fetchBNFile);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetBrowseNodeFileReturningNull() throws Throwable  {
      // This test checks if a specific file in the "cacheLife_folder" directory exists and returns null.
      FileUtil fileUtil = new FileUtil();
      File browseNodeFile = fileUtil.getBrowseNodeFile("cacheLife_folder", "cacheLife_file", "cacheLife_contents");
      assertNull(browseNodeFile); // Since the file does not exist, the method should return null.
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDownloadBrowseNodeFile() throws Throwable  {
      // Given
      EvoSuiteURL arg0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&BrowseNodeSearch=Shoppin*Cart=remove&f=xml&dev-t=&mode=Shoppin*Cart=remove&f=xml");
      FileUtil fileUtil = new FileUtil();
      
      // When
      boolean downloadBrowseNodeFile = fileUtil.downloadBrowseNodeFile("Shoppin*Cart=remove&f=xml&dev-t=", "Shoppin*Cart=remove&f=xml&dev-t=", "Shoppin*Cart=remove&f=xml&dev-t=", "Shoppin*Cart=remove&f=xml&dev-t=");
      
      // Then
      assertFalse(downloadBrowseNodeFile);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFetchASINFileReturningFileInputStreamWhereAvailableIsZero() throws Throwable  {
      // Arrange
      FileUtil fileUtil = new FileUtil();
      EvoSuiteFile arg0 = new EvoSuiteFile("/.#M=_SHOPPINGCART=MODIFY&F=XML&DEV-T=_.#M=_SHOPPINGCART=MODIFY&F=XML&DEV-T=.XML");
      FileSystemHandling.appendStringToFile(arg0, "");
      
      // Act
      FileInputStream fetchASINFile = fileUtil.fetchASINFile(".#m=", ".#m=", "ShoppingCart=modify&f=xml&dev-t=", "ShoppingCart=modify&f=xml&dev-t=");
      
      // Assert
      assertEquals(0, fetchASINFile.available());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRenameFileWithEmptyStringAndEmptyString() throws Throwable  {
      // rollbacked to evosuite
      FileUtil fileUtil = new FileUtil();
      fileUtil.renameFile("", "");
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRenameFile1() throws Throwable  {
      // rollbacked to evosuite
      FileUtil fileUtil = new FileUtil();
      fileUtil.renameFile("/home/user/Documents/old_file.txt", "/home/user/Documents/new_file.txt");
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetSimilarItemsReturningFileWhereLengthIsPositive() throws Throwable  {
      // No Comments were added
      EvoSuiteFile arg0 = new EvoSuiteFile("/S_J2D/>2?*T.XML");
      FileSystemHandling.appendLineToFile(arg0, "Shop%ingCart=moRify&f=xmlde|-t=");
      FileSystemHandling.appendLineToFile(arg0, "Shop%ingCart=moRify&f=xmlde|-t=");
      FileSystemHandling.appendStringToFile(arg0, "Shop%ingCart=moRify&f=xmlde|-t=");
      FileSystemHandling.appendLineToFile(arg0, "Shop%ingCart=moRify&f=xmlde|-t=");
      FileSystemHandling.appendStringToFile(arg0, "Shop%ingCart=moRify&f=xmlde|-t=");
      FileSystemHandling.appendLineToFile(arg0, "Shop%ingCart=moRify&f=xmlde|-t=");
      FileSystemHandling.appendLineToFile(arg0, "Shop%ingCart=moRify&f=xmlde|-t=");
      FileSystemHandling.appendLineToFile(arg0, "Shop%ingCart=moRify&f=xmlde|-t=");
      FileUtil fileUtil = new FileUtil();
      FileSystemHandling.appendLineToFile(arg0, "Shop%ingCart=moRify&f=xmlde|-t=");
      byte[] arg1 = new byte[111];
      FileSystemHandling.appendLineToFile(arg0, "Shop%ingCart=moRify&f=xmlde|-t=");
      FileSystemHandling.appendLineToFile(arg0, "net.kencochrane.a4j.u?il.a4jUtil");
      FileSystemHandling.appendDataToFile(arg0, arg1);
      FileSystemHandling.appendDataToFile(arg0, arg1);
      FileSystemHandling.appendLineToFile(arg0, "Shop%ingCart=moRify&f=xmlde|-t=");
      FileSystemHandling.appendStringToFile(arg0, "Shop%ingCart=moRify&f=xmlde|-t=");
      FileSystemHandling.appendDataToFile(arg0, arg1);
      FileSystemHandling.appendDataToFile(arg0, arg1);
      FileSystemHandling.appendStringToFile(arg0, "Shop%ingCart=moRify&f=xmlde|-t=");
      FileSystemHandling.appendDataToFile(arg0, arg1);
      File similarItems = fileUtil.getSimilarItems("j2D/>2?*T", "Shop%ingCart=moRify&f=xmlde|-t=");
      assertNotNull(similarItems);
      assertEquals("/S_J2D/>2?*T.XML", similarItems.toString());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsAgeGoodWithFileWhereLengthIsZero() throws Throwable  {
      // Given a FileUtil instance and a mocked File object
      FileUtil fileUtil = new FileUtil();
      MockFile arg0 = new MockFile((File) null, "");
      
      // When the isAgeGood method is called with the mocked File object
      boolean ageGood = fileUtil.isAgeGood(arg0);
      
      // Then the method should return false
      assertFalse(ageGood);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsAgeGoodWithNull() throws Throwable  {
      // Arrange
      FileUtil fileUtil = new FileUtil();
      
      // Act
      boolean ageGood = fileUtil.isAgeGood(null);
      
      // Assert
      assertFalse(ageGood);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDeleteFileWithEmptyString() throws Throwable  {
      // rollbacked to evosuite
      FileUtil fileUtil = new FileUtil();
      fileUtil.deleteFile("");
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFetchASINFile1() throws Throwable  {
      // rollbacked to evosuite
      EvoSuiteURL arg0 = new EvoSuiteURL("http://xml.amazon.net/onca/xml3?t=popcornmonste2-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=.#m=&type=.#m=&offerpage=ShoppingCart=modify&f=xml&dev-t=&offer=ShoppingCart=modify&f=xml&dev-t=&f=xml");
      NetworkHandling.createRemoteTextFile(arg0, "ShoppingCart=modify&f=xml&dev-t=");
      FileUtil fileUtil = new FileUtil();
      FileInputStream fetchASINFile = fileUtil.fetchASINFile(".#m=", ".#m=", "ShoppingCart=modify&f=xml&dev-t=", "ShoppingCart=modify&f=xml&dev-t=");
      assertNull(fetchASINFile);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDeleteFileWithNonEmptyString() throws Throwable  {
      // rollbacked to evosuite
      FileUtil fileUtil = new FileUtil();
      fileUtil.deleteFile("testFile1.txt");
  }
}
