package com.pwojczyn.firstSpring.controllers;

import com.pwojczyn.firstSpring.models.services.WeatherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WeatherController {
    private WeatherService weatherService = WeatherService.getService();

    //    @RequestMapping(value = "/register", method = RequestMethod.POST)
//    public String registerPost(@RequestParam("login") String login,
//                               @RequestParam("password") String password,
//                               @RequestParam("passwordRepeat") String passwordRepeat, Model model) {
//        String text = password.equals(passwordRepeat) ? "Zarejestrowany poprawnie" : "Hasła nie są równe";
//        model.addAttribute("info",text);
//        return "register";
//    }
//    @RequestMapping(value = "/register", method = RequestMethod.GET)
//    public String registerPost() {
//
//        return "register";
//    }
    @RequestMapping(value = "/weather", method = RequestMethod.GET)
    public String weather() {

        return "weather";
    }
    @RequestMapping(value = "/weather", method = RequestMethod.POST)

    public String weather(@RequestParam("city") String city, Model model) {
        String text = "Pogoda dla miasta: "+city;
       model.addAttribute("weatherMsg",text);
        String cityInfo = weatherService.makeRequest(city);

        model.addAttribute("cityInfo",cityInfo);
        return "weather";
    }
}
