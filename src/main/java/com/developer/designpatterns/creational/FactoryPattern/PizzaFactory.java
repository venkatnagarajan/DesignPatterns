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
public class PizzaFactory {
    public Pizza createPizza(String sPizza){
        Pizza pizza;
        switch(sPizza.toLowerCase()){
            case "cheese":
                pizza = new CheesePizza();
                break;
            case "veggie":
                pizza = new VeggiePizza();
                break;
            default: throw new IllegalArgumentException("no such pizza");
        }
        pizza.addIngredients();
        pizza.bakePizza();
        return pizza;
    }
}
