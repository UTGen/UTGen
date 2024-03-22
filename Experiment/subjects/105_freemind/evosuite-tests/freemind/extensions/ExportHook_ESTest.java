/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Sun Mar 17 21:17:11 GMT 2024
 */

package freemind.extensions;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import freemind.extensions.ExportHook;
import java.io.File;
import java.util.logging.Logger;
import org.apache.commons.logging.impl.Jdk14Logger;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ExportHook_ESTest extends ExportHook_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetTranslatableResourceStringThrowsNullPointerException() throws Throwable  {
      // No Comments were added
      ExportHook exportHook = new ExportHook();
      // Undeclared exception!
      try { 
        exportHook.getTranslatableResourceString(".'uCJwXPi[o0\"|Y69TG");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("freemind.extensions.HookAdapter", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreateBufferedImageThrowsNullPointerException() throws Throwable  {
      // rollbacked to evosuite
      ExportHook exportHook = new ExportHook();
      // Undeclared exception!
      try { 
        exportHook.createBufferedImage();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("freemind.extensions.ExportHook", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCopyFromResourceThrowsNullPointerException() throws Throwable  {
      // rollbacked to evosuite
      ExportHook exportHook = new ExportHook();
      exportHook.logger = null;
      // Undeclared exception!
      try { 
        exportHook.copyFromResource("", "", "Yz<|");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("freemind.extensions.ExportHook", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesExportHookTakingNoArgumentsAndCallsCopyFromFile0() throws Throwable  {
      // No Comments were added
      ExportHook exportHook = new ExportHook();
      Jdk14Logger jdk14Logger = new Jdk14Logger("6_");
      Logger logger = jdk14Logger.getLogger();
      exportHook.logger = logger;
      exportHook.copyFromFile("Cannot find resource: ", "org.apache.batik.svggen.SVGBufferedImageOp", "L1EZ(+`!,6U");
      assertNull(exportHook.getName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCopyFromResource() throws Throwable  {
      // rollbacked to evosuite
      ExportHook exportHook = new ExportHook();
      exportHook.copyFromResource("&hG9", "&hG9", "&hG9");
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesExportHookTakingNoArgumentsAndCallsCopyFromFile1() throws Throwable  {
      // Given
      ExportHook exportHook = new ExportHook();
      EvoSuiteFile arg0 = new EvoSuiteFile("a+I~=i/a+I~=i");
      FileSystemHandling.appendStringToFile(arg0, "File not found or could not be copied. Was earching for ");
      
      // When
      exportHook.copyFromFile("a+I~=i", "a+I~=i", "a+I~=i");
      
      // Then
      assertNull(exportHook.getName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesImageFilterTaking2ArgumentsAndCallsGetDescription0() throws Throwable  {
      // Given: an ExportHook instance with the image filter "F8-F4'P"
      ExportHook.ImageFilter exportHook_ImageFilter = new ExportHook.ImageFilter("F8-F4'P", (String) null);
      
      // When: the getDescription method is called on the ExportHook instance
      String description = exportHook_ImageFilter.getDescription();
      
      // Then: the returned description should be "F8-F4'P"
      assertEquals("F8-F4'P", description);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesImageFilterTaking2ArgumentsAndCallsGetDescription1() throws Throwable  {
      // Tests the getDescription() method of the ExportHook.ImageFilter class
      // Creates a new instance of the ExportHook.ImageFilter class with the specified parameters
      ExportHook.ImageFilter imageFilter = new ExportHook.ImageFilter("22", "Q8n>iBoO%0QxLe%n");
      
      // Calls the getDescription() method on the created instance and stores the result in a variable
      String description = imageFilter.getDescription();
      
      // Asserts that the returned value is equal to the expected value
      assertEquals("Q8n>iBoO%0QxLe%n", description);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesImageFilterTaking2ArgumentsAndCallsAccept0() throws Throwable  {
      // Given an export hook and a mock file
      ExportHook.ImageFilter filter = new ExportHook.ImageFilter("4kqF/)pXA98=K+vw2", "4kqF/)pXA98=K+vw2");
      MockFile mockFile = new MockFile("", "");
      
      // When the filter accepts the file
      boolean accept = filter.accept(mockFile);
      
      // Then it should return true
      assertTrue(accept);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testChooseFileThrowsNullPointerException() throws Throwable  {
      ExportHook exportHook = new ExportHook();
      
      try {
      // Calling chooseFile with no valid file extension should throw a NullPointerException
      exportHook.chooseFile(".txt", ".doc", ".xls");
      fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      verifyException("freemind.extensions.ExportHook", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesImageFilterTaking2ArgumentsAndCallsAccept1() throws Throwable  {
      // Arrange
      ExportHook.ImageFilter imageFilter = new ExportHook.ImageFilter("22", "Q8n>iBoO%0QxLe%n");
      File file = MockFile.createTempFile("JrrFC9I@", "JrrFC9I@");
      
      // Act
      boolean result = imageFilter.accept(file);
      
      // Assert
      assertEquals("Q8n>iBoO%0QxLe%n", imageFilter.getDescription());
      assertFalse(result);
  }
}
