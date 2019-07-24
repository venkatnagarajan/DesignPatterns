/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.developer.designpatterns.creational.BuilderPattern;

/**
 *
 * @author Venkat_Nagarajan
 */
public class ConcreteHouseBuilder implements HouseBuilder{

    private House house;

    public ConcreteHouseBuilder() {
        this.house = new House();
    }


    @Override
    public void buildFoundation() {
        this.house.setFoundation("Concrete, Brick and Stone");
        System.out.println("ConcreteHouseBuilder: Foundation completed");
    }

    @Override
    public void buildStructure() {
        house.setStructure("Concrete and steel");
        System.out.println("ConcreteHouseBuilder: Structure completed");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Concrete and steel");
        System.out.println("ConcreteHouseBuilder: Roof completed");
    }

    @Override
    public void paintHouse() {
        house.setPainted(true);
        System.out.println("ConcreteHouseBuilder: Painting completed");
    }

    @Override
    public void furnishHouse() {
        house.setFurnished(true);
        System.out.println("ConcreteHouseBuilder: furnishing complete");
    }

    @Override
    public House getHouse() {
        System.out.println("ConcreteHouseBuilder: Returning a concrete house");
        return this.house;
    }
    
}
