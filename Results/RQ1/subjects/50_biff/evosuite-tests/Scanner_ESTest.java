/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Thu Mar 21 02:32:39 GMT 2024
 */


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Scanner_ESTest extends Scanner_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAdvScanning0() throws Throwable  {
      // No Comments were added
      EvoSuiteFile arg0 = new EvoSuiteFile("3^1mT'#]lJ~T>nB");
      FileSystemHandling.appendLineToFile(arg0, "<=");
      FileSystemHandling.appendStringToFile(arg0, "oecned:TfROGRAM\n   F: <~, lHe&1p  coEumn 1");
      Scanner scanner = new Scanner("3^1mT'#]lJ~T>nB");
      ArrayList advScanning = scanner.advScanning(scanner.lexems);
      assertEquals(7, advScanning.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAdvScanning1() throws Throwable  {
      // Create a new EvoSuiteFile with some content
      EvoSuiteFile file = new EvoSuiteFile("3^1mT'#]lJ~T>nB");
      
      // Append a semicolon to the end of the file
      FileSystemHandling.appendLineToFile(file, ";");
      
      // Create a Scanner object with the same content as the EvoSuiteFile
      Scanner scanner = new Scanner("3^1mT'#]lJ~T>nB");
      
      // Call the advScanning method on the Scanner object and store the result in an ArrayList
      ArrayList<String> advScanning = scanner.advScanning(scanner.lexems);
      
      // Assert that the size of the ArrayList is equal to 1
      assertEquals(1, advScanning.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAdvScanning2() throws Throwable  {
      // Create a new EvoSuiteFile object with a file name
      EvoSuiteFile arg0 = new EvoSuiteFile("3^1mT'#]lJ~T>nB");
      
      // Append a string to the file
      FileSystemHandling.appendStringToFile(arg0, "===================");
      
      // Create a new Scanner object with the file name
      Scanner scanner = new Scanner("3^1mT'#]lJ~T>nB");
      
      // Use the Scanner object to scan the file and store the results in an ArrayList
      ArrayList advScanning = scanner.advScanning(scanner.lexems);
      
      // Assert that the size of the ArrayList is 19
      assertEquals(19, advScanning.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesScanner0() throws Throwable  {
      // Given a file containing the string "3^1mT'#]lJ~T>nB"
      EvoSuiteFile arg0 = new EvoSuiteFile("3^1mT'#]lJ~T>nB");
      
      // When the method appendStringToFile is called with the file and the string ":=" as arguments
      FileSystemHandling.appendStringToFile(arg0, ":=");
      
      // Then the file should now contain the string "3^1mT'#]lJ~T>nB:="
      Scanner scanner = new Scanner("3^1mT'#]lJ~T>nB:=");
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAdvScanning3() throws Throwable  {
      // rollbacked to evosuite
      EvoSuiteFile arg0 = new EvoSuiteFile("3^1mT'#]lJ~T>nB");
      FileSystemHandling.appendStringToFile(arg0, "INTEGER OR REAL VARIABLE");
      Scanner scanner = new Scanner("3^1mT'#]lJ~T>nB");
      ArrayList advScanning = scanner.advScanning(scanner.lexems);
      assertEquals(4, advScanning.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testPrintLexems() throws Throwable  {
      // rollbacked to evosuite
      EvoSuiteFile arg0 = new EvoSuiteFile("3^1mT'#]lJ~T>nB");
      FileSystemHandling.appendLineToFile(arg0, ";");
      Scanner scanner = new Scanner("3^1mT'#]lJ~T>nB");
      scanner.printLexems(scanner.lexems);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesScanner1() throws Throwable  {
      // Given: We have a EvoSuiteFile object "arg0" with data "3^1mT'#]lJ~T>nB" and a byte array "arg1" with one element.
      EvoSuiteFile arg0 = new EvoSuiteFile("3^1mT'#]lJ~T>nB");
      byte[] arg1 = new byte[3];
      arg1[0] = (byte)13;
      
      // When: We call the "appendDataToFile" method with "arg0" and "arg1".
      FileSystemHandling.appendDataToFile(arg0, arg1);
      
      // Then: The data in "arg0" should be appended to the file, and the scanner should read the contents of the file.
      Scanner scanner = new Scanner("3^1mT'#]lJ~T>nB");
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesScanner2() throws Throwable  {
      // Given: We have a EvoSuiteFile instance with the name "3^1mT'#]lJ~T>nB" and a byte array with length 5.
      EvoSuiteFile arg0 = new EvoSuiteFile("3^1mT'#]lJ~T>nB");
      byte[] arg1 = new byte[5];
      arg1[0] = (byte)71;
      arg1[1] = (byte)71;
      arg1[2] = (byte)9;
      
      // When: We call the appendDataToFile method with these arguments.
      FileSystemHandling.appendDataToFile(arg0, arg1);
      
      // Then: The data from the byte array should be appended to the file represented by the EvoSuiteFile instance.
      Scanner scanner = new Scanner("3^1mT'#]lJ~T>nB");
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesScanner3() throws Throwable  {
      // Given: A Java file with a single method that takes a string as input and appends it to a file
      // When: The method is called with a valid string and a file path
      EvoSuiteFile arg0 = new EvoSuiteFile("3^1mT'#]lJ~T>nB");
      FileSystemHandling.appendStringToFile(arg0, "expected: PROGRAM\n   found: END.\n   line: 1\n   column: 1");
      // Then: The method should append the string to the file and return true
      assertTrue(FileSystemHandling.appendStringToFile(arg0, "expected: PROGRAM\n   found: END.\n   line: 1\n   column: 1"));
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesScanner4() throws Throwable  {
      // rollbacked to evosuite
      EvoSuiteFile arg0 = new EvoSuiteFile("3^1mT'#]lJ~T>nB");
      FileSystemHandling.appendLineToFile(arg0, "l.");
      Scanner scanner = new Scanner("3^1mT'#]lJ~T>nB");
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesScanner5() throws Throwable  {
      // rollbacked to evosuite
      EvoSuiteFile arg0 = new EvoSuiteFile("3^1mT'#]lJ~T>nB");
      FileSystemHandling.appendLineToFile(arg0, ".");
      Scanner scanner = new Scanner("3^1mT'#]lJ~T>nB");
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAdvScanning4() throws Throwable  {
      // No Comments were added
      EvoSuiteFile arg0 = new EvoSuiteFile("3^1mT'#]lJ~T>nB");
      FileSystemHandling.appendStringToFile(arg0, "expected: PROGRAM\n   found: KEYWORD\n   line: 1\n   column: 1");
      FileSystemHandling.appendStringToFile(arg0, "O/vqD@49@7\"D]Ds-");
      Scanner scanner = new Scanner("3^1mT'#]lJ~T>nB");
      ArrayList advScanning = scanner.advScanning(scanner.lexems);
      assertEquals(11, advScanning.size());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesScanner6() throws Throwable  {
      // Create a new EvoSuiteFile with the specified name.
      EvoSuiteFile file = new EvoSuiteFile("3^1mT'#]lJ~T>nB");
      
      // Append the string "N u2<(g" to the file.
      FileSystemHandling.appendStringToFile(file, "N u2<(g");
      
      // Create a new Scanner that reads from the specified file.
      Scanner scanner = new Scanner("3^1mT'#]lJ~T>nB");
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesScanner7() throws Throwable  {
      // rollbacked to evosuite
      EvoSuiteFile arg0 = new EvoSuiteFile("3^1mT'#]lJ~T>nB");
      byte[] arg1 = new byte[7];
      arg1[0] = (byte)34;
      arg1[4] = (byte)13;
      FileSystemHandling.appendDataToFile(arg0, arg1);
      Scanner scanner = new Scanner("3^1mT'#]lJ~T>nB");
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesScanner8() throws Throwable  {
      // rollbacked to evosuite
      EvoSuiteFile arg0 = new EvoSuiteFile("3^1mT'#]lJ~T>nB");
      FileSystemHandling.appendStringToFile(arg0, "2.");
      Scanner scanner = new Scanner("3^1mT'#]lJ~T>nB");
  }
}
