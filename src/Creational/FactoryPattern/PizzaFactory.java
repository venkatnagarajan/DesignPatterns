/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creational.FactoryPattern;

/**
 *
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
