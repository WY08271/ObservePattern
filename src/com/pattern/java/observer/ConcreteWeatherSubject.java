package com.pattern.java.observer;

import java.util.Observable;

/**
 *天气目标的具体实现类
 */
public class ConcreteWeatherSubject extends Observable{
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        this.setChanged();
        /**
         * java 的 observer 模式下必须写 setchanged
         * 拉模型不带参数
         * 退模型带参数
         */
//        this.notifyObservers();
        this.notifyObservers(content);
    }
}
