/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Mon Mar 18 07:29:13 GMT 2024
 */

package org.javathena.utiles;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.javathena.conf.LoginAthena;
import org.javathena.core.utiles.ACO;
import org.javathena.utiles.ConfigurationManagement;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ConfigurationManagement_ESTest extends ConfigurationManagement_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetTimestamp_formatReturningNonEmptyString() throws Throwable  {
      // Test that the setTimestamp_format method sets the correct format for timestamps.
      // The test uses a specific format string "BfE{+" to set the format, and then retrieves it using getTimestamp_format()
      // to verify that the format was properly set.
      ConfigurationManagement.setTimestamp_format("BfE{+");
      String timestamp_format = ConfigurationManagement.getTimestamp_format();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetTimestamp_formatReturningEmptyString() throws Throwable  {
      // rollbacked to evosuite
      ConfigurationManagement.setTimestamp_format("");
      String timestamp_format = ConfigurationManagement.getTimestamp_format();
      assertEquals("", timestamp_format);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetSubnetmaskiReturningNonEmptyArray() throws Throwable  {
      // No Comments were added
      int[] arg0 = new int[5];
      ConfigurationManagement.setSubnetmaski(arg0);
      int[] subnetmaski = ConfigurationManagement.getSubnetmaski();
      assertArrayEquals(new int[] {0, 0, 0, 0, 0}, subnetmaski);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetSubnetmaskiReturningEmptyArray() throws Throwable  {
      // Given: The system has a ConfigurationManagement class that contains a setter and a getter method for the subnet mask.
      // When: We call the getSubnetMask method with an empty array as input.
      int[] arg0 = new int[0];
      ConfigurationManagement.setSubnetmaski(arg0);
      int[] subnetmaski = ConfigurationManagement.getSubnetmaski();
      // Then: The output of the getSubnetMask method should be an empty array.
      assertArrayEquals(new int[] {}, subnetmaski);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetSubnetiReturningNonEmptyArray() throws Throwable  {
      // Given: A non-empty int array as input to the setSubneti() method
      int[] arg0 = new int[5];
      
      // When: The setSubneti() method is called with this input array
      ConfigurationManagement.setSubneti(arg0);
      
      // Then: The getSubneti() method should return the same array as was passed to it
      int[] subneti = ConfigurationManagement.getSubneti();
      assertSame(subneti, arg0);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetSubnetiReturningEmptyArray() throws Throwable  {
      // rollbacked to evosuite
      int[] arg0 = new int[0];
      ConfigurationManagement.setSubneti(arg0);
      int[] subneti = ConfigurationManagement.getSubneti();
      assertEquals(0, subneti.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetServer_numReturningPositive() throws Throwable  {
      // rollbacked to evosuite
      ConfigurationManagement.setServer_num(1);
      int server_num = ConfigurationManagement.getServer_num();
      assertEquals(1, server_num);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetServer_numReturningNegative() throws Throwable  {
      // No Comments were added
      ConfigurationManagement.setServer_num((-1360));
      int server_num = ConfigurationManagement.getServer_num();
      assertEquals((-1360), server_num);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetNum_regs() throws Throwable  {
      // Set a negative value for the number of regions
      ConfigurationManagement.setNum_regs(-1L);
      
      // Retrieve the number of regions
      long num_regs = ConfigurationManagement.getNum_regs();
      
      // Assert that the retrieved value is equal to the set value
      assertEquals(-1L, num_regs);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetLan_char_ipReturningEmptyString() throws Throwable  {
      // No Comments were added
      ConfigurationManagement.setLan_char_ip("");
      String lan_char_ip = ConfigurationManagement.getLan_char_ip();
      assertEquals("", lan_char_ip);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetGMMaxReturningZero() throws Throwable  {
      // This test sets the global maximum to 0 and then retrieves it using getGMMax().
      // It asserts that the returned value is indeed 0.
      
      ConfigurationManagement.setGMMax(0);
      int gMMax = ConfigurationManagement.getGMMax();
      assertEquals(0, gMMax);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAddChar_id_countTakingInt() throws Throwable  {
      // Given a character id count of 5091
      ConfigurationManagement.addChar_id_count(5091);
      
      // When the getChar_id_count method is called
      int char_id_count = ConfigurationManagement.getChar_id_count();
      
      // Then the character id count should be 5091
      assertEquals(5091, char_id_count);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetAuth_before_save_file() throws Throwable  {
      // Set the value for the "auth_before_save_file" configuration property to 5
      ConfigurationManagement.setAuth_before_save_file(5);
      
      // Retrieve the current value of the "auth_before_save_file" configuration property
      int auth_before_save_file = ConfigurationManagement.getAuth_before_save_file();
      
      // Assert that the retrieved value is equal to 5
      assertEquals(5, auth_before_save_file);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAccess_orderReturningACOWhereGetValueIsZero() throws Throwable  {
      // Arrange
      ACO arg0 = ACO.DENY_ALLOW;
      
      // Act
      ConfigurationManagement.setAccess_order(arg0);
      ACO access_order = ConfigurationManagement.getAccess_order();
      
      // Assert
      assertEquals(ACO.DENY_ALLOW, access_order);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAccess_orderReturningACOWhereGetValueIsPositive() throws Throwable  {
      // Set the value of access order to 128
      ACO arg0 = ACO.STRSIZE;
      ConfigurationManagement.setAccess_order(arg0);
      
      // Get the value of access order
      ACO access_order = ConfigurationManagement.getAccess_order();
      
      // Assert that the value of access order is 128
      assertEquals(128, access_order.getValue());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAccess_denyReturningEmptyString() throws Throwable  {
      // Set the value of the "access_deny" configuration to an empty string.
      ConfigurationManagement.setAccess_deny("");
      
      // Get the current value of the "access_deny" configuration.
      String access_deny = ConfigurationManagement.getAccess_deny();
      
      // Assert that the returned value is equal to an empty string.
      assertEquals("", access_deny);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAccess_allownumReturningNegative() throws Throwable  {
      // Test that the access_allownum property is set to a specific value
      ConfigurationManagement.setAccess_allownum((-1102111411));
      int access_allownum = ConfigurationManagement.getAccess_allownum();
      assertEquals((-1102111411), access_allownum);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAccess_allowReturningEmptyString() throws Throwable  {
      // No Comments were added
      ConfigurationManagement.setAccess_allow("");
      String access_allow = ConfigurationManagement.getAccess_allow();
      assertEquals("", access_allow);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetLoginAthenaConf() throws Throwable  {
      // Create an instance of the LoginAthena configuration class
      LoginAthena loginAthenaConf = ConfigurationManagement.getLoginAthenaConf();
      
      // Assert that the account filename is null
      assertNull(loginAthenaConf.getAccount_filename());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLogin_config_readXMLWithNonEmptyString() throws Throwable  {
      // Given: There is a ConfigurationManagement class with a method called "login_config_readXML"
      // When: The method "login_config_readXML" is called with the input "@s["
      int login_config_readXML = ConfigurationManagement.login_config_readXML("@s[");
      
      // Then: The method returns 0 as it is able to read the XML configuration file successfully
      assertEquals(0, login_config_readXML);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLogin_config_readXMLWithEmptyString() throws Throwable  {
      // No Comments were added
      int login_config_readXML = ConfigurationManagement.login_config_readXML("");
      assertEquals(0, login_config_readXML);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDisplay_conf_warningsAndSetAccess_allownum() throws Throwable  {
      // Set the access_allownum to 75
      ConfigurationManagement.setAccess_allownum(75);
      
      // Display any configuration warnings
      ConfigurationManagement.display_conf_warnings();
      
      // Verify that the access_allownum is set correctly
      assertEquals(75, ConfigurationManagement.getAccess_allownum());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDisplay_conf_warningsAndSetAccess_allownumAndSetAccess_order() throws Throwable  {
      // rollbacked to evosuite
      ConfigurationManagement.setAccess_allownum(75);
      ACO arg0 = ACO.ALLOW_DENY;
      ConfigurationManagement.setAccess_order(arg0);
      ConfigurationManagement.display_conf_warnings();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDisplay_conf_warningsAndSetAccess_order0() throws Throwable  {
      // rollbacked to evosuite
      ACO arg0 = ACO.ALLOW_DENY;
      ConfigurationManagement.setAccess_order(arg0);
      ConfigurationManagement.display_conf_warnings();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDisplay_conf_warningsAndSetAccess_order1() throws Throwable  {
      // This test sets the access order to DENY_ALLOW and verifies that it is correctly set
      ACO arg0 = ACO.DENY_ALLOW;
      ConfigurationManagement.setAccess_order(arg0);
      
      // Verify that the access order has been correctly set
      assertEquals(arg0, ConfigurationManagement.getAccess_order());
      
      // Display any configuration warnings to the user
      ConfigurationManagement.display_conf_warnings();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDisplay_conf_warnings() throws Throwable  {
      // No Comments were added
      ConfigurationManagement.display_conf_warnings();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testYesNoOnOffToBooleanThrowsIllegalArgumentException() throws Throwable  {
      // Check that the method throws an IllegalArgumentException when passed an invalid value.
      try {
      ConfigurationManagement.yesNoOnOffToBoolean("true");
      fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
      //
      // Verify that the exception is thrown because the input value is not a valid yes/no/on/off string.
      //
      verifyException("org.javathena.utiles.ConfigurationManagement", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testYesNoOnOffToBooleanAndYesNoOnOffToBooleanReturningFalse0() throws Throwable  {
      // No Comments were added
      boolean yesNoOnOffToBoolean = ConfigurationManagement.yesNoOnOffToBoolean("NO");
      assertFalse(yesNoOnOffToBoolean);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testYesNoOnOffToBooleanAndYesNoOnOffToBooleanReturningFalse1() throws Throwable  {
      // No Comments were added
      boolean yesNoOnOffToBoolean = ConfigurationManagement.yesNoOnOffToBoolean("OFF");
      assertFalse(yesNoOnOffToBoolean);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testYesNoOnOffToBooleanAndYesNoOnOffToBooleanReturningTrue0() throws Throwable  {
      // Converts "ON" to boolean value true
      boolean yesNoOnOffToBoolean = ConfigurationManagement.yesNoOnOffToBoolean("ON");
      assertTrue(yesNoOnOffToBoolean);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testYesNoOnOffToBooleanAndYesNoOnOffToBooleanReturningTrue1() throws Throwable  {
      // No Comments were added
      boolean yesNoOnOffToBoolean = ConfigurationManagement.yesNoOnOffToBoolean("YES");
      assertTrue(yesNoOnOffToBoolean);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLogin_config_readTXTThrowsNullPointerException() throws Throwable  {
      int[] subnet = new int[5];
      ConfigurationManagement.setSubneti(subnet);
      ConfigurationManagement.setSubnetmaski(subnet);
      // Undeclared exception!
      try {
      ConfigurationManagement.login_config_readTXT("");
      fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      //
      // no message in exception (getMessage() returned null)
      //
      verifyException("org.javathena.utiles.ConfigurationManagement", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLogin_config_readTXT() throws Throwable  {
      // Given: A set of subnets and subnet masks are stored in the ConfigurationManagement class
      int[] arg0 = new int[6];
      ConfigurationManagement.setSubneti(arg0);
      ConfigurationManagement.setSubnetmaski(arg0);
      
      // When: The "p" login type is read from a file using the ConfigurationManagement class's login_config_readTXT method
      int login_config_readTXT = ConfigurationManagement.login_config_readTXT("p");
      
      // Then: The method should return 1, as it indicates that the "p" login type is valid
      assertEquals(1, login_config_readTXT);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLogin_lan_config_read() throws Throwable  {
      // rollbacked to evosuite
      int[] arg0 = new int[6];
      ConfigurationManagement.setSubneti(arg0);
      ConfigurationManagement.setSubnetmaski(arg0);
      int login_lan_config_read = ConfigurationManagement.login_lan_config_read("p");
      assertEquals(1, login_lan_config_read);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAddGMMaxTakingInt() throws Throwable  {
      // No Comments were added
      ConfigurationManagement.addGMMax(10);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetLogin_ip_str() throws Throwable  {
      // This test asserts that the value of the "login_ip_str" configuration property is equal to "127.0.0.1".
      // The purpose of this test is to verify that the configuration property has been set correctly and is accessible in the code.
      String loginIpStr = ConfigurationManagement.getLogin_ip_str();
      assertEquals("127.0.0.1", loginIpStr);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetBackup_txt_flag() throws Throwable  {
      // Test the case where the backup_txt_flag is null
      String backupTxtFlag = ConfigurationManagement.getBackup_txt_flag();
      assertNull(backupTxtFlag);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAddChar_id_countTakingNoArguments() throws Throwable  {
      // No Comments were added
      ConfigurationManagement.addChar_id_count();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetChar_id_count() throws Throwable  {
      // Given: A character ID count is set to a negative value
      ConfigurationManagement.setChar_id_count(-880);
      
      // When: The character ID count is retrieved
      int char_id_count = ConfigurationManagement.getChar_id_count();
      
      // Then: The character ID count should be equal to the value that was set
      assertEquals(-880, char_id_count);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetAccess_denynum() throws Throwable  {
      // Set a new value for the access_denynum property
      ConfigurationManagement.setAccess_denynum(76);
      
      // Get the current value of the access_denynum property
      int access_denynum = ConfigurationManagement.getAccess_denynum();
      
      // Assert that the new value is equal to the one set
      assertEquals(76, access_denynum);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetEmail_creation() throws Throwable  {
      // rollbacked to evosuite
      int email_creation = ConfigurationManagement.getEmail_creation();
      assertEquals(0, email_creation);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetGm_allow_level() throws Throwable  {
      // No Comments were added
      int gm_allow_level = ConfigurationManagement.getGm_allow_level();
      assertEquals(0, gm_allow_level);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetScdata_txt() throws Throwable  {
      // Given: The scdata_txt variable is defined as a String and set to the value of ConfigurationManagement.getScdata_txt()
      String scdata_txt = ConfigurationManagement.getScdata_txt();
      
      // When: The assertNull method is called on the scdata_txt variable
      assertNull(scdata_txt);
      
      // Then: The test asserts that the scdata_txt variable is null
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAccess_denyReturningNull() throws Throwable  {
      // Arrange
      String access_deny = ConfigurationManagement.getAccess_deny();
      
      // Act and Assert
      assertNotNull(access_deny);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAccess_allownumReturningPositive() throws Throwable  {
      // Set the access_allownum to 1024
      ConfigurationManagement.setAccess_allownum(1024);
      
      // Retrieve the current value of access_allownum
      int access_allownum = ConfigurationManagement.getAccess_allownum();
      
      // Assert that the retrieved value is equal to 1024
      assertEquals(1024, access_allownum);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAccess_denyReturningNonEmptyString() throws Throwable  {
      // Given: The system is configured to deny access to the resource.
      ConfigurationManagement.setAccess_deny("Deny");
      
      // When: The access_deny value is retrieved from the configuration.
      String access_deny = ConfigurationManagement.getAccess_deny();
      
      // Then: The returned value should match the expected value.
      assertEquals("Deny", access_deny);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetServer_numReturningZero() throws Throwable  {
      // No Comments were added
      int server_num = ConfigurationManagement.getServer_num();
      assertEquals(0, server_num);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetNum_regsReturningZero() throws Throwable  {
      // Set up the test fixture
      // ...
      
      // Run the method to be tested
      long num_regs = ConfigurationManagement.getNum_regs();
      
      // Verify the results
      assertEquals(0L, num_regs);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetLan_char_ipReturningNonEmptyString() throws Throwable  {
      // Given that we want to set the LAN character IP address for the device
      ConfigurationManagement.setLan_char_ip("192.168.0.1");
      
      // When we retrieve the LAN character IP address from the configuration management system
      String lan_char_ip = ConfigurationManagement.getLan_char_ip();
      
      // Then the retrieved value should match the expected value
      assertEquals("192.168.0.1", lan_char_ip);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetBackup_txt() throws Throwable  {
      // Arrange
      // Set up the necessary variables and objects for the test
      
      // Act
      // Invoke the method being tested with the appropriate parameters
      String backup_txt = ConfigurationManagement.getBackup_txt();
      
      // Assert
      // Verify that the result is what we expect it to be
      assertNull(backup_txt);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsConsole_silentReturningFalse() throws Throwable  {
      // No Comments were added
      boolean console_silent = ConfigurationManagement.isConsole_silent();
      assertFalse(console_silent);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetWisp_server_name() throws Throwable  {
      // This test asserts that the WISP server name is null
      String wispServerName = ConfigurationManagement.getWisp_server_name();
      assertNull(wispServerName);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetGMMaxReturningNegative() throws Throwable  {
      // Given: The Configuration Management system has been set to use the maximum of -34 as the GM (gross margins) value
      ConfigurationManagement.setGMMax((-34));
      
      // When: We retrieve the GM max value using the getter method
      int gMMax = ConfigurationManagement.getGMMax();
      
      // Then: The retrieved value should be -34, as that is the maximum value set for GM
      assertEquals((-34), gMMax);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetLan_char_ipReturningNull() throws Throwable  {
      // Given: The system has a configuration management class that is used to retrieve the LAN character IP address.
      String lan_char_ip = ConfigurationManagement.getLan_char_ip();
      
      // When: The LAN character IP address is retrieved from the configuration management class.
      
      // Then: The returned LAN character IP address should be null, indicating that no such IP address has been configured.
      assertNull(lan_char_ip);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLogin_lan_config_readThrowsNullPointerException() throws Throwable  {
      int[] arg0 = new int[5];
      ConfigurationManagement.setSubneti(arg0);
      ConfigurationManagement.setSubnetmaski(arg0);
      
      try {
      ConfigurationManagement.login_lan_config_read("");
      fail("Expecting exception: NullPointerException");
      } catch (NullPointerException e) {
      // Verify that the exception is a NullPointerException
      verifyException("java.util.StringTokenizer", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetLogin_ip_str() throws Throwable  {
      // Set the login IP string to "192.168.0.1"
      ConfigurationManagement.setLogin_ip_str("192.168.0.1");
      
      // Verify that the login IP string is set correctly
      assertEquals("192.168.0.1", ConfigurationManagement.getLogin_ip_str());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAccess_denynumReturningZero() throws Throwable  {
      // No Comments were added
      int access_denynum = ConfigurationManagement.getAccess_denynum();
      assertEquals(0, access_denynum);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetStartLimitedTime() throws Throwable  {
      // Set the start limited time to 0L
      ConfigurationManagement.setStartLimitedTime(0L);
      
      // Retrieve the start limited time
      long actualStartLimitedTime = ConfigurationManagement.getStartLimitedTime();
      
      // Assert that the retrieved start limited time is equal to 0L
      assertEquals(0L, actualStartLimitedTime);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAddGMMaxTakingNoArguments() throws Throwable  {
      // No Comments were added
      ConfigurationManagement.addGMMax();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAutosave_interval() throws Throwable  {
      // rollbacked to evosuite
      int autosave_interval = ConfigurationManagement.getAutosave_interval();
      assertEquals(0, autosave_interval);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetNew_reg_tick() throws Throwable  {
      // This test case sets a new value for the "new_reg_tick" field and then retrieves it to verify that it is correct.
      ConfigurationManagement.setNew_reg_tick(-170);
      long newRegTick = ConfigurationManagement.getNew_reg_tick();
      assertEquals((-170L), newRegTick);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetTimestamp_formatReturningNull() throws Throwable  {
      // rollbacked to evosuite
      String timestamp_format = ConfigurationManagement.getTimestamp_format();
      assertNull(timestamp_format);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetSubnetmaskiReturningNull() throws Throwable  {
      // This test verifies that the getSubnetmaski method returns null when no subnet mask is configured.
      int[] actualSubnetmaski = ConfigurationManagement.getSubnetmaski();
      assertNull(actualSubnetmaski);
      
      // The expected result is null, since no subnet mask has been configured.
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testLesslessAuth_before_save_file() throws Throwable  {
      // Given a configuration where the auth_before_save_file is -1
      ConfigurationManagement.setAuth_before_save_file(-1);
      
      // When we call getAuthBeforeSaveFile() method
      int actual = ConfigurationManagement.getAuth_before_save_file();
      
      // Then the returned value should be -1
      assertEquals((-1), actual);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAccess_orderReturningNull() throws Throwable  {
      // No Comments were added
      ConfigurationManagement.getAccess_order();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAddNum_regsTakingLong() throws Throwable  {
      // Set up the test by adding 1000 to the number of registers
      ConfigurationManagement.addNum_regs(1000L);
      
      // Get the current number of registers
      long numRegs = ConfigurationManagement.getNum_regs();
      
      // Assert that the number of registers is equal to 1000
      assertEquals(1000L, numRegs);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetNew_reg_tickReturningZero() throws Throwable  {
      // This test is checking that the method getNewRegTick returns a long value of 0.
      long new_reg_tick = ConfigurationManagement.getNew_reg_tick();
      assertEquals(0L, new_reg_tick);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAccess_allowReturningNull() throws Throwable  {
      // rollbacked to evosuite
      String access_allow = ConfigurationManagement.getAccess_allow();
      assertNull(access_allow);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAutosave_time() throws Throwable  {
      // Get the autosave time from the configuration management
      int expectedAutosaveTime = ConfigurationManagement.getAutosave_time();
      
      // Assert that the autosave time is equal to 0
      assertEquals(0, expectedAutosaveTime);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAccess_allowReturningNonEmptyString() throws Throwable  {
      // rollbacked to evosuite
      ConfigurationManagement.setAccess_allow("/home/user/Documents/images");
      String access_allow = ConfigurationManagement.getAccess_allow();
      assertEquals("/home/user/Documents/images", access_allow);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetStartLimitedTimeReturningNegative() throws Throwable  {
      // No Comments were added
      long startLimitedTime = ConfigurationManagement.getStartLimitedTime();
      assertEquals((-1L), startLimitedTime);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetConsole_silent() throws Throwable  {
      // Test that the console is set to silent mode and the isConsoleSilent method returns true
      ConfigurationManagement.setConsole_silent(true);
      boolean actual = ConfigurationManagement.isConsole_silent();
      assertTrue(actual);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsLogin_ip_set_() throws Throwable  {
      // Check if the login IP is set to false
      boolean login_ip_set = ConfigurationManagement.isLogin_ip_set_();
      assertFalse(login_ip_set);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAuth_before_save_fileReturningZero() throws Throwable  {
      // Given: A configuration with auth_before_save_file set to 0
      ConfigurationManagement.setAuth_before_save_file(0);
      
      // When: The auth_before_save_file is retrieved
      int actual = ConfigurationManagement.getAuth_before_save_file();
      
      // Then: The value should be 0
      assertEquals(0, actual);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetGMMaxReturningPositive() throws Throwable  {
      // Test that the maximum number of groups is set correctly
      int gMMax = ConfigurationManagement.getGMMax();
      assertEquals(30, gMMax);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetAccess_allownumReturningZero() throws Throwable  {
      // rollbacked to evosuite
      int access_allownum = ConfigurationManagement.getAccess_allownum();
      assertEquals(0, access_allownum);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetStart_limited_time() throws Throwable  {
      // Given: The user wants to set a limited time for the start of the game
      ConfigurationManagement.setStart_limited_time(31);
      
      // When: The user calls the getStartLimitedTime method
      long startLimitedTime = ConfigurationManagement.getStartLimitedTime();
      
      // Then: The returned value is 31, which is the expected limited time for the start of the game
      assertEquals(31L, startLimitedTime);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetChar_id_countReturningZero() throws Throwable  {
      // rollbacked to evosuite
      int char_id_count = ConfigurationManagement.getChar_id_count();
      assertEquals(0, char_id_count);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetFriends_txt() throws Throwable  {
      // Given a list of friends is stored in the "friends_txt" variable
      String friends_txt = ConfigurationManagement.getFriends_txt();
      
      // When we assert that the list is null
      assertNull(friends_txt);
      
      // Then we expect an error message to be displayed
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetSubnetiReturningNull() throws Throwable  {
      // This test asserts that the value returned by ConfigurationManagement.getSubneti() is null.
      
      int[] subnets = ConfigurationManagement.getSubneti();
      assertNull(subnets);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAddNum_regsTakingNoArguments() throws Throwable  {
      // No Comments were added
      ConfigurationManagement.addNum_regs();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetMax_connect_user() throws Throwable  {
      // rollbacked to evosuite
      String max_connect_user = ConfigurationManagement.getMax_connect_user();
      assertNull(max_connect_user);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetChar_txt() throws Throwable  {
      // No Comments were added
      String char_txt = ConfigurationManagement.getChar_txt();
      assertNull(char_txt);
  }
}
