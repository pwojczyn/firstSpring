package com.pwojczyn.firstSpring.controllers;

import com.pwojczyn.firstSpring.models.forms.AgeForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AgeController {

    @RequestMapping(value = "/age", method = RequestMethod.GET)
    public String age(Model model) {
        model.addAttribute("ageForm", new AgeForm());
        return "age";
    }

    @RequestMapping(value = "/age", method = RequestMethod.POST)
     public String ageForm(@ModelAttribute("ageForm") AgeForm ageForm, Model model) {

       String msg;
       if (ageForm.getAge() < 18) {
          msg = "Masz za mało lat";
       }else{
           msg = "Jesteś pelnoletni";
       }
        model.addAttribute("info",msg );
        return "age";
    }
}
