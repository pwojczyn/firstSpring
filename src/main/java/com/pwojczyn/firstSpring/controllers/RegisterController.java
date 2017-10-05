package com.pwojczyn.firstSpring.controllers;

import com.pwojczyn.firstSpring.models.forms.RegisterForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RegisterController {
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

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String registerPost(@ModelAttribute("registerForm") RegisterForm registerForm, Model model) {
        model.addAttribute("info","Rejestarcja przebiegła pomyślnie dla logina: "+ registerForm.getLogin());
        return "register";
    }
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String registerPost(Model model) {
        model.addAttribute("registerForm", new RegisterForm());

        return "register";
    }

}
