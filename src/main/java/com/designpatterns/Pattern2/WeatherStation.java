package com.designpatterns.Pattern2;

import com.designpatterns.Pattern2.weatherData.display.Display;
import com.designpatterns.Pattern2.weatherData.display.impl.CurrentConditionDisplay;
import com.designpatterns.Pattern2.weatherData.display.impl.StatisticsDisplay;
import com.designpatterns.Pattern2.weatherData.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData wd = new WeatherData();
        Display currentConditionDisplay = new CurrentConditionDisplay(wd);
        Display statisticsDisplay = new StatisticsDisplay(wd);

        wd.weatherUpdate(25f,30.2f, 22f);

        System.out.println("sending update and displays will refresh themselves");
        wd.weatherUpdate(30f,30f, 22f);
    }
}
