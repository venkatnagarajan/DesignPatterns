/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behavioural.ObserverPattern.Subject;

import Behavioural.ObserverPattern.Observers.Observer;

/**
 *
 * @author Venkat_Nagarajan
 */
public interface Subject {
    public void registerObserver(Observer obs);
    public void removeObserver(Observer obs);
    public void notifyObservers(float temp, float pressure, float humidity);
    
}
