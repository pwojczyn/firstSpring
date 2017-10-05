package com.pwojczyn.firstSpring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AgeController {
    @RequestMapping(value = "/age/{age}", method = RequestMethod.GET)
    @ResponseBody
    public String age(@PathVariable("age") int age) {

       String msg;
       if (age < 18) {
          msg = "Masz za mało lat";
       }else{
           msg = "Jesteś pelnoletni";
       }

        return "<center>" + msg + "</center>";
    }
}
