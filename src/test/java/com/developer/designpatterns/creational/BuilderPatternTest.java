/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.developer.designpatterns.creational;

import com.developer.designpatterns.creational.BuilderPattern.ConcreteHouseBuilder;
import com.developer.designpatterns.creational.BuilderPattern.ConstructionDirector;
import com.developer.designpatterns.creational.BuilderPattern.House;
import com.developer.designpatterns.creational.BuilderPattern.HouseBuilder;
import com.developer.designpatterns.creational.BuilderPattern.PrefabricatedHouseBuilder;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Venkat_Nagarajan
 */
public class BuilderPatternTest {
    
    public BuilderPatternTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

     @Test
     public void testConstruct() throws Exception{
         HouseBuilder builder = new ConcreteHouseBuilder();
         ConstructionDirector director = new ConstructionDirector(builder);
         House house = director.constructHouse(builder);
         System.out.println("House details : "+house);
         builder = new PrefabricatedHouseBuilder();
         director = new ConstructionDirector(builder);
         house = director.constructHouse(builder);
         System.out.println("House details : "+house);
     }
}
