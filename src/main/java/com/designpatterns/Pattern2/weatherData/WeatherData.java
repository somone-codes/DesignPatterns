package com.designpatterns.Pattern2.weatherData;

import com.designpatterns.Pattern2.weatherData.subject.Subject;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Observable;

public class WeatherData extends  Observable implements Subject<java.util.Observer> {

    private ArrayList observers;

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void subscribe(java.util.Observer o) {
        addObserver(o);
    }

    @Override
    public void unsubscribe(java.util.Observer o) {
        unsubscribe(o);
    }

    public void notifySubscribers() {
        JSONObject dataJson = new JSONObject();
        dataJson.put("temperature", temperature);
        dataJson.put("humidity", humidity);
        dataJson.put("pressure", pressure);
        setChanged();
        notifyObservers(dataJson);
    }

    public  void weatherUpdate(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifySubscribers();
    }


}
