/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Thu Mar 21 02:06:58 GMT 2024
 */


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Convert_ESTest extends Convert_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testTranscodeThrowsNullPointerException() throws Throwable  {
      // rollbacked to evosuite
      Convert convert = new Convert((-2663), "dvd-ntsc", "\t\t</menuRd_4_3>", (GUI) null);
      // Undeclared exception!
      try { 
        convert.Transcode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Convert", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesConvertTaking4Arguments() throws Throwable  {
      // No Comments were added
      Convert convert = new Convert(2151, "$pK_w?H\"Z+NM'1K|", (String) null, (GUI) null);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testInitThrowsNullPointerException() throws Throwable  {
      // Given: a Convert object with a null GUI parameter and a valid source and target format
      Convert convert = new Convert("dvd-ntsc", "TpAW4[`]th|:c8ron", (GUI) null);
      
      // When: the init method is called on the Convert object
      try {
      convert.init();
      fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      // Then: a NullPointerException is thrown because the GUI parameter is null
      verifyException("Convert", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testMatrixThrowsNullPointerException() throws Throwable  {
      Convert convert = new Convert("rv)3/PFVURy", "rv)3/PFVURy", (GUI) null);
      // Undeclared exception!
      try {
      convert.matrix();
      fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      // Verify that the correct exception was thrown
      verifyException("Convert", e);
      // Check if the message is null (as expected)
      assertNull(e.getMessage());}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRunThrowsNullPointerException() throws Throwable  {
      // No Comments were added
      Convert convert = new Convert("iZwA6%R{", "iZwA6%R{", (GUI) null);
      // Undeclared exception!
      try { 
        convert.run();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Convert", e);
      }
  }
}
