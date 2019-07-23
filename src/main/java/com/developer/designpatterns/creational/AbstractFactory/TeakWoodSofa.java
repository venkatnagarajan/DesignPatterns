/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.developer.designpatterns.creational.AbstractFactory;

/**
 * Source: https://refactoring.guru/design-patterns/abstract-factory
 * @author Venkat_Nagarajan
 */
public class TeakWoodSofa implements Sofa{

    @Override
    public void type() {
        System.out.println("Teak wood sofa.");
    }

    @Override
    public void hasLegs() {
        System.out.println("With 4 legs");
    }

    @Override
    public void sitOnCapacity() {
        System.out.println("Seating capacity of 3");
    }
    
}
