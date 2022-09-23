package com.gendath.romannumeralconvertor.controllers;

import com.gendath.romannumeralconvertor.services.RomanNumeralConvertorService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class APIController {
    RomanNumeralConvertorService service;

    public APIController(RomanNumeralConvertorService service) {
        this.service = service;
    }

    @RequestMapping("/api/{number}")
    public String getRomanNumeral(@PathVariable int number){
        return service.toRomanAPI(number);
    }

}
