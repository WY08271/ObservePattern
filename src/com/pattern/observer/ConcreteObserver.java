package com.pattern.observer;

/**
 *具体的观察者对象,实现更新的方法,使自身的状态和目标状态保持一致
 */
public class ConcreteObserver implements Observer {
//    private String observerState;
//
//    @Override
//    public void update(WeatherSubject subject) {
//        observerState = ((ConcreteWeatherSubject)subject).getSubjectState();
//    }

    private String observerName;
    private String weatherContent;
    private String remindThing;

    public String getWeatherContent() {
        return weatherContent;
    }

    public String getObserverName() {
        return observerName;
    }

    public String getRemindThing() {
        return remindThing;
    }

    public void setWeatherContent(String weatherContent) {
        this.weatherContent = weatherContent;
    }

    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }

    public void setRemindThing(String remindThing) {
        this.remindThing = remindThing;
    }

    @Override
    public void update(WeatherSubject subject) {
        weatherContent = ((ConcreteWeatherSubject)subject).getWeatherContent();
        System.out.print(observerName + "收到了" + weatherContent +"," + remindThing + "\n");
    }

//    @Override
//    public void update(String content) {
//        weatherContent = content;
//        System.out.print(observerName + "收到了" + weatherContent +"," + remindThing + "\n");
//    }
}
