/*
 * This file was automatically generated by EvoSuite
 */

package com.lts.swing.table.dragndrop.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.lts.swing.table.dragndrop.test.RecordingTransferHandler;
import java.awt.Component;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.InputEvent;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.TransferHandler;
import javax.swing.tree.DefaultTreeCellRenderer;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class RecordingTransferHandlerEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      RecordingTransferHandler recordingTransferHandler0 = new RecordingTransferHandler();
      Clipboard clipboard0 = new Clipboard((String) null);
      recordingTransferHandler0.exportToClipboard((JComponent) null, clipboard0, 0);
      assertNull(clipboard0.getName());
  }

  @Test
  public void test1()  throws Throwable  {
      RecordingTransferHandler recordingTransferHandler0 = new RecordingTransferHandler();
      Object[] objectArray0 = recordingTransferHandler0.getEvents();
      assertNotNull(objectArray0);
  }

  @Test
  public void test2()  throws Throwable  {
      RecordingTransferHandler recordingTransferHandler0 = new RecordingTransferHandler();
      JLabel jLabel0 = new JLabel("|?dwo1DdhSfPX4P7zu");
      recordingTransferHandler0.exportAsDrag((JComponent) jLabel0, (InputEvent) null, 0);
      assertEquals(0, jLabel0.getWidth());
  }

  @Test
  public void test3()  throws Throwable  {
      RecordingTransferHandler recordingTransferHandler0 = new RecordingTransferHandler();
      DefaultTreeCellRenderer defaultTreeCellRenderer0 = new DefaultTreeCellRenderer();
      StringSelection stringSelection0 = new StringSelection((String) null);
      TransferHandler.TransferSupport transferHandler_TransferSupport0 = new TransferHandler.TransferSupport((Component) defaultTreeCellRenderer0, (Transferable) stringSelection0);
      boolean boolean0 = recordingTransferHandler0.canImport(transferHandler_TransferSupport0);
      assertEquals(true, boolean0);
  }

  @Test
  public void test4()  throws Throwable  {
      RecordingTransferHandler recordingTransferHandler0 = new RecordingTransferHandler();
      JLabel jLabel0 = new JLabel("|?dwo1DdhSfPX4P7zu");
      StringSelection stringSelection0 = new StringSelection("|?dwo1DdhSfPX4P7zu");
      TransferHandler.TransferSupport transferHandler_TransferSupport0 = new TransferHandler.TransferSupport((Component) jLabel0, (Transferable) stringSelection0);
      boolean boolean0 = recordingTransferHandler0.importData(transferHandler_TransferSupport0);
      assertEquals(true, boolean0);
  }

  @Test
  public void test5()  throws Throwable  {
      RecordingTransferHandler recordingTransferHandler0 = new RecordingTransferHandler();
      // Undeclared exception!
      try {
        recordingTransferHandler0.getTranscript();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test6()  throws Throwable  {
      RecordingTransferHandler recordingTransferHandler0 = new RecordingTransferHandler();
      int int0 = recordingTransferHandler0.getSourceActions((JComponent) null);
      assertEquals(3, int0);
  }

  @Test
  public void test7()  throws Throwable  {
      RecordingTransferHandler recordingTransferHandler0 = new RecordingTransferHandler();
      JPasswordField jPasswordField0 = new JPasswordField("");
      Transferable transferable0 = recordingTransferHandler0.createTransferable((JComponent) jPasswordField0);
      recordingTransferHandler0.exportDone((JComponent) jPasswordField0, transferable0, 1535);
      assertEquals(0, jPasswordField0.getX());
  }

  @Test
  public void test8()  throws Throwable  {
      RecordingTransferHandler recordingTransferHandler0 = new RecordingTransferHandler();
      Transferable transferable0 = recordingTransferHandler0.createTransferable((JComponent) null);
      assertNull(transferable0);
  }
}
