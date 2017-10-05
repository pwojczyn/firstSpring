package com.pwojczyn.firstSpring.controllers;

import com.pwojczyn.firstSpring.models.forms.CarForm;
import com.pwojczyn.firstSpring.models.forms.RegisterForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
Stwórz osobny kontroler, templatke i formularz do otrzymywania danych o pojeździe, takich jak: rok produkcji, model, marka. Po wysłaniu formularzu, użytkownik winien zobaczyc komunikat "Rok produkcji + nazwa" na podstawie danych, które wcześniej wysłał

rok produkcji, model, marka.
 */

/*        Sobota:        Poznanie IF'A w thymeleaf na podstawie roku produkcji (zmiana koloru tekstu)        Walidacja formularzy na podstawie JSR-303        Internacjonalizacja aplikacji i komunikatów        Wstęp do JPA & Hibernate w podejsciu SpringBoot.     */
@Controller
public class CarController {
    @RequestMapping(value = "/car", method = RequestMethod.POST)
    public String carInfo(@ModelAttribute("carForm") CarForm carForm, Model model) {
        model.addAttribute("info",carForm.getProductionYear() );
        return "carInfo";
    }
    @RequestMapping(value = "/car", method = RequestMethod.GET)
    public String carGet(Model model) {
        model.addAttribute("carForm", new CarForm());

        return "car";
    }
}
