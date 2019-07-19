/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behavioural.ObserverPattern;

import Behavioural.ObserverPattern.Observers.CurrentConditionsDisplay;
import Behavioural.ObserverPattern.Subject.WeatherData;

/**
 *
 * @author Venkat_Nagarajan
 */
public class TestObserverPattern {
    public static void main(String args[]){
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        //currentDisplay.
        System.out.println("Before calling setCurrentState");
        weatherData.setCurrentState(40, 25, 10);
        weatherData.setCurrentState(60, 45, 30);
    }
}
