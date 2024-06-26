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
public class InterfaceUtilitiesBean_Original_ESTest extends InterfaceUtilitiesBean_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testBooleanToYesNoWithTrue() throws Throwable  {
      InterfaceUtilitiesBean interfaceUtilitiesBean = new InterfaceUtilitiesBean();
      String booleanToYesNo = interfaceUtilitiesBean.booleanToYesNo(true);
      assertEquals("yes", booleanToYesNo);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testBooleanToYesNoWithFalse() throws Throwable  {
      InterfaceUtilitiesBean interfaceUtilitiesBean = new InterfaceUtilitiesBean();
      String booleanToYesNo = interfaceUtilitiesBean.booleanToYesNo(false);
      assertEquals("no", booleanToYesNo);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testConvertNullToEmptyStringReturningEmptyString() throws Throwable  {
      InterfaceUtilitiesBean interfaceUtilitiesBean = new InterfaceUtilitiesBean();
      String convertNullToEmptyString = interfaceUtilitiesBean.convertNullToEmptyString((String) null);
      assertEquals("", convertNullToEmptyString);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testConvertNullToEmptyStringReturningNonEmptyString() throws Throwable  {
      InterfaceUtilitiesBean interfaceUtilitiesBean = new InterfaceUtilitiesBean();
      String convertNullToEmptyString = interfaceUtilitiesBean.convertNullToEmptyString("GT3{CJ$a(4b@E,6'+");
      assertEquals("GT3{CJ$a(4b@E,6'+", convertNullToEmptyString);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetUserDisplayNameThrowsNullPointerException() throws Throwable  {
      InterfaceUtilitiesBean interfaceUtilitiesBean = new InterfaceUtilitiesBean();
      UserRegistryBean arg1 = new UserRegistryBean();
      // Undeclared exception!
      try { 
        interfaceUtilitiesBean.getUserDisplayName("-N72ig%Gg~%p&Uw", arg1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.heal.module.user.UserRegistryBean", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetUserDisplayNameWithEmptyString() throws Throwable  {
      InterfaceUtilitiesBean interfaceUtilitiesBean = new InterfaceUtilitiesBean();
      UserRegistryBean arg1 = new UserRegistryBean();
      String userDisplayName = interfaceUtilitiesBean.getUserDisplayName("", arg1);
      assertEquals("", userDisplayName);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetUserDisplayNameWithNullAndNonEmptyString() throws Throwable  {
      InterfaceUtilitiesBean interfaceUtilitiesBean = new InterfaceUtilitiesBean();
      String userDisplayName = interfaceUtilitiesBean.getUserDisplayName("content", (UserRegistryBean) null);
      assertEquals("", userDisplayName);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetUserDisplayNameWithNullAndNonNull() throws Throwable  {
      InterfaceUtilitiesBean interfaceUtilitiesBean = new InterfaceUtilitiesBean();
      UserRegistryBean arg1 = new UserRegistryBean();
      String userDisplayName = interfaceUtilitiesBean.getUserDisplayName((String) null, arg1);
      assertEquals("", userDisplayName);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAbbreviatedString0() throws Throwable  {
      InterfaceUtilitiesBean interfaceUtilitiesBean = new InterfaceUtilitiesBean();
      String abbreviatedString = interfaceUtilitiesBean.getAbbreviatedString("images/thumbnails/thb_photograph.jpg", 19);
      assertEquals("images/thumbnails/t...", abbreviatedString);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAbbreviatedStringWithNegative() throws Throwable  {
      InterfaceUtilitiesBean interfaceUtilitiesBean = new InterfaceUtilitiesBean();
      String abbreviatedString = interfaceUtilitiesBean.getAbbreviatedString("content", (-280));
      assertEquals("...", abbreviatedString);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAbbreviatedStringReturningEmptyString() throws Throwable  {
      InterfaceUtilitiesBean interfaceUtilitiesBean = new InterfaceUtilitiesBean();
      String abbreviatedString = interfaceUtilitiesBean.getAbbreviatedString((String) null, 1111);
      assertEquals("", abbreviatedString);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAbbreviatedString1() throws Throwable  {
      InterfaceUtilitiesBean interfaceUtilitiesBean = new InterfaceUtilitiesBean();
      String abbreviatedString = interfaceUtilitiesBean.getAbbreviatedString("audio", 6003);
      assertEquals("audio", abbreviatedString);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetThumbnailAndInit0() throws Throwable  {
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
      InterfaceUtilitiesBean interfaceUtilitiesBean = new InterfaceUtilitiesBean();
      FileLocator arg0 = new FileLocator();
      interfaceUtilitiesBean.init(arg0);
      ThumbnailBean thumbnail = interfaceUtilitiesBean.getThumbnail((ThumbnailBean) null, "Nh4X<", (String) null);
      assertEquals("80", thumbnail.getFileWidth());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetThumbnailReturningNull() throws Throwable  {
      InterfaceUtilitiesBean interfaceUtilitiesBean = new InterfaceUtilitiesBean();
      ThumbnailBean thumbnail = interfaceUtilitiesBean.getThumbnail((ThumbnailBean) null, "/", "/");
      assertNull(thumbnail);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetThumbnailWithNullAndGetThumbnailReturningNull() throws Throwable  {
      InterfaceUtilitiesBean interfaceUtilitiesBean = new InterfaceUtilitiesBean();
      ThumbnailBean thumbnail = interfaceUtilitiesBean.getThumbnail((ThumbnailBean) null, (String) null, (String) null);
      assertNull(thumbnail);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetThumbnailAndInit1() throws Throwable  {
      InterfaceUtilitiesBean interfaceUtilitiesBean = new InterfaceUtilitiesBean();
      FileLocator arg0 = new FileLocator();
      interfaceUtilitiesBean.init(arg0);
      ThumbnailBean thumbnail = interfaceUtilitiesBean.getThumbnail((ThumbnailBean) null, "video", "thumbnails");
      assertEquals("thumbnails/images/thumbnails/thb_video.jpg", thumbnail.getLocation());
  }
}
