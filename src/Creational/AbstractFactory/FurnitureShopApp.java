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
public class FurnitureShopApp {
    private Chair chair;
    private Sofa sofa;
    private CoffeeTable table;
    
    public FurnitureShopApp(FurnitureFactory ff){
        this.chair = ff.createChair();
        this.sofa = ff.createSofa();
        this.table = ff.createTable();
    }
    
    public void createSet(){
        chair.type();
        sofa.type();
        table.type();
    }
}
