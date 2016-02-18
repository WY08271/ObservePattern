package com.pattern.observer;

/**
 *具体的目标对象,负责把有关状态存入到相应的观察者中
 */
public class ConcreteWeatherSubject extends WeatherSubject {

//    private String subjectState;
//
//    public String getSubjectState() {
//        return subjectState;
//    }
//
//    public void setSubjectState(String subjectState) {
//        this.subjectState = subjectState;
//        this.notifyObservers();
//    }

    private String weatherContent;

    public String getWeatherContent() {
        return weatherContent;
    }

    public void setWeatherContent(String weatherContent) {
        this.weatherContent = weatherContent;
        this.notifyObservers();
    }

//    public void setWeatherContent(String weatherContent) {
//        this.weatherContent = weatherContent;
//        this.notifyObservers(weatherContent);
//    }
}
