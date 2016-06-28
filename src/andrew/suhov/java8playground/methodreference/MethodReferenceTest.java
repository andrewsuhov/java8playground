/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andrew.suhov.java8playground.methodreference;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author asuhov
 */
public class MethodReferenceTest
{
    public static void main(String[] args)
    {
        List<String> names = Arrays.asList("Andrew", "Julia", "Charles", "Diana", "Eugene");
        
        names.forEach(System.out::println);
        names.forEach(name -> System.out.println(name));
    }
}
