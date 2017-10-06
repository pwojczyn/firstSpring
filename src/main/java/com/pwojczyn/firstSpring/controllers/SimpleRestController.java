package com.pwojczyn.firstSpring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/simplerest")
public class SimpleRestController {
    @RequestMapping("")
    public String simpleRestView(){
        return "simpleRestInfo";
    }

    @RequestMapping("/get/{login}")
    public String simpleRestGet(@PathVariable("login") String login, Model model){
        model.addAttribute("info","Przekazano login: "+login);

        return "simpleREST";
    }
}
