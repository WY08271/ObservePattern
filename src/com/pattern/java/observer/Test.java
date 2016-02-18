package com.pattern.java.observer;

import java.util.Observer.*;

public class Test {
    public static void main(String[] args){
        ConcreteWeatherSubject subject = new ConcreteWeatherSubject();

        ConcreteObserver girl = new ConcreteObserver();
        girl.setObserverName("girl");

        ConcreteObserver boy = new ConcreteObserver();
        boy.setObserverName("boy");

        subject.addObserver(girl);
        subject.addObserver(boy);

        subject.setContent("weather");
    }
}
