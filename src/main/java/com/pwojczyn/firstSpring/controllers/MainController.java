package com.pwojczyn.firstSpring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Random;

@Controller
public class MainController {
//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public String index(Model model) {
//        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
//        String[] text = {"1Co ty na to", "2Byłeś już tu !", "3Powiedz czy Ci się podoba tutaj", "4Zobacz moją stronkę", "5Kliknij mnie w nos ;)"};
//        Random generator = new Random();
//        int i = generator.nextInt(text.length);
//
//        model.addAttribute("helloMsg", text[i] + "Request: " + request.getQueryString());
//        return "index";
//    }
@RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {

        return "start";
    }

    @RequestMapping(value = "/message/{text}", method = RequestMethod.GET)
    @ResponseBody
    public String message(@PathVariable("text") String text) {


        return "<center>" + text + "</center>";
    }

}
