/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Thu Mar 21 10:59:20 GMT 2024
 */

package edu.mscd.cs.jclo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import edu.mscd.cs.jclo.JCLO;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class JCLO_Original_ESTest extends JCLO_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testToStringReturningEmptyString() throws Throwable  {
      Object arg0 = new Object();
      JCLO jCLO = new JCLO(arg0);
      String string = jCLO.toString();
      assertEquals("", string);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetCharsReturningNull() throws Throwable  {
      JCLO jCLO = new JCLO("-JZ", "-JZ");
      char[] chars = jCLO.getChars("-JZ");
      assertNull(chars);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetByteReturningPositive() throws Throwable  {
      Byte arg0 = new Byte((byte) (-98));
      JCLO jCLO = new JCLO(arg0);
      byte _byte = jCLO.getByte("MAX_VALUE");
      assertEquals((byte)127, _byte);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetBoolean() throws Throwable  {
      JCLO arg0 = new JCLO("f", "f");
      JCLO jCLO = new JCLO(arg0);
      boolean _boolean = jCLO.getBoolean("doubleDashes");
      assertFalse(_boolean);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetValueReturningNull() throws Throwable  {
      Byte arg0 = new Byte((byte) (-64));
      JCLO jCLO = new JCLO(arg0);
      Object value = jCLO.getValue("r");
      assertNull(value);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetValueReturningNonNull() throws Throwable  {
      Byte arg0 = new Byte((byte) (-37));
      JCLO jCLO = new JCLO(arg0);
      Class value = (Class)jCLO.getValue("TYPE");
      assertFalse(value.isInterface());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testMain0() throws Throwable  {
      String[] arg0 = new String[1];
      arg0[0] = "--version";
      JCLO.main(arg0);
      assertEquals(1, arg0.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testMain1() throws Throwable  {
      String[] arg0 = new String[1];
      arg0[0] = "MAX_VALUE";
      JCLO.main(arg0);
      assertEquals(1, arg0.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testMainWithEmptyArray() throws Throwable  {
      String[] arg0 = new String[0];
      JCLO.main(arg0);
      assertEquals(0, arg0.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testParseThrowsNumberFormatException0() throws Throwable  {
      Byte arg1 = new Byte((byte) (-82));
      JCLO jCLO = new JCLO("serialVersionUID", arg1);
      String[] arg0 = new String[8];
      arg0[0] = "-";
      // Undeclared exception!
      try { 
        jCLO.parse(arg0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // null
         //
         verifyException("java.lang.Long", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testParseThrowsNumberFormatException1() throws Throwable  {
      Byte arg1 = new Byte((byte)1);
      JCLO jCLO = new JCLO("BYTES", arg1);
      String[] arg0 = new String[9];
      arg0[0] = "-";
      // Undeclared exception!
      try { 
        jCLO.parse(arg0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // null
         //
         verifyException("java.lang.Integer", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testParseThrowsNullPointerException() throws Throwable  {
      Object arg1 = new Object();
      String[][] arg2 = new String[5][4];
      String[] stringArray = new String[6];
      stringArray[0] = "";
      arg2[0] = stringArray;
      String[] arg0 = new String[6];
      arg0[0] = "-";
      JCLO jCLO = new JCLO("", arg1, arg2);
      // Undeclared exception!
      try { 
        jCLO.parse(arg0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesJCLOTaking3Arguments() throws Throwable  {
      Byte arg1 = new Byte((byte) (-27));
      String[][] arg2 = new String[2][0];
      String[] arg0 = new String[2];
      arg2[0] = arg0;
      arg0[0] = "-";
      arg2[1] = arg0;
      JCLO jCLO = new JCLO("TYPE", arg1, arg2);
      jCLO.parse(arg0);
      assertEquals(2, arg0.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testParseThrowsNumberFormatException2() throws Throwable  {
      Byte arg1 = new Byte((byte) (-123));
      JCLO jCLO = new JCLO("MIN_VALUE", arg1);
      String[] arg0 = new String[9];
      arg0[0] = "-";
      // Undeclared exception!
      try { 
        jCLO.parse(arg0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // null
         //
         verifyException("java.lang.Integer", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testParseThrowsIllegalArgumentException0() throws Throwable  {
      JCLO jCLO = new JCLO("-s?PWjzO=#", "-s?PWjzO=#");
      String[] arg0 = new String[1];
      arg0[0] = "-s?PWjzO=#";
      // Undeclared exception!
      try { 
        jCLO.parse(arg0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No such option: \"?PWjzO\"
         //
         verifyException("edu.mscd.cs.jclo.JCLO", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testParseThrowsIllegalArgumentException1() throws Throwable  {
      Byte arg1 = new Byte((byte) (-102));
      JCLO jCLO = new JCLO("MIN_VALUE", arg1);
      String[] arg0 = new String[8];
      arg0[0] = "--";
      // Undeclared exception!
      try { 
        jCLO.parse(arg0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // '--' requires '=VALUE'
         //
         verifyException("edu.mscd.cs.jclo.JCLO", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testParse() throws Throwable  {
      String[] arg0 = new String[1];
      arg0[0] = "dN$";
      JCLO jCLO = new JCLO("dN$");
      jCLO.parse(arg0);
      assertEquals(1, arg0.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testUsageReturningEmptyString() throws Throwable  {
      JCLO jCLO = new JCLO("2", "2");
      String usage = jCLO.usage();
      assertEquals("", usage);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesJCLOTakingObject() throws Throwable  {
      JCLO arg0 = new JCLO("2", "2");
      JCLO jCLO = new JCLO(arg0);
      String usage = jCLO.usage();
      assertEquals("-aliases String;...\n-doubleDashes\n-fields Field...\n-hasEquals\n-object Object\n-prefix String\n", usage);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testUsage() throws Throwable  {
      JCLO jCLO = new JCLO("", "");
      String usage = jCLO.usage();
      assertEquals("-hash int\n", usage);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testToStringReturningNonEmptyString() throws Throwable  {
      Byte arg0 = new Byte((byte)11);
      JCLO jCLO = new JCLO(arg0);
      String string = jCLO.toString();
      assertEquals("byte: value = 11\nlong: serialVersionUID = -7183698231559129828\nbyte: MAX_VALUE = 127\nbyte: MIN_VALUE = -128\nint: BYTES = 1\nint: SIZE = 8\nClass: TYPE = byte", string);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testToStringThrowsClassCastException() throws Throwable  {
      JCLO jCLO = new JCLO("dN$");
      // Undeclared exception!
      try { 
        jCLO.toString();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // [C cannot be cast to [Ljava.lang.Object;
         //
         verifyException("edu.mscd.cs.jclo.JCLO", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetBytes() throws Throwable  {
      JCLO jCLO = new JCLO("SIZE");
      byte[] bytes = jCLO.getBytes("SIZE");
      assertNull(bytes);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetLongs() throws Throwable  {
      JCLO jCLO = new JCLO("d4additional");
      long[] longs = jCLO.getLongs("d4additional");
      assertNull(longs);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetShortThrowsNullPointerException() throws Throwable  {
      JCLO jCLO = new JCLO(")VD<Afb-2vr&=jk$Ix|value");
      // Undeclared exception!
      try { 
        jCLO.getShort(")VD<Afb-2vr&=jk$Ix|value");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.mscd.cs.jclo.JCLO", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetFloats() throws Throwable  {
      JCLO jCLO = new JCLO("f");
      float[] floats = jCLO.getFloats("f");
      assertNull(floats);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetStrings() throws Throwable  {
      JCLO jCLO = new JCLO("");
      String[] strings = jCLO.getStrings("");
      assertNull(strings);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetFloatThrowsNullPointerException() throws Throwable  {
      JCLO jCLO = new JCLO("d");
      // Undeclared exception!
      try { 
        jCLO.getFloat("d");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.mscd.cs.jclo.JCLO", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetDoubleThrowsNullPointerException() throws Throwable  {
      JCLO jCLO = new JCLO(")VD<Afb-2vr&=jk$Ix|value");
      // Undeclared exception!
      try { 
        jCLO.getDouble(")VD<Afb-2vr&=jk$Ix|value");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("edu.mscd.cs.jclo.JCLO", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesJCLOTaking2Arguments() throws Throwable  {
      Object arg0 = new Object();
      String[][] arg1 = new String[0][0];
      JCLO jCLO = new JCLO(arg0, arg1);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetDoubles() throws Throwable  {
      Byte arg1 = new Byte((byte)1);
      JCLO jCLO = new JCLO("BYTES", arg1);
      double[] doubles = jCLO.getDoubles("BYTES");
      assertNull(doubles);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetCharsReturningEmptyArray() throws Throwable  {
      JCLO jCLO = new JCLO("", "");
      char[] chars = jCLO.getChars("value");
      assertArrayEquals(new char[] {}, chars);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetByteReturningNegative() throws Throwable  {
      Byte arg1 = new Byte((byte) (-123));
      JCLO jCLO = new JCLO("", arg1);
      byte _byte = jCLO.getByte("MIN_VALUE");
      assertEquals((byte) (-128), _byte);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetShorts() throws Throwable  {
      Byte arg0 = new Byte((byte) (-64));
      JCLO jCLO = new JCLO(arg0);
      short[] shorts = jCLO.getShorts("mgtX1x6WMlzi.cg1");
      assertNull(shorts);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetInt() throws Throwable  {
      JCLO jCLO = new JCLO("", "");
      int _int = jCLO.getInt("hash");
      assertEquals(0, _int);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetString() throws Throwable  {
      JCLO jCLO = new JCLO(",");
      String string = jCLO.getString(",");
      assertNull(string);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetCharThrowsClassCastException() throws Throwable  {
      JCLO jCLO = new JCLO("CASE_INSENSITIVE_ORDER");
      // Undeclared exception!
      try { 
        jCLO.getChar("CASE_INSENSITIVE_ORDER");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.Character
         //
         verifyException("edu.mscd.cs.jclo.JCLO", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetInts() throws Throwable  {
      Byte arg1 = new Byte((byte) (-123));
      JCLO jCLO = new JCLO("MIN_VALUE", arg1);
      int[] ints = jCLO.getInts(".");
      assertNull(ints);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetLong() throws Throwable  {
      JCLO jCLO = new JCLO("");
      long _long = jCLO.getLong("serialVersionUID");
      assertEquals((-6849794470754667710L), _long);
  }
}
