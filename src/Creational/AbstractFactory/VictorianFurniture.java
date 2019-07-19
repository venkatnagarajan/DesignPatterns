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
public class VictorianFurniture implements FurnitureFactory{

    @Override
    public Chair createChair() {
        return new TeakWoodChair();
    }

    @Override
    public Sofa createSofa() {
        return new TeakWoodSofa();
    }

    @Override
    public CoffeeTable createTable() {
        return new WoodenCoffeeTable();
    }
    
}
