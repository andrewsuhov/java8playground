/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andrew.suhov.java8playground.datetime;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

/**
 *
 * @author asuhov
 */
public class BackwardCompability
{
    public static void main(String[] args)
    {
        Date currentDate = new Date();
        System.out.println("Current date: " + currentDate);
        
        Instant now = currentDate.toInstant();
        ZoneId currentZone = ZoneId.systemDefault();
        
        LocalDateTime localDateTime = LocalDateTime.ofInstant(now, currentZone);
        System.out.println("Local date time: " + localDateTime);
        
        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(now, currentZone);
        System.out.println("Zoned date time: " + zonedDateTime);
    }
}
