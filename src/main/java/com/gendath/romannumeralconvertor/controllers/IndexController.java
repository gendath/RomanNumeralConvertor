package com.gendath.romannumeralconvertor.controllers;

import com.gendath.romannumeralconvertor.services.RomanNumeralConvertorService;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IndexController {

    RomanNumeralConvertorService service;

    public IndexController(RomanNumeralConvertorService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String index(Model model){
        return "index";
    }


    @PostMapping(value = "/convert", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String convert(int number, Model model){


            model.addAttribute("result", service.toRoman(number));



        return "index";


    }
}
