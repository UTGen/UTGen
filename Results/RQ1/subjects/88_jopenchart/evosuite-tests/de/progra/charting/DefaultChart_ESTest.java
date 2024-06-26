/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Thu Mar 21 09:44:46 GMT 2024
 */

package de.progra.charting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import de.progra.charting.DefaultChart;
import de.progra.charting.model.ChartDataModel;
import de.progra.charting.model.DefaultChartDataModel;
import de.progra.charting.model.ObjectChartDataModel;
import java.awt.Dimension;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DefaultChart_ESTest extends DefaultChart_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesDefaultChartTaking2Arguments() throws Throwable  {
      // Given a DefaultChart instance created with null ChartDataModel and "o:_5JaTJa$|g|" as the chart id
      DefaultChart defaultChart = new DefaultChart((ChartDataModel) null, "o:_5JaTJa$|g|");
      
      // When the NO_COORDINATE_SYSTEM value is retrieved from the DefaultChart instance
      int noCoordinateSystem = defaultChart.NO_COORDINATE_SYSTEM;
      
      // Then the expected value of 1 is returned
      assertEquals(1, noCoordinateSystem);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesDefaultChartTaking3Arguments() throws Throwable  {
      // rollbacked to evosuite
      ObjectChartDataModel arg0 = new ObjectChartDataModel();
      DefaultChart defaultChart = new DefaultChart(arg0, "de.progra.charting.DefaultChart", 1);
      assertEquals(1, DefaultChart.NO_COORDINATE_SYSTEM);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesDefaultChartTakingNoArgumentsAndCallsGetPreferredSize() throws Throwable  {
      // Given a DefaultChart object
      DefaultChart defaultChart = new DefaultChart();
      
      // When we call getPreferredSize() on the chart object
      Dimension preferredSize = defaultChart.getPreferredSize();
      
      // Then the returned dimension is null
      assertNull(preferredSize);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesDefaultChartTaking5Arguments() throws Throwable  {
      // No Comments were added
      DefaultChartDataModel arg0 = new DefaultChartDataModel();
      DefaultChart defaultChart = new DefaultChart(arg0, "B\"`)xx>8Rmt7", 0, "B\"`)xx>8Rmt7", "B\"`)xx>8Rmt7");
      assertEquals(0, DefaultChart.LINEAR_X_LINEAR_Y);
  }
}
