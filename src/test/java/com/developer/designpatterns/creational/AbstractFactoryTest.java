package com.developer.designpatterns.creational;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.developer.designpatterns.creational.AbstractFactory.FurnitureShopApp;
import com.developer.designpatterns.creational.AbstractFactory.ModernFurniture;
import com.developer.designpatterns.creational.AbstractFactory.VictorianFurniture;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Source: https://refactoring.guru/design-patterns/abstract-factory
 * @author Venkat_Nagarajan
 */
public class AbstractFactoryTest {
    
    public AbstractFactoryTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void AbsFactoryTest() {
        FurnitureShopApp app = new FurnitureShopApp(new VictorianFurniture());
        app.createSet();
        app = new FurnitureShopApp(new ModernFurniture());
        app.createSet();
    }
}
