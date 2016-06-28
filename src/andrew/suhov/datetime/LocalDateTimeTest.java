/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andrew.suhov.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/**
 *
 * @author asuhov
 */
public class LocalDateTimeTest
{
    public static void main(String[] args)
    {
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("Current time: " + currentTime);
        
        LocalDate date1 = currentTime.toLocalDate();
        System.out.println("Current date: " + date1);
        
        Month month = currentTime.getMonth();
        int day = currentTime.getDayOfMonth();
        int seconds = currentTime.getSecond();
        System.out.println("Month: " + month + "; Day: " + day + "; Seconds: " + seconds);
        
        LocalDateTime date2 = currentTime.withDayOfMonth(10).withYear(2012);
        System.out.println("Date2: " + date2);
        
        LocalDate date3 = LocalDate.of(2014, Month.DECEMBER, 12);
        System.out.println("Date3: " + date3);
        
        LocalTime date4 = LocalTime.of(22, 15);
        System.out.println("Date4: " + date4);
        
        LocalTime date5 = LocalTime.parse("20:15:30");
        System.out.println("Date5: " + date5);
    }
}
