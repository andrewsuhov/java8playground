/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andrew.suhov.java8playground.defaultmethod;

/**
 *
 * @author asuhov
 */
public interface Vehicle
{
    default void print()
    {
        System.out.println("I'm a vehicle!");
    }
    
    static void blowHorn()
    {
        System.out.println("Blowing horn");
    }
}
