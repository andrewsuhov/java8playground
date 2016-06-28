/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andrew.suhov.datetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 *
 * @author asuhov
 */
public class ZonedDateTimeTest
{
    public static void main(String[] args)
    {
        ZonedDateTime currentTime = ZonedDateTime.now();
        System.out.println("Current time: " + currentTime);
        
        ZonedDateTime date1 = ZonedDateTime.parse("2007-12-03T10:15:30+05:30[Asia/Karachi]");
        System.out.println("Date1: " + date1);
        
        ZoneId id = ZoneId.of("Europe/Paris");
        System.out.println("Zone id: " + id);
        
        ZoneId currentZone = ZoneId.systemDefault();
        System.out.println("Current zone: " + currentZone);
    }
}
