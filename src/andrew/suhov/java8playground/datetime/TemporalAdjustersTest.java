/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andrew.suhov.java8playground.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

/**
 *
 * @author asuhov
 */
public class TemporalAdjustersTest
{
    public static void main(String[] args)
    {
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current date: " + currentDate);
        
        LocalDate nextTuesday = currentDate.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
        System.out.println("Next tuesday on: " + nextTuesday);
        
        LocalDate firstDayOfCurrentMonth = LocalDate.of(currentDate.getYear(), currentDate.getMonth(), 1);
        LocalDate secondSaturday = firstDayOfCurrentMonth.with(TemporalAdjusters
                .nextOrSame(DayOfWeek.SATURDAY)).with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
        System.out.println("Second saturday on: " + secondSaturday);
    }
}
