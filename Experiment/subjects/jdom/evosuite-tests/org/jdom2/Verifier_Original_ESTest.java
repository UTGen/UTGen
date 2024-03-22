/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Tue Mar 19 19:20:08 GMT 2024
 */

package org.jdom2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jdom2.Attribute;
import org.jdom2.AttributeType;
import org.jdom2.Element;
import org.jdom2.EntityRef;
import org.jdom2.Namespace;
import org.jdom2.Text;
import org.jdom2.Verifier;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Verifier_Original_ESTest extends Verifier_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckURI0() throws Throwable  {
      String checkURI = Verifier.checkURI(":59_/TPN??JN%C");
      assertEquals("Percent signs in URIs must be followed by exactly two hexadecimal digits.", checkURI);
      assertNotNull(checkURI);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsXMLWhitespaceReturningFalse() throws Throwable  {
      boolean xMLWhitespace = Verifier.isXMLWhitespace('C');
      assertFalse(xMLWhitespace);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDecodeSurrogatePairReturningNegative() throws Throwable  {
      int decodeSurrogatePair = Verifier.decodeSurrogatePair('r', 'r');
      assertEquals((-56497038), decodeSurrogatePair);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckNamespaceCollisionTaking1And1AndCheckNamespaceCollisionTaking1And10() throws Throwable  {
      Namespace arg0 = Namespace.NO_NAMESPACE;
      Element arg1 = new Element("VQFS", arg0);
      String checkNamespaceCollision = Verifier.checkNamespaceCollision(arg0, arg1);
      assertNull(checkNamespaceCollision);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckAttributeNameReturningNull() throws Throwable  {
      String checkAttributeName = Verifier.checkAttributeName("no");
      assertNull(checkAttributeName);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsXMLWhitespace0() throws Throwable  {
      boolean xMLWhitespace = Verifier.isXMLWhitespace('\n');
      assertTrue(xMLWhitespace);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsXMLNameStartCharacterReturningFalse() throws Throwable  {
      boolean xMLNameStartCharacter = Verifier.isXMLNameStartCharacter('^');
      assertFalse(xMLNameStartCharacter);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsXMLNameStartCharacterWithOtherChar() throws Throwable  {
      boolean xMLNameStartCharacter = Verifier.isXMLNameStartCharacter(':');
      assertTrue(xMLNameStartCharacter);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsXMLNameStartCharacter() throws Throwable  {
      boolean xMLNameStartCharacter = Verifier.isXMLNameStartCharacter('L');
      assertTrue(xMLNameStartCharacter);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsXMLNameCharacter() throws Throwable  {
      boolean xMLNameCharacter = Verifier.isXMLNameCharacter('M');
      assertTrue(xMLNameCharacter);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsXMLNameCharacterReturningFalse() throws Throwable  {
      boolean xMLNameCharacter = Verifier.isXMLNameCharacter('@');
      assertFalse(xMLNameCharacter);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsXMLNameCharacterWithOtherChar() throws Throwable  {
      boolean xMLNameCharacter = Verifier.isXMLNameCharacter(':');
      assertTrue(xMLNameCharacter);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsURICharacterReturningTrue() throws Throwable  {
      boolean uRICharacter = Verifier.isURICharacter('4');
      assertTrue(uRICharacter);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsURICharacterReturningFalse() throws Throwable  {
      boolean uRICharacter = Verifier.isURICharacter('#');
      assertFalse(uRICharacter);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsHexDigitReturningFalse() throws Throwable  {
      boolean hexDigit = Verifier.isHexDigit('g');
      assertFalse(hexDigit);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsHexDigitWithAlphabeticChar() throws Throwable  {
      boolean hexDigit = Verifier.isHexDigit('A');
      assertTrue(hexDigit);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsHexDigitWithDigit() throws Throwable  {
      boolean hexDigit = Verifier.isHexDigit('1');
      assertTrue(hexDigit);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckXMLNameReturningNull() throws Throwable  {
      String checkXMLName = Verifier.checkXMLName("Tmns");
      assertNull(checkXMLName);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckXMLName() throws Throwable  {
      String checkXMLName = Verifier.checkXMLName(":GTjpe&");
      assertNotNull(checkXMLName);
      assertEquals("XML names cannot contain the character \"&\"", checkXMLName);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsXMLPublicIDCharacterAndIsXMLPublicIDCharacterWithOtherChar0() throws Throwable  {
      boolean xMLPublicIDCharacter = Verifier.isXMLPublicIDCharacter('%');
      assertTrue(xMLPublicIDCharacter);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsXMLPublicIDCharacterAndIsXMLPublicIDCharacterWithOtherChar1() throws Throwable  {
      boolean xMLPublicIDCharacter = Verifier.isXMLPublicIDCharacter(' ');
      assertTrue(xMLPublicIDCharacter);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsXMLPublicIDCharacterWithDigit() throws Throwable  {
      boolean xMLPublicIDCharacter = Verifier.isXMLPublicIDCharacter('7');
      assertTrue(xMLPublicIDCharacter);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsXMLPublicIDCharacter0() throws Throwable  {
      boolean xMLPublicIDCharacter = Verifier.isXMLPublicIDCharacter('N');
      assertTrue(xMLPublicIDCharacter);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsXMLPublicIDCharacter1() throws Throwable  {
      boolean xMLPublicIDCharacter = Verifier.isXMLPublicIDCharacter('p');
      assertTrue(xMLPublicIDCharacter);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckNamespaceCollisionTaking11And1AndCheckNamespaceCollisionTaking11And10() throws Throwable  {
      Namespace arg0 = Namespace.XML_NAMESPACE;
      LinkedList<Object> arg1 = new LinkedList<Object>();
      arg1.add((Object) arg0);
      String checkNamespaceCollision = Verifier.checkNamespaceCollision(arg0, (List<?>) arg1, (-570));
      assertNull(checkNamespaceCollision);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckNamespaceCollisionTaking11And1ReturningNonEmptyStringAndCheckNamespaceCollisionTaking11And10() throws Throwable  {
      Namespace arg0 = Namespace.getNamespace("org.jdom2.Verifier");
      Attribute attribute = new Attribute("org.jdom2.Verifier", "'@XJyYZ");
      List<Namespace> arg1 = attribute.getNamespacesInScope();
      String checkNamespaceCollision = Verifier.checkNamespaceCollision(arg0, arg1, 35);
      assertNotNull(checkNamespaceCollision);
      assertEquals("The namespace prefix \"\" collides with an additional namespace declared by the element", checkNamespaceCollision);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckNamespaceCollisionTaking11And1WithNull() throws Throwable  {
      Namespace arg0 = Namespace.XML_NAMESPACE;
      String checkNamespaceCollision = Verifier.checkNamespaceCollision(arg0, (List<?>) null, (-115));
      assertNull(checkNamespaceCollision);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckNamespaceCollisionTaking1And1ReturningNonEmptyString() throws Throwable  {
      Namespace arg2 = Namespace.getNamespace("org.jdom2.Verifier", "org.jdom2.Verifier");
      Attribute arg1 = new Attribute("org.jdom2.Verifier", "org.jdom2.Verifier", arg2);
      Namespace arg0 = Namespace.getNamespace("org.jdom2.Verifier", "%{CQ\"YRTT@ hiCmXW{{");
      String checkNamespaceCollision = Verifier.checkNamespaceCollision(arg0, arg1);
      assertEquals("The namespace prefix \"org.jdom2.Verifier\" collides with an attribute namespace prefix on the element", checkNamespaceCollision);
      assertNotNull(checkNamespaceCollision);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckNamespaceCollisionTaking11And1AndCheckNamespaceCollisionTaking11And11() throws Throwable  {
      Attribute arg0 = new Attribute("q", "q");
      String checkNamespaceCollision = Verifier.checkNamespaceCollision(arg0, (Element) null, 540);
      assertNull(checkNamespaceCollision);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckNamespaceCollisionTaking2NamespacesReturningNonEmptyString() throws Throwable  {
      Namespace arg0 = Namespace.getNamespace("&9,h?l");
      Namespace arg1 = Namespace.getNamespace("URIs cannot contain 0x5d");
      String checkNamespaceCollision = Verifier.checkNamespaceCollision(arg0, arg1);
      assertNotNull(checkNamespaceCollision);
      assertEquals("The namespace prefix \"\" collides", checkNamespaceCollision);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckNamespaceCollisionTaking2Namespaces0() throws Throwable  {
      Namespace arg1 = Namespace.XML_NAMESPACE;
      String checkNamespaceCollision = Verifier.checkNamespaceCollision(arg1, arg1);
      assertNull(checkNamespaceCollision);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckCharacterDataReturningNonEmptyString() throws Throwable  {
      String checkCharacterData = Verifier.checkCharacterData((String) null);
      assertEquals("A null is not a legal XML value", checkCharacterData);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsAllXMLWhitespaceReturningFalse() throws Throwable  {
      boolean allXMLWhitespace = Verifier.isAllXMLWhitespace("d*Wtt\n");
      assertFalse(allXMLWhitespace);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsAllXMLWhitespaceReturningTrue() throws Throwable  {
      boolean allXMLWhitespace = Verifier.isAllXMLWhitespace("");
      assertTrue(allXMLWhitespace);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsXMLWhitespace1() throws Throwable  {
      boolean xMLWhitespace = Verifier.isXMLWhitespace('\r');
      assertTrue(xMLWhitespace);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsXMLWhitespace2() throws Throwable  {
      boolean xMLWhitespace = Verifier.isXMLWhitespace('\t');
      assertTrue(xMLWhitespace);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test0() throws Throwable  {
      String normalizeString = Text.normalizeString("Percent signs in URIs must be followed by exactly two hexadecimal digits.");
      assertEquals("Percent signs in URIs must be followed by exactly two hexadecimal digits.", normalizeString);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsXMLDigitReturningTrue() throws Throwable  {
      boolean xMLDigit = Verifier.isXMLDigit('9');
      assertTrue(xMLDigit);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsXMLDigitReturningFalse() throws Throwable  {
      boolean xMLDigit = Verifier.isXMLDigit('C');
      assertFalse(xMLDigit);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsXMLExtender0() throws Throwable  {
      boolean xMLExtender = Verifier.isXMLExtender('&');
      assertFalse(xMLExtender);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsXMLExtender1() throws Throwable  {
      boolean xMLExtender = Verifier.isXMLExtender('\uFFF9');
      assertFalse(xMLExtender);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsXMLCombiningChar() throws Throwable  {
      boolean xMLCombiningChar = Verifier.isXMLCombiningChar('\r');
      assertFalse(xMLCombiningChar);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsXMLLetterReturningTrue() throws Throwable  {
      boolean xMLLetter = Verifier.isXMLLetter('U');
      assertTrue(xMLLetter);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsXMLLetterReturningFalse() throws Throwable  {
      boolean xMLLetter = Verifier.isXMLLetter('[');
      assertFalse(xMLLetter);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsXMLLetterOrDigitReturningTrue() throws Throwable  {
      boolean xMLLetterOrDigit = Verifier.isXMLLetterOrDigit('q');
      assertTrue(xMLLetterOrDigit);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsXMLLetterOrDigitReturningFalse() throws Throwable  {
      boolean xMLLetterOrDigit = Verifier.isXMLLetterOrDigit('<');
      assertFalse(xMLLetterOrDigit);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsXMLCharacterAndIsXMLCharacterReturningTrue0() throws Throwable  {
      boolean xMLCharacter = Verifier.isXMLCharacter(406);
      assertTrue(xMLCharacter);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsXMLCharacterAndIsXMLCharacterReturningTrue1() throws Throwable  {
      boolean xMLCharacter = Verifier.isXMLCharacter(65536);
      assertTrue(xMLCharacter);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsXMLCharacterAndIsXMLCharacterReturningFalse0() throws Throwable  {
      boolean xMLCharacter = Verifier.isXMLCharacter(10549237);
      assertFalse(xMLCharacter);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsXMLCharacterAndIsXMLCharacterReturningFalse1() throws Throwable  {
      boolean xMLCharacter = Verifier.isXMLCharacter(29);
      assertFalse(xMLCharacter);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsLowSurrogate() throws Throwable  {
      boolean lowSurrogate = Verifier.isLowSurrogate(':');
      assertFalse(lowSurrogate);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsHighSurrogate() throws Throwable  {
      boolean highSurrogate = Verifier.isHighSurrogate('\\');
      assertFalse(highSurrogate);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsHexDigitReturningTrue() throws Throwable  {
      boolean hexDigit = Verifier.isHexDigit('b');
      assertTrue(hexDigit);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsHexDigitWithOtherChar() throws Throwable  {
      boolean hexDigit = Verifier.isHexDigit('\u000B');
      assertFalse(hexDigit);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckURI1() throws Throwable  {
      String checkURI = Verifier.checkURI("Q%B=#T7AQ.`52:LbJJ");
      assertEquals("Percent signs in URIs must be followed by exactly two hexadecimal digits.", checkURI);
      assertNotNull(checkURI);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckURI2() throws Throwable  {
      String checkURI = Verifier.checkURI("6w%~{*'0Z[");
      assertEquals("Percent signs in URIs must be followed by exactly two hexadecimal digits.", checkURI);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckURIReturningNull() throws Throwable  {
      String checkURI = Verifier.checkURI("org.jdom2.Verifier");
      assertNull(checkURI);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckURI3() throws Throwable  {
      String checkURI = Verifier.checkURI("0x%04x is not a legal XML character");
      assertEquals("URIs cannot contain 0x20", checkURI);
      assertNotNull(checkURI);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckURIWithEmptyString() throws Throwable  {
      String checkURI = Verifier.checkURI("");
      assertNull(checkURI);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckURIWithNull() throws Throwable  {
      String checkURI = Verifier.checkURI((String) null);
      assertNull(checkURI);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test1() throws Throwable  {
      EntityRef entityRef = null;
      try {
        entityRef = new EntityRef("&W+`X0", " with an attribute namespace prefix on the element", "&W+`X0");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The name \"&W+`X0\" is not legal for JDOM/XML EntityRefs: XML names cannot begin with the character \"&\".
         //
         verifyException("org.jdom2.EntityRef", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test2() throws Throwable  {
      EntityRef entityRef = null;
      try {
        entityRef = new EntityRef("", "{$?+c&,=@4Ton,Fr@");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The name \"\" is not legal for JDOM/XML EntityRefs: XML names cannot be empty.
         //
         verifyException("org.jdom2.EntityRef", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckXMLNameWithNull() throws Throwable  {
      String checkXMLName = Verifier.checkXMLName((String) null);
      assertEquals("XML names cannot be null", checkXMLName);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckSystemLiteralReturningNonEmptyString() throws Throwable  {
      String checkSystemLiteral = Verifier.checkSystemLiteral("Qk\"L8;'U^%4~T8;G");
      assertEquals("System literals cannot simultaneously contain both single and double quotes.", checkSystemLiteral);
      assertNotNull(checkSystemLiteral);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckSystemLiteral0() throws Throwable  {
      String checkSystemLiteral = Verifier.checkSystemLiteral("ID");
      assertNull(checkSystemLiteral);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckSystemLiteralWithNull() throws Throwable  {
      String checkSystemLiteral = Verifier.checkSystemLiteral((String) null);
      assertNull(checkSystemLiteral);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckSystemLiteral1() throws Throwable  {
      String checkSystemLiteral = Verifier.checkSystemLiteral("7eB(YGl[S9-z'PCB|Fc");
      assertNull(checkSystemLiteral);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckPublicIDWithNull() throws Throwable  {
      String checkPublicID = Verifier.checkPublicID((String) null);
      assertNull(checkPublicID);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsXMLPublicIDCharacterAndIsXMLPublicIDCharacterWithOtherChar2() throws Throwable  {
      boolean xMLPublicIDCharacter = Verifier.isXMLPublicIDCharacter('\t');
      assertTrue(xMLPublicIDCharacter);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsXMLPublicIDCharacterAndIsXMLPublicIDCharacterWithOtherChar3() throws Throwable  {
      boolean xMLPublicIDCharacter = Verifier.isXMLPublicIDCharacter('\r');
      assertTrue(xMLPublicIDCharacter);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsXMLPublicIDCharacterAndIsXMLPublicIDCharacterWithOtherChar4() throws Throwable  {
      boolean xMLPublicIDCharacter = Verifier.isXMLPublicIDCharacter('\n');
      assertTrue(xMLPublicIDCharacter);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckPublicID() throws Throwable  {
      String checkPublicID = Verifier.checkPublicID("0x%04x is not a legal XML character");
      assertNull(checkPublicID);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsXMLPublicIDCharacterAndIsXMLPublicIDCharacterWithOtherChar5() throws Throwable  {
      boolean xMLPublicIDCharacter = Verifier.isXMLPublicIDCharacter('_');
      assertTrue(xMLPublicIDCharacter);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsXMLPublicIDCharacterAndIsXMLPublicIDCharacterWithOtherChar6() throws Throwable  {
      boolean xMLPublicIDCharacter = Verifier.isXMLPublicIDCharacter('$');
      assertTrue(xMLPublicIDCharacter);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsXMLPublicIDCharacterAndIsXMLPublicIDCharacterWithOtherChar7() throws Throwable  {
      boolean xMLPublicIDCharacter = Verifier.isXMLPublicIDCharacter('#');
      assertTrue(xMLPublicIDCharacter);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsXMLPublicIDCharacterAndIsXMLPublicIDCharacterWithOtherChar8() throws Throwable  {
      boolean xMLPublicIDCharacter = Verifier.isXMLPublicIDCharacter('=');
      assertTrue(xMLPublicIDCharacter);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsXMLPublicIDCharacterAndIsXMLPublicIDCharacterWithOtherChar9() throws Throwable  {
      boolean xMLPublicIDCharacter = Verifier.isXMLPublicIDCharacter('!');
      assertTrue(xMLPublicIDCharacter);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsXMLPublicIDCharacterReturningFalse() throws Throwable  {
      boolean xMLPublicIDCharacter = Verifier.isXMLPublicIDCharacter('\uFFF4');
      assertFalse(xMLPublicIDCharacter);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckPublicIDReturningNonEmptyString() throws Throwable  {
      String checkPublicID = Verifier.checkPublicID(" 'D;Y)iQ:-4[>;4");
      assertEquals("[ is not a legal character in public IDs", checkPublicID);
      assertNotNull(checkPublicID);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckCommentDataReturningNull() throws Throwable  {
      String checkCommentData = Verifier.checkCommentData("zaMd~");
      assertNull(checkCommentData);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckCommentData0() throws Throwable  {
      String checkCommentData = Verifier.checkCommentData("<!--");
      assertEquals("Comments cannot contain double hyphens (--)", checkCommentData);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckCommentDataWithNull() throws Throwable  {
      String checkCommentData = Verifier.checkCommentData((String) null);
      assertEquals("A null is not a legal XML value", checkCommentData);
      assertNotNull(checkCommentData);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckCommentData1() throws Throwable  {
      String checkCommentData = Verifier.checkCommentData("-");
      assertEquals("Comment data cannot end with a hyphen.", checkCommentData);
      assertNotNull(checkCommentData);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckProcessingInstructionDataWithNonEmptyString() throws Throwable  {
      String checkProcessingInstructionData = Verifier.checkProcessingInstructionData("?>");
      assertNotNull(checkProcessingInstructionData);
      assertEquals("Processing instructions cannot contain the string \"?>\"", checkProcessingInstructionData);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckProcessingInstructionDataReturningNull() throws Throwable  {
      String checkProcessingInstructionData = Verifier.checkProcessingInstructionData("");
      assertNull(checkProcessingInstructionData);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckProcessingInstructionDataWithNull() throws Throwable  {
      String checkProcessingInstructionData = Verifier.checkProcessingInstructionData((String) null);
      assertNotNull(checkProcessingInstructionData);
      assertEquals("A null is not a legal XML value", checkProcessingInstructionData);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckProcessingInstructionTarget0() throws Throwable  {
      String checkProcessingInstructionTarget = Verifier.checkProcessingInstructionTarget("xml");
      assertNotNull(checkProcessingInstructionTarget);
      assertEquals("Processing instructions cannot have a target of \"xml\" in any combination of case. (Note that the \"<?xml ... ?>\" declaration at the beginning of a document is not a processing instruction and should not be added as one; it is written automatically during output, e.g. by XMLOutputter.)", checkProcessingInstructionTarget);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckProcessingInstructionTarget1() throws Throwable  {
      String checkProcessingInstructionTarget = Verifier.checkProcessingInstructionTarget("Ptfw:cF");
      assertEquals("Processing instruction targets cannot contain colons", checkProcessingInstructionTarget);
      assertNotNull(checkProcessingInstructionTarget);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckProcessingInstructionTarget2() throws Throwable  {
      String checkProcessingInstructionTarget = Verifier.checkProcessingInstructionTarget(": ");
      assertEquals("XML names cannot contain the character \" \"", checkProcessingInstructionTarget);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckProcessingInstructionTargetReturningNull() throws Throwable  {
      String checkProcessingInstructionTarget = Verifier.checkProcessingInstructionTarget("L");
      assertNull(checkProcessingInstructionTarget);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckNamespaceCollisionTaking1And10() throws Throwable  {
      Namespace arg0 = Namespace.XML_NAMESPACE;
      Attribute arg1 = new Attribute("Tmns", "Tmns", arg0);
      String checkNamespaceCollision = Verifier.checkNamespaceCollision(arg0, arg1);
      assertNull(checkNamespaceCollision);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckNamespaceCollisionTaking1And11() throws Throwable  {
      Namespace arg0 = Namespace.NO_NAMESPACE;
      Attribute arg1 = new Attribute("VQFe", "VQFe", arg0);
      String checkNamespaceCollision = Verifier.checkNamespaceCollision(arg0, arg1);
      assertNull(checkNamespaceCollision);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckNamespaceCollisionTaking11And1WithZero() throws Throwable  {
      Element element = new Element("Qer", "Qer", "Qer");
      Element arg1 = element.setAttribute("Qer", "Qer");
      Namespace arg0 = Namespace.NO_NAMESPACE;
      String checkNamespaceCollision = Verifier.checkNamespaceCollision(arg0, arg1, 0);
      assertNull(checkNamespaceCollision);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckNamespaceCollisionTaking11And1ThrowsNullPointerException() throws Throwable  {
      Attribute arg0 = new Attribute("xOQP73y", "xOQP73y");
      Namespace namespace = Namespace.XML_NAMESPACE;
      arg0.namespace = namespace;
      // Undeclared exception!
      try { 
        Verifier.checkNamespaceCollision(arg0, (Element) null, 468);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jdom2.Verifier", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckNamespaceCollisionTaking11And1ReturningNonEmptyStringAndCheckNamespaceCollisionTaking11And11() throws Throwable  {
      Element arg1 = new Element("K");
      Namespace arg0 = Namespace.getNamespace("K");
      String checkNamespaceCollision = Verifier.checkNamespaceCollision(arg0, arg1, 2100);
      assertEquals("The namespace prefix \"\" collides with the element namespace prefix", checkNamespaceCollision);
      assertNotNull(checkNamespaceCollision);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckNamespaceCollisionTaking2Namespaces1() throws Throwable  {
      Namespace arg0 = Namespace.NO_NAMESPACE;
      Namespace arg1 = Namespace.XML_NAMESPACE;
      String checkNamespaceCollision = Verifier.checkNamespaceCollision(arg0, arg1);
      assertNull(checkNamespaceCollision);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckNamespaceURI0() throws Throwable  {
      String checkNamespaceURI = Verifier.checkNamespaceURI("\n");
      assertEquals("Namespace URIs cannot begin with white-space", checkNamespaceURI);
      assertNotNull(checkNamespaceURI);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckNamespaceURIReturningNull() throws Throwable  {
      String checkNamespaceURI = Verifier.checkNamespaceURI("The namespace prefix \"");
      assertNull(checkNamespaceURI);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckNamespaceURI1() throws Throwable  {
      String checkNamespaceURI = Verifier.checkNamespaceURI("-9.ccN.1_f;+kZQ17,(");
      assertNotNull(checkNamespaceURI);
      assertEquals("Namespace URIs cannot begin with a hyphen (-)", checkNamespaceURI);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckNamespaceURI2() throws Throwable  {
      String checkNamespaceURI = Verifier.checkNamespaceURI("6w%~{*'0Z[");
      assertNotNull(checkNamespaceURI);
      assertEquals("Namespace URIs cannot begin with a number", checkNamespaceURI);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckNamespaceURI3() throws Throwable  {
      String checkNamespaceURI = Verifier.checkNamespaceURI("$qtkc_EL=%xG/(5[3l0");
      assertEquals("Namespace URIs cannot begin with a dollar sign ($)", checkNamespaceURI);
      assertNotNull(checkNamespaceURI);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckNamespaceURIWithEmptyString() throws Throwable  {
      String checkNamespaceURI = Verifier.checkNamespaceURI("");
      assertNull(checkNamespaceURI);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckNamespaceURIWithNull() throws Throwable  {
      String checkNamespaceURI = Verifier.checkNamespaceURI((String) null);
      assertNull(checkNamespaceURI);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckNamespacePrefixReturningNonEmptyString() throws Throwable  {
      String checkNamespacePrefix = Verifier.checkNamespacePrefix("xmlns");
      assertEquals("Namespace prefixes cannot begin with \"xml\" in any combination of case", checkNamespacePrefix);
      assertNotNull(checkNamespacePrefix);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckNamespacePrefix0() throws Throwable  {
      String checkNamespacePrefix = Verifier.checkNamespacePrefix("Xqc_");
      assertNull(checkNamespacePrefix);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckNamespacePrefix1() throws Throwable  {
      String checkNamespacePrefix = Verifier.checkNamespacePrefix("xM53N0D-");
      assertNull(checkNamespacePrefix);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckNamespacePrefix2() throws Throwable  {
      String checkNamespacePrefix = Verifier.checkNamespacePrefix("Tmns");
      assertNull(checkNamespacePrefix);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckNamespacePrefix3() throws Throwable  {
      String checkNamespacePrefix = Verifier.checkNamespacePrefix("R");
      assertNull(checkNamespacePrefix);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckNamespacePrefixWithEmptyString() throws Throwable  {
      String checkNamespacePrefix = Verifier.checkNamespacePrefix("");
      assertNull(checkNamespacePrefix);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckNamespacePrefixWithNull() throws Throwable  {
      String checkNamespacePrefix = Verifier.checkNamespacePrefix((String) null);
      assertNull(checkNamespacePrefix);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckCDATASection() throws Throwable  {
      String checkCDATASection = Verifier.checkCDATASection("]]>");
      assertNotNull(checkCDATASection);
      assertEquals("CDATA cannot internally contain a CDATA ending delimiter (]]>)", checkCDATASection);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckCDATASectionReturningNull() throws Throwable  {
      String checkCDATASection = Verifier.checkCDATASection("XML names cannot be null");
      assertNull(checkCDATASection);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckCharacterDataReturningNull() throws Throwable  {
      String checkCharacterData = Verifier.checkCharacterData("");
      assertNull(checkCharacterData);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckCDATASectionWithNull() throws Throwable  {
      String checkCDATASection = Verifier.checkCDATASection((String) null);
      assertNotNull(checkCDATASection);
      assertEquals("A null is not a legal XML value", checkCDATASection);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckAttributeName0() throws Throwable  {
      String checkAttributeName = Verifier.checkAttributeName("xmlns");
      assertEquals("An Attribute name may not be \"xmlns\"; use the Namespace class to manage namespaces", checkAttributeName);
      assertNotNull(checkAttributeName);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void test3() throws Throwable  {
      Namespace.getNamespace("XML name 'Cannot add null content' cannot contain the character \" \"", "XML name 'Cannot add null content' cannot contain the character \" \"");
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckAttributeName1() throws Throwable  {
      String checkAttributeName = Verifier.checkAttributeName("&");
      assertEquals("XML name '&' cannot begin with the character \"&\"", checkAttributeName);
      assertNotNull(checkAttributeName);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckAttributeNameWithEmptyString() throws Throwable  {
      String checkAttributeName = Verifier.checkAttributeName("");
      assertEquals("XML names cannot be empty", checkAttributeName);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckElementNameReturningNonEmptyString() throws Throwable  {
      String checkElementName = Verifier.checkElementName((String) null);
      assertEquals("XML names cannot be null", checkElementName);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDecodeSurrogatePairReturningPositive() throws Throwable  {
      int decodeSurrogatePair = Verifier.decodeSurrogatePair('\uFFF5', '\uFFF5');
      assertEquals(10549237, decodeSurrogatePair);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckNamespaceCollisionTaking1And1AndCheckNamespaceCollisionTaking1And11() throws Throwable  {
      AttributeType arg2 = AttributeType.ENTITIES;
      Attribute arg0 = new Attribute("Hq", "Hq", arg2);
      String checkNamespaceCollision = Verifier.checkNamespaceCollision(arg0, (Element) null);
      assertNull(checkNamespaceCollision);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckNamespaceCollisionTaking11And1WithPositive() throws Throwable  {
      Namespace arg0 = Namespace.NO_NAMESPACE;
      Element arg1 = new Element("J", arg0);
      arg1.addNamespaceDeclaration(arg0);
      String checkNamespaceCollision = Verifier.checkNamespaceCollision(arg0, arg1, 34);
      assertNull(checkNamespaceCollision);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckElementNameReturningNull() throws Throwable  {
      String checkElementName = Verifier.checkElementName("org.jdom2.EntityRef");
      assertNull(checkElementName);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckNamespaceCollisionTaking1And1AndCheckNamespaceCollisionTaking1And12() throws Throwable  {
      Namespace arg0 = Namespace.XML_NAMESPACE;
      String checkNamespaceCollision = Verifier.checkNamespaceCollision(arg0, (List<?>) null);
      assertNull(checkNamespaceCollision);
  }
}
