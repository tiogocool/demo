package com.poortoys.examples;

import java.util.HashMap;
import java.util.Map;

public class ArabicToRomanConverter {

    private static final String[] ROMAN_NUMBER = {
            "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"
    };

    private static final int[] VALUES = {
            1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1
    };
    
    
    public static void main(String[] args) {
        int number = 15;
        String result = convertToRoman(number);
        System.out.println(number + " en chiffre romain est " + result);
    }

    public static String convertToRoman(int number) {
        if (number < 1 || number > 3999) {
            throw new IllegalArgumentException("Number out of range (1-3999)");
        }

        StringBuilder result = new StringBuilder();
        int i = 0;

        while (number > 0) {
            if (number >= VALUES[i]) {
            	result.append(ROMAN_NUMBER[i]);
                number -= VALUES[i];
            } else {
                i++;
            }
        }

        return result.toString();
    }
    
}
