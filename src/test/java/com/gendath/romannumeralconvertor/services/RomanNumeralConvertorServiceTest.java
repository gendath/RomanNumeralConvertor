package com.gendath.romannumeralconvertor.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralConvertorServiceTest {
    RomanNumeralConvertorService service;

    @BeforeEach
    void setUp() {
        service = new RomanNumeralConvertorService();
    }

    @Test
    void toRoman() {

        assertEquals("IV",service.toRoman(4));
        assertEquals("VIII",service.toRoman(8));
        assertEquals("CL",service.toRoman(150));
        assertEquals("CMXCIX",service.toRoman(999));
        assertEquals("Number must be between 1 and 3999",service.toRoman(-999));
        assertEquals("Number must be between 1 and 3999",service.toRoman(9999));

    }
}