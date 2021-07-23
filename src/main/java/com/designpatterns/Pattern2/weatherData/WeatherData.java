package com.designpatterns.Pattern2.weatherData;

import com.designpatterns.Pattern2.weatherData.subject.Subject;
import com.designpatterns.Pattern2.weatherData.observer.Observer;

import java.util.ArrayList;

public class WeatherData implements Subject<Observer> {

    private ArrayList observers;

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void subscribe(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        int index = this.observers.indexOf(observer);
        if (index>=0)
            this.observers.remove(index);
    }

    @Override
    public void notifySubscribers() {
        observers.stream().map(Observer.class::cast).forEach(observer-> ((Observer) observer).update(temperature,
                pressure, humidity));
    }

    public  void weatherUpdate(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifySubscribers();
    }


}
