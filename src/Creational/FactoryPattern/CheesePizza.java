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
public class CheesePizza extends Pizza{

    @Override
    public void addIngredients() {
        System.out.println("Add ingredients for Cheese Pizza");
    }
    
}
