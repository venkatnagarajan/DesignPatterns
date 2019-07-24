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
public class PrefabricatedHouseBuilder implements HouseBuilder{

    private House house;

    public PrefabricatedHouseBuilder() {
        this.house = new House();
    }
    
    @Override
    public void buildFoundation() {
        house.setFoundation("Wood, laminate and PVC");
        System.out.println("PrefabricatedHouseBuilder: Foundation completed");
    }

    @Override
    public void buildStructure() {
        house.setStructure("Steel and wood");
        System.out.println("PrefabricatedHouseBuilder: Structure completed");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Roofing sheets");
        System.out.println("PrefabricatedHouseBuilder: Roof completed");
    }

    @Override
    public void paintHouse() {
        house.setPainted(false);
        System.out.println("PrefabricatedHouseBuilder: Painting not needed");
    }

    @Override
    public void furnishHouse() {
        house.setFurnished(true);
        System.out.println("PrefabricatedHouseBuilder: furnishing complete");
    }

    @Override
    public House getHouse() {
        System.out.println("PrefabricatedHouseBuilder: Returning a fabricated house");
        return this.house;
    }
    
}
