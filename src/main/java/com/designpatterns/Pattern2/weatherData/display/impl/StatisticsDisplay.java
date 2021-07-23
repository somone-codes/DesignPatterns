package com.designpatterns.Pattern2.weatherData.display.impl;

import com.designpatterns.Pattern2.weatherData.display.Display;
import com.designpatterns.Pattern2.weatherData.observer.Observer;
import com.designpatterns.Pattern2.weatherData.subject.Subject;


public class StatisticsDisplay implements Display, Observer {
    Subject wd;
    float temperature;
    float pressure;

    public StatisticsDisplay(Subject weatherData) {
        wd = weatherData;
        wd.subscribe(this);
    }

    @Override
    public void display() {
        System.out.println(String.format("Current conditions: %s C degrees Temperature and %s pressure",temperature,
                pressure));
    }

    @Override
    public void update(float temp, float pressure, float humidity) {
        this.temperature = temp;
        this.pressure = pressure;
        display();
    }
}
