/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andrew.suhov.defaultmethod;

/**
 *
 * @author asuhov
 */
public interface FourWheeler
{
    default void print()
    {
        System.out.println("I'm a fourwheeler!");
    }
}
