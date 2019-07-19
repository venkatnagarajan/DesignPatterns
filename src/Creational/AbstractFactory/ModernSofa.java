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
public class ModernSofa implements Sofa{

    @Override
    public void type() {
        System.out.println("Modern sleak IKEA design sofa");
    }

    @Override
    public void hasLegs() {
        System.out.println("No separate legs needed. Box type");
    }

    @Override
    public void sitOnCapacity() {
        System.out.println("Seating capacity of 3");
    }
    
}
