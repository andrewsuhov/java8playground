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
public class Car implements Vehicle, FourWheeler
{
    @Override
    public void print()
    {
        Vehicle.super.print();
        FourWheeler.super.print();
    }
}
