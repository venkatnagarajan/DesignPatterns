/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creational.AbstractFactory;

/**
 *
 * @author Venkat_Nagarajan
 */
public class ModernChair implements Chair{

    @Override
    public void type() {
        System.out.println("Modern Chair with sleak design");
    }

    @Override
    public void hasLegs() {
        System.out.println("Nope. No legs. Modern sleak design");
    }

    @Override
    public void sitOnCapacity() {
        System.out.println("Comfortable seating for 1 with arm rests");
    }
    
}
