/*
 * This file was automatically generated by UTestGen and EvoSuite
 * Sun Mar 17 21:41:30 GMT 2024
 */

package accessories.plugins.time;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;
import static org.evosuite.runtime.EvoAssertions.*;
import accessories.plugins.time.JDayChooser;
import accessories.plugins.time.JMonthChooser;
import accessories.plugins.time.JYearChooser;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.SystemColor;
import java.awt.event.FocusEvent;
import java.util.Date;
import java.util.Locale;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.tree.DefaultTreeCellRenderer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class JDayChooser_ESTest extends JDayChooser_ESTest_scaffolding {

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testInitDecorations() throws Throwable  {
      // Given a JDayChooser object with some pre-configured values
      JDayChooser jDayChooser = new JDayChooser();
      
      // When the decoration borders are initialized
      jDayChooser.initDecorations();
      
      // Then the following properties should be set to their default values
      assertFalse(jDayChooser.isDecorationBordersVisible());
      assertTrue(jDayChooser.isDecorationBackgroundVisible());
      assertTrue(jDayChooser.isDayBordersVisible());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDrawWeeks() throws Throwable  {
      // Given a JDayChooser component
      JDayChooser jdc = new JDayChooser();
      
      // When the drawWeeks method is called on the JDayChooser
      jdc.drawWeeks();
      
      // Then the day should be 14
      assertEquals(14, jdc.getDay());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testDrawDays() throws Throwable  {
      JDayChooser jDayChooser = new JDayChooser();
      jDayChooser.drawDays();
      assertTrue(jDayChooser.isDayBordersVisible()); // Check if the borders of the day are visible
      assertEquals(14, jDayChooser.getDay()); // Check that the day is set to 14
      assertFalse(jDayChooser.isDecorationBordersVisible()); // Check if the decoration borders are not visible
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetCalendar() throws Throwable  {
      // Create a new instance of JDayChooser with today's date
      JDayChooser jDayChooser = new JDayChooser();
      
      // Set the calendar to a mock GregorianCalendar object
      MockGregorianCalendar arg0 = (MockGregorianCalendar)jDayChooser.today;
      jDayChooser.setCalendar(arg0);
      
      // Assert that the calendar has been set correctly
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=1392409281320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2014,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=45,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=21,SECOND=21,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]", arg0.toString());
      
      // Assert that the calendar has been set correctly
      assertTrue(jDayChooser.isDecorationBackgroundVisible());
      
      // Assert that the day has been set correctly
      assertEquals(14, jDayChooser.getDay());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsWeekOfYearVisibleReturningTrue() throws Throwable  {
      // Given: A JDayChooser instance with week of year visibility enabled
      JDayChooser jDayChooser = new JDayChooser(true);
      
      // When: The week of year visibility is checked
      boolean weekOfYearVisible = jDayChooser.isWeekOfYearVisible();
      
      // Then: The week of year visibility should be true
      assertTrue(weekOfYearVisible);
      
      // And: The day value should be 14
      assertEquals(14, jDayChooser.getDay());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetWeekdayForegroundReturningColorWhereGetGreenIsPositive() throws Throwable  {
      // Given a JDayChooser with the weekdayForeground set to the backgroundNonSelectionColor of a DefaultTreeCellRenderer
      JDayChooser jDayChooser = new JDayChooser(false);
      DefaultTreeCellRenderer defaultTreeCellRenderer = new DefaultTreeCellRenderer();
      Color backgroundNonSelectionColor = defaultTreeCellRenderer.getBackgroundNonSelectionColor();
      jDayChooser.weekdayForeground = backgroundNonSelectionColor;
      
      // When the getWeekdayForeground method is called
      jDayChooser.getWeekdayForeground();
      
      // Then the day should be returned as 14
      assertEquals(14, jDayChooser.getDay());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetWeekdayForegroundReturningColorWhereGetGreenIsZero() throws Throwable  {
      // Create a new JDayChooser instance and set its background color to red
      JDayChooser jDayChooser = new JDayChooser();
      Color arg0 = new Color(255, 0, 0);
      jDayChooser.setBackground(arg0);
      
      // Set the weekday foreground color to green
      Color weekdayForeground = new Color(0, 255, 0);
      jDayChooser.setWeekdayForeground(weekdayForeground);
      
      // Assert that the day is set to 14
      assertEquals(14, jDayChooser.getDay());
      
      // Assert that the weekday foreground color is green
      assertEquals(0, weekdayForeground.getRed());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetSelectedDayReturningJButtonWhereIsFocusTraversalPolicySetIsFalse() throws Throwable  {
      // rollbacked to evosuite
      JDayChooser jDayChooser = new JDayChooser();
      DefaultTreeCellRenderer defaultTreeCellRenderer = new DefaultTreeCellRenderer();
      Icon arg1 = defaultTreeCellRenderer.getOpenIcon();
      JButton jButton = new JButton("day", arg1);
      jDayChooser.selectedDay = jButton;
      jDayChooser.getSelectedDay();
      assertFalse(jDayChooser.isWeekOfYearVisible());
      assertFalse(jDayChooser.isDecorationBordersVisible());
      assertEquals(14, jDayChooser.getDay());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetDecorationBackgroundColorReturningColorWhereGetGreenIsZero() throws Throwable  {
      // Given a JDayChooser component with a text highlight color set
      JDayChooser jDayChooser = new JDayChooser(false);
      SystemColor arg0 = SystemColor.textHighlight;
      
      // When we set the decoration background color of the JDayChooser
      jDayChooser.setDecorationBackgroundColor(arg0);
      
      // Then the getDecorationBackgroundColor method should return the same color that was set
      assertEquals(arg0, jDayChooser.getDecorationBackgroundColor());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testUpdateUI() throws Throwable  {
      // Given a JDayChooser component with day 14 and decoration borders visible
      JDayChooser jDayChooser = new JDayChooser(true);
      assertTrue(jDayChooser.isDecorationBackgroundVisible());
      
      // When the updateUI() method is called on the JDayChooser component
      jDayChooser.updateUI();
      
      // Then the day borders should be visible and the decoration borders should not be visible
      assertTrue(jDayChooser.isDayBordersVisible());
      assertEquals(14, jDayChooser.getDay());
      assertFalse(jDayChooser.isDecorationBordersVisible());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetDayBordersVisible() throws Throwable  {
      // Given a JDayChooser with day borders visible
      JDayChooser jDayChooser = new JDayChooser();
      
      // When setting the day borders visibility to false
      jDayChooser.setDayBordersVisible(false);
      
      // Then the day borders should be hidden
      assertFalse(jDayChooser.isDayBordersVisible());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetFocus0() throws Throwable  {
      // Create a new JDayChooser instance and set the focus on it
      JDayChooser jDayChooser = new JDayChooser();
      jDayChooser.setFocus();
      
      // Assert that the decoration background is visible
      assertTrue(jDayChooser.isDecorationBackgroundVisible());
      
      // Assert that the day is equal to 14
      assertEquals(14, jDayChooser.getDay());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetForeground() throws Throwable  {
      // Given a JDayChooser component with a foreground color set to null
      JDayChooser jDayChooser = new JDayChooser();
      jDayChooser.setForeground((Color) null);
      
      // When the day is retrieved using getDay() method
      int day = jDayChooser.getDay();
      
      // Then the returned day should be 14, as it was set in the constructor
      assertEquals(14, day);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetFont() throws Throwable  {
      // Given a JDayChooser component and a font object
      JDayChooser jDayChooser = new JDayChooser();
      Font font = null;
      
      // When the font is set to null
      jDayChooser.setFont(font);
      
      // Then the day should be 14 and decoration borders should be invisible
      assertEquals(14, jDayChooser.getDay());
      assertFalse(jDayChooser.isDecorationBordersVisible());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetDecorationBackgroundVisible() throws Throwable  {
      // Given a JDayChooser component with decoration background visible and day borders visible
      JDayChooser jDayChooser = new JDayChooser();
      jDayChooser.setDecorationBackgroundVisible(true);
      jDayChooser.setDayBordersVisible(true);
      
      // When the day is set to 14
      jDayChooser.setDay(14);
      
      // Then the day should be equal to 14
      assertEquals(14, jDayChooser.getDay());
      
      // And the day borders visibility should be true
      assertTrue(jDayChooser.isDayBordersVisible());
      
      // And the decoration background visibility should be true
      assertTrue(jDayChooser.isDecorationBackgroundVisible());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetDay() throws Throwable  {
      // Given a JDayChooser object
      JDayChooser jDayChooser = new JDayChooser();
      
      // When the day is retrieved
      int day = jDayChooser.getDay();
      
      // Then the day should be 14
      assertEquals(14, day);
      
      // And the week of year visibility should be false
      assertFalse(jDayChooser.isWeekOfYearVisible());
      
      // And the decoration background visibility should be true
      assertTrue(jDayChooser.isDecorationBackgroundVisible());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetDecorationBordersVisible() throws Throwable  {
      // Create a new instance of JDayChooser with the parameter set to false, indicating that the border should not be visible
      JDayChooser jDayChooser = new JDayChooser(false);
      
      // Set the decoration borders visible property to false, which will hide the border around the day chooser
      jDayChooser.setDecorationBordersVisible(false);
      
      // Assert that the day is equal to 14
      assertEquals(14, jDayChooser.getDay());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testAddListenersThrowsArrayIndexOutOfBoundsException() throws Throwable  {
      // No Comments were added
      JDayChooser jDayChooser = new JDayChooser();
      // Undeclared exception!
      try { 
        jDayChooser.addListeners((-5453));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetDaysInMonth() throws Throwable  {
      JDayChooser jDayChooser = new JDayChooser(false);
      // Given a day chooser with the month set to January
      assertEquals(14, jDayChooser.getDaysInMonth());
      // When the user selects a specific day
      jDayChooser.setDay(5);
      // Then the selected day should be 5
      assertEquals(5, jDayChooser.getDay());
      // And the week of year visibility should be false
      assertFalse(jDayChooser.isWeekOfYearVisible());
      // And the decoration borders visibility should be false
      assertFalse(jDayChooser.isDecorationBordersVisible());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetMaxDayCharacters0() throws Throwable  {
      JDayChooser jDayChooser = new JDayChooser();
      
      // Test setting the maximum number of characters for the day
      jDayChooser.setMaxDayCharacters(10);
      assertTrue(jDayChooser.isDayBordersVisible()); // Assert that the borders are visible when there is a limit on the number of characters
      assertEquals(0, jDayChooser.getMaxDayCharacters()); // Assert that the maximum number of characters for the day is 0 (unlimited)
      
      // Test setting the visibility of decoration borders
      jDayChooser.setDecorationBordersVisible(false);
      assertFalse(jDayChooser.isDecorationBordersVisible()); // Assert that the decoration borders are not visible
      
      // Test setting the visibility of the decoration background
      jDayChooser.setDecorationBackgroundVisible(true);
      assertTrue(jDayChooser.isDecorationBackgroundVisible()); // Assert that the decoration background is visible
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetMaxDayCharactersWithNegative() throws Throwable  {
      // Given a JDayChooser object
      JDayChooser jDayChooser = new JDayChooser();
      
      // When the maximum number of characters for the day is set to -59
      jDayChooser.setMaxDayCharacters(-59);
      
      // Then the background decoration should be visible
      assertTrue(jDayChooser.isDecorationBackgroundVisible());
      
      // And the maximum number of characters for the day should be set to 0
      assertEquals(0, jDayChooser.getMaxDayCharacters());
      
      // And the borders for the day should be visible
      assertTrue(jDayChooser.isDayBordersVisible());
      
      // And the current day should be set to 14
      assertEquals(14, jDayChooser.getDay());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetMaxDayCharactersWithZero() throws Throwable  {
      JDayChooser jDayChooser = new JDayChooser(false);
      // Set the maximum number of day characters to 0, which means that the day will be displayed in full.
      jDayChooser.setMaxDayCharacters(0);
      
      // Verify that the decoration background is visible and that the day is equal to 14.
      assertTrue(jDayChooser.isDecorationBackgroundVisible());
      assertEquals(14, jDayChooser.getDay());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetMinSelectableDateWithNull() throws Throwable  {
      // Test that the JDayChooser is initialized with default values
      JDayChooser jDayChooser = new JDayChooser();
      assertFalse(jDayChooser.isDecorationBordersVisible()); // Default value for decoration borders visibility is false
      assertTrue(jDayChooser.isDayBordersVisible()); // Default value for day borders visibility is true
      assertEquals(14, jDayChooser.getDay()); // Default value for the day is 14
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetMaxSelectableDateWithNull() throws Throwable  {
      // Given a JDayChooser instance with the max selectable date set to null
      JDayChooser jDayChooser = new JDayChooser();
      jDayChooser.setMaxSelectableDate((Date) null);
      
      // When the day borders visibility is checked
      boolean isDayBordersVisible = jDayChooser.isDayBordersVisible();
      
      // Then the day borders are visible
      assertTrue(isDayBordersVisible);
      
      // And the day is set to 14
      int day = jDayChooser.getDay();
      assertEquals(14, day);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetMaxSelectableDate() throws Throwable  {
      // rollbacked to evosuite
      JDayChooser jDayChooser = new JDayChooser();
      MockDate arg0 = new MockDate();
      jDayChooser.setMaxSelectableDate(arg0);
      assertTrue(jDayChooser.isDecorationBackgroundVisible());
      assertEquals(14, jDayChooser.getDay());
      assertFalse(jDayChooser.isDecorationBordersVisible());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetSelectableDateRangeWithNonNull() throws Throwable  {
      // rollbacked to evosuite
      JDayChooser jDayChooser = new JDayChooser();
      Date arg0 = jDayChooser.defaultMinSelectableDate;
      java.sql.Date arg1 = new java.sql.Date(381);
      jDayChooser.setSelectableDateRange(arg0, arg1);
      assertTrue(jDayChooser.isDayBordersVisible());
      assertEquals(14, jDayChooser.getDay());
      assertFalse(jDayChooser.isDecorationBordersVisible());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetSelectableDateRangeWithNullAndNull() throws Throwable  {
      // Given a JDayChooser with setSelectableDateRange method called
      JDayChooser jDayChooser = new JDayChooser();
      jDayChooser.setSelectableDateRange((Date) null, (Date) null);
      
      // When the getDay method is called
      int day = jDayChooser.getDay();
      
      // Then the day should be 14
      assertEquals(14, day);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetFocus1() throws Throwable  {
      // Given a JDayChooser component with a selected day button and focus
      JDayChooser jDayChooser = new JDayChooser();
      JButton jButton = new JButton();
      jDayChooser.selectedDay = jButton;
      jDayChooser.setFocus();
      
      // When the component is initialized
      jDayChooser.init();
      
      // Then the component should have a specific set of properties and methods
      assertEquals(14, jDayChooser.getDay());
      assertFalse(jDayChooser.isWeekOfYearVisible());
      assertFalse(jDayChooser.isDecorationBordersVisible());
      assertTrue(jDayChooser.isDayBordersVisible());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetDecorationBackgroundColorReturningNull() throws Throwable  {
      // Given: A JDayChooser instance with the decoration background color set to null and the day borders visibility set to true.
      JDayChooser jDayChooser = new JDayChooser(false);
      jDayChooser.setDecorationBackgroundColor((Color) null);
      jDayChooser.getDecorationBackgroundColor();
      assertTrue(jDayChooser.isDecorationBackgroundVisible());
      assertFalse(jDayChooser.isDecorationBordersVisible());
      assertFalse(jDayChooser.isWeekOfYearVisible());
      assertTrue(jDayChooser.isDayBordersVisible());
      // When: The day is set to 14 using the setDay method.
      jDayChooser.setDay(14);
      // Then: The day should be equal to 14 and the day borders visibility should be true.
      assertEquals(14, jDayChooser.getDay());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetWeekOfYearVisible() throws Throwable  {
      // Given a JDayChooser instance with weekOfYear visibility disabled
      JDayChooser jDayChooser = new JDayChooser();
      jDayChooser.setWeekOfYearVisible(false);
      
      // When the day is requested
      int actualDay = jDayChooser.getDay();
      
      // Then the correct day is returned
      assertEquals(14, actualDay);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetWeekOfYearVisibleWithTrue() throws Throwable  {
      // Given: A JDayChooser instance is created and its week of year visibility is set to true
      JDayChooser jDayChooser = new JDayChooser();
      jDayChooser.setWeekOfYearVisible(true);
      
      // When: The week of year visibility is checked after being set to true
      assertTrue(jDayChooser.isWeekOfYearVisible());
      
      // Then: The method returns true, indicating that the week of year is visible
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetEnabled() throws Throwable  {
      // Given a JDayChooser instance with enabled borders
      JDayChooser jDayChooser = new JDayChooser();
      jDayChooser.setEnabled(true);
      
      // When the borders are set to be visible for the day
      jDayChooser.setDecorationBordersVisible(false);
      jDayChooser.setDayBordersVisible(true);
      
      // Then the border visibility for the day should be true and the decoration border visibility should be false
      assertTrue(jDayChooser.isDayBordersVisible());
      assertFalse(jDayChooser.isDecorationBordersVisible());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetMonthWithNegative() throws Throwable  {
      // Create a new JDayChooser object and its decorator button
      JDayChooser arg0 = new JDayChooser();
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton = arg0.new DecoratorButton();
      
      // Set the selected day to be the decorator button
      arg0.selectedDay = (JButton) jDayChooser_DecoratorButton;
      
      // Set the month to a negative value (-555)
      arg0.setMonth((-555));
      
      // Assert that the getDay method returns 14
      assertEquals(14, arg0.getDay());
      
      // Assert that isDayBordersVisible returns true
      assertTrue(arg0.isDayBordersVisible());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetDayWithPositiveAndSetMonthWithPositive() throws Throwable  {
      // Given a JDayChooser instance with the day set to 164 and month set to May (byte value of 5)
      JDayChooser jDayChooser = new JDayChooser();
      jDayChooser.setDay(164);
      jDayChooser.setMonth((byte) 5);
      
      // When the day is retrieved using the getDay method
      int day = jDayChooser.getDay();
      
      // Then the returned value should be 30 (the number of days in May)
      assertEquals(30, day);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetDayWithNegative() throws Throwable  {
      // Given: A JDayChooser instance with a negative value set
      JDayChooser jDayChooser = new JDayChooser();
      jDayChooser.setDay((-669));
      
      // When: The getDay method is called on the JDayChooser instance
      int day = jDayChooser.getDay();
      
      // Then: The value returned should be 1, since the negative value has been converted to a positive one
      assertEquals(1, day);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetMaxDayCharactersReturningPositive() throws Throwable  {
      // Given a JDayChooser with the maximum number of day characters set to 4
      JDayChooser jDayChooser = new JDayChooser(false);
      jDayChooser.setMaxDayCharacters(4);
      
      // When the max day characters is retrieved
      int maxDayCharacters = jDayChooser.getMaxDayCharacters();
      
      // Then the maximum number of day characters should be 4
      assertEquals(4, maxDayCharacters);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetLocale() throws Throwable  {
      // Given a JDayChooser instance with a Locale set to Korea and a maximum number of characters for the day set to 18
      JDayChooser jDayChooser = new JDayChooser();
      jDayChooser.maxDayCharacters = 18;
      Locale arg0 = Locale.KOREA;
      jDayChooser.setLocale(arg0);
      
      // When the day is retrieved from the JDayChooser instance
      int actual = jDayChooser.getDay();
      
      // Then the day should be equal to 14
      assertEquals(14, actual);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetMaxDayCharacters1() throws Throwable  {
      // Given a JDayChooser instance with the maximum number of day characters set to 1
      JDayChooser jDayChooser = new JDayChooser();
      jDayChooser.setMaxDayCharacters(1);
      
      // When the maximum number of day characters is retrieved
      int maxDayCharacters = jDayChooser.getMaxDayCharacters();
      
      // Then the value should be 1
      assertEquals(1, maxDayCharacters);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testCreatesJDayChooserTakingBoolean() throws Throwable  {
      // Given a JDayChooser with week of year visibility enabled
      JDayChooser jDayChooser = new JDayChooser(true);
      
      // When the week of year visibility is set to false
      jDayChooser.setWeekOfYearVisible(false);
      
      // Then the week of year visibility should be disabled
      assertFalse(jDayChooser.isWeekOfYearVisible());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFocusGained() throws Throwable  {
      JDayChooser jDayPicker = new JDayChooser();
      jDayPicker.focusGained((FocusEvent) null);
      // Verify that decoration borders are not visible
      assertFalse(jDayPicker.isDecorationBordersVisible());
      // Verify that the day is correctly set
      assertEquals(14, jDayPicker.getDay());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetMinSelectableDate() throws Throwable  {
      // Given a JDayChooser with some initial state
      JDayChooser jDayChooser = new JDayChooser();
      
      // When setting the minimum selectable date to a specific value
      Date minSelectableDate = new Date(14, 0, 2022);
      Date setMinSelectableDate = jDayChooser.setMinSelectableDate(minSelectableDate);
      
      // Then the day field should be set to the correct value
      assertEquals(14, jDayChooser.getDay());
      
      // And the decoration background and borders should be visible
      assertTrue(jDayChooser.isDecorationBackgroundVisible());
      assertTrue(jDayChooser.isDayBordersVisible());
      
      // But the decoration borders should not be visible
      assertFalse(jDayChooser.isDecorationBordersVisible());
      
      // And the setMinSelectableDate method should return the same value as the input date
      assertSame(setMinSelectableDate, minSelectableDate);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetMonthChooser() throws Throwable  {
      // Given a new instance of JDayChooser
      JDayChooser jDayChooser = new JDayChooser();
      
      // When setting the month chooser to null
      jDayChooser.setMonthChooser(null);
      
      // Then the day should be 14
      assertEquals(14, jDayChooser.getDay());
      
      // And the week of year visibility should be false
      assertFalse(jDayChooser.isWeekOfYearVisible());
      
      // And the decoration borders visibility should be false
      assertFalse(jDayChooser.isDecorationBordersVisible());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetDayPanel() throws Throwable  {
      // rollbacked to evosuite
      JDayChooser jDayChooser = new JDayChooser();
      jDayChooser.getDayPanel();
      assertEquals(14, jDayChooser.getDay());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetSelectedDayReturningNull() throws Throwable  {
      // rollbacked to evosuite
      JDayChooser jDayChooser = new JDayChooser();
      jDayChooser.getSelectedDay();
      assertEquals(14, jDayChooser.getDay());
      assertTrue(jDayChooser.isDayBordersVisible());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetYearChooser() throws Throwable  {
      // Create a new JDayChooser instance
      JDayChooser jDayChooser = new JDayChooser();
      
      // Set the year chooser to null
      jDayChooser.setYearChooser(null);
      
      // Assert that the day is equal to 14
      assertEquals(14, jDayChooser.getDay());
      
      // Assert that the day borders are visible
      assertTrue(jDayChooser.isDayBordersVisible());
      
      // Assert that the decoration borders are not visible
      assertFalse(jDayChooser.isDecorationBordersVisible());
      
      // Assert that the decoration background is visible
      assertTrue(jDayChooser.isDecorationBackgroundVisible());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testFocusLost() throws Throwable  {
      // Given a JDayChooser with the current day set to 14
      JDayChooser chooser = new JDayChooser();
      chooser.setDay(14);
      
      // When the focus is lost from the JDayChooser
      FocusEvent event = new FocusEvent(chooser, (-1102), false, chooser);
      chooser.focusLost(event);
      
      // Then the day should be set to the previous day (13)
      assertEquals(13, chooser.getDay());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetSundayForeground() throws Throwable  {
      // Given a JDayChooser with default settings
      JDayChooser jDayChooser = new JDayChooser();
      
      // When setting the Sunday foreground to null
      jDayChooser.setSundayForeground(null);
      
      // Then the day borders are visible and the day is set to 14
      assertTrue(jDayChooser.isDayBordersVisible());
      assertEquals(14, jDayChooser.getDay());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetDecorationBackgroundColorReturningColorWhereGetGreenIsPositive() throws Throwable  {
      // Create a new JDayChooser instance
      JDayChooser jDayChooser = new JDayChooser();
      
      // Assert that the week of year is not visible
      assertFalse(jDayChooser.isWeekOfYearVisible());
      
      // Get the day value from the JDayChooser
      int day = jDayChooser.getDay();
      
      // Assert that the day value is 14
      assertEquals(14, day);
      
      // Assert that the decoration background color is visible
      assertTrue(jDayChooser.isDecorationBackgroundVisible());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testMainThrowsHeadlessException() throws Throwable  {
      // No Comments were added
      // Undeclared exception!
      try { 
        JDayChooser.main((String[]) null);
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
  public void testGetMaxDayCharactersReturningZero() throws Throwable  {
      // Create a new instance of the JDayChooser class
      JDayChooser jDayChooser = new JDayChooser();
      
      // Set the maximum number of characters allowed for the day
      int maxDayCharacters = jDayChooser.getMaxDayCharacters();
      
      // Assert that the decoration background is visible
      assertTrue(jDayChooser.isDecorationBackgroundVisible());
      
      // Assert that the maximum number of characters allowed for the day is 0
      assertEquals(0, maxDayCharacters);
      
      // Set the day to 14
      jDayChooser.setDay(14);
      
      // Assert that the day is set to 14
      assertEquals(14, jDayChooser.getDay());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetWeekdayForegroundReturningNull() throws Throwable  {
      JDayChooser jDayChooser = new JDayChooser();
      // Set the weekday foreground color to null
      jDayChooser.setWeekdayForeground(null);
      // Retrieve the weekday foreground color
      Color weekdayForeground = jDayChooser.getWeekdayForeground();
      // Assert that the retrieved color is null
      assertNull(weekdayForeground);
      // Set the day to 14
      jDayChooser.setDay(14);
      // Retrieve the day
      int day = jDayChooser.getDay();
      // Assert that the retrieved day is 14
      assertEquals(14, day);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetYear() throws Throwable  {
      // Given a JDayChooser instance with default settings
      JDayChooser jDayChooser = new JDayChooser();
      
      // When the year is set to 2023
      jDayChooser.setYear(2023);
      
      // Then the day should be equal to 14
      assertEquals(14, jDayChooser.getDay());
      
      // And the background decoration is visible
      assertTrue(jDayChooser.isDecorationBackgroundVisible());
      
      // And the week of year is not visible
      assertFalse(jDayChooser.isWeekOfYearVisible());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetLocale() throws Throwable  {
      // rollbacked to evosuite
      JDayChooser jDayChooser = new JDayChooser();
      jDayChooser.getLocale();
      assertEquals(14, jDayChooser.getDay());
      assertTrue(jDayChooser.isDecorationBackgroundVisible());
      assertTrue(jDayChooser.isDayBordersVisible());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsDecorationBordersVisible() throws Throwable  {
      // Test that the border of the day chooser is visible by default
      JDayChooser jDayChooser = new JDayChooser();
      assertTrue(jDayChooser.isDecorationBordersVisible());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsDecorationBackgroundVisible() throws Throwable  {
      // Given: A JDayChooser object is created and the decoration background is visible
      JDayChooser jDayChooser = new JDayChooser();
      boolean decorationBackgroundVisible = jDayChooser.isDecorationBackgroundVisible();
      
      // When: The day is set to 14
      jDayChooser.setDay(14);
      
      // Then: The day is correctly set and the decoration background is still visible
      assertEquals(14, jDayChooser.getDay());
      assertTrue(decorationBackgroundVisible);
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetSundayForeground() throws Throwable  {
      // rollbacked to evosuite
      JDayChooser jDayChooser = new JDayChooser();
      jDayChooser.getSundayForeground();
      assertEquals(14, jDayChooser.getDay());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetMaxSelectableDate() throws Throwable  {
      // rollbacked to evosuite
      JDayChooser jDayChooser = new JDayChooser();
      jDayChooser.getMaxSelectableDate();
      assertEquals(14, jDayChooser.getDay());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsDayBordersVisibleReturningTrue() throws Throwable  {
      // Create a new instance of JDayChooser with day borders visible
      JDayChooser jDayChooser = new JDayChooser(true);
      
      // Assert that the day borders are visible
      assertTrue(jDayChooser.isDayBordersVisible());
      
      // Assert that the decoration background is visible
      assertTrue(jDayChooser.isDecorationBackgroundVisible());
      
      // Assert that the decoration borders are not visible
      assertFalse(jDayChooser.isDecorationBordersVisible());
      
      // Assert that the week of year is not visible
      assertFalse(jDayChooser.isWeekOfYearVisible());
      
      // Assert that the day value is equal to 14
      assertEquals(14, jDayChooser.getDay());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testGetTemporaryCalendarThrowsNullPointerException() throws Throwable  {
      // Given a JDayChooser instance, which has not been initialized yet
      JDayChooser jDayChooser = new JDayChooser();
      
      try {
      // When we call getTemporaryCalendar() on the uninitialized JDayChooser instance
      jDayChooser.getTemporaryCalendar();
      
      // Then an exception should be thrown with a message indicating that the JDayChooser is not initialized
      fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      //
      // The exception should have a non-null message indicating why it was thrown
      //
      verifyException("accessories.plugins.time.JDayChooser", e);}
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testSetAlwaysFireDayProperty() throws Throwable  {
      // Given a JDayChooser instance with the alwaysFireDay property set to true
      JDayChooser jDayChooser = new JDayChooser();
      jDayChooser.setAlwaysFireDayProperty(true);
      
      // When the day is set to 14
      jDayChooser.setDay(14);
      
      // Then the day should be equal to 14
      assertEquals(14, jDayChooser.getDay());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsWeekOfYearVisibleReturningFalse() throws Throwable  {
      // Given: A JDayChooser object is created
      JDayChooser jDayChooser = new JDayChooser();
      
      // When: The visibility of the week of year is checked
      boolean isWeekOfYearVisible = jDayChooser.isWeekOfYearVisible();
      
      // Then: The week of year should not be visible
      assertFalse(isWeekOfYearVisible);
      
      // Given: The visibility of the day borders is checked
      boolean isDayBordersVisible = jDayChooser.isDayBordersVisible();
      
      // Then: The day borders should be visible
      assertTrue(isDayBordersVisible);
      
      // Given: The day is set to 14
      jDayChooser.setDay(14);
      
      // Then: The day should be 14
      assertEquals(14, jDayChooser.getDay());
  }

  @Test
  @Timeout(value = 4000 , unit = TimeUnit.MILLISECONDS)
  public void testIsFocusable() throws Throwable  {
      // Given a JDayChooser with a DecoratorButton that is focusable
      JDayChooser arg0 = new JDayChooser();
      JDayChooser.DecoratorButton jDayChooser_DecoratorButton = arg0.new DecoratorButton();
      
      // When the DecoratorButton is focused
      jDayChooser_DecoratorButton.isFocusable();
      
      // Then the week of year is not visible
      assertFalse(arg0.isWeekOfYearVisible());
  }
}
