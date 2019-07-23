/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.developer.designpatterns.creational;

import com.developer.designpatterns.creational.FactoryPattern.Pizza;
import com.developer.designpatterns.creational.FactoryPattern.PizzaFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Source: https://springframework.guru/gang-of-four-design-patterns/factory-method-design-pattern/
 * test class for Factory pattern
 * @author Venkat_Nagarajan
 */
public class FactoryTest {
    
    public FactoryTest() {
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
    public void createPizzaTest() {
        PizzaFactory factory = new PizzaFactory();
        Pizza cheesePizza = factory.createPizza("cheese");
        Pizza veggiePizza = factory.createPizza("veggie");
    }
}
