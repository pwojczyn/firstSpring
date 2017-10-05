package com.pwojczyn.firstSpring.controllers;

import com.pwojczyn.firstSpring.models.forms.AgeForm;
import com.pwojczyn.firstSpring.models.forms.TextForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class TextController {
    @RequestMapping(value = "/text", method = RequestMethod.GET)
    public String age(Model model) {
        model.addAttribute("textForm", new TextForm());
        return "textEncoder";
    }

    @RequestMapping(value = "/text", method = RequestMethod.POST)
    public String ageForm(@ModelAttribute("textForm") TextForm textForm, Model model) {


        model.addAttribute("info",textForm.encodeText(textForm.getText()) );
        return "textEncoder";
    }
}
