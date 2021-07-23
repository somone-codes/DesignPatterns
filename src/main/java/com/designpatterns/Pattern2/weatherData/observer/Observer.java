package com.designpatterns.Pattern2.weatherData.observer;

public interface Observer {
    void update(float temp, float pressure, float humidity);
}
