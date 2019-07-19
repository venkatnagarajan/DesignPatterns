/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creational.FactoryPattern;

/**
 * The base class. this can be an abstract class or an interface
 * @author Venkat_Nagarajan
 */
public abstract class Pizza {
    public void  bakePizza(){
        System.out.println("Bake to 400 deg C");
    }
    public abstract void  addIngredients();
    
}
