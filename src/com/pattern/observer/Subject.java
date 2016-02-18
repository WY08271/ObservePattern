package com.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *  目标对象,它知道观察它的观察者,并提供添加删除观察者的接口
 */
public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();


    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    protected void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}