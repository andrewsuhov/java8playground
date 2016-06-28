/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andrew.suhov.java8playground.optionalclass;

import java.util.Optional;

/**
 *
 * @author asuhov
 */
public class OptionalClassTest
{
    public static void main(String[] args)
    {
        Integer value1 = null;
        Integer value2 = 10;
        
        Optional<Integer> a = Optional.ofNullable(value1);
        Optional<Integer> b = Optional.of(value2);
        
        System.out.println(sum(a, b));
    }
    
    public static Integer sum(Optional<Integer> a, Optional<Integer> b)
    {
        System.out.println("Is first parameter present? - " + a.isPresent());
        System.out.println("Is second parameter present? - " + b.isPresent());
        
        Integer value1 = a.orElse(0);
        Integer value2 = b.get();
        return value1 + value2;
    }
}
