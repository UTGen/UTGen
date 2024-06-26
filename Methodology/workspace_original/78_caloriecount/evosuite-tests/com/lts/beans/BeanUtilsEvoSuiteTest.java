/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.beans;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.LTSException;
import com.lts.beans.BeanUtils;
import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class BeanUtilsEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      File file0 = BeanUtils.classNameToClassFile((File) null, "6a08X)U~c5|',AqUlV");
      assertEquals("6a08X)U~c5|',AqUlV.class", file0.toString());
      assertNotNull(file0);
  }

  @Test
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try {
        BeanUtils.setValue((Object) "", (Object) null, (Method) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      SimpleBeanInfo simpleBeanInfo0 = new SimpleBeanInfo();
      try {
        BeanUtils.createBean((BeanInfo) simpleBeanInfo0);
        fail("Expecting exception: LTSException");
      } catch(LTSException e) {
        /*
         * java.lang.NullPointerException
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      String string0 = BeanUtils.toSetterName("getJ3)dka7C&");
      assertEquals("setGetJ3)dka7C&", string0);
      assertNotNull(string0);
  }

  @Test
  public void test4()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      try {
        BeanUtils.populateBean((Object) "getJ3)dka7C&", objectArray0);
        fail("Expecting exception: LTSException");
      } catch(LTSException e) {
        /*
         * Error trying to write bean property bytes, of class java.lang.String, to value null
         */
      }
  }

  @Test
  public void test5()  throws Throwable  {
      Class<?> class0 = BeanUtils.class;
      // Undeclared exception!
      try {
        BeanUtils.buildAbsolutePropertyName((Class) class0, (Method) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test6()  throws Throwable  {
      // Undeclared exception!
      try {
        BeanUtils.getValue((Object) "", (Method) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test7()  throws Throwable  {
      Class<?> class0 = BeanInfo.class;
      String string0 = BeanUtils.buildAbsolutePropertyName((Class) class0, "8.");
      assertNotNull(string0);
      assertEquals("java.beans.BeanInfo.8.", string0);
  }

  @Test
  public void test8()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      try {
        BeanUtils.createInstance((Constructor) null, objectArray0);
        fail("Expecting exception: LTSException");
      } catch(LTSException e) {
        /*
         * java.lang.NullPointerException
         */
      }
  }

  @Test
  public void test9()  throws Throwable  {
      String string0 = BeanUtils.toGetterName("j3)dka7C&");
      assertNotNull(string0);
      assertEquals("getJ3)dka7C&", string0);
  }

  @Test
  public void test10()  throws Throwable  {
      Class<?> class0 = Integer.class;
      // Undeclared exception!
      try {
        BeanUtils.toAbsoluteName((Class) class0, (PropertyDescriptor) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test11()  throws Throwable  {
      String string0 = BeanUtils.uscoreToClassName("S4_d;I6crv/(6");
      assertNotNull(string0);
      assertEquals("S4D;i6crv/(6", string0);
  }

  @Test
  public void test12()  throws Throwable  {
      String string0 = BeanUtils.toLowerName(".");
      assertEquals(".", string0);
      assertNotNull(string0);
  }

  @Test
  public void test13()  throws Throwable  {
      Class<?> class0 = CharSequence.class;
      String string0 = BeanUtils.getSimpleName(class0);
      assertEquals("CharSequence", string0);
      assertNotNull(string0);
  }

  @Test
  public void test14()  throws Throwable  {
      Class<?> class0 = BeanUtils.class;
      BeanUtils beanUtils0 = (BeanUtils)BeanUtils.createInstance(class0);
      assertNotNull(beanUtils0);
  }

  @Test
  public void test15()  throws Throwable  {
      File file0 = new File("4v", ".");
      File file1 = BeanUtils.classNameToJavaFile(file0, "4v");
      assertNotNull(file1);
      assertEquals("/mnt/fastdata/ac1gf/SF110/dist/78_caloriecount/4v/4v.java", file1.getCanonicalPath());
  }

  @Test
  public void test16()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(true);
      BeanUtils.setValue((Object) ".", (Object) boolean0, ".");
      assertEquals("true", boolean0.toString());
  }

  @Test
  public void test17()  throws Throwable  {
      String string0 = BeanUtils.dotsToPathSeparatots("Kzgnl-CM.P,-F*");
      assertEquals("Kzgnl-CM:P,-F*", string0);
      assertNotNull(string0);
  }

  @Test
  public void test18()  throws Throwable  {
      String string0 = BeanUtils.classNameToSlashName("4v");
      assertNotNull(string0);
      assertEquals(".", string0);
  }

  @Test
  public void test19()  throws Throwable  {
      File file0 = new File("");
      File file1 = BeanUtils.classNameToFile(file0, "", (String) null);
      assertNotNull(file1);
      assertEquals(true, file1.canRead());
  }

  @Test
  public void test20()  throws Throwable  {
      HashMap<Character, Short> hashMap0 = new HashMap<Character, Short>();
      try {
        BeanUtils.populateBean((Object) null, (Map) hashMap0);
        fail("Expecting exception: LTSException");
      } catch(LTSException e) {
        /*
         * Error trying to get the properies for bean of class null
         */
      }
  }

  @Test
  public void test21()  throws Throwable  {
      String string0 = BeanUtils.getPackageName("8.");
      assertEquals("8", string0);
      assertNotNull(string0);
  }

  @Test
  public void test22()  throws Throwable  {
      String string0 = BeanUtils.getPackageName("");
      assertNull(string0);
  }

  @Test
  public void test23()  throws Throwable  {
      PropertyDescriptor propertyDescriptor0 = new PropertyDescriptor("8", (Method) null, (Method) null);
      // Undeclared exception!
      try {
        BeanUtils.setPrimitiveProperty((Object) "8", "8.", propertyDescriptor0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test24()  throws Throwable  {
      Class<?> class0 = String.class;
      Boolean boolean0 = (Boolean)BeanUtils.toPrimitiveValue((Class) class0, (String) null);
      assertNull(boolean0);
  }

  @Test
  public void test25()  throws Throwable  {
      Class<?> class0 = Float.class;
      Constructor<Object> constructor0 = BeanUtils.getDefaultConstructor(class0);
      assertNull(constructor0);
  }

  @Test
  public void test26()  throws Throwable  {
      Class<?> class0 = BeanUtils.class;
      Constructor<Object> constructor0 = BeanUtils.getDefaultConstructor(class0);
      assertEquals(false, constructor0.isAccessible());
  }

  @Test
  public void test27()  throws Throwable  {
      Class<?> class0 = Float.class;
      boolean boolean0 = BeanUtils.isSimpleType(class0);
      assertEquals(true, boolean0);
  }

  @Test
  public void test28()  throws Throwable  {
      Class<?> class0 = Byte.class;
      boolean boolean0 = BeanUtils.isSimpleType(class0);
      assertEquals(true, boolean0);
  }

  @Test
  public void test29()  throws Throwable  {
      Class<?> class0 = Character.class;
      boolean boolean0 = BeanUtils.isSimpleType(class0);
      assertEquals(true, boolean0);
  }

  @Test
  public void test30()  throws Throwable  {
      Class<?> class0 = Double.class;
      boolean boolean0 = BeanUtils.isSimpleType(class0);
      assertEquals(true, boolean0);
  }

  @Test
  public void test31()  throws Throwable  {
      Class<?> class0 = Short.class;
      boolean boolean0 = BeanUtils.isSimpleType(class0);
      assertEquals(true, boolean0);
  }

  @Test
  public void test32()  throws Throwable  {
      Class<?> class0 = Integer.class;
      boolean boolean0 = BeanUtils.isSimpleType(class0);
      assertEquals(true, boolean0);
  }

  @Test
  public void test33()  throws Throwable  {
      Class<?> class0 = Long.class;
      boolean boolean0 = BeanUtils.isSimpleType(class0);
      assertEquals(true, boolean0);
  }

  @Test
  public void test34()  throws Throwable  {
      Class<?> class0 = String.class;
      boolean boolean0 = BeanUtils.isSimpleType(class0);
      assertEquals(true, boolean0);
  }

  @Test
  public void test35()  throws Throwable  {
      Class<?> class0 = CharSequence.class;
      boolean boolean0 = BeanUtils.isSimpleType(class0);
      assertEquals(false, boolean0);
  }

  @Test
  public void test36()  throws Throwable  {
      Class<?> class0 = Byte.class;
      // Undeclared exception!
      try {
        BeanUtils.toSimpleValue((Class) class0, "2&mA-QMCkjX%v");
        fail("Expecting exception: NumberFormatException");
      } catch(NumberFormatException e) {
        /*
         * For input string: \"2&mA-QMCkjX%v\"
         */
      }
  }

  @Test
  public void test37()  throws Throwable  {
      Class<?> class0 = BeanUtils.class;
      String string0 = (String)BeanUtils.toSimpleValue((Class) class0, "");
      assertEquals("", string0);
  }

  @Test
  public void test38()  throws Throwable  {
      Class<?> class0 = Short.class;
      // Undeclared exception!
      try {
        BeanUtils.toSimpleValue((Class) class0, (String) null);
        fail("Expecting exception: NumberFormatException");
      } catch(NumberFormatException e) {
        /*
         * null
         */
      }
  }

  @Test
  public void test39()  throws Throwable  {
      Class<?> class0 = Integer.class;
      // Undeclared exception!
      try {
        BeanUtils.toSimpleValue((Class) class0, "o");
        fail("Expecting exception: NumberFormatException");
      } catch(NumberFormatException e) {
        /*
         * For input string: \"o\"
         */
      }
  }

  @Test
  public void test40()  throws Throwable  {
      Class<?> class0 = Long.class;
      // Undeclared exception!
      try {
        BeanUtils.toSimpleValue((Class) class0, ">q>%y>`s#//4espqq");
        fail("Expecting exception: NumberFormatException");
      } catch(NumberFormatException e) {
        /*
         * For input string: \">q>%y>`s#//4espqq\"
         */
      }
  }

  @Test
  public void test41()  throws Throwable  {
      Class<?> class0 = Float.class;
      // Undeclared exception!
      try {
        BeanUtils.toSimpleValue((Class) class0, "");
        fail("Expecting exception: NumberFormatException");
      } catch(NumberFormatException e) {
        /*
         * empty String
         */
      }
  }

  @Test
  public void test42()  throws Throwable  {
      Class<?> class0 = Double.class;
      // Undeclared exception!
      try {
        BeanUtils.toSimpleValue((Class) class0, "t");
        fail("Expecting exception: NumberFormatException");
      } catch(NumberFormatException e) {
        /*
         * For input string: \"t\"
         */
      }
  }

  @Test
  public void test43()  throws Throwable  {
      Class<?> class0 = Character.class;
      Character character0 = (Character)BeanUtils.toSimpleValue((Class) class0, "o");
      assertEquals('o', (char)character0);
  }

  @Test
  public void test44()  throws Throwable  {
      String string0 = BeanUtils.getSimpleName("4v");
      assertEquals("4v", string0);
      assertNotNull(string0);
  }
}
