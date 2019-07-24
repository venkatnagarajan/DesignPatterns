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
public class ConstructionDirector {
    private HouseBuilder builder;

    public ConstructionDirector(HouseBuilder builder) {
        this.builder = builder;
    }
    
    public House constructHouse(HouseBuilder building){
        this.builder.buildFoundation();
        this.builder.buildStructure();
        this.builder.buildRoof();
        this.builder.paintHouse();
        this.builder.furnishHouse();
        
        return this.builder.getHouse();
    }
}
