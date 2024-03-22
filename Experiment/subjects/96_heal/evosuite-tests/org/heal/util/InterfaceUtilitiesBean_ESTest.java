/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Thu Mar 21 11:14:12 GMT 2024
 */

package org.heal.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.heal.module.metadata.ThumbnailBean;
import org.heal.module.user.UserRegistryBean;
import org.heal.util.FileLocator;
import org.heal.util.InterfaceUtilitiesBean;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class InterfaceUtilitiesBean_ESTest extends InterfaceUtilitiesBean_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testBooleanToYesNoWithTrue() throws Throwable  {
      // Given
      InterfaceUtilitiesBean interfaceUtilitiesBean = new InterfaceUtilitiesBean();
      
      // When
      String actualResult = interfaceUtilitiesBean.booleanToYesNo(true);
      
      // Then
      assertEquals("yes", actualResult);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testBooleanToYesNoWithFalse() throws Throwable  {
      // No Comments were added
      InterfaceUtilitiesBean interfaceUtilitiesBean = new InterfaceUtilitiesBean();
      String booleanToYesNo = interfaceUtilitiesBean.booleanToYesNo(false);
      assertEquals("no", booleanToYesNo);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testConvertNullToEmptyStringReturningEmptyString() throws Throwable  {
      // Create a new instance of the interface utilities bean
      InterfaceUtilitiesBean interfaceUtilitiesBean = new InterfaceUtilitiesBean();
      
      // Test that null is converted to an empty string
      String convertNullToEmptyString = interfaceUtilitiesBean.convertNullToEmptyString((String) null);
      assertEquals("", convertNullToEmptyString);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testConvertNullToEmptyStringReturningNonEmptyString() throws Throwable  {
      InterfaceUtilitiesBean interfaceUtilitiesBean = new InterfaceUtilitiesBean();
      // Given a sample string that may be null
      String originalString = "This is a sample string.";
      
      // When the string is converted to an empty string if it's null
      String convertNullToEmptyString = interfaceUtilitiesBean.convertNullToEmptyString(originalString);
      
      // Then the result should be the same as the original string
      assertEquals("This is a sample string.", convertNullToEmptyString);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetUserDisplayNameThrowsNullPointerException() throws Throwable  {
      // Setup
      InterfaceUtilitiesBean interfaceUtilitiesBean = new InterfaceUtilitiesBean();
      UserRegistryBean arg1 = new UserRegistryBean();
      
      // Expected exception
      String expectedMessage = "Expecting exception: NullPointerException";
      
      try {
      interfaceUtilitiesBean.getUserDisplayName("John Doe", arg1);
      fail(expectedMessage);
      } catch (NullPointerException e) {
      // Verify exception
      assertNotNull(e.getMessage());
      verifyException("org.heal.module.user.UserRegistryBean", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetUserDisplayNameWithEmptyString() throws Throwable  {
      // No Comments were added
      InterfaceUtilitiesBean interfaceUtilitiesBean = new InterfaceUtilitiesBean();
      UserRegistryBean arg1 = new UserRegistryBean();
      String userDisplayName = interfaceUtilitiesBean.getUserDisplayName("", arg1);
      assertEquals("", userDisplayName);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetUserDisplayNameWithNullAndNonEmptyString() throws Throwable  {
      // No Comments were added
      InterfaceUtilitiesBean interfaceUtilitiesBean = new InterfaceUtilitiesBean();
      String userDisplayName = interfaceUtilitiesBean.getUserDisplayName("content", (UserRegistryBean) null);
      assertEquals("", userDisplayName);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetUserDisplayNameWithNullAndNonNull() throws Throwable  {
      // No Comments were added
      InterfaceUtilitiesBean interfaceUtilitiesBean = new InterfaceUtilitiesBean();
      UserRegistryBean arg1 = new UserRegistryBean();
      String userDisplayName = interfaceUtilitiesBean.getUserDisplayName((String) null, arg1);
      assertEquals("", userDisplayName);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAbbreviatedString0() throws Throwable  {
      // Given: The user has a string "video" and an integer 5489.
      InterfaceUtilitiesBean interfaceUtilitiesBean = new InterfaceUtilitiesBean();
      String video = "video";
      int maxLength = 5489;
      
      // When: The user calls the getAbbreviatedString method with the string and max length parameters.
      String abbreviatedVideo = interfaceUtilitiesBean.getAbbreviatedString(video, maxLength);
      
      // Then: The method should return a shorter version of the string that fits within the specified maximum length.
      assertEquals("vid", abbreviatedVideo);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAbbreviatedStringWithNegative() throws Throwable  {
      // Given a string to be abbreviated and a negative trim length
      String content = "content";
      int trimLength = -280;
      
      // When the string is abbreviated with the given trim length
      InterfaceUtilitiesBean interfaceUtilitiesBean = new InterfaceUtilitiesBean();
      String abbreviatedString = interfaceUtilitiesBean.getAbbreviatedString(content, trimLength);
      
      // Then the result should be a string containing ellipses
      assertEquals("...", abbreviatedString);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAbbreviatedStringReturningEmptyString() throws Throwable  {
      InterfaceUtilitiesBean interfaceUtilitiesBean = new InterfaceUtilitiesBean();
      String abbreviatedString = interfaceUtilitiesBean.getAbbreviatedString(null, 1111);
      assertEquals("", abbreviatedString);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAbbreviatedString1() throws Throwable  {
      // No Comments were added
      InterfaceUtilitiesBean interfaceUtilitiesBean = new InterfaceUtilitiesBean();
      String abbreviatedString = interfaceUtilitiesBean.getAbbreviatedString("Lorem ipsum dolor sit amet, consectetur adipiscing elit.", 20);
      assertEquals("Lorem ipsum dolor si...", abbreviatedString);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetThumbnailAndInit0() throws Throwable  {
      // rollbacked to evosuite
      InterfaceUtilitiesBean interfaceUtilitiesBean = new InterfaceUtilitiesBean();
      FileLocator arg0 = new FileLocator();
      interfaceUtilitiesBean.init(arg0);
      ThumbnailBean thumbnail = interfaceUtilitiesBean.getThumbnail((ThumbnailBean) null, "/", "/");
      assertEquals("/images/thumbnails/thb_unknown.jpg", thumbnail.getLocation());
      assertNotNull(thumbnail);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetThumbnailWithNullAndInit() throws Throwable  {
      // Given
      InterfaceUtilitiesBean interfaceUtilitiesBean = new InterfaceUtilitiesBean();
      FileLocator fileLocator = new FileLocator();
      interfaceUtilitiesBean.init(fileLocator);
      String thumbnailId = "Nh4X<";
      
      // When
      ThumbnailBean thumbnail = interfaceUtilitiesBean.getThumbnail((ThumbnailBean) null, thumbnailId, (String) null);
      
      // Then
      assertEquals("images/thumbnails/thb_unknown.jpg", thumbnail.getLocation());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetThumbnailReturningNull() throws Throwable  {
      // Tests that getThumbnail returns null when passed a null ThumbnailBean
      // Arrange
      InterfaceUtilitiesBean interfaceUtilitiesBean = new InterfaceUtilitiesBean();
      
      // Act
      ThumbnailBean thumbnail = interfaceUtilitiesBean.getThumbnail(null, "/", "/");
      
      // Assert
      assertNull(thumbnail);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetThumbnailWithNullAndGetThumbnailReturningNull() throws Throwable  {
      // No Comments were added
      InterfaceUtilitiesBean interfaceUtilitiesBean = new InterfaceUtilitiesBean();
      ThumbnailBean thumbnail = interfaceUtilitiesBean.getThumbnail((ThumbnailBean) null, (String) null, (String) null);
      assertNull(thumbnail);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetThumbnailAndInit1() throws Throwable  {
      // Given
      FileLocator fileLocator = new FileLocator();
      InterfaceUtilitiesBean interfaceUtilitiesBean = new InterfaceUtilitiesBean();
      
      // When
      interfaceUtilitiesBean.init(fileLocator);
      ThumbnailBean thumbnail = interfaceUtilitiesBean.getThumbnail((ThumbnailBean) null, "video", "thumbnails");
      
      // Then
      assertEquals("thumbnails/images/thumbnails/thb_video.jpg", thumbnail.getLocation());
  }
}
