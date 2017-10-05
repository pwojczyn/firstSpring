package com.pwojczyn.firstSpring.models.dao;


import com.pwojczyn.firstSpring.models.WeatherModel;

import java.util.List;

public interface WeatherDao {
    void addWeather(WeatherModel model);
    List<WeatherModel> getAllWeatherData(String cityname);
    List<String> getCities();
}
