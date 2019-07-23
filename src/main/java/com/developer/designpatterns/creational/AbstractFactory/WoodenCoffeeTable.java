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
public class WoodenCoffeeTable implements CoffeeTable{

    @Override
    public void type() {
        System.out.println("Wooden table");
    }

    @Override
    public void plankType() {
        System.out.println("Made of pure teak");
    }
    
}
