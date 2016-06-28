/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andrew.suhov.java8playground.datetime;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author asuhov
 */
public class ChronoUnitsTest
{
    public static void main(String[] args)
    {
        LocalDate today = LocalDate.now();
        System.out.println("Current date: " + today);
        
        LocalDate nextWeek = today.plus(1, ChronoUnit.WEEKS);
        System.out.println("Next week: " + nextWeek);
        
        LocalDate nextMonth = today.plus(1, ChronoUnit.MONTHS);
        System.out.println("Next month: " + nextMonth);
        
        LocalDate nextYear = today.plus(1, ChronoUnit.YEARS);
        System.out.println("Next year: " + nextYear);
        
        LocalDate nextDecade = today.plus(1, ChronoUnit.DECADES);
        System.out.println("Next decade: " + nextDecade);
    }
}
