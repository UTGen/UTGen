/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Thu Mar 21 07:40:46 GMT 2024
 */

package fr.unice.gfarce.interGraph;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import fr.unice.gfarce.interGraph.ModifTableStockage;
import fr.unice.gfarce.interGraph.TableStockage;
import java.awt.HeadlessException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ModifTableStockage_Original_ESTest extends ModifTableStockage_Original_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAjouterColonne() throws Throwable  {
      TableStockage arg0 = new TableStockage();
      ModifTableStockage modifTableStockage = new ModifTableStockage(arg0);
      Class<Boolean> arg1 = Boolean.class;
      TableStockage ajouterColonne = modifTableStockage.ajouterColonne(" ", arg1);
      assertEquals(1, ajouterColonne.getColumnCount());
      assertEquals(0, ajouterColonne.getRowCount());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSelectMailThrowsHeadlessException() throws Throwable  {
      TableStockage arg0 = new TableStockage();
      ModifTableStockage modifTableStockage = new ModifTableStockage(arg0);
      // Undeclared exception!
      try { 
        modifTableStockage.selectMail();
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFusionnerColonnesThrowsHeadlessException() throws Throwable  {
      TableStockage arg0 = new TableStockage();
      ModifTableStockage modifTableStockage = new ModifTableStockage(arg0);
      // Undeclared exception!
      try { 
        modifTableStockage.fusionnerColonnes((-283));
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSeparerColonneThrowsHeadlessException() throws Throwable  {
      TableStockage arg0 = new TableStockage(432, 432);
      ModifTableStockage modifTableStockage = new ModifTableStockage(arg0);
      // Undeclared exception!
      try { 
        modifTableStockage.separerColonne(8);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSupprimerLigne() throws Throwable  {
      TableStockage arg0 = new TableStockage(77, 0);
      ModifTableStockage modifTableStockage = new ModifTableStockage(arg0);
      TableStockage supprimerLigne = modifTableStockage.supprimerLigne(0);
      assertEquals(0, supprimerLigne.getColumnCount());
      assertEquals(75, supprimerLigne.getRowCount());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAjouterLigneThrowsHeadlessException() throws Throwable  {
      TableStockage arg0 = new TableStockage();
      ModifTableStockage modifTableStockage = new ModifTableStockage(arg0);
      // Undeclared exception!
      try { 
        modifTableStockage.ajouterLigne();
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testColonneMailReturningTableStockageWhereGetRowCountIsPositive() throws Throwable  {
      TableStockage arg0 = new TableStockage(88, 88);
      ModifTableStockage modifTableStockage = new ModifTableStockage(arg0);
      TableStockage colonneMail = modifTableStockage.colonneMail();
      assertEquals(87, colonneMail.getRowCount());
      assertEquals(89, colonneMail.getColumnCount());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testColonneMailReturningTableStockageWhereGetRowCountIsZero() throws Throwable  {
      TableStockage arg0 = new TableStockage();
      ModifTableStockage modifTableStockage = new ModifTableStockage(arg0);
      TableStockage colonneMail = modifTableStockage.colonneMail();
      assertEquals(1, colonneMail.getColumnCount());
      assertEquals(0, colonneMail.getRowCount());
  }
}