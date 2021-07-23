package com.designpatterns.Pattern2.weatherData.subject;

public interface Subject <T>{
    void subscribe(T o);
    void unsubscribe(T o);
    void notifySubscribers();
}
