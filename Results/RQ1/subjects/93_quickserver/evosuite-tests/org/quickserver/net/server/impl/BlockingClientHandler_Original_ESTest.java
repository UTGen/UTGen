/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Mon Mar 18 08:48:22 GMT 2024
 */

package org.quickserver.net.server.impl;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
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
import org.quickserver.net.server.impl.BlockingClientHandler;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class BlockingClientHandler_Original_ESTest extends BlockingClientHandler_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testClean() throws Throwable  {
      BlockingClientHandler blockingClientHandler = new BlockingClientHandler();
      blockingClientHandler.clean();
      assertEquals("<ClientHandler-Pool#-1-ID:130>", blockingClientHandler.getName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetDataMode0() throws Throwable  {
      BlockingClientHandler blockingClientHandler = new BlockingClientHandler();
      DataType arg1 = DataType.OUT;
      Logger anonymousLogger = Logger.getAnonymousLogger();
      blockingClientHandler.appLogger = anonymousLogger;
      DataMode arg0 = DataMode.BYTE;
      blockingClientHandler.setDataMode(arg0, arg1);
      assertEquals("<ClientHandler-Pool#-1-ID:117>", blockingClientHandler.getName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetDataModeThrowsNullPointerException() throws Throwable  {
      BlockingClientHandler blockingClientHandler = new BlockingClientHandler();
      DataType arg1 = DataType.OUT;
      Logger anonymousLogger = Logger.getAnonymousLogger();
      blockingClientHandler.appLogger = anonymousLogger;
      DataMode arg0 = DataMode.OBJECT;
      // Undeclared exception!
      try { 
        blockingClientHandler.setDataMode(arg0, arg1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetDataMode1() throws Throwable  {
      BlockingClientHandler blockingClientHandler = new BlockingClientHandler();
      DataType arg1 = DataType.OUT;
      Logger anonymousLogger = Logger.getAnonymousLogger();
      blockingClientHandler.appLogger = anonymousLogger;
      DataMode arg0 = DataMode.STRING;
      blockingClientHandler.setDataMode(arg0, arg1);
      assertEquals("<ClientHandler-Pool#-1-ID:75>", blockingClientHandler.getName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetDataMode2() throws Throwable  {
      BlockingClientHandler blockingClientHandler = new BlockingClientHandler();
      DataType arg1 = DataType.OUT;
      Logger anonymousLogger = Logger.getAnonymousLogger();
      blockingClientHandler.appLogger = anonymousLogger;
      DataMode arg0 = DataMode.BINARY;
      blockingClientHandler.setDataMode(arg0, arg1);
      assertEquals("<ClientHandler-Pool#-1-ID:54>", blockingClientHandler.getName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetDataModeWithNull() throws Throwable  {
      BlockingClientHandler blockingClientHandler = new BlockingClientHandler();
      DataType arg1 = DataType.IN;
      blockingClientHandler.setDataMode((DataMode) null, arg1);
      assertEquals("<ClientHandler-Pool#-1-ID:50>", blockingClientHandler.getName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRun0() throws Throwable  {
      BlockingClientHandler blockingClientHandler = new BlockingClientHandler();
      blockingClientHandler.run();
      assertEquals("<ClientHandler-Pool#-1-ID:46>", blockingClientHandler.getName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRun1() throws Throwable  {
      BlockingClientHandler blockingClientHandler = new BlockingClientHandler();
      ClientEvent arg0 = ClientEvent.READ;
      blockingClientHandler.addEvent(arg0);
      blockingClientHandler.run();
      assertTrue(blockingClientHandler.getWillClean());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCloseConnection() throws Throwable  {
      BlockingClientHandler blockingClientHandler = new BlockingClientHandler();
      blockingClientHandler.closeConnection();
      assertEquals("<ClientHandler-Pool#-1-ID:31>", blockingClientHandler.getName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetInputStream() throws Throwable  {
      BlockingClientHandler blockingClientHandler = new BlockingClientHandler();
      blockingClientHandler.setInputStream((InputStream) null);
      assertEquals("<ClientHandler-Pool#-1-ID:25>", blockingClientHandler.getName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testUpdateInputOutputStreamsThrowsNullPointerException() throws Throwable  {
      BlockingClientHandler blockingClientHandler = new BlockingClientHandler();
      // Undeclared exception!
      try { 
        blockingClientHandler.updateInputOutputStreams();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.quickserver.net.server.impl.BlockingClientHandler", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCheckReturnClientHandler() throws Throwable  {
      BlockingClientHandler blockingClientHandler = new BlockingClientHandler();
      boolean checkReturnClientHandler = blockingClientHandler.checkReturnClientHandler();
      assertTrue(checkReturnClientHandler);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetBlockingMode() throws Throwable  {
      BlockingClientHandler blockingClientHandler = new BlockingClientHandler();
      boolean blockingMode = blockingClientHandler.getBlockingMode();
      assertTrue(blockingMode);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetSelectionKeyThrowsIllegalStateException() throws Throwable  {
      BlockingClientHandler blockingClientHandler = new BlockingClientHandler();
      // Undeclared exception!
      try { 
        blockingClientHandler.setSelectionKey((SelectionKey) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Can't set in blocking mode!
         //
         verifyException("org.quickserver.net.server.impl.BlockingClientHandler", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReturnClientHandler() throws Throwable  {
      BlockingClientHandler blockingClientHandler = new BlockingClientHandler();
      blockingClientHandler.returnClientHandler();
      assertEquals((-1), blockingClientHandler.getInstanceCount());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRegisterForReadThrowsIllegalStateException() throws Throwable  {
      BlockingClientHandler blockingClientHandler = new BlockingClientHandler();
      // Undeclared exception!
      try { 
        blockingClientHandler.registerForRead();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Can't register in blocking mode!
         //
         verifyException("org.quickserver.net.server.impl.BlockingClientHandler", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testReadInputStreamThrowsIOException() throws Throwable  {
      BlockingClientHandler blockingClientHandler = new BlockingClientHandler();
      try { 
        blockingClientHandler.readInputStream();
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
  public void testSetClientWriteHandlerThrowsIllegalStateException() throws Throwable  {
      BlockingClientHandler blockingClientHandler = new BlockingClientHandler();
      // Undeclared exception!
      try { 
        blockingClientHandler.setClientWriteHandler((ClientWriteHandler) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Can't register in blocking mode!
         //
         verifyException("org.quickserver.net.server.impl.BlockingClientHandler", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetBufferedReader() throws Throwable  {
      BlockingClientHandler blockingClientHandler = new BlockingClientHandler();
      BufferedReader bufferedReader = blockingClientHandler.getBufferedReader();
      assertNull(bufferedReader);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testRegisterForWriteThrowsIllegalStateException() throws Throwable  {
      BlockingClientHandler blockingClientHandler = new BlockingClientHandler();
      // Undeclared exception!
      try { 
        blockingClientHandler.registerForWrite();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Can't register in blocking mode!
         //
         verifyException("org.quickserver.net.server.impl.BlockingClientHandler", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetSocketChannelThrowsIllegalStateException() throws Throwable  {
      BlockingClientHandler blockingClientHandler = new BlockingClientHandler(60);
      // Undeclared exception!
      try { 
        blockingClientHandler.getSocketChannel();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Can't get in blocking mode!
         //
         verifyException("org.quickserver.net.server.impl.BlockingClientHandler", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFinalize() throws Throwable  {
      BlockingClientHandler blockingClientHandler = new BlockingClientHandler();
      blockingClientHandler.finalize();
      assertEquals("<ClientHandler-Pool#-1-ID:3>", blockingClientHandler.getName());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetSelectionKeyThrowsIllegalStateException() throws Throwable  {
      BlockingClientHandler blockingClientHandler = new BlockingClientHandler();
      // Undeclared exception!
      try { 
        blockingClientHandler.getSelectionKey();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Can't get in blocking mode!
         //
         verifyException("org.quickserver.net.server.impl.BlockingClientHandler", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetSocketChannelThrowsIllegalStateException() throws Throwable  {
      BlockingClientHandler blockingClientHandler = new BlockingClientHandler(1);
      // Undeclared exception!
      try { 
        blockingClientHandler.setSocketChannel((SocketChannel) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Can't set in blocking mode!
         //
         verifyException("org.quickserver.net.server.impl.BlockingClientHandler", e);
      }
  }
}
