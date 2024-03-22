/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Wed Mar 20 15:47:00 GMT 2024
 */

package twitter4j;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import twitter4j.HttpParameter;
import twitter4j.OEmbedRequest;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class OEmbedRequest_Original_ESTest extends OEmbedRequest_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testToString() throws Throwable  {
      OEmbedRequest oEmbedRequest = new OEmbedRequest(0L, "H^ J`\"T0A7zSM8");
      String string = oEmbedRequest.toString();
      assertEquals("OEmbedRequest{statusId=0, url='H^ J`\"T0A7zSM8', maxWidth=0, hideMedia=true, hideThread=true, omitScript=false, align=NONE, related=[], lang='null'}", string);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHashCodeAndRelated() throws Throwable  {
      OEmbedRequest oEmbedRequest = new OEmbedRequest((-835L), "n");
      oEmbedRequest.related((String[]) null);
      oEmbedRequest.hashCode();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHashCode0() throws Throwable  {
      OEmbedRequest oEmbedRequest = new OEmbedRequest((-3L), "*");
      oEmbedRequest.hashCode();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHashCode1() throws Throwable  {
      OEmbedRequest oEmbedRequest = new OEmbedRequest((-566L), (String) null);
      oEmbedRequest.hashCode();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsAndEqualsReturningTrue0() throws Throwable  {
      OEmbedRequest arg0 = new OEmbedRequest((-1L), (String) null);
      OEmbedRequest oEmbedRequest = new OEmbedRequest((-1L), (String) null);
      boolean equals = oEmbedRequest.equals(arg0);
      assertTrue(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsAndEqualsReturningFalseAndEqualsWithNonNull0() throws Throwable  {
      OEmbedRequest oEmbedRequest = new OEmbedRequest((-3587L), "P7");
      OEmbedRequest arg0 = new OEmbedRequest((-3587L), "J");
      boolean equals = oEmbedRequest.equals(arg0);
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsAndEqualsReturningFalseAndEqualsWithNonNull1() throws Throwable  {
      OEmbedRequest arg0 = new OEmbedRequest((-1L), "vFYb!E,m1h");
      OEmbedRequest oEmbedRequest = new OEmbedRequest((-1L), (String) null);
      boolean equals = oEmbedRequest.equals(arg0);
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetLangWithEmptyString() throws Throwable  {
      OEmbedRequest oEmbedRequest = new OEmbedRequest(1853L, "");
      OEmbedRequest arg0 = new OEmbedRequest(1853L, "");
      assertTrue(arg0.equals((Object)oEmbedRequest));
      
      arg0.setLang("");
      boolean equals = oEmbedRequest.equals(arg0);
      assertFalse(arg0.equals((Object)oEmbedRequest));
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetLangWithNonEmptyString() throws Throwable  {
      OEmbedRequest oEmbedRequest = new OEmbedRequest(1819L, "Pn");
      OEmbedRequest lang = oEmbedRequest.lang("Pn");
      OEmbedRequest arg0 = new OEmbedRequest(1819L, "Pn");
      assertFalse(arg0.equals((Object)oEmbedRequest));
      
      arg0.setLang("Pn");
      boolean equals = oEmbedRequest.equals(arg0);
      assertTrue(arg0.equals((Object)lang));
      assertTrue(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsAndLang() throws Throwable  {
      OEmbedRequest oEmbedRequest = new OEmbedRequest(1819L, "Pn");
      oEmbedRequest.lang("Pn");
      OEmbedRequest arg0 = new OEmbedRequest(1819L, "Pn");
      boolean equals = oEmbedRequest.equals(arg0);
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsAndEqualsReturningFalseAndEqualsWithNonNull2() throws Throwable  {
      OEmbedRequest arg0 = new OEmbedRequest(0L, "H^ J`\"T0A7zSM8");
      OEmbedRequest oEmbedRequest = new OEmbedRequest((-1199L), "");
      boolean equals = oEmbedRequest.equals(arg0);
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsAndOmitScript() throws Throwable  {
      OEmbedRequest arg0 = new OEmbedRequest(1L, "6Qb(#+%H7*n");
      OEmbedRequest oEmbedRequest = new OEmbedRequest(699L, "H^ J`\"T0A7zSM8");
      arg0.omitScript(true);
      boolean equals = oEmbedRequest.equals(arg0);
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsAndEqualsReturningFalse() throws Throwable  {
      OEmbedRequest oEmbedRequest = new OEmbedRequest((-3721L), "lN#+L");
      boolean equals = oEmbedRequest.equals("lN#+L");
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsWithNull() throws Throwable  {
      OEmbedRequest oEmbedRequest = new OEmbedRequest(1863L, (String) null);
      boolean equals = oEmbedRequest.equals((Object) null);
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEqualsAndEqualsReturningTrue1() throws Throwable  {
      OEmbedRequest arg0 = new OEmbedRequest(1833L, "Pn");
      boolean equals = arg0.equals(arg0);
      assertTrue(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAsHttpParameterArray() throws Throwable  {
      OEmbedRequest oEmbedRequest = new OEmbedRequest((-1199L), "");
      HttpParameter[] asHttpParameterArray = oEmbedRequest.asHttpParameterArray();
      assertEquals(6, asHttpParameterArray.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAlign() throws Throwable  {
      OEmbedRequest oEmbedRequest = new OEmbedRequest((-3L), "*");
      OEmbedRequest align = oEmbedRequest.align((OEmbedRequest.Align) null);
      align.hashCode();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetHideThread() throws Throwable  {
      OEmbedRequest oEmbedRequest = new OEmbedRequest(1833L, "Pn");
      oEmbedRequest.setHideThread(false);
      OEmbedRequest arg0 = new OEmbedRequest(1833L, "Pn");
      boolean equals = oEmbedRequest.equals(arg0);
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHideMedia() throws Throwable  {
      OEmbedRequest oEmbedRequest = new OEmbedRequest(1L, "%2a");
      oEmbedRequest.HideMedia(false);
      oEmbedRequest.hashCode();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetOmitScript() throws Throwable  {
      OEmbedRequest oEmbedRequest = new OEmbedRequest((-2345L), "WH&c>D^:t;9G|Lm");
      oEmbedRequest.setOmitScript(true);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHashCodeAndLang() throws Throwable  {
      OEmbedRequest oEmbedRequest = new OEmbedRequest(0L, "RIGHT");
      OEmbedRequest lang = oEmbedRequest.lang("q");
      lang.hashCode();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testMaxWidth() throws Throwable  {
      OEmbedRequest oEmbedRequest = new OEmbedRequest(0L, "RIGHT");
      OEmbedRequest MaxWidth = oEmbedRequest.MaxWidth(110);
      OEmbedRequest arg0 = new OEmbedRequest((-1L), "RIGHT");
      boolean equals = MaxWidth.equals(arg0);
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetMaxWidth() throws Throwable  {
      OEmbedRequest oEmbedRequest = new OEmbedRequest((-56L), "UTF-8");
      oEmbedRequest.setMaxWidth((-1360));
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHashCodeAndOmitScript() throws Throwable  {
      OEmbedRequest oEmbedRequest = new OEmbedRequest(1L, "6Qb(#+%H7*n");
      oEmbedRequest.omitScript(true);
      oEmbedRequest.hashCode();
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetRelated() throws Throwable  {
      OEmbedRequest oEmbedRequest = new OEmbedRequest(2600L, "J");
      String[] arg0 = new String[1];
      oEmbedRequest.setRelated(arg0);
      HttpParameter[] asHttpParameterArray = oEmbedRequest.asHttpParameterArray();
      assertEquals(8, asHttpParameterArray.length);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetHideMedia() throws Throwable  {
      OEmbedRequest oEmbedRequest = new OEmbedRequest(1833L, "Pn");
      oEmbedRequest.setHideMedia(false);
      OEmbedRequest arg0 = new OEmbedRequest(1833L, "Pn");
      boolean equals = oEmbedRequest.equals(arg0);
      assertFalse(equals);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRelatedAndToString() throws Throwable  {
      OEmbedRequest oEmbedRequest = new OEmbedRequest(527L, "L?");
      oEmbedRequest.related((String[]) null);
      String string = oEmbedRequest.toString();
      assertEquals("OEmbedRequest{statusId=527, url='L?', maxWidth=0, hideMedia=true, hideThread=true, omitScript=false, align=NONE, related=null, lang='null'}", string);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testHideThread() throws Throwable  {
      OEmbedRequest oEmbedRequest = new OEmbedRequest(1L, "%2a");
      oEmbedRequest.HideThread(false);
      oEmbedRequest.hashCode();
  }
}