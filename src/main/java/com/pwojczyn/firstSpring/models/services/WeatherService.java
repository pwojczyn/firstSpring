package com.pwojczyn.firstSpring.models.services;


import com.pwojczyn.firstSpring.models.Config;
import com.pwojczyn.firstSpring.models.IWeatherObserver;
import com.pwojczyn.firstSpring.models.Utils;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class WeatherService {
    private static WeatherService ourInstance = new WeatherService();

    private List<IWeatherObserver> observer = new ArrayList<>();

    private ExecutorService executorService;


    public static WeatherService getService() {
        return ourInstance;
    }

    private WeatherService() {
        executorService = Executors.newSingleThreadExecutor();
    }

    public String makeRequest(String city) {

        String result = null;
        try {
            result = readJsonData(Utils.makeHttpRequest(Config.APP_BASE_URL + city + "&appid=" + Config.APP_ID), city);
        } catch (JSONException e) {
            e.printStackTrace();
        }


        return result;
    }

    private String readJsonData(String json, String cityname) throws JSONException {
        //cisnienie, widocznosc, zachmurzenie
        String result;
        JSONObject root = new JSONObject(json);
        JSONObject main = root.getJSONObject("main");

        double temp = main.getDouble("temp");
        //System.out.println("Tempertaura: " + temp);


        int pressure = main.getInt("pressure");
        //System.out.println("pressure: " + pressure);

//        int visibility = root.getInt("visibility");
//        System.out.println("visibility" + visibility);

        JSONObject cloud = root.getJSONObject("clouds");

        double all = cloud.getDouble("all");
        result="Temperatura: "+temp+ "Ciśnienie: "+pressure+" Chmury: "+cloud;

    return result;
    }

    public void registerObserver(IWeatherObserver observer){

        this.observer.add(observer);
    }
}
