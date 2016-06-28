/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andrew.suhov.datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author asuhov
 */
public class PeriodDurationTest
{
    public static void main(String[] args)
    {
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current date: " + currentDate);
        
        LocalDate nextMonth = currentDate.plus(1, ChronoUnit.MONTHS);
        System.out.println("Next month: " + nextMonth);
        
        Period period = Period.between(nextMonth, currentDate);
        System.out.println("Period: " + period);
        
        LocalTime currentTime = LocalTime.now();
        Duration twoHours = Duration.ofHours(2);
        LocalTime twoHoursLater = currentTime.plus(twoHours);
        Duration duration = Duration.between(currentTime, twoHoursLater);
        
        System.out.println("Duration: " + duration);
    }
}
