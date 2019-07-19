/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behavioural.ObserverPattern.Observers;

//import ObserverPattern.Subject.Subject;

import Behavioural.ObserverPattern.Subject.WeatherData;
import java.util.Observable;


/**
 *
 * @author Venkat_Nagarajan
 */
public class CurrentConditionsDisplay implements java.util.Observer{

    private Observable weatherObj;
    private float temperature;
    private float pressure;
    private float humidity;
    
    public CurrentConditionsDisplay(Observable WeatherDataObj) {
        this.weatherObj = WeatherDataObj;
        weatherObj.addObserver(this);
    }

//    @Override
//    public void update(float temp, float pressure, float humidity) {
//        this.temperature = temp;
//        this.pressure = pressure;
//        this.humidity = humidity;
//        display();
//    }
    private void display(){
        System.out.println("Temperature is:"+temperature);
        System.out.println("Pressure is:"+pressure);
        System.out.println("Humidity is:"+humidity);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData){
            WeatherData data = (WeatherData)o;
            this.temperature = data.getTemperature();
            this.humidity = data.getHum();
            this.pressure = data.getPress();
            display();
        }
        
    }
       
}
