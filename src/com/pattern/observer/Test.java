package com.pattern.observer;


public class Test {
    public static void main(String[] args){
        /**
         * 1.创建目标
         * 2.创建观察者
         * 3.注册观察者
         * 4.目标发布天气情况
         */

        ConcreteWeatherSubject weather = new ConcreteWeatherSubject();
        ConcreteObserver observerGirl = new ConcreteObserver();
        observerGirl.setObserverName("Girl");
        observerGirl.setRemindThing("1234567890");

        ConcreteObserver observerBoy = new ConcreteObserver();
        observerBoy.setObserverName("Boy");
        observerBoy.setRemindThing("0987654321");

        weather.attach(observerGirl);
        weather.attach(observerBoy);

        weather.setWeatherContent("comment weather");
    }
}
