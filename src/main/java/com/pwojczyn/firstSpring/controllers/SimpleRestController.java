package com.pwojczyn.firstSpring.controllers;

import com.pwojczyn.firstSpring.models.dao.ISimpleRESTDao;
import com.pwojczyn.firstSpring.models.dao.impl.SimpleRestDaoImpl;
import com.pwojczyn.firstSpring.models.forms.SimpleRestForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/simplerest")
public class SimpleRestController {
    private ISimpleRESTDao simpleRESTDao = new SimpleRestDaoImpl();
    @RequestMapping("")
    public String simpleRestView(){
        return "simpleRestInfo";
    }

    @RequestMapping("/get/{login}")
    public String simpleRestGet(@PathVariable("login") String login, Model model){
        List<SimpleRestForm> loginMessageList = new ArrayList<>();

        loginMessageList = simpleRESTDao.getAllLoginData(login);

        model.addAttribute("login",login);

        model.addAttribute("loginMessageList",loginMessageList);


        return "simpleRESTLogin";
    }
}
