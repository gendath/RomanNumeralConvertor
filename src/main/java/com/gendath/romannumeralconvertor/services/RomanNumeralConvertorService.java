package com.gendath.romannumeralconvertor.services;

import org.springframework.stereotype.Service;

import java.util.TreeMap;
@Service
public class RomanNumeralConvertorService {

    private final TreeMap<Integer, String> numeralMap = new TreeMap<>();

    public RomanNumeralConvertorService() {
        numeralMap.put(1000, "M");
        numeralMap.put(900, "CM");
        numeralMap.put(500, "D");
        numeralMap.put(400, "CD");
        numeralMap.put(100, "C");
        numeralMap.put(90, "XC");
        numeralMap.put(50, "L");
        numeralMap.put(40, "XL");
        numeralMap.put(10, "X");
        numeralMap.put(9, "IX");
        numeralMap.put(5, "V");
        numeralMap.put(4, "IV");
        numeralMap.put(1, "I");
    }

    public String toRomanAPI(int number){

        if(number<1||number>3999){
            return "Number must be between 1 and 3999";
        }

        String result = "";
        return toRoman(number, result);
    }
    public String toRoman(int number){

        if(number<1||number>3999){
            return "Number must be between 1 and 3999";
        }

        String result = "";
        return "The Roman Numeral for " + number + " is " + toRoman(number, result);
    }
    private String toRoman(int number, String result){
        if(number==0){
            return result;
        }
        int index =numeralMap.floorKey(number);


        if(number==1){
            return result += numeralMap.get(index);
        }
        result += numeralMap.get(index);
        return toRoman((number-index),result);
    }
}
