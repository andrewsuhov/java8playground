/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andrew.suhov.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 *
 * @author asuhov
 */
public class FunctionalInterfaceTest
{
    public static void main(String[] args)
    {
        List<Integer> digits = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        
        System.out.println("Print all numbers:");
        //eval(digits, digit -> true);
        forEach(digits, FunctionalInterfaceTest::print);
        
        System.out.println("Print even numbers:");
        //eval(digits, digit -> digit % 2 == 0);
        eval(digits, FunctionalInterfaceTest::isEven);
        
        System.out.println("Print numbers greater than 3:");
        eval(digits, digit -> digit > 3);
        
    }
    
    public static void eval(List<Integer> digits, Predicate<Integer> predicate)
    {
        for (Integer digit : digits)
        {
            if (predicate.test(digit))
            {
                System.out.println(digit + " ");
            }
        }
    }
    
    public static void forEach(List<Integer> digits, Consumer<Integer> consumer)
    {
        for (Integer digit : digits)
        {
            consumer.accept(digit);
        }
    }
    
    public static void print(Integer digit)
    {
        System.out.println(digit);
    }
    
    public static boolean isEven(Integer digit)
    {
        return digit % 2 == 0;
    }
}
