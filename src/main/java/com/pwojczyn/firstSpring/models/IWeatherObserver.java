package com.pwojczyn.firstSpring.models;

public interface IWeatherObserver {
    void onWeatherUpdate(WeatherInfo info);
}
