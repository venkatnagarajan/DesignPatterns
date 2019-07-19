/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behavioural.ObserverPattern.Subject;

import Behavioural.ObserverPattern.Observers.Observer;
import java.util.ArrayList;
import java.util.Observable;

/**
 *
 * @author Venkat_Nagarajan
 */
public class WeatherData extends Observable{

    private ArrayList<Observer> observers;
    private float temp;
    private float hum;
    private float press;

    public float getHum() {
        return hum;
    }

    public float getPress() {
        return press;
    }

    public WeatherData() {
        this.observers = new ArrayList();
    }
    
//    @Override
//    public void registerObserver(Observer obs) {
//        observers.add(obs);
//        
//    }

//    @Override
//    public void removeObserver(Observer obs) {
//        observers.remove(obs);
//    }

//    @Override
//    public void notifyObservers(float temp, float pressure, float humidity) {
//        
//        for (int i=0;i<observers.size();i++){
//            observers.get(i).update(temp, pressure, humidity);
//        }
//    }
    
    public void setCurrentState(float temp, float pressure, float humidity){
        System.out.println("Setting current state....");
        this.hum = humidity;
        this.temp = temp;
        this.press = pressure;
        //notifyObservers(temp, pressure, humidity);
        setChanged();
        notifyObservers();
    }
    
    public float getTemperature(){
        return this.temp;
    }
    
    
}
