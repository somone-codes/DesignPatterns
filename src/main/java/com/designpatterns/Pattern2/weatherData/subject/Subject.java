package com.designpatterns.Pattern2.weatherData.subject;

import com.designpatterns.Pattern2.weatherData.observer.Observer;

public interface Subject <T extends Observer>{
    void subscribe(T o);
    void unsubscribe(T o);
    void notifySubscribers();
}
