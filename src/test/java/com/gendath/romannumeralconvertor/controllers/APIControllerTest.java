package com.gendath.romannumeralconvertor.controllers;

import com.gendath.romannumeralconvertor.services.RomanNumeralConvertorService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class APIControllerTest {
RomanNumeralConvertorService service;
    @BeforeEach
    void setUp() {
        service = new RomanNumeralConvertorService();
    }

    @Test
    void getRomanNumeral() {
        assertEquals("X", service.toRomanAPI(10));
        assertEquals("V", service.toRomanAPI(5));
        assertEquals("VIII", service.toRomanAPI(8));
        assertEquals("C", service.toRomanAPI(100));

        assertEquals("Number must be between 1 and 3999",service.toRoman(-999));
        assertEquals("Number must be between 1 and 3999",service.toRoman(9999));
    }
}