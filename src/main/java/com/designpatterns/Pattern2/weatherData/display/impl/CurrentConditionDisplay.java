package com.designpatterns.Pattern2.weatherData.display.impl;

import com.designpatterns.Pattern2.weatherData.display.Display;
import com.designpatterns.Pattern2.weatherData.observer.Observer;
import com.designpatterns.Pattern2.weatherData.subject.Subject;

public class CurrentConditionDisplay implements Display, Observer {
    Subject wd;
    float temperature;
    float humidity;

    public CurrentConditionDisplay(Subject weatherData) {
        wd = weatherData;
        wd.subscribe(this);
    }

    @Override
    public void display() {
        System.out.println(String.format("Current conditions: %s C degrees Temperature and %s humidity",temperature,
                humidity));
    }

    @Override
    public void update(float temp, float pressure, float humidity) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
