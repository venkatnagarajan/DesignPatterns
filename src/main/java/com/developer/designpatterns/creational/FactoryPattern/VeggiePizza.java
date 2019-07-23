/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.developer.designpatterns.creational.FactoryPattern;

/**
 * Source: https://springframework.guru/gang-of-four-design-patterns/factory-method-design-pattern/
 * @author Venkat_Nagarajan
 */
public class VeggiePizza extends Pizza{

    @Override
    public void addIngredients() {
        System.out.println("Add ingredients for Veggie Pizza");
    }
    
}
