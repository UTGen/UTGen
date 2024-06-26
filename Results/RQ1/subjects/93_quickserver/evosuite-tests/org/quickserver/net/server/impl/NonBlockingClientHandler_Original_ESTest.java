/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Mon Mar 18 09:04:33 GMT 2024
 */

package org.quickserver.net.server.impl;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.logging.Logger;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.quickserver.net.server.ClientEvent;
import org.quickserver.net.server.ClientWriteHandler;
import org.quickserver.net.server.DataMode;
import org.quickserver.net.server.DataType;
import org.quickserver.net.server.impl.NonBlockingClientHandler;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class NonBlockingClientHandler_Original_ESTest extends NonBlockingClientHandler_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testWaitTillFullyWrittenThrowsNullPointerException() throws Throwable  {
      NonBlockingClientHandler nonBlockingClientHandler = new NonBlockingClientHandler();
      // Undeclared exception!
      try { 
        nonBlockingClientHandler.waitTillFullyWritten();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.quickserver.net.server.impl.NonBlockingClientHandler", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testUpdateInputOutputStreamsThrowsIllegalArgumentException() throws Throwable  {
      NonBlockingClientHandler nonBlockingClientHandler = new NonBlockingClientHandler(0);
      // Undeclared exception!
      try { 
        nonBlockingClientHandler.updateInputOutputStreams();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null charset name
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetDataModeThrowsIllegalArgumentException() throws Throwable  {
      NonBlockingClientHandler nonBlockingClientHandler = new NonBlockingClientHandler();
      DataType arg1 = DataType.IN;
      Logger global = Logger.getGlobal();
      nonBlockingClientHandler.appLogger = global;
      DataMode arg0 = DataMode.STRING;
      // Undeclared exception!
      try { 
        nonBlockingClientHandler.setDataMode(arg0, arg1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can't set DataType.IN mode to STRING when ClientCommandHandler is not set!
         //
         verifyException("org.quickserver.net.server.impl.BasicClientHandler", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRegisterForReadThrowsNullPointerException() throws Throwable  {
      NonBlockingClientHandler nonBlockingClientHandler = new NonBlockingClientHandler();
      // Undeclared exception!
      try { 
        nonBlockingClientHandler.registerForRead();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.quickserver.net.server.impl.NonBlockingClientHandler", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetThreadAccessCountReturningPositive() throws Throwable  {
      NonBlockingClientHandler nonBlockingClientHandler = new NonBlockingClientHandler();
      nonBlockingClientHandler.threadAccessCount = 1175;
      int threadAccessCount = nonBlockingClientHandler.getThreadAccessCount();
      assertEquals("<ClientHandler-Pool#-1-ID:492>", nonBlockingClientHandler.getName());
      assertEquals(1175, threadAccessCount);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetThreadAccessCountReturningNegative() throws Throwable  {
      NonBlockingClientHandler nonBlockingClientHandler = new NonBlockingClientHandler();
      nonBlockingClientHandler.returnThread();
      int threadAccessCount = nonBlockingClientHandler.getThreadAccessCount();
      assertEquals((-1), threadAccessCount);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetSelectionKeyThrowsNullPointerException() throws Throwable  {
      NonBlockingClientHandler nonBlockingClientHandler = new NonBlockingClientHandler(2196);
      // Undeclared exception!
      try { 
        nonBlockingClientHandler.getSelectionKey();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.quickserver.net.server.impl.NonBlockingClientHandler", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testClean() throws Throwable  {
      NonBlockingClientHandler nonBlockingClientHandler = new NonBlockingClientHandler();
      nonBlockingClientHandler.clean();
      assertEquals("<ClientHandler-Pool#-1-ID:421>", nonBlockingClientHandler.getName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetSocketChannel() throws Throwable  {
      NonBlockingClientHandler nonBlockingClientHandler = new NonBlockingClientHandler();
      nonBlockingClientHandler.getSocketChannel();
      assertEquals("<ClientHandler-Pool#-1-ID:416>", nonBlockingClientHandler.getName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testEncryptThrowsIOException() throws Throwable  {
      NonBlockingClientHandler nonBlockingClientHandler = new NonBlockingClientHandler();
      ByteBuffer arg0 = ByteBuffer.allocateDirect(0);
      try { 
        nonBlockingClientHandler.encrypt(arg0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.quickserver.net.server.impl.NonBlockingClientHandler", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRegisterForWriteThrowsIllegalStateException0() throws Throwable  {
      NonBlockingClientHandler nonBlockingClientHandler = new NonBlockingClientHandler();
      ClientEvent arg0 = ClientEvent.MAX_CON_BLOCKING;
      nonBlockingClientHandler.addEvent(arg0);
      // Undeclared exception!
      try { 
        nonBlockingClientHandler.registerForWrite();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // This method is only allowed under Non-Blocking mode.
         //
         verifyException("org.quickserver.net.server.impl.NonBlockingClientHandler", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRegisterForWriteThrowsIllegalStateException1() throws Throwable  {
      NonBlockingClientHandler nonBlockingClientHandler = new NonBlockingClientHandler();
      // Undeclared exception!
      try { 
        nonBlockingClientHandler.registerForWrite();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // ClientWriteHandler has not been set!
         //
         verifyException("org.quickserver.net.server.impl.NonBlockingClientHandler", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRegisterForWriteThrowsIllegalStateException2() throws Throwable  {
      NonBlockingClientHandler nonBlockingClientHandler = new NonBlockingClientHandler();
      ClientEvent arg0 = ClientEvent.RUN_BLOCKING;
      nonBlockingClientHandler.addEvent(arg0);
      // Undeclared exception!
      try { 
        nonBlockingClientHandler.registerForWrite();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // This method is only allowed under Non-Blocking mode.
         //
         verifyException("org.quickserver.net.server.impl.NonBlockingClientHandler", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetDataMode() throws Throwable  {
      NonBlockingClientHandler nonBlockingClientHandler = new NonBlockingClientHandler();
      DataType arg1 = DataType.OUT;
      nonBlockingClientHandler.setDataMode((DataMode) null, arg1);
      assertEquals("<ClientHandler-Pool#-1-ID:366>", nonBlockingClientHandler.getName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReturnClientHandler() throws Throwable  {
      NonBlockingClientHandler nonBlockingClientHandler = new NonBlockingClientHandler();
      nonBlockingClientHandler.returnThread();
      nonBlockingClientHandler.returnClientHandler();
      assertEquals((-1), nonBlockingClientHandler.getThreadAccessCount());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckReturnClientHandler() throws Throwable  {
      NonBlockingClientHandler nonBlockingClientHandler = new NonBlockingClientHandler();
      nonBlockingClientHandler.checkReturnClientHandler();
      boolean checkReturnClientHandler = nonBlockingClientHandler.checkReturnClientHandler();
      assertEquals("<ClientHandler-Pool#-1-ID:271>", nonBlockingClientHandler.getName());
      assertFalse(checkReturnClientHandler);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRun0() throws Throwable  {
      NonBlockingClientHandler nonBlockingClientHandler = new NonBlockingClientHandler();
      nonBlockingClientHandler.run();
      assertEquals("<ClientHandler-Pool#-1-ID:263>", nonBlockingClientHandler.getName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRun1() throws Throwable  {
      NonBlockingClientHandler nonBlockingClientHandler = new NonBlockingClientHandler();
      ClientEvent arg0 = ClientEvent.MAX_CON;
      nonBlockingClientHandler.addEvent(arg0);
      nonBlockingClientHandler.run();
      assertEquals("<ClientHandler-Pool#-1-ID:171>", nonBlockingClientHandler.getName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCloseIfSSLOutboundDoneThrowsIllegalStateException() throws Throwable  {
      NonBlockingClientHandler nonBlockingClientHandler = new NonBlockingClientHandler();
      // Undeclared exception!
      try { 
        nonBlockingClientHandler.closeIfSSLOutboundDone();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Client is not in secure mode!
         //
         verifyException("org.quickserver.net.server.impl.NonBlockingClientHandler", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCloseIfSSLOutboundDoneThrowsNullPointerException() throws Throwable  {
      NonBlockingClientHandler nonBlockingClientHandler = new NonBlockingClientHandler();
      nonBlockingClientHandler.setSecure(true);
      // Undeclared exception!
      try { 
        nonBlockingClientHandler.closeIfSSLOutboundDone();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.quickserver.net.server.impl.NonBlockingClientHandler", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCloseConnection() throws Throwable  {
      NonBlockingClientHandler nonBlockingClientHandler = new NonBlockingClientHandler();
      nonBlockingClientHandler.connection = true;
      nonBlockingClientHandler.waitingForFinalWrite = true;
      nonBlockingClientHandler.closeConnection();
      assertEquals("<ClientHandler-Pool#-1-ID:134>", nonBlockingClientHandler.getName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesNonBlockingClientHandlerTakingInt() throws Throwable  {
      NonBlockingClientHandler nonBlockingClientHandler = new NonBlockingClientHandler((-3818));
      nonBlockingClientHandler.closeConnection();
      assertEquals("<ClientHandler-Pool#-3818-ID:73>", nonBlockingClientHandler.getName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCloseConnectionThrowsNullPointerException() throws Throwable  {
      NonBlockingClientHandler nonBlockingClientHandler = new NonBlockingClientHandler();
      nonBlockingClientHandler.connection = true;
      // Undeclared exception!
      try { 
        nonBlockingClientHandler.closeConnection();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.quickserver.net.server.impl.NonBlockingClientHandler", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetInputStream() throws Throwable  {
      NonBlockingClientHandler nonBlockingClientHandler = new NonBlockingClientHandler();
      nonBlockingClientHandler.setInputStream((InputStream) null);
      assertEquals("<ClientHandler-Pool#-1-ID:88>", nonBlockingClientHandler.getName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReturnThread() throws Throwable  {
      NonBlockingClientHandler nonBlockingClientHandler = new NonBlockingClientHandler((-3818));
      nonBlockingClientHandler.returnThread();
      nonBlockingClientHandler.clean();
      assertEquals("<ClientHandler-Pool#-3818-ID:1>", nonBlockingClientHandler.getName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetMaxThreadAccessCountThrowsIllegalArgumentException() throws Throwable  {
      // Undeclared exception!
      try { 
        NonBlockingClientHandler.setMaxThreadAccessCount(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value should be >=3 or -1
         //
         verifyException("org.quickserver.net.server.impl.NonBlockingClientHandler", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetMaxThreadAccessCountWithNegative() throws Throwable  {
      NonBlockingClientHandler.setMaxThreadAccessCount((-1));
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetMaxThreadAccessCountWithPositive() throws Throwable  {
      NonBlockingClientHandler.setMaxThreadAccessCount(2196);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRegisterWriteThrowsNullPointerException() throws Throwable  {
      NonBlockingClientHandler nonBlockingClientHandler = new NonBlockingClientHandler((-151));
      // Undeclared exception!
      try { 
        nonBlockingClientHandler.registerWrite();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.quickserver.net.server.impl.NonBlockingClientHandler", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetSelectionKey() throws Throwable  {
      NonBlockingClientHandler nonBlockingClientHandler = new NonBlockingClientHandler();
      nonBlockingClientHandler.setSelectionKey((SelectionKey) null);
      assertEquals("<ClientHandler-Pool#-1-ID:82>", nonBlockingClientHandler.getName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetBufferedReaderThrowsIllegalStateException() throws Throwable  {
      NonBlockingClientHandler nonBlockingClientHandler = new NonBlockingClientHandler();
      // Undeclared exception!
      try { 
        nonBlockingClientHandler.getBufferedReader();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Access to BufferedReader in not allowed in Non-Blocking mode!
         //
         verifyException("org.quickserver.net.server.impl.NonBlockingClientHandler", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadInputStreamThrowsIOException() throws Throwable  {
      NonBlockingClientHandler nonBlockingClientHandler = new NonBlockingClientHandler();
      try { 
        nonBlockingClientHandler.readInputStream();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // InputStream can't be null!
         //
         verifyException("org.quickserver.net.server.impl.BasicClientHandler", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetWakeupSelectorAfterRegisterWrite() throws Throwable  {
      NonBlockingClientHandler.setWakeupSelectorAfterRegisterWrite(false);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetThreadAccessCountReturningZero() throws Throwable  {
      NonBlockingClientHandler nonBlockingClientHandler = new NonBlockingClientHandler();
      int threadAccessCount = nonBlockingClientHandler.getThreadAccessCount();
      assertEquals("<ClientHandler-Pool#-1-ID:58>", nonBlockingClientHandler.getName());
      assertEquals(0, threadAccessCount);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetBlockingMode() throws Throwable  {
      NonBlockingClientHandler nonBlockingClientHandler = new NonBlockingClientHandler();
      boolean blockingMode = nonBlockingClientHandler.getBlockingMode();
      assertEquals("<ClientHandler-Pool#-1-ID:52>", nonBlockingClientHandler.getName());
      assertFalse(blockingMode);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetWakeupSelectorAfterRegisterRead() throws Throwable  {
      NonBlockingClientHandler.setWakeupSelectorAfterRegisterRead(true);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetClientWriteHandler() throws Throwable  {
      NonBlockingClientHandler nonBlockingClientHandler = new NonBlockingClientHandler();
      nonBlockingClientHandler.setClientWriteHandler((ClientWriteHandler) null);
      assertEquals("<ClientHandler-Pool#-1-ID:46>", nonBlockingClientHandler.getName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetSocketChannel() throws Throwable  {
      NonBlockingClientHandler nonBlockingClientHandler = new NonBlockingClientHandler((-151));
      SocketChannel arg0 = SocketChannel.open();
      nonBlockingClientHandler.setSocketChannel(arg0);
      assertEquals("<ClientHandler-Pool#-151-ID:1>", nonBlockingClientHandler.getName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetWakeupSelectorAfterRegisterWrite() throws Throwable  {
      boolean wakeupSelectorAfterRegisterWrite = NonBlockingClientHandler.getWakeupSelectorAfterRegisterWrite();
      assertTrue(wakeupSelectorAfterRegisterWrite);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetInitialHandshakeStatus() throws Throwable  {
      NonBlockingClientHandler nonBlockingClientHandler = new NonBlockingClientHandler();
      boolean initialHandshakeStatus = nonBlockingClientHandler.getInitialHandshakeStatus();
      assertEquals("<ClientHandler-Pool#-1-ID:31>", nonBlockingClientHandler.getName());
      assertFalse(initialHandshakeStatus);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFinalize() throws Throwable  {
      NonBlockingClientHandler nonBlockingClientHandler = new NonBlockingClientHandler();
      nonBlockingClientHandler.finalize();
      assertEquals("<ClientHandler-Pool#-1-ID:1>", nonBlockingClientHandler.getName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetWakeupSelectorAfterRegisterRead() throws Throwable  {
      boolean wakeupSelectorAfterRegisterRead = NonBlockingClientHandler.getWakeupSelectorAfterRegisterRead();
      assertTrue(wakeupSelectorAfterRegisterRead);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetMaxThreadAccessCount() throws Throwable  {
      int maxThreadAccessCount = NonBlockingClientHandler.getMaxThreadAccessCount();
      assertEquals(5, maxThreadAccessCount);
  }
}
