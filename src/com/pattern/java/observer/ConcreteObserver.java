package com.pattern.java.observer;

import java.util.Observable;
import java.util.Observer;

public class ConcreteObserver implements Observer{
    private String observerName;

    public String getObserverName() {
        return observerName;
    }

    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }

    @Override
    public void update(Observable o, Object arg) {
        //推模型
        System.out.println(observerName + "收到了" + arg);
        //拉模型
        System.out.println(observerName + " 拉到了" + ((ConcreteWeatherSubject)o).getContent());
    }
}
