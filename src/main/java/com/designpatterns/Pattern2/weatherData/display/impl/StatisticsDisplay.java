package com.designpatterns.Pattern2.weatherData.display.impl;

import com.designpatterns.Pattern2.weatherData.display.Display;
import com.designpatterns.Pattern2.weatherData.subject.Subject;
import org.json.JSONObject;

import java.util.Observable;
import java.util.Observer;


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

    public void update(Observable o, Object args) {
        if (o instanceof Subject){
            JSONObject data = (JSONObject) args;
            this.temperature = data.getFloat("temperature");
            this.pressure = data.getFloat("pressure");
            display();
        }
    }
}
