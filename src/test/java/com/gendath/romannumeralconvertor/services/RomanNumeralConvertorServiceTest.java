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

        assertEquals("The Roman Numeral for 4 is IV",service.toRoman(4));
        assertEquals("The Roman Numeral for 8 is VIII",service.toRoman(8));
        assertEquals("The Roman Numeral for 150 is CL",service.toRoman(150));
        assertEquals("The Roman Numeral for 999 is CMXCIX",service.toRoman(999));
        assertEquals("Number must be between 1 and 3999",service.toRoman(-999));
        assertEquals("Number must be between 1 and 3999",service.toRoman(9999));

    }
}