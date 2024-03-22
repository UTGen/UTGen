/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Mon Mar 18 05:54:17 GMT 2024
 */

package com.hf.sfm.crypt;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import com.hf.sfm.crypt.Base64;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Base64_Original_ESTest extends Base64_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testByteArrayToBase64ReturningNonEmptyString() throws Throwable  {
      byte[] arg0 = new byte[8];
      String byteArrayToBase64 = Base64.byteArrayToBase64(arg0);
      assertEquals("AAAAAAAAAAA=", byteArrayToBase64);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testBase64ToByteArrayReturningNonEmptyArray() throws Throwable  {
      byte[] base64ToByteArray = Base64.base64ToByteArray("mWj+AAC/ykw=");
      assertEquals(8, base64ToByteArray.length);
      assertArrayEquals(new byte[] {(byte) (-103), (byte)104, (byte) (-2), (byte)0, (byte)0, (byte) (-65), (byte) (-54), (byte)76}, base64ToByteArray);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testBase64ToByteArrayReturningEmptyArray() throws Throwable  {
      byte[] base64ToByteArray = Base64.base64ToByteArray("");
      assertEquals(0, base64ToByteArray.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testByteArrayToBase64ReturningEmptyString() throws Throwable  {
      byte[] arg0 = Base64.altBase64ToByteArray("");
      String byteArrayToBase64 = Base64.byteArrayToBase64(arg0);
      assertEquals("", byteArrayToBase64);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testByteArrayToAltBase64ReturningNonEmptyString() throws Throwable  {
      byte[] arg0 = new byte[2];
      String byteArrayToAltBase64 = Base64.byteArrayToAltBase64(arg0);
      assertEquals("!!!=", byteArrayToAltBase64);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAltBase64ToByteArrayReturningNonEmptyArray() throws Throwable  {
      byte[] altBase64ToByteArray = Base64.altBase64ToByteArray("j|g=");
      assertEquals(2, altBase64ToByteArray.length);
      assertArrayEquals(new byte[] {(byte) (-115), (byte)120}, altBase64ToByteArray);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAltBase64ToByteArrayThrowsIllegalArgumentException() throws Throwable  {
      // Undeclared exception!
      try { 
        Base64.altBase64ToByteArray("Y3N@ezcY");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal character Y
         //
         verifyException("com.hf.sfm.crypt.Base64", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testBase64ToByteArrayThrowsIllegalArgumentException() throws Throwable  {
      // Undeclared exception!
      try { 
        Base64.base64ToByteArray("%:|Kx$i-C@8oF|");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // String length must be a multiple of four.
         //
         verifyException("com.hf.sfm.crypt.Base64", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesBase64() throws Throwable  {
      Base64 base64_ = new Base64();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testMain() throws Throwable  {
      String[] arg0 = new String[0];
      Base64.main(arg0);
      assertEquals(0, arg0.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testByteArrayToAltBase64ReturningEmptyString() throws Throwable  {
      byte[] arg0 = Base64.altBase64ToByteArray("");
      String byteArrayToAltBase64 = Base64.byteArrayToAltBase64(arg0);
      assertEquals("", byteArrayToAltBase64);
  }
}